package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m0.o0;
import m0.t0;

/* JADX INFO: loaded from: classes.dex */
public class GridLayout extends ViewGroup {
    private static final i B;
    private static final i C;
    public static final i D;
    public static final i E;
    public static final i F;
    public static final i G;
    public static final i H;
    public static final i I;
    public static final i J;
    public static final i K;
    public static final i L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final l f2528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final l f2529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f2530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f2531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f2532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f2533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f2534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Printer f2535h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final Printer f2519r = new LogPrinter(3, GridLayout.class.getName());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final Printer f2520s = new a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f2521t = a1.b.f139e;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f2522u = a1.b.f140f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f2523v = a1.b.f137c;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f2524w = a1.b.f142h;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f2525x = a1.b.f136b;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f2526y = a1.b.f141g;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f2527z = a1.b.f138d;
    static final i A = new b();

    class a implements Printer {
        a() {
        }

        @Override // android.util.Printer
        public void println(String str) {
        }
    }

    class b extends i {
        b() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int a(View view, int i10, int i11) {
            return RtlSpacingHelper.UNDEFINED;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String c() {
            return "UNDEFINED";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int d(View view, int i10) {
            return RtlSpacingHelper.UNDEFINED;
        }
    }

    class c extends i {
        c() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int a(View view, int i10, int i11) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String c() {
            return "LEADING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int d(View view, int i10) {
            return 0;
        }
    }

    class d extends i {
        d() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int a(View view, int i10, int i11) {
            return i10;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String c() {
            return "TRAILING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int d(View view, int i10) {
            return i10;
        }
    }

    class e extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f2536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f2537b;

        e(i iVar, i iVar2) {
            this.f2536a = iVar;
            this.f2537b = iVar2;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int a(View view, int i10, int i11) {
            return (view.getLayoutDirection() == 1 ? this.f2537b : this.f2536a).a(view, i10, i11);
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String c() {
            return "SWITCHING[L:" + this.f2536a.c() + ", R:" + this.f2537b.c() + "]";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int d(View view, int i10) {
            return (view.getLayoutDirection() == 1 ? this.f2537b : this.f2536a).d(view, i10);
        }
    }

    class f extends i {
        f() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int a(View view, int i10, int i11) {
            return i10 >> 1;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String c() {
            return "CENTER";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int d(View view, int i10) {
            return i10 >> 1;
        }
    }

    class g extends i {

        class a extends m {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f2538d;

            a() {
            }

            @Override // androidx.gridlayout.widget.GridLayout.m
            protected int a(GridLayout gridLayout, View view, i iVar, int i10, boolean z10) {
                return Math.max(0, super.a(gridLayout, view, iVar, i10, z10));
            }

            @Override // androidx.gridlayout.widget.GridLayout.m
            protected void b(int i10, int i11) {
                super.b(i10, i11);
                this.f2538d = Math.max(this.f2538d, i10 + i11);
            }

            @Override // androidx.gridlayout.widget.GridLayout.m
            protected void d() {
                super.d();
                this.f2538d = RtlSpacingHelper.UNDEFINED;
            }

            @Override // androidx.gridlayout.widget.GridLayout.m
            protected int e(boolean z10) {
                return Math.max(super.e(z10), this.f2538d);
            }
        }

        g() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int a(View view, int i10, int i11) {
            if (view.getVisibility() == 8) {
                return 0;
            }
            int baseline = view.getBaseline();
            return baseline == -1 ? RtlSpacingHelper.UNDEFINED : baseline;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public m b() {
            return new a();
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String c() {
            return "BASELINE";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int d(View view, int i10) {
            return 0;
        }
    }

    class h extends i {
        h() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int a(View view, int i10, int i11) {
            return RtlSpacingHelper.UNDEFINED;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String c() {
            return "FILL";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int d(View view, int i10) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int e(View view, int i10, int i11) {
            return i11;
        }
    }

    public static abstract class i {
        i() {
        }

        abstract int a(View view, int i10, int i11);

        m b() {
            return new m();
        }

        abstract String c();

        abstract int d(View view, int i10);

        int e(View view, int i10, int i11) {
            return i10;
        }

        public String toString() {
            return "Alignment:" + c();
        }
    }

    static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f2540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p f2541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2542c = true;

        public j(n nVar, p pVar) {
            this.f2540a = nVar;
            this.f2541b = pVar;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f2540a);
            sb2.append(" ");
            sb2.append(!this.f2542c ? "+>" : "->");
            sb2.append(" ");
            sb2.append(this.f2541b);
            return sb2.toString();
        }
    }

    static final class k extends ArrayList {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f2543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f2544b;

        private k(Class cls, Class cls2) {
            this.f2543a = cls;
            this.f2544b = cls2;
        }

        public static k b(Class cls, Class cls2) {
            return new k(cls, cls2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public q d() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f2543a, size);
            Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.f2544b, size);
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = ((Pair) get(i10)).first;
                objArr2[i10] = ((Pair) get(i10)).second;
            }
            return new q(objArr, objArr2);
        }

        public void f(Object obj, Object obj2) {
            add(Pair.create(obj, obj2));
        }
    }

    final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f2545a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        q f2548d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        q f2550f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        q f2552h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int[] f2554j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f2556l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public j[] f2558n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int[] f2560p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f2562r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int[] f2564t;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2546b = RtlSpacingHelper.UNDEFINED;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2547c = RtlSpacingHelper.UNDEFINED;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2549e = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f2551g = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f2553i = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f2555k = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f2557m = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f2559o = false;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f2561q = false;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f2563s = false;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f2565u = true;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private p f2566v = new p(0);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private p f2567w = new p(-100000);

        class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            j[] f2569a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f2570b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            j[][] f2571c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int[] f2572d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ j[] f2573e;

            a(j[] jVarArr) {
                this.f2573e = jVarArr;
                this.f2569a = new j[jVarArr.length];
                this.f2570b = r0.length - 1;
                this.f2571c = l.this.z(jVarArr);
                this.f2572d = new int[l.this.p() + 1];
            }

            j[] a() {
                int length = this.f2571c.length;
                for (int i10 = 0; i10 < length; i10++) {
                    b(i10);
                }
                return this.f2569a;
            }

            void b(int i10) {
                int[] iArr = this.f2572d;
                if (iArr[i10] != 0) {
                    return;
                }
                iArr[i10] = 1;
                for (j jVar : this.f2571c[i10]) {
                    b(jVar.f2540a.f2579b);
                    j[] jVarArr = this.f2569a;
                    int i11 = this.f2570b;
                    this.f2570b = i11 - 1;
                    jVarArr[i11] = jVar;
                }
                this.f2572d[i10] = 2;
            }
        }

        l(boolean z10) {
            this.f2545a = z10;
        }

        private boolean A() {
            if (!this.f2563s) {
                this.f2562r = g();
                this.f2563s = true;
            }
            return this.f2562r;
        }

        private void B(List list, n nVar, p pVar) {
            C(list, nVar, pVar, true);
        }

        private void C(List list, n nVar, p pVar, boolean z10) {
            if (nVar.b() == 0) {
                return;
            }
            if (z10) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).f2540a.equals(nVar)) {
                        return;
                    }
                }
            }
            list.add(new j(nVar, pVar));
        }

        private void D(int[] iArr) {
            Arrays.fill(iArr, 0);
        }

        private void H(String str, j[] jVarArr, boolean[] zArr) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < jVarArr.length; i10++) {
                j jVar = jVarArr[i10];
                if (zArr[i10]) {
                    arrayList.add(jVar);
                }
                if (!jVar.f2542c) {
                    arrayList2.add(jVar);
                }
            }
            GridLayout.this.f2535h.println(str + " constraints: " + b(arrayList) + " are inconsistent; permanently removing: " + b(arrayList2) + ". ");
        }

