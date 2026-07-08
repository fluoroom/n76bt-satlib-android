package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import com.benshikj.ht.R;
import com.dw.android.widget.ListItemView;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.android.widget.TintTextView;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScrollView f21666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NumberPreferenceView f21667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SwitchCompat f21668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NumberPreferenceView f21669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TintTextView f21670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SwitchCompat f21671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EditText f21672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SwitchCompat f21673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SwitchCompat f21674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SwitchCompat f21675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final NumberPreferenceView f21676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ListItemView f21677l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final NumberPreferenceView f21678m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SwitchCompat f21679n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SwitchCompat f21680o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final NumberPreferenceView f21681p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinearLayoutCompat f21682q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final NumberPreferenceView f21683r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SwitchCompat f21684s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ListItemView f21685t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final NumberPreferenceView f21686u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final NumberPreferenceView f21687v;

    private x(ScrollView scrollView, NumberPreferenceView numberPreferenceView, SwitchCompat switchCompat, NumberPreferenceView numberPreferenceView2, TintTextView tintTextView, SwitchCompat switchCompat2, EditText editText, SwitchCompat switchCompat3, SwitchCompat switchCompat4, SwitchCompat switchCompat5, NumberPreferenceView numberPreferenceView3, ListItemView listItemView, NumberPreferenceView numberPreferenceView4, SwitchCompat switchCompat6, SwitchCompat switchCompat7, NumberPreferenceView numberPreferenceView5, LinearLayoutCompat linearLayoutCompat, NumberPreferenceView numberPreferenceView6, SwitchCompat switchCompat8, ListItemView listItemView2, NumberPreferenceView numberPreferenceView7, NumberPreferenceView numberPreferenceView8) {
        this.f21666a = scrollView;
        this.f21667b = numberPreferenceView;
        this.f21668c = switchCompat;
        this.f21669d = numberPreferenceView2;
        this.f21670e = tintTextView;
        this.f21671f = switchCompat2;
        this.f21672g = editText;
        this.f21673h = switchCompat3;
        this.f21674i = switchCompat4;
        this.f21675j = switchCompat5;
        this.f21676k = numberPreferenceView3;
        this.f21677l = listItemView;
        this.f21678m = numberPreferenceView4;
        this.f21679n = switchCompat6;
        this.f21680o = switchCompat7;
        this.f21681p = numberPreferenceView5;
        this.f21682q = linearLayoutCompat;
        this.f21683r = numberPreferenceView6;
        this.f21684s = switchCompat8;
        this.f21685t = listItemView2;
        this.f21686u = numberPreferenceView7;
        this.f21687v = numberPreferenceView8;
    }

    public static x a(View view) {
        int i10 = R.id.bandwidth;
        NumberPreferenceView numberPreferenceView = (NumberPreferenceView) r1.a.a(view, R.id.bandwidth);
        if (numberPreferenceView != null) {
            i10 = R.id.bclo;
            SwitchCompat switchCompat = (SwitchCompat) r1.a.a(view, R.id.bclo);
            if (switchCompat != null) {
                i10 = R.id.group_id;
                NumberPreferenceView numberPreferenceView2 = (NumberPreferenceView) r1.a.a(view, R.id.group_id);
                if (numberPreferenceView2 != null) {
                    i10 = R.id.more;
                    TintTextView tintTextView = (TintTextView) r1.a.a(view, R.id.more);
                    if (tintTextView != null) {
                        i10 = R.id.mute;
                        SwitchCompat switchCompat2 = (SwitchCompat) r1.a.a(view, R.id.mute);
                        if (switchCompat2 != null) {
                            i10 = R.id.name;
                            EditText editText = (EditText) r1.a.a(view, R.id.name);
                            if (editText != null) {
                                i10 = R.id.offline;
                                SwitchCompat switchCompat3 = (SwitchCompat) r1.a.a(view, R.id.offline);
                                if (switchCompat3 != null) {
                                    i10 = R.id.pre_de_emph;
                                    SwitchCompat switchCompat4 = (SwitchCompat) r1.a.a(view, R.id.pre_de_emph);
                                    if (switchCompat4 != null) {
                                        i10 = R.id.rev;
                                        SwitchCompat switchCompat5 = (SwitchCompat) r1.a.a(view, R.id.rev);
                                        if (switchCompat5 != null) {
                                            i10 = R.id.rx_color;
                                            NumberPreferenceView numberPreferenceView3 = (NumberPreferenceView) r1.a.a(view, R.id.rx_color);
                                            if (numberPreferenceView3 != null) {
                                                i10 = R.id.rx_freq;
                                                ListItemView listItemView = (ListItemView) r1.a.a(view, R.id.rx_freq);
                                                if (listItemView != null) {
                                                    i10 = R.id.rx_sub_audio;
                                                    NumberPreferenceView numberPreferenceView4 = (NumberPreferenceView) r1.a.a(view, R.id.rx_sub_audio);
                                                    if (numberPreferenceView4 != null) {
                                                        i10 = R.id.scan;
                                                        SwitchCompat switchCompat6 = (SwitchCompat) r1.a.a(view, R.id.scan);
                                                        if (switchCompat6 != null) {
                                                            i10 = R.id.sign;
                                                            SwitchCompat switchCompat7 = (SwitchCompat) r1.a.a(view, R.id.sign);
                                                            if (switchCompat7 != null) {
                                                                i10 = R.id.slot;
                                                                NumberPreferenceView numberPreferenceView5 = (NumberPreferenceView) r1.a.a(view, R.id.slot);
                                                                if (numberPreferenceView5 != null) {
                                                                    i10 = R.id.title_container;
                                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) r1.a.a(view, R.id.title_container);
                                                                    if (linearLayoutCompat != null) {
                                                                        i10 = R.id.tx_color;
                                                                        NumberPreferenceView numberPreferenceView6 = (NumberPreferenceView) r1.a.a(view, R.id.tx_color);
                                                                        if (numberPreferenceView6 != null) {
                                                                            i10 = R.id.tx_disable;
                                                                            SwitchCompat switchCompat8 = (SwitchCompat) r1.a.a(view, R.id.tx_disable);
                                                                            if (switchCompat8 != null) {
                                                                                i10 = R.id.tx_freq;
                                                                                ListItemView listItemView2 = (ListItemView) r1.a.a(view, R.id.tx_freq);
                                                                                if (listItemView2 != null) {
                                                                                    i10 = R.id.tx_power;
                                                                                    NumberPreferenceView numberPreferenceView7 = (NumberPreferenceView) r1.a.a(view, R.id.tx_power);
                                                                                    if (numberPreferenceView7 != null) {
                                                                                        i10 = R.id.tx_sub_audio;
                                                                                        NumberPreferenceView numberPreferenceView8 = (NumberPreferenceView) r1.a.a(view, R.id.tx_sub_audio);
                                                                                        if (numberPreferenceView8 != null) {
                                                                                            return new x((ScrollView) view, numberPreferenceView, switchCompat, numberPreferenceView2, tintTextView, switchCompat2, editText, switchCompat3, switchCompat4, switchCompat5, numberPreferenceView3, listItemView, numberPreferenceView4, switchCompat6, switchCompat7, numberPreferenceView5, linearLayoutCompat, numberPreferenceView6, switchCompat8, listItemView2, numberPreferenceView7, numberPreferenceView8);
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

    public static x c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_channel_editor, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f21666a;
    }
}
