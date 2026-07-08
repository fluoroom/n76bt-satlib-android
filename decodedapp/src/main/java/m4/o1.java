package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CardView f21390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionButton f21391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f21392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f21393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f21394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Button f21395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ActionButton f21396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ActionButton f21397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f21398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f21399j;

    private o1(CardView cardView, ActionButton actionButton, TextView textView, ConstraintLayout constraintLayout, ImageView imageView, Button button, ActionButton actionButton2, ActionButton actionButton3, TextView textView2, ImageView imageView2) {
        this.f21390a = cardView;
        this.f21391b = actionButton;
        this.f21392c = textView;
        this.f21393d = constraintLayout;
        this.f21394e = imageView;
        this.f21395f = button;
        this.f21396g = actionButton2;
        this.f21397h = actionButton3;
        this.f21398i = textView2;
        this.f21399j = imageView2;
    }

    public static o1 a(View view) {
        int i10 = R.id.bt_link;
        ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.bt_link);
        if (actionButton != null) {
            i10 = R.id.ch_name;
            TextView textView = (TextView) r1.a.a(view, R.id.ch_name);
            if (textView != null) {
                i10 = R.id.ch_status;
                ConstraintLayout constraintLayout = (ConstraintLayout) r1.a.a(view, R.id.ch_status);
                if (constraintLayout != null) {
                    i10 = R.id.f4940ci;
                    ImageView imageView = (ImageView) r1.a.a(view, R.id.f4940ci);
                    if (imageView != null) {
                        i10 = R.id.joinNetworkChannel;
                        Button button = (Button) r1.a.a(view, R.id.joinNetworkChannel);
                        if (button != null) {
                            i10 = R.id.monitor;
                            ActionButton actionButton2 = (ActionButton) r1.a.a(view, R.id.monitor);
                            if (actionButton2 != null) {
                                i10 = R.id.more;
                                ActionButton actionButton3 = (ActionButton) r1.a.a(view, R.id.more);
                                if (actionButton3 != null) {
                                    i10 = R.id.status;
                                    TextView textView2 = (TextView) r1.a.a(view, R.id.status);
                                    if (textView2 != null) {
                                        i10 = R.id.status_icon;
                                        ImageView imageView2 = (ImageView) r1.a.a(view, R.id.status_icon);
                                        if (imageView2 != null) {
                                            return new o1((CardView) view, actionButton, textView, constraintLayout, imageView, button, actionButton2, actionButton3, textView2, imageView2);
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

    public static o1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_simple_ii, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CardView b() {
        return this.f21390a;
    }
}
