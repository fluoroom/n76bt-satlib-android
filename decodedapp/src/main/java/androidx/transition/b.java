package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.k;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b extends k {
    private static final String[] Z = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Property f3319a0 = new a(PointF.class, "topLeft");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Property f3320b0 = new C0047b(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Property f3321c0 = new c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Property f3322d0 = new d(PointF.class, "topLeft");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Property f3323e0 = new e(PointF.class, "position");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final androidx.transition.i f3324f0 = new androidx.transition.i();
    private boolean Y = false;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$b, reason: collision with other inner class name */
    class C0047b extends Property {
        C0047b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            d0.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            d0.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            d0.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f3325a;
        private final i mViewBounds;

        f(i iVar) {
            this.f3325a = iVar;
            this.mViewBounds = iVar;
        }
    }

    private static class g extends AnimatorListenerAdapter implements k.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f3327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f3328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f3329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f3330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f3331e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f3332f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f3333g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f3334h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f3335i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f3336j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f3337k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f3338l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f3339m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f3340n;

        g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f3327a = view;
            this.f3328b = rect;
            this.f3329c = z10;
            this.f3330d = rect2;
            this.f3331e = z11;
            this.f3332f = i10;
            this.f3333g = i11;
            this.f3334h = i12;
            this.f3335i = i13;
            this.f3336j = i14;
            this.f3337k = i15;
            this.f3338l = i16;
            this.f3339m = i17;
        }

        @Override // androidx.transition.k.i
        public void c(k kVar) {
        }

        @Override // androidx.transition.k.i
        public void d(k kVar) {
            this.f3327a.setTag(androidx.transition.h.f3387b, this.f3327a.getClipBounds());
            this.f3327a.setClipBounds(this.f3331e ? null : this.f3330d);
        }

        @Override // androidx.transition.k.i
        public /* synthetic */ void f(k kVar, boolean z10) {
            m.a(this, kVar, z10);
        }

        @Override // androidx.transition.k.i
        public void g(k kVar) {
        }

        @Override // androidx.transition.k.i
        public void j(k kVar) {
            this.f3340n = true;
        }

        @Override // androidx.transition.k.i
        public /* synthetic */ void k(k kVar, boolean z10) {
            m.b(this, kVar, z10);
        }

        @Override // androidx.transition.k.i
        public void l(k kVar) {
            View view = this.f3327a;
            int i10 = androidx.transition.h.f3387b;
            Rect rect = (Rect) view.getTag(i10);
            this.f3327a.setTag(i10, null);
            this.f3327a.setClipBounds(rect);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f3340n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f3329c) {
                    rect = this.f3328b;
                }
            } else if (!this.f3331e) {
                rect = this.f3330d;
            }
            this.f3327a.setClipBounds(rect);
            if (z10) {
                d0.d(this.f3327a, this.f3332f, this.f3333g, this.f3334h, this.f3335i);
            } else {
                d0.d(this.f3327a, this.f3336j, this.f3337k, this.f3338l, this.f3339m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int iMax = Math.max(this.f3334h - this.f3332f, this.f3338l - this.f3336j);
            int iMax2 = Math.max(this.f3335i - this.f3333g, this.f3339m - this.f3337k);
            int i10 = z10 ? this.f3336j : this.f3332f;
            int i11 = z10 ? this.f3337k : this.f3333g;
            d0.d(this.f3327a, i10, i11, iMax + i10, iMax2 + i11);
            this.f3327a.setClipBounds(z10 ? this.f3330d : this.f3328b);
        }
    }

    private static class h extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f3341a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ViewGroup f3342b;

        h(ViewGroup viewGroup) {
            this.f3342b = viewGroup;
        }

        @Override // androidx.transition.t, androidx.transition.k.i
        public void d(k kVar) {
            c0.b(this.f3342b, false);
        }

        @Override // androidx.transition.t, androidx.transition.k.i
        public void g(k kVar) {
            if (!this.f3341a) {
                c0.b(this.f3342b, false);
            }
            kVar.g0(this);
        }

        @Override // androidx.transition.t, androidx.transition.k.i
        public void j(k kVar) {
            c0.b(this.f3342b, false);
            this.f3341a = true;
        }

        @Override // androidx.transition.t, androidx.transition.k.i
        public void l(k kVar) {
            c0.b(this.f3342b, true);
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f3346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f3347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f3348f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f3349g;

        i(View view) {
            this.f3347e = view;
        }

        private void b() {
            d0.d(this.f3347e, this.f3343a, this.f3344b, this.f3345c, this.f3346d);
            this.f3348f = 0;
            this.f3349g = 0;
        }

        void a(PointF pointF) {
            this.f3345c = Math.round(pointF.x);
            this.f3346d = Math.round(pointF.y);
            int i10 = this.f3349g + 1;
            this.f3349g = i10;
            if (this.f3348f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f3343a = Math.round(pointF.x);
            this.f3344b = Math.round(pointF.y);
            int i10 = this.f3348f + 1;
            this.f3348f = i10;
            if (i10 == this.f3349g) {
                b();
            }
        }
    }

    private void u0(z zVar) {
        View view = zVar.f3467b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        zVar.f3466a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        zVar.f3466a.put("android:changeBounds:parent", zVar.f3467b.getParent());
        if (this.Y) {
            zVar.f3466a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.k
    public String[] O() {
        return Z;
    }

    @Override // androidx.transition.k
    public boolean R() {
        return true;
    }

    @Override // androidx.transition.k
    public void j(z zVar) {
        u0(zVar);
    }

    @Override // androidx.transition.k
    public void n(z zVar) {
        Rect rect;
        u0(zVar);
        if (!this.Y || (rect = (Rect) zVar.f3467b.getTag(androidx.transition.h.f3387b)) == null) {
            return;
        }
        zVar.f3466a.put("android:changeBounds:clip", rect);
    }

    @Override // androidx.transition.k
    public Animator t(ViewGroup viewGroup, z zVar, z zVar2) {
        int i10;
        int i11;
        int i12;
        int i13;
        ObjectAnimator objectAnimatorA;
        int i14;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (zVar == null || zVar2 == null) {
            return null;
        }
        Map map = zVar.f3466a;
        Map map2 = zVar2.f3466a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = zVar2.f3467b;
        Rect rect2 = (Rect) zVar.f3466a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) zVar2.f3466a.get("android:changeBounds:bounds");
        int i15 = rect2.left;
        int i16 = rect3.left;
        int i17 = rect2.top;
        int i18 = rect3.top;
        int i19 = rect2.right;
        int i20 = rect3.right;
        int i21 = rect2.bottom;
        int i22 = rect3.bottom;
        int i23 = i19 - i15;
        int i24 = i21 - i17;
        int i25 = i20 - i16;
        int i26 = i22 - i18;
        Rect rect4 = (Rect) zVar.f3466a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) zVar2.f3466a.get("android:changeBounds:clip");
        if ((i23 == 0 || i24 == 0) && (i25 == 0 || i26 == 0)) {
            i10 = 0;
        } else {
            i10 = (i15 == i16 && i17 == i18) ? 0 : 1;
            if (i19 != i20 || i21 != i22) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i27 = i10;
        if (i27 <= 0) {
            return null;
        }
        if (this.Y) {
            d0.d(view, i15, i17, i15 + Math.max(i23, i25), i17 + Math.max(i24, i26));
            if (i15 == i16 && i17 == i18) {
                objectAnimatorA = null;
                i11 = i22;
                i13 = i16;
                i12 = i20;
            } else {
                i11 = i22;
                i12 = i20;
                i13 = i16;
                objectAnimatorA = androidx.transition.f.a(view, f3323e0, E().a(i15, i17, i16, i18));
            }
            boolean z10 = rect4 == null;
            if (z10) {
                i14 = 0;
                rect = new Rect(0, 0, i23, i24);
            } else {
                i14 = 0;
                rect = rect4;
            }
            boolean z11 = rect5 == null;
            Rect rect6 = z11 ? new Rect(i14, i14, i25, i26) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                androidx.transition.i iVar = f3324f0;
                Object[] objArr = new Object[2];
                objArr[i14] = rect;
                objArr[1] = rect6;
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", iVar, objArr);
                g gVar = new g(view, rect, z10, rect6, z11, i15, i17, i19, i21, i13, i18, i12, i11);
                objectAnimatorOfObject.addListener(gVar);
                d(gVar);
            }
            animatorC = y.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            d0.d(view, i15, i17, i19, i21);
            if (i27 != 2) {
                animatorC = (i15 == i16 && i17 == i18) ? androidx.transition.f.a(view, f3321c0, E().a(i19, i21, i20, i22)) : androidx.transition.f.a(view, f3322d0, E().a(i15, i17, i16, i18));
            } else if (i23 == i25 && i24 == i26) {
                animatorC = androidx.transition.f.a(view, f3323e0, E().a(i15, i17, i16, i18));
            } else {
                i iVar2 = new i(view);
                ObjectAnimator objectAnimatorA2 = androidx.transition.f.a(iVar2, f3319a0, E().a(i15, i17, i16, i18));
                ObjectAnimator objectAnimatorA3 = androidx.transition.f.a(iVar2, f3320b0, E().a(i19, i21, i20, i22));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar2));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            c0.b(viewGroup4, true);
            G().d(new h(viewGroup4));
        }
        return animatorC;
    }
}
