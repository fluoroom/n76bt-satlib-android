package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.android.widget.DWSwitch;
import com.dw.android.widget.NumberPreferenceView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatingActionButton f21313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f21314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NumberPreferenceView f21315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SeekBar f21316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Switch f21317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DWSwitch f21318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Switch f21319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f21320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f21321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final NumberPreferenceView f21322k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SeekBar f21323l;

    private l1(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, ConstraintLayout constraintLayout2, NumberPreferenceView numberPreferenceView, SeekBar seekBar, Switch r62, DWSwitch dWSwitch, Switch r82, TextView textView, TextView textView2, NumberPreferenceView numberPreferenceView2, SeekBar seekBar2) {
        this.f21312a = constraintLayout;
        this.f21313b = floatingActionButton;
        this.f21314c = constraintLayout2;
        this.f21315d = numberPreferenceView;
        this.f21316e = seekBar;
        this.f21317f = r62;
        this.f21318g = dWSwitch;
        this.f21319h = r82;
        this.f21320i = textView;
        this.f21321j = textView2;
        this.f21322k = numberPreferenceView2;
        this.f21323l = seekBar2;
    }

    public static l1 a(View view) {
        int i10 = R.id.floatingActionButton;
        FloatingActionButton floatingActionButton = (FloatingActionButton) r1.a.a(view, R.id.floatingActionButton);
        if (floatingActionButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.freqNumberPreference;
            NumberPreferenceView numberPreferenceView = (NumberPreferenceView) r1.a.a(view, R.id.freqNumberPreference);
            if (numberPreferenceView != null) {
                i10 = R.id.freqSeekBar;
                SeekBar seekBar = (SeekBar) r1.a.a(view, R.id.freqSeekBar);
                if (seekBar != null) {
                    i10 = R.id.scan;
                    Switch r82 = (Switch) r1.a.a(view, R.id.scan);
                    if (r82 != null) {
                        i10 = R.id.sco;
                        DWSwitch dWSwitch = (DWSwitch) r1.a.a(view, R.id.sco);
                        if (dWSwitch != null) {
                            i10 = R.id.square_wave;
                            Switch r10 = (Switch) r1.a.a(view, R.id.square_wave);
                            if (r10 != null) {
                                i10 = R.id.textView4;
                                TextView textView = (TextView) r1.a.a(view, R.id.textView4);
                                if (textView != null) {
                                    i10 = R.id.textView5;
                                    TextView textView2 = (TextView) r1.a.a(view, R.id.textView5);
                                    if (textView2 != null) {
                                        i10 = R.id.volNumberPreference;
                                        NumberPreferenceView numberPreferenceView2 = (NumberPreferenceView) r1.a.a(view, R.id.volNumberPreference);
                                        if (numberPreferenceView2 != null) {
                                            i10 = R.id.volSeekBar;
                                            SeekBar seekBar2 = (SeekBar) r1.a.a(view, R.id.volSeekBar);
                                            if (seekBar2 != null) {
                                                return new l1(constraintLayout, floatingActionButton, constraintLayout, numberPreferenceView, seekBar, r82, dWSwitch, r10, textView, textView2, numberPreferenceView2, seekBar2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static l1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_signal_generator, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21312a;
    }
}
