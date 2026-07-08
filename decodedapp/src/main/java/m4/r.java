package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.android.widget.TintTextView;
import com.dw.widget.InsetsLayout;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InsetsLayout f21477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f21478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TintTextView f21479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TintTextView f21480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TintTextView f21481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TintTextView f21482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f21483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f21484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TintTextView f21485i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConstraintLayout f21486j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TintTextView f21487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TintTextView f21488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TintTextView f21489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TintTextView f21490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f21491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f21492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f21493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TintTextView f21494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TintTextView f21495s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TintTextView f21496t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TintTextView f21497u;

    private r(InsetsLayout insetsLayout, LinearLayout linearLayout, TintTextView tintTextView, TintTextView tintTextView2, TintTextView tintTextView3, TintTextView tintTextView4, ConstraintLayout constraintLayout, View view, TintTextView tintTextView5, ConstraintLayout constraintLayout2, TintTextView tintTextView6, TintTextView tintTextView7, TintTextView tintTextView8, TintTextView tintTextView9, TextView textView, TextView textView2, TextView textView3, TintTextView tintTextView10, TintTextView tintTextView11, TintTextView tintTextView12, TintTextView tintTextView13) {
        this.f21477a = insetsLayout;
        this.f21478b = linearLayout;
        this.f21479c = tintTextView;
        this.f21480d = tintTextView2;
        this.f21481e = tintTextView3;
        this.f21482f = tintTextView4;
        this.f21483g = constraintLayout;
        this.f21484h = view;
        this.f21485i = tintTextView5;
        this.f21486j = constraintLayout2;
        this.f21487k = tintTextView6;
        this.f21488l = tintTextView7;
        this.f21489m = tintTextView8;
        this.f21490n = tintTextView9;
        this.f21491o = textView;
        this.f21492p = textView2;
        this.f21493q = textView3;
        this.f21494r = tintTextView10;
        this.f21495s = tintTextView11;
        this.f21496t = tintTextView12;
        this.f21497u = tintTextView13;
    }

    public static r a(View view) {
        int i10 = R.id.actions;
        LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.actions);
        if (linearLayout != null) {
            i10 = R.id.delete;
            TintTextView tintTextView = (TintTextView) r1.a.a(view, R.id.delete);
            if (tintTextView != null) {
                i10 = R.id.directions;
                TintTextView tintTextView2 = (TintTextView) r1.a.a(view, R.id.directions);
                if (tintTextView2 != null) {
                    i10 = R.id.edit;
                    TintTextView tintTextView3 = (TintTextView) r1.a.a(view, R.id.edit);
                    if (tintTextView3 != null) {
                        i10 = R.id.follow;
                        TintTextView tintTextView4 = (TintTextView) r1.a.a(view, R.id.follow);
                        if (tintTextView4 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) r1.a.a(view, R.id.info_card);
                            View viewA = r1.a.a(view, R.id.info_card_bg);
                            i10 = R.id.message;
                            TintTextView tintTextView5 = (TintTextView) r1.a.a(view, R.id.message);
                            if (tintTextView5 != null) {
                                i10 = R.id.radio;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) r1.a.a(view, R.id.radio);
                                if (constraintLayout2 != null) {
                                    i10 = R.id.rx_freq;
                                    TintTextView tintTextView6 = (TintTextView) r1.a.a(view, R.id.rx_freq);
                                    if (tintTextView6 != null) {
                                        i10 = R.id.rx_sub_audio;
                                        TintTextView tintTextView7 = (TintTextView) r1.a.a(view, R.id.rx_sub_audio);
                                        if (tintTextView7 != null) {
                                            i10 = R.id.satellite_connect;
                                            TintTextView tintTextView8 = (TintTextView) r1.a.a(view, R.id.satellite_connect);
                                            if (tintTextView8 != null) {
                                                i10 = R.id.satellite_disconnect;
                                                TintTextView tintTextView9 = (TintTextView) r1.a.a(view, R.id.satellite_disconnect);
                                                if (tintTextView9 != null) {
                                                    i10 = R.id.snippetText;
                                                    TextView textView = (TextView) r1.a.a(view, R.id.snippetText);
                                                    if (textView != null) {
                                                        i10 = R.id.time;
                                                        TextView textView2 = (TextView) r1.a.a(view, R.id.time);
                                                        if (textView2 != null) {
                                                            i10 = R.id.titleText;
                                                            TextView textView3 = (TextView) r1.a.a(view, R.id.titleText);
                                                            if (textView3 != null) {
                                                                i10 = R.id.track;
                                                                TintTextView tintTextView10 = (TintTextView) r1.a.a(view, R.id.track);
                                                                if (tintTextView10 != null) {
                                                                    i10 = R.id.tx_freq;
                                                                    TintTextView tintTextView11 = (TintTextView) r1.a.a(view, R.id.tx_freq);
                                                                    if (tintTextView11 != null) {
                                                                        i10 = R.id.tx_sub_audio;
                                                                        TintTextView tintTextView12 = (TintTextView) r1.a.a(view, R.id.tx_sub_audio);
                                                                        if (tintTextView12 != null) {
                                                                            i10 = R.id.unfollow;
                                                                            TintTextView tintTextView13 = (TintTextView) r1.a.a(view, R.id.unfollow);
                                                                            if (tintTextView13 != null) {
                                                                                return new r((InsetsLayout) view, linearLayout, tintTextView, tintTextView2, tintTextView3, tintTextView4, constraintLayout, viewA, tintTextView5, constraintLayout2, tintTextView6, tintTextView7, tintTextView8, tintTextView9, textView, textView2, textView3, tintTextView10, tintTextView11, tintTextView12, tintTextView13);
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

    public static r c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_aprs_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public InsetsLayout b() {
        return this.f21477a;
    }
}
