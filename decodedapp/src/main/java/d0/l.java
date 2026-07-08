package d0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import c0.h;
import j0.j;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class l extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f10528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Constructor f10529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f10530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f10531e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f10529c = constructor;
        f10528b = cls;
        f10530d = method2;
        f10531e = method;
    }

    l() {
    }

    private static boolean i(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f10530d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f10528b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f10531e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean k() {
        Method method = f10530d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object l() {
        try {
            return f10529c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // d0.q
    public Typeface a(Context context, h.c cVar, Resources resources, int i10) {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        for (h.d dVar : cVar.a()) {
            ByteBuffer byteBufferB = r.b(context, resources, dVar.b());
            if (byteBufferB == null || !i(objL, byteBufferB, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return j(objL);
    }

    @Override // d0.q
    public Typeface b(Context context, CancellationSignal cancellationSignal, j.b[] bVarArr, int i10) {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        androidx.collection.i iVar = new androidx.collection.i();
        for (j.b bVar : bVarArr) {
            Uri uriE = bVar.e();
            ByteBuffer byteBufferF = (ByteBuffer) iVar.get(uriE);
            if (byteBufferF == null) {
                byteBufferF = r.f(context, cancellationSignal, uriE);
                iVar.put(uriE, byteBufferF);
            }
            if (byteBufferF == null || !i(objL, byteBufferF, bVar.d(), bVar.g(), bVar.h())) {
                return null;
            }
        }
        Typeface typefaceJ = j(objL);
        if (typefaceJ == null) {
            return null;
        }
        return Typeface.create(typefaceJ, i10);
    }
}
