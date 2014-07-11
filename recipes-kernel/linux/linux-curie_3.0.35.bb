
include linux-curie.inc

SRCREV = "bdde708ebfde4a8c1d3829578d3f6481a343533a"
LOCALVERSION = "-4.1.0+curie"

# Patches need for Yocto and not applied by Freescale when doing 4.1.0 branch
SRC_URI += "file://drm-vivante-Add-00-sufix-in-returned-bus-Id.patch \
            file://epdc-Rename-mxcfb_epdc_kernel.h-to-mxc_epdc.h.patch \
            file://0001-perf-tools-Fix-getrusage-related-build-failure-on-gl.patch \
            file://0002-ARM-7668-1-fix-memset-related-crashes-caused-by-rece.patch \
            file://0003-ARM-7670-1-fix-the-memset-fix.patch \
            file://0004-ENGR00271136-Fix-build-break-when-CONFIG_CLK_DEBUG-i.patch \
            file://0001-adopt-changes-for-wired-ethernet.patch \
            file://0002-Disable-irrelevant-firmware-being-generated.patch \
            file://0003-Set-bit-5-in-register-SPDIF-SCR.patch \
            file://0004-add-support-for-R_ARM_REL32.patch \
            file://0005-bsp-for-curie-rev-c.patch \
            file://0007-disable-enet_to_gpio_6-capability.patch \
            file://0008-ignore-mx6dl-for-spdif_pads.patch \
            file://trying.patch \
	   "

COMPATIBLE_MACHINE = "(mx6curie)"