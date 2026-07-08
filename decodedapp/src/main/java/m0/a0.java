package m0;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20731b;

    public a0(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f20730a | this.f20731b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f20731b = i10;
        } else {
            this.f20730a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f20731b = 0;
        } else {
            this.f20730a = 0;
        }
    }
}
