package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScrollView f21052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f21053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f21054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f21055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f21056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f21057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f21058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f21059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f21060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f21061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f21062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f21063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f21064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f21065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f21066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f21067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f21068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f21069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f21070s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f21071t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f21072u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f21073v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f21074w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f21075x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f21076y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f21077z;

    private d1(ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27, TextView textView28, TextView textView29) {
        this.f21052a = scrollView;
        this.f21053b = textView;
        this.f21054c = textView2;
        this.f21055d = textView3;
        this.f21056e = textView4;
        this.f21057f = textView5;
        this.f21058g = textView6;
        this.f21059h = textView7;
        this.f21060i = textView8;
        this.f21061j = textView9;
        this.f21062k = textView10;
        this.f21063l = textView11;
        this.f21064m = textView12;
        this.f21065n = textView13;
        this.f21066o = textView14;
        this.f21067p = textView15;
        this.f21068q = textView16;
        this.f21069r = textView17;
        this.f21070s = textView18;
        this.f21071t = textView19;
        this.f21072u = textView20;
        this.f21073v = textView21;
        this.f21074w = textView22;
        this.f21075x = textView23;
        this.f21076y = textView24;
        this.f21077z = textView25;
        this.A = textView26;
        this.B = textView27;
        this.C = textView28;
        this.D = textView29;
    }

    public static d1 a(View view) {
        int i10 = R.id.agc;
        TextView textView = (TextView) r1.a.a(view, R.id.agc);
        if (textView != null) {
            i10 = R.id.aou_is_active;
            TextView textView2 = (TextView) r1.a.a(view, R.id.aou_is_active);
            if (textView2 != null) {
                i10 = R.id.dis_module_power;
                TextView textView3 = (TextView) r1.a.a(view, R.id.dis_module_power);
                if (textView3 != null) {
                    i10 = R.id.dsp_is_connected;
                    TextView textView4 = (TextView) r1.a.a(view, R.id.dsp_is_connected);
                    if (textView4 != null) {
                        i10 = R.id.eeprom_write_times;
                        TextView textView5 = (TextView) r1.a.a(view, R.id.eeprom_write_times);
                        if (textView5 != null) {
                            i10 = R.id.gdi_com_lost;
                            TextView textView6 = (TextView) r1.a.a(view, R.id.gdi_com_lost);
                            if (textView6 != null) {
                                i10 = R.id.gps_last_lock_time;
                                TextView textView7 = (TextView) r1.a.a(view, R.id.gps_last_lock_time);
                                if (textView7 != null) {
                                    i10 = R.id.gps_lock_time;
                                    TextView textView8 = (TextView) r1.a.a(view, R.id.gps_lock_time);
                                    if (textView8 != null) {
                                        i10 = R.id.gps_module_power;
                                        TextView textView9 = (TextView) r1.a.a(view, R.id.gps_module_power);
                                        if (textView9 != null) {
                                            i10 = R.id.gps_updates_min_time;
                                            TextView textView10 = (TextView) r1.a.a(view, R.id.gps_updates_min_time);
                                            if (textView10 != null) {
                                                i10 = R.id.i2c_err_times;
                                                TextView textView11 = (TextView) r1.a.a(view, R.id.i2c_err_times);
                                                if (textView11 != null) {
                                                    i10 = R.id.load_ch_times;
                                                    TextView textView12 = (TextView) r1.a.a(view, R.id.load_ch_times);
                                                    if (textView12 != null) {
                                                        i10 = R.id.malloc_slots;
                                                        TextView textView13 = (TextView) r1.a.a(view, R.id.malloc_slots);
                                                        if (textView13 != null) {
                                                            i10 = R.id.noise;
                                                            TextView textView14 = (TextView) r1.a.a(view, R.id.noise);
                                                            if (textView14 != null) {
                                                                i10 = R.id.noise2;
                                                                TextView textView15 = (TextView) r1.a.a(view, R.id.noise2);
                                                                if (textView15 != null) {
                                                                    i10 = R.id.noise_r;
                                                                    TextView textView16 = (TextView) r1.a.a(view, R.id.noise_r);
                                                                    if (textView16 != null) {
                                                                        i10 = R.id.noise_rr;
                                                                        TextView textView17 = (TextView) r1.a.a(view, R.id.noise_rr);
                                                                        if (textView17 != null) {
                                                                            i10 = R.id.ori_module_power;
                                                                            TextView textView18 = (TextView) r1.a.a(view, R.id.ori_module_power);
                                                                            if (textView18 != null) {
                                                                                i10 = R.id.ps_space;
                                                                                TextView textView19 = (TextView) r1.a.a(view, R.id.ps_space);
                                                                                if (textView19 != null) {
                                                                                    i10 = R.id.f4948r1;
                                                                                    TextView textView20 = (TextView) r1.a.a(view, R.id.f4948r1);
                                                                                    if (textView20 != null) {
                                                                                        i10 = R.id.rpc_rx_err_times;
                                                                                        TextView textView21 = (TextView) r1.a.a(view, R.id.rpc_rx_err_times);
                                                                                        if (textView21 != null) {
                                                                                            i10 = R.id.rpc_tx_err_times;
                                                                                            TextView textView22 = (TextView) r1.a.a(view, R.id.rpc_tx_err_times);
                                                                                            if (textView22 != null) {
                                                                                                i10 = R.id.rssi;
                                                                                                TextView textView23 = (TextView) r1.a.a(view, R.id.rssi);
                                                                                                if (textView23 != null) {
                                                                                                    i10 = R.id.rssi2;
                                                                                                    TextView textView24 = (TextView) r1.a.a(view, R.id.rssi2);
                                                                                                    if (textView24 != null) {
                                                                                                        i10 = R.id.rssi_r;
                                                                                                        TextView textView25 = (TextView) r1.a.a(view, R.id.rssi_r);
                                                                                                        if (textView25 != null) {
                                                                                                            i10 = R.id.rssi_rr;
                                                                                                            TextView textView26 = (TextView) r1.a.a(view, R.id.rssi_rr);
                                                                                                            if (textView26 != null) {
                                                                                                                i10 = R.id.f4951sa;
                                                                                                                TextView textView27 = (TextView) r1.a.a(view, R.id.f4951sa);
                                                                                                                if (textView27 != null) {
                                                                                                                    i10 = R.id.spi_flash;
                                                                                                                    TextView textView28 = (TextView) r1.a.a(view, R.id.spi_flash);
                                                                                                                    if (textView28 != null) {
                                                                                                                        i10 = R.id.sq;
                                                                                                                        TextView textView29 = (TextView) r1.a.a(view, R.id.sq);
                                                                                                                        if (textView29 != null) {
                                                                                                                            return new d1((ScrollView) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29);
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

    public static d1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_rfstatus, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f21052a;
    }
}
