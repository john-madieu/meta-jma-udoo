require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=0507cd7da8e7ad6d6701926ec9b84c95"


COMPATIBLE_MACHINE = "(mx6)"
DEPENDS_mxs += "elftosb-native openssl-native"
PROVIDES += "u-boot"


SRCREV = "05c69ef076d84a0b35ef2d4cfd094a30462bc4e5"
SRCBRANCH = "2015.07+fslc"

SRC_URI = "git://github.com/Freescale/u-boot-fslc.git;protocol=git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

EXTRA_OEMAKE += 'HOSTCC="${BUILD_CC} ${BUILD_CPPFLAGS}" \
                 HOSTLDFLAGS="-L${STAGING_BASE_LIBDIR_NATIVE} -L${STAGING_LIBDIR_NATIVE}" \
                 HOSTSTRIP=true'

PACKAGE_ARCH = "${MACHINE_ARCH}"
LOCALVERSION ?= "-${SRCBRANCH}"
