package com.google.android.gms.common.util;

import com.facebook.stetho.websocket.CloseCodes;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static int a(int i10) {
        if (i10 == -1) {
            return -1;
        }
        return i10 / CloseCodes.NORMAL_CLOSURE;
    }
}
