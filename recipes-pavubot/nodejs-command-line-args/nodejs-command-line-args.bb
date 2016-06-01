# Copyright (C) 2016 Maciej Sobkowski <maciejjo@maciejjo.pl>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "A library to parse command-line options."
HOMEPAGE = "https://github.com/75lb/command-line-args"
SECTION = "js/devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PACKAGE_ARCH = "all"

SRC_URI = "git://github.com/75lb/command-line-args.git;branch=master"
SRCREV = "8365b2d94447f3dd0e1993c8bb251ff8becde444"

inherit npm-install-global

S = "${WORKDIR}/git"
