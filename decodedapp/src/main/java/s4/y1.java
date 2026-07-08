package s4;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import java.util.ArrayList;
import java.util.Iterator;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
public final class y1 extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c6.i f26856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f26857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f26858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f26859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f26860h;

    public final class a extends RecyclerView.f0 implements View.OnClickListener {
        private final m4.w1 D;
        private n4.a E;
        final /* synthetic */ y1 F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y1 y1Var, m4.w1 w1Var) {
            super(w1Var.b());
            rd.m.e(w1Var, "binding");
            this.F = y1Var;
            this.D = w1Var;
            w1Var.f21662e.setOnClickListener(this);
            w1Var.b().setOnClickListener(this);
            w1Var.f21660c.setOnClickListener(this);
        }

        public final void O(n4.a aVar, boolean z10) {
            rd.m.e(aVar, "item");
            this.E = aVar;
            this.D.f21665h.setImageResource(aVar.f());
            this.D.f21664g.setText(aVar.d());
            this.D.f21659b.setText(aVar.e());
            if (!z10) {
                this.D.f21662e.setVisibility(0);
                this.D.f21660c.setVisibility(8);
                return;
            }
            Long lF = this.F.F();
            long j10 = aVar.f22426a;
            if (lF != null && lF.longValue() == j10 && this.F.f26859g + ((long) 10000) > SystemClock.elapsedRealtime()) {
                this.D.f21659b.setText(R.string.binding);
            } else {
                this.D.f21659b.setText(aVar.b());
            }
            this.D.f21662e.setVisibility(8);
            this.D.f21660c.setVisibility(0);
        }

        public final m4.w1 P() {
            return this.D;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            rd.m.e(view, "v");
            n4.a aVar = this.E;
            if (aVar == null) {
                return;
            }
            if (view.getId() == R.id.del_btn) {
                n4.b.c().e(aVar);
                this.F.K();
                return;
            }
            if (aVar instanceof n4.i) {
                this.F.H().V0(((n4.i) aVar).A(), view.getId());
                return;
            }
            if (aVar instanceof n4.c) {
                v4.i0 i0VarJ = ((n4.c) aVar).j();
                if (i0VarJ.n() || i0VarJ.l() == n0.c.Connecting) {
                    i0VarJ.h(true);
                } else {
                    i0VarJ.B();
                }
                this.F.L(aVar.f22426a);
                this.F.K();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f0
        public String toString() {
            return super.toString() + " '" + ((Object) this.D.f21664g.getText()) + '\'';
        }
    }

    public y1(c6.i iVar) {
        rd.m.e(iVar, "onItemClickListener");
        this.f26856d = iVar;
        this.f26857e = a6.o.a();
        ArrayList arrayListB = n4.b.c().b();
        rd.m.d(arrayListB, "getDevices(...)");
        this.f26858f = arrayListB;
    }

    public final void E(n4.a aVar) {
        rd.m.e(aVar, "device");
        if (this.f26857e.contains(aVar) || this.f26858f.contains(aVar)) {
            return;
        }
        this.f26857e.add(aVar);
        m(this.f26857e.size() - 1);
    }

    public final Long F() {
        return this.f26860h;
    }

    public final n4.a G(int i10) {
        if (i10 < this.f26857e.size()) {
            Object obj = this.f26857e.get(i10);
            rd.m.d(obj, "get(...)");
            return (n4.a) obj;
        }
        Object obj2 = this.f26858f.get(i10 - this.f26857e.size());
        rd.m.d(obj2, "get(...)");
        return (n4.a) obj2;
    }

    public final c6.i H() {
        return this.f26856d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(a aVar, int i10) {
        rd.m.e(aVar, "holder");
        aVar.O(G(i10), i10 < this.f26857e.size());
        if (i10 >= this.f26857e.size()) {
            TextView textView = aVar.P().f21663f;
            if (i10 != this.f26857e.size()) {
                textView.setVisibility(8);
                return;
            } else {
                textView.setVisibility(0);
                textView.setText(R.string.pairedDevice);
                return;
            }
        }
        TextView textView2 = aVar.P().f21663f;
        if (i10 != 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(R.string.availableDevices);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public a u(ViewGroup viewGroup, int i10) {
        rd.m.e(viewGroup, "parent");
        m4.w1 w1VarC = m4.w1.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        rd.m.d(w1VarC, "inflate(...)");
        return new a(this, w1VarC);
    }

    public final void K() {
        ArrayList arrayListB = n4.b.c().b();
        rd.m.d(arrayListB, "getDevices(...)");
        this.f26858f = arrayListB;
        k();
    }

    public final void L(long j10) {
        Iterator it = this.f26857e.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 + 1;
            if (((n4.a) it.next()).f22426a == j10) {
                this.f26857e.remove(i10);
                break;
            }
            i10 = i11;
        }
        K();
    }

    public final void M(Long l10) {
        if (rd.m.a(this.f26860h, l10)) {
            return;
        }
        this.f26860h = l10;
        this.f26859g = SystemClock.elapsedRealtime();
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.f26858f.size() + this.f26857e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long g(int i10) {
        return G(i10).f22426a;
    }
}
