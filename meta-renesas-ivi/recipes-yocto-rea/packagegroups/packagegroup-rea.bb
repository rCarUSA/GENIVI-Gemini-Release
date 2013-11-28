DESCRIPTION = "REA packages"
LICENSE = "GPLv2"

inherit packagegroup

PACKAGES = "\
    packagegroup-rea \
    "

RDEPENDS_packagegroup-rea = "\
	bzip2 \
	coreutils \
	dpkg \
	gst-ffmpeg \
	gst-plugins-ugly \
 	libxt \
    libxmu \ 
	openssh \
	sysklogd \
	xeyes \
	libxcb \
	gnome-desktop \
	mesa-demos \
    "
