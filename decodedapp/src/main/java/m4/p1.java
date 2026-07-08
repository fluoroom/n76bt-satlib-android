package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import com.benshikj.ht.R;
import com.dw.android.widget.ListItemView;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScrollView f21437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f21438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Barrier f21439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActionButton f21440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SwitchCompat f21441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ListItemView f21442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Guideline f21443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ListItemView f21444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ListItemView f21445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ListItemView f21446j;

    private p1(ScrollView scrollView, CardView cardView, Barrier barrier, ActionButton actionButton, SwitchCompat switchCompat, ListItemView listItemView, Guideline guideline, ListItemView listItemView2, ListItemView listItemView3, ListItemView listItemView4) {
        this.f21437a = scrollView;
        this.f21438b = cardView;
        this.f21439c = barrier;
        this.f21440d = actionButton;
        this.f21441e = switchCompat;
        this.f21442f = listItemView;
        this.f21443g = guideline;
        this.f21444h = listItemView2;
        this.f21445i = listItemView3;
        this.f21446j = listItemView4;
    }

    public static p1 a(View view) {
        CardView cardView = (CardView) r1.a.a(view, R.id.actions);
        Barrier barrier = (Barrier) r1.a.a(view, R.id.barrier);
        int i10 = R.id.bind;
        ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.bind);
        if (actionButton != null) {
            i10 = R.id.bind_switch;
            SwitchCompat switchCompat = (SwitchCompat) r1.a.a(view, R.id.bind_switch);
            if (switchCompat != null) {
                i10 = R.id.exit;
                ListItemView listItemView = (ListItemView) r1.a.a(view, R.id.exit);
                if (listItemView != null) {
                    Guideline guideline = (Guideline) r1.a.a(view, R.id.guideline);
                    i10 = R.id.map;
                    ListItemView listItemView2 = (ListItemView) r1.a.a(view, R.id.map);
                    if (listItemView2 != null) {
                        i10 = R.id.message_list;
                        ListItemView listItemView3 = (ListItemView) r1.a.a(view, R.id.message_list);
                        if (listItemView3 != null) {
                            i10 = R.id.settings;
                            ListItemView listItemView4 = (ListItemView) r1.a.a(view, R.id.settings);
                            if (listItemView4 != null) {
                                return new p1((ScrollView) view, cardView, barrier, actionButton, switchCompat, listItemView, guideline, listItemView2, listItemView3, listItemView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static p1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_simple_mode, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f21437a;
    }
}
