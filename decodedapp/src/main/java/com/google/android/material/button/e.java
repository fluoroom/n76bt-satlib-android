package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.internal.p;
import m9.h;
import m9.l;
import m9.o;
import m9.q;
import t0.j;

/* JADX INFO: loaded from: classes3.dex */
class e {

    /* JADX INFO: renamed from: a */
    private final MaterialButton f7576a;

    /* JADX INFO: renamed from: b */
    private l f7577b;

    /* JADX INFO: renamed from: c */
    private q f7578c;

    /* JADX INFO: renamed from: d */
    private j f7579d;

    /* JADX INFO: renamed from: e */
    private h.d f7580e;

    /* JADX INFO: renamed from: f */
    private int f7581f;

    /* JADX INFO: renamed from: g */
    private int f7582g;

    /* JADX INFO: renamed from: h */
    private int f7583h;

    /* JADX INFO: renamed from: i */
    private int f7584i;

    /* JADX INFO: renamed from: j */
    private int f7585j;

    /* JADX INFO: renamed from: k */
    private int f7586k;

    /* JADX INFO: renamed from: l */
    private PorterDuff.Mode f7587l;

    /* JADX INFO: renamed from: m */
    private ColorStateList f7588m;

    /* JADX INFO: renamed from: n */
    private ColorStateList f7589n;

    /* JADX INFO: renamed from: o */
    private ColorStateList f7590o;

    /* JADX INFO: renamed from: p */
    private Drawable f7591p;

    /* JADX INFO: renamed from: t */
    private boolean f7595t;

    /* JADX INFO: renamed from: v */
    private LayerDrawable f7597v;

    /* JADX INFO: renamed from: w */
    private int f7598w;

    /* JADX INFO: renamed from: q */
    private boolean f7592q = false;

    /* JADX INFO: renamed from: r */
    private boolean f7593r = false;

    /* JADX INFO: renamed from: s */
    private boolean f7594s = false;

    /* JADX INFO: renamed from: u */
    private boolean f7596u = true;

    e(MaterialButton materialButton, l lVar) {
        this.f7576a = materialButton;
        this.f7577b = lVar;
    }

