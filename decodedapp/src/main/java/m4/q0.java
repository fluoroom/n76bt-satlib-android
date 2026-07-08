package m4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RecyclerView f21450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f21451b;

    private q0(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f21450a = recyclerView;
        this.f21451b = recyclerView2;
    }

    public static q0 a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new q0(recyclerView, recyclerView);
    }
}
