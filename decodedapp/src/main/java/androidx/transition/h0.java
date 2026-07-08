package androidx.transition;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class h0 extends g0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f3390i = true;

    static class a {
        static void a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    h0() {
    }

    @Override // androidx.transition.e0
    public void g(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i10);
        } else if (f3390i) {
            try {
                a.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f3390i = false;
            }
        }
    }
}
