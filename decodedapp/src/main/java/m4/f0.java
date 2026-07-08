package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.benshikj.ht.R;
import com.dw.android.widget.CardHeaderView;
import com.dw.android.widget.ListItemView;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.android.widget.TintTextView;
import com.xw.repo.BubbleSeekBar;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScrollView f21116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f21117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListItemView f21118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SeekBar f21119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TintTextView f21120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f21121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CardHeaderView f21122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NumberPreferenceView f21123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinearLayout f21124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TintTextView f21125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ListItemView f21126k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ListItemView f21127l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final NumberPreferenceView f21128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ListItemView f21129n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ListItemView f21130o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ListItemView f21131p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ListItemView f21132q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final BubbleSeekBar f21133r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TintTextView f21134s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BubbleSeekBar f21135t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f21136u;

    private f0(ScrollView scrollView, CardView cardView, ListItemView listItemView, SeekBar seekBar, TintTextView tintTextView, TextView textView, CardHeaderView cardHeaderView, NumberPreferenceView numberPreferenceView, LinearLayout linearLayout, TintTextView tintTextView2, ListItemView listItemView2, ListItemView listItemView3, NumberPreferenceView numberPreferenceView2, ListItemView listItemView4, ListItemView listItemView5, ListItemView listItemView6, ListItemView listItemView7, BubbleSeekBar bubbleSeekBar, TintTextView tintTextView3, BubbleSeekBar bubbleSeekBar2, TextView textView2) {
        this.f21116a = scrollView;
        this.f21117b = cardView;
        this.f21118c = listItemView;
        this.f21119d = seekBar;
        this.f21120e = tintTextView;
        this.f21121f = textView;
        this.f21122g = cardHeaderView;
        this.f21123h = numberPreferenceView;
        this.f21124i = linearLayout;
        this.f21125j = tintTextView2;
        this.f21126k = listItemView2;
        this.f21127l = listItemView3;
        this.f21128m = numberPreferenceView2;
        this.f21129n = listItemView4;
        this.f21130o = listItemView5;
        this.f21131p = listItemView6;
        this.f21132q = listItemView7;
        this.f21133r = bubbleSeekBar;
        this.f21134s = tintTextView3;
        this.f21135t = bubbleSeekBar2;
        this.f21136u = textView2;
    }

    public static f0 a(View view) {
        int i10 = R.id.about;
        CardView cardView = (CardView) r1.a.a(view, R.id.about);
        if (cardView != null) {
            i10 = R.id.advanced_device_settings;
            ListItemView listItemView = (ListItemView) r1.a.a(view, R.id.advanced_device_settings);
            if (listItemView != null) {
                i10 = R.id.bt_mic_gain;
                SeekBar seekBar = (SeekBar) r1.a.a(view, R.id.bt_mic_gain);
                if (seekBar != null) {
                    i10 = R.id.contact_us;
                    TintTextView tintTextView = (TintTextView) r1.a.a(view, R.id.contact_us);
                    if (tintTextView != null) {
                        i10 = R.id.dev_status;
                        TextView textView = (TextView) r1.a.a(view, R.id.dev_status);
                        if (textView != null) {
                            i10 = R.id.dev_status_h;
                            CardHeaderView cardHeaderView = (CardHeaderView) r1.a.a(view, R.id.dev_status_h);
                            if (cardHeaderView != null) {
                                i10 = R.id.device_speaker;
                                NumberPreferenceView numberPreferenceView = (NumberPreferenceView) r1.a.a(view, R.id.device_speaker);
                                if (numberPreferenceView != null) {
                                    i10 = R.id.firmware_check_update;
                                    LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.firmware_check_update);
                                    if (linearLayout != null) {
                                        i10 = R.id.firmware_version;
                                        TintTextView tintTextView2 = (TintTextView) r1.a.a(view, R.id.firmware_version);
                                        if (tintTextView2 != null) {
                                            i10 = R.id.freq_scan;
                                            ListItemView listItemView2 = (ListItemView) r1.a.a(view, R.id.freq_scan);
                                            if (listItemView2 != null) {
                                                i10 = R.id.general_settings;
                                                ListItemView listItemView3 = (ListItemView) r1.a.a(view, R.id.general_settings);
                                                if (listItemView3 != null) {
                                                    i10 = R.id.hm_speaker;
                                                    NumberPreferenceView numberPreferenceView2 = (NumberPreferenceView) r1.a.a(view, R.id.hm_speaker);
                                                    if (numberPreferenceView2 != null) {
                                                        i10 = R.id.link_manager;
                                                        ListItemView listItemView4 = (ListItemView) r1.a.a(view, R.id.link_manager);
                                                        if (listItemView4 != null) {
                                                            i10 = R.id.programmable_button;
                                                            ListItemView listItemView5 = (ListItemView) r1.a.a(view, R.id.programmable_button);
                                                            if (listItemView5 != null) {
                                                                i10 = R.id.region_manager;
                                                                ListItemView listItemView6 = (ListItemView) r1.a.a(view, R.id.region_manager);
                                                                if (listItemView6 != null) {
                                                                    i10 = R.id.signaling_settings;
                                                                    ListItemView listItemView7 = (ListItemView) r1.a.a(view, R.id.signaling_settings);
                                                                    if (listItemView7 != null) {
                                                                        i10 = R.id.squelch_level;
                                                                        BubbleSeekBar bubbleSeekBar = (BubbleSeekBar) r1.a.a(view, R.id.squelch_level);
                                                                        if (bubbleSeekBar != null) {
                                                                            i10 = R.id.user_manual;
                                                                            TintTextView tintTextView3 = (TintTextView) r1.a.a(view, R.id.user_manual);
                                                                            if (tintTextView3 != null) {
                                                                                i10 = R.id.vol;
                                                                                BubbleSeekBar bubbleSeekBar2 = (BubbleSeekBar) r1.a.a(view, R.id.vol);
                                                                                if (bubbleSeekBar2 != null) {
                                                                                    i10 = R.id.vol_label;
                                                                                    TextView textView2 = (TextView) r1.a.a(view, R.id.vol_label);
                                                                                    if (textView2 != null) {
                                                                                        return new f0((ScrollView) view, cardView, listItemView, seekBar, tintTextView, textView, cardHeaderView, numberPreferenceView, linearLayout, tintTextView2, listItemView2, listItemView3, numberPreferenceView2, listItemView4, listItemView5, listItemView6, listItemView7, bubbleSeekBar, tintTextView3, bubbleSeekBar2, textView2);
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

    public static f0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_settings, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f21116a;
    }
}
