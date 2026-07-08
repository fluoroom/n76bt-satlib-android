package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f21372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f21373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActionButton f21374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f21375e;

    private n0(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, ActionButton actionButton, TextView textView2) {
        this.f21371a = constraintLayout;
        this.f21372b = textView;
        this.f21373c = constraintLayout2;
        this.f21374d = actionButton;
        this.f21375e = textView2;
    }

    public static n0 a(View view) {
        int i10 = R.id.nickname;
        TextView textView = (TextView) r1.a.a(view, R.id.nickname);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.settings;
            ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.settings);
            if (actionButton != null) {
                i10 = R.id.username;
                TextView textView2 = (TextView) r1.a.a(view, R.id.username);
                if (textView2 != null) {
                    return new n0(constraintLayout, textView, constraintLayout, actionButton, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static n0 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_ii_user_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }
}