        private boolean I(int[] iArr, j jVar) {
            if (!jVar.f2542c) {
                return false;
            }
            n nVar = jVar.f2540a;
            int i10 = nVar.f2578a;
            int i11 = nVar.f2579b;
            int i12 = iArr[i10] + jVar.f2541b.f2596a;
            if (i12 <= iArr[i11]) {
                return false;
            }
            iArr[i11] = i12;
            return true;
        }

        private void L(int i10, int i11) {
            this.f2566v.f2596a = i10;
            this.f2567w.f2596a = -i11;
            this.f2561q = false;
        }

        private void M(int i10, float f10) {
            Arrays.fill(this.f2564t, 0);
            int childCount = GridLayout.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = GridLayout.this.getChildAt(i11);
                if (childAt.getVisibility() != 8) {
                    o oVarO = GridLayout.this.o(childAt);
                    float f11 = (this.f2545a ? oVarO.f2595b : oVarO.f2594a).f2604d;
                    if (f11 != 0.0f) {
                        int iRound = Math.round((i10 * f11) / f10);
                        this.f2564t[i11] = iRound;
                        i10 -= iRound;
                        f10 -= f11;
                    }
                }
            }
        }

        private int N(int[] iArr) {
            return iArr[p()];
        }

        private boolean O(int[] iArr) {
            return P(n(), iArr);
        }

        private boolean P(j[] jVarArr, int[] iArr) {
            return Q(jVarArr, iArr, true);
        }

