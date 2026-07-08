package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionButton f21561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionButton f21562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActionButton f21563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ActionButton f21564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ActionButton f21565f;

    private t0(LinearLayout linearLayout, ActionButton actionButton, ActionButton actionButton2, ActionButton actionButton3, ActionButton actionButton4, ActionButton actionButton5) {
        this.f21560a = linearLayout;
        this.f21561b = actionButton;
        this.f21562c = actionButton2;
        this.f21563d = actionButton3;
        this.f21564e = actionButton4;
        this.f21565f = actionButton5;
    }

    public static t0 a(View view) {
        int i10 = R.id.mtf_map_layer;
        ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.mtf_map_layer);
        if (actionButton != null) {
            i10 = R.id.mtf_my_loc;
            ActionButton actionButton2 = (ActionButton) r1.a.a(view, R.id.mtf_my_loc);
            if (actionButton2 != null) {
                i10 = R.id.mtf_starred;
                ActionButton actionButton3 = (ActionButton) r1.a.a(view, R.id.mtf_starred);
                if (actionButton3 != null) {
                    i10 = R.id.mtf_time;
                    ActionButton actionButton4 = (ActionButton) r1.a.a(view, R.id.mtf_time);
                    if (actionButton4 != null) {
                        i10 = R.id.mtf_track;
                        ActionButton actionButton5 = (ActionButton) r1.a.a(view, R.id.mtf_track);
                        if (actionButton5 != null) {
                            return new t0((LinearLayout) view, actionButton, actionButton2, actionButton3, actionButton4, actionButton5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static t0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_map_toolbar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f21560a;
    }
}
