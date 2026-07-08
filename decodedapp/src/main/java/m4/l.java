package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayoutCompat f21302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f21303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u1 f21304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ListView f21305d;

    private l(LinearLayoutCompat linearLayoutCompat, FrameLayout frameLayout, u1 u1Var, ListView listView) {
        this.f21302a = linearLayoutCompat;
        this.f21303b = frameLayout;
        this.f21304c = u1Var;
        this.f21305d = listView;
    }

    public static l a(View view) {
        int i10 = R.id.control;
        FrameLayout frameLayout = (FrameLayout) r1.a.a(view, R.id.control);
        if (frameLayout != null) {
            i10 = R.id.header;
            View viewA = r1.a.a(view, R.id.header);
            if (viewA != null) {
                u1 u1VarA = u1.a(viewA);
                ListView listView = (ListView) r1.a.a(view, R.id.list);
                if (listView != null) {
                    return new l((LinearLayoutCompat) view, frameLayout, u1VarA, listView);
                }
                i10 = R.id.list;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static l c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.drawer_bt, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayoutCompat b() {
        return this.f21302a;
    }
}
