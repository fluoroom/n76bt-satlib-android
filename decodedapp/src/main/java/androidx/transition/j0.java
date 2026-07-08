package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends k {
    private static final String[] Z = {"android:visibility:visibility", "android:visibility:parent"};
    private int Y = 3;

    private static class a extends AnimatorListenerAdapter implements k.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f3392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewGroup f3394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f3395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f3396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f3397f = false;

        a(View view, int i10, boolean z10) {
            this.f3392a = view;
            this.f3393b = i10;
            this.f3394c = (ViewGroup) view.getParent();
            this.f3395d = z10;
            b(true);
        }

        private void a() {
            if (!this.f3397f) {
                d0.f(this.f3392a, this.f3393b);
                ViewGroup viewGroup = this.f3394c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }

        private void b(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f3395d || this.f3396e == z10 || (viewGroup = this.f3394c) == null) {
                return;
            }
            this.f3396e = z10;
            c0.b(viewGroup, z10);
        }

        @Override // androidx.transition.k.i
        public void c(k kVar) {
        }

        @Override // androidx.transition.k.i
        public void d(k kVar) {
            b(false);
            if (this.f3397f) {
                return;
            }
            d0.f(this.f3392a, this.f3393b);
        }

        @Override // androidx.transition.k.i
        public /* synthetic */ void f(k kVar, boolean z10) {
            m.a(this, kVar, z10);
        }

        @Override // androidx.transition.k.i
        public void g(k kVar) {
            kVar.g0(this);
        }

        @Override // androidx.transition.k.i
        public void j(k kVar) {
        }

        @Override // androidx.transition.k.i
        public /* synthetic */ void k(k kVar, boolean z10) {
            m.b(this, kVar, z10);
        }

        @Override // androidx.transition.k.i
        public void l(k kVar) {
            b(true);
            if (this.f3397f) {
                return;
            }
            d0.f(this.f3392a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3397f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                d0.f(this.f3392a, 0);
                ViewGroup viewGroup = this.f3394c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    private class b extends AnimatorListenerAdapter implements k.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f3398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f3399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f3400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f3401d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f3398a = viewGroup;
            this.f3399b = view;
            this.f3400c = view2;
        }

        private void a() {
            this.f3400c.setTag(h.f3386a, null);
            this.f3398a.getOverlay().remove(this.f3399b);
            this.f3401d = false;
        }

        @Override // androidx.transition.k.i
        public void c(k kVar) {
        }

        @Override // androidx.transition.k.i
        public void d(k kVar) {
        }

        @Override // androidx.transition.k.i
        public /* synthetic */ void f(k kVar, boolean z10) {
            m.a(this, kVar, z10);
        }

        @Override // androidx.transition.k.i
        public void g(k kVar) {
            kVar.g0(this);
        }

        @Override // androidx.transition.k.i
        public void j(k kVar) {
            if (this.f3401d) {
                a();
            }
        }

        @Override // androidx.transition.k.i
        public /* synthetic */ void k(k kVar, boolean z10) {
            m.b(this, kVar, z10);
        }

        @Override // androidx.transition.k.i
        public void l(k kVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f3398a.getOverlay().remove(this.f3399b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f3399b.getParent() == null) {
                this.f3398a.getOverlay().add(this.f3399b);
            } else {
                j0.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                this.f3400c.setTag(h.f3386a, this.f3399b);
                this.f3398a.getOverlay().add(this.f3399b);
                this.f3401d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            a();
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f3403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f3404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3406d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewGroup f3407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ViewGroup f3408f;

        c() {
        }
    }

    private void u0(z zVar) {
        zVar.f3466a.put("android:visibility:visibility", Integer.valueOf(zVar.f3467b.getVisibility()));
        zVar.f3466a.put("android:visibility:parent", zVar.f3467b.getParent());
        int[] iArr = new int[2];
        zVar.f3467b.getLocationOnScreen(iArr);
        zVar.f3466a.put("android:visibility:screenLocation", iArr);
    }

    private c v0(z zVar, z zVar2) {
        c cVar = new c();
        cVar.f3403a = false;
        cVar.f3404b = false;
        if (zVar == null || !zVar.f3466a.containsKey("android:visibility:visibility")) {
            cVar.f3405c = -1;
            cVar.f3407e = null;
        } else {
            cVar.f3405c = ((Integer) zVar.f3466a.get("android:visibility:visibility")).intValue();
            cVar.f3407e = (ViewGroup) zVar.f3466a.get("android:visibility:parent");
        }
        if (zVar2 == null || !zVar2.f3466a.containsKey("android:visibility:visibility")) {
            cVar.f3406d = -1;
            cVar.f3408f = null;
        } else {
            cVar.f3406d = ((Integer) zVar2.f3466a.get("android:visibility:visibility")).intValue();
            cVar.f3408f = (ViewGroup) zVar2.f3466a.get("android:visibility:parent");
        }
        if (zVar != null && zVar2 != null) {
            int i10 = cVar.f3405c;
            int i11 = cVar.f3406d;
            if (i10 != i11 || cVar.f3407e != cVar.f3408f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.f3404b = false;
                        cVar.f3403a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.f3404b = true;
                        cVar.f3403a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f3408f == null) {
                        cVar.f3404b = false;
                        cVar.f3403a = true;
                        return cVar;
                    }
                    if (cVar.f3407e == null) {
                        cVar.f3404b = true;
                        cVar.f3403a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (zVar == null && cVar.f3406d == 0) {
                cVar.f3404b = true;
                cVar.f3403a = true;
                return cVar;
            }
            if (zVar2 == null && cVar.f3405c == 0) {
                cVar.f3404b = false;
                cVar.f3403a = true;
            }
        }
        return cVar;
    }

    public void A0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.Y = i10;
    }

    @Override // androidx.transition.k
    public String[] O() {
        return Z;
    }

    @Override // androidx.transition.k
    public boolean T(z zVar, z zVar2) {
        if (zVar == null && zVar2 == null) {
            return false;
        }
        if (zVar != null && zVar2 != null && zVar2.f3466a.containsKey("android:visibility:visibility") != zVar.f3466a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarV0 = v0(zVar, zVar2);
        return cVarV0.f3403a && (cVarV0.f3405c == 0 || cVarV0.f3406d == 0);
    }

    @Override // androidx.transition.k
    public void j(z zVar) {
        u0(zVar);
    }

    @Override // androidx.transition.k
    public void n(z zVar) {
        u0(zVar);
    }

    @Override // androidx.transition.k
    public Animator t(ViewGroup viewGroup, z zVar, z zVar2) {
        c cVarV0 = v0(zVar, zVar2);
        if (!cVarV0.f3403a) {
            return null;
        }
        if (cVarV0.f3407e == null && cVarV0.f3408f == null) {
            return null;
        }
        return cVarV0.f3404b ? x0(viewGroup, zVar, cVarV0.f3405c, zVar2, cVarV0.f3406d) : z0(viewGroup, zVar, cVarV0.f3405c, zVar2, cVarV0.f3406d);
    }

    public abstract Animator w0(ViewGroup viewGroup, View view, z zVar, z zVar2);

    public Animator x0(ViewGroup viewGroup, z zVar, int i10, z zVar2, int i11) {
        if ((this.Y & 1) != 1 || zVar2 == null) {
            return null;
        }
        if (zVar == null) {
            View view = (View) zVar2.f3467b.getParent();
            if (v0(C(view, false), P(view, false)).f3403a) {
                return null;
            }
        }
        return w0(viewGroup, zVar2.f3467b, zVar, zVar2);
    }

    public abstract Animator y0(ViewGroup viewGroup, View view, z zVar, z zVar2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
      0x0069: PHI (r2v3 android.view.View) = 
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v6 android.view.View)
     binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator z0(android.view.ViewGroup r11, androidx.transition.z r12, int r13, androidx.transition.z r14, int r15) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.j0.z0(android.view.ViewGroup, androidx.transition.z, int, androidx.transition.z, int):android.animation.Animator");
    }
}
