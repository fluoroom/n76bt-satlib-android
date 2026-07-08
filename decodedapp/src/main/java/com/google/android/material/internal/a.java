package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import com.google.android.material.internal.h;
import j9.a;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private Typeface D;
    private j9.a E;
    private j9.a F;
    private CharSequence H;
    private CharSequence I;
    private boolean J;
    private float L;
    private float M;
    private float N;
    private float O;
    private float P;
    private int Q;
    private int R;
    private int[] S;
    private boolean T;
    private final TextPaint U;
    private final TextPaint V;
    private TimeInterpolator W;
    private TimeInterpolator X;
    private float Y;
    private float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f7945a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f7946a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f7947b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private ColorStateList f7948b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7949c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private float f7950c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f7951d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f7952d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f7953e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f7954e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7955f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private ColorStateList f7956f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f7957g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private float f7958g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f7959h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f7960h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Rect f7961i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f7962i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f7963j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private StaticLayout f7964j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private float f7966k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f7968l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f7970m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private CharSequence f7972n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f7973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f7975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f7977q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f7979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f7981s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f7983t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private i f7984t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f7985u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f7987v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f7989w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f7990w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Typeface f7991x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Typeface f7992y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Typeface f7993z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7965k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f7967l = 16;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f7969m = 15.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f7971n = 15.0f;
    private TextUtils.TruncateAt G = TextUtils.TruncateAt.END;
    private boolean K = true;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f7974o0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f7976p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f7978q0 = 0.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f7980r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f7982s0 = h.f8003o;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f7986u0 = -1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f7988v0 = -1;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0119a implements a.InterfaceC0238a {
        C0119a() {
        }

        @Override // j9.a.InterfaceC0238a
        public void a(Typeface typeface) {
            a.this.Y(typeface);
        }
    }

    public a(View view) {
        this.f7945a = view;
        TextPaint textPaint = new TextPaint(129);
        this.U = textPaint;
        this.V = new TextPaint(textPaint);
        this.f7959h = new Rect();
        this.f7957g = new Rect();
        this.f7963j = new RectF();
        this.f7953e = e();
        L(view.getContext().getResources().getConfiguration());
    }

    private Layout.Alignment C() {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f7965k, this.J ? 1 : 0) & 7;
        return absoluteGravity != 1 ? absoluteGravity != 5 ? this.J ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.J ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private void D(TextPaint textPaint) {
        textPaint.setTextSize(this.f7971n);
        textPaint.setTypeface(this.f7991x);
        textPaint.setLetterSpacing(this.f7958g0);
    }

    private void E(TextPaint textPaint) {
        textPaint.setTextSize(this.f7969m);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.f7960h0);
    }

    private void F(float f10) {
        if (this.f7949c) {
            this.f7963j.set(f10 < this.f7953e ? this.f7957g : this.f7959h);
            return;
        }
        this.f7963j.left = K(this.f7957g.left, this.f7959h.left, f10, this.W);
        this.f7963j.top = K(this.f7979r, this.f7981s, f10, this.W);
        this.f7963j.right = K(this.f7957g.right, this.f7959h.right, f10, this.W);
        this.f7963j.bottom = K(this.f7957g.bottom, this.f7959h.bottom, f10, this.W);
    }

    private static boolean G(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean H() {
        return this.f7945a.getLayoutDirection() == 1;
    }

    private boolean J(CharSequence charSequence, boolean z10) {
        return (z10 ? k0.e.f18911d : k0.e.f18910c).isRtl(charSequence, 0, charSequence.length());
    }

    private static float K(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return v8.a.a(f10, f11, f12);
    }

    private float M(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean P(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private void V(float f10) {
        this.f7968l0 = f10;
        this.f7945a.postInvalidateOnAnimation();
    }

    private boolean Z(Typeface typeface) {
        j9.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f7993z == typeface) {
            return false;
        }
        this.f7993z = typeface;
        Typeface typefaceB = j9.h.b(this.f7945a.getContext().getResources().getConfiguration(), typeface);
        this.f7992y = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f7993z;
        }
        this.f7991x = typefaceB;
        return true;
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private void b(boolean z10) {
        float fM;
        i(1.0f, z10);
        if (this.I != null && this.f7964j0 != null) {
            this.f7972n0 = r0() ? TextUtils.ellipsize(this.I, this.U, this.f7964j0.getWidth(), this.G) : this.I;
        }
        CharSequence charSequence = this.f7972n0;
        if (charSequence != null) {
            this.f7966k0 = M(this.U, charSequence);
        } else {
            this.f7966k0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f7967l, this.J ? 1 : 0);
        Rect rect = this.f7961i;
        if (rect == null) {
            rect = this.f7959h;
        }
        int i10 = absoluteGravity & 112;
        if (i10 == 48) {
            this.f7981s = rect.top;
        } else if (i10 != 80) {
            this.f7981s = rect.centerY() - ((this.U.descent() - this.U.ascent()) / 2.0f);
        } else {
            this.f7981s = rect.bottom + this.U.ascent();
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f7985u = rect.centerX() - (this.f7966k0 / 2.0f);
        } else if (i11 != 5) {
            this.f7985u = rect.left;
        } else {
            this.f7985u = rect.right - this.f7966k0;
        }
        if (this.f7966k0 <= this.f7959h.width()) {
            float f10 = this.f7985u;
            float fMax = f10 + Math.max(0.0f, this.f7959h.left - f10);
            this.f7985u = fMax;
            this.f7985u = fMax + Math.min(0.0f, this.f7959h.right - (this.f7966k0 + fMax));
        }
        if (m() <= this.f7959h.height()) {
            float f11 = this.f7981s;
            float fMax2 = f11 + Math.max(0.0f, this.f7959h.top - f11);
            this.f7981s = fMax2;
            this.f7981s = fMax2 + Math.min(0.0f, this.f7959h.bottom - (q() + fMax2));
        }
        i(0.0f, z10);
        float height = this.f7964j0 != null ? r11.getHeight() : 0.0f;
        StaticLayout staticLayout = this.f7964j0;
        if (staticLayout == null || this.f7974o0 <= 1) {
            CharSequence charSequence2 = this.I;
            fM = charSequence2 != null ? M(this.U, charSequence2) : 0.0f;
        } else {
            fM = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.f7964j0;
        this.f7977q = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f7965k, this.J ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        if (i12 == 48) {
            this.f7979r = this.f7957g.top;
        } else if (i12 != 80) {
            this.f7979r = this.f7957g.centerY() - (height / 2.0f);
        } else {
            this.f7979r = (this.f7957g.bottom - height) + (this.f7990w0 ? this.U.descent() : 0.0f);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f7983t = this.f7957g.centerX() - (fM / 2.0f);
        } else if (i13 != 5) {
            this.f7983t = this.f7957g.left;
        } else {
            this.f7983t = this.f7957g.right - fM;
        }
        k0(this.f7947b);
    }

    private void c() {
        g(this.f7947b);
    }

    private float d(float f10) {
        float f11 = this.f7953e;
        return f10 <= f11 ? v8.a.b(1.0f, 0.0f, this.f7951d, f11, f10) : v8.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private float e() {
        float f10 = this.f7951d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean zH = H();
        return this.K ? J(charSequence, zH) : zH;
    }

    private void f0(float f10) {
        this.f7970m0 = f10;
        this.f7945a.postInvalidateOnAnimation();
    }

    private void g(float f10) {
        float f11;
        F(f10);
        if (!this.f7949c) {
            this.f7987v = K(this.f7983t, this.f7985u, f10, this.W);
            this.f7989w = K(this.f7979r, this.f7981s, f10, this.W);
            k0(f10);
            f11 = f10;
        } else if (f10 < this.f7953e) {
            this.f7987v = this.f7983t;
            this.f7989w = this.f7979r;
            k0(0.0f);
            f11 = 0.0f;
        } else {
            this.f7987v = this.f7985u;
            this.f7989w = this.f7981s - Math.max(0, this.f7955f);
            k0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = v8.a.f30493b;
        V(1.0f - K(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        f0(K(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f7975p != this.f7973o) {
            this.U.setColor(a(v(), t(), f11));
        } else {
            this.U.setColor(t());
        }
        float f12 = this.f7958g0;
        float f13 = this.f7960h0;
        if (f12 != f13) {
            this.U.setLetterSpacing(K(f13, f12, f10, timeInterpolator));
        } else {
            this.U.setLetterSpacing(f12);
        }
        this.N = K(this.f7950c0, this.Y, f10, null);
        this.O = K(this.f7952d0, this.Z, f10, null);
        this.P = K(this.f7954e0, this.f7946a0, f10, null);
        int iA = a(u(this.f7956f0), u(this.f7948b0), f10);
        this.Q = iA;
        this.U.setShadowLayer(this.N, this.O, this.P, iA);
        if (this.f7949c) {
            this.U.setAlpha((int) (d(f10) * this.U.getAlpha()));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.U;
                textPaint.setShadowLayer(this.N, this.O, this.P, c9.a.a(this.Q, textPaint.getAlpha()));
            }
        }
        this.f7945a.postInvalidateOnAnimation();
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z10) {
        Typeface typeface;
        float f11;
        float f12;
        if (this.H == null) {
            return;
        }
        float fWidth = this.f7959h.width();
        float fWidth2 = this.f7957g.width();
        if (G(f10, 1.0f)) {
            f11 = r0() ? this.f7971n : this.f7969m;
            f12 = r0() ? this.f7958g0 : this.f7960h0;
            this.L = r0() ? 1.0f : K(this.f7969m, this.f7971n, f10, this.X) / this.f7969m;
            if (!r0()) {
                fWidth = fWidth2;
            }
            typeface = this.f7991x;
            fWidth2 = fWidth;
        } else {
            float f13 = this.f7969m;
            float f14 = this.f7960h0;
            typeface = this.A;
            if (G(f10, 0.0f)) {
                this.L = 1.0f;
            } else {
                this.L = K(this.f7969m, this.f7971n, f10, this.X) / this.f7969m;
            }
            float f15 = this.f7971n / this.f7969m;
            float f16 = fWidth2 * f15;
            if (!z10 && !this.f7949c && f16 > fWidth && r0()) {
                fWidth2 = Math.min(fWidth / f15, fWidth2);
            }
            f11 = f13;
            f12 = f14;
        }
        int i10 = f10 < 0.5f ? this.f7974o0 : this.f7976p0;
        if (fWidth2 > 0.0f) {
            boolean z11 = this.M != f11;
            boolean z12 = this.f7962i0 != f12;
            boolean z13 = this.D != typeface;
            StaticLayout staticLayout = this.f7964j0;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || (this.R != i10) || this.T;
            this.M = f11;
            this.f7962i0 = f12;
            this.D = typeface;
            this.T = false;
            this.R = i10;
            this.U.setLinearText(this.L != 1.0f);
            z = z14;
        }
        if (this.I == null || z) {
            this.U.setTextSize(this.M);
            this.U.setTypeface(this.D);
            this.U.setLetterSpacing(this.f7962i0);
            this.J = f(this.H);
            StaticLayout staticLayoutJ = j(q0() ? i10 : 1, this.U, this.H, fWidth2 * (r0() ? 1.0f : this.L), this.J);
            this.f7964j0 = staticLayoutJ;
            this.I = staticLayoutJ.getText();
        }
    }

    private boolean i0(Typeface typeface) {
        j9.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.C == typeface) {
            return false;
        }
        this.C = typeface;
        Typeface typefaceB = j9.h.b(this.f7945a.getContext().getResources().getConfiguration(), typeface);
        this.B = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.C;
        }
        this.A = typefaceB;
        return true;
    }

    private StaticLayout j(int i10, TextPaint textPaint, CharSequence charSequence, float f10, boolean z10) {
        StaticLayout staticLayoutA;
        try {
            staticLayoutA = h.c(charSequence, textPaint, (int) f10).e(this.G).h(z10).d(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : C()).g(false).j(i10).i(this.f7978q0, this.f7980r0).f(this.f7982s0).k(this.f7984t0).a();
        } catch (h.a e10) {
            Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
            staticLayoutA = null;
        }
        return (StaticLayout) l0.g.g(staticLayoutA);
    }

    private void k0(float f10) {
        h(f10);
        this.f7945a.postInvalidateOnAnimation();
    }

    private void l(Canvas canvas, float f10, float f11) {
        int alpha = this.U.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f7949c) {
            this.U.setAlpha((int) (this.f7970m0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.U;
                textPaint.setShadowLayer(this.N, this.O, this.P, c9.a.a(this.Q, textPaint.getAlpha()));
            }
            this.f7964j0.draw(canvas);
        }
        if (!this.f7949c) {
            this.U.setAlpha((int) (this.f7968l0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.U;
            textPaint2.setShadowLayer(this.N, this.O, this.P, c9.a.a(this.Q, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f7964j0.getLineBaseline(0);
        CharSequence charSequence = this.f7972n0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.U);
        if (i10 >= 31) {
            this.U.setShadowLayer(this.N, this.O, this.P, this.Q);
        }
        if (this.f7949c) {
            return;
        }
        String strTrim = this.f7972n0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.U.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f7964j0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.U);
    }

    private boolean q0() {
        if (this.f7974o0 > 1 || this.f7976p0 > 1) {
            return !this.J || this.f7949c;
        }
        return false;
    }

    private float r(int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) - (this.f7966k0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.J ? this.f7959h.left : this.f7959h.right - this.f7966k0 : this.J ? this.f7959h.right - this.f7966k0 : this.f7959h.left;
    }

    private boolean r0() {
        return this.f7976p0 == 1;
    }

    private float s(RectF rectF, int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) + (this.f7966k0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.J ? rectF.left + this.f7966k0 : this.f7959h.right : this.J ? this.f7959h.right : rectF.left + this.f7966k0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.S;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f7973o);
    }

    public float A() {
        E(this.V);
        return -this.V.ascent();
    }

    public float B() {
        return this.f7947b;
    }

    public final boolean I() {
        ColorStateList colorStateList = this.f7975p;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f7973o;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public void L(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f7993z;
            if (typeface != null) {
                this.f7992y = j9.h.b(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = j9.h.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f7992y;
            if (typeface3 == null) {
                typeface3 = this.f7993z;
            }
            this.f7991x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            O(true);
        }
    }

    public void N() {
        O(false);
    }

    public void O(boolean z10) {
        if ((this.f7945a.getHeight() <= 0 || this.f7945a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void Q(ColorStateList colorStateList) {
        if (this.f7975p == colorStateList && this.f7973o == colorStateList) {
            return;
        }
        this.f7975p = colorStateList;
        this.f7973o = colorStateList;
        N();
    }

    public void R(int i10, int i11, int i12, int i13) {
        if (P(this.f7959h, i10, i11, i12, i13)) {
            return;
        }
        this.f7959h.set(i10, i11, i12, i13);
        this.T = true;
    }

    public void S(Rect rect) {
        R(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void T(int i10) {
        if (i10 != this.f7976p0) {
            this.f7976p0 = i10;
            N();
        }
    }

    public void U(int i10) {
        j9.d dVar = new j9.d(this.f7945a.getContext(), i10);
        if (dVar.j() != null) {
            this.f7975p = dVar.j();
        }
        if (dVar.k() != 0.0f) {
            this.f7971n = dVar.k();
        }
        ColorStateList colorStateList = dVar.f18557c;
        if (colorStateList != null) {
            this.f7948b0 = colorStateList;
        }
        this.Z = dVar.f18563i;
        this.f7946a0 = dVar.f18564j;
        this.Y = dVar.f18565k;
        this.f7958g0 = dVar.f18567m;
        j9.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        this.F = new j9.a(new C0119a(), dVar.e());
        dVar.h(this.f7945a.getContext(), this.F);
        N();
    }

    public void W(ColorStateList colorStateList) {
        if (this.f7975p != colorStateList) {
            this.f7975p = colorStateList;
            N();
        }
    }

    public void X(int i10) {
        if (this.f7967l != i10) {
            this.f7967l = i10;
            N();
        }
    }

    public void Y(Typeface typeface) {
        if (Z(typeface)) {
            N();
        }
    }

    public void a0(int i10, int i11, int i12, int i13) {
        b0(i10, i11, i12, i13, true);
    }

    public void b0(int i10, int i11, int i12, int i13, boolean z10) {
        if (P(this.f7957g, i10, i11, i12, i13) && z10 == this.f7990w0) {
            return;
        }
        this.f7957g.set(i10, i11, i12, i13);
        this.T = true;
        this.f7990w0 = z10;
    }

    public void c0(Rect rect) {
        a0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void d0(float f10) {
        if (this.f7960h0 != f10) {
            this.f7960h0 = f10;
            N();
        }
    }

    public void e0(int i10) {
        if (i10 != this.f7974o0) {
            this.f7974o0 = i10;
            N();
        }
    }

    public void g0(int i10) {
        if (this.f7965k != i10) {
            this.f7965k = i10;
            N();
        }
    }

    public void h0(float f10) {
        if (this.f7969m != f10) {
            this.f7969m = f10;
            N();
        }
    }

    public void j0(float f10) {
        float fA = h0.a.a(f10, 0.0f, 1.0f);
        if (fA != this.f7947b) {
            this.f7947b = fA;
            c();
        }
    }

    public void k(Canvas canvas) {
        int iSave = canvas.save();
        if (this.I == null || this.f7963j.width() <= 0.0f || this.f7963j.height() <= 0.0f) {
            return;
        }
        this.U.setTextSize(this.M);
        float f10 = this.f7987v;
        float f11 = this.f7989w;
        float f12 = this.L;
        if (f12 != 1.0f && !this.f7949c) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (q0() && r0() && (!this.f7949c || this.f7947b > this.f7953e)) {
            l(canvas, this.f7987v - this.f7964j0.getLineStart(0), f11);
        } else {
            canvas.translate(f10, f11);
            this.f7964j0.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public void l0(TimeInterpolator timeInterpolator) {
        this.W = timeInterpolator;
        N();
    }

    public float m() {
        D(this.V);
        return (-this.V.ascent()) + this.V.descent();
    }

    public final boolean m0(int[] iArr) {
        this.S = iArr;
        if (!I()) {
            return false;
        }
        N();
        return true;
    }

    public float n() {
        D(this.V);
        return -this.V.ascent();
    }

    public void n0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.H, charSequence)) {
            this.H = charSequence;
            this.I = null;
            N();
        }
    }

    public void o(RectF rectF, int i10, int i11) {
        this.J = f(this.H);
        rectF.left = Math.max(r(i10, i11), this.f7959h.left);
        rectF.top = this.f7959h.top;
        rectF.right = Math.min(s(rectF, i10, i11), this.f7959h.right);
        rectF.bottom = this.f7959h.top + q();
        if (this.f7964j0 == null || r0()) {
            return;
        }
        float lineWidth = this.f7964j0.getLineWidth(r4.getLineCount() - 1) * (this.f7971n / this.f7969m);
        if (this.J) {
            rectF.left = rectF.right - lineWidth;
        } else {
            rectF.right = rectF.left + lineWidth;
        }
    }

    public void o0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        N();
    }

    public ColorStateList p() {
        return this.f7975p;
    }

    public void p0(Typeface typeface) {
        boolean Z = Z(typeface);
        boolean zI0 = i0(typeface);
        if (Z || zI0) {
            N();
        }
    }

    public float q() {
        int i10 = this.f7986u0;
        return i10 != -1 ? i10 : n();
    }

    public void s0(int i10) {
        D(this.V);
        float f10 = i10;
        this.f7986u0 = j(this.f7976p0, this.V, this.H, f10 * (this.f7971n / this.f7969m), this.J).getHeight();
        E(this.V);
        this.f7988v0 = j(this.f7974o0, this.V, this.H, f10, this.J).getHeight();
    }

    public int t() {
        return u(this.f7975p);
    }

    public int w() {
        return this.f7977q;
    }

    public int x() {
        return this.f7974o0;
    }

    public float y() {
        E(this.V);
        return (-this.V.ascent()) + this.V.descent();
    }

    public float z() {
        int i10 = this.f7988v0;
        return i10 != -1 ? i10 : A();
    }
}
