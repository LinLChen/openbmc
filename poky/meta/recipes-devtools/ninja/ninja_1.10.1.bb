SUMMARY = "Ninja is a small build system with a focus on speed."
HOMEPAGE = "http://martine.github.com/ninja/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=a81586a64ad4e476c791cda7e2f2c52e"

DEPENDS = "re2c-native ninja-native"

SRCREV = "a1f879b29c9aafe6a2bc0ba885701f8f4f19f772"

SRC_URI = "git://github.com/ninja-build/ninja.git;branch=release"
UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>.*)"

S = "${WORKDIR}/git"

do_configure[noexec] = "1"

do_compile_class-native() {
	python3 ./configure.py --bootstrap
}

do_compile() {
	python3 ./configure.py
	ninja
}

do_install() {
	install -D -m 0755  ${S}/ninja ${D}${bindir}/ninja
}

BBCLASSEXTEND = "native nativesdk"