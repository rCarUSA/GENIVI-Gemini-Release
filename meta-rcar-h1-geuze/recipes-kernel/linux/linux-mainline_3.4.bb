DESCRIPTION = "Linux mainline kernel for Renesas R-Car family"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
# DEPENDS += "lzop-native"

COMPATIBLE_MACHINE = "rcar-h1-geuze"

inherit kernel

KERNEL_IMAGETYPE = "uImage"

PR = "r0"

# Greg's 3.4.38 tag
#SRCREV = ""
SRC_URI[sha256sum] = "27228fe82fe06944b422f213ca8cb9aa56ebe117eeebbb10b97215840a7a4f42"
SRC_URI[md5sum] = "8f65f04a5645c8f50445c8677e5400b9"

SRC_URI += "http://www.kernel.org/pub/linux/kernel/v3.x/linux-3.4.38.tar.gz \
        file://defconfig \
		file://0001-mm-page_alloc-remove-trailing-whitespace.patch \
		file://0002-mm-compaction-introduce-isolate_migratepages_range.patch \
		file://0003-mm-compaction-introduce-map_pages.patch \
		file://0004-mm-compaction-introduce-isolate_freepages_range.patch \
		file://0005-mm-compaction-export-some-of-the-functions.patch \
		file://0006-mm-page_alloc-introduce-alloc_contig_range.patch \
		file://0007-mm-page_alloc-change-fallbacks-array-handling.patch \
		file://0008-mm-mmzone-MIGRATE_CMA-migration-type-added.patch \
		file://0009-mm-page_isolation-MIGRATE_CMA-isolation-functions-ad.patch \
		file://0010-mm-Serialize-access-to-min_free_kbytes.patch \
		file://0011-mm-extract-reclaim-code-from-__alloc_pages_direct_re.patch \
		file://0012-mm-trigger-page-reclaim-in-alloc_contig_range-to-sta.patch \
		file://0013-drivers-add-Contiguous-Memory-Allocator.patch \
		file://0014-X86-integrate-CMA-with-DMA-mapping-subsystem.patch \
		file://0015-ARM-integrate-CMA-with-DMA-mapping-subsystem.patch \
		file://0016-net-sh_eth-add-support-R8A7740.patch \
		file://0017-adv7180-add-support-to-user-controls.patch \
		file://0018-net-sh_eth-fix-the-rxdesc-pointer-when-rx-descriptor.patch \
		file://0019-ARM-shmobile-r8a7779-Route-all-interrupts-to-ARM.patch \
		file://0020-net-sh_eth-fix-the-condition-to-fix-the-cur_tx-dirty.patch \
		file://0021-V4L-fix-a-compiler-warning.patch \
		file://0022-ARM-mach-shmobile-add-fixed-voltage-regulators-to-ma.patch \
		file://0023-ARM-shmobile-marzen-fixup-smsc911x-id-for-regulator.patch \
		file://0024-r8a7779-add-SDHI-clock-support.patch \
		file://0025-ARM-shmobile-marzen-add-SDHI0-support.patch \
		file://0026-ARM-mach-shmobile-marzen-defconfig-update.patch \
		file://0027-thermal-add-Renesas-R-Car-thermal-sensor-support.patch \
		file://0028-ARM-shmobile-marzen-enable-thermal-sensor.patch \
		file://0029-i2c-add-Renesas-R-Car-I2C-driver.patch \
		file://0030-ARM-shmobile-r8a7779-add-HSPI-clock-support.patch \
		file://0031-ARM-shmobile-r8a7779-add-I2C-clock-support.patch \
		file://0032-ARM-shmobile-r8a7779-add-I2C-driver-support.patch \
		file://0033-ARM-shmobile-marzen-add-HSPI-support.patch \
		file://0034-r8a7779-Add-virt-addr-translation-for-upper-16MB.patch \
		file://0035-r8a7779-Add-INTC2-chained-interrupt-handler.patch \
		file://0036-usb-host-Add-USB-host-OHCI-controller-for-R-Car.patch \
		file://0037-usb-host-Add-USB-host-EHCI-controller-for-R-Car.patch \
		file://0038-usb-host-Add-glue-code-for-R-Car-OHCI-EHCI-platform-.patch \
		file://0039-r8a7779-Add-interrupt-support-for-USBH.patch \
		file://0040-r8a7779-add-USB-clock-support.patch \
		file://0041-marzen-add-board-support-for-USB.patch \
		file://0042-dma-hpb-dmae-Add-DMA-Engine-driver-for-R-Car-HPB-DMA.patch \
		file://0043-dma-hpb-dmae-r8a7779-Add-DMA-Engine-driver-for-R-Car.patch \
		file://0044-r8a7779-Add-platform-support-for-R-Car-HPB-DMAC.patch \
		file://0045-marzen-add-dma-support-for-SDHI0.patch \
		file://0046-r8a7779-add-SSI-SRU-clock-support.patch \
		file://0047-sound-soc-ak4642-prevent-un-necessary-changes-to-SG_.patch \
		file://0048-sound-soc-add-support-for-rcar-sru-device.patch \
		file://0049-sound-soc-add-glue-for-marzen-ak4643-sound-card.patch \
		file://0050-marzen-add-board-support-for-audio.patch \
		file://0051-r8a7779-Add-Display-Unit-clock-support.patch \
		file://0052-fb-Add-RCar-framebuffer-driver.patch \
		file://0053-marzen-Add-Display-Unit.patch \
		file://0054-v4l2-Add-RCar-Video-In-VIN-capture-driver.patch \
		file://0055-adv7180.c-convert-to-v4l2-control-framework.patch \
		file://0056-v4l2-adv7180-SoC-camera-support-BT.656.patch \
		file://0057-r8a7779-Add-VIN-clock-support.patch \
		file://0058-marzen-Add-VIN-platform-data.patch \
		file://0059-arm-mm-Reflect-recommended-value-in-CPU-core-and-L2C.patch \
		file://0060-marzen-defconfig-Add-drivers-file-systems-etc.patch \
		file://0061-net-sh_eth-Add-eth-support-for-R8A7779-device.patch \
		file://0062-r8a7779-Add-on-chip-ethernet-module-clock.patch \
		file://0063-mediabus-Add-RGB666-RGB88-formats.patch \
		file://0064-mediabus-add-a-new-data-packing-type-EXTEND32-on-the.patch \
		file://0065-mediabus-add-new-32-bits-data-formats-on-the-media-b.patch \
		file://0066-soc_camera-add-12-18-24-bits-data-width.patch \
		file://0067-rcarvin-Allow-data-widths-16bits.patch \
		file://0068-rcarvin-enable-the-RGB-pass-through-input-mode-for-1.patch \
		file://0069-rcarvin-prevent-duplicating-UYVY-entries-in-the-VIDI.patch \
		file://0070-rcarvin-Convert-colorspace-when-input-output-are-dif.patch \
		file://0071-rcarvin-Add-RGB32-to-the-list-of-supported-formats.patch \
		file://0072-arm-shmobile-r8a7779-Add-SGX-clock.patch \
		file://0073-arm-shmobile-r8a7779-Add-sgx-device.patch \
		file://0074-sata-Add-Renesas-R-Car-SATA-driver.patch \
		file://0075-arm-shmobile-r8a7779-Add-SATA-clock.patch \
		file://0076-marzen-Add-SATA.patch \
		file://0077-marzen-Add-USB-PHY-workaround-for-different-board-ve.patch \
		file://0078-ARM-shmobile-r8a7779-Fix-HPB-DMAC-42-IRQ.patch \
		file://0079-ARM-shmobile-r8a7779-Add-drive-abilities-for-SD-pins.patch \
		file://0080-ARM-shmobile-Fix-dmaengine-module-support.patch \
		file://0081-dma-hpb-dmae-Fix-error-handling-in-hpb_dmae_alloc_ch.patch \
		file://0082-dma-hbp-dmae-Remove-verbose-function.patch \
		file://0083-dma-hpb-dmae-Remove-verbose-return-value.patch \
		file://0084-dma-hpb-dmae-Remove-useless-code.patch \
		file://0085-dma-hpb-dmae-Add-SuperHyway-Port-selector.patch \
		file://0086-video-rcarfb-Fix-error-code-in-set-color-register-fu.patch \
		file://0087-video-rcarfb-Add-ability-to-set-resolution-on-the-cm.patch \
		file://0088-sound-soc-rcar-Fix-hwdep-ioctl.patch \
		file://0089-sound-soc-rcar-Remove-monaural-and-fix-not-use-mutex.patch \
		file://0090-sound-soc-rcar-Fix-platform-resource-release.patch \
		file://0091-sound-soc-rcar-Fix-DMA-channel-request-error.patch \
		file://0092-sound-soc-rcar-Remove-invalid-comment.patch \
		file://0093-serial-sh-sci-Fix-overrun-error-handling.patch \
		file://0094-ARM-shmobile-r8a7779-PFC-rename-PENCx-USB_PENCx.patch \
		file://0095-ARM-shmobile-r8a7779-Fix-PFC-MOD_SEL2-missed-an-entr.patch \
		file://0096-marzen-Setup-pinmux-for-USB2-on-CN22.patch \
		file://0097-marzen-defconfig-Add-SPI-user-mode.patch \
		file://0098-marzen-Add-HSPI2B-for-SPI-Flash.patch \
		file://0099-marzen-Register-spidev-devices.patch \
		file://0100-spi-sh-hspi-add-CS-manual-control-support.patch \
		file://0101-spi-sh-hspi-Improve-performance.patch \
		file://0102-ARM-shmobile-r8a7779-Set-the-SGX-clock-to-clks.patch \
		file://0103-marzen-Set-config-options-to-improve-LTP-results.patch \
		file://0104-ARM-shmobile-r8a7779-Enable-PMU-Performance-Monitori.patch \
		file://0105-SGX-Check-CMA-pool-is-entirely-in-one-DDR-bank.patch \
		file://0106-sata-rcar-Remove-duplicate-entry-in-Kconfig.patch \
		file://0107-marzen-Updated-defconfig-to-include-mouse-keyboard-h.patch \
		file://0108-video-rcarfb-Support-triple-buffering-as-default.patch \
		file://0109-marzen-Increase-the-default-size-of-CMA-pool-to-128M.patch \
		file://0110-marzen-defconfig-Enable-Framebuffer-Console-support.patch \
		file://0111-ARM-shmobile-r8a7779-Fix-DMA-use-for-SDHI.patch \
		file://0112-hpbdma-Move-global-data-into-channel-struct.patch \
		file://0113-hpbdma-remove-unused-variables.patch \
		file://0114-hpbdma-Use-more-descriptive-names-for-variables-labe.patch \
		file://0115-hpbdma-Simplify-accesses-to-incremental-regs-based-o.patch \
		file://0116-hpbdma-Simplify-xmit-shift-code.patch \
		file://0117-hpbdma-Minor-formatting-change-to-match-SHDMA-driver.patch \
		file://0118-dma-hpbdma-move-dereference-below-the-NULL-check.patch \
		file://0119-dma-hpbdma-add-a-MODULE_ALIAS-to-allow-module-autolo.patch \
		file://0120-Comment-typo-fixes-for-descriptor.patch \
		file://0121-dmaengine-hpbdma-add-to_hpb_dev-define.patch \
		file://0122-dmaengine-move-last-completed-cookie-into-generic-dm.patch \
		file://0123-dmaengine-add-private-header-file.patch \
		file://0124-dmaengine-consolidate-tx_status-functions.patch \
		file://0125-dmaengine-ensure-all-DMA-engine-drivers-initialize-t.patch \
		file://0126-dmaengine-hpbdma-First-set-of-locking-fixes.patch \
		file://0127-dmaengine-hpbdma-protect-against-the-IRQ-handler.patch \
		file://0128-hpbdma-Sync-code-with-shdma.patch \
		file://0129-hpbdma-Remove-unused-variables.patch \
		file://0130-hpbdma-Remove-unnecessary-function-prototype.patch \
		file://0131-hpbdma-Move-dma-channel-setup-to-before-each-transfe.patch \
		file://0132-hpbdma-Allow-tx-rx-logical-channels-on-one-physical-.patch \
		file://0133-hpbdma-Fix-async-mode-mask.patch \
		file://0134-hpbdma-Fix-async-mode-reset-settings-for-SDHC0.patch \
		file://0135-hpbdma-Replace-individual-channel-setup-macros-with-.patch \
		file://0136-hpbdma-Remove-channel-offset-from-setup-info.patch \
		file://0137-ARM-shmobile-RCar-remove-unused-DMA-configurations.patch \
		file://0138-ARM-shmobile-RCar-Add-dmac-setup-info-for-MMC.patch \
		file://0139-mmc-sh_mmcif-Support-MMC_SLEEP_AWAKE-command.patch \
		file://0140-mmc-sh_mmcif-simplify-and-use-meaningful-label-names.patch \
		file://0141-mmc-sh_mmcif-fix-clock-management.patch \
		file://0142-mmc-sh_mmcif-re-read-the-clock-frequency-every-time-.patch \
		file://0143-mmc-sh_mmcif-remove-redundant-.down_pwr-callback.patch \
		file://0144-mmc-sh_mmcif-fix-use-after-free.patch \
		file://0145-mmc-sh-mmcif-properly-handle-MMC_WRITE_MULTIPLE_BLOC.patch \
		file://0146-mmc-sh-mmcif-Fix-MMC_WRITE_MULTIPLE_BLOCK-completion.patch \
		file://0147-ARM-shmobile-r8a7779-Add-MMC-clocks.patch \
		file://0148-ARM-shmobile-r8a7779-MMC-Added-IRQ-vectors-for-MMC.patch \
		file://0149-ARM-shmobile-r8a7779-GPIO-Added-support-for-Read-Wri.patch \
		file://0150-media-Add-SoC-support-for-V4L2_MBUS_FMT_YUYV10_2X10.patch \
		file://0151-rcarvin-Add-ability-to-limit-the-MBUS-format-used.patch \
		file://0152-rcarvin-Add-support-for-10-bit-BT.656-cameras.patch \
		file://0153-ARM-shmobile-r8a7779-Add-clocks-for-all-SSI-channels.patch \
		file://0154-ARM-shmobile-Make-the-RCar-HPB-DMA-addresses-clearer.patch \
		file://0155-ASoC-rcar-Remove-useless-definitions.patch \
		file://0156-ASoC-rcar-Add-helper-fn-for-clock-source-setup.patch \
		file://0157-ASoC-rcar-remove-custom-ioctls.patch \
		file://0158-ASoC-rcar-Add-support-for-additional-SSI-channels.patch \
		file://0159-ASoC-ak4642-Define-register-bit-offsets-rather-than-.patch \
		file://0160-ASoC-ak4642-Add-support-for-inputs-from-LIN2-RIN2.patch \
		file://0161-ASoC-ak4642-Add-microphone-bias-and-gain.patch \
		file://0162-marzen-exp-board-Add-config-options-for-the-REE-EDC-.patch \
		file://0163-video-Basic-tfp410-HDMI-transmitter-driver.patch \
		file://0164-marzen-Add-tfp410-HDMI-transmitter-to-board-setup.patch \
		file://0165-ov10635-Add-OmniVision-ov10635-SoC-camera-driver.patch \
		file://0166-ov10635-Add-support-for-10-bit-BT.656-output.patch \
		file://0167-marzen-Add-ov10635-cameras-on-vin0-and-vin2.patch \
		file://0168-marzen-Use-ov10635-cameras-on-vin1-and-vin3.patch \
		file://0169-marzen-Add-on-chip-ethernet-device.patch \
		file://0170-marzen-Add-second-display-unit.patch \
		file://0171-marzen-defconfig-for-REE-EDC-Expansion-Board.patch \
		file://0172-rgb-24-bit-SoC-camera-dummy-driver.patch \
		file://0173-marzen-Add-resources-pinmux-for-24-bit-RGB-Video-In-.patch \
		file://0174-marzen-Add-pinmux-for-additional-serial-channels.patch \
		file://0175-ov10635-Fix-analogue-timing-for-1280x800-30fps.patch \
		file://0176-marzen-defconfig-Enable-I2C-driver-interface.patch \
		file://0177-ARM-shmobile-r8a7779-hurricane.patch \
		file://0178-ARM-shmobile-r8a7779-hurricane-Add-option-to-use-10-.patch \
		file://0179-ARM-shmobile-Add-DMA-config-for-audio-SSI7-and-SSI8.patch \
		file://0180-ASoC-rcar-Add-ak4642-on-SSI7-8.patch \
		file://0181-ASoC-rcar-New-glue-code-for-ak4648-codec-on-Hurrican.patch \
		file://0182-ASoC-rcar-Fix-output-format-for-ak4648-codec-on-Hurr.patch \
		file://0183-ASoC-rcar-Fix-output-format-for-ak4643-codec-on-Marz.patch \
		file://0184-rcarvin-Add-error-message-if-SoC-camera-doesn-t-have.patch \
		file://0185-libata-sff-Fix-use-of-IO-mem.patch \
		file://0186-ARM-shmobile-r8a7779-Add-PCIe-clocks.patch \
		file://0187-ARM-pci-Add-Renesas-PCI-ID-for-R-Car-root-complex-de.patch \
		file://0188-ARM-shmobile-Add-R-Car-PCIe-driver.patch \
		file://0189-ARM-shmobile-Add-PCIe-setup-to-r8a7779-device.patch \
		file://0190-ARM-shmobile-r8a7779-h1lcb.patch \
		file://0191-h1lcb-enable-hdmi-tfp410-on-DU0.patch \
		file://0192-h1lcb-enable-DU1-and-hdmi-tfp410-on-DU1.patch \
		file://0193-h1lcb-fb-fix-1024x600-resolution-on-Xenarc-monitor.patch \
		file://0194-h1lcb-spi-change-to-interrupt-and-dma-transfer-suppo.patch \
		file://0195-h1lcb-spi-change-platform-dev-config.patch \
		file://0196-h1lcb-spi-setup-dma-channels.patch \
		file://0197-h1lcb-change-IRQ1-pin-for-boards-with-series-number-.patch \
		file://0198-h1lcb-enable-bluetooth.patch \
		file://0199-net-bus-add-the-AF_BUS-socket-address-family.patch \
		file://0200-net-bus-Add-AF_BUS-documentation.patch \
		file://0201-net-bus-add-af_bus-address-and-af_bus-socket-address.patch \
		file://0202-security-Add-Linux-Security-Modules-hook-for-AF_BUS-.patch \
		file://0203-security-selinux-Add-AF_BUS-socket-SELinux-hooks.patch \
		file://0204-netfilter-add-NFPROTO_BUS-hook-constant-for-AF_BUS-s.patch \
		file://0205-scm-allow-AF_BUS-sockets-to-send-ancillary-data.patch \
		file://0206-net-bus-Add-implementation-of-Bus-domain-sockets.patch \
		file://0207-net-bus-Add-garbage-collector-for-AF_BUS-sockets.patch \
		file://0208-net-bus-Add-the-AF_BUS-socket-address-family-to-KBui.patch \
		file://0209-netlink-connector-implement-cn_netlink_reply.patch \
		file://0210-netlink-connector-Add-idx-and-val-identifiers-for-ne.patch \
		file://0211-netfilter-nfdbus-Add-D-bus-message-parsing.patch \
		file://0212-netfilter-nfdbus-Add-D-bus-match-rule-implementation.patch \
		file://0213-netfilter-add-netfilter-D-Bus-module.patch \
		file://0214-h1lcb-defconfig-af-bus-enable.patch \
		file://0215-h1lcb-defconfig-config-build-autofs4-and-fuse-as-mod.patch \
	"

S = "${WORKDIR}/linux-3.4.38"

# We need to pass it as param since kernel might support more then one
# machine, with different entry points
EXTRA_OEMAKE += "LOADADDR=${UBOOT_ENTRYPOINT}"

