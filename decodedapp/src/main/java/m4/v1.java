package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.android.widget.TintTextView;

/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TintTextView f21638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TintTextView f21639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TintTextView f21640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TintTextView f21641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TintTextView f21642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TintTextView f21643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TintTextView f21644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TintTextView f21645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TintTextView f21646j;

    private v1(ConstraintLayout constraintLayout, TintTextView tintTextView, TintTextView tintTextView2, TintTextView tintTextView3, TintTextView tintTextView4, TintTextView tintTextView5, TintTextView tintTextView6, TintTextView tintTextView7, TintTextView tintTextView8, TintTextView tintTextView9) {
        this.f21637a = constraintLayout;
        this.f21638b = tintTextView;
        this.f21639c = tintTextView2;
        this.f21640d = tintTextView3;
        this.f21641e = tintTextView4;
        this.f21642f = tintTextView5;
        this.f21643g = tintTextView6;
        this.f21644h = tintTextView7;
        this.f21645i = tintTextView8;
        this.f21646j = tintTextView9;
    }

    public static v1 a(View view) {
        int i10 = R.id.add_dev;
        TintTextView tintTextView = (TintTextView) r1.a.a(view, R.id.add_dev);
        if (tintTextView != null) {
            i10 = R.id.add_iich;
            TintTextView tintTextView2 = (TintTextView) r1.a.a(view, R.id.add_iich);
            if (tintTextView2 != null) {
                i10 = R.id.aprs;
                TintTextView tintTextView3 = (TintTextView) r1.a.a(view, R.id.aprs);
                if (tintTextView3 != null) {
                    i10 = R.id.audio;
                    TintTextView tintTextView4 = (TintTextView) r1.a.a(view, R.id.audio);
                    if (tintTextView4 != null) {
                        i10 = R.id.dtmf;
                        TintTextView tintTextView5 = (TintTextView) r1.a.a(view, R.id.dtmf);
                        if (tintTextView5 != null) {
                            i10 = R.id.mdc_monitor;
                            TintTextView tintTextView6 = (TintTextView) r1.a.a(view, R.id.mdc_monitor);
                            if (tintTextView6 != null) {
                                i10 = R.id.morse_code;
                                TintTextView tintTextView7 = (TintTextView) r1.a.a(view, R.id.morse_code);
                                if (tintTextView7 != null) {
                                    i10 = R.id.picture;
                                    TintTextView tintTextView8 = (TintTextView) r1.a.a(view, R.id.picture);
                                    if (tintTextView8 != null) {
                                        i10 = R.id.satelliteManager;
                                        TintTextView tintTextView9 = (TintTextView) r1.a.a(view, R.id.satelliteManager);
                                        if (tintTextView9 != null) {
                                            return new v1((ConstraintLayout) view, tintTextView, tintTextView2, tintTextView3, tintTextView4, tintTextView5, tintTextView6, tintTextView7, tintTextView8, tintTextView9);
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

    public static v1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.tools, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21637a;
    }
}
