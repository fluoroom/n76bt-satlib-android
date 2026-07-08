package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.benshikj.ht.R;
import com.dw.android.widget.CardHeaderView;
import com.dw.android.widget.ListItemView;
import com.dw.android.widget.NumberPreferenceView;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScrollView f21100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f21101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NumberPreferenceView f21102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayoutCompat f21103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Button f21104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CardHeaderView f21105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ListItemView f21106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NumberPreferenceView f21107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ListItemView f21108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ListItemView f21109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ListItemView f21110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final NumberPreferenceView f21111l;

    private e1(ScrollView scrollView, Button button, NumberPreferenceView numberPreferenceView, LinearLayoutCompat linearLayoutCompat, Button button2, CardHeaderView cardHeaderView, ListItemView listItemView, NumberPreferenceView numberPreferenceView2, ListItemView listItemView2, ListItemView listItemView3, ListItemView listItemView4, NumberPreferenceView numberPreferenceView3) {
        this.f21100a = scrollView;
        this.f21101b = button;
        this.f21102c = numberPreferenceView;
        this.f21103d = linearLayoutCompat;
        this.f21104e = button2;
        this.f21105f = cardHeaderView;
        this.f21106g = listItemView;
        this.f21107h = numberPreferenceView2;
        this.f21108i = listItemView2;
        this.f21109j = listItemView3;
        this.f21110k = listItemView4;
        this.f21111l = numberPreferenceView3;
    }

    public static e1 a(View view) {
        int i10 = R.id.add_to_preset;
        Button button = (Button) r1.a.a(view, R.id.add_to_preset);
        if (button != null) {
            i10 = R.id.bandwidth;
            NumberPreferenceView numberPreferenceView = (NumberPreferenceView) r1.a.a(view, R.id.bandwidth);
            if (numberPreferenceView != null) {
                i10 = R.id.predefined_rf_config;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) r1.a.a(view, R.id.predefined_rf_config);
                if (linearLayoutCompat != null) {
                    i10 = R.id.preset;
                    Button button2 = (Button) r1.a.a(view, R.id.preset);
                    if (button2 != null) {
                        i10 = R.id.rf_cfg_title;
                        CardHeaderView cardHeaderView = (CardHeaderView) r1.a.a(view, R.id.rf_cfg_title);
                        if (cardHeaderView != null) {
                            i10 = R.id.rx_freq;
                            ListItemView listItemView = (ListItemView) r1.a.a(view, R.id.rx_freq);
                            if (listItemView != null) {
                                i10 = R.id.rx_sub_audio;
                                NumberPreferenceView numberPreferenceView2 = (NumberPreferenceView) r1.a.a(view, R.id.rx_sub_audio);
                                if (numberPreferenceView2 != null) {
                                    i10 = R.id.title;
                                    ListItemView listItemView2 = (ListItemView) r1.a.a(view, R.id.title);
                                    if (listItemView2 != null) {
                                        i10 = R.id.tle;
                                        ListItemView listItemView3 = (ListItemView) r1.a.a(view, R.id.tle);
                                        if (listItemView3 != null) {
                                            i10 = R.id.tx_freq;
                                            ListItemView listItemView4 = (ListItemView) r1.a.a(view, R.id.tx_freq);
                                            if (listItemView4 != null) {
                                                i10 = R.id.tx_sub_audio;
                                                NumberPreferenceView numberPreferenceView3 = (NumberPreferenceView) r1.a.a(view, R.id.tx_sub_audio);
                                                if (numberPreferenceView3 != null) {
                                                    return new e1((ScrollView) view, button, numberPreferenceView, linearLayoutCompat, button2, cardHeaderView, listItemView, numberPreferenceView2, listItemView2, listItemView3, listItemView4, numberPreferenceView3);
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

    public static e1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_satellite_editor, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f21100a;
    }
}
