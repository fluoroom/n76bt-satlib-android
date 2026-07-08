package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.CSViewPager;
import com.benshikj.ht.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BottomNavigationView f21005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CSViewPager f21006c;

    private c(LinearLayout linearLayout, BottomNavigationView bottomNavigationView, CSViewPager cSViewPager) {
        this.f21004a = linearLayout;
        this.f21005b = bottomNavigationView;
        this.f21006c = cSViewPager;
    }

    public static c a(View view) {
        int i10 = R.id.navigation;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) r1.a.a(view, R.id.navigation);
        if (bottomNavigationView != null) {
            i10 = R.id.view_pager;
            CSViewPager cSViewPager = (CSViewPager) r1.a.a(view, R.id.view_pager);
            if (cSViewPager != null) {
                return new c((LinearLayout) view, bottomNavigationView, cSViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static c c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static c d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_contact_details, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f21004a;
    }
}
