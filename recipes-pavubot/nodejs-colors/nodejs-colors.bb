# Copyright (C) 2016 Maciej Sobkowski <maciejjo@maciejjo.pl>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "get colors in your node.js console"
HOMEPAGE = "https://github.com/Marak/colors.js"
SECTION = "js/devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PACKAGE_ARCH = "all"

SRC_URI = "git://github.com/marak/colors.js.git;branch=master"
SRCREV = "8bf2ad9fa695dcb30b7e9fd83691b139fd6655c4"

inherit npm-install-global

S = "${WORKDIR}/git"
