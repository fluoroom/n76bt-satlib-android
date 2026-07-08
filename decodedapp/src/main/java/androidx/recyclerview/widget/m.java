package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends RecyclerView.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f3220g = true;

    public final void A(RecyclerView.f0 f0Var) {
        I(f0Var);
        h(f0Var);
    }

    public final void B(RecyclerView.f0 f0Var) {
        J(f0Var);
    }

    public final void C(RecyclerView.f0 f0Var, boolean z10) {
        K(f0Var, z10);
        h(f0Var);
    }

    public final void D(RecyclerView.f0 f0Var, boolean z10) {
        L(f0Var, z10);
    }

    public final void E(RecyclerView.f0 f0Var) {
        M(f0Var);
        h(f0Var);
    }

    public final void F(RecyclerView.f0 f0Var) {
        N(f0Var);
    }

    public final void G(RecyclerView.f0 f0Var) {
        O(f0Var);
        h(f0Var);
    }

    public final void H(RecyclerView.f0 f0Var) {
        P(f0Var);
    }

    public void I(RecyclerView.f0 f0Var) {
    }

    public void J(RecyclerView.f0 f0Var) {
    }

    public void K(RecyclerView.f0 f0Var, boolean z10) {
    }

    public void L(RecyclerView.f0 f0Var, boolean z10) {
    }

    public void M(RecyclerView.f0 f0Var) {
    }

    public void N(RecyclerView.f0 f0Var) {
    }

    public void O(RecyclerView.f0 f0Var) {
    }

    public void P(RecyclerView.f0 f0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean a(RecyclerView.f0 f0Var, RecyclerView.n.b bVar, RecyclerView.n.b bVar2) {
        int i10;
        int i11;
        return (bVar == null || ((i10 = bVar.f2995a) == (i11 = bVar2.f2995a) && bVar.f2996b == bVar2.f2996b)) ? w(f0Var) : y(f0Var, i10, bVar.f2996b, i11, bVar2.f2996b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean b(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, RecyclerView.n.b bVar, RecyclerView.n.b bVar2) {
        int i10;
        int i11;
        int i12 = bVar.f2995a;
        int i13 = bVar.f2996b;
        if (f0Var2.L()) {
            int i14 = bVar.f2995a;
            i11 = bVar.f2996b;
            i10 = i14;
        } else {
            i10 = bVar2.f2995a;
            i11 = bVar2.f2996b;
        }
        return x(f0Var, f0Var2, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean c(RecyclerView.f0 f0Var, RecyclerView.n.b bVar, RecyclerView.n.b bVar2) {
        int i10 = bVar.f2995a;
        int i11 = bVar.f2996b;
        View view = f0Var.f2964a;
        int left = bVar2 == null ? view.getLeft() : bVar2.f2995a;
        int top = bVar2 == null ? view.getTop() : bVar2.f2996b;
        if (f0Var.x() || (i10 == left && i11 == top)) {
            return z(f0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(f0Var, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean d(RecyclerView.f0 f0Var, RecyclerView.n.b bVar, RecyclerView.n.b bVar2) {
        int i10 = bVar.f2995a;
        int i11 = bVar2.f2995a;
        if (i10 != i11 || bVar.f2996b != bVar2.f2996b) {
            return y(f0Var, i10, bVar.f2996b, i11, bVar2.f2996b);
        }
        E(f0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean f(RecyclerView.f0 f0Var) {
        return !this.f3220g || f0Var.v();
    }

    public abstract boolean w(RecyclerView.f0 f0Var);

    public abstract boolean x(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13);

    public abstract boolean y(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13);

    public abstract boolean z(RecyclerView.f0 f0Var);
}
