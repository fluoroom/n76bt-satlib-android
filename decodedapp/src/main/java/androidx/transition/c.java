package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.k;

/* JADX INFO: loaded from: classes.dex */
public class c extends j0 {

    private static class a extends AnimatorListenerAdapter implements k.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f3353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f3354b = false;

        a(View view) {
            this.f3353a = view;
        }

        @Override // androidx.transition.k.i
        public void c(k kVar) {
        }

        @Override // androidx.transition.k.i
        public void d(k kVar) {
            this.f3353a.setTag(h.f3389d, Float.valueOf(this.f3353a.getVisibility() == 0 ? d0.b(this.f3353a) : 0.0f));
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
        }

        @Override // androidx.transition.k.i
        public void k(k kVar, boolean z10) {
        }

        @Override // androidx.transition.k.i
        public void l(k kVar) {
            this.f3353a.setTag(h.f3389d, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            d0.e(this.f3353a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f3353a.hasOverlappingRendering() && this.f3353a.getLayerType() == 0) {
                this.f3354b = true;
                this.f3353a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f3354b) {
                this.f3353a.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            d0.e(this.f3353a, 1.0f);
            d0.a(this.f3353a);
        }
    }

    public c(int i10) {
        A0(i10);
    }

    private Animator B0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        d0.e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) d0.f3360b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        G().d(aVar);
        return objectAnimatorOfFloat;
    }

    private static float C0(z zVar, float f10) {
        Float f11;
        return (zVar == null || (f11 = (Float) zVar.f3466a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // androidx.transition.k
    public boolean R() {
        return true;
    }

    @Override // androidx.transition.j0, androidx.transition.k
    public void n(z zVar) {
        super.n(zVar);
        Float fValueOf = (Float) zVar.f3467b.getTag(h.f3389d);
        if (fValueOf == null) {
            fValueOf = zVar.f3467b.getVisibility() == 0 ? Float.valueOf(d0.b(zVar.f3467b)) : Float.valueOf(0.0f);
        }
        zVar.f3466a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.j0
    public Animator w0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        d0.c(view);
        return B0(view, C0(zVar, 0.0f), 1.0f);
    }

    @Override // androidx.transition.j0
    public Animator y0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        d0.c(view);
        Animator animatorB0 = B0(view, C0(zVar, 1.0f), 0.0f);
        if (animatorB0 == null) {
            d0.e(view, C0(zVar2, 1.0f));
        }
        return animatorB0;
    }

    public c() {
    }
}
