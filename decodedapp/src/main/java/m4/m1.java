package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.gridlayout.widget.GridLayout;
import com.benshikj.ht.R;
import com.dw.android.widget.CardHeaderView;
import com.dw.android.widget.ListItemView;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.android.widget.SwitchPreferenceView;
import com.dw.android.widget.TintTextView;

/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    public final ListItemView A;
    public final SwitchPreferenceView B;
    public final SwitchCompat C;
    public final SwitchCompat D;
    public final NumberPreferenceView E;
    public final SwitchCompat F;
    public final NumberPreferenceView G;
    public final NumberPreferenceView H;
    public final TextView I;
    public final SwitchPreferenceView J;
    public final CardView K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScrollView f21340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SwitchCompat f21341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardView f21342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ListItemView f21343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ListItemView f21344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GridLayout f21345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NumberPreferenceView f21346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NumberPreferenceView f21347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CardView f21348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EditText f21349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SwitchCompat f21350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CardView f21351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SwitchCompat f21352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SwitchCompat f21353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final NumberPreferenceView f21354o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final NumberPreferenceView f21355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Button f21356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TintTextView f21357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CardView f21358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CardHeaderView f21359t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ListItemView f21360u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final NumberPreferenceView f21361v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final NumberPreferenceView f21362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final EditText f21363x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f21364y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final SwitchCompat f21365z;

    private m1(ScrollView scrollView, SwitchCompat switchCompat, CardView cardView, ListItemView listItemView, ListItemView listItemView2, GridLayout gridLayout, NumberPreferenceView numberPreferenceView, NumberPreferenceView numberPreferenceView2, CardView cardView2, EditText editText, SwitchCompat switchCompat2, CardView cardView3, SwitchCompat switchCompat3, SwitchCompat switchCompat4, NumberPreferenceView numberPreferenceView3, NumberPreferenceView numberPreferenceView4, Button button, TintTextView tintTextView, CardView cardView4, CardHeaderView cardHeaderView, ListItemView listItemView3, NumberPreferenceView numberPreferenceView5, NumberPreferenceView numberPreferenceView6, EditText editText2, TextView textView, SwitchCompat switchCompat5, ListItemView listItemView4, SwitchPreferenceView switchPreferenceView, SwitchCompat switchCompat6, SwitchCompat switchCompat7, NumberPreferenceView numberPreferenceView7, SwitchCompat switchCompat8, NumberPreferenceView numberPreferenceView8, NumberPreferenceView numberPreferenceView9, TextView textView2, SwitchPreferenceView switchPreferenceView2, CardView cardView5) {
        this.f21340a = scrollView;
        this.f21341b = switchCompat;
        this.f21342c = cardView;
        this.f21343d = listItemView;
        this.f21344e = listItemView2;
        this.f21345f = gridLayout;
        this.f21346g = numberPreferenceView;
        this.f21347h = numberPreferenceView2;
        this.f21348i = cardView2;
        this.f21349j = editText;
        this.f21350k = switchCompat2;
        this.f21351l = cardView3;
        this.f21352m = switchCompat3;
        this.f21353n = switchCompat4;
        this.f21354o = numberPreferenceView3;
        this.f21355p = numberPreferenceView4;
        this.f21356q = button;
        this.f21357r = tintTextView;
        this.f21358s = cardView4;
        this.f21359t = cardHeaderView;
        this.f21360u = listItemView3;
        this.f21361v = numberPreferenceView5;
        this.f21362w = numberPreferenceView6;
        this.f21363x = editText2;
        this.f21364y = textView;
        this.f21365z = switchCompat5;
        this.A = listItemView4;
        this.B = switchPreferenceView;
        this.C = switchCompat6;
        this.D = switchCompat7;
        this.E = numberPreferenceView7;
        this.F = switchCompat8;
        this.G = numberPreferenceView8;
        this.H = numberPreferenceView9;
        this.I = textView2;
        this.J = switchPreferenceView2;
        this.K = cardView5;
    }

    public static m1 a(View view) {
        int i10 = R.id.allowPositionCheck;
        SwitchCompat switchCompat = (SwitchCompat) r1.a.a(view, R.id.allowPositionCheck);
        if (switchCompat != null) {
            i10 = R.id.aprs_group;
            CardView cardView = (CardView) r1.a.a(view, R.id.aprs_group);
            if (cardView != null) {
                i10 = R.id.aprs_icon;
                ListItemView listItemView = (ListItemView) r1.a.a(view, R.id.aprs_icon);
                if (listItemView != null) {
                    i10 = R.id.aprs_path;
                    ListItemView listItemView2 = (ListItemView) r1.a.a(view, R.id.aprs_path);
                    if (listItemView2 != null) {
                        i10 = R.id.aprs_sub_group;
                        GridLayout gridLayout = (GridLayout) r1.a.a(view, R.id.aprs_sub_group);
                        if (gridLayout != null) {
                            i10 = R.id.auto_share_loc_ch;
                            NumberPreferenceView numberPreferenceView = (NumberPreferenceView) r1.a.a(view, R.id.auto_share_loc_ch);
                            if (numberPreferenceView != null) {
                                i10 = R.id.auto_share_loc_ch2;
                                NumberPreferenceView numberPreferenceView2 = (NumberPreferenceView) r1.a.a(view, R.id.auto_share_loc_ch2);
                                if (numberPreferenceView2 != null) {
                                    i10 = R.id.bss_routing_group;
                                    CardView cardView2 = (CardView) r1.a.a(view, R.id.bss_routing_group);
                                    if (cardView2 != null) {
                                        i10 = R.id.call_id;
                                        EditText editText = (EditText) r1.a.a(view, R.id.call_id);
                                        if (editText != null) {
                                            i10 = R.id.data_mode;
                                            SwitchCompat switchCompat2 = (SwitchCompat) r1.a.a(view, R.id.data_mode);
                                            if (switchCompat2 != null) {
                                                i10 = R.id.data_mode_group;
                                                CardView cardView3 = (CardView) r1.a.a(view, R.id.data_mode_group);
                                                if (cardView3 != null) {
                                                    i10 = R.id.ecc;
                                                    SwitchCompat switchCompat3 = (SwitchCompat) r1.a.a(view, R.id.ecc);
                                                    if (switchCompat3 != null) {
                                                        i10 = R.id.enable_mic_e;
                                                        SwitchCompat switchCompat4 = (SwitchCompat) r1.a.a(view, R.id.enable_mic_e);
                                                        if (switchCompat4 != null) {
                                                            i10 = R.id.format;
                                                            NumberPreferenceView numberPreferenceView3 = (NumberPreferenceView) r1.a.a(view, R.id.format);
                                                            if (numberPreferenceView3 != null) {
                                                                i10 = R.id.forward_ttl;
                                                                NumberPreferenceView numberPreferenceView4 = (NumberPreferenceView) r1.a.a(view, R.id.forward_ttl);
                                                                if (numberPreferenceView4 != null) {
                                                                    i10 = R.id.get_passcode;
                                                                    Button button = (Button) r1.a.a(view, R.id.get_passcode);
                                                                    if (button != null) {
                                                                        i10 = R.id.goToSoftwareSettings;
                                                                        TintTextView tintTextView = (TintTextView) r1.a.a(view, R.id.goToSoftwareSettings);
                                                                        if (tintTextView != null) {
                                                                            i10 = R.id.id_signaling_group;
                                                                            CardView cardView4 = (CardView) r1.a.a(view, R.id.id_signaling_group);
                                                                            if (cardView4 != null) {
                                                                                i10 = R.id.idSignalingTitle;
                                                                                CardHeaderView cardHeaderView = (CardHeaderView) r1.a.a(view, R.id.idSignalingTitle);
                                                                                if (cardHeaderView != null) {
                                                                                    i10 = R.id.identificationInformation;
                                                                                    ListItemView listItemView3 = (ListItemView) r1.a.a(view, R.id.identificationInformation);
                                                                                    if (listItemView3 != null) {
                                                                                        i10 = R.id.location_share_interval;
                                                                                        NumberPreferenceView numberPreferenceView5 = (NumberPreferenceView) r1.a.a(view, R.id.location_share_interval);
                                                                                        if (numberPreferenceView5 != null) {
                                                                                            i10 = R.id.mic_e_type;
                                                                                            NumberPreferenceView numberPreferenceView6 = (NumberPreferenceView) r1.a.a(view, R.id.mic_e_type);
                                                                                            if (numberPreferenceView6 != null) {
                                                                                                i10 = R.id.passcode;
                                                                                                EditText editText2 = (EditText) r1.a.a(view, R.id.passcode);
                                                                                                if (editText2 != null) {
                                                                                                    i10 = R.id.passcode_stat;
                                                                                                    TextView textView = (TextView) r1.a.a(view, R.id.passcode_stat);
                                                                                                    if (textView != null) {
                                                                                                        i10 = R.id.position_report_add_voltage;
                                                                                                        SwitchCompat switchCompat5 = (SwitchCompat) r1.a.a(view, R.id.position_report_add_voltage);
                                                                                                        if (switchCompat5 != null) {
                                                                                                            i10 = R.id.position_report_message;
                                                                                                            ListItemView listItemView4 = (ListItemView) r1.a.a(view, R.id.position_report_message);
                                                                                                            if (listItemView4 != null) {
                                                                                                                i10 = R.id.send_id;
                                                                                                                SwitchPreferenceView switchPreferenceView = (SwitchPreferenceView) r1.a.a(view, R.id.send_id);
                                                                                                                if (switchPreferenceView != null) {
                                                                                                                    i10 = R.id.send_id_by_aprs;
                                                                                                                    SwitchCompat switchCompat6 = (SwitchCompat) r1.a.a(view, R.id.send_id_by_aprs);
                                                                                                                    if (switchCompat6 != null) {
                                                                                                                        i10 = R.id.send_position;
                                                                                                                        SwitchCompat switchCompat7 = (SwitchCompat) r1.a.a(view, R.id.send_position);
                                                                                                                        if (switchCompat7 != null) {
                                                                                                                            i10 = R.id.send_ttl;
                                                                                                                            NumberPreferenceView numberPreferenceView7 = (NumberPreferenceView) r1.a.a(view, R.id.send_ttl);
                                                                                                                            if (numberPreferenceView7 != null) {
                                                                                                                                i10 = R.id.smart_beacon;
                                                                                                                                SwitchCompat switchCompat8 = (SwitchCompat) r1.a.a(view, R.id.smart_beacon);
                                                                                                                                if (switchCompat8 != null) {
                                                                                                                                    i10 = R.id.smart_beacon_max_interval;
                                                                                                                                    NumberPreferenceView numberPreferenceView8 = (NumberPreferenceView) r1.a.a(view, R.id.smart_beacon_max_interval);
                                                                                                                                    if (numberPreferenceView8 != null) {
                                                                                                                                        i10 = R.id.smart_beacon_min_interval;
                                                                                                                                        NumberPreferenceView numberPreferenceView9 = (NumberPreferenceView) r1.a.a(view, R.id.smart_beacon_min_interval);
                                                                                                                                        if (numberPreferenceView9 != null) {
                                                                                                                                            i10 = R.id.ssid;
                                                                                                                                            TextView textView2 = (TextView) r1.a.a(view, R.id.ssid);
                                                                                                                                            if (textView2 != null) {
                                                                                                                                                i10 = R.id.sync_settings;
                                                                                                                                                SwitchPreferenceView switchPreferenceView2 = (SwitchPreferenceView) r1.a.a(view, R.id.sync_settings);
                                                                                                                                                if (switchPreferenceView2 != null) {
                                                                                                                                                    i10 = R.id.user_info_group;
                                                                                                                                                    CardView cardView5 = (CardView) r1.a.a(view, R.id.user_info_group);
                                                                                                                                                    if (cardView5 != null) {
                                                                                                                                                        return new m1((ScrollView) view, switchCompat, cardView, listItemView, listItemView2, gridLayout, numberPreferenceView, numberPreferenceView2, cardView2, editText, switchCompat2, cardView3, switchCompat3, switchCompat4, numberPreferenceView3, numberPreferenceView4, button, tintTextView, cardView4, cardHeaderView, listItemView3, numberPreferenceView5, numberPreferenceView6, editText2, textView, switchCompat5, listItemView4, switchPreferenceView, switchCompat6, switchCompat7, numberPreferenceView7, switchCompat8, numberPreferenceView8, numberPreferenceView9, textView2, switchPreferenceView2, cardView5);
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

    public static m1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_signaling_settings, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f21340a;
    }
}
