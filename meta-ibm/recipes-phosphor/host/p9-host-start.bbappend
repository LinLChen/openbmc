RDEPENDS:${PN}:append:ibm-ac-server = " avsbus-control"
RDEPENDS:${PN}:append:witherspoon = " vrm-control"
RDEPENDS:${PN}:append:ibm-ac-server = " power-workarounds"
RDEPENDS:${PN}:append:mihawk = " avsbus-control"
RDEPENDS:${PN}:append:mihawk = " vrm-control"
RDEPENDS_${PN}:remove:mihawk = "p9-vcs-workaround"
RDEPENDS_${PN}:remove:rainier = "p9-vcs-workaround"
