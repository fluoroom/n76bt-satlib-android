package y1;

import a6.w;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.benshikj.ht.rpc.Dm;
import com.benshikj.ii.ReceiveStatus;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.activitys.UpdateActivity;
import dd.d0;
import e5.a;
import ed.q;
import g3.a;
import g3.b;
import g3.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.greenrobot.eventbus.ThreadMode;
import rd.m;
import s4.q2;
import u4.y;
import v4.a0;
import v4.i0;
import v4.j0;
import v4.l1;
import v4.m2;
import v4.n;
import v4.n0;
import v4.n1;
import v4.u;
import v4.v;
import w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class a implements a.f {
    private Handler A;
    private Handler B;
    private boolean C;
    private boolean D;
    private long E;
    private a.e F;
    private a.g G;
    private w4.c[] H;
    private final ConcurrentLinkedQueue I;
    private final ArrayList J;
    private final HashMap K;

    /* JADX INFO: renamed from: a */
    private final Context f32285a;

    /* JADX INFO: renamed from: b */
    private final i0 f32286b;

    /* JADX INFO: renamed from: c */
    private final j0 f32287c;

    /* JADX INFO: renamed from: d */
    private Dm.DeviceID f32288d;

    /* JADX INFO: renamed from: e */
    private boolean f32289e;

    /* JADX INFO: renamed from: f */
    private boolean f32290f;

    /* JADX INFO: renamed from: g */
    private boolean f32291g;

    /* JADX INFO: renamed from: h */
    private int f32292h;

    /* JADX INFO: renamed from: r */
    private int f32293r;

    /* JADX INFO: renamed from: s */
    private final Object f32294s;

    /* JADX INFO: renamed from: t */
    private e5.a f32295t;

    /* JADX INFO: renamed from: u */
    private final boolean f32296u;

    /* JADX INFO: renamed from: v */
    private final k f32297v;

    /* JADX INFO: renamed from: w */
    private int f32298w;

    /* JADX INFO: renamed from: x */
    private final n f32299x;

    /* JADX INFO: renamed from: y */
    private volatile n0.c f32300y;

    /* JADX INFO: renamed from: z */
    private boolean f32301z;

    /* JADX INFO: renamed from: y1.a$a */
    public static final /* synthetic */ class C0436a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32302a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f32303b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f32304c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f32305d;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.GET_PF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f32302a = iArr;
            int[] iArr2 = new int[h.values().length];
            try {
                iArr2[h.f32343h.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[h.f32345s.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[h.f32347u.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[h.f32352z.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[h.f32351y.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[h.f32348v.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[h.f32349w.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[h.f32350x.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
            f32303b = iArr2;
            int[] iArr3 = new int[i.values().length];
            try {
                iArr3[i.f32358e.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            f32304c = iArr3;
            int[] iArr4 = new int[u.c.values().length];
            try {
                iArr4[u.c.CurrentLinkChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            f32305d = iArr4;
        }
    }

    public static final class c extends Handler {

        /* JADX INFO: renamed from: y1.a$c$a */
        public static final /* synthetic */ class C0437a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f32308a;

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ int[] f32309b;

            static {
                int[] iArr = new int[b.a.values().length];
                try {
                    iArr[b.a.CONNECTION_FAILED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f32308a = iArr;
                int[] iArr2 = new int[c.EnumC0195c.values().length];
                try {
                    iArr2[c.EnumC0195c.PACKET.ordinal()] = 1;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr2[c.EnumC0195c.CONNECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[c.EnumC0195c.DISCONNECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[c.EnumC0195c.ERROR.ordinal()] = 4;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[c.EnumC0195c.STREAM.ordinal()] = 5;
                } catch (NoSuchFieldError unused6) {
                }
                f32309b = iArr2;
            }
        }

        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            m.e(message, "msg");
            Handler handlerV = a.this.v();
            if (handlerV != null) {
                handlerV.dispatchMessage(message);
            }
            c.EnumC0195c enumC0195cD = c.EnumC0195c.d(message.what);
            int i10 = enumC0195cD == null ? -1 : C0437a.f32309b[enumC0195cD.ordinal()];
            if (i10 == 1) {
                a.this.p().K(message);
                a aVar = a.this;
                Object obj = message.obj;
                m.c(obj, "null cannot be cast to non-null type com.csr.gaia.library.GaiaPacket");
                aVar.G((g3.d) obj);
                return;
            }
            if (i10 == 2) {
                if (a.this.f32296u) {
                    s3.b.b("BELink", "Handle a message from Gaia: CONNECTED");
                }
                a.this.p().N();
                a.this.V(n0.c.Connected);
                return;
            }
            if (i10 == 3) {
                if (a.this.f32296u) {
                    s3.b.b("BELink", "Handle a message from Gaia: DISCONNECTED");
                }
                a.this.S(false);
                a.this.T(false);
                a.this.V(n0.c.Interrupted);
                return;
            }
            if (i10 == 4) {
                Object obj2 = message.obj;
                m.c(obj2, "null cannot be cast to non-null type com.csr.gaia.library.GaiaError");
                g3.b bVar = (g3.b) obj2;
                if (a.this.f32296u) {
                    s3.b.b("BELink", "Handle a message from Gaia: ERROR");
                    s3.b.b("BELink", bVar.b());
                }
                b.a aVarC = bVar.c();
                if ((aVarC != null ? C0437a.f32308a[aVarC.ordinal()] : -1) == 1) {
                    a.this.V(n0.c.ConnectionFailed);
                    return;
                }
                return;
            }
            if (i10 == 5) {
                if (a.this.f32296u) {
                    s3.b.b("BELink", "Handle a message from Gaia: STREAM");
                    return;
                }
                return;
            }
            if (a.this.f32296u) {
                s3.b.b("BELink", "Handle a message from Gaia: OTHER MESSAGE: " + message);
            }
        }
    }

    public static final class d extends e5.a {
        d(Main main) {
            super(main, a.this);
        }

        @Override // e5.a
        protected void g(a.d dVar, CharSequence charSequence) {
            m.e(dVar, "error");
            super.g(dVar, charSequence);
            a.this.f32295t = null;
            a.this.G = f();
        }

        @Override // e5.a
        protected void h(a.d dVar, CharSequence charSequence) {
            String strE;
            m.e(dVar, "error");
            m.e(charSequence, "message");
            super.h(dVar, charSequence);
            a.this.U(2);
            a.this.f32295t = null;
            if (a.this.r() == null) {
                Dm.DeviceID deviceIDQ = a.this.q();
                if (deviceIDQ == null || (strE = deviceIDQ.toString()) == null) {
                    strE = e();
                }
                a.this.d0((strE + "DRT: " + this.f11441e) + "\nEC: " + dVar.f11456a);
            }
        }

        @Override // e5.a
        protected void k() {
            super.k();
            a.this.U(1);
            a.this.a(v.UNLOCK, new byte[0]);
            a.this.f32295t = null;
        }
    }

    public a(Context context, i0 i0Var) {
        k fVar;
        int iD;
        m.e(context, "context");
        m.e(i0Var, "hmLink");
        this.f32285a = context;
        this.f32286b = i0Var;
        this.f32287c = new j0();
        this.f32294s = new Object();
        this.f32296u = Cfg.f5476a;
        if (i0Var.G() != null) {
            fVar = new y1.d(context, i0Var.G());
        } else {
            g3.c cVarH = g3.c.H();
            m.b(cVarH);
            fVar = new f(cVarH);
        }
        this.f32297v = fVar;
        this.f32299x = new n(fVar, new b());
        this.f32300y = n0.c.Idle;
        c cVar = new c(Looper.getMainLooper());
        this.B = cVar;
        fVar.d(cVar);
        y5.f fVarL = Cfg.L();
        if (fVarL != null) {
            iD = fVarL.d(l1.W(i0Var.J().getAddress()) + ".rs", 0);
        } else {
            iD = 0;
        }
        this.f32298w = iD;
        if (iD == 2) {
            this.f32298w = 0;
        }
        this.I = new ConcurrentLinkedQueue();
        this.J = new ArrayList();
        this.K = new HashMap();
    }

    private final boolean D(g3.d dVar) {
        return dVar.n() && dVar.l() == a.b.SUCCESS;
    }

    private final void H(g3.d dVar) {
        if (dVar.m() == 2 && D(dVar)) {
            if (C0436a.f32302a[v.d(dVar.e()).ordinal()] == 1) {
                byte[] bArrI = dVar.i();
                c.C0413c c0413c = w4.c.f31091e;
                m.b(bArrI);
                this.H = c0413c.a(bArrI, 1, bArrI.length);
            }
        }
    }

    private final void L(short s10) {
        this.E = SystemClock.uptimeMillis();
        P(4106, 10, s10);
    }

    private final void Q(h hVar, short... sArr) {
        P(4106, hVar.e(), Arrays.copyOf(sArr, sArr.length));
    }

    private final void R(boolean z10) {
        if (this.f32291g == z10) {
            return;
        }
        if (this.f32296u) {
            s3.b.b("BELink", "audioPlaying:" + this.f32291g + "->" + z10);
        }
        this.f32291g = z10;
    }

    public final void U(int i10) {
        SharedPreferences.Editor editorC;
        if (this.f32298w == i10) {
            return;
        }
        this.f32298w = i10;
        y5.f fVarL = Cfg.L();
        if (fVarL == null || (editorC = fVarL.c()) == null) {
            return;
        }
        SharedPreferences.Editor editorPutInt = editorC.putInt(l1.W(this.f32286b.J().getAddress()) + ".rs", this.f32298w);
        if (editorPutInt != null) {
            editorPutInt.apply();
        }
    }

    private final void X(boolean z10) {
        if (this.f32301z == z10) {
            return;
        }
        this.f32301z = z10;
        if (z10) {
            mi.c.e().q(this);
        } else {
            mi.c.e().t(this);
        }
    }

    private final void b0(int i10) {
        synchronized (this.f32294s) {
            try {
                if (this.f32296u) {
                    s3.b.b("BELink", "playBufferAvailable:" + w() + "->" + i10);
                }
                this.f32292h = 0;
                this.f32293r = i10;
                if (i10 > 0) {
                    this.f32294s.notifyAll();
                }
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void e0(a aVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        aVar.d0(str);
    }

    private final void f0() {
        if (this.f32299x.r()) {
            if (this.f32295t == null) {
                d dVar = new d(Main.f5555g);
                this.f32295t = dVar;
                dVar.n(this.F);
            }
            this.G = null;
            e5.a aVar = this.f32295t;
            if (aVar != null) {
                aVar.p();
            }
        }
    }

    public final void g0() {
        s3.b.b("BELink", "startUpdate on " + Thread.currentThread().getName());
        if (this.C) {
            return;
        }
        this.C = true;
        if (this.f32297v instanceof y1.d) {
            FragmentShowActivity.i2(this.f32285a, "", q2.class, q2.INSTANCE.a(this.f32286b));
        }
        Intent intent = new Intent(this.f32285a, (Class<?>) UpdateActivity.class);
        intent.putExtra("EXTRA_BLUETOOTH_DEVICE_ADDRESS", this.f32286b.J().getAddress());
        intent.putExtra("EXTRA_IS_HM", true);
        v3.j.e(this.f32285a, intent);
    }

    private final boolean j0(byte[] bArr) {
        Iterator it = this.J.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        int size = length + this.J.size();
        byte[] bArr2 = null;
        if (bArr != null) {
            if (bArr.length == 0) {
                return true;
            }
            if (size + 1 + bArr.length <= 500) {
                this.J.add(bArr);
                size += bArr.length + 1;
            } else {
                bArr2 = bArr;
            }
        }
        if ((bArr != null && size < 450 && bArr2 == null) || size == 0) {
            return true;
        }
        byte[] bArr3 = new byte[size];
        int length2 = 0;
        for (byte[] bArr4 : this.J) {
            int i10 = length2 + 1;
            bArr3[length2] = (byte) bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i10, bArr4.length);
            length2 = bArr4.length + i10;
        }
        boolean zO = O(h.f32352z, Arrays.copyOf(bArr3, size));
        if (zO) {
            this.J.clear();
            synchronized (this.f32294s) {
                this.f32292h += size;
                d0 d0Var = d0.f10897a;
            }
        }
        if (bArr2 != null) {
            this.J.add(bArr2);
        }
        if (!zO && this.f32296u) {
            s3.b.b("BELink", "writeOpus");
        }
        return zO;
    }

    static /* synthetic */ boolean k0(a aVar, byte[] bArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr = null;
        }
        return aVar.j0(bArr);
    }

    private final int w() {
        int i10;
        synchronized (this.f32294s) {
            i10 = this.f32293r - this.f32292h;
        }
        return i10;
    }

    public final boolean A() {
        if (SystemClock.uptimeMillis() - this.E < 100) {
            return true;
        }
        return this.D;
    }

    public final boolean B() {
        return this.f32297v.b();
    }

    public final boolean C() {
        return this.f32298w == 2;
    }

    public final void E() {
        s3.b.b("BELink", this.f32299x.l());
        m2 m2VarM = this.f32299x.m();
        m.d(m2VarM, "getUpdateInfo(...)");
        c(4106, 13, new byte[0]);
        O(h.f32347u, 1);
        if (!m2VarM.i(this.f32299x.k())) {
            g0();
            return;
        }
        l1 l1VarR = u.w().r();
        c0(l1VarR != null ? l1VarR.getName() : null);
        int i10 = this.f32298w;
        if (i10 == 0) {
            f0();
        } else {
            if (i10 != 2) {
                return;
            }
            d0(null);
        }
    }

    public final void F(g3.d dVar) {
        m.e(dVar, "packet");
        e5.a aVar = this.f32295t;
        if (aVar != null) {
            aVar.i(dVar);
        }
        Iterator it = this.I.iterator();
        m.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((n0.d) it.next()).M(this.f32286b, dVar);
        }
    }

    public final void G(g3.d dVar) {
        m.e(dVar, "packet");
        H(dVar);
        if (dVar.m() != 4106) {
            F(dVar);
            return;
        }
        if (!dVar.n()) {
            int i10 = C0436a.f32303b[h.f32337b.a(dVar.e()).ordinal()];
            if (i10 != 5) {
                if (i10 == 6) {
                    this.D = false;
                } else if (i10 == 7) {
                    j jVar = new j(dVar.d(0), dVar.d(1), this.f32286b);
                    int iA = jVar.a();
                    if (iA == 16) {
                        int iB = jVar.b();
                        if (iB == 16) {
                            mi.c.e().m(new p4.c(this.f32286b.J(), 1));
                        } else if (iB == 17) {
                            mi.c.e().m(new p4.c(this.f32286b.J(), 2));
                        }
                    } else if (iA != 30) {
                        if (iA != 19) {
                            if (iA == 20 && jVar.b() == 18) {
                                n4.d.f22437a.c(this.f32285a, false);
                            }
                        } else if (jVar.b() == 18) {
                            n4.d.f22437a.c(this.f32285a, true);
                        }
                    } else if (jVar.b() == 18) {
                        n4.d.f22437a.b(this.f32285a);
                    }
                    this.f32286b.z().m(jVar);
                } else if (i10 == 8 && dVar.i() != null) {
                    i0 i0Var = this.f32286b;
                    byte[] bArrI = dVar.i();
                    m.d(bArrI, "getPayload(...)");
                    i0Var.W(bArrI);
                }
            } else {
                if (dVar.i().length < 2) {
                    return;
                }
                if (C0436a.f32304c[i.f32354a.a(dVar.k(0)).ordinal()] == 1) {
                    if (dVar.i().length < 3) {
                        return;
                    } else {
                        b0(dVar.k(2));
                    }
                }
            }
        } else if (dVar.l() == a.b.SUCCESS) {
            int i11 = C0436a.f32303b[h.f32337b.a(dVar.e()).ordinal()];
            if (i11 == 1) {
                this.D = true;
            } else if (i11 == 2) {
                j0 j0Var = this.f32287c;
                byte[] bArrI2 = dVar.i();
                m.d(bArrI2, "getPayload(...)");
                j0Var.f(bArrI2);
            } else if (i11 == 3) {
                this.f32289e = true;
            } else if (i11 == 4 && dVar.i().length > 2) {
                b0(dVar.k(1));
            }
        }
        F(dVar);
    }

    public final boolean I(byte[] bArr) {
        m.e(bArr, "opus");
        if (!this.f32290f) {
            return false;
        }
        if (this.f32296u) {
            s3.b.b("BELink", "playOpus:" + bArr.length);
        }
        if (bArr.length == 0) {
            return true;
        }
        if (!this.f32291g) {
            b0(0);
            Q(h.f32351y, (short) i.f32356c.ordinal());
        }
        R(true);
        if (w() >= bArr.length) {
            return j0(bArr);
        }
        synchronized (this.f32294s) {
            long jUptimeMillis = SystemClock.uptimeMillis() + ((long) 2000);
            while (w() < bArr.length) {
                long jUptimeMillis2 = jUptimeMillis - SystemClock.uptimeMillis();
                if (jUptimeMillis2 <= 0) {
                    if (this.f32296u) {
                        s3.b.d("BELink", "playOpus:timeout");
                    }
                    return false;
                }
                this.f32294s.wait(jUptimeMillis2);
            }
            return j0(bArr);
        }
    }

    public final void J() {
        if (Cfg.O().getSendStartTone()) {
            L((short) 1);
        }
    }

    public final void K() {
        if (Cfg.O().getSendStopTone()) {
            L((short) 2);
        }
    }

    public final void M(n0.d dVar) {
        this.I.add(dVar);
    }

    public final void N() {
        if (this.f32287c.a()) {
            byte[] bArrH = this.f32287c.h();
            c(4106, 14, Arrays.copyOf(bArrH, bArrH.length));
        }
    }

    public final boolean O(h hVar, byte... bArr) {
        m.e(hVar, "command");
        m.e(bArr, "payload");
        this.f32297v.c(4106, hVar.e(), bArr);
        return true;
    }

    public final void P(int i10, int i11, short... sArr) {
        m.e(sArr, "param");
        byte[] bArr = new byte[sArr.length * 2];
        int i12 = 0;
        for (short s10 : sArr) {
            int i13 = i12 + 1;
            bArr[i12] = (byte) (s10 >>> 8);
            i12 += 2;
            bArr[i13] = (byte) s10;
        }
        this.f32297v.c(i10, i11, bArr);
    }

    public final void S(boolean z10) {
        this.f32289e = z10;
    }

    public final void T(boolean z10) {
        this.f32290f = z10;
    }

    public final void V(n0.c cVar) {
        m.e(cVar, "value");
        synchronized (this) {
            if (this.f32300y == cVar) {
                return;
            }
            if (this.f32300y.e(cVar)) {
                this.f32300y = cVar;
                d0 d0Var = d0.f10897a;
                this.f32286b.z().m(n0.a.CONTROL_LINK_STATUS_CHANGED);
                mi.c.e().m(i0.b.f29899a);
                X(cVar.d());
            }
        }
    }

    public final void W(a.e eVar) {
        this.F = eVar;
        e5.a aVar = this.f32295t;
        if (aVar != null) {
            aVar.n(eVar);
        }
    }

    public final void Y(Handler handler) {
        this.A = handler;
    }

    public final void Z(String str) {
        if (str == null) {
            c(4106, 6, new byte[0]);
            return;
        }
        byte[] bytes = str.getBytes(rg.d.f26007b);
        m.d(bytes, "getBytes(...)");
        c(4106, 6, Arrays.copyOf(bytes, bytes.length));
    }

    @Override // e5.a.f
    public boolean a(v vVar, byte... bArr) {
        m.e(vVar, "command");
        m.e(bArr, "payload");
        this.f32297v.c(2, vVar.ordinal(), bArr);
        return true;
    }

    public final void a0(String str) {
        if (str == null) {
            c(4106, 12, new byte[0]);
            return;
        }
        byte[] bytes = str.getBytes(rg.d.f26007b);
        m.d(bytes, "getBytes(...)");
        c(4106, 12, Arrays.copyOf(bytes, bytes.length));
    }

    @Override // e5.a.f
    public boolean c(int i10, int i11, byte... bArr) {
        m.e(bArr, "param");
        this.f32297v.c(i10, i11, bArr);
        return true;
    }

    public final void c0(String str) {
        if (str == null) {
            c(4106, 9, new byte[0]);
            return;
        }
        byte[] bytes = str.getBytes(rg.d.f26007b);
        m.d(bytes, "getBytes(...)");
        c(4106, 9, Arrays.copyOf(bytes, bytes.length));
    }

    @Override // e5.a.f
    public a0 d() {
        return this.f32299x;
    }

    public final void d0(String str) {
        Main.f5555g.o(this.f32286b, str);
    }

    @Override // e5.a.f
    public void e(Dm.DeviceID deviceID) {
        this.f32288d = deviceID;
    }

    public final void h0() {
        if (this.f32290f) {
            k0(this, null, 1, null);
            if (this.f32291g) {
                Q(h.f32351y, (short) i.f32357d.ordinal());
            }
            R(false);
        }
    }

    public final void i0(n0.d dVar) {
        this.I.remove(dVar);
    }

    public final void j() {
        this.f32297v.a();
        V(n0.c.Idle);
    }

    public final void k() {
        if (this.f32297v.b()) {
            return;
        }
        n0.c cVar = this.f32300y;
        n0.c cVar2 = n0.c.Connecting;
        if (cVar == cVar2) {
            return;
        }
        V(cVar2);
        this.f32297v.e(this.f32286b.J(), c.e.BT_SPP);
    }

    public final boolean l() {
        return this.f32289e;
    }

    public final boolean m() {
        return this.f32290f;
    }

    public final int n() {
        return this.f32298w;
    }

    public final n0.c o() {
        return this.f32300y;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(u.c cVar) {
        m.e(cVar, "event");
        if (C0436a.f32305d[cVar.ordinal()] == 1) {
            l1 l1VarR = u.w().r();
            c0(l1VarR != null ? l1VarR.getName() : null);
        }
    }

    public final n p() {
        return this.f32299x;
    }

    public final Dm.DeviceID q() {
        return this.f32288d;
    }

    public final a.e r() {
        return this.F;
    }

    public final a.g s() {
        a.g gVarF;
        e5.a aVar = this.f32295t;
        return (aVar == null || (gVarF = aVar.f()) == null) ? a.g.IDLE : gVarF;
    }

    @Override // e5.a.f
    public /* synthetic */ boolean t(int i10) {
        return e5.b.a(this, i10);
    }

    public final k u() {
        return this.f32297v;
    }

    public final Handler v() {
        return this.A;
    }

    public final w4.c[] x() {
        return this.H;
    }

    @Override // e5.a.f
    public void y() {
        U(0);
        k();
        f0();
    }

    public final j0 z() {
        return this.f32287c;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(ReceiveStatus receiveStatus) {
        ReceiveStatus receiveStatus2 = receiveStatus;
        m.e(receiveStatus2, "event");
        if (receiveStatus2.rxing && receiveStatus2.monitor) {
            this.K.put(Long.valueOf(receiveStatus2.f5073id), receiveStatus2);
        } else {
            this.K.remove(Long.valueOf(receiveStatus2.f5073id));
            receiveStatus2 = null;
        }
        ArrayList arrayList = new ArrayList();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Set setKeySet = this.K.keySet();
        m.d(setKeySet, "<get-keys>(...)");
        for (long j10 : q.I0(setKeySet)) {
            ReceiveStatus receiveStatus3 = (ReceiveStatus) this.K.get(Long.valueOf(j10));
            if (receiveStatus3 != null) {
                if (jElapsedRealtime - receiveStatus3.createTime > 300000) {
                    this.K.remove(Long.valueOf(j10));
                } else {
                    if (receiveStatus2 == null) {
                        receiveStatus2 = receiveStatus3;
                    }
                    String strD = y.d(receiveStatus3);
                    if (strD.length() != 0) {
                        arrayList.add(strD);
                    }
                }
            }
        }
        Z(arrayList.size() > 0 ? w.c(" | ", arrayList) : null);
        if (receiveStatus2 != null) {
            n1 n1VarM = u.w().m(receiveStatus2.channelID);
            if (n1VarM != null && !m.a(n1VarM, u.w().r())) {
                a0(n1VarM.getName());
            }
            w5.d dVarB = y.b(receiveStatus2);
            if (dVarB != null) {
                int iOrdinal = v.RX_DATA.ordinal();
                byte[] bArrF = dVarB.f();
                c(2, iOrdinal, Arrays.copyOf(bArrF, bArrF.length));
                return;
            }
            return;
        }
        a0(null);
    }

    public static final class b implements a0.c {
        b() {
        }

        @Override // v4.a0.c
        public void a() {
            a.this.g0();
        }

        @Override // v4.a0.c
        public void c() {
            a.this.E();
        }

        @Override // v4.a0.c
        public void b() {
        }

        @Override // v4.a0.c
        public void d() {
        }
    }
}
