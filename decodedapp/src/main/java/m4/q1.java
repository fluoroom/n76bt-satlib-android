package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.benshikj.ht.R;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.xw.repo.BubbleSeekBar;

/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScrollView f21452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f21453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditText f21454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EditText f21455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EditText f21456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Button f21457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Button f21458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BubbleSeekBar f21459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SwitchMaterial f21460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SwitchMaterial f21461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Button f21462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Button f21463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final BubbleSeekBar f21464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Button f21465n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SwitchMaterial f21466o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SwitchMaterial f21467p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final BubbleSeekBar f21468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Button f21469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Button f21470s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Button f21471t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Button f21472u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Button f21473v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final BubbleSeekBar f21474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Button f21475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f21476y;

    private q1(ScrollView scrollView, Button button, EditText editText, EditText editText2, EditText editText3, Button button2, Button button3, BubbleSeekBar bubbleSeekBar, SwitchMaterial switchMaterial, SwitchMaterial switchMaterial2, Button button4, Button button5, BubbleSeekBar bubbleSeekBar2, Button button6, SwitchMaterial switchMaterial3, SwitchMaterial switchMaterial4, BubbleSeekBar bubbleSeekBar3, Button button7, Button button8, Button button9, Button button10, Button button11, BubbleSeekBar bubbleSeekBar4, Button button12, TextView textView) {
        this.f21452a = scrollView;
        this.f21453b = button;
        this.f21454c = editText;
        this.f21455d = editText2;
        this.f21456e = editText3;
        this.f21457f = button2;
        this.f21458g = button3;
        this.f21459h = bubbleSeekBar;
        this.f21460i = switchMaterial;
        this.f21461j = switchMaterial2;
        this.f21462k = button4;
        this.f21463l = button5;
        this.f21464m = bubbleSeekBar2;
        this.f21465n = button6;
        this.f21466o = switchMaterial3;
        this.f21467p = switchMaterial4;
        this.f21468q = bubbleSeekBar3;
        this.f21469r = button7;
        this.f21470s = button8;
        this.f21471t = button9;
        this.f21472u = button10;
        this.f21473v = button11;
        this.f21474w = bubbleSeekBar4;
        this.f21475x = button12;
        this.f21476y = textView;
    }

    public static q1 a(View view) {
        int i10 = R.id.advanced_device_settings;
        Button button = (Button) r1.a.a(view, R.id.advanced_device_settings);
        if (button != null) {
            i10 = R.id.afsk_data;
            EditText editText = (EditText) r1.a.a(view, R.id.afsk_data);
            if (editText != null) {
                i10 = R.id.afsk_max_len;
                EditText editText2 = (EditText) r1.a.a(view, R.id.afsk_max_len);
                if (editText2 != null) {
                    i10 = R.id.bearer;
                    EditText editText3 = (EditText) r1.a.a(view, R.id.bearer);
                    if (editText3 != null) {
                        i10 = R.id.clear_sessions;
                        Button button2 = (Button) r1.a.a(view, R.id.clear_sessions);
                        if (button2 != null) {
                            i10 = R.id.err_exit;
                            Button button3 = (Button) r1.a.a(view, R.id.err_exit);
                            if (button3 != null) {
                                i10 = R.id.intensity;
                                BubbleSeekBar bubbleSeekBar = (BubbleSeekBar) r1.a.a(view, R.id.intensity);
                                if (bubbleSeekBar != null) {
                                    i10 = R.id.jfTestMode;
                                    SwitchMaterial switchMaterial = (SwitchMaterial) r1.a.a(view, R.id.jfTestMode);
                                    if (switchMaterial != null) {
                                        i10 = R.id.localServer;
                                        SwitchMaterial switchMaterial2 = (SwitchMaterial) r1.a.a(view, R.id.localServer);
                                        if (switchMaterial2 != null) {
                                            i10 = R.id.logs;
                                            Button button4 = (Button) r1.a.a(view, R.id.logs);
                                            if (button4 != null) {
                                                i10 = R.id.main;
                                                Button button5 = (Button) r1.a.a(view, R.id.main);
                                                if (button5 != null) {
                                                    i10 = R.id.noiseThreshold;
                                                    BubbleSeekBar bubbleSeekBar2 = (BubbleSeekBar) r1.a.a(view, R.id.noiseThreshold);
                                                    if (bubbleSeekBar2 != null) {
                                                        i10 = R.id.open_car_tools;
                                                        Button button6 = (Button) r1.a.a(view, R.id.open_car_tools);
                                                        if (button6 != null) {
                                                            i10 = R.id.outputAGC;
                                                            SwitchMaterial switchMaterial3 = (SwitchMaterial) r1.a.a(view, R.id.outputAGC);
                                                            if (switchMaterial3 != null) {
                                                                i10 = R.id.outputNS;
                                                                SwitchMaterial switchMaterial4 = (SwitchMaterial) r1.a.a(view, R.id.outputNS);
                                                                if (switchMaterial4 != null) {
                                                                    i10 = R.id.points;
                                                                    BubbleSeekBar bubbleSeekBar3 = (BubbleSeekBar) r1.a.a(view, R.id.points);
                                                                    if (bubbleSeekBar3 != null) {
                                                                        i10 = R.id.satellite;
                                                                        Button button7 = (Button) r1.a.a(view, R.id.satellite);
                                                                        if (button7 != null) {
                                                                            i10 = R.id.send_afsk;
                                                                            Button button8 = (Button) r1.a.a(view, R.id.send_afsk);
                                                                            if (button8 != null) {
                                                                                i10 = R.id.tcall;
                                                                                Button button9 = (Button) r1.a.a(view, R.id.tcall);
                                                                                if (button9 != null) {
                                                                                    i10 = R.id.test_grpc;
                                                                                    Button button10 = (Button) r1.a.a(view, R.id.test_grpc);
                                                                                    if (button10 != null) {
                                                                                        i10 = R.id.test_mic;
                                                                                        Button button11 = (Button) r1.a.a(view, R.id.test_mic);
                                                                                        if (button11 != null) {
                                                                                            i10 = R.id.threshold;
                                                                                            BubbleSeekBar bubbleSeekBar4 = (BubbleSeekBar) r1.a.a(view, R.id.threshold);
                                                                                            if (bubbleSeekBar4 != null) {
                                                                                                i10 = R.id.users;
                                                                                                Button button12 = (Button) r1.a.a(view, R.id.users);
                                                                                                if (button12 != null) {
                                                                                                    i10 = R.id.vol_label;
                                                                                                    TextView textView = (TextView) r1.a.a(view, R.id.vol_label);
                                                                                                    if (textView != null) {
                                                                                                        return new q1((ScrollView) view, button, editText, editText2, editText3, button2, button3, bubbleSeekBar, switchMaterial, switchMaterial2, button4, button5, bubbleSeekBar2, button6, switchMaterial3, switchMaterial4, bubbleSeekBar3, button7, button8, button9, button10, button11, bubbleSeekBar4, button12, textView);
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

    public static q1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_test, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f21452a;
    }
}
