package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f21236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f21237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f21238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f21239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f21240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f21241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f21242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CardView f21243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f21244j;

    private j(LinearLayout linearLayout, k kVar, k kVar2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, LinearLayout linearLayout2, CardView cardView, TextView textView) {
        this.f21235a = linearLayout;
        this.f21236b = kVar;
        this.f21237c = kVar2;
        this.f21238d = appCompatImageView;
        this.f21239e = appCompatImageView2;
        this.f21240f = appCompatImageView3;
        this.f21241g = appCompatImageView4;
        this.f21242h = linearLayout2;
        this.f21243i = cardView;
        this.f21244j = textView;
    }

    public static j a(View view) {
        int i10 = R.id.cha;
        View viewA = r1.a.a(view, R.id.cha);
        if (viewA != null) {
            k kVarA = k.a(viewA);
            i10 = R.id.chb;
            View viewA2 = r1.a.a(view, R.id.chb);
            if (viewA2 != null) {
                k kVarA2 = k.a(viewA2);
                i10 = R.id.icon_rssi;
                AppCompatImageView appCompatImageView = (AppCompatImageView) r1.a.a(view, R.id.icon_rssi);
                if (appCompatImageView != null) {
                    i10 = R.id.icon_spk;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) r1.a.a(view, R.id.icon_spk);
                    if (appCompatImageView2 != null) {
                        i10 = R.id.level_rssi;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) r1.a.a(view, R.id.level_rssi);
                        if (appCompatImageView3 != null) {
                            i10 = R.id.level_spk;
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) r1.a.a(view, R.id.level_spk);
                            if (appCompatImageView4 != null) {
                                LinearLayout linearLayout = (LinearLayout) view;
                                i10 = R.id.rx;
                                CardView cardView = (CardView) r1.a.a(view, R.id.rx);
                                if (cardView != null) {
                                    i10 = R.id.status;
                                    TextView textView = (TextView) r1.a.a(view, R.id.status);
                                    if (textView != null) {
                                        return new j(linearLayout, kVarA, kVarA2, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, linearLayout, cardView, textView);
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

    public static j b(LayoutInflater layoutInflater) {
        return c(layoutInflater, null, false);
    }

    public static j c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dev_status, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
