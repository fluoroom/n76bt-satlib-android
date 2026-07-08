package com.dw.ht.factory;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
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
import androidx.gridlayout.widget.GridLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.factory.SettingsV1Fragment;
import com.dw.ht.fragments.DeviceFragment;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import g3.a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import q4.z;
import s4.s1;
import v4.c0;
import v4.l1;
import v4.m0;
import v4.n0;
import v4.p0;
import v4.q0;
import v4.u;
import v4.v;
import v4.x;

/* JADX INFO: loaded from: classes.dex */
public class SettingsV1Fragment extends DeviceFragment implements TabLayout.d {
    private Spinner P0;
    private Spinner Q0;
    private Spinner R0;
    private Spinner S0;
    private Spinner T0;
    private Spinner U0;
    private Spinner V0;
    private Spinner W0;
    private q Y0;
    private q Z0;

    /* JADX INFO: renamed from: a1 */
    private i f5989a1;

    /* JADX INFO: renamed from: b1 */
    private TabLayout f5990b1;

    /* JADX INFO: renamed from: c1 */
    private o f5991c1;

    /* JADX INFO: renamed from: d1 */
    private m f5992d1;

    /* JADX INFO: renamed from: e1 */
    private Snackbar f5993e1;

    /* JADX INFO: renamed from: g1 */
    private v4.c f5995g1;

    /* JADX INFO: renamed from: h1 */
    private SharedPreferences f5996h1;

    /* JADX INFO: renamed from: i1 */
    private y5.d f5997i1;

    /* JADX INFO: renamed from: j1 */
    private AGCViewHolder f5998j1;

    /* JADX INFO: renamed from: k1 */
    private EditText f5999k1;

    /* JADX INFO: renamed from: l1 */
    private k f6000l1;

    /* JADX INFO: renamed from: n1 */
    private SharedPreferences f6002n1;

    /* JADX INFO: renamed from: o1 */
    private SharedPreferences f6003o1;

    /* JADX INFO: renamed from: p1 */
    private y5.d f6004p1;

    /* JADX INFO: renamed from: q1 */
    private y5.d f6005q1;

    /* JADX INFO: renamed from: r1 */
    private j f6006r1;

    /* JADX INFO: renamed from: s1 */
    private s f6007s1;
    private View[] X0 = new View[8];

    /* JADX INFO: renamed from: f1 */
    private p f5994f1 = p.Idle;

