package u3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.HeaderViewListAdapter;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import androidx.appcompat.widget.RtlSpacingHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final long f27984g0 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    static boolean f27985h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static Property f27986i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static Property f27987j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static Property f27988k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static Property f27989l0;
    private AnimatorSet A;
    private AnimatorSet B;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private boolean I;
    private Object[] J;
    private boolean K;
    private int L;
    private boolean M;
    private Adapter N;
    private SectionIndexer O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private int S;
    private int T;
    private boolean U;
    private float V;
    private int X;
    private int Y;
    private int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final ImageView f27991a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Bitmap f27993b0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbsListView f27996d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final int f27997d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewGroupOverlay f27998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextView f28000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextView f28002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ImageView f28003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ImageView f28004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View f28005j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f28007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f28008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28009n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f28010o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f28011p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f28012q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f28013r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ColorStateList f28014s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Drawable f28015t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Drawable f28016u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f28017v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f28018w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f28019x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f28020y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f28021z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f27990a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f27992b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f27994c = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f28006k = new int[2];
    private int G = -1;
    private int H = -1;
    private long W = -1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f27995c0 = true;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final Runnable f27999e0 = new a();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final Animator.AnimatorListener f28001f0 = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.X(0);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.this.C = !r2.C;
        }
    }

    class c extends s3.a {
        c(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getLeft());
        }

        @Override // s3.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, int i10) {
            view.setLeft(i10);
        }
    }

    class d extends s3.a {
        d(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getTop());
        }

        @Override // s3.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, int i10) {
            view.setTop(i10);
        }
    }

    class e extends s3.a {
        e(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getRight());
        }

        @Override // s3.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, int i10) {
            view.setRight(i10);
        }
    }

    class f extends s3.a {
        f(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getBottom());
        }

        @Override // s3.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, int i10) {
            view.setBottom(i10);
        }
    }

    /* JADX INFO: renamed from: u3.g$g, reason: collision with other inner class name */
    interface InterfaceC0389g {
        void a(int i10);
    }

    static {
        f27985h0 = Build.VERSION.SDK_INT < 23;
        f27986i0 = new c("left");
        f27987j0 = new d("top");
        f27988k0 = new e("right");
        f27989l0 = new f("bottom");
    }

    public g(AbsListView absListView, int i10) {
        this.f27996d = absListView;
        this.Y = absListView.getCount();
        this.Z = absListView.getChildCount();
        Context context = absListView.getContext();
        this.X = ViewConfiguration.get(context).getScaledTouchSlop();
        this.T = absListView.getScrollBarStyle();
        this.D = true;
        this.L = 1;
        this.U = context.getApplicationInfo().targetSdkVersion >= 11;
        ImageView imageView = new ImageView(context);
        this.f28004i = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = new ImageView(context);
        this.f28003h = imageView2;
        imageView2.setScaleType(scaleType);
        View view = new View(context);
        this.f28005j = view;
        view.setAlpha(0.0f);
        TextView textViewO = o(context);
        this.f28000f = textViewO;
        TextView textViewO2 = o(context);
        this.f28002g = textViewO2;
        this.f28007l = absListView.getResources().getDimensionPixelSize(k3.d.f19169c);
        ImageView imageView3 = new ImageView(context);
        this.f27991a0 = imageView3;
        imageView3.setScaleType(scaleType);
        this.f27997d0 = absListView.getResources().getDimensionPixelSize(k3.d.f19170d);
        Y(i10);
        ViewGroupOverlay overlay = absListView.getOverlay();
        this.f27998e = overlay;
        overlay.add(imageView);
        overlay.add(imageView2);
        overlay.add(imageView3);
        overlay.add(view);
        overlay.add(textViewO);
        overlay.add(textViewO2);
        r();
        k0(this.Z, this.Y);
        V(absListView.getVerticalScrollbarPosition());
        O();
    }

    private void A() {
        Rect rect = this.f27990a;
        F(this.f28003h, null, null, rect);
        g(this.f28003h, rect);
    }

    private void B() {
        int i10;
        int i11;
        ImageView imageView = this.f28004i;
        ImageView imageView2 = this.f28003h;
        Rect rect = this.f27994c;
        imageView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, rect.width()), RtlSpacingHelper.UNDEFINED), C(Math.max(0, rect.height()), 0));
        if (this.f28018w == 1) {
            i11 = rect.top;
            i10 = rect.bottom;
        } else {
            int height = imageView2.getHeight() / 2;
            int i12 = rect.top + height;
            i10 = rect.bottom - height;
            i11 = i12;
        }
        int measuredWidth = imageView.getMeasuredWidth();
        int left = imageView2.getLeft() + ((imageView2.getWidth() - measuredWidth) / 2);
        imageView.layout(left, i11, measuredWidth + left, i10);
    }

    public static int C(int i10, int i11) {
        if (f27985h0 && i11 == 0) {
            return 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i10, i11);
    }

    private void D(View view, Rect rect, Rect rect2) {
        int i10;
        int i11;
        int i12;
        if (rect == null) {
            i12 = 0;
            i10 = 0;
            i11 = 0;
        } else {
            i10 = rect.left;
            i11 = rect.top;
            i12 = rect.right;
        }
        Rect rect3 = this.f27994c;
        int iWidth = rect3.width();
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (iWidth - i10) - i12), RtlSpacingHelper.UNDEFINED), C(Math.max(0, rect3.height()), 0));
        int iHeight = rect3.height();
        int measuredWidth = view.getMeasuredWidth();
        int i13 = (iHeight / 10) + i11 + rect3.top;
        int measuredHeight = view.getMeasuredHeight() + i13;
        int i14 = ((iWidth - measuredWidth) / 2) + rect3.left;
        rect2.set(i14, i13, measuredWidth + i14, measuredHeight);
    }

    private void E(View view, Rect rect) {
        Rect rect2 = this.f27992b;
        rect2.left = this.f28005j.getPaddingLeft();
        rect2.top = this.f28005j.getPaddingTop();
        rect2.right = this.f28005j.getPaddingRight();
        rect2.bottom = this.f28005j.getPaddingBottom();
        if (this.S == 0) {
            D(view, rect2, rect);
        } else {
            F(view, this.f28003h, rect2, rect);
        }
    }

    private void F(View view, View view2, Rect rect, Rect rect2) {
        int i10;
        int i11;
        int i12;
        int right;
        int left;
        if (rect == null) {
            i12 = 0;
            i10 = 0;
            i11 = 0;
        } else {
            i10 = rect.left;
            i11 = rect.top;
            i12 = rect.right;
        }
        Rect rect3 = this.f27994c;
        int iWidth = rect3.width();
        if (view2 != null) {
            iWidth = this.P ? view2.getLeft() : iWidth - view2.getRight();
        }
        int iMax = Math.max(0, rect3.height());
        int iMax2 = Math.max(0, (iWidth - i10) - i12);
        view.measure(View.MeasureSpec.makeMeasureSpec(iMax2, RtlSpacingHelper.UNDEFINED), C(iMax, 0));
        int iMin = Math.min(iMax2, view.getMeasuredWidth());
        if (this.P) {
            left = (view2 == null ? rect3.right : view2.getLeft()) - i12;
            right = left - iMin;
        } else {
            right = (view2 == null ? rect3.left : view2.getRight()) + i10;
            left = right + iMin;
        }
        rect2.set(right, i11, left, view.getMeasuredHeight() + i11);
    }

    private void M(boolean z10) {
        if (!v()) {
            b0();
        } else if (u()) {
            X(1);
        } else if (this.L == 1) {
            O();
        } else if (z10) {
            X(1);
            O();
        }
        if (Build.VERSION.SDK_INT < 24) {
            v.m(this.f27996d);
        }
    }

    private void O() {
        this.f27996d.removeCallbacks(this.f27999e0);
        this.f27996d.postDelayed(this.f27999e0, 1500L);
    }

    private void P() {
        boolean z10 = this.L == 2;
        this.f28003h.setPressed(z10);
        this.f28004i.setPressed(z10);
    }

    private void Q(int i10) {
        ViewParent viewParent = this.f27996d;
        if (viewParent instanceof InterfaceC0389g) {
            ((InterfaceC0389g) viewParent).a(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void R(float r14) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.g.R(float):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(int i10) {
        this.f27996d.removeCallbacks(this.f27999e0);
        if (this.R && i10 == 0) {
            i10 = 1;
        }
        if (i10 == this.L) {
            return;
        }
        if (i10 == 0) {
            e0();
        } else if (i10 == 1) {
            f0();
        } else if (i10 == 2) {
            if (c0(this.G)) {
                d0();
            } else {
                f0();
            }
        }
        this.L = i10;
        P();
    }

    private void Z(float f10) {
        float f11 = (f10 * this.f28020y) + this.f28019x;
        this.f28003h.setTranslationY(f11 - (r0.getHeight() / 2.0f));
        View view = this.f28005j;
        float height = view.getHeight() / 2.0f;
        int i10 = this.S;
        if (i10 != 1) {
            f11 = i10 != 2 ? 0.0f : f11 - height;
        }
        Rect rect = this.f27994c;
        float fL = l(f11, rect.top + height, rect.bottom - height) - height;
        view.setTranslationY(fL);
        this.f28000f.setTranslationY(fL);
        this.f28002g.setTranslationY(fL);
    }

    private void a0() {
        this.W = SystemClock.uptimeMillis() + f27984g0;
    }

    private boolean c0(int i10) {
        TextView textView;
        TextView textView2;
        Object obj;
        Object[] objArr = this.J;
        String string = (objArr == null || i10 < 0 || i10 >= objArr.length || (obj = objArr[i10]) == null) ? null : obj.toString();
        Rect rect = this.f27990a;
        View view = this.f28005j;
        if (this.C) {
            textView = this.f28000f;
            textView2 = this.f28002g;
        } else {
            textView = this.f28002g;
            textView2 = this.f28000f;
        }
        textView2.setText(string);
        E(textView2, rect);
        g(textView2, rect);
        AnimatorSet animatorSet = this.B;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Animator duration = d(textView2, 1.0f).setDuration(50L);
        Animator duration2 = d(textView, 0.0f).setDuration(50L);
        duration2.addListener(this.f28001f0);
        rect.left -= view.getPaddingLeft();
        rect.top -= view.getPaddingTop();
        rect.right += view.getPaddingRight();
        rect.bottom += view.getPaddingBottom();
        Animator animatorE = e(view, rect);
        animatorE.setDuration(100L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.B = animatorSet2;
        AnimatorSet.Builder builderWith = animatorSet2.play(duration2).with(duration);
        builderWith.with(animatorE);
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int width2 = textView2.getWidth();
        if (width2 > width) {
            textView2.setScaleX(width / width2);
            builderWith.with(f(textView2, 1.0f).setDuration(100L));
        } else {
            textView2.setScaleX(1.0f);
        }
        int width3 = textView.getWidth();
        if (width3 > width2) {
            builderWith.with(f(textView, width2 / width3).setDuration(100L));
        }
        this.B.start();
        return !TextUtils.isEmpty(string);
    }

    private static Animator d(View view, float f10) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f10);
    }

    private void d0() {
        AnimatorSet animatorSet = this.A;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Property property = View.ALPHA;
        Animator duration = t(property, 1.0f, this.f28003h, this.f28004i, this.f28005j, this.f27991a0).setDuration(150L);
        Animator duration2 = t(View.TRANSLATION_X, 0.0f, this.f28003h, this.f28004i).setDuration(150L);
        Animator duration3 = t(property, 0.0f, this.f28003h, this.f28004i).setDuration(300L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A = animatorSet2;
        if (this.f27993b0 != null) {
            animatorSet2.playTogether(duration, duration3, duration2);
        } else {
            animatorSet2.playTogether(duration, duration2);
        }
        this.A.start();
        this.M = true;
    }

    private static Animator e(View view, Rect rect) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofInt((Property<?, Integer>) f27986i0, rect.left), PropertyValuesHolder.ofInt((Property<?, Integer>) f27987j0, rect.top), PropertyValuesHolder.ofInt((Property<?, Integer>) f27988k0, rect.right), PropertyValuesHolder.ofInt((Property<?, Integer>) f27989l0, rect.bottom));
    }

    private void e0() {
        AnimatorSet animatorSet = this.A;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Animator duration = t(View.ALPHA, 0.0f, this.f28003h, this.f28004i, this.f28005j, this.f28000f, this.f28002g, this.f27991a0).setDuration(300L);
        Animator duration2 = t(View.TRANSLATION_X, this.P ? this.f28003h.getWidth() : -this.f28003h.getWidth(), this.f28003h, this.f28004i).setDuration(300L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A = animatorSet2;
        animatorSet2.playTogether(duration, duration2);
        this.A.start();
        this.M = false;
    }

    private static Animator f(View view, float f10) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f10);
    }

    private void f0() {
        AnimatorSet animatorSet = this.A;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Property property = View.ALPHA;
        Animator duration = t(property, 1.0f, this.f28003h, this.f28004i).setDuration(150L);
        Animator duration2 = t(property, 0.0f, this.f28005j, this.f28000f, this.f28002g, this.f27991a0).setDuration(300L);
        Animator duration3 = t(View.TRANSLATION_X, 0.0f, this.f28003h, this.f28004i).setDuration(150L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.A = animatorSet2;
        animatorSet2.playTogether(duration, duration2, duration3);
        this.A.start();
        this.M = false;
    }

    private void g(View view, Rect rect) {
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
        view.setPivotX(this.P ? rect.right - rect.left : 0.0f);
    }

    private void g0() {
        Context context = this.f27996d.getContext();
        this.f28004i.setImageDrawable(this.f28016u);
        Drawable drawable = this.f28016u;
        int iMax = drawable != null ? Math.max(0, drawable.getIntrinsicWidth()) : 0;
        this.f28003h.setImageDrawable(this.f28015t);
        this.f28003h.setMinimumWidth(this.f28011p);
        this.f28003h.setMinimumHeight(this.f28012q);
        Drawable drawable2 = this.f28015t;
        if (drawable2 != null) {
            iMax = Math.max(iMax, drawable2.getIntrinsicWidth());
        }
        this.f28021z = Math.max(iMax, this.f28011p);
        int i10 = this.f28017v;
        if (i10 != 0) {
            this.f28000f.setTextAppearance(context, i10);
            this.f28002g.setTextAppearance(context, this.f28017v);
        }
        ColorStateList colorStateList = this.f28014s;
        if (colorStateList != null) {
            this.f28000f.setTextColor(colorStateList);
            this.f28002g.setTextColor(this.f28014s);
        }
        float f10 = this.f28013r;
        if (f10 > 0.0f) {
            this.f28000f.setTextSize(0, f10);
            this.f28002g.setTextSize(0, this.f28013r);
        }
        int i11 = this.f28008m;
        this.f28000f.setIncludeFontPadding(false);
        this.f28000f.setPadding(i11, i11, i11, i11);
        this.f28002g.setIncludeFontPadding(false);
        this.f28002g.setPadding(i11, i11, i11, i11);
        P();
    }

    private void h() {
        this.W = -1L;
        X(2);
        if (this.N == null && this.f27996d != null) {
            r();
        }
        AbsListView absListView = this.f27996d;
        if (absListView != null) {
            absListView.requestDisallowInterceptTouchEvent(true);
            Q(1);
        }
        i();
    }

    private void h0() {
        AbsListView absListView = this.f27996d;
        v.m(absListView);
        Rect rect = this.f27994c;
        rect.left = 0;
        rect.top = 0;
        rect.right = absListView.getWidth();
        rect.bottom = absListView.getHeight();
        int i10 = this.T;
        if (i10 == 16777216 || i10 == 0) {
            rect.left += absListView.getPaddingLeft();
            rect.top += absListView.getPaddingTop();
            rect.right -= absListView.getPaddingRight();
            rect.bottom -= absListView.getPaddingBottom();
            if (i10 == 16777216) {
                int iS = s();
                if (this.H == 2) {
                    rect.right += iS;
                } else {
                    rect.left -= iS;
                }
            }
        }
    }

    private void i() {
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        this.f27996d.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private void i0(int i10, int i11) {
        int i12;
        Object[] array = this.J;
        if (!this.f27995c0 || i10 <= 0 || i11 <= 0 || array == null || array.length < 2) {
            k();
            return;
        }
        int i13 = this.f27997d0;
        int size = this.G;
        float f10 = i11;
        int i14 = (int) (f10 / (i13 / 3));
        if (i14 == 0) {
            k();
            return;
        }
        if (array.length > i14) {
            if (size != 0) {
                size = -1;
            }
            int length = (((array.length + i14) - 1) / i14) * 2;
            ArrayList arrayList = new ArrayList(((array.length / length) * 2) + 1);
            arrayList.add(array[0]);
            int i15 = length;
            while (i15 < array.length) {
                arrayList.add("·");
                arrayList.add(array[i15]);
                if (size == -1 && i15 >= (i12 = this.G)) {
                    size = i15 == i12 ? arrayList.size() - 1 : arrayList.size() - 2;
                }
                i15 += length;
            }
            if ((i15 - length) + 1 != array.length) {
                arrayList.add("·");
            }
            array = arrayList.toArray(new Object[0]);
            if (size == -1) {
                size = arrayList.size() - 1;
            }
        }
        Canvas canvasN = n(i11);
        float length2 = f10 / array.length;
        float f11 = i13 / 2;
        float f12 = i13;
        float f13 = length2 > f12 ? f12 : length2;
        Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setAlpha(180);
        canvasN.drawRect(0.0f, 0.0f, f12, f10, paint);
        paint.setAlpha(0);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(f13);
        float f14 = 0.8f * length2;
        for (int i16 = 0; i16 < array.length; i16++) {
            if (i16 == size) {
                paint.setColor(v.f28037b);
            } else {
                paint.setColor(-1);
            }
            canvasN.drawText(array[i16].toString(), f11, (i16 * length2) + f14, paint);
        }
    }

    private void j() {
        this.W = -1L;
    }

    private void k() {
        Bitmap bitmap = this.f27993b0;
        this.f27993b0 = null;
        if (bitmap != null) {
            this.f27991a0.setImageBitmap(null);
            bitmap.recycle();
        }
    }

    private void k0(int i10, int i11) {
        boolean z10 = i10 > 0 && i11 / i10 >= 4;
        if (this.I != z10) {
            this.I = z10;
            M(false);
        }
    }

    public static float l(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    private void l0() {
        float top;
        float bottom;
        ImageView imageView = this.f28004i;
        ImageView imageView2 = this.f28003h;
        if (this.f28018w == 1) {
            float height = imageView2.getHeight() / 2.0f;
            top = imageView.getTop() + height;
            bottom = imageView.getBottom() - height;
        } else {
            top = imageView.getTop();
            bottom = imageView.getBottom();
        }
        this.f28019x = top;
        this.f28020y = bottom - top;
    }

    public static int m(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    private Canvas n(int i10) {
        Bitmap bitmap = this.f27993b0;
        if (bitmap != null && bitmap.getWidth() == this.f27997d0 && bitmap.getHeight() == i10) {
            Canvas canvas = new Canvas(bitmap);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            return canvas;
        }
        k();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f27997d0, i10, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        this.f27993b0 = bitmapCreateBitmap;
        this.f27991a0.setImageBitmap(bitmapCreateBitmap);
        return canvas2;
    }

    private TextView o(Context context) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        TextView textView = new TextView(context);
        textView.setLayoutParams(layoutParams);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        textView.setLayoutDirection(this.f27996d.getLayoutDirection());
        return textView;
    }

    private float p(int i10, int i11, int i12) {
        Object[] objArr;
        int positionForSection;
        int height;
        int height2;
        SectionIndexer sectionIndexer = this.O;
        if (sectionIndexer == null || this.N == null) {
            r();
        }
        if (i11 == 0 || i12 == 0) {
            return 0.0f;
        }
        if (sectionIndexer == null || (objArr = this.J) == null || objArr.length <= 0 || !this.U) {
            if (i11 == i12) {
                return 0.0f;
            }
            return i10 / (i12 - i11);
        }
        int i13 = this.F;
        int i14 = i10 - i13;
        if (i14 < 0) {
            return 0.0f;
        }
        int i15 = i12 - i13;
        View childAt = this.f27996d.getChildAt(0);
        float paddingTop = (childAt == null || childAt.getHeight() == 0) ? 0.0f : (this.f27996d.getPaddingTop() - childAt.getTop()) / childAt.getHeight();
        int sectionForPosition = sectionIndexer.getSectionForPosition(i14);
        int positionForSection2 = sectionIndexer.getPositionForSection(sectionForPosition);
        int length = this.J.length;
        if (sectionForPosition < length - 1) {
            int i16 = sectionForPosition + 1;
            positionForSection = (i16 < length ? sectionIndexer.getPositionForSection(i16) : i15 - 1) - positionForSection2;
        } else {
            positionForSection = i15 - positionForSection2;
        }
        float f10 = (sectionForPosition + (positionForSection != 0 ? ((i14 + paddingTop) - positionForSection2) / positionForSection : 0.0f)) / length;
        if (i14 <= 0 || i14 + i11 != i15) {
            return f10;
        }
        View childAt2 = this.f27996d.getChildAt(i11 - 1);
        int paddingBottom = this.f27996d.getPaddingBottom();
        if (v.i(this.f27996d)) {
            height = childAt2.getHeight();
            height2 = (this.f27996d.getHeight() - paddingBottom) - childAt2.getTop();
        } else {
            height = childAt2.getHeight() + paddingBottom;
            height2 = this.f27996d.getHeight() - childAt2.getTop();
        }
        return (height2 <= 0 || height <= 0) ? f10 : f10 + ((1.0f - f10) * (height2 / height));
    }

    private float q(float f10) {
        float f11 = this.f28020y;
        if (f11 <= 0.0f) {
            return 0.0f;
        }
        return l((f10 - this.f28019x) / f11, 0.0f, 1.0f);
    }

    private void r() {
        this.O = null;
        Adapter adapter = this.f27996d.getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            this.F = headerViewListAdapter.getHeadersCount();
            adapter = headerViewListAdapter.getWrappedAdapter();
        }
        if (adapter instanceof SectionIndexer) {
            this.N = adapter;
            SectionIndexer sectionIndexer = (SectionIndexer) adapter;
            this.O = sectionIndexer;
            this.J = sectionIndexer.getSections();
        } else {
            this.N = adapter;
            this.J = null;
        }
        i0(this.f27996d.getWidth(), this.f27996d.getHeight());
    }

    private static Animator t(Property property, float f10, View... viewArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderPlay = null;
        for (int length = viewArr.length - 1; length >= 0; length--) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewArr[length], (Property<View, Float>) property, f10);
            if (builderPlay == null) {
                builderPlay = animatorSet.play(objectAnimatorOfFloat);
            } else {
                builderPlay.with(objectAnimatorOfFloat);
            }
        }
        return animatorSet;
    }

    private boolean w(float f10, float f11) {
        if (x(f10)) {
            return this.f28016u != null || y(f11);
        }
        return false;
    }

    private boolean x(float f10) {
        float translationX = this.f28003h.getTranslationX();
        float right = this.f28007l - ((this.f28003h.getRight() + translationX) - (this.f28003h.getLeft() + translationX));
        if (right <= 0.0f) {
            right = 0.0f;
        }
        return this.P ? f10 >= ((float) this.f28003h.getLeft()) - right : f10 <= ((float) this.f28003h.getRight()) + right;
    }

    private boolean y(float f10) {
        float translationY = this.f28003h.getTranslationY();
        float top = this.f28003h.getTop() + translationY;
        float bottom = this.f28003h.getBottom() + translationY;
        float f11 = this.f28007l - (bottom - top);
        float f12 = f11 > 0.0f ? f11 / 2.0f : 0.0f;
        return f10 >= top - f12 && f10 <= bottom + f12;
    }

    private void z() {
        int width = this.P ? this.f27996d.getWidth() - this.f27997d0 : 0;
        this.f27991a0.layout(width, 0, this.f27997d0 + width, this.f27996d.getHeight());
    }

    public boolean G(MotionEvent motionEvent) {
        if (!v()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 9 || actionMasked == 7) && this.L == 0 && w(motionEvent.getX(), motionEvent.getY())) {
            X(1);
            O();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean H(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.v()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r7.getActionMasked()
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L62
            if (r0 == r3) goto L5e
            if (r0 == r2) goto L19
            r7 = 3
            if (r0 == r7) goto L5e
            goto L9b
        L19:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r0 = r6.w(r0, r2)
            if (r0 != 0) goto L2b
            r6.j()
            goto L9b
        L2b:
            long r2 = r6.W
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L9b
            long r4 = android.os.SystemClock.uptimeMillis()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L9b
            float r0 = r7.getY()
            float r2 = r6.V
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r6.X
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L9b
            r6.h()
            float r0 = r6.V
            float r0 = r6.q(r0)
            r6.R(r0)
            boolean r7 = r6.N(r7)
            return r7
        L5e:
            r6.j()
            goto L9b
        L62:
            int r0 = r6.L
            if (r0 != 0) goto L7b
            float r0 = r7.getX()
            android.widget.AbsListView r4 = r6.f27996d
            int r4 = r4.getWidth()
            int r4 = r4 / r2
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L77
            goto L78
        L77:
            r2 = 1
        L78:
            r6.V(r2)
        L7b:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r0 = r6.w(r0, r2)
            if (r0 == 0) goto L9b
            android.widget.AbsListView r0 = r6.f27996d
            boolean r0 = u3.v.k(r0)
            if (r0 != 0) goto L92
            return r3
        L92:
            float r7 = r7.getY()
            r6.V = r7
            r6.a0()
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.g.H(android.view.MotionEvent):boolean");
    }

    public void I(int i10, int i11) {
        if (this.Y == i11 && this.Z == i10) {
            return;
        }
        this.Y = i11;
        this.Z = i10;
        if (i11 - i10 > 0 && this.L != 2) {
            Z(p(this.f27996d.getFirstVisiblePosition(), i10, i11));
        }
        k0(i10, i11);
    }

    public void J(int i10, int i11, int i12) {
        if (!v()) {
            X(0);
            return;
        }
        if (i12 - i11 > 0 && this.L != 2) {
            Z(p(i10, i11, i12));
        }
        this.D = true;
        if (this.E != i10) {
            this.E = i10;
            if (this.L != 2) {
                X(1);
                O();
            }
        }
    }

    public void K() {
        this.N = null;
    }

    public void L(int i10, int i11, int i12, int i13) {
        i0(i10, i11);
        j0();
    }

    public boolean N(MotionEvent motionEvent) {
        if (!v()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (this.L == 0) {
                V(motionEvent.getX() <= ((float) (this.f27996d.getWidth() / 2)) ? 1 : 2);
            }
            if (w(motionEvent.getX(), motionEvent.getY()) && !v.k(this.f27996d)) {
                h();
                return true;
            }
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.W >= 0 && Math.abs(motionEvent.getY() - this.V) > this.X) {
                    h();
                }
                if (this.L == 2) {
                    float fQ = q(motionEvent.getY());
                    Z(fQ);
                    if (this.D) {
                        R(fQ);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                j();
            }
        } else if (this.L == 2) {
            AbsListView absListView = this.f27996d;
            if (absListView != null) {
                absListView.requestDisallowInterceptTouchEvent(false);
                Q(0);
            }
            X(1);
            O();
            return true;
        }
        return false;
    }

    public void S(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            M(false);
        }
    }

    public void T(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            M(true);
        }
    }

    public void U(int i10) {
        if (this.T != i10) {
            this.T = i10;
            j0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    public void V(int i10) {
        if (i10 == 0) {
            i10 = v.l(this.f27996d) ? 1 : 2;
        }
        if (this.H != i10) {
            this.H = i10;
            ?? r02 = i10 == 1 ? 0 : 1;
            this.P = r02;
            this.f28005j.setBackgroundResource(this.f28006k[r02]);
            int iMax = Math.max(0, (this.f28009n - this.f28005j.getPaddingLeft()) - this.f28005j.getPaddingRight());
            this.f28000f.setMinimumWidth(iMax);
            this.f28002g.setMinimumWidth(iMax);
            int iMax2 = Math.max(0, (this.f28010o - this.f28005j.getPaddingTop()) - this.f28005j.getPaddingBottom());
            this.f28000f.setMinimumHeight(iMax2);
            this.f28002g.setMinimumHeight(iMax2);
            j0();
        }
    }

    public void W(boolean z10) {
        this.f27995c0 = z10;
    }

    public void Y(int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f27996d.getContext().obtainStyledAttributes(null, k3.l.f19334r0, k3.b.f19156d, i10);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == k3.l.A0) {
                this.S = typedArrayObtainStyledAttributes.getInt(index, 0);
            } else if (index == k3.l.f19369y0) {
                this.f28006k[0] = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == k3.l.f19374z0) {
                this.f28006k[1] = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == k3.l.B0) {
                this.f28015t = typedArrayObtainStyledAttributes.getDrawable(index);
            } else if (index == k3.l.F0) {
                this.f28016u = typedArrayObtainStyledAttributes.getDrawable(index);
            } else if (index == k3.l.f19339s0) {
                this.f28017v = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == k3.l.f19349u0) {
                this.f28014s = typedArrayObtainStyledAttributes.getColorStateList(index);
            } else if (index == k3.l.f19344t0) {
                this.f28013r = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == k3.l.f19359w0) {
                this.f28009n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == k3.l.f19364x0) {
                this.f28010o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == k3.l.D0) {
                this.f28011p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == k3.l.C0) {
                this.f28012q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == k3.l.f19354v0) {
                this.f28008m = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == k3.l.E0) {
                this.f28018w = typedArrayObtainStyledAttributes.getInt(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        g0();
    }

    public void b0() {
        X(0);
    }

    public void j0() {
        if (this.K) {
            return;
        }
        this.K = true;
        h0();
        A();
        B();
        z();
        l0();
        Rect rect = this.f27990a;
        E(this.f28000f, rect);
        g(this.f28000f, rect);
        E(this.f28002g, rect);
        g(this.f28002g, rect);
        View view = this.f28005j;
        if (view != null) {
            rect.left -= view.getPaddingLeft();
            rect.top -= this.f28005j.getPaddingTop();
            rect.right += this.f28005j.getPaddingRight();
            rect.bottom += this.f28005j.getPaddingBottom();
            g(this.f28005j, rect);
        }
        this.K = false;
    }

    public int s() {
        return this.f28021z;
    }

    public boolean u() {
        return this.R;
    }

    public boolean v() {
        if (this.Q) {
            return this.I || this.R;
        }
        return false;
    }
}
