package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.android.widget.TintTextView;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TintTextView f21689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f21690c;

    private x0(ConstraintLayout constraintLayout, TintTextView tintTextView, RecyclerView recyclerView) {
        this.f21688a = constraintLayout;
        this.f21689b = tintTextView;
        this.f21690c = recyclerView;
    }

    public static x0 a(View view) {
        int i10 = R.id.hint;
        TintTextView tintTextView = (TintTextView) r1.a.a(view, R.id.hint);
        if (tintTextView != null) {
            i10 = R.id.list;
            RecyclerView recyclerView = (RecyclerView) r1.a.a(view, R.id.list);
            if (recyclerView != null) {
                return new x0((ConstraintLayout) view, tintTextView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static x0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_programmable_button, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21688a;
    }
}
