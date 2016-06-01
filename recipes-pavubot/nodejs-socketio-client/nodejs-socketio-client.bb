# Copyright (C) 2016 Maciej Sobkowski <maciejjo@maciejjo.pl>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "node.js realtime framework server"
HOMEPAGE = "http://socket.io/"
SECTION = "js/devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PACKAGE_ARCH = "all"

SRC_URI = "git://github.com/socketio/socket.io-client.git;branch=master"
SRCREV = "5fe7373610ef92de0d34b44d503c22cab5712c8d"

inherit npm-install-global

S = "${WORKDIR}/git"
