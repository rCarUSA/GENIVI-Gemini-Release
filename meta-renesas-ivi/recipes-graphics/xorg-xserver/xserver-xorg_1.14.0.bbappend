PRINC := "${@int(PRINC) + 5}"

FILESEXTRAPATHS := "${THISDIR}/${PN}"

inherit systemd

SYSTEMD_SERVICE = "X.service"

SRC_URI_append = " file://X.service \
                 "
do_install_append() {
    install -d ${D}${systemd_unitdir}/system/
    install -m 0644 ${WORKDIR}/X.service ${D}${systemd_unitdir}/system
}
