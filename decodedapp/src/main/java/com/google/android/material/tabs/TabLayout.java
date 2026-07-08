package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.viewpager.widget.ViewPager;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.material.internal.m;
import com.google.android.material.internal.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import m0.f0;
import m0.o0;
import n0.x;
import u8.k;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
@ViewPager.e
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: j0 */
    private static final int f8256j0 = k.f28733i;

    /* JADX INFO: renamed from: k0 */
    private static final l0.d f8257k0 = new l0.f(16);
    float A;
    float B;
    float C;
    final int D;
    int E;
    private final int F;
    private final int G;
    private final int H;
    private int I;
    int J;
    int K;
    int L;
    int M;
    boolean N;
    boolean O;
    int P;
    int Q;
    boolean R;
    private com.google.android.material.tabs.c S;
    private final TimeInterpolator T;
    private c U;
    private final ArrayList V;
    private c W;

    /* JADX INFO: renamed from: a */
    int f8258a;

    /* JADX INFO: renamed from: a0 */
    private ValueAnimator f8259a0;

    /* JADX INFO: renamed from: b */
    private final ArrayList f8260b;

    /* JADX INFO: renamed from: b0 */
    ViewPager f8261b0;

    /* JADX INFO: renamed from: c */
    private g f8262c;

    /* JADX INFO: renamed from: c0 */
    private androidx.viewpager.widget.a f8263c0;

    /* JADX INFO: renamed from: d */
    final f f8264d;

    /* JADX INFO: renamed from: d0 */
    private DataSetObserver f8265d0;

    /* JADX INFO: renamed from: e */
    int f8266e;

    /* JADX INFO: renamed from: e0 */
    private h f8267e0;

    /* JADX INFO: renamed from: f */
    int f8268f;

    /* JADX INFO: renamed from: f0 */
    private b f8269f0;

    /* JADX INFO: renamed from: g */
    int f8270g;

    /* JADX INFO: renamed from: g0 */
    private boolean f8271g0;

    /* JADX INFO: renamed from: h */
    int f8272h;

    /* JADX INFO: renamed from: h0 */
    private int f8273h0;

    /* JADX INFO: renamed from: i0 */
    private final l0.d f8274i0;

    /* JADX INFO: renamed from: r */
    private final int f8275r;

    /* JADX INFO: renamed from: s */
    private final int f8276s;

    /* JADX INFO: renamed from: t */
    private int f8277t;

    /* JADX INFO: renamed from: u */
    ColorStateList f8278u;

    /* JADX INFO: renamed from: v */
    ColorStateList f8279v;

    /* JADX INFO: renamed from: w */
    ColorStateList f8280w;

    /* JADX INFO: renamed from: x */
    Drawable f8281x;

    /* JADX INFO: renamed from: y */
    private int f8282y;

    /* JADX INFO: renamed from: z */
    PorterDuff.Mode f8283z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class b implements ViewPager.i {

        /* JADX INFO: renamed from: a */
        private boolean f8285a;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f8261b0 == viewPager) {
                tabLayout.M(aVar2, this.f8285a);
            }
        }

        void b(boolean z10) {
            this.f8285a = z10;
        }
    }

    public interface c {
        void N0(g gVar);

        void a0(g gVar);

        void t(g gVar);
    }

    public interface d extends c {
    }

    private class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.F();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.F();
        }
    }

    class f extends LinearLayout {

        /* JADX INFO: renamed from: a */
        ValueAnimator f8288a;

        /* JADX INFO: renamed from: b */
        private int f8289b;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ View f8291a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ View f8292b;

            a(View view, View view2) {
                this.f8291a = view;
                this.f8292b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.j(this.f8291a, this.f8292b, valueAnimator.getAnimatedFraction());
            }
        }

        f(Context context) {
            super(context);
            this.f8289b = -1;
            setWillNotDraw(false);
        }

        private void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f8258a == -1) {
                tabLayout.f8258a = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f8258a);
        }

        private void f(int i10) {
            if (TabLayout.this.f8273h0 == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                com.google.android.material.tabs.c cVar = TabLayout.this.S;
                TabLayout tabLayout = TabLayout.this;
                cVar.c(tabLayout, childAt, tabLayout.f8281x);
                TabLayout.this.f8258a = i10;
            }
        }

        public void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        public void j(View view, View view2, float f10) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f8281x;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f8281x.getBounds().bottom);
            } else {
                com.google.android.material.tabs.c cVar = TabLayout.this.S;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f10, tabLayout.f8281x);
            }
            postInvalidateOnAnimation();
        }

        private void k(boolean z10, int i10, int i11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f8258a == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.f8258a = i10;
            a aVar = new a(childAt, childAt2);
            if (!z10) {
                this.f8288a.removeAllUpdateListeners();
                this.f8288a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f8288a = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.T);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        void c(int i10, int i11) {
            ValueAnimator valueAnimator = this.f8288a;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f8258a != i10) {
                this.f8288a.cancel();
            }
            k(true, i10, i11);
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.f8281x.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f8281x.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.L;
            if (i10 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i10 != 1) {
                height = 0;
                if (i10 != 2) {
                    iHeight = i10 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.f8281x.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f8281x.getBounds();
                TabLayout.this.f8281x.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.f8281x.draw(canvas);
            }
            super.draw(canvas);
        }

        void h(int i10, float f10) {
            TabLayout.this.f8258a = Math.round(i10 + f10);
            ValueAnimator valueAnimator = this.f8288a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f8288a.cancel();
            }
            j(getChildAt(i10), getChildAt(i10 + 1), f10);
        }

        void i(int i10) {
            Rect bounds = TabLayout.this.f8281x.getBounds();
            TabLayout.this.f8281x.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f8288a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.J == 1 || tabLayout.M == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) p.c(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.J = 0;
                    tabLayout2.U(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
            if (Build.VERSION.SDK_INT >= 23 || this.f8289b == i10) {
                return;
            }
            requestLayout();
            this.f8289b = i10;
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a */
        private Object f8294a;

        /* JADX INFO: renamed from: b */
        private Drawable f8295b;

        /* JADX INFO: renamed from: c */
        private CharSequence f8296c;

        /* JADX INFO: renamed from: d */
        private CharSequence f8297d;

        /* JADX INFO: renamed from: f */
        private View f8299f;

        /* JADX INFO: renamed from: h */
        public TabLayout f8301h;

        /* JADX INFO: renamed from: i */
        public i f8302i;

        /* JADX INFO: renamed from: e */
        private int f8298e = -1;

        /* JADX INFO: renamed from: g */
        private int f8300g = 1;

        /* JADX INFO: renamed from: j */
        private int f8303j = -1;

        public View e() {
            return this.f8299f;
        }

        public Drawable f() {
            return this.f8295b;
        }

        public int g() {
            return this.f8298e;
        }

        public int h() {
            return this.f8300g;
        }

        public CharSequence i() {
            return this.f8296c;
        }

        public boolean j() {
            TabLayout tabLayout = this.f8301h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f8298e;
        }

        void k() {
            this.f8301h = null;
            this.f8302i = null;
            this.f8294a = null;
            this.f8295b = null;
            this.f8303j = -1;
            this.f8296c = null;
            this.f8297d = null;
            this.f8298e = -1;
            this.f8299f = null;
        }

        public void l() {
            TabLayout tabLayout = this.f8301h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.K(this);
        }

        public g m(CharSequence charSequence) {
            this.f8297d = charSequence;
            s();
            return this;
        }

        public g n(int i10) {
            return o(LayoutInflater.from(this.f8302i.getContext()).inflate(i10, (ViewGroup) this.f8302i, false));
        }

        public g o(View view) {
            this.f8299f = view;
            s();
            return this;
        }

        public g p(Drawable drawable) {
            this.f8295b = drawable;
            TabLayout tabLayout = this.f8301h;
            if (tabLayout.J == 1 || tabLayout.M == 2) {
                tabLayout.U(true);
            }
            s();
            return this;
        }

        void q(int i10) {
            this.f8298e = i10;
        }

        public g r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f8297d) && !TextUtils.isEmpty(charSequence)) {
                this.f8302i.setContentDescription(charSequence);
            }
            this.f8296c = charSequence;
            s();
            return this;
        }

        void s() {
            i iVar = this.f8302i;
            if (iVar != null) {
                iVar.p();
            }
        }
    }

    public static class h implements ViewPager.j {

        /* JADX INFO: renamed from: a */
        private final WeakReference f8304a;

        /* JADX INFO: renamed from: b */
        private int f8305b;

        /* JADX INFO: renamed from: c */
        private int f8306c;

        public h(TabLayout tabLayout) {
            this.f8304a = new WeakReference(tabLayout);
        }

        void a() {
            this.f8306c = 0;
            this.f8305b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void e(int i10, float f10, int i11) {
            TabLayout tabLayout = (TabLayout) this.f8304a.get();
            if (tabLayout != null) {
                int i12 = this.f8306c;
                boolean z10 = true;
                if (i12 == 2 && this.f8305b != 1) {
                    z10 = false;
                }
                boolean z11 = true;
                if (i12 == 2 && this.f8305b == 0) {
                    z11 = false;
                }
                tabLayout.P(i10, f10, z10, z11, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void l0(int i10) {
            this.f8305b = this.f8306c;
            this.f8306c = i10;
            TabLayout tabLayout = (TabLayout) this.f8304a.get();
            if (tabLayout != null) {
                tabLayout.V(this.f8306c);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void n0(int i10) {
            TabLayout tabLayout = (TabLayout) this.f8304a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f8306c;
            tabLayout.L(tabLayout.B(i10), i11 == 0 || (i11 == 2 && this.f8305b == 0));
        }
    }

    public final class i extends LinearLayout {

        /* JADX INFO: renamed from: a */
        private g f8307a;

        /* JADX INFO: renamed from: b */
        private TextView f8308b;

        /* JADX INFO: renamed from: c */
        private ImageView f8309c;

        /* JADX INFO: renamed from: d */
        private View f8310d;

        /* JADX INFO: renamed from: e */
        private w8.a f8311e;

        /* JADX INFO: renamed from: f */
        private View f8312f;

        /* JADX INFO: renamed from: g */
        private TextView f8313g;

        /* JADX INFO: renamed from: h */
        private ImageView f8314h;

        /* JADX INFO: renamed from: r */
        private Drawable f8315r;

        /* JADX INFO: renamed from: s */
        private int f8316s;

        class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ View f8318a;

            a(View view) {
                this.f8318a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f8318a.getVisibility() == 0) {
                    i.this.o(this.f8318a);
                }
            }
        }

        public i(Context context) {
            super(context);
            this.f8316s = 2;
            q(context);
            setPaddingRelative(TabLayout.this.f8266e, TabLayout.this.f8268f, TabLayout.this.f8270g, TabLayout.this.f8272h);
            setGravity(17);
            setOrientation(!TabLayout.this.N ? 1 : 0);
            setClickable(true);
            o0.z0(this, f0.b(getContext(), CloseCodes.PROTOCOL_ERROR));
        }

        private void d(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float e(Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        private void f(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        public void g(Canvas canvas) {
            Drawable drawable = this.f8315r;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f8315r.draw(canvas);
            }
        }

        private w8.a getBadge() {
            return this.f8311e;
        }

        private w8.a getOrCreateBadge() {
            if (this.f8311e == null) {
                this.f8311e = w8.a.e(getContext());
            }
            n();
            w8.a aVar = this.f8311e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private boolean h() {
            return this.f8311e != null;
        }

        private void i() {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(u8.h.f28675d, (ViewGroup) this, false);
            this.f8309c = imageView;
            addView(imageView, 0);
        }

        private void j() {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(u8.h.f28676e, (ViewGroup) this, false);
            this.f8308b = textView;
            addView(textView);
        }

        private void l(View view) {
            if (h() && view != null) {
                f(false);
                w8.d.b(this.f8311e, view, null);
                this.f8310d = view;
            }
        }

        private void m() {
            if (h()) {
                f(true);
                View view = this.f8310d;
                if (view != null) {
                    w8.d.e(this.f8311e, view);
                    this.f8310d = null;
                }
            }
        }

        private void n() {
            g gVar;
            g gVar2;
            if (h()) {
                if (this.f8312f != null) {
                    m();
                    return;
                }
                if (this.f8309c != null && (gVar2 = this.f8307a) != null && gVar2.f() != null) {
                    View view = this.f8310d;
                    ImageView imageView = this.f8309c;
                    if (view == imageView) {
                        o(imageView);
                        return;
                    } else {
                        m();
                        l(this.f8309c);
                        return;
                    }
                }
                if (this.f8308b == null || (gVar = this.f8307a) == null || gVar.h() != 1) {
                    m();
                    return;
                }
                View view2 = this.f8310d;
                TextView textView = this.f8308b;
                if (view2 == textView) {
                    o(textView);
                } else {
                    m();
                    l(this.f8308b);
                }
            }
        }

        public void o(View view) {
            if (h() && view == this.f8310d) {
                w8.d.f(this.f8311e, view, null);
            }
        }

        public void q(Context context) {
            int i10 = TabLayout.this.D;
            if (i10 != 0) {
                Drawable drawableB = i.a.b(context, i10);
                this.f8315r = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.f8315r.setState(getDrawableState());
                }
            } else {
                this.f8315r = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            Drawable rippleDrawable = gradientDrawable;
            if (TabLayout.this.f8280w != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = k9.a.a(TabLayout.this.f8280w);
                boolean z10 = TabLayout.this.R;
                GradientDrawable gradientDrawable3 = gradientDrawable;
                if (z10) {
                    gradientDrawable3 = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable3, z10 ? null : gradientDrawable2);
            }
            setBackground(rippleDrawable);
            TabLayout.this.invalidate();
        }

        /* JADX WARN: Removed duplicated region for block: B:93:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void t(android.widget.TextView r8, android.widget.ImageView r9, boolean r10) {
            /*
                Method dump skipped, instruction units count: 211
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.t(android.widget.TextView, android.widget.ImageView, boolean):void");
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f8315r;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f8315r.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.f8308b, this.f8309c, this.f8312f};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z10 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        int getContentWidth() {
            View[] viewArr = {this.f8308b, this.f8309c, this.f8312f};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z10 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        public g getTab() {
            return this.f8307a;
        }

        void k() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            x xVarY0 = x.Y0(accessibilityNodeInfo);
            w8.a aVar = this.f8311e;
            if (aVar != null && aVar.isVisible()) {
                xVarY0.x0(this.f8311e.j());
            }
            xVarY0.w0(x.g.a(0, 1, this.f8307a.g(), 1, false, isSelected()));
            if (isSelected()) {
                xVarY0.u0(false);
                xVarY0.k0(x.a.f22372i);
            }
            xVarY0.M0(getResources().getString(u8.j.f28706h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.E, RtlSpacingHelper.UNDEFINED);
            }
            super.onMeasure(i10, i11);
            if (this.f8308b != null) {
                float f10 = TabLayout.this.A;
                if (isSelected() && TabLayout.this.f8277t != -1) {
                    f10 = TabLayout.this.B;
                }
                int i12 = this.f8316s;
                ImageView imageView = this.f8309c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f8308b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.C;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f8308b.getTextSize();
                int lineCount = this.f8308b.getLineCount();
                int maxLines = this.f8308b.getMaxLines();
                if (f10 != textSize || (maxLines >= 0 && i12 != maxLines)) {
                    if (TabLayout.this.M != 1 || f10 <= textSize || lineCount != 1 || ((layout = this.f8308b.getLayout()) != null && e(layout, 0, f10) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f8308b.setTextSize(0, f10);
                        this.f8308b.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        final void p() {
            s();
            g gVar = this.f8307a;
            setSelected(gVar != null && gVar.j());
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f8307a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f8307a.l();
            return true;
        }

        final void r() {
            setOrientation(!TabLayout.this.N ? 1 : 0);
            TextView textView = this.f8313g;
            if (textView == null && this.f8314h == null) {
                t(this.f8308b, this.f8309c, true);
            } else {
                t(textView, this.f8314h, false);
            }
        }

        final void s() {
            ViewParent parent;
            g gVar = this.f8307a;
            View viewE = gVar != null ? gVar.e() : null;
            if (viewE != null) {
                ViewParent parent2 = viewE.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(viewE);
                    }
                    View view = this.f8312f;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f8312f);
                    }
                    addView(viewE);
                }
                this.f8312f = viewE;
                TextView textView = this.f8308b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f8309c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f8309c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewE.findViewById(R.id.text1);
                this.f8313g = textView2;
                if (textView2 != null) {
                    this.f8316s = textView2.getMaxLines();
                }
                this.f8314h = (ImageView) viewE.findViewById(R.id.icon);
            } else {
                View view2 = this.f8312f;
                if (view2 != null) {
                    removeView(view2);
                    this.f8312f = null;
                }
                this.f8313g = null;
                this.f8314h = null;
            }
            if (this.f8312f == null) {
                if (this.f8309c == null) {
                    i();
                }
                if (this.f8308b == null) {
                    j();
                    this.f8316s = this.f8308b.getMaxLines();
                }
                androidx.core.widget.j.m(this.f8308b, TabLayout.this.f8275r);
                if (!isSelected() || TabLayout.this.f8277t == -1) {
                    androidx.core.widget.j.m(this.f8308b, TabLayout.this.f8276s);
                } else {
                    androidx.core.widget.j.m(this.f8308b, TabLayout.this.f8277t);
                }
                ColorStateList colorStateList = TabLayout.this.f8278u;
                if (colorStateList != null) {
                    this.f8308b.setTextColor(colorStateList);
                }
                t(this.f8308b, this.f8309c, true);
                n();
                d(this.f8309c);
                d(this.f8308b);
            } else {
                TextView textView3 = this.f8313g;
                if (textView3 != null || this.f8314h != null) {
                    t(textView3, this.f8314h, false);
                }
            }
            if (gVar == null || TextUtils.isEmpty(gVar.f8297d)) {
                return;
            }
            setContentDescription(gVar.f8297d);
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f8308b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f8309c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f8312f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        void setTab(g gVar) {
            if (gVar != this.f8307a) {
                this.f8307a = gVar;
                p();
            }
        }
    }

    public static class j implements d {

        /* JADX INFO: renamed from: a */
        private final ViewPager f8320a;

        public j(ViewPager viewPager) {
            this.f8320a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void N0(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a0(g gVar) {
            this.f8320a.setCurrentItem(gVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void t(g gVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u8.b.X);
    }

    private void A() {
        if (this.f8259a0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f8259a0 = valueAnimator;
            valueAnimator.setInterpolator(this.T);
            this.f8259a0.setDuration(this.K);
            this.f8259a0.addUpdateListener(new a());
        }
    }

    private boolean C() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void J(int i10) {
        i iVar = (i) this.f8264d.getChildAt(i10);
        this.f8264d.removeViewAt(i10);
        if (iVar != null) {
            iVar.k();
            this.f8274i0.a(iVar);
        }
        requestLayout();
    }

    private void R(ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.f8261b0;
        if (viewPager2 != null) {
            h hVar = this.f8267e0;
            if (hVar != null) {
                viewPager2.J(hVar);
            }
            b bVar = this.f8269f0;
            if (bVar != null) {
                this.f8261b0.I(bVar);
            }
        }
        c cVar = this.W;
        if (cVar != null) {
            I(cVar);
            this.W = null;
        }
        if (viewPager != null) {
            this.f8261b0 = viewPager;
            if (this.f8267e0 == null) {
                this.f8267e0 = new h(this);
            }
            this.f8267e0.a();
            viewPager.d(this.f8267e0);
            j jVar = new j(viewPager);
            this.W = jVar;
            g(jVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                M(adapter, z10);
            }
            if (this.f8269f0 == null) {
                this.f8269f0 = new b();
            }
            this.f8269f0.b(z10);
            viewPager.c(this.f8269f0);
            N(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f8261b0 = null;
            M(null, false);
        }
        this.f8271g0 = z11;
    }

    private void S() {
        int size = this.f8260b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) this.f8260b.get(i10)).s();
        }
    }

    private void T(LinearLayout.LayoutParams layoutParams) {
        if (this.M == 1 && this.J == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private int getDefaultHeight() {
        int size = this.f8260b.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f8260b.get(i10);
            if (gVar != null && gVar.f() != null && !TextUtils.isEmpty(gVar.i())) {
                return !this.N ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.F;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.M;
        if (i11 == 0 || i11 == 2) {
            return this.H;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f8264d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void l(TabItem tabItem) {
        g gVarE = E();
        CharSequence charSequence = tabItem.f8253a;
        if (charSequence != null) {
            gVarE.r(charSequence);
        }
        Drawable drawable = tabItem.f8254b;
        if (drawable != null) {
            gVarE.p(drawable);
        }
        int i10 = tabItem.f8255c;
        if (i10 != 0) {
            gVarE.n(i10);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            gVarE.m(tabItem.getContentDescription());
        }
        i(gVarE);
    }

    private void m(g gVar) {
        i iVar = gVar.f8302i;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f8264d.addView(iVar, gVar.g(), u());
    }

    private void n(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        l((TabItem) view);
    }

    private void o(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() == null || !isLaidOut() || this.f8264d.d()) {
            N(i10, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iR = r(i10, 0.0f);
        if (scrollX != iR) {
            A();
            this.f8259a0.setIntValues(scrollX, iR);
            this.f8259a0.start();
        }
        this.f8264d.c(i10, this.K);
    }

    private void p(int i10) {
        if (i10 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i10 == 1) {
            this.f8264d.setGravity(1);
            return;
        } else if (i10 != 2) {
            return;
        }
        this.f8264d.setGravity(8388611);
    }

    private void q() {
        int i10 = this.M;
        this.f8264d.setPaddingRelative((i10 == 0 || i10 == 2) ? Math.max(0, this.I - this.f8266e) : 0, 0, 0, 0);
        int i11 = this.M;
        if (i11 == 0) {
            p(this.J);
        } else if (i11 == 1 || i11 == 2) {
            if (this.J == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f8264d.setGravity(1);
        }
        U(true);
    }

    private int r(int i10, float f10) {
        View childAt;
        int i11 = this.M;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f8264d.getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < this.f8264d.getChildCount() ? this.f8264d.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return getLayoutDirection() == 0 ? left + i13 : left - i13;
    }

    private void s(g gVar, int i10) {
        gVar.q(i10);
        this.f8260b.add(i10, gVar);
        int size = this.f8260b.size();
        int i11 = -1;
        for (int i12 = i10 + 1; i12 < size; i12++) {
            if (((g) this.f8260b.get(i12)).g() == this.f8258a) {
                i11 = i12;
            }
            ((g) this.f8260b.get(i12)).q(i12);
        }
        this.f8258a = i11;
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f8264d.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f8264d.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof i) {
                        ((i) childAt).s();
                    }
                }
                i11++;
            }
        }
    }

    private static ColorStateList t(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private LinearLayout.LayoutParams u() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        T(layoutParams);
        return layoutParams;
    }

    private i w(g gVar) {
        l0.d dVar = this.f8274i0;
        i iVar = dVar != null ? (i) dVar.b() : null;
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f8297d)) {
            iVar.setContentDescription(gVar.f8296c);
            return iVar;
        }
        iVar.setContentDescription(gVar.f8297d);
        return iVar;
    }

    private void x(g gVar) {
        for (int size = this.V.size() - 1; size >= 0; size--) {
            ((c) this.V.get(size)).t(gVar);
        }
    }

    private void y(g gVar) {
        for (int size = this.V.size() - 1; size >= 0; size--) {
            ((c) this.V.get(size)).a0(gVar);
        }
    }

    private void z(g gVar) {
        for (int size = this.V.size() - 1; size >= 0; size--) {
            ((c) this.V.get(size)).N0(gVar);
        }
    }

    public g B(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return (g) this.f8260b.get(i10);
    }

    public boolean D() {
        return this.O;
    }

    public g E() {
        g gVarV = v();
        gVarV.f8301h = this;
        gVarV.f8302i = w(gVarV);
        if (gVarV.f8303j != -1) {
            gVarV.f8302i.setId(gVarV.f8303j);
        }
        return gVarV;
    }

    void F() {
        int currentItem;
        H();
        androidx.viewpager.widget.a aVar = this.f8263c0;
        if (aVar != null) {
            int iC = aVar.c();
            for (int i10 = 0; i10 < iC; i10++) {
                k(E().r(this.f8263c0.e(i10)), false);
            }
            ViewPager viewPager = this.f8261b0;
            if (viewPager == null || iC <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            K(B(currentItem));
        }
    }

    protected boolean G(g gVar) {
        return f8257k0.a(gVar);
    }

    public void H() {
        for (int childCount = this.f8264d.getChildCount() - 1; childCount >= 0; childCount--) {
            J(childCount);
        }
        Iterator it = this.f8260b.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            gVar.k();
            G(gVar);
        }
        this.f8262c = null;
    }

    public void I(c cVar) {
        this.V.remove(cVar);
    }

    public void K(g gVar) {
        L(gVar, true);
    }

    public void L(g gVar, boolean z10) {
        g gVar2 = this.f8262c;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                x(gVar);
                o(gVar.g());
                return;
            }
            return;
        }
        int iG = gVar != null ? gVar.g() : -1;
        if (z10) {
            if ((gVar2 == null || gVar2.g() == -1) && iG != -1) {
                N(iG, 0.0f, true);
            } else {
                o(iG);
            }
            if (iG != -1) {
                setSelectedTabView(iG);
            }
        }
        this.f8262c = gVar;
        if (gVar2 != null && gVar2.f8301h != null) {
            z(gVar2);
        }
        if (gVar != null) {
            y(gVar);
        }
    }

    void M(androidx.viewpager.widget.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.f8263c0;
        if (aVar2 != null && (dataSetObserver = this.f8265d0) != null) {
            aVar2.o(dataSetObserver);
        }
        this.f8263c0 = aVar;
        if (z10 && aVar != null) {
            if (this.f8265d0 == null) {
                this.f8265d0 = new e();
            }
            aVar.i(this.f8265d0);
        }
        F();
    }

    public void N(int i10, float f10, boolean z10) {
        O(i10, f10, z10, true);
    }

    public void O(int i10, float f10, boolean z10, boolean z11) {
        P(i10, f10, z10, z11, true);
    }

    void P(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        int iRound = Math.round(i10 + f10);
        if (iRound < 0 || iRound >= this.f8264d.getChildCount()) {
            return;
        }
        if (z11) {
            this.f8264d.h(i10, f10);
        }
        ValueAnimator valueAnimator = this.f8259a0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8259a0.cancel();
        }
        int iR = r(i10, f10);
        int scrollX = getScrollX();
        boolean z13 = (i10 < getSelectedTabPosition() && iR >= scrollX) || (i10 > getSelectedTabPosition() && iR <= scrollX) || i10 == getSelectedTabPosition();
        if (getLayoutDirection() == 1) {
            z13 = (i10 < getSelectedTabPosition() && iR <= scrollX) || (i10 > getSelectedTabPosition() && iR >= scrollX) || i10 == getSelectedTabPosition();
        }
        if (z13 || this.f8273h0 == 1 || z12) {
            if (i10 < 0) {
                iR = 0;
            }
            scrollTo(iR, 0);
        }
        if (z10) {
            setSelectedTabView(iRound);
        }
    }

    public void Q(ViewPager viewPager, boolean z10) {
        R(viewPager, z10, false);
    }

    void U(boolean z10) {
        for (int i10 = 0; i10 < this.f8264d.getChildCount(); i10++) {
            View childAt = this.f8264d.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            T((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    void V(int i10) {
        this.f8273h0 = i10;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        n(view);
    }

    public void g(c cVar) {
        if (this.V.contains(cVar)) {
            return;
        }
        this.V.add(cVar);
    }

    public int getSelectedTabPosition() {
        g gVar = this.f8262c;
        if (gVar != null) {
            return gVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f8260b.size();
    }

    public int getTabGravity() {
        return this.J;
    }

    public ColorStateList getTabIconTint() {
        return this.f8279v;
    }

    public int getTabIndicatorAnimationMode() {
        return this.Q;
    }

    public int getTabIndicatorGravity() {
        return this.L;
    }

    int getTabMaxWidth() {
        return this.E;
    }

    public int getTabMode() {
        return this.M;
    }

    public ColorStateList getTabRippleColor() {
        return this.f8280w;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f8281x;
    }

    public ColorStateList getTabTextColors() {
        return this.f8278u;
    }

    public void h(d dVar) {
        g(dVar);
    }

    public void i(g gVar) {
        k(gVar, this.f8260b.isEmpty());
    }

    public void j(g gVar, int i10, boolean z10) {
        if (gVar.f8301h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        s(gVar, i10);
        m(gVar);
        if (z10) {
            gVar.l();
        }
    }

    public void k(g gVar, boolean z10) {
        j(gVar, this.f8260b.size(), z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9.i.e(this);
        if (this.f8261b0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                R((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f8271g0) {
            setupWithViewPager(null);
            this.f8271g0 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f8264d.getChildCount(); i10++) {
            View childAt = this.f8264d.getChildAt(i10);
            if (childAt instanceof i) {
                ((i) childAt).g(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        x.Y0(accessibilityNodeInfo).v0(x.f.a(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return C() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.p.c(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.G
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.p.c(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.E = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.M
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto Laa
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L81
            goto L8c
        L81:
            return
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto Laa
        L8c:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || C()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        m9.i.d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.N != z10) {
            this.N = z10;
            for (int i10 = 0; i10 < this.f8264d.getChildCount(); i10++) {
                View childAt = this.f8264d.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).r();
                }
            }
            q();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A();
        this.f8259a0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = e0.a.r(drawable).mutate();
        this.f8281x = drawableMutate;
        com.google.android.material.drawable.c.k(drawableMutate, this.f8282y);
        int intrinsicHeight = this.P;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f8281x.getIntrinsicHeight();
        }
        this.f8264d.i(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f8282y = i10;
        com.google.android.material.drawable.c.k(this.f8281x, i10);
        U(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.L != i10) {
            this.L = i10;
            this.f8264d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.P = i10;
        this.f8264d.i(i10);
    }

    public void setTabGravity(int i10) {
        if (this.J != i10) {
            this.J = i10;
            q();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f8279v != colorStateList) {
            this.f8279v = colorStateList;
            S();
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(i.a.a(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.Q = i10;
        if (i10 == 0) {
            this.S = new com.google.android.material.tabs.c();
            return;
        }
        if (i10 == 1) {
            this.S = new com.google.android.material.tabs.a();
        } else {
            if (i10 == 2) {
                this.S = new com.google.android.material.tabs.b();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.O = z10;
        this.f8264d.g();
        this.f8264d.postInvalidateOnAnimation();
    }

    public void setTabMode(int i10) {
        if (i10 != this.M) {
            this.M = i10;
            q();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f8280w != colorStateList) {
            this.f8280w = colorStateList;
            for (int i10 = 0; i10 < this.f8264d.getChildCount(); i10++) {
                View childAt = this.f8264d.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).q(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(i.a.a(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f8278u != colorStateList) {
            this.f8278u = colorStateList;
            S();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        M(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            for (int i10 = 0; i10 < this.f8264d.getChildCount(); i10++) {
                View childAt = this.f8264d.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).q(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        Q(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    protected g v() {
        g gVar = (g) f8257k0.b();
        return gVar == null ? new g() : gVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f8256j0;
        super(q9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f8258a = -1;
        this.f8260b = new ArrayList();
        this.f8277t = -1;
        this.f8282y = 0;
        this.E = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.P = -1;
        this.V = new ArrayList();
        this.f8274i0 = new l0.e(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f8264d = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = l.W5;
        int i12 = l.f28948v6;
        TypedArray typedArrayI = m.i(context2, attributeSet, iArr, i10, i11, i12);
        ColorStateList colorStateListF = com.google.android.material.drawable.c.f(getBackground());
        if (colorStateListF != null) {
            m9.h hVar = new m9.h();
            hVar.c0(colorStateListF);
            hVar.Q(context2);
            hVar.b0(getElevation());
            setBackground(hVar);
        }
        setSelectedTabIndicator(j9.c.e(context2, typedArrayI, l.f28777c6));
        setSelectedTabIndicatorColor(typedArrayI.getColor(l.f28804f6, 0));
        fVar.i(typedArrayI.getDimensionPixelSize(l.f28831i6, -1));
        setSelectedTabIndicatorGravity(typedArrayI.getInt(l.f28822h6, 0));
        setTabIndicatorAnimationMode(typedArrayI.getInt(l.f28795e6, 0));
        setTabIndicatorFullWidth(typedArrayI.getBoolean(l.f28813g6, true));
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(l.f28876n6, 0);
        this.f8272h = dimensionPixelSize;
        this.f8270g = dimensionPixelSize;
        this.f8268f = dimensionPixelSize;
        this.f8266e = dimensionPixelSize;
        this.f8266e = typedArrayI.getDimensionPixelSize(l.f28903q6, dimensionPixelSize);
        this.f8268f = typedArrayI.getDimensionPixelSize(l.f28912r6, this.f8268f);
        this.f8270g = typedArrayI.getDimensionPixelSize(l.f28894p6, this.f8270g);
        this.f8272h = typedArrayI.getDimensionPixelSize(l.f28885o6, this.f8272h);
        if (m.g(context2)) {
            this.f8275r = u8.b.f28543a0;
        } else {
            this.f8275r = u8.b.Y;
        }
        int resourceId = typedArrayI.getResourceId(i12, k.f28727c);
        this.f8276s = resourceId;
        int[] iArr2 = h.j.f14929c3;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr2);
        try {
            int i13 = h.j.f14935d3;
            this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, 0);
            int i14 = h.j.f14953g3;
            this.f8278u = j9.c.a(context2, typedArrayObtainStyledAttributes, i14);
            typedArrayObtainStyledAttributes.recycle();
            int i15 = l.f28930t6;
            if (typedArrayI.hasValue(i15)) {
                this.f8277t = typedArrayI.getResourceId(i15, resourceId);
            }
            int i16 = this.f8277t;
            if (i16 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i16, iArr2);
                try {
                    this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, (int) this.A);
                    ColorStateList colorStateListA = j9.c.a(context2, typedArrayObtainStyledAttributes, i14);
                    if (colorStateListA != null) {
                        this.f8278u = t(this.f8278u.getDefaultColor(), colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor()));
                    }
                } finally {
                }
            }
            int i17 = l.f28957w6;
            if (typedArrayI.hasValue(i17)) {
                this.f8278u = j9.c.a(context2, typedArrayI, i17);
            }
            int i18 = l.f28939u6;
            if (typedArrayI.hasValue(i18)) {
                this.f8278u = t(this.f8278u.getDefaultColor(), typedArrayI.getColor(i18, 0));
            }
            this.f8279v = j9.c.a(context2, typedArrayI, l.f28758a6);
            this.f8283z = p.h(typedArrayI.getInt(l.f28768b6, -1), null);
            this.f8280w = j9.c.a(context2, typedArrayI, l.f28921s6);
            this.K = typedArrayI.getInt(l.f28786d6, 300);
            this.T = h9.d.g(context2, u8.b.G, v8.a.f30493b);
            this.F = typedArrayI.getDimensionPixelSize(l.f28858l6, -1);
            this.G = typedArrayI.getDimensionPixelSize(l.f28849k6, -1);
            this.D = typedArrayI.getResourceId(l.X5, 0);
            this.I = typedArrayI.getDimensionPixelSize(l.Y5, 0);
            this.M = typedArrayI.getInt(l.f28867m6, 1);
            this.J = typedArrayI.getInt(l.Z5, 0);
            this.N = typedArrayI.getBoolean(l.f28840j6, false);
            this.R = typedArrayI.getBoolean(l.f28966x6, false);
            typedArrayI.recycle();
            Resources resources = getResources();
            this.C = resources.getDimensionPixelSize(u8.d.f28611p);
            this.H = resources.getDimensionPixelSize(u8.d.f28609o);
            q();
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        n(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.U;
        if (cVar2 != null) {
            I(cVar2);
        }
        this.U = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        n(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        n(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(i.a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
