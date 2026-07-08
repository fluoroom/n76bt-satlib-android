package e2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f11386r = "r";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f11387a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected b f11390d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f11394h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f11392f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f11393g = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11395i = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11396j = 240;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f11397k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f11398l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected Boolean f11399m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Boolean f11400n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11401o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f11402p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f11403q = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f11388b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f11389c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e2.a f11391e = new e2.a();

    public interface a {
        void a(boolean z10);

        void b();

        void c(int i10);

        void d(c cVar);

        void e(int i10);

        void f(boolean z10);

        void g();

        void h(boolean z10);

        void i();

        void j();

        void k();

        void m();
    }

    public r(a aVar) {
        this.f11387a = aVar;
    }

    private void N(byte[] bArr) {
        while (bArr.length > 2) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byte b10 = byteBufferWrap.get();
            byte[] bArr2 = new byte[byteBufferWrap.get()];
            byteBufferWrap.get(bArr2);
            O(b10, bArr2);
            if (!byteBufferWrap.hasRemaining()) {
                break;
            }
            byte[] bArr3 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr3);
            bArr = bArr3;
        }
        l();
    }

    private void O(byte b10, byte[] bArr) {
        String str = f11386r;
        Log.d(str, "processInfo: " + ((int) b10) + " -> " + f2.a.a(bArr));
        if (b10 == 1) {
            if (bArr.length == 2) {
                short s10 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort();
                H(s10);
                this.f11393g = s10;
                return;
            }
            return;
        }
        if (b10 == 2) {
            if (bArr.length == 11) {
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                int i10 = byteBufferOrder.getInt();
                this.f11390d.l(i10);
                Log.d(str, "startAddress = " + i10);
                int i11 = byteBufferOrder.getInt();
                this.f11395i = i11;
                this.f11390d.j(i11);
                Log.d(str, "blockSize = " + i11);
                short s11 = byteBufferOrder.getShort();
                this.f11396j = s11;
                this.f11390d.k(s11);
                Log.d(str, "packetSize = " + ((int) s11));
                this.f11394h = byteBufferOrder.get() == 1;
                Log.d(str, "allowedUpdate = " + this.f11394h);
                return;
            }
            return;
        }
        if (b10 == 3) {
            if (bArr.length == 2) {
                this.f11399m = Boolean.valueOf((ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort() & 1) != 0);
                Log.d(str, "isTWS: " + this.f11399m);
                F(this.f11399m.booleanValue());
                return;
            }
            return;
        }
        if (b10 == 4) {
            if (bArr.length == 2) {
                this.f11400n = Boolean.valueOf((ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort() & 1) != 0);
                Log.d(str, "isTwsConnected: " + this.f11400n);
                G(this.f11400n.booleanValue());
                return;
            }
            return;
        }
        if (b10 == 6 && bArr.length == 1) {
            byte b11 = bArr[0];
            if (b11 == 1) {
                Log.d(str, "Channel: Left");
                E(true);
            } else if (b11 == 0) {
                Log.d(str, "Channel: Right");
                E(false);
            }
        }
    }

    public static /* synthetic */ void a(r rVar) {
        rVar.f11403q = true;
        rVar.m();
    }

    private void k() {
        this.f11389c.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.f11398l) {
            return;
        }
        z(c.TIMEOUT_RECEIVE_RESPONSE);
    }

    protected void A() {
        Handler handler = this.f11388b;
        final a aVar = this.f11387a;
        Objects.requireNonNull(aVar);
        handler.post(new Runnable() { // from class: e2.l
            @Override // java.lang.Runnable
            public final void run() {
                aVar.j();
            }
        });
    }

    protected void B() {
        Handler handler = this.f11388b;
        final a aVar = this.f11387a;
        Objects.requireNonNull(aVar);
        handler.post(new Runnable() { // from class: e2.g
            @Override // java.lang.Runnable
            public final void run() {
                aVar.m();
            }
        });
    }

    protected void C(final int i10) {
        this.f11388b.post(new Runnable() { // from class: e2.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f11373a.f11387a.e(i10);
            }
        });
    }

    protected void D() {
        Handler handler = this.f11388b;
        final a aVar = this.f11387a;
        Objects.requireNonNull(aVar);
        handler.post(new Runnable() { // from class: e2.q
            @Override // java.lang.Runnable
            public final void run() {
                aVar.g();
            }
        });
    }

    protected void E(final boolean z10) {
        this.f11388b.post(new Runnable() { // from class: e2.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f11368a.f11387a.a(z10);
            }
        });
    }

    protected void F(final boolean z10) {
        this.f11388b.post(new Runnable() { // from class: e2.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f11375a.f11387a.h(z10);
            }
        });
    }

    protected void G(final boolean z10) {
        this.f11388b.post(new Runnable() { // from class: e2.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f11378a.f11387a.f(z10);
            }
        });
    }

    protected void H(final int i10) {
        this.f11388b.post(new Runnable() { // from class: e2.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f11381a.f11387a.c(i10);
            }
        });
    }

    protected void I() {
        Handler handler = this.f11388b;
        final a aVar = this.f11387a;
        Objects.requireNonNull(aVar);
        handler.post(new Runnable() { // from class: e2.h
            @Override // java.lang.Runnable
            public final void run() {
                aVar.i();
            }
        });
    }

    protected void J() {
        Handler handler = this.f11388b;
        final a aVar = this.f11387a;
        Objects.requireNonNull(aVar);
        handler.post(new Runnable() { // from class: e2.n
            @Override // java.lang.Runnable
            public final void run() {
                aVar.b();
            }
        });
    }

    public void K() {
        if (x()) {
            U();
        } else {
            m();
        }
    }

    public boolean L(byte[] bArr) {
        if (bArr.length < 3) {
            Log.w(f11386r, "接收到数据长度小于3");
            return false;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byte b10 = byteBufferWrap.get();
        byte b11 = byteBufferWrap.get();
        Log.d(f11386r, "processData:cmdType=" + ((int) b10) + " seqNum=" + ((int) b11));
        switch (b10) {
            case -112:
                P(byteBufferWrap.get());
                break;
            case -111:
                byte b12 = byteBufferWrap.get();
                byte[] bArr2 = new byte[byteBufferWrap.remaining()];
                byteBufferWrap.get(bArr2, 0, byteBufferWrap.remaining());
                M(b12, bArr2);
                break;
            case -110:
                byte[] bArr3 = new byte[byteBufferWrap.remaining()];
                byteBufferWrap.get(bArr3, 0, byteBufferWrap.remaining());
                N(bArr3);
                break;
        }
        return false;
    }

    protected void M(byte b10, byte[] bArr) {
        O(b10, bArr);
        if (b10 == 1) {
            o(this.f11392f);
            return;
        }
        if (b10 != 2) {
            return;
        }
        if (this.f11394h) {
            V();
        } else {
            k();
            z(c.REFUSED_BY_DEVICE);
        }
    }

    protected void P(byte b10) {
        if (b10 == -128) {
            k();
            this.f11397k = false;
            this.f11400n = Boolean.FALSE;
            J();
            G(this.f11400n.booleanValue());
            return;
        }
        if (b10 == -3) {
            k();
            this.f11394h = false;
            this.f11397k = false;
            this.f11398l = true;
            B();
            return;
        }
        if (b10 == -2) {
            y();
            this.f11397k = true;
            this.f11398l = false;
            p();
            return;
        }
        if (b10 == -1) {
            k();
            A();
            Q();
        } else {
            if (b10 != 0) {
                c cVar = c.REPORT_FROM_DEVICE;
                cVar.e(b10);
                k();
                z(cVar);
                return;
            }
            k();
            if (this.f11398l || this.f11390d.h()) {
                return;
            }
            V();
        }
    }

    public void Q() {
        this.f11392f = -1;
        this.f11393g = -1;
        this.f11394h = false;
        this.f11397k = false;
        this.f11398l = false;
        this.f11403q = false;
        k();
        this.f11391e.l();
    }

    protected void R() {
        if (x() && !this.f11403q) {
            HandlerThread handlerThread = new HandlerThread("Get All Info");
            handlerThread.start();
            new Handler(handlerThread.getLooper()).postDelayed(new Runnable() { // from class: e2.i
                @Override // java.lang.Runnable
                public final void run() {
                    r.a(this.f11372a);
                }
            }, 200L);
        } else {
            if (j()) {
                T();
                return;
            }
            b bVar = this.f11390d;
            if (bVar == null || !bVar.i()) {
                return;
            }
            this.f11389c.postDelayed(new Runnable() { // from class: e2.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11366a.r();
                }
            }, 3000L);
        }
    }

    protected void S() {
        i(this.f11391e.i());
        C(this.f11390d.d());
    }

    protected void T() {
        S();
    }

    protected void U() {
        i(this.f11391e.h());
    }

    protected void V() {
        i(this.f11391e.j());
        C(this.f11390d.d());
    }

    public void W(byte[] bArr) {
        b bVar = new b(bArr);
        this.f11390d = bVar;
        bVar.j(n());
        this.f11390d.k(q());
        e2.a aVar = this.f11391e;
        if (aVar != null) {
            aVar.m(this.f11390d);
        } else {
            this.f11391e = new e2.a(this.f11390d);
        }
        l();
    }

    public void X() {
        this.f11397k = true;
        I();
        p();
    }

    protected abstract void i(byte[] bArr);

    protected boolean j() {
        return this.f11394h && !this.f11390d.i();
    }

    protected void l() {
        boolean zT = t();
        Log.d(f11386r, "checkIfReadyToUpdate: " + zT);
        if (zT) {
            D();
        }
    }

    protected void m() {
        i(this.f11391e.e());
    }

    protected int n() {
        return this.f11395i;
    }

    protected void o(int i10) {
        b bVar = this.f11390d;
        if (bVar != null) {
            i(this.f11391e.f(i10, bVar.b()));
        }
    }

    protected void p() {
        i(this.f11391e.g());
    }

    protected int q() {
        return this.f11396j;
    }

    public boolean s() {
        Log.d(f11386r, "isDeviceReady: T:" + this.f11399m + ", C:" + this.f11400n);
        Boolean bool = this.f11399m;
        if (bool == null) {
            return false;
        }
        if (bool.booleanValue()) {
            return u();
        }
        return true;
    }

    public boolean t() {
        String str = f11386r;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isReadyToUpdate: R:");
        sb2.append(s());
        sb2.append(", D:");
        sb2.append(this.f11390d != null);
        Log.d(str, sb2.toString());
        return s() && this.f11390d != null;
    }

    public boolean u() {
        Boolean bool = this.f11400n;
        return bool != null && bool.booleanValue();
    }

    public boolean v() {
        Boolean bool = this.f11399m;
        return bool != null && bool.booleanValue();
    }

    public boolean w() {
        return this.f11397k;
    }

    public boolean x() {
        return this.f11402p;
    }

    protected void y() {
        Handler handler = this.f11388b;
        final a aVar = this.f11387a;
        Objects.requireNonNull(aVar);
        handler.post(new Runnable() { // from class: e2.e
            @Override // java.lang.Runnable
            public final void run() {
                aVar.k();
            }
        });
    }

    protected void z(final c cVar) {
        this.f11401o = true;
        this.f11388b.post(new Runnable() { // from class: e2.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f11383a.f11387a.d(cVar);
            }
        });
        Q();
    }
}
