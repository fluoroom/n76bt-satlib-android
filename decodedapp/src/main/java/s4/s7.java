package s4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.BTActivity;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.entitys.ChannelBond;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import v4.a2;
import v4.l1;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u0017\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR;\u0010&\u001a&\u0012\f\u0012\n !*\u0004\u0018\u00010 0  !*\u0012\u0012\f\u0012\n !*\u0004\u0018\u00010 0 \u0018\u00010\u001f0\u001f8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Ls4/s7;", "Landroidx/fragment/app/o;", "<init>", "()V", "Ldd/d0;", "e4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "M2", "H2", "Lv4/u$c;", "event", "onMessageEvent", "(Lv4/u$c;)V", "Lv4/l1$f;", "(Lv4/l1$f;)V", "Lm4/p1;", "o0", "Lm4/p1;", "binding", "Lio/objectbox/a;", "Lcom/dw/ht/entitys/ChannelBond;", "kotlin.jvm.PlatformType", "p0", "Lio/objectbox/a;", "getChannelBondBox", "()Lio/objectbox/a;", "channelBondBox", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s7 extends androidx.fragment.app.o {

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    private m4.p1 binding;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private final io.objectbox.a channelBondBox = com.dw.ht.j0.i().k(ChannelBond.class);

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26767a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f26768b;

        static {
            int[] iArr = new int[u.c.values().length];
            try {
                iArr[u.c.CurrentLinkChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f26767a = iArr;
            int[] iArr2 = new int[l1.e.values().length];
            try {
                iArr2[l1.e.SETTINGS_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f26768b = iArr2;
        }
    }

    public static final class b implements CompoundButton.OnCheckedChangeListener {
        b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            rd.m.e(compoundButton, "buttonView");
            if (Cfg.O().getSimpleUIBind() == z10) {
                return;
            }
            Cfg.O().setSimpleUIBind(z10);
            s7.this.e4();
            s7.this.f4();
        }
    }

    public static final void Z3(s7 s7Var, View view) {
        Cfg.O().setSimpleUIBind(!Cfg.O().getSimpleUIBind());
        s7Var.e4();
        s7Var.f4();
    }

    public static final void a4(s7 s7Var, View view) {
        FragmentShowActivity.h2(s7Var.x3(), s7Var.N1(R.string.settings), k5.w0.class);
    }

    public static final void b4(View view) {
        mi.c.e().m(BTActivity.b.f5460c);
    }

    public static final void c4(View view) {
        mi.c.e().m(BTActivity.b.f5458a);
    }

    public static final void d4(s7 s7Var, View view) {
        androidx.fragment.app.p pVarE1 = s7Var.e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
        Main.f5555g.i();
    }

    public final void e4() {
        Cfg.Settings settingsO = Cfg.O();
        if (settingsO.getSimpleUI()) {
            v4.u uVarW = v4.u.w();
            rd.m.d(uVarW, "getInstance(...)");
            v4.c0 c0VarQ = uVarW.q();
            if (c0VarQ == null) {
                return;
            }
            int iG = c0VarQ.Q.G();
            v4.a2 a2VarC2 = c0VarQ.c2();
            rd.m.d(a2VarC2, "getSettings(...)");
            ArrayList arrayList = new ArrayList(iG);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(a2VarC2.f29687b));
            if (a2VarC2.f29691f != a2.a.Off) {
                arrayList2.add(Integer.valueOf(a2VarC2.f29688c));
            }
            if (!settingsO.getSimpleUIBind()) {
                Iterator it = arrayList2.iterator();
                rd.m.d(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    rd.m.d(next, "next(...)");
                    ChannelBond channelBondK1 = c0VarQ.K1(((Number) next).intValue());
                    if (channelBondK1 != null) {
                        arrayList.add(channelBondK1);
                    }
                }
                this.channelBondBox.u(arrayList);
                return;
            }
            v4.n1 n1VarT = uVarW.t();
            if (n1VarT == null) {
                return;
            }
            long j10 = n1VarT.T;
            ArrayList arrayList3 = new ArrayList(iG);
            Iterator it2 = arrayList2.iterator();
            rd.m.d(it2, "iterator(...)");
            while (it2.hasNext()) {
                Object next2 = it2.next();
                rd.m.d(next2, "next(...)");
                int iIntValue = ((Number) next2).intValue();
                ChannelBond channelBondK12 = c0VarQ.K1(iIntValue);
                if (channelBondK12 != null) {
                    if (channelBondK12.getNetworkChannelId() != j10) {
                        arrayList.add(channelBondK12);
                    }
                }
                arrayList3.add(new ChannelBond(0L, j10, c0VarQ.q(), iIntValue, false, false, c0VarQ.Y().f29924m));
            }
            this.channelBondBox.u(arrayList);
            this.channelBondBox.o(arrayList3);
        }
    }

    public final void f4() {
        m4.p1 p1Var = this.binding;
        if (p1Var == null) {
            return;
        }
        p1Var.f21440d.setImageResource(Cfg.O().getSimpleUIBind() ? R.drawable.ic_baseline_link_24 : R.drawable.ic_baseline_link_off_24);
        p1Var.f21441e.setChecked(Cfg.O().getSimpleUIBind());
        v4.c0 c0VarQ = v4.u.w().q();
        if (c0VarQ == null) {
            return;
        }
        p1Var.f21441e.setVisibility((c0VarQ.Q.P() || Cfg.f5484e) ? 8 : 0);
    }

    @Override // androidx.fragment.app.o
    public void H2() {
        mi.c.e().t(this);
        super.H2();
    }

    @Override // androidx.fragment.app.o
    public void M2() {
        mi.c.e().q(this);
        super.M2();
        e4();
    }

    @Override // androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        m4.p1 p1Var = this.binding;
        if (p1Var == null) {
            return;
        }
        p1Var.f21440d.setOnClickListener(new View.OnClickListener() { // from class: s4.n7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                s7.Z3(this.f26634a, view2);
            }
        });
        p1Var.f21441e.setOnCheckedChangeListener(new b());
        p1Var.f21446j.setOnClickListener(new View.OnClickListener() { // from class: s4.o7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                s7.a4(this.f26650a, view2);
            }
        });
        p1Var.f21444h.setOnClickListener(new View.OnClickListener() { // from class: s4.p7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                s7.b4(view2);
            }
        });
        p1Var.f21445i.setOnClickListener(new View.OnClickListener() { // from class: s4.q7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                s7.c4(view2);
            }
        });
        p1Var.f21442f.setOnClickListener(new View.OnClickListener() { // from class: s4.r7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                s7.d4(this.f26727a, view2);
            }
        });
        f4();
        if (Cfg.f5484e) {
            p1Var.f21441e.setVisibility(8);
            View viewFindViewById = view.findViewById(R.id.ii_control);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
        }
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(u.c event) {
        v4.n nVar;
        rd.m.e(event, "event");
        v4.c0 c0VarQ = v4.u.w().q();
        if (a.f26767a[event.ordinal()] == 1) {
            if (c0VarQ != null && (nVar = c0VarQ.Q) != null && nVar.P()) {
                Cfg.O().setSimpleUIBind(false);
            }
            e4();
            f4();
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m4.p1 p1VarC = m4.p1.c(inflater, container, false);
        this.binding = p1VarC;
        rd.m.b(p1VarC);
        ScrollView scrollViewB = p1VarC.b();
        rd.m.d(scrollViewB, "getRoot(...)");
        return scrollViewB;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(l1.f event) {
        rd.m.e(event, "event");
        if (a.f26768b[event.f29977a.ordinal()] == 1) {
            v4.c0 c0VarQ = v4.u.w().q();
            if (rd.m.a(event.f29978b, c0VarQ)) {
                if (c0VarQ.Q.P()) {
                    Cfg.O().setSimpleUIBind(false);
                }
                e4();
                f4();
            }
        }
    }
}