    private void L(int i10, int i11) {
        int paddingStart = this.f7576a.getPaddingStart();
        int paddingTop = this.f7576a.getPaddingTop();
        int paddingEnd = this.f7576a.getPaddingEnd();
        int paddingBottom = this.f7576a.getPaddingBottom();
        int i12 = this.f7583h;
        int i13 = this.f7584i;
        this.f7584i = i11;
        this.f7583h = i10;
        if (!this.f7593r) {
            M();
        }
        this.f7576a.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    private void M() {
        this.f7576a.setInternalBackground(a());
        h hVarG = g();
        if (hVarG != null) {
            hVarG.b0(this.f7598w);
            hVarG.setState(this.f7576a.getDrawableState());
        }
    }

    private void N() {
        if (Build.VERSION.SDK_INT < 23 && !this.f7593r) {
            int paddingStart = this.f7576a.getPaddingStart();
            int paddingTop = this.f7576a.getPaddingTop();
            int paddingEnd = this.f7576a.getPaddingEnd();
            int paddingBottom = this.f7576a.getPaddingBottom();
            M();
            this.f7576a.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
            return;
        }
        h hVarG = g();
        if (hVarG != null) {
            q qVar = this.f7578c;
            if (qVar != null) {
                hVarG.h0(qVar);
            } else {
                hVarG.setShapeAppearanceModel(this.f7577b);
            }
            j jVar = this.f7579d;
            if (jVar != null) {
                hVarG.a0(jVar);
            }
        }
        h hVarP = p();
        if (hVarP != null) {
            q qVar2 = this.f7578c;
            if (qVar2 != null) {
                hVarP.h0(qVar2);
            } else {
                hVarP.setShapeAppearanceModel(this.f7577b);
            }
            j jVar2 = this.f7579d;
            if (jVar2 != null) {
                hVarP.a0(jVar2);
            }
        }
        o oVarF = f();
        if (oVarF != null) {
            oVarF.setShapeAppearanceModel(this.f7577b);
            if (oVarF instanceof h) {
                h hVar = (h) oVarF;
                q qVar3 = this.f7578c;
                if (qVar3 != null) {
                    hVar.h0(qVar3);
                }
                j jVar3 = this.f7579d;
                if (jVar3 != null) {
                    hVar.a0(jVar3);
                }
            }
        }
    }

    private void P() {
        h hVarG = g();
        h hVarP = p();
        if (hVarG != null) {
            hVarG.j0(this.f7586k, this.f7589n);
            if (hVarP != null) {
                hVarP.i0(this.f7586k, this.f7592q ? c9.a.d(this.f7576a, u8.b.f28552h) : 0);
            }
        }
    }

    private InsetDrawable Q(Drawable drawable) {
        return new InsetDrawable(drawable, this.f7581f, this.f7583h, this.f7582g, this.f7584i);
    }

    private Drawable a() {
        h hVar = new h(this.f7577b);
        q qVar = this.f7578c;
        if (qVar != null) {
            hVar.h0(qVar);
        }
        j jVar = this.f7579d;
        if (jVar != null) {
            hVar.a0(jVar);
        }
        h.d dVar = this.f7580e;
        if (dVar != null) {
            hVar.e0(dVar);
        }
        hVar.Q(this.f7576a.getContext());
        hVar.setTintList(this.f7588m);
        PorterDuff.Mode mode = this.f7587l;
        if (mode != null) {
            hVar.setTintMode(mode);
        }
        hVar.j0(this.f7586k, this.f7589n);
        h hVar2 = new h(this.f7577b);
        q qVar2 = this.f7578c;
        if (qVar2 != null) {
            hVar2.h0(qVar2);
        }
        j jVar2 = this.f7579d;
        if (jVar2 != null) {
            hVar2.a0(jVar2);
        }
        hVar2.setTint(0);
        hVar2.i0(this.f7586k, this.f7592q ? c9.a.d(this.f7576a, u8.b.f28552h) : 0);
        h hVar3 = new h(this.f7577b);
        this.f7591p = hVar3;
        q qVar3 = this.f7578c;
        if (qVar3 != null) {
            hVar3.h0(qVar3);
        }
        j jVar3 = this.f7579d;
        if (jVar3 != null) {
            ((h) this.f7591p).a0(jVar3);
        }
        this.f7591p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(k9.a.e(this.f7590o), Q(new LayerDrawable(new Drawable[]{hVar2, hVar})), this.f7591p);
        this.f7597v = rippleDrawable;
        return rippleDrawable;
    }

    private h h(boolean z10) {
        LayerDrawable layerDrawable = this.f7597v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (h) ((LayerDrawable) ((InsetDrawable) this.f7597v.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    private h p() {
        return h(true);
    }

    public void A(int i10) {
        L(this.f7583h, i10);
    }

    public void B(int i10) {
        L(i10, this.f7584i);
    }

    void C(ColorStateList colorStateList) {
        if (this.f7590o != colorStateList) {
            this.f7590o = colorStateList;
            if (this.f7576a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.f7576a.getBackground()).setColor(k9.a.e(colorStateList));
            }
        }
    }

    void D(l lVar) {
        this.f7577b = lVar;
        this.f7578c = null;
        N();
    }

    void E(boolean z10) {
        this.f7592q = z10;
        P();
    }

    void F(q qVar) {
        this.f7578c = qVar;
        N();
    }

    void G(ColorStateList colorStateList) {
        if (this.f7589n != colorStateList) {
            this.f7589n = colorStateList;
            P();
        }
    }

    void H(int i10) {
        if (this.f7586k != i10) {
            this.f7586k = i10;
            P();
        }
    }

    void I(ColorStateList colorStateList) {
        if (this.f7588m != colorStateList) {
            this.f7588m = colorStateList;
            if (g() != null) {
                g().setTintList(this.f7588m);
            }
        }
    }

    void J(PorterDuff.Mode mode) {
        if (this.f7587l != mode) {
            this.f7587l = mode;
            if (g() == null || this.f7587l == null) {
                return;
            }
            g().setTintMode(this.f7587l);
        }
    }

    void K(boolean z10) {
        this.f7596u = z10;
    }

    void O(int i10, int i11) {
        Drawable drawable = this.f7591p;
        if (drawable != null) {
            drawable.setBounds(this.f7581f, this.f7583h, i11 - this.f7582g, i10 - this.f7584i);
        }
    }

    int b() {
        return this.f7585j;
    }

    j c() {
        return this.f7579d;
    }

    public int d() {
        return this.f7584i;
    }

    public int e() {
        return this.f7583h;
    }

    public o f() {
        LayerDrawable layerDrawable = this.f7597v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f7597v.getNumberOfLayers() > 2 ? (o) this.f7597v.getDrawable(2) : (o) this.f7597v.getDrawable(1);
    }

    h g() {
        return h(false);
    }

    ColorStateList i() {
        return this.f7590o;
    }

    l j() {
        return this.f7577b;
    }

    q k() {
        return this.f7578c;
    }

    ColorStateList l() {
        return this.f7589n;
    }

    int m() {
        return this.f7586k;
    }

    ColorStateList n() {
        return this.f7588m;
    }

    PorterDuff.Mode o() {
        return this.f7587l;
    }

    boolean q() {
        return this.f7593r;
    }

    boolean r() {
        return this.f7595t;
    }

    boolean s() {
        return this.f7596u;
    }

    void t(TypedArray typedArray) {
        this.f7581f = typedArray.getDimensionPixelOffset(u8.l.f28917s2, 0);
        this.f7582g = typedArray.getDimensionPixelOffset(u8.l.f28926t2, 0);
        this.f7583h = typedArray.getDimensionPixelOffset(u8.l.f28935u2, 0);
        this.f7584i = typedArray.getDimensionPixelOffset(u8.l.f28944v2, 0);
        int i10 = u8.l.f28980z2;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f7585j = dimensionPixelSize;
            D(this.f7577b.x(dimensionPixelSize));
            this.f7594s = true;
        }
        this.f7586k = typedArray.getDimensionPixelSize(u8.l.L2, 0);
        this.f7587l = p.h(typedArray.getInt(u8.l.f28971y2, -1), PorterDuff.Mode.SRC_IN);
        this.f7588m = j9.c.a(this.f7576a.getContext(), typedArray, u8.l.f28962x2);
        this.f7589n = j9.c.a(this.f7576a.getContext(), typedArray, u8.l.K2);
        this.f7590o = j9.c.a(this.f7576a.getContext(), typedArray, u8.l.I2);
        this.f7595t = typedArray.getBoolean(u8.l.f28953w2, false);
        this.f7598w = typedArray.getDimensionPixelSize(u8.l.A2, 0);
        this.f7596u = typedArray.getBoolean(u8.l.M2, true);
        int paddingStart = this.f7576a.getPaddingStart();
        int paddingTop = this.f7576a.getPaddingTop();
        int paddingEnd = this.f7576a.getPaddingEnd();
        int paddingBottom = this.f7576a.getPaddingBottom();
        if (typedArray.hasValue(u8.l.f28899q2)) {
            v();
        } else {
            M();
        }
        this.f7576a.setPaddingRelative(paddingStart + this.f7581f, paddingTop + this.f7583h, paddingEnd + this.f7582g, paddingBottom + this.f7584i);
    }

    void u(int i10) {
        if (g() != null) {
            g().setTint(i10);
        }
    }

    void v() {
        this.f7593r = true;
        this.f7576a.setSupportBackgroundTintList(this.f7588m);
        this.f7576a.setSupportBackgroundTintMode(this.f7587l);
    }

    void w(boolean z10) {
        this.f7595t = z10;
    }

    void x(int i10) {
        if (this.f7594s && this.f7585j == i10) {
            return;
        }
        this.f7585j = i10;
        this.f7594s = true;
        D(this.f7577b.x(i10));
    }

    void y(h.d dVar) {
        this.f7580e = dVar;
        h hVarG = g();
        if (hVarG != null) {
            hVarG.e0(dVar);
        }
    }

    void z(j jVar) {
        this.f7579d = jVar;
        if (this.f7578c != null) {
            N();
        }
    }
}
