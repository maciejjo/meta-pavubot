#!/bin/bash

MYPATH=$(readlink -f "$(dirname "${BASH_SOURCE[0]}")")

. "${MYPATH}/config.sh"

if [ ! -e "${TARGET_DIR}" ] ; then
	echo "Directory \"${TARGET_DIR}\" dir not found! Please run setup.sh script first."
	exit 1
fi

docker run \
	--net=host --rm -it \
	-v "$(pwd)":"$(pwd)"    \
	-v "${YOCTO_DIR}":"${YOCTO_DIR}" \
	-v "${HOME}/.ssh:/home/${USER}/.ssh" \
	-v "${HOME}/.gitconfig:/home/${USER}/.gitconfig" \
	"${DOCKER_IMAGE}"  "/bin/bash" \
	-c "cd $(pwd) && source oe-core/oe-init-build-env ${TARGET_DIR} ${BITBAKE_DIR} \
	&& bitbake ${IMAGE_NAME}"
