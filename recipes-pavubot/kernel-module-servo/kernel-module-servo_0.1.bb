SUMMARY = "Module for PWM servo motor"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "git://github.com/maciejjo/pwm-servo.git"
SRCREV = "30723ccf3825dd6e767a8b4d274f3280f9c6dfb3"

S = "${WORKDIR}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
