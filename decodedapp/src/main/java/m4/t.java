package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.android.widget.NumberPreferenceView;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f21553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SeekBar f21554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NumberPreferenceView f21555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Button f21556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Button f21557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f21558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NumberPreferenceView f21559h;

    private t(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, SeekBar seekBar, NumberPreferenceView numberPreferenceView, Button button, Button button2, TextView textView, NumberPreferenceView numberPreferenceView2) {
        this.f21552a = constraintLayout;
        this.f21553b = constraintLayout2;
        this.f21554c = seekBar;
        this.f21555d = numberPreferenceView;
        this.f21556e = button;
        this.f21557f = button2;
        this.f21558g = textView;
        this.f21559h = numberPreferenceView2;
    }

    public static t a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.noise_level;
        SeekBar seekBar = (SeekBar) r1.a.a(view, R.id.noise_level);
        if (seekBar != null) {
            i10 = R.id.noise_level_n;
            NumberPreferenceView numberPreferenceView = (NumberPreferenceView) r1.a.a(view, R.id.noise_level_n);
            if (numberPreferenceView != null) {
                i10 = R.id.f4946p1;
                Button button = (Button) r1.a.a(view, R.id.f4946p1);
                if (button != null) {
                    i10 = R.id.start_monitor;
                    Button button2 = (Button) r1.a.a(view, R.id.start_monitor);
                    if (button2 != null) {
                        i10 = R.id.textView3;
                        TextView textView = (TextView) r1.a.a(view, R.id.textView3);
                        if (textView != null) {
                            i10 = R.id.vox_start_time;
                            NumberPreferenceView numberPreferenceView2 = (NumberPreferenceView) r1.a.a(view, R.id.vox_start_time);
                            if (numberPreferenceView2 != null) {
                                return new t(constraintLayout, constraintLayout, seekBar, numberPreferenceView, button, button2, textView, numberPreferenceView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static t c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_audio_control, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21552a;
    }
}
