PRINC := "${@int(PRINC) + 3}"

FILESEXTRAPATHS := "${THISDIR}/${PN}-${PV}"
SRC_URI += "file://defconfig\
			file://ntpd.service \
			file://ntpd-set.sh \
    "
SYSTEMD_SERVICE = "ntpd.service"

do_install_append(){
	install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants/
	install -m 0644 ${WORKDIR}/ntpd.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/
	install -d ${D}${bindir}/
	install -m 0755 ${WORKDIR}/ntpd-set.sh ${D}${bindir}/
	rm -f ${D}${sysconfdir}/default/busybox-syslog
}

