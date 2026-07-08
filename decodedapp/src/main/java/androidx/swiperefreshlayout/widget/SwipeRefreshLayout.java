package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import m0.a0;
import m0.o0;
import m0.w;
import m0.x;
import m0.y;
import m0.z;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements z, y, w {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f3244b0 = "SwipeRefreshLayout";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int[] f3245c0 = {R.attr.enabled};
    private int A;
    boolean B;
    private boolean C;
    private final DecelerateInterpolator D;
    androidx.swiperefreshlayout.widget.a E;
    private int F;
    protected int G;
    float H;
    protected int I;
    int J;
    int K;
    androidx.swiperefreshlayout.widget.b L;
    private Animation M;
    private Animation N;
    private Animation O;
    private Animation P;
    private Animation Q;
    boolean R;
    private int S;
    boolean T;
    private boolean U;
    private Animation.AnimationListener V;
    private final Animation W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f3246a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final Animation f3247a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    j f3248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f3249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f3251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f3252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a0 f3253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x f3254h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int[] f3255r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int[] f3256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f3257t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f3258u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f3259v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f3260w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f3261x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f3262y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f3263z;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f3249c) {
                swipeRefreshLayout.l();
                return;
            }
            swipeRefreshLayout.L.setAlpha(255);
            SwipeRefreshLayout.this.L.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.R && (jVar = swipeRefreshLayout2.f3248b) != null) {
                jVar.a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f3260w = swipeRefreshLayout3.E.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    class d extends Animation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3268b;

        d(int i10, int i11) {
            this.f3267a = i10;
            this.f3268b = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.L.setAlpha((int) (this.f3267a + ((this.f3268b - r0) * f10)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.B) {
                return;
            }
            swipeRefreshLayout.r(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.T ? swipeRefreshLayout.J - Math.abs(swipeRefreshLayout.I) : swipeRefreshLayout.J;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.G + ((int) ((iAbs - r1) * f10))) - swipeRefreshLayout2.E.getTop());
            SwipeRefreshLayout.this.L.e(1.0f - f10);
        }
    }

    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.j(f10);
        }
    }

    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.H;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.j(f10);
        }
    }

    public interface i {
    }

    public interface j {
        void a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3249c = false;
        this.f3251e = -1.0f;
        this.f3255r = new int[2];
        this.f3256s = new int[2];
        this.f3257t = new int[2];
        this.A = -1;
        this.F = -1;
        this.V = new a();
        this.W = new f();
        this.f3247a0 = new g();
        this.f3250d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f3259v = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.D = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.S = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.J = i10;
        this.f3251e = i10;
        this.f3253g = new a0(this);
        this.f3254h = new x(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.S;
        this.f3260w = i11;
        this.I = i11;
        j(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3245c0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.G = i10;
        this.W.reset();
        this.W.setDuration(200L);
        this.W.setInterpolator(this.D);
        if (animationListener != null) {
            this.E.b(animationListener);
        }
        this.E.clearAnimation();
        this.E.startAnimation(this.W);
    }

    private void b(int i10, Animation.AnimationListener animationListener) {
        if (this.B) {
            s(i10, animationListener);
            return;
        }
        this.G = i10;
        this.f3247a0.reset();
        this.f3247a0.setDuration(200L);
        this.f3247a0.setInterpolator(this.D);
        if (animationListener != null) {
            this.E.b(animationListener);
        }
        this.E.clearAnimation();
        this.E.startAnimation(this.f3247a0);
    }

    private void d() {
        this.E = new androidx.swiperefreshlayout.widget.a(getContext());
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.L = bVar;
        bVar.l(1);
        this.E.setImageDrawable(this.L);
        this.E.setVisibility(8);
        addView(this.E);
    }

    private void f() {
        if (this.f3246a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.E)) {
                    this.f3246a = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f10) {
        if (f10 > this.f3251e) {
            m(true, true);
            return;
        }
        this.f3249c = false;
        this.L.j(0.0f, 0.0f);
        b(this.f3260w, !this.B ? new e() : null);
        this.L.d(false);
    }

    private boolean h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void i(float f10) {
        this.L.d(true);
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f3251e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f3251e;
        int i10 = this.K;
        if (i10 <= 0) {
            i10 = this.T ? this.J - this.I : this.J;
        }
        float f11 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.I + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.E.getVisibility() != 0) {
            this.E.setVisibility(0);
        }
        if (!this.B) {
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
        }
        if (this.B) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f3251e));
        }
        if (f10 < this.f3251e) {
            if (this.L.getAlpha() > 76 && !h(this.O)) {
                q();
            }
        } else if (this.L.getAlpha() < 255 && !h(this.P)) {
            p();
        }
        this.L.j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.L.e(Math.min(1.0f, fMax));
        this.L.g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f3260w);
    }

    private void k(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A) {
            this.A = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void m(boolean z10, boolean z11) {
        if (this.f3249c != z10) {
            this.R = z11;
            f();
            this.f3249c = z10;
            if (z10) {
                a(this.f3260w, this.V);
            } else {
                r(this.V);
            }
        }
    }

    private Animation n(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.E.b(null);
        this.E.clearAnimation();
        this.E.startAnimation(dVar);
        return dVar;
    }

    private void o(float f10) {
        float f11 = this.f3262y;
        float f12 = f10 - f11;
        int i10 = this.f3250d;
        if (f12 <= i10 || this.f3263z) {
            return;
        }
        this.f3261x = f11 + i10;
        this.f3263z = true;
        this.L.setAlpha(76);
    }

    private void p() {
        this.P = n(this.L.getAlpha(), 255);
    }

    private void q() {
        this.O = n(this.L.getAlpha(), 76);
    }

    private void s(int i10, Animation.AnimationListener animationListener) {
        this.G = i10;
        this.H = this.E.getScaleX();
        h hVar = new h();
        this.Q = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.E.b(animationListener);
        }
        this.E.clearAnimation();
        this.E.startAnimation(this.Q);
    }

    private void setColorViewAlpha(int i10) {
        this.E.getBackground().setAlpha(i10);
        this.L.setAlpha(i10);
    }

    private void t(Animation.AnimationListener animationListener) {
        this.E.setVisibility(0);
        this.L.setAlpha(255);
        b bVar = new b();
        this.M = bVar;
        bVar.setDuration(this.f3259v);
        if (animationListener != null) {
            this.E.b(animationListener);
        }
        this.E.clearAnimation();
        this.E.startAnimation(this.M);
    }

    public boolean c() {
        View view = this.f3246a;
        return view instanceof ListView ? androidx.core.widget.g.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f3254h.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f3254h.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f3254h.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f3254h.f(i10, i11, i12, i13, iArr);
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.f3254h.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.F;
        return i12 < 0 ? i11 : i11 == i10 + (-1) ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3253g.a();
    }

    public int getProgressCircleDiameter() {
        return this.S;
    }

    public int getProgressViewEndOffset() {
        return this.J;
    }

    public int getProgressViewStartOffset() {
        return this.I;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f3254h.j();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f3254h.l();
    }

    void j(float f10) {
        setTargetOffsetTopAndBottom((this.G + ((int) ((this.I - r0) * f10))) - this.E.getTop());
    }

    void l() {
        this.E.clearAnimation();
        this.L.stop();
        this.E.setVisibility(8);
        setColorViewAlpha(255);
        if (this.B) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.I - this.f3260w);
        }
        this.f3260w = this.E.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.f()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.C
            r2 = 0
            if (r1 == 0) goto L10
            if (r0 != 0) goto L10
            r4.C = r2
        L10:
            boolean r1 = r4.isEnabled()
            if (r1 == 0) goto L81
            boolean r1 = r4.C
            if (r1 != 0) goto L81
            boolean r1 = r4.c()
            if (r1 != 0) goto L81
            boolean r1 = r4.f3249c
            if (r1 != 0) goto L81
            boolean r1 = r4.f3258u
            if (r1 == 0) goto L29
            goto L81
        L29:
            if (r0 == 0) goto L5d
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L3d
            r1 = 3
            if (r0 == r1) goto L58
            r1 = 6
            if (r0 == r1) goto L39
            goto L7e
        L39:
            r4.k(r5)
            goto L7e
        L3d:
            int r0 = r4.A
            if (r0 != r3) goto L49
            java.lang.String r5 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f3244b0
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r5, r0)
            return r2
        L49:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L50
            return r2
        L50:
            float r5 = r5.getY(r0)
            r4.o(r5)
            goto L7e
        L58:
            r4.f3263z = r2
            r4.A = r3
            goto L7e
        L5d:
            int r0 = r4.I
            androidx.swiperefreshlayout.widget.a r1 = r4.E
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.setTargetOffsetTopAndBottom(r0)
            int r0 = r5.getPointerId(r2)
            r4.A = r0
            r4.f3263z = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L78
            return r2
        L78:
            float r5 = r5.getY(r0)
            r4.f3262y = r5
        L7e:
            boolean r5 = r4.f3263z
            return r5
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f3246a == null) {
            f();
        }
        View view = this.f3246a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.E.getMeasuredWidth();
        int measuredHeight2 = this.E.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f3260w;
        this.E.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f3246a == null) {
            f();
        }
        View view = this.f3246a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), WXVideoFileObject.FILE_SIZE_LIMIT), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), WXVideoFileObject.FILE_SIZE_LIMIT));
        this.E.measure(View.MeasureSpec.makeMeasureSpec(this.S, WXVideoFileObject.FILE_SIZE_LIMIT), View.MeasureSpec.makeMeasureSpec(this.S, WXVideoFileObject.FILE_SIZE_LIMIT));
        this.F = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.E) {
                this.F = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // m0.y
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // m0.z
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        e(i10, i11, i12, i13, this.f3256s, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        if ((i16 == 0 ? i13 + this.f3256s[1] : i16) >= 0 || c()) {
            return;
        }
        float fAbs = this.f3252f + Math.abs(r14);
        this.f3252f = fAbs;
        i(fAbs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // m0.y
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f3274a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f3249c);
    }

    @Override // m0.y
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // m0.y
    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.C && actionMasked == 0) {
            this.C = false;
        }
        if (!isEnabled() || this.C || c() || this.f3249c || this.f3258u) {
            return false;
        }
        if (actionMasked == 0) {
            this.A = motionEvent.getPointerId(0);
            this.f3263z = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.A);
                if (iFindPointerIndex < 0) {
                    Log.e(f3244b0, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f3263z) {
                    float y10 = (motionEvent.getY(iFindPointerIndex) - this.f3261x) * 0.5f;
                    this.f3263z = false;
                    g(y10);
                }
                this.A = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.A);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f3244b0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(iFindPointerIndex2);
                o(y11);
                if (this.f3263z) {
                    float f10 = (y11 - this.f3261x) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    i(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f3244b0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.A = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    k(motionEvent);
                }
            }
        }
        return true;
    }

    void r(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.N = cVar;
        cVar.setDuration(150L);
        this.E.b(animationListener);
        this.E.clearAnimation();
        this.E.startAnimation(this.N);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent;
        View view = this.f3246a;
        if (view == null || o0.T(view)) {
            super.requestDisallowInterceptTouchEvent(z10);
        } else {
            if (this.U || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    void setAnimationProgress(float f10) {
        this.E.setScaleX(f10);
        this.E.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.L.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = b0.b.b(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f3251e = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        l();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.U = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f3254h.m(z10);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.f3248b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.E.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(b0.b.b(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f3249c == z10) {
            m(z10, false);
            return;
        }
        this.f3249c = z10;
        setTargetOffsetTopAndBottom((!this.T ? this.J + this.I : this.J) - this.f3260w);
        this.R = false;
        t(this.V);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.S = (int) (displayMetrics.density * 56.0f);
            } else {
                this.S = (int) (displayMetrics.density * 40.0f);
            }
            this.E.setImageDrawable(null);
            this.L.l(i10);
            this.E.setImageDrawable(this.L);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.K = i10;
    }

    void setTargetOffsetTopAndBottom(int i10) {
        this.E.bringToFront();
        o0.X(this.E, i10);
        this.f3260w = this.E.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f3254h.o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f3254h.q();
    }

    static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f3274a;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        k(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f3274a = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f3274a ? (byte) 1 : (byte) 0);
        }

        k(Parcel parcel) {
            super(parcel);
            this.f3274a = parcel.readByte() != 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f3252f;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f3252f = 0.0f;
                } else {
                    this.f3252f = f10 - f11;
                    iArr[1] = i11;
                }
                i(this.f3252f);
            }
        }
        if (this.T && i11 > 0 && this.f3252f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.E.setVisibility(8);
        }
        int[] iArr2 = this.f3255r;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f3253g.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f3252f = 0.0f;
        this.f3258u = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.C || this.f3249c || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f3253g.d(view);
        this.f3258u = false;
        float f10 = this.f3252f;
        if (f10 > 0.0f) {
            g(f10);
            this.f3252f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // m0.y
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i10, i11, i12, i13, i14, this.f3257t);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i10, i11, i12, i13, 0, this.f3257t);
    }
}
