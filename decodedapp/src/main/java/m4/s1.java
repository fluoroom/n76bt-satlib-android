package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f21538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f21539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f21540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f21541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f21542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f21543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f21544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ProgressBar f21545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f21546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f21547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f21548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f21549m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinearLayout f21550n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f21551o;

    private s1(ConstraintLayout constraintLayout, Button button, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, ConstraintLayout constraintLayout2, TextView textView4, ProgressBar progressBar, TextView textView5, TextView textView6, TextView textView7, TextView textView8, LinearLayout linearLayout2, TextView textView9) {
        this.f21537a = constraintLayout;
        this.f21538b = button;
        this.f21539c = textView;
        this.f21540d = linearLayout;
        this.f21541e = textView2;
        this.f21542f = textView3;
        this.f21543g = constraintLayout2;
        this.f21544h = textView4;
        this.f21545i = progressBar;
        this.f21546j = textView5;
        this.f21547k = textView6;
        this.f21548l = textView7;
        this.f21549m = textView8;
        this.f21550n = linearLayout2;
        this.f21551o = textView9;
    }

    public static s1 a(View view) {
        int i10 = R.id.bt_update;
        Button button = (Button) r1.a.a(view, R.id.bt_update);
        if (button != null) {
            i10 = R.id.changes;
            TextView textView = (TextView) r1.a.a(view, R.id.changes);
            if (textView != null) {
                i10 = R.id.changes_frame;
                LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.changes_frame);
                if (linearLayout != null) {
                    i10 = R.id.countdown;
                    TextView textView2 = (TextView) r1.a.a(view, R.id.countdown);
                    if (textView2 != null) {
                        i10 = R.id.is_up_to_date;
                        TextView textView3 = (TextView) r1.a.a(view, R.id.is_up_to_date);
                        if (textView3 != null) {
                            i10 = R.id.load_update_info_frame;
                            ConstraintLayout constraintLayout = (ConstraintLayout) r1.a.a(view, R.id.load_update_info_frame);
                            if (constraintLayout != null) {
                                i10 = R.id.load_update_message;
                                TextView textView4 = (TextView) r1.a.a(view, R.id.load_update_message);
                                if (textView4 != null) {
                                    i10 = R.id.pb_update;
                                    ProgressBar progressBar = (ProgressBar) r1.a.a(view, R.id.pb_update);
                                    if (progressBar != null) {
                                        i10 = R.id.tv_percentage;
                                        TextView textView5 = (TextView) r1.a.a(view, R.id.tv_percentage);
                                        if (textView5 != null) {
                                            i10 = R.id.tv_step;
                                            TextView textView6 = (TextView) r1.a.a(view, R.id.tv_step);
                                            if (textView6 != null) {
                                                i10 = R.id.tv_update_error;
                                                TextView textView7 = (TextView) r1.a.a(view, R.id.tv_update_error);
                                                if (textView7 != null) {
                                                    i10 = R.id.tv_update_error_message;
                                                    TextView textView8 = (TextView) r1.a.a(view, R.id.tv_update_error_message);
                                                    if (textView8 != null) {
                                                        i10 = R.id.update_status_frame;
                                                        LinearLayout linearLayout2 = (LinearLayout) r1.a.a(view, R.id.update_status_frame);
                                                        if (linearLayout2 != null) {
                                                            i10 = R.id.version;
                                                            TextView textView9 = (TextView) r1.a.a(view, R.id.version);
                                                            if (textView9 != null) {
                                                                return new s1((ConstraintLayout) view, button, textView, linearLayout, textView2, textView3, constraintLayout, textView4, progressBar, textView5, textView6, textView7, textView8, linearLayout2, textView9);
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

    public static s1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_update_vm, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21537a;
    }
}
