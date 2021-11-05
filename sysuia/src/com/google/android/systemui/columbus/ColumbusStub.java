/*
    Copyright 2021 Acryl Project
    Proprietary
*/

package com.google.android.systemui.columbus;

import android.os.SystemProperties;

public class ColumbusStub {
    // Whether to use non-CHRE Columbus implementation
    public static boolean useApSensor() {
        return SystemProperties.getBoolean("persist.acryl.columbus.use_ap_sensor", true);
    }

    // Columbus model name for non-CHRE mode
    public static String getModelFileName() {
        return SystemProperties.get("persist.acryl.columbus.model", "tap7cls_redfin.tflite");
    }
}
