package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
abstract class l {
    static int a(RecyclerView.b0 b0Var, i iVar, View view, View view2, RecyclerView.q qVar, boolean z10) {
        if (qVar.O() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(qVar.l0(view) - qVar.l0(view2)) + 1;
        }
        return Math.min(iVar.n(), iVar.d(view2) - iVar.g(view));
    }

    static int b(RecyclerView.b0 b0Var, i iVar, View view, View view2, RecyclerView.q qVar, boolean z10, boolean z11) {
        if (qVar.O() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (b0Var.b() - Math.max(qVar.l0(view), qVar.l0(view2))) - 1) : Math.max(0, Math.min(qVar.l0(view), qVar.l0(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(iVar.d(view2) - iVar.g(view)) / (Math.abs(qVar.l0(view) - qVar.l0(view2)) + 1))) + (iVar.m() - iVar.g(view)));
        }
        return iMax;
    }

    static int c(RecyclerView.b0 b0Var, i iVar, View view, View view2, RecyclerView.q qVar, boolean z10) {
        if (qVar.O() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return b0Var.b();
        }
        return (int) (((iVar.d(view2) - iVar.g(view)) / (Math.abs(qVar.l0(view) - qVar.l0(view2)) + 1)) * b0Var.b());
    }
}
