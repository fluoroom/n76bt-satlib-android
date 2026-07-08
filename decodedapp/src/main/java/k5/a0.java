package k5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.android.widget.ListItemView;
import com.dw.ht.activitys.UpdateActivity;
import com.dw.ht.fragments.DeviceFragment;
import kotlin.Metadata;
import s4.q2;
import v4.a0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u001f\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010%\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u0017\u001a\u0004\u0018\u0001048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0016\u0010:\u001a\u0004\u0018\u0001078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lk5/a0;", "Lcom/dw/ht/fragments/DeviceFragment;", "Lv4/a0$e;", "<init>", "()V", "Ldd/d0;", "F5", "u5", "G5", "H5", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/widget/ScrollView;", "x5", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/widget/ScrollView;", "y2", "Lv4/n0;", "link", "Lg3/d;", "packet", "M", "(Lv4/n0;Lg3/d;)V", "oldLink", "newLink", "d5", "(Lv4/n0;Lv4/n0;)V", "Lv4/a0;", "info", "", "vendorId", "com", "w", "(Lv4/a0;II)V", "Lm4/k0;", "P0", "Lm4/k0;", "binding", "Q0", "I", "mBatteryVoltage", "R0", "mRcBatteryLevel", "Ljava/lang/Runnable;", "S0", "Ljava/lang/Runnable;", "readBattery", "Lv4/i0;", "v5", "()Lv4/i0;", "Lv4/j0;", "w5", "()Lv4/j0;", "settings", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 extends DeviceFragment implements a0.e {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private m4.k0 binding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private int mBatteryVoltage;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private int mRcBatteryLevel = -1;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private final Runnable readBattery = new Runnable() { // from class: k5.t
        @Override // java.lang.Runnable
        public final void run() {
            a0.E5(this.f19444a);
        }
    };

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19390a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f19391b;

        static {
            int[] iArr = new int[v4.w.values().length];
            try {
                iArr[v4.w.BATTERY_VOLTAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v4.w.RC_BATTERY_LEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19390a = iArr;
            int[] iArr2 = new int[v4.v.values().length];
            try {
                iArr2[v4.v.GET_PF.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[v4.v.READ_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f19391b = iArr2;
        }
    }

    public a0() {
        i5(3);
    }

    public static final void A5(a0 a0Var, View view) {
        a0Var.u5();
    }

    public static final void B5(a0 a0Var, View view) {
        v4.a0 a0VarD;
        String strE;
        v4.n0 n0VarX4 = a0Var.X4();
        if (n0VarX4 == null || (a0VarD = n0VarX4.d()) == null || (strE = a0VarD.e()) == null) {
            return;
        }
        a0Var.O3(new Intent("android.intent.action.VIEW", Uri.parse(strE)));
    }

    public static final void C5(a0 a0Var, View view) {
        v4.a0 a0VarD;
        String strN;
        v4.n0 n0VarX4 = a0Var.X4();
        if (n0VarX4 == null || (a0VarD = n0VarX4.d()) == null || (strN = a0VarD.n()) == null) {
            return;
        }
        a0Var.O3(new Intent("android.intent.action.VIEW", Uri.parse(strN)));
    }

    public static final void D5(a0 a0Var, View view) {
        a0Var.k5(e0.class);
    }

    public static final void E5(a0 a0Var) {
        m4.k0 k0Var = a0Var.binding;
        if (k0Var != null) {
            k0Var.f21267e.removeCallbacks(a0Var.readBattery);
            v4.i0 i0VarV5 = a0Var.v5();
            if (i0VarV5 != null) {
                i0VarV5.Z(v4.w.BATTERY_LEVEL_AS_PERCENTAGE);
            }
            k0Var.f21267e.postDelayed(a0Var.readBattery, 10000L);
        }
    }

    private final void F5() {
        String string;
        String strN1;
        m4.k0 k0Var = this.binding;
        if (k0Var != null) {
            if (this.mBatteryVoltage == 0) {
                string = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((this.mBatteryVoltage / 100) / 10.0f);
                sb2.append('V');
                string = sb2.toString();
            }
            int i10 = this.mRcBatteryLevel;
            if (i10 < 0 || i10 >= 101) {
                strN1 = N1(R.string.unknown);
                rd.m.b(strN1);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.mRcBatteryLevel);
                sb3.append('%');
                strN1 = sb3.toString();
            }
            k0Var.f21267e.setText(O1(R.string.dev_status, string, strN1));
        }
    }

    private final void G5() {
        m4.k0 k0Var;
        v4.j0 j0VarW5;
        v4.n0 n0VarX4 = X4();
        if (n0VarX4 == null || (k0Var = this.binding) == null || (j0VarW5 = w5()) == null || !j0VarW5.a()) {
            return;
        }
        k0Var.f21273k.setVisibility(8);
        a0.f fVarG = n0VarX4.d().g();
        a0.f fVar = a0.f.BE1;
        if (fVarG == fVar || j0VarW5.f29907e) {
            k0Var.f21273k.setVisibility(0);
            k0Var.f21271i.setVisibility(0);
            k0Var.f21271i.setChecked(j0VarW5.f29906d);
        } else {
            k0Var.f21271i.setVisibility(8);
        }
        if (n0VarX4.d().g() != fVar && !j0VarW5.f29909g) {
            k0Var.f21275m.setVisibility(8);
            return;
        }
        k0Var.f21273k.setVisibility(0);
        k0Var.f21275m.setVisibility(0);
        k0Var.f21275m.setChecked(j0VarW5.f29908f);
    }

    private final void H5() {
        v4.n0 n0VarX4 = X4();
        m4.k0 k0Var = this.binding;
        if (n0VarX4 == null || k0Var == null) {
            return;
        }
        v4.a0 a0VarD = n0VarX4.d();
        rd.m.d(a0VarD, "getDevInformation(...)");
        int iC = a0VarD.c();
        if (iC < 0) {
            k0Var.f21267e.setVisibility(8);
        } else {
            k0Var.f21267e.setText(O1(R.string.bat_power, Integer.valueOf(iC)));
            k0Var.f21267e.setVisibility(0);
        }
        if (a0VarD.e() == null) {
            k0Var.f21264b.setVisibility(8);
        } else {
            k0Var.f21264b.setVisibility(0);
        }
        G5();
    }

    private final void u5() {
        v4.i0 i0VarV5 = v5();
        if ((i0VarV5 != null ? i0VarV5.G() : null) != null) {
            Context contextX3 = x3();
            q2.Companion companion = q2.INSTANCE;
            v4.i0 i0VarV52 = v5();
            rd.m.b(i0VarV52);
            FragmentShowActivity.i2(contextX3, "", q2.class, companion.a(i0VarV52));
        }
        Intent intent = new Intent(k1(), (Class<?>) UpdateActivity.class);
        intent.putExtra("EXTRA_BLUETOOTH_DEVICE_ADDRESS", U4());
        intent.putExtra("EXTRA_IS_HM", true);
        O3(intent);
    }

    private final v4.i0 v5() {
        v4.n0 n0VarX4 = X4();
        if (n0VarX4 instanceof v4.i0) {
            return (v4.i0) n0VarX4;
        }
        return null;
    }

    private final v4.j0 w5() {
        y1.a aVarF;
        v4.i0 i0VarV5 = v5();
        if (i0VarV5 == null || (aVarF = i0VarV5.F()) == null) {
            return null;
        }
        return aVarF.z();
    }

    public static final void y5(a0 a0Var, CompoundButton compoundButton, boolean z10) {
        y1.a aVarF;
        rd.m.e(compoundButton, "<unused var>");
        v4.j0 j0VarW5 = a0Var.w5();
        if (j0VarW5 == null || !j0VarW5.a() || j0VarW5.f29906d == z10) {
            return;
        }
        j0VarW5.f29906d = z10;
        if (z10) {
            j0VarW5.f29908f = false;
        }
        v4.i0 i0VarV5 = a0Var.v5();
        if (i0VarV5 != null && (aVarF = i0VarV5.F()) != null) {
            aVarF.N();
        }
        a0Var.G5();
    }

    public static final void z5(a0 a0Var, CompoundButton compoundButton, boolean z10) {
        y1.a aVarF;
        rd.m.e(compoundButton, "<unused var>");
        v4.j0 j0VarW5 = a0Var.w5();
        if (j0VarW5 == null || !j0VarW5.a() || j0VarW5.f29908f == z10) {
            return;
        }
        j0VarW5.f29908f = z10;
        if (z10) {
            j0VarW5.f29906d = false;
        }
        v4.i0 i0VarV5 = a0Var.v5();
        if (i0VarV5 != null && (aVarF = i0VarV5.F()) != null) {
            aVarF.N();
        }
        a0Var.G5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void M(v4.n0 link, g3.d packet) {
        m4.k0 k0Var;
        ListItemView listItemView;
        rd.m.e(link, "link");
        rd.m.e(packet, "packet");
        if (DeviceFragment.a5(packet)) {
            int i10 = a.f19391b[v4.v.d(packet.e()).ordinal()];
            if (i10 == 1) {
                w4.c[] cVarArrJ = link.j();
                if (cVarArrJ != null) {
                    if ((cVarArrJ.length == 0) || (k0Var = this.binding) == null || (listItemView = k0Var.f21272j) == null) {
                        return;
                    }
                    listItemView.setVisibility(0);
                    return;
                }
                return;
            }
            if (i10 != 2) {
                return;
            }
            int i11 = a.f19390a[v4.w.d(packet.j()).ordinal()];
            if (i11 == 1) {
                this.mBatteryVoltage = packet.k(3);
                ((v4.c0) link).x2(v4.w.RC_BATTERY_LEVEL);
                F5();
            } else {
                if (i11 != 2) {
                    return;
                }
                this.mRcBatteryLevel = packet.d(3);
                F5();
            }
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(v4.n0 oldLink, v4.n0 newLink) {
        v4.a0 a0VarD;
        v4.a0 a0VarD2;
        super.d5(oldLink, newLink);
        if (oldLink != null && (a0VarD2 = oldLink.d()) != null) {
            a0VarD2.D(null);
        }
        if (newLink != null && (a0VarD = newLink.d()) != null) {
            a0VarD.D(this);
        }
        H5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        y4(R.string.dev_settings);
    }

    @Override // v4.a0.e
    public void w(v4.a0 info2, int vendorId, int com2) {
        H5();
    }

    @Override // androidx.fragment.app.o
    /* JADX INFO: renamed from: x5 */
    public ScrollView v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m4.k0 k0VarC = m4.k0.c(inflater, container, false);
        rd.m.d(k0VarC, "inflate(...)");
        this.binding = k0VarC;
        this.readBattery.run();
        v4.n0 n0VarX4 = X4();
        if (n0VarX4 != null) {
            if (n0VarX4.j() == null) {
                n0VarX4.a(v4.v.GET_PF, new byte[0]);
            } else {
                w4.c[] cVarArrJ = n0VarX4.j();
                rd.m.b(cVarArrJ);
                if (!(cVarArrJ.length == 0)) {
                    k0VarC.f21272j.setVisibility(0);
                }
            }
            i0(n0VarX4);
            k0VarC.f21270h.setText(n0VarX4.d().l());
        }
        k0VarC.f21271i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: k5.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                a0.y5(this.f19445a, compoundButton, z10);
            }
        });
        k0VarC.f21275m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: k5.v
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                a0.z5(this.f19448a, compoundButton, z10);
            }
        });
        k0VarC.f21265c.setVisibility(8);
        k0VarC.f21269g.setOnClickListener(new View.OnClickListener() { // from class: k5.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a0.A5(this.f19451a, view);
            }
        });
        k0VarC.f21266d.setOnClickListener(new View.OnClickListener() { // from class: k5.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a0.B5(this.f19454a, view);
            }
        });
        k0VarC.f21274l.setOnClickListener(new View.OnClickListener() { // from class: k5.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a0.C5(this.f19455a, view);
            }
        });
        k0VarC.f21272j.setOnClickListener(new View.OnClickListener() { // from class: k5.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a0.D5(this.f19456a, view);
            }
        });
        F5();
        H5();
        ScrollView scrollViewB = k0VarC.b();
        rd.m.d(scrollViewB, "getRoot(...)");
        return scrollViewB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        m4.k0 k0Var = this.binding;
        if (k0Var != null) {
            k0Var.f21267e.removeCallbacks(this.readBattery);
        }
        this.binding = null;
    }
}
