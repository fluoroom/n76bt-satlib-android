package s4;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.benshikj.ht.R;
import com.dw.ht.fragments.ContactsListFragment;
import kotlin.Metadata;
import w5.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001>\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\rJ-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010 \u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J#\u0010%\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010$\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\u0003R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Ls4/b1;", "Ls4/t2;", "<init>", "()V", "Ld5/a;", "channel", "Ldd/d0;", "x5", "(Ld5/a;)V", "y5", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "outState", "N2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "m2", "(IILandroid/content/Intent;)V", "Lv4/n0;", "oldLink", "newLink", "d5", "(Lv4/n0;Lv4/n0;)V", "Ly4/b;", "newStatus", "r5", "(Ly4/b;)V", "w2", "Lm4/b0;", "R0", "Lm4/b0;", "binding", "Ly4/a;", "S0", "Ly4/a;", "parameter", "T0", "Ld5/a;", "Lw5/d;", "U0", "Lw5/d;", "command", "Lcom/dw/ht/fragments/ContactsListFragment;", "V0", "Lcom/dw/ht/fragments/ContactsListFragment;", "contacts", "s4/b1$a", "W0", "Ls4/b1$a;", "send", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b1 extends t2 {

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private m4.b0 binding;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private final y4.a parameter;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private d5.a channel;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private w5.d command;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    private ContactsListFragment contacts;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    private final a send;

    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w5.d dVar;
            v4.l1 l1VarY4 = b1.this.Y4();
            if (l1VarY4 == null || (dVar = b1.this.command) == null || b1.this.getStatus().b() != y4.c.f32403f) {
                return;
            }
            l1VarY4.P0(dVar, 2500, false);
            b1 b1Var = b1.this;
            b1Var.s5(b1Var.getMLoadStatus(), 1000L);
            b1.this.s5(this, 10000L);
        }
    }

    public b1() {
        y4.a aVar = new y4.a();
        this.parameter = aVar;
        i5(3);
        aVar.q(430000000);
        this.send = new a();
    }

    public static final void w5(b1 b1Var, View view) {
        b1Var.y5();
    }

    private final void x5(d5.a channel) {
        this.channel = channel;
        if (channel != null) {
            channel.f10581x = true;
        }
        if (channel != null) {
            channel.C = false;
        }
        if (channel != null) {
            channel.G = false;
        }
        y5();
    }

    private final void y5() {
        d5.a aVar;
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 == null || (aVar = this.channel) == null) {
            return;
        }
        this.parameter.n(aVar.f10573g);
        y4.a aVar2 = this.parameter;
        y4.c cVar = y4.c.f32403f;
        aVar2.j(cVar);
        getStatus().p(cVar);
        l1VarY4.b(v4.v.FREQ_MODE_SET_PAR, this.parameter);
        v4.q qVarT = l1VarY4.T();
        rd.m.d(qVarT, "getBssConfig(...)");
        v4.r rVarH = v4.r.h(aVar);
        rd.m.d(rVarH, "from(...)");
        this.command = new d.c().i(qVarT.w()).a(rVarH.b()).k(qVarT.E()).c();
        l1VarY4.d1(15, aVar);
        s5(this.send, 1000L);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void N2(Bundle outState) {
        rd.m.e(outState, "outState");
        outState.putParcelable("channel", this.channel);
        super.N2(outState);
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        Button button;
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        m4.b0 b0Var = this.binding;
        if (b0Var != null && (button = b0Var.f20999d) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: s4.a1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    b1.w5(this.f26357a, view2);
                }
            });
        }
        androidx.fragment.app.o oVarI0 = j1().i0(R.id.joined);
        ContactsListFragment contactsListFragment = oVarI0 instanceof ContactsListFragment ? (ContactsListFragment) oVarI0 : null;
        this.contacts = contactsListFragment;
        if (contactsListFragment != null) {
            contactsListFragment.v5(false);
        }
        ContactsListFragment contactsListFragment2 = this.contacts;
        if (contactsListFragment2 != null) {
            contactsListFragment2.w5(System.currentTimeMillis());
        }
        ContactsListFragment contactsListFragment3 = this.contacts;
        if (contactsListFragment3 != null) {
            contactsListFragment3.h5(Y4());
        }
        y5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(v4.n0 oldLink, v4.n0 newLink) {
        super.d5(oldLink, newLink);
        ContactsListFragment contactsListFragment = this.contacts;
        if (contactsListFragment != null) {
            contactsListFragment.h5(Y4());
        }
        this.parameter.j(y4.c.f32399b);
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            l1VarY4.b(v4.v.FREQ_MODE_SET_PAR, this.parameter);
        }
        y5();
    }

    @Override // androidx.fragment.app.o
    public void m2(int requestCode, int resultCode, Intent data) {
        if (requestCode != 1) {
            super.m2(requestCode, resultCode, data);
            return;
        }
        if (resultCode != -1) {
            androidx.fragment.app.p pVarE1 = e1();
            if (pVarE1 != null) {
                pVarE1.finish();
                return;
            }
            return;
        }
        d5.a aVarG = d5.a.G(data != null ? data.getData() : null);
        if (aVarG != null) {
            x5(aVarG);
            return;
        }
        androidx.fragment.app.p pVarE12 = e1();
        if (pVarE12 != null) {
            pVarE12.finish();
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        y4(R.string.createTeam);
        d5.a aVar = savedInstanceState != null ? (d5.a) savedInstanceState.getParcelable("channel") : null;
        this.channel = aVar;
        if (aVar == null) {
            startActivityForResult(l4.l.K4(k1(), 0), 1);
        }
    }

    @Override // s4.t2
    protected void r5(y4.b newStatus) {
        rd.m.e(newStatus, "newStatus");
        super.r5(newStatus);
        m4.b0 b0Var = this.binding;
        if (b0Var == null) {
            return;
        }
        if (newStatus.b() != y4.c.f32403f) {
            b0Var.f20999d.setVisibility(0);
            b0Var.f20998c.setVisibility(4);
            b0Var.f21000e.setText(R.string.stopped);
        } else {
            b0Var.f20999d.setVisibility(4);
            b0Var.f20998c.setVisibility(0);
            b0Var.f21000e.setText(R.string.broadcastChannelConfiguration);
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m4.b0 b0VarC = m4.b0.c(inflater, container, false);
        this.binding = b0VarC;
        rd.m.b(b0VarC);
        return b0VarC.b();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void w2() {
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            l1VarY4.f1(15);
        }
        this.parameter.j(y4.c.f32399b);
        v4.l1 l1VarY42 = Y4();
        if (l1VarY42 != null) {
            l1VarY42.b(v4.v.FREQ_MODE_SET_PAR, this.parameter);
        }
        super.w2();
    }

    @Override // s4.t2, androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
        t5(this.send);
    }
}
