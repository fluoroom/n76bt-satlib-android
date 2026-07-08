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
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f21367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProgressBar f21368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f21369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f21370e;

    private n(LinearLayout linearLayout, RecyclerView recyclerView, ProgressBar progressBar, LinearLayout linearLayout2, TextView textView) {
        this.f21366a = linearLayout;
        this.f21367b = recyclerView;
        this.f21368c = progressBar;
        this.f21369d = linearLayout2;
        this.f21370e = textView;
    }

    public static n a(View view) {
        int i10 = R.id.list;
        RecyclerView recyclerView = (RecyclerView) r1.a.a(view, R.id.list);
        if (recyclerView != null) {
            i10 = R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) r1.a.a(view, R.id.progressBar);
            if (progressBar != null) {
                i10 = R.id.scanning;
                LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.scanning);
                if (linearLayout != null) {
                    i10 = R.id.usb;
                    TextView textView = (TextView) r1.a.a(view, R.id.usb);
                    if (textView != null) {
                        return new n((LinearLayout) view, recyclerView, progressBar, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static n c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.factory_fragment_device_manager, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f21366a;
    }
}
