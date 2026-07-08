package m4;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f21167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f21168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f21169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f21170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f21171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f21172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f21173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f21174h;

    private h(View view, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView, TextView textView4, AppCompatImageView appCompatImageView2, TextView textView5) {
        this.f21167a = view;
        this.f21168b = textView;
        this.f21169c = textView2;
        this.f21170d = textView3;
        this.f21171e = appCompatImageView;
        this.f21172f = textView4;
        this.f21173g = appCompatImageView2;
        this.f21174h = textView5;
    }

    public static h a(View view) {
        int i10 = R.id.bottom_status;
        TextView textView = (TextView) r1.a.a(view, R.id.bottom_status);
        if (textView != null) {
            i10 = R.id.bt_ch_index;
            TextView textView2 = (TextView) r1.a.a(view, R.id.bt_ch_index);
            if (textView2 != null) {
                i10 = R.id.bt_ch_name;
                TextView textView3 = (TextView) r1.a.a(view, R.id.bt_ch_name);
                if (textView3 != null) {
                    i10 = R.id.bt_ch_scan;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) r1.a.a(view, R.id.bt_ch_scan);
                    if (appCompatImageView != null) {
                        i10 = R.id.bt_netch_name;
                        TextView textView4 = (TextView) r1.a.a(view, R.id.bt_netch_name);
                        if (textView4 != null) {
                            i10 = R.id.mute;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) r1.a.a(view, R.id.mute);
                            if (appCompatImageView2 != null) {
                                i10 = R.id.top_status;
                                TextView textView5 = (TextView) r1.a.a(view, R.id.top_status);
                                if (textView5 != null) {
                                    return new h(view, textView, textView2, textView3, appCompatImageView, textView4, appCompatImageView2, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
