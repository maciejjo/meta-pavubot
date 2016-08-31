# Copyright (C) 2016 Maciej Sobkowski <maciejjo@maciejjo.pl>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Nodejs server applications for robot control and video string"
HOMEPAGE = "https://github.com/paqu/simple-logger"
SECTION = "js/devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PACKAGE_ARCH = "all"

RDEPENDS_${PN} = "libopencv-objdetect libopencv-videoio libopencv-core \
libopencv-imgcodecs libopencv-highgui libopencv-face libopencv-video \
libopencv-imgproc libopencv-calib3d"


SRC_URI = "git://github.com/paqu/pavubot-bigiel.git;branch=development"
SRCREV = "862b918bd2726dfdca81373df05b080642036f54"

inherit npm-install-global

S = "${WORKDIR}/git"
