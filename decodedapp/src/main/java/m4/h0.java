package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.benshikj.ht.R;
import com.dw.android.widget.GridRecyclerView;
import com.dw.widget.ActionButton;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final LinearLayout F;
    public final LinearLayout G;
    public final TextView H;
    public final Group I;
    public final Spinner J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppBarLayout f21176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionButton f21177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActionButton f21178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f21179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f21180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f21181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f21182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f21183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f21184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinearLayout f21185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final GridRecyclerView f21186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ActionButton f21187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ActionButton f21188n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ActionButton f21189o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinearLayout f21190p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinearLayout f21191q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f21192r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Group f21193s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Spinner f21194t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ActionButton f21195u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ActionButton f21196v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ActionButton f21197w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ActionButton f21198x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f21199y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f21200z;

    private h0(LinearLayout linearLayout, AppBarLayout appBarLayout, ActionButton actionButton, ActionButton actionButton2, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout2, GridRecyclerView gridRecyclerView, ActionButton actionButton3, ActionButton actionButton4, ActionButton actionButton5, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView6, Group group, Spinner spinner, ActionButton actionButton6, ActionButton actionButton7, ActionButton actionButton8, ActionButton actionButton9, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, LinearLayout linearLayout5, LinearLayout linearLayout6, TextView textView14, Group group2, Spinner spinner2) {
        this.f21175a = linearLayout;
        this.f21176b = appBarLayout;
        this.f21177c = actionButton;
        this.f21178d = actionButton2;
        this.f21179e = constraintLayout;
        this.f21180f = textView;
        this.f21181g = textView2;
        this.f21182h = textView3;
        this.f21183i = textView4;
        this.f21184j = textView5;
        this.f21185k = linearLayout2;
        this.f21186l = gridRecyclerView;
        this.f21187m = actionButton3;
        this.f21188n = actionButton4;
        this.f21189o = actionButton5;
        this.f21190p = linearLayout3;
        this.f21191q = linearLayout4;
        this.f21192r = textView6;
        this.f21193s = group;
        this.f21194t = spinner;
        this.f21195u = actionButton6;
        this.f21196v = actionButton7;
        this.f21197w = actionButton8;
        this.f21198x = actionButton9;
        this.f21199y = textView7;
        this.f21200z = textView8;
        this.A = textView9;
        this.B = textView10;
        this.C = textView11;
        this.D = textView12;
        this.E = textView13;
        this.F = linearLayout5;
        this.G = linearLayout6;
        this.H = textView14;
        this.I = group2;
        this.J = spinner2;
    }

    public static h0 a(View view) {
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) r1.a.a(view, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.back;
            ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.back);
            if (actionButton != null) {
                ActionButton actionButton2 = (ActionButton) r1.a.a(view, R.id.clean);
                i10 = R.id.content;
                ConstraintLayout constraintLayout = (ConstraintLayout) r1.a.a(view, R.id.content);
                if (constraintLayout != null) {
                    TextView textView = (TextView) r1.a.a(view, R.id.empty);
                    i10 = R.id.end_freq;
                    TextView textView2 = (TextView) r1.a.a(view, R.id.end_freq);
                    if (textView2 != null) {
                        i10 = R.id.fine_tuning_step;
                        TextView textView3 = (TextView) r1.a.a(view, R.id.fine_tuning_step);
                        if (textView3 != null) {
                            i10 = R.id.freq;
                            TextView textView4 = (TextView) r1.a.a(view, R.id.freq);
                            if (textView4 != null) {
                                i10 = R.id.freq_500;
                                TextView textView5 = (TextView) r1.a.a(view, R.id.freq_500);
                                if (textView5 != null) {
                                    LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.linearLayout2);
                                    i10 = R.id.list;
                                    GridRecyclerView gridRecyclerView = (GridRecyclerView) r1.a.a(view, R.id.list);
                                    if (gridRecyclerView != null) {
                                        i10 = R.id.more;
                                        ActionButton actionButton3 = (ActionButton) r1.a.a(view, R.id.more);
                                        if (actionButton3 != null) {
                                            i10 = R.id.next;
                                            ActionButton actionButton4 = (ActionButton) r1.a.a(view, R.id.next);
                                            if (actionButton4 != null) {
                                                i10 = R.id.previous;
                                                ActionButton actionButton5 = (ActionButton) r1.a.a(view, R.id.previous);
                                                if (actionButton5 != null) {
                                                    LinearLayout linearLayout2 = (LinearLayout) r1.a.a(view, R.id.rx_freq_c);
                                                    i10 = R.id.rx_freq_cc;
                                                    LinearLayout linearLayout3 = (LinearLayout) r1.a.a(view, R.id.rx_freq_cc);
                                                    if (linearLayout3 != null) {
                                                        i10 = R.id.rx_freq_l;
                                                        TextView textView6 = (TextView) r1.a.a(view, R.id.rx_freq_l);
                                                        if (textView6 != null) {
                                                            Group group = (Group) r1.a.a(view, R.id.rx_group);
                                                            i10 = R.id.rx_sub_audio;
                                                            Spinner spinner = (Spinner) r1.a.a(view, R.id.rx_sub_audio);
                                                            if (spinner != null) {
                                                                i10 = R.id.rx_to_tx_freq;
                                                                ActionButton actionButton6 = (ActionButton) r1.a.a(view, R.id.rx_to_tx_freq);
                                                                if (actionButton6 != null) {
                                                                    i10 = R.id.save;
                                                                    ActionButton actionButton7 = (ActionButton) r1.a.a(view, R.id.save);
                                                                    if (actionButton7 != null) {
                                                                        i10 = R.id.seek_down;
                                                                        ActionButton actionButton8 = (ActionButton) r1.a.a(view, R.id.seek_down);
                                                                        if (actionButton8 != null) {
                                                                            i10 = R.id.seek_up;
                                                                            ActionButton actionButton9 = (ActionButton) r1.a.a(view, R.id.seek_up);
                                                                            if (actionButton9 != null) {
                                                                                i10 = R.id.start_freq;
                                                                                TextView textView7 = (TextView) r1.a.a(view, R.id.start_freq);
                                                                                if (textView7 != null) {
                                                                                    i10 = R.id.step;
                                                                                    TextView textView8 = (TextView) r1.a.a(view, R.id.step);
                                                                                    if (textView8 != null) {
                                                                                        TextView textView9 = (TextView) r1.a.a(view, R.id.textView6);
                                                                                        TextView textView10 = (TextView) r1.a.a(view, R.id.textView7);
                                                                                        i10 = R.id.title;
                                                                                        TextView textView11 = (TextView) r1.a.a(view, R.id.title);
                                                                                        if (textView11 != null) {
                                                                                            i10 = R.id.tx_freq;
                                                                                            TextView textView12 = (TextView) r1.a.a(view, R.id.tx_freq);
                                                                                            if (textView12 != null) {
                                                                                                i10 = R.id.tx_freq_500;
                                                                                                TextView textView13 = (TextView) r1.a.a(view, R.id.tx_freq_500);
                                                                                                if (textView13 != null) {
                                                                                                    LinearLayout linearLayout4 = (LinearLayout) r1.a.a(view, R.id.tx_freq_c);
                                                                                                    i10 = R.id.tx_freq_cc;
                                                                                                    LinearLayout linearLayout5 = (LinearLayout) r1.a.a(view, R.id.tx_freq_cc);
                                                                                                    if (linearLayout5 != null) {
                                                                                                        i10 = R.id.tx_freq_l;
                                                                                                        TextView textView14 = (TextView) r1.a.a(view, R.id.tx_freq_l);
                                                                                                        if (textView14 != null) {
                                                                                                            Group group2 = (Group) r1.a.a(view, R.id.tx_group);
                                                                                                            i10 = R.id.tx_sub_audio;
                                                                                                            Spinner spinner2 = (Spinner) r1.a.a(view, R.id.tx_sub_audio);
                                                                                                            if (spinner2 != null) {
                                                                                                                return new h0((LinearLayout) view, appBarLayout, actionButton, actionButton2, constraintLayout, textView, textView2, textView3, textView4, textView5, linearLayout, gridRecyclerView, actionButton3, actionButton4, actionButton5, linearLayout2, linearLayout3, textView6, group, spinner, actionButton6, actionButton7, actionButton8, actionButton9, textView7, textView8, textView9, textView10, textView11, textView12, textView13, linearLayout4, linearLayout5, textView14, group2, spinner2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static h0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_freq_scan, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f21175a;
    }
}
