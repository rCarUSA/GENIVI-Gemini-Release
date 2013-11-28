#!/bin/sh
max_attempts=40

# This script takes a list of ntp servers and passes them to ntpd to set the
# system time. If a /etc/ntpd.conf file exists, the servers there are used,
# if not, some default values are passed
set_time() {
    # -q flag makes ntpd exit after setting the time once
    ntpd -q -n -p "$1"
}

check_time() {
    for attempt in $(seq "$max_attempts"); do
        for arg ; do
            echo $arg
            if set_time "$arg" ; then
                return 0
            fi
        done
        sleep 2
    done
    return 1
}

if [ -f /etc/ntpd.conf ]; then
    server_list=`cat /etc/ntpd.conf | sed ':a;N;$!ba;s/\n/ /g;s/server//g'`
    check_time $server_list
else
    # Use a default list if there's no config
    check_time 0.pool.ntp.org 1.pool.ntp.org 2.pool.ntp.org 3.pool.ntp.org
fi
