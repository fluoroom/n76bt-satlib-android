package x2;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import r2.a0;

/* JADX INFO: loaded from: classes.dex */
final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f31549a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f31550b;

    class a implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f31551a;

        /* JADX INFO: renamed from: x2.h$a$a, reason: collision with other inner class name */
        class RunnableC0422a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f31553a;

            RunnableC0422a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f31553a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                a0.b().h();
                h.this.f31550b = true;
                h.b(a.this.f31551a, this.f31553a);
                h.this.f31549a.clear();
            }
        }

        a(View view) {
            this.f31551a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            e3.l.v(new RunnableC0422a(this));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // x2.i
    public void a(Activity activity) {
        if (!this.f31550b && this.f31549a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
