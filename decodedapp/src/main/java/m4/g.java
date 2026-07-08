package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentContainerView;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Guideline f21142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Guideline f21143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FragmentContainerView f21144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CardView f21145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f21146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f21147g;

    private g(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, FragmentContainerView fragmentContainerView, CardView cardView, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f21141a = constraintLayout;
        this.f21142b = guideline;
        this.f21143c = guideline2;
        this.f21144d = fragmentContainerView;
        this.f21145e = cardView;
        this.f21146f = frameLayout;
        this.f21147g = frameLayout2;
    }

    public static g a(View view) {
        int i10 = R.id.guideline_h;
        Guideline guideline = (Guideline) r1.a.a(view, R.id.guideline_h);
        if (guideline != null) {
            i10 = R.id.guideline_v;
            Guideline guideline2 = (Guideline) r1.a.a(view, R.id.guideline_v);
            if (guideline2 != null) {
                i10 = R.id.f4942info;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) r1.a.a(view, R.id.f4942info);
                if (fragmentContainerView != null) {
                    i10 = R.id.info_card;
                    CardView cardView = (CardView) r1.a.a(view, R.id.info_card);
                    if (cardView != null) {
                        i10 = R.id.map;
                        FrameLayout frameLayout = (FrameLayout) r1.a.a(view, R.id.map);
                        if (frameLayout != null) {
                            i10 = R.id.smap;
                            FrameLayout frameLayout2 = (FrameLayout) r1.a.a(view, R.id.smap);
                            if (frameLayout2 != null) {
                                return new g((ConstraintLayout) view, guideline, guideline2, fragmentContainerView, cardView, frameLayout, frameLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static g c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static g d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_satellite, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21141a;
    }
}
