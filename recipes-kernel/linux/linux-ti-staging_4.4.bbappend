FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " file://ti33x/defconfig"

SRC_URI_append += " file://0001-Pavubot-kernel-config-modifications.patch "
SRC_URI_append += " file://0002-pavubot-DT-changes.patch "
SRC_URI_append += " file://0003-Making-the-uio-pruss-driver-work.patch "
