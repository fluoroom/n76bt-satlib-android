package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.CSViewPager;
import com.benshikj.ht.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f20966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TabLayout f20967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f20968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CSViewPager f20969d;

    private a0(ConstraintLayout constraintLayout, TabLayout tabLayout, View view, CSViewPager cSViewPager) {
        this.f20966a = constraintLayout;
        this.f20967b = tabLayout;
        this.f20968c = view;
        this.f20969d = cSViewPager;
    }

    public static a0 a(View view) {
        int i10 = R.id.navigation;
        TabLayout tabLayout = (TabLayout) r1.a.a(view, R.id.navigation);
        if (tabLayout != null) {
            i10 = R.id.top_divider;
            View viewA = r1.a.a(view, R.id.top_divider);
            if (viewA != null) {
                i10 = R.id.view_paper;
                CSViewPager cSViewPager = (CSViewPager) r1.a.a(view, R.id.view_paper);
                if (cSViewPager != null) {
                    return new a0((ConstraintLayout) view, tabLayout, viewA, cSViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_contacts_group, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f20966a;
    }
}
