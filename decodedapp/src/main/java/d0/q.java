package d0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.appcompat.widget.ActivityChooserView;
import c0.h;
import j$.util.concurrent.ConcurrentHashMap;
import j0.j;
import java.io.File;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f10539a = new ConcurrentHashMap();

    class a implements b {
        a() {
        }

        @Override // d0.q.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(j.b bVar) {
            return bVar.g();
        }

        @Override // d0.q.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(j.b bVar) {
            return bVar.h();
        }
    }

    private interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    q() {
    }

    private static Object f(Object[] objArr, int i10, b bVar) {
        return g(objArr, (i10 & 1) == 0 ? 400 : 700, (i10 & 2) != 0, bVar);
    }

    private static Object g(Object[] objArr, int i10, boolean z10, b bVar) {
        Object obj = null;
        int i11 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.a(obj2) - i10) * 2) + (bVar.b(obj2) == z10 ? 0 : 1);
            if (obj == null || i11 > iAbs) {
                obj = obj2;
                i11 = iAbs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, h.c cVar, Resources resources, int i10);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, j.b[] bVarArr, int i10);

    public Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface d(Context context, InputStream inputStream) {
        File fileE = r.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (r.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        File fileE = r.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (r.c(fileE, resources, i10)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected j.b h(j.b[] bVarArr, int i10) {
        return (j.b) f(bVarArr, i10, new a());
    }
}
