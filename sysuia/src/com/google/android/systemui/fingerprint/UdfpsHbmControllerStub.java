package com.google.android.systemui.fingerprint;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.fingerprint.IUdfpsHbmListener;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemProperties;
import android.os.Trace;
import android.provider.Settings;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import com.android.internal.annotations.VisibleForTesting;
import com.android.systemui.biometrics.AuthController;
import com.android.systemui.biometrics.UdfpsHbmProvider;
import com.android.systemui.util.Assert;
import com.google.android.systemui.fingerprint.UdfpsHbmRequest;
import com.google.android.systemui.fingerprint.UdfpsHbmController;
import java.util.concurrent.Executor;

public class UdfpsHbmControllerStub extends UdfpsHbmController {
    public UdfpsHbmControllerStub(Context context, Handler handler, Executor executor, UdfpsGhbmProvider udfpsGhbmProvider, UdfpsLhbmProvider udfpsLhbmProvider, AuthController authController, DisplayManager displayManager) {
        this(context, handler, executor, udfpsGhbmProvider, udfpsLhbmProvider, authController, new super.Injector(displayManager));
    }

    UdfpsHbmControllerStub(Context context, Handler handler, Executor executor, UdfpsGhbmProvider udfpsGhbmProvider, UdfpsLhbmProvider udfpsLhbmProvider, AuthController authController, Injector injector) {
        super(context, handler, executor, udfpsGhbmProvider, udfpsLhbmProvider, authController, injector);
    }
}
