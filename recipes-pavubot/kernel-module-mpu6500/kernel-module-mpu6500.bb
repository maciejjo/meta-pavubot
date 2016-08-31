SUMMARY = "Module for MPU6500 gyroscope"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit module

PR = "r0"

SRC_URI = "git://github.com/maciejjo/mpu6500.git;branch=rework"
SRCREV = "8410576a7c460b689c9ba7f935f535f9af049683"

S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
