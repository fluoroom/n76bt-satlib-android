package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f20970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f20971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayoutCompat f20972c;

    private a1(ConstraintLayout constraintLayout, RecyclerView recyclerView, LinearLayoutCompat linearLayoutCompat) {
        this.f20970a = constraintLayout;
        this.f20971b = recyclerView;
        this.f20972c = linearLayoutCompat;
    }

    public static a1 a(View view) {
        int i10 = R.id.list;
        RecyclerView recyclerView = (RecyclerView) r1.a.a(view, R.id.list);
        if (recyclerView != null) {
            i10 = R.id.title;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) r1.a.a(view, R.id.title);
            if (linearLayoutCompat != null) {
                return new a1((ConstraintLayout) view, recyclerView, linearLayoutCompat);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static a1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_ptt_action_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f20970a;
    }
}
