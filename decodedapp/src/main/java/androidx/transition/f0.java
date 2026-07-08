package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class f0 extends e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f3383f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f3384g = true;

    static class a {
        static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    f0() {
    }

    @Override // androidx.transition.e0
    public void h(View view, Matrix matrix) {
        if (f3383f) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3383f = false;
            }
        }
    }

    @Override // androidx.transition.e0
    public void i(View view, Matrix matrix) {
        if (f3384g) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3384g = false;
            }
        }
    }
}
