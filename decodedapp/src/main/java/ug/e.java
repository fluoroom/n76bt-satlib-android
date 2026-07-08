package ug;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import dd.r;
import dd.s;
import java.lang.reflect.InvocationTargetException;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f29152a;
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        try {
            r.a aVar = r.f10916a;
            objA = r.a(new c(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th2) {
            r.a aVar2 = r.f10916a;
            objA = r.a(s.a(th2));
        }
        f29152a = (d) (r.c(objA) ? null : objA);
    }

    public static final Handler a(Looper looper, boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        m.c(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
