package s4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.ht.Cfg;
import com.dw.ht.fragments.DeviceFragment;
import com.facebook.stetho.websocket.CloseCodes;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0005*\u00013\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u0004R\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Ls4/v;", "Lcom/dw/ht/fragments/DeviceFragment;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Ldd/d0;", "y5", "Lv4/n0;", "link", "o0", "(Lv4/n0;)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "y2", "M2", "H2", "Lm4/t;", "P0", "Lm4/t;", "binding", "Lv4/g;", "Q0", "Lv4/g;", "v5", "()Lv4/g;", "audioLink", "", "R0", "Z", "viewCreated", "", "S0", "F", "mLastLevel", "", "T0", "I", "mInterval", "s4/v$b", "U0", "Ls4/v$b;", "updateLevel", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends DeviceFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private m4.t binding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private final v4.g audioLink;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private boolean viewCreated;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private float mLastLevel;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private final int mInterval;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private final b updateLevel;

    public static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m4.t tVar = v.this.binding;
            if (tVar != null && v.this.a2() && v.this.viewCreated && v.this.j2()) {
                float fW = v.this.getAudioLink().w();
                if (fW > v.this.mLastLevel) {
                    v.this.mLastLevel = fW;
                } else {
                    v.this.mLastLevel -= ((v.this.mLastLevel - fW) * v.this.mInterval) / CloseCodes.NORMAL_CLOSURE;
                }
                tVar.f21554c.setSecondaryProgress((int) ((v.this.mLastLevel * tVar.f21554c.getMax()) / 32767));
                tVar.f21554c.removeCallbacks(this);
                if (v.this.getAudioLink().i()) {
                    tVar.f21554c.postDelayed(this, v.this.mInterval);
                } else {
                    tVar.f21554c.setSecondaryProgress(0);
                }
            }
        }
    }

    public v() {
        v4.g gVarY1 = v4.g.y1();
        rd.m.d(gVarY1, "getInstance(...)");
        this.audioLink = gVarY1;
        this.mInterval = 100;
        this.updateLevel = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w5(v vVar, m4.t tVar, NumberPreferenceView numberPreferenceView, int i10, int i11) {
        rd.m.e(numberPreferenceView, "<unused var>");
        vVar.audioLink.B1(i11 / tVar.f21554c.getMax());
        vVar.y5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x5(v vVar, NumberPreferenceView numberPreferenceView, int i10, int i11) {
        rd.m.e(numberPreferenceView, "<unused var>");
        int i12 = i11 * 100;
        vVar.audioLink.f29947e = i12;
        Cfg.S0(i12);
        vVar.y5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y5() {
        m4.t tVar = this.binding;
        if (tVar == null) {
            return;
        }
        tVar.f21554c.setProgress((int) (r1.getMax() * this.audioLink.z1()));
        tVar.f21555d.setNumber((int) (tVar.f21554c.getMax() * this.audioLink.z1()));
        tVar.f21559h.setNumber(Cfg.R() / 100);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void H2() {
        SeekBar seekBar;
        m4.t tVar = this.binding;
        if (tVar != null && (seekBar = tVar.f21554c) != null) {
            seekBar.removeCallbacks(this.updateLevel);
        }
        super.H2();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        SeekBar seekBar;
        super.M2();
        m4.t tVar = this.binding;
        if (tVar == null || (seekBar = tVar.f21554c) == null) {
            return;
        }
        seekBar.postDelayed(this.updateLevel, 100L);
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        final m4.t tVar = this.binding;
        if (tVar == null) {
            return;
        }
        this.viewCreated = true;
        tVar.f21557f.setOnClickListener(this);
        this.audioLink.k(this);
        tVar.f21554c.setOnSeekBarChangeListener(new a());
        tVar.f21555d.setOnNumberChangeListener(new NumberPreferenceView.c() { // from class: s4.t
            @Override // com.dw.android.widget.NumberPreferenceView.c
            public final void f(NumberPreferenceView numberPreferenceView, int i10, int i11) {
                v.w5(this.f26770a, tVar, numberPreferenceView, i10, i11);
            }
        });
        tVar.f21559h.setOnNumberChangeListener(new NumberPreferenceView.c() { // from class: s4.u
            @Override // com.dw.android.widget.NumberPreferenceView.c
            public final void f(NumberPreferenceView numberPreferenceView, int i10, int i11) {
                v.x5(this.f26781a, numberPreferenceView, i10, i11);
            }
        });
        Long[] lArr = new Long[16];
        for (int i10 = 0; i10 < 16; i10++) {
            lArr[i10] = Long.valueOf(((long) i10) * 100);
        }
        NumberPreferenceView numberPreferenceView = tVar.f21559h;
        String[] strArr = new String[16];
        for (int i11 = 0; i11 < 16; i11++) {
            strArr[i11] = a6.j.b(H1(), lArr[i11].longValue(), 1000L, 60000L).toString();
        }
        numberPreferenceView.setDisplayedValues(strArr);
        tVar.f21554c.setOnTouchListener(new u3.c());
        h5(this.audioLink);
        o0(this.audioLink);
        y5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void o0(v4.n0 link) {
        rd.m.e(link, "link");
        m4.t tVar = this.binding;
        if (tVar == null) {
            return;
        }
        if (!this.audioLink.i()) {
            tVar.f21557f.setText(R.string.start_monitor);
        } else {
            tVar.f21557f.setText(R.string.stop_monitor);
            this.updateLevel.run();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        if (this.audioLink.i()) {
            this.audioLink.O(true);
        } else {
            this.audioLink.L(true);
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m4.t tVarC = m4.t.c(inflater, container, false);
        this.binding = tVarC;
        rd.m.b(tVarC);
        ConstraintLayout constraintLayoutB = tVarC.b();
        rd.m.d(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    /* JADX INFO: renamed from: v5, reason: from getter */
    public final v4.g getAudioLink() {
        return this.audioLink;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        this.viewCreated = false;
        this.audioLink.r(this);
        this.binding = null;
        super.y2();
    }

    public static final class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                v4.g audioLink = v.this.getAudioLink();
                rd.m.b(seekBar);
                audioLink.B1(i10 / seekBar.getMax());
                v.this.y5();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}
