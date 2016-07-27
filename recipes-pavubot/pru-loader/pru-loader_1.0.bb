# Copyright (C) 2016 Maciej Sobkowski <maciejjo@maciejjo.pl>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "PRU assembler"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://pru_sw/utils/LICENCE.txt;md5=a4120726312222872e582a3f2851144f"

PR = "r4"

SRC_URI = "git://github.com/beagleboard/am335x_pru_package.git"
SRC_URI += " file://0001-Delete-hard-coded-environment-from-Makefile.patch "
SRC_URI += " file://0001-open-debug.patch "
SRCREV = "5f374ad57cc195f28bf5e585c3d446aba6ee7096"

S = "${WORKDIR}/git"

do_configure[noexec] = "1"

do_compile() {
    cd ${S}/pru_sw/app_loader/interface
    oe_runmake -e release
    oe_runmake -e sorelease
    cd ${S}
}

do_install() {
    cd ${S}/pru_sw/app_loader/interface
    oe_runmake -e install DESTDIR=${D} PREFIX=${prefix}
    cd ${S}
}

FILES_${PN} += "${libdir}/libprussdrv.so \
                ${libdir}/libprussdrvd.so \
                ${includedir}/pruss_intc_mapping.h \
                ${includedir}/prussdrv.h \
"

FILES_${PN}-dbg += "${libdir}/.debug/libprussdrv.so"

PACKAGES = "${PN} ${PN}-dbg"
