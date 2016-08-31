SUMMARY="Image containing SW needed for Pavubot mobile robot"

require recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += "ssh-server-dropbear"
IMAGE_INSTALL_append += " \
linux-firmware \
amx3-cm3 \
kernel-module-arc4 \
kernel-module-rt2800usb \
kernel-module-rt2x00usb \
kernel-module-rt2800lib \
kernel-module-rt2x00lib \
kernel-module-crc-ccitt \
kernel-module-mac80211 \
kernel-module-cfg80211 \
kernel-module-musb-dsps \
kernel-module-musb-hdrc \
kernel-module-udc-core \
kernel-module-pm33xx \
kernel-module-wkup-m3-rproc \
kernel-module-wkup-m3-ipc \
kernel-module-ti-emif-sram \
kernel-module-omap-aes-driver \
kernel-module-omap-sham \
kernel-module-omap-rng \
kernel-module-rng-core \
kernel-module-rtc-omap \
kernel-module-musb-am335x \
kernel-module-inv-mpu6050 \
kernel-module-omap-wdt \
kernel-module-sch-fq-codel \
kernel-module-sha256-generic \
kernel-module-sha256-arm \
kernel-module-hmac \
kernel-module-drbg \
kernel-module-ctr \
kernel-module-ccm \
kernel-module-uvcvideo \
kernel-module-videobuf2-vmalloc \
kernel-module-ti-am335x-adc \
kernel-module-uio \
kernel-module-uio-pruss \
kernel-module-servo \
kernel-module-tb6612 \
kernel-module-encoder \
pru-module-hcsr04 \
nodejs \
nodejs-chokidar \
nodejs-colors \
nodejs-opencv \
nodejs-socketio \
nodejs-socketio-client \
nodejs-command-line-args \
nodejs-simple-logger \
nodejs-pavubot-apps \
usbutils \
i2c-tools \
v4l-utils \
kmod \
wpa-supplicant \
iw \
dhcpcd \
dropbear \
"
