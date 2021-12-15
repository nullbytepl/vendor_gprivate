package com.google.android.systemui.fingerprint;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.Display;
import com.android.systemui.biometrics.AuthController;
import com.android.systemui.biometrics.UdfpsHbmProvider;
import com.google.android.systemui.fingerprint.UdfpsHbmController;
import java.util.concurrent.Executor;

public class UdfpsHbmControllerStub extends UdfpsHbmController {
    public UdfpsHbmControllerStub(Context context, Handler handler, Executor executor, UdfpsGhbmProvider udfpsGhbmProvider, UdfpsLhbmProvider udfpsLhbmProvider, AuthController authController, DisplayManager displayManager) {
        this(context, handler, executor, udfpsGhbmProvider, udfpsLhbmProvider, authController, new Injector(displayManager));
    }

    UdfpsHbmControllerStub(Context context, Handler handler, Executor executor, UdfpsGhbmProvider udfpsGhbmProvider, UdfpsLhbmProvider udfpsLhbmProvider, AuthController authController, Injector injector) {
        super(context, handler, executor, udfpsGhbmProvider, udfpsLhbmProvider, authController, injector);
    }
}
