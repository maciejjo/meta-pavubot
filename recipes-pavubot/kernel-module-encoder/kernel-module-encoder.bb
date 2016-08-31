SUMMARY = "Module for TB6612 DC motor driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit module

PR = "r2"

SRC_URI = "git://github.com/maciejjo/encoder.git"
SRCREV = "3378affcf43dfc8abd5a4dadf8c331abf11f4e48"

S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
