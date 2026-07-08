package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import n0.x;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final Set U = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    boolean I;
    int J;
    int[] K;
    View[] L;
    final SparseIntArray M;
    final SparseIntArray N;
    d O;
    final Rect P;
    private boolean Q;
    private int R;
    int S;
    int T;

    private static class a {
        static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    public static final class b extends d {
        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int f(int i10) {
            return 1;
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: a */
        final SparseIntArray f2840a = new SparseIntArray();

        /* JADX INFO: renamed from: b */
        final SparseIntArray f2841b = new SparseIntArray();

        /* JADX INFO: renamed from: c */
        private boolean f2842c = false;

        /* JADX INFO: renamed from: d */
        private boolean f2843d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        int b(int i10, int i11) {
            if (!this.f2843d) {
                return d(i10, i11);
            }
            int i12 = this.f2841b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iD = d(i10, i11);
            this.f2841b.put(i10, iD);
            return iD;
        }

        int c(int i10, int i11) {
            if (!this.f2842c) {
                return e(i10, i11);
            }
            int i12 = this.f2840a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iE = e(i10, i11);
            this.f2840a.put(i10, iE);
            return iE;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f2843d
                r1 = 0
                if (r0 == 0) goto L25
                android.util.SparseIntArray r0 = r6.f2841b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L25
                android.util.SparseIntArray r2 = r6.f2841b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L28
                int r2 = r2 + 1
            L23:
                r4 = 0
                goto L28
            L25:
                r2 = 0
                r3 = 0
                goto L23
            L28:
                int r0 = r6.f(r7)
            L2c:
                if (r3 >= r7) goto L41
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L39
                int r2 = r2 + 1
                r4 = 0
                goto L3e
            L39:
                if (r4 <= r8) goto L3e
                int r2 = r2 + 1
                r4 = r5
            L3e:
                int r3 = r3 + 1
                goto L2c
            L41:
                int r4 = r4 + r0
                if (r4 <= r8) goto L46
                int r2 = r2 + 1
            L46:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.d.d(int, int):int");
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.f2841b.clear();
        }

        public void h() {
            this.f2840a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new b();
        this.P = new Rect();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        u3(RecyclerView.q.m0(context, attributeSet, i10, i11).f3021b);
    }

    private void Q2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i12 = i10;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.L[i11];
            c cVar = (c) view.getLayoutParams();
            int iP3 = p3(wVar, b0Var, l0(view));
            cVar.f2839f = iP3;
            cVar.f2838e = i14;
            i14 += iP3;
            i11 += i13;
        }
    }

    private void R2() {
        int iO = O();
        for (int i10 = 0; i10 < iO; i10++) {
            c cVar = (c) N(i10).getLayoutParams();
            int iA = cVar.a();
            this.M.put(iA, cVar.f());
            this.N.put(iA, cVar.e());
        }
    }

    private void S2(int i10) {
        this.K = T2(this.K, this.J, i10);
    }

    static int[] T2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void U2() {
        this.M.clear();
        this.N.clear();
    }

    private int V2(RecyclerView.b0 b0Var) {
        if (O() != 0 && b0Var.b() != 0) {
            Y1();
            boolean zT2 = t2();
            View viewC2 = c2(!zT2, true);
            View viewB2 = b2(!zT2, true);
            if (viewC2 != null && viewB2 != null) {
                int iB = this.O.b(l0(viewC2), this.J);
                int iB2 = this.O.b(l0(viewB2), this.J);
                int iMax = this.f2849x ? Math.max(0, ((this.O.b(b0Var.b() - 1, this.J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zT2) {
                    return Math.round((iMax * (Math.abs(this.f2846u.d(viewB2) - this.f2846u.g(viewC2)) / ((this.O.b(l0(viewB2), this.J) - this.O.b(l0(viewC2), this.J)) + 1))) + (this.f2846u.m() - this.f2846u.g(viewC2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int W2(RecyclerView.b0 b0Var) {
        if (O() != 0 && b0Var.b() != 0) {
            Y1();
            View viewC2 = c2(!t2(), true);
            View viewB2 = b2(!t2(), true);
            if (viewC2 != null && viewB2 != null) {
                if (!t2()) {
                    return this.O.b(b0Var.b() - 1, this.J) + 1;
                }
                int iD = this.f2846u.d(viewB2) - this.f2846u.g(viewC2);
                int iB = this.O.b(l0(viewC2), this.J);
                return (int) ((iD / ((this.O.b(l0(viewB2), this.J) - iB) + 1)) * (this.O.b(b0Var.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    private void X2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int iO3 = o3(wVar, b0Var, aVar.f2853b);
        if (z10) {
            while (iO3 > 0) {
                int i11 = aVar.f2853b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f2853b = i12;
                iO3 = o3(wVar, b0Var, i12);
            }
            return;
        }
        int iB = b0Var.b() - 1;
        int i13 = aVar.f2853b;
        while (i13 < iB) {
            int i14 = i13 + 1;
            int iO32 = o3(wVar, b0Var, i14);
            if (iO32 <= iO3) {
                break;
            }
            i13 = i14;
            iO3 = iO32;
        }
        aVar.f2853b = i13;
    }

    private void Y2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private View Z2() {
        for (int i10 = 0; i10 < O(); i10++) {
            View viewN = N(i10);
            Objects.requireNonNull(viewN);
            if (a.a(viewN)) {
                return N(i10);
            }
        }
        return null;
    }

    private int c3(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int iI3 = i3(i13);
            int iG3 = g3(i13);
            if (iI3 < 0 || iG3 < 0) {
                break;
            }
            if (this.f2844s == 1) {
                if (iI3 < i10 && h3(i13).contains(Integer.valueOf(i11))) {
                    this.S = iI3;
                    return i13;
                }
            } else if (iI3 < i10 && iG3 == i11) {
                this.S = ((Integer) Collections.max(j3(i13))).intValue();
                return i13;
            }
        }
        return -1;
    }

    private int d3(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < e(); i13++) {
            int iI3 = i3(i13);
            int iG3 = g3(i13);
            if (iI3 < 0 || iG3 < 0) {
                break;
            }
            if (this.f2844s == 1) {
                if (iI3 > i10 && (iG3 == i11 || h3(i13).contains(Integer.valueOf(i11)))) {
                    this.S = iI3;
                    return i13;
                }
            } else if (iI3 > i10 && iG3 == i11) {
                this.S = i3(i13);
                return i13;
            }
        }
        return -1;
    }

    private int e3(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int iI3 = i3(i13);
            int iG3 = g3(i13);
            if (iI3 < 0 || iG3 < 0) {
                break;
            }
            if (this.f2844s == 1) {
                if ((iI3 == i10 && iG3 < i11) || iI3 < i10) {
                    this.S = iI3;
                    this.T = iG3;
                    return i13;
                }
            } else if (j3(i13).contains(Integer.valueOf(i10)) && iG3 < i11) {
                this.T = iG3;
                return i13;
            }
        }
        return -1;
    }

    private int f3(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < e(); i13++) {
            int iI3 = i3(i13);
            int iG3 = g3(i13);
            if (iI3 < 0 || iG3 < 0) {
                break;
            }
            if (this.f2844s == 1) {
                if ((iI3 == i10 && iG3 > i11) || iI3 > i10) {
                    this.S = iI3;
                    this.T = iG3;
                    return i13;
                }
            } else if (iG3 > i11 && j3(i13).contains(Integer.valueOf(i10))) {
                this.T = iG3;
                return i13;
            }
        }
        return -1;
    }

    private int g3(int i10) {
        if (this.f2844s == 0) {
            RecyclerView recyclerView = this.f3001b;
            return n3(recyclerView.f2881c, recyclerView.f2903r0, i10);
        }
        RecyclerView recyclerView2 = this.f3001b;
        return o3(recyclerView2.f2881c, recyclerView2.f2903r0, i10);
    }

    private Set h3(int i10) {
        return k3(g3(i10), i10);
    }

    private int i3(int i10) {
        if (this.f2844s == 1) {
            RecyclerView recyclerView = this.f3001b;
            return n3(recyclerView.f2881c, recyclerView.f2903r0, i10);
        }
        RecyclerView recyclerView2 = this.f3001b;
        return o3(recyclerView2.f2881c, recyclerView2.f2903r0, i10);
    }

    private Set j3(int i10) {
        return k3(i3(i10), i10);
    }

    private Set k3(int i10, int i11) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f3001b;
        int iP3 = p3(recyclerView.f2881c, recyclerView.f2903r0, i11);
        for (int i12 = i10; i12 < i10 + iP3; i12++) {
            hashSet.add(Integer.valueOf(i12));
        }
        return hashSet;
    }

    private int n3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.O.b(i10, this.J);
        }
        int iF = wVar.f(i10);
        if (iF != -1) {
            return this.O.b(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    private int o3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.O.c(i10, this.J);
        }
        int i11 = this.N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = wVar.f(i10);
        if (iF != -1) {
            return this.O.c(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    private int p3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.O.f(i10);
        }
        int i11 = this.M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = wVar.f(i10);
        if (iF != -1) {
            return this.O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    private void q3(float f10, int i10) {
        S2(Math.max(Math.round(f10 * this.J), i10));
    }

    private boolean r3(int i10) {
        return (j3(i10).contains(Integer.valueOf(this.S)) && h3(i10).contains(Integer.valueOf(this.T))) ? false : true;
    }

    private void s3(View view, int i10, boolean z10) {
        int iP;
        int iP2;
        c cVar = (c) view.getLayoutParams();
        Rect rect = cVar.f3025b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int iL3 = l3(cVar.f2838e, cVar.f2839f);
        if (this.f2844s == 1) {
            iP2 = RecyclerView.q.P(iL3, i10, i12, ((ViewGroup.MarginLayoutParams) cVar).width, false);
            iP = RecyclerView.q.P(this.f2846u.n(), c0(), i11, ((ViewGroup.MarginLayoutParams) cVar).height, true);
        } else {
            int iP3 = RecyclerView.q.P(iL3, i10, i11, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            int iP4 = RecyclerView.q.P(this.f2846u.n(), t0(), i12, ((ViewGroup.MarginLayoutParams) cVar).width, true);
            iP = iP3;
            iP2 = iP4;
        }
        t3(view, iP2, iP, z10);
    }

    private void t3(View view, int i10, int i11, boolean z10) {
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        if (z10 ? M1(view, i10, i11, rVar) : K1(view, i10, i11, rVar)) {
            view.measure(i10, i11);
        }
    }

    private void v3() {
        int iB0;
        int iK0;
        if (q2() == 1) {
            iB0 = s0() - j0();
            iK0 = i0();
        } else {
            iB0 = b0() - h0();
            iK0 = k0();
        }
        S2(iB0 - iK0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int A(RecyclerView.b0 b0Var) {
        return this.Q ? W2(b0Var) : super.A(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int B1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        v3();
        Y2();
        return super.B1(i10, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int D1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        v3();
        Y2();
        return super.D1(i10, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void H1(Rect rect, int i10, int i11) {
        int iS;
        int iS2;
        if (this.K == null) {
            super.H1(rect, i10, i11);
        }
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f2844s == 1) {
            iS2 = RecyclerView.q.s(i11, rect.height() + iK0, f0());
            int[] iArr = this.K;
            iS = RecyclerView.q.s(i10, iArr[iArr.length - 1] + iI0, g0());
        } else {
            iS = RecyclerView.q.s(i10, rect.width() + iI0, g0());
            int[] iArr2 = this.K;
            iS2 = RecyclerView.q.s(i11, iArr2[iArr2.length - 1] + iK0, f0());
        }
        G1(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void H2(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.H2(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r I() {
        return this.f2844s == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View O0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.b0 r27) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.O0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public boolean Q1() {
        return this.D == null && !this.I;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void R0(RecyclerView.w wVar, RecyclerView.b0 b0Var, x xVar) {
        super.R0(wVar, b0Var, xVar);
        xVar.t0(GridView.class.getName());
        RecyclerView.h hVar = this.f3001b.f2910v;
        if (hVar == null || hVar.f() <= 1) {
            return;
        }
        xVar.b(x.a.V);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int S(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f2844s == 1) {
            return Math.min(this.J, e());
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return n3(wVar, b0Var, b0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void S1(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.q.c cVar2) {
        int iF = this.J;
        for (int i10 = 0; i10 < this.J && cVar.c(b0Var) && iF > 0; i10++) {
            int i11 = cVar.f2864d;
            cVar2.a(i11, Math.max(0, cVar.f2867g));
            iF -= this.O.f(i11);
            cVar.f2864d += cVar.f2865e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void U0(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, x xVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.T0(view, xVar);
            return;
        }
        c cVar = (c) layoutParams;
        int iN3 = n3(wVar, b0Var, cVar.a());
        if (this.f2844s == 0) {
            xVar.w0(x.g.a(cVar.e(), cVar.f(), iN3, 1, false, false));
        } else {
            xVar.w0(x.g.a(iN3, 1, cVar.e(), cVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void X0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Y0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    int a3(int i10) {
        if (i10 < 0 || this.f2844s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap();
        for (int i11 = 0; i11 < e(); i11++) {
            for (Integer num : j3(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                if (!treeMap.containsKey(num)) {
                    treeMap.put(num, Integer.valueOf(i11));
                }
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue > i10) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.S = iIntValue;
                this.T = 0;
                return iIntValue2;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.h();
        this.O.g();
    }

    int b3(int i10) {
        if (i10 < 0 || this.f2844s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        for (int i11 = 0; i11 < e(); i11++) {
            for (Integer num : j3(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                treeMap.put(num, Integer.valueOf(i11));
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue < i10) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.S = iIntValue;
                this.T = g3(iIntValue2);
                return iIntValue2;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (b0Var.e()) {
            R2();
        }
        super.c1(wVar, b0Var);
        U2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.b0 b0Var) {
        View viewH;
        super.d1(b0Var);
        this.I = false;
        int i10 = this.R;
        if (i10 == -1 || (viewH = H(i10)) == null) {
            return;
        }
        viewH.sendAccessibilityEvent(67108864);
        this.R = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View k2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10, boolean z11) {
        int i10;
        int iO;
        int iO2 = O();
        int i11 = 1;
        if (z11) {
            iO = O() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iO2;
            iO = 0;
        }
        int iB = b0Var.b();
        Y1();
        int iM = this.f2846u.m();
        int i12 = this.f2846u.i();
        View view = null;
        View view2 = null;
        while (iO != i10) {
            View viewN = N(iO);
            int iL0 = l0(viewN);
            if (iL0 >= 0 && iL0 < iB && o3(wVar, b0Var, iL0) == 0) {
                if (((RecyclerView.r) viewN.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewN;
                    }
                } else {
                    if (this.f2846u.g(viewN) < i12 && this.f2846u.d(viewN) >= iM) {
                        return viewN;
                    }
                    if (view == null) {
                        view = viewN;
                    }
                }
            }
            iO += i11;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    boolean l1(int i10, Bundle bundle) {
        RecyclerView.f0 f0VarO0;
        int iE3;
        if (i10 != x.a.V.b() || i10 == -1) {
            if (i10 != 16908343 || bundle == null) {
                return super.l1(i10, bundle);
            }
            int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i11 != -1 && i12 != -1) {
                int iF = this.f3001b.f2910v.f();
                int i13 = 0;
                while (true) {
                    if (i13 >= iF) {
                        i13 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.f3001b;
                    int iO3 = o3(recyclerView.f2881c, recyclerView.f2903r0, i13);
                    RecyclerView recyclerView2 = this.f3001b;
                    int iN3 = n3(recyclerView2.f2881c, recyclerView2.f2903r0, i13);
                    if (this.f2844s != 1) {
                        if (iO3 == i11 && iN3 == i12) {
                            break;
                        }
                        i13++;
                    } else {
                        if (iO3 == i12 && iN3 == i11) {
                            break;
                        }
                        i13++;
                    }
                }
                if (i13 > -1) {
                    E2(i13, 0);
                    return true;
                }
            }
            return false;
        }
        View viewZ2 = Z2();
        if (viewZ2 == null || bundle == null) {
            return false;
        }
        int i14 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
        if (!U.contains(Integer.valueOf(i14)) || (f0VarO0 = this.f3001b.o0(viewZ2)) == null) {
            return false;
        }
        int iJ = f0VarO0.j();
        int iI3 = i3(iJ);
        int iG3 = g3(iJ);
        if (iI3 >= 0 && iG3 >= 0) {
            if (r3(iJ)) {
                this.S = iI3;
                this.T = iG3;
            }
            int i15 = this.S;
            if (i15 == -1) {
                i15 = iI3;
            }
            int i16 = this.T;
            if (i16 != -1) {
                iG3 = i16;
            }
            if (i14 == 17) {
                iE3 = e3(i15, iG3, iJ);
            } else if (i14 == 33) {
                iE3 = c3(i15, iG3, iJ);
            } else if (i14 == 66) {
                iE3 = f3(i15, iG3, iJ);
            } else {
                if (i14 != 130) {
                    return false;
                }
                iE3 = d3(i15, iG3, iJ);
            }
            if (iE3 == -1 && this.f2844s == 0) {
                if (i14 == 17) {
                    iE3 = b3(iI3);
                } else if (i14 == 66) {
                    iE3 = a3(iI3);
                }
            }
            if (iE3 != -1) {
                C1(iE3);
                this.R = iE3;
                return true;
            }
        }
        return false;
    }

    int l3(int i10, int i11) {
        if (this.f2844s != 1 || !s2()) {
            int[] iArr = this.K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.K;
        int i12 = this.J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public int m3() {
        return this.J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int o0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f2844s == 0) {
            return Math.min(this.J, e());
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return n3(wVar, b0Var, b0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean r(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void u2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int iI0;
        int iK0;
        int iF;
        int iF2;
        int i12;
        int iP;
        int iP2;
        View viewD;
        int iL = this.f2846u.l();
        boolean z10 = iL != 1073741824;
        int i13 = O() > 0 ? this.K[this.J] : 0;
        if (z10) {
            v3();
        }
        boolean z11 = cVar.f2865e == 1;
        int iO3 = this.J;
        if (!z11) {
            iO3 = o3(wVar, b0Var, cVar.f2864d) + p3(wVar, b0Var, cVar.f2864d);
        }
        int i14 = 0;
        while (i14 < this.J && cVar.c(b0Var) && iO3 > 0) {
            int i15 = cVar.f2864d;
            int iP3 = p3(wVar, b0Var, i15);
            if (iP3 > this.J) {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + iP3 + " spans but GridLayoutManager has only " + this.J + " spans.");
            }
            iO3 -= iP3;
            if (iO3 < 0 || (viewD = cVar.d(wVar)) == null) {
                break;
            }
            this.L[i14] = viewD;
            i14++;
        }
        if (i14 == 0) {
            bVar.f2858b = true;
            return;
        }
        Q2(wVar, b0Var, i14, z11);
        float f10 = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            View view = this.L[i17];
            if (cVar.f2872l == null) {
                if (z11) {
                    i(view);
                } else {
                    j(view, 0);
                }
            } else if (z11) {
                g(view);
            } else {
                h(view, 0);
            }
            o(view, this.P);
            s3(view, iL, false);
            int iE = this.f2846u.e(view);
            if (iE > i16) {
                i16 = iE;
            }
            float f11 = (this.f2846u.f(view) * 1.0f) / ((c) view.getLayoutParams()).f2839f;
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z10) {
            q3(f10, i13);
            i16 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.L[i18];
                s3(view2, WXVideoFileObject.FILE_SIZE_LIMIT, true);
                int iE2 = this.f2846u.e(view2);
                if (iE2 > i16) {
                    i16 = iE2;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.L[i19];
            if (this.f2846u.e(view3) != i16) {
                c cVar2 = (c) view3.getLayoutParams();
                Rect rect = cVar2.f3025b;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cVar2).topMargin + ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin + ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                int iL3 = l3(cVar2.f2838e, cVar2.f2839f);
                if (this.f2844s == 1) {
                    iP2 = RecyclerView.q.P(iL3, WXVideoFileObject.FILE_SIZE_LIMIT, i21, ((ViewGroup.MarginLayoutParams) cVar2).width, false);
                    iP = View.MeasureSpec.makeMeasureSpec(i16 - i20, WXVideoFileObject.FILE_SIZE_LIMIT);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, WXVideoFileObject.FILE_SIZE_LIMIT);
                    iP = RecyclerView.q.P(iL3, WXVideoFileObject.FILE_SIZE_LIMIT, i20, ((ViewGroup.MarginLayoutParams) cVar2).height, false);
                    iP2 = iMakeMeasureSpec;
                }
                t3(view3, iP2, iP, true);
            }
        }
        bVar.f2857a = i16;
        if (this.f2844s == 1) {
            if (cVar.f2866f == -1) {
                iF2 = cVar.f2862b;
                i12 = iF2 - i16;
            } else {
                i12 = cVar.f2862b;
                iF2 = i12 + i16;
            }
            iK0 = i12;
            iF = 0;
            iI0 = 0;
        } else {
            if (cVar.f2866f == -1) {
                i11 = cVar.f2862b;
                i10 = i11 - i16;
            } else {
                i10 = cVar.f2862b;
                i11 = i10 + i16;
            }
            iI0 = i10;
            iK0 = 0;
            iF = i11;
            iF2 = 0;
        }
        for (int i22 = 0; i22 < i14; i22++) {
            View view4 = this.L[i22];
            c cVar3 = (c) view4.getLayoutParams();
            if (this.f2844s != 1) {
                iK0 = this.K[cVar3.f2838e] + k0();
                iF2 = this.f2846u.f(view4) + iK0;
            } else if (s2()) {
                iF = i0() + this.K[this.J - cVar3.f2838e];
                iI0 = iF - this.f2846u.f(view4);
            } else {
                iI0 = this.K[cVar3.f2838e] + i0();
                iF = this.f2846u.f(view4) + iI0;
            }
            int i23 = iF2;
            int i24 = iK0;
            int i25 = iF;
            int i26 = iI0;
            E0(view4, i26, i24, i25, i23);
            iF2 = i23;
            iI0 = i26;
            iF = i25;
            iK0 = i24;
            if (cVar3.c() || cVar3.b()) {
                bVar.f2859c = true;
            }
            bVar.f2860d = view4.hasFocusable() | bVar.f2860d;
        }
        Arrays.fill(this.L, (Object) null);
    }

    public void u3(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.I = true;
        if (i10 >= 1) {
            this.J = i10;
            this.O.h();
            y1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int w(RecyclerView.b0 b0Var) {
        return this.Q ? V2(b0Var) : super.w(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void w2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i10) {
        super.w2(wVar, b0Var, aVar, i10);
        v3();
        if (b0Var.b() > 0 && !b0Var.e()) {
            X2(wVar, b0Var, aVar, i10);
        }
        Y2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int x(RecyclerView.b0 b0Var) {
        return this.Q ? W2(b0Var) : super.x(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int z(RecyclerView.b0 b0Var) {
        return this.Q ? V2(b0Var) : super.z(b0Var);
    }

    public static class c extends RecyclerView.r {

        /* JADX INFO: renamed from: e */
        int f2838e;

        /* JADX INFO: renamed from: f */
        int f2839f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2838e = -1;
            this.f2839f = 0;
        }

        public int e() {
            return this.f2838e;
        }

        public int f() {
            return this.f2839f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f2838e = -1;
            this.f2839f = 0;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2838e = -1;
            this.f2839f = 0;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2838e = -1;
            this.f2839f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new b();
        this.P = new Rect();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        u3(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new b();
        this.P = new Rect();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        u3(i10);
    }
}
