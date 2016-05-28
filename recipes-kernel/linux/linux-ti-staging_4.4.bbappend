FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " file://defconfig"

SRC_URI_append += " file://0001-Add-defconfig-fragment-for-uio-pruss-driver.patch "
SRC_URI_append += " file://0001-orangutan-DT-changes.patch "
SRC_URI_append += " file://0002-Add-new-defconfig-for-Orangutan-robot.patch "

