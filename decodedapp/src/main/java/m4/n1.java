package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CardView f21376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionButton f21377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionButton f21378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f21379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f21380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ActionButton f21381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ActionButton f21382g;

    private n1(CardView cardView, ActionButton actionButton, ActionButton actionButton2, TextView textView, TextView textView2, ActionButton actionButton3, ActionButton actionButton4) {
        this.f21376a = cardView;
        this.f21377b = actionButton;
        this.f21378c = actionButton2;
        this.f21379d = textView;
        this.f21380e = textView2;
        this.f21381f = actionButton3;
        this.f21382g = actionButton4;
    }

    public static n1 a(View view) {
        int i10 = R.id.bt_link;
        ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.bt_link);
        if (actionButton != null) {
            i10 = R.id.headset_mic;
            ActionButton actionButton2 = (ActionButton) r1.a.a(view, R.id.headset_mic);
            if (actionButton2 != null) {
                i10 = R.id.l_title;
                TextView textView = (TextView) r1.a.a(view, R.id.l_title);
                if (textView != null) {
                    i10 = R.id.message;
                    TextView textView2 = (TextView) r1.a.a(view, R.id.message);
                    if (textView2 != null) {
                        i10 = R.id.monitor;
                        ActionButton actionButton3 = (ActionButton) r1.a.a(view, R.id.monitor);
                        if (actionButton3 != null) {
                            i10 = R.id.more;
                            ActionButton actionButton4 = (ActionButton) r1.a.a(view, R.id.more);
                            if (actionButton4 != null) {
                                return new n1((CardView) view, actionButton, actionButton2, textView, textView2, actionButton3, actionButton4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static n1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_simple_device, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CardView b() {
        return this.f21376a;
    }
}