    /* JADX INFO: renamed from: m1 */
    private String[] f6001m1 = {"等待认证完成", "认证失败", "正在读取设置", "正在写入设置", "设置已写入", "设置写入失败,请尝试重新启动设备", null};

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
            this.sm_start_noise_l.setText(String.valueOf(fVar.f6026b));
            this.sm_attenu.setText(String.valueOf(fVar.f6027c));
            this.sm_time.setText(String.valueOf(fVar.f6028d));
            this.sm_change_interval.setText(String.valueOf(fVar.f6029e));
            this.agc_change_thd.setText(String.valueOf(fVar.f6030f));
            this.sm_en.setChecked(fVar.f6025a);
        }

        @OnClick
        void save() {
            try {
                f fVar = SettingsV1Fragment.this.new f();
                fVar.f6026b = Integer.parseInt(this.sm_start_noise_l.getText().toString());
                fVar.f6027c = Integer.parseInt(this.sm_attenu.getText().toString());
                fVar.f6028d = Integer.parseInt(this.sm_time.getText().toString());
                fVar.f6029e = Integer.parseInt(this.sm_change_interval.getText().toString());
                fVar.f6030f = Integer.parseInt(this.agc_change_thd.getText().toString());
                fVar.f6025a = this.sm_en.isChecked();
                SettingsV1Fragment.this.Y4().b(v.WRITE_RDA1846S_AGC, fVar);
            } catch (NumberFormatException unused) {
            }
        }
    }

    public class AGCViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b */
        private AGCViewHolder f6009b;

        /* JADX INFO: renamed from: c */
        private View f6010c;

        class a extends t1.b {

            /* JADX INFO: renamed from: d */
            final /* synthetic */ AGCViewHolder f6011d;

            a(AGCViewHolder aGCViewHolder) {
                this.f6011d = aGCViewHolder;
            }

            @Override // t1.b
            public void b(View view) {
                this.f6011d.save();
            }
        }

        public AGCViewHolder_ViewBinding(AGCViewHolder aGCViewHolder, View view) {
            this.f6009b = aGCViewHolder;
            aGCViewHolder.sm_start_noise_l = (EditText) t1.c.d(view, R.id.sm_start_noise_l, "field 'sm_start_noise_l'", EditText.class);
            aGCViewHolder.sm_attenu = (EditText) t1.c.d(view, R.id.sm_attenu, "field 'sm_attenu'", EditText.class);
            aGCViewHolder.sm_time = (EditText) t1.c.d(view, R.id.sm_time, "field 'sm_time'", EditText.class);
            aGCViewHolder.sm_change_interval = (EditText) t1.c.d(view, R.id.sm_change_interval, "field 'sm_change_interval'", EditText.class);
            aGCViewHolder.agc_change_thd = (EditText) t1.c.d(view, R.id.agc_change_thd, "field 'agc_change_thd'", EditText.class);
            aGCViewHolder.sm_en = (Switch) t1.c.d(view, R.id.sm_en, "field 'sm_en'", Switch.class);
            View viewC = t1.c.c(view, R.id.agc_save, "method 'save'");
            this.f6010c = viewC;
            viewC.setOnClickListener(new a(aGCViewHolder));
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ l1 f6013a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TextView f6014b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f6015c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ View f6016d;

        a(l1 l1Var, TextView textView, View view, View view2) {
            this.f6013a = l1Var;
            this.f6014b = textView;
            this.f6015c = view;
            this.f6016d = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iJ1 = ((v4.o) this.f6013a).J1();
            if (iJ1 == 1) {
                SettingsV1Fragment.this.J5(p.ReadingSettings);
                this.f6013a.a(v.READ_ADVANCED_SETTINGS, new byte[0]);
                this.f6014b.setVisibility(8);
                this.f6015c.setVisibility(0);
                return;
            }
            if (iJ1 != 2) {
                this.f6016d.postDelayed(this, 1000L);
            } else {
                SettingsV1Fragment.this.J5(p.Unauthorized);
                this.f6014b.setText("已经包含相同ID在服务器,当前设备需要重新配置ID");
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SettingsV1Fragment.this.H5();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CharSequence text = ((ClipboardManager) SettingsV1Fragment.this.k1().getSystemService("clipboard")).getText();
            if (TextUtils.isEmpty(text)) {
                return;
            }
            SettingsV1Fragment.this.f5999k1.setText(text);
        }
    }

    class d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ v4.o f6020a;

        d(v4.o oVar) {
            this.f6020a = oVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f6020a.y();
        }
    }

    static /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f6022a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f6023b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f6024c;

        static {
            int[] iArr = new int[v.values().length];
            f6024c = iArr;
            try {
                iArr[v.EVENT_NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6024c[v.SET_DID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6024c[v.WRITE_ADVANCED_SETTINGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6024c[v.SET_IBA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6024c[v.SET_VOC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6024c[v.READ_ADVANCED_SETTINGS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6024c[v.READ_RDA1846S_AGC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6024c[v.GET_IBA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6024c[v.GET_VOC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[a.b.values().length];
            f6023b = iArr2;
            try {
                iArr2[a.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6023b[a.b.INCORRECT_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr3 = new int[x.values().length];
            f6022a = iArr3;
            try {
                iArr3[x.RESTORE_FACTORY_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private static class g implements q0 {

        /* JADX INFO: renamed from: a */
        int f6032a;

        /* JADX INFO: renamed from: b */
        int f6033b;

        /* JADX INFO: renamed from: c */
        int f6034c;

        /* JADX INFO: renamed from: d */
        int f6035d;

        /* JADX INFO: renamed from: e */
        int f6036e;

        /* JADX INFO: renamed from: f */
        int f6037f;

        /* JADX INFO: renamed from: g */
        int f6038g;

        /* JADX INFO: renamed from: h */
        int f6039h;

        /* JADX INFO: renamed from: r */
        int f6040r;

        /* JADX INFO: renamed from: s */
        int f6041s;

        /* JADX INFO: renamed from: t */
        int f6042t;

        private g() {
        }

        @Override // v4.q0
        public /* synthetic */ byte[] a(int i10) {
            return p0.b(this, i10);
        }

        @Override // v4.q0
        public byte[] b() {
            byte[] bArr = new byte[16];
            new a6.v(bArr).n(this.f6032a, 16).n(this.f6033b, 16).n(this.f6034c, 16).n(this.f6035d, 16).n(this.f6036e, 16).n(this.f6037f, 8).n(this.f6038g, 8).n(this.f6039h, 8).n(this.f6040r, 8).n(this.f6041s, 8).n(this.f6042t, 8);
            return bArr;
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    public static class h extends Exception {

        /* JADX INFO: renamed from: a */
        public EditText f6043a;

        public h(EditText editText, String str) {
            super(str);
            this.f6043a = editText;
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a */
        private final EditText[][] f6044a = (EditText[][]) Array.newInstance((Class<?>) EditText.class, 3, 2);

        /* JADX INFO: renamed from: b */
        private final CheckBox[] f6045b = new CheckBox[3];

        public i(View view) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.freq_limits);
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt instanceof EditText) {
                    this.f6044a[i10 / 2][i10 % 2] = (EditText) childAt;
                    i10++;
                } else if (childAt instanceof CheckBox) {
                    this.f6045b[i11] = (CheckBox) childAt;
                    i11++;
                }
            }
        }

        public EditText a(v4.c cVar) {
            for (int i10 = 0; i10 < cVar.f29732b.length; i10++) {
                int i11 = 0;
                while (true) {
                    int[] iArr = cVar.f29732b[i10];
                    if (i11 < iArr.length) {
                        try {
                            iArr[i11] = Integer.parseInt(this.f6044a[i10][i11].getText().toString());
                            i11++;
                        } catch (NumberFormatException e10) {
                            e10.printStackTrace();
                            return this.f6044a[i10][i11];
                        }
                    }
                }
                cVar.f29733c[i10] = this.f6045b[i10].isChecked();
            }
            return null;
        }

        public void b(v4.c cVar) {
            for (int i10 = 0; i10 < cVar.f29732b.length; i10++) {
                int i11 = 0;
                while (true) {
                    int[] iArr = cVar.f29732b[i10];
                    if (i11 < iArr.length) {
                        this.f6044a[i10][i11].setText(String.valueOf(iArr[i11]));
                        i11++;
                    }
                }
                this.f6045b[i10].setChecked(cVar.f29733c[i10]);
            }
        }
    }

    private class k {

        /* JADX INFO: renamed from: a */
        private final ViewGroup f6047a;

        /* JADX INFO: renamed from: b */
        private final ViewGroup f6048b;

        public k(View view) {
            this.f6047a = (ViewGroup) view.findViewById(R.id.iba);
            this.f6048b = (ViewGroup) view.findViewById(R.id.vco);
        }

        public EditText a() {
            boolean z10 = false;
            int i10 = 0;
            int i11 = 2;
            while (i11 < this.f6047a.getChildCount() - 1) {
                int i12 = i11 + 1;
                EditText editText = (EditText) this.f6047a.getChildAt(i11);
                i11 += 2;
                EditText editText2 = (EditText) this.f6047a.getChildAt(i12);
                String strTrim = editText.getText().toString().trim();
                String strTrim2 = editText2.getText().toString().trim();
                if (z10) {
                    if (strTrim.length() != 0) {
                        Toast.makeText(SettingsV1Fragment.this.k1(), "不使用的需要留空", 1).show();
                        return editText;
                    }
                    if (strTrim2.length() != 0) {
                        Toast.makeText(SettingsV1Fragment.this.k1(), "不使用的需要留空", 1).show();
                        return editText2;
                    }
                }
                if (strTrim.length() == 0) {
                    if (strTrim2.length() != 0) {
                        Toast.makeText(SettingsV1Fragment.this.k1(), "不使用的需要留空", 1).show();
                        return editText2;
                    }
                    z10 = true;
                }
                if (strTrim2.length() != 0) {
                    try {
                        int i13 = Integer.parseInt(strTrim);
                        if (i13 < i10) {
                            Toast.makeText(SettingsV1Fragment.this.k1(), "频率必须逐渐变大", 1).show();
                            return editText;
                        }
                        if (i13 > 63 || i13 < 0) {
                            Toast.makeText(SettingsV1Fragment.this.k1(), "频率不能大于63", 1).show();
                            return editText;
                        }
                        try {
                            int i14 = Integer.parseInt(strTrim2);
                            if (i14 <= 1023 && i14 >= 0) {
                                i10 = i13;
                            }
                            Toast.makeText(SettingsV1Fragment.this.k1(), "DAC不能大于1023", 1).show();
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
            ViewGroup viewGroup = this.f6048b;
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
                            Toast.makeText(SettingsV1Fragment.this.k1(), "地址不能大于15", 1).show();
                            return editText;
                        }
                        try {
                            int i13 = Integer.parseInt(strTrim2);
                            if (i13 > 4095 || i13 < 0) {
                                Toast.makeText(SettingsV1Fragment.this.k1(), "DAC不能大于4095", 1).show();
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

        public j c() {
            ArrayList arrayListA = a6.o.a();
            int i10 = 2;
            while (i10 < this.f6047a.getChildCount() - 1) {
                int i11 = i10 + 1;
                EditText editText = (EditText) this.f6047a.getChildAt(i10);
                i10 += 2;
                EditText editText2 = (EditText) this.f6047a.getChildAt(i11);
                String strTrim = editText.getText().toString().trim();
                String strTrim2 = editText2.getText().toString().trim();
                if (strTrim.length() == 0 || strTrim2.length() == 0) {
                    break;
                }
                try {
                    arrayListA.add(new l(Integer.parseInt(strTrim), Integer.parseInt(strTrim2)));
                } catch (NumberFormatException e10) {
                    e10.printStackTrace();
                }
            }
            return new j((l[]) arrayListA.toArray(new l[arrayListA.size()]));
        }

        public void d(n0 n0Var) {
            n0Var.b(v.SET_IBA, c());
        }

        public s e() {
            ViewGroup viewGroup = this.f6048b;
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
                        arrayListA.add(new r(Integer.parseInt(strTrim), Integer.parseInt(strTrim2)));
                    } catch (NumberFormatException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            return new s((r[]) arrayListA.toArray(new r[arrayListA.size()]));
        }

        public void f(j jVar) {
            int i10 = 2;
            for (int i11 = 2; i11 < this.f6047a.getChildCount(); i11++) {
                ((EditText) this.f6047a.getChildAt(i11)).setText("");
            }
            for (l lVar : jVar.f6046a) {
                int i12 = i10 + 1;
                if (this.f6047a.getChildCount() <= i12) {
                    return;
                }
                EditText editText = (EditText) this.f6047a.getChildAt(i10);
                i10 += 2;
                EditText editText2 = (EditText) this.f6047a.getChildAt(i12);
                editText.setText(String.valueOf(lVar.f6050a));
                editText2.setText(String.valueOf(lVar.f6051b));
            }
        }

        public void g(s sVar) {
            ViewGroup viewGroup = this.f6048b;
            int i10 = 2;
            for (int i11 = 2; i11 < viewGroup.getChildCount(); i11++) {
                ((EditText) viewGroup.getChildAt(i11)).setText("");
            }
            for (r rVar : sVar.f6082a) {
                int i12 = i10 + 1;
                if (viewGroup.getChildCount() <= i12) {
                    return;
                }
                EditText editText = (EditText) viewGroup.getChildAt(i10);
                i10 += 2;
                EditText editText2 = (EditText) viewGroup.getChildAt(i12);
                editText.setText(String.valueOf(rVar.f6080a));
                editText2.setText(String.valueOf(rVar.f6081b));
            }
        }
    }

    public static class l {

        /* JADX INFO: renamed from: a */
        int f6050a;

        /* JADX INFO: renamed from: b */
        int f6051b;

        public l(int i10, int i11) {
            this.f6050a = i10;
            this.f6051b = i11;
        }
    }

    private class m implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final Context f6052a;

        /* JADX INFO: renamed from: b */
        private final RecyclerView f6053b;

        /* JADX INFO: renamed from: c */
        private final d f6054c;

        /* JADX INFO: renamed from: d */
        private final EditText f6055d;

        /* JADX INFO: renamed from: e */
        private final Spinner f6056e;

        /* JADX INFO: renamed from: f */
        private final EditText f6057f;

        class a implements AdapterView.OnItemSelectedListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ SettingsV1Fragment f6059a;

            a(SettingsV1Fragment settingsV1Fragment) {
                this.f6059a = settingsV1Fragment;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
                Cfg.K().edit().putInt("factory.vendor", i10).apply();
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView adapterView) {
            }
        }

        class b implements TextWatcher {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ SettingsV1Fragment f6061a;

            b(SettingsV1Fragment settingsV1Fragment) {
                this.f6061a = settingsV1Fragment;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Cfg.K().edit().putString("factory.dev_name", editable.toString().trim()).apply();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        }

        private class c extends RecyclerView.f0 implements View.OnClickListener {
            private final TextView D;
            private final View E;
            private v4.c F;

            public c(View view) {
                super(view);
                this.D = (TextView) view.findViewById(R.id.name);
                View viewFindViewById = view.findViewById(R.id.del_btn);
                this.E = viewFindViewById;
                viewFindViewById.setOnClickListener(this);
                view.setOnClickListener(this);
            }

            public void O(v4.c cVar) {
                this.D.setText(cVar.f29731a);
                this.F = cVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view.getId() == R.id.del_btn) {
                    m.this.f6054c.M(k());
                    SettingsV1Fragment.this.f5996h1.edit().remove(this.F.f29731a).apply();
                    SettingsV1Fragment.this.f6002n1.edit().remove(this.F.f29731a).apply();
                    SettingsV1Fragment.this.f6003o1.edit().remove(this.F.f29731a).apply();
                    return;
                }
                byte[] bArrD = SettingsV1Fragment.this.f6004p1.d(this.F.f29731a);
                if (bArrD == null) {
                    bArrD = new byte[0];
                }
                SettingsV1Fragment.this.f6000l1.f(new j(bArrD, 0, bArrD.length));
                byte[] bArrD2 = SettingsV1Fragment.this.f6005q1.d(this.F.f29731a);
                if (bArrD2 == null) {
                    bArrD2 = new byte[0];
                }
                SettingsV1Fragment.this.f6000l1.g(new s(bArrD2, 0, bArrD2.length));
                SettingsV1Fragment.this.C5(this.F);
            }
        }

        class d extends c6.b {
            public d(Context context) {
                super(context, 0);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.h
            /* JADX INFO: renamed from: Q */
            public void s(c cVar, int i10) {
                cVar.O((v4.c) J(i10));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.h
            /* JADX INFO: renamed from: R */
            public c u(ViewGroup viewGroup, int i10) {
                return m.this.new c(this.f4395r.inflate(R.layout.factory_device_setting_item, viewGroup, false));
            }
        }

        public m(View view) {
            this.f6052a = view.getContext();
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.actions);
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                viewGroup.getChildAt(i10).setOnClickListener(this);
            }
            view.findViewById(R.id.save_dev_id).setOnClickListener(this);
            this.f6055d = (EditText) view.findViewById(R.id.dev_id);
            this.f6053b = (RecyclerView) view.findViewById(R.id.list);
            this.f6056e = (Spinner) view.findViewById(R.id.v_id);
            this.f6057f = (EditText) view.findViewById(R.id.dev_name);
            this.f6054c = new d(this.f6052a);
            for (String str : SettingsV1Fragment.this.f5996h1.getAll().keySet()) {
                byte[] bArrD = SettingsV1Fragment.this.f5997i1.d(str);
                try {
                    v4.c cVar = new v4.c(bArrD, 0, bArrD.length);
                    cVar.f29731a = str;
                    this.f6054c.D(cVar);
                } catch (w5.g e10) {
                    e10.printStackTrace();
                }
            }
            this.f6056e.setSelection(Cfg.K().getInt("factory.vendor", 0));
            this.f6056e.setOnItemSelectedListener(new a(SettingsV1Fragment.this));
            this.f6053b.setAdapter(this.f6054c);
            this.f6053b.l(new c6.m(this.f6052a, 0));
            this.f6057f.setText(Cfg.K().getString("factory.dev_name", ""));
            this.f6057f.addTextChangedListener(new b(SettingsV1Fragment.this));
            b();
        }

        public void b() {
            l1 l1VarY4 = SettingsV1Fragment.this.Y4();
            if (l1VarY4 == null) {
                return;
            }
            this.f6055d.setText(String.format(Locale.ENGLISH, "%d%sS", Integer.valueOf(Calendar.getInstance().get(1) % 20), l1VarY4.d().g()));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i10;
            if (view.getId() == R.id.backup) {
                SettingsV1Fragment.this.B5(null);
                return;
            }
            v4.o oVar = (v4.o) SettingsV1Fragment.this.Y4();
            if (oVar == null) {
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
                    SettingsV1Fragment.this.k5(s1.class);
                    return;
                case R.id.save_dev_id /* 2131297307 */:
                    int i11 = 0;
                    if (oVar.d().k() < 45) {
                        char[] charArray = this.f6055d.getText().toString().toUpperCase().trim().toCharArray();
                        byte[] bArr = new byte[charArray.length + (charArray.length % 2)];
                        while (i11 < charArray.length) {
                            bArr[i11] = (byte) charArray[i11];
                            i11++;
                        }
                        oVar.a(v.SET_DID, bArr);
                        return;
                    }
                    byte[] bArr2 = new byte[34];
                    a6.v vVar = new a6.v(bArr2);
                    char[] charArray2 = this.f6055d.getText().toString().toUpperCase().trim().toCharArray();
                    char[] charArray3 = this.f6057f.getText().toString().toUpperCase().trim().toCharArray();
                    for (int i12 = 0; i12 < charArray2.length && i12 < 16; i12++) {
                        vVar.n(charArray2[i12], 8);
                    }
                    vVar.l(128);
                    while (i11 < charArray3.length && i11 < 16) {
                        vVar.n(charArray3[i11], 8);
                        i11++;
                    }
                    vVar.l(256);
                    vVar.n(this.f6056e.getSelectedItemPosition(), 16);
                    oVar.a(v.SET_DID, bArr2);
                    return;
                case R.id.show_rf_status /* 2131297384 */:
                    SettingsV1Fragment.this.k5(com.dw.ht.factory.b.class);
                    return;
                case R.id.signal_gen /* 2131297388 */:
                    SettingsV1Fragment.this.k5(z.class);
                    return;
                default:
                    return;
            }
            oVar.t(i10);
        }
    }

    private static class n extends ArrayAdapter {

        /* JADX INFO: renamed from: a */
        private int f6063a;

        /* JADX INFO: renamed from: b */
        private int f6064b;

        public n(Context context, int i10, int i11) {
            super(context, android.R.layout.simple_spinner_item);
            this.f6063a = i10;
            this.f6064b = i11;
            setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /* JADX INFO: renamed from: a */
        public Integer getItem(int i10) {
            return Integer.valueOf(i10 + this.f6063a);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public int getCount() {
            return (this.f6064b - this.f6063a) + 1;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10 + this.f6063a;
        }
    }

    private static class o extends q {

        /* JADX INFO: renamed from: c */
        private final GridLayout f6065c;

        /* JADX INFO: renamed from: d */
        private final EditText f6066d;

        /* JADX INFO: renamed from: e */
        private final EditText f6067e;

        /* JADX INFO: renamed from: f */
        private final EditText f6068f;

        /* JADX INFO: renamed from: g */
        private final EditText f6069g;

        public o(View view) {
            super(view);
            this.f6065c = (GridLayout) view.findViewById(R.id.squelch_level);
            ((TextView) view.findViewById(R.id.title)).setText("补偿[0,15]");
            this.f6066d = (EditText) view.findViewById(R.id.wideNoiseThreshold);
            this.f6067e = (EditText) view.findViewById(R.id.narrowNoiseThreshold);
            this.f6068f = (EditText) view.findViewById(R.id.rssiDifference);
            this.f6069g = (EditText) view.findViewById(R.id.noiseDifference);
        }

        @Override // com.dw.ht.factory.SettingsV1Fragment.q
        public EditText d(int[][] iArr) {
            for (int i10 = 0; i10 < iArr.length; i10++) {
                for (int i11 = 0; i11 < iArr[i10].length; i11++) {
                    EditText editTextA = a(i10, i11);
                    try {
                        int i12 = Integer.parseInt(editTextA.getText().toString());
                        if (i12 >= 0 && i12 <= 15) {
                            iArr[i10][i11] = i12;
                        }
                        Toast.makeText(this.f6078a, "允许的值0到15", 0).show();
                        return editTextA;
                    } catch (NumberFormatException unused) {
                        Toast.makeText(this.f6078a, "允许的值0到15", 0).show();
                        return editTextA;
                    }
                }
            }
            return null;
        }

        EditText f(int i10) {
            return (EditText) this.f6065c.getChildAt((i10 * 2) + 1);
        }

        public EditText g(v4.c cVar) {
            EditText editTextD = d(cVar.f29737g);
            if (editTextD != null) {
                return editTextD;
            }
            try {
                cVar.f29746p = SettingsV1Fragment.G5(this.f6066d, 0, 99);
                cVar.f29747q = SettingsV1Fragment.G5(this.f6067e, 0, 99);
                cVar.f29748r = SettingsV1Fragment.G5(this.f6068f, 0, 99);
                cVar.f29749s = SettingsV1Fragment.G5(this.f6069g, 0, 99);
                return null;
            } catch (h e10) {
                Toast.makeText(this.f6078a, e10.getMessage(), 0).show();
                return e10.f6043a;
            }
        }

        public EditText h(int[] iArr) {
            for (int i10 = 0; i10 < iArr.length; i10++) {
                EditText editTextF = f(i10);
                try {
                    int i11 = Integer.parseInt(editTextF.getText().toString());
                    if (i11 >= 0 && i11 <= 63) {
                        iArr[i10] = i11;
                    }
                    Toast.makeText(this.f6078a, "允许的值0到63", 0).show();
                    return editTextF;
                } catch (NumberFormatException unused) {
                    Toast.makeText(this.f6078a, "允许的值0到63", 0).show();
                    return editTextF;
                }
            }
            return null;
        }

        public void i(v4.c cVar) {
            super.e(cVar.f29737g);
            for (int i10 = 0; i10 < cVar.f29736f.length; i10++) {
                f(i10).setText(String.valueOf(cVar.f29736f[i10]));
            }
            this.f6066d.setText(String.valueOf(cVar.f29746p));
            this.f6067e.setText(String.valueOf(cVar.f29747q));
            this.f6068f.setText(String.valueOf(cVar.f29748r));
            this.f6069g.setText(String.valueOf(cVar.f29749s));
        }
    }

    enum p {
        WaitCertification,
        Unauthorized,
        ReadingSettings,
        WriteSettings,
        SettingsSaved,
        SettingsSaveFail,
        Idle
    }

    private static class q {

        /* JADX INFO: renamed from: a */
        final Context f6078a;

        /* JADX INFO: renamed from: b */
        private final GridLayout[] f6079b;

        public q(View view) {
            this.f6079b = new GridLayout[]{(GridLayout) view.findViewById(R.id.r0), (GridLayout) view.findViewById(R.id.r1), (GridLayout) view.findViewById(R.id.r2)};
            this.f6078a = view.getContext();
            c(0, 130, 194);
            c(1, HttpStatus.HTTP_OK, 264);
            c(2, 400, 528);
        }

        private TextView b(int i10, int i11) {
            return (TextView) this.f6079b[i10].getChildAt(i11 * 2);
        }

        private void c(int i10, int i11, int i12) {
            int i13 = (i12 - i11) / 16;
            for (int i14 = 0; i14 < 16; i14++) {
                int i15 = (i13 * i14) + i11;
                b(i10, i14).setText(i15 + "-" + (i15 + i13));
                a(i10, i14).setText("5");
            }
        }

        EditText a(int i10, int i11) {
            return (EditText) this.f6079b[i10].getChildAt((i11 * 2) + 1);
        }

        public EditText d(int[][] iArr) {
            for (int i10 = 0; i10 < iArr.length; i10++) {
                for (int i11 = 0; i11 < iArr[i10].length; i11++) {
                    EditText editTextA = a(i10, i11);
                    try {
                        int i12 = Integer.parseInt(editTextA.getText().toString());
                        if (i12 >= 0 && i12 <= 63) {
                            iArr[i10][i11] = i12;
                        }
                        Toast.makeText(this.f6078a, "允许的值0到63", 0).show();
                        return editTextA;
                    } catch (NumberFormatException unused) {
                        Toast.makeText(this.f6078a, "允许的值0到63", 0).show();
                        return editTextA;
                    }
                }
            }
            return null;
        }

        public void e(int[][] iArr) {
            for (int i10 = 0; i10 < iArr.length; i10++) {
                for (int i11 = 0; i11 < iArr[i10].length; i11++) {
                    a(i10, i11).setText(String.valueOf(iArr[i10][i11]));
                }
            }
        }
    }

    public static class r {

        /* JADX INFO: renamed from: a */
        int f6080a;

        /* JADX INFO: renamed from: b */
        int f6081b;

        public r(int i10, int i11) {
            this.f6080a = i10;
            this.f6081b = i11;
        }
    }

    private v4.c A5() {
        EditText editTextA;
        v4.c cVar = new v4.c();
        cVar.f29738h = (int) this.T0.getSelectedItemId();
        cVar.f29739i = (int) this.U0.getSelectedItemId();
        cVar.f29740j = (int) this.V0.getSelectedItemId();
        cVar.f29741k = (int) this.W0.getSelectedItemId();
        cVar.f29742l = (int) this.P0.getSelectedItemId();
        cVar.f29744n = (int) this.Q0.getSelectedItemId();
        cVar.f29743m = (int) this.R0.getSelectedItemId();
        cVar.f29745o = (int) this.S0.getSelectedItemId();
        EditText editTextD = this.Y0.d(cVar.f29735e);
        if (editTextD != null) {
            this.f5990b1.B(2).l();
            editTextD.requestFocus();
            return null;
        }
        EditText editTextD2 = this.Z0.d(cVar.f29734d);
        if (editTextD2 != null) {
            this.f5990b1.B(3).l();
            editTextD2.requestFocus();
            return null;
        }
        EditText editTextA2 = this.f5989a1.a(cVar);
        if (editTextA2 != null) {
            this.f5990b1.B(1).l();
            editTextA2.requestFocus();
            Toast.makeText(k1(), "输入包含错误", 0).show();
            return null;
        }
        EditText editTextH = this.f5991c1.h(cVar.f29736f);
        if (editTextH != null) {
            this.f5990b1.B(5).l();
            editTextH.requestFocus();
            return null;
        }
        EditText editTextG = this.f5991c1.g(cVar);
        if (editTextG != null) {
            this.f5990b1.B(5).l();
            editTextG.requestFocus();
            return null;
        }
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null || l1VarY4.d().k() < 36 || (editTextA = this.f6000l1.a()) == null) {
            return cVar;
        }
        this.f5990b1.B(6).l();
        editTextA.requestFocus();
        return null;
    }

    public void B5(String str) {
        if (this.f5995g1 == null) {
            this.f5995g1 = A5();
        }
        if (this.f5995g1 == null) {
            return;
        }
        EditText editTextA = this.f6000l1.a();
        if (editTextA != null) {
            this.f5990b1.B(6).l();
            editTextA.requestFocus();
            return;
        }
        this.f6006r1 = this.f6000l1.c();
        this.f6007s1 = this.f6000l1.e();
        if (TextUtils.isEmpty(str)) {
            v3.q.p4(k1(), "备份配置", "", "", "设置名称", 1).g4(j1(), "settings_name");
            return;
        }
        this.f5995g1.f29731a = str;
        this.f5992d1.f6054c.D(this.f5995g1);
        this.f5997i1.c().b(str, this.f5995g1.a()).a();
        this.f6004p1.c().b(str, this.f6006r1.b()).a();
        this.f6005q1.c().b(str, this.f6007s1.b()).a();
        this.f5995g1 = null;
        this.f6006r1 = null;
        this.f6007s1 = null;
    }

    public void C5(v4.c cVar) {
        if (cVar == null) {
            return;
        }
        v4.o oVar = (v4.o) Y4();
        if (oVar == null) {
            Toast.makeText(k1(), "未连接到设备", 1).show();
            return;
        }
        if (oVar.J1() == 1) {
            J5(p.WriteSettings);
            Y4().a(v.WRITE_ADVANCED_SETTINGS, cVar.a());
            return;
        }
        c.a aVar = new c.a(k1());
        if (oVar.J1() == 0) {
            aVar.k("设备认证失败,请确保手机可以访问互联网");
        } else {
            aVar.k("已经包含相同ID在服务器,当前设备需要重新配置ID");
        }
        aVar.m(android.R.string.cancel, null).t(R.string.retry, new d(oVar)).C();
    }

    private void D5(View view) {
        this.Y0 = new q(view);
    }

    private void E5(View view) {
        this.Z0 = new q(view);
    }

    private void F5(View view) {
        Spinner spinner = (Spinner) view.findViewById(R.id.wide_audio_deviation);
        this.P0 = spinner;
        spinner.setAdapter((SpinnerAdapter) new n(k1(), 0, 128));
        Spinner spinner2 = (Spinner) view.findViewById(R.id.narrow_audio_deviation);
        this.Q0 = spinner2;
        spinner2.setAdapter((SpinnerAdapter) new n(k1(), 0, 128));
        Spinner spinner3 = (Spinner) view.findViewById(R.id.ctcss_deviation);
        this.R0 = spinner3;
        spinner3.setAdapter((SpinnerAdapter) new n(k1(), 0, 63));
        Spinner spinner4 = (Spinner) view.findViewById(R.id.dtcs_deviation);
        this.S0 = spinner4;
        spinner4.setAdapter((SpinnerAdapter) new n(k1(), 0, 63));
        Spinner spinner5 = (Spinner) view.findViewById(R.id.wide_analog_gain);
        this.T0 = spinner5;
        spinner5.setAdapter((SpinnerAdapter) new n(k1(), 0, 15));
        Spinner spinner6 = (Spinner) view.findViewById(R.id.wide_digital_gain);
        this.U0 = spinner6;
        spinner6.setAdapter((SpinnerAdapter) new n(k1(), 0, 15));
        Spinner spinner7 = (Spinner) view.findViewById(R.id.narrow_analog_gain);
        this.V0 = spinner7;
        spinner7.setAdapter((SpinnerAdapter) new n(k1(), 0, 15));
        Spinner spinner8 = (Spinner) view.findViewById(R.id.narrow_digital_gain);
        this.W0 = spinner8;
        spinner8.setAdapter((SpinnerAdapter) new n(k1(), 0, 15));
        this.f5999k1 = (EditText) view.findViewById(R.id.de_emph_coeffs);
        view.findViewById(R.id.de_emph_coeffs_save).setOnClickListener(new b());
        view.findViewById(R.id.de_emph_coeffs_paste).setOnClickListener(new c());
    }

    public static int G5(EditText editText, int i10, int i11) throws h {
        try {
            int i12 = Integer.parseInt(editText.getText().toString());
            if (i12 >= i10 && i12 <= i11) {
                return i12;
            }
            throw new h(editText, "允许的值" + i10 + "到" + i11);
        } catch (NumberFormatException unused) {
            throw new h(editText, "允许的值" + i10 + "到" + i11);
        }
    }

    public void H5() {
        int i10;
        try {
            String[] strArrSplit = this.f5999k1.getText().toString().replace(" 1 ", " ").split(" ");
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
            gVar.f6034c = i13 & 65535;
            gVar.f6039h = (i13 >> 16) & 255;
            int i14 = (int) (dArr[1] * 8388607.0d);
            gVar.f6033b = i14 & 65535;
            gVar.f6038g = (i14 >> 16) & 255;
            int i15 = (int) (dArr[2] * 8388607.0d);
            gVar.f6032a = i15 & 65535;
            gVar.f6037f = (i15 >> 16) & 255;
            int i16 = (int) (dArr[3] * 8388607.0d);
            gVar.f6036e = i16 & 65535;
            gVar.f6041s = (i16 >> 16) & 255;
            int i17 = (int) (dArr[4] * 8388607.0d);
            gVar.f6035d = i17 & 65535;
            gVar.f6040r = (i17 >> 16) & 255;
            gVar.f6042t = i10;
            Y4().b(v.WRITE_DE_EMPH_COEFFS, gVar);
        } catch (Exception e10) {
            Toast.makeText(k1(), "错误:" + e10.getLocalizedMessage(), 1).show();
            this.f5999k1.requestFocus();
        }
    }

    public void J5(p pVar) {
        K5(pVar, -2);
    }

    private void K5(p pVar, int i10) {
        if (this.f5994f1 == pVar) {
            return;
        }
        this.f5994f1 = pVar;
        int iOrdinal = pVar.ordinal();
        String[] strArr = this.f6001m1;
        String str = iOrdinal < strArr.length ? strArr[pVar.ordinal()] : null;
        if (str == null) {
            this.f5993e1.x();
            return;
        }
        this.f5993e1.p0(str);
        this.f5993e1.S(i10);
        this.f5993e1.W();
    }

    private void L5(f fVar) {
        this.f5998j1.a(fVar);
    }

    private void M5(v4.c cVar) {
        this.T0.setSelection(cVar.f29738h);
        this.U0.setSelection(cVar.f29739i);
        this.V0.setSelection(cVar.f29740j);
        this.W0.setSelection(cVar.f29741k);
        this.P0.setSelection(cVar.f29742l);
        this.Q0.setSelection(cVar.f29744n);
        this.R0.setSelection(cVar.f29743m);
        this.S0.setSelection(cVar.f29745o);
        this.Y0.e(cVar.f29735e);
        this.Z0.e(cVar.f29734d);
        this.f5989a1.b(cVar);
        this.f5991c1.i(cVar);
    }

    public static /* synthetic */ void n5(SettingsV1Fragment settingsV1Fragment) {
        androidx.fragment.app.p pVarE1 = settingsV1Fragment.e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.RestoreAllSettings /* 2131296268 */:
                I5(12292);
                return true;
            case R.id.RestoreFactorySettings /* 2131296269 */:
                I5(12290);
                return true;
            case R.id.ShowDebugScreen /* 2131296276 */:
                I5(12289);
                return true;
            case R.id.backup /* 2131296445 */:
                B5(null);
                return true;
            case R.id.save /* 2131297304 */:
                C5(A5());
                return true;
            case R.id.show_rf_status /* 2131297384 */:
                k5(com.dw.ht.factory.b.class);
                return true;
            case R.id.signal_gen /* 2131297388 */:
                k5(z.class);
                return true;
            default:
                return super.F2(menuItem);
        }
    }

    public boolean I5(int i10) {
        l1 l1VarY4 = Y4();
        if (l1VarY4 instanceof c0) {
            return ((c0) l1VarY4).t(i10);
        }
        return false;
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void M(n0 n0Var, g3.d dVar) {
        super.M(n0Var, dVar);
        if (dVar.m() != 2) {
            return;
        }
        v vVarD = v.d(dVar.e());
        int[] iArr = e.f6024c;
        int i10 = iArr[vVarD.ordinal()];
        if (i10 == 1) {
            if (e.f6022a[x.d(dVar.d(0)).ordinal()] == 1) {
                String strJ = m0.j(n0Var.q());
                v4.o oVar = (v4.o) n0Var;
                u.w().c(oVar);
                m3.a.e(oVar.a3());
                Toast.makeText(k1(), "已经恢复出厂状态", 0).show();
                Cfg.m0(strJ);
                T1().postDelayed(new Runnable() { // from class: q4.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingsV1Fragment.n5(this.f24347a);
                    }
                }, 2000L);
            }
        } else {
            if (i10 == 2) {
                if (dVar.n()) {
                    if (e.f6023b[dVar.l().ordinal()] == 1) {
                        Toast.makeText(k1(), "设备 ID 已保存", 0).show();
                        return;
                    }
                    Toast.makeText(k1(), "设备 ID 保存失败(" + dVar.l() + ")", 0).show();
                    return;
                }
                return;
            }
            if (i10 == 3) {
                if (dVar.n()) {
                    int i11 = e.f6023b[dVar.l().ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return;
                        }
                        K5(p.SettingsSaveFail, -1);
                        return;
                    } else if (n0Var.d().k() >= 36) {
                        this.f6000l1.d(n0Var);
                        return;
                    } else {
                        K5(p.SettingsSaved, -1);
                        return;
                    }
                }
                return;
            }
            if (i10 == 4) {
                if (dVar.n()) {
                    int i12 = e.f6023b[dVar.l().ordinal()];
                    if (i12 != 1) {
                        if (i12 != 2) {
                            return;
                        }
                        K5(p.SettingsSaveFail, -1);
                        return;
                    } else if (n0Var.d().k() >= 41) {
                        n0Var.b(v.SET_VOC, this.f6000l1.e());
                        return;
                    } else {
                        K5(p.SettingsSaved, -1);
                        return;
                    }
                }
                return;
            }
            if (i10 == 5) {
                if (dVar.n()) {
                    int i13 = e.f6023b[dVar.l().ordinal()];
                    if (i13 == 1) {
                        K5(p.SettingsSaved, -1);
                        return;
                    } else {
                        if (i13 != 2) {
                            return;
                        }
                        K5(p.SettingsSaveFail, -1);
                    }
                }
                return;
            }
        }
        if (DeviceFragment.a5(dVar)) {
            switch (iArr[vVarD.ordinal()]) {
                case 6:
                    try {
                        M5(new v4.c(dVar.i(), 1, dVar.i().length));
                        n0Var.a(v.READ_RDA1846S_AGC, new byte[0]);
                    } catch (w5.g e10) {
                        e10.printStackTrace();
                        return;
                    }
                    break;
                case 7:
                    L5(new f(dVar.i(), 1, dVar.i().length));
                    if (n0Var.d().k() < 36) {
                        J5(p.Idle);
                    } else {
                        n0Var.a(v.GET_IBA, new byte[0]);
                    }
                    break;
                case 8:
                    this.f6000l1.f(new j(dVar.i(), 1, dVar.i().length));
                    if (n0Var.d().k() < 41) {
                        J5(p.Idle);
                    } else {
                        n0Var.a(v.GET_VOC, new byte[0]);
                    }
                    break;
                case 9:
                    this.f6000l1.g(new s(dVar.i(), 1, dVar.i().length));
                    J5(p.Idle);
                    break;
            }
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void N0(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void a0(TabLayout.g gVar) {
        for (View view : this.X0) {
            view.setVisibility(8);
        }
        this.X0[gVar.g()].setVisibility(0);
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(n0 n0Var, n0 n0Var2) {
        m mVar;
        super.d5(n0Var, n0Var2);
        if (n0Var2 == null || (mVar = this.f5992d1) == null) {
            return;
        }
        mVar.b();
    }

    @Override // v3.v
    protected boolean f4(androidx.fragment.app.o oVar, int i10, int i11, int i12, Object obj) {
        if (!(oVar instanceof v3.q) || !a6.q.d("settings_name", oVar.P1())) {
            return super.f4(oVar, i10, i11, i12, obj);
        }
        if (i11 != -1) {
            return true;
        }
        B5((String) obj);
        return true;
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        this.f5996h1 = k1().getSharedPreferences("factory_settings", 0);
        this.f5997i1 = new y5.d(k1(), this.f5996h1);
        this.f6002n1 = k1().getSharedPreferences("factory_settings_iba", 0);
        this.f6004p1 = new y5.d(k1(), this.f6002n1);
        this.f6003o1 = k1().getSharedPreferences("factory_settings_vco", 0);
        this.f6005q1 = new y5.d(k1(), this.f6003o1);
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
        View viewInflate = layoutInflater.inflate(R.layout.factory_fragment_device_settings_v1, viewGroup, false);
        TabLayout tabLayout = (TabLayout) viewInflate.findViewById(R.id.tab_layout);
        this.f5990b1 = tabLayout;
        tabLayout.h(this);
        this.X0[0] = viewInflate.findViewById(R.id.tc_main);
        this.X0[1] = viewInflate.findViewById(R.id.tc_freq_range);
        this.X0[5] = viewInflate.findViewById(R.id.tc_squelch_level);
        this.X0[2] = viewInflate.findViewById(R.id.tc_tx_power_h);
        this.X0[3] = viewInflate.findViewById(R.id.tc_tx_power_l);
        this.X0[4] = viewInflate.findViewById(R.id.tc_vol_and_dev);
        this.X0[7] = viewInflate.findViewById(R.id.tc_agc);
        this.X0[6] = viewInflate.findViewById(R.id.tc_iba);
        F5(this.X0[4]);
        D5(this.X0[2]);
        E5(this.X0[3]);
        this.f5991c1 = new o(this.X0[5]);
        this.f5989a1 = new i(this.X0[1]);
        this.f5992d1 = new m(this.X0[0]);
        this.f5998j1 = new AGCViewHolder(this.X0[7]);
        this.f6000l1 = new k(this.X0[6]);
        this.f5993e1 = Snackbar.l0(viewInflate, "正在读取设置", -2);
        TextView textView = (TextView) viewInflate.findViewById(R.id.status);
        View viewFindViewById = viewInflate.findViewById(R.id.content);
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null || l1VarY4.q() == 0) {
            M5(new v4.c());
            textView.setVisibility(8);
            viewFindViewById.setVisibility(0);
            return viewInflate;
        }
        if (!(l1VarY4 instanceof v4.o)) {
            return viewInflate;
        }
        if (((v4.o) l1VarY4).J1() == 1) {
            J5(p.ReadingSettings);
            l1VarY4.a(v.READ_ADVANCED_SETTINGS, new byte[0]);
            return viewInflate;
        }
        textView.setVisibility(0);
        viewFindViewById.setVisibility(8);
        J5(p.WaitCertification);
        textView.setText("等待认证完成");
        viewInflate.postDelayed(new a(l1VarY4, textView, viewFindViewById, viewInflate), 1000L);
        return viewInflate;
    }

    public static class j implements q0 {

        /* JADX INFO: renamed from: a */
        private final l[] f6046a;

        public j(l[] lVarArr) {
            this.f6046a = lVarArr;
        }

        @Override // v4.q0
        public /* synthetic */ byte[] a(int i10) {
            return p0.b(this, i10);
        }

        @Override // v4.q0
        public byte[] b() {
            l[] lVarArr = this.f6046a;
            if (lVarArr.length == 0) {
                return new byte[0];
            }
            byte[] bArr = new byte[lVarArr.length * 2];
            a6.v vVar = new a6.v(bArr);
            for (l lVar : this.f6046a) {
                vVar.n(lVar.f6050a, 6);
                vVar.n(lVar.f6051b, 10);
            }
            return bArr;
        }

        public j(byte[] bArr, int i10, int i11) {
            a6.v vVar = new a6.v(bArr, i10 * 8);
            this.f6046a = new l[(i11 - i10) / 2];
            int i12 = 0;
            while (true) {
                l[] lVarArr = this.f6046a;
                if (i12 >= lVarArr.length) {
                    return;
                }
                lVarArr[i12] = new l(vVar.i(6), vVar.i(10));
                i12++;
            }
        }
    }

    public static class s implements q0 {

        /* JADX INFO: renamed from: a */
        private final r[] f6082a;

        public s(r[] rVarArr) {
            this.f6082a = rVarArr;
        }

        @Override // v4.q0
        public /* synthetic */ byte[] a(int i10) {
            return p0.b(this, i10);
        }

        @Override // v4.q0
        public byte[] b() {
            r[] rVarArr = this.f6082a;
            if (rVarArr.length == 0) {
                return new byte[0];
            }
            byte[] bArr = new byte[rVarArr.length * 2];
            a6.v vVar = new a6.v(bArr);
            for (r rVar : this.f6082a) {
                vVar.n(rVar.f6080a, 4);
                vVar.n(rVar.f6081b, 12);
            }
            return bArr;
        }

        public s(byte[] bArr, int i10, int i11) {
            a6.v vVar = new a6.v(bArr, i10 * 8);
            this.f6082a = new r[(i11 - i10) / 2];
            int i12 = 0;
            while (true) {
                r[] rVarArr = this.f6082a;
                if (i12 >= rVarArr.length) {
                    return;
                }
                rVarArr[i12] = new r(vVar.i(4), vVar.i(12));
                i12++;
            }
        }
    }

    private class f implements q0 {

        /* JADX INFO: renamed from: a */
        boolean f6025a;

        /* JADX INFO: renamed from: b */
        int f6026b;

        /* JADX INFO: renamed from: c */
        int f6027c;

        /* JADX INFO: renamed from: d */
        int f6028d;

        /* JADX INFO: renamed from: e */
        int f6029e;

        /* JADX INFO: renamed from: f */
        int f6030f;

        public f(byte[] bArr, int i10, int i11) {
            a6.v vVar = new a6.v(bArr, i10 * 8);
            this.f6025a = vVar.c();
            this.f6026b = vVar.i(7);
            this.f6027c = vVar.i(4);
            this.f6028d = vVar.i(4);
            this.f6029e = vVar.i(3);
            this.f6030f = vVar.i(5);
        }

        @Override // v4.q0
        public /* synthetic */ byte[] a(int i10) {
            return p0.b(this, i10);
        }

        @Override // v4.q0
        public byte[] b() {
            byte[] bArr = new byte[4];
            new a6.v(bArr).p(this.f6025a).n(this.f6026b, 7).n(this.f6027c, 4).n(this.f6028d, 4).n(this.f6029e, 3).n(this.f6030f, 5);
            return bArr;
        }

        public f() {
        }
    }
}
