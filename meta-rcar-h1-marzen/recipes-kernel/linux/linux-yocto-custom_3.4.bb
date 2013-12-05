DESCRIPTION = "Linux mainline kernel for Renesas R-Car H1 family"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
# DEPENDS += "lzop-native"

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

COMPATIBLE_MACHINE = "rcar-h1-marzen"

KERNEL_IMAGETYPE = "uImage"

#PR = "r1"
PR = "r2"

# Enable this line if you wish to build a kernel compliant with Genivi (www.genivi.org)
require genivi-requirements.inc

# R-Car H1 BSP for Linux Kernel 3.4 Release v2.0 tag
SRCREV_rcar-h1-marzen = "af52476d57a694a4a9fd67733cde9879cffc9bad"

SRC_URI = "git://github.com/slawr/linux-stable.git;branch=edc-rcar-h1-marzen-v3.4;protocol=git \
		file://0199-net-bus-add-the-AF_BUS-socket-address-family.patch \
		file://0200-net-bus-Add-AF_BUS-documentation.patch \
		file://0201-net-bus-add-af_bus-address-and-af_bus-socket-address.patch \
		file://0202-security-Add-Linux-Security-Modules-hook-for-AF_BUS-.patch \
		file://0203-security-selinux-Add-AF_BUS-socket-SELinux-hooks.patch \
		file://0204-netfilter-add-NFPROTO_BUS-hook-constant-for-AF_BUS-s.patch \
		file://0205-scm-allow-AF_BUS-sockets-to-send-ancillary-data.patch \
		file://0206-net-bus-Add-implementation-of-Bus-domain-sockets.patch \
		file://0207-net-bus-Add-garbage-collector-for-AF_BUS-sockets.patch \
		file://0208-net-bus-Add-the-AF_BUS-socket-address-family-to-KBui.patch \
		file://0209-netlink-connector-implement-cn_netlink_reply.patch \
		file://0210-netlink-connector-Add-idx-and-val-identifiers-for-ne.patch \
		file://0211-netfilter-nfdbus-Add-D-bus-message-parsing.patch \
		file://0212-netfilter-nfdbus-Add-D-bus-match-rule-implementation.patch \
		file://0213-netfilter-add-netfilter-D-Bus-module.patch \
		file://defconfig \
	"

S = "${WORKDIR}/git"
# Workaround for Yocto issue not yet in mainline
#S = "${WORKDIR}/git-dir"

# We need to pass it as param since kernel might support more then one
# machine, with different entry points
EXTRA_OEMAKE += "LOADADDR=${UBOOT_ENTRYPOINT}"

