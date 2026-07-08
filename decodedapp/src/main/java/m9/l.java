package m9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f21855m = new j(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f21856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f21857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f21858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    e f21859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f21860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    d f21861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    d f21862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    d f21863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f21864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    g f21865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    g f21866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f21867l;

    public interface c {
        d a(d dVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new m9.a(i12));
    }

    private static b d(Context context, int i10, int i11, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i11, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(u8.l.f28839j5);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(u8.l.f28848k5, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(u8.l.f28875n5, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(u8.l.f28884o5, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(u8.l.f28866m5, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(u8.l.f28857l5, i12);
            d dVarM = m(typedArrayObtainStyledAttributes, u8.l.f28893p5, dVar);
            d dVarM2 = m(typedArrayObtainStyledAttributes, u8.l.f28920s5, dVarM);
            d dVarM3 = m(typedArrayObtainStyledAttributes, u8.l.f28929t5, dVarM);
            d dVarM4 = m(typedArrayObtainStyledAttributes, u8.l.f28911r5, dVarM);
            return new b().A(i13, dVarM2).E(i14, dVarM3).w(i15, dVarM4).s(i16, m(typedArrayObtainStyledAttributes, u8.l.f28902q5, dVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new m9.a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, d dVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u8.l.P3, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(u8.l.Q3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(u8.l.R3, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dVar);
    }

    public static d m(TypedArray typedArray, int i10, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new m9.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new j(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public g h() {
        return this.f21866k;
    }

    public e i() {
        return this.f21859d;
    }

    public d j() {
        return this.f21863h;
    }

    public e k() {
        return this.f21858c;
    }

    public d l() {
        return this.f21862g;
    }

    public g n() {
        return this.f21867l;
    }

    public g o() {
        return this.f21865j;
    }

    public g p() {
        return this.f21864i;
    }

    public e q() {
        return this.f21856a;
    }

    public d r() {
        return this.f21860e;
    }

    public e s() {
        return this.f21857b;
    }

    public d t() {
        return this.f21861f;
    }

    public String toString() {
        return "[" + r() + ", " + t() + ", " + l() + ", " + j() + "]";
    }

    public boolean u() {
        return (this.f21857b instanceof k) && (this.f21856a instanceof k) && (this.f21858c instanceof k) && (this.f21859d instanceof k);
    }

    public boolean v(RectF rectF) {
        boolean z10 = this.f21867l.getClass().equals(g.class) && this.f21865j.getClass().equals(g.class) && this.f21864i.getClass().equals(g.class) && this.f21866k.getClass().equals(g.class);
        float fA = this.f21860e.a(rectF);
        return z10 && ((this.f21861f.a(rectF) > fA ? 1 : (this.f21861f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f21863h.a(rectF) > fA ? 1 : (this.f21863h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f21862g.a(rectF) > fA ? 1 : (this.f21862g.a(rectF) == fA ? 0 : -1)) == 0) && u();
    }

    public b w() {
        return new b(this);
    }

    public l x(float f10) {
        return w().o(f10).m();
    }

    public l y(d dVar) {
        return w().p(dVar).m();
    }

    public l z(c cVar) {
        return w().D(cVar.a(r())).H(cVar.a(t())).v(cVar.a(j())).z(cVar.a(l())).m();
    }

    private l(b bVar) {
        this.f21856a = bVar.f21868a;
        this.f21857b = bVar.f21869b;
        this.f21858c = bVar.f21870c;
        this.f21859d = bVar.f21871d;
        this.f21860e = bVar.f21872e;
        this.f21861f = bVar.f21873f;
        this.f21862g = bVar.f21874g;
        this.f21863h = bVar.f21875h;
        this.f21864i = bVar.f21876i;
        this.f21865j = bVar.f21877j;
        this.f21866k = bVar.f21878k;
        this.f21867l = bVar.f21879l;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f21868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f21869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f21870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private e f21871d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f21872e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d f21873f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f21874g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f21875h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private g f21876i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private g f21877j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private g f21878k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g f21879l;

        public b() {
            this.f21868a = i.b();
            this.f21869b = i.b();
            this.f21870c = i.b();
            this.f21871d = i.b();
            this.f21872e = new m9.a(0.0f);
            this.f21873f = new m9.a(0.0f);
            this.f21874g = new m9.a(0.0f);
            this.f21875h = new m9.a(0.0f);
            this.f21876i = i.c();
            this.f21877j = i.c();
            this.f21878k = i.c();
            this.f21879l = i.c();
        }

        private static float n(e eVar) {
            if (eVar instanceof k) {
                return ((k) eVar).f21854a;
            }
            if (eVar instanceof f) {
                return ((f) eVar).f21809a;
            }
            return -1.0f;
        }

        public b A(int i10, d dVar) {
            return B(i.a(i10)).D(dVar);
        }

        public b B(e eVar) {
            this.f21868a = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                C(fN);
            }
            return this;
        }

        public b C(float f10) {
            this.f21872e = new m9.a(f10);
            return this;
        }

        public b D(d dVar) {
            this.f21872e = dVar;
            return this;
        }

        public b E(int i10, d dVar) {
            return F(i.a(i10)).H(dVar);
        }

        public b F(e eVar) {
            this.f21869b = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                G(fN);
            }
            return this;
        }

        public b G(float f10) {
            this.f21873f = new m9.a(f10);
            return this;
        }

        public b H(d dVar) {
            this.f21873f = dVar;
            return this;
        }

        public l m() {
            return new l(this);
        }

        public b o(float f10) {
            return C(f10).G(f10).y(f10).u(f10);
        }

        public b p(d dVar) {
            return D(dVar).H(dVar).z(dVar).v(dVar);
        }

        public b q(int i10, float f10) {
            return r(i.a(i10)).o(f10);
        }

        public b r(e eVar) {
            return B(eVar).F(eVar).x(eVar).t(eVar);
        }

        public b s(int i10, d dVar) {
            return t(i.a(i10)).v(dVar);
        }

        public b t(e eVar) {
            this.f21871d = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                u(fN);
            }
            return this;
        }

        public b u(float f10) {
            this.f21875h = new m9.a(f10);
            return this;
        }

        public b v(d dVar) {
            this.f21875h = dVar;
            return this;
        }

        public b w(int i10, d dVar) {
            return x(i.a(i10)).z(dVar);
        }

        public b x(e eVar) {
            this.f21870c = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                y(fN);
            }
            return this;
        }

        public b y(float f10) {
            this.f21874g = new m9.a(f10);
            return this;
        }

        public b z(d dVar) {
            this.f21874g = dVar;
            return this;
        }

        public b(l lVar) {
            this.f21868a = i.b();
            this.f21869b = i.b();
            this.f21870c = i.b();
            this.f21871d = i.b();
            this.f21872e = new m9.a(0.0f);
            this.f21873f = new m9.a(0.0f);
            this.f21874g = new m9.a(0.0f);
            this.f21875h = new m9.a(0.0f);
            this.f21876i = i.c();
            this.f21877j = i.c();
            this.f21878k = i.c();
            this.f21879l = i.c();
            this.f21868a = lVar.f21856a;
            this.f21869b = lVar.f21857b;
            this.f21870c = lVar.f21858c;
            this.f21871d = lVar.f21859d;
            this.f21872e = lVar.f21860e;
            this.f21873f = lVar.f21861f;
            this.f21874g = lVar.f21862g;
            this.f21875h = lVar.f21863h;
            this.f21876i = lVar.f21864i;
            this.f21877j = lVar.f21865j;
            this.f21878k = lVar.f21866k;
            this.f21879l = lVar.f21867l;
        }
    }

    public l() {
        this.f21856a = i.b();
        this.f21857b = i.b();
        this.f21858c = i.b();
        this.f21859d = i.b();
        this.f21860e = new m9.a(0.0f);
        this.f21861f = new m9.a(0.0f);
        this.f21862g = new m9.a(0.0f);
        this.f21863h = new m9.a(0.0f);
        this.f21864i = i.c();
        this.f21865j = i.c();
        this.f21866k = i.c();
        this.f21867l = i.c();
    }
}
