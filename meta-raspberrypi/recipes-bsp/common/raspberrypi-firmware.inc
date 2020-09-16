RPIFW_DATE ?= "20200812"
SRCREV ?= "18aa72c5e05677b8a8af835bd60409e3253817aa"
RPIFW_SRC_URI ?= "https://github.com/raspberrypi/firmware/archive/${SRCREV}.tar.gz"
RPIFW_S ?= "${WORKDIR}/firmware-${SRCREV}"

SRC_URI = "${RPIFW_SRC_URI}"
SRC_URI[md5sum] = "285453979ec7730f9547445056d58e44"
SRC_URI[sha256sum] = "9e946f96aff5791150703ea3510f26724e80048ba7c2985e28fbba6a2e1406d2"

PV = "${RPIFW_DATE}"