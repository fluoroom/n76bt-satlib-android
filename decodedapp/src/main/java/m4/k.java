package m4;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f21259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f21260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f21261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f21262e;

    private k(ConstraintLayout constraintLayout, View view, TextView textView, AppCompatImageView appCompatImageView, TextView textView2) {
        this.f21258a = constraintLayout;
        this.f21259b = view;
        this.f21260c = textView;
        this.f21261d = appCompatImageView;
        this.f21262e = textView2;
    }

    public static k a(View view) {
        int i10 = R.id.f4940ci;
        View viewA = r1.a.a(view, R.id.f4940ci);
        if (viewA != null) {
            i10 = R.id.freq;
            TextView textView = (TextView) r1.a.a(view, R.id.freq);
            if (textView != null) {
                i10 = R.id.status_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) r1.a.a(view, R.id.status_icon);
                if (appCompatImageView != null) {
                    i10 = R.id.title;
                    TextView textView2 = (TextView) r1.a.a(view, R.id.title);
                    if (textView2 != null) {
                        return new k((ConstraintLayout) view, viewA, textView, appCompatImageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public ConstraintLayout b() {
        return this.f21258a;
    }
}
