#!/bin/bash

MYPATH="$(readlink -f $(dirname "${BASH_SOURCE[0]}"))"

. ${MYPATH}/config.sh

docker run \
	--net=host --rm -it \
	-v $(pwd):$(pwd)    \
	-v ${YOCTO_DIR}:${YOCTO_DIR} \
	-v ~/.ssh:/home/${USER}/.ssh \
	-v ~/.gitconfig:/home/${USER}/.gitconfig \
	${DOCKER_IMAGE}  /bin/bash \
	-c "cd $(pwd) && source oe-core/oe-init-build-env ${TARGET_DIR} ${BITBAKE_DIR} \
	&& bitbake ${IMAGE_NAME}"
