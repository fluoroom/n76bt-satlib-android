package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.c;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import java.util.ArrayList;
import java.util.List;
import m0.b0;
import m0.i1;
import m0.o0;
import n0.x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseTransientBottomBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f8179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f8180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f8181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewGroup f8182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f8183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final s f8184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.material.snackbar.a f8185j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8187l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f8190o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f8191p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f8192q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f8193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f8194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f8195t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f8196u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f8197v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Behavior f8198w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AccessibilityManager f8199x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final TimeInterpolator f8175z = v8.a.f30493b;
    private static final TimeInterpolator A = v8.a.f30492a;
    private static final TimeInterpolator B = v8.a.f30495d;
    private static final int[] D = {u8.b.P};
    private static final String E = BaseTransientBottomBar.class.getSimpleName();
    static final Handler C = new Handler(Looper.getMainLooper(), new h());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f8188m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f8189n = new i();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    c.b f8200y = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final r f8201l = new r(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void Q(BaseTransientBottomBar baseTransientBottomBar) {
            this.f8201l.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean F(View view) {
            return this.f8201l.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f8201l.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8202a;

        a(int i10) {
            this.f8202a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.P(this.f8202a);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f8184i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f8184i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f8184i.setScaleY(fFloatValue);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Q();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f8185j.a(BaseTransientBottomBar.this.f8178c - BaseTransientBottomBar.this.f8176a, BaseTransientBottomBar.this.f8176a);
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f8184i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8208a;

        f(int i10) {
            this.f8208a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.P(this.f8208a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f8185j.b(0, BaseTransientBottomBar.this.f8177b);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {
        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f8184i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).X();
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).J(message.arg1);
            return true;
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f8184i == null || baseTransientBottomBar.f8183h == null) {
                return;
            }
            int iHeight = (com.google.android.material.internal.r.a(BaseTransientBottomBar.this.f8183h).height() - BaseTransientBottomBar.this.H()) + ((int) BaseTransientBottomBar.this.f8184i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f8194s) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f8195t = baseTransientBottomBar2.f8194s;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f8184i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.E, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f8195t = baseTransientBottomBar3.f8194s;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f8194s - iHeight;
            BaseTransientBottomBar.this.f8184i.requestLayout();
        }
    }

    class j implements b0 {
        j() {
        }

        @Override // m0.b0
        public i1 a(View view, i1 i1Var) {
            BaseTransientBottomBar.this.f8190o = i1Var.i();
            BaseTransientBottomBar.this.f8191p = i1Var.j();
            BaseTransientBottomBar.this.f8192q = i1Var.k();
            BaseTransientBottomBar.this.d0();
            return i1Var;
        }
    }

    class k extends m0.a {
        k() {
        }

        @Override // m0.a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            xVar.a(1048576);
            xVar.y0(true);
        }

        @Override // m0.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.j(view, i10, bundle);
            }
            BaseTransientBottomBar.this.x();
            return true;
        }
    }

    class l implements c.b {
        l() {
        }

        @Override // com.google.android.material.snackbar.c.b
        public void a(int i10) {
            Handler handler = BaseTransientBottomBar.C;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.c.b
        public void show() {
            Handler handler = BaseTransientBottomBar.C;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.P(3);
        }
    }

    class n implements SwipeDismissBehavior.c {
        n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.y(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i10) {
            if (i10 == 0) {
                com.google.android.material.snackbar.c.c().k(BaseTransientBottomBar.this.f8200y);
            } else if (i10 == 1 || i10 == 2) {
                com.google.android.material.snackbar.c.c().j(BaseTransientBottomBar.this.f8200y);
            }
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s sVar = BaseTransientBottomBar.this.f8184i;
            if (sVar == null) {
                return;
            }
            if (sVar.getParent() != null) {
                BaseTransientBottomBar.this.f8184i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f8184i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.Z();
            } else {
                BaseTransientBottomBar.this.b0();
            }
        }
    }

    class p extends AnimatorListenerAdapter {
        p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Q();
        }
    }

    public static abstract class q {
        public abstract void a(Object obj, int i10);

        public void b(Object obj) {
        }
    }

    public static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c.b f8219a;

        public r(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.M(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.N(0);
        }

        public boolean a(View view) {
            return view instanceof s;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.v(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.c.c().j(this.f8219a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.c.c().k(this.f8219a);
            }
        }

        public void c(BaseTransientBottomBar baseTransientBottomBar) {
            this.f8219a = baseTransientBottomBar.f8200y;
        }
    }

    protected static class s extends FrameLayout {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final View.OnTouchListener f8220u = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BaseTransientBottomBar f8221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        m9.l f8222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f8224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f8225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f8226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f8227g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ColorStateList f8228h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private PorterDuff.Mode f8229r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Rect f8230s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f8231t;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected s(Context context, AttributeSet attributeSet) {
            super(q9.a.d(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, u8.l.D5);
            if (typedArrayObtainStyledAttributes.hasValue(u8.l.K5)) {
                setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(r2, 0));
            }
            this.f8223c = typedArrayObtainStyledAttributes.getInt(u8.l.G5, 0);
            if (typedArrayObtainStyledAttributes.hasValue(u8.l.M5) || typedArrayObtainStyledAttributes.hasValue(u8.l.N5)) {
                this.f8222b = m9.l.e(context2, attributeSet, 0, 0).m();
            }
            this.f8224d = typedArrayObtainStyledAttributes.getFloat(u8.l.H5, 1.0f);
            setBackgroundTintList(j9.c.a(context2, typedArrayObtainStyledAttributes, u8.l.I5));
            setBackgroundTintMode(com.google.android.material.internal.p.h(typedArrayObtainStyledAttributes.getInt(u8.l.J5, -1), PorterDuff.Mode.SRC_IN));
            this.f8225e = typedArrayObtainStyledAttributes.getFloat(u8.l.F5, 1.0f);
            this.f8226f = typedArrayObtainStyledAttributes.getDimensionPixelSize(u8.l.E5, -1);
            this.f8227g = typedArrayObtainStyledAttributes.getDimensionPixelSize(u8.l.L5, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f8220u);
            setFocusable(true);
            if (getBackground() == null) {
                setBackground(d());
            }
        }

        private Drawable d() {
            int iL = c9.a.l(this, u8.b.f28552h, u8.b.f28550f, getBackgroundOverlayColorAlpha());
            m9.l lVar = this.f8222b;
            Drawable drawableW = lVar != null ? BaseTransientBottomBar.w(iL, lVar) : BaseTransientBottomBar.v(iL, getResources());
            if (this.f8228h == null) {
                return e0.a.r(drawableW);
            }
            Drawable drawableR = e0.a.r(drawableW);
            drawableR.setTintList(this.f8228h);
            return drawableR;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f8230s = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
            this.f8221a = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.f8231t = true;
            viewGroup.addView(this);
            this.f8231t = false;
        }

        float getActionTextColorAlpha() {
            return this.f8225e;
        }

        int getAnimationMode() {
            return this.f8223c;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f8224d;
        }

        int getMaxInlineActionWidth() {
            return this.f8227g;
        }

        int getMaxWidth() {
            return this.f8226f;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f8221a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.M();
            }
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f8221a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.N();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar baseTransientBottomBar = this.f8221a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.O();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f8226f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f8226f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, WXVideoFileObject.FILE_SIZE_LIMIT), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f8223c = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f8228h != null) {
                drawable = e0.a.r(drawable.mutate());
                drawable.setTintList(this.f8228h);
                drawable.setTintMode(this.f8229r);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f8228h = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = e0.a.r(getBackground().mutate());
                drawableR.setTintList(colorStateList);
                drawableR.setTintMode(this.f8229r);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f8229r = mode;
            if (getBackground() != null) {
                Drawable drawableR = e0.a.r(getBackground().mutate());
                drawableR.setTintMode(mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f8231t || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar baseTransientBottomBar = this.f8221a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.d0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f8220u);
            super.setOnClickListener(onClickListener);
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f8182g = viewGroup;
        this.f8185j = aVar;
        this.f8183h = context;
        com.google.android.material.internal.m.a(context);
        s sVar = (s) LayoutInflater.from(context).inflate(F(), viewGroup, false);
        this.f8184i = sVar;
        sVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(sVar.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(sVar.getMaxInlineActionWidth());
        }
        sVar.addView(view);
        sVar.setAccessibilityLiveRegion(1);
        sVar.setImportantForAccessibility(1);
        sVar.setFitsSystemWindows(true);
        o0.y0(sVar, new j());
        o0.n0(sVar, new k());
        this.f8199x = (AccessibilityManager) context.getSystemService("accessibility");
        int i10 = u8.b.f28568x;
        this.f8178c = h9.d.f(context, i10, 250);
        this.f8176a = h9.d.f(context, i10, 150);
        this.f8177b = h9.d.f(context, u8.b.f28569y, 75);
        int i11 = u8.b.G;
        this.f8179d = h9.d.g(context, i11, A);
        this.f8181f = h9.d.g(context, i11, B);
        this.f8180e = h9.d.g(context, i11, f8175z);
    }

    private ValueAnimator E(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f8181f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    private int G() {
        int height = this.f8184i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f8184i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H() {
        int[] iArr = new int[2];
        this.f8184i.getLocationInWindow(iArr);
        return iArr[1] + this.f8184i.getHeight();
    }

    private boolean L() {
        ViewGroup.LayoutParams layoutParams = this.f8184i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void R() {
        this.f8193r = u();
        d0();
    }

    private void T(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior swipeDismissBehaviorD = this.f8198w;
        if (swipeDismissBehaviorD == null) {
            swipeDismissBehaviorD = D();
        }
        if (swipeDismissBehaviorD instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorD).Q(this);
        }
        swipeDismissBehaviorD.L(new n());
        fVar.q(swipeDismissBehaviorD);
        if (A() == null) {
            fVar.f1878g = 80;
        }
    }

    private boolean V() {
        return this.f8194s > 0 && !this.f8187l && L();
    }

    private void Y() {
        if (U()) {
            s();
            return;
        }
        if (this.f8184i.getParent() != null) {
            this.f8184i.setVisibility(0);
        }
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        ValueAnimator valueAnimatorZ = z(0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorZ, valueAnimatorE);
        animatorSet.setDuration(this.f8176a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void a0(int i10) {
        ValueAnimator valueAnimatorZ = z(1.0f, 0.0f);
        valueAnimatorZ.setDuration(this.f8177b);
        valueAnimatorZ.addListener(new a(i10));
        valueAnimatorZ.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        int iG = G();
        this.f8184i.setTranslationY(iG);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iG, 0);
        valueAnimator.setInterpolator(this.f8180e);
        valueAnimator.setDuration(this.f8178c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e());
        valueAnimator.start();
    }

    private void c0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, G());
        valueAnimator.setInterpolator(this.f8180e);
        valueAnimator.setDuration(this.f8178c);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        ViewGroup.LayoutParams layoutParams = this.f8184i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(E, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f8184i.f8230s == null) {
            Log.w(E, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f8184i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = this.f8184i.f8230s.bottom + (A() != null ? this.f8193r : this.f8190o);
        int i11 = this.f8184i.f8230s.left + this.f8191p;
        int i12 = this.f8184i.f8230s.right + this.f8192q;
        int i13 = this.f8184i.f8230s.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i10;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.topMargin = i13;
            this.f8184i.requestLayout();
        }
        if ((z10 || this.f8195t != this.f8194s) && Build.VERSION.SDK_INT >= 29 && V()) {
            this.f8184i.removeCallbacks(this.f8189n);
            this.f8184i.post(this.f8189n);
        }
    }

    private void t(int i10) {
        if (this.f8184i.getAnimationMode() == 1) {
            a0(i10);
        } else {
            c0(i10);
        }
    }

    private int u() {
        if (A() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        A().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f8182g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f8182g.getHeight()) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable v(int i10, Resources resources) {
        float dimension = resources.getDimension(u8.d.f28620t0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static m9.h w(int i10, m9.l lVar) {
        m9.h hVar = new m9.h(lVar);
        hVar.c0(ColorStateList.valueOf(i10));
        return hVar;
    }

    private ValueAnimator z(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f8179d);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    public View A() {
        return null;
    }

    public Context B() {
        return this.f8183h;
    }

    public int C() {
        return this.f8186k;
    }

    protected SwipeDismissBehavior D() {
        return new Behavior();
    }

    protected int F() {
        return I() ? u8.h.f28695x : u8.h.f28673b;
    }

    protected boolean I() {
        TypedArray typedArrayObtainStyledAttributes = this.f8183h.obtainStyledAttributes(D);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void J(int i10) {
        if (U() && this.f8184i.getVisibility() == 0) {
            t(i10);
        } else {
            P(i10);
        }
    }

    public boolean K() {
        return com.google.android.material.snackbar.c.c().e(this.f8200y);
    }

    void M() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f8184i.getRootWindowInsets()) == null) {
            return;
        }
        this.f8194s = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        d0();
    }

    void N() {
        if (K()) {
            C.post(new m());
        }
    }

    void O() {
        if (this.f8196u) {
            Y();
            this.f8196u = false;
        }
    }

    void P(int i10) {
        com.google.android.material.snackbar.c.c().h(this.f8200y);
        List list = this.f8197v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((q) this.f8197v.get(size)).a(this, i10);
            }
        }
        ViewParent parent = this.f8184i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f8184i);
        }
    }

    void Q() {
        com.google.android.material.snackbar.c.c().i(this.f8200y);
        List list = this.f8197v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((q) this.f8197v.get(size)).b(this);
            }
        }
    }

    public BaseTransientBottomBar S(int i10) {
        this.f8186k = i10;
        return this;
    }

    boolean U() {
        AccessibilityManager accessibilityManager = this.f8199x;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void W() {
        com.google.android.material.snackbar.c.c().m(C(), this.f8200y);
    }

    final void X() {
        if (this.f8184i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f8184i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                T((CoordinatorLayout.f) layoutParams);
            }
            this.f8184i.c(this.f8182g);
            R();
            this.f8184i.setVisibility(4);
        }
        if (this.f8184i.isLaidOut()) {
            Y();
        } else {
            this.f8196u = true;
        }
    }

    public BaseTransientBottomBar r(q qVar) {
        if (qVar == null) {
            return this;
        }
        if (this.f8197v == null) {
            this.f8197v = new ArrayList();
        }
        this.f8197v.add(qVar);
        return this;
    }

    void s() {
        this.f8184i.post(new o());
    }

    public void x() {
        y(3);
    }

    protected void y(int i10) {
        com.google.android.material.snackbar.c.c().b(this.f8200y, i10);
    }
}
