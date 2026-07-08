package m4;

import android.view.View;
import android.widget.LinearLayout;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f21692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionButton f21693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActionButton f21694d;

    private x1(LinearLayout linearLayout, LinearLayout linearLayout2, ActionButton actionButton, ActionButton actionButton2) {
        this.f21691a = linearLayout;
        this.f21692b = linearLayout2;
        this.f21693c = actionButton;
        this.f21694d = actionButton2;
    }

    public static x1 a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = R.id.zoom_in;
        ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.zoom_in);
        if (actionButton != null) {
            i10 = R.id.zoom_out;
            ActionButton actionButton2 = (ActionButton) r1.a.a(view, R.id.zoom_out);
            if (actionButton2 != null) {
                return new x1(linearLayout, linearLayout, actionButton, actionButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public LinearLayout b() {
        return this.f21691a;
    }
}
