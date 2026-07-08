package u3;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f28024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f28025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected RecyclerView.h f28026f;

    class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            h.this.k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11, Object obj) {
            h hVar = h.this;
            hVar.n(hVar.F() + i10, i11, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11) {
            h hVar = h.this;
            hVar.o(hVar.F() + i10, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            h hVar = h.this;
            hVar.p(hVar.F() + i10, i11);
        }
    }

    private static class b extends ArrayList {
        public c b(int i10) {
            Iterator<E> it = iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.D == i10) {
                    return cVar;
                }
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int d(View view) {
            for (int i10 = 0; i10 < size(); i10++) {
                if (((c) get(i10)).f2964a == view) {
                    remove(i10);
                    return i10;
                }
            }
            return -1;
        }

        private b() {
        }
    }

    private static class c extends RecyclerView.f0 {
        private final int D;

        public c(int i10, View view) {
            super(view);
            this.D = i10;
        }
    }

    public h(RecyclerView.h hVar) {
        this.f28024d = new b();
        this.f28025e = new b();
        this.f28026f = hVar;
        hVar.A(new a());
    }

    private int G() {
        return this.f28026f.f();
    }

    public void D(int i10, View view) {
        this.f28025e.add(new c(i10 + 100000, view));
        m(((F() + G()) + E()) - 1);
    }

    public int E() {
        return this.f28025e.size();
    }

    public int F() {
        return this.f28024d.size();
    }

    protected boolean H(int i10) {
        return i10 >= F() + G();
    }

    protected boolean I(int i10) {
        return i10 < F();
    }

    public void J(View view) {
        int iD = this.f28025e.d(view);
        if (iD < 0) {
            return;
        }
        q(F() + G() + iD);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return F() + E() + G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h(int i10) {
        return I(i10) ? ((c) this.f28024d.get(i10)).D : H(i10) ? ((c) this.f28025e.get((i10 - F()) - G())).D : this.f28026f.h(i10 - F());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void s(RecyclerView.f0 f0Var, int i10) {
        if (I(i10) || H(i10)) {
            return;
        }
        this.f28026f.s(f0Var, i10 - F());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 u(ViewGroup viewGroup, int i10) {
        c cVarB = this.f28024d.b(i10);
        if (cVarB == null) {
            cVarB = this.f28025e.b(i10);
        }
        return cVarB != null ? cVarB : this.f28026f.u(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void x(RecyclerView.f0 f0Var) {
        this.f28026f.x(f0Var);
    }
}
