package u4;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.ht.entitys.IIChannel;
import com.dw.widget.ActionButton;
import java.util.ArrayList;
import java.util.List;
import v4.l1;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c6.i f28061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f28062e;

    public final class a extends RecyclerView.f0 implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {
        private final m4.m0 D;
        private final ImageView E;
        private boolean F;
        final /* synthetic */ e0 G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var, m4.m0 m0Var) {
            super(m0Var.b());
            rd.m.e(m0Var, "binding");
            this.G = e0Var;
            this.D = m0Var;
            ActionButton actionButton = m0Var.f21335b;
            rd.m.d(actionButton, "monitor");
            this.E = actionButton;
            m0Var.b().setOnClickListener(this);
            m0Var.f21338e.setOnClickListener(this);
            m0Var.f21335b.setOnClickListener(this);
        }

        public final m4.m0 O() {
            return this.D;
        }

        public final void P(boolean z10) {
            if (z10 == this.F) {
                return;
            }
            this.F = z10;
            if (z10) {
                this.E.setImageResource(R.drawable.ic_volume_up_24dp);
            } else {
                this.E.setImageResource(R.drawable.ic_volume_off_24dp);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            rd.m.e(view, "v");
            Object tag = this.D.b().getTag();
            rd.m.c(tag, "null cannot be cast to non-null type com.dw.ht.entitys.IIChannel");
            IIChannel iIChannel = (IIChannel) tag;
            int id2 = view.getId();
            if (id2 != R.id.monitor) {
                if (id2 != R.id.settings) {
                    this.G.D().V0(iIChannel, view.getId());
                    return;
                }
                c6.k kVar = new c6.k(view.getContext(), view);
                kVar.b().inflate(R.menu.iicontrol_channel_settings, kVar.a());
                kVar.e(this);
                if (iIChannel.l() == com.dw.ht.user.b.f6853a.i()) {
                    kVar.a().findItem(R.id.quit).setVisible(false);
                } else {
                    kVar.a().findItem(R.id.edit).setVisible(false);
                }
                kVar.f();
                return;
            }
            v4.u uVarW = v4.u.w();
            rd.m.d(uVarW, "getInstance(...)");
            l1 l1VarY = uVarW.y(iIChannel.getChannelId() + 28147497671065500L);
            if (l1VarY == null) {
                return;
            }
            boolean z10 = this.F;
            l1VarY.i1(!z10);
            if (z10) {
                return;
            }
            l1VarY.L(true);
        }

        @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            Object tag = this.D.b().getTag();
            rd.m.c(tag, "null cannot be cast to non-null type com.dw.ht.entitys.IIChannel");
            c6.i iVarD = this.G.D();
            rd.m.b(menuItem);
            iVarD.V0((IIChannel) tag, menuItem.getItemId());
            return true;
        }
    }

    public e0(c6.i iVar) {
        rd.m.e(iVar, "onItemClickListener");
        this.f28061d = iVar;
        this.f28062e = new ArrayList();
    }

    public final c6.i D() {
        return this.f28061d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void s(a aVar, int i10) {
        rd.m.e(aVar, "holder");
        IIChannel iIChannel = (IIChannel) this.f28062e.get(i10);
        aVar.O().f21336c.setTitle(iIChannel.k());
        aVar.O().b().setTag(iIChannel);
        v4.u uVarW = v4.u.w();
        rd.m.d(uVarW, "getInstance(...)");
        l1 l1VarL = uVarW.l(iIChannel.getChannelId() + 28147497671065500L);
        aVar.P(l1VarL != null && l1VarL.p0() && l1VarL.i());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public a u(ViewGroup viewGroup, int i10) {
        rd.m.e(viewGroup, "parent");
        m4.m0 m0VarA = m4.m0.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_ii_control_item, viewGroup, false));
        rd.m.d(m0VarA, "bind(...)");
        return new a(this, m0VarA);
    }

    public final void G(List list) {
        rd.m.e(list, "value");
        this.f28062e = list;
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.f28062e.size();
    }
}
