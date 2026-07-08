package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f21164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f21165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f21166d;

    private g1(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f21163a = constraintLayout;
        this.f21164b = textView;
        this.f21165c = textView2;
        this.f21166d = textView3;
    }

    public static g1 a(View view) {
        int i10 = R.id.snippetText;
        TextView textView = (TextView) r1.a.a(view, R.id.snippetText);
        if (textView != null) {
            i10 = R.id.time;
            TextView textView2 = (TextView) r1.a.a(view, R.id.time);
            if (textView2 != null) {
                i10 = R.id.titleText;
                TextView textView3 = (TextView) r1.a.a(view, R.id.titleText);
                if (textView3 != null) {
                    return new g1((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static g1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_satellite_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21163a;
    }
}
