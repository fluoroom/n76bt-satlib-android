package ib;

import android.content.Context;
import android.text.TextUtils;
import android.view.WindowManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f16003a;

    public static String a() {
        return Locale.getDefault().getLanguage();
    }

    public static String b(Context context) {
        if (!TextUtils.isEmpty(f16003a)) {
            return f16003a;
        }
        if (context == null) {
            return "";
        }
        f16003a = "";
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            f16003a = windowManager.getDefaultDisplay().getWidth() + "x" + windowManager.getDefaultDisplay().getHeight();
        }
        return f16003a;
    }
}
