package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f21097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProgressBar f21098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f21099d;

    private e0(LinearLayout linearLayout, RecyclerView recyclerView, ProgressBar progressBar, TextView textView) {
        this.f21096a = linearLayout;
        this.f21097b = recyclerView;
        this.f21098c = progressBar;
        this.f21099d = textView;
    }

    public static e0 a(View view) {
        int i10 = R.id.list;
        RecyclerView recyclerView = (RecyclerView) r1.a.a(view, R.id.list);
        if (recyclerView != null) {
            i10 = R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) r1.a.a(view, R.id.progressBar);
            if (progressBar != null) {
                i10 = R.id.status;
                TextView textView = (TextView) r1.a.a(view, R.id.status);
                if (textView != null) {
                    return new e0((LinearLayout) view, recyclerView, progressBar, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static e0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_manager_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f21096a;
    }
}
