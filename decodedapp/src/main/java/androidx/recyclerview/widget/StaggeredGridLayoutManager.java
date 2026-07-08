package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import n0.x;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.q implements RecyclerView.a0.b {
    private BitSet B;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private int[] O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    f[] f3046t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    i f3047u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    i f3048v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f3049w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f3050x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final androidx.recyclerview.widget.f f3051y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f3045s = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f3052z = false;
    boolean A = false;
    int C = -1;
    int D = RtlSpacingHelper.UNDEFINED;
    d E = new d();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.X1();
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f3056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3057d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f3058e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f3059f;

        b() {
            c();
        }

        void a() {
            this.f3055b = this.f3056c ? StaggeredGridLayoutManager.this.f3047u.i() : StaggeredGridLayoutManager.this.f3047u.m();
        }

        void b(int i10) {
            if (this.f3056c) {
                this.f3055b = StaggeredGridLayoutManager.this.f3047u.i() - i10;
            } else {
                this.f3055b = StaggeredGridLayoutManager.this.f3047u.m() + i10;
            }
        }

        void c() {
            this.f3054a = -1;
            this.f3055b = RtlSpacingHelper.UNDEFINED;
            this.f3056c = false;
            this.f3057d = false;
            this.f3058e = false;
            int[] iArr = this.f3059f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f3059f;
            if (iArr == null || iArr.length < length) {
                this.f3059f = new int[StaggeredGridLayoutManager.this.f3046t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f3059f[i10] = fVarArr[i10].p(RtlSpacingHelper.UNDEFINED);
            }
        }
    }

    public static class c extends RecyclerView.r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        f f3061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f3062f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            f fVar = this.f3061e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f3083e;
        }

        public boolean f() {
            return this.f3062f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int[] f3072d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3073e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f3074f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List f3075g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f3076h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f3077r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f3078s;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        void b() {
            this.f3072d = null;
            this.f3071c = 0;
            this.f3069a = -1;
            this.f3070b = -1;
        }

        void c() {
            this.f3072d = null;
            this.f3071c = 0;
            this.f3073e = 0;
            this.f3074f = null;
            this.f3075g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3069a);
            parcel.writeInt(this.f3070b);
            parcel.writeInt(this.f3071c);
            if (this.f3071c > 0) {
                parcel.writeIntArray(this.f3072d);
            }
            parcel.writeInt(this.f3073e);
            if (this.f3073e > 0) {
                parcel.writeIntArray(this.f3074f);
            }
            parcel.writeInt(this.f3076h ? 1 : 0);
            parcel.writeInt(this.f3077r ? 1 : 0);
            parcel.writeInt(this.f3078s ? 1 : 0);
            parcel.writeList(this.f3075g);
        }

        e(Parcel parcel) {
            this.f3069a = parcel.readInt();
            this.f3070b = parcel.readInt();
            int i10 = parcel.readInt();
            this.f3071c = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f3072d = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f3073e = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f3074f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f3076h = parcel.readInt() == 1;
            this.f3077r = parcel.readInt() == 1;
            this.f3078s = parcel.readInt() == 1;
            this.f3075g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f3071c = eVar.f3071c;
            this.f3069a = eVar.f3069a;
            this.f3070b = eVar.f3070b;
            this.f3072d = eVar.f3072d;
            this.f3073e = eVar.f3073e;
            this.f3074f = eVar.f3074f;
            this.f3076h = eVar.f3076h;
            this.f3077r = eVar.f3077r;
            this.f3078s = eVar.f3078s;
            this.f3075g = eVar.f3075g;
        }
    }

    class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList f3079a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3080b = RtlSpacingHelper.UNDEFINED;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3081c = RtlSpacingHelper.UNDEFINED;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3082d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f3083e;

        f(int i10) {
            this.f3083e = i10;
        }

        void a(View view) {
            c cVarN = n(view);
            cVarN.f3061e = this;
            this.f3079a.add(view);
            this.f3081c = RtlSpacingHelper.UNDEFINED;
            if (this.f3079a.size() == 1) {
                this.f3080b = RtlSpacingHelper.UNDEFINED;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f3082d += StaggeredGridLayoutManager.this.f3047u.e(view);
            }
        }

        void b(boolean z10, int i10) {
            int iL = z10 ? l(RtlSpacingHelper.UNDEFINED) : p(RtlSpacingHelper.UNDEFINED);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || iL >= StaggeredGridLayoutManager.this.f3047u.i()) {
                if (z10 || iL <= StaggeredGridLayoutManager.this.f3047u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iL += i10;
                    }
                    this.f3081c = iL;
                    this.f3080b = iL;
                }
            }
        }

        void c() {
            d.a aVarF;
            ArrayList arrayList = this.f3079a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f3081c = StaggeredGridLayoutManager.this.f3047u.d(view);
            if (cVarN.f3062f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && aVarF.f3066b == 1) {
                this.f3081c += aVarF.b(this.f3083e);
            }
        }

        void d() {
            d.a aVarF;
            View view = (View) this.f3079a.get(0);
            c cVarN = n(view);
            this.f3080b = StaggeredGridLayoutManager.this.f3047u.g(view);
            if (cVarN.f3062f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && aVarF.f3066b == -1) {
                this.f3080b -= aVarF.b(this.f3083e);
            }
        }

        void e() {
            this.f3079a.clear();
            q();
            this.f3082d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f3052z ? i(this.f3079a.size() - 1, -1, true) : i(0, this.f3079a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f3052z ? i(0, this.f3079a.size(), true) : i(this.f3079a.size() - 1, -1, true);
        }

        int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iM = StaggeredGridLayoutManager.this.f3047u.m();
            int i12 = StaggeredGridLayoutManager.this.f3047u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = (View) this.f3079a.get(i10);
                int iG = StaggeredGridLayoutManager.this.f3047u.g(view);
                int iD = StaggeredGridLayoutManager.this.f3047u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iG >= i12 : iG > i12;
                if (!z12 ? iD > iM : iD >= iM) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iG >= iM && iD <= i12) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                        if (iG < iM || iD > i12) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f3082d;
        }

        int k() {
            int i10 = this.f3081c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f3081c;
        }

        int l(int i10) {
            int i11 = this.f3081c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3079a.size() == 0) {
                return i10;
            }
            c();
            return this.f3081c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f3079a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f3079a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3052z && staggeredGridLayoutManager.l0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3052z && staggeredGridLayoutManager2.l0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f3079a.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = (View) this.f3079a.get(i12);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f3052z && staggeredGridLayoutManager3.l0(view3) <= i10) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f3052z && staggeredGridLayoutManager4.l0(view3) >= i10) || !view3.hasFocusable()) {
                    break;
                }
                i12++;
                view = view3;
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i10 = this.f3080b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f3080b;
        }

        int p(int i10) {
            int i11 = this.f3080b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3079a.size() == 0) {
                return i10;
            }
            d();
            return this.f3080b;
        }

        void q() {
            this.f3080b = RtlSpacingHelper.UNDEFINED;
            this.f3081c = RtlSpacingHelper.UNDEFINED;
        }

        void r(int i10) {
            int i11 = this.f3080b;
            if (i11 != Integer.MIN_VALUE) {
                this.f3080b = i11 + i10;
            }
            int i12 = this.f3081c;
            if (i12 != Integer.MIN_VALUE) {
                this.f3081c = i12 + i10;
            }
        }

        void s() {
            int size = this.f3079a.size();
            View view = (View) this.f3079a.remove(size - 1);
            c cVarN = n(view);
            cVarN.f3061e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f3082d -= StaggeredGridLayoutManager.this.f3047u.e(view);
            }
            if (size == 1) {
                this.f3080b = RtlSpacingHelper.UNDEFINED;
            }
            this.f3081c = RtlSpacingHelper.UNDEFINED;
        }

        void t() {
            View view = (View) this.f3079a.remove(0);
            c cVarN = n(view);
            cVarN.f3061e = null;
            if (this.f3079a.size() == 0) {
                this.f3081c = RtlSpacingHelper.UNDEFINED;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f3082d -= StaggeredGridLayoutManager.this.f3047u.e(view);
            }
            this.f3080b = RtlSpacingHelper.UNDEFINED;
        }

        void u(View view) {
            c cVarN = n(view);
            cVarN.f3061e = this;
            this.f3079a.add(0, view);
            this.f3080b = RtlSpacingHelper.UNDEFINED;
            if (this.f3079a.size() == 1) {
                this.f3081c = RtlSpacingHelper.UNDEFINED;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f3082d += StaggeredGridLayoutManager.this.f3047u.e(view);
            }
        }

        void v(int i10) {
            this.f3080b = i10;
            this.f3081c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.q.d dVarM0 = RecyclerView.q.m0(context, attributeSet, i10, i11);
        M2(dVarM0.f3020a);
        O2(dVarM0.f3021b);
        N2(dVarM0.f3022c);
        this.f3051y = new androidx.recyclerview.widget.f();
        f2();
    }

    private void A2(View view, c cVar, boolean z10) {
        if (cVar.f3062f) {
            if (this.f3049w == 1) {
                z2(view, this.J, RecyclerView.q.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
                return;
            } else {
                z2(view, RecyclerView.q.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z10);
                return;
            }
        }
        if (this.f3049w == 1) {
            z2(view, RecyclerView.q.P(this.f3050x, t0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.q.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            z2(view, RecyclerView.q.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.q.P(this.f3050x, c0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void B2(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.b0 r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.B2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean):void");
    }

    private boolean C2(int i10) {
        if (this.f3049w == 0) {
            return (i10 == -1) != this.A;
        }
        return ((i10 == -1) == this.A) == y2();
    }

    private void E2(View view) {
        for (int i10 = this.f3045s - 1; i10 >= 0; i10--) {
            this.f3046t[i10].u(view);
        }
    }

    private void F2(RecyclerView.w wVar, androidx.recyclerview.widget.f fVar) {
        if (!fVar.f3192a || fVar.f3200i) {
            return;
        }
        if (fVar.f3193b == 0) {
            if (fVar.f3196e == -1) {
                G2(wVar, fVar.f3198g);
                return;
            } else {
                H2(wVar, fVar.f3197f);
                return;
            }
        }
        if (fVar.f3196e != -1) {
            int iS2 = s2(fVar.f3198g) - fVar.f3198g;
            H2(wVar, iS2 < 0 ? fVar.f3197f : Math.min(iS2, fVar.f3193b) + fVar.f3197f);
        } else {
            int i10 = fVar.f3197f;
            int iR2 = i10 - r2(i10);
            G2(wVar, iR2 < 0 ? fVar.f3198g : fVar.f3198g - Math.min(iR2, fVar.f3193b));
        }
    }

    private void G2(RecyclerView.w wVar, int i10) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            if (this.f3047u.g(viewN) < i10 || this.f3047u.q(viewN) < i10) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f3062f) {
                for (int i11 = 0; i11 < this.f3045s; i11++) {
                    if (this.f3046t[i11].f3079a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3045s; i12++) {
                    this.f3046t[i12].s();
                }
            } else if (cVar.f3061e.f3079a.size() == 1) {
                return;
            } else {
                cVar.f3061e.s();
            }
            r1(viewN, wVar);
        }
    }

    private void H2(RecyclerView.w wVar, int i10) {
        while (O() > 0) {
            View viewN = N(0);
            if (this.f3047u.d(viewN) > i10 || this.f3047u.p(viewN) > i10) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f3062f) {
                for (int i11 = 0; i11 < this.f3045s; i11++) {
                    if (this.f3046t[i11].f3079a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3045s; i12++) {
                    this.f3046t[i12].t();
                }
            } else if (cVar.f3061e.f3079a.size() == 1) {
                return;
            } else {
                cVar.f3061e.t();
            }
            r1(viewN, wVar);
        }
    }

    private void I2() {
        if (this.f3048v.k() == 1073741824) {
            return;
        }
        int iO = O();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < iO; i10++) {
            View viewN = N(i10);
            float fE = this.f3048v.e(viewN);
            if (fE >= fMax) {
                if (((c) viewN.getLayoutParams()).f()) {
                    fE = (fE * 1.0f) / this.f3045s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i11 = this.f3050x;
        int iRound = Math.round(fMax * this.f3045s);
        if (this.f3048v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f3048v.n());
        }
        U2(iRound);
        if (this.f3050x == i11) {
            return;
        }
        for (int i12 = 0; i12 < iO; i12++) {
            View viewN2 = N(i12);
            c cVar = (c) viewN2.getLayoutParams();
            if (!cVar.f3062f) {
                if (y2() && this.f3049w == 1) {
                    int i13 = this.f3045s;
                    int i14 = cVar.f3061e.f3083e;
                    viewN2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f3050x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f3061e.f3083e;
                    int i16 = this.f3050x * i15;
                    int i17 = i15 * i11;
                    if (this.f3049w == 1) {
                        viewN2.offsetLeftAndRight(i16 - i17);
                    } else {
                        viewN2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    private void J2() {
        if (this.f3049w == 1 || !y2()) {
            this.A = this.f3052z;
        } else {
            this.A = !this.f3052z;
        }
    }

    private void L2(int i10) {
        androidx.recyclerview.widget.f fVar = this.f3051y;
        fVar.f3196e = i10;
        fVar.f3195d = this.A != (i10 == -1) ? -1 : 1;
    }

    private void P2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f3045s; i12++) {
            if (!this.f3046t[i12].f3079a.isEmpty()) {
                V2(this.f3046t[i12], i10, i11);
            }
        }
    }

    private boolean Q2(RecyclerView.b0 b0Var, b bVar) {
        bVar.f3054a = this.G ? l2(b0Var.b()) : h2(b0Var.b());
        bVar.f3055b = RtlSpacingHelper.UNDEFINED;
        return true;
    }

    private void R1(View view) {
        for (int i10 = this.f3045s - 1; i10 >= 0; i10--) {
            this.f3046t[i10].a(view);
        }
    }

    private void S1(b bVar) {
        e eVar = this.I;
        int i10 = eVar.f3071c;
        if (i10 > 0) {
            if (i10 == this.f3045s) {
                for (int i11 = 0; i11 < this.f3045s; i11++) {
                    this.f3046t[i11].e();
                    e eVar2 = this.I;
                    int i12 = eVar2.f3072d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += eVar2.f3077r ? this.f3047u.i() : this.f3047u.m();
                    }
                    this.f3046t[i11].v(i12);
                }
            } else {
                eVar.c();
                e eVar3 = this.I;
                eVar3.f3069a = eVar3.f3070b;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.f3078s;
        N2(eVar4.f3076h);
        J2();
        e eVar5 = this.I;
        int i13 = eVar5.f3069a;
        if (i13 != -1) {
            this.C = i13;
            bVar.f3056c = eVar5.f3077r;
        } else {
            bVar.f3056c = this.A;
        }
        if (eVar5.f3073e > 1) {
            d dVar = this.E;
            dVar.f3063a = eVar5.f3074f;
            dVar.f3064b = eVar5.f3075g;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void T2(int r5, androidx.recyclerview.widget.RecyclerView.b0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f3051y
            r1 = 0
            r0.f3193b = r1
            r0.f3194c = r5
            boolean r0 = r4.C0()
            r2 = 1
            if (r0 == 0) goto L2f
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L2f
            boolean r0 = r4.A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L26
            androidx.recyclerview.widget.i r5 = r4.f3047u
            int r5 = r5.n()
        L24:
            r6 = 0
            goto L31
        L26:
            androidx.recyclerview.widget.i r5 = r4.f3047u
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L31
        L2f:
            r5 = 0
            goto L24
        L31:
            boolean r0 = r4.R()
            if (r0 == 0) goto L4e
            androidx.recyclerview.widget.f r0 = r4.f3051y
            androidx.recyclerview.widget.i r3 = r4.f3047u
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f3197f = r3
            androidx.recyclerview.widget.f r6 = r4.f3051y
            androidx.recyclerview.widget.i r0 = r4.f3047u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.f3198g = r0
            goto L5e
        L4e:
            androidx.recyclerview.widget.f r0 = r4.f3051y
            androidx.recyclerview.widget.i r3 = r4.f3047u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.f3198g = r3
            androidx.recyclerview.widget.f r5 = r4.f3051y
            int r6 = -r6
            r5.f3197f = r6
        L5e:
            androidx.recyclerview.widget.f r5 = r4.f3051y
            r5.f3199h = r1
            r5.f3192a = r2
            androidx.recyclerview.widget.i r6 = r4.f3047u
            int r6 = r6.k()
            if (r6 != 0) goto L75
            androidx.recyclerview.widget.i r6 = r4.f3047u
            int r6 = r6.h()
            if (r6 != 0) goto L75
            r1 = 1
        L75:
            r5.f3200i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T2(int, androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    private void V1(View view, c cVar, androidx.recyclerview.widget.f fVar) {
        if (fVar.f3196e == 1) {
            if (cVar.f3062f) {
                R1(view);
                return;
            } else {
                cVar.f3061e.a(view);
                return;
            }
        }
        if (cVar.f3062f) {
            E2(view);
        } else {
            cVar.f3061e.u(view);
        }
    }

    private void V2(f fVar, int i10, int i11) {
        int iJ = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + iJ <= i11) {
                this.B.set(fVar.f3083e, false);
            }
        } else if (fVar.k() - iJ >= i11) {
            this.B.set(fVar.f3083e, false);
        }
    }

    private int W1(int i10) {
        if (O() == 0) {
            return this.A ? 1 : -1;
        }
        return (i10 < o2()) != this.A ? -1 : 1;
    }

    private int W2(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    private boolean Y1(f fVar) {
        boolean z10;
        if (!this.A) {
            if (fVar.o() > this.f3047u.m()) {
                z10 = fVar.n((View) fVar.f3079a.get(0)).f3062f;
                return !z10;
            }
            return false;
        }
        if (fVar.k() < this.f3047u.i()) {
            z10 = fVar.n((View) fVar.f3079a.get(r0.size() - 1)).f3062f;
            return !z10;
        }
        return false;
    }

    private int Z1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        return l.a(b0Var, this.f3047u, j2(!this.N), i2(!this.N), this, this.N);
    }

    private int a2(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        return l.b(b0Var, this.f3047u, j2(!this.N), i2(!this.N), this, this.N, this.A);
    }

    private int b2(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        return l.c(b0Var, this.f3047u, j2(!this.N), i2(!this.N), this, this.N);
    }

    private int c2(int i10) {
        if (i10 == 1) {
            return (this.f3049w != 1 && y2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f3049w != 1 && y2()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.f3049w == 0) {
                return -1;
            }
            return RtlSpacingHelper.UNDEFINED;
        }
        if (i10 == 33) {
            if (this.f3049w == 1) {
                return -1;
            }
            return RtlSpacingHelper.UNDEFINED;
        }
        if (i10 == 66) {
            if (this.f3049w == 0) {
                return 1;
            }
            return RtlSpacingHelper.UNDEFINED;
        }
        if (i10 == 130 && this.f3049w == 1) {
            return 1;
        }
        return RtlSpacingHelper.UNDEFINED;
    }

    private d.a d2(int i10) {
        d.a aVar = new d.a();
        aVar.f3067c = new int[this.f3045s];
        for (int i11 = 0; i11 < this.f3045s; i11++) {
            aVar.f3067c[i11] = i10 - this.f3046t[i11].l(i10);
        }
        return aVar;
    }

    private d.a e2(int i10) {
        d.a aVar = new d.a();
        aVar.f3067c = new int[this.f3045s];
        for (int i11 = 0; i11 < this.f3045s; i11++) {
            aVar.f3067c[i11] = this.f3046t[i11].p(i10) - i10;
        }
        return aVar;
    }

    private void f2() {
        this.f3047u = i.b(this, this.f3049w);
        this.f3048v = i.b(this, 1 - this.f3049w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    private int g2(RecyclerView.w wVar, androidx.recyclerview.widget.f fVar, RecyclerView.b0 b0Var) {
        int i10;
        f fVarU2;
        int iT2;
        int iE;
        int iM;
        int iE2;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = this;
        ?? r82 = 0;
        staggeredGridLayoutManager2.B.set(0, staggeredGridLayoutManager2.f3045s, true);
        if (staggeredGridLayoutManager2.f3051y.f3200i) {
            i10 = fVar.f3196e == 1 ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : RtlSpacingHelper.UNDEFINED;
        } else {
            i10 = fVar.f3196e == 1 ? fVar.f3198g + fVar.f3193b : fVar.f3197f - fVar.f3193b;
        }
        staggeredGridLayoutManager2.P2(fVar.f3196e, i10);
        int i11 = staggeredGridLayoutManager2.A ? staggeredGridLayoutManager2.f3047u.i() : staggeredGridLayoutManager2.f3047u.m();
        boolean z10 = false;
        StaggeredGridLayoutManager staggeredGridLayoutManager3 = staggeredGridLayoutManager2;
        while (fVar.a(b0Var) && (staggeredGridLayoutManager3.f3051y.f3200i || !staggeredGridLayoutManager3.B.isEmpty())) {
            View viewB = fVar.b(wVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = staggeredGridLayoutManager3.E.g(iA);
            boolean z11 = iG == -1;
            if (z11) {
                fVarU2 = cVar.f3062f ? staggeredGridLayoutManager3.f3046t[r82] : staggeredGridLayoutManager3.u2(fVar);
                staggeredGridLayoutManager3.E.n(iA, fVarU2);
            } else {
                fVarU2 = staggeredGridLayoutManager3.f3046t[iG];
            }
            f fVar2 = fVarU2;
            cVar.f3061e = fVar2;
            if (fVar.f3196e == 1) {
                staggeredGridLayoutManager3.i(viewB);
            } else {
                staggeredGridLayoutManager3.j(viewB, r82);
            }
            staggeredGridLayoutManager3.A2(viewB, cVar, r82);
            if (fVar.f3196e == 1) {
                iE = cVar.f3062f ? staggeredGridLayoutManager3.q2(i11) : fVar2.l(i11);
                iT2 = staggeredGridLayoutManager3.f3047u.e(viewB) + iE;
                if (z11 && cVar.f3062f) {
                    d.a aVarD2 = staggeredGridLayoutManager3.d2(iE);
                    aVarD2.f3066b = -1;
                    aVarD2.f3065a = iA;
                    staggeredGridLayoutManager3.E.a(aVarD2);
                }
            } else {
                iT2 = cVar.f3062f ? staggeredGridLayoutManager3.t2(i11) : fVar2.p(i11);
                iE = iT2 - staggeredGridLayoutManager3.f3047u.e(viewB);
                if (z11 && cVar.f3062f) {
                    d.a aVarE2 = staggeredGridLayoutManager3.e2(iT2);
                    aVarE2.f3066b = 1;
                    aVarE2.f3065a = iA;
                    staggeredGridLayoutManager3.E.a(aVarE2);
                }
            }
            if (cVar.f3062f && fVar.f3195d == -1) {
                if (z11) {
                    staggeredGridLayoutManager3.M = true;
                } else {
                    if (!(fVar.f3196e == 1 ? staggeredGridLayoutManager3.T1() : staggeredGridLayoutManager3.U1())) {
                        d.a aVarF = staggeredGridLayoutManager3.E.f(iA);
                        if (aVarF != null) {
                            aVarF.f3068d = true;
                        }
                        staggeredGridLayoutManager3.M = true;
                    }
                }
            }
            staggeredGridLayoutManager3.V1(viewB, cVar, fVar);
            if (staggeredGridLayoutManager3.y2() && staggeredGridLayoutManager3.f3049w == 1) {
                iE2 = cVar.f3062f ? staggeredGridLayoutManager3.f3048v.i() : staggeredGridLayoutManager3.f3048v.i() - (((staggeredGridLayoutManager3.f3045s - 1) - fVar2.f3083e) * staggeredGridLayoutManager3.f3050x);
                iM = iE2 - staggeredGridLayoutManager3.f3048v.e(viewB);
            } else {
                iM = cVar.f3062f ? staggeredGridLayoutManager3.f3048v.m() : (fVar2.f3083e * staggeredGridLayoutManager3.f3050x) + staggeredGridLayoutManager3.f3048v.m();
                iE2 = staggeredGridLayoutManager3.f3048v.e(viewB) + iM;
            }
            int i12 = iE2;
            int i13 = iM;
            if (staggeredGridLayoutManager3.f3049w == 1) {
                staggeredGridLayoutManager3.E0(viewB, i13, iE, i12, iT2);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager3.E0(viewB, iE, i13, iT2, i12);
                staggeredGridLayoutManager = staggeredGridLayoutManager3;
            }
            if (cVar.f3062f) {
                staggeredGridLayoutManager.P2(staggeredGridLayoutManager.f3051y.f3196e, i10);
            } else {
                staggeredGridLayoutManager.V2(fVar2, staggeredGridLayoutManager.f3051y.f3196e, i10);
            }
            staggeredGridLayoutManager.F2(wVar, staggeredGridLayoutManager.f3051y);
            if (staggeredGridLayoutManager.f3051y.f3199h && viewB.hasFocusable()) {
                if (cVar.f3062f) {
                    staggeredGridLayoutManager.B.clear();
                } else {
                    staggeredGridLayoutManager.B.set(fVar2.f3083e, false);
                }
            }
            z10 = true;
            r82 = 0;
            staggeredGridLayoutManager3 = staggeredGridLayoutManager;
        }
        if (!z10) {
            staggeredGridLayoutManager3.F2(wVar, staggeredGridLayoutManager3.f3051y);
        }
        int iM2 = staggeredGridLayoutManager3.f3051y.f3196e == -1 ? staggeredGridLayoutManager3.f3047u.m() - staggeredGridLayoutManager3.t2(staggeredGridLayoutManager3.f3047u.m()) : staggeredGridLayoutManager3.q2(staggeredGridLayoutManager3.f3047u.i()) - staggeredGridLayoutManager3.f3047u.i();
        if (iM2 > 0) {
            return Math.min(fVar.f3193b, iM2);
        }
        return 0;
    }

    private int h2(int i10) {
        int iO = O();
        for (int i11 = 0; i11 < iO; i11++) {
            int iL0 = l0(N(i11));
            if (iL0 >= 0 && iL0 < i10) {
                return iL0;
            }
        }
        return 0;
    }

    private int l2(int i10) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            int iL0 = l0(N(iO));
            if (iL0 >= 0 && iL0 < i10) {
                return iL0;
            }
        }
        return 0;
    }

    private void m2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int i10;
        int iQ2 = q2(RtlSpacingHelper.UNDEFINED);
        if (iQ2 != Integer.MIN_VALUE && (i10 = this.f3047u.i() - iQ2) > 0) {
            int i11 = i10 - (-K2(-i10, wVar, b0Var));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f3047u.r(i11);
        }
    }

    private void n2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int iM;
        int iT2 = t2(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        if (iT2 != Integer.MAX_VALUE && (iM = iT2 - this.f3047u.m()) > 0) {
            int iK2 = iM - K2(iM, wVar, b0Var);
            if (!z10 || iK2 <= 0) {
                return;
            }
            this.f3047u.r(-iK2);
        }
    }

    private int q2(int i10) {
        int iL = this.f3046t[0].l(i10);
        for (int i11 = 1; i11 < this.f3045s; i11++) {
            int iL2 = this.f3046t[i11].l(i10);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int r2(int i10) {
        int iP = this.f3046t[0].p(i10);
        for (int i11 = 1; i11 < this.f3045s; i11++) {
            int iP2 = this.f3046t[i11].p(i10);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private int s2(int i10) {
        int iL = this.f3046t[0].l(i10);
        for (int i11 = 1; i11 < this.f3045s; i11++) {
            int iL2 = this.f3046t[i11].l(i10);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int t2(int i10) {
        int iP = this.f3046t[0].p(i10);
        for (int i11 = 1; i11 < this.f3045s; i11++) {
            int iP2 = this.f3046t[i11].p(i10);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private f u2(androidx.recyclerview.widget.f fVar) {
        int i10;
        int i11;
        int i12;
        if (C2(fVar.f3196e)) {
            i11 = this.f3045s - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f3045s;
            i11 = 0;
            i12 = 1;
        }
        f fVar2 = null;
        if (fVar.f3196e == 1) {
            int iM = this.f3047u.m();
            int i13 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            while (i11 != i10) {
                f fVar3 = this.f3046t[i11];
                int iL = fVar3.l(iM);
                if (iL < i13) {
                    fVar2 = fVar3;
                    i13 = iL;
                }
                i11 += i12;
            }
            return fVar2;
        }
        int i14 = this.f3047u.i();
        int i15 = RtlSpacingHelper.UNDEFINED;
        while (i11 != i10) {
            f fVar4 = this.f3046t[i11];
            int iP = fVar4.p(i14);
            if (iP > i15) {
                fVar2 = fVar4;
                i15 = iP;
            }
            i11 += i12;
        }
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void v2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.p2()
            goto Ld
        L9:
            int r0 = r6.o2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            goto L57
        L45:
            boolean r7 = r6.A
            if (r7 == 0) goto L4e
            int r7 = r6.o2()
            goto L52
        L4e:
            int r7 = r6.p2()
        L52:
            if (r3 > r7) goto L57
            r6.y1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.v2(int, int, int):void");
    }

    private void z2(View view, int i10, int i11, boolean z10) {
        o(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int iW2 = W2(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int iW22 = W2(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? M1(view, iW2, iW22, cVar) : K1(view, iW2, iW22, cVar)) {
            view.measure(iW2, iW22);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int A(RecyclerView.b0 b0Var) {
        return b2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean A0() {
        return this.f3052z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int B1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return K2(i10, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void C1(int i10) {
        e eVar = this.I;
        if (eVar != null && eVar.f3069a != i10) {
            eVar.b();
        }
        this.C = i10;
        this.D = RtlSpacingHelper.UNDEFINED;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int D1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return K2(i10, wVar, b0Var);
    }

    void D2(int i10, RecyclerView.b0 b0Var) {
        int iO2;
        int i11;
        if (i10 > 0) {
            iO2 = p2();
            i11 = 1;
        } else {
            iO2 = o2();
            i11 = -1;
        }
        this.f3051y.f3192a = true;
        T2(iO2, b0Var);
        L2(i11);
        androidx.recyclerview.widget.f fVar = this.f3051y;
        fVar.f3194c = iO2 + fVar.f3195d;
        fVar.f3193b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void H0(int i10) {
        super.H0(i10);
        for (int i11 = 0; i11 < this.f3045s; i11++) {
            this.f3046t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void H1(Rect rect, int i10, int i11) {
        int iS;
        int iS2;
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f3049w == 1) {
            iS2 = RecyclerView.q.s(i11, rect.height() + iK0, f0());
            iS = RecyclerView.q.s(i10, (this.f3050x * this.f3045s) + iI0, g0());
        } else {
            iS = RecyclerView.q.s(i10, rect.width() + iI0, g0());
            iS2 = RecyclerView.q.s(i11, (this.f3050x * this.f3045s) + iK0, f0());
        }
        G1(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r I() {
        return this.f3049w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void I0(int i10) {
        super.I0(i10);
        for (int i11 = 0; i11 < this.f3045s; i11++) {
            this.f3046t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void J0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.E.b();
        for (int i10 = 0; i10 < this.f3045s; i10++) {
            this.f3046t[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    int K2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        D2(i10, b0Var);
        int iG2 = g2(wVar, this.f3051y, b0Var);
        if (this.f3051y.f3193b >= iG2) {
            i10 = i10 < 0 ? -iG2 : iG2;
        }
        this.f3047u.r(-i10);
        this.G = this.A;
        androidx.recyclerview.widget.f fVar = this.f3051y;
        fVar.f3193b = 0;
        F2(wVar, fVar);
        return i10;
    }

    public void M2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        l(null);
        if (i10 == this.f3049w) {
            return;
        }
        this.f3049w = i10;
        i iVar = this.f3047u;
        this.f3047u = this.f3048v;
        this.f3048v = iVar;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.N0(recyclerView, wVar);
        t1(this.P);
        for (int i10 = 0; i10 < this.f3045s; i10++) {
            this.f3046t[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        O1(gVar);
    }

    public void N2(boolean z10) {
        l(null);
        e eVar = this.I;
        if (eVar != null && eVar.f3076h != z10) {
            eVar.f3076h = z10;
        }
        this.f3052z = z10;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View O0(View view, int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        View viewG;
        View viewM;
        if (O() == 0 || (viewG = G(view)) == null) {
            return null;
        }
        J2();
        int iC2 = c2(i10);
        if (iC2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewG.getLayoutParams();
        boolean z10 = cVar.f3062f;
        f fVar = cVar.f3061e;
        int iP2 = iC2 == 1 ? p2() : o2();
        T2(iP2, b0Var);
        L2(iC2);
        androidx.recyclerview.widget.f fVar2 = this.f3051y;
        fVar2.f3194c = fVar2.f3195d + iP2;
        fVar2.f3193b = (int) (this.f3047u.n() * 0.33333334f);
        androidx.recyclerview.widget.f fVar3 = this.f3051y;
        fVar3.f3199h = true;
        fVar3.f3192a = false;
        g2(wVar, fVar3, b0Var);
        this.G = this.A;
        if (!z10 && (viewM = fVar.m(iP2, iC2)) != null && viewM != viewG) {
            return viewM;
        }
        if (C2(iC2)) {
            for (int i11 = this.f3045s - 1; i11 >= 0; i11--) {
                View viewM2 = this.f3046t[i11].m(iP2, iC2);
                if (viewM2 != null && viewM2 != viewG) {
                    return viewM2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f3045s; i12++) {
                View viewM3 = this.f3046t[i12].m(iP2, iC2);
                if (viewM3 != null && viewM3 != viewG) {
                    return viewM3;
                }
            }
        }
        boolean z11 = (this.f3052z ^ true) == (iC2 == -1);
        if (!z10) {
            View viewH = H(z11 ? fVar.f() : fVar.g());
            if (viewH != null && viewH != viewG) {
                return viewH;
            }
        }
        if (C2(iC2)) {
            for (int i13 = this.f3045s - 1; i13 >= 0; i13--) {
                if (i13 != fVar.f3083e) {
                    View viewH2 = H(z11 ? this.f3046t[i13].f() : this.f3046t[i13].g());
                    if (viewH2 != null && viewH2 != viewG) {
                        return viewH2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f3045s; i14++) {
                View viewH3 = H(z11 ? this.f3046t[i14].f() : this.f3046t[i14].g());
                if (viewH3 != null && viewH3 != viewG) {
                    return viewH3;
                }
            }
        }
        return null;
    }

    public void O2(int i10) {
        l(null);
        if (i10 != this.f3045s) {
            x2();
            this.f3045s = i10;
            this.B = new BitSet(this.f3045s);
            this.f3046t = new f[this.f3045s];
            for (int i11 = 0; i11 < this.f3045s; i11++) {
                this.f3046t[i11] = new f(i11);
            }
            y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (O() > 0) {
            View viewJ2 = j2(false);
            View viewI2 = i2(false);
            if (viewJ2 == null || viewI2 == null) {
                return;
            }
            int iL0 = l0(viewJ2);
            int iL02 = l0(viewI2);
            if (iL0 < iL02) {
                accessibilityEvent.setFromIndex(iL0);
                accessibilityEvent.setToIndex(iL02);
            } else {
                accessibilityEvent.setFromIndex(iL02);
                accessibilityEvent.setToIndex(iL0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean Q1() {
        return this.I == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void R0(RecyclerView.w wVar, RecyclerView.b0 b0Var, x xVar) {
        super.R0(wVar, b0Var, xVar);
        xVar.t0("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    boolean R2(RecyclerView.b0 b0Var, b bVar) {
        int i10;
        if (!b0Var.e() && (i10 = this.C) != -1) {
            if (i10 >= 0 && i10 < b0Var.b()) {
                e eVar = this.I;
                if (eVar == null || eVar.f3069a == -1 || eVar.f3071c < 1) {
                    View viewH = H(this.C);
                    if (viewH != null) {
                        bVar.f3054a = this.A ? p2() : o2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f3056c) {
                                bVar.f3055b = (this.f3047u.i() - this.D) - this.f3047u.d(viewH);
                            } else {
                                bVar.f3055b = (this.f3047u.m() + this.D) - this.f3047u.g(viewH);
                            }
                            return true;
                        }
                        if (this.f3047u.e(viewH) > this.f3047u.n()) {
                            bVar.f3055b = bVar.f3056c ? this.f3047u.i() : this.f3047u.m();
                            return true;
                        }
                        int iG = this.f3047u.g(viewH) - this.f3047u.m();
                        if (iG < 0) {
                            bVar.f3055b = -iG;
                            return true;
                        }
                        int i11 = this.f3047u.i() - this.f3047u.d(viewH);
                        if (i11 < 0) {
                            bVar.f3055b = i11;
                            return true;
                        }
                        bVar.f3055b = RtlSpacingHelper.UNDEFINED;
                    } else {
                        int i12 = this.C;
                        bVar.f3054a = i12;
                        int i13 = this.D;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f3056c = W1(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f3057d = true;
                    }
                } else {
                    bVar.f3055b = RtlSpacingHelper.UNDEFINED;
                    bVar.f3054a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = RtlSpacingHelper.UNDEFINED;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int S(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f3049w == 1) {
            return Math.min(this.f3045s, b0Var.b());
        }
        return -1;
    }

    void S2(RecyclerView.b0 b0Var, b bVar) {
        if (R2(b0Var, bVar) || Q2(b0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f3054a = 0;
    }

    boolean T1() {
        int iL = this.f3046t[0].l(RtlSpacingHelper.UNDEFINED);
        for (int i10 = 1; i10 < this.f3045s; i10++) {
            if (this.f3046t[i10].l(RtlSpacingHelper.UNDEFINED) != iL) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void U0(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, x xVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.T0(view, xVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f3049w == 0) {
            xVar.w0(x.g.a(cVar.e(), cVar.f3062f ? this.f3045s : 1, -1, -1, false, false));
        } else {
            xVar.w0(x.g.a(-1, -1, cVar.e(), cVar.f3062f ? this.f3045s : 1, false, false));
        }
    }

    boolean U1() {
        int iP = this.f3046t[0].p(RtlSpacingHelper.UNDEFINED);
        for (int i10 = 1; i10 < this.f3045s; i10++) {
            if (this.f3046t[i10].p(RtlSpacingHelper.UNDEFINED) != iP) {
                return false;
            }
        }
        return true;
    }

    void U2(int i10) {
        this.f3050x = i10 / this.f3045s;
        this.J = View.MeasureSpec.makeMeasureSpec(i10, this.f3048v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W0(RecyclerView recyclerView, int i10, int i11) {
        v2(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void X0(RecyclerView recyclerView) {
        this.E.b();
        y1();
    }

    boolean X1() {
        int iO2;
        int iP2;
        if (O() == 0 || this.F == 0 || !v0()) {
            return false;
        }
        if (this.A) {
            iO2 = p2();
            iP2 = o2();
        } else {
            iO2 = o2();
            iP2 = p2();
        }
        if (iO2 == 0 && w2() != null) {
            this.E.b();
            z1();
            y1();
            return true;
        }
        if (!this.M) {
            return false;
        }
        int i10 = this.A ? -1 : 1;
        int i11 = iP2 + 1;
        d.a aVarE = this.E.e(iO2, i11, i10, true);
        if (aVarE == null) {
            this.M = false;
            this.E.d(i11);
            return false;
        }
        d.a aVarE2 = this.E.e(iO2, aVarE.f3065a, i10 * (-1), true);
        if (aVarE2 == null) {
            this.E.d(aVarE.f3065a);
        } else {
            this.E.d(aVarE2.f3065a + 1);
        }
        z1();
        y1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Y0(RecyclerView recyclerView, int i10, int i11, int i12) {
        v2(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(RecyclerView recyclerView, int i10, int i11) {
        v2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        v2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF c(int i10) {
        int iW1 = W1(i10);
        PointF pointF = new PointF();
        if (iW1 == 0) {
            return null;
        }
        if (this.f3049w == 0) {
            pointF.x = iW1;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iW1;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        B2(wVar, b0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.b0 b0Var) {
        super.d1(b0Var);
        this.C = -1;
        this.D = RtlSpacingHelper.UNDEFINED;
        this.I = null;
        this.L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.I = eVar;
            if (this.C != -1) {
                eVar.b();
                this.I.c();
            }
            y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public Parcelable i1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.f3076h = this.f3052z;
        eVar.f3077r = this.G;
        eVar.f3078s = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f3063a) == null) {
            eVar.f3073e = 0;
        } else {
            eVar.f3074f = iArr;
            eVar.f3073e = iArr.length;
            eVar.f3075g = dVar.f3064b;
        }
        if (O() <= 0) {
            eVar.f3069a = -1;
            eVar.f3070b = -1;
            eVar.f3071c = 0;
            return eVar;
        }
        eVar.f3069a = this.G ? p2() : o2();
        eVar.f3070b = k2();
        int i10 = this.f3045s;
        eVar.f3071c = i10;
        eVar.f3072d = new int[i10];
        for (int i11 = 0; i11 < this.f3045s; i11++) {
            if (this.G) {
                iP = this.f3046t[i11].l(RtlSpacingHelper.UNDEFINED);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f3047u.i();
                    iP -= iM;
                }
            } else {
                iP = this.f3046t[i11].p(RtlSpacingHelper.UNDEFINED);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f3047u.m();
                    iP -= iM;
                }
            }
            eVar.f3072d[i11] = iP;
        }
        return eVar;
    }

    View i2(boolean z10) {
        int iM = this.f3047u.m();
        int i10 = this.f3047u.i();
        View view = null;
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            int iG = this.f3047u.g(viewN);
            int iD = this.f3047u.d(viewN);
            if (iD > iM && iG < i10) {
                if (iD <= i10 || !z10) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void j1(int i10) {
        if (i10 == 0) {
            X1();
        }
    }

    View j2(boolean z10) {
        int iM = this.f3047u.m();
        int i10 = this.f3047u.i();
        int iO = O();
        View view = null;
        for (int i11 = 0; i11 < iO; i11++) {
            View viewN = N(i11);
            int iG = this.f3047u.g(viewN);
            if (this.f3047u.d(viewN) > iM && iG < i10) {
                if (iG >= iM || !z10) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    int k2() {
        View viewI2 = this.A ? i2(true) : j2(true);
        if (viewI2 == null) {
            return -1;
        }
        return l0(viewI2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void l(String str) {
        if (this.I == null) {
            super.l(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int o0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f3049w == 0) {
            return Math.min(this.f3045s, b0Var.b());
        }
        return -1;
    }

    int o2() {
        if (O() == 0) {
            return 0;
        }
        return l0(N(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean p() {
        return this.f3049w == 0;
    }

    int p2() {
        int iO = O();
        if (iO == 0) {
            return 0;
        }
        return l0(N(iO - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean q() {
        return this.f3049w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean r(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void t(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.q.c cVar) {
        int iL;
        int iP;
        if (this.f3049w != 0) {
            i10 = i11;
        }
        if (O() == 0 || i10 == 0) {
            return;
        }
        D2(i10, b0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.f3045s) {
            this.O = new int[this.f3045s];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f3045s; i13++) {
            androidx.recyclerview.widget.f fVar = this.f3051y;
            if (fVar.f3195d == -1) {
                iL = fVar.f3197f;
                iP = this.f3046t[i13].p(iL);
            } else {
                iL = this.f3046t[i13].l(fVar.f3198g);
                iP = this.f3051y.f3198g;
            }
            int i14 = iL - iP;
            if (i14 >= 0) {
                this.O[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.O, 0, i12);
        for (int i15 = 0; i15 < i12 && this.f3051y.a(b0Var); i15++) {
            cVar.a(this.f3051y.f3194c, this.O[i15]);
            androidx.recyclerview.widget.f fVar2 = this.f3051y;
            fVar2.f3194c += fVar2.f3195d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int v(RecyclerView.b0 b0Var) {
        return Z1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int w(RecyclerView.b0 b0Var) {
        return a2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean w0() {
        return this.F != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View w2() {
        /*
            r12 = this;
            int r0 = r12.O()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3045s
            r2.<init>(r3)
            int r3 = r12.f3045s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f3049w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.y2()
            if (r3 == 0) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = -1
        L22:
            boolean r7 = r12.A
            if (r7 == 0) goto L28
            r0 = -1
            goto L29
        L28:
            r1 = 0
        L29:
            if (r1 >= r0) goto L2c
            r6 = 1
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.N(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3061e
            int r9 = r9.f3083e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3061e
            boolean r9 = r12.Y1(r9)
            if (r9 == 0) goto L4b
            goto La1
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3061e
            int r9 = r9.f3083e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f3062f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.N(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.i r10 = r12.f3047u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.i r11 = r12.f3047u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            goto La1
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.i r10 = r12.f3047u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.i r11 = r12.f3047u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            goto La1
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f3061e
            int r8 = r8.f3083e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f3061e
            int r9 = r9.f3083e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = 1
            goto L9a
        L99:
            r8 = 0
        L9a:
            if (r3 >= 0) goto L9e
            r9 = 1
            goto L9f
        L9e:
            r9 = 0
        L9f:
            if (r8 == r9) goto La2
        La1:
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.w2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int x(RecyclerView.b0 b0Var) {
        return b2(b0Var);
    }

    public void x2() {
        this.E.b();
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int y(RecyclerView.b0 b0Var) {
        return Z1(b0Var);
    }

    boolean y2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int z(RecyclerView.b0 b0Var) {
        return a2(b0Var);
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f3063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List f3064b;

        d() {
        }

        private int i(int i10) {
            if (this.f3064b == null) {
                return -1;
            }
            a aVarF = f(i10);
            if (aVarF != null) {
                this.f3064b.remove(aVarF);
            }
            int size = this.f3064b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (((a) this.f3064b.get(i11)).f3065a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            a aVar = (a) this.f3064b.get(i11);
            this.f3064b.remove(i11);
            return aVar.f3065a;
        }

        private void l(int i10, int i11) {
            List list = this.f3064b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f3064b.get(size);
                int i12 = aVar.f3065a;
                if (i12 >= i10) {
                    aVar.f3065a = i12 + i11;
                }
            }
        }

        private void m(int i10, int i11) {
            List list = this.f3064b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f3064b.get(size);
                int i13 = aVar.f3065a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f3064b.remove(size);
                    } else {
                        aVar.f3065a = i13 - i11;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f3064b == null) {
                this.f3064b = new ArrayList();
            }
            int size = this.f3064b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = (a) this.f3064b.get(i10);
                if (aVar2.f3065a == aVar.f3065a) {
                    this.f3064b.remove(i10);
                }
                if (aVar2.f3065a >= aVar.f3065a) {
                    this.f3064b.add(i10, aVar);
                    return;
                }
            }
            this.f3064b.add(aVar);
        }

        void b() {
            int[] iArr = this.f3063a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3064b = null;
        }

        void c(int i10) {
            int[] iArr = this.f3063a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f3063a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f3063a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3063a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i10) {
            List list = this.f3064b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f3064b.get(size)).f3065a >= i10) {
                        this.f3064b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List list = this.f3064b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = (a) this.f3064b.get(i13);
                int i14 = aVar.f3065a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f3066b == i12 || (z10 && aVar.f3068d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List list = this.f3064b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f3064b.get(size);
                if (aVar.f3065a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i10) {
            int[] iArr = this.f3063a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        int h(int i10) {
            int[] iArr = this.f3063a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f3063a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f3063a.length;
            }
            int iMin = Math.min(i11 + 1, this.f3063a.length);
            Arrays.fill(this.f3063a, i10, iMin, -1);
            return iMin;
        }

        void j(int i10, int i11) {
            int[] iArr = this.f3063a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3063a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f3063a, i10, i12, -1);
            l(i10, i11);
        }

        void k(int i10, int i11) {
            int[] iArr = this.f3063a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3063a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f3063a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        void n(int i10, f fVar) {
            c(i10);
            this.f3063a[i10] = fVar.f3083e;
        }

        int o(int i10) {
            int length = this.f3063a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0040a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f3065a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f3066b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int[] f3067c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f3068d;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            class C0040a implements Parcelable.Creator {
                C0040a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a(Parcel parcel) {
                this.f3065a = parcel.readInt();
                this.f3066b = parcel.readInt();
                this.f3068d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f3067c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int b(int i10) {
                int[] iArr = this.f3067c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3065a + ", mGapDir=" + this.f3066b + ", mHasUnwantedGapAfter=" + this.f3068d + ", mGapPerSpan=" + Arrays.toString(this.f3067c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f3065a);
                parcel.writeInt(this.f3066b);
                parcel.writeInt(this.f3068d ? 1 : 0);
                int[] iArr = this.f3067c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f3067c);
                }
            }

            a() {
            }
        }
    }
}
