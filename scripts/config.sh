MACHINE="beaglebone"
DISTRO="poky-systemd"

YOCTO_DIR="/usr/local/share/yocto"
DOCKER_IMAGE="oe-build:custom"
BITBAKE_DIR="bitbake"
TARGET_DIR=${MACHINE}
IMAGE_NAME="pavubot-image"

NFS_ROOT="/srv/bbb_nfs"
TFTP_ROOT="/srv/bbb_tftp"

DEPLOY_PATH="build-glibc/deploy/images/beaglebone"
ZIMAGE_FILE="zImage"
DTB_FILE="zImage-am335x-boneblack.dtb"
ZIMAGE_DEST_FILE="zImage"
DTB_DEST_FILE="am335x-boneblack.dtb"
ROOTFS_FILE="${IMAGE_NAME}-${MACHINE}.tar.gz"
