# Copyright (C) 2016 Maciej Sobkowski <maciejjo@maciejjo.pl>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "PRU assembler"
LICENSE = "TI"
LIC_FILES_CHKSUM = "file://pru_sw/utils/LICENCE.txt;md5=a4120726312222872e582a3f2851144f"

SRC_URI = "git://github.com/beagleboard/am335x_pru_package.git"
SRCREV = "5f374ad57cc195f28bf5e585c3d446aba6ee7096"

S = "${WORKDIR}"

do_compile() {
    cd ${S}/pru_sw/utils/pasm_source
    ./linuxbuild
    cd ${B}
}

do_install() {
    install -m 0755 ${S}/pru_sw/utils/pasm ${D}/${bindir}
}
