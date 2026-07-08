package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.CSViewPager;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BottomNavigationView f21252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f21253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActionButton f21254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CSViewPager f21255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f21256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ActionButton f21257g;

    private j1(ConstraintLayout constraintLayout, BottomNavigationView bottomNavigationView, View view, ActionButton actionButton, CSViewPager cSViewPager, LinearLayout linearLayout, ActionButton actionButton2) {
        this.f21251a = constraintLayout;
        this.f21252b = bottomNavigationView;
        this.f21253c = view;
        this.f21254d = actionButton;
        this.f21255e = cSViewPager;
        this.f21256f = linearLayout;
        this.f21257g = actionButton2;
    }

    public static j1 a(View view) {
        int i10 = R.id.navigation;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) r1.a.a(view, R.id.navigation);
        if (bottomNavigationView != null) {
            i10 = R.id.view;
            View viewA = r1.a.a(view, R.id.view);
            if (viewA != null) {
                i10 = R.id.view_contacts;
                ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.view_contacts);
                if (actionButton != null) {
                    i10 = R.id.view_paper;
                    CSViewPager cSViewPager = (CSViewPager) r1.a.a(view, R.id.view_paper);
                    if (cSViewPager != null) {
                        i10 = R.id.view_select;
                        LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.view_select);
                        if (linearLayout != null) {
                            i10 = R.id.view_talk_list;
                            ActionButton actionButton2 = (ActionButton) r1.a.a(view, R.id.view_talk_list);
                            if (actionButton2 != null) {
                                return new j1((ConstraintLayout) view, bottomNavigationView, viewA, actionButton, cSViewPager, linearLayout, actionButton2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static j1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_session_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21251a;
    }
}
