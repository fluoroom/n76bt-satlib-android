package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FrameLayout f21506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f21507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f21508c;

    private r1(FrameLayout frameLayout, TextView textView, RecyclerView recyclerView) {
        this.f21506a = frameLayout;
        this.f21507b = textView;
        this.f21508c = recyclerView;
    }

    public static r1 a(View view) {
        int i10 = R.id.empty;
        TextView textView = (TextView) r1.a.a(view, R.id.empty);
        if (textView != null) {
            i10 = R.id.list;
            RecyclerView recyclerView = (RecyclerView) r1.a.a(view, R.id.list);
            if (recyclerView != null) {
                return new r1((FrameLayout) view, textView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static r1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_track_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public FrameLayout b() {
        return this.f21506a;
    }
}
