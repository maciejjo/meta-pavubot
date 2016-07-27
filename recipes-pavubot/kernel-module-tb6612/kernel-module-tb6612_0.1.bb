SUMMARY = "Module for TB6612 DC motor driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit module

PR = "r3"

SRC_URI = "git://github.com/maciejjo/tb6612.git"
SRCREV = "ba556dfe6940afc3a70bbdea8dbb7d2461bd0bc5"

S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
