package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.CSViewPager;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CSViewPager f21598b;

    private u0(ConstraintLayout constraintLayout, CSViewPager cSViewPager) {
        this.f21597a = constraintLayout;
        this.f21598b = cSViewPager;
    }

    public static u0 a(View view) {
        CSViewPager cSViewPager = (CSViewPager) r1.a.a(view, R.id.view_paper);
        if (cSViewPager != null) {
            return new u0((ConstraintLayout) view, cSViewPager);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.view_paper)));
    }

    public static u0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_mm, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21597a;
    }
}
