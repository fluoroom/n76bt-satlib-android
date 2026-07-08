package s4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.ht.fragments.DeviceFragment;
import com.dw.widget.ActionButton;
import com.xw.repo.BubbleSeekBar;
import d5.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.greenrobot.eventbus.ThreadMode;
import s4.l5;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
public class n5 extends DeviceFragment implements View.OnClickListener, BubbleSeekBar.k, SeekBar.OnSeekBarChangeListener {
    private v4.d0 P0;
    private ActionButton Q0;
    private ActionButton R0;
    private ActionButton S0;
    private ActionButton T0;
    private ActionButton U0;
    private TextView V0;
    private Runnable W0 = new a();
    private f X0;
    private SeekBar Y0;
    private ActionButton Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private c f26618a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private TextView f26619b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private e f26620c1;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (n5.this.Y4() != null) {
                n5.this.Y4().a(v4.v.RADIO_GET_STATUS, new byte[0]);
            }
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f26623b;

        static {
            int[] iArr = new int[v4.v.values().length];
            f26623b = iArr;
            try {
                iArr[v4.v.EVENT_NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26623b[v4.v.RADIO_GET_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26623b[v4.v.GET_VOLUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[v4.x.values().length];
            f26622a = iArr2;
            try {
                iArr2[v4.x.RADIO_STATUS_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private class c extends c6.b {
        public c(Context context) {
            super(context, 0);
            Q();
        }

        private void Q() {
            E(n5.this.f26620c1.e());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public void s(g gVar, int i10) {
            gVar.O((d) J(i10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public g u(ViewGroup viewGroup, int i10) {
            return n5.this.new g(this.f4395r.inflate(R.layout.fragment_radio_ch_item, viewGroup, false));
        }

        public void T(int i10) {
            for (int i11 = 0; i11 < f(); i11++) {
                if (i10 == ((d) J(i11)).f26624a) {
                    M(i11);
                    return;
                }
            }
        }

        public void U(int i10, String str) {
            for (int i11 = 0; i11 < f(); i11++) {
                if (i10 == ((d) J(i11)).f26624a) {
                    ((d) J(i11)).f26625b = str;
                    l(i11);
                    return;
                }
            }
        }
    }

    public static class d implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f26625b;

        public d(int i10, String str) {
            this.f26624a = i10;
            this.f26625b = str;
        }

        String a() {
            return String.format(Locale.getDefault(), "%.1f", Float.valueOf(this.f26624a / 1000000.0f));
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            d dVar = (d) obj;
            int iA = a6.q.a(this.f26624a, dVar.f26624a);
            return iA != 0 ? iA : a6.q.b(this.f26625b, dVar.f26625b);
        }

        String d() {
            return this.f26625b;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SharedPreferences f26626a;

        public e(Context context) {
            this.f26626a = context.getApplicationContext().getSharedPreferences("radio", 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ArrayList e() {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f26626a.getAll().keySet()) {
                try {
                    arrayList.add(new d(Integer.parseInt(str), this.f26626a.getString(str, "")));
                } catch (NumberFormatException e10) {
                    e10.printStackTrace();
                }
            }
            Collections.sort(arrayList);
            return arrayList;
        }

        public d b(int i10) {
            d dVar = new d(i10, c(i10));
            this.f26626a.edit().putString(String.valueOf(i10), dVar.f26625b).apply();
            return dVar;
        }

        public String c(int i10) {
            return this.f26626a.getString(String.valueOf(i10), "");
        }

        public boolean d(int i10) {
            return this.f26626a.contains(String.valueOf(i10));
        }

        public void f(int i10) {
            this.f26626a.edit().remove(String.valueOf(i10)).apply();
        }

        public void g(int i10, String str) {
            if (str == null) {
                str = "";
            }
            this.f26626a.edit().putString(String.valueOf(i10), str).apply();
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f26627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f26628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f26629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f26630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f26631e;

        f(byte[] bArr) {
            a6.v vVar = new a6.v(bArr, 8);
            try {
                this.f26627a = vVar.c();
                this.f26628b = vVar.c();
                this.f26629c = vVar.c();
                this.f26630d = vVar.c();
                vVar.l(vVar.b() + 12);
                this.f26631e = vVar.i(16) * 10000;
            } catch (IllegalArgumentException e10) {
                e10.printStackTrace();
            }
        }
    }

    private class g extends RecyclerView.f0 implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {
        private final TextView D;
        private final TextView E;
        private d F;

        public g(View view) {
            super(view);
            this.D = (TextView) view.findViewById(R.id.freq);
            this.E = (TextView) view.findViewById(R.id.name);
            view.findViewById(R.id.content).setOnClickListener(this);
            view.findViewById(R.id.settings).setOnClickListener(this);
        }

        public void O(d dVar) {
            this.F = dVar;
            this.D.setText(dVar.a());
            this.E.setText(dVar.d());
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 == R.id.content) {
                n5.this.r5(this.F.f26624a);
            } else {
                if (id2 != R.id.settings) {
                    return;
                }
                c6.k kVar = new c6.k(view.getContext(), view);
                kVar.b().inflate(R.menu.radio_ch_settings, kVar.a());
                kVar.e(this);
                kVar.f();
            }
        }

        @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId != R.id.rename) {
                if (itemId != R.id.unstar) {
                    return false;
                }
                n5.this.f26620c1.f(this.F.f26624a);
                n5.this.f26618a1.T(this.F.f26624a);
                n5.this.s5();
                return true;
            }
            v3.q.o4(n5.this.k1(), n5.this.N1(R.string.rename), null, this.F.d(), null).g4(n5.this.j1(), "rename_radio_ch:" + this.F.f26624a);
            return true;
        }
    }

    public n5() {
        i5(3);
        v4.d0 d0Var = new v4.d0(a.d.FM);
        this.P0 = d0Var;
        d0Var.b(87000000, 108000000);
    }

    private void q5(byte[] bArr) {
        this.X0 = new f(bArr);
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null && l1VarY4.d().k() < 47 && this.X0.f26630d) {
            this.V0.postDelayed(this.W0, 50L);
        }
        s5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s5() {
        if (this.X0 == null) {
            return;
        }
        this.V0.setText(String.format(Locale.getDefault(), "%.1fMHz", Float.valueOf(this.X0.f26631e / 1000000.0f)));
        String strC = this.f26620c1.c(this.X0.f26631e);
        if (TextUtils.isEmpty(strC)) {
            this.f26619b1.setVisibility(4);
        } else {
            this.f26619b1.setText(strC);
            this.f26619b1.setVisibility(0);
        }
        if (this.X0.f26627a) {
            this.Q0.setImageResource(R.drawable.ic_stop_24dp);
            this.Q0.setContentDescription(H1().getString(R.string.stop));
        } else {
            this.Q0.setImageResource(R.drawable.ic_play_arrow_24dp);
            this.Q0.setContentDescription(H1().getString(R.string.play));
        }
        if (this.f26620c1.d(this.X0.f26631e)) {
            this.Z0.setImageResource(R.drawable.ic_star_black_24dp);
            this.Z0.setContentDescription(H1().getString(R.string.unsave));
        } else {
            this.Z0.setImageResource(R.drawable.ic_star_border_black_24dp);
            this.Z0.setContentDescription(H1().getString(R.string.save));
        }
    }

    @Override // v3.m0, v3.n0
    public boolean D0() {
        return true;
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void H2() {
        super.H2();
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 == null || !l1VarY4.n() || l1VarY4.d().k() < 47) {
            return;
        }
        l1VarY4.J(v4.x.RADIO_STATUS_CHANGED);
    }

    @Override // com.xw.repo.BubbleSeekBar.k
    public void J(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10) {
        v4.l1 l1VarY4;
        if (z10 && (l1VarY4 = Y4()) != null) {
            l1VarY4.a(v4.v.SET_VOLUME, (byte) i10);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void M(v4.n0 n0Var, g3.d dVar) {
        super.M(n0Var, dVar);
        if (dVar.m() == 2 && b.f26623b[v4.v.d(dVar.e()).ordinal()] == 1) {
            if (b.f26622a[v4.x.d(dVar.d(0)).ordinal()] == 1) {
                q5(dVar.i());
            }
        }
        if (DeviceFragment.a5(dVar)) {
            int i10 = b.f26623b[v4.v.d(dVar.e()).ordinal()];
            if (i10 == 2) {
                q5(dVar.i());
            } else {
                if (i10 != 3) {
                    return;
                }
                this.Y0.setMax(dVar.d(2));
                this.Y0.setProgress(dVar.d(1));
            }
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 == null || !l1VarY4.n() || l1VarY4.d().k() < 47) {
            return;
        }
        l1VarY4.J0(v4.x.RADIO_STATUS_CHANGED);
    }

    @Override // v3.v
    protected boolean f4(androidx.fragment.app.o oVar, int i10, int i11, int i12, Object obj) {
        if (oVar != null) {
            String strP1 = oVar.P1();
            if (!TextUtils.isEmpty(strP1)) {
                if (R.id.what_dialog_onclick != i10 && i11 != -1) {
                    return true;
                }
                if (strP1.startsWith("rename_radio_ch:")) {
                    String strSubstring = strP1.substring(16, strP1.length());
                    String str = (String) obj;
                    this.f26620c1.g(Integer.parseInt(strSubstring), str);
                    this.f26618a1.U(Integer.parseInt(strSubstring), str);
                    s5();
                    return true;
                }
            }
        }
        return super.f4(oVar, i10, i11, i12, obj);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.back) {
            e1().finish();
            return;
        }
        if (id2 == R.id.star) {
            f fVar = this.X0;
            if (fVar == null) {
                return;
            }
            if (this.f26620c1.d(fVar.f26631e)) {
                this.f26620c1.f(this.X0.f26631e);
                this.f26618a1.T(this.X0.f26631e);
            } else {
                this.f26618a1.D(this.f26620c1.b(this.X0.f26631e));
            }
            s5();
            return;
        }
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 == null || this.X0 == null) {
            return;
        }
        if (l1VarY4.l() != n0.c.Connected) {
            l1VarY4.v(true);
        }
        switch (view.getId()) {
            case R.id.freq /* 2131296779 */:
                l5 l5VarJ4 = l5.j4(this.P0);
                l5VarJ4.l4(8, 5);
                l5VarJ4.g4(j1(), "freq");
                break;
            case R.id.next /* 2131297090 */:
                if (!this.X0.f26627a) {
                    l1VarY4.a(v4.v.RADIO_SET_MODE, 2);
                }
                int i10 = this.X0.f26631e + 100000;
                int i11 = (i10 <= 108000000 ? i10 : 87000000) / 10000;
                l1VarY4.a(v4.v.RADIO_SET_FREQ, (byte) (i11 >>> 8), (byte) i11);
                this.V0.postDelayed(this.W0, 100L);
                break;
            case R.id.play_stop /* 2131297181 */:
                if (this.X0.f26627a) {
                    l1VarY4.a(v4.v.RADIO_SET_MODE, 0);
                } else {
                    l1VarY4.a(v4.v.RADIO_SET_MODE, 2);
                }
                this.W0.run();
                break;
            case R.id.previous /* 2131297214 */:
                if (!this.X0.f26627a) {
                    l1VarY4.a(v4.v.RADIO_SET_MODE, 2);
                }
                int i12 = this.X0.f26631e - 100000;
                int i13 = (i12 >= 87000000 ? i12 : 108000000) / 10000;
                l1VarY4.a(v4.v.RADIO_SET_FREQ, (byte) (i13 >>> 8), (byte) i13);
                this.V0.postDelayed(this.W0, 100L);
                break;
            case R.id.seek_down /* 2131297339 */:
                if (!this.X0.f26627a) {
                    l1VarY4.a(v4.v.RADIO_SET_MODE, 2);
                }
                l1VarY4.a(v4.v.RADIO_SEEK_DOWN, new byte[0]);
                this.V0.postDelayed(this.W0, 100L);
                break;
            case R.id.seek_up /* 2131297340 */:
                if (!this.X0.f26627a) {
                    l1VarY4.a(v4.v.RADIO_SET_MODE, 2);
                }
                l1VarY4.a(v4.v.RADIO_SEEK_UP, new byte[0]);
                this.V0.postDelayed(this.W0, 100L);
                break;
        }
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(l5.b bVar) {
        r5(bVar.c().intValue());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null && z10 && seekBar.getId() == R.id.vol) {
            l1VarY4.a(v4.v.SET_VOLUME, (byte) i10);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        this.f26620c1 = new e(k1());
    }

    public void r5(int i10) {
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 == null) {
            return;
        }
        f fVar = this.X0;
        if (fVar == null || !fVar.f26627a) {
            l1VarY4.a(v4.v.RADIO_SET_MODE, 2);
        }
        f fVar2 = this.X0;
        if (fVar2 != null) {
            if (i10 == fVar2.f26631e) {
                return;
            } else {
                fVar2.f26631e = i10;
            }
        }
        int i11 = i10 / 10000;
        l1VarY4.a(v4.v.RADIO_SET_FREQ, (byte) ((i11 >> 8) & 255), (byte) (i11 & 255));
        s5();
        this.V0.postDelayed(this.W0, 100L);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z4(N1(R.string.radio));
        View viewInflate = layoutInflater.inflate(R.layout.fragment_radio_control, viewGroup, false);
        this.Q0 = (ActionButton) viewInflate.findViewById(R.id.play_stop);
        this.R0 = (ActionButton) viewInflate.findViewById(R.id.seek_down);
        this.S0 = (ActionButton) viewInflate.findViewById(R.id.seek_up);
        this.T0 = (ActionButton) viewInflate.findViewById(R.id.previous);
        this.U0 = (ActionButton) viewInflate.findViewById(R.id.next);
        this.V0 = (TextView) viewInflate.findViewById(R.id.freq);
        this.f26619b1 = (TextView) viewInflate.findViewById(R.id.name);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.list);
        c cVar = new c(k1());
        this.f26618a1 = cVar;
        recyclerView.setAdapter(cVar);
        ActionButton actionButton = (ActionButton) viewInflate.findViewById(R.id.star);
        this.Z0 = actionButton;
        actionButton.setOnClickListener(this);
        viewInflate.findViewById(R.id.back).setOnClickListener(this);
        SeekBar seekBar = (SeekBar) viewInflate.findViewById(R.id.vol);
        this.Y0 = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.V0.setOnClickListener(this);
        this.Q0.setOnClickListener(this);
        this.R0.setOnClickListener(this);
        this.S0.setOnClickListener(this);
        this.T0.setOnClickListener(this);
        this.U0.setOnClickListener(this);
        this.W0.run();
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            v4.a0 a0VarD = l1VarY4.d();
            if ((a0VarD instanceof v4.n) && ((v4.n) a0VarD).O()) {
                this.Y0.setVisibility(8);
                viewInflate.findViewById(R.id.vol_status).setVisibility(8);
            }
            l1VarY4.a(v4.v.GET_VOLUME, new byte[0]);
        }
        return viewInflate;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // com.xw.repo.BubbleSeekBar.k
    public void b0(BubbleSeekBar bubbleSeekBar, int i10, float f10) {
    }

    @Override // com.xw.repo.BubbleSeekBar.k
    public void H0(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10) {
    }
}
