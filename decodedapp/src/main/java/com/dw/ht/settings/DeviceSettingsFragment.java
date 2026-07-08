package com.dw.ht.settings;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.fragment.app.p;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.android.widget.ListItemView;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.ht.activitys.UpdateActivity;
import com.dw.ht.factory.SettingsFragment;
import com.dw.ht.factory.SettingsV1Fragment;
import com.dw.ht.fragments.DeviceFragment;
import com.dw.ht.settings.DeviceSettingsFragment;
import com.xw.repo.BubbleSeekBar;
import g3.d;
import k5.e0;
import k5.s;
import kotlin.Metadata;
import l4.l;
import m4.f0;
import rd.m;
import s4.b7;
import s4.g3;
import s4.h1;
import s4.i;
import v4.a0;
import v4.a2;
import v4.c0;
import v4.l1;
import v4.n;
import v4.n0;
import v4.v;
import v4.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001fB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\bJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\bJ!\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010&\u001a\u00020\t2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00102\u001a\u00020\t2\u0006\u0010/\u001a\u00020+2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00107\u001a\u00020\t2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020$H\u0016¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u00010+2\b\u0010:\u001a\u0004\u0018\u00010+H\u0014¢\u0006\u0004\b;\u0010<J'\u0010@\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020=2\u0006\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020\"H\u0016¢\u0006\u0004\b@\u0010AJ1\u0010F\u001a\u00020\t2\b\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010#\u001a\u00020\"2\u0006\u0010E\u001a\u00020D2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\bF\u0010GJ)\u0010H\u001a\u00020\t2\b\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010#\u001a\u00020\"2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bH\u0010IJ1\u0010J\u001a\u00020\t2\b\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010#\u001a\u00020\"2\u0006\u0010E\u001a\u00020D2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\bJ\u0010GR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\u0016\u0010U\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010PR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0016\u0010e\u001a\u0004\u0018\u00010b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lcom/dw/ht/settings/DeviceSettingsFragment;", "Lcom/dw/ht/fragments/DeviceFragment;", "Landroid/view/View$OnClickListener;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Lcom/dw/android/widget/NumberPreferenceView$c;", "Lcom/xw/repo/BubbleSeekBar$k;", "<init>", "()V", "Ldd/d0;", "y5", "s5", "t5", "z5", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "v", "onClick", "(Landroid/view/View;)V", "Landroid/widget/SeekBar;", "seekBar", "", "progress", "", "fromUser", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "onStopTrackingTouch", "Lv4/n0;", "link", "i0", "(Lv4/n0;)V", "link1", "Lg3/d;", "packet", "M", "(Lv4/n0;Lg3/d;)V", "Landroid/widget/CompoundButton;", "buttonView", "isChecked", "onCheckedChanged", "(Landroid/widget/CompoundButton;Z)V", "oldLink", "newLink", "d5", "(Lv4/n0;Lv4/n0;)V", "Lcom/dw/android/widget/NumberPreferenceView;", "from", "number", "f", "(Lcom/dw/android/widget/NumberPreferenceView;II)V", "Lcom/xw/repo/BubbleSeekBar;", "bubbleSeekBar", "", "progressFloat", "J", "(Lcom/xw/repo/BubbleSeekBar;IFZ)V", "b0", "(Lcom/xw/repo/BubbleSeekBar;IF)V", "H0", "Lm4/f0;", "P0", "Lm4/f0;", "binding", "Q0", "I", "mBatteryVoltage", "R0", "mRcBatteryLevel", "S0", "doSwitchTestModeTimes", "Ljava/lang/Runnable;", "T0", "Ljava/lang/Runnable;", "clearDoSwitchTestModeTimes", "Lcom/dw/ht/settings/DeviceSettingsFragment$a;", "U0", "Lcom/dw/ht/settings/DeviceSettingsFragment$a;", "getHl", "()Lcom/dw/ht/settings/DeviceSettingsFragment$a;", "setHl", "(Lcom/dw/ht/settings/DeviceSettingsFragment$a;)V", "hl", "Lv4/c0;", "v5", "()Lv4/c0;", "bTLink", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceSettingsFragment extends DeviceFragment implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, CompoundButton.OnCheckedChangeListener, NumberPreferenceView.c, BubbleSeekBar.k {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private f0 binding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private int mBatteryVoltage;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private int doSwitchTestModeTimes;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private int mRcBatteryLevel = -1;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private final Runnable clearDoSwitchTestModeTimes = new Runnable() { // from class: k5.a
        @Override // java.lang.Runnable
        public final void run() {
            DeviceSettingsFragment.r5(this.f19389a);
        }
    };

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private a hl = a.f6721c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6719a = new a("ALL", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f6720b = new a("EN", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f6721c = new a("ZH", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f6722d = new a("RU", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f6723e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kd.a f6724f;

        static {
            a[] aVarArrA = a();
            f6723e = aVarArrA;
            f6724f = kd.b.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f6719a, f6720b, f6721c, f6722d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6723e.clone();
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f6726b;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.BATTERY_VOLTAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.RC_BATTERY_LEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6725a = iArr;
            int[] iArr2 = new int[v.values().length];
            try {
                iArr2[v.GET_PF.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[v.GET_VOLUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[v.READ_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f6726b = iArr2;
        }
    }

    public DeviceSettingsFragment() {
        i5(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r5(DeviceSettingsFragment deviceSettingsFragment) {
        deviceSettingsFragment.doSwitchTestModeTimes = 0;
    }

    private final void s5() {
        Intent intent = new Intent(k1(), (Class<?>) UpdateActivity.class);
        intent.putExtra("EXTRA_BLUETOOTH_DEVICE_ADDRESS", U4());
        O3(intent);
    }

    private final void t5() {
        final c0 c0VarV5;
        f0 f0Var = this.binding;
        if (f0Var == null || (c0VarV5 = v5()) == null || c0VarV5.Q.k() < 71) {
            return;
        }
        p pVarE1 = e1();
        this.doSwitchTestModeTimes++;
        f0Var.f21121f.removeCallbacks(this.clearDoSwitchTestModeTimes);
        f0Var.f21121f.postDelayed(this.clearDoSwitchTestModeTimes, 1000L);
        if (this.doSwitchTestModeTimes >= 10) {
            this.doSwitchTestModeTimes = 0;
            if (!c0VarV5.c2().f29710y) {
                m.b(pVarE1);
                new c.a(pVarE1).k(N1(R.string.prompt_enterFactoryTestMode)).t(R.string.yes, new DialogInterface.OnClickListener() { // from class: k5.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        DeviceSettingsFragment.u5(c0VarV5, dialogInterface, i10);
                    }
                }).m(R.string.no, null).d(false).C();
                return;
            }
            c0VarV5.c2().f29710y = false;
            c0VarV5.A2();
            c0VarV5.a(v.READ_FREQ_RANGE, new byte[0]);
            m.b(pVarE1);
            Toast.makeText(pVarE1, N1(R.string.prompt_exitFactoryTestMode), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u5(c0 c0Var, DialogInterface dialogInterface, int i10) {
        c0Var.c2().f29710y = true;
        c0Var.A2();
        c0Var.a(v.READ_FREQ_RANGE, new byte[0]);
    }

    private final c0 v5() {
        l1 l1VarY4 = Y4();
        if (l1VarY4 instanceof c0) {
            return (c0) l1VarY4;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SparseArray w5(DeviceSettingsFragment deviceSettingsFragment, int i10, SparseArray sparseArray) {
        m.e(sparseArray, "array");
        String string = deviceSettingsFragment.x3().getString(R.string.sq_monitor);
        m.d(string, "getString(...)");
        sparseArray.put(0, string);
        if (!deviceSettingsFragment.x3().getResources().getBoolean(R.bool.show_all_squelch_level_section)) {
            sparseArray.put(1, "");
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x5(DeviceSettingsFragment deviceSettingsFragment, View view) {
        deviceSettingsFragment.s5();
    }

    private final void y5() {
        String string;
        String strN1;
        f0 f0Var = this.binding;
        if (f0Var != null && a2()) {
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
                m.b(strN1);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.mRcBatteryLevel);
                sb3.append('%');
                strN1 = sb3.toString();
            }
            f0Var.f21121f.setText(O1(R.string.dev_status, string, strN1));
        }
    }

    private final void z5() {
        f0 f0Var = this.binding;
        if (f0Var == null) {
            return;
        }
        l1 l1VarY4 = Y4();
        c0 c0Var = l1VarY4 instanceof c0 ? (c0) l1VarY4 : null;
        if (c0Var == null) {
            return;
        }
        n nVar = c0Var.Q;
        if (nVar.O()) {
            f0Var.f21136u.setText(R.string.wirelessHeadsetVol);
        } else {
            f0Var.f21136u.setText(R.string.volume);
        }
        if (nVar.M()) {
            f0Var.f21123h.setVisibility(8);
        } else {
            f0Var.f21123h.setVisibility(0);
        }
        if (nVar.L()) {
            f0Var.f21128m.setVisibility(0);
        } else {
            f0Var.f21128m.setVisibility(8);
        }
        if (nVar.e() == null) {
            f0Var.f21117b.setVisibility(8);
        } else {
            f0Var.f21117b.setVisibility(0);
        }
    }

    @Override // com.xw.repo.BubbleSeekBar.k
    public void H0(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser) {
    }

    @Override // com.xw.repo.BubbleSeekBar.k
    public void J(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser) {
        c0 c0VarW4;
        if (fromUser && (c0VarW4 = W4()) != null) {
            a2 a2VarC2 = c0VarW4.c2();
            m.d(a2VarC2, "getSettings(...)");
            Integer numValueOf = bubbleSeekBar != null ? Integer.valueOf(bubbleSeekBar.getId()) : null;
            if (numValueOf != null && numValueOf.intValue() == R.id.vol) {
                c0VarW4.a(v.SET_VOLUME, (byte) progress);
            } else {
                if (numValueOf == null || numValueOf.intValue() != R.id.squelch_level || a2VarC2.f29692g == progress) {
                    return;
                }
                a2VarC2.f29692g = progress;
                c0VarW4.A2();
            }
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void M(n0 link1, d packet) {
        f0 f0Var;
        ListItemView listItemView;
        BubbleSeekBar bubbleSeekBar;
        m.e(link1, "link1");
        m.e(packet, "packet");
        if (DeviceFragment.a5(packet)) {
            int i10 = b.f6726b[v.d(packet.e()).ordinal()];
            if (i10 == 1) {
                l1 l1VarY4 = Y4();
                w4.c[] cVarArrJ = l1VarY4 != null ? l1VarY4.j() : null;
                if (cVarArrJ == null || cVarArrJ.length == 0 || (f0Var = this.binding) == null || (listItemView = f0Var.f21130o) == null) {
                    return;
                }
                listItemView.setVisibility(0);
                return;
            }
            if (i10 == 2) {
                float fD = packet.d(2);
                f0 f0Var2 = this.binding;
                if (f0Var2 != null && (bubbleSeekBar = f0Var2.f21135t) != null) {
                    if (fD != bubbleSeekBar.getMax()) {
                        bubbleSeekBar.getConfigBuilder().b(fD).a();
                    }
                    bubbleSeekBar.setProgress(packet.d(1));
                }
                l1 l1VarY42 = Y4();
                c0 c0Var = l1VarY42 instanceof c0 ? (c0) l1VarY42 : null;
                if (c0Var != null) {
                    c0Var.x2(w.BATTERY_VOLTAGE);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            int i11 = b.f6725a[w.d(packet.j()).ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    return;
                }
                this.mRcBatteryLevel = packet.d(3);
                y5();
                return;
            }
            this.mBatteryVoltage = packet.k(3);
            l1 l1VarY43 = Y4();
            c0 c0Var2 = l1VarY43 instanceof c0 ? (c0) l1VarY43 : null;
            if (c0Var2 != null) {
                c0Var2.x2(w.RC_BATTERY_LEVEL);
            }
            y5();
        }
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        m.e(view, "view");
        super.Q2(view, savedInstanceState);
        f0 f0Var = this.binding;
        if (f0Var == null) {
            return;
        }
        f0Var.f21133r.setOnProgressChangedListener(this);
        f0Var.f21133r.setCustomSectionTextArray(new BubbleSeekBar.j() { // from class: k5.b
            @Override // com.xw.repo.BubbleSeekBar.j
            public final SparseArray a(int i10, SparseArray sparseArray) {
                return DeviceSettingsFragment.w5(this.f19392a, i10, sparseArray);
            }
        });
        f0Var.f21123h.setOnNumberChangeListener(this);
        f0Var.f21128m.setOnNumberChangeListener(this);
        f0Var.f21135t.setOnProgressChangedListener(this);
        f0Var.f21119d.setOnSeekBarChangeListener(this);
        l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            if (l1VarY4.j() == null) {
                l1VarY4.a(v.GET_PF, new byte[0]);
            } else {
                w4.c[] cVarArrJ = l1VarY4.j();
                m.b(cVarArrJ);
                if (!(cVarArrJ.length == 0)) {
                    f0Var.f21130o.setVisibility(0);
                }
            }
            l1VarY4.a(v.GET_VOLUME, new byte[0]);
            i0(l1VarY4);
            f0Var.f21125j.setText(l1VarY4.d().l());
            if (l1VarY4.d().g().d()) {
                f0Var.f21123h.setTitle(R.string.external_speaker);
            }
        }
        f0Var.f21118c.setVisibility(8);
        f0Var.f21124i.setOnClickListener(new View.OnClickListener() { // from class: k5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DeviceSettingsFragment.x5(this.f19394a, view2);
            }
        });
        if ("google" == "btech") {
            f0Var.f21132q.setVisibility(8);
        }
        y5();
        z5();
    }

    @Override // com.xw.repo.BubbleSeekBar.k
    public void b0(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat) {
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(n0 oldLink, n0 newLink) {
        super.d5(oldLink, newLink);
        z5();
    }

    @Override // com.dw.android.widget.NumberPreferenceView.c
    public void f(NumberPreferenceView view, int from, int number) {
        m.e(view, "view");
        l1 l1VarY4 = Y4();
        c0 c0Var = l1VarY4 instanceof c0 ? (c0) l1VarY4 : null;
        if (c0Var == null) {
            return;
        }
        a2 a2VarC2 = c0Var.c2();
        m.d(a2VarC2, "getSettings(...)");
        switch (view.getId()) {
            case R.id.aghfp_mode /* 2131296389 */:
                if (a2VarC2.f29700o == number) {
                    return;
                } else {
                    a2VarC2.f29700o = number;
                }
                break;
            case R.id.device_speaker /* 2131296644 */:
                if (a2VarC2.f29690e == number) {
                    return;
                } else {
                    a2VarC2.f29690e = number;
                }
                break;
            case R.id.hm_speaker /* 2131296835 */:
                if (a2VarC2.f29707v == number) {
                    return;
                } else {
                    a2VarC2.f29707v = number;
                }
                break;
            case R.id.mic_gain /* 2131296999 */:
                if (a2VarC2.d() == number) {
                    return;
                } else {
                    a2VarC2.l(number);
                }
                break;
            case R.id.tx_hold_time /* 2131297600 */:
                if (a2VarC2.f29698m == number) {
                    return;
                } else {
                    a2VarC2.f29698m = number;
                }
                break;
            case R.id.tx_time_limit /* 2131297603 */:
                if (a2VarC2.f29697l == number) {
                    return;
                } else {
                    a2VarC2.f29697l = number;
                }
                break;
            default:
                return;
        }
        c0Var.A2();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void i0(n0 link) {
        c0 c0VarV5;
        m.e(link, "link");
        super.i0(link);
        f0 f0Var = this.binding;
        if (f0Var == null || (c0VarV5 = v5()) == null) {
            return;
        }
        a2 a2VarC2 = c0VarV5.c2();
        m.d(a2VarC2, "getSettings(...)");
        f0Var.f21133r.setProgress(a2VarC2.f29692g);
        f0Var.f21123h.setNumber(a2VarC2.f29690e);
        f0Var.f21128m.setNumber(a2VarC2.f29707v);
        f0Var.f21119d.setProgress(a2VarC2.f29701p);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        m.e(buttonView, "buttonView");
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null) {
            return;
        }
        c0 c0Var = (c0) l1VarY4;
        a2 a2VarC2 = c0Var.c2();
        m.d(a2VarC2, "getSettings(...)");
        switch (buttonView.getId()) {
            case R.id.audio_relay_en /* 2131296427 */:
                if (isChecked == a2VarC2.f29694i) {
                    return;
                } else {
                    a2VarC2.f29694i = isChecked;
                }
                break;
            case R.id.auto_power_on /* 2131296435 */:
                if (isChecked == a2VarC2.f29695j) {
                    return;
                } else {
                    a2VarC2.f29695j = isChecked;
                }
                break;
            case R.id.keep_aghfp_link /* 2131296900 */:
                if (isChecked == a2VarC2.f29696k) {
                    return;
                } else {
                    a2VarC2.f29696k = isChecked;
                }
                break;
            case R.id.tail_elimination /* 2131297491 */:
                if (isChecked == a2VarC2.f29693h) {
                    return;
                } else {
                    a2VarC2.f29693h = isChecked;
                }
                break;
            default:
                return;
        }
        c0Var.A2();
    }

    @Override // android.view.View.OnClickListener
    @OnClick
    @Optional
    public void onClick(View v10) {
        a0 a0VarD;
        String strE;
        a0 a0VarD2;
        String strN;
        m.e(v10, "v");
        switch (v10.getId()) {
            case R.id.advanced_device_settings /* 2131296382 */:
                c0 c0VarV5 = v5();
                m.b(c0VarV5);
                if (c0VarV5.Q.g() != a0.f.AP2) {
                    k5(SettingsFragment.class);
                } else {
                    k5(SettingsV1Fragment.class);
                }
                break;
            case R.id.aprs_settings /* 2131296417 */:
                FragmentShowActivity.h2(x3(), null, i.class);
                break;
            case R.id.channel_manager /* 2131296541 */:
                FragmentShowActivity.h2(x3(), null, l.class);
                break;
            case R.id.contact_us /* 2131296575 */:
                l1 l1VarY4 = Y4();
                if (l1VarY4 != null && (a0VarD = l1VarY4.d()) != null && (strE = a0VarD.e()) != null) {
                    O3(new Intent("android.intent.action.VIEW", Uri.parse(strE)));
                    break;
                }
                break;
            case R.id.dev_status /* 2131296640 */:
                c0 c0VarV52 = v5();
                m.b(c0VarV52);
                c0VarV52.x2(w.BATTERY_VOLTAGE);
                t5();
                break;
            case R.id.freq_scan /* 2131296787 */:
                k5(g3.class);
                break;
            case R.id.general_settings /* 2131296793 */:
                k5(s.class);
                break;
            case R.id.link_manager /* 2131296925 */:
                k5(h1.class);
                break;
            case R.id.programmable_button /* 2131297218 */:
                k5(e0.class);
                break;
            case R.id.region_manager /* 2131297250 */:
                FragmentShowActivity.h2(x3(), null, l4.a0.class);
                break;
            case R.id.signaling_settings /* 2131297389 */:
                k5(b7.class);
                break;
            case R.id.user_manual /* 2131297632 */:
                l1 l1VarY42 = Y4();
                if (l1VarY42 != null && (a0VarD2 = l1VarY42.d()) != null && (strN = a0VarD2.n()) != null) {
                    O3(new Intent("android.intent.action.VIEW", Uri.parse(strN)));
                    break;
                }
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        m.e(seekBar, "seekBar");
        if (Y4() == null || !fromUser) {
            return;
        }
        c0 c0VarV5 = v5();
        m.b(c0VarV5);
        a2 a2VarC2 = c0VarV5.c2();
        m.d(a2VarC2, "getSettings(...)");
        if (seekBar.getId() != R.id.bt_mic_gain || a2VarC2.f29701p == progress) {
            return;
        }
        a2VarC2.f29701p = progress;
        c0 c0VarV52 = v5();
        m.b(c0VarV52);
        c0VarV52.A2();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        m.e(seekBar, "seekBar");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        m.e(seekBar, "seekBar");
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        y4(R.string.dev_settings);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.e(inflater, "inflater");
        f0 f0VarC = f0.c(inflater, container, false);
        this.binding = f0VarC;
        m.b(f0VarC);
        ButterKnife.a(this, f0VarC.b());
        f0 f0Var = this.binding;
        m.b(f0Var);
        f0Var.f21132q.setOnClickListener(this);
        f0 f0Var2 = this.binding;
        m.b(f0Var2);
        ScrollView scrollViewB = f0Var2.b();
        m.d(scrollViewB, "getRoot(...)");
        return scrollViewB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }
}
