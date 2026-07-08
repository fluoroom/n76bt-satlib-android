package com.xw.repo;

import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Properties f10402a = new Properties();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f10403b;

    static int a(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    static boolean b() throws Throwable {
        Boolean bool = f10403b;
        if (bool != null) {
            return bool.booleanValue();
        }
        FileInputStream fileInputStream = null;
        try {
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                f10403b = Boolean.valueOf(!TextUtils.isEmpty((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.miui.ui.version.name")));
            } catch (Exception unused) {
                f10403b = Boolean.FALSE;
            }
            return f10403b.booleanValue();
        }
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
                try {
                    f10402a.load(fileInputStream2);
                    fileInputStream2.close();
                } catch (IOException e11) {
                    e = e11;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    f10403b = Boolean.valueOf(f10402a.containsKey("ro.miui.ui.version.name"));
                    return f10403b.booleanValue();
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            e = e13;
        }
        f10403b = Boolean.valueOf(f10402a.containsKey("ro.miui.ui.version.name"));
        return f10403b.booleanValue();
    }

    static int c(int i10) {
        return (int) TypedValue.applyDimension(2, i10, Resources.getSystem().getDisplayMetrics());
    }
}
