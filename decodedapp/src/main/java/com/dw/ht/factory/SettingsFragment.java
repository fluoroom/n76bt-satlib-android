package com.dw.ht.factory;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.SwitchCompat;
import androidx.gridlayout.widget.GridLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.Dm;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.Cfg;
import com.dw.ht.entitys.FactorySettings;
import com.dw.ht.factory.SettingsFragment;
import com.dw.ht.factory.b;
import com.dw.ht.fragments.DeviceFragment;
import com.dw.ht.j0;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import e5.a;
import g3.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import q4.z;
import s4.s1;
import s4.u8;
import v4.a;
import v4.c0;
import v4.e0;
import v4.l1;
import v4.m0;
import v4.n0;
import v4.p0;
import v4.q0;
import v4.v;
import v4.x;

/* JADX INFO: loaded from: classes.dex */
public class SettingsFragment extends DeviceFragment implements TabLayout.d {
    private View A1;
    private Spinner B1;
    private View C1;
    private View D1;
    private View E1;
    private View F1;
    private int G1;
    private p H1;
    private int I1;
    private Spinner Q0;
    private Spinner R0;
    private Spinner S0;
    private Spinner T0;
    private Spinner U0;
    private Spinner V0;
    private Spinner W0;
    private Spinner X0;
    private Spinner Y0;
    private Spinner Z0;

    /* JADX INFO: renamed from: a1 */
    private s f5844a1;

    /* JADX INFO: renamed from: b1 */
    private s f5845b1;

    /* JADX INFO: renamed from: c1 */
    private s f5846c1;

    /* JADX INFO: renamed from: d1 */
    private j f5847d1;

    /* JADX INFO: renamed from: e1 */
    private TabLayout f5848e1;

    /* JADX INFO: renamed from: f1 */
    private q f5849f1;

    /* JADX INFO: renamed from: g1 */
    private n f5850g1;

    /* JADX INFO: renamed from: h1 */
    private Snackbar f5851h1;

    /* JADX INFO: renamed from: j1 */
    private SharedPreferences f5853j1;

    /* JADX INFO: renamed from: k1 */
    private y5.d f5854k1;

    /* JADX INFO: renamed from: l1 */
    private SharedPreferences f5855l1;

    /* JADX INFO: renamed from: m1 */
    private y5.d f5856m1;

    /* JADX INFO: renamed from: n1 */
    private AGCViewHolder f5857n1;

    /* JADX INFO: renamed from: o1 */
    private EditText f5858o1;

    /* JADX INFO: renamed from: p1 */
    private l f5859p1;

    /* JADX INFO: renamed from: r1 */
    private SharedPreferences f5861r1;

    /* JADX INFO: renamed from: s1 */
    private SharedPreferences f5862s1;

    /* JADX INFO: renamed from: t1 */
    private y5.d f5863t1;

    /* JADX INFO: renamed from: u1 */
    private y5.d f5864u1;

    /* JADX INFO: renamed from: v1 */
    private k f5865v1;

    /* JADX INFO: renamed from: w1 */
    private u f5866w1;

    /* JADX INFO: renamed from: x1 */
    private Spinner f5867x1;

    /* JADX INFO: renamed from: y1 */
    private Spinner f5868y1;

    /* JADX INFO: renamed from: z1 */
    private Spinner f5869z1;
    private final View[] P0 = new View[9];

    /* JADX INFO: renamed from: i1 */
    private r f5852i1 = r.Idle;

    /* JADX INFO: renamed from: q1 */
    private String[] f5860q1 = {"等待认证完成", "认证失败", "正在读取设置", "正在写入设置", "设置已写入", "设置写入失败,请尝试重新启动设备", "SPI Flash 挂载错误", null};

    class AGCViewHolder {

        @BindView
        EditText agc_change_thd;

        @BindView
        EditText sm_attenu;

        @BindView
        EditText sm_change_interval;

        @BindView
        Switch sm_en;

        @BindView
        EditText sm_start_noise_l;

        @BindView
        EditText sm_time;

        public AGCViewHolder(View view) {
            ButterKnife.a(this, view);
        }

        void a(f fVar) {
            this.sm_start_noise_l.setText(String.valueOf(fVar.f5889b));
            this.sm_attenu.setText(String.valueOf(fVar.f5890c));
            this.sm_time.setText(String.valueOf(fVar.f5891d));
            this.sm_change_interval.setText(String.valueOf(fVar.f5892e));
            this.agc_change_thd.setText(String.valueOf(fVar.f5893f));
            this.sm_en.setChecked(fVar.f5888a);
        }

        @OnClick
        void save() {
            try {
                f fVar = SettingsFragment.this.new f();
                fVar.f5889b = Integer.parseInt(this.sm_start_noise_l.getText().toString());
                fVar.f5890c = Integer.parseInt(this.sm_attenu.getText().toString());
                fVar.f5891d = Integer.parseInt(this.sm_time.getText().toString());
                fVar.f5892e = Integer.parseInt(this.sm_change_interval.getText().toString());
                fVar.f5893f = Integer.parseInt(this.agc_change_thd.getText().toString());
                fVar.f5888a = this.sm_en.isChecked();
                SettingsFragment.this.Y4().b(v.WRITE_RDA1846S_AGC, fVar);
            } catch (NumberFormatException unused) {
            }
        }
    }

    public class AGCViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b */
        private AGCViewHolder f5871b;

        /* JADX INFO: renamed from: c */
        private View f5872c;

        class a extends t1.b {

            /* JADX INFO: renamed from: d */
            final /* synthetic */ AGCViewHolder f5873d;

            a(AGCViewHolder aGCViewHolder) {
                this.f5873d = aGCViewHolder;
            }

            @Override // t1.b
            public void b(View view) {
                this.f5873d.save();
            }
        }

        public AGCViewHolder_ViewBinding(AGCViewHolder aGCViewHolder, View view) {
            this.f5871b = aGCViewHolder;
            aGCViewHolder.sm_start_noise_l = (EditText) t1.c.d(view, R.id.sm_start_noise_l, "field 'sm_start_noise_l'", EditText.class);
            aGCViewHolder.sm_attenu = (EditText) t1.c.d(view, R.id.sm_attenu, "field 'sm_attenu'", EditText.class);
            aGCViewHolder.sm_time = (EditText) t1.c.d(view, R.id.sm_time, "field 'sm_time'", EditText.class);
            aGCViewHolder.sm_change_interval = (EditText) t1.c.d(view, R.id.sm_change_interval, "field 'sm_change_interval'", EditText.class);
            aGCViewHolder.agc_change_thd = (EditText) t1.c.d(view, R.id.agc_change_thd, "field 'agc_change_thd'", EditText.class);
            aGCViewHolder.sm_en = (Switch) t1.c.d(view, R.id.sm_en, "field 'sm_en'", Switch.class);
            View viewC = t1.c.c(view, R.id.agc_save, "method 'save'");
            this.f5872c = viewC;
            viewC.setOnClickListener(new a(aGCViewHolder));
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c0 f5875a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l1 f5876b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ TextView f5877c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ View f5878d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ View f5879e;

        a(c0 c0Var, l1 l1Var, TextView textView, View view, View view2) {
            this.f5875a = c0Var;
            this.f5876b = l1Var;
            this.f5877c = textView;
            this.f5878d = view;
            this.f5879e = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dm.DeviceID deviceIDR1 = this.f5875a.R1();
            if (deviceIDR1 != null) {
                SettingsFragment.this.x4(deviceIDR1.toString());
            }
            int iJ1 = this.f5875a.J1();
            if (iJ1 == 1) {
                SettingsFragment.this.H5(r.ReadingSettings);
                this.f5876b.a(v.READ_ADVANCED_SETTINGS, new byte[0]);
                this.f5877c.setVisibility(8);
                this.f5878d.setVisibility(0);
                return;
            }
            if (iJ1 == 2) {
                SettingsFragment.this.H5(r.Unauthorized);
                this.f5877c.setText("已经包含相同ID在服务器,当前设备需要重新配置ID");
                return;
            }
            a.g gVarT1 = this.f5875a.T1();
            if (gVarT1 != null) {
                this.f5877c.setText("认证错误步骤：" + gVarT1 + "\n点击重试");
            } else {
                a.g gVarS1 = this.f5875a.S1();
                this.f5877c.setText("当前认证步骤：" + gVarS1);
            }
            this.f5879e.postDelayed(this, 1000L);
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SettingsFragment.this.F5();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CharSequence text = ((ClipboardManager) SettingsFragment.this.k1().getSystemService("clipboard")).getText();
            if (TextUtils.isEmpty(text)) {
                return;
            }
            SettingsFragment.this.f5858o1.setText(text);
        }
    }

    class d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c0 f5883a;

