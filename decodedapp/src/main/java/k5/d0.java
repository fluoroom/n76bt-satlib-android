package k5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import k5.d0;
import m4.z0;
import n4.l;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f19397d = n4.l.f22470a.a();

    public final class a extends RecyclerView.f0 {
        private final z0 D;
        private l.a E;
        final /* synthetic */ d0 F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d0 d0Var, z0 z0Var) {
            super(z0Var.b());
            rd.m.e(z0Var, "binding");
            this.F = d0Var;
            this.D = z0Var;
            z0Var.f21712b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: k5.b0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    d0.a.Q(this.f19393a, compoundButton, z10);
                }
            });
            z0Var.b().setOnClickListener(new View.OnClickListener() { // from class: k5.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d0.a.R(this.f19395a, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Q(a aVar, CompoundButton compoundButton, boolean z10) {
            rd.m.e(compoundButton, "<unused var>");
            l.a aVar2 = aVar.E;
            if (aVar2 != null) {
                aVar2.j(z10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void R(a aVar, View view) {
            aVar.D.f21712b.setChecked(!r0.isChecked());
        }

        public final void S(l.a aVar) {
            this.E = aVar;
            if (aVar == null) {
                return;
            }
            z0 z0Var = this.D;
            z0Var.f21715e.setText(aVar.h());
            z0Var.f21714d.setText(ed.j.S(aVar.e(), "\n", null, null, 0, null, null, 62, null));
            z0Var.f21713c.setVisibility(aVar.g() ? 0 : 4);
            z0Var.f21712b.setChecked(aVar.f());
        }
    }

    public d0() {
        F();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void s(a aVar, int i10) {
        rd.m.e(aVar, "holder");
        aVar.S((l.a) this.f19397d.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public a u(ViewGroup viewGroup, int i10) {
        rd.m.e(viewGroup, "parent");
        z0 z0VarC = z0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        rd.m.d(z0VarC, "inflate(...)");
        return new a(this, z0VarC);
    }

    public final void F() {
        ed.q.y(this.f19397d);
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.f19397d.size();
    }
}