        private boolean Q(j[] jVarArr, int[] iArr, boolean z10) {
            String str = this.f2545a ? "horizontal" : "vertical";
            int iP = p() + 1;
            boolean[] zArr = null;
            for (int i10 = 0; i10 < jVarArr.length; i10++) {
                D(iArr);
                for (int i11 = 0; i11 < iP; i11++) {
                    boolean zI = false;
                    for (j jVar : jVarArr) {
                        zI |= I(iArr, jVar);
                    }
                    if (!zI) {
                        if (zArr != null) {
                            H(str, jVarArr, zArr);
                        }
                        return true;
                    }
                }
                if (!z10) {
                    return false;
                }
                boolean[] zArr2 = new boolean[jVarArr.length];
                for (int i12 = 0; i12 < iP; i12++) {
                    int length = jVarArr.length;
                    for (int i13 = 0; i13 < length; i13++) {
                        zArr2[i13] = zArr2[i13] | I(iArr, jVarArr[i13]);
                    }
                }
                if (i10 == 0) {
                    zArr = zArr2;
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= jVarArr.length) {
                        break;
                    }
                    if (zArr2[i14]) {
                        j jVar2 = jVarArr[i14];
                        n nVar = jVar2.f2540a;
                        if (nVar.f2578a >= nVar.f2579b) {
                            jVar2.f2542c = false;
                            break;
                        }
                    }
                    i14++;
                }
            }
            return true;
        }

        private void R(int[] iArr) {
            Arrays.fill(q(), 0);
            O(iArr);
            boolean z10 = true;
            int childCount = (this.f2566v.f2596a * GridLayout.this.getChildCount()) + 1;
            if (childCount < 2) {
                return;
            }
            float fD = d();
            int i10 = -1;
            int i11 = 0;
            while (i11 < childCount) {
                int i12 = (int) ((((long) i11) + ((long) childCount)) / 2);
                F();
                M(i12, fD);
                boolean zQ = Q(n(), iArr, false);
                if (zQ) {
                    i11 = i12 + 1;
                    i10 = i12;
                } else {
                    childCount = i12;
                }
                z10 = zQ;
            }
            if (i10 <= 0 || z10) {
                return;
            }
            F();
            M(i10, fD);
            O(iArr);
        }

        private j[] S(List list) {
            return T((j[]) list.toArray(new j[list.size()]));
        }

        private j[] T(j[] jVarArr) {
            return new a(jVarArr).a();
        }

        private void a(List list, q qVar) {
            int i10 = 0;
            while (true) {
                Object[] objArr = qVar.f2598b;
                if (i10 >= ((n[]) objArr).length) {
                    return;
                }
                C(list, ((n[]) objArr)[i10], ((p[]) qVar.f2599c)[i10], false);
                i10++;
            }
        }

        private String b(List list) {
            String str;
            String str2 = this.f2545a ? "x" : "y";
            StringBuilder sb2 = new StringBuilder();
            Iterator it = list.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                j jVar = (j) it.next();
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(", ");
                }
                n nVar = jVar.f2540a;
                int i10 = nVar.f2578a;
                int i11 = nVar.f2579b;
                int i12 = jVar.f2541b.f2596a;
                if (i10 < i11) {
                    str = str2 + i11 + "-" + str2 + i10 + ">=" + i12;
                } else {
                    str = str2 + i10 + "-" + str2 + i11 + "<=" + (-i12);
                }
                sb2.append(str);
            }
            return sb2.toString();
        }

        private int c() {
            int childCount = GridLayout.this.getChildCount();
            int iMax = -1;
            for (int i10 = 0; i10 < childCount; i10++) {
                o oVarO = GridLayout.this.o(GridLayout.this.getChildAt(i10));
                n nVar = (this.f2545a ? oVarO.f2595b : oVarO.f2594a).f2602b;
                iMax = Math.max(Math.max(Math.max(iMax, nVar.f2578a), nVar.f2579b), nVar.b());
            }
            return iMax == -1 ? RtlSpacingHelper.UNDEFINED : iMax;
        }

        private float d() {
            int childCount = GridLayout.this.getChildCount();
            float f10 = 0.0f;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = GridLayout.this.getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    o oVarO = GridLayout.this.o(childAt);
                    f10 += (this.f2545a ? oVarO.f2595b : oVarO.f2594a).f2604d;
                }
            }
            return f10;
        }

        private void e() {
            r();
            o();
        }

        private void f() {
            for (m mVar : (m[]) this.f2548d.f2599c) {
                mVar.d();
            }
            int childCount = GridLayout.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = GridLayout.this.getChildAt(i10);
                o oVarO = GridLayout.this.o(childAt);
                boolean z10 = this.f2545a;
                r rVar = z10 ? oVarO.f2595b : oVarO.f2594a;
                ((m) this.f2548d.c(i10)).c(GridLayout.this, childAt, rVar, this, GridLayout.this.s(childAt, z10) + (rVar.f2604d == 0.0f ? 0 : q()[i10]));
            }
        }

        private boolean g() {
            int childCount = GridLayout.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = GridLayout.this.getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    o oVarO = GridLayout.this.o(childAt);
                    if ((this.f2545a ? oVarO.f2595b : oVarO.f2594a).f2604d != 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        private void h(q qVar, boolean z10) {
            for (p pVar : (p[]) qVar.f2599c) {
                pVar.a();
            }
            m[] mVarArr = (m[]) s().f2599c;
            for (int i10 = 0; i10 < mVarArr.length; i10++) {
                int iE = mVarArr[i10].e(z10);
                p pVar2 = (p) qVar.c(i10);
                int i11 = pVar2.f2596a;
                if (!z10) {
                    iE = -iE;
                }
                pVar2.f2596a = Math.max(i11, iE);
            }
        }

        private void i(int[] iArr) {
            if (A()) {
                R(iArr);
            } else {
                O(iArr);
            }
            if (this.f2565u) {
                return;
            }
            int i10 = iArr[0];
            int length = iArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                iArr[i11] = iArr[i11] - i10;
            }
        }

        private void j(boolean z10) {
            int[] iArr = z10 ? this.f2554j : this.f2556l;
            int childCount = GridLayout.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = GridLayout.this.getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    o oVarO = GridLayout.this.o(childAt);
                    boolean z11 = this.f2545a;
                    n nVar = (z11 ? oVarO.f2595b : oVarO.f2594a).f2602b;
                    int i11 = z10 ? nVar.f2578a : nVar.f2579b;
                    iArr[i11] = Math.max(iArr[i11], GridLayout.this.q(childAt, z11, z10));
                }
            }
        }

        private j[] k() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            a(arrayList, r());
            a(arrayList2, o());
            if (this.f2565u) {
                int i10 = 0;
                while (i10 < p()) {
                    int i11 = i10 + 1;
                    B(arrayList, new n(i10, i11), new p(0));
                    i10 = i11;
                }
            }
            int iP = p();
            C(arrayList, new n(0, iP), this.f2566v, false);
            C(arrayList2, new n(iP, 0), this.f2567w, false);
            return (j[]) GridLayout.b(S(arrayList), S(arrayList2));
        }

        private q l() {
            k kVarB = k.b(r.class, m.class);
            int childCount = GridLayout.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                o oVarO = GridLayout.this.o(GridLayout.this.getChildAt(i10));
                boolean z10 = this.f2545a;
                r rVar = z10 ? oVarO.f2595b : oVarO.f2594a;
                kVarB.f(rVar, rVar.b(z10).b());
            }
            return kVarB.d();
        }

        private q m(boolean z10) {
            k kVarB = k.b(n.class, p.class);
            r[] rVarArr = (r[]) s().f2598b;
            int length = rVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                kVarB.f(z10 ? rVarArr[i10].f2602b : rVarArr[i10].f2602b.a(), new p());
            }
            return kVarB.d();
        }

        private q o() {
            if (this.f2552h == null) {
                this.f2552h = m(false);
            }
            if (!this.f2553i) {
                h(this.f2552h, false);
                this.f2553i = true;
            }
            return this.f2552h;
        }

        private q r() {
            if (this.f2550f == null) {
                this.f2550f = m(true);
            }
            if (!this.f2551g) {
                h(this.f2550f, true);
                this.f2551g = true;
            }
            return this.f2550f;
        }

        private int v() {
            if (this.f2547c == Integer.MIN_VALUE) {
                this.f2547c = Math.max(0, c());
            }
            return this.f2547c;
        }

        private int x(int i10, int i11) {
            L(i10, i11);
            return N(u());
        }

        public void E() {
            this.f2547c = RtlSpacingHelper.UNDEFINED;
            this.f2548d = null;
            this.f2550f = null;
            this.f2552h = null;
            this.f2554j = null;
            this.f2556l = null;
            this.f2558n = null;
            this.f2560p = null;
            this.f2564t = null;
            this.f2563s = false;
            F();
        }

        public void F() {
            this.f2549e = false;
            this.f2551g = false;
            this.f2553i = false;
            this.f2555k = false;
            this.f2557m = false;
            this.f2559o = false;
            this.f2561q = false;
        }

        public void G(int i10) {
            L(i10, i10);
            u();
        }

        public void J(int i10) {
            if (i10 != Integer.MIN_VALUE && i10 < v()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f2545a ? "column" : "row");
                sb2.append("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child");
                GridLayout.u(sb2.toString());
            }
            this.f2546b = i10;
        }

        public void K(boolean z10) {
            this.f2565u = z10;
            E();
        }

        public j[] n() {
            if (this.f2558n == null) {
                this.f2558n = k();
            }
            if (!this.f2559o) {
                e();
                this.f2559o = true;
            }
            return this.f2558n;
        }

        public int p() {
            return Math.max(this.f2546b, v());
        }

        public int[] q() {
            if (this.f2564t == null) {
                this.f2564t = new int[GridLayout.this.getChildCount()];
            }
            return this.f2564t;
        }

        public q s() {
            if (this.f2548d == null) {
                this.f2548d = l();
            }
            if (!this.f2549e) {
                f();
                this.f2549e = true;
            }
            return this.f2548d;
        }

        public int[] t() {
            if (this.f2554j == null) {
                this.f2554j = new int[p() + 1];
            }
            if (!this.f2555k) {
                j(true);
                this.f2555k = true;
            }
            return this.f2554j;
        }

        public int[] u() {
            if (this.f2560p == null) {
                this.f2560p = new int[p() + 1];
            }
            if (!this.f2561q) {
                i(this.f2560p);
                this.f2561q = true;
            }
            return this.f2560p;
        }

        public int w(int i10) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode == Integer.MIN_VALUE) {
                return x(0, size);
            }
            if (mode == 0) {
                return x(0, 100000);
            }
            if (mode != 1073741824) {
                return 0;
            }
            return x(size, size);
        }

        public int[] y() {
            if (this.f2556l == null) {
                this.f2556l = new int[p() + 1];
            }
            if (!this.f2557m) {
                j(false);
                this.f2557m = true;
            }
            return this.f2556l;
        }

        j[][] z(j[] jVarArr) {
            int iP = p() + 1;
            j[][] jVarArr2 = new j[iP][];
            int[] iArr = new int[iP];
            for (j jVar : jVarArr) {
                int i10 = jVar.f2540a.f2578a;
                iArr[i10] = iArr[i10] + 1;
            }
            for (int i11 = 0; i11 < iP; i11++) {
                jVarArr2[i11] = new j[iArr[i11]];
            }
            Arrays.fill(iArr, 0);
            for (j jVar2 : jVarArr) {
                int i12 = jVar2.f2540a.f2578a;
                j[] jVarArr3 = jVarArr2[i12];
                int i13 = iArr[i12];
                iArr[i12] = i13 + 1;
                jVarArr3[i13] = jVar2;
            }
            return jVarArr2;
        }
    }

    static class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2577c;

        m() {
            d();
        }

        protected int a(GridLayout gridLayout, View view, i iVar, int i10, boolean z10) {
            return this.f2575a - iVar.a(view, i10, t0.c(gridLayout));
        }

        protected void b(int i10, int i11) {
            this.f2575a = Math.max(this.f2575a, i10);
            this.f2576b = Math.max(this.f2576b, i11);
        }

        protected final void c(GridLayout gridLayout, View view, r rVar, l lVar, int i10) {
            this.f2577c &= rVar.c();
            int iA = rVar.b(lVar.f2545a).a(view, i10, t0.c(gridLayout));
            b(iA, i10 - iA);
        }

        protected void d() {
            this.f2575a = RtlSpacingHelper.UNDEFINED;
            this.f2576b = RtlSpacingHelper.UNDEFINED;
            this.f2577c = 2;
        }

        protected int e(boolean z10) {
            if (z10 || !GridLayout.c(this.f2577c)) {
                return this.f2575a + this.f2576b;
            }
            return 100000;
        }

        public String toString() {
            return "Bounds{before=" + this.f2575a + ", after=" + this.f2576b + '}';
        }
    }

    static final class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2579b;

        public n(int i10, int i11) {
            this.f2578a = i10;
            this.f2579b = i11;
        }

        n a() {
            return new n(this.f2579b, this.f2578a);
        }

        int b() {
            return this.f2579b - this.f2578a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            n nVar = (n) obj;
            return this.f2579b == nVar.f2579b && this.f2578a == nVar.f2578a;
        }

        public int hashCode() {
            return (this.f2578a * 31) + this.f2579b;
        }

        public String toString() {
            return "[" + this.f2578a + ", " + this.f2579b + "]";
        }
    }

    static final class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f2597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object[] f2598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object[] f2599c;

        q(Object[] objArr, Object[] objArr2) {
            int[] iArrB = b(objArr);
            this.f2597a = iArrB;
            this.f2598b = a(objArr, iArrB);
            this.f2599c = a(objArr2, iArrB);
        }

        private static Object[] a(Object[] objArr, int[] iArr) {
            int length = objArr.length;
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), GridLayout.y(iArr, -1) + 1);
            for (int i10 = 0; i10 < length; i10++) {
                objArr2[iArr[i10]] = objArr[i10];
            }
            return objArr2;
        }

        private static int[] b(Object[] objArr) {
            int length = objArr.length;
            int[] iArr = new int[length];
            HashMap map = new HashMap();
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = objArr[i10];
                Integer numValueOf = (Integer) map.get(obj);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(map.size());
                    map.put(obj, numValueOf);
                }
                iArr[i10] = numValueOf.intValue();
            }
            return iArr;
        }

        public Object c(int i10) {
            return this.f2599c[this.f2597a[i10]];
        }
    }

    static {
        c cVar = new c();
        B = cVar;
        d dVar = new d();
        C = dVar;
        D = cVar;
        E = dVar;
        F = cVar;
        G = dVar;
        H = h(cVar, dVar);
        I = h(dVar, cVar);
        J = new f();
        K = new g();
        L = new h();
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2528a = new l(true);
        this.f2529b = new l(false);
        this.f2530c = 0;
        this.f2531d = false;
        this.f2532e = 1;
        this.f2534g = 0;
        this.f2535h = f2519r;
        this.f2533f = context.getResources().getDimensionPixelOffset(a1.a.f134a);
        int[] iArr = a1.b.f135a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        o0.l0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        try {
            setRowCount(typedArrayObtainStyledAttributes.getInt(f2522u, RtlSpacingHelper.UNDEFINED));
            setColumnCount(typedArrayObtainStyledAttributes.getInt(f2523v, RtlSpacingHelper.UNDEFINED));
            setOrientation(typedArrayObtainStyledAttributes.getInt(f2521t, 0));
            setUseDefaultMargins(typedArrayObtainStyledAttributes.getBoolean(f2524w, false));
            setAlignmentMode(typedArrayObtainStyledAttributes.getInt(f2525x, 1));
            setRowOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(f2526y, true));
            setColumnOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(f2527z, true));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void A(int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                i12 = i10;
                i13 = i11;
            } else {
                o oVarO = o(childAt);
                if (z10) {
                    i12 = i10;
                    i13 = i11;
                    z(childAt, i12, i13, ((ViewGroup.MarginLayoutParams) oVarO).width, ((ViewGroup.MarginLayoutParams) oVarO).height);
                } else {
                    i12 = i10;
                    i13 = i11;
                    boolean z11 = this.f2530c == 0;
                    r rVar = z11 ? oVarO.f2595b : oVarO.f2594a;
                    if (rVar.b(z11) == L) {
                        n nVar = rVar.f2602b;
                        int[] iArrU = (z11 ? this.f2528a : this.f2529b).u();
                        int iT = (iArrU[nVar.f2579b] - iArrU[nVar.f2578a]) - t(childAt, z11);
                        if (z11) {
                            z(childAt, i12, i13, iT, ((ViewGroup.MarginLayoutParams) oVarO).height);
                        } else {
                            z(childAt, i12, i13, ((ViewGroup.MarginLayoutParams) oVarO).width, iT);
                        }
                    }
                }
            }
            i14++;
            i10 = i12;
            i11 = i13;
        }
    }

    private static void B(int[] iArr, int i10, int i11, int i12) {
        int length = iArr.length;
        Arrays.fill(iArr, Math.min(i10, length), Math.min(i11, length), i12);
    }

    private static void C(o oVar, int i10, int i11, int i12, int i13) {
        oVar.d(new n(i10, i11 + i10));
        oVar.c(new n(i12, i13 + i12));
    }

    public static r D(int i10) {
        return E(i10, 1);
    }

    public static r E(int i10, int i11) {
        return F(i10, i11, A);
    }

    public static r F(int i10, int i11, i iVar) {
        return G(i10, i11, iVar, 0.0f);
    }

    public static r G(int i10, int i11, i iVar, float f10) {
        return new r(i10 != Integer.MIN_VALUE, i10, i11, iVar, f10);
    }

    private void H() {
        boolean z10 = this.f2530c == 0;
        int i10 = (z10 ? this.f2528a : this.f2529b).f2546b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        int[] iArr = new int[i10];
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            o oVar = (o) getChildAt(i13).getLayoutParams();
            r rVar = z10 ? oVar.f2594a : oVar.f2595b;
            n nVar = rVar.f2602b;
            boolean z11 = rVar.f2601a;
            int iB = nVar.b();
            if (z11) {
                i11 = nVar.f2578a;
            }
            r rVar2 = z10 ? oVar.f2595b : oVar.f2594a;
            n nVar2 = rVar2.f2602b;
            boolean z12 = rVar2.f2601a;
            int iE = e(nVar2, z12, i10);
            if (z12) {
                i12 = nVar2.f2578a;
            }
            if (i10 != 0) {
                if (!z11 || !z12) {
                    while (true) {
                        int i14 = i12 + iE;
                        if (i(iArr, i11, i12, i14)) {
                            break;
                        }
                        if (z12) {
                            i11++;
                        } else if (i14 <= i10) {
                            i12++;
                        } else {
                            i11++;
                            i12 = 0;
                        }
                    }
                }
                B(iArr, i12, i12 + iE, i11 + iB);
            }
            if (z10) {
                C(oVar, i11, iB, i12, iE);
            } else {
                C(oVar, i12, iE, i11, iB);
            }
            i12 += iE;
        }
    }

    static int a(int i10, int i11) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11 + i10), View.MeasureSpec.getMode(i10));
    }

    static Object[] b(Object[] objArr, Object[] objArr2) {
        Object[] objArr3 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length + objArr2.length);
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        return objArr3;
    }

    static boolean c(int i10) {
        return (i10 & 2) != 0;
    }

    private void d(o oVar, boolean z10) {
        String str = z10 ? "column" : "row";
        n nVar = (z10 ? oVar.f2595b : oVar.f2594a).f2602b;
        int i10 = nVar.f2578a;
        if (i10 != Integer.MIN_VALUE && i10 < 0) {
            u(str + " indices must be positive");
        }
        int i11 = (z10 ? this.f2528a : this.f2529b).f2546b;
        if (i11 != Integer.MIN_VALUE) {
            if (nVar.f2579b > i11) {
                u(str + " indices (start + span) mustn't exceed the " + str + " count");
            }
            if (nVar.b() > i11) {
                u(str + " span mustn't exceed the " + str + " count");
            }
        }
    }

    private static int e(n nVar, boolean z10, int i10) {
        int iB = nVar.b();
        if (i10 == 0) {
            return iB;
        }
        return Math.min(iB, i10 - (z10 ? Math.min(nVar.f2578a, i10) : 0));
    }

    private int f() {
        int childCount = getChildCount();
        int iHashCode = 1;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                iHashCode = (iHashCode * 31) + ((o) childAt.getLayoutParams()).hashCode();
            }
        }
        return iHashCode;
    }

    private void g() {
        int i10 = this.f2534g;
        if (i10 == 0) {
            H();
            this.f2534g = f();
        } else if (i10 != f()) {
            this.f2535h.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
            v();
            g();
        }
    }

    private static i h(i iVar, i iVar2) {
        return new e(iVar, iVar2);
    }

    private static boolean i(int[] iArr, int i10, int i11, int i12) {
        if (i12 > iArr.length) {
            return false;
        }
        while (i11 < i12) {
            if (iArr[i11] > i10) {
                return false;
            }
            i11++;
        }
        return true;
    }

    static i m(int i10, boolean z10) {
        int i11 = (i10 & (z10 ? 7 : 112)) >> (z10 ? 0 : 4);
        return i11 != 1 ? i11 != 3 ? i11 != 5 ? i11 != 7 ? i11 != 8388611 ? i11 != 8388613 ? A : G : F : L : z10 ? I : E : z10 ? H : D : J;
    }

    private int n(View view) {
        if (this.f2531d && view.getClass() != Space.class) {
            return this.f2533f / 2;
        }
        return 0;
    }

    private int p(View view, boolean z10, boolean z11) {
        if (this.f2532e == 1) {
            return q(view, z10, z11);
        }
        l lVar = z10 ? this.f2528a : this.f2529b;
        int[] iArrT = z11 ? lVar.t() : lVar.y();
        o oVarO = o(view);
        n nVar = (z10 ? oVarO.f2595b : oVarO.f2594a).f2602b;
        return iArrT[z11 ? nVar.f2578a : nVar.f2579b];
    }

    private int r(View view, boolean z10) {
        return z10 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private int t(View view, boolean z10) {
        return p(view, z10, true) + p(view, z10, false);
    }

    static void u(String str) {
        throw new IllegalArgumentException(str + ". ");
    }

    private void v() {
        this.f2534g = 0;
        l lVar = this.f2528a;
        if (lVar != null) {
            lVar.E();
        }
        l lVar2 = this.f2529b;
        if (lVar2 != null) {
            lVar2.E();
        }
        w();
    }

    private void w() {
        l lVar = this.f2528a;
        if (lVar == null || this.f2529b == null) {
            return;
        }
        lVar.F();
        this.f2529b.F();
    }

    private boolean x() {
        return getLayoutDirection() == 1;
    }

    static int y(int[] iArr, int i10) {
        for (int i11 : iArr) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    private void z(View view, int i10, int i11, int i12, int i13) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, t(view, true), i12), ViewGroup.getChildMeasureSpec(i11, t(view, false), i13));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof o)) {
            return false;
        }
        o oVar = (o) layoutParams;
        d(oVar, true);
        d(oVar, false);
        return true;
    }

    public int getAlignmentMode() {
        return this.f2532e;
    }

    public int getColumnCount() {
        return this.f2528a.p();
    }

    public int getOrientation() {
        return this.f2530c;
    }

    public Printer getPrinter() {
        return this.f2535h;
    }

    public int getRowCount() {
        return this.f2529b.p();
    }

    public boolean getUseDefaultMargins() {
        return this.f2531d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public o generateDefaultLayoutParams() {
        return new o();
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public o generateLayoutParams(AttributeSet attributeSet) {
        return new o(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o ? new o((o) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o((ViewGroup.MarginLayoutParams) layoutParams) : new o(layoutParams);
    }

    final o o(View view) {
        return (o) view.getLayoutParams();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        GridLayout gridLayout = this;
        gridLayout.g();
        int i17 = i12 - i10;
        int paddingLeft = gridLayout.getPaddingLeft();
        int paddingTop = gridLayout.getPaddingTop();
        int paddingRight = gridLayout.getPaddingRight();
        int paddingBottom = gridLayout.getPaddingBottom();
        gridLayout.f2528a.G((i17 - paddingLeft) - paddingRight);
        gridLayout.f2529b.G(((i13 - i11) - paddingTop) - paddingBottom);
        int[] iArrU = gridLayout.f2528a.u();
        int[] iArrU2 = gridLayout.f2529b.u();
        int childCount = gridLayout.getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = gridLayout.getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                i14 = i17;
                i15 = paddingLeft;
                i16 = paddingTop;
            } else {
                o oVarO = gridLayout.o(childAt);
                r rVar = oVarO.f2595b;
                r rVar2 = oVarO.f2594a;
                n nVar = rVar.f2602b;
                n nVar2 = rVar2.f2602b;
                int i19 = iArrU[nVar.f2578a];
                int i20 = iArrU2[nVar2.f2578a];
                int i21 = iArrU[nVar.f2579b] - i19;
                int i22 = iArrU2[nVar2.f2579b] - i20;
                int iR = gridLayout.r(childAt, true);
                i14 = i17;
                int iR2 = gridLayout.r(childAt, false);
                i iVarB = rVar.b(true);
                i iVarB2 = rVar2.b(false);
                m mVar = (m) gridLayout.f2528a.s().c(i18);
                m mVar2 = (m) gridLayout.f2529b.s().c(i18);
                i15 = paddingLeft;
                int iD = iVarB.d(childAt, i21 - mVar.e(true));
                int iD2 = iVarB2.d(childAt, i22 - mVar2.e(true));
                int iP = gridLayout.p(childAt, true, true);
                int iP2 = gridLayout.p(childAt, false, true);
                int iP3 = gridLayout.p(childAt, true, false);
                int i23 = iP + iP3;
                int iP4 = iP2 + gridLayout.p(childAt, false, false);
                int iA = mVar.a(gridLayout, childAt, iVarB, iR + i23, true);
                i16 = paddingTop;
                int iA2 = mVar2.a(this, childAt, iVarB2, iR2 + iP4, false);
                int iE = iVarB.e(childAt, iR, i21 - i23);
                int iE2 = iVarB2.e(childAt, iR2, i22 - iP4);
                int i24 = i19 + iD + iA;
                int i25 = !x() ? i15 + iP + i24 : (((i14 - iE) - paddingRight) - iP3) - i24;
                int i26 = i16 + i20 + iD2 + iA2 + iP2;
                if (iE != childAt.getMeasuredWidth() || iE2 != childAt.getMeasuredHeight()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iE, WXVideoFileObject.FILE_SIZE_LIMIT), View.MeasureSpec.makeMeasureSpec(iE2, WXVideoFileObject.FILE_SIZE_LIMIT));
                }
                childAt.layout(i25, i26, iE + i25, iE2 + i26);
            }
            i18++;
            gridLayout = this;
            paddingTop = i16;
            i17 = i14;
            paddingLeft = i15;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int iW;
        int iW2;
        g();
        w();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iA = a(i10, -paddingLeft);
        int iA2 = a(i11, -paddingTop);
        A(iA, iA2, true);
        if (this.f2530c == 0) {
            iW = this.f2528a.w(iA);
            A(iA, iA2, false);
            iW2 = this.f2529b.w(iA2);
        } else {
            int iW3 = this.f2529b.w(iA2);
            A(iA, iA2, false);
            iW = this.f2528a.w(iA);
            iW2 = iW3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iW + paddingLeft, getSuggestedMinimumWidth()), i10, 0), View.resolveSizeAndState(Math.max(iW2 + paddingTop, getSuggestedMinimumHeight()), i11, 0));
    }

    int q(View view, boolean z10, boolean z11) {
        o oVarO = o(view);
        int i10 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) oVarO).leftMargin : ((ViewGroup.MarginLayoutParams) oVarO).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) oVarO).topMargin : ((ViewGroup.MarginLayoutParams) oVarO).bottomMargin;
        return i10 == Integer.MIN_VALUE ? n(view) : i10;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        v();
    }

    final int s(View view, boolean z10) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return r(view, z10) + t(view, z10);
    }

    public void setAlignmentMode(int i10) {
        this.f2532e = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.f2528a.J(i10);
        v();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        this.f2528a.K(z10);
        v();
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.f2530c != i10) {
            this.f2530c = i10;
            v();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = f2520s;
        }
        this.f2535h = printer;
    }

    public void setRowCount(int i10) {
        this.f2529b.J(i10);
        v();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z10) {
        this.f2529b.K(z10);
        v();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z10) {
        this.f2531d = z10;
        requestLayout();
    }

    static final class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2596a;

        public p() {
            a();
        }

        public void a() {
            this.f2596a = RtlSpacingHelper.UNDEFINED;
        }

        public String toString() {
            return Integer.toString(this.f2596a);
        }

        public p(int i10) {
            this.f2596a = i10;
        }
    }

    public static class r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final r f2600e = GridLayout.D(RtlSpacingHelper.UNDEFINED);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f2601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final n f2602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final i f2603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f2604d;

        private r(boolean z10, n nVar, i iVar, float f10) {
            this.f2601a = z10;
            this.f2602b = nVar;
            this.f2603c = iVar;
            this.f2604d = f10;
        }

        final r a(n nVar) {
            return new r(this.f2601a, nVar, this.f2603c, this.f2604d);
        }

        public i b(boolean z10) {
            i iVar = this.f2603c;
            return iVar != GridLayout.A ? iVar : this.f2604d == 0.0f ? z10 ? GridLayout.F : GridLayout.K : GridLayout.L;
        }

        final int c() {
            return (this.f2603c == GridLayout.A && this.f2604d == 0.0f) ? 0 : 2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return this.f2603c.equals(rVar.f2603c) && this.f2602b.equals(rVar.f2602b);
        }

        public int hashCode() {
            return (this.f2602b.hashCode() * 31) + this.f2603c.hashCode();
        }

        r(boolean z10, int i10, int i11, i iVar, float f10) {
            this(z10, new n(i10, i11 + i10), iVar, f10);
        }
    }

    public static class o extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final n f2580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f2581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f2582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f2583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f2584g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f2585h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f2586i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f2587j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f2588k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f2589l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f2590m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f2591n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f2592o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f2593p;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r f2594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r f2595b;

        static {
            n nVar = new n(RtlSpacingHelper.UNDEFINED, -2147483647);
            f2580c = nVar;
            f2581d = nVar.b();
            f2582e = a1.b.f144j;
            f2583f = a1.b.f145k;
            f2584g = a1.b.f146l;
            f2585h = a1.b.f147m;
            f2586i = a1.b.f148n;
            f2587j = a1.b.f149o;
            f2588k = a1.b.f150p;
            f2589l = a1.b.f151q;
            f2590m = a1.b.f153s;
            f2591n = a1.b.f154t;
            f2592o = a1.b.f155u;
            f2593p = a1.b.f152r;
        }

        private o(int i10, int i11, int i12, int i13, int i14, int i15, r rVar, r rVar2) {
            super(i10, i11);
            r rVar3 = r.f2600e;
            this.f2594a = rVar3;
            this.f2595b = rVar3;
            setMargins(i12, i13, i14, i15);
            this.f2594a = rVar;
            this.f2595b = rVar2;
        }

        private void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.f143i);
            try {
                int i10 = typedArrayObtainStyledAttributes.getInt(f2593p, 0);
                int i11 = typedArrayObtainStyledAttributes.getInt(f2587j, RtlSpacingHelper.UNDEFINED);
                int i12 = f2588k;
                int i13 = f2581d;
                this.f2595b = GridLayout.G(i11, typedArrayObtainStyledAttributes.getInt(i12, i13), GridLayout.m(i10, true), typedArrayObtainStyledAttributes.getFloat(f2589l, 0.0f));
                this.f2594a = GridLayout.G(typedArrayObtainStyledAttributes.getInt(f2590m, RtlSpacingHelper.UNDEFINED), typedArrayObtainStyledAttributes.getInt(f2591n, i13), GridLayout.m(i10, false), typedArrayObtainStyledAttributes.getFloat(f2592o, 0.0f));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        private void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.f143i);
            try {
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(f2582e, RtlSpacingHelper.UNDEFINED);
                ((ViewGroup.MarginLayoutParams) this).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f2583f, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f2584g, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f2585h, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f2586i, dimensionPixelSize);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        final void c(n nVar) {
            this.f2595b = this.f2595b.a(nVar);
        }

        final void d(n nVar) {
            this.f2594a = this.f2594a.a(nVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return this.f2595b.equals(oVar.f2595b) && this.f2594a.equals(oVar.f2594a);
        }

        public int hashCode() {
            return (this.f2594a.hashCode() * 31) + this.f2595b.hashCode();
        }

        @Override // android.view.ViewGroup.LayoutParams
        protected void setBaseAttributes(TypedArray typedArray, int i10, int i11) {
            ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i10, -2);
            ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i11, -2);
        }

        public o(r rVar, r rVar2) {
            this(-2, -2, RtlSpacingHelper.UNDEFINED, RtlSpacingHelper.UNDEFINED, RtlSpacingHelper.UNDEFINED, RtlSpacingHelper.UNDEFINED, rVar, rVar2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public o() {
            r rVar = r.f2600e;
            this(rVar, rVar);
        }

        public o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            r rVar = r.f2600e;
            this.f2594a = rVar;
            this.f2595b = rVar;
        }

        public o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            r rVar = r.f2600e;
            this.f2594a = rVar;
            this.f2595b = rVar;
        }

        public o(o oVar) {
            super((ViewGroup.MarginLayoutParams) oVar);
            r rVar = r.f2600e;
            this.f2594a = rVar;
            this.f2595b = rVar;
            this.f2594a = oVar.f2594a;
            this.f2595b = oVar.f2595b;
        }

        public o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            r rVar = r.f2600e;
            this.f2594a = rVar;
            this.f2595b = rVar;
            b(context, attributeSet);
            a(context, attributeSet);
        }
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
