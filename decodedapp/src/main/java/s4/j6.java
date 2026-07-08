package s4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.ht.entitys.Satellite;
import com.dw.ht.satellite.a;
import com.dw.ht.satellite.b;
import com.dw.widget.ActionButton;
import java.util.List;
import s4.a6;
import s4.j6;

/* JADX INFO: loaded from: classes.dex */
public final class j6 extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f26545d;

    public static final class a extends RecyclerView.f0 {
        private final m4.i1 D;
        private Satellite E;
        private final Runnable F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m4.i1 i1Var) {
            super(i1Var.b());
            rd.m.e(i1Var, "binding");
            this.D = i1Var;
            i1Var.b().setOnClickListener(new View.OnClickListener() { // from class: s4.f6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j6.a.S(this.f26428a, view);
                }
            });
            i1Var.f21234c.setOnClickListener(new View.OnClickListener() { // from class: s4.g6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j6.a.T(this.f26473a, view);
                }
            });
            ActionButton actionButton = i1Var.f21233b.getActionButton();
            if (actionButton != null) {
                actionButton.setVisibility(0);
            }
            ActionButton actionButton2 = i1Var.f21233b.getActionButton();
            if (actionButton2 != null) {
                actionButton2.setOnClickListener(new View.OnClickListener() { // from class: s4.h6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        j6.a.U(this.f26513a, view);
                    }
                });
            }
            this.F = new Runnable() { // from class: s4.i6
                @Override // java.lang.Runnable
                public final void run() {
                    j6.a.W(this.f26526a);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void S(a aVar, View view) {
            Satellite satellite = aVar.E;
            if (satellite == null) {
                return;
            }
            a6.Companion companion = a6.INSTANCE;
            Context context = aVar.D.b().getContext();
            rd.m.d(context, "getContext(...)");
            companion.a(context, satellite.getNoradCatID());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void T(a aVar, View view) {
            if (aVar.E == null) {
                return;
            }
            com.dw.ht.m0.a().f(aVar.D.b().getContext(), -r4.getNoradCatID());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void U(a aVar, View view) {
            Satellite satellite = aVar.E;
            if (satellite == null) {
                return;
            }
            satellite.F(!satellite.getStarred());
            com.dw.ht.j0.f6341a.n().n(satellite);
            mi.c.e().m(b.a.f6708e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void W(a aVar) {
            aVar.V(aVar.E);
        }

        public final void V(Satellite satellite) {
            this.E = satellite;
            if (satellite == null) {
                return;
            }
            Context context = this.f2964a.getContext();
            m4.i1 i1Var = this.D;
            i1Var.f21233b.removeCallbacks(this.F);
            i1Var.f21233b.setTitle(satellite.getName());
            com.dw.ht.satellite.a aVarB = com.dw.ht.satellite.b.B(satellite.getNoradCatID());
            String strD = null;
            if (aVarB != null) {
                a.b bVarO = aVarB.o();
                if (bVarO != null) {
                    rd.m.b(context);
                    strD = bVarO.d(context);
                }
                if (strD != null) {
                    i1Var.f21233b.postDelayed(this.F, 1000L);
                }
            }
            i1Var.f21233b.setDetail(strD);
            ActionButton actionButton = i1Var.f21233b.getActionButton();
            if (actionButton != null) {
                actionButton.setImageResource(satellite.getStarred() ? R.drawable.ic_star_black_24dp : R.drawable.ic_star_border_black_24dp);
            }
        }
    }

    public j6() {
        B(true);
    }

    public final Satellite D(int i10) {
        List list = this.f26545d;
        if (list != null) {
            return (Satellite) list.get(i10);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void s(a aVar, int i10) {
        rd.m.e(aVar, "holder");
        aVar.V(D(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public a u(ViewGroup viewGroup, int i10) {
        rd.m.e(viewGroup, "parent");
        m4.i1 i1VarC = m4.i1.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        rd.m.d(i1VarC, "inflate(...)");
        return new a(i1VarC);
    }

    public final void G(List list) {
        this.f26545d = list;
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        List list = this.f26545d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long g(int i10) {
        return D(i10) != null ? r3.getNoradCatID() : 0;
    }
}
