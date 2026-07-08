package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.benshikj.ht.R;
import com.dw.android.widget.DWSwitch;
import com.dw.android.widget.ListItemView;
import com.dw.android.widget.MultiSelectListPreferenceView;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.android.widget.SwitchPreferenceView;
import com.dw.android.widget.TintTextView;

/* JADX INFO: loaded from: classes.dex */
public final class k1 {
    public final ListItemView A;
    public final TintTextView B;
    public final NumberPreferenceView C;
    public final DWSwitch D;
    public final DWSwitch E;
    public final DWSwitch F;
    public final TintTextView G;
    public final TintTextView H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScrollView f21276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f21277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TintTextView f21278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TintTextView f21279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ListItemView f21280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TintTextView f21281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f21282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NumberPreferenceView f21283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DWSwitch f21284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DWSwitch f21285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DWSwitch f21286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DWSwitch f21287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MultiSelectListPreferenceView f21288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TintTextView f21289n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final NumberPreferenceView f21290o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DWSwitch f21291p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final NumberPreferenceView f21292q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DWSwitch f21293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final NumberPreferenceView f21294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SwitchPreferenceView f21295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TintTextView f21296u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TintTextView f21297v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ListItemView f21298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ListItemView f21299x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final DWSwitch f21300y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TintTextView f21301z;

    private k1(ScrollView scrollView, CardView cardView, TintTextView tintTextView, TintTextView tintTextView2, ListItemView listItemView, TintTextView tintTextView3, TextView textView, NumberPreferenceView numberPreferenceView, DWSwitch dWSwitch, DWSwitch dWSwitch2, DWSwitch dWSwitch3, DWSwitch dWSwitch4, MultiSelectListPreferenceView multiSelectListPreferenceView, TintTextView tintTextView4, NumberPreferenceView numberPreferenceView2, DWSwitch dWSwitch5, NumberPreferenceView numberPreferenceView3, DWSwitch dWSwitch6, NumberPreferenceView numberPreferenceView4, SwitchPreferenceView switchPreferenceView, TintTextView tintTextView5, TintTextView tintTextView6, ListItemView listItemView2, ListItemView listItemView3, DWSwitch dWSwitch7, TintTextView tintTextView7, ListItemView listItemView4, TintTextView tintTextView8, NumberPreferenceView numberPreferenceView5, DWSwitch dWSwitch8, DWSwitch dWSwitch9, DWSwitch dWSwitch10, TintTextView tintTextView9, TintTextView tintTextView10) {
        this.f21276a = scrollView;
        this.f21277b = cardView;
        this.f21278c = tintTextView;
        this.f21279d = tintTextView2;
        this.f21280e = listItemView;
        this.f21281f = tintTextView3;
        this.f21282g = textView;
        this.f21283h = numberPreferenceView;
        this.f21284i = dWSwitch;
        this.f21285j = dWSwitch2;
        this.f21286k = dWSwitch3;
        this.f21287l = dWSwitch4;
        this.f21288m = multiSelectListPreferenceView;
        this.f21289n = tintTextView4;
        this.f21290o = numberPreferenceView2;
        this.f21291p = dWSwitch5;
        this.f21292q = numberPreferenceView3;
        this.f21293r = dWSwitch6;
        this.f21294s = numberPreferenceView4;
        this.f21295t = switchPreferenceView;
        this.f21296u = tintTextView5;
        this.f21297v = tintTextView6;
        this.f21298w = listItemView2;
        this.f21299x = listItemView3;
        this.f21300y = dWSwitch7;
        this.f21301z = tintTextView7;
        this.A = listItemView4;
        this.B = tintTextView8;
        this.C = numberPreferenceView5;
        this.D = dWSwitch8;
        this.E = dWSwitch9;
        this.F = dWSwitch10;
        this.G = tintTextView9;
        this.H = tintTextView10;
    }

