package s4;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.PopupMenu;
import androidx.gridlayout.widget.GridLayout;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.activitys.UpdateActivity;
import com.dw.ht.channels.ChannelEditorFragment;
import com.dw.ht.entitys.ChannelBond;
import com.dw.ht.entitys.IIChannel;
import com.dw.ht.fragments.DeviceFragment;
import com.dw.ht.widget.ChannelButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import v4.a0;
import v4.a2;
import v4.c0;
import v4.l1;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
public class s1 extends DeviceFragment implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, n0.d, a0.e, SeekBar.OnSeekBarChangeListener, View.OnLongClickListener {
    private m4.c0 P0;
    ImageView Q0;
    Drawable T0;
    Drawable U0;
    Drawable V0;
    private int W0;
    private boolean Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private boolean f26740a1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private long f26742c1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private LayoutInflater f26744e1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private androidx.appcompat.app.c f26746g1;
    private Runnable R0 = new Runnable() { // from class: s4.k1
        @Override // java.lang.Runnable
        public final void run() {
            s1.n5(this.f26550a);
        }
    };
    private Runnable S0 = new Runnable() { // from class: s4.l1
        @Override // java.lang.Runnable
        public final void run() {
            s1.r5(this.f26560a);
        }
    };
    private PopupMenu.OnMenuItemClickListener X0 = new PopupMenu.OnMenuItemClickListener() { // from class: s4.m1
        @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return s1.q5(this.f26604a, menuItem);
        }
    };
    private int Y0 = -1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private Runnable f26741b1 = new a();

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    io.objectbox.a f26743d1 = com.dw.ht.j0.i().k(ChannelBond.class);

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f26745f1 = -1;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (s1.this.f26740a1) {
                s1.this.Z0 = false;
                s1.this.D5();
            }
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int height;
            if (s1.this.P0 == null || s1.this.P0.f21024r.getMinimumHeight() == (height = s1.this.P0.f21025s.getHeight())) {
                return;
            }
            s1.this.P0.f21024r.setMinimumHeight(height);
        }
    }

    class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v4.l1 f26749a;

        c(v4.l1 l1Var) {
            this.f26749a = l1Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f26749a.l1(Boolean.FALSE);
        }
    }

    class d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v4.l1 f26751a;

        d(v4.l1 l1Var) {
            this.f26751a = l1Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f26751a.l1(Boolean.TRUE);
        }
    }

    static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f26754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f26755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f26756d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f26757e;

        static {
            int[] iArr = new int[c0.q.values().length];
            f26757e = iArr;
            try {
                iArr[c0.q.ChannelScan.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26757e[c0.q.DoubleCh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[a2.a.values().length];
            f26756d = iArr2;
            try {
                iArr2[a2.a.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26756d[a2.a.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[l1.e.values().length];
            f26755c = iArr3;
            try {
                iArr3[l1.e.HAVE_UPDATE_FIRMWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26755c[l1.e.SETTINGS_SYNCING_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr4 = new int[v4.v.values().length];
            f26754b = iArr4;
            try {
                iArr4[v4.v.GET_VOLUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26754b[v4.v.GET_DEV_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26754b[v4.v.READ_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr5 = new int[n0.c.values().length];
            f26753a = iArr5;
            try {
                iArr5[n0.c.Connecting.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26753a[n0.c.Idle.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26753a[n0.c.Interrupted.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26753a[n0.c.ConnectionFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private void A5(v4.a0 a0Var) {
        final androidx.fragment.app.p pVarE1;
        androidx.appcompat.app.c cVar = this.f26746g1;
        if ((cVar == null || !cVar.isShowing()) && (pVarE1 = e1()) != null) {
            final v4.m2 m2VarM = a0Var.m();
            if (m2VarM.i(a0Var.k())) {
                return;
            }
            final String str = a0Var.h() + "-UpdateFirmwareShowed";
            if (Cfg.K().getInt(str, 0) == m2VarM.f29995b) {
                return;
            }
            androidx.appcompat.app.c cVarA = new c.a(pVarE1).j(R.string.remind_update).t(android.R.string.yes, new DialogInterface.OnClickListener() { // from class: s4.p1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    s1.s5(this.f26653a, pVarE1, dialogInterface, i10);
                }
            }).r(new DialogInterface.OnDismissListener() { // from class: s4.q1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f26667a.H5();
                }
            }).m(android.R.string.no, new DialogInterface.OnClickListener() { // from class: s4.r1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    s1.u5(this.f26686a, str, m2VarM, dialogInterface, i10);
                }
            }).a();
            this.f26746g1 = cVarA;
            cVarA.show();
        }
    }

    private void B5() {
        if (Cfg.O().getSimpleUI()) {
            Cfg.O().setSimpleUI(false);
            Toast.makeText(k1(), R.string.exitSimpleMode, 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D5() {
        v4.c0 c0Var;
        if (!a2() || this.P0 == null || (c0Var = (v4.c0) Y4()) == null) {
            return;
        }
        v4.k0 k0VarY = c0Var.Y();
        v4.a2 a2VarC2 = c0Var.c2();
        this.P0.F.setChecked(k0VarY.f29912a);
        this.P0.J.setChecked(k0VarY.f29918g);
        K5();
        if (k0VarY.f29916e != a2.a.Off) {
            this.P0.L.setVisibility(0);
            this.P0.M.setVisibility(0);
            F5(this.P0.L, a2VarC2.f29687b);
            F5(this.P0.M, a2VarC2.f29688c);
            int i10 = e.f26756d[k0VarY.f29916e.ordinal()];
            if (i10 == 1) {
                this.P0.L.setCompoundDrawables(this.T0, null, null, null);
                this.P0.M.setCompoundDrawables(this.U0, null, null, null);
            } else if (i10 == 2) {
                this.P0.M.setCompoundDrawables(this.T0, null, null, null);
                this.P0.L.setCompoundDrawables(this.U0, null, null, null);
            }
        } else if (k0VarY.f29917f) {
            this.P0.L.setVisibility(0);
            this.P0.M.setVisibility(0);
            if (k0VarY.f29915d) {
                int i11 = k0VarY.f29919h;
                if (i11 != a2VarC2.f29687b) {
                    this.Y0 = i11;
                    this.Z0 = true;
                }
                this.f26740a1 = false;
                this.P0.M.removeCallbacks(this.f26741b1);
            } else if (!a2VarC2.f29702q) {
                this.Z0 = false;
            } else if (this.Z0 && !this.f26740a1) {
                this.f26740a1 = true;
                this.P0.M.postDelayed(this.f26741b1, 3000L);
            }
            if (this.Z0) {
                this.P0.L.setCompoundDrawables(this.U0, null, null, null);
                this.P0.M.setCompoundDrawables(this.T0, null, null, null);
            } else {
                this.P0.L.setCompoundDrawables(this.T0, null, null, null);
                this.P0.M.setCompoundDrawables(this.V0, null, null, null);
            }
            F5(this.P0.L, a2VarC2.f29687b);
            F5(this.P0.M, this.Y0);
        } else {
            this.P0.M.setVisibility(8);
            this.P0.L.setCompoundDrawables(this.U0, null, null, null);
            F5(this.P0.L, a2VarC2.f29687b);
        }
        int iC = a2VarC2.c();
        for (int i12 = 0; i12 < this.P0.f21024r.getChildCount(); i12++) {
            ChannelButton channelButton = (ChannelButton) this.P0.f21024r.getChildAt(i12);
            channelButton.setSelected(channelButton.getIndex() == iC);
        }
    }

    private void E5(int i10) {
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 == null) {
            return;
        }
        startActivityForResult(ChannelEditorFragment.M4(x3(), l1VarY4.V(i10), Long.valueOf(l1VarY4.q()), Integer.valueOf(i10)), 1);
    }

    private void F5(TextView textView, int i10) {
        v4.c0 c0Var = (v4.c0) Y4();
        if (c0Var == null) {
            return;
        }
        v4.r rVarQ1 = c0Var.Q1(i10);
        if (rVarQ1 == null) {
            textView.setText("");
            return;
        }
        String strM = rVarQ1.m();
        if (i10 == 251) {
            strM = "VFO2";
        } else if (i10 == 252) {
            strM = "VFO1";
        }
        if (TextUtils.isEmpty(strM)) {
            textView.setText(O1(R.string.channel_and_freq, Integer.valueOf(i10 + 1), rVarQ1.o(c0Var.k2())));
            return;
        }
        textView.setText(strM + ":" + rVarQ1.o(c0Var.k2()));
    }

    private void G5(int i10) {
        ImageView imageView = this.Q0;
        if (imageView == null) {
            return;
        }
        if (-60 <= i10 && i10 <= 0) {
            imageView.setImageResource(R.drawable.ic_signal_4);
        } else if (-70 <= i10 && i10 < -60) {
            imageView.setImageResource(R.drawable.ic_signal_3);
        } else if (-80 <= i10 && i10 < -70) {
            imageView.setImageResource(R.drawable.ic_signal_2);
        } else if (-90 <= i10 && i10 < -80) {
            imageView.setImageResource(R.drawable.ic_signal_1);
        } else if (i10 < -90) {
            imageView.setImageResource(R.drawable.ic_signal_0);
        } else {
            imageView.setImageResource(R.drawable.ic_signal_unknown);
        }
        this.Q0.removeCallbacks(this.S0);
        this.Q0.postDelayed(this.S0, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H5() {
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 instanceof v4.c0) {
            v4.c0 c0Var = (v4.c0) l1VarY4;
            if (c0Var.c2().h()) {
                return;
            }
            l1VarY4.h(true);
            Cfg.K().edit().putInt(c0Var.Q.h() + "-UpdateFirmwareShowed", 0).apply();
        }
    }

    private void I5(v4.a0 a0Var) {
        int iC = a0Var.c();
        this.P0.f21032z.setImageDrawable(b0.b.d(k1(), iC < 0 ? R.drawable.ic_battery_unknown : a0Var.q() ? R.drawable.ic_battery_charging : R.drawable.ic_battery));
        this.P0.f21032z.setImageLevel(iC);
        this.P0.f21032z.removeCallbacks(this.R0);
        this.P0.f21032z.postDelayed(this.R0, 5000L);
    }

    private void J5() {
        if (a2() && this.P0 != null) {
            v4.c0 c0Var = (v4.c0) Y4();
            if (c0Var == null) {
                this.P0.f21028v.setVisibility(8);
                this.P0.f21026t.setVisibility(8);
                return;
            }
            if (C5()) {
                this.P0.D.setVisibility(8);
            } else {
                this.P0.D.setVisibility(8);
            }
            int i10 = e.f26753a[c0Var.l().ordinal()];
            if (i10 == 1) {
                this.P0.f21027u.setText(R.string.promptCancelConnection);
                this.P0.f21026t.setVisibility(0);
                this.P0.f21028v.setVisibility(8);
                return;
            }
            if (i10 == 2 || i10 == 3 || i10 == 4) {
                this.P0.f21027u.setText(R.string.connectToControlTheDevice);
                this.P0.f21026t.setVisibility(0);
                this.P0.f21028v.setVisibility(8);
                return;
            }
            this.P0.f21026t.setVisibility(8);
            this.P0.f21028v.setVisibility(0);
            c0.k[] kVarArrN1 = c0Var.N1();
            int iC = c0Var.c2().c();
            D5();
            boolean z10 = false;
            while (this.P0.f21024r.getChildCount() > kVarArrN1.length) {
                GridLayout gridLayout = this.P0.f21024r;
                gridLayout.removeViewAt(gridLayout.getChildCount() - 1);
                z10 = true;
            }
            while (this.P0.f21024r.getChildCount() < kVarArrN1.length) {
                ChannelButton channelButton = (ChannelButton) this.f26744e1.inflate(R.layout.ch_button, (ViewGroup) this.P0.f21024r, false);
                channelButton.setIndex(this.P0.f21024r.getChildCount());
                channelButton.setOnClickListener(this);
                channelButton.setOnLongClickListener(this);
                this.P0.f21024r.addView(channelButton);
                z10 = true;
            }
            int iMin = Math.min(kVarArrN1.length, this.P0.f21024r.getChildCount());
            if (z10 && d.h0.a(this.P0.f21024r)) {
                this.P0.f21024r.getLayoutParams();
            }
            boolean zI = c0Var.i();
            for (int i11 = 0; i11 < iMin; i11++) {
                c0.k kVar = kVarArrN1[i11];
                ChannelButton channelButton2 = (ChannelButton) this.P0.f21024r.getChildAt(i11);
                channelButton2.setSelected(kVar.f29791b == iC);
                channelButton2.y(kVar, c0Var.k2());
                channelButton2.x(c0Var.K1(kVar.f29791b), zI);
            }
            v4.r rVarO1 = c0Var.O1();
            this.P0.E.setChecked(rVarO1.f30073r);
            if (rVarO1.f30077v) {
                this.P0.B.setChecked(true);
            } else if (rVarO1.f30072h) {
                this.P0.f21031y.setChecked(true);
            } else {
                this.P0.A.setChecked(true);
            }
            G5(c0Var.Q.j());
            I5(c0Var.Q);
            if (c0Var.Q.S()) {
                this.P0.J.setVisibility(0);
                this.P0.I.setVisibility(0);
            } else {
                this.P0.J.setVisibility(8);
                this.P0.I.setVisibility(8);
            }
            if (c0Var.Q.T()) {
                this.P0.F.setVisibility(0);
            } else {
                this.P0.F.setVisibility(8);
            }
            if (c0Var.Q.Q()) {
                this.P0.B.setVisibility(0);
            } else {
                this.P0.B.setVisibility(8);
            }
            if (this.P0.S != null) {
                if (c0Var.Q.O()) {
                    this.P0.S.setVisibility(8);
                } else {
                    this.P0.S.setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K5() {
        v4.c0 c0Var = (v4.c0) Y4();
        if (c0Var == null || this.P0 == null) {
            return;
        }
        if (SystemClock.elapsedRealtime() - this.f26742c1 < 3000) {
            this.P0.N.post(new Runnable() { // from class: s4.n1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26614a.K5();
                }
            });
            return;
        }
        this.W0++;
        int i10 = e.f26757e[c0Var.g2().ordinal()];
        if (i10 == 1) {
            this.P0.N.setChecked(true);
        } else if (i10 != 2) {
            this.P0.Q.setChecked(true);
        } else {
            this.P0.f21030x.setChecked(true);
        }
        this.W0--;
    }

    public static /* synthetic */ void n5(s1 s1Var) {
        v4.l1 l1VarY4 = s1Var.Y4();
        if (l1VarY4 instanceof v4.c0) {
            v4.c0 c0Var = (v4.c0) l1VarY4;
            if (c0Var.d().k() >= 43) {
                c0Var.x2(v4.w.BATTERY_LEVEL_AS_PERCENTAGE);
            } else {
                c0Var.x2(v4.w.BATTERY_LEVEL);
            }
        }
    }

    public static /* synthetic */ boolean q5(s1 s1Var, MenuItem menuItem) {
        v4.l1 l1VarY4 = s1Var.Y4();
        if (l1VarY4 != null) {
            long itemId = menuItem.getItemId();
            if (itemId == 2131886480) {
                l4.a0.E4(s1Var.k1(), (v4.c0) l1VarY4);
                return true;
            }
            if (menuItem.getGroupId() == 1) {
                l1VarY4.a(v4.v.SET_REGION, (byte) itemId);
                return true;
            }
            if (menuItem.getGroupId() == 2) {
                l1VarY4.j1(itemId, -1);
                s1Var.J5();
            }
        }
        return true;
    }

    public static /* synthetic */ void r5(s1 s1Var) {
        if (s1Var.Y4() == null) {
            return;
        }
        s1Var.Y4().d().b();
    }

    public static /* synthetic */ void s5(s1 s1Var, Context context, DialogInterface dialogInterface, int i10) {
        s1Var.getClass();
        Intent intent = new Intent(context, (Class<?>) UpdateActivity.class);
        intent.putExtra("EXTRA_BLUETOOTH_DEVICE_ADDRESS", s1Var.U4());
        s1Var.O3(intent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static /* synthetic */ boolean t5(s1 s1Var, ChannelButton channelButton, View view, ChannelBond channelBond, IIChannel iIChannel, v4.c0 c0Var, MenuItem menuItem) {
        s1Var.getClass();
        switch (menuItem.getItemId()) {
            case R.id.bind_network_channel /* 2131296463 */:
                s1Var.B5();
                s1Var.f26745f1 = channelButton.getIndex();
                s1Var.startActivityForResult(u4.v.K4(view.getContext()), 2);
                return true;
            case R.id.delete /* 2131296623 */:
                c0Var.d1(channelButton.getIndex(), null);
                return true;
            case R.id.edit_channel /* 2131296699 */:
                s1Var.E5(channelButton.getIndex());
                return true;
            case R.id.sync_rf_cfg /* 2131297467 */:
                s1Var.B5();
                if (channelBond != null) {
                    channelBond.j(!menuItem.isChecked());
                    s1Var.f26743d1.n(channelBond);
                }
                return true;
            case R.id.sync_with_radio /* 2131297469 */:
                s1Var.B5();
                if (channelBond != null) {
                    if (menuItem.isChecked() || iIChannel.getIsAdmin() || iIChannel.l() == com.dw.ht.user.b.f6853a.i()) {
                        channelBond.i(!menuItem.isChecked());
                        s1Var.f26743d1.n(channelBond);
                        return true;
                    }
                    Toast.makeText(view.getContext(), R.string.requiresAdministratorPrivileges, 1).show();
                    u4.d0.n();
                    return true;
                }
                return true;
            case R.id.unbind_network_channel /* 2131297612 */:
                s1Var.B5();
                if (channelBond != null) {
                    s1Var.f26743d1.w(channelBond);
                    return true;
                }
                return true;
            default:
                return true;
        }
    }

    public static /* synthetic */ void u5(s1 s1Var, String str, v4.m2 m2Var, DialogInterface dialogInterface, int i10) {
        s1Var.getClass();
        Cfg.K().edit().putInt(str, m2Var.f29995b).apply();
        s1Var.H5();
    }

    private void z5() {
        Context contextK1;
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 == null || !l1VarY4.v0() || l1VarY4.g0() != null || (contextK1 = k1()) == null) {
            return;
        }
        new c.a(contextK1).y(R.string.syncSignalingSettings).j(R.string.sync_signaling_settings_sm).t(R.string.yes, new d(l1VarY4)).m(R.string.no, new c(l1VarY4)).C();
    }

    boolean C5() {
        BluetoothAdapter defaultAdapter;
        Set<BluetoothDevice> bondedDevices;
        if (Y4() instanceof v4.g2) {
            return true;
        }
        String strU4 = U4();
        if (TextUtils.isEmpty(strU4) || !m3.a.d() || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null || (bondedDevices = defaultAdapter.getBondedDevices()) == null) {
            return false;
        }
        Iterator<BluetoothDevice> it = bondedDevices.iterator();
        while (it.hasNext()) {
            if (it.next().getAddress().equals(strU4)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void M(v4.n0 n0Var, g3.d dVar) {
        SeekBar seekBar;
        if (DeviceFragment.a5(dVar) && e.f26754b[v4.v.d(dVar.e()).ordinal()] == 1 && (seekBar = this.P0.R) != null) {
            seekBar.setMax(dVar.d(2));
            this.P0.R.setProgress(dVar.d(1));
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        J5();
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            l1VarY4.a(v4.v.GET_VOLUME, new byte[0]);
            if (l1VarY4 instanceof v4.c0) {
                A5(((v4.c0) l1VarY4).Q);
            }
        }
        z5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void N2(Bundle bundle) {
        super.N2(bundle);
        bundle.putInt("mBindNetworkChannel", this.f26745f1);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void W0(v4.n0 n0Var) {
        super.W0(n0Var);
        if (n0Var.l() == n0.c.Connected) {
            n0Var.a(v4.v.GET_VOLUME, new byte[0]);
        }
        J5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(v4.n0 n0Var, v4.n0 n0Var2) {
        super.d5(n0Var, n0Var2);
        if (n0Var instanceof v4.l1) {
            ((v4.l1) n0Var).g1(null);
        }
        if (n0Var2 instanceof v4.l1) {
            ((v4.l1) n0Var2).g1(this);
            n0Var2.a(v4.v.GET_VOLUME, new byte[0]);
        }
        J5();
        z5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void i0(v4.n0 n0Var) {
        super.i0(n0Var);
        J5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void j0(v4.n0 n0Var, v4.k0 k0Var, v4.k0 k0Var2) {
        D5();
    }

    @Override // androidx.fragment.app.o
    public void m2(int i10, int i11, Intent intent) {
        v4.l1 l1VarY4;
        if (i11 == -1) {
            if (i10 == 1) {
                v4.l1 l1VarY42 = Y4();
                if (l1VarY42 == null) {
                    return;
                }
                int intExtra = intent.getIntExtra("android.intent.extra.INDEX", 0);
                if (intent.getData() == null) {
                    l1VarY42.d1(intExtra, null);
                    return;
                }
                d5.a aVar = (d5.a) intent.getParcelableExtra("channel");
                if (aVar == null) {
                    return;
                }
                l1VarY42.d1(intExtra, aVar);
                return;
            }
            if (i10 == 2) {
                if (this.f26745f1 < 0) {
                    return;
                }
                long jJ4 = u4.v.J4(intent);
                if (jJ4 >= 0 && (l1VarY4 = Y4()) != null) {
                    this.f26743d1.n(new ChannelBond(0L, jJ4, l1VarY4.q(), this.f26745f1, false, true, l1VarY4.Y().f29924m));
                    return;
                }
                return;
            }
        }
        super.m2(i10, i11, intent);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void o0(v4.n0 n0Var) {
        m4.c0 c0Var;
        super.o0(n0Var);
        if (a2() && (c0Var = this.P0) != null) {
            GridLayout gridLayout = c0Var.f21024r;
            boolean zI = n0Var.i();
            for (int i10 = 0; i10 < gridLayout.getChildCount(); i10++) {
                ((ChannelButton) gridLayout.getChildAt(i10)).setAudioConnected(zI);
            }
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        v4.r rVarQ1;
        v4.r rVar;
        v4.c0 c0Var = (v4.c0) Y4();
        if (c0Var == null) {
            return;
        }
        v4.a2 a2VarC2 = c0Var.c2();
        switch (compoundButton.getId()) {
            case R.id.double_ch /* 2131296665 */:
                if (this.W0 > 0 || !z10) {
                    return;
                }
                if (z10) {
                    this.P0.J.setChecked(false);
                }
                this.f26742c1 = SystemClock.elapsedRealtime();
                c0Var.L2(c0.q.DoubleCh);
                return;
            case R.id.on_off /* 2131297121 */:
                c0Var.a(v4.v.SET_HT_ON_OFF, this.P0.F.isChecked() ? (byte) 1 : (byte) 0);
                break;
            case R.id.radio_switch /* 2131297241 */:
                if (!z10) {
                    c0Var.a(v4.v.RADIO_SET_MODE, 0);
                } else {
                    c0Var.a(v4.v.RADIO_SET_MODE, 2);
                }
                break;
            case R.id.scan /* 2131297312 */:
                if (this.W0 > 0 || !z10) {
                    return;
                }
                if (z10) {
                    this.P0.J.setChecked(false);
                }
                this.f26742c1 = SystemClock.elapsedRealtime();
                c0Var.L2(c0.q.ChannelScan);
                return;
            case R.id.single_ch /* 2131297393 */:
                if (this.W0 > 0 || !z10) {
                    return;
                }
                this.f26742c1 = SystemClock.elapsedRealtime();
                c0Var.L2(c0.q.SingleCh);
        }
        if (c0Var.j2()) {
            int iC = a2VarC2.c();
            try {
                rVarQ1 = c0Var.Q1(iC);
            } catch (CloneNotSupportedException unused) {
                rVarQ1 = null;
            }
            if (rVarQ1 == null) {
                return;
            }
            try {
                rVar = (v4.r) rVarQ1.clone();
            } catch (CloneNotSupportedException unused2) {
                rVar = rVarQ1;
            }
            if (rVar == null) {
                return;
            }
            switch (compoundButton.getId()) {
                case R.id.high_power /* 2131296832 */:
                    if (z10 && rVar.F(0)) {
                        c0Var.F2(iC, rVar);
                    }
                    break;
                case R.id.low_power /* 2131296945 */:
                    if (z10 && rVar.F(-1)) {
                        c0Var.F2(iC, rVar);
                    }
                    break;
                case R.id.medium_power /* 2131296990 */:
                    if (z10 && rVar.F(-2)) {
                        c0Var.F2(iC, rVar);
                    }
                    break;
                case R.id.offline /* 2131297116 */:
                    if (rVar.f30073r != z10) {
                        rVar.f30073r = z10;
                        c0Var.F2(iC, rVar);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        v4.l1 l1VarY4 = Y4();
        v4.c0 c0VarW4 = W4();
        switch (view.getId()) {
            case R.id.connect /* 2131296571 */:
                if (l1VarY4 != null) {
                    if (l1VarY4.l() == n0.c.Connecting) {
                        l1VarY4.h(true);
                        return;
                    } else {
                        l1VarY4.v(true);
                        return;
                    }
                }
                return;
            case R.id.disconnect /* 2131296657 */:
                if (Y4() != null) {
                    Y4().h(true);
                }
                break;
            case R.id.radio /* 2131297239 */:
                k5(n5.class);
                break;
            case R.id.region /* 2131297249 */:
                PopupMenu popupMenu = new PopupMenu(k1(), this.P0.K);
                ArrayList arrayListR = d5.e.r();
                Menu menu = popupMenu.getMenu();
                for (int i10 = 0; i10 < arrayListR.size(); i10++) {
                    d5.e eVar = (d5.e) arrayListR.get(i10);
                    menu.add(2, (int) eVar.b(), 0, eVar.n(k1()));
                }
                if (c0VarW4 != null && c0VarW4.Q.i() > 1) {
                    SubMenu subMenuAddSubMenu = menu.addSubMenu(R.string.switchDeviceRegion);
                    int i11 = c0VarW4.Q.i();
                    int i12 = 0;
                    while (i12 < i11) {
                        subMenuAddSubMenu.add(1, i12, 0, c0VarW4.Z1(i12)).setChecked(c0VarW4.Y().f29924m == i12);
                        i12++;
                    }
                    subMenuAddSubMenu.setGroupCheckable(1, true, true);
                }
                menu.add(0, R.string.importDeviceChannels, 0, R.string.importDeviceChannels);
                popupMenu.setOnMenuItemClickListener(this.X0);
                popupMenu.show();
                break;
            case R.id.rx_freq_a /* 2131297289 */:
                if (l1VarY4 != null && this.P0.f21030x.isChecked()) {
                    l1VarY4.h1(a2.a.A);
                    J5();
                }
                break;
            case R.id.rx_freq_b /* 2131297290 */:
                if (l1VarY4 != null && this.P0.f21030x.isChecked()) {
                    l1VarY4.h1(a2.a.B);
                    J5();
                }
                break;
            case R.id.settings /* 2131297370 */:
                com.dw.ht.o.d().h().e(k1(), V4());
                return;
        }
        if (l1VarY4 == null || !(view instanceof ChannelButton)) {
            return;
        }
        ChannelButton channelButton = (ChannelButton) view;
        d5.a aVarV = l1VarY4.V(channelButton.getIndex());
        if (aVarV == null || aVarV.f10574h == 0) {
            return;
        }
        l1VarY4.f1(channelButton.getIndex());
        J5();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(final View view) {
        final ChannelBond channelBond;
        final IIChannel iIChannel;
        if (!(view instanceof ChannelButton)) {
            return false;
        }
        final ChannelButton channelButton = (ChannelButton) view;
        final v4.c0 c0VarW4 = W4();
        if (c0VarW4 == null) {
            return false;
        }
        if (Cfg.f5484e || c0VarW4.Q.P() || channelButton.getIndex() >= c0VarW4.Q.G()) {
            E5(channelButton.getIndex());
            return true;
        }
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        Menu menu = popupMenu.getMenu();
        popupMenu.getMenuInflater().inflate(R.menu.device_control_channel_pop, menu);
        ChannelBond channelBondK1 = c0VarW4.K1(channelButton.getIndex());
        if (channelBondK1 != null) {
            IIChannel iIChannelK = u4.d0.k(channelBondK1.getNetworkChannelId());
            if (iIChannelK == null) {
                this.f26743d1.w(channelBondK1);
                iIChannel = iIChannelK;
                channelBond = null;
            } else {
                iIChannel = iIChannelK;
                channelBond = channelBondK1;
            }
        } else {
            channelBond = channelBondK1;
            iIChannel = null;
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: s4.o1
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return s1.t5(this.f26638a, channelButton, view, channelBond, iIChannel, c0VarW4, menuItem);
            }
        });
        if (channelBond == null) {
            menu.findItem(R.id.unbind_network_channel).setVisible(false);
            menu.findItem(R.id.sync_with_radio).setVisible(false);
            menu.findItem(R.id.sync_rf_cfg).setVisible(false);
        } else {
            menu.findItem(R.id.bind_network_channel).setVisible(false);
            menu.findItem(R.id.sync_with_radio).setChecked(channelBond.getRouting() && (iIChannel.getIsAdmin() || iIChannel.l() == com.dw.ht.user.b.f6853a.i()));
            menu.findItem(R.id.sync_rf_cfg).setChecked(channelBond.getSyncRfConfig());
        }
        if (c0VarW4.V(channelButton.getIndex()).E()) {
            menu.findItem(R.id.delete).setVisible(false);
        }
        popupMenu.show();
        return true;
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    public void onMessageEvent(l1.e eVar) {
        super.onMessageEvent(eVar);
        int i10 = e.f26755c[eVar.ordinal()];
        if (i10 == 1) {
            v4.l1 l1VarY4 = Y4();
            if (l1VarY4 == null) {
                return;
            } else {
                A5(l1VarY4.d());
            }
        } else if (i10 != 2) {
            return;
        }
        z5();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null && z10 && seekBar.getId() == R.id.vol) {
            l1VarY4.a(v4.v.SET_VOLUME, (byte) i10);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        if (bundle != null) {
            this.f26745f1 = bundle.getInt("mBindNetworkChannel", this.f26745f1);
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f26744e1 = layoutInflater;
        m4.c0 c0VarC = m4.c0.c(layoutInflater, viewGroup, false);
        this.P0 = c0VarC;
        this.Q0 = (ImageView) c0VarC.b().findViewById(R.id.iv_signal);
        Context contextX3 = x3();
        this.T0 = b0.b.d(contextX3, R.drawable.ic_play_arrow_24dp);
        this.U0 = b0.b.d(contextX3, R.drawable.ic_null_24dp);
        this.V0 = b0.b.d(contextX3, R.drawable.ic_scan);
        Drawable drawable = this.T0;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.T0.getIntrinsicHeight());
        Drawable drawable2 = this.U0;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.U0.getIntrinsicHeight());
        Drawable drawable3 = this.V0;
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), this.V0.getIntrinsicHeight());
        this.P0.K.setOnClickListener(this);
        this.P0.f21029w.setOnClickListener(this);
        this.P0.F.setOnUserChangeCheckedListener(this);
        this.P0.E.setOnUserChangeCheckedListener(this);
        this.P0.J.setOnUserChangeCheckedListener(this);
        this.P0.A.setOnCheckedChangeListener(this);
        this.P0.B.setOnCheckedChangeListener(this);
        this.P0.f21031y.setOnCheckedChangeListener(this);
        this.P0.N.setOnCheckedChangeListener(this);
        this.P0.f21030x.setOnCheckedChangeListener(this);
        this.P0.Q.setOnCheckedChangeListener(this);
        this.P0.P.setOnClickListener(this);
        this.P0.f21026t.setOnClickListener(this);
        this.P0.L.setOnClickListener(this);
        this.P0.M.setOnClickListener(this);
        this.P0.I.setOnClickListener(this);
        GridLayout gridLayout = this.P0.f21024r;
        for (int i10 = 0; i10 < gridLayout.getChildCount(); i10++) {
            ChannelButton channelButton = (ChannelButton) gridLayout.getChildAt(i10);
            channelButton.setOnClickListener(this);
            channelButton.setOnLongClickListener(this);
            channelButton.setIndex(i10);
        }
        SeekBar seekBar = this.P0.R;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this);
            this.P0.R.setOnTouchListener(new u3.c());
        }
        this.P0.f21025s.getViewTreeObserver().addOnGlobalLayoutListener(new b());
        J5();
        return this.P0.b();
    }

    @Override // v4.a0.e
    public void w(v4.a0 a0Var, int i10, int i11) {
        if (a2()) {
            if (i10 == 10) {
                if (i11 != 769) {
                    return;
                }
                G5(a0Var.j());
            } else if (i10 == 2) {
                int i12 = e.f26754b[v4.v.d(i11).ordinal()];
                if (i12 == 2) {
                    A5(a0Var);
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    I5(a0Var);
                }
            }
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void w2() {
        if (Y4() != null) {
            Y4().g1(null);
        }
        super.w2();
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.P0 = null;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
