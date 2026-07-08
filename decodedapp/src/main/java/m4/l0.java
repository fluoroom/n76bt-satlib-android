package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionButton f21307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f21308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f21309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ActionButton f21310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SwipeRefreshLayout f21311f;

    private l0(LinearLayout linearLayout, ActionButton actionButton, RecyclerView recyclerView, LinearLayout linearLayout2, ActionButton actionButton2, SwipeRefreshLayout swipeRefreshLayout) {
        this.f21306a = linearLayout;
        this.f21307b = actionButton;
        this.f21308c = recyclerView;
        this.f21309d = linearLayout2;
        this.f21310e = actionButton2;
        this.f21311f = swipeRefreshLayout;
    }

    public static l0 a(View view) {
        int i10 = R.id.add;
        ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.add);
        if (actionButton != null) {
            i10 = R.id.chs;
            RecyclerView recyclerView = (RecyclerView) r1.a.a(view, R.id.chs);
            if (recyclerView != null) {
                i10 = R.id.controls;
                LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.controls);
                if (linearLayout != null) {
                    i10 = R.id.deviceManager;
                    ActionButton actionButton2 = (ActionButton) r1.a.a(view, R.id.deviceManager);
                    if (actionButton2 != null) {
                        i10 = R.id.swipeRefresh;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) r1.a.a(view, R.id.swipeRefresh);
                        if (swipeRefreshLayout != null) {
                            return new l0((LinearLayout) view, actionButton, recyclerView, linearLayout, actionButton2, swipeRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static l0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_ii_control, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f21306a;
    }
}