    public static k1 a(View view) {
        int i10 = R.id.about;
        CardView cardView = (CardView) r1.a.a(view, R.id.about);
        if (cardView != null) {
            i10 = R.id.aprs_settings;
            TintTextView tintTextView = (TintTextView) r1.a.a(view, R.id.aprs_settings);
            if (tintTextView != null) {
                i10 = R.id.channel_manager;
                TintTextView tintTextView2 = (TintTextView) r1.a.a(view, R.id.channel_manager);
                if (tintTextView2 != null) {
                    i10 = R.id.check_update;
                    ListItemView listItemView = (ListItemView) r1.a.a(view, R.id.check_update);
                    if (listItemView != null) {
                        i10 = R.id.contact_us;
                        TintTextView tintTextView3 = (TintTextView) r1.a.a(view, R.id.contact_us);
                        if (tintTextView3 != null) {
                            i10 = R.id.copyright;
                            TextView textView = (TextView) r1.a.a(view, R.id.copyright);
                            if (textView != null) {
                                i10 = R.id.dtmf_speed;
                                NumberPreferenceView numberPreferenceView = (NumberPreferenceView) r1.a.a(view, R.id.dtmf_speed);
                                if (numberPreferenceView != null) {
                                    i10 = R.id.float_intercom_status;
                                    DWSwitch dWSwitch = (DWSwitch) r1.a.a(view, R.id.float_intercom_status);
                                    if (dWSwitch != null) {
                                        i10 = R.id.float_ptt;
                                        DWSwitch dWSwitch2 = (DWSwitch) r1.a.a(view, R.id.float_ptt);
                                        if (dWSwitch2 != null) {
                                            i10 = R.id.imperial_units;
                                            DWSwitch dWSwitch3 = (DWSwitch) r1.a.a(view, R.id.imperial_units);
                                            if (dWSwitch3 != null) {
                                                i10 = R.id.keep_screen_on;
                                                DWSwitch dWSwitch4 = (DWSwitch) r1.a.a(view, R.id.keep_screen_on);
                                                if (dWSwitch4 != null) {
                                                    i10 = R.id.language;
                                                    MultiSelectListPreferenceView multiSelectListPreferenceView = (MultiSelectListPreferenceView) r1.a.a(view, R.id.language);
                                                    if (multiSelectListPreferenceView != null) {
                                                        i10 = R.id.map_offline;
                                                        TintTextView tintTextView4 = (TintTextView) r1.a.a(view, R.id.map_offline);
                                                        if (tintTextView4 != null) {
                                                            i10 = R.id.mic_gain;
                                                            NumberPreferenceView numberPreferenceView2 = (NumberPreferenceView) r1.a.a(view, R.id.mic_gain);
                                                            if (numberPreferenceView2 != null) {
                                                                i10 = R.id.morse_code_ct;
                                                                DWSwitch dWSwitch5 = (DWSwitch) r1.a.a(view, R.id.morse_code_ct);
                                                                if (dWSwitch5 != null) {
                                                                    i10 = R.id.morse_code_pitch;
                                                                    NumberPreferenceView numberPreferenceView3 = (NumberPreferenceView) r1.a.a(view, R.id.morse_code_pitch);
                                                                    if (numberPreferenceView3 != null) {
                                                                        i10 = R.id.morse_code_sk;
                                                                        DWSwitch dWSwitch6 = (DWSwitch) r1.a.a(view, R.id.morse_code_sk);
                                                                        if (dWSwitch6 != null) {
                                                                            i10 = R.id.morse_code_speed;
                                                                            NumberPreferenceView numberPreferenceView4 = (NumberPreferenceView) r1.a.a(view, R.id.morse_code_speed);
                                                                            if (numberPreferenceView4 != null) {
                                                                                i10 = R.id.mute_mode_no_save;
                                                                                SwitchPreferenceView switchPreferenceView = (SwitchPreferenceView) r1.a.a(view, R.id.mute_mode_no_save);
                                                                                if (switchPreferenceView != null) {
                                                                                    i10 = R.id.open_source_license;
                                                                                    TintTextView tintTextView5 = (TintTextView) r1.a.a(view, R.id.open_source_license);
                                                                                    if (tintTextView5 != null) {
                                                                                        i10 = R.id.privacy_policy;
                                                                                        TintTextView tintTextView6 = (TintTextView) r1.a.a(view, R.id.privacy_policy);
                                                                                        if (tintTextView6 != null) {
                                                                                            i10 = R.id.ptt_actions;
                                                                                            ListItemView listItemView2 = (ListItemView) r1.a.a(view, R.id.ptt_actions);
                                                                                            if (listItemView2 != null) {
                                                                                                i10 = R.id.ptt_button;
                                                                                                ListItemView listItemView3 = (ListItemView) r1.a.a(view, R.id.ptt_button);
                                                                                                if (listItemView3 != null) {
                                                                                                    i10 = R.id.ptt_lock;
                                                                                                    DWSwitch dWSwitch7 = (DWSwitch) r1.a.a(view, R.id.ptt_lock);
                                                                                                    if (dWSwitch7 != null) {
                                                                                                        i10 = R.id.region_manager;
                                                                                                        TintTextView tintTextView7 = (TintTextView) r1.a.a(view, R.id.region_manager);
                                                                                                        if (tintTextView7 != null) {
                                                                                                            i10 = R.id.registration_number;
                                                                                                            ListItemView listItemView4 = (ListItemView) r1.a.a(view, R.id.registration_number);
                                                                                                            if (listItemView4 != null) {
                                                                                                                i10 = R.id.satelliteManager;
                                                                                                                TintTextView tintTextView8 = (TintTextView) r1.a.a(view, R.id.satelliteManager);
                                                                                                                if (tintTextView8 != null) {
                                                                                                                    i10 = R.id.save_audio;
                                                                                                                    NumberPreferenceView numberPreferenceView5 = (NumberPreferenceView) r1.a.a(view, R.id.save_audio);
                                                                                                                    if (numberPreferenceView5 != null) {
                                                                                                                        i10 = R.id.send_start_tone;
                                                                                                                        DWSwitch dWSwitch8 = (DWSwitch) r1.a.a(view, R.id.send_start_tone);
                                                                                                                        if (dWSwitch8 != null) {
                                                                                                                            i10 = R.id.send_stop_tone;
                                                                                                                            DWSwitch dWSwitch9 = (DWSwitch) r1.a.a(view, R.id.send_stop_tone);
                                                                                                                            if (dWSwitch9 != null) {
                                                                                                                                i10 = R.id.simple_mode;
                                                                                                                                DWSwitch dWSwitch10 = (DWSwitch) r1.a.a(view, R.id.simple_mode);
                                                                                                                                if (dWSwitch10 != null) {
                                                                                                                                    i10 = R.id.user_manual;
                                                                                                                                    TintTextView tintTextView9 = (TintTextView) r1.a.a(view, R.id.user_manual);
                                                                                                                                    if (tintTextView9 != null) {
                                                                                                                                        i10 = R.id.user_settings;
                                                                                                                                        TintTextView tintTextView10 = (TintTextView) r1.a.a(view, R.id.user_settings);
                                                                                                                                        if (tintTextView10 != null) {
                                                                                                                                            return new k1((ScrollView) view, cardView, tintTextView, tintTextView2, listItemView, tintTextView3, textView, numberPreferenceView, dWSwitch, dWSwitch2, dWSwitch3, dWSwitch4, multiSelectListPreferenceView, tintTextView4, numberPreferenceView2, dWSwitch5, numberPreferenceView3, dWSwitch6, numberPreferenceView4, switchPreferenceView, tintTextView5, tintTextView6, listItemView2, listItemView3, dWSwitch7, tintTextView7, listItemView4, tintTextView8, numberPreferenceView5, dWSwitch8, dWSwitch9, dWSwitch10, tintTextView9, tintTextView10);
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

    public static k1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_settings, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f21276a;
    }
}
