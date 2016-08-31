# Copyright (C) 2016 Maciej Sobkowski <maciejjo@maciejjo.pl>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "A small library providing utility method to log information."
HOMEPAGE = "https://github.com/paqu/simple-logger"
SECTION = "js/devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PACKAGE_ARCH = "all"

SRC_URI = "git://github.com/paqu/simple-logger.git;branch=master"
SRCREV = "a4bba304c57abcbef907af2b4a10b5457a39051d"

inherit npm-install-global

S = "${WORKDIR}/git"
