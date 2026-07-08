package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;
import com.dw.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FrameLayout f21603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionButton f21604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoordinatorLayout f21605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NestedScrollView f21606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f21607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f21608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ActionButton f21609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f21610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ActionButton f21611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ActionButton f21612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f21613k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AutoCompleteTextView f21614l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ActionButton f21615m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ListView f21616n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ActionButton f21617o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ActionButton f21618p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ActionButton f21619q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f21620r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ActionButton f21621s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ActionButton f21622t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CardView f21623u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ActionButton f21624v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x1 f21625w;

    private v(FrameLayout frameLayout, ActionButton actionButton, CoordinatorLayout coordinatorLayout, NestedScrollView nestedScrollView, ConstraintLayout constraintLayout, FrameLayout frameLayout2, ActionButton actionButton2, LinearLayout linearLayout, ActionButton actionButton3, ActionButton actionButton4, ImageView imageView, AutoCompleteTextView autoCompleteTextView, ActionButton actionButton5, ListView listView, ActionButton actionButton6, ActionButton actionButton7, ActionButton actionButton8, TextView textView, ActionButton actionButton9, ActionButton actionButton10, CardView cardView, ActionButton actionButton11, x1 x1Var) {
        this.f21603a = frameLayout;
        this.f21604b = actionButton;
        this.f21605c = coordinatorLayout;
        this.f21606d = nestedScrollView;
        this.f21607e = constraintLayout;
        this.f21608f = frameLayout2;
        this.f21609g = actionButton2;
        this.f21610h = linearLayout;
        this.f21611i = actionButton3;
        this.f21612j = actionButton4;
        this.f21613k = imageView;
        this.f21614l = autoCompleteTextView;
        this.f21615m = actionButton5;
        this.f21616n = listView;
        this.f21617o = actionButton6;
        this.f21618p = actionButton7;
        this.f21619q = actionButton8;
        this.f21620r = textView;
        this.f21621s = actionButton9;
        this.f21622t = actionButton10;
        this.f21623u = cardView;
        this.f21624v = actionButton11;
        this.f21625w = x1Var;
    }

    public static v a(View view) {
        int i10 = R.id.bt_back;
        ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.bt_back);
        if (actionButton != null) {
            i10 = R.id.cl;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) r1.a.a(view, R.id.cl);
            if (coordinatorLayout != null) {
                i10 = R.id.fragment_bottom_sheet;
                NestedScrollView nestedScrollView = (NestedScrollView) r1.a.a(view, R.id.fragment_bottom_sheet);
                if (nestedScrollView != null) {
                    i10 = R.id.map_c;
                    ConstraintLayout constraintLayout = (ConstraintLayout) r1.a.a(view, R.id.map_c);
                    if (constraintLayout != null) {
                        i10 = R.id.map_fragment;
                        FrameLayout frameLayout = (FrameLayout) r1.a.a(view, R.id.map_fragment);
                        if (frameLayout != null) {
                            i10 = R.id.map_layer;
                            ActionButton actionButton2 = (ActionButton) r1.a.a(view, R.id.map_layer);
                            if (actionButton2 != null) {
                                i10 = R.id.map_tools;
                                LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.map_tools);
                                if (linearLayout != null) {
                                    i10 = R.id.menu;
                                    ActionButton actionButton3 = (ActionButton) r1.a.a(view, R.id.menu);
                                    if (actionButton3 != null) {
                                        i10 = R.id.my_loc;
                                        ActionButton actionButton4 = (ActionButton) r1.a.a(view, R.id.my_loc);
                                        if (actionButton4 != null) {
                                            i10 = R.id.pin;
                                            ImageView imageView = (ImageView) r1.a.a(view, R.id.pin);
                                            if (imageView != null) {
                                                i10 = R.id.search;
                                                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) r1.a.a(view, R.id.search);
                                                if (autoCompleteTextView != null) {
                                                    i10 = R.id.search_clear;
                                                    ActionButton actionButton5 = (ActionButton) r1.a.a(view, R.id.search_clear);
                                                    if (actionButton5 != null) {
                                                        i10 = R.id.search_list;
                                                        ListView listView = (ListView) r1.a.a(view, R.id.search_list);
                                                        if (listView != null) {
                                                            i10 = R.id.search_voice_btn;
                                                            ActionButton actionButton6 = (ActionButton) r1.a.a(view, R.id.search_voice_btn);
                                                            if (actionButton6 != null) {
                                                                i10 = R.id.settings;
                                                                ActionButton actionButton7 = (ActionButton) r1.a.a(view, R.id.settings);
                                                                if (actionButton7 != null) {
                                                                    i10 = R.id.share_location;
                                                                    ActionButton actionButton8 = (ActionButton) r1.a.a(view, R.id.share_location);
                                                                    if (actionButton8 != null) {
                                                                        i10 = R.id.signature;
                                                                        TextView textView = (TextView) r1.a.a(view, R.id.signature);
                                                                        if (textView != null) {
                                                                            i10 = R.id.starred;
                                                                            ActionButton actionButton9 = (ActionButton) r1.a.a(view, R.id.starred);
                                                                            if (actionButton9 != null) {
                                                                                i10 = R.id.time;
                                                                                ActionButton actionButton10 = (ActionButton) r1.a.a(view, R.id.time);
                                                                                if (actionButton10 != null) {
                                                                                    i10 = R.id.titleBar;
                                                                                    CardView cardView = (CardView) r1.a.a(view, R.id.titleBar);
                                                                                    if (cardView != null) {
                                                                                        i10 = R.id.track;
                                                                                        ActionButton actionButton11 = (ActionButton) r1.a.a(view, R.id.track);
                                                                                        if (actionButton11 != null) {
                                                                                            i10 = R.id.zoom_controls;
                                                                                            View viewA = r1.a.a(view, R.id.zoom_controls);
                                                                                            if (viewA != null) {
                                                                                                return new v((FrameLayout) view, actionButton, coordinatorLayout, nestedScrollView, constraintLayout, frameLayout, actionButton2, linearLayout, actionButton3, actionButton4, imageView, autoCompleteTextView, actionButton5, listView, actionButton6, actionButton7, actionButton8, textView, actionButton9, actionButton10, cardView, actionButton11, x1.a(viewA));
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static v c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_c_map, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public FrameLayout b() {
        return this.f21603a;
    }
}
