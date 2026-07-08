package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f20911a;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z0 f20912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f20913b;

        a(z0 z0Var, View view) {
            this.f20912a = z0Var;
            this.f20913b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f20912a.onAnimationCancel(this.f20913b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f20912a.onAnimationEnd(this.f20913b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f20912a.onAnimationStart(this.f20913b);
        }
    }

    y0(View view) {
        this.f20911a = new WeakReference(view);
    }

    private void h(View view, z0 z0Var) {
        if (z0Var != null) {
            view.animate().setListener(new a(z0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public y0 b(float f10) {
        View view = (View) this.f20911a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f20911a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f20911a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public y0 e(long j10) {
        View view = (View) this.f20911a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public y0 f(Interpolator interpolator) {
        View view = (View) this.f20911a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public y0 g(z0 z0Var) {
        View view = (View) this.f20911a.get();
        if (view != null) {
            h(view, z0Var);
        }
        return this;
    }

    public y0 i(long j10) {
        View view = (View) this.f20911a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public y0 j(final b1 b1Var) {
        final View view = (View) this.f20911a.get();
        if (view != null) {
            view.animate().setUpdateListener(b1Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: m0.x0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    b1Var.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = (View) this.f20911a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public y0 l(float f10) {
        View view = (View) this.f20911a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
