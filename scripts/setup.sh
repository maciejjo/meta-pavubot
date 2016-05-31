#!/bin/bash


MYPATH="$(readlink -f $(dirname "${BASH_SOURCE[0]}"))"

. ${MYPATH}/config.sh

mkdir -p "${TARGET_DIR}/conf"

cp "${MYPATH}/local.conf.template" "${TARGET_DIR}/conf/local.conf"
cp "${MYPATH}/bblayers.conf.template" "${TARGET_DIR}/conf/bblayers.conf"

sed -i -e "s|{MACHINE}|${MACHINE}|g" "${TARGET_DIR}/conf/local.conf"
sed -i -e "s|{DISTRO}|${DISTRO}|g" "${TARGET_DIR}/conf/local.conf"
sed -i -e 's|{YOCTO_DIR}|'"${YOCTO_DIR}"'|g' "${TARGET_DIR}/conf/local.conf"

sed -i -e 's|{BUILD_DIR}|'"$(pwd)"'|g' "${TARGET_DIR}/conf/bblayers.conf"

