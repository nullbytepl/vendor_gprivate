# gprivate
### Introduction
`gprivate` is a project to bring Pixel-exclusive SystemUI and Settings features to AOSP ROMs via merging and extraction of code and resources. This approach guarantees 100% accuracy to the Pixels.
### Integration
Clone this repo to vendor/gprivate and inherit the product makefile:
`$(call inherit-product-if-exists, vendor/gprivate/gprivate.mk)`

Important note: your SystemUI/Settings modifications CANNOT change any AOSP dagger elements. This is an inherent limitation of this approach in its current form and will not be change for the foreseeable future.

### Configuration
`gprivate` supports all the same configuration overlays as real Pixels and a few custom properties:
* `persist.acryl.columbus.use_ap_sensor` (default: `true`) - whether to use AP-based sensor for Columbus. Don't set this unless you know what you're doing
* `persist.acryl.columbus.model` (default: `tap7cls_redfin.tflite`) - select the model for AP-based Columbus. This should be configured to best match your device. Supported values: `tap7cls_bramble.tflite`, `tap7cls_coral.tflite`, `tap7cls_crosshatch.tflite`, `tap7cls_flame.tflite`, `tap7cls_redfin.tflite`
