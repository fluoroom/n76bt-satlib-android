package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.benshikj.ht.R;
import com.dw.android.widget.CardHeaderView;
import com.dw.android.widget.DWSwitch;
import com.dw.android.widget.ListItemView;
import com.dw.android.widget.TintTextView;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScrollView f21263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f21264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListItemView f21265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TintTextView f21266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f21267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CardHeaderView f21268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f21269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TintTextView f21270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DWSwitch f21271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ListItemView f21272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CardView f21273k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TintTextView f21274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final DWSwitch f21275m;

    private k0(ScrollView scrollView, CardView cardView, ListItemView listItemView, TintTextView tintTextView, TextView textView, CardHeaderView cardHeaderView, LinearLayout linearLayout, TintTextView tintTextView2, DWSwitch dWSwitch, ListItemView listItemView2, CardView cardView2, TintTextView tintTextView3, DWSwitch dWSwitch2) {
        this.f21263a = scrollView;
        this.f21264b = cardView;
        this.f21265c = listItemView;
        this.f21266d = tintTextView;
        this.f21267e = textView;
        this.f21268f = cardHeaderView;
        this.f21269g = linearLayout;
        this.f21270h = tintTextView2;
        this.f21271i = dWSwitch;
        this.f21272j = listItemView2;
        this.f21273k = cardView2;
        this.f21274l = tintTextView3;
        this.f21275m = dWSwitch2;
    }

    public static k0 a(View view) {
        int i10 = R.id.about;
        CardView cardView = (CardView) r1.a.a(view, R.id.about);
        if (cardView != null) {
            i10 = R.id.advanced_device_settings;
            ListItemView listItemView = (ListItemView) r1.a.a(view, R.id.advanced_device_settings);
            if (listItemView != null) {
                i10 = R.id.contact_us;
                TintTextView tintTextView = (TintTextView) r1.a.a(view, R.id.contact_us);
                if (tintTextView != null) {
                    i10 = R.id.dev_status;
                    TextView textView = (TextView) r1.a.a(view, R.id.dev_status);
                    if (textView != null) {
                        i10 = R.id.dev_status_h;
                        CardHeaderView cardHeaderView = (CardHeaderView) r1.a.a(view, R.id.dev_status_h);
                        if (cardHeaderView != null) {
                            i10 = R.id.firmware_check_update;
                            LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.firmware_check_update);
                            if (linearLayout != null) {
                                i10 = R.id.firmware_version;
                                TintTextView tintTextView2 = (TintTextView) r1.a.a(view, R.id.firmware_version);
                                if (tintTextView2 != null) {
                                    i10 = R.id.icom_mode;
                                    DWSwitch dWSwitch = (DWSwitch) r1.a.a(view, R.id.icom_mode);
                                    if (dWSwitch != null) {
                                        i10 = R.id.programmable_button;
                                        ListItemView listItemView2 = (ListItemView) r1.a.a(view, R.id.programmable_button);
                                        if (listItemView2 != null) {
                                            i10 = R.id.settings;
                                            CardView cardView2 = (CardView) r1.a.a(view, R.id.settings);
                                            if (cardView2 != null) {
                                                i10 = R.id.user_manual;
                                                TintTextView tintTextView3 = (TintTextView) r1.a.a(view, R.id.user_manual);
                                                if (tintTextView3 != null) {
                                                    i10 = R.id.yaesuMode;
                                                    DWSwitch dWSwitch2 = (DWSwitch) r1.a.a(view, R.id.yaesuMode);
                                                    if (dWSwitch2 != null) {
                                                        return new k0((ScrollView) view, cardView, listItemView, tintTextView, textView, cardHeaderView, linearLayout, tintTextView2, dWSwitch, listItemView2, cardView2, tintTextView3, dWSwitch2);
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

    public static k0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_hand_mic_settings, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f21263a;
    }
}
