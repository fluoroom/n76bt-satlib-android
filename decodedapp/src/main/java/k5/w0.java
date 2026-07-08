package k5;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.android.widget.MultiSelectListPreferenceView;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.ht.Cfg;
import com.dw.ht.settings.PTTActionFragment;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Metadata;
import m4.k1;
import s4.e6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0006J!\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010\u0006R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00106\u001a\b\u0012\u0004\u0012\u000203028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00108\u001a\b\u0012\u0004\u0012\u000203028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00105R\u0014\u0010:\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00100R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u000203028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u00105R$\u0010B\u001a\u00020%2\u0006\u0010=\u001a\u00020%8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lk5/w0;", "Lv3/m0;", "Landroid/view/View$OnClickListener;", "Lcom/dw/android/widget/NumberPreferenceView$c;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "<init>", "()V", "Ldd/d0;", "Q4", "j5", "W4", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/dw/android/widget/NumberPreferenceView;", "", "from", "number", "f", "(Lcom/dw/android/widget/NumberPreferenceView;II)V", "v", "onClick", "(Landroid/view/View;)V", "Landroid/widget/CompoundButton;", "buttonView", "", "isChecked", "onCheckedChanged", "(Landroid/widget/CompoundButton;Z)V", "M2", "Lm4/k1;", "F0", "Lm4/k1;", "binding", "", "G0", "[I", "saveAudioDurations", "", "", "H0", "[Ljava/lang/String;", "saveAudioDurationNames", "I0", "micGainArrayNames", "J0", "micGainAdv", "K0", "micGainAdvNames", "value", "L0", "Z", "i5", "(Z)V", "micGainInAdv", "M0", "I", "mClickTimes", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w0 extends v3.m0 implements View.OnClickListener, NumberPreferenceView.c, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private k1 binding;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private String[] saveAudioDurationNames;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private String[] micGainArrayNames;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private String[] micGainAdvNames;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private boolean micGainInAdv;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private int mClickTimes;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private final int[] saveAudioDurations = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 15, 30, 60, 90, 180, 365};

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private final int[] micGainAdv = {-3, 0, 3, 6, 9, 12, 15, 18};

    public static final class a implements va.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1 f19452a;

        a(k1 k1Var) {
            this.f19452a = k1Var;
        }

        @Override // va.g
        public void a(boolean z10) {
            if (!z10) {
                this.f19452a.f21285j.setChecked(false);
            } else {
                Cfg.O().setShowFloatPTT(true);
                this.f19452a.f21285j.setChecked(true);
            }
        }
    }

    public static final class b implements va.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1 f19453a;

        b(k1 k1Var) {
            this.f19453a = k1Var;
        }

        @Override // va.g
        public void a(boolean z10) {
            if (!z10) {
                this.f19453a.f21284i.setChecked(false);
            } else {
                Cfg.O().setShowFloatIntercomStatus(true);
                this.f19453a.f21284i.setChecked(true);
            }
        }
    }

    private final void Q4() {
        k1 k1Var = this.binding;
        if (k1Var == null) {
            return;
        }
        k1Var.f21280e.setDetail("2.9.2.1(2026-01-10)");
        k1Var.f21296u.setOnClickListener(new View.OnClickListener() { // from class: k5.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w0.R4(view);
            }
        });
        k1Var.f21282g.setText("Copyright © 2018 - " + Calendar.getInstance().get(1) + " Guangzhou Benshi Technology Co., Ltd. \nAll Rights Reserved.");
        if (k1Var.b().getContext().getResources().getBoolean(R.bool.show_registration_number)) {
            k1Var.A.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R4(View view) {
        FragmentShowActivity.k2(view.getContext(), view.getContext().getString(R.string.openSourceLicense), R.raw.open_source_license, "utf-8");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S4(rd.z zVar, w0 w0Var, DialogInterface dialogInterface, int i10) {
        Cfg.f5513w = zVar.f25961a;
        Cfg.K().edit().putInt("keys.ptt", Cfg.f5513w).apply();
        w0Var.j5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U4(w0 w0Var, DialogInterface dialogInterface, int i10) {
        Cfg.f5513w = -1;
        Cfg.K().edit().putInt("keys.ptt", Cfg.f5513w).apply();
        w0Var.j5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean V4(rd.z zVar, androidx.appcompat.app.c cVar, String str, w0 w0Var, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        zVar.f25961a = i10;
        cVar.o(str + w0Var.N1(R.string.newValue) + ' ' + i10);
        return true;
    }

    private final void W4() {
        androidx.fragment.app.p pVarE1;
        if (this.mClickTimes == 0 && (pVarE1 = e1()) != null) {
            Cfg.Settings settingsO = Cfg.O();
            if (settingsO.getIgnoreAppVersionCode() != 0) {
                settingsO.setIgnoreAppVersionCode(0);
                e5.d.a(pVarE1);
            }
        }
        int i10 = this.mClickTimes + 1;
        this.mClickTimes = i10;
        if (i10 != 10) {
            if (i10 != 20) {
                return;
            }
            Cfg.t0(2);
            Toast.makeText(k1(), "Enter debug level 2", 0).show();
            return;
        }
        if (Cfg.u() == 0) {
            Cfg.t0(1);
            Toast.makeText(k1(), "Enter debug level 1", 0).show();
        } else {
            Cfg.t0(0);
            Toast.makeText(k1(), "Exit debug mode", 0).show();
            this.mClickTimes = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X4(w0 w0Var, DialogInterface dialogInterface, int i10) {
        w0Var.j5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(Cfg.Settings settings, int i10, DialogInterface dialogInterface, int i11) {
        settings.setAudioStorageDays(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z4(w0 w0Var, k1 k1Var, View view) {
        FragmentShowActivity.h2(w0Var.x3(), String.valueOf(k1Var.f21298w.getTitle()), PTTActionFragment.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a5(CompoundButton compoundButton, boolean z10) {
        rd.m.e(compoundButton, "<unused var>");
        Cfg.O().setMuteNoSave(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b5(w0 w0Var, final k1 k1Var, CompoundButton compoundButton, boolean z10) {
        rd.m.e(compoundButton, "<unused var>");
        if (z10) {
            final androidx.fragment.app.p pVarE1 = w0Var.e1();
            if (pVarE1 == null) {
                return;
            }
            if (!wa.c.a(pVarE1)) {
                new c.a(pVarE1).j(R.string.enable_floating_window_permission).t(R.string.go_to_enable, new DialogInterface.OnClickListener() { // from class: k5.k0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        w0.c5(pVarE1, k1Var, dialogInterface, i10);
                    }
                }).m(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: k5.l0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        w0.d5(k1Var, dialogInterface, i10);
                    }
                }).d(false).C();
                return;
            }
        }
        Cfg.O().setShowFloatPTT(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c5(androidx.fragment.app.p pVar, k1 k1Var, DialogInterface dialogInterface, int i10) {
        wa.c.j(pVar, new a(k1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d5(k1 k1Var, DialogInterface dialogInterface, int i10) {
        k1Var.f21285j.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e5(w0 w0Var, final k1 k1Var, CompoundButton compoundButton, boolean z10) {
        rd.m.e(compoundButton, "<unused var>");
        if (z10) {
            final androidx.fragment.app.p pVarE1 = w0Var.e1();
            if (pVarE1 == null) {
                return;
            }
            if (!wa.c.a(pVarE1)) {
                new c.a(pVarE1).j(R.string.enable_floating_window_permission).t(R.string.go_to_enable, new DialogInterface.OnClickListener() { // from class: k5.i0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        w0.f5(pVarE1, k1Var, dialogInterface, i10);
                    }
                }).m(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: k5.j0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        w0.g5(k1Var, dialogInterface, i10);
                    }
                }).d(false).C();
                return;
            }
        }
        Cfg.O().setShowFloatIntercomStatus(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f5(androidx.fragment.app.p pVar, k1 k1Var, DialogInterface dialogInterface, int i10) {
        wa.c.j(pVar, new b(k1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g5(k1 k1Var, DialogInterface dialogInterface, int i10) {
        k1Var.f21284i.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h5(MultiSelectListPreferenceView multiSelectListPreferenceView, String str) {
        rd.m.e(multiSelectListPreferenceView, "<unused var>");
        Cfg.O().setLanguage(str);
    }

    private final void i5(boolean z10) {
        this.micGainInAdv = z10;
        k1 k1Var = this.binding;
        if (k1Var == null) {
            return;
        }
        String[] strArr = null;
        if (z10) {
            NumberPreferenceView numberPreferenceView = k1Var.f21290o;
            String[] strArr2 = this.micGainAdvNames;
            if (strArr2 == null) {
                rd.m.o("micGainAdvNames");
                strArr2 = null;
            }
            numberPreferenceView.setMaxValue(strArr2.length - 1);
            String[] strArr3 = this.micGainAdvNames;
            if (strArr3 == null) {
                rd.m.o("micGainAdvNames");
            } else {
                strArr = strArr3;
            }
            numberPreferenceView.setDisplayedValues(strArr);
            return;
        }
        NumberPreferenceView numberPreferenceView2 = k1Var.f21290o;
        String[] strArr4 = this.micGainArrayNames;
        if (strArr4 == null) {
            rd.m.o("micGainArrayNames");
            strArr4 = null;
        }
        numberPreferenceView2.setMaxValue(strArr4.length - 1);
        String[] strArr5 = this.micGainArrayNames;
        if (strArr5 == null) {
            rd.m.o("micGainArrayNames");
        } else {
            strArr = strArr5;
        }
        numberPreferenceView2.setDisplayedValues(strArr);
    }

    private final void j5() {
        k1 k1Var = this.binding;
        if (k1Var == null) {
            return;
        }
        Cfg.Settings settingsO = Cfg.O();
        k1Var.f21294s.setNumber(Cfg.D);
        k1Var.f21292q.setNumber(Cfg.E);
        int iF = Cfg.F();
        int i10 = 1;
        i5(this.micGainInAdv || iF < -3 || iF > 3);
        if (this.micGainInAdv) {
            k1Var.f21290o.setNumber(d4.b.a(this.micGainAdv, iF));
        } else {
            NumberPreferenceView numberPreferenceView = k1Var.f21290o;
            if (Integer.MIN_VALUE <= iF && iF < -2) {
                i10 = 0;
            } else if (3 <= iF && iF <= Integer.MAX_VALUE) {
                i10 = 2;
            }
            numberPreferenceView.setNumber(i10);
        }
        int audioStorageDays = Cfg.O().getAudioStorageDays();
        int[] iArr = this.saveAudioDurations;
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            } else if (iArr[i11] == audioStorageDays) {
                break;
            } else {
                i11++;
            }
        }
        k1Var.C.setNumber(i11 >= 0 ? i11 : 0);
        k1Var.f21295t.setChecked(settingsO.isMuteNoSave());
        k1Var.f21287l.setChecked(Cfg.d0());
        k1Var.F.setChecked(settingsO.getSimpleUI());
        k1Var.f21286k.setChecked(settingsO.getImperialUnits());
        k1Var.f21293r.setChecked(settingsO.morseCodeAddSK);
        k1Var.f21291p.setChecked(settingsO.morseCodeAddCT);
        k1Var.D.setChecked(settingsO.getSendStartTone());
        k1Var.E.setChecked(settingsO.getSendStopTone());
        k1Var.f21285j.setChecked(settingsO.isShowFloatPTT());
        k1Var.f21284i.setChecked(settingsO.isShowFloatIntercomStatus());
        k1Var.f21283h.setNumber(Cfg.F);
        int i12 = Cfg.f5513w;
        if (i12 >= 0) {
            k1Var.f21299x.setDetail(String.valueOf(i12));
        } else {
            k1Var.f21299x.setDetail(N1(R.string.notSet));
        }
        k1Var.f21300y.setChecked(Cfg.O().getPttLock());
    }

    @Override // v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        j5();
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        final k1 k1Var = this.binding;
        if (k1Var == null) {
            return;
        }
        k1Var.H.setOnClickListener(this);
        k1Var.f21279d.setOnClickListener(this);
        k1Var.f21301z.setOnClickListener(this);
        k1Var.f21278c.setOnClickListener(this);
        k1Var.f21289n.setOnClickListener(this);
        k1Var.B.setOnClickListener(this);
        if (!com.dw.ht.satellite.b.f6691a.J()) {
            ViewParent parent = k1Var.B.getParent();
            rd.m.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(k1Var.B);
        }
        k1Var.f21281f.setOnClickListener(this);
        k1Var.G.setOnClickListener(this);
        k1Var.f21294s.setOnNumberChangeListener(this);
        k1Var.f21292q.setOnNumberChangeListener(this);
        k1Var.f21290o.setOnNumberChangeListener(this);
        k1Var.f21283h.setOnNumberChangeListener(this);
        k1Var.f21280e.setOnClickListener(this);
        k1Var.f21299x.setOnClickListener(this);
        k1Var.f21297v.setOnClickListener(this);
        k1Var.f21298w.setOnClickListener(new View.OnClickListener() { // from class: k5.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w0.Z4(this.f19442a, k1Var, view2);
            }
        });
        k1Var.f21287l.setOnUserChangeCheckedListener(this);
        k1Var.C.setOnNumberChangeListener(this);
        NumberPreferenceView numberPreferenceView = k1Var.C;
        String[] strArr = this.saveAudioDurationNames;
        String[] strArr2 = null;
        if (strArr == null) {
            rd.m.o("saveAudioDurationNames");
            strArr = null;
        }
        numberPreferenceView.setDisplayedValues(strArr);
        NumberPreferenceView numberPreferenceView2 = k1Var.C;
        String[] strArr3 = this.saveAudioDurationNames;
        if (strArr3 == null) {
            rd.m.o("saveAudioDurationNames");
        } else {
            strArr2 = strArr3;
        }
        numberPreferenceView2.setMaxValue(strArr2.length - 1);
        k1Var.F.setOnUserChangeCheckedListener(this);
        k1Var.f21286k.setOnUserChangeCheckedListener(this);
        k1Var.f21300y.setOnUserChangeCheckedListener(this);
        k1Var.f21293r.setOnUserChangeCheckedListener(this);
        k1Var.f21291p.setOnUserChangeCheckedListener(this);
        k1Var.E.setOnUserChangeCheckedListener(this);
        k1Var.D.setOnUserChangeCheckedListener(this);
        k1Var.f21295t.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: k5.t0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                w0.a5(compoundButton, z10);
            }
        });
        k1Var.f21285j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: k5.u0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                w0.b5(this.f19446a, k1Var, compoundButton, z10);
            }
        });
        k1Var.f21284i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: k5.v0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                w0.e5(this.f19449a, k1Var, compoundButton, z10);
            }
        });
        k1Var.f21288m.setValue(Cfg.O().getLanguage());
        k1Var.f21288m.setListener(new MultiSelectListPreferenceView.a() { // from class: k5.h0
            @Override // com.dw.android.widget.MultiSelectListPreferenceView.a
            public final void a(MultiSelectListPreferenceView multiSelectListPreferenceView, String str) {
                w0.h5(multiSelectListPreferenceView, str);
            }
        });
        if (!H1().getBoolean(R.bool.multilingual)) {
            k1Var.f21288m.setVisibility(8);
        }
        k1Var.f21281f.setVisibility(8);
        if ("google" == "btech") {
            k1Var.B.setVisibility(8);
        }
        if (Cfg.f5492i) {
            k1Var.f21278c.setVisibility(8);
        }
        i5(false);
        j5();
        Q4();
    }

    @Override // com.dw.android.widget.NumberPreferenceView.c
    public void f(NumberPreferenceView view, int from, int number) {
        NumberPreferenceView numberPreferenceView;
        rd.m.e(view, "view");
        switch (view.getId()) {
            case R.id.dtmf_speed /* 2131296688 */:
                Cfg.s0(number);
                break;
            case R.id.mic_gain /* 2131296999 */:
                if (this.micGainInAdv) {
                    Cfg.G0(this.micGainAdv[number]);
                    break;
                } else if (number < 3) {
                    Cfg.G0((number - 1) * 3);
                    break;
                } else {
                    i5(true);
                    j5();
                    k1 k1Var = this.binding;
                    if (k1Var != null && (numberPreferenceView = k1Var.f21290o) != null) {
                        numberPreferenceView.performClick();
                        break;
                    }
                }
                break;
            case R.id.morse_code_pitch /* 2131297022 */:
                Cfg.H0(number);
                break;
            case R.id.morse_code_speed /* 2131297025 */:
                Cfg.I0(number);
                break;
            case R.id.save_audio /* 2131297306 */:
                final Cfg.Settings settingsO = Cfg.O();
                final int i10 = this.saveAudioDurations[number];
                if (i10 > 0 && i10 < settingsO.getAudioStorageDays()) {
                    new c.a(x3()).j(R.string.prompt_deleteOldRecords).m(R.string.no, new DialogInterface.OnClickListener() { // from class: k5.q0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            w0.X4(this.f19438a, dialogInterface, i11);
                        }
                    }).t(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: k5.r0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            w0.Y4(settingsO, i10, dialogInterface, i11);
                        }
                    }).C();
                } else {
                    settingsO.setAudioStorageDays(i10);
                }
                break;
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        rd.m.e(buttonView, "buttonView");
        int id2 = buttonView.getId();
        if (id2 == R.id.keep_screen_on) {
            Cfg.E0(isChecked);
            return;
        }
        if (id2 == R.id.simple_mode) {
            Cfg.O().setSimpleUI(isChecked);
            return;
        }
        if (id2 == R.id.imperial_units) {
            Cfg.O().setImperialUnits(isChecked);
            return;
        }
        if (id2 == R.id.ptt_lock) {
            Cfg.O().setPttLock(isChecked);
            return;
        }
        if (id2 == R.id.send_start_tone) {
            Cfg.O().setSendStartTone(isChecked);
            return;
        }
        if (id2 == R.id.send_stop_tone) {
            Cfg.O().setSendStopTone(isChecked);
        } else if (id2 == R.id.morse_code_ct) {
            Cfg.O().morseCodeAddCT = isChecked;
        } else if (id2 == R.id.morse_code_sk) {
            Cfg.O().morseCodeAddSK = isChecked;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        String str;
        rd.m.e(v10, "v");
        Context context = v10.getContext();
        switch (v10.getId()) {
            case R.id.aprs_settings /* 2131296417 */:
                rd.m.b(context);
                FragmentShowActivity.h2(context, null, s4.i.class);
                break;
            case R.id.channel_manager /* 2131296541 */:
                rd.m.b(context);
                FragmentShowActivity.h2(context, null, l4.l.class);
                break;
            case R.id.check_update /* 2131296544 */:
                W4();
                break;
            case R.id.contact_us /* 2131296575 */:
                O3(new Intent("android.intent.action.VIEW", Uri.parse("http://go.benshikj.com/contact_us")));
                break;
            case R.id.map_offline /* 2131296958 */:
                rd.m.b(context);
                FragmentShowActivity.h2(context, null, c5.z.class);
                break;
            case R.id.privacy_policy /* 2131297215 */:
                O3(new Intent("android.intent.action.VIEW", Uri.parse(N1(R.string.privacy_policy_link))));
                break;
            case R.id.ptt_button /* 2131297230 */:
                final rd.z zVar = new rd.z();
                zVar.f25961a = Cfg.f5513w;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(N1(R.string.pttButtonConfigTips));
                if (zVar.f25961a > 0) {
                    str = '\n' + N1(R.string.currentValue) + ' ' + zVar.f25961a + '\n';
                } else {
                    str = "\n";
                }
                sb2.append(str);
                final String string = sb2.toString();
                final androidx.appcompat.app.c cVarA = new c.a(v10.getContext()).y(R.string.pttButton).k(string).t(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: k5.g0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        w0.S4(zVar, this, dialogInterface, i10);
                    }
                }).m(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: k5.n0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        w0.T4(dialogInterface, i10);
                    }
                }).o(R.string.clear, new DialogInterface.OnClickListener() { // from class: k5.o0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        w0.U4(this.f19431a, dialogInterface, i10);
                    }
                }).a();
                rd.m.d(cVarA, "create(...)");
                cVarA.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: k5.p0
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                        return w0.V4(zVar, cVarA, string, this, dialogInterface, i10, keyEvent);
                    }
                });
                cVarA.show();
                break;
            case R.id.region_manager /* 2131297250 */:
                rd.m.b(context);
                FragmentShowActivity.h2(context, null, l4.a0.class);
                break;
            case R.id.satelliteManager /* 2131297299 */:
                FragmentShowActivity.h2(context, null, e6.class);
                break;
            case R.id.user_manual /* 2131297632 */:
                O3(new Intent("android.intent.action.VIEW", Uri.parse("http://go.benshikj.com/user_manual")));
                break;
            case R.id.user_settings /* 2131297633 */:
                FragmentShowActivity.h2(context, null, n5.o0.class);
                break;
        }
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        Resources resources = x3().getResources();
        int[] iArr = this.saveAudioDurations;
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            arrayList.add(i11 < 0 ? N1(R.string.forever) : i11 == 0 ? N1(R.string.off) : resources.getQuantityString(R.plurals.duration_days, i11, Integer.valueOf(i11)));
        }
        this.saveAudioDurationNames = (String[]) arrayList.toArray(new String[0]);
        ArrayList arrayList2 = new ArrayList();
        String[] stringArray = resources.getStringArray(R.array.micGainArray);
        rd.m.d(stringArray, "getStringArray(...)");
        ed.q.B(arrayList2, stringArray);
        arrayList2.add(resources.getString(R.string.expand_button_title));
        this.micGainArrayNames = (String[]) arrayList2.toArray(new String[0]);
        int[] iArr2 = this.micGainAdv;
        ArrayList arrayList3 = new ArrayList(iArr2.length);
        for (int i12 : iArr2) {
            arrayList3.add(i12 > 0 ? '+' + i12 + " dB" : i12 + " dB");
        }
        this.micGainAdvNames = (String[]) arrayList3.toArray(new String[0]);
        y4(R.string.global_settings);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        k1 k1VarC = k1.c(inflater, container, false);
        this.binding = k1VarC;
        rd.m.b(k1VarC);
        ScrollView scrollViewB = k1VarC.b();
        rd.m.d(scrollViewB, "getRoot(...)");
        return scrollViewB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T4(DialogInterface dialogInterface, int i10) {
    }
}
