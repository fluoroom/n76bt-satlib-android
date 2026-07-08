package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.ActivityChooserView;
import com.google.android.material.internal.j;
import com.google.android.material.internal.m;
import com.google.android.material.internal.p;
import e0.b;
import j9.c;
import j9.d;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import m9.h;
import u8.l;
import v8.f;

/* JADX INFO: loaded from: classes3.dex */
public class a extends h implements b, Drawable.Callback, j.b {

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private static final int[] f7686c1 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private static final ShapeDrawable f7687d1 = new ShapeDrawable(new OvalShape());
    private final Paint A0;
    private final Paint B0;
    private final Paint.FontMetrics C0;
    private final RectF D0;
    private final PointF E0;
    private final Path F0;
    private final j G0;
    private int H0;
    private int I0;
    private int J0;
    private int K0;
    private int L0;
    private int M0;
    private boolean N0;
    private int O0;
    private int P0;
    private ColorFilter Q0;
    private PorterDuffColorFilter R0;
    private ColorStateList S;
    private ColorStateList S0;
    private ColorStateList T;
    private PorterDuff.Mode T0;
    private float U;
    private int[] U0;
    private float V;
    private boolean V0;
    private ColorStateList W;
    private ColorStateList W0;
    private float X;
    private WeakReference X0;
    private ColorStateList Y;
    private TextUtils.TruncateAt Y0;
    private CharSequence Z;
    private boolean Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f7688a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f7689a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Drawable f7690b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private boolean f7691b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private ColorStateList f7692c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f7693d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f7694e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f7695f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private Drawable f7696g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Drawable f7697h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private ColorStateList f7698i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f7699j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private CharSequence f7700k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f7701l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f7702m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private Drawable f7703n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private ColorStateList f7704o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private f f7705p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private f f7706q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f7707r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private float f7708s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private float f7709t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private float f7710u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private float f7711v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private float f7712w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private float f7713x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private float f7714y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final Context f7715z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0114a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.V = -1.0f;
        this.A0 = new Paint(1);
        this.C0 = new Paint.FontMetrics();
        this.D0 = new RectF();
        this.E0 = new PointF();
        this.F0 = new Path();
        this.P0 = 255;
        this.T0 = PorterDuff.Mode.SRC_IN;
        this.X0 = new WeakReference(null);
        Q(context);
        this.f7715z0 = context;
        j jVar = new j(this);
        this.G0 = jVar;
        this.Z = "";
        jVar.g().density = context.getResources().getDisplayMetrics().density;
        this.B0 = null;
        int[] iArr = f7686c1;
        setState(iArr);
        u2(iArr);
        this.Z0 = true;
        f7687d1.setTint(-1);
    }

    private float A0() {
        this.G0.g().getFontMetrics(this.C0);
        Paint.FontMetrics fontMetrics = this.C0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean A1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean B1(d dVar) {
        return (dVar == null || dVar.j() == null || !dVar.j().isStateful()) ? false : true;
    }

    private boolean C0() {
        return this.f7702m0 && this.f7703n0 != null && this.f7701l0;
    }

    private void C1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayI = m.i(this.f7715z0, attributeSet, l.f28969y0, i10, i11, new int[0]);
        this.f7691b1 = typedArrayI.hasValue(l.f28844k1);
        k2(c.a(this.f7715z0, typedArrayI, l.X0));
        O1(c.a(this.f7715z0, typedArrayI, l.K0));
        c2(typedArrayI.getDimension(l.S0, 0.0f));
        int i12 = l.L0;
        if (typedArrayI.hasValue(i12)) {
            Q1(typedArrayI.getDimension(i12, 0.0f));
        }
        g2(c.a(this.f7715z0, typedArrayI, l.V0));
        i2(typedArrayI.getDimension(l.W0, 0.0f));
        H2(c.a(this.f7715z0, typedArrayI, l.f28835j1));
        M2(typedArrayI.getText(l.E0));
        d dVarH = c.h(this.f7715z0, typedArrayI, l.f28978z0);
        dVarH.o(typedArrayI.getDimension(l.A0, dVarH.k()));
        if (Build.VERSION.SDK_INT < 23) {
            dVarH.n(c.a(this.f7715z0, typedArrayI, l.B0));
        }
        N2(dVarH);
        int i13 = typedArrayI.getInt(l.C0, 0);
        if (i13 == 1) {
            z2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            z2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            z2(TextUtils.TruncateAt.END);
        }
        b2(typedArrayI.getBoolean(l.R0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            b2(typedArrayI.getBoolean(l.O0, false));
        }
        U1(c.e(this.f7715z0, typedArrayI, l.N0));
        int i14 = l.Q0;
        if (typedArrayI.hasValue(i14)) {
            Y1(c.a(this.f7715z0, typedArrayI, i14));
        }
        W1(typedArrayI.getDimension(l.P0, -1.0f));
        x2(typedArrayI.getBoolean(l.f28790e1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            x2(typedArrayI.getBoolean(l.Z0, false));
        }
        l2(c.e(this.f7715z0, typedArrayI, l.Y0));
        v2(c.a(this.f7715z0, typedArrayI, l.f28781d1));
        q2(typedArrayI.getDimension(l.f28763b1, 0.0f));
        G1(typedArrayI.getBoolean(l.F0, false));
        N1(typedArrayI.getBoolean(l.J0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            N1(typedArrayI.getBoolean(l.H0, false));
        }
        I1(c.e(this.f7715z0, typedArrayI, l.G0));
        int i15 = l.I0;
        if (typedArrayI.hasValue(i15)) {
            K1(c.a(this.f7715z0, typedArrayI, i15));
        }
        K2(f.b(this.f7715z0, typedArrayI, l.f28853l1));
        A2(f.b(this.f7715z0, typedArrayI, l.f28808g1));
        e2(typedArrayI.getDimension(l.U0, 0.0f));
        E2(typedArrayI.getDimension(l.f28826i1, 0.0f));
        C2(typedArrayI.getDimension(l.f28817h1, 0.0f));
        S2(typedArrayI.getDimension(l.f28871n1, 0.0f));
        P2(typedArrayI.getDimension(l.f28862m1, 0.0f));
        s2(typedArrayI.getDimension(l.f28772c1, 0.0f));
        n2(typedArrayI.getDimension(l.f28753a1, 0.0f));
        S1(typedArrayI.getDimension(l.M0, 0.0f));
        G2(typedArrayI.getDimensionPixelSize(l.D0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
        typedArrayI.recycle();
    }

    public static a D0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.C1(attributeSet, i10, i11);
        return aVar;
    }

    private void E0(Canvas canvas, Rect rect) {
        if (W2()) {
            t0(rect, this.D0);
            RectF rectF = this.D0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f7703n0.setBounds(0, 0, (int) this.D0.width(), (int) this.D0.height());
            this.f7703n0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private boolean E1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.S;
        int iQ = q(colorStateList != null ? colorStateList.getColorForState(iArr, this.H0) : 0);
        boolean state = true;
        if (this.H0 != iQ) {
            this.H0 = iQ;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.T;
        int iQ2 = q(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.I0) : 0);
        if (this.I0 != iQ2) {
            this.I0 = iQ2;
            zOnStateChange = true;
        }
        int iJ = c9.a.j(iQ, iQ2);
        if ((this.J0 != iJ) | (B() == null)) {
            this.J0 = iJ;
            c0(ColorStateList.valueOf(iJ));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.W;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.K0) : 0;
        if (this.K0 != colorForState) {
            this.K0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.W0 == null || !k9.a.f(iArr)) ? 0 : this.W0.getColorForState(iArr, this.L0);
        if (this.L0 != colorForState2) {
            this.L0 = colorForState2;
            if (this.V0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.G0.e() == null || this.G0.e().j() == null) ? 0 : this.G0.e().j().getColorForState(iArr, this.M0);
        if (this.M0 != colorForState3) {
            this.M0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z11 = v1(getState(), R.attr.state_checked) && this.f7701l0;
        if (this.N0 == z11 || this.f7703n0 == null) {
            z10 = false;
        } else {
            float fU0 = u0();
            this.N0 = z11;
            if (fU0 != u0()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                zOnStateChange = true;
                z10 = false;
            }
        }
        ColorStateList colorStateList4 = this.S0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.O0) : 0;
        if (this.O0 != colorForState4) {
            this.O0 = colorForState4;
            this.R0 = com.google.android.material.drawable.c.l(this, this.S0, this.T0);
        } else {
            state = zOnStateChange;
        }
        if (A1(this.f7690b0)) {
            state |= this.f7690b0.setState(iArr);
        }
        if (A1(this.f7703n0)) {
            state |= this.f7703n0.setState(iArr);
        }
        if (A1(this.f7696g0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f7696g0.setState(iArr3);
        }
        if (A1(this.f7697h0)) {
            state |= this.f7697h0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            D1();
        }
        return state;
    }

    private void F0(Canvas canvas, Rect rect) {
        if (this.f7691b1) {
            return;
        }
        this.A0.setColor(this.I0);
        this.A0.setStyle(Paint.Style.FILL);
        this.A0.setColorFilter(t1());
        this.D0.set(rect);
        canvas.drawRoundRect(this.D0, Q0(), Q0(), this.A0);
    }

    private void G0(Canvas canvas, Rect rect) {
        if (X2()) {
            t0(rect, this.D0);
            RectF rectF = this.D0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f7690b0.setBounds(0, 0, (int) this.D0.width(), (int) this.D0.height());
            this.f7690b0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void H0(Canvas canvas, Rect rect) {
        if (this.X <= 0.0f || this.f7691b1) {
            return;
        }
        this.A0.setColor(this.K0);
        this.A0.setStyle(Paint.Style.STROKE);
        if (!this.f7691b1) {
            this.A0.setColorFilter(t1());
        }
        RectF rectF = this.D0;
        float f10 = rect.left;
        float f11 = this.X;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.V - (this.X / 2.0f);
        canvas.drawRoundRect(this.D0, f12, f12, this.A0);
    }

    private void I0(Canvas canvas, Rect rect) {
        if (this.f7691b1) {
            return;
        }
        this.A0.setColor(this.H0);
        this.A0.setStyle(Paint.Style.FILL);
        this.D0.set(rect);
        canvas.drawRoundRect(this.D0, Q0(), Q0(), this.A0);
    }

    private void J0(Canvas canvas, Rect rect) {
        if (Y2()) {
            w0(rect, this.D0);
            RectF rectF = this.D0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f7696g0.setBounds(0, 0, (int) this.D0.width(), (int) this.D0.height());
            this.f7697h0.setBounds(this.f7696g0.getBounds());
            this.f7697h0.jumpToCurrentState();
            this.f7697h0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void K0(Canvas canvas, Rect rect) {
        this.A0.setColor(this.L0);
        this.A0.setStyle(Paint.Style.FILL);
        this.D0.set(rect);
        if (!this.f7691b1) {
            canvas.drawRoundRect(this.D0, Q0(), Q0(), this.A0);
        } else {
            l(new RectF(rect), this.F0);
            super.u(canvas, this.A0, this.F0, x());
        }
    }

    private void L0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.B0;
        if (paint != null) {
            paint.setColor(d0.a.k(-16777216, 127));
            canvas.drawRect(rect, this.B0);
            if (X2() || W2()) {
                t0(rect, this.D0);
                canvas.drawRect(this.D0, this.B0);
            }
            if (this.Z != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.B0);
            } else {
                canvas2 = canvas;
            }
            if (Y2()) {
                w0(rect, this.D0);
                canvas2.drawRect(this.D0, this.B0);
            }
            this.B0.setColor(d0.a.k(-65536, 127));
            v0(rect, this.D0);
            canvas2.drawRect(this.D0, this.B0);
            this.B0.setColor(d0.a.k(-16711936, 127));
            x0(rect, this.D0);
            canvas2.drawRect(this.D0, this.B0);
        }
    }

    private void M0(Canvas canvas, Rect rect) {
        if (this.Z != null) {
            Paint.Align alignB0 = B0(rect, this.E0);
            z0(rect, this.D0);
            if (this.G0.e() != null) {
                this.G0.g().drawableState = getState();
                this.G0.n(this.f7715z0);
            }
            this.G0.g().setTextAlign(alignB0);
            int iSave = 0;
            boolean z10 = Math.round(this.G0.h(p1().toString())) > Math.round(this.D0.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.D0);
            }
            CharSequence charSequenceEllipsize = this.Z;
            if (z10 && this.Y0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.G0.g(), this.D0.width(), this.Y0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.E0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.G0.g());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean W2() {
        return this.f7702m0 && this.f7703n0 != null && this.N0;
    }

    private boolean X2() {
        return this.f7688a0 && this.f7690b0 != null;
    }

    private boolean Y2() {
        return this.f7695f0 && this.f7696g0 != null;
    }

    private void Z2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void a3() {
        this.W0 = this.V0 ? k9.a.e(this.Y) : null;
    }

    private void b3() {
        this.f7697h0 = new RippleDrawable(k9.a.e(n1()), this.f7696g0, f7687d1);
    }

    private float h1() {
        Drawable drawable = this.N0 ? this.f7703n0 : this.f7690b0;
        float fCeil = this.f7693d0;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(p.c(this.f7715z0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float i1() {
        Drawable drawable = this.N0 ? this.f7703n0 : this.f7690b0;
        float f10 = this.f7693d0;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    private void k2(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            onStateChange(getState());
        }
    }

    private void s0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        e0.a.m(drawable, e0.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f7696g0) {
            if (drawable.isStateful()) {
                drawable.setState(e1());
            }
            drawable.setTintList(this.f7698i0);
            return;
        }
        Drawable drawable2 = this.f7690b0;
        if (drawable == drawable2 && this.f7694e0) {
            drawable2.setTintList(this.f7692c0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void t0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (X2() || W2()) {
            float f10 = this.f7707r0 + this.f7708s0;
            float fI1 = i1();
            if (e0.a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + fI1;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - fI1;
            }
            float fH1 = h1();
            float fExactCenterY = rect.exactCenterY() - (fH1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fH1;
        }
    }

    private ColorFilter t1() {
        ColorFilter colorFilter = this.Q0;
        return colorFilter != null ? colorFilter : this.R0;
    }

    private void v0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (Y2()) {
            float f10 = this.f7714y0 + this.f7713x0 + this.f7699j0 + this.f7712w0 + this.f7711v0;
            if (e0.a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private static boolean v1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void w0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Y2()) {
            float f10 = this.f7714y0 + this.f7713x0;
            if (e0.a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f7699j0;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f7699j0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.f7699j0;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void x0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Y2()) {
            float f10 = this.f7714y0 + this.f7713x0 + this.f7699j0 + this.f7712w0 + this.f7711v0;
            if (e0.a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void z0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.Z != null) {
            float fU0 = this.f7707r0 + u0() + this.f7710u0;
            float fY0 = this.f7714y0 + y0() + this.f7711v0;
            if (e0.a.f(this) == 0) {
                rectF.left = rect.left + fU0;
                rectF.right = rect.right - fY0;
            } else {
                rectF.left = rect.left + fY0;
                rectF.right = rect.right - fU0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean z1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public void A2(f fVar) {
        this.f7706q0 = fVar;
    }

    Paint.Align B0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.Z != null) {
            float fU0 = this.f7707r0 + u0() + this.f7710u0;
            if (e0.a.f(this) == 0) {
                pointF.x = rect.left + fU0;
            } else {
                pointF.x = rect.right - fU0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - A0();
        }
        return align;
    }

    public void B2(int i10) {
        A2(f.c(this.f7715z0, i10));
    }

    public void C2(float f10) {
        if (this.f7709t0 != f10) {
            float fU0 = u0();
            this.f7709t0 = f10;
            float fU02 = u0();
            invalidateSelf();
            if (fU0 != fU02) {
                D1();
            }
        }
    }

    protected void D1() {
        InterfaceC0114a interfaceC0114a = (InterfaceC0114a) this.X0.get();
        if (interfaceC0114a != null) {
            interfaceC0114a.a();
        }
    }

    public void D2(int i10) {
        C2(this.f7715z0.getResources().getDimension(i10));
    }

    public void E2(float f10) {
        if (this.f7708s0 != f10) {
            float fU0 = u0();
            this.f7708s0 = f10;
            float fU02 = u0();
            invalidateSelf();
            if (fU0 != fU02) {
                D1();
            }
        }
    }

    boolean F1(boolean z10) {
        if (this.f7696g0 != null) {
            return u2(z10 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : f7686c1);
        }
        return false;
    }

    public void F2(int i10) {
        E2(this.f7715z0.getResources().getDimension(i10));
    }

    public void G1(boolean z10) {
        if (this.f7701l0 != z10) {
            this.f7701l0 = z10;
            float fU0 = u0();
            if (!z10 && this.N0) {
                this.N0 = false;
            }
            float fU02 = u0();
            invalidateSelf();
            if (fU0 != fU02) {
                D1();
            }
        }
    }

    public void G2(int i10) {
        this.f7689a1 = i10;
    }

    public void H1(int i10) {
        G1(this.f7715z0.getResources().getBoolean(i10));
    }

    public void H2(ColorStateList colorStateList) {
        if (this.Y != colorStateList) {
            this.Y = colorStateList;
            a3();
            onStateChange(getState());
        }
    }

    public void I1(Drawable drawable) {
        if (this.f7703n0 != drawable) {
            float fU0 = u0();
            this.f7703n0 = drawable;
            float fU02 = u0();
            Z2(this.f7703n0);
            s0(this.f7703n0);
            invalidateSelf();
            if (fU0 != fU02) {
                D1();
            }
        }
    }

    public void I2(int i10) {
        H2(i.a.a(this.f7715z0, i10));
    }

    public void J1(int i10) {
        I1(i.a.b(this.f7715z0, i10));
    }

    void J2(boolean z10) {
        this.Z0 = z10;
    }

    public void K1(ColorStateList colorStateList) {
        if (this.f7704o0 != colorStateList) {
            this.f7704o0 = colorStateList;
            if (C0()) {
                this.f7703n0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void K2(f fVar) {
        this.f7705p0 = fVar;
    }

    public void L1(int i10) {
        K1(i.a.a(this.f7715z0, i10));
    }

    public void L2(int i10) {
        K2(f.c(this.f7715z0, i10));
    }

    public void M1(int i10) {
        N1(this.f7715z0.getResources().getBoolean(i10));
    }

    public void M2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.Z, charSequence)) {
            return;
        }
        this.Z = charSequence;
        this.G0.m(true);
        invalidateSelf();
        D1();
    }

    public Drawable N0() {
        return this.f7703n0;
    }

    public void N1(boolean z10) {
        if (this.f7702m0 != z10) {
            boolean zW2 = W2();
            this.f7702m0 = z10;
            boolean zW22 = W2();
            if (zW2 != zW22) {
                if (zW22) {
                    s0(this.f7703n0);
                } else {
                    Z2(this.f7703n0);
                }
                invalidateSelf();
                D1();
            }
        }
    }

    public void N2(d dVar) {
        this.G0.k(dVar, this.f7715z0);
    }

    public ColorStateList O0() {
        return this.f7704o0;
    }

    public void O1(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            onStateChange(getState());
        }
    }

    public void O2(int i10) {
        N2(new d(this.f7715z0, i10));
    }

    public ColorStateList P0() {
        return this.T;
    }

    public void P1(int i10) {
        O1(i.a.a(this.f7715z0, i10));
    }

    public void P2(float f10) {
        if (this.f7711v0 != f10) {
            this.f7711v0 = f10;
            invalidateSelf();
            D1();
        }
    }

    public float Q0() {
        return this.f7691b1 ? J() : this.V;
    }

    public void Q1(float f10) {
        if (this.V != f10) {
            this.V = f10;
            setShapeAppearanceModel(H().x(f10));
        }
    }

    public void Q2(int i10) {
        P2(this.f7715z0.getResources().getDimension(i10));
    }

    public float R0() {
        return this.f7714y0;
    }

    public void R1(int i10) {
        Q1(this.f7715z0.getResources().getDimension(i10));
    }

    public void R2(float f10) {
        d dVarQ1 = q1();
        if (dVarQ1 != null) {
            dVarQ1.o(f10);
            this.G0.g().setTextSize(f10);
            a();
        }
    }

    public Drawable S0() {
        Drawable drawable = this.f7690b0;
        if (drawable != null) {
            return e0.a.q(drawable);
        }
        return null;
    }

    public void S1(float f10) {
        if (this.f7714y0 != f10) {
            this.f7714y0 = f10;
            invalidateSelf();
            D1();
        }
    }

    public void S2(float f10) {
        if (this.f7710u0 != f10) {
            this.f7710u0 = f10;
            invalidateSelf();
            D1();
        }
    }

    public float T0() {
        return this.f7693d0;
    }

    public void T1(int i10) {
        S1(this.f7715z0.getResources().getDimension(i10));
    }

    public void T2(int i10) {
        S2(this.f7715z0.getResources().getDimension(i10));
    }

    public ColorStateList U0() {
        return this.f7692c0;
    }

    public void U1(Drawable drawable) {
        Drawable drawableS0 = S0();
        if (drawableS0 != drawable) {
            float fU0 = u0();
            this.f7690b0 = drawable != null ? e0.a.r(drawable).mutate() : null;
            float fU02 = u0();
            Z2(drawableS0);
            if (X2()) {
                s0(this.f7690b0);
            }
            invalidateSelf();
            if (fU0 != fU02) {
                D1();
            }
        }
    }

    public void U2(boolean z10) {
        if (this.V0 != z10) {
            this.V0 = z10;
            a3();
            onStateChange(getState());
        }
    }

    public float V0() {
        return this.U;
    }

    public void V1(int i10) {
        U1(i.a.b(this.f7715z0, i10));
    }

    boolean V2() {
        return this.Z0;
    }

    public float W0() {
        return this.f7707r0;
    }

    public void W1(float f10) {
        if (this.f7693d0 != f10) {
            float fU0 = u0();
            this.f7693d0 = f10;
            float fU02 = u0();
            invalidateSelf();
            if (fU0 != fU02) {
                D1();
            }
        }
    }

    public ColorStateList X0() {
        return this.W;
    }

    public void X1(int i10) {
        W1(this.f7715z0.getResources().getDimension(i10));
    }

    public float Y0() {
        return this.X;
    }

    public void Y1(ColorStateList colorStateList) {
        this.f7694e0 = true;
        if (this.f7692c0 != colorStateList) {
            this.f7692c0 = colorStateList;
            if (X2()) {
                this.f7690b0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public Drawable Z0() {
        Drawable drawable = this.f7696g0;
        if (drawable != null) {
            return e0.a.q(drawable);
        }
        return null;
    }

    public void Z1(int i10) {
        Y1(i.a.a(this.f7715z0, i10));
    }

    @Override // com.google.android.material.internal.j.b
    public void a() {
        D1();
        invalidateSelf();
    }

    public CharSequence a1() {
        return this.f7700k0;
    }

    public void a2(int i10) {
        b2(this.f7715z0.getResources().getBoolean(i10));
    }

    public float b1() {
        return this.f7713x0;
    }

    public void b2(boolean z10) {
        if (this.f7688a0 != z10) {
            boolean zX2 = X2();
            this.f7688a0 = z10;
            boolean zX22 = X2();
            if (zX2 != zX22) {
                if (zX22) {
                    s0(this.f7690b0);
                } else {
                    Z2(this.f7690b0);
                }
                invalidateSelf();
                D1();
            }
        }
    }

    public float c1() {
        return this.f7699j0;
    }

    public void c2(float f10) {
        if (this.U != f10) {
            this.U = f10;
            invalidateSelf();
            D1();
        }
    }

    public float d1() {
        return this.f7712w0;
    }

    public void d2(int i10) {
        c2(this.f7715z0.getResources().getDimension(i10));
    }

    @Override // m9.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iA;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.P0;
        if (i10 < 255) {
            canvas2 = canvas;
            iA = y8.a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
        } else {
            canvas2 = canvas;
            iA = 0;
        }
        I0(canvas2, bounds);
        F0(canvas2, bounds);
        if (this.f7691b1) {
            super.draw(canvas2);
        }
        H0(canvas2, bounds);
        K0(canvas2, bounds);
        G0(canvas2, bounds);
        E0(canvas2, bounds);
        if (this.Z0) {
            M0(canvas2, bounds);
        }
        J0(canvas2, bounds);
        L0(canvas2, bounds);
        if (this.P0 < 255) {
            canvas2.restoreToCount(iA);
        }
    }

    public int[] e1() {
        return this.U0;
    }

    public void e2(float f10) {
        if (this.f7707r0 != f10) {
            this.f7707r0 = f10;
            invalidateSelf();
            D1();
        }
    }

    public ColorStateList f1() {
        return this.f7698i0;
    }

    public void f2(int i10) {
        e2(this.f7715z0.getResources().getDimension(i10));
    }

    public void g1(RectF rectF) {
        x0(getBounds(), rectF);
    }

    public void g2(ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            if (this.f7691b1) {
                k0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // m9.h, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.P0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.Q0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.U;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f7707r0 + u0() + this.f7710u0 + this.G0.h(p1().toString()) + this.f7711v0 + y0() + this.f7714y0), this.f7689a1);
    }

    @Override // m9.h, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // m9.h, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.f7691b1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.V);
        } else {
            outline.setRoundRect(bounds, this.V);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public void h2(int i10) {
        g2(i.a.a(this.f7715z0, i10));
    }

    public void i2(float f10) {
        if (this.X != f10) {
            this.X = f10;
            this.A0.setStrokeWidth(f10);
            if (this.f7691b1) {
                super.l0(f10);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // m9.h, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (z1(this.S) || z1(this.T) || z1(this.W)) {
            return true;
        }
        return (this.V0 && z1(this.W0)) || B1(this.G0.e()) || C0() || A1(this.f7690b0) || A1(this.f7703n0) || z1(this.S0);
    }

    public TextUtils.TruncateAt j1() {
        return this.Y0;
    }

    public void j2(int i10) {
        i2(this.f7715z0.getResources().getDimension(i10));
    }

    public f k1() {
        return this.f7706q0;
    }

    public float l1() {
        return this.f7709t0;
    }

    public void l2(Drawable drawable) {
        Drawable drawableZ0 = Z0();
        if (drawableZ0 != drawable) {
            float fY0 = y0();
            this.f7696g0 = drawable != null ? e0.a.r(drawable).mutate() : null;
            b3();
            float fY02 = y0();
            Z2(drawableZ0);
            if (Y2()) {
                s0(this.f7696g0);
            }
            invalidateSelf();
            if (fY0 != fY02) {
                D1();
            }
        }
    }

    public float m1() {
        return this.f7708s0;
    }

    public void m2(CharSequence charSequence) {
        if (this.f7700k0 != charSequence) {
            this.f7700k0 = k0.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public ColorStateList n1() {
        return this.Y;
    }

    public void n2(float f10) {
        if (this.f7713x0 != f10) {
            this.f7713x0 = f10;
            invalidateSelf();
            if (Y2()) {
                D1();
            }
        }
    }

    public f o1() {
        return this.f7705p0;
    }

    public void o2(int i10) {
        n2(this.f7715z0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (X2()) {
            zOnLayoutDirectionChanged |= e0.a.m(this.f7690b0, i10);
        }
        if (W2()) {
            zOnLayoutDirectionChanged |= e0.a.m(this.f7703n0, i10);
        }
        if (Y2()) {
            zOnLayoutDirectionChanged |= e0.a.m(this.f7696g0, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (X2()) {
            zOnLevelChange |= this.f7690b0.setLevel(i10);
        }
        if (W2()) {
            zOnLevelChange |= this.f7703n0.setLevel(i10);
        }
        if (Y2()) {
            zOnLevelChange |= this.f7696g0.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // m9.h, android.graphics.drawable.Drawable, com.google.android.material.internal.j.b
    public boolean onStateChange(int[] iArr) {
        if (this.f7691b1) {
            super.onStateChange(iArr);
        }
        return E1(iArr, e1());
    }

    public CharSequence p1() {
        return this.Z;
    }

    public void p2(int i10) {
        l2(i.a.b(this.f7715z0, i10));
    }

    public d q1() {
        return this.G0.e();
    }

    public void q2(float f10) {
        if (this.f7699j0 != f10) {
            this.f7699j0 = f10;
            invalidateSelf();
            if (Y2()) {
                D1();
            }
        }
    }

    public float r1() {
        return this.f7711v0;
    }

    public void r2(int i10) {
        q2(this.f7715z0.getResources().getDimension(i10));
    }

    public float s1() {
        return this.f7710u0;
    }

    public void s2(float f10) {
        if (this.f7712w0 != f10) {
            this.f7712w0 = f10;
            invalidateSelf();
            if (Y2()) {
                D1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // m9.h, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.P0 != i10) {
            this.P0 = i10;
            invalidateSelf();
        }
    }

    @Override // m9.h, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.Q0 != colorFilter) {
            this.Q0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // m9.h, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.S0 != colorStateList) {
            this.S0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // m9.h, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.T0 != mode) {
            this.T0 = mode;
            this.R0 = com.google.android.material.drawable.c.l(this, this.S0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (X2()) {
            visible |= this.f7690b0.setVisible(z10, z11);
        }
        if (W2()) {
            visible |= this.f7703n0.setVisible(z10, z11);
        }
        if (Y2()) {
            visible |= this.f7696g0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t2(int i10) {
        s2(this.f7715z0.getResources().getDimension(i10));
    }

    float u0() {
        if (X2() || W2()) {
            return this.f7708s0 + i1() + this.f7709t0;
        }
        return 0.0f;
    }

    public boolean u1() {
        return this.V0;
    }

    public boolean u2(int[] iArr) {
        if (Arrays.equals(this.U0, iArr)) {
            return false;
        }
        this.U0 = iArr;
        if (Y2()) {
            return E1(getState(), iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v2(ColorStateList colorStateList) {
        if (this.f7698i0 != colorStateList) {
            this.f7698i0 = colorStateList;
            if (Y2()) {
                this.f7696g0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public boolean w1() {
        return this.f7701l0;
    }

    public void w2(int i10) {
        v2(i.a.a(this.f7715z0, i10));
    }

    public boolean x1() {
        return A1(this.f7696g0);
    }

    public void x2(boolean z10) {
        if (this.f7695f0 != z10) {
            boolean zY2 = Y2();
            this.f7695f0 = z10;
            boolean zY22 = Y2();
            if (zY2 != zY22) {
                if (zY22) {
                    s0(this.f7696g0);
                } else {
                    Z2(this.f7696g0);
                }
                invalidateSelf();
                D1();
            }
        }
    }

    float y0() {
        if (Y2()) {
            return this.f7712w0 + this.f7699j0 + this.f7713x0;
        }
        return 0.0f;
    }

    public boolean y1() {
        return this.f7695f0;
    }

    public void y2(InterfaceC0114a interfaceC0114a) {
        this.X0 = new WeakReference(interfaceC0114a);
    }

    public void z2(TextUtils.TruncateAt truncateAt) {
        this.Y0 = truncateAt;
    }
}
