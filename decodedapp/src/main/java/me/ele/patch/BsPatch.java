package me.ele.patch;

import android.content.Context;
import android.util.Log;
import java.io.File;
import k7.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BsPatch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21965a = "BsPatch";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f21966b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f21967c = false;

    class a implements c.InterfaceC0255c {
        a() {
        }

        @Override // k7.c.InterfaceC0255c
        public void a() {
        }

        @Override // k7.c.InterfaceC0255c
        public void b(Throwable th2) {
            boolean unused = BsPatch.f21967c = true;
        }
    }

    public static void b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("param context cannot be null");
        }
        if (f21966b) {
            Log.d(f21965a, "initialization shall not be done twice");
        } else {
            c.b(context.getApplicationContext(), "Patcher", new a());
            f21966b = true;
        }
    }

    public static boolean c(String str, String str2, String str3) {
        if (!f21966b) {
            throw new RuntimeException("call BsPatch.init(context) first");
        }
        if (f21967c) {
            Log.e(f21965a, "loading libPatcher.so fails, so no further more");
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            throw new IllegalArgumentException(String.format("oldPath %s don't exist, please check", str));
        }
        if (!file.canRead()) {
            throw new IllegalArgumentException(String.format("oldPath %s cannot be read, please check", str));
        }
        File file2 = new File(str3);
        if (!file2.exists()) {
            throw new IllegalArgumentException(String.format("patch %s don't exist, please check", str3));
        }
        if (!file2.canRead()) {
            throw new IllegalArgumentException(String.format("patchPath %s cannot be read, please check", str3));
        }
        if (!file2.isFile()) {
            throw new IllegalArgumentException(String.format("make sure patchPath %s is a valid file", str3));
        }
        File file3 = new File(str2);
        if (file3.exists() && !file3.delete()) {
            throw new IllegalArgumentException(String.format("newPath %s exists and cannot be deleted. please check", str2));
        }
        if (file3.getParentFile().exists() || file3.getParentFile().mkdirs()) {
            return patch(str, str2, str3) == 0;
        }
        throw new IllegalArgumentException(String.format("newPath cannot execute mkdirs. please check", str2));
    }

    private static native int patch(String str, String str2, String str3);
}
