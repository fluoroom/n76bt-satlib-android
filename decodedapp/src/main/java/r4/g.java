package r4;

import a6.y;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.satellite.b;
import org.greenrobot.eventbus.ThreadMode;
import p3.b;
import qa.a;
import r4.g;
import v4.a2;
import v4.c0;
import v4.k0;
import v4.l1;
import v4.n0;
import v4.u;
import v4.v;

/* JADX INFO: loaded from: classes.dex */
public final class g extends r4.a implements n0.b {

    /* JADX INFO: renamed from: z */
    public static final a f25422z = new a(null);

    /* JADX INFO: renamed from: g */
    private boolean f25423g;

    /* JADX INFO: renamed from: h */
    private final p3.b f25424h;

    /* JADX INFO: renamed from: r */
    private final p3.b f25425r;

    /* JADX INFO: renamed from: s */
    private final Runnable f25426s;

    /* JADX INFO: renamed from: t */
    private boolean f25427t;

    /* JADX INFO: renamed from: u */
    private boolean f25428u;

    /* JADX INFO: renamed from: v */
    private int f25429v;

    /* JADX INFO: renamed from: w */
    private m4.j f25430w;

    /* JADX INFO: renamed from: x */
    private boolean f25431x;

    /* JADX INFO: renamed from: y */
    private y4.b f25432y;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public static final void c(Context context) {
            g.f25422z.b(context);
        }

        private final void d(Context context) throws Exception {
            if (qa.a.f24495a.e("DeviceStatusFloatWindows") != null) {
                return;
            }
            h.t(new g(context, "DeviceStatusFloatWindows"), null, 1, null);
        }

        public final void b(final Context context) {
            rd.m.e(context, "context");
            if (!rd.m.a(Looper.myLooper(), Looper.getMainLooper())) {
                a6.i.a(new Runnable() { // from class: r4.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.a.c(context);
                    }
                });
            } else if (!Cfg.O().isShowFloatIntercomStatus() || u.w().q() == null) {
                a.b.b(qa.a.f24495a, "DeviceStatusFloatWindows", false, 2, null);
            } else {
                d(context);
            }
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25433a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f25434b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f25435c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f25436d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f25437e;

