package p8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import j$.util.Objects;
import o8.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a */
    private static final String f24085a = "b0";

    /* JADX INFO: renamed from: b */
    private static Context f24086b;

    /* JADX INFO: renamed from: c */
    private static d0 f24087c;

    public static d0 a(Context context, e.a aVar) throws s7.f {
        v7.q.i(context);
        String str = f24085a;
        Log.d(str, "preferredRenderer: ".concat(String.valueOf(aVar)));
        d0 d0Var = f24087c;
        if (d0Var != null) {
            return d0Var;
        }
        int iE = s7.g.e(context, 13400000);
        if (iE != 0) {
            throw new s7.f(iE);
        }
        d0 d0VarD = d(context, aVar);
        f24087c = d0VarD;
        try {
            int iP = d0VarD.p();
            String packageName = context.getPackageName();
            if (iP != 2 || packageName.equals("com.google.android.apps.photos")) {
                Log.d(str, "not early loading native code");
            } else {
                Log.d(str, "early loading native code");
                try {
                    f24087c.a1(c8.d.v1(c(context, aVar)));
                } catch (RemoteException e10) {
                    throw new q8.q(e10);
                } catch (UnsatisfiedLinkError unused) {
                    Log.w(f24085a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                    f24086b = null;
                    f24087c = d(context, e.a.LEGACY);
                }
            }
            try {
                d0 d0Var2 = f24087c;
                Context contextC = c(context, aVar);
                Objects.requireNonNull(contextC);
                d0Var2.Q(c8.d.v1(contextC.getResources()), 19020000);
                return f24087c;
            } catch (RemoteException e11) {
                throw new q8.q(e11);
            }
        } catch (RemoteException e12) {
            throw new q8.q(e12);
        }
    }

    private static Context b(Exception exc, Context context) {
        Log.e(f24085a, "Failed to load maps module, use pre-Chimera", exc);
        return s7.g.b(context);
    }

    private static Context c(Context context, e.a aVar) {
        Context contextB;
        Context context2 = f24086b;
        if (context2 != null) {
            return context2;
        }
        String str = aVar == e.a.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            contextB = DynamiteModule.c(context, DynamiteModule.f7235b, str).b();
        } catch (Exception e10) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                contextB = b(e10, context);
            } else {
                try {
                    Log.d(f24085a, "Attempting to load maps_dynamite again.");
                    contextB = DynamiteModule.c(context, DynamiteModule.f7235b, "com.google.android.gms.maps_dynamite").b();
                } catch (Exception e11) {
                    contextB = b(e11, context);
                }
            }
        }
        f24086b = contextB;
        if (contextB != null) {
            return contextB;
        }
        throw new RuntimeException("Unable to load maps module, maps container context is null");
    }

    private static d0 d(Context context, e.a aVar) {
        Log.i(f24085a, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) e(((ClassLoader) v7.q.i(c(context, aVar).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                throw new RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return iInterfaceQueryLocalInterface instanceof d0 ? (d0) iInterfaceQueryLocalInterface : new c0(iBinder);
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e10);
        }
    }

    private static Object e(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e11);
        }
    }
}
