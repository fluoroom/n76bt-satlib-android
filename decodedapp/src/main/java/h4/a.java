package h4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import k3.f;
import k3.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f15115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f15116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SwipeRefreshLayout f15117c;

    private a(LinearLayout linearLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f15115a = linearLayout;
        this.f15116b = recyclerView;
        this.f15117c = swipeRefreshLayout;
    }

    public static a a(View view) {
        int i10 = f.f19203w;
        RecyclerView recyclerView = (RecyclerView) r1.a.a(view, i10);
        if (recyclerView != null) {
            i10 = f.K;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) r1.a.a(view, i10);
            if (swipeRefreshLayout != null) {
                return new a((LinearLayout) view, recyclerView, swipeRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(g.f19217k, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f15115a;
    }
}
