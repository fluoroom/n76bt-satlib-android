package s4;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.android.widget.ListItemView;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.ht.Cfg;
import com.dw.ht.entitys.Satellite;
import com.dw.ht.entitys.SatelliteRadioConfiguration;
import com.dw.ht.provider.a;
import d5.a;
import io.objectbox.query.QueryBuilder;
import java.util.List;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import s4.a6;
import s4.l5;
import s4.t7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 x2\u00020\u00012\u00020\u0002:\u0002yzB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0004J\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u0019\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c2\u0006\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u0016H\u0016¢\u0006\u0004\b.\u0010\u0019J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\u0004J\u000f\u00100\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010\u0004J\u000f\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b1\u0010\u0004J/\u00106\u001a\u00020\u000b2\u0006\u0010*\u001a\u0002022\u0006\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u00107J;\u0010?\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u0001082\u0006\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u00052\b\u0010>\u001a\u0004\u0018\u00010=H\u0014¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020AH\u0007¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000eH\u0014¢\u0006\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010P\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010MR\"\u0010W\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010R\u001a\u0004\bY\u0010T\"\u0004\bZ\u0010VR\"\u0010b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010RR\u001a\u0010g\u001a\u00060\u001bj\u0002`\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR,\u0010l\u001a\u00060\u001bj\u0002`\u001c2\n\u0010h\u001a\u00060\u001bj\u0002`\u001c8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bi\u0010f\"\u0004\bj\u0010kR\u0016\u0010o\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR.\u0010w\u001a\u0004\u0018\u00010p2\b\u0010h\u001a\u0004\u0018\u00010p8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010v¨\u0006{"}, d2 = {"Ls4/a6;", "Lv3/m0;", "Lcom/dw/android/widget/NumberPreferenceView$b;", "<init>", "()V", "", "freq", "", "", "P4", "(I)[Ljava/lang/String;", "Ldd/d0;", "f5", "S4", "", "isTx", "R4", "(IZ)V", "all", "k5", "(Z)V", "j5", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "showMessage", "Lcom/dw/ht/entitys/Satellite;", "Lcom/dw/ht/satellite/SatelliteEntity;", "m5", "(Z)Lcom/dw/ht/entitys/Satellite;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/dw/ht/entitys/SatelliteRadioConfiguration;", "cfg", "h5", "(Lcom/dw/ht/entitys/SatelliteRadioConfiguration;)V", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "outState", "N2", "y2", "M2", "H2", "Lcom/dw/android/widget/NumberPreferenceView;", "from", "to", "byUser", "y0", "(Lcom/dw/android/widget/NumberPreferenceView;IIZ)V", "Landroidx/fragment/app/o;", "sender", "what", "arg1", "arg2", "", "obj", "f4", "(Landroidx/fragment/app/o;IIILjava/lang/Object;)Z", "Ls4/l5$b;", "event", "onMessageEvent", "(Ls4/l5$b;)V", "c4", "()Z", "Lm4/e1;", "F0", "Lm4/e1;", "binding", "Lv4/d0;", "G0", "Lv4/d0;", "txFreqRange", "H0", "rxFreqRange", "I0", "I", "getTxSubAudio", "()I", "setTxSubAudio", "(I)V", "txSubAudio", "J0", "getRxSubAudio", "setRxSubAudio", "rxSubAudio", "K0", "Ljava/lang/String;", "getTle", "()Ljava/lang/String;", "setTle", "(Ljava/lang/String;)V", "tle", "L0", "inShowId", "M0", "Lcom/dw/ht/entitys/Satellite;", "oriSatellite", "value", "N0", "g5", "(Lcom/dw/ht/entitys/Satellite;)V", "satellite", "O0", "Z", "showModulation", "Landroidx/appcompat/app/c;", "P0", "Landroidx/appcompat/app/c;", "getSatelliteRadioConfigurationDialog", "()Landroidx/appcompat/app/c;", "i5", "(Landroidx/appcompat/app/c;)V", "satelliteRadioConfigurationDialog", "Q0", "b", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a6 extends v3.m0 implements NumberPreferenceView.b {

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private m4.e1 binding;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private v4.d0 txFreqRange;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private v4.d0 rxFreqRange;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private int txSubAudio;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private int rxSubAudio;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private int inShowId;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private androidx.appcompat.app.c satelliteRadioConfigurationDialog;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private String tle = "";

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private Satellite oriSatellite = new Satellite();

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private Satellite satellite = new Satellite();

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private boolean showModulation = true;

    /* JADX INFO: renamed from: s4.a6$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(rd.h hVar) {
            this();
        }

        public final void a(Context context, int i10) {
            rd.m.e(context, "context");
            Bundle bundle = new Bundle();
            bundle.putLong("noradCatID", i10);
            FragmentShowActivity.i2(context, null, a6.class, bundle);
        }

        private Companion() {
        }
    }

    public final class b extends c6.a {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ a6 f26361w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a6 a6Var, Context context, List list) {
            super(context, R.layout.fragment_satellite_editor_preset_rf_config, list);
            rd.m.e(context, "context");
            rd.m.e(list, "items");
            this.f26361w = a6Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(a6 a6Var, SatelliteRadioConfiguration satelliteRadioConfiguration, View view) {
            rd.m.b(satelliteRadioConfiguration);
            a6Var.h5(satelliteRadioConfiguration);
            a6Var.i5(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(final b bVar, final SatelliteRadioConfiguration satelliteRadioConfiguration, final int i10, View view) {
            new c.a(bVar.f()).k(bVar.f().getString(R.string.prompt_del, satelliteRadioConfiguration.getName())).t(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: s4.d6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    a6.b.s(this.f26403a, i10, satelliteRadioConfiguration, dialogInterface, i11);
                }
            }).m(android.R.string.cancel, null).C();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(b bVar, int i10, SatelliteRadioConfiguration satelliteRadioConfiguration, DialogInterface dialogInterface, int i11) {
            bVar.j(i10);
            com.dw.ht.j0.f6341a.o().v(satelliteRadioConfiguration.getId());
        }

        @Override // c6.a, android.widget.Adapter
        public View getView(final int i10, View view, ViewGroup viewGroup) {
            rd.m.e(viewGroup, "parent");
            m4.f1 f1VarC = view == null ? m4.f1.c(this.f4385s, viewGroup, false) : m4.f1.a(view);
            rd.m.b(f1VarC);
            final SatelliteRadioConfiguration satelliteRadioConfiguration = (SatelliteRadioConfiguration) getItem(i10);
            f1VarC.f21140d.setText(satelliteRadioConfiguration.getName());
            TextView textView = f1VarC.f21139c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f().getString(R.string.downlink));
            sb2.append(": ");
            int i11 = satelliteRadioConfiguration.i();
            boolean zP = Cfg.P();
            String string = f().getString(R.string.empty);
            rd.m.d(string, "getString(...)");
            sb2.append(w4.b.e(i11, zP, true, false, string));
            sb2.append(" | ");
            sb2.append(f().getString(R.string.ctcss_dcs));
            sb2.append(": ");
            sb2.append(d5.a.j(satelliteRadioConfiguration.getDownlinkSubAudio()));
            sb2.append('\n');
            sb2.append(f().getString(R.string.uplink));
            sb2.append(": ");
            int iJ = satelliteRadioConfiguration.j();
            boolean zP2 = Cfg.P();
            String string2 = f().getString(R.string.empty);
            rd.m.d(string2, "getString(...)");
            sb2.append(w4.b.e(iJ, zP2, true, false, string2));
            sb2.append(" | ");
            sb2.append(f().getString(R.string.ctcss_dcs));
            sb2.append(": ");
            sb2.append(d5.a.j(satelliteRadioConfiguration.getUplinkSubAudio()));
            sb2.append('\n');
            sb2.append(f().getString(R.string.bandwidth));
            sb2.append(": ");
            sb2.append(w4.b.c(satelliteRadioConfiguration.getBandwidth(), true));
            textView.setText(sb2.toString());
            ConstraintLayout constraintLayoutB = f1VarC.b();
            final a6 a6Var = this.f26361w;
            constraintLayoutB.setOnClickListener(new View.OnClickListener() { // from class: s4.b6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a6.b.q(a6Var, satelliteRadioConfiguration, view2);
                }
            });
            f1VarC.f21138b.setOnClickListener(new View.OnClickListener() { // from class: s4.c6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a6.b.r(this.f26393a, satelliteRadioConfiguration, i10, view2);
                }
            });
            f1VarC.b().setClickable(true);
            ConstraintLayout constraintLayoutB2 = f1VarC.b();
            rd.m.d(constraintLayoutB2, "getRoot(...)");
            return constraintLayoutB2;
        }
    }

    public static final class c implements m0.u {
        c() {
        }

        @Override // m0.u
        public void E0(Menu menu, MenuInflater menuInflater) {
            MenuItem menuItemFindItem;
            rd.m.e(menu, "menu");
            rd.m.e(menuInflater, "menuInflater");
            menuInflater.inflate(R.menu.o_channel_editor, menu);
            if (a6.this.satellite.getId() == 0 && (menuItemFindItem = menu.findItem(R.id.delete)) != null) {
                menuItemFindItem.setVisible(false);
            }
            MenuItem menuItemFindItem2 = menu.findItem(R.id.share);
            if (menuItemFindItem2 != null) {
                menuItemFindItem2.setVisible(false);
            }
        }

        @Override // m0.u
        public /* synthetic */ void K0(Menu menu) {
            m0.t.b(this, menu);
        }

        @Override // m0.u
        public boolean v(MenuItem menuItem) {
            rd.m.e(menuItem, "menuItem");
            int itemId = menuItem.getItemId();
            if (itemId == R.id.delete) {
                a6.this.S4();
                return true;
            }
            if (itemId != R.id.save) {
                return itemId == R.id.share;
            }
            a6.this.f5();
            return true;
        }

        @Override // m0.u
        public /* synthetic */ void z0(Menu menu) {
            m0.t.a(this, menu);
        }
    }

    private final String[] P4(int freq) {
        String[] strArrK = d5.a.k(freq);
        rd.m.d(strArrK, "buildSubAudioNames(...)");
        return strArrK;
    }

    static /* synthetic */ String[] Q4(a6 a6Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return a6Var.P4(i10);
    }

    private final void R4(int freq, boolean isTx) {
        t7.Companion companion = t7.INSTANCE;
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        String strN1 = N1(isTx ? R.string.txCTCSS : R.string.rxCTCSS);
        rd.m.b(strN1);
        companion.a(contextX3, strN1, freq / 100, "").g4(j1(), isTx ? "tx_sub_audio" : "rx_sub_audio");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S4() {
        new c.a(x3()).j(R.string.confirm_delete_satellite_data).m(R.string.no, new DialogInterface.OnClickListener() { // from class: s4.y5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                a6.T4(dialogInterface, i10);
            }
        }).t(R.string.delete, new DialogInterface.OnClickListener() { // from class: s4.z5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                a6.U4(this.f26870a, dialogInterface, i10);
            }
        }).C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U4(a6 a6Var, DialogInterface dialogInterface, int i10) {
        com.dw.ht.satellite.b.f6691a.u(a6Var.satellite);
        androidx.fragment.app.p pVarE1 = a6Var.e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V4(a6 a6Var, DialogInterface dialogInterface, int i10) {
        a6Var.f5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W4(a6 a6Var, DialogInterface dialogInterface, int i10) {
        androidx.fragment.app.p pVarE1 = a6Var.e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X4(a6 a6Var, View view) {
        l5.INSTANCE.b(a6Var.rxFreqRange, Integer.valueOf(a6Var.satellite.getRxFreq()), a6Var.satellite.getRxModulation(), a6Var.showModulation).g4(a6Var.j1(), "rx");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(a6 a6Var, View view) {
        l5.INSTANCE.b(a6Var.txFreqRange, Integer.valueOf(a6Var.satellite.getTxFreq()), a6Var.satellite.getTxModulation(), a6Var.showModulation).g4(a6Var.j1(), "tx");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z4(m4.e1 e1Var, a6 a6Var, View view) {
        v3.q.p4(e1Var.f21108i.getContext(), e1Var.f21108i.getTitle(), null, String.valueOf(e1Var.f21108i.getDetail()), "", 1).g4(a6Var.j1(), "title");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a5(m4.e1 e1Var, a6 a6Var, View view) {
        v3.q.p4(e1Var.f21109j.getContext(), e1Var.f21109j.getTitle(), null, a6Var.tle, "", 139).g4(a6Var.j1(), "tle");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b5(a6 a6Var, View view) {
        Context contextX3 = a6Var.x3();
        rd.m.d(contextX3, "requireContext(...)");
        v3.q.o4(contextX3, contextX3.getString(R.string.title), null, null, null).g4(a6Var.j1(), "new_rf_cfg_name");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c5(final a6 a6Var, View view) {
        QueryBuilder queryBuilderQ = com.dw.ht.j0.f6341a.o().q();
        rd.m.d(queryBuilderQ, "query(...)");
        io.objectbox.e eVar = com.dw.ht.entitys.g.f5800g;
        rd.m.d(eVar, "noradCatID");
        QueryBuilder queryBuilderE = queryBuilderQ.e(eVar, a6Var.inShowId);
        rd.m.d(queryBuilderE, "equal(property, value.toLong())");
        List listX = queryBuilderE.h(com.dw.ht.entitys.g.f5799f).a().x();
        rd.m.d(listX, "find(...)");
        c.a aVarY = new c.a(a6Var.x3()).y(R.string.preset);
        Context contextX3 = a6Var.x3();
        rd.m.d(contextX3, "requireContext(...)");
        androidx.appcompat.app.c cVarA = aVarY.c(new b(a6Var, contextX3, listX), new DialogInterface.OnClickListener() { // from class: s4.p5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                a6.d5(dialogInterface, i10);
            }
        }).m(android.R.string.cancel, null).r(new DialogInterface.OnDismissListener() { // from class: s4.q5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                a6.e5(this.f26675a, dialogInterface);
            }
        }).a();
        rd.m.d(cVarA, "create(...)");
        a6Var.i5(cVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e5(a6 a6Var, DialogInterface dialogInterface) {
        a6Var.i5(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f5() {
        Satellite satelliteM5 = m5(true);
        if (satelliteM5 == null) {
            return;
        }
        g5(satelliteM5);
        com.dw.ht.satellite.b.f6691a.N(satelliteM5);
        androidx.fragment.app.p pVarE1 = e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
    }

    private final void g5(Satellite satellite) {
        this.satellite = satellite;
        this.oriSatellite = Satellite.b(satellite, 0L, null, 0, null, null, false, false, null, 0, 0, null, null, 0, 0, 0, 0L, 65535, null);
        this.txSubAudio = satellite.getTxSubAudio();
        this.rxSubAudio = satellite.getRxSubAudio();
        this.tle = satellite.o();
    }

    private final void j5() {
        m4.e1 e1Var = this.binding;
        if (e1Var == null) {
            return;
        }
        QueryBuilder queryBuilderQ = com.dw.ht.j0.f6341a.o().q();
        rd.m.d(queryBuilderQ, "query(...)");
        io.objectbox.e eVar = com.dw.ht.entitys.g.f5800g;
        rd.m.d(eVar, "noradCatID");
        QueryBuilder queryBuilderE = queryBuilderQ.e(eVar, this.inShowId);
        rd.m.d(queryBuilderE, "equal(property, value.toLong())");
        if (queryBuilderE.h(com.dw.ht.entitys.g.f5799f).a().count() == 0) {
            e1Var.f21104e.setVisibility(8);
        } else {
            e1Var.f21104e.setVisibility(0);
        }
    }

    private final void k5(boolean all) {
        int i10;
        int i11;
        m4.e1 e1Var = this.binding;
        if (e1Var == null) {
            return;
        }
        Satellite satellite = this.satellite;
        a.d txModulation = satellite.getTxModulation();
        a.d dVar = a.d.FM;
        this.showModulation = (txModulation == dVar && satellite.getRxModulation() == dVar && !Cfg.P()) ? false : true;
        e1Var.f21110k.setDetail(w4.b.f(satellite.s(), this.showModulation, true, false, null, 12, null));
        e1Var.f21106g.setDetail(w4.b.f(satellite.j(), this.showModulation, true, false, null, 12, null));
        e1Var.f21105f.setRightText(satellite.getRfConfigName());
        int iM = d5.a.M(this.rxSubAudio);
        if (iM > 0) {
            iM++;
        }
        if (iM == 0 && (i11 = this.rxSubAudio) != 0) {
            iM++;
            e1Var.f21107h.setDisplayedValues(P4(i11));
        }
        e1Var.f21107h.setNumber(iM);
        int iM2 = d5.a.M(this.txSubAudio);
        if (iM2 > 0) {
            iM2++;
        }
        if (iM2 == 0 && (i10 = this.txSubAudio) != 0) {
            iM2++;
            e1Var.f21111l.setDisplayedValues(P4(i10));
        }
        e1Var.f21111l.setNumber(iM2);
        e1Var.f21102c.setNumber(satellite.getBandwidth() == 12500 ? 1 : 0);
        if (all) {
            e1Var.f21108i.setDetail(satellite.getName());
            if (this.inShowId != satellite.getNoradCatID()) {
                this.inShowId = satellite.getNoradCatID();
                j5();
            }
        }
    }

    static /* synthetic */ void l5(a6 a6Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        a6Var.k5(z10);
    }

    @Override // com.dw.android.widget.NumberPreferenceView.b
    public /* synthetic */ void B0(NumberPreferenceView numberPreferenceView, int i10, boolean z10) {
        u3.p.a(this, numberPreferenceView, i10, z10);
    }

    @Override // v3.v, androidx.fragment.app.o
    public void H2() {
        super.H2();
        mi.c.e().t(this);
    }

    @Override // v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        mi.c.e().q(this);
    }

    @Override // v3.v, androidx.fragment.app.o
    public void N2(Bundle outState) {
        rd.m.e(outState, "outState");
        super.N2(outState);
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        l5(this, false, 1, null);
        androidx.fragment.app.p pVarV3 = v3();
        rd.m.d(pVarV3, "requireActivity(...)");
        pVarV3.addMenuProvider(new c(), U1(), m.b.f2655e);
    }

    @Override // v3.v
    protected boolean c4() {
        Satellite satelliteM5 = m5(false);
        if (rd.m.a(this.oriSatellite, satelliteM5)) {
            return false;
        }
        s3.b.b("SatelliteEditorFragment", satelliteM5 + " != " + this.oriSatellite);
        new c.a(x3()).k(N1(R.string.saveChangesQ)).p(N1(android.R.string.cancel), null).t(R.string.save, new DialogInterface.OnClickListener() { // from class: s4.w5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                a6.V4(this.f26826a, dialogInterface, i10);
            }
        }).n(N1(R.string.discard), new DialogInterface.OnClickListener() { // from class: s4.x5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                a6.W4(this.f26847a, dialogInterface, i10);
            }
        }).C();
        return true;
    }

    @Override // v3.v
    protected boolean f4(androidx.fragment.app.o sender, int what, int arg1, int arg2, Object obj) {
        ListItemView listItemView;
        ListItemView listItemView2;
        t7 t7Var;
        String strP1;
        if ((sender instanceof t7) && (strP1 = (t7Var = (t7) sender).P1()) != null) {
            int iHashCode = strP1.hashCode();
            if (iHashCode != -603687330) {
                if (iHashCode == -345521892 && strP1.equals("tx_sub_audio")) {
                    this.txSubAudio = td.a.b(t7Var.v4() * 100);
                    k5(false);
                    return true;
                }
            } else if (strP1.equals("rx_sub_audio")) {
                this.rxSubAudio = td.a.b(t7Var.v4() * 100);
                k5(false);
                return true;
            }
        }
        if ((sender instanceof v3.q) && arg1 == -1) {
            rd.m.c(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            String strP12 = ((v3.q) sender).P1();
            if (strP12 != null) {
                int iHashCode2 = strP12.hashCode();
                if (iHashCode2 != 114925) {
                    if (iHashCode2 != 110371416) {
                        if (iHashCode2 == 270386962 && strP12.equals("new_rf_cfg_name")) {
                            Satellite satelliteM5 = m5(true);
                            if (satelliteM5 == null) {
                                return true;
                            }
                            com.dw.ht.j0.f6341a.o().n(new SatelliteRadioConfiguration(0L, str, satelliteM5.getNoradCatID(), satelliteM5.getRxFreq(), satelliteM5.getTxFreq(), satelliteM5.getRxSubAudio(), satelliteM5.getTxSubAudio(), satelliteM5.getRxModulation(), satelliteM5.getTxModulation(), satelliteM5.getBandwidth(), true, 1, null));
                            j5();
                            return true;
                        }
                    } else if (strP12.equals("title")) {
                        this.satellite.y(str);
                        m4.e1 e1Var = this.binding;
                        if (e1Var != null && (listItemView2 = e1Var.f21108i) != null) {
                            listItemView2.setDetail(str);
                        }
                        return true;
                    }
                } else if (strP12.equals("tle")) {
                    this.tle = str;
                    if (rg.q.e0(this.satellite.getName())) {
                        int length = str.length() - 1;
                        int i10 = 0;
                        boolean z10 = false;
                        while (i10 <= length) {
                            boolean z11 = rd.m.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
                            if (z10) {
                                if (!z11) {
                                    break;
                                }
                                length--;
                            } else if (z11) {
                                i10++;
                            } else {
                                z10 = true;
                            }
                        }
                        List listC0 = rg.q.C0(str.subSequence(i10, length + 1).toString(), new String[]{"\n"}, false, 0, 6, null);
                        if (listC0.size() == 3) {
                            this.satellite.y(rg.q.v0((String) listC0.get(0), "0 "));
                            m4.e1 e1Var2 = this.binding;
                            if (e1Var2 != null && (listItemView = e1Var2.f21108i) != null) {
                                listItemView.setDetail(this.satellite.getName());
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return super.f4(sender, what, arg1, arg2, obj);
    }

    public final void h5(SatelliteRadioConfiguration cfg) {
        rd.m.e(cfg, "cfg");
        this.txSubAudio = cfg.getUplinkSubAudio();
        this.rxSubAudio = cfg.getDownlinkSubAudio();
        this.satellite.M(cfg, true);
        k5(false);
    }

    public final void i5(androidx.appcompat.app.c cVar) {
        androidx.appcompat.app.c cVar2 = this.satelliteRadioConfigurationDialog;
        if (cVar2 != null) {
            cVar2.dismiss();
        }
        if (cVar != null) {
            cVar.show();
        }
        this.satelliteRadioConfigurationDialog = cVar;
    }

    public final Satellite m5(boolean showMessage) {
        boolean zG;
        v4.d0 d0Var;
        v4.d0 d0Var2;
        m4.e1 e1Var = this.binding;
        if (e1Var == null) {
            return null;
        }
        a.d rxModulation = this.satellite.getRxModulation();
        a.d txModulation = this.satellite.getTxModulation();
        int rxFreq = this.satellite.getRxFreq();
        int txFreq = this.satellite.getTxFreq();
        if (rxFreq != 0 && (d0Var2 = this.rxFreqRange) != null) {
            rd.m.b(d0Var2);
            if (!d0Var2.m(rxFreq, rxModulation)) {
                e1Var.f21106g.requestFocus();
                if (showMessage) {
                    c.a aVarY = new c.a(x3()).y(R.string.err_rxFreqRange);
                    v4.d0 d0Var3 = this.rxFreqRange;
                    rd.m.b(d0Var3);
                    aVarY.k(d0Var3.toString()).m(android.R.string.ok, null).C();
                }
                return null;
            }
        }
        if (txFreq != 0 && (d0Var = this.txFreqRange) != null) {
            rd.m.b(d0Var);
            if (!d0Var.m(txFreq, txModulation)) {
                e1Var.f21110k.requestFocus();
                if (showMessage) {
                    c.a aVarY2 = new c.a(x3()).y(R.string.err_txFreqRange);
                    v4.d0 d0Var4 = this.txFreqRange;
                    rd.m.b(d0Var4);
                    aVarY2.k(d0Var4.toString()).m(android.R.string.ok, null).C();
                }
                return null;
            }
        }
        if (rxFreq < 0 || txFreq < 0) {
            return null;
        }
        Satellite satelliteB = Satellite.b(this.satellite, 0L, null, 0, null, null, false, false, null, 0, 0, null, null, 0, 0, 0, 0L, 65535, null);
        satelliteB.B(rxFreq);
        satelliteB.I(txFreq);
        satelliteB.C(rxModulation);
        satelliteB.J(txModulation);
        String str = this.tle;
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = rd.m.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        List listC0 = rg.q.C0(str.subSequence(i10, length + 1).toString(), new String[]{"\n"}, false, 0, 6, null);
        int size = listC0.size();
        if (size == 2) {
            satelliteB.G((String) listC0.get(0));
            satelliteB.H((String) listC0.get(1));
            zG = j5.c.f18427a.g(satelliteB.getTleLine1(), satelliteB.getTleLine2());
        } else if (size != 3) {
            zG = false;
        } else {
            satelliteB.G((String) listC0.get(1));
            satelliteB.H((String) listC0.get(2));
            if (rg.q.e0(satelliteB.getName())) {
                satelliteB.y(rg.q.v0((String) listC0.get(0), "0 "));
            }
            zG = j5.c.f18427a.g(satelliteB.getTleLine1(), satelliteB.getTleLine2());
        }
        if (!zG) {
            if (showMessage) {
                Toast.makeText(k1(), R.string.tle_invalid, 1).show();
                e1Var.f21109j.performClick();
            }
            return null;
        }
        satelliteB.z(new rj.e(satelliteB.getTleLine1(), satelliteB.getTleLine2()).J());
        int number = e1Var.f21111l.getNumber();
        satelliteB.K(number != 0 ? number != 1 ? a.C0096a.f6664b[e1Var.f21111l.getNumber() - 1] : this.txSubAudio : 0);
        int number2 = e1Var.f21107h.getNumber();
        satelliteB.D(number2 != 0 ? number2 != 1 ? a.C0096a.f6664b[e1Var.f21107h.getNumber() - 1] : this.rxSubAudio : 0);
        satelliteB.w(new int[]{25000, 12500}[e1Var.f21102c.getNumber()]);
        return satelliteB;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(l5.b event) {
        rd.m.e(event, "event");
        String strB = event.b();
        if (rd.m.a(strB, "rx")) {
            this.satellite.B(event.c().intValue());
            this.satellite.C(event.a());
        } else {
            if (!rd.m.a(strB, "tx")) {
                return;
            }
            this.satellite.I(event.c().intValue());
            this.satellite.J(event.a());
        }
        k5(false);
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        int i10;
        Satellite satelliteC;
        super.r2(savedInstanceState);
        Bundle bundleI1 = i1();
        if (bundleI1 == null || (i10 = (int) bundleI1.getLong("noradCatID", -1L)) == -1 || (satelliteC = com.dw.ht.satellite.b.C(i10)) == null) {
            return;
        }
        g5(Satellite.b(satelliteC, 0L, null, 0, null, null, false, false, null, 0, 0, null, null, 0, 0, 0, 0L, 65535, null));
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        z4(this.satellite.getId() == 0 ? N1(R.string.new_satellite) : N1(R.string.edit_satellite));
        final m4.e1 e1VarC = m4.e1.c(inflater, container, false);
        rd.m.d(e1VarC, "inflate(...)");
        this.binding = e1VarC;
        String[] strArrQ4 = Q4(this, 0, 1, null);
        e1VarC.f21107h.setDisplayedValues(strArrQ4);
        e1VarC.f21107h.setOnNumberChangeListener(this);
        e1VarC.f21111l.setDisplayedValues(strArrQ4);
        e1VarC.f21111l.setOnNumberChangeListener(this);
        e1VarC.f21106g.setOnClickListener(new View.OnClickListener() { // from class: s4.o5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a6.X4(this.f26646a, view);
            }
        });
        e1VarC.f21110k.setOnClickListener(new View.OnClickListener() { // from class: s4.r5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a6.Y4(this.f26723a, view);
            }
        });
        e1VarC.f21108i.setOnClickListener(new View.OnClickListener() { // from class: s4.s5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a6.Z4(e1VarC, this, view);
            }
        });
        e1VarC.f21109j.setOnClickListener(new View.OnClickListener() { // from class: s4.t5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a6.a5(e1VarC, this, view);
            }
        });
        e1VarC.f21101b.setOnClickListener(new View.OnClickListener() { // from class: s4.u5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a6.b5(this.f26789a, view);
            }
        });
        e1VarC.f21104e.setOnClickListener(new View.OnClickListener() { // from class: s4.v5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a6.c5(this.f26813a, view);
            }
        });
        ScrollView scrollViewB = e1VarC.b();
        rd.m.d(scrollViewB, "getRoot(...)");
        return scrollViewB;
    }

    @Override // com.dw.android.widget.NumberPreferenceView.b
    public void y0(NumberPreferenceView view, int from, int to, boolean byUser) {
        rd.m.e(view, "view");
        if (byUser && to == 1) {
            int id2 = view.getId();
            if (id2 == R.id.rx_sub_audio) {
                R4(this.rxSubAudio, false);
            } else {
                if (id2 != R.id.tx_sub_audio) {
                    return;
                }
                R4(this.txSubAudio, true);
            }
        }
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T4(DialogInterface dialogInterface, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d5(DialogInterface dialogInterface, int i10) {
    }
}
