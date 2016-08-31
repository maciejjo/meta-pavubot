# Copyright (C) 2016 Maciej Sobkowski <maciejjo@maciejjo.pl>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "node.js realtime framework server"
HOMEPAGE = "http://socket.io/"
SECTION = "js/devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

DEPENDS = "opencv"
RDEPENDS_${PN} = "opencv"

PACKAGE_ARCH = "all"

SRC_URI = "git://github.com/peterbraden/node-opencv.git;branch=master"
SRCREV = "870ffb56c2baeea0b0086124fe89c424ed2e0609"

do_compile[noexec] = "1"

inherit npm-install-global

S = "${WORKDIR}/git"
