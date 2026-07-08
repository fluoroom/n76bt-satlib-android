package m4;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f21002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditText f21003c;

    private b1(LinearLayout linearLayout, RecyclerView recyclerView, EditText editText) {
        this.f21001a = linearLayout;
        this.f21002b = recyclerView;
        this.f21003c = editText;
    }

    public static b1 a(View view) {
        int i10 = R.id.list;
        RecyclerView recyclerView = (RecyclerView) r1.a.a(view, R.id.list);
        if (recyclerView != null) {
            i10 = R.id.name;
            EditText editText = (EditText) r1.a.a(view, R.id.name);
            if (editText != null) {
                return new b1((LinearLayout) view, recyclerView, editText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
