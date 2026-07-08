package s4;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import com.benshikj.ht.R;
import java.util.ArrayList;
import kotlin.Metadata;
import org.simpleframework.xml.strategy.Name;
import w5.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0006J!\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J7\u0010,\u001a\u00020\t2\f\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010&2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R8\u0010>\u001a&\u0012\f\u0012\n ;*\u0004\u0018\u00010606 ;*\u0012\u0012\f\u0012\n ;*\u0004\u0018\u00010606\u0018\u00010:0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, d2 = {"Ls4/a4;", "Ls4/t2;", "Ls5/b;", "Lw5/d;", "Landroid/widget/AdapterView$OnItemClickListener;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "r2", "(Landroid/os/Bundle;)V", "outState", "N2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ly4/b;", "newStatus", "r5", "(Ly4/b;)V", "Lv4/n0;", "oldLink", "newLink", "d5", "(Lv4/n0;Lv4/n0;)V", "data", "", "w5", "(Lw5/d;)Z", "Landroid/widget/AdapterView;", "parent", "", "position", "", Name.MARK, "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Lm4/s0;", "R0", "Lm4/s0;", "binding", "Ly4/a;", "S0", "Ly4/a;", "parameter", "Ld5/a;", "T0", "Ld5/a;", "channel", "Ljava/util/ArrayList;", "kotlin.jvm.PlatformType", "U0", "Ljava/util/ArrayList;", "channels", "Lc6/a;", "V0", "Lc6/a;", "adapter", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a4 extends t2 implements s5.b, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private m4.s0 binding;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private final y4.a parameter;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private d5.a channel;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private final ArrayList channels;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    private c6.a adapter;

    public a4() {
        y4.a aVar = new y4.a();
        this.parameter = aVar;
        this.channels = a6.o.a();
        i5(3);
        aVar.n(430000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x5(a4 a4Var) {
        c6.a aVar = a4Var.adapter;
        if (aVar != null) {
            Object objClone = a4Var.channels.clone();
            rd.m.c(objClone, "null cannot be cast to non-null type java.util.ArrayList<com.dw.ht.model.Channel>");
            aVar.c((ArrayList) objClone);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y5(a4 a4Var, View view) {
        a4Var.parameter.j(y4.c.f32404g);
        v4.l1 l1VarY4 = a4Var.Y4();
        if (l1VarY4 != null) {
            l1VarY4.b(v4.v.FREQ_MODE_SET_PAR, a4Var.parameter);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void N2(Bundle outState) {
        rd.m.e(outState, "outState");
        outState.putParcelableArrayList("channels", this.channels);
        super.N2(outState);
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        m4.s0 s0Var = this.binding;
        if (s0Var == null) {
            return;
        }
        s0Var.f21535e.setOnClickListener(new View.OnClickListener() { // from class: s4.y3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a4.y5(this.f26862a, view2);
            }
        });
        Context contextK1 = k1();
        Object objClone = this.channels.clone();
        rd.m.c(objClone, "null cannot be cast to non-null type java.util.ArrayList<com.dw.ht.model.Channel>");
        c6.a aVar = new c6.a(contextK1, R.layout.fragment_jion_team_item, R.id.name, (ArrayList) objClone);
        this.adapter = aVar;
        s0Var.f21533c.setAdapter((ListAdapter) aVar);
        s0Var.f21533c.setOnItemClickListener(this);
        s5(getMLoadStatus(), 2000L);
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(v4.n0 oldLink, v4.n0 newLink) {
        v4.r1 r1VarS;
        v4.r1 r1VarS2;
        super.d5(oldLink, newLink);
        if (oldLink != null && (r1VarS2 = oldLink.s()) != null) {
            r1VarS2.m(this);
        }
        if (newLink != null && (r1VarS = newLink.s()) != null) {
            r1VarS.a(this);
        }
        this.parameter.j(y4.c.f32399b);
        if (oldLink != null) {
            oldLink.b(v4.v.FREQ_MODE_SET_PAR, this.parameter);
        }
        this.parameter.j(y4.c.f32404g);
        if (newLink != null) {
            newLink.b(v4.v.FREQ_MODE_SET_PAR, this.parameter);
        }
        if (newLink != null) {
            s5(getMLoadStatus(), 2000L);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView parent, View view, int position, long id2) {
        c6.a aVar = this.adapter;
        this.channel = aVar != null ? (d5.a) aVar.getItem(position) : null;
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 == null) {
            return;
        }
        l1VarY4.d1(15, this.channel);
        l1VarY4.f1(15);
        this.parameter.j(y4.c.f32399b);
        l1VarY4.b(v4.v.FREQ_MODE_SET_PAR, this.parameter);
        v4.q qVarT = l1VarY4.T();
        rd.m.d(qVarT, "getBssConfig(...)");
        if (!TextUtils.isEmpty(qVarT.w())) {
            w5.d dVarC = new d.c().k(qVarT.E()).i(qVarT.w()).c();
            l1VarY4.P0(dVarC, 20000, false);
            l1VarY4.P0(dVarC, 40000, false);
            l1VarY4.P0(dVarC, 60000, false);
        }
        androidx.fragment.app.p pVarE1 = e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        ArrayList parcelableArrayList = savedInstanceState != null ? savedInstanceState.getParcelableArrayList("channels") : null;
        if (parcelableArrayList != null) {
            this.channels.addAll(parcelableArrayList);
        }
        y4(R.string.joinTeam);
    }

    @Override // s4.t2
    protected void r5(y4.b newStatus) {
        rd.m.e(newStatus, "newStatus");
        super.r5(newStatus);
        m4.s0 s0Var = this.binding;
        if (s0Var == null) {
            return;
        }
        if (newStatus.b() != y4.c.f32404g) {
            s0Var.f21535e.setVisibility(0);
            s0Var.f21534d.setVisibility(4);
            s0Var.f21536f.setText(R.string.stopped);
        } else {
            s0Var.f21535e.setVisibility(4);
            s0Var.f21534d.setVisibility(0);
            s0Var.f21536f.setText(R.string.scanning);
        }
        if (Y4() != null) {
            s5(getMLoadStatus(), 2000L);
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m4.s0 s0VarC = m4.s0.c(inflater, container, false);
        this.binding = s0VarC;
        rd.m.b(s0VarC);
        return s0VarC.b();
    }

    @Override // s5.b
    /* JADX INFO: renamed from: w5, reason: merged with bridge method [inline-methods] */
    public boolean F0(w5.d data) {
        ProgressBar progressBar;
        rd.m.e(data, "data");
        byte[] bArr = data.f31266z;
        if (bArr == null) {
            return false;
        }
        rd.m.b(bArr);
        v4.r rVarI = v4.r.i(bArr, 0, bArr.length);
        if (rVarI != null) {
            d5.a aVarG = rVarI.G();
            if (this.channels.contains(aVarG)) {
                return true;
            }
            this.channels.add(0, aVarG);
            m4.s0 s0Var = this.binding;
            if (s0Var != null && (progressBar = s0Var.f21534d) != null) {
                progressBar.post(new Runnable() { // from class: s4.z3
                    @Override // java.lang.Runnable
                    public final void run() {
                        a4.x5(this.f26869a);
                    }
                });
            }
        }
        return true;
    }

    @Override // s4.t2, androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }
}