        d(c0 c0Var) {
            this.f5883a = c0Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f5883a.y();
        }
    }

    static /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f5885a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f5886b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f5887c;

        static {
            int[] iArr = new int[v.values().length];
            f5887c = iArr;
            try {
                iArr[v.EVENT_NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5887c[v.SET_DID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5887c[v.SET_MSG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5887c[v.WRITE_ADVANCED_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5887c[v.SET_IBA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5887c[v.SET_VOC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5887c[v.WRITE_ADVANCED_SETTINGS2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5887c[v.READ_ADVANCED_SETTINGS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5887c[v.READ_RDA1846S_AGC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5887c[v.GET_DID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5887c[v.GET_IBA.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5887c[v.GET_VOC.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5887c[v.READ_ADVANCED_SETTINGS2.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5887c[v.GET_MSG.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5887c[v.READ_RF_STATUS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr2 = new int[a.b.values().length];
            f5886b = iArr2;
            try {
                iArr2[a.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f5886b[a.b.INCORRECT_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr3 = new int[x.values().length];
            f5885a = iArr3;
            try {
                iArr3[x.RESTORE_FACTORY_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private static class g implements q0 {

        /* JADX INFO: renamed from: a */
        int f5895a;

        /* JADX INFO: renamed from: b */
        int f5896b;

        /* JADX INFO: renamed from: c */
        int f5897c;

        /* JADX INFO: renamed from: d */
        int f5898d;

        /* JADX INFO: renamed from: e */
        int f5899e;

        /* JADX INFO: renamed from: f */
        int f5900f;

        /* JADX INFO: renamed from: g */
        int f5901g;

        /* JADX INFO: renamed from: h */
        int f5902h;

        /* JADX INFO: renamed from: r */
        int f5903r;

        /* JADX INFO: renamed from: s */
        int f5904s;

        /* JADX INFO: renamed from: t */
        int f5905t;

        private g() {
        }

        @Override // v4.q0
        public /* synthetic */ byte[] a(int i10) {
            return p0.b(this, i10);
        }

        @Override // v4.q0
        public byte[] b() {
            byte[] bArr = new byte[16];
            new a6.v(bArr).n(this.f5895a, 16).n(this.f5896b, 16).n(this.f5897c, 16).n(this.f5898d, 16).n(this.f5899e, 16).n(this.f5900f, 8).n(this.f5901g, 8).n(this.f5902h, 8).n(this.f5903r, 8).n(this.f5904s, 8).n(this.f5905t, 8);
            return bArr;
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private class h {

        /* JADX INFO: renamed from: a */
        String f5906a;

        /* JADX INFO: renamed from: b */
        String f5907b;

        /* JADX INFO: renamed from: c */
        int f5908c;

        public h(byte[] bArr, int i10, int i11) {
            char[] cArr = new char[16];
            int i12 = 0;
            int i13 = 0;
            while (i13 < 16 && i10 < i11) {
                cArr[i13] = (char) bArr[i10];
                i13++;
                i10++;
            }
            this.f5906a = new String(cArr).trim();
            char[] cArr2 = new char[16];
            while (i12 < 16 && i10 < i11) {
                cArr2[i12] = (char) bArr[i10];
                i12++;
                i10++;
            }
            this.f5907b = new String(cArr2).trim();
            if (i10 + 1 < i11) {
                this.f5908c = new a6.v(bArr, i10 * 8).i(16);
            }
        }
    }

    public static class i extends Exception {

        /* JADX INFO: renamed from: a */
        public EditText f5910a;

        public i(EditText editText, String str) {
            super(str);
            this.f5910a = editText;
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a */
        private final b f5911a;

        /* JADX INFO: renamed from: b */
        private final b f5912b;

        /* JADX INFO: renamed from: c */
        private final CheckBox f5913c;

        /* JADX INFO: renamed from: d */
        private final CheckBox f5914d;

        /* JADX INFO: renamed from: e */
        private final ViewGroup f5915e;

        /* JADX INFO: renamed from: f */
        private final SwitchCompat f5916f;

        /* JADX INFO: renamed from: g */
        private final ViewGroup f5917g;

        /* JADX INFO: renamed from: h */
        private final EditText[] f5918h;

        /* JADX INFO: renamed from: i */
        private final ViewGroup f5919i;

        /* JADX INFO: renamed from: j */
        private final CheckBox[] f5920j = new CheckBox[16];

        /* JADX INFO: renamed from: k */
        private final View f5921k;

        private static class a {

            /* JADX INFO: renamed from: a */
            private final EditText f5922a;

            /* JADX INFO: renamed from: b */
            private final TextView f5923b;

            /* JADX INFO: renamed from: c */
            private final EditText f5924c;

            /* JADX INFO: renamed from: d */
            private final CheckBox f5925d;

            /* JADX INFO: renamed from: e */
            private final CheckBox f5926e;

            /* JADX INFO: renamed from: f */
            private final CheckBox f5927f;

            /* JADX INFO: renamed from: g */
            private final CheckBox f5928g;

            a(ViewGroup viewGroup, int i10) {
                this.f5922a = (EditText) viewGroup.getChildAt(i10);
                this.f5923b = (TextView) viewGroup.getChildAt(i10 + 1);
                this.f5924c = (EditText) viewGroup.getChildAt(i10 + 2);
                this.f5925d = (CheckBox) viewGroup.getChildAt(i10 + 3);
                this.f5926e = (CheckBox) viewGroup.getChildAt(i10 + 4);
                this.f5927f = (CheckBox) viewGroup.getChildAt(i10 + 5);
                this.f5928g = (CheckBox) viewGroup.getChildAt(i10 + 6);
            }

            public EditText b(e0 e0Var, int i10) {
                try {
                    e0Var.f29846a[i10][0] = Integer.parseInt(this.f5922a.getText().toString());
                    try {
                        e0Var.f29846a[i10][1] = Integer.parseInt(this.f5924c.getText().toString());
                        e0Var.f29848c[i10] = this.f5925d.isChecked();
                        e0Var.f29847b[i10] = this.f5926e.isChecked();
                        e0Var.f29850e[i10] = this.f5927f.isChecked();
                        e0Var.f29849d[i10] = this.f5928g.isChecked();
                        return null;
                    } catch (NumberFormatException e10) {
                        e10.printStackTrace();
                        return this.f5922a;
                    }
                } catch (NumberFormatException e11) {
                    e11.printStackTrace();
                    return this.f5922a;
                }
            }

            public void c(int i10) {
                this.f5922a.setVisibility(i10);
                this.f5923b.setVisibility(i10);
                this.f5924c.setVisibility(i10);
                this.f5925d.setVisibility(i10);
                this.f5926e.setVisibility(i10);
                this.f5927f.setVisibility(i10);
                this.f5928g.setVisibility(i10);
            }

            public void d(e0 e0Var, int i10) {
                int[][] iArr = e0Var.f29846a;
                if (i10 >= iArr.length) {
                    c(8);
                    return;
                }
                this.f5922a.setText(String.valueOf(iArr[i10][0]));
                this.f5924c.setText(String.valueOf(e0Var.f29846a[i10][1]));
                this.f5925d.setChecked(e0Var.f29848c[i10]);
                this.f5926e.setChecked(e0Var.f29847b[i10]);
                this.f5927f.setChecked(e0Var.f29850e[i10]);
                this.f5928g.setChecked(e0Var.f29849d[i10]);
                c(0);
            }
        }

        private static class b {

            /* JADX INFO: renamed from: a */
            a[] f5929a = new a[8];

            b(ViewGroup viewGroup) {
                int i10 = 0;
                while (i10 < viewGroup.getChildCount()) {
                    if (viewGroup.getChildAt(i10) instanceof EditText) {
                        int i11 = 0;
                        while (true) {
                            a[] aVarArr = this.f5929a;
                            if (i11 < aVarArr.length) {
                                aVarArr[i11] = new a(viewGroup, i10);
                                i10 += 7;
                                i11++;
                            }
                        }
                    }
                    i10++;
                }
            }

            public EditText a(e0 e0Var) {
                int i10 = 0;
                boolean z10 = false;
                while (true) {
                    boolean z11 = true;
                    if (i10 >= e0Var.f29846a.length) {
                        if (z10) {
                            return null;
                        }
                        Toast.makeText(this.f5929a[0].f5922a.getContext(), "请设置最少一个有效的频段", 1).show();
                        return this.f5929a[0].f5922a;
                    }
                    EditText editTextB = this.f5929a[i10].b(e0Var, i10);
                    if (editTextB != null) {
                        return editTextB;
                    }
                    int[] iArr = e0Var.f29846a[i10];
                    if (iArr[0] >= iArr[1]) {
                        z11 = false;
                    }
                    z10 |= z11;
                    i10++;
                }
            }

            public void b(e0 e0Var) {
                int i10 = 0;
                while (true) {
                    a[] aVarArr = this.f5929a;
                    if (i10 >= aVarArr.length) {
                        return;
                    }
                    aVarArr[i10].d(e0Var, i10);
                    i10++;
                }
            }
        }

        public j(View view) {
            this.f5918h = new EditText[]{(EditText) view.findViewById(R.id.power_base_l), (EditText) view.findViewById(R.id.power_base_m), (EditText) view.findViewById(R.id.power_base_h)};
            this.f5911a = new b((ViewGroup) view.findViewById(R.id.freq_limits));
            this.f5912b = new b((ViewGroup) view.findViewById(R.id.freq_limits2));
            this.f5919i = (ViewGroup) view.findViewById(R.id.freq_limits2_and_apc2);
            this.f5915e = (ViewGroup) view.findViewById(R.id.freq_limits2);
            this.f5916f = (SwitchCompat) view.findViewById(R.id.freq_limits2_en);
            this.f5917g = (ViewGroup) view.findViewById(R.id.apcLevelGroup);
            this.f5913c = (CheckBox) view.findViewById(R.id.have_radio);
            this.f5914d = (CheckBox) view.findViewById(R.id.have_speak);
            this.f5921k = view.findViewById(R.id.product_config_group);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.product_config);
            int i10 = 0;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt instanceof CheckBox) {
                    this.f5920j[i10] = (CheckBox) childAt;
                    i10++;
                }
            }
        }

        public boolean a() {
            return this.f5917g.getVisibility() == 0;
        }

        public boolean b() {
            return this.f5921k.getVisibility() == 0;
        }

        public EditText c(v4.a aVar) {
            EditText editText;
            EditText editTextA = this.f5911a.a(aVar);
            if (editTextA != null) {
                return editTextA;
            }
            aVar.D = !this.f5913c.isChecked();
            aVar.E = !this.f5914d.isChecked();
            if (!this.f5916f.isChecked()) {
                return null;
            }
            EditText editTextA2 = this.f5912b.a(new v4.b(aVar.f29846a.length));
            if (editTextA2 != null) {
                return editTextA2;
            }
            if (!a()) {
                return null;
            }
            int i10 = 0;
            while (true) {
                EditText[] editTextArr = this.f5918h;
                if (i10 >= editTextArr.length) {
                    return null;
                }
                editText = editTextArr[i10];
                try {
                    int i11 = Integer.parseInt(editText.getText().toString());
                    if (i11 < 0 || i11 > 63) {
                        break;
                    }
                    i10++;
                } catch (NumberFormatException unused) {
                    Toast.makeText(editText.getContext(), "允许的值0到63", 0).show();
                    return editText;
                }
            }
            Toast.makeText(editText.getContext(), "允许的值0到63", 0).show();
            return editText;
        }

        public v4.b d(int i10) {
            v4.b bVar = new v4.b(i10);
            if (this.f5916f.isChecked()) {
                this.f5912b.a(bVar);
                if (a()) {
                    int i11 = 0;
                    while (true) {
                        EditText[] editTextArr = this.f5918h;
                        if (i11 >= editTextArr.length) {
                            break;
                        }
                        try {
                            bVar.f29716f[i11] = Integer.parseInt(editTextArr[i11].getText().toString());
                        } catch (NumberFormatException e10) {
                            e10.printStackTrace();
                        }
                        i11++;
                    }
                }
            }
            if (b()) {
                int i12 = 0;
                for (int i13 = 0; i13 < 16; i13++) {
                    i12 |= this.f5920j[i13].isChecked() ? 1 << (15 - i13) : 0;
                }
                bVar.f29720s = i12;
            }
            return bVar;
        }

        public void e(boolean z10) {
            if (z10) {
                this.f5917g.setVisibility(0);
            } else {
                this.f5917g.setVisibility(8);
            }
        }

        public void f(boolean z10) {
            if (z10) {
                this.f5919i.setVisibility(0);
                this.f5915e.setVisibility(0);
            } else {
                this.f5919i.setVisibility(8);
                this.f5915e.setVisibility(8);
            }
        }

        public void g(boolean z10) {
            if (z10) {
                this.f5921k.setVisibility(0);
            } else {
                this.f5921k.setVisibility(8);
            }
        }

        public void h(v4.b bVar) {
            this.f5912b.b(bVar);
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                int[][] iArr = bVar.f29846a;
                boolean z11 = true;
                if (i10 >= iArr.length) {
                    break;
                }
                int[] iArr2 = iArr[i10];
                if (iArr2[0] == iArr2[1]) {
                    z11 = false;
                }
                z10 |= z11;
                i10++;
            }
            this.f5916f.setChecked(z10);
            int i11 = 0;
            while (true) {
                EditText[] editTextArr = this.f5918h;
                if (i11 >= editTextArr.length) {
                    break;
                }
                editTextArr[i11].setText(String.valueOf(bVar.f29716f[i11]));
                i11++;
            }
            for (int i12 = 0; i12 < 16; i12++) {
                this.f5920j[i12].setChecked((bVar.f29720s & (1 << (15 - i12))) != 0);
            }
        }

        public void i(v4.a aVar) {
            this.f5911a.b(aVar);
            this.f5913c.setChecked(!aVar.D);
            this.f5914d.setChecked(!aVar.E);
        }
    }

    private class l {

        /* JADX INFO: renamed from: a */
        private final ViewGroup f5931a;

        /* JADX INFO: renamed from: b */
        private final ViewGroup f5932b;

        public l(View view) {
            this.f5931a = (ViewGroup) view.findViewById(R.id.iba);
            this.f5932b = (ViewGroup) view.findViewById(R.id.vco);
        }

        public EditText a() {
            boolean z10 = false;
            int i10 = 0;
            int i11 = 2;
            while (i11 < this.f5931a.getChildCount() - 1) {
                int i12 = i11 + 1;
                EditText editText = (EditText) this.f5931a.getChildAt(i11);
                i11 += 2;
                EditText editText2 = (EditText) this.f5931a.getChildAt(i12);
                String strTrim = editText.getText().toString().trim();
                String strTrim2 = editText2.getText().toString().trim();
                if (z10) {
                    if (strTrim.length() != 0) {
                        Toast.makeText(SettingsFragment.this.k1(), "不使用的需要留空", 1).show();
                        return editText;
                    }
                    if (strTrim2.length() != 0) {
                        Toast.makeText(SettingsFragment.this.k1(), "不使用的需要留空", 1).show();
                        return editText2;
                    }
                }
                if (strTrim.length() == 0) {
                    if (strTrim2.length() != 0) {
                        Toast.makeText(SettingsFragment.this.k1(), "不使用的需要留空", 1).show();
                        return editText2;
                    }
                    z10 = true;
                }
                if (strTrim2.length() != 0) {
                    try {
                        int i13 = Integer.parseInt(strTrim);
                        if (i13 < i10) {
                            Toast.makeText(SettingsFragment.this.k1(), "频率必须逐渐变大", 1).show();
                            return editText;
                        }
                        if (i13 > 63 || i13 < 0) {
                            Toast.makeText(SettingsFragment.this.k1(), "频率不能大于63", 1).show();
                            return editText;
                        }
                        try {
                            int i14 = Integer.parseInt(strTrim2);
                            if (i14 <= 1023 && i14 >= 0) {
                                i10 = i13;
                            }
                            Toast.makeText(SettingsFragment.this.k1(), "DAC不能大于1023", 1).show();
                            return editText;
                        } catch (NumberFormatException e10) {
                            e10.printStackTrace();
                            return editText2;
                        }
                    } catch (NumberFormatException e11) {
                        e11.printStackTrace();
                        return editText;
                    }
                }
                z10 = true;
            }
            return b();
        }

        public EditText b() {
            ViewGroup viewGroup = this.f5932b;
            int i10 = 2;
            while (i10 < viewGroup.getChildCount() - 1) {
                int i11 = i10 + 1;
                EditText editText = (EditText) viewGroup.getChildAt(i10);
                i10 += 2;
                EditText editText2 = (EditText) viewGroup.getChildAt(i11);
                String strTrim = editText.getText().toString().trim();
                String strTrim2 = editText2.getText().toString().trim();
                if (strTrim.length() != 0 || strTrim2.length() != 0) {
                    try {
                        int i12 = Integer.parseInt(strTrim);
                        if (i12 > 15 || i12 < 0) {
                            Toast.makeText(SettingsFragment.this.k1(), "地址不能大于15", 1).show();
                            return editText;
                        }
                        try {
                            int i13 = Integer.parseInt(strTrim2);
                            if (i13 > 4095 || i13 < 0) {
                                Toast.makeText(SettingsFragment.this.k1(), "DAC不能大于4095", 1).show();
                                return editText;
                            }
                        } catch (NumberFormatException e10) {
                            e10.printStackTrace();
                            return editText2;
                        }
                    } catch (NumberFormatException e11) {
                        e11.printStackTrace();
                        return editText;
                    }
                }
            }
            return null;
        }

        public k c() {
            ArrayList arrayListA = a6.o.a();
            int i10 = 2;
            while (i10 < this.f5931a.getChildCount() - 1) {
                int i11 = i10 + 1;
                EditText editText = (EditText) this.f5931a.getChildAt(i10);
                i10 += 2;
                EditText editText2 = (EditText) this.f5931a.getChildAt(i11);
                String strTrim = editText.getText().toString().trim();
                String strTrim2 = editText2.getText().toString().trim();
                if (strTrim.length() == 0 || strTrim2.length() == 0) {
                    break;
                }
                try {
                    arrayListA.add(new m(Integer.parseInt(strTrim), Integer.parseInt(strTrim2)));
                } catch (NumberFormatException e10) {
                    e10.printStackTrace();
                }
            }
            return new k((m[]) arrayListA.toArray(new m[arrayListA.size()]));
        }

        public void d(n0 n0Var) {
            n0Var.b(v.SET_IBA, c());
        }

        public u e() {
            ViewGroup viewGroup = this.f5932b;
            ArrayList arrayListA = a6.o.a();
            int i10 = 2;
            while (i10 < viewGroup.getChildCount() - 1) {
                int i11 = i10 + 1;
                EditText editText = (EditText) viewGroup.getChildAt(i10);
                i10 += 2;
                EditText editText2 = (EditText) viewGroup.getChildAt(i11);
                String strTrim = editText.getText().toString().trim();
                String strTrim2 = editText2.getText().toString().trim();
                if (strTrim2.length() != 0 && strTrim.length() != 0) {
                    try {
                        arrayListA.add(new t(Integer.parseInt(strTrim), Integer.parseInt(strTrim2)));
                    } catch (NumberFormatException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            return new u((t[]) arrayListA.toArray(new t[arrayListA.size()]));
        }

        public void f(k kVar) {
            int i10 = 2;
            for (int i11 = 2; i11 < this.f5931a.getChildCount(); i11++) {
                ((EditText) this.f5931a.getChildAt(i11)).setText("");
            }
            for (m mVar : kVar.f5930a) {
                int i12 = i10 + 1;
                if (this.f5931a.getChildCount() <= i12) {
                    return;
                }
                EditText editText = (EditText) this.f5931a.getChildAt(i10);
                i10 += 2;
                EditText editText2 = (EditText) this.f5931a.getChildAt(i12);
                editText.setText(String.valueOf(mVar.f5934a));
                editText2.setText(String.valueOf(mVar.f5935b));
            }
        }

        public void g(u uVar) {
            ViewGroup viewGroup = this.f5932b;
            int i10 = 2;
            for (int i11 = 2; i11 < viewGroup.getChildCount(); i11++) {
                ((EditText) viewGroup.getChildAt(i11)).setText("");
            }
            for (t tVar : uVar.f5988a) {
                int i12 = i10 + 1;
                if (viewGroup.getChildCount() <= i12) {
                    return;
                }
                EditText editText = (EditText) viewGroup.getChildAt(i10);
                i10 += 2;
                EditText editText2 = (EditText) viewGroup.getChildAt(i12);
                editText.setText(String.valueOf(tVar.f5986a));
                editText2.setText(String.valueOf(tVar.f5987b));
            }
        }
    }

    public static class m {

        /* JADX INFO: renamed from: a */
        int f5934a;

        /* JADX INFO: renamed from: b */
        int f5935b;

        public m(int i10, int i11) {
            this.f5934a = i10;
            this.f5935b = i11;
        }
    }

    private class n implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final Context f5936a;

        /* JADX INFO: renamed from: b */
        private final RecyclerView f5937b;

        /* JADX INFO: renamed from: c */
        private final c f5938c;

        /* JADX INFO: renamed from: d */
        private final EditText f5939d;

        /* JADX INFO: renamed from: e */
        private final Spinner f5940e;

        /* JADX INFO: renamed from: f */
        private final EditText f5941f;

        /* JADX INFO: renamed from: g */
        private final EditText f5942g;

        /* JADX INFO: renamed from: h */
        int f5943h = 0;

        class a implements AdapterView.OnItemSelectedListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ SettingsFragment f5945a;

            a(SettingsFragment settingsFragment) {
                this.f5945a = settingsFragment;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
                Cfg.K().edit().putInt("factory.vendor", i10).apply();
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView adapterView) {
            }
        }

        private class b extends RecyclerView.f0 implements View.OnClickListener {
            private final TextView D;
            private final View E;
            private FactorySettings F;

            public b(View view) {
                super(view);
                this.D = (TextView) view.findViewById(R.id.name);
                View viewFindViewById = view.findViewById(R.id.del_btn);
                this.E = viewFindViewById;
                viewFindViewById.setOnClickListener(this);
                view.findViewById(R.id.share_btn).setOnClickListener(this);
                view.setOnClickListener(this);
            }

            public void O(FactorySettings factorySettings) {
                this.D.setText(factorySettings.getName());
                this.F = factorySettings;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int id2 = view.getId();
                if (id2 == R.id.del_btn) {
                    n.this.f5938c.M(k());
                    j0.f6341a.j().v(this.F.getId());
                    return;
                }
                if (id2 == R.id.share_btn) {
                    if (this.F.getAdvancedSettings() == null) {
                        Toast.makeText(view.getContext(), "解析保存的设置失败", 1).show();
                        return;
                    }
                    String json = this.F.toJson();
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", json);
                    SettingsFragment.this.O3(Intent.createChooser(intent, "分享配置"));
                    return;
                }
                c0 c0Var = (c0) SettingsFragment.this.Y4();
                if (c0Var == null) {
                    Toast.makeText(SettingsFragment.this.k1(), "未连接到设备", 1).show();
                    return;
                }
                v4.a advancedSettings = this.F.getAdvancedSettings();
                if (advancedSettings == null) {
                    Toast.makeText(view.getContext(), "解析保存的设置失败", 1).show();
                    return;
                }
                byte[] iba = this.F.getIba();
                if (iba == null) {
                    iba = new byte[0];
                }
                SettingsFragment.this.f5859p1.f(new k(iba, 0, iba.length));
                byte[] vco = this.F.getVco();
                if (vco == null) {
                    vco = new byte[0];
                }
                SettingsFragment.this.f5859p1.g(new u(vco, 0, vco.length));
                advancedSettings.c(c0Var.d().f());
                SettingsFragment.this.N5(advancedSettings);
                byte[] settings2 = this.F.getSettings2();
                if (settings2 == null) {
                    settings2 = new byte[0];
                }
                v4.b bVar = new v4.b(settings2, 0, settings2.length, this.F.getFreqRangeCount());
                bVar.c(c0Var.d().f());
                SettingsFragment.this.M5(bVar);
                SettingsFragment.this.J5(advancedSettings);
            }
        }

        class c extends c6.b {
            public c(Context context) {
                super(context, 0);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.h
            /* JADX INFO: renamed from: Q */
            public void s(b bVar, int i10) {
                bVar.O((FactorySettings) J(i10));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.h
            /* JADX INFO: renamed from: R */
            public b u(ViewGroup viewGroup, int i10) {
                return n.this.new b(this.f4395r.inflate(R.layout.factory_device_setting_item, viewGroup, false));
            }
        }

        public n(View view) {
            this.f5936a = view.getContext();
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.actions);
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                viewGroup.getChildAt(i10).setOnClickListener(this);
            }
            view.findViewById(R.id.save_dev_id).setOnClickListener(this);
            this.f5939d = (EditText) view.findViewById(R.id.dev_id);
            this.f5942g = (EditText) view.findViewById(R.id.dev_msg);
            this.f5937b = (RecyclerView) view.findViewById(R.id.list);
            this.f5940e = (Spinner) view.findViewById(R.id.v_id);
            this.f5941f = (EditText) view.findViewById(R.id.dev_name);
            this.f5938c = new c(this.f5936a);
            Iterator it = j0.f6341a.j().g().iterator();
            while (it.hasNext()) {
                this.f5938c.D((FactorySettings) it.next());
            }
            this.f5940e.setSelection(Cfg.K().getInt("factory.vendor", 0));
            this.f5940e.setOnItemSelectedListener(new a(SettingsFragment.this));
            this.f5937b.setAdapter(this.f5938c);
            this.f5937b.l(new c6.m(this.f5936a, 0));
            c();
        }

        public void c() {
            l1 l1VarY4 = SettingsFragment.this.Y4();
            if (l1VarY4 == null) {
                return;
            }
            this.f5939d.setText(String.format(Locale.ENGLISH, "%d%sS", Integer.valueOf(Calendar.getInstance().get(1) % 20), l1VarY4.d().g()));
        }

        public void d(int i10) {
            if (this.f5943h == i10) {
                return;
            }
            this.f5943h = i10;
            if (i10 >= 81) {
                this.f5942g.setVisibility(0);
            } else {
                this.f5942g.setVisibility(8);
            }
        }

        public void e(h hVar) {
            this.f5939d.setText(hVar.f5906a);
            this.f5941f.setText(hVar.f5907b);
            int i10 = hVar.f5908c;
            if (i10 != 255) {
                this.f5940e.setSelection(i10);
            } else {
                this.f5940e.setSelection(r3.getAdapter().getCount() - 1);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i10;
            if (view.getId() == R.id.backup) {
                SettingsFragment.this.z5(null);
                return;
            }
            c0 c0Var = (c0) SettingsFragment.this.Y4();
            if (c0Var == null) {
                return;
            }
            switch (view.getId()) {
                case R.id.RestoreFactorySettings /* 2131296269 */:
                    i10 = 12290;
                    break;
                case R.id.ShowDebugScreen /* 2131296276 */:
                    i10 = 12289;
                    break;
                case R.id.dev_control /* 2131296635 */:
                    SettingsFragment.this.k5(s1.class);
                    return;
                case R.id.save_dev_id /* 2131297307 */:
                    byte[] bArr = new byte[34];
                    a6.v vVar = new a6.v(bArr);
                    char[] charArray = this.f5939d.getText().toString().trim().toCharArray();
                    char[] charArray2 = this.f5941f.getText().toString().trim().toCharArray();
                    for (int i11 = 0; i11 < charArray.length && i11 < 16; i11++) {
                        vVar.n(charArray[i11], 8);
                    }
                    vVar.l(128);
                    for (int i12 = 0; i12 < charArray2.length && i12 < 16; i12++) {
                        vVar.n(charArray2[i12], 8);
                    }
                    vVar.l(256);
                    int selectedItemPosition = this.f5940e.getSelectedItemPosition();
                    if (selectedItemPosition == this.f5940e.getAdapter().getCount() - 1) {
                        selectedItemPosition = 255;
                    }
                    vVar.n(selectedItemPosition, 16);
                    c0Var.a(v.SET_DID, bArr);
                    return;
                case R.id.show_rf_status /* 2131297384 */:
                    SettingsFragment.this.k5(com.dw.ht.factory.b.class);
                    return;
                case R.id.signal_gen /* 2131297388 */:
                    SettingsFragment.this.k5(z.class);
                    return;
                default:
                    return;
            }
            c0Var.t(i10);
        }
    }

    private static class o extends ArrayAdapter {

        /* JADX INFO: renamed from: a */
        private int f5947a;

        /* JADX INFO: renamed from: b */
        private int f5948b;

        public o(Context context, int i10, int i11) {
            super(context, android.R.layout.simple_spinner_item);
            this.f5947a = i10;
            this.f5948b = i11;
            setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /* JADX INFO: renamed from: a */
        public Integer getItem(int i10) {
            return Integer.valueOf(i10 + this.f5947a);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public int getCount() {
            return (this.f5948b - this.f5947a) + 1;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10 + this.f5947a;
        }
    }

    static class p {

        /* JADX INFO: renamed from: a */
        v4.a f5949a;

        /* JADX INFO: renamed from: b */
        v4.b f5950b;

        p() {
        }
    }

    private static class q extends s {
        int A;

        /* JADX INFO: renamed from: m */
        private final GridLayout f5951m;

        /* JADX INFO: renamed from: n */
        private final EditText f5952n;

        /* JADX INFO: renamed from: o */
        private final EditText f5953o;

        /* JADX INFO: renamed from: p */
        private final EditText f5954p;

        /* JADX INFO: renamed from: q */
        private final EditText f5955q;

        /* JADX INFO: renamed from: r */
        private final EditText f5956r;

        /* JADX INFO: renamed from: s */
        private final EditText f5957s;

        /* JADX INFO: renamed from: t */
        private final View f5958t;

        /* JADX INFO: renamed from: u */
        private final View f5959u;

        /* JADX INFO: renamed from: v */
        private final GridLayout f5960v;

        /* JADX INFO: renamed from: w */
        private final GridLayout f5961w;

        /* JADX INFO: renamed from: x */
        private final GridLayout f5962x;

        /* JADX INFO: renamed from: y */
        private final View f5963y;

        /* JADX INFO: renamed from: z */
        private final TextView f5964z;

        public q(View view) {
            super(view);
            this.A = 0;
            this.f5951m = (GridLayout) view.findViewById(R.id.squelch_level);
            this.f5960v = (GridLayout) view.findViewById(R.id.noise_level);
            this.f5963y = view.findViewById(R.id.noise_offset);
            this.f5961w = (GridLayout) view.findViewById(R.id.n0);
            this.f5962x = (GridLayout) view.findViewById(R.id.n1);
            this.f5952n = (EditText) view.findViewById(R.id.wideNoiseThreshold);
            this.f5953o = (EditText) view.findViewById(R.id.narrowNoiseThreshold);
            this.f5954p = (EditText) view.findViewById(R.id.rssiDifference);
            this.f5955q = (EditText) view.findViewById(R.id.noiseDifference);
            this.f5964z = (TextView) view.findViewById(R.id.noise_level_d);
            this.f5956r = (EditText) view.findViewById(R.id.vhf_rssi_offset);
            this.f5957s = (EditText) view.findViewById(R.id.vhf_noise_offset);
            this.f5958t = view.findViewById(R.id.vhf_rssi_offset_g);
            this.f5959u = view.findViewById(R.id.vhf_noise_offset_g);
        }

        private void t(a.C0405a c0405a) {
            j(c0405a, this.f5961w, this.f5962x);
        }

        @Override // com.dw.ht.factory.SettingsFragment.s
        public void d(int i10) {
            if (i10 == this.A) {
                return;
            }
            this.A = i10;
            if (i10 >= 81) {
                this.f5958t.setVisibility(0);
                this.f5959u.setVisibility(0);
            } else {
                this.f5958t.setVisibility(8);
                this.f5959u.setVisibility(8);
            }
            if (i10 >= 81) {
                this.f5964z.setText("NOISE级别[0,127]\n最终值=NOISE级别+宽带/窄带-校准+基础偏移");
            } else if (i10 >= 79) {
                this.f5964z.setText("NOISE级别[0,127]\nNOISE最终值=NOISE级别+宽带/窄带NOISE-NOISE校准");
            } else {
                this.f5964z.setText("NOISE级别[0,31]\nNOISE最终值=NOISE级别+宽带/窄带NOISE-NOISE校准");
            }
        }

        EditText m(int i10) {
            return (EditText) this.f5960v.getChildAt((i10 * 2) + 1);
        }

        EditText n(int i10) {
            return (EditText) this.f5951m.getChildAt((i10 * 2) + 1);
        }

        public EditText o(v4.b bVar) {
            EditText editTextQ;
            EditText editTextF = f(bVar.f29721t, this.f5961w, this.f5962x);
            if (editTextF != null) {
                return editTextF;
            }
            if (this.A >= 79 && (editTextQ = q(bVar.f29722u)) != null) {
                return editTextQ;
            }
            if (this.A < 81) {
                return null;
            }
            EditText editText = this.f5956r;
            try {
                int i10 = Integer.parseInt(editText.getText().toString());
                if (i10 >= -31 && i10 <= 31) {
                    bVar.f29727z = i10;
                    EditText editText2 = this.f5957s;
                    int i11 = Integer.parseInt(editText2.getText().toString());
                    if (i11 >= -31 && i11 <= 31) {
                        bVar.B = i11;
                        return null;
                    }
                    Toast.makeText(this.f5974a, "允许的值-31到31", 0).show();
                    return editText2;
                }
                Toast.makeText(this.f5974a, "允许的值-31到31", 0).show();
                return editText;
            } catch (NumberFormatException unused) {
                Toast.makeText(this.f5974a, "允许的值-31到31", 0).show();
                return editText;
            }
        }

        public EditText p(v4.a aVar) {
            if (this.A < 79) {
                EditText editTextQ = q(aVar.K);
                if (editTextQ != null) {
                    return editTextQ;
                }
            } else {
                Arrays.fill(aVar.K, 0);
            }
            EditText editTextE = e(aVar.J);
            if (editTextE != null) {
                return editTextE;
            }
            try {
                aVar.f29626x = SettingsFragment.E5(this.f5952n, 0, 99);
                aVar.f29627y = SettingsFragment.E5(this.f5953o, 0, 99);
                aVar.f29628z = SettingsFragment.E5(this.f5954p, 0, 99);
                aVar.A = SettingsFragment.E5(this.f5955q, 0, 99);
                return null;
            } catch (i e10) {
                Toast.makeText(this.f5974a, e10.getMessage(), 0).show();
                return e10.f5910a;
            }
        }

        public EditText q(int[] iArr) {
            int i10 = this.A >= 79 ? 127 : 31;
            for (int i11 = 0; i11 < iArr.length; i11++) {
                EditText editTextM = m((iArr.length == 9 ? 1 : 0) + i11);
                try {
                    int i12 = Integer.parseInt(editTextM.getText().toString());
                    if (i12 >= 0 && i12 <= i10) {
                        iArr[i11] = i12;
                    }
                    Toast.makeText(this.f5974a, "允许的值0到" + i10, 0).show();
                    return editTextM;
                } catch (NumberFormatException unused) {
                    Toast.makeText(this.f5974a, "允许的值0到" + i10, 0).show();
                    return editTextM;
                }
            }
            return null;
        }

        public EditText r(int[] iArr) {
            for (int i10 = 0; i10 < iArr.length; i10++) {
                EditText editTextN = n(i10);
                try {
                    int i11 = Integer.parseInt(editTextN.getText().toString());
                    if (i11 >= 0 && i11 <= 63) {
                        iArr[i10] = i11;
                    }
                    Toast.makeText(this.f5974a, "允许的值0到63", 0).show();
                    return editTextN;
                } catch (NumberFormatException unused) {
                    Toast.makeText(this.f5974a, "允许的值0到63", 0).show();
                    return editTextN;
                }
            }
            return null;
        }

        public void s(boolean z10) {
            this.f5963y.setVisibility(z10 ? 0 : 8);
        }

        public void u(v4.b bVar) {
            t(bVar.f29721t);
            if (this.A >= 79 && bVar.e()) {
                for (int i10 = 1; i10 < bVar.f29722u.length; i10++) {
                    m(i10).setText(String.valueOf(bVar.f29722u[i10]));
                }
            }
            if (this.A >= 81) {
                this.f5956r.setText(String.valueOf(bVar.f29727z));
                this.f5957s.setText(String.valueOf(bVar.B));
            }
        }

        public void v(v4.a aVar) {
            i(aVar.J);
            int i10 = 0;
            for (int i11 = 0; i11 < aVar.H.length; i11++) {
                n(i11).setText(String.valueOf(aVar.H[i11]));
            }
            while (i10 < aVar.K.length) {
                int i12 = i10 + 1;
                m(i12).setText(String.valueOf(aVar.K[i10]));
                i10 = i12;
            }
            this.f5952n.setText(String.valueOf(aVar.f29626x));
            this.f5953o.setText(String.valueOf(aVar.f29627y));
            this.f5954p.setText(String.valueOf(aVar.f29628z));
            this.f5955q.setText(String.valueOf(aVar.A));
        }
    }

    enum r {
        WaitCertification,
        Unauthorized,
        ReadingSettings,
        WriteSettings,
        SettingsSaved,
        SettingsSaveFail,
        SPIFlashFail,
        Idle
    }

    private static class s {

        /* JADX INFO: renamed from: a */
        final Context f5974a;

        /* JADX INFO: renamed from: b */
        final EditText f5975b;

        /* JADX INFO: renamed from: c */
        final EditText f5976c;

        /* JADX INFO: renamed from: d */
        final EditText f5977d;

        /* JADX INFO: renamed from: e */
        final EditText f5978e;

        /* JADX INFO: renamed from: f */
        final View f5979f;

        /* JADX INFO: renamed from: g */
        final View f5980g;

        /* JADX INFO: renamed from: h */
        final TextView f5981h;

        /* JADX INFO: renamed from: i */
        private final GridLayout f5982i;

        /* JADX INFO: renamed from: j */
        private final GridLayout f5983j;

        /* JADX INFO: renamed from: k */
        boolean f5984k = true;

        /* JADX INFO: renamed from: l */
        int f5985l = 0;

        public s(View view) {
            this.f5974a = view.getContext();
            this.f5975b = (EditText) view.findViewById(R.id.power_base);
            this.f5976c = (EditText) view.findViewById(R.id.power_pa);
            this.f5981h = (TextView) view.findViewById(R.id.power_pa_d);
            this.f5977d = (EditText) view.findViewById(R.id.power_pa_uhf);
            this.f5978e = (EditText) view.findViewById(R.id.power_pa_vhf);
            this.f5979f = view.findViewById(R.id.power_pa_uhf_c);
            this.f5980g = view.findViewById(R.id.power_pa_vhf_c);
            this.f5982i = (GridLayout) view.findViewById(R.id.r0);
            this.f5983j = (GridLayout) view.findViewById(R.id.r1);
        }

        public void i(a.C0405a c0405a) {
            j(c0405a, this.f5982i, this.f5983j);
        }

        EditText b(GridLayout gridLayout, int i10) {
            return (EditText) gridLayout.getChildAt((i10 * 2) + 1);
        }

        public void c() {
            this.f5984k = false;
            this.f5976c.setVisibility(8);
            this.f5981h.setVisibility(8);
            this.f5979f.setVisibility(8);
            this.f5980g.setVisibility(8);
        }

        public void d(int i10) {
            if (this.f5985l == i10) {
                return;
            }
            this.f5985l = i10;
            if (this.f5984k) {
                if (i10 >= 79) {
                    this.f5976c.setVisibility(8);
                    this.f5981h.setVisibility(8);
                    this.f5979f.setVisibility(0);
                    this.f5980g.setVisibility(0);
                    return;
                }
                this.f5979f.setVisibility(8);
                this.f5980g.setVisibility(8);
                this.f5976c.setVisibility(0);
                this.f5981h.setVisibility(0);
            }
        }

        EditText e(a.C0405a c0405a) {
            return f(c0405a, this.f5982i, this.f5983j);
        }

        EditText f(a.C0405a c0405a, GridLayout gridLayout, GridLayout gridLayout2) {
            int childCount = gridLayout.getChildCount() / 2;
            for (int i10 = 0; i10 < childCount; i10++) {
                EditText editTextB = b(gridLayout, i10);
                try {
                    int i11 = Integer.parseInt(editTextB.getText().toString());
                    if (i11 >= 0 && i11 <= 15) {
                        c0405a.e(i10, i11);
                    }
                    Toast.makeText(this.f5974a, "允许的值0到15", 0).show();
                    return editTextB;
                } catch (NumberFormatException unused) {
                    Toast.makeText(this.f5974a, "允许的值0到15", 0).show();
                    return editTextB;
                }
            }
            int childCount2 = gridLayout2.getChildCount() / 2;
            for (int i12 = 0; i12 < childCount2; i12++) {
                EditText editTextB2 = b(gridLayout2, i12);
                try {
                    int i13 = Integer.parseInt(editTextB2.getText().toString());
                    if (i13 >= 0 && i13 <= 15) {
                        c0405a.d(i12, i13);
                    }
                    Toast.makeText(this.f5974a, "允许的值0到15", 0).show();
                    return editTextB2;
                } catch (NumberFormatException unused2) {
                    Toast.makeText(this.f5974a, "允许的值0到15", 0).show();
                    return editTextB2;
                }
            }
            return null;
        }

        public EditText g(v4.b bVar, int i10) {
            try {
                int i11 = Integer.parseInt(this.f5978e.getText().toString());
                if (i11 >= 0 && i11 <= 15) {
                    bVar.f29723v[i10] = i11;
                    return null;
                }
                Toast.makeText(this.f5974a, "允许的值0到15", 0).show();
                return this.f5978e;
            } catch (NumberFormatException unused) {
                Toast.makeText(this.f5974a, "允许的值0到15", 0).show();
                return this.f5978e;
            }
        }

        public EditText h(v4.a aVar, int i10) {
            a.C0405a c0405a = aVar.I[i10];
            try {
                int i11 = Integer.parseInt(this.f5975b.getText().toString());
                if (i11 >= 0 && i11 <= 63) {
                    aVar.B[i10] = i11;
                    EditText editText = this.f5985l >= 79 ? this.f5977d : this.f5976c;
                    try {
                        int i12 = Integer.parseInt(editText.getText().toString());
                        if (i12 >= 0 && i12 <= 15) {
                            aVar.G[i10] = i12;
                            return e(c0405a);
                        }
                        Toast.makeText(this.f5974a, "允许的值0到15", 0).show();
                        return editText;
                    } catch (NumberFormatException unused) {
                        Toast.makeText(this.f5974a, "允许的值0到15", 0).show();
                        return editText;
                    }
                }
                Toast.makeText(this.f5974a, "允许的值0到63", 0).show();
                return this.f5975b;
            } catch (NumberFormatException unused2) {
                Toast.makeText(this.f5974a, "允许的值0到63", 0).show();
                return this.f5975b;
            }
        }

        void j(a.C0405a c0405a, GridLayout gridLayout, GridLayout gridLayout2) {
            int childCount = gridLayout.getChildCount() / 2;
            for (int i10 = 0; i10 < childCount; i10++) {
                b(gridLayout, i10).setText(String.valueOf(c0405a.b(i10)));
            }
            int childCount2 = gridLayout2.getChildCount() / 2;
            for (int i11 = 0; i11 < childCount2; i11++) {
                b(gridLayout2, i11).setText(String.valueOf(c0405a.a(i11)));
            }
        }

        public void k(v4.b bVar, int i10) {
            this.f5978e.setText(String.valueOf(bVar.f29723v[i10]));
        }

        public void l(v4.a aVar, int i10) {
            this.f5975b.setText(String.valueOf(aVar.B[i10]));
            this.f5976c.setText(String.valueOf(aVar.G[i10]));
            this.f5977d.setText(String.valueOf(aVar.G[i10]));
            i(aVar.I[i10]);
        }
    }

    public static class t {

        /* JADX INFO: renamed from: a */
        int f5986a;

        /* JADX INFO: renamed from: b */
        int f5987b;

        public t(int i10, int i11) {
            this.f5986a = i10;
            this.f5987b = i11;
        }
    }

    private void A5() {
        ClipboardManager clipboardManager = (ClipboardManager) x3().getSystemService("clipboard");
        if (clipboardManager == null || !clipboardManager.hasPrimaryClip()) {
            Toast.makeText(x3(), "剪贴板为空", 0).show();
            return;
        }
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            Toast.makeText(x3(), "剪贴板为空或没有文本内容", 0).show();
            return;
        }
        FactorySettings factorySettingsA = FactorySettings.INSTANCE.a(primaryClip.getItemAt(0).getText().toString());
        factorySettingsA.setId(0L);
        j0.f6341a.j().n(factorySettingsA);
        this.f5850g1.f5938c.D(factorySettingsA);
    }

    private void B5(View view) {
        Spinner spinner = (Spinner) view.findViewById(R.id.wide_audio_deviation);
        this.Q0 = spinner;
        spinner.setAdapter((SpinnerAdapter) new o(k1(), 0, 255));
        Spinner spinner2 = (Spinner) view.findViewById(R.id.narrow_audio_deviation);
        this.R0 = spinner2;
        spinner2.setAdapter((SpinnerAdapter) new o(k1(), 0, 255));
        Spinner spinner3 = (Spinner) view.findViewById(R.id.vhf_wide_audio_deviation);
        this.S0 = spinner3;
        spinner3.setAdapter((SpinnerAdapter) new o(k1(), 0, 255));
        Spinner spinner4 = (Spinner) view.findViewById(R.id.vhf_narrow_audio_deviation);
        this.T0 = spinner4;
        spinner4.setAdapter((SpinnerAdapter) new o(k1(), 0, 255));
        this.E1 = view.findViewById(R.id.vhf_wide_audio_deviation_l);
        this.F1 = view.findViewById(R.id.vhf_narrow_audio_deviation_l);
        Spinner spinner5 = (Spinner) view.findViewById(R.id.ctcss_deviation);
        this.U0 = spinner5;
        spinner5.setAdapter((SpinnerAdapter) new o(k1(), 0, 63));
        Spinner spinner6 = (Spinner) view.findViewById(R.id.dtcs_deviation);
        this.V0 = spinner6;
        spinner6.setAdapter((SpinnerAdapter) new o(k1(), 0, 63));
        Spinner spinner7 = (Spinner) view.findViewById(R.id.wide_analog_gain);
        this.W0 = spinner7;
        spinner7.setAdapter((SpinnerAdapter) new o(k1(), 0, 15));
        Spinner spinner8 = (Spinner) view.findViewById(R.id.mic_gain);
        this.f5867x1 = spinner8;
        spinner8.setAdapter((SpinnerAdapter) new o(k1(), 0, 20));
        Spinner spinner9 = (Spinner) view.findViewById(R.id.wide_digital_gain);
        this.X0 = spinner9;
        spinner9.setAdapter((SpinnerAdapter) new o(k1(), 0, 15));
        Spinner spinner10 = (Spinner) view.findViewById(R.id.narrow_analog_gain);
        this.Y0 = spinner10;
        spinner10.setAdapter((SpinnerAdapter) new o(k1(), 0, 15));
        Spinner spinner11 = (Spinner) view.findViewById(R.id.narrow_digital_gain);
        this.Z0 = spinner11;
        spinner11.setAdapter((SpinnerAdapter) new o(k1(), 0, 15));
        Spinner spinner12 = (Spinner) view.findViewById(R.id.vco_pa);
        this.f5868y1 = spinner12;
        spinner12.setAdapter((SpinnerAdapter) new o(k1(), 0, 15));
        this.A1 = view.findViewById(R.id.vco_pa_l);
        Spinner spinner13 = (Spinner) view.findViewById(R.id.vco_offset);
        this.B1 = spinner13;
        spinner13.setAdapter((SpinnerAdapter) new o(k1(), -1, 1));
        this.C1 = view.findViewById(R.id.vco_offset_l);
        Spinner spinner14 = (Spinner) view.findViewById(R.id.data_dev);
        this.f5869z1 = spinner14;
        spinner14.setAdapter((SpinnerAdapter) new o(k1(), 0, 127));
        this.D1 = view.findViewById(R.id.data_dev_l);
        this.f5858o1 = (EditText) view.findViewById(R.id.de_emph_coeffs);
        view.findViewById(R.id.de_emph_coeffs_save).setOnClickListener(new b());
        view.findViewById(R.id.de_emph_coeffs_paste).setOnClickListener(new c());
    }

    private void C5() {
        c0 c0VarW4 = W4();
        if (c0VarW4 != null) {
            c0VarW4.a(v.READ_FREQ_RANGE, new byte[0]);
        }
    }

    private void D5(int i10) {
        if (this.G1 == i10) {
            return;
        }
        int i11 = i10 < 79 ? 8 : 0;
        this.f5868y1.setVisibility(i11);
        this.f5869z1.setVisibility(i11);
        this.A1.setVisibility(i11);
        this.D1.setVisibility(i11);
        this.T0.setVisibility(i11);
        this.S0.setVisibility(i11);
        this.F1.setVisibility(i11);
        this.E1.setVisibility(i11);
        this.B1.setVisibility(i11);
        this.C1.setVisibility(i11);
    }

    public static int E5(EditText editText, int i10, int i11) throws i {
        try {
            int i12 = Integer.parseInt(editText.getText().toString());
            if (i12 >= i10 && i12 <= i11) {
                return i12;
            }
            throw new i(editText, "允许的值" + i10 + "到" + i11);
        } catch (NumberFormatException unused) {
            throw new i(editText, "允许的值" + i10 + "到" + i11);
        }
    }

    public void F5() {
        int i10;
        try {
            String[] strArrSplit = this.f5858o1.getText().toString().replace(" 1 ", " ").split(" ");
            if (strArrSplit.length != 5) {
                throw new RuntimeException("格式错误");
            }
            int length = strArrSplit.length;
            double[] dArr = new double[length];
            double dMax = 0.0d;
            for (int i11 = 0; i11 < length; i11++) {
                double d10 = Double.parseDouble(strArrSplit[i11]);
                dArr[i11] = d10;
                dMax = Math.max(dMax, Math.abs(d10));
            }
            if (dMax >= 1.0d) {
                for (int i12 = 0; i12 < length; i12++) {
                    dArr[i12] = dArr[i12] / 2.0d;
                }
                i10 = 1;
            } else {
                if (dMax >= 2.0d) {
                    throw new RuntimeException("数值必须小于2");
                }
                i10 = 0;
            }
            g gVar = new g(null);
            int i13 = (int) (dArr[0] * 8388607.0d);
            gVar.f5897c = i13 & 65535;
            gVar.f5902h = (i13 >> 16) & 255;
            int i14 = (int) (dArr[1] * 8388607.0d);
            gVar.f5896b = i14 & 65535;
            gVar.f5901g = (i14 >> 16) & 255;
            int i15 = (int) (dArr[2] * 8388607.0d);
            gVar.f5895a = i15 & 65535;
            gVar.f5900f = (i15 >> 16) & 255;
            int i16 = (int) (dArr[3] * 8388607.0d);
            gVar.f5899e = i16 & 65535;
            gVar.f5904s = (i16 >> 16) & 255;
            int i17 = (int) (dArr[4] * 8388607.0d);
            gVar.f5898d = i17 & 65535;
            gVar.f5903r = (i17 >> 16) & 255;
            gVar.f5905t = i10;
            Y4().b(v.WRITE_DE_EMPH_COEFFS, gVar);
        } catch (Exception e10) {
            Toast.makeText(k1(), "错误:" + e10.getLocalizedMessage(), 1).show();
            this.f5858o1.requestFocus();
        }
    }

    public void H5(r rVar) {
        I5(rVar, -2);
    }

    private void I5(r rVar, int i10) {
        if (this.f5852i1 == rVar) {
            return;
        }
        this.f5852i1 = rVar;
        int iOrdinal = rVar.ordinal();
        String[] strArr = this.f5860q1;
        String str = iOrdinal < strArr.length ? strArr[rVar.ordinal()] : null;
        if (str == null) {
            this.f5851h1.x();
        } else {
            this.f5851h1.p0(str);
            this.f5851h1.S(i10);
            this.f5851h1.W();
        }
        if (rVar == r.SettingsSaved) {
            C5();
        }
    }

    public void J5(v4.a aVar) {
        if (aVar == null) {
            return;
        }
        c0 c0Var = (c0) Y4();
        if (c0Var == null) {
            Toast.makeText(k1(), "未连接到设备", 1).show();
            return;
        }
        if (this.f5852i1 == r.SPIFlashFail) {
            Toast.makeText(k1(), "请先修复设备故障", 1).show();
            return;
        }
        if (c0Var.J1() != 1) {
            c.a aVar2 = new c.a(k1());
            if (c0Var.J1() == 0) {
                aVar2.k("设备认证失败,请确保手机可以访问互联网");
            } else {
                aVar2.k("已经包含相同ID在服务器,当前设备需要重新配置ID");
            }
            aVar2.m(android.R.string.cancel, null).t(R.string.retry, new d(c0Var)).C();
            return;
        }
        H5(r.WriteSettings);
        if (c0Var.Q.k() >= 71 && !c0Var.c2().f29710y) {
            c0Var.c2().f29710y = true;
            c0Var.A2();
        }
        c0Var.a(v.WRITE_ADVANCED_SETTINGS, aVar.b());
    }

    private void K5(f fVar) {
        this.f5857n1.a(fVar);
    }

    private void L5(h hVar) {
        this.f5850g1.e(hVar);
    }

    public void M5(v4.b bVar) {
        this.f5847d1.h(bVar);
        this.f5849f1.u(bVar);
        this.f5868y1.setSelection(bVar.f29717g);
        this.B1.setSelection(bVar.f29718h + 1);
        this.f5869z1.setSelection(bVar.f29724w);
        this.f5844a1.k(bVar, 2);
        this.f5845b1.k(bVar, 1);
        this.f5846c1.k(bVar, 0);
        this.S0.setSelection(bVar.f29726y);
        this.T0.setSelection(bVar.A);
    }

    public void N5(v4.a aVar) {
        this.f5867x1.setSelection(aVar.C);
        this.W0.setSelection(aVar.f29618g);
        this.X0.setSelection(aVar.f29619h);
        this.Y0.setSelection(aVar.f29620r);
        this.Z0.setSelection(aVar.f29621s);
        this.Q0.setSelection(aVar.f29622t);
        this.R0.setSelection(aVar.f29624v);
        this.U0.setSelection(aVar.f29623u);
        this.V0.setSelection(aVar.f29625w);
        this.f5844a1.l(aVar, 2);
        this.f5845b1.l(aVar, 1);
        this.f5846c1.l(aVar, 0);
        this.f5847d1.i(aVar);
        this.f5849f1.v(aVar);
    }

    public static /* synthetic */ void n5(SettingsFragment settingsFragment) {
        androidx.fragment.app.p pVarE1 = settingsFragment.e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
    }

    public static /* synthetic */ void o5(c0 c0Var, View view) {
        if (c0Var.S1() == a.g.IDLE) {
            c0Var.y();
        }
    }

    private p y5() {
        l1 l1VarY4 = Y4();
        int iF = l1VarY4 != null ? l1VarY4.d().f() : 3;
        p pVar = new p();
        v4.a aVar = new v4.a(iF);
        aVar.C = (int) this.f5867x1.getSelectedItemId();
        aVar.f29618g = (int) this.W0.getSelectedItemId();
        aVar.f29619h = (int) this.X0.getSelectedItemId();
        aVar.f29620r = (int) this.Y0.getSelectedItemId();
        aVar.f29621s = (int) this.Z0.getSelectedItemId();
        aVar.f29622t = (int) this.Q0.getSelectedItemId();
        aVar.f29624v = (int) this.R0.getSelectedItemId();
        aVar.f29623u = (int) this.U0.getSelectedItemId();
        aVar.f29625w = (int) this.V0.getSelectedItemId();
        EditText editTextH = this.f5844a1.h(aVar, 2);
        if (editTextH != null) {
            this.f5848e1.B(4).l();
            editTextH.requestFocus();
            return pVar;
        }
        EditText editTextH2 = this.f5845b1.h(aVar, 1);
        if (editTextH2 != null) {
            this.f5848e1.B(3).l();
            editTextH2.requestFocus();
            return pVar;
        }
        EditText editTextH3 = this.f5846c1.h(aVar, 0);
        if (editTextH3 != null) {
            this.f5848e1.B(2).l();
            editTextH3.requestFocus();
            return pVar;
        }
        EditText editTextC = this.f5847d1.c(aVar);
        if (editTextC != null) {
            this.f5848e1.B(1).l();
            editTextC.requestFocus();
            Toast.makeText(k1(), "输入包含错误", 0).show();
            return pVar;
        }
        EditText editTextR = this.f5849f1.r(aVar.H);
        if (editTextR != null) {
            this.f5848e1.B(6).l();
            editTextR.requestFocus();
            return pVar;
        }
        EditText editTextP = this.f5849f1.p(aVar);
        if (editTextP != null) {
            this.f5848e1.B(6).l();
            editTextP.requestFocus();
            return pVar;
        }
        l1 l1VarY42 = Y4();
        if (l1VarY42 != null) {
            if (l1VarY42.d().k() >= 36 && (editTextP = this.f5859p1.a()) != null) {
                this.f5848e1.B(7).l();
                editTextP.requestFocus();
                return pVar;
            }
            if (l1VarY42.d().k() >= 54) {
                aVar.F = true;
            }
        }
        v4.b bVarD = this.f5847d1.d(iF);
        if (l1VarY42 != null && l1VarY42.d().k() >= 78) {
            editTextP = this.f5849f1.o(bVarD);
        }
        if (editTextP != null) {
            this.f5848e1.B(6).l();
            editTextP.requestFocus();
            return pVar;
        }
        EditText editTextG = this.f5844a1.g(bVarD, 2);
        if (editTextG != null) {
            this.f5848e1.B(4).l();
            editTextG.requestFocus();
            return pVar;
        }
        EditText editTextG2 = this.f5845b1.g(bVarD, 1);
        if (editTextG2 != null) {
            this.f5848e1.B(3).l();
            editTextG2.requestFocus();
            return pVar;
        }
        EditText editTextG3 = this.f5846c1.g(bVarD, 0);
        if (editTextG3 != null) {
            this.f5848e1.B(2).l();
            editTextG3.requestFocus();
            return pVar;
        }
        bVarD.f29717g = (int) this.f5868y1.getSelectedItemId();
        bVarD.f29718h = (int) this.B1.getSelectedItemId();
        bVarD.f29724w = (int) this.f5869z1.getSelectedItemId();
        bVarD.f29726y = (int) this.S0.getSelectedItemId();
        bVarD.A = (int) this.T0.getSelectedItemId();
        pVar.f5949a = aVar;
        pVar.f5950b = bVarD;
        return pVar;
    }

    public void z5(String str) {
        if (this.H1 == null) {
            p pVarY5 = y5();
            this.H1 = pVarY5;
            if (pVarY5.f5949a == null) {
                this.H1 = null;
                return;
            }
        }
        EditText editTextA = this.f5859p1.a();
        if (editTextA != null) {
            this.f5848e1.B(7).l();
            editTextA.requestFocus();
            return;
        }
        this.f5865v1 = this.f5859p1.c();
        this.f5866w1 = this.f5859p1.e();
        if (TextUtils.isEmpty(str)) {
            v3.q.p4(k1(), "备份配置", "", "", "设置名称", 1).g4(j1(), "settings_name");
            return;
        }
        this.H1.f5949a.f29617f = str;
        v4.a aVar = this.H1.f5949a;
        FactorySettings factorySettings = new FactorySettings(0L, str, aVar.f29846a.length, aVar.b(), this.f5865v1.b(), this.f5866w1.b(), this.H1.f5950b.b());
        j0.f6341a.j().n(factorySettings);
        this.f5850g1.f5938c.D(factorySettings);
        this.H1 = null;
        this.f5865v1 = null;
        this.f5866w1 = null;
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.RestoreAllSettings /* 2131296268 */:
                G5(12292);
                return true;
            case R.id.RestoreFactorySettings /* 2131296269 */:
                G5(12290);
                return true;
            case R.id.ShowDebugScreen /* 2131296276 */:
                G5(12289);
                return true;
            case R.id._import /* 2131296280 */:
                A5();
                return true;
            case R.id.backup /* 2131296445 */:
                z5(null);
                return true;
            case R.id.recertification /* 2131297243 */:
                c0 c0VarW4 = W4();
                if (c0VarW4 != null) {
                    c0VarW4.y();
                }
                return true;
            case R.id.save /* 2131297304 */:
                J5(y5().f5949a);
                return true;
            case R.id.show_rf_status /* 2131297384 */:
                k5(com.dw.ht.factory.b.class);
                return true;
            case R.id.signal_gen /* 2131297388 */:
                k5(z.class);
                return true;
            case R.id.test /* 2131297506 */:
                FragmentShowActivity.h2(k1(), "Test", u8.class);
                return true;
            default:
                return super.F2(menuItem);
        }
    }

    public boolean G5(int i10) {
        l1 l1VarY4 = Y4();
        if (l1VarY4 instanceof c0) {
            return ((c0) l1VarY4).t(i10);
        }
        return false;
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void M(n0 n0Var, g3.d dVar) {
        g3.d dVar2;
        super.M(n0Var, dVar);
        if (dVar.m() != 2) {
            return;
        }
        v vVarD = v.d(dVar.e());
        int[] iArr = e.f5887c;
        switch (iArr[vVarD.ordinal()]) {
            case 1:
                dVar2 = dVar;
                if (e.f5885a[x.d(dVar2.d(0)).ordinal()] == 1) {
                    String strJ = m0.j(n0Var.q());
                    v4.u.w().c(n0Var);
                    if (n0Var instanceof v4.o) {
                        m3.a.e(((v4.o) n0Var).a3());
                    }
                    Toast.makeText(k1(), "已经恢复出厂状态", 0).show();
                    Cfg.m0(strJ);
                    T1().postDelayed(new Runnable() { // from class: q4.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingsFragment.n5(this.f24345a);
                        }
                    }, 2000L);
                }
                break;
            case 2:
                if (dVar.n()) {
                    if (e.f5886b[dVar.l().ordinal()] != 1) {
                        Toast.makeText(k1(), "设备 ID 保存失败(" + dVar.l() + ")", 0).show();
                        return;
                    }
                    if (n0Var.d().k() < 81) {
                        Toast.makeText(k1(), "设备 ID 已保存", 0).show();
                        return;
                    }
                    byte[] bytes = this.f5850g1.f5942g.getText().toString().trim().getBytes(w5.a.f31149x);
                    byte[] bArr = new byte[bytes.length + 4];
                    System.arraycopy(bytes, 0, bArr, 4, bytes.length);
                    n0Var.a(v.SET_MSG, bArr);
                    return;
                }
                return;
            case 3:
                if (dVar.n()) {
                    if (e.f5886b[dVar.l().ordinal()] == 1) {
                        Toast.makeText(k1(), "设备 ID 与 开机屏幕消息 已保存", 0).show();
                        return;
                    }
                    Toast.makeText(k1(), "设备 ID 与 开机屏幕消息 保存失败(" + dVar.l() + ")", 0).show();
                    return;
                }
                return;
            case 4:
                if (dVar.n()) {
                    int i10 = e.f5886b[dVar.l().ordinal()];
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return;
                        }
                        I5(r.SettingsSaveFail, -1);
                        return;
                    } else if (n0Var.d().k() >= 36) {
                        this.f5859p1.d(n0Var);
                        return;
                    } else {
                        I5(r.SettingsSaved, -1);
                        return;
                    }
                }
                return;
            case 5:
                if (dVar.n()) {
                    int i11 = e.f5886b[dVar.l().ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return;
                        }
                        I5(r.SettingsSaveFail, -1);
                        return;
                    } else if (n0Var.d().k() >= 41) {
                        n0Var.b(v.SET_VOC, this.f5859p1.e());
                        return;
                    } else {
                        I5(r.SettingsSaved, -1);
                        return;
                    }
                }
                return;
            case 6:
                if (dVar.n()) {
                    int i12 = e.f5886b[dVar.l().ordinal()];
                    if (i12 != 1) {
                        if (i12 != 2) {
                            return;
                        }
                        I5(r.SettingsSaveFail, -1);
                        return;
                    }
                    int iK = n0Var.d().k();
                    if (iK < 71) {
                        I5(r.SettingsSaved, -1);
                        return;
                    }
                    v4.b bVar = y5().f5950b;
                    if (bVar == null) {
                        I5(r.SettingsSaveFail, -1);
                        return;
                    } else {
                        n0Var.a(v.WRITE_ADVANCED_SETTINGS2, bVar.a(iK));
                        return;
                    }
                }
                return;
            case 7:
                if (dVar.n()) {
                    int i13 = e.f5886b[dVar.l().ordinal()];
                    if (i13 == 1) {
                        I5(r.SettingsSaved, -1);
                        return;
                    } else {
                        if (i13 != 2) {
                            return;
                        }
                        I5(r.SettingsSaveFail, -1);
                        return;
                    }
                }
                return;
            default:
                dVar2 = dVar;
                break;
        }
        if (DeviceFragment.a5(dVar2)) {
            switch (iArr[vVarD.ordinal()]) {
                case 8:
                    try {
                        N5(new v4.a(dVar2.i(), 1, dVar2.i().length, n0Var.d().f()));
                        n0Var.a(v.READ_RDA1846S_AGC, new byte[0]);
                    } catch (w5.g e10) {
                        Toast.makeText(k1(), e10.getLocalizedMessage(), 1).show();
                        e10.printStackTrace();
                        return;
                    }
                    break;
                case 9:
                    K5(new f(dVar2.i(), 1, dVar2.i().length));
                    if (n0Var.d().k() >= 50) {
                        n0Var.a(v.GET_DID, new byte[0]);
                    } else if (n0Var.d().k() < 36) {
                        H5(r.Idle);
                    } else {
                        n0Var.a(v.GET_IBA, new byte[0]);
                    }
                    break;
                case 10:
                    L5(new h(dVar2.i(), 1, dVar2.i().length));
                    if (n0Var.d().k() < 36) {
                        H5(r.Idle);
                    } else {
                        n0Var.a(v.GET_IBA, new byte[0]);
                    }
                    break;
                case 11:
                    this.f5859p1.f(new k(dVar2.i(), 1, dVar2.i().length));
                    if (n0Var.d().k() < 41) {
                        H5(r.Idle);
                    } else {
                        n0Var.a(v.GET_VOC, new byte[0]);
                    }
                    break;
                case 12:
                    this.f5859p1.g(new u(dVar2.i(), 1, dVar2.i().length));
                    if (n0Var.d().k() >= 71) {
                        n0Var.a(v.READ_ADVANCED_SETTINGS2, new byte[0]);
                    } else if (n0Var.d().k() < 46) {
                        H5(r.Idle);
                    } else {
                        n0Var.a(v.READ_RF_STATUS, new byte[0]);
                    }
                    break;
                case 13:
                    M5(new v4.b(dVar2.i(), 1, dVar2.i().length, n0Var.d().f()));
                    if (n0Var.d().k() < 81) {
                        n0Var.a(v.READ_RF_STATUS, new byte[0]);
                    } else {
                        n0Var.a(v.GET_MSG, new byte[0]);
                    }
                    break;
                case 14:
                    this.f5850g1.f5942g.setText(dVar2.i().length > 5 ? new String(dVar2.i(), 5, dVar2.i().length - 5, w5.a.f31149x).trim() : null);
                    n0Var.a(v.READ_RF_STATUS, new byte[0]);
                    break;
                case 15:
                    b.a aVar = new b.a(dVar2.i());
                    if (aVar.B() == 0) {
                        H5(r.Idle);
                    } else {
                        H5(r.SPIFlashFail);
                    }
                    if (aVar.k() > this.I1) {
                        this.I1 = aVar.k();
                        Toast.makeText(k1(), "注意 IIC 出现" + aVar.k() + "次通信错误", 0).show();
                    }
                    break;
            }
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void N0(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void a0(TabLayout.g gVar) {
        for (View view : this.P0) {
            view.setVisibility(8);
        }
        this.P0[gVar.g()].setVisibility(0);
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(n0 n0Var, n0 n0Var2) {
        n nVar;
        super.d5(n0Var, n0Var2);
        if (n0Var2 == null || (nVar = this.f5850g1) == null) {
            return;
        }
        nVar.c();
    }

    @Override // v3.v
    protected boolean f4(androidx.fragment.app.o oVar, int i10, int i11, int i12, Object obj) {
        if (!(oVar instanceof v3.q) || !a6.q.d("settings_name", oVar.P1())) {
            return super.f4(oVar, i10, i11, i12, obj);
        }
        if (i11 != -1) {
            return true;
        }
        z5((String) obj);
        return true;
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        this.f5853j1 = k1().getSharedPreferences("factory_settings_v2", 0);
        this.f5854k1 = new y5.d(k1(), this.f5853j1);
        this.f5861r1 = k1().getSharedPreferences("factory_settings_iba_v2", 0);
        this.f5863t1 = new y5.d(k1(), this.f5861r1);
        this.f5862s1 = k1().getSharedPreferences("factory_settings_vco_v2", 0);
        this.f5864u1 = new y5.d(k1(), this.f5862s1);
        this.f5855l1 = k1().getSharedPreferences("factory_settings2_v2", 0);
        this.f5856m1 = new y5.d(k1(), this.f5855l1);
        if (j0.f6341a.j().c() == 0) {
            for (String str : this.f5853j1.getAll().keySet()) {
                j0.f6341a.j().n(new FactorySettings(0L, str, 3, this.f5854k1.d(str), this.f5863t1.d(str), this.f5864u1.d(str), this.f5856m1.d(str)));
            }
        }
        G3(true);
        z4("高级设置");
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void t(TabLayout.g gVar) {
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater menuInflater) {
        super.u2(menu, menuInflater);
        menuInflater.inflate(R.menu.factory_device_settings, menu);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.factory_fragment_device_settings, viewGroup, false);
        TabLayout tabLayout = (TabLayout) viewInflate.findViewById(R.id.tab_layout);
        this.f5848e1 = tabLayout;
        tabLayout.h(this);
        this.P0[0] = viewInflate.findViewById(R.id.tc_main);
        this.P0[1] = viewInflate.findViewById(R.id.tc_freq_range);
        this.P0[6] = viewInflate.findViewById(R.id.tc_squelch_level);
        this.P0[4] = viewInflate.findViewById(R.id.tc_tx_power_h);
        this.P0[3] = viewInflate.findViewById(R.id.tc_tx_power_m);
        this.P0[2] = viewInflate.findViewById(R.id.tc_tx_power_l);
        this.P0[5] = viewInflate.findViewById(R.id.tc_vol_and_dev);
        this.P0[8] = viewInflate.findViewById(R.id.tc_agc);
        this.P0[7] = viewInflate.findViewById(R.id.tc_iba);
        B5(this.P0[5]);
        s sVar = new s(this.P0[4]);
        this.f5844a1 = sVar;
        sVar.c();
        this.f5845b1 = new s(this.P0[3]);
        this.f5846c1 = new s(this.P0[2]);
        this.f5849f1 = new q(this.P0[6]);
        this.f5847d1 = new j(this.P0[1]);
        this.f5850g1 = new n(this.P0[0]);
        this.f5857n1 = new AGCViewHolder(this.P0[8]);
        this.f5859p1 = new l(this.P0[7]);
        this.f5851h1 = Snackbar.l0(viewInflate, "正在读取设置", -2);
        TextView textView = (TextView) viewInflate.findViewById(R.id.status);
        View viewFindViewById = viewInflate.findViewById(R.id.content);
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null || l1VarY4.q() == 0) {
            N5(new v4.a(3));
            textView.setVisibility(8);
            viewFindViewById.setVisibility(0);
            return viewInflate;
        }
        int iK = l1VarY4.d().k();
        if (iK < 54) {
            this.f5845b1.c();
            this.f5846c1.c();
        }
        D5(iK);
        this.f5850g1.d(iK);
        this.f5844a1.d(iK);
        this.f5845b1.d(iK);
        this.f5846c1.d(iK);
        this.f5847d1.f(iK >= 71);
        this.f5847d1.e(iK >= 74);
        this.f5847d1.g(iK >= 77);
        this.f5849f1.s(iK >= 78);
        this.f5849f1.d(iK);
        if (!(l1VarY4 instanceof c0)) {
            return viewInflate;
        }
        final c0 c0Var = (c0) l1VarY4;
        Dm.DeviceID deviceIDR1 = c0Var.R1();
        if (deviceIDR1 != null) {
            x4(deviceIDR1.toString());
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: q4.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsFragment.o5(c0Var, view);
            }
        });
        if (c0Var.J1() == 1) {
            H5(r.ReadingSettings);
            l1VarY4.a(v.READ_ADVANCED_SETTINGS, new byte[0]);
            return viewInflate;
        }
        textView.setVisibility(0);
        viewFindViewById.setVisibility(8);
        H5(r.WaitCertification);
        textView.setText("等待认证完成");
        if (c0Var.S1() == a.g.IDLE) {
            c0Var.y();
        }
        viewInflate.postDelayed(new a(c0Var, l1VarY4, textView, viewFindViewById, viewInflate), 100L);
        return viewInflate;
    }

    public static class k implements q0 {

        /* JADX INFO: renamed from: a */
        private final m[] f5930a;

        public k(m[] mVarArr) {
            this.f5930a = mVarArr;
        }

        @Override // v4.q0
        public /* synthetic */ byte[] a(int i10) {
            return p0.b(this, i10);
        }

        @Override // v4.q0
        public byte[] b() {
            m[] mVarArr = this.f5930a;
            if (mVarArr.length == 0) {
                return new byte[0];
            }
            byte[] bArr = new byte[mVarArr.length * 2];
            a6.v vVar = new a6.v(bArr);
            for (m mVar : this.f5930a) {
                vVar.n(mVar.f5934a, 6);
                vVar.n(mVar.f5935b, 10);
            }
            return bArr;
        }

        public k(byte[] bArr, int i10, int i11) {
            a6.v vVar = new a6.v(bArr, i10 * 8);
            this.f5930a = new m[(i11 - i10) / 2];
            int i12 = 0;
            while (true) {
                m[] mVarArr = this.f5930a;
                if (i12 >= mVarArr.length) {
                    return;
                }
                mVarArr[i12] = new m(vVar.i(6), vVar.i(10));
                i12++;
            }
        }
    }

    public static class u implements q0 {

        /* JADX INFO: renamed from: a */
        private final t[] f5988a;

        public u(t[] tVarArr) {
            this.f5988a = tVarArr;
        }

        @Override // v4.q0
        public /* synthetic */ byte[] a(int i10) {
            return p0.b(this, i10);
        }

        @Override // v4.q0
        public byte[] b() {
            t[] tVarArr = this.f5988a;
            if (tVarArr.length == 0) {
                return new byte[0];
            }
            byte[] bArr = new byte[tVarArr.length * 2];
            a6.v vVar = new a6.v(bArr);
            for (t tVar : this.f5988a) {
                vVar.n(tVar.f5986a, 4);
                vVar.n(tVar.f5987b, 12);
            }
            return bArr;
        }

        public u(byte[] bArr, int i10, int i11) {
            a6.v vVar = new a6.v(bArr, i10 * 8);
            this.f5988a = new t[(i11 - i10) / 2];
            int i12 = 0;
            while (true) {
                t[] tVarArr = this.f5988a;
                if (i12 >= tVarArr.length) {
                    return;
                }
                tVarArr[i12] = new t(vVar.i(4), vVar.i(12));
                i12++;
            }
        }
    }

    private class f implements q0 {

        /* JADX INFO: renamed from: a */
        boolean f5888a;

        /* JADX INFO: renamed from: b */
        int f5889b;

        /* JADX INFO: renamed from: c */
        int f5890c;

        /* JADX INFO: renamed from: d */
        int f5891d;

        /* JADX INFO: renamed from: e */
        int f5892e;

        /* JADX INFO: renamed from: f */
        int f5893f;

        public f(byte[] bArr, int i10, int i11) {
            a6.v vVar = new a6.v(bArr, i10 * 8);
            this.f5888a = vVar.c();
            this.f5889b = vVar.i(7);
            this.f5890c = vVar.i(4);
            this.f5891d = vVar.i(4);
            this.f5892e = vVar.i(3);
            this.f5893f = vVar.i(5);
        }

        @Override // v4.q0
        public /* synthetic */ byte[] a(int i10) {
            return p0.b(this, i10);
        }

        @Override // v4.q0
        public byte[] b() {
            byte[] bArr = new byte[4];
            new a6.v(bArr).p(this.f5888a).n(this.f5889b, 7).n(this.f5890c, 4).n(this.f5891d, 4).n(this.f5892e, 3).n(this.f5893f, 5);
            return bArr;
        }

        public f() {
        }
    }
}
