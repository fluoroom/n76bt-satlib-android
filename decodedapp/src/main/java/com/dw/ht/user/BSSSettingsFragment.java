package com.dw.ht.user;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import androidx.appcompat.app.c;
import androidx.fragment.app.o;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.android.widget.ListItemView;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.android.widget.SwitchPreferenceView;
import com.dw.ht.Cfg;
import com.dw.ht.user.BSSSettingsFragment;
import com.dw.ht.user.b;
import ed.j;
import java.util.Iterator;
import kotlin.Metadata;
import m4.u;
import org.greenrobot.eventbus.ThreadMode;
import rd.m;
import s4.i;
import v3.m0;
import v3.q;
import v4.c0;
import v4.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J!\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ;\u0010'\u001a\u00020&2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010*\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\u0003J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0004¢\u0006\u0004\b/\u0010\u0003R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/dw/ht/user/BSSSettingsFragment;", "Lv3/m0;", "<init>", "()V", "Ldd/d0;", "W4", "Lv4/q;", "bc", "L4", "(Lv4/q;)V", "", "interval", "K4", "(I)I", "index", "J4", "X4", "()Lv4/q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/fragment/app/o;", "sender", "what", "arg1", "arg2", "", "obj", "", "f4", "(Landroidx/fragment/app/o;IIILjava/lang/Object;)Z", "M2", "H2", "Lcom/dw/ht/user/b$a;", "event", "onMessageEvent", "(Lcom/dw/ht/user/b$a;)V", "V4", "Lm4/u;", "F0", "Lm4/u;", "getBinding", "()Lm4/u;", "setBinding", "(Lm4/u;)V", "binding", "", "G0", "[I", "intervals", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BSSSettingsFragment extends m0 {

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private u binding;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private final int[] intervals;

    public BSSSettingsFragment() {
        this.intervals = Cfg.f5482d ? new int[]{0, 60000, 120000, 300000, 600000, 900000} : new int[]{0, 10000, 20000, 30000, 40000, 50000, 60000, 120000, 180000, 240000, 300000, 360000, 420000, 480000, 540000, 600000, 900000, 1200000, 1500000, 1800000};
    }

    private final int J4(int index) {
        if (index < 0) {
            return 0;
        }
        int[] iArr = this.intervals;
        return index < iArr.length ? iArr[index] : iArr[iArr.length - 1];
    }

    private final int K4(int interval) {
        Object next;
        Iterator it = j.F(this.intervals).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (interval <= this.intervals[((Number) next).intValue()]) {
                break;
            }
        }
        Integer num = (Integer) next;
        return num != null ? num.intValue() : this.intervals.length - 1;
    }

    private final void L4(q bc2) {
        u uVar = this.binding;
        if (uVar == null) {
            return;
        }
        if (Cfg.f5492i) {
            bc2.W(false);
        }
        uVar.f21592r.setChecked(bc2.r());
        uVar.f21591q.setChecked(bc2.q() || bc2.s());
        W4();
        uVar.f21596v.setChecked(bc2.B());
        uVar.f21586l.setNumber(bc2.j() ? K4(bc2.t()) : 0);
        uVar.f21588n.setChecked(bc2.z());
        uVar.f21589o.setDetail(bc2.u());
        uVar.f21594t.setNumber(bc2.y());
        uVar.f21582h.setNumber(bc2.p());
        uVar.f21595u.setChecked(bc2.A());
        uVar.f21576b.setChecked(bc2.h());
        q qVarC = b.f6853a.c();
        uVar.f21577c.setChecked(qVarC.h());
        uVar.f21593s.setChecked(qVarC.r());
        uVar.f21587m.setNumber(qVarC.j() ? K4(qVarC.t()) : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M4(BSSSettingsFragment bSSSettingsFragment, final u uVar, NumberPreferenceView numberPreferenceView, int i10, int i11) {
        m.e(numberPreferenceView, "<unused var>");
        int iK4 = bSSSettingsFragment.K4(60000);
        if ((i11 <= 0 || i10 != 0) && (i11 + 1 > iK4 || iK4 > i10 || i11 <= 0)) {
            return;
        }
        new c.a(bSSSettingsFragment.x3()).j(R.string.turnOnAutomaticLocationSharingTips).t(R.string.enable, new DialogInterface.OnClickListener() { // from class: n5.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                BSSSettingsFragment.N4(dialogInterface, i12);
            }
        }).m(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: n5.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                BSSSettingsFragment.O4(uVar, dialogInterface, i12);
            }
        }).C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N4(DialogInterface dialogInterface, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O4(u uVar, DialogInterface dialogInterface, int i10) {
        uVar.f21586l.setNumber(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P4(final u uVar, final BSSSettingsFragment bSSSettingsFragment, CompoundButton compoundButton, boolean z10) {
        m.e(compoundButton, "<unused var>");
        if (!z10) {
            uVar.f21578d.setVisibility(8);
            return;
        }
        uVar.f21578d.setVisibility(0);
        if (Cfg.V()) {
            return;
        }
        new c.a(bSSSettingsFragment.x3()).k(bSSSettingsFragment.N1(R.string.needVerifyCallSign)).t(R.string.yes, new DialogInterface.OnClickListener() { // from class: n5.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                BSSSettingsFragment.Q4(this.f22523a, dialogInterface, i10);
            }
        }).m(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: n5.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                BSSSettingsFragment.R4(uVar, dialogInterface, i10);
            }
        }).C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q4(BSSSettingsFragment bSSSettingsFragment, DialogInterface dialogInterface, int i10) {
        FragmentShowActivity.h2(bSSSettingsFragment.x3(), null, i.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R4(u uVar, DialogInterface dialogInterface, int i10) {
        uVar.f21595u.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S4(BSSSettingsFragment bSSSettingsFragment, View view) {
        FragmentShowActivity.h2(bSSSettingsFragment.x3(), null, i.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T4(u uVar, BSSSettingsFragment bSSSettingsFragment, View view) {
        Context context = view.getContext();
        CharSequence title = uVar.f21589o.getTitle();
        CharSequence detail = uVar.f21589o.getDetail();
        q.b bVar = new q.b(context, title, null, detail != null ? detail.toString() : null, null, 0);
        bVar.f29597v = new r3.a(v4.q.f30039z.c());
        v3.q.q4(bVar).g4(bSSSettingsFragment.j1(), "edit_position_report_message");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U4(c0 c0Var, CompoundButton compoundButton, boolean z10) {
        m.e(compoundButton, "<unused var>");
        c0Var.c2().L = z10;
        c0Var.A2();
    }

    private final void W4() {
        SwitchPreferenceView switchPreferenceView;
        u uVar = this.binding;
        if (uVar == null || (switchPreferenceView = uVar.f21591q) == null) {
            return;
        }
        switchPreferenceView.setSummary(r3.a.b(b.f6853a.d(), "utf-8", v4.q.f30039z.d()));
    }

    private final v4.q X4() {
        v4.q qVar = new v4.q();
        u uVar = this.binding;
        if (uVar != null) {
            qVar.N(uVar.f21592r.isChecked());
            qVar.M(uVar.f21591q.isChecked());
            qVar.O(uVar.f21591q.isChecked());
            qVar.S(rg.q.W0(String.valueOf(uVar.f21591q.getSummary())).toString());
            qVar.H(uVar.f21586l.getNumber() != 0);
            qVar.X(uVar.f21596v.isChecked());
            qVar.P(J4(uVar.f21586l.getNumber()));
            qVar.V(uVar.f21588n.isChecked());
            qVar.Q(rg.q.W0(String.valueOf(uVar.f21589o.getDetail())).toString());
            qVar.U(uVar.f21594t.getNumber());
            qVar.L(uVar.f21582h.getNumber());
            qVar.a0(b.f6853a.i());
            String strR = Cfg.r();
            m.d(strR, "getCallSign(...)");
            qVar.I(strR);
            qVar.Z(Cfg.N());
            String strL = Cfg.l();
            m.d(strL, "getAprsSymbol(...)");
            qVar.G(strL);
            qVar.W(uVar.f21595u.isChecked());
            qVar.F(uVar.f21576b.isChecked());
            if (Cfg.f5482d) {
                qVar.N(uVar.f21591q.isChecked());
                qVar.F(uVar.f21591q.isChecked());
            }
            if (Cfg.f5492i) {
                qVar.W(false);
            }
        }
        return qVar;
    }

    @Override // v3.v, androidx.fragment.app.o
    public void H2() {
        super.H2();
        V4();
        mi.c.e().t(this);
    }

    @Override // v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        mi.c.e().q(this);
        L4(b.f6853a.b());
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        m.e(view, "view");
        super.Q2(view, savedInstanceState);
        z4(N1(R.string.signaling));
        Resources resourcesH1 = H1();
        m.d(resourcesH1, "getResources(...)");
        int length = this.intervals.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = this.intervals[i10];
            strArr[i10] = i11 == 0 ? resourcesH1.getString(R.string.off) : resourcesH1.getString(R.string.every_time, a6.j.a(resourcesH1, i11, 60000L).toString());
        }
        final u uVar = this.binding;
        if (uVar == null) {
            return;
        }
        uVar.f21586l.setMinValue(0);
        uVar.f21586l.setNumber(1);
        uVar.f21586l.setDisplayedValues(strArr);
        int i12 = length - 1;
        uVar.f21586l.setMaxValue(i12);
        uVar.f21587m.setMinValue(0);
        uVar.f21587m.setNumber(1);
        uVar.f21587m.setDisplayedValues(strArr);
        uVar.f21587m.setMaxValue(i12);
        uVar.f21586l.setOnNumberChangeListener(new NumberPreferenceView.c() { // from class: n5.d
            @Override // com.dw.android.widget.NumberPreferenceView.c
            public final void f(NumberPreferenceView numberPreferenceView, int i13, int i14) {
                BSSSettingsFragment.M4(this.f22507a, uVar, numberPreferenceView, i13, i14);
            }
        });
        if (Cfg.f5492i) {
            uVar.f21595u.setVisibility(8);
        }
        uVar.f21595u.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: n5.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                BSSSettingsFragment.P4(uVar, this, compoundButton, z10);
            }
        });
        uVar.f21583i.setOnClickListener(new View.OnClickListener() { // from class: n5.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BSSSettingsFragment.S4(this.f22513a, view2);
            }
        });
        uVar.f21589o.setOnClickListener(new View.OnClickListener() { // from class: n5.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BSSSettingsFragment.T4(uVar, this, view2);
            }
        });
        if (Cfg.f5482d) {
            final c0 c0VarQ = v4.u.w().q();
            if (c0VarQ != null) {
                uVar.f21581g.setVisibility(0);
                uVar.f21581g.setChecked(c0VarQ.c2().L);
                uVar.f21581g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: n5.h
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                        BSSSettingsFragment.U4(c0VarQ, compoundButton, z10);
                    }
                });
            }
            uVar.f21595u.setVisibility(8);
            uVar.f21587m.setVisibility(8);
            SwitchPreferenceView switchPreferenceView = uVar.f21591q;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) uVar.f21591q.getTitle());
            sb2.append('&');
            sb2.append((Object) uVar.f21592r.getText());
            switchPreferenceView.setTitle(sb2.toString());
            uVar.f21592r.setVisibility(8);
            uVar.f21576b.setVisibility(8);
            uVar.f21589o.setVisibility(8);
            uVar.f21588n.setVisibility(8);
            uVar.f21580f.setVisibility(8);
            uVar.f21585k.setVisibility(8);
            uVar.f21596v.setVisibility(8);
            uVar.f21584j.setRightText(R.string.idSignaling);
        }
    }

    public final void V4() {
        u uVar = this.binding;
        if (uVar == null) {
            return;
        }
        v4.q qVarX4 = X4();
        b bVar = b.f6853a;
        bVar.v();
        try {
            bVar.n(qVarX4);
            v4.q qVarG = qVarX4.g();
            qVarG.F(uVar.f21577c.isChecked());
            qVarG.N(uVar.f21593s.isChecked());
            qVarG.P(J4(uVar.f21587m.getNumber()));
            qVarG.H(qVarG.t() > 0);
            qVarG.a0(bVar.i());
            qVarG.O(true);
            bVar.o(qVarG);
            bVar.m();
        } catch (Throwable th2) {
            b.f6853a.m();
            throw th2;
        }
    }

    @Override // v3.v
    protected boolean f4(o sender, int what, int arg1, int arg2, Object obj) {
        String strP1;
        u uVar;
        ListItemView listItemView;
        if (sender == null || (strP1 = sender.P1()) == null || strP1.hashCode() != 1859533469 || !strP1.equals("edit_position_report_message")) {
            return super.f4(sender, what, arg1, arg2, obj);
        }
        if (what != R.id.what_dialog_onclick || arg1 != -1 || (uVar = this.binding) == null || (listItemView = uVar.f21589o) == null) {
            return true;
        }
        listItemView.setDetail(String.valueOf(obj));
        return true;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(b.a event) {
        m.e(event, "event");
        if (event == b.a.f6870c) {
            W4();
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.e(inflater, "inflater");
        u uVarC = u.c(inflater, container, false);
        this.binding = uVarC;
        m.b(uVarC);
        ScrollView scrollViewB = uVarC.b();
        m.d(scrollViewB, "getRoot(...)");
        return scrollViewB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }
}
