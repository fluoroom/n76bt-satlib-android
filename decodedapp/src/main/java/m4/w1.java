package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f21659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f21660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f21661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ActionButton f21662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f21663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f21664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatImageView f21665h;

    private w1(LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, ActionButton actionButton, TextView textView3, TextView textView4, AppCompatImageView appCompatImageView) {
        this.f21658a = linearLayout;
        this.f21659b = textView;
        this.f21660c = textView2;
        this.f21661d = linearLayout2;
        this.f21662e = actionButton;
        this.f21663f = textView3;
        this.f21664g = textView4;
        this.f21665h = appCompatImageView;
    }

    public static w1 a(View view) {
        int i10 = R.id.address;
        TextView textView = (TextView) r1.a.a(view, R.id.address);
        if (textView != null) {
            i10 = R.id.bind;
            TextView textView2 = (TextView) r1.a.a(view, R.id.bind);
            if (textView2 != null) {
                i10 = R.id.content;
                LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.content);
                if (linearLayout != null) {
                    i10 = R.id.del_btn;
                    ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.del_btn);
                    if (actionButton != null) {
                        i10 = R.id.header;
                        TextView textView3 = (TextView) r1.a.a(view, R.id.header);
                        if (textView3 != null) {
                            i10 = R.id.name;
                            TextView textView4 = (TextView) r1.a.a(view, R.id.name);
                            if (textView4 != null) {
                                i10 = R.id.type;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) r1.a.a(view, R.id.type);
                                if (appCompatImageView != null) {
                                    return new w1((LinearLayout) view, textView, textView2, linearLayout, actionButton, textView3, textView4, appCompatImageView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static w1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.trusted_device_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f21658a;
    }
}
