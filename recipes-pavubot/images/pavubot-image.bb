SUMMARY="Image containing SW needed for Pavubot mobile robot"

require recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += "ssh-server-dropbear"
IMAGE_INSTALL_append += "nodejs usbutils kmod i2c-tools wpa-supplicant \
linux-firmware dhcpcd iw dropbear amx3-cm3 kernel-module-uio-pruss kernel-module-uio \
kernel-module-arc4 kernel-module-rt2800usb kernel-module-rt2x00usb \
kernel-module-rt2800lib kernel-module-rt2x00lib kernel-module-crc-ccitt \
kernel-module-mac80211 kernel-module-cfg80211 kernel-module-musb-dsps \
kernel-module-musb-hdrc kernel-module-udc-core kernel-module-pm33xx \
kernel-module-snd-soc-simple-card kernel-module-wkup-m3-rproc \
kernel-module-wkup-m3-ipc kernel-module-ti-emif-sram kernel-module-remoteproc \
kernel-module-virtio kernel-module-virtio-ring kernel-module-omap-aes-driver \
kernel-module-omap-sham kernel-module-omap-rng kernel-module-rng-core \
kernel-module-pwm-tiehrpwm kernel-module-rtc-omap kernel-module-musb-am335x \
kernel-module-omap-wdt kernel-module-sch-fq-codel"
