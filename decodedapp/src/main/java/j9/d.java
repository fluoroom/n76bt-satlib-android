package j9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.Xml;
import c0.k;
import h.j;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f18555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f18556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f18557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f18563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f18564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f18565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f18566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f18567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f18568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f18569o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f18570p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18571q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f18572r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Typeface f18573s;

    class a extends k.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f18574a;

        a(f fVar) {
            this.f18574a = fVar;
        }

        @Override // c0.k.e
        public void onFontRetrievalFailed(int i10) {
            d.this.f18571q = true;
            this.f18574a.a(i10);
        }

        @Override // c0.k.e
        public void onFontRetrieved(Typeface typeface) {
            d dVar = d.this;
            dVar.f18573s = Typeface.create(typeface, dVar.f18560f);
            d.this.f18571q = true;
            this.f18574a.b(d.this.f18573s, false);
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f18576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f18577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f18578c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f18576a = context;
            this.f18577b = textPaint;
            this.f18578c = fVar;
        }

        @Override // j9.f
        public void a(int i10) {
            this.f18578c.a(i10);
        }

        @Override // j9.f
        public void b(Typeface typeface, boolean z10) {
            d.this.r(this.f18576a, this.f18577b, typeface);
            this.f18578c.b(typeface, z10);
        }
    }

    public d(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, j.f14929c3);
        o(typedArrayObtainStyledAttributes.getDimension(j.f14935d3, 0.0f));
        n(c.a(context, typedArrayObtainStyledAttributes, j.f14953g3));
        this.f18555a = c.a(context, typedArrayObtainStyledAttributes, j.f14959h3);
        this.f18556b = c.a(context, typedArrayObtainStyledAttributes, j.f14965i3);
        this.f18560f = typedArrayObtainStyledAttributes.getInt(j.f14947f3, 0);
        this.f18561g = typedArrayObtainStyledAttributes.getInt(j.f14941e3, 1);
        int iG = c.g(typedArrayObtainStyledAttributes, j.f15000p3, j.f14990n3);
        this.f18570p = typedArrayObtainStyledAttributes.getResourceId(iG, 0);
        this.f18558d = typedArrayObtainStyledAttributes.getString(iG);
        this.f18562h = typedArrayObtainStyledAttributes.getBoolean(j.f15010r3, false);
        this.f18557c = c.a(context, typedArrayObtainStyledAttributes, j.f14970j3);
        this.f18563i = typedArrayObtainStyledAttributes.getFloat(j.f14975k3, 0.0f);
        this.f18564j = typedArrayObtainStyledAttributes.getFloat(j.f14980l3, 0.0f);
        this.f18565k = typedArrayObtainStyledAttributes.getFloat(j.f14985m3, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, l.W3);
        int i11 = l.X3;
        this.f18566l = typedArrayObtainStyledAttributes2.hasValue(i11);
        this.f18567m = typedArrayObtainStyledAttributes2.getFloat(i11, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f18559e = typedArrayObtainStyledAttributes2.getString(c.g(typedArrayObtainStyledAttributes2, l.f28756a4, l.Y3));
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f18573s == null && (str = this.f18558d) != null) {
            this.f18573s = Typeface.create(str, this.f18560f);
        }
        if (this.f18573s == null) {
            int i10 = this.f18561g;
            if (i10 == 1) {
                this.f18573s = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f18573s = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f18573s = Typeface.DEFAULT;
            } else {
                this.f18573s = Typeface.MONOSPACE;
            }
            this.f18573s = Typeface.create(this.f18573s, this.f18560f);
        }
    }

    private Typeface i(Context context) {
        Typeface typefaceCreate;
        if (this.f18572r) {
            return null;
        }
        this.f18572r = true;
        String strM = m(context, this.f18570p);
        if (strM == null || (typefaceCreate = Typeface.create(strM, 0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create(typefaceCreate, this.f18560f);
    }

    private boolean l(Context context) {
        if (e.a()) {
            f(context);
            return true;
        }
        if (this.f18571q) {
            return true;
        }
        int i10 = this.f18570p;
        if (i10 == 0) {
            return false;
        }
        Typeface typefaceC = k.c(context, i10);
        if (typefaceC != null) {
            this.f18573s = typefaceC;
            this.f18571q = true;
            return true;
        }
        Typeface typefaceI = i(context);
        if (typefaceI == null) {
            return false;
        }
        this.f18573s = typefaceI;
        this.f18571q = true;
        return true;
    }

    private static String m(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 != 0 && resources.getResourceTypeName(i10).equals("font")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), z.c.f32815h);
                        String string = typedArrayObtainAttributes.getString(z.c.f32823p);
                        typedArrayObtainAttributes.recycle();
                        return string;
                    }
                    xml.next();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public Typeface e() {
        d();
        return this.f18573s;
    }

    public Typeface f(Context context) {
        if (this.f18571q) {
            return this.f18573s;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceG = k.g(context, this.f18570p);
                this.f18573s = typefaceG;
                if (typefaceG != null) {
                    this.f18573s = Typeface.create(typefaceG, this.f18560f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f18558d, e10);
            }
        }
        d();
        this.f18571q = true;
        return this.f18573s;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        r(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (!l(context)) {
            d();
        }
        int i10 = this.f18570p;
        if (i10 == 0) {
            this.f18571q = true;
        }
        if (this.f18571q) {
            fVar.b(this.f18573s, true);
            return;
        }
        try {
            k.i(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f18571q = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f18558d, e10);
            this.f18571q = true;
            fVar.a(-3);
        }
    }

    public ColorStateList j() {
        return this.f18568n;
    }

    public float k() {
        return this.f18569o;
    }

    public void n(ColorStateList colorStateList) {
        this.f18568n = colorStateList;
    }

    public void o(float f10) {
        this.f18569o = f10;
    }

    public void p(Context context, TextPaint textPaint, f fVar) {
        q(context, textPaint, fVar);
        ColorStateList colorStateList = this.f18568n;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f18565k;
        float f11 = this.f18563i;
        float f12 = this.f18564j;
        ColorStateList colorStateList2 = this.f18557c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void q(Context context, TextPaint textPaint, f fVar) {
        Typeface typeface;
        if (l(context) && this.f18571q && (typeface = this.f18573s) != null) {
            r(context, textPaint, typeface);
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void r(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = h.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f18560f & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f18569o);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f18559e);
        }
        if (this.f18566l) {
            textPaint.setLetterSpacing(this.f18567m);
        }
    }
}
