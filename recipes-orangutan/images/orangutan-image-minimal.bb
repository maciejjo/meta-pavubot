SUMMARY="Image containing SW needed for Orangutan mobile robot"

inherit core-image

IMAGE_FEATURES += "ssh-server-dropbear"
IMAGE_INSTALL_append += "nodejs"
