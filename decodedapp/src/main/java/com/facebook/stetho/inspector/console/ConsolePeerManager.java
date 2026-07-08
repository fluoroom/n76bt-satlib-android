package com.facebook.stetho.inspector.console;

import com.facebook.stetho.inspector.helper.ChromePeerManager;

/* JADX INFO: loaded from: classes.dex */
public class ConsolePeerManager extends ChromePeerManager {
    private static ConsolePeerManager sInstance;

    private ConsolePeerManager() {
    }

    public static synchronized ConsolePeerManager getInstanceOrNull() {
        return sInstance;
    }

    public static synchronized ConsolePeerManager getOrCreateInstance() {
        try {
            if (sInstance == null) {
                sInstance = new ConsolePeerManager();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sInstance;
    }
}
