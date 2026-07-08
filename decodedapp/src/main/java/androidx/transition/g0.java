package androidx.transition;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class g0 extends f0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f3385h = true;

    static class a {
        static void a(View view, int i10, int i11, int i12, int i13) {
            view.setLeftTopRightBottom(i10, i11, i12, i13);
        }
    }

    g0() {
    }

    @Override // androidx.transition.e0
    public void e(View view, int i10, int i11, int i12, int i13) {
        if (f3385h) {
            try {
                a.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f3385h = false;
            }
        }
    }
}
