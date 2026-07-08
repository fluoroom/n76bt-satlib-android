package com.google.android.gms.common.util;

import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f7225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f7226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f7227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f7228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f7229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Method f7230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Method f7231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Method f7232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Method f7233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Boolean f7234j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Class<?> cls = Integer.TYPE;
        f7225a = Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f7226b = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f7227c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f7228d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
            method4 = null;
        }
        f7229e = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
            method5 = null;
        }
        f7230f = method5;
        if (f.d()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
                method6 = null;
            }
        } else {
            method6 = null;
        }
        f7231g = method6;
        if (f.d()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e11) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
                method7 = null;
            }
        } else {
            method7 = null;
        }
        f7232h = method7;
        if (f.d()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
                method8 = null;
            }
        } else {
            method8 = null;
        }
        f7233i = method8;
        f7234j = null;
    }

    public static void a(WorkSource workSource, int i10, String str) {
        Method method = f7227c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f7226b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    public static boolean b(WorkSource workSource) {
        Method method = f7233i;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                q.i(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
        }
        return c(workSource) == 0;
    }

    public static int c(WorkSource workSource) {
        Method method = f7228d;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, null);
            q.i(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e10) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            return 0;
        }
    }
}
