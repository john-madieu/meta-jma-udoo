LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

require recipes-kernel/linux/linux-imx.inc

LOCALVERSION ?= "09a18c23eb4d8decd7cd2fad5a25948533686063"
SCMVERSION ?= "y"
SRC_URI = "git://github.com/UDOOboard/Kernel_Unico.git;branch=${SRCBRANCH} \
           file://defconfig \
"

SRCREV = "09a18c23eb4d8decd7cd2fad5a25948533686063"
SRCBRANCH = "linux_imx_3.10.9_1.0.0_alpha"
LOCALVERSION = "-3.10.9-udoo"
COMPATIBLE_MACHINE = "(mx6)"
