package q4;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.android.widget.DWSwitch;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.ht.fragments.DeviceFragment;
import kotlin.Metadata;
import m4.l1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001QB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0016\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J+\u0010'\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010\u0006J!\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010\u0006R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010A\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010G\u001a\u00020B8\u0006X\u0086D¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR$\u0010M\u001a\u00020\u00132\u0006\u0010H\u001a\u00020\u00138B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010P\u001a\u00020\u00132\u0006\u0010H\u001a\u00020\u00138B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bN\u0010J\"\u0004\bO\u0010L¨\u0006R"}, d2 = {"Lq4/z;", "Lcom/dw/ht/fragments/DeviceFragment;", "Landroid/view/View$OnClickListener;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "<init>", "()V", "", "on", "Ldd/d0;", "z5", "(Z)V", "Landroid/widget/CompoundButton;", "buttonView", "isChecked", "onCheckedChanged", "(Landroid/widget/CompoundButton;Z)V", "Landroid/widget/SeekBar;", "seekBar", "", "progress", "fromUser", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "onStopTrackingTouch", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "w2", "Lm4/l1;", "P0", "Lm4/l1;", "binding", "Landroid/content/SharedPreferences;", "Q0", "Landroid/content/SharedPreferences;", "pref", "Landroid/content/BroadcastReceiver;", "R0", "Landroid/content/BroadcastReceiver;", "mBroadcastReceiver", "Lq4/z$a;", "S0", "Lq4/z$a;", "getSine", "()Lq4/z$a;", "setSine", "(Lq4/z$a;)V", "sine", "", "T0", "Ljava/lang/String;", "s5", "()Ljava/lang/String;", "TAG", "value", "r5", "()I", "x5", "(I)V", "freq", "t5", "y5", "vol", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends DeviceFragment implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private l1 binding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private SharedPreferences pref;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private BroadcastReceiver mBroadcastReceiver;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private a sine;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private final String TAG = "SignalGeneratorFragment";

    public static final class a extends v4.l {
        private final z3.a H;
        private final z3.b I;
        private final int J;
        private final int K;
        private boolean L;
        private boolean M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v4.l1 l1Var) {
            super(l1Var, "SineSendThread");
            rd.m.e(l1Var, "sm");
            this.H = new z3.a(32000, 1000.0d, Short.MAX_VALUE);
            this.I = new z3.b(32000, 1000.0d, Short.MAX_VALUE);
            this.J = 20;
            this.K = 5000;
        }

        @Override // v4.l
        protected int E() {
            return 0;
        }

        @Override // v4.l
        protected boolean L() {
            return true;
        }

        public final int O() {
            return (int) this.H.g();
        }

        public final void P(int i10) {
            double d10 = i10;
            this.H.i(d10);
            this.I.g(d10);
        }

        public final void Q(boolean z10) {
            this.L = z10;
        }

        public final void R(boolean z10) {
            this.M = z10;
        }

        public final void S(int i10) {
            short s10 = (short) i10;
            this.H.j(s10);
            this.I.h(s10);
        }

        @Override // v4.l
        protected int read(short[] sArr, int i10, int i11) {
            rd.m.e(sArr, "audioData");
            int i12 = i11 / 3;
            int iE = this.M ? this.I.e(sArr, i10, i12) : this.H.e(sArr, i10, i12);
            if (this.L) {
                if (O() < this.K) {
                    P(O() + 1);
                    return iE;
                }
                P(this.J);
            }
            return iE;
        }
    }

    public static final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AudioManager f24352b;

        b(AudioManager audioManager) {
            this.f24352b = audioManager;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DWSwitch dWSwitch;
            rd.m.e(context, "context");
            rd.m.e(intent, "intent");
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            if (intExtra == -1) {
                s3.b.b(z.this.getTAG(), "SCO_AUDIO_STATE_ERROR");
            } else if (intExtra == 0) {
                s3.b.b(z.this.getTAG(), "SCO_AUDIO_STATE_DISCONNECTED");
            } else if (intExtra == 1) {
                s3.b.b(z.this.getTAG(), "SCO_AUDIO_STATE_CONNECTED");
                this.f24352b.setBluetoothScoOn(true);
                s3.b.h(z.this.getTAG(), "Routing:" + this.f24352b.isBluetoothScoOn());
            } else if (intExtra == 2) {
                s3.b.b(z.this.getTAG(), "SCO_AUDIO_STATE_CONNECTING");
            }
            l1 l1Var = z.this.binding;
            if (l1Var == null || (dWSwitch = l1Var.f21318g) == null) {
                return;
            }
            dWSwitch.setChecked(this.f24352b.isBluetoothScoOn());
        }
    }

    private final int r5() {
        SeekBar seekBar;
        l1 l1Var = this.binding;
        if (l1Var == null || (seekBar = l1Var.f21316e) == null) {
            return 0;
        }
        return seekBar.getProgress();
    }

    private final int t5() {
        SeekBar seekBar;
        l1 l1Var = this.binding;
        return (((l1Var == null || (seekBar = l1Var.f21323l) == null) ? 0 : seekBar.getProgress()) * 32767) / 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u5(z zVar, NumberPreferenceView numberPreferenceView, int i10, int i11) {
        rd.m.e(numberPreferenceView, "<unused var>");
        zVar.x5(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v5(z zVar, NumberPreferenceView numberPreferenceView, int i10, int i11) {
        rd.m.e(numberPreferenceView, "<unused var>");
        zVar.y5(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w5(z zVar, CompoundButton compoundButton, boolean z10) {
        rd.m.e(compoundButton, "<unused var>");
        zVar.z5(z10);
    }

    private final void x5(int i10) {
        l1 l1Var = this.binding;
        if (l1Var == null) {
            return;
        }
        l1Var.f21315d.setNumber(i10);
        l1Var.f21316e.setProgress(i10);
        a aVar = this.sine;
        if (aVar == null) {
            return;
        }
        aVar.P(i10);
    }

    private final void y5(int i10) {
        l1 l1Var = this.binding;
        if (l1Var == null) {
            return;
        }
        l1Var.f21322k.setNumber(i10);
        l1Var.f21323l.setProgress(i10);
        a aVar = this.sine;
        if (aVar == null) {
            return;
        }
        aVar.S((i10 * 32767) / 100);
    }

    private final void z5(boolean on) {
        BluetoothAdapter defaultAdapter;
        l1 l1Var = this.binding;
        if (l1Var == null || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
            return;
        }
        if (2 != defaultAdapter.getProfileConnectionState(1)) {
            l1Var.f21318g.setChecked(false);
            return;
        }
        Context contextK1 = k1();
        Object systemService = contextK1 != null ? contextK1.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null || !audioManager.isBluetoothScoAvailableOffCall()) {
            l1Var.f21318g.setChecked(false);
            return;
        }
        if (this.mBroadcastReceiver == null) {
            this.mBroadcastReceiver = new b(audioManager);
            b0.b.j(x3(), this.mBroadcastReceiver, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
        }
        if (on) {
            audioManager.startBluetoothSco();
        } else {
            audioManager.stopBluetoothSco();
        }
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        l1 l1Var = this.binding;
        if (l1Var == null) {
            return;
        }
        z4("信号发生器");
        l1Var.f21323l.setOnSeekBarChangeListener(this);
        l1Var.f21316e.setOnSeekBarChangeListener(this);
        l1Var.f21313b.setOnClickListener(this);
        l1Var.f21317f.setOnCheckedChangeListener(this);
        l1Var.f21319h.setOnCheckedChangeListener(this);
        NumberPreferenceView numberPreferenceView = l1Var.f21315d;
        SharedPreferences sharedPreferences = this.pref;
        if (sharedPreferences == null) {
            rd.m.o("pref");
            sharedPreferences = null;
        }
        numberPreferenceView.setNumber(sharedPreferences.getInt("SignalGenerator.freq", numberPreferenceView.getNumber()));
        numberPreferenceView.setOnNumberChangeListener(new NumberPreferenceView.c() { // from class: q4.w
            @Override // com.dw.android.widget.NumberPreferenceView.c
            public final void f(NumberPreferenceView numberPreferenceView2, int i10, int i11) {
                z.u5(this.f24348a, numberPreferenceView2, i10, i11);
            }
        });
        NumberPreferenceView numberPreferenceView2 = l1Var.f21322k;
        SharedPreferences sharedPreferences2 = this.pref;
        if (sharedPreferences2 == null) {
            rd.m.o("pref");
            sharedPreferences2 = null;
        }
        numberPreferenceView2.setNumber(sharedPreferences2.getInt("SignalGenerator.vol", numberPreferenceView2.getNumber()));
        numberPreferenceView2.setOnNumberChangeListener(new NumberPreferenceView.c() { // from class: q4.x
            @Override // com.dw.android.widget.NumberPreferenceView.c
            public final void f(NumberPreferenceView numberPreferenceView3, int i10, int i11) {
                z.v5(this.f24349a, numberPreferenceView3, i10, i11);
            }
        });
        Context contextK1 = k1();
        Object systemService = contextK1 != null ? contextK1.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        DWSwitch dWSwitch = l1Var.f21318g;
        boolean z10 = false;
        if (audioManager != null && audioManager.isBluetoothScoOn()) {
            z10 = true;
        }
        dWSwitch.setChecked(z10);
        l1Var.f21318g.setOnUserChangeCheckedListener(new CompoundButton.OnCheckedChangeListener() { // from class: q4.y
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                z.w5(this.f24350a, compoundButton, z11);
            }
        });
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        a aVar;
        rd.m.e(buttonView, "buttonView");
        int id2 = buttonView.getId();
        if (id2 != R.id.scan) {
            if (id2 == R.id.square_wave && (aVar = this.sine) != null) {
                aVar.R(isChecked);
                return;
            }
            return;
        }
        a aVar2 = this.sine;
        if (aVar2 != null) {
            aVar2.Q(isChecked);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        l1 l1Var;
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 == null || (l1Var = this.binding) == null) {
            return;
        }
        if (this.sine != null) {
            this.sine = null;
            l1VarY4.p1();
            l1Var.f21313b.setImageResource(R.drawable.ic_play_arrow_24dp);
            return;
        }
        l1VarY4.L(true);
        a aVar = new a(l1VarY4);
        aVar.P(r5());
        aVar.S(t5());
        aVar.Q(l1Var.f21317f.isChecked());
        aVar.R(l1Var.f21319h.isChecked());
        l1VarY4.m1(aVar);
        this.sine = aVar;
        l1Var.f21313b.setImageResource(R.drawable.ic_stop_24dp);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        l1 l1Var;
        if (fromUser && (l1Var = this.binding) != null) {
            if (rd.m.a(seekBar, l1Var.f21323l)) {
                y5(progress);
            } else {
                x5(progress);
            }
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(x3());
        rd.m.d(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.pref = defaultSharedPreferences;
    }

    /* JADX INFO: renamed from: s5, reason: from getter */
    public final String getTAG() {
        return this.TAG;
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        l1 l1VarC = l1.c(inflater, container, false);
        this.binding = l1VarC;
        rd.m.b(l1VarC);
        ConstraintLayout constraintLayoutB = l1VarC.b();
        rd.m.d(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void w2() {
        super.w2();
        if (this.mBroadcastReceiver != null) {
            x3().unregisterReceiver(this.mBroadcastReceiver);
        }
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
