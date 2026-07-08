package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f21202b;

    private h1(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f21201a = linearLayout;
        this.f21202b = recyclerView;
    }

    public static h1 a(View view) {
        RecyclerView recyclerView = (RecyclerView) r1.a.a(view, R.id.list);
        if (recyclerView != null) {
            return new h1((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.list)));
    }

    public static h1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_satellite_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f21201a;
    }
}
