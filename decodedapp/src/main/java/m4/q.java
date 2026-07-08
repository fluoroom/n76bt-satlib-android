package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.CSViewPager;
import com.benshikj.ht.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BottomNavigationView f21448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CSViewPager f21449c;

    private q(ConstraintLayout constraintLayout, BottomNavigationView bottomNavigationView, CSViewPager cSViewPager) {
        this.f21447a = constraintLayout;
        this.f21448b = bottomNavigationView;
        this.f21449c = cSViewPager;
    }

    public static q a(View view) {
        int i10 = R.id.navigation;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) r1.a.a(view, R.id.navigation);
        if (bottomNavigationView != null) {
            i10 = R.id.view_paper;
            CSViewPager cSViewPager = (CSViewPager) r1.a.a(view, R.id.view_paper);
            if (cSViewPager != null) {
                return new q((ConstraintLayout) view, bottomNavigationView, cSViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static q c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_aprs, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21447a;
    }
}
