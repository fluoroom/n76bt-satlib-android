package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends RecyclerView.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RecyclerView f3221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Scroller f3222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RecyclerView.u f3223c = new a();

    class a extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f3224a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f3224a) {
                this.f3224a = false;
                n.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f3224a = true;
        }
    }

    private void e() {
        this.f3221a.m1(this.f3223c);
        this.f3221a.setOnFlingListener(null);
    }

    private void h() {
        if (this.f3221a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f3221a.o(this.f3223c);
        this.f3221a.setOnFlingListener(this);
    }

    private boolean i(RecyclerView.q qVar, int i10, int i11) {
        RecyclerView.a0 a0VarD;
        int iG;
        if (!(qVar instanceof RecyclerView.a0.b) || (a0VarD = d(qVar)) == null || (iG = g(qVar, i10, i11)) == -1) {
            return false;
        }
        a0VarD.p(iG);
        qVar.O1(a0VarD);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i10, int i11) {
        RecyclerView.q layoutManager = this.f3221a.getLayoutManager();
        if (layoutManager == null || this.f3221a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3221a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && i(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3221a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f3221a = recyclerView;
        if (recyclerView != null) {
            h();
            this.f3222b = new Scroller(this.f3221a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.q qVar, View view);

    protected abstract RecyclerView.a0 d(RecyclerView.q qVar);

    public abstract View f(RecyclerView.q qVar);

    public abstract int g(RecyclerView.q qVar, int i10, int i11);

    void j() {
        RecyclerView.q layoutManager;
        View viewF;
        RecyclerView recyclerView = this.f3221a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewF = f(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewF);
        int i10 = iArrC[0];
        if (i10 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f3221a.A1(i10, iArrC[1]);
    }
}
