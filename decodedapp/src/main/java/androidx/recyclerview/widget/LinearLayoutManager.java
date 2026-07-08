package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import n0.x;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.q implements RecyclerView.a0.b {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;

    /* JADX INFO: renamed from: s */
    int f2844s;

    /* JADX INFO: renamed from: t */
    private c f2845t;

    /* JADX INFO: renamed from: u */
    i f2846u;

    /* JADX INFO: renamed from: v */
    private boolean f2847v;

    /* JADX INFO: renamed from: w */
    private boolean f2848w;

    /* JADX INFO: renamed from: x */
    boolean f2849x;

    /* JADX INFO: renamed from: y */
    private boolean f2850y;

    /* JADX INFO: renamed from: z */
    private boolean f2851z;

    static class a {

        /* JADX INFO: renamed from: a */
        i f2852a;

        /* JADX INFO: renamed from: b */
        int f2853b;

        /* JADX INFO: renamed from: c */
        int f2854c;

        /* JADX INFO: renamed from: d */
        boolean f2855d;

        /* JADX INFO: renamed from: e */
        boolean f2856e;

        a() {
            e();
        }

        void a() {
            this.f2854c = this.f2855d ? this.f2852a.i() : this.f2852a.m();
        }

        public void b(View view, int i10) {
            if (this.f2855d) {
                this.f2854c = this.f2852a.d(view) + this.f2852a.o();
            } else {
                this.f2854c = this.f2852a.g(view);
            }
            this.f2853b = i10;
        }

        public void c(View view, int i10) {
            int iO = this.f2852a.o();
            if (iO >= 0) {
                b(view, i10);
                return;
            }
            this.f2853b = i10;
            if (this.f2855d) {
                int i11 = (this.f2852a.i() - iO) - this.f2852a.d(view);
                this.f2854c = this.f2852a.i() - i11;
                if (i11 > 0) {
                    int iE = this.f2854c - this.f2852a.e(view);
                    int iM = this.f2852a.m();
                    int iMin = iE - (iM + Math.min(this.f2852a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f2854c += Math.min(i11, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f2852a.g(view);
            int iM2 = iG - this.f2852a.m();
            this.f2854c = iG;
            if (iM2 > 0) {
                int i12 = (this.f2852a.i() - Math.min(0, (this.f2852a.i() - iO) - this.f2852a.d(view))) - (iG + this.f2852a.e(view));
                if (i12 < 0) {
                    this.f2854c -= Math.min(iM2, -i12);
                }
            }
        }

        boolean d(View view, RecyclerView.b0 b0Var) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return !rVar.c() && rVar.a() >= 0 && rVar.a() < b0Var.b();
        }

        void e() {
            this.f2853b = -1;
            this.f2854c = RtlSpacingHelper.UNDEFINED;
            this.f2855d = false;
            this.f2856e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f2853b + ", mCoordinate=" + this.f2854c + ", mLayoutFromEnd=" + this.f2855d + ", mValid=" + this.f2856e + '}';
        }
    }

    protected static class b {

        /* JADX INFO: renamed from: a */
        public int f2857a;

        /* JADX INFO: renamed from: b */
        public boolean f2858b;

        /* JADX INFO: renamed from: c */
        public boolean f2859c;

        /* JADX INFO: renamed from: d */
        public boolean f2860d;

        protected b() {
        }

        void a() {
            this.f2857a = 0;
            this.f2858b = false;
            this.f2859c = false;
            this.f2860d = false;
        }
    }

    static class c {

        /* JADX INFO: renamed from: b */
        int f2862b;

        /* JADX INFO: renamed from: c */
        int f2863c;

        /* JADX INFO: renamed from: d */
        int f2864d;

        /* JADX INFO: renamed from: e */
        int f2865e;

        /* JADX INFO: renamed from: f */
        int f2866f;

        /* JADX INFO: renamed from: g */
        int f2867g;

        /* JADX INFO: renamed from: k */
        int f2871k;

        /* JADX INFO: renamed from: m */
        boolean f2873m;

        /* JADX INFO: renamed from: a */
        boolean f2861a = true;

        /* JADX INFO: renamed from: h */
        int f2868h = 0;

        /* JADX INFO: renamed from: i */
        int f2869i = 0;

        /* JADX INFO: renamed from: j */
        boolean f2870j = false;

        /* JADX INFO: renamed from: l */
        List f2872l = null;

        c() {
        }

        private View e() {
            int size = this.f2872l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((RecyclerView.f0) this.f2872l.get(i10)).f2964a;
                RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
                if (!rVar.c() && this.f2864d == rVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f2864d = -1;
            } else {
                this.f2864d = ((RecyclerView.r) viewF.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.b0 b0Var) {
            int i10 = this.f2864d;
            return i10 >= 0 && i10 < b0Var.b();
        }

        View d(RecyclerView.w wVar) {
            if (this.f2872l != null) {
                return e();
            }
            View viewO = wVar.o(this.f2864d);
            this.f2864d += this.f2865e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f2872l.size();
            View view2 = null;
            int i10 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = ((RecyclerView.f0) this.f2872l.get(i11)).f2964a;
                RecyclerView.r rVar = (RecyclerView.r) view3.getLayoutParams();
                if (view3 != view && !rVar.c() && (iA = (rVar.a() - this.f2864d) * this.f2865e) >= 0 && iA < i10) {
                    if (iA == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = iA;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        int f2874a;

        /* JADX INFO: renamed from: b */
        int f2875b;

        /* JADX INFO: renamed from: c */
        boolean f2876c;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        boolean b() {
            return this.f2874a >= 0;
        }

        void c() {
            this.f2874a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2874a);
            parcel.writeInt(this.f2875b);
            parcel.writeInt(this.f2876c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f2874a = parcel.readInt();
            this.f2875b = parcel.readInt();
            this.f2876c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f2874a = dVar.f2874a;
            this.f2875b = dVar.f2875b;
            this.f2876c = dVar.f2876c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void A2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int iO = O();
        if (!this.f2849x) {
            for (int i13 = 0; i13 < iO; i13++) {
                View viewN = N(i13);
                if (this.f2846u.d(viewN) > i12 || this.f2846u.p(viewN) > i12) {
                    y2(wVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iO - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewN2 = N(i15);
            if (this.f2846u.d(viewN2) > i12 || this.f2846u.p(viewN2) > i12) {
                y2(wVar, i14, i15);
                return;
            }
        }
    }

    private void C2() {
        if (this.f2844s == 1 || !s2()) {
            this.f2849x = this.f2848w;
        } else {
            this.f2849x = !this.f2848w;
        }
    }

    private boolean I2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        View viewK2;
        boolean z10 = false;
        if (O() == 0) {
            return false;
        }
        View viewA0 = a0();
        if (viewA0 != null && aVar.d(viewA0, b0Var)) {
            aVar.c(viewA0, l0(viewA0));
            return true;
        }
        boolean z11 = this.f2847v;
        boolean z12 = this.f2850y;
        if (z11 != z12 || (viewK2 = k2(wVar, b0Var, aVar.f2855d, z12)) == null) {
            return false;
        }
        aVar.b(viewK2, l0(viewK2));
        if (!b0Var.e() && Q1()) {
            int iG = this.f2846u.g(viewK2);
            int iD = this.f2846u.d(viewK2);
            int iM = this.f2846u.m();
            int i10 = this.f2846u.i();
            boolean z13 = iD <= iM && iG < iM;
            if (iG >= i10 && iD > i10) {
                z10 = true;
            }
            if (z13 || z10) {
                if (aVar.f2855d) {
                    iM = i10;
                }
                aVar.f2854c = iM;
            }
        }
        return true;
    }

    private boolean J2(RecyclerView.b0 b0Var, a aVar) {
        int i10;
        if (!b0Var.e() && (i10 = this.A) != -1) {
            if (i10 >= 0 && i10 < b0Var.b()) {
                aVar.f2853b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.b()) {
                    boolean z10 = this.D.f2876c;
                    aVar.f2855d = z10;
                    if (z10) {
                        aVar.f2854c = this.f2846u.i() - this.D.f2875b;
                    } else {
                        aVar.f2854c = this.f2846u.m() + this.D.f2875b;
                    }
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z11 = this.f2849x;
                    aVar.f2855d = z11;
                    if (z11) {
                        aVar.f2854c = this.f2846u.i() - this.B;
                    } else {
                        aVar.f2854c = this.f2846u.m() + this.B;
                    }
                    return true;
                }
                View viewH = H(this.A);
                if (viewH == null) {
                    if (O() > 0) {
                        aVar.f2855d = (this.A < l0(N(0))) == this.f2849x;
                    }
                    aVar.a();
                } else {
                    if (this.f2846u.e(viewH) > this.f2846u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f2846u.g(viewH) - this.f2846u.m() < 0) {
                        aVar.f2854c = this.f2846u.m();
                        aVar.f2855d = false;
                        return true;
                    }
                    if (this.f2846u.i() - this.f2846u.d(viewH) < 0) {
                        aVar.f2854c = this.f2846u.i();
                        aVar.f2855d = true;
                        return true;
                    }
                    aVar.f2854c = aVar.f2855d ? this.f2846u.d(viewH) + this.f2846u.o() : this.f2846u.g(viewH);
                }
                return true;
            }
            this.A = -1;
            this.B = RtlSpacingHelper.UNDEFINED;
        }
        return false;
    }

    private void K2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        if (J2(b0Var, aVar) || I2(wVar, b0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f2853b = this.f2850y ? b0Var.b() - 1 : 0;
    }

    private void L2(int i10, int i11, boolean z10, RecyclerView.b0 b0Var) {
        int iM;
        this.f2845t.f2873m = B2();
        this.f2845t.f2866f = i10;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        R1(b0Var, iArr);
        int iMax = Math.max(0, this.H[0]);
        int iMax2 = Math.max(0, this.H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f2845t;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f2868h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f2869i = iMax;
        if (z11) {
            cVar.f2868h = i12 + this.f2846u.j();
            View viewN2 = n2();
            c cVar2 = this.f2845t;
            cVar2.f2865e = this.f2849x ? -1 : 1;
            int iL0 = l0(viewN2);
            c cVar3 = this.f2845t;
            cVar2.f2864d = iL0 + cVar3.f2865e;
            cVar3.f2862b = this.f2846u.d(viewN2);
            iM = this.f2846u.d(viewN2) - this.f2846u.i();
        } else {
            View viewO2 = o2();
            this.f2845t.f2868h += this.f2846u.m();
            c cVar4 = this.f2845t;
            cVar4.f2865e = this.f2849x ? 1 : -1;
            int iL02 = l0(viewO2);
            c cVar5 = this.f2845t;
            cVar4.f2864d = iL02 + cVar5.f2865e;
            cVar5.f2862b = this.f2846u.g(viewO2);
            iM = (-this.f2846u.g(viewO2)) + this.f2846u.m();
        }
        c cVar6 = this.f2845t;
        cVar6.f2863c = i11;
        if (z10) {
            cVar6.f2863c = i11 - iM;
        }
        cVar6.f2867g = iM;
    }

    private void M2(int i10, int i11) {
        this.f2845t.f2863c = this.f2846u.i() - i11;
        c cVar = this.f2845t;
        cVar.f2865e = this.f2849x ? -1 : 1;
        cVar.f2864d = i10;
        cVar.f2866f = 1;
        cVar.f2862b = i11;
        cVar.f2867g = RtlSpacingHelper.UNDEFINED;
    }

    private void N2(a aVar) {
        M2(aVar.f2853b, aVar.f2854c);
    }

    private void O2(int i10, int i11) {
        this.f2845t.f2863c = i11 - this.f2846u.m();
        c cVar = this.f2845t;
        cVar.f2864d = i10;
        cVar.f2865e = this.f2849x ? 1 : -1;
        cVar.f2866f = -1;
        cVar.f2862b = i11;
        cVar.f2867g = RtlSpacingHelper.UNDEFINED;
    }

    private void P2(a aVar) {
        O2(aVar.f2853b, aVar.f2854c);
    }

    private int T1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        Y1();
        return l.a(b0Var, this.f2846u, c2(!this.f2851z, true), b2(!this.f2851z, true), this, this.f2851z);
    }

    private int U1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        Y1();
        return l.b(b0Var, this.f2846u, c2(!this.f2851z, true), b2(!this.f2851z, true), this, this.f2851z, this.f2849x);
    }

    private int V1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        Y1();
        return l.c(b0Var, this.f2846u, c2(!this.f2851z, true), b2(!this.f2851z, true), this, this.f2851z);
    }

    private View a2() {
        return g2(0, O());
    }

    private View e2() {
        return g2(O() - 1, -1);
    }

    private View i2() {
        return this.f2849x ? a2() : e2();
    }

    private View j2() {
        return this.f2849x ? e2() : a2();
    }

    private int l2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int i11;
        int i12 = this.f2846u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -D2(-i12, wVar, b0Var);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f2846u.i() - i14) <= 0) {
            return i13;
        }
        this.f2846u.r(i11);
        return i11 + i13;
    }

    private int m2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int iM;
        int iM2 = i10 - this.f2846u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i11 = -D2(iM2, wVar, b0Var);
        int i12 = i10 + i11;
        if (!z10 || (iM = i12 - this.f2846u.m()) <= 0) {
            return i11;
        }
        this.f2846u.r(-iM);
        return i11 - iM;
    }

    private View n2() {
        return N(this.f2849x ? 0 : O() - 1);
    }

    private View o2() {
        return N(this.f2849x ? O() - 1 : 0);
    }

    private void v2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10, int i11) {
        if (!b0Var.g() || O() == 0 || b0Var.e() || !Q1()) {
            return;
        }
        List listK = wVar.k();
        int size = listK.size();
        int iL0 = l0(N(0));
        int iE = 0;
        int iE2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.f0 f0Var = (RecyclerView.f0) listK.get(i12);
            if (!f0Var.x()) {
                if ((f0Var.o() < iL0) != this.f2849x) {
                    iE += this.f2846u.e(f0Var.f2964a);
                } else {
                    iE2 += this.f2846u.e(f0Var.f2964a);
                }
            }
        }
        this.f2845t.f2872l = listK;
        if (iE > 0) {
            O2(l0(o2()), i10);
            c cVar = this.f2845t;
            cVar.f2868h = iE;
            cVar.f2863c = 0;
            cVar.a();
            Z1(wVar, this.f2845t, b0Var, false);
        }
        if (iE2 > 0) {
            M2(l0(n2()), i11);
            c cVar2 = this.f2845t;
            cVar2.f2868h = iE2;
            cVar2.f2863c = 0;
            cVar2.a();
            Z1(wVar, this.f2845t, b0Var, false);
        }
        this.f2845t.f2872l = null;
    }

    private void x2(RecyclerView.w wVar, c cVar) {
        if (!cVar.f2861a || cVar.f2873m) {
            return;
        }
        int i10 = cVar.f2867g;
        int i11 = cVar.f2869i;
        if (cVar.f2866f == -1) {
            z2(wVar, i10, i11);
        } else {
            A2(wVar, i10, i11);
        }
    }

    private void y2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                s1(i10, wVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                s1(i12, wVar);
            }
        }
    }

    private void z2(RecyclerView.w wVar, int i10, int i11) {
        int iO = O();
        if (i10 < 0) {
            return;
        }
        int iH = (this.f2846u.h() - i10) + i11;
        if (this.f2849x) {
            for (int i12 = 0; i12 < iO; i12++) {
                View viewN = N(i12);
                if (this.f2846u.g(viewN) < iH || this.f2846u.q(viewN) < iH) {
                    y2(wVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iO - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewN2 = N(i14);
            if (this.f2846u.g(viewN2) < iH || this.f2846u.q(viewN2) < iH) {
                y2(wVar, i13, i14);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int A(RecyclerView.b0 b0Var) {
        return V1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean A0() {
        return this.f2848w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int B1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f2844s == 1) {
            return 0;
        }
        return D2(i10, wVar, b0Var);
    }

    boolean B2() {
        return this.f2846u.k() == 0 && this.f2846u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void C1(int i10) {
        this.A = i10;
        this.B = RtlSpacingHelper.UNDEFINED;
        d dVar = this.D;
        if (dVar != null) {
            dVar.c();
        }
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int D1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f2844s == 0) {
            return 0;
        }
        return D2(i10, wVar, b0Var);
    }

    int D2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        Y1();
        this.f2845t.f2861a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        L2(i11, iAbs, true, b0Var);
        c cVar = this.f2845t;
        int iZ1 = cVar.f2867g + Z1(wVar, cVar, b0Var, false);
        if (iZ1 < 0) {
            return 0;
        }
        if (iAbs > iZ1) {
            i10 = i11 * iZ1;
        }
        this.f2846u.r(-i10);
        this.f2845t.f2871k = i10;
        return i10;
    }

    public void E2(int i10, int i11) {
        this.A = i10;
        this.B = i11;
        d dVar = this.D;
        if (dVar != null) {
            dVar.c();
        }
        y1();
    }

    public void F2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        l(null);
        if (i10 != this.f2844s || this.f2846u == null) {
            i iVarB = i.b(this, i10);
            this.f2846u = iVarB;
            this.E.f2852a = iVarB;
            this.f2844s = i10;
            y1();
        }
    }

    public void G2(boolean z10) {
        l(null);
        if (z10 == this.f2848w) {
            return;
        }
        this.f2848w = z10;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View H(int i10) {
        int iO = O();
        if (iO == 0) {
            return null;
        }
        int iL0 = i10 - l0(N(0));
        if (iL0 >= 0 && iL0 < iO) {
            View viewN = N(iL0);
            if (l0(viewN) == i10) {
                return viewN;
            }
        }
        return super.H(i10);
    }

    public void H2(boolean z10) {
        l(null);
        if (this.f2850y == z10) {
            return;
        }
        this.f2850y = z10;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r I() {
        return new RecyclerView.r(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    boolean L1() {
        return (c0() == 1073741824 || t0() == 1073741824 || !u0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.N0(recyclerView, wVar);
        if (this.C) {
            p1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        O1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View O0(View view, int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int iW1;
        C2();
        if (O() == 0 || (iW1 = W1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        Y1();
        L2(iW1, (int) (this.f2846u.n() * 0.33333334f), false, b0Var);
        c cVar = this.f2845t;
        cVar.f2867g = RtlSpacingHelper.UNDEFINED;
        cVar.f2861a = false;
        Z1(wVar, cVar, b0Var, true);
        View viewJ2 = iW1 == -1 ? j2() : i2();
        View viewO2 = iW1 == -1 ? o2() : n2();
        if (!viewO2.hasFocusable()) {
            return viewJ2;
        }
        if (viewJ2 == null) {
            return null;
        }
        return viewO2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(d2());
            accessibilityEvent.setToIndex(f2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean Q1() {
        return this.D == null && this.f2847v == this.f2850y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void R0(RecyclerView.w wVar, RecyclerView.b0 b0Var, x xVar) {
        super.R0(wVar, b0Var, xVar);
        RecyclerView.h hVar = this.f3001b.f2910v;
        if (hVar == null || hVar.f() <= 0 || Build.VERSION.SDK_INT < 23) {
            return;
        }
        xVar.b(x.a.B);
    }

    protected void R1(RecyclerView.b0 b0Var, int[] iArr) {
        int i10;
        int iP2 = p2(b0Var);
        if (this.f2845t.f2866f == -1) {
            i10 = 0;
        } else {
            i10 = iP2;
            iP2 = 0;
        }
        iArr[0] = iP2;
        iArr[1] = i10;
    }

    void S1(RecyclerView.b0 b0Var, c cVar, RecyclerView.q.c cVar2) {
        int i10 = cVar.f2864d;
        if (i10 < 0 || i10 >= b0Var.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f2867g));
    }

    int W1(int i10) {
        if (i10 == 1) {
            return (this.f2844s != 1 && s2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f2844s != 1 && s2()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.f2844s == 0) {
                return -1;
            }
            return RtlSpacingHelper.UNDEFINED;
        }
        if (i10 == 33) {
            if (this.f2844s == 1) {
                return -1;
            }
            return RtlSpacingHelper.UNDEFINED;
        }
        if (i10 == 66) {
            if (this.f2844s == 0) {
                return 1;
            }
            return RtlSpacingHelper.UNDEFINED;
        }
        if (i10 == 130 && this.f2844s == 1) {
            return 1;
        }
        return RtlSpacingHelper.UNDEFINED;
    }

    c X1() {
        return new c();
    }

    void Y1() {
        if (this.f2845t == null) {
            this.f2845t = X1();
        }
    }

    int Z1(RecyclerView.w wVar, c cVar, RecyclerView.b0 b0Var, boolean z10) {
        int i10 = cVar.f2863c;
        int i11 = cVar.f2867g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f2867g = i11 + i10;
            }
            x2(wVar, cVar);
        }
        int i12 = cVar.f2863c + cVar.f2868h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f2873m && i12 <= 0) || !cVar.c(b0Var)) {
                break;
            }
            bVar.a();
            u2(wVar, b0Var, cVar, bVar);
            if (!bVar.f2858b) {
                cVar.f2862b += bVar.f2857a * cVar.f2866f;
                if (!bVar.f2859c || cVar.f2872l != null || !b0Var.e()) {
                    int i13 = cVar.f2863c;
                    int i14 = bVar.f2857a;
                    cVar.f2863c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f2867g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f2857a;
                    cVar.f2867g = i16;
                    int i17 = cVar.f2863c;
                    if (i17 < 0) {
                        cVar.f2867g = i16 + i17;
                    }
                    x2(wVar, cVar);
                }
                if (z10 && bVar.f2860d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f2863c;
    }

    View b2(boolean z10, boolean z11) {
        return this.f2849x ? h2(0, O(), z10, z11) : h2(O() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF c(int i10) {
        if (O() == 0) {
            return null;
        }
        int i11 = (i10 < l0(N(0))) != this.f2849x ? -1 : 1;
        return this.f2844s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iL2;
        int i14;
        View viewH;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.D == null && this.A == -1) && b0Var.b() == 0) {
            p1(wVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.b()) {
            this.A = this.D.f2874a;
        }
        Y1();
        this.f2845t.f2861a = false;
        C2();
        View viewA0 = a0();
        a aVar = this.E;
        if (!aVar.f2856e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f2855d = this.f2849x ^ this.f2850y;
            K2(wVar, b0Var, aVar2);
            this.E.f2856e = true;
        } else if (viewA0 != null && (this.f2846u.g(viewA0) >= this.f2846u.i() || this.f2846u.d(viewA0) <= this.f2846u.m())) {
            this.E.c(viewA0, l0(viewA0));
        }
        c cVar = this.f2845t;
        cVar.f2866f = cVar.f2871k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        R1(b0Var, iArr);
        int iMax = Math.max(0, this.H[0]) + this.f2846u.m();
        int iMax2 = Math.max(0, this.H[1]) + this.f2846u.j();
        if (b0Var.e() && (i14 = this.A) != -1 && this.B != Integer.MIN_VALUE && (viewH = H(i14)) != null) {
            if (this.f2849x) {
                i15 = this.f2846u.i() - this.f2846u.d(viewH);
                iG = this.B;
            } else {
                iG = this.f2846u.g(viewH) - this.f2846u.m();
                i15 = this.B;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f2855d ? !this.f2849x : this.f2849x) {
            i16 = 1;
        }
        w2(wVar, b0Var, aVar3, i16);
        B(wVar);
        this.f2845t.f2873m = B2();
        this.f2845t.f2870j = b0Var.e();
        this.f2845t.f2869i = 0;
        a aVar4 = this.E;
        if (aVar4.f2855d) {
            P2(aVar4);
            c cVar2 = this.f2845t;
            cVar2.f2868h = iMax;
            Z1(wVar, cVar2, b0Var, false);
            c cVar3 = this.f2845t;
            i11 = cVar3.f2862b;
            int i18 = cVar3.f2864d;
            int i19 = cVar3.f2863c;
            if (i19 > 0) {
                iMax2 += i19;
            }
            N2(this.E);
            c cVar4 = this.f2845t;
            cVar4.f2868h = iMax2;
            cVar4.f2864d += cVar4.f2865e;
            Z1(wVar, cVar4, b0Var, false);
            c cVar5 = this.f2845t;
            i10 = cVar5.f2862b;
            int i20 = cVar5.f2863c;
            if (i20 > 0) {
                O2(i18, i11);
                c cVar6 = this.f2845t;
                cVar6.f2868h = i20;
                Z1(wVar, cVar6, b0Var, false);
                i11 = this.f2845t.f2862b;
            }
        } else {
            N2(aVar4);
            c cVar7 = this.f2845t;
            cVar7.f2868h = iMax2;
            Z1(wVar, cVar7, b0Var, false);
            c cVar8 = this.f2845t;
            i10 = cVar8.f2862b;
            int i21 = cVar8.f2864d;
            int i22 = cVar8.f2863c;
            if (i22 > 0) {
                iMax += i22;
            }
            P2(this.E);
            c cVar9 = this.f2845t;
            cVar9.f2868h = iMax;
            cVar9.f2864d += cVar9.f2865e;
            Z1(wVar, cVar9, b0Var, false);
            c cVar10 = this.f2845t;
            i11 = cVar10.f2862b;
            int i23 = cVar10.f2863c;
            if (i23 > 0) {
                M2(i21, i10);
                c cVar11 = this.f2845t;
                cVar11.f2868h = i23;
                Z1(wVar, cVar11, b0Var, false);
                i10 = this.f2845t.f2862b;
            }
        }
        if (O() > 0) {
            if (this.f2849x ^ this.f2850y) {
                int iL22 = l2(i10, wVar, b0Var, true);
                i12 = i11 + iL22;
                i13 = i10 + iL22;
                iL2 = m2(i12, wVar, b0Var, false);
            } else {
                int iM2 = m2(i11, wVar, b0Var, true);
                i12 = i11 + iM2;
                i13 = i10 + iM2;
                iL2 = l2(i13, wVar, b0Var, false);
            }
            i11 = i12 + iL2;
            i10 = i13 + iL2;
        }
        v2(wVar, b0Var, i11, i10);
        if (b0Var.e()) {
            this.E.e();
        } else {
            this.f2846u.s();
        }
        this.f2847v = this.f2850y;
    }

    View c2(boolean z10, boolean z11) {
        return this.f2849x ? h2(O() - 1, -1, z10, z11) : h2(0, O(), z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.b0 b0Var) {
        super.d1(b0Var);
        this.D = null;
        this.A = -1;
        this.B = RtlSpacingHelper.UNDEFINED;
        this.E.e();
    }

    public int d2() {
        View viewH2 = h2(0, O(), false, true);
        if (viewH2 == null) {
            return -1;
        }
        return l0(viewH2);
    }

    public int f2() {
        View viewH2 = h2(O() - 1, -1, false, true);
        if (viewH2 == null) {
            return -1;
        }
        return l0(viewH2);
    }

    View g2(int i10, int i11) {
        int i12;
        int i13;
        Y1();
        if (i11 <= i10 && i11 >= i10) {
            return N(i10);
        }
        if (this.f2846u.g(N(i10)) < this.f2846u.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f2844s == 0 ? this.f3004e.a(i10, i11, i12, i13) : this.f3005f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.D = dVar;
            if (this.A != -1) {
                dVar.c();
            }
            y1();
        }
    }

    View h2(int i10, int i11, boolean z10, boolean z11) {
        Y1();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.f2844s == 0 ? this.f3004e.a(i10, i11, i12, i13) : this.f3005f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public Parcelable i1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (O() <= 0) {
            dVar.c();
            return dVar;
        }
        Y1();
        boolean z10 = this.f2847v ^ this.f2849x;
        dVar.f2876c = z10;
        if (z10) {
            View viewN2 = n2();
            dVar.f2875b = this.f2846u.i() - this.f2846u.d(viewN2);
            dVar.f2874a = l0(viewN2);
            return dVar;
        }
        View viewO2 = o2();
        dVar.f2874a = l0(viewO2);
        dVar.f2875b = this.f2846u.g(viewO2) - this.f2846u.m();
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View k2(androidx.recyclerview.widget.RecyclerView.w r17, androidx.recyclerview.widget.RecyclerView.b0 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.Y1()
            int r1 = r0.O()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.O()
            int r1 = r1 - r3
            r4 = -1
            r5 = -1
            goto L18
        L15:
            r4 = r1
            r1 = 0
            r5 = 1
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.i r7 = r0.f2846u
            int r7 = r7.m()
            androidx.recyclerview.widget.i r8 = r0.f2846u
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.N(r1)
            int r13 = r0.l0(r12)
            androidx.recyclerview.widget.i r14 = r0.f2846u
            int r14 = r14.g(r12)
            androidx.recyclerview.widget.i r15 = r0.f2846u
            int r15 = r15.d(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$r r13 = (androidx.recyclerview.widget.RecyclerView.r) r13
            boolean r13 = r13.c()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = 1
            goto L5c
        L5b:
            r13 = 0
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = 1
            goto L63
        L62:
            r14 = 0
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            return r9
        L7d:
            if (r10 == 0) goto L80
            return r10
        L80:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.k2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void l(String str) {
        if (this.D == null) {
            super.l(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    boolean l1(int i10, Bundle bundle) {
        int iMin;
        if (super.l1(i10, bundle)) {
            return true;
        }
        if (i10 == 16908343 && bundle != null) {
            if (this.f2844s == 1) {
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i11 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f3001b;
                iMin = Math.min(i11, o0(recyclerView.f2881c, recyclerView.f2903r0) - 1);
            } else {
                int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i12 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f3001b;
                iMin = Math.min(i12, S(recyclerView2.f2881c, recyclerView2.f2903r0) - 1);
            }
            if (iMin >= 0) {
                E2(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean p() {
        return this.f2844s == 0;
    }

    protected int p2(RecyclerView.b0 b0Var) {
        if (b0Var.d()) {
            return this.f2846u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean q() {
        return this.f2844s == 1;
    }

    public int q2() {
        return this.f2844s;
    }

    public boolean r2() {
        return this.f2848w;
    }

    protected boolean s2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void t(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.q.c cVar) {
        if (this.f2844s != 0) {
            i10 = i11;
        }
        if (O() == 0 || i10 == 0) {
            return;
        }
        Y1();
        L2(i10 > 0 ? 1 : -1, Math.abs(i10), true, b0Var);
        S1(b0Var, this.f2845t, cVar);
    }

    public boolean t2() {
        return this.f2851z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void u(int i10, RecyclerView.q.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.D;
        if (dVar == null || !dVar.b()) {
            C2();
            z10 = this.f2849x;
            i11 = this.A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z10 = dVar2.f2876c;
            i11 = dVar2.f2874a;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    void u2(RecyclerView.w wVar, RecyclerView.b0 b0Var, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iI0;
        int iF;
        int i14;
        int i15;
        View viewD = cVar.d(wVar);
        if (viewD == null) {
            bVar.f2858b = true;
            return;
        }
        RecyclerView.r rVar = (RecyclerView.r) viewD.getLayoutParams();
        if (cVar.f2872l == null) {
            if (this.f2849x == (cVar.f2866f == -1)) {
                i(viewD);
            } else {
                j(viewD, 0);
            }
        } else {
            if (this.f2849x == (cVar.f2866f == -1)) {
                g(viewD);
            } else {
                h(viewD, 0);
            }
        }
        F0(viewD, 0, 0);
        bVar.f2857a = this.f2846u.e(viewD);
        if (this.f2844s == 1) {
            if (s2()) {
                iF = s0() - j0();
                iI0 = iF - this.f2846u.f(viewD);
            } else {
                iI0 = i0();
                iF = this.f2846u.f(viewD) + iI0;
            }
            if (cVar.f2866f == -1) {
                i15 = cVar.f2862b;
                i14 = i15 - bVar.f2857a;
            } else {
                i14 = cVar.f2862b;
                i15 = bVar.f2857a + i14;
            }
            int i16 = iI0;
            i13 = i14;
            i12 = i16;
            i11 = i15;
            i10 = iF;
        } else {
            int iK0 = k0();
            int iF2 = this.f2846u.f(viewD) + iK0;
            if (cVar.f2866f == -1) {
                int i17 = cVar.f2862b;
                i12 = i17 - bVar.f2857a;
                i10 = i17;
                i11 = iF2;
            } else {
                int i18 = cVar.f2862b;
                i10 = bVar.f2857a + i18;
                i11 = iF2;
                i12 = i18;
            }
            i13 = iK0;
        }
        E0(viewD, i12, i13, i10, i11);
        if (rVar.c() || rVar.b()) {
            bVar.f2859c = true;
        }
        bVar.f2860d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int v(RecyclerView.b0 b0Var) {
        return T1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int w(RecyclerView.b0 b0Var) {
        return U1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean w0() {
        return true;
    }

    void w2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int x(RecyclerView.b0 b0Var) {
        return V1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int y(RecyclerView.b0 b0Var) {
        return T1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int z(RecyclerView.b0 b0Var) {
        return U1(b0Var);
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f2844s = 1;
        this.f2848w = false;
        this.f2849x = false;
        this.f2850y = false;
        this.f2851z = true;
        this.A = -1;
        this.B = RtlSpacingHelper.UNDEFINED;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        F2(i10);
        G2(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2844s = 1;
        this.f2848w = false;
        this.f2849x = false;
        this.f2850y = false;
        this.f2851z = true;
        this.A = -1;
        this.B = RtlSpacingHelper.UNDEFINED;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.q.d dVarM0 = RecyclerView.q.m0(context, attributeSet, i10, i11);
        F2(dVarM0.f3020a);
        G2(dVarM0.f3022c);
        H2(dVarM0.f3023d);
    }
}
