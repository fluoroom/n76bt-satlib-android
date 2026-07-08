package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FrameLayout f21707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f21708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f21709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SwipeRefreshLayout f21710d;

    private z(FrameLayout frameLayout, TextView textView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f21707a = frameLayout;
        this.f21708b = textView;
        this.f21709c = recyclerView;
        this.f21710d = swipeRefreshLayout;
    }

    public static z a(View view) {
        int i10 = R.id.empty;
        TextView textView = (TextView) r1.a.a(view, R.id.empty);
        if (textView != null) {
            i10 = R.id.list;
            RecyclerView recyclerView = (RecyclerView) r1.a.a(view, R.id.list);
            if (recyclerView != null) {
                i10 = R.id.swipeRefresh;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) r1.a.a(view, R.id.swipeRefresh);
                if (swipeRefreshLayout != null) {
                    return new z((FrameLayout) view, textView, recyclerView, swipeRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static z c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_contact_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public FrameLayout b() {
        return this.f21707a;
    }
}
