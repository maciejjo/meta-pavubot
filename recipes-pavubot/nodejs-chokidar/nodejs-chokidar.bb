# Copyright (C) 2016 Maciej Sobkowski <maciejjo@maciejjo.pl>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "A neat wrapper around node.js fs.watch / fs.watchFile / fsevents."
HOMEPAGE = "http://paulmillr.com"
SECTION = "js/devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PACKAGE_ARCH = "all"

SRC_URI = "git://github.com/paulmillr/chokidar.git;branch=master"
SRCREV = "638a52986e398fa856429f195994d2a6b5b74b9d"

inherit npm-install-global

S = "${WORKDIR}/git"
