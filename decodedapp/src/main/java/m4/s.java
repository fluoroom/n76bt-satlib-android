package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.gridlayout.widget.GridLayout;
import com.benshikj.ht.R;
import com.dw.android.widget.MultiSelectListPreferenceView;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.android.widget.TowLineTextView;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScrollView f21509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f21510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NumberPreferenceView f21511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SwitchCompat f21512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Button f21513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f21514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f21515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NumberPreferenceView f21516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TowLineTextView f21517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final GridLayout f21518j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SwitchCompat f21519k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final EditText f21520l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SwitchCompat f21521m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SwitchCompat f21522n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final EditText f21523o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f21524p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SwitchCompat f21525q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SwitchCompat f21526r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final MultiSelectListPreferenceView f21527s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SwitchCompat f21528t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f21529u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Button f21530v;

    private s(ScrollView scrollView, EditText editText, NumberPreferenceView numberPreferenceView, SwitchCompat switchCompat, Button button, ImageView imageView, FrameLayout frameLayout, NumberPreferenceView numberPreferenceView2, TowLineTextView towLineTextView, GridLayout gridLayout, SwitchCompat switchCompat2, EditText editText2, SwitchCompat switchCompat3, SwitchCompat switchCompat4, EditText editText3, TextView textView, SwitchCompat switchCompat5, SwitchCompat switchCompat6, MultiSelectListPreferenceView multiSelectListPreferenceView, SwitchCompat switchCompat7, TextView textView2, Button button2) {
        this.f21509a = scrollView;
        this.f21510b = editText;
        this.f21511c = numberPreferenceView;
        this.f21512d = switchCompat;
        this.f21513e = button;
        this.f21514f = imageView;
        this.f21515g = frameLayout;
        this.f21516h = numberPreferenceView2;
        this.f21517i = towLineTextView;
        this.f21518j = gridLayout;
        this.f21519k = switchCompat2;
        this.f21520l = editText2;
        this.f21521m = switchCompat3;
        this.f21522n = switchCompat4;
        this.f21523o = editText3;
        this.f21524p = textView;
        this.f21525q = switchCompat5;
        this.f21526r = switchCompat6;
        this.f21527s = multiSelectListPreferenceView;
        this.f21528t = switchCompat7;
        this.f21529u = textView2;
        this.f21530v = button2;
    }

    public static s a(View view) {
        int i10 = R.id.call_id;
        EditText editText = (EditText) r1.a.a(view, R.id.call_id);
        if (editText != null) {
            i10 = R.id.dist;
            NumberPreferenceView numberPreferenceView = (NumberPreferenceView) r1.a.a(view, R.id.dist);
            if (numberPreferenceView != null) {
                i10 = R.id.gateway;
                SwitchCompat switchCompat = (SwitchCompat) r1.a.a(view, R.id.gateway);
                if (switchCompat != null) {
                    i10 = R.id.get_passcode;
                    Button button = (Button) r1.a.a(view, R.id.get_passcode);
                    if (button != null) {
                        i10 = R.id.icon;
                        ImageView imageView = (ImageView) r1.a.a(view, R.id.icon);
                        if (imageView != null) {
                            i10 = R.id.icon_frame;
                            FrameLayout frameLayout = (FrameLayout) r1.a.a(view, R.id.icon_frame);
                            if (frameLayout != null) {
                                i10 = R.id.location_share_interval;
                                NumberPreferenceView numberPreferenceView2 = (NumberPreferenceView) r1.a.a(view, R.id.location_share_interval);
                                if (numberPreferenceView2 != null) {
                                    i10 = R.id.location_source;
                                    TowLineTextView towLineTextView = (TowLineTextView) r1.a.a(view, R.id.location_source);
                                    if (towLineTextView != null) {
                                        i10 = R.id.login;
                                        GridLayout gridLayout = (GridLayout) r1.a.a(view, R.id.login);
                                        if (gridLayout != null) {
                                            i10 = R.id.net2radio;
                                            SwitchCompat switchCompat2 = (SwitchCompat) r1.a.a(view, R.id.net2radio);
                                            if (switchCompat2 != null) {
                                                i10 = R.id.passcode;
                                                EditText editText2 = (EditText) r1.a.a(view, R.id.passcode);
                                                if (editText2 != null) {
                                                    i10 = R.id.position_report_add_freq;
                                                    SwitchCompat switchCompat3 = (SwitchCompat) r1.a.a(view, R.id.position_report_add_freq);
                                                    if (switchCompat3 != null) {
                                                        i10 = R.id.position_report_add_voltage;
                                                        SwitchCompat switchCompat4 = (SwitchCompat) r1.a.a(view, R.id.position_report_add_voltage);
                                                        if (switchCompat4 != null) {
                                                            i10 = R.id.position_report_message;
                                                            EditText editText3 = (EditText) r1.a.a(view, R.id.position_report_message);
                                                            if (editText3 != null) {
                                                                i10 = R.id.position_report_message_preview;
                                                                TextView textView = (TextView) r1.a.a(view, R.id.position_report_message_preview);
                                                                if (textView != null) {
                                                                    i10 = R.id.radio2net;
                                                                    SwitchCompat switchCompat5 = (SwitchCompat) r1.a.a(view, R.id.radio2net);
                                                                    if (switchCompat5 != null) {
                                                                        i10 = R.id.rx_form_net;
                                                                        SwitchCompat switchCompat6 = (SwitchCompat) r1.a.a(view, R.id.rx_form_net);
                                                                        if (switchCompat6 != null) {
                                                                            i10 = R.id.server;
                                                                            MultiSelectListPreferenceView multiSelectListPreferenceView = (MultiSelectListPreferenceView) r1.a.a(view, R.id.server);
                                                                            if (multiSelectListPreferenceView != null) {
                                                                                i10 = R.id.share_location;
                                                                                SwitchCompat switchCompat7 = (SwitchCompat) r1.a.a(view, R.id.share_location);
                                                                                if (switchCompat7 != null) {
                                                                                    i10 = R.id.ssid;
                                                                                    TextView textView2 = (TextView) r1.a.a(view, R.id.ssid);
                                                                                    if (textView2 != null) {
                                                                                        i10 = R.id.verification_passcode;
                                                                                        Button button2 = (Button) r1.a.a(view, R.id.verification_passcode);
                                                                                        if (button2 != null) {
                                                                                            return new s((ScrollView) view, editText, numberPreferenceView, switchCompat, button, imageView, frameLayout, numberPreferenceView2, towLineTextView, gridLayout, switchCompat2, editText2, switchCompat3, switchCompat4, editText3, textView, switchCompat5, switchCompat6, multiSelectListPreferenceView, switchCompat7, textView2, button2);
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

    public static s c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_aprs_settings, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f21509a;
    }
}