        static {
            int[] iArr = new int[c0.q.values().length];
            try {
                iArr[c0.q.DoubleCh.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.q.ChannelScan.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25433a = iArr;
            int[] iArr2 = new int[n0.c.values().length];
            try {
                iArr2[n0.c.Connecting.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[n0.c.Idle.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[n0.c.Interrupted.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[n0.c.ConnectionFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f25434b = iArr2;
            int[] iArr3 = new int[a2.a.values().length];
            try {
                iArr3[a2.a.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[a2.a.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f25435c = iArr3;
            int[] iArr4 = new int[u.c.values().length];
            try {
                iArr4[u.c.CurrentLinkChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            f25436d = iArr4;
            int[] iArr5 = new int[Cfg.a.values().length];
            try {
                iArr5[Cfg.a.SimpleUIBindChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            f25437e = iArr5;
        }
    }

    public static final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f25427t) {
                g.this.f25428u = false;
                g.this.Q();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str) {
        super(context, str);
        rd.m.e(context, "context");
        rd.m.e(str, "tag");
        this.f25424h = new p3.b(null);
        this.f25425r = new p3.b(null);
        this.f25426s = new c();
        this.f25429v = -1;
        this.f25432y = new y4.b();
    }

    private final void H() {
        if (Cfg.O().getSimpleUI()) {
            u.w().G(x());
        }
    }

    public static final void I(Context context) {
        f25422z.b(context);
    }

    public static final void J(g gVar, View view) {
        c0 c0VarV = gVar.v();
        if (c0VarV == null) {
            return;
        }
        if (!gVar.f25431x && gVar.f25432y.b() != y4.c.f32399b && com.dw.ht.satellite.b.x() != 0) {
            mi.c.e().m(b.a.f6706c);
            return;
        }
        c0.q qVarG2 = c0VarV.g2();
        if ((qVarG2 == null ? -1 : b.f25433a[qVarG2.ordinal()]) == 1) {
            c0VarV.h1(a2.a.A);
        }
        gVar.H();
    }

    public static final void K(g gVar, View view) {
        c0 c0VarV = gVar.v();
        if (c0VarV == null) {
            return;
        }
        c0.q qVarG2 = c0VarV.g2();
        int i10 = qVarG2 == null ? -1 : b.f25433a[qVarG2.ordinal()];
        if (i10 == 1) {
            c0VarV.h1(a2.a.B);
        } else if (i10 == 2) {
            int iC = c0VarV.c2().c();
            c0VarV.f1(gVar.f25429v);
            gVar.f25429v = iC;
        }
        gVar.H();
    }

    public static final void L(g gVar, View view) {
        c0 c0VarV = gVar.v();
        if (c0VarV != null) {
            if (c0VarV.n() && !c0VarV.Y().f29912a) {
                c0VarV.a(v.SET_HT_ON_OFF, 1);
            } else if (c0VarV.l() == n0.c.Connecting) {
                c0VarV.h(true);
            } else {
                c0VarV.v(true);
            }
        }
    }

    public static final int N(g gVar) {
        k0 k0VarY;
        l1 l1VarX = gVar.x();
        if (l1VarX == null || (k0VarY = l1VarX.Y()) == null) {
            return 0;
        }
        return k0VarY.b();
    }

    private final void O(m4.k kVar, int i10) {
        c0 c0VarV = v();
        if (c0VarV == null) {
            return;
        }
        P(kVar, i10, c0VarV.Q1(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void P(m4.k r6, int r7, v4.r r8) {
        /*
            r5 = this;
            v4.c0 r0 = r5.v()
            if (r0 != 0) goto L7
            return
        L7:
            r1 = 8
            if (r8 != 0) goto L13
            androidx.constraintlayout.widget.ConstraintLayout r6 = r6.b()
            r6.setVisibility(r1)
            return
        L13:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r6.b()
            r3 = 0
            r2.setVisibility(r3)
            java.lang.String r2 = r8.m()
            java.lang.String r4 = "getName(...)"
            rd.m.d(r2, r4)
            int r4 = r2.length()
            if (r4 <= 0) goto L35
            android.widget.TextView r1 = r6.f21262e
            r1.setText(r2)
            android.widget.TextView r1 = r6.f21262e
            r1.setVisibility(r3)
            goto L3a
        L35:
            android.widget.TextView r2 = r6.f21262e
            r2.setVisibility(r1)
        L3a:
            v4.k0 r1 = r0.Y()
            java.lang.String r2 = "getHTStatus(...)"
            rd.m.d(r1, r2)
            android.widget.TextView r2 = r6.f21260c
            int r4 = r1.f29919h
            if (r7 != r4) goto L5a
            boolean r4 = r1.f29913b
            if (r4 == 0) goto L5a
            boolean r4 = r8.f30073r
            if (r4 != 0) goto L5a
            boolean r0 = r0.k2()
            java.lang.String r8 = r8.p(r0)
            goto L62
        L5a:
            boolean r0 = r0.k2()
            java.lang.String r8 = r8.o(r0)
        L62:
            r2.setText(r8)
            int r8 = r1.f29919h
            if (r7 != r8) goto L79
            boolean r7 = r1.f29913b
            if (r7 == 0) goto L71
            r7 = 2131231118(0x7f08018e, float:1.8078308E38)
            goto L7a
        L71:
            boolean r7 = r1.f29915d
            if (r7 == 0) goto L79
            r7 = 2131231080(0x7f080168, float:1.807823E38)
            goto L7a
        L79:
            r7 = 0
        L7a:
            if (r7 != 0) goto L83
            androidx.appcompat.widget.AppCompatImageView r6 = r6.f21261d
            r7 = 4
            r6.setVisibility(r7)
            return
        L83:
            androidx.appcompat.widget.AppCompatImageView r8 = r6.f21261d
            r8.setImageResource(r7)
            androidx.appcompat.widget.AppCompatImageView r6 = r6.f21261d
            r6.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.g.P(m4.k, int, v4.r):void");
    }

    public final void Q() {
        int i10;
        m4.j jVar = this.f25430w;
        if (jVar == null) {
            return;
        }
        c0 c0VarV = v();
        if (c0VarV == null || this.f25423g) {
            jVar.f21242h.setVisibility(8);
            return;
        }
        k0 k0VarY = c0VarV.Y();
        rd.m.d(k0VarY, "getHTStatus(...)");
        a2 a2VarC2 = c0VarV.c2();
        rd.m.d(a2VarC2, "getSettings(...)");
        jVar.f21242h.setVisibility(0);
        boolean z10 = true;
        if (!c0VarV.n()) {
            jVar.f21236b.b().setVisibility(8);
            jVar.f21237c.b().setVisibility(8);
            jVar.f21243i.setVisibility(8);
            jVar.f21244j.setVisibility(0);
            n0.c cVarL = c0VarV.l();
            i10 = cVarL != null ? b.f25434b[cVarL.ordinal()] : -1;
            if (i10 == 1) {
                jVar.f21244j.setText(R.string.promptCancelConnection);
                return;
            } else {
                if (i10 == 2 || i10 == 3 || i10 == 4) {
                    jVar.f21244j.setText(R.string.connectToControlTheDevice);
                    return;
                }
                return;
            }
        }
        if (!c0VarV.Y().f29912a) {
            jVar.f21236b.b().setVisibility(8);
            jVar.f21237c.b().setVisibility(8);
            jVar.f21243i.setVisibility(8);
            jVar.f21244j.setVisibility(0);
            jVar.f21244j.setText(c0VarV.f0());
            return;
        }
        jVar.f21244j.setVisibility(8);
        if (!this.f25431x && this.f25432y.b() != y4.c.f32399b) {
            m4.k kVar = jVar.f21236b;
            rd.m.d(kVar, "cha");
            P(kVar, k0VarY.f29919h, this.f25432y.a());
            jVar.f21236b.f21259b.setVisibility(4);
            jVar.f21237c.b().setVisibility(8);
        } else if (k0VarY.f29916e != a2.a.Off) {
            m4.k kVar2 = jVar.f21236b;
            rd.m.d(kVar2, "cha");
            O(kVar2, a2VarC2.f29687b);
            m4.k kVar3 = jVar.f21237c;
            rd.m.d(kVar3, "chb");
            O(kVar3, a2VarC2.f29688c);
            a2.a aVar = k0VarY.f29916e;
            i10 = aVar != null ? b.f25435c[aVar.ordinal()] : -1;
            if (i10 == 1) {
                jVar.f21236b.f21259b.setVisibility(0);
                jVar.f21237c.f21259b.setVisibility(4);
            } else if (i10 == 2) {
                jVar.f21236b.f21259b.setVisibility(4);
                jVar.f21237c.f21259b.setVisibility(0);
            }
        } else if (k0VarY.f29917f) {
            jVar.f21236b.b().setVisibility(0);
            jVar.f21237c.b().setVisibility(0);
            if (k0VarY.f29915d) {
                int i11 = k0VarY.f29919h;
                if (i11 != a2VarC2.f29687b) {
                    this.f25429v = i11;
                    this.f25428u = a2VarC2.f29702q;
                }
                this.f25427t = false;
                jVar.f21237c.b().removeCallbacks(this.f25426s);
            } else if (k0VarY.f29913b) {
                this.f25427t = false;
                jVar.f21237c.b().removeCallbacks(this.f25426s);
            } else if (this.f25428u && !this.f25427t) {
                this.f25427t = true;
                jVar.f21237c.b().postDelayed(this.f25426s, 3000L);
            }
            if (this.f25429v < 0) {
                jVar.f21236b.f21259b.setVisibility(4);
                jVar.f21237c.f21259b.setVisibility(4);
            } else if (this.f25428u) {
                jVar.f21236b.f21259b.setVisibility(4);
                jVar.f21237c.f21259b.setVisibility(0);
            } else {
                jVar.f21236b.f21259b.setVisibility(0);
                jVar.f21237c.f21259b.setVisibility(4);
            }
            m4.k kVar4 = jVar.f21236b;
            rd.m.d(kVar4, "cha");
            O(kVar4, a2VarC2.f29687b);
            m4.k kVar5 = jVar.f21237c;
            rd.m.d(kVar5, "chb");
            O(kVar5, this.f25429v);
        } else {
            jVar.f21236b.f21259b.setVisibility(4);
            jVar.f21237c.b().setVisibility(8);
            m4.k kVar6 = jVar.f21236b;
            rd.m.d(kVar6, "cha");
            O(kVar6, a2VarC2.f29687b);
        }
        if (c0VarV.Y().f29915d) {
            jVar.f21243i.setVisibility(0);
        } else {
            jVar.f21243i.setVisibility(this.f25431x ? 4 : 8);
        }
        if (!rd.m.a(u.w().r(), c0VarV) && !Cfg.O().getSimpleUIBind()) {
            z10 = false;
        }
        if (Cfg.O().getSimpleUI()) {
            if (!z10) {
                jVar.f21236b.f21259b.setVisibility(4);
                jVar.f21237c.f21259b.setVisibility(4);
            } else if (jVar.f21237c.b().getVisibility() == 8 || (jVar.f21236b.f21259b.getVisibility() == 4 && jVar.f21237c.f21259b.getVisibility() == 4)) {
                jVar.f21236b.f21259b.setVisibility(0);
            }
        }
    }

    @Override // r4.a, v4.n0.d
    public void W0(n0 n0Var) {
        rd.m.e(n0Var, "link");
        super.W0(n0Var);
        Q();
    }

    @Override // r4.a, v4.n0.d
    public void i0(n0 n0Var) {
        rd.m.e(n0Var, "link");
        super.i0(n0Var);
        Q();
    }

    @Override // r4.a, v4.n0.d
    public void j0(n0 n0Var, k0 k0Var, k0 k0Var2) {
        rd.m.e(n0Var, "link");
        rd.m.e(k0Var, "oldStatus");
        rd.m.e(k0Var2, "newStatus");
        super.j0(n0Var, k0Var, k0Var2);
        if (n0Var instanceof c0) {
            this.f25424h.d(((c0) n0Var).Z());
        }
        Q();
    }

    @Override // r4.h
    public View l(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        rd.m.e(layoutInflater, "inflater");
        m4.j jVarB = m4.j.b(layoutInflater);
        this.f25430w = jVarB;
        rd.m.b(jVarB);
        LinearLayout linearLayout = jVarB.f21242h;
        rd.m.d(linearLayout, "root");
        return linearLayout;
    }

    @Override // r4.a, r4.h
    public void m() {
        super.m();
        l1 l1VarX = x();
        if (l1VarX != null) {
            l1VarX.r(this);
        }
    }

    @Override // r4.h
    public void n() {
        super.n();
        this.f25430w = null;
    }

    @Override // r4.a, r4.h
    public void o() {
        super.o();
    }

    @Override // r4.a
    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(u.c cVar) {
        rd.m.e(cVar, "event");
        super.onMessageEvent(cVar);
        if (b.f25436d[cVar.ordinal()] == 1) {
            Q();
        }
    }

    @Override // r4.a, r4.h
    public void p() {
        super.p();
        Q();
    }

    @Override // r4.h
    public void q(View view, Bundle bundle) {
        rd.m.e(view, "view");
        super.q(view, bundle);
        m4.j jVar = this.f25430w;
        if (jVar == null) {
            return;
        }
        jVar.f21236b.b().setOnClickListener(new View.OnClickListener() { // from class: r4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g.J(this.f25417a, view2);
            }
        });
        jVar.f21237c.b().setOnClickListener(new View.OnClickListener() { // from class: r4.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g.K(this.f25418a, view2);
            }
        });
        jVar.f21244j.setOnClickListener(new View.OnClickListener() { // from class: r4.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g.L(this.f25419a, view2);
            }
        });
        this.f25424h.f(2);
        p3.b bVar = this.f25424h;
        Integer numB = y.b(g(), R.attr.colorPrimary);
        rd.m.b(numB);
        bVar.a(numB.intValue());
        this.f25424h.e(32767);
        this.f25424h.c(20);
        jVar.f21241g.setImageDrawable(this.f25424h);
        this.f25425r.f(2);
        this.f25425r.e(100);
        this.f25425r.c(100);
        Integer numB2 = y.b(g(), R.attr.colorPrimary);
        rd.m.b(numB2);
        this.f25425r.b(new int[]{0, 60}, new int[]{numB2.intValue(), -65536});
        this.f25425r.d(new b.a() { // from class: r4.e
            @Override // p3.b.a
            public final int w() {
                return g.N(this.f25420a);
            }
        });
        jVar.f21240f.setImageDrawable(this.f25425r);
        if (this.f25423g) {
            view.setVisibility(8);
        }
    }

    @Override // v4.n0.b
    public void r(y4.b bVar) {
        rd.m.e(bVar, "status");
        if (rd.m.a(this.f25432y, bVar)) {
            return;
        }
        this.f25432y = bVar;
        Q();
    }

    @Override // r4.a
    protected void y(n0 n0Var, n0 n0Var2) {
        super.y(n0Var, n0Var2);
        if (n0Var != null) {
            n0Var.g(this);
        }
        if (n0Var2 != null) {
            n0Var2.x(this);
        }
        if (n0Var2 instanceof c0) {
            this.f25424h.d(((c0) n0Var2).Z());
        } else {
            this.f25424h.d(null);
        }
        Q();
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(Cfg.a aVar) {
        rd.m.e(aVar, "event");
        if (b.f25437e[aVar.ordinal()] == 1) {
            Q();
        }
    }
}
