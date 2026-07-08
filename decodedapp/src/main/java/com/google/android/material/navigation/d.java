package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.TooltipCompat;
import com.google.android.material.internal.BaselineLayout;
import n0.x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends FrameLayout implements g {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final int[] f8047s0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final c f8048t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final c f8049u0;
    private final View A;
    private final FrameLayout B;
    private final ImageView C;
    private final BaselineLayout D;
    private final TextView E;
    private final TextView F;
    private BaselineLayout G;
    private TextView H;
    private TextView I;
    private BaselineLayout J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private ColorStateList P;
    private boolean Q;
    private androidx.appcompat.view.menu.j R;
    private ColorStateList S;
    private Drawable T;
    private Drawable U;
    private ValueAnimator V;
    private c W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8050a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f8051a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f8052b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f8053b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Drawable f8054c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f8055c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8056d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f8057d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8058e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f8059e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8060f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f8061f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8062g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f8063g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f8064h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f8065h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f8066i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private w8.a f8067j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f8068k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f8069l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f8070m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f8071n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f8072o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f8073p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f8074q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f8075r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private Rect f8076r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f8077s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f8078t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f8079u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f8080v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f8081w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8082x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final LinearLayout f8083y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final LinearLayout f8084z;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8085a;

        a(int i10) {
            this.f8085a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.y(this.f8085a);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f8087a;

        b(float f10) {
            this.f8087a = f10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.n(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f8087a);
        }
    }

    private static class c {
        private c() {
        }

        protected float a(float f10, float f11) {
            return v8.a.b(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f10);
        }

        protected float b(float f10) {
            return v8.a.a(0.4f, 1.0f, f10);
        }

        protected float c(float f10) {
            return 1.0f;
        }

        public void d(float f10, float f11, View view) {
            view.setScaleX(b(f10));
            view.setScaleY(c(f10));
            view.setAlpha(a(f10, f11));
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.d$d, reason: collision with other inner class name */
    private static class C0120d extends c {
        private C0120d() {
            super(null);
        }

        @Override // com.google.android.material.navigation.d.c
        protected float c(float f10) {
            return b(f10);
        }

        /* synthetic */ C0120d(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f8048t0 = new c(aVar);
        f8049u0 = new C0120d(aVar);
    }

    public d(Context context) {
        super(context);
        this.f8050a = false;
        this.K = -1;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.Q = false;
        this.W = f8048t0;
        this.f8051a0 = 0.0f;
        this.f8053b0 = false;
        this.f8055c0 = 0;
        this.f8057d0 = 0;
        this.f8059e0 = -2;
        this.f8061f0 = 0;
        this.f8063g0 = false;
        this.f8065h0 = 0;
        this.f8066i0 = 0;
        this.f8069l0 = 0;
        this.f8070m0 = 49;
        this.f8071n0 = false;
        this.f8072o0 = false;
        this.f8073p0 = false;
        this.f8074q0 = false;
        this.f8076r0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f8083y = (LinearLayout) findViewById(u8.f.H);
        LinearLayout linearLayout = (LinearLayout) findViewById(u8.f.K);
        this.f8084z = linearLayout;
        this.A = findViewById(u8.f.G);
        this.B = (FrameLayout) findViewById(u8.f.I);
        this.C = (ImageView) findViewById(u8.f.J);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(u8.f.L);
        this.D = baselineLayout;
        TextView textView = (TextView) findViewById(u8.f.N);
        this.E = textView;
        TextView textView2 = (TextView) findViewById(u8.f.M);
        this.F = textView2;
        h();
        this.J = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.f8056d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f8058e = baselineLayout.getPaddingBottom();
        this.f8060f = 0;
        this.f8062g = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.H.setImportantForAccessibility(2);
        this.I.setImportantForAccessibility(2);
        setFocusable(true);
        d();
        this.f8061f0 = getResources().getDimensionPixelSize(u8.d.F);
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.navigation.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                d.a(this.f8046a, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
    }

    private void A() {
        TextView textView = this.F;
        textView.setTypeface(textView.getTypeface(), this.Q ? 1 : 0);
        TextView textView2 = this.I;
        textView2.setTypeface(textView2.getTypeface(), this.Q ? 1 : 0);
    }

    private void B(TextView textView, int i10) {
        if (textView == null) {
            return;
        }
        r(textView, i10);
        d();
        textView.setMinimumHeight(j9.c.i(textView.getContext(), i10, 0));
        ColorStateList colorStateList = this.P;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        A();
    }

    private void C(TextView textView, int i10) {
        if (textView == null) {
            return;
        }
        r(textView, i10);
        d();
        textView.setMinimumHeight(j9.c.i(textView.getContext(), i10, 0));
        ColorStateList colorStateList = this.P;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    private void D() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f8069l0 = 0;
        this.J = this.D;
        int i16 = 8;
        if (this.f8068k0 == 1) {
            if (this.G.getParent() == null) {
                c();
            }
            Rect rect = this.f8076r0;
            int i17 = rect.left;
            int i18 = rect.right;
            int i19 = rect.top;
            i10 = rect.bottom;
            this.f8069l0 = 1;
            int i20 = this.f8066i0;
            this.J = this.G;
            i15 = i19;
            i14 = i18;
            i13 = i17;
            i12 = i20;
            i11 = 0;
        } else {
            i10 = 0;
            i16 = 0;
            i11 = 8;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        this.D.setVisibility(i16);
        this.G.setVisibility(i11);
        ((FrameLayout.LayoutParams) this.f8083y.getLayoutParams()).gravity = this.f8070m0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8084z.getLayoutParams();
        layoutParams.leftMargin = i13;
        layoutParams.rightMargin = i14;
        layoutParams.topMargin = i15;
        layoutParams.bottomMargin = i10;
        setPadding(i12, 0, i12, 0);
        y(getWidth());
    }

    private static void E(View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    private void F() {
        androidx.appcompat.view.menu.j jVar = this.R;
        if (jVar != null) {
            setVisibility((!jVar.isVisible() || (!this.f8071n0 && this.f8072o0)) ? 8 : 0);
        }
    }

    public static /* synthetic */ void a(d dVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        if (dVar.C.getVisibility() == 0) {
            dVar.x(dVar.C);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.f8084z.getLayoutParams();
        int i18 = (i12 - i10) + layoutParams.rightMargin + layoutParams.leftMargin;
        int i19 = (i13 - i11) + layoutParams.topMargin + layoutParams.bottomMargin;
        boolean z11 = true;
        if (dVar.f8068k0 == 1 && dVar.f8059e0 == -2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) dVar.A.getLayoutParams();
            if (dVar.f8059e0 != -2 || dVar.A.getMeasuredWidth() == i18) {
                z10 = false;
            } else {
                layoutParams2.width = Math.max(i18, Math.min(dVar.f8055c0, dVar.getMeasuredWidth() - (dVar.f8065h0 * 2)));
                z10 = true;
            }
            if (dVar.A.getMeasuredHeight() < i19) {
                layoutParams2.height = i19;
            } else {
                z11 = z10;
            }
            if (z11) {
                dVar.A.setLayoutParams(layoutParams2);
            }
        }
    }

    private void c() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f8084z.addView(this.G, layoutParams);
        o();
    }

    private void d() {
        float textSize = this.E.getTextSize();
        float textSize2 = this.F.getTextSize();
        this.f8064h = textSize - textSize2;
        this.f8075r = (textSize2 * 1.0f) / textSize;
        this.f8077s = (textSize * 1.0f) / textSize2;
        float textSize3 = this.H.getTextSize();
        float textSize4 = this.I.getTextSize();
        this.f8078t = textSize3 - textSize4;
        this.f8079u = (textSize4 * 1.0f) / textSize3;
        this.f8080v = (textSize3 * 1.0f) / textSize4;
    }

    private static Drawable f(ColorStateList colorStateList) {
        return new RippleDrawable(k9.a.a(colorStateList), null, null);
    }

    private boolean g() {
        return this.f8067j0 != null;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof d) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconWidth() {
        w8.a aVar = this.f8067j0;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f8067j0.m();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.B.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.C.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private void h() {
        float dimension = getResources().getDimension(u8.d.f28583b);
        float dimension2 = getResources().getDimension(u8.d.f28581a);
        BaselineLayout baselineLayout = new BaselineLayout(getContext());
        this.G = baselineLayout;
        baselineLayout.setVisibility(8);
        this.G.setDuplicateParentStateEnabled(true);
        this.G.setMeasurePaddingFromBaseline(this.f8073p0);
        TextView textView = new TextView(getContext());
        this.H = textView;
        textView.setMaxLines(1);
        TextView textView2 = this.H;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.H.setDuplicateParentStateEnabled(true);
        this.H.setIncludeFontPadding(false);
        this.H.setGravity(16);
        this.H.setTextSize(dimension);
        TextView textView3 = new TextView(getContext());
        this.I = textView3;
        textView3.setMaxLines(1);
        this.I.setEllipsize(truncateAt);
        this.I.setDuplicateParentStateEnabled(true);
        this.I.setVisibility(4);
        this.I.setIncludeFontPadding(false);
        this.I.setGravity(16);
        this.I.setTextSize(dimension2);
        this.G.addView(this.H);
        this.G.addView(this.I);
    }

    private boolean i() {
        return this.f8063g0 && this.f8081w == 2;
    }

    private void j(float f10) {
        if (!this.f8053b0 || !this.f8050a || !isAttachedToWindow()) {
            n(f10, f10);
            return;
        }
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f8051a0, f10);
        this.V = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new b(f10));
        this.V.setInterpolator(h9.d.g(getContext(), u8.b.G, v8.a.f30493b));
        this.V.setDuration(h9.d.f(getContext(), u8.b.f28568x, getResources().getInteger(u8.g.f28670b)));
        this.V.start();
    }

    private void k() {
        androidx.appcompat.view.menu.j jVar = this.R;
        if (jVar != null) {
            setChecked(jVar.isChecked());
        }
    }

    private void l() {
        Drawable drawableF = this.f8054c;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (this.f8052b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f8053b0 && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(k9.a.e(this.f8052b), null, activeIndicatorDrawable);
                z10 = false;
            } else if (drawableF == null) {
                drawableF = f(this.f8052b);
            }
        }
        this.B.setPadding(0, 0, 0, 0);
        this.B.setForeground(rippleDrawable);
        setBackground(drawableF);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(float f10, float f11) {
        this.W.d(f10, f11, this.A);
        this.f8051a0 = f10;
    }

    private void o() {
        int i10 = this.C.getLayoutParams().width > 0 ? this.f8062g : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.G.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i10 : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i10 : 0;
        }
    }

    private void p(View view, View view2, float f10, float f11) {
        t(this.f8083y, this.f8068k0 == 0 ? (int) (this.f8056d + f11) : 0, 0, this.f8070m0);
        LinearLayout linearLayout = this.f8084z;
        int i10 = this.f8068k0;
        t(linearLayout, i10 == 0 ? 0 : this.f8076r0.top, i10 == 0 ? 0 : this.f8076r0.bottom, i10 == 0 ? 17 : 8388627);
        E(this.D, this.f8058e);
        this.J.setVisibility(0);
        u(view, 1.0f, 1.0f, 0);
        u(view2, f10, f10, 4);
    }

    private void q() {
        LinearLayout linearLayout = this.f8083y;
        int i10 = this.f8056d;
        t(linearLayout, i10, i10, this.f8068k0 == 0 ? 17 : this.f8070m0);
        t(this.f8084z, 0, 0, 17);
        E(this.D, 0);
        this.J.setVisibility(8);
    }

    private void r(TextView textView, int i10) {
        if (this.f8074q0) {
            androidx.core.widget.j.m(textView, i10);
        } else {
            s(textView, i10);
        }
    }

    private static void s(TextView textView, int i10) {
        androidx.core.widget.j.m(textView, i10);
        int iJ = j9.c.j(textView.getContext(), i10, 0);
        if (iJ != 0) {
            textView.setTextSize(0, iJ);
        }
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    private static void t(View view, int i10, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i11;
        layoutParams.gravity = i12;
        view.setLayoutParams(layoutParams);
    }

    private static void u(View view, float f10, float f11, int i10) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i10);
    }

    private void v(View view) {
        if (g() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            w8.d.a(this.f8067j0, view);
        }
    }

    private void w(View view) {
        if (g()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                w8.d.e(this.f8067j0, view);
            }
            this.f8067j0 = null;
        }
    }

    private void x(View view) {
        if (g()) {
            w8.d.f(this.f8067j0, view, null);
        }
    }

    private void z() {
        if (i()) {
            this.W = f8049u0;
        } else {
            this.W = f8048t0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f8053b0) {
            this.B.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    void e() {
        m();
        this.R = null;
        this.f8051a0 = 0.0f;
        this.f8050a = false;
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.A.getBackground();
    }

    public w8.a getBadge() {
        return this.f8067j0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.G;
    }

    protected int getItemBackgroundResId() {
        return u8.e.f28640i;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public androidx.appcompat.view.menu.j getItemData() {
        return this.R;
    }

    protected int getItemDefaultMarginResId() {
        return u8.d.f28616r0;
    }

    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.K;
    }

    public BaselineLayout getLabelGroup() {
        return this.D;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8083y.getLayoutParams();
        return this.f8083y.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        if (this.f8068k0 == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8084z.getLayoutParams();
            return this.f8084z.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.D.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams2.leftMargin + this.D.getMeasuredWidth() + layoutParams2.rightMargin);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void initialize(androidx.appcompat.view.menu.j jVar, int i10) {
        this.R = jVar;
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitle());
        setId(jVar.getItemId());
        if (!TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(jVar.getContentDescription());
        }
        CharSequence tooltipText = !TextUtils.isEmpty(jVar.getTooltipText()) ? jVar.getTooltipText() : jVar.getTitle();
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.setTooltipText(this, tooltipText);
        }
        F();
        this.f8050a = true;
    }

    void m() {
        w(this.C);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.j jVar = this.R;
        if (jVar != null && jVar.isCheckable() && this.R.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f8047s0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        w8.a aVar = this.f8067j0;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.R.getTitle();
            if (!TextUtils.isEmpty(this.R.getContentDescription())) {
                title = this.R.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f8067j0.j()));
        }
        x xVarY0 = x.Y0(accessibilityNodeInfo);
        xVarY0.w0(x.g.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            xVarY0.u0(false);
            xVarY0.k0(x.a.f22372i);
        }
        xVarY0.M0(getResources().getString(u8.j.f28706h));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new a(i10));
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.A.setBackground(drawable);
        l();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.f8053b0 = z10;
        l();
        this.A.setVisibility(z10 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i10) {
        this.f8061f0 = i10;
        y(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.f8066i0 = i10;
        if (this.f8068k0 == 1) {
            setPadding(i10, 0, i10, 0);
        }
        y(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.f8076r0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i10) {
        this.f8059e0 = i10;
        y(getWidth());
    }

    public void setActiveIndicatorHeight(int i10) {
        this.f8057d0 = i10;
        y(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f8060f != i10) {
            this.f8060f = i10;
            ((LinearLayout.LayoutParams) this.D.getLayoutParams()).topMargin = i10;
            if (this.G.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.G.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i10 : 0;
                if (getLayoutDirection() == 1) {
                    i10 = 0;
                }
                layoutParams.leftMargin = i10;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.f8065h0 = i10;
        y(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.f8063g0 = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.f8055c0 = i10;
        y(getWidth());
    }

    void setBadge(w8.a aVar) {
        if (this.f8067j0 == aVar) {
            return;
        }
        if (g() && this.C != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            w(this.C);
        }
        this.f8067j0 = aVar;
        aVar.O(this.f8069l0);
        ImageView imageView = this.C;
        if (imageView != null) {
            v(imageView);
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    public void setChecked(boolean z10) {
        setLabelPivots(this.F);
        setLabelPivots(this.E);
        setLabelPivots(this.I);
        setLabelPivots(this.H);
        j(z10 ? 1.0f : 0.0f);
        TextView textView = this.F;
        TextView textView2 = this.E;
        float f10 = this.f8064h;
        float f11 = this.f8075r;
        float f12 = this.f8077s;
        if (this.f8068k0 == 1) {
            textView = this.I;
            textView2 = this.H;
            f10 = this.f8078t;
            f11 = this.f8079u;
            f12 = this.f8080v;
        }
        int i10 = this.f8081w;
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        q();
                    }
                } else if (z10) {
                    p(textView, textView2, f11, f10);
                } else {
                    p(textView2, textView, f12, 0.0f);
                }
            } else if (z10) {
                p(textView, textView2, f11, 0.0f);
            } else {
                q();
            }
        } else if (this.f8082x) {
            if (z10) {
                p(textView, textView2, f11, 0.0f);
            } else {
                q();
            }
        } else if (z10) {
            p(textView, textView2, f11, f10);
        } else {
            p(textView2, textView, f12, 0.0f);
        }
        refreshDrawableState();
        setSelected(z10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.E.setEnabled(z10);
        this.F.setEnabled(z10);
        this.H.setEnabled(z10);
        this.I.setEnabled(z10);
        this.C.setEnabled(z10);
    }

    @Override // com.google.android.material.navigation.g
    public void setExpanded(boolean z10) {
        this.f8071n0 = z10;
        F();
    }

    public void setHorizontalTextAppearanceActive(int i10) {
        this.N = i10;
        TextView textView = this.I;
        if (i10 == 0) {
            i10 = this.L;
        }
        B(textView, i10);
    }

    public void setHorizontalTextAppearanceInactive(int i10) {
        this.O = i10;
        TextView textView = this.H;
        if (i10 == 0) {
            i10 = this.M;
        }
        C(textView, i10);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.T) {
            return;
        }
        this.T = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = e0.a.r(drawable).mutate();
            this.U = drawable;
            ColorStateList colorStateList = this.S;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.C.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        if (this.f8062g != i10) {
            this.f8062g = i10;
            o();
            requestLayout();
        }
    }

    public void setIconSize(int i10) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.C.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.C.setLayoutParams(layoutParams);
        o();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.S = colorStateList;
        if (this.R == null || (drawable = this.U) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.U.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : getContext().getDrawable(i10));
    }

    public void setItemGravity(int i10) {
        this.f8070m0 = i10;
        requestLayout();
    }

    public void setItemIconGravity(int i10) {
        if (this.f8068k0 != i10) {
            this.f8068k0 = i10;
            D();
            l();
        }
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f8058e != i10) {
            this.f8058e = i10;
            k();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f8056d != i10) {
            this.f8056d = i10;
            k();
        }
    }

    public void setItemPosition(int i10) {
        this.K = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f8052b = colorStateList;
        l();
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f8074q0 = z10;
        setTextAppearanceActive(this.L);
        setTextAppearanceInactive(this.M);
        setHorizontalTextAppearanceActive(this.N);
        setHorizontalTextAppearanceInactive(this.O);
    }

    public void setLabelMaxLines(int i10) {
        this.E.setMaxLines(i10);
        this.F.setMaxLines(i10);
        this.H.setMaxLines(i10);
        this.I.setMaxLines(i10);
        if (Build.VERSION.SDK_INT > 34) {
            this.E.setGravity(17);
            this.F.setGravity(17);
        } else if (i10 > 1) {
            this.E.setEllipsize(null);
            this.F.setEllipsize(null);
            this.E.setGravity(17);
            this.F.setGravity(17);
        } else {
            this.E.setGravity(16);
            this.F.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f8081w != i10) {
            this.f8081w = i10;
            z();
            y(getWidth());
            k();
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z10) {
        this.f8073p0 = z10;
        this.D.setMeasurePaddingFromBaseline(z10);
        this.E.setIncludeFontPadding(z10);
        this.F.setIncludeFontPadding(z10);
        this.G.setMeasurePaddingFromBaseline(z10);
        this.H.setIncludeFontPadding(z10);
        this.I.setIncludeFontPadding(z10);
        requestLayout();
    }

    @Override // com.google.android.material.navigation.g
    public void setOnlyShowWhenExpanded(boolean z10) {
        this.f8072o0 = z10;
        F();
    }

    public void setShifting(boolean z10) {
        if (this.f8082x != z10) {
            this.f8082x = z10;
            k();
        }
    }

    public void setTextAppearanceActive(int i10) {
        this.L = i10;
        B(this.F, i10);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z10) {
        this.Q = z10;
        setTextAppearanceActive(this.L);
        setHorizontalTextAppearanceActive(this.N);
        A();
    }

    public void setTextAppearanceInactive(int i10) {
        this.M = i10;
        C(this.E, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.P = colorStateList;
        if (colorStateList != null) {
            this.E.setTextColor(colorStateList);
            this.F.setTextColor(colorStateList);
            this.H.setTextColor(colorStateList);
            this.I.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.E.setText(charSequence);
        this.F.setText(charSequence);
        this.H.setText(charSequence);
        this.I.setText(charSequence);
        androidx.appcompat.view.menu.j jVar = this.R;
        if (jVar == null || TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        androidx.appcompat.view.menu.j jVar2 = this.R;
        if (jVar2 != null && !TextUtils.isEmpty(jVar2.getTooltipText())) {
            charSequence = this.R.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.setTooltipText(this, charSequence);
        }
    }

    public void y(int i10) {
        if (i10 > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.f8055c0, i10 - (this.f8065h0 * 2));
            int iMax = this.f8057d0;
            if (this.f8068k0 == 1) {
                int measuredWidth = i10 - (this.f8066i0 * 2);
                int i11 = this.f8059e0;
                if (i11 != -1) {
                    measuredWidth = i11 == -2 ? this.f8083y.getMeasuredWidth() : Math.min(i11, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.f8061f0, this.f8084z.getMeasuredHeight());
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
            if (i()) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            this.A.setLayoutParams(layoutParams);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f8054c = drawable;
        l();
    }
}
