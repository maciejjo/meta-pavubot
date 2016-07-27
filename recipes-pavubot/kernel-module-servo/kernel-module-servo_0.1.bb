SUMMARY = "Module for PWM servo motor"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit module

PR="r2"

SRC_URI = "git://github.com/maciejjo/pwm-servo.git"
SRCREV = "502b09e2c11c1054a54be01b3fe6afb515208fd9"

S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
