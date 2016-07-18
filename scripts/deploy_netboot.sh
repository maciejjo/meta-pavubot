#!/bin/bash

MYPATH=$(readlink -f "$(dirname "${BASH_SOURCE[0]}")")

. "${MYPATH}/config.sh"

echo "Copying kernel and dtb to TFTP root..."
sudo cp \
	"${YOCTO_DIR}/${DEPLOY_PATH}/${ZIMAGE_FILE}" \
	"${TFTP_ROOT}/${ZIMAGE_DEST_FILE}" || \
	{ echo "failed!"; exit 1; }
sudo cp \
	"${YOCTO_DIR}/${DEPLOY_PATH}/${DTB_FILE}" \
	"${TFTP_ROOT}/${DTB_DEST_FILE}" || \
	{ echo "failed!"; exit 1; }

echo "Extracting rootfs tarball to NFS root..."
sudo tar xf \
	"${YOCTO_DIR}/${DEPLOY_PATH}/${ROOTFS_FILE}" \
	-C "${NFS_ROOT}" || \
	{ echo "failed!"; exit 1; }

