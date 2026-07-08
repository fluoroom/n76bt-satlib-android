package m4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.benshikj.ht.R;
import com.dw.android.widget.ListItemView;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScrollView f21651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f21652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListItemView f21653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ListItemView f21654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ListItemView f21655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ListItemView f21656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ListItemView f21657g;

    private w0(ScrollView scrollView, LinearLayout linearLayout, ListItemView listItemView, ListItemView listItemView2, ListItemView listItemView3, ListItemView listItemView4, ListItemView listItemView5) {
        this.f21651a = scrollView;
        this.f21652b = linearLayout;
        this.f21653c = listItemView;
        this.f21654d = listItemView2;
        this.f21655e = listItemView3;
        this.f21656f = listItemView4;
        this.f21657g = listItemView5;
    }

    public static w0 a(View view) {
        int i10 = R.id.activity_settings;
        LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.activity_settings);
        if (linearLayout != null) {
            i10 = R.id.default_map;
            ListItemView listItemView = (ListItemView) r1.a.a(view, R.id.default_map);
            if (listItemView != null) {
                i10 = R.id.satellite;
                ListItemView listItemView2 = (ListItemView) r1.a.a(view, R.id.satellite);
                if (listItemView2 != null) {
                    i10 = R.id.satellite_tianditu;
                    ListItemView listItemView3 = (ListItemView) r1.a.a(view, R.id.satellite_tianditu);
                    if (listItemView3 != null) {
                        i10 = R.id.terrain;
                        ListItemView listItemView4 = (ListItemView) r1.a.a(view, R.id.terrain);
                        if (listItemView4 != null) {
                            i10 = R.id.terrain_OpenTopoMap;
                            ListItemView listItemView5 = (ListItemView) r1.a.a(view, R.id.terrain_OpenTopoMap);
                            if (listItemView5 != null) {
                                return new w0((ScrollView) view, linearLayout, listItemView, listItemView2, listItemView3, listItemView4, listItemView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
