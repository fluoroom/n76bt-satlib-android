package com.dw.ht.factory;

import a6.v;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.dw.ht.fragments.DeviceFragment;
import g3.c;
import g3.d;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import m4.d1;
import rd.g0;
import rd.m;
import v4.c0;
import v4.l1;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/dw/ht/factory/b;", "Lcom/dw/ht/fragments/DeviceFragment;", "<init>", "()V", "", "payload", "Ldd/d0;", "o5", "([B)V", "p5", "q5", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "M2", "Lv4/n0;", "link", "Lg3/d;", "packet", "M", "(Lv4/n0;Lg3/d;)V", "oldLink", "newLink", "d5", "(Lv4/n0;Lv4/n0;)V", "W0", "(Lv4/n0;)V", "Lm4/d1;", "P0", "Lm4/d1;", "binding", "Ljava/lang/Runnable;", "Q0", "Ljava/lang/Runnable;", "readRfStatus", "", "R0", "I", "t", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends DeviceFragment {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private d1 binding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private final Runnable readRfStatus = new Runnable() { // from class: q4.s
        @Override // java.lang.Runnable
        public final void run() {
            com.dw.ht.factory.b.r5(this.f24344a);
        }
    };

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private int t;

    public static final class a {
        private int A;
        private int B;
        private int C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f6088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f6089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f6090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f6091g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f6092h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f6093i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f6094j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f6095k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f6096l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f6097m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f6098n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f6099o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f6100p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f6101q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f6102r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f6103s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f6104t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f6105u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f6106v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f6107w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f6108x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f6109y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f6110z;

        public a(byte[] bArr) {
            m.e(bArr, "data");
            v vVar = new v(bArr, 8);
            try {
                this.f6085a = vVar.i(8);
                this.f6086b = vVar.i(8);
                this.f6087c = vVar.i(8);
                this.f6088d = vVar.i(8);
                this.f6089e = vVar.i(8);
                this.f6090f = vVar.i(8);
                this.f6091g = vVar.i(1);
                this.f6092h = vVar.i(1);
                this.f6093i = vVar.i(1);
                this.f6094j = vVar.i(1);
                this.f6095k = vVar.i(4);
                this.f6096l = vVar.i(8);
                this.f6097m = vVar.i(16);
                this.f6098n = vVar.i(1);
                this.f6099o = vVar.i(1);
                this.f6100p = vVar.i(1);
                this.f6101q = vVar.i(8);
                this.f6095k += vVar.i(4) << 4;
                vVar.i(1);
                this.f6102r = vVar.i(1);
                this.f6103s = vVar.i(1);
                this.f6104t = vVar.i(1);
                this.f6105u = vVar.i(13);
                this.f6106v = vVar.i(8);
                this.f6107w = vVar.i(8);
                this.f6108x = vVar.i(8);
                this.f6109y = vVar.i(8);
                vVar.h();
                this.f6110z = vVar.i(11);
                vVar.i(5);
                this.A = vVar.i(11);
                vVar.i(5);
                this.B = vVar.i(10);
                vVar.i(6);
                this.C = vVar.i(10);
            } catch (IllegalArgumentException e10) {
                e10.printStackTrace();
            }
        }

        public final int A() {
            return this.f6094j;
        }

        public final int B() {
            return this.f6098n;
        }

        public final int C() {
            return this.f6093i;
        }

        public final int a() {
            return this.f6095k;
        }

        public final int b() {
            return this.f6099o;
        }

        public final int c() {
            return this.f6104t;
        }

        public final int d() {
            return this.f6100p;
        }

        public final int e() {
            return this.B;
        }

        public final int f() {
            return this.f6109y;
        }

        public final int g() {
            return this.f6107w;
        }

        public final int h() {
            return this.f6106v;
        }

        public final int i() {
            return this.f6102r;
        }

        public final int j() {
            return this.f6105u;
        }

        public final int k() {
            return this.f6096l;
        }

        public final int l() {
            return this.C;
        }

        public final int m() {
            return this.f6088d;
        }

        public final int n() {
            return this.A;
        }

        public final int o() {
            return this.f6090f;
        }

        public final int p() {
            return this.f6089e;
        }

        public final int q() {
            return this.f6092h;
        }

        public final int r() {
            return this.f6103s;
        }

        public final int s() {
            return this.f6097m;
        }

        public final int t() {
            return this.f6101q;
        }

        public final int u() {
            return this.f6108x;
        }

        public final int v() {
            return this.f6085a;
        }

        public final int w() {
            return this.f6110z;
        }

        public final int x() {
            return this.f6087c;
        }

        public final int y() {
            return this.f6086b;
        }

        public final int z() {
            return this.f6091g;
        }
    }

    /* JADX INFO: renamed from: com.dw.ht.factory.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0088b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6111a;

        static {
            int[] iArr = new int[v4.v.values().length];
            try {
                iArr[v4.v.READ_RF_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6111a = iArr;
        }
    }

    private final void o5(byte[] payload) {
        int i10;
        d1 d1Var = this.binding;
        if (d1Var == null) {
            return;
        }
        v vVar = new v(payload, 8);
        int i11 = 0;
        try {
            i10 = vVar.i(16);
            try {
                i11 = vVar.i(16);
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
            }
        } catch (Exception e11) {
            e = e11;
            i10 = 0;
        }
        d1Var.f21065n.setText(String.valueOf(i10));
        d1Var.f21071t.setText(String.valueOf(i11));
    }

    private final void p5(byte[] payload) {
        d1 d1Var = this.binding;
        if (d1Var == null) {
            return;
        }
        a aVar = new a(payload);
        d1Var.f21075x.setText(String.valueOf(aVar.v()));
        d1Var.f21066o.setText(String.valueOf(aVar.m()));
        d1Var.f21076y.setText(String.valueOf(aVar.w()));
        d1Var.f21067p.setText(String.valueOf(aVar.n()));
        d1Var.A.setText('[' + aVar.y() + ',' + aVar.x() + "]:");
        d1Var.f21069r.setText('[' + aVar.p() + ',' + aVar.o() + "]:");
        d1Var.f21077z.setText(String.valueOf(aVar.z()));
        d1Var.f21068q.setText(String.valueOf(aVar.q()));
        d1Var.D.setText(aVar.C() != 0 ? "有效" : "无效");
        d1Var.B.setText(aVar.A() != 0 ? "有效" : "无效");
        d1Var.f21053b.setText(String.valueOf(aVar.a()));
        TextView textView = d1Var.f21072u;
        g0 g0Var = g0.f25951a;
        String str = String.format(Locale.getDefault(), "%04X", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.s())}, 1));
        m.d(str, "format(...)");
        textView.setText(str);
        d1Var.C.setText(aVar.B() == 0 ? "挂载成功" : "挂载失败");
        d1Var.f21057f.setText(String.valueOf(aVar.e()));
        d1Var.f21064m.setText(String.valueOf(aVar.l()));
        d1Var.f21061j.setText(aVar.i() != 0 ? "开" : "关");
        d1Var.f21070s.setText(aVar.r() != 0 ? "开" : "关");
        d1Var.f21055d.setText(aVar.c() != 0 ? "开" : "关");
        TextView textView2 = d1Var.f21062k;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aVar.j());
        sb2.append('s');
        textView2.setText(sb2.toString());
        TextView textView3 = d1Var.f21060i;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(aVar.h());
        sb3.append('s');
        textView3.setText(sb3.toString());
        TextView textView4 = d1Var.f21059h;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(aVar.g());
        sb4.append('s');
        textView4.setText(sb4.toString());
        d1Var.f21054c.setText(aVar.b() != 0 ? "有效" : "无效");
        d1Var.f21056e.setText(aVar.d() != 0 ? "已加载" : "未加载");
        d1Var.f21063l.setText(String.valueOf(aVar.k()));
        d1Var.f21058g.setText(String.valueOf(aVar.f()));
        d1Var.f21073v.setText(String.valueOf(aVar.t()));
        d1Var.f21074w.setText(String.valueOf(aVar.u()));
        q5();
    }

    private final void q5() {
        c cVarU1;
        d1 d1Var = this.binding;
        if (d1Var == null) {
            return;
        }
        d1Var.f21075x.removeCallbacks(this.readRfStatus);
        d1Var.f21075x.postDelayed(this.readRfStatus, 300L);
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null || !l1VarY4.n()) {
            return;
        }
        l1 l1VarY42 = Y4();
        if (l1VarY42 != null) {
            l1VarY42.a(v4.v.READ_RF_STATUS, new byte[0]);
        }
        int i10 = this.t + 1;
        this.t = i10;
        if (i10 > 10) {
            this.t = 0;
            c0 c0VarW4 = W4();
            if (c0VarW4 == null || (cVarU1 = c0VarW4.U1()) == null) {
                return;
            }
            cVarU1.M(10, 1840, new int[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r5(b bVar) {
        bVar.q5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void M(n0 link, d packet) {
        m.e(link, "link");
        m.e(packet, "packet");
        super.M(link, packet);
        if (DeviceFragment.a5(packet)) {
            int iM = packet.m();
            if (iM != 2) {
                if (iM == 10 && packet.e() == 1840) {
                    byte[] bArrI = packet.i();
                    m.d(bArrI, "getPayload(...)");
                    o5(bArrI);
                    return;
                }
                return;
            }
            if (C0088b.f6111a[v4.v.d(packet.e()).ordinal()] == 1) {
                byte[] bArrI2 = packet.i();
                m.d(bArrI2, "getPayload(...)");
                p5(bArrI2);
            }
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        q5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void W0(n0 link) {
        m.e(link, "link");
        super.W0(link);
        q5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(n0 oldLink, n0 newLink) {
        super.d5(oldLink, newLink);
        q5();
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.e(inflater, "inflater");
        z4("设备状态");
        d1 d1VarC = d1.c(inflater, container, false);
        this.binding = d1VarC;
        m.b(d1VarC);
        ScrollView scrollViewB = d1VarC.b();
        m.d(scrollViewB, "getRoot(...)");
        return scrollViewB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }
}
