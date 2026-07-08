package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.android.plot.PlotView;
import com.dw.android.widget.NumberPreferenceView;
import com.xw.repo.BubbleSeekBar;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BubbleSeekBar f21401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f21402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NumberPreferenceView f21403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SeekBar f21404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SeekBar f21405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CheckBox f21406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CheckBox f21407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f21408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CheckBox f21409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CheckBox f21410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinearLayout f21411l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SeekBar f21412m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PlotView f21413n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CheckBox f21414o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConstraintLayout f21415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CheckBox f21416q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CheckBox f21417r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CheckBox f21418s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f21419t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f21420u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f21421v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f21422w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final NumberPreferenceView f21423x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SeekBar f21424y;

    private p(LinearLayout linearLayout, BubbleSeekBar bubbleSeekBar, LinearLayout linearLayout2, NumberPreferenceView numberPreferenceView, SeekBar seekBar, SeekBar seekBar2, CheckBox checkBox, CheckBox checkBox2, TextView textView, CheckBox checkBox3, CheckBox checkBox4, LinearLayout linearLayout3, SeekBar seekBar3, PlotView plotView, CheckBox checkBox5, ConstraintLayout constraintLayout, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, TextView textView2, TextView textView3, TextView textView4, TextView textView5, NumberPreferenceView numberPreferenceView2, SeekBar seekBar4) {
        this.f21400a = linearLayout;
        this.f21401b = bubbleSeekBar;
        this.f21402c = linearLayout2;
        this.f21403d = numberPreferenceView;
        this.f21404e = seekBar;
        this.f21405f = seekBar2;
        this.f21406g = checkBox;
        this.f21407h = checkBox2;
        this.f21408i = textView;
        this.f21409j = checkBox3;
        this.f21410k = checkBox4;
        this.f21411l = linearLayout3;
        this.f21412m = seekBar3;
        this.f21413n = plotView;
        this.f21414o = checkBox5;
        this.f21415p = constraintLayout;
        this.f21416q = checkBox6;
        this.f21417r = checkBox7;
        this.f21418s = checkBox8;
        this.f21419t = textView2;
        this.f21420u = textView3;
        this.f21421v = textView4;
        this.f21422w = textView5;
        this.f21423x = numberPreferenceView2;
        this.f21424y = seekBar4;
    }

    public static p a(View view) {
        int i10 = R.id.balanced;
        BubbleSeekBar bubbleSeekBar = (BubbleSeekBar) r1.a.a(view, R.id.balanced);
        if (bubbleSeekBar != null) {
            i10 = R.id.control_panel;
            LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.control_panel);
            if (linearLayout != null) {
                i10 = R.id.freqNumberPreference;
                NumberPreferenceView numberPreferenceView = (NumberPreferenceView) r1.a.a(view, R.id.freqNumberPreference);
                if (numberPreferenceView != null) {
                    i10 = R.id.freqSeekBar;
                    SeekBar seekBar = (SeekBar) r1.a.a(view, R.id.freqSeekBar);
                    if (seekBar != null) {
                        i10 = R.id.inputPhaseSeekBar;
                        SeekBar seekBar2 = (SeekBar) r1.a.a(view, R.id.inputPhaseSeekBar);
                        if (seekBar2 != null) {
                            i10 = R.id.lp;
                            CheckBox checkBox = (CheckBox) r1.a.a(view, R.id.lp);
                            if (checkBox != null) {
                                i10 = R.id.lp250;
                                CheckBox checkBox2 = (CheckBox) r1.a.a(view, R.id.lp250);
                                if (checkBox2 != null) {
                                    i10 = R.id.message;
                                    TextView textView = (TextView) r1.a.a(view, R.id.message);
                                    if (textView != null) {
                                        i10 = R.id.mode2;
                                        CheckBox checkBox3 = (CheckBox) r1.a.a(view, R.id.mode2);
                                        if (checkBox3 != null) {
                                            i10 = R.id.morse_code;
                                            CheckBox checkBox4 = (CheckBox) r1.a.a(view, R.id.morse_code);
                                            if (checkBox4 != null) {
                                                i10 = R.id.ops;
                                                LinearLayout linearLayout2 = (LinearLayout) r1.a.a(view, R.id.ops);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.phaseSeekBar;
                                                    SeekBar seekBar3 = (SeekBar) r1.a.a(view, R.id.phaseSeekBar);
                                                    if (seekBar3 != null) {
                                                        i10 = R.id.plotView;
                                                        PlotView plotView = (PlotView) r1.a.a(view, R.id.plotView);
                                                        if (plotView != null) {
                                                            i10 = R.id.ref;
                                                            CheckBox checkBox5 = (CheckBox) r1.a.a(view, R.id.ref);
                                                            if (checkBox5 != null) {
                                                                i10 = R.id.ref_waweform;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) r1.a.a(view, R.id.ref_waweform);
                                                                if (constraintLayout != null) {
                                                                    i10 = R.id.show_afsk_decode;
                                                                    CheckBox checkBox6 = (CheckBox) r1.a.a(view, R.id.show_afsk_decode);
                                                                    if (checkBox6 != null) {
                                                                        i10 = R.id.show_audio;
                                                                        CheckBox checkBox7 = (CheckBox) r1.a.a(view, R.id.show_audio);
                                                                        if (checkBox7 != null) {
                                                                            i10 = R.id.show_same_decode;
                                                                            CheckBox checkBox8 = (CheckBox) r1.a.a(view, R.id.show_same_decode);
                                                                            if (checkBox8 != null) {
                                                                                i10 = R.id.textView4;
                                                                                TextView textView2 = (TextView) r1.a.a(view, R.id.textView4);
                                                                                if (textView2 != null) {
                                                                                    i10 = R.id.textView5;
                                                                                    TextView textView3 = (TextView) r1.a.a(view, R.id.textView5);
                                                                                    if (textView3 != null) {
                                                                                        i10 = R.id.textView6;
                                                                                        TextView textView4 = (TextView) r1.a.a(view, R.id.textView6);
                                                                                        if (textView4 != null) {
                                                                                            i10 = R.id.textView7;
                                                                                            TextView textView5 = (TextView) r1.a.a(view, R.id.textView7);
                                                                                            if (textView5 != null) {
                                                                                                i10 = R.id.volNumberPreference;
                                                                                                NumberPreferenceView numberPreferenceView2 = (NumberPreferenceView) r1.a.a(view, R.id.volNumberPreference);
                                                                                                if (numberPreferenceView2 != null) {
                                                                                                    i10 = R.id.volSeekBar;
                                                                                                    SeekBar seekBar4 = (SeekBar) r1.a.a(view, R.id.volSeekBar);
                                                                                                    if (seekBar4 != null) {
                                                                                                        return new p((LinearLayout) view, bubbleSeekBar, linearLayout, numberPreferenceView, seekBar, seekBar2, checkBox, checkBox2, textView, checkBox3, checkBox4, linearLayout2, seekBar3, plotView, checkBox5, constraintLayout, checkBox6, checkBox7, checkBox8, textView2, textView3, textView4, textView5, numberPreferenceView2, seekBar4);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static p c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_analyze, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f21400a;
    }
}
