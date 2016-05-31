FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " file://defconfig"

SRC_URI_append += " file://0001-pavubot-DT-changes.patch "
SRC_URI_append += " file://0002-Add-defconfig-fragment-for-uio-pruss-driver.patch " 
SRC_URI_append += " file://0003-pavubot-add-fragment-with-drivers-for-pavubot.patch " 
SRC_URI_append += " file://0004-Add-new-defconfig-for-Orangutan-robot.patch " 


