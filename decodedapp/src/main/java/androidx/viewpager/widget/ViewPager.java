package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import m0.b0;
import m0.i1;
import m0.o0;
import n0.x;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    static final int[] f3582o0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final Comparator f3583p0 = new a();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Interpolator f3584q0 = new b();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final m f3585r0 = new m();
    private float A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private int G;
    private boolean H;
    private boolean I;
    private int J;
    private int K;
    private int L;
    private float M;
    private float N;
    private float O;
    private float P;
    private int Q;
    private VelocityTracker R;
    private int S;
    private int T;
    private int U;
    private int V;
    private boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3586a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private EdgeEffect f3587a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f3588b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private EdgeEffect f3589b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f3590c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f3591c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f3592d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f3593d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.viewpager.widget.a f3594e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f3595e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f3596f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f3597f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f3598g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private List f3599g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Parcelable f3600h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private j f3601h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private j f3602i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private List f3603j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f3604k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private ArrayList f3605l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final Runnable f3606m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f3607n0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ClassLoader f3608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Scroller f3609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f3610t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private k f3611u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f3612v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Drawable f3613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f3614x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f3615y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f3616z;

    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f3621b - fVar2.f3621b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.E();
        }
    }

    class d implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f3618a = new Rect();

        d() {
        }

        @Override // m0.b0
        public i1 a(View view, i1 i1Var) {
            i1 i1VarY = o0.Y(view, i1Var);
            if (i1VarY.o()) {
                return i1VarY;
            }
            Rect rect = this.f3618a;
            rect.left = i1VarY.j();
            rect.top = i1VarY.l();
            rect.right = i1VarY.k();
            rect.bottom = i1VarY.i();
            int childCount = ViewPager.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                i1 i1VarJ = o0.j(ViewPager.this.getChildAt(i10), i1VarY);
                rect.left = Math.min(i1VarJ.j(), rect.left);
                rect.top = Math.min(i1VarJ.l(), rect.top);
                rect.right = Math.min(i1VarJ.k(), rect.right);
                rect.bottom = Math.min(i1VarJ.i(), rect.bottom);
            }
            return i1VarY.p(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f3622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f3623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f3624e;

        f() {
        }
    }

    class h extends m0.a {
        h() {
        }

        private boolean n() {
            androidx.viewpager.widget.a aVar = ViewPager.this.f3594e;
            return aVar != null && aVar.c() > 1;
        }

        @Override // m0.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f3594e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.c());
            accessibilityEvent.setFromIndex(ViewPager.this.f3596f);
            accessibilityEvent.setToIndex(ViewPager.this.f3596f);
        }

        @Override // m0.a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            xVar.t0(ViewPager.class.getName());
            xVar.O0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                xVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                xVar.a(8192);
            }
        }

        @Override // m0.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            if (i10 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f3596f + 1);
                return true;
            }
            if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f3596f - 1);
            return true;
        }
    }

    public interface i {
        void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    public interface j {
        void e(int i10, float f10, int i11);

        void l0(int i10);

        void n0(int i10);
    }

    private class k extends DataSetObserver {
        k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.i();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.i();
        }
    }

    public static class l extends q0.a {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Parcelable f3634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ClassLoader f3635c;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i10) {
                return new l[i10];
            }
        }

        public l(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f3633a + "}";
        }

        @Override // q0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f3633a);
            parcel.writeParcelable(this.f3634b, i10);
        }

        l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f3633a = parcel.readInt();
            this.f3634b = parcel.readParcelable(classLoader);
            this.f3635c = classLoader;
        }
    }

    static class m implements Comparator {
        m() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z10 = gVar.f3625a;
            return z10 != gVar2.f3625a ? z10 ? 1 : -1 : gVar.f3629e - gVar2.f3629e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3588b = new ArrayList();
        this.f3590c = new f();
        this.f3592d = new Rect();
        this.f3598g = -1;
        this.f3600h = null;
        this.f3608r = null;
        this.f3616z = -3.4028235E38f;
        this.A = Float.MAX_VALUE;
        this.G = 1;
        this.Q = -1;
        this.f3591c0 = true;
        this.f3593d0 = false;
        this.f3606m0 = new c();
        this.f3607n0 = 0;
        v();
    }

    private boolean C(int i10) {
        if (this.f3588b.size() == 0) {
            if (this.f3591c0) {
                return false;
            }
            this.f3595e0 = false;
            y(0, 0.0f, 0);
            if (this.f3595e0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarT = t();
        int clientWidth = getClientWidth();
        int i11 = this.f3612v;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = fVarT.f3621b;
        float f11 = ((i10 / f10) - fVarT.f3624e) / (fVarT.f3623d + (i11 / f10));
        this.f3595e0 = false;
        y(i13, f11, (int) (i12 * f11));
        if (this.f3595e0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean D(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.M - f10;
        this.M = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f3616z * clientWidth;
        float f13 = this.A * clientWidth;
        boolean z12 = false;
        f fVar = (f) this.f3588b.get(0);
        ArrayList arrayList = this.f3588b;
        f fVar2 = (f) arrayList.get(arrayList.size() - 1);
        if (fVar.f3621b != 0) {
            f12 = fVar.f3624e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar2.f3621b != this.f3594e.c() - 1) {
            f13 = fVar2.f3624e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f3587a0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f3589b0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.M += scrollX - i10;
        scrollTo(i10, getScrollY());
        C(i10);
        return z12;
    }

    private void G(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f3588b.isEmpty()) {
            if (!this.f3609s.isFinished()) {
                this.f3609s.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        f fVarU = u(this.f3596f);
        int iMin = (int) ((fVarU != null ? Math.min(fVarU.f3624e, this.A) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            h(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void H() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((g) getChildAt(i10).getLayoutParams()).f3625a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void K(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private boolean L() {
        this.Q = -1;
        o();
        this.f3587a0.onRelease();
        this.f3589b0.onRelease();
        return this.f3587a0.isFinished() || this.f3589b0.isFinished();
    }

    private void M(int i10, boolean z10, int i11, boolean z11) {
        f fVarU = u(i10);
        int clientWidth = fVarU != null ? (int) (getClientWidth() * Math.max(this.f3616z, Math.min(fVarU.f3624e, this.A))) : 0;
        if (z10) {
            Q(clientWidth, 0, i11);
            if (z11) {
                l(i10);
                return;
            }
            return;
        }
        if (z11) {
            l(i10);
        }
        h(false);
        scrollTo(clientWidth, 0);
        C(clientWidth);
    }

    private void R() {
        if (this.f3604k0 != 0) {
            ArrayList arrayList = this.f3605l0;
            if (arrayList == null) {
                this.f3605l0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f3605l0.add(getChildAt(i10));
            }
            Collections.sort(this.f3605l0, f3585r0);
        }
    }

    private void f(f fVar, int i10, f fVar2) {
        int i11;
        int i12;
        f fVar3;
        f fVar4;
        int iC = this.f3594e.c();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.f3612v / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i13 = fVar2.f3621b;
            int i14 = fVar.f3621b;
            if (i13 < i14) {
                float f11 = fVar2.f3624e + fVar2.f3623d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= fVar.f3621b && i16 < this.f3588b.size()) {
                    Object obj = this.f3588b.get(i16);
                    while (true) {
                        fVar4 = (f) obj;
                        if (i15 <= fVar4.f3621b || i16 >= this.f3588b.size() - 1) {
                            break;
                        }
                        i16++;
                        obj = this.f3588b.get(i16);
                    }
                    while (i15 < fVar4.f3621b) {
                        f11 += this.f3594e.f(i15) + f10;
                        i15++;
                    }
                    fVar4.f3624e = f11;
                    f11 += fVar4.f3623d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f3588b.size() - 1;
                float f12 = fVar2.f3624e;
                while (true) {
                    i13--;
                    if (i13 < fVar.f3621b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f3588b.get(size);
                    while (true) {
                        fVar3 = (f) obj2;
                        if (i13 >= fVar3.f3621b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.f3588b.get(size);
                    }
                    while (i13 > fVar3.f3621b) {
                        f12 -= this.f3594e.f(i13) + f10;
                        i13--;
                    }
                    f12 -= fVar3.f3623d + f10;
                    fVar3.f3624e = f12;
                }
            }
        }
        int size2 = this.f3588b.size();
        float f13 = fVar.f3624e;
        int i17 = fVar.f3621b;
        int i18 = i17 - 1;
        this.f3616z = i17 == 0 ? f13 : -3.4028235E38f;
        int i19 = iC - 1;
        this.A = i17 == i19 ? (fVar.f3623d + f13) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            f fVar5 = (f) this.f3588b.get(i20);
            while (true) {
                i12 = fVar5.f3621b;
                if (i18 <= i12) {
                    break;
                }
                f13 -= this.f3594e.f(i18) + f10;
                i18--;
            }
            f13 -= fVar5.f3623d + f10;
            fVar5.f3624e = f13;
            if (i12 == 0) {
                this.f3616z = f13;
            }
            i20--;
            i18--;
        }
        float f14 = fVar.f3624e + fVar.f3623d + f10;
        int i21 = fVar.f3621b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            f fVar6 = (f) this.f3588b.get(i22);
            while (true) {
                i11 = fVar6.f3621b;
                if (i21 >= i11) {
                    break;
                }
                f14 += this.f3594e.f(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.A = (fVar6.f3623d + f14) - 1.0f;
            }
            fVar6.f3624e = f14;
            f14 += fVar6.f3623d + f10;
            i22++;
            i21++;
        }
        this.f3593d0 = false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h(boolean z10) {
        boolean z11 = this.f3607n0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f3609s.isFinished()) {
                this.f3609s.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f3609s.getCurrX();
                int currY = this.f3609s.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        C(currX);
                    }
                }
            }
        }
        this.F = false;
        for (int i10 = 0; i10 < this.f3588b.size(); i10++) {
            f fVar = (f) this.f3588b.get(i10);
            if (fVar.f3622c) {
                fVar.f3622c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                o0.e0(this, this.f3606m0);
            } else {
                this.f3606m0.run();
            }
        }
    }

    private int j(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.U || Math.abs(i11) <= this.S) {
            i10 += (int) (f10 + (i10 >= this.f3596f ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.f3588b.size() <= 0) {
            return i10;
        }
        return Math.max(((f) this.f3588b.get(0)).f3621b, Math.min(i10, ((f) this.f3588b.get(r4.size() - 1)).f3621b));
    }

    private void k(int i10, float f10, int i11) {
        j jVar = this.f3601h0;
        if (jVar != null) {
            jVar.e(i10, f10, i11);
        }
        List list = this.f3599g0;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = (j) this.f3599g0.get(i12);
                if (jVar2 != null) {
                    jVar2.e(i10, f10, i11);
                }
            }
        }
        j jVar3 = this.f3602i0;
        if (jVar3 != null) {
            jVar3.e(i10, f10, i11);
        }
    }

    private void l(int i10) {
        j jVar = this.f3601h0;
        if (jVar != null) {
            jVar.n0(i10);
        }
        List list = this.f3599g0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = (j) this.f3599g0.get(i11);
                if (jVar2 != null) {
                    jVar2.n0(i10);
                }
            }
        }
        j jVar3 = this.f3602i0;
        if (jVar3 != null) {
            jVar3.n0(i10);
        }
    }

    private void m(int i10) {
        j jVar = this.f3601h0;
        if (jVar != null) {
            jVar.l0(i10);
        }
        List list = this.f3599g0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = (j) this.f3599g0.get(i11);
                if (jVar2 != null) {
                    jVar2.l0(i10);
                }
            }
        }
        j jVar3 = this.f3602i0;
        if (jVar3 != null) {
            jVar3.l0(i10);
        }
    }

    private void o() {
        this.H = false;
        this.I = false;
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.R = null;
        }
    }

    private Rect q(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
        }
    }

    private f t() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f3612v / clientWidth : 0.0f;
        f fVar = null;
        float f12 = 0.0f;
        int i11 = -1;
        int i12 = 0;
        boolean z10 = true;
        while (i12 < this.f3588b.size()) {
            f fVar2 = (f) this.f3588b.get(i12);
            if (!z10 && fVar2.f3621b != (i10 = i11 + 1)) {
                fVar2 = this.f3590c;
                fVar2.f3624e = f10 + f12 + f11;
                fVar2.f3621b = i10;
                fVar2.f3623d = this.f3594e.f(i10);
                i12--;
            }
            f fVar3 = fVar2;
            f10 = fVar3.f3624e;
            float f13 = fVar3.f3623d + f10 + f11;
            if (!z10 && scrollX < f10) {
                break;
            }
            if (scrollX < f13 || i12 == this.f3588b.size() - 1) {
                return fVar3;
            }
            int i13 = fVar3.f3621b;
            float f14 = fVar3.f3623d;
            i12++;
            i11 = i13;
            f12 = f14;
            fVar = fVar3;
            z10 = false;
        }
        return fVar;
    }

    private static boolean w(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean x(float f10, float f11) {
        if (f10 >= this.K || f11 <= 0.0f) {
            return f10 > ((float) (getWidth() - this.K)) && f11 < 0.0f;
        }
        return true;
    }

    private void z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Q) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.M = motionEvent.getX(i10);
            this.Q = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.R;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    boolean A() {
        int i10 = this.f3596f;
        if (i10 <= 0) {
            return false;
        }
        N(i10 - 1, true);
        return true;
    }

    boolean B() {
        androidx.viewpager.widget.a aVar = this.f3594e;
        if (aVar == null || this.f3596f >= aVar.c() - 1) {
            return false;
        }
        N(this.f3596f + 1, true);
        return true;
    }

    void E() {
        F(this.f3596f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc A[PHI: r7 r10 r15
      0x00cc: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void F(int r18) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.F(int):void");
    }

    public void I(i iVar) {
        List list = this.f3603j0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void J(j jVar) {
        List list = this.f3599g0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public void N(int i10, boolean z10) {
        this.F = false;
        O(i10, z10, false);
    }

    void O(int i10, boolean z10, boolean z11) {
        P(i10, z10, z11, 0);
    }

    void P(int i10, boolean z10, boolean z11, int i11) {
        androidx.viewpager.widget.a aVar = this.f3594e;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.f3596f == i10 && this.f3588b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f3594e.c()) {
            i10 = this.f3594e.c() - 1;
        }
        int i12 = this.G;
        int i13 = this.f3596f;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < this.f3588b.size(); i14++) {
                ((f) this.f3588b.get(i14)).f3622c = true;
            }
        }
        boolean z12 = this.f3596f != i10;
        if (!this.f3591c0) {
            F(i10);
            M(i10, z10, i11, z12);
        } else {
            this.f3596f = i10;
            if (z12) {
                l(i10);
            }
            requestLayout();
        }
    }

    void Q(int i10, int i11, int i12) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f3609s;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f3610t ? this.f3609s.getCurrX() : this.f3609s.getStartX();
            this.f3609s.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            h(false);
            E();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float fN = f11 + (n(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int iAbs = Math.abs(i12);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fN / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i14) / ((f10 * this.f3594e.f(this.f3596f)) + this.f3612v)) + 1.0f) * 100.0f), 600);
        this.f3610t = false;
        this.f3609s.startScroll(i13, scrollY, i14, i15, iMin);
        o0.d0(this);
    }

    f a(int i10, int i11) {
        f fVar = new f();
        fVar.f3621b = i10;
        fVar.f3620a = this.f3594e.g(this, i10);
        fVar.f3623d = this.f3594e.f(i10);
        if (i11 < 0 || i11 >= this.f3588b.size()) {
            this.f3588b.add(fVar);
            return fVar;
        }
        this.f3588b.add(i11, fVar);
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        f fVarS;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f3621b == this.f3596f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        f fVarS;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f3621b == this.f3596f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean zW = gVar.f3625a | w(view);
        gVar.f3625a = zW;
        if (!this.D) {
            super.addView(view, i10, layoutParams);
        } else {
            if (zW) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f3628d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public void c(i iVar) {
        if (this.f3603j0 == null) {
            this.f3603j0 = new ArrayList();
        }
        this.f3603j0.add(iVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f3594e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f3616z)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.A));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f3610t = true;
        if (this.f3609s.isFinished() || !this.f3609s.computeScrollOffset()) {
            h(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f3609s.getCurrX();
        int currY = this.f3609s.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!C(currX)) {
                this.f3609s.abortAnimation();
                scrollTo(0, currY);
            }
        }
        o0.d0(this);
    }

    public void d(j jVar) {
        if (this.f3599g0 == null) {
            this.f3599g0 = new ArrayList();
        }
        this.f3599g0.add(jVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || p(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarS;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f3621b == this.f3596f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f3594e) != null && aVar.c() > 1)) {
            if (!this.f3587a0.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f3616z * width);
                this.f3587a0.setSize(height, width);
                zDraw = this.f3587a0.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f3589b0.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.A + 1.0f)) * width2);
                this.f3589b0.setSize(height2, width2);
                zDraw |= this.f3589b0.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f3587a0.finish();
            this.f3589b0.finish();
        }
        if (zDraw) {
            o0.d0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3613w;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(int r5) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.e(int):boolean");
    }

    protected boolean g(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && g(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.f3594e;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.f3604k0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((g) ((View) this.f3605l0.get(i11)).getLayoutParams()).f3630f;
    }

    public int getCurrentItem() {
        return this.f3596f;
    }

    public int getOffscreenPageLimit() {
        return this.G;
    }

    public int getPageMargin() {
        return this.f3612v;
    }

    void i() {
        int iC = this.f3594e.c();
        this.f3586a = iC;
        boolean z10 = this.f3588b.size() < (this.G * 2) + 1 && this.f3588b.size() < iC;
        int iMax = this.f3596f;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < this.f3588b.size()) {
            f fVar = (f) this.f3588b.get(i10);
            int iD = this.f3594e.d(fVar.f3620a);
            if (iD != -1) {
                if (iD == -2) {
                    this.f3588b.remove(i10);
                    i10--;
                    if (!z11) {
                        this.f3594e.n(this);
                        z11 = true;
                    }
                    this.f3594e.a(this, fVar.f3621b, fVar.f3620a);
                    int i11 = this.f3596f;
                    if (i11 == fVar.f3621b) {
                        iMax = Math.max(0, Math.min(i11, iC - 1));
                    }
                } else {
                    int i12 = fVar.f3621b;
                    if (i12 != iD) {
                        if (i12 == this.f3596f) {
                            iMax = iD;
                        }
                        fVar.f3621b = iD;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.f3594e.b(this);
        }
        Collections.sort(this.f3588b, f3583p0);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                g gVar = (g) getChildAt(i13).getLayoutParams();
                if (!gVar.f3625a) {
                    gVar.f3627c = 0.0f;
                }
            }
            O(iMax, false, true);
            requestLayout();
        }
    }

    float n(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3591c0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f3606m0);
        Scroller scroller = this.f3609s;
        if (scroller != null && !scroller.isFinished()) {
            this.f3609s.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i10;
        float f10;
        int i11;
        super.onDraw(canvas);
        if (this.f3612v <= 0 || this.f3613w == null || this.f3588b.size() <= 0 || this.f3594e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.f3612v / width;
        int i12 = 0;
        f fVar = (f) this.f3588b.get(0);
        float f12 = fVar.f3624e;
        int size = this.f3588b.size();
        int i13 = fVar.f3621b;
        int i14 = ((f) this.f3588b.get(size - 1)).f3621b;
        while (i13 < i14) {
            while (true) {
                i10 = fVar.f3621b;
                if (i13 <= i10 || i12 >= size) {
                    break;
                }
                i12++;
                fVar = (f) this.f3588b.get(i12);
            }
            if (i13 == i10) {
                float f13 = fVar.f3624e;
                float f14 = fVar.f3623d;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                float f15 = this.f3594e.f(i13);
                f10 = (f12 + f15) * width;
                f12 += f15 + f11;
            }
            if (this.f3612v + f10 > scrollX) {
                i11 = scrollX;
                this.f3613w.setBounds(Math.round(f10), this.f3614x, Math.round(this.f3612v + f10), this.f3615y);
                this.f3613w.draw(canvas);
            } else {
                i11 = scrollX;
            }
            if (f10 > i11 + r2) {
                return;
            }
            i13++;
            scrollX = i11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            L();
            return false;
        }
        if (action != 0) {
            if (this.H) {
                return true;
            }
            if (this.I) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.O = x10;
            this.M = x10;
            float y10 = motionEvent.getY();
            this.P = y10;
            this.N = y10;
            this.Q = motionEvent.getPointerId(0);
            this.I = false;
            this.f3610t = true;
            this.f3609s.computeScrollOffset();
            if (this.f3607n0 != 2 || Math.abs(this.f3609s.getFinalX() - this.f3609s.getCurrX()) <= this.V) {
                h(false);
                this.H = false;
            } else {
                this.f3609s.abortAnimation();
                this.F = false;
                E();
                this.H = true;
                K(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.Q;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.M;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.P);
                if (f10 != 0.0f && !x(this.M, f10) && g(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.M = x11;
                    this.N = y11;
                    this.I = true;
                    return false;
                }
                int i11 = this.L;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.H = true;
                    K(true);
                    setScrollState(1);
                    float f11 = this.O;
                    float f12 = this.L;
                    this.M = f10 > 0.0f ? f11 + f12 : f11 - f12;
                    this.N = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.I = true;
                }
                if (this.H && D(x11)) {
                    o0.d0(this);
                }
            }
        } else if (action == 6) {
            z(motionEvent);
        }
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        return this.H;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        f fVarS;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (fVarS = s(childAt)) != null && fVarS.f3621b == this.f3596f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        androidx.viewpager.widget.a aVar = this.f3594e;
        if (aVar != null) {
            aVar.j(lVar.f3634b, lVar.f3635c);
            O(lVar.f3633a, false, true);
        } else {
            this.f3598g = lVar.f3633a;
            this.f3600h = lVar.f3634b;
            this.f3608r = lVar.f3635c;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f3633a = this.f3596f;
        androidx.viewpager.widget.a aVar = this.f3594e;
        if (aVar != null) {
            lVar.f3634b = aVar.k();
        }
        return lVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f3612v;
            G(i10, i12, i14, i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? A() : e(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? B() : e(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return e(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return e(1);
        }
        return false;
    }

    f r(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return s(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.D) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    f s(View view) {
        for (int i10 = 0; i10 < this.f3588b.size(); i10++) {
            f fVar = (f) this.f3588b.get(i10);
            if (this.f3594e.h(view, fVar.f3620a)) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.f3594e;
        if (aVar2 != null) {
            aVar2.m(null);
            this.f3594e.n(this);
            for (int i10 = 0; i10 < this.f3588b.size(); i10++) {
                f fVar = (f) this.f3588b.get(i10);
                this.f3594e.a(this, fVar.f3621b, fVar.f3620a);
            }
            this.f3594e.b(this);
            this.f3588b.clear();
            H();
            this.f3596f = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f3594e;
        this.f3594e = aVar;
        this.f3586a = 0;
        if (aVar != null) {
            if (this.f3611u == null) {
                this.f3611u = new k();
            }
            this.f3594e.m(this.f3611u);
            this.F = false;
            boolean z10 = this.f3591c0;
            this.f3591c0 = true;
            this.f3586a = this.f3594e.c();
            if (this.f3598g >= 0) {
                this.f3594e.j(this.f3600h, this.f3608r);
                O(this.f3598g, false, true);
                this.f3598g = -1;
                this.f3600h = null;
                this.f3608r = null;
            } else if (z10) {
                requestLayout();
            } else {
                E();
            }
        }
        List list = this.f3603j0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f3603j0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((i) this.f3603j0.get(i11)).a(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i10) {
        this.F = false;
        O(i10, !this.f3591c0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.G) {
            this.G = i10;
            E();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f3601h0 = jVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f3612v;
        this.f3612v = i10;
        int width = getWidth();
        G(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f3613w = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i10) {
        if (this.f3607n0 == i10) {
            return;
        }
        this.f3607n0 = i10;
        m(i10);
    }

    f u(int i10) {
        for (int i11 = 0; i11 < this.f3588b.size(); i11++) {
            f fVar = (f) this.f3588b.get(i11);
            if (fVar.f3621b == i10) {
                return fVar;
            }
        }
        return null;
    }

    void v() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f3609s = new Scroller(context, f3584q0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.L = viewConfiguration.getScaledPagingTouchSlop();
        this.S = (int) (400.0f * f10);
        this.T = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3587a0 = new EdgeEffect(context);
        this.f3589b0 = new EdgeEffect(context);
        this.U = (int) (25.0f * f10);
        this.V = (int) (2.0f * f10);
        this.J = (int) (f10 * 16.0f);
        o0.n0(this, new h());
        if (o0.A(this) == 0) {
            o0.u0(this, 1);
        }
        o0.y0(this, new d());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3613w;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void y(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.f3597f0
            r1 = 1
            if (r0 <= 0) goto L6b
            int r0 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L1a:
            if (r6 >= r5) goto L6b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r8 = (androidx.viewpager.widget.ViewPager.g) r8
            boolean r9 = r8.f3625a
            if (r9 != 0) goto L2b
            goto L68
        L2b:
            int r8 = r8.f3626b
            r8 = r8 & 7
            if (r8 == r1) goto L4f
            r9 = 3
            if (r8 == r9) goto L49
            r9 = 5
            if (r8 == r9) goto L39
            r8 = r2
            goto L5c
        L39:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L45:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5c
        L49:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5c
        L4f:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L45
        L5c:
            int r2 = r2 + r0
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L67
            r7.offsetLeftAndRight(r2)
        L67:
            r2 = r8
        L68:
            int r6 = r6 + 1
            goto L1a
        L6b:
            r11.k(r12, r13, r14)
            r11.f3595e0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.y(int, float, int):void");
    }

    public static class g extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f3627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f3630f;

        public g() {
            super(-1, -1);
            this.f3627c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3627c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f3582o0);
            this.f3626b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(b0.b.d(getContext(), i10));
    }
}
