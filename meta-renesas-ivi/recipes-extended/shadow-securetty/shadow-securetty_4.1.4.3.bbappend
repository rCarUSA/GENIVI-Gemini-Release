PRINC := "${@int(PRINC) + 1}"

FILESEXTRAPATHS := "${THISDIR}/${PN}"

SRC_URI_append_${MACHINE} = " file://securetty-rea"

do_configure_prepend_${MACHINE} () {
    cat ${WORKDIR}/securetty-rea >> ${WORKDIR}/securetty
}
