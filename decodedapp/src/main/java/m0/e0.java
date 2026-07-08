package m0;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f20781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f20782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f20783c;

    private e0(View view, Runnable runnable) {
        this.f20781a = view;
        this.f20782b = view.getViewTreeObserver();
        this.f20783c = runnable;
    }

    public static e0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        e0 e0Var = new e0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(e0Var);
        view.addOnAttachStateChangeListener(e0Var);
        return e0Var;
    }

    public void b() {
        if (this.f20782b.isAlive()) {
            this.f20782b.removeOnPreDrawListener(this);
        } else {
            this.f20781a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f20781a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f20783c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f20782b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
