SUMMARY = "Module for PWM servo motor"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "git://github.com/maciejjo/tb6612.git"
SRCREV = "c518ab5f7be2a7336274e1f6af036845d4f85afa"

S = "${WORKDIR}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
