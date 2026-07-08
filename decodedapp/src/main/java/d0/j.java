package d0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import c0.h;
import c0.k;
import j0.j;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a */
    private static final q f10519a;

    /* JADX INFO: renamed from: b */
    private static final androidx.collection.h f10520b;

    /* JADX INFO: renamed from: c */
    private static Paint f10521c;

    public static class a extends j.c {

        /* JADX INFO: renamed from: a */
        private k.e f10522a;

        public a(k.e eVar) {
            this.f10522a = eVar;
        }

        @Override // j0.j.c
        public void a(int i10) {
            k.e eVar = this.f10522a;
            if (eVar != null) {
                eVar.onFontRetrievalFailed(i10);
            }
        }

        @Override // j0.j.c
        public void b(Typeface typeface) {
            k.e eVar = this.f10522a;
            if (eVar != null) {
                eVar.onFontRetrieved(typeface);
            }
        }
    }

    static {
        p1.a.a("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f10519a = new p();
        } else if (i10 >= 29) {
            f10519a = new o();
        } else if (i10 >= 28) {
            f10519a = new n();
        } else if (i10 >= 26) {
            f10519a = new m();
        } else if (i10 < 24 || !l.k()) {
            f10519a = new k();
        } else {
            f10519a = new l();
        }
        f10520b = new androidx.collection.h(16);
        f10521c = null;
        p1.a.b();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, j.b[] bVarArr, int i10) {
        p1.a.a("TypefaceCompat.createFromFontInfo");
        try {
            return f10519a.b(context, cancellationSignal, bVarArr, i10);
        } finally {
            p1.a.b();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        p1.a.a("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f10519a.c(context, cancellationSignal, list, i10);
        } finally {
            p1.a.b();
        }
    }

    public static Typeface d(Context context, h.b bVar, Resources resources, int i10, String str, int i11, int i12, k.e eVar, Handler handler, boolean z10) {
        Typeface typefaceA;
        if (bVar instanceof h.e) {
            h.e eVar2 = (h.e) bVar;
            Typeface typefaceI = i(eVar2);
            if (typefaceI != null) {
                if (eVar != null) {
                    eVar.callbackSuccessAsync(typefaceI, handler);
                }
                f10520b.put(f(resources, i10, str, i11, i12), typefaceI);
                return typefaceI;
            }
            typefaceA = j0.j.c(context, eVar2.b(), i12, !z10 ? eVar != null : eVar2.a() != 0, z10 ? eVar2.d() : -1, k.e.getHandler(handler), new a(eVar));
        } else {
            typefaceA = f10519a.a(context, (h.c) bVar, resources, i12);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.callbackSuccessAsync(typefaceA, handler);
                } else {
                    eVar.callbackFailAsync(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f10520b.put(f(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface e(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceE = f10519a.e(context, resources, i10, str, i12);
        if (typefaceE != null) {
            f10520b.put(f(resources, i10, str, i11, i12), typefaceE);
        }
        return typefaceE;
    }

    private static String f(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface g(Resources resources, int i10, String str, int i11, int i12) {
        return (Typeface) f10520b.get(f(resources, i10, str, i11, i12));
    }

    public static Typeface h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00ec, code lost:
    
        return r0.build();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface i(c0.h.e r8) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.j.i(c0.h$e):android.graphics.Typeface");
    }

    public static Font j(Typeface typeface) {
        if (f10521c == null) {
            f10521c = new Paint();
        }
        f10521c.setTextSize(10.0f);
        f10521c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f10521c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
