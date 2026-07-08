package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.transition.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m0.o0;
import t0.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements Cloneable {
    private static final Animator[] U = new Animator[0];
    private static final int[] V = {2, 1, 3, 4};
    private static final androidx.transition.g W = new a();
    private static ThreadLocal X = new ThreadLocal();
    private ArrayList C;
    private ArrayList D;
    private i[] E;
    private f O;
    private androidx.collection.a P;
    long R;
    h S;
    long T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3409a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f3410b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f3411c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f3412d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList f3413e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList f3414f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f3415g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f3416h = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList f3417r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ArrayList f3418s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList f3419t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList f3420u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList f3421v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ArrayList f3422w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ArrayList f3423x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private a0 f3424y = new a0();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private a0 f3425z = new a0();
    x A = null;
    private int[] B = V;
    boolean F = false;
    ArrayList G = new ArrayList();
    private Animator[] H = U;
    int I = 0;
    private boolean J = false;
    boolean K = false;
    private k L = null;
    private ArrayList M = null;
    ArrayList N = new ArrayList();
    private androidx.transition.g Q = W;

    class a extends androidx.transition.g {
        a() {
        }

        @Override // androidx.transition.g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f3426a;

        b(androidx.collection.a aVar) {
            this.f3426a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3426a.remove(animator);
            k.this.G.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            k.this.G.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            k.this.w();
            animator.removeListener(this);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f3429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f3430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        z f3431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        WindowId f3432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        k f3433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Animator f3434f;

        d(View view, String str, k kVar, WindowId windowId, z zVar, Animator animator) {
            this.f3429a = view;
            this.f3430b = str;
            this.f3431c = zVar;
            this.f3432d = windowId;
            this.f3433e = kVar;
            this.f3434f = animator;
        }
    }

    private static class e {
        static ArrayList a(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        static ArrayList b(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(obj);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    public static abstract class f {
    }

    private static class g {
        static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        static void b(Animator animator, long j10) {
            ((AnimatorSet) animator).setCurrentPlayTime(j10);
        }
    }

    class h extends t implements w, e.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f3438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f3439e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private t0.i f3440f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Runnable f3443i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f3435a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList f3436b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList f3437c = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private l0.a[] f3441g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final b0 f3442h = new b0();

        h() {
        }

        public static /* synthetic */ void n(h hVar, t0.e eVar, boolean z10, float f10, float f11) {
            if (z10) {
                hVar.getClass();
                return;
            }
            if (f10 >= 1.0f) {
                k.this.c0(j.f3446b, false);
                return;
            }
            long jM = hVar.m();
            k kVarY0 = ((x) k.this).y0(0);
            k kVar = kVarY0.L;
            kVarY0.L = null;
            k.this.l0(-1L, hVar.f3435a);
            k.this.l0(jM, -1L);
            hVar.f3435a = jM;
            Runnable runnable = hVar.f3443i;
            if (runnable != null) {
                runnable.run();
            }
            k.this.N.clear();
            if (kVar != null) {
                kVar.c0(j.f3446b, true);
            }
        }

        private void o() {
            ArrayList arrayList = this.f3437c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f3437c.size();
            if (this.f3441g == null) {
                this.f3441g = new l0.a[size];
            }
            l0.a[] aVarArr = (l0.a[]) this.f3437c.toArray(this.f3441g);
            this.f3441g = null;
            for (int i10 = 0; i10 < size; i10++) {
                aVarArr[i10].accept(this);
                aVarArr[i10] = null;
            }
            this.f3441g = aVarArr;
        }

        private void p() {
            if (this.f3440f != null) {
                return;
            }
            this.f3442h.a(AnimationUtils.currentAnimationTimeMillis(), this.f3435a);
            this.f3440f = new t0.i(new t0.g());
            t0.j jVar = new t0.j();
            jVar.f(1.0f);
            jVar.h(200.0f);
            this.f3440f.x(jVar);
            this.f3440f.n(this.f3435a);
            this.f3440f.c(this);
            this.f3440f.o(this.f3442h.b());
            this.f3440f.j(m() + 1);
            this.f3440f.k(-1.0f);
            this.f3440f.l(4.0f);
            this.f3440f.b(new e.q() { // from class: androidx.transition.l
                @Override // t0.e.q
                public final void a(t0.e eVar, boolean z10, float f10, float f11) {
                    k.h.n(this.f3450a, eVar, z10, f10, f11);
                }
            });
        }

        @Override // androidx.transition.w
        public boolean a() {
            return this.f3438d;
        }

        @Override // t0.e.r
        public void b(t0.e eVar, float f10, float f11) {
            long jMax = Math.max(-1L, Math.min(m() + 1, Math.round(f10)));
            k.this.l0(jMax, this.f3435a);
            this.f3435a = jMax;
            o();
        }

        @Override // androidx.transition.w
        public void e(long j10) {
            if (this.f3440f != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j10 == this.f3435a || !a()) {
                return;
            }
            if (!this.f3439e) {
                if (j10 != 0 || this.f3435a <= 0) {
                    long jM = m();
                    if (j10 == jM && this.f3435a < jM) {
                        j10 = 1 + jM;
                    }
                } else {
                    j10 = -1;
                }
                long j11 = this.f3435a;
                if (j10 != j11) {
                    k.this.l0(j10, j11);
                    this.f3435a = j10;
                }
            }
            o();
            this.f3442h.a(AnimationUtils.currentAnimationTimeMillis(), j10);
        }

        @Override // androidx.transition.w
        public void h() {
            p();
            this.f3440f.t(m() + 1);
        }

        @Override // androidx.transition.w
        public void i(Runnable runnable) {
            this.f3443i = runnable;
            p();
            this.f3440f.t(0.0f);
        }

        @Override // androidx.transition.t, androidx.transition.k.i
        public void j(k kVar) {
            this.f3439e = true;
        }

        @Override // androidx.transition.w
        public long m() {
            return k.this.N();
        }

        void q() {
            long j10 = m() == 0 ? 1L : 0L;
            k.this.l0(j10, this.f3435a);
            this.f3435a = j10;
        }

        public void r() {
            this.f3438d = true;
            ArrayList arrayList = this.f3436b;
            if (arrayList != null) {
                this.f3436b = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((l0.a) arrayList.get(i10)).accept(this);
                }
            }
            o();
        }
    }

    public interface i {
        void c(k kVar);

        void d(k kVar);

        void f(k kVar, boolean z10);

        void g(k kVar);

        void j(k kVar);

        void k(k kVar, boolean z10);

        void l(k kVar);
    }

    interface j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f3445a = new j() { // from class: androidx.transition.n
            @Override // androidx.transition.k.j
            public final void a(k.i iVar, k kVar, boolean z10) {
                iVar.k(kVar, z10);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f3446b = new j() { // from class: androidx.transition.o
            @Override // androidx.transition.k.j
            public final void a(k.i iVar, k kVar, boolean z10) {
                iVar.f(kVar, z10);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f3447c = new j() { // from class: androidx.transition.p
            @Override // androidx.transition.k.j
            public final void a(k.i iVar, k kVar, boolean z10) {
                iVar.j(kVar);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final j f3448d = new j() { // from class: androidx.transition.q
            @Override // androidx.transition.k.j
            public final void a(k.i iVar, k kVar, boolean z10) {
                iVar.d(kVar);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final j f3449e = new j() { // from class: androidx.transition.r
            @Override // androidx.transition.k.j
            public final void a(k.i iVar, k kVar, boolean z10) {
                iVar.l(kVar);
            }
        };

        void a(i iVar, k kVar, boolean z10);
    }

    private static androidx.collection.a H() {
        androidx.collection.a aVar = (androidx.collection.a) X.get();
        if (aVar != null) {
            return aVar;
        }
        androidx.collection.a aVar2 = new androidx.collection.a();
        X.set(aVar2);
        return aVar2;
    }

    private static boolean V(z zVar, z zVar2, String str) {
        Object obj = zVar.f3466a.get(str);
        Object obj2 = zVar2.f3466a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void W(androidx.collection.a aVar, androidx.collection.a aVar2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && U(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && U(view)) {
                z zVar = (z) aVar.get(view2);
                z zVar2 = (z) aVar2.get(view);
                if (zVar != null && zVar2 != null) {
                    this.C.add(zVar);
                    this.D.add(zVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void X(androidx.collection.a aVar, androidx.collection.a aVar2) {
        z zVar;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.f(size);
            if (view != null && U(view) && (zVar = (z) aVar2.remove(view)) != null && U(zVar.f3467b)) {
                this.C.add((z) aVar.h(size));
                this.D.add(zVar);
            }
        }
    }

    private void Y(androidx.collection.a aVar, androidx.collection.a aVar2, androidx.collection.f fVar, androidx.collection.f fVar2) {
        View view;
        int iN = fVar.n();
        for (int i10 = 0; i10 < iN; i10++) {
            View view2 = (View) fVar.o(i10);
            if (view2 != null && U(view2) && (view = (View) fVar2.f(fVar.i(i10))) != null && U(view)) {
                z zVar = (z) aVar.get(view2);
                z zVar2 = (z) aVar2.get(view);
                if (zVar != null && zVar2 != null) {
                    this.C.add(zVar);
                    this.D.add(zVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void Z(androidx.collection.a aVar, androidx.collection.a aVar2, androidx.collection.a aVar3, androidx.collection.a aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) aVar3.j(i10);
            if (view2 != null && U(view2) && (view = (View) aVar4.get(aVar3.f(i10))) != null && U(view)) {
                z zVar = (z) aVar.get(view2);
                z zVar2 = (z) aVar2.get(view);
                if (zVar != null && zVar2 != null) {
                    this.C.add(zVar);
                    this.D.add(zVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void a0(a0 a0Var, a0 a0Var2) {
        androidx.collection.a aVar = new androidx.collection.a(a0Var.f3315a);
        androidx.collection.a aVar2 = new androidx.collection.a(a0Var2.f3315a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.B;
            if (i10 >= iArr.length) {
                g(aVar, aVar2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                X(aVar, aVar2);
            } else if (i11 == 2) {
                Z(aVar, aVar2, a0Var.f3318d, a0Var2.f3318d);
            } else if (i11 == 3) {
                W(aVar, aVar2, a0Var.f3316b, a0Var2.f3316b);
            } else if (i11 == 4) {
                Y(aVar, aVar2, a0Var.f3317c, a0Var2.f3317c);
            }
            i10++;
        }
    }

    private void b0(k kVar, j jVar, boolean z10) {
        k kVar2 = this.L;
        if (kVar2 != null) {
            kVar2.b0(kVar, jVar, z10);
        }
        ArrayList arrayList = this.M;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.M.size();
        i[] iVarArr = this.E;
        if (iVarArr == null) {
            iVarArr = new i[size];
        }
        this.E = null;
        i[] iVarArr2 = (i[]) this.M.toArray(iVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            jVar.a(iVarArr2[i10], kVar, z10);
            iVarArr2[i10] = null;
        }
        this.E = iVarArr2;
    }

    private void g(androidx.collection.a aVar, androidx.collection.a aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            z zVar = (z) aVar.j(i10);
            if (U(zVar.f3467b)) {
                this.C.add(zVar);
                this.D.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            z zVar2 = (z) aVar2.j(i11);
            if (U(zVar2.f3467b)) {
                this.D.add(zVar2);
                this.C.add(null);
            }
        }
    }

    private static void h(a0 a0Var, View view, z zVar) {
        a0Var.f3315a.put(view, zVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (a0Var.f3316b.indexOfKey(id2) >= 0) {
                a0Var.f3316b.put(id2, null);
            } else {
                a0Var.f3316b.put(id2, view);
            }
        }
        String strK = o0.K(view);
        if (strK != null) {
            if (a0Var.f3318d.containsKey(strK)) {
                a0Var.f3318d.put(strK, null);
            } else {
                a0Var.f3318d.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (a0Var.f3317c.h(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    a0Var.f3317c.j(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) a0Var.f3317c.f(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    a0Var.f3317c.j(itemIdAtPosition, null);
                }
            }
        }
    }

    private void j0(Animator animator, androidx.collection.a aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            i(animator);
        }
    }

    private void k(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList arrayList = this.f3417r;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList arrayList2 = this.f3418s;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f3419t;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((Class) this.f3419t.get(i10)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    z zVar = new z(view);
                    if (z10) {
                        n(zVar);
                    } else {
                        j(zVar);
                    }
                    zVar.f3468c.add(this);
                    m(zVar);
                    if (z10) {
                        h(this.f3424y, view, zVar);
                    } else {
                        h(this.f3425z, view, zVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f3421v;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList arrayList5 = this.f3422w;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f3423x;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (((Class) this.f3423x.get(i11)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                k(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList y(ArrayList arrayList, Class cls, boolean z10) {
        return cls != null ? z10 ? e.a(arrayList, cls) : e.b(arrayList, cls) : arrayList;
    }

    public f A() {
        return this.O;
    }

    public TimeInterpolator B() {
        return this.f3412d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return (androidx.transition.z) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.transition.z C(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            androidx.transition.x r0 = r5.A
            if (r0 == 0) goto L9
            androidx.transition.z r6 = r0.C(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.C
            goto L10
        Le:
            java.util.ArrayList r0 = r5.D
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            androidx.transition.z r4 = (androidx.transition.z) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f3467b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.D
            goto L36
        L34:
            java.util.ArrayList r6 = r5.C
        L36:
            java.lang.Object r6 = r6.get(r3)
            androidx.transition.z r6 = (androidx.transition.z) r6
            return r6
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.k.C(android.view.View, boolean):androidx.transition.z");
    }

    public String D() {
        return this.f3409a;
    }

    public androidx.transition.g E() {
        return this.Q;
    }

    public v F() {
        return null;
    }

    public final k G() {
        x xVar = this.A;
        return xVar != null ? xVar.G() : this;
    }

    public long I() {
        return this.f3410b;
    }

    public List J() {
        return this.f3413e;
    }

    public List K() {
        return this.f3415g;
    }

    public List L() {
        return this.f3416h;
    }

    public List M() {
        return this.f3414f;
    }

    final long N() {
        return this.R;
    }

    public String[] O() {
        return null;
    }

    public z P(View view, boolean z10) {
        x xVar = this.A;
        if (xVar != null) {
            return xVar.P(view, z10);
        }
        return (z) (z10 ? this.f3424y : this.f3425z).f3315a.get(view);
    }

    boolean Q() {
        return !this.G.isEmpty();
    }

    public boolean R() {
        return false;
    }

    public boolean T(z zVar, z zVar2) {
        if (zVar != null && zVar2 != null) {
            String[] strArrO = O();
            if (strArrO != null) {
                for (String str : strArrO) {
                    if (V(zVar, zVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = zVar.f3466a.keySet().iterator();
                while (it.hasNext()) {
                    if (V(zVar, zVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean U(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id2 = view.getId();
        ArrayList arrayList3 = this.f3417r;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList arrayList4 = this.f3418s;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f3419t;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f3419t.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f3420u != null && o0.K(view) != null && this.f3420u.contains(o0.K(view))) {
            return false;
        }
        if ((this.f3413e.size() == 0 && this.f3414f.size() == 0 && (((arrayList = this.f3416h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f3415g) == null || arrayList2.isEmpty()))) || this.f3413e.contains(Integer.valueOf(id2)) || this.f3414f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f3415g;
        if (arrayList6 != null && arrayList6.contains(o0.K(view))) {
            return true;
        }
        if (this.f3416h != null) {
            for (int i11 = 0; i11 < this.f3416h.size(); i11++) {
                if (((Class) this.f3416h.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    void c0(j jVar, boolean z10) {
        b0(this, jVar, z10);
    }

    protected void cancel() {
        int size = this.G.size();
        Animator[] animatorArr = (Animator[]) this.G.toArray(this.H);
        this.H = U;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.H = animatorArr;
        c0(j.f3447c, false);
    }

    public k d(i iVar) {
        if (this.M == null) {
            this.M = new ArrayList();
        }
        this.M.add(iVar);
        return this;
    }

    public void d0(View view) {
        if (this.K) {
            return;
        }
        int size = this.G.size();
        Animator[] animatorArr = (Animator[]) this.G.toArray(this.H);
        this.H = U;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.H = animatorArr;
        c0(j.f3448d, false);
        this.J = true;
    }

    void e0(ViewGroup viewGroup) {
        d dVar;
        this.C = new ArrayList();
        this.D = new ArrayList();
        a0(this.f3424y, this.f3425z);
        androidx.collection.a aVarH = H();
        int size = aVarH.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = (Animator) aVarH.f(i10);
            if (animator != null && (dVar = (d) aVarH.get(animator)) != null && dVar.f3429a != null && windowId.equals(dVar.f3432d)) {
                z zVar = dVar.f3431c;
                View view = dVar.f3429a;
                z zVarP = P(view, true);
                z zVarC = C(view, true);
                if (zVarP == null && zVarC == null) {
                    zVarC = (z) this.f3425z.f3315a.get(view);
                }
                if ((zVarP != null || zVarC != null) && dVar.f3433e.T(zVar, zVarC)) {
                    k kVar = dVar.f3433e;
                    if (kVar.G().S != null) {
                        animator.cancel();
                        kVar.G.remove(animator);
                        aVarH.remove(animator);
                        if (kVar.G.size() == 0) {
                            kVar.c0(j.f3447c, false);
                            if (!kVar.K) {
                                kVar.K = true;
                                kVar.c0(j.f3446b, false);
                            }
                        }
                    } else if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        aVarH.remove(animator);
                    }
                }
            }
        }
        u(viewGroup, this.f3424y, this.f3425z, this.C, this.D);
        if (this.S == null) {
            k0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            f0();
            this.S.q();
            this.S.r();
        }
    }

    public k f(View view) {
        this.f3414f.add(view);
        return this;
    }

    void f0() {
        androidx.collection.a aVarH = H();
        this.R = 0L;
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            Animator animator = (Animator) this.N.get(i10);
            d dVar = (d) aVarH.get(animator);
            if (animator != null && dVar != null) {
                if (z() >= 0) {
                    dVar.f3434f.setDuration(z());
                }
                if (I() >= 0) {
                    dVar.f3434f.setStartDelay(I() + dVar.f3434f.getStartDelay());
                }
                if (B() != null) {
                    dVar.f3434f.setInterpolator(B());
                }
                this.G.add(animator);
                this.R = Math.max(this.R, g.a(animator));
            }
        }
        this.N.clear();
    }

    public k g0(i iVar) {
        k kVar;
        ArrayList arrayList = this.M;
        if (arrayList != null) {
            if (!arrayList.remove(iVar) && (kVar = this.L) != null) {
                kVar.g0(iVar);
            }
            if (this.M.size() == 0) {
                this.M = null;
            }
        }
        return this;
    }

    public k h0(View view) {
        this.f3414f.remove(view);
        return this;
    }

    protected void i(Animator animator) {
        if (animator == null) {
            w();
            return;
        }
        if (z() >= 0) {
            animator.setDuration(z());
        }
        if (I() >= 0) {
            animator.setStartDelay(I() + animator.getStartDelay());
        }
        if (B() != null) {
            animator.setInterpolator(B());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void i0(View view) {
        if (this.J) {
            if (!this.K) {
                int size = this.G.size();
                Animator[] animatorArr = (Animator[]) this.G.toArray(this.H);
                this.H = U;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.H = animatorArr;
                c0(j.f3449e, false);
            }
            this.J = false;
        }
    }

    public abstract void j(z zVar);

    protected void k0() {
        s0();
        androidx.collection.a aVarH = H();
        for (Animator animator : this.N) {
            if (aVarH.containsKey(animator)) {
                s0();
                j0(animator, aVarH);
            }
        }
        this.N.clear();
        w();
    }

    void l0(long j10, long j11) {
        long jN = N();
        int i10 = 0;
        boolean z10 = j10 < j11;
        if ((j11 < 0 && j10 >= 0) || (j11 > jN && j10 <= jN)) {
            this.K = false;
            c0(j.f3445a, z10);
        }
        int size = this.G.size();
        Animator[] animatorArr = (Animator[]) this.G.toArray(this.H);
        this.H = U;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            g.b(animator, Math.min(Math.max(0L, j10), g.a(animator)));
            i10++;
            z10 = z10;
        }
        boolean z11 = z10;
        this.H = animatorArr;
        if ((j10 <= jN || j11 > jN) && (j10 >= 0 || j11 < 0)) {
            return;
        }
        if (j10 > jN) {
            this.K = true;
        }
        c0(j.f3446b, z11);
    }

    void m(z zVar) {
    }

    public k m0(long j10) {
        this.f3411c = j10;
        return this;
    }

    public abstract void n(z zVar);

    public void n0(f fVar) {
        this.O = fVar;
    }

    void o(ViewGroup viewGroup, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        androidx.collection.a aVar;
        p(z10);
        if ((this.f3413e.size() > 0 || this.f3414f.size() > 0) && (((arrayList = this.f3415g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f3416h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f3413e.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f3413e.get(i10)).intValue());
                if (viewFindViewById != null) {
                    z zVar = new z(viewFindViewById);
                    if (z10) {
                        n(zVar);
                    } else {
                        j(zVar);
                    }
                    zVar.f3468c.add(this);
                    m(zVar);
                    if (z10) {
                        h(this.f3424y, viewFindViewById, zVar);
                    } else {
                        h(this.f3425z, viewFindViewById, zVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f3414f.size(); i11++) {
                View view = (View) this.f3414f.get(i11);
                z zVar2 = new z(view);
                if (z10) {
                    n(zVar2);
                } else {
                    j(zVar2);
                }
                zVar2.f3468c.add(this);
                m(zVar2);
                if (z10) {
                    h(this.f3424y, view, zVar2);
                } else {
                    h(this.f3425z, view, zVar2);
                }
            }
        } else {
            k(viewGroup, z10);
        }
        if (z10 || (aVar = this.P) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add((View) this.f3424y.f3318d.remove((String) this.P.f(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f3424y.f3318d.put((String) this.P.j(i13), view2);
            }
        }
    }

    public k o0(TimeInterpolator timeInterpolator) {
        this.f3412d = timeInterpolator;
        return this;
    }

    void p(boolean z10) {
        if (z10) {
            this.f3424y.f3315a.clear();
            this.f3424y.f3316b.clear();
            this.f3424y.f3317c.b();
        } else {
            this.f3425z.f3315a.clear();
            this.f3425z.f3316b.clear();
            this.f3425z.f3317c.b();
        }
    }

    public void p0(androidx.transition.g gVar) {
        if (gVar == null) {
            this.Q = W;
        } else {
            this.Q = gVar;
        }
    }

    public void q0(v vVar) {
    }

    @Override // 
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public k clone() {
        try {
            k kVar = (k) super.clone();
            kVar.N = new ArrayList();
            kVar.f3424y = new a0();
            kVar.f3425z = new a0();
            kVar.C = null;
            kVar.D = null;
            kVar.S = null;
            kVar.L = this;
            kVar.M = null;
            return kVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public k r0(long j10) {
        this.f3410b = j10;
        return this;
    }

    protected void s0() {
        if (this.I == 0) {
            c0(j.f3445a, false);
            this.K = false;
        }
        this.I++;
    }

    public Animator t(ViewGroup viewGroup, z zVar, z zVar2) {
        return null;
    }

    String t0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f3411c != -1) {
            sb2.append("dur(");
            sb2.append(this.f3411c);
            sb2.append(") ");
        }
        if (this.f3410b != -1) {
            sb2.append("dly(");
            sb2.append(this.f3410b);
            sb2.append(") ");
        }
        if (this.f3412d != null) {
            sb2.append("interp(");
            sb2.append(this.f3412d);
            sb2.append(") ");
        }
        if (this.f3413e.size() > 0 || this.f3414f.size() > 0) {
            sb2.append("tgts(");
            if (this.f3413e.size() > 0) {
                for (int i10 = 0; i10 < this.f3413e.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f3413e.get(i10));
                }
            }
            if (this.f3414f.size() > 0) {
                for (int i11 = 0; i11 < this.f3414f.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f3414f.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public String toString() {
        return t0("");
    }

    void u(ViewGroup viewGroup, a0 a0Var, a0 a0Var2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        z zVar;
        Object obj;
        Animator animator;
        k kVar = this;
        androidx.collection.a aVarH = H();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z10 = kVar.G().S != null;
        for (int i10 = 0; i10 < size; i10++) {
            z zVar2 = (z) arrayList.get(i10);
            z zVar3 = (z) arrayList2.get(i10);
            if (zVar2 != null && !zVar2.f3468c.contains(kVar)) {
                zVar2 = null;
            }
            if (zVar3 != null && !zVar3.f3468c.contains(kVar)) {
                zVar3 = null;
            }
            if ((zVar2 != null || zVar3 != null) && (zVar2 == null || zVar3 == null || kVar.T(zVar2, zVar3))) {
                Animator animatorT = kVar.t(viewGroup, zVar2, zVar3);
                if (animatorT != null) {
                    if (zVar3 != null) {
                        view = zVar3.f3467b;
                        String[] strArrO = kVar.O();
                        if (strArrO != null && strArrO.length > 0) {
                            zVar = new z(view);
                            z zVar4 = (z) a0Var2.f3315a.get(view);
                            if (zVar4 != null) {
                                int i11 = 0;
                                while (i11 < strArrO.length) {
                                    Map map = zVar.f3466a;
                                    String[] strArr = strArrO;
                                    String str = strArr[i11];
                                    map.put(str, zVar4.f3466a.get(str));
                                    i11++;
                                    strArrO = strArr;
                                    animatorT = animatorT;
                                }
                            }
                            Animator animator2 = animatorT;
                            int size2 = aVarH.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    animator = animator2;
                                    break;
                                }
                                d dVar = (d) aVarH.get((Animator) aVarH.f(i12));
                                if (dVar.f3431c != null && dVar.f3429a == view && dVar.f3430b.equals(D()) && dVar.f3431c.equals(zVar)) {
                                    animator = null;
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            animator = animatorT;
                            zVar = null;
                        }
                        animatorT = animator;
                    } else {
                        view = zVar2.f3467b;
                        zVar = null;
                    }
                    View view2 = view;
                    if (animatorT != null) {
                        Animator animator3 = animatorT;
                        kVar = this;
                        d dVar2 = new d(view2, D(), kVar, viewGroup.getWindowId(), zVar, animator3);
                        if (z10) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator3);
                            obj = animatorSet;
                        } else {
                            obj = animator3;
                        }
                        aVarH.put(obj, dVar2);
                        kVar.N.add(obj);
                    } else {
                        kVar = this;
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                d dVar3 = (d) aVarH.get((Animator) kVar.N.get(sparseIntArray.keyAt(i13)));
                dVar3.f3434f.setStartDelay((((long) sparseIntArray.valueAt(i13)) - Long.MAX_VALUE) + dVar3.f3434f.getStartDelay());
            }
        }
    }

    w v() {
        h hVar = new h();
        this.S = hVar;
        d(hVar);
        return this.S;
    }

    protected void w() {
        int i10 = this.I - 1;
        this.I = i10;
        if (i10 == 0) {
            c0(j.f3446b, false);
            for (int i11 = 0; i11 < this.f3424y.f3317c.n(); i11++) {
                View view = (View) this.f3424y.f3317c.o(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f3425z.f3317c.n(); i12++) {
                View view2 = (View) this.f3425z.f3317c.o(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.K = true;
        }
    }

    public k x(Class cls, boolean z10) {
        this.f3419t = y(this.f3419t, cls, z10);
        return this;
    }

    public long z() {
        return this.f3411c;
    }
}
