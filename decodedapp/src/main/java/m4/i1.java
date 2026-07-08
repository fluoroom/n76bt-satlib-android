package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.android.widget.ListItemView;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListItemView f21233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionButton f21234c;

    private i1(ConstraintLayout constraintLayout, ListItemView listItemView, ActionButton actionButton) {
        this.f21232a = constraintLayout;
        this.f21233b = listItemView;
        this.f21234c = actionButton;
    }

    public static i1 a(View view) {
        int i10 = R.id.item;
        ListItemView listItemView = (ListItemView) r1.a.a(view, R.id.item);
        if (listItemView != null) {
            i10 = R.id.to_map;
            ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.to_map);
            if (actionButton != null) {
                return new i1((ConstraintLayout) view, listItemView, actionButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static i1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_satellite_list_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21232a;
    }
}
