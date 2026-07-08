package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import com.benshikj.ht.R;
import com.dw.android.widget.CardHeaderView;
import com.dw.android.widget.ListItemView;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.android.widget.SwitchPreferenceView;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScrollView f21575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SwitchCompat f21576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SwitchCompat f21577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayoutCompat f21578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CardView f21579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CardView f21580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SwitchCompat f21581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NumberPreferenceView f21582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Button f21583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CardHeaderView f21584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CardView f21585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final NumberPreferenceView f21586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final NumberPreferenceView f21587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SwitchCompat f21588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ListItemView f21589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CardView f21590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SwitchPreferenceView f21591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SwitchCompat f21592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SwitchCompat f21593s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final NumberPreferenceView f21594t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SwitchCompat f21595u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SwitchCompat f21596v;

    private u(ScrollView scrollView, SwitchCompat switchCompat, SwitchCompat switchCompat2, LinearLayoutCompat linearLayoutCompat, CardView cardView, CardView cardView2, SwitchCompat switchCompat3, NumberPreferenceView numberPreferenceView, Button button, CardHeaderView cardHeaderView, CardView cardView3, NumberPreferenceView numberPreferenceView2, NumberPreferenceView numberPreferenceView3, SwitchCompat switchCompat4, ListItemView listItemView, CardView cardView4, SwitchPreferenceView switchPreferenceView, SwitchCompat switchCompat5, SwitchCompat switchCompat6, NumberPreferenceView numberPreferenceView4, SwitchCompat switchCompat7, SwitchCompat switchCompat8) {
        this.f21575a = scrollView;
        this.f21576b = switchCompat;
        this.f21577c = switchCompat2;
        this.f21578d = linearLayoutCompat;
        this.f21579e = cardView;
        this.f21580f = cardView2;
        this.f21581g = switchCompat3;
        this.f21582h = numberPreferenceView;
        this.f21583i = button;
        this.f21584j = cardHeaderView;
        this.f21585k = cardView3;
        this.f21586l = numberPreferenceView2;
        this.f21587m = numberPreferenceView3;
        this.f21588n = switchCompat4;
        this.f21589o = listItemView;
        this.f21590p = cardView4;
        this.f21591q = switchPreferenceView;
        this.f21592r = switchCompat5;
        this.f21593s = switchCompat6;
        this.f21594t = numberPreferenceView4;
        this.f21595u = switchCompat7;
        this.f21596v = switchCompat8;
    }

    public static u a(View view) {
        int i10 = R.id.allowPositionCheck;
        SwitchCompat switchCompat = (SwitchCompat) r1.a.a(view, R.id.allowPositionCheck);
        if (switchCompat != null) {
            i10 = R.id.allowPositionCheck_ii;
            SwitchCompat switchCompat2 = (SwitchCompat) r1.a.a(view, R.id.allowPositionCheck_ii);
            if (switchCompat2 != null) {
                i10 = R.id.aprs_settings;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) r1.a.a(view, R.id.aprs_settings);
                if (linearLayoutCompat != null) {
                    i10 = R.id.auto_share_location;
                    CardView cardView = (CardView) r1.a.a(view, R.id.auto_share_location);
                    if (cardView != null) {
                        i10 = R.id.bss_routing_group;
                        CardView cardView2 = (CardView) r1.a.a(view, R.id.bss_routing_group);
                        if (cardView2 != null) {
                            i10 = R.id.ecc;
                            SwitchCompat switchCompat3 = (SwitchCompat) r1.a.a(view, R.id.ecc);
                            if (switchCompat3 != null) {
                                i10 = R.id.forward_ttl;
                                NumberPreferenceView numberPreferenceView = (NumberPreferenceView) r1.a.a(view, R.id.forward_ttl);
                                if (numberPreferenceView != null) {
                                    i10 = R.id.go_aprs_settings;
                                    Button button = (Button) r1.a.a(view, R.id.go_aprs_settings);
                                    if (button != null) {
                                        i10 = R.id.idSignalingRadioTitle;
                                        CardHeaderView cardHeaderView = (CardHeaderView) r1.a.a(view, R.id.idSignalingRadioTitle);
                                        if (cardHeaderView != null) {
                                            i10 = R.id.f4941ii;
                                            CardView cardView3 = (CardView) r1.a.a(view, R.id.f4941ii);
                                            if (cardView3 != null) {
                                                i10 = R.id.location_share_interval;
                                                NumberPreferenceView numberPreferenceView2 = (NumberPreferenceView) r1.a.a(view, R.id.location_share_interval);
                                                if (numberPreferenceView2 != null) {
                                                    i10 = R.id.location_share_interval_internet;
                                                    NumberPreferenceView numberPreferenceView3 = (NumberPreferenceView) r1.a.a(view, R.id.location_share_interval_internet);
                                                    if (numberPreferenceView3 != null) {
                                                        i10 = R.id.position_report_add_voltage;
                                                        SwitchCompat switchCompat4 = (SwitchCompat) r1.a.a(view, R.id.position_report_add_voltage);
                                                        if (switchCompat4 != null) {
                                                            i10 = R.id.position_report_message;
                                                            ListItemView listItemView = (ListItemView) r1.a.a(view, R.id.position_report_message);
                                                            if (listItemView != null) {
                                                                i10 = R.id.f4950rf;
                                                                CardView cardView4 = (CardView) r1.a.a(view, R.id.f4950rf);
                                                                if (cardView4 != null) {
                                                                    i10 = R.id.send_id;
                                                                    SwitchPreferenceView switchPreferenceView = (SwitchPreferenceView) r1.a.a(view, R.id.send_id);
                                                                    if (switchPreferenceView != null) {
                                                                        i10 = R.id.send_position;
                                                                        SwitchCompat switchCompat5 = (SwitchCompat) r1.a.a(view, R.id.send_position);
                                                                        if (switchCompat5 != null) {
                                                                            i10 = R.id.send_position_ii;
                                                                            SwitchCompat switchCompat6 = (SwitchCompat) r1.a.a(view, R.id.send_position_ii);
                                                                            if (switchCompat6 != null) {
                                                                                i10 = R.id.send_ttl;
                                                                                NumberPreferenceView numberPreferenceView4 = (NumberPreferenceView) r1.a.a(view, R.id.send_ttl);
                                                                                if (numberPreferenceView4 != null) {
                                                                                    i10 = R.id.share_location_by_aprs;
                                                                                    SwitchCompat switchCompat7 = (SwitchCompat) r1.a.a(view, R.id.share_location_by_aprs);
                                                                                    if (switchCompat7 != null) {
                                                                                        i10 = R.id.smart_beacon;
                                                                                        SwitchCompat switchCompat8 = (SwitchCompat) r1.a.a(view, R.id.smart_beacon);
                                                                                        if (switchCompat8 != null) {
                                                                                            return new u((ScrollView) view, switchCompat, switchCompat2, linearLayoutCompat, cardView, cardView2, switchCompat3, numberPreferenceView, button, cardHeaderView, cardView3, numberPreferenceView2, numberPreferenceView3, switchCompat4, listItemView, cardView4, switchPreferenceView, switchCompat5, switchCompat6, numberPreferenceView4, switchCompat7, switchCompat8);
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

    public static u c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_bss_settings, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f21575a;
    }
}
