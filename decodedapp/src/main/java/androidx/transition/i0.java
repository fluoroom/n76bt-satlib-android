package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class i0 extends h0 {
    i0() {
    }

    @Override // androidx.transition.e0
    public float c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.g0, androidx.transition.e0
    public void e(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // androidx.transition.e0
    public void f(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // androidx.transition.h0, androidx.transition.e0
    public void g(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // androidx.transition.f0, androidx.transition.e0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.f0, androidx.transition.e0
    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
