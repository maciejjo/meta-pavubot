# Copyright (C) 2016 Maciej Sobkowski <maciejjo@maciejjo.pl>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = ""
HOMEPAGE = ""

PR = "r11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

DEPENDS = "pru-pasm-native pru-loader"
RDEPENDS_${PN} = "pru-loader"

SRC_URI = "git://github.com/maciejjo/pru-hcsr04.git"
SRCREV = "4eefb6007ddc87bb8fb9339fea02a1464c905fb0"

SRC_URI += " file://0001-debug-print.patch "
SRC_URI += " file://ledblink.patch "

S = "${WORKDIR}/git"

do_configure[noexec] = "1"

do_compile() {
    oe_runmake
}

do_install() {
  install -d  ${D}/lib/firmware/pru-hcsr04/
  install -d  ${D}/${bindir}
  cp hcsr04.bin ${D}/lib/firmware/pru-hcsr04/hcsr04.bin
  install -m 755 hcsr04 ${D}${bindir}/hcsr04
}

FILES_${PN} += "${bindir}/hcsr04 /lib/firmware/pru-hcsr04/hcsr04.bin"

