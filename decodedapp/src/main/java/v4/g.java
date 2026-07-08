package v4;

import a0.k;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.benshikj.ht.R;
import com.dw.ht.BTActivity;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.utils.CallbackReceiver;
import p3.b;
import v4.a0;
import v4.a2;
import v4.l1;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
public class g extends z1 implements b.a {
    private float S;
    private f T;
    y1 U;
    private final Object V;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29865a;

        static {
            int[] iArr = new int[n0.c.values().length];
            f29865a = iArr;
            try {
                iArr[n0.c.Sending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    g() {
        super(281474976710657L);
        this.S = 0.1f;
        this.V = new Object();
        this.S = Cfg.K().getFloat("audio_link.noise_level", this.S);
        this.f29947e = Cfg.R();
    }

    private void C1() {
        Main main = Main.f5555g;
        ((NotificationManager) main.getSystemService("notification")).notify(2131231105, new k.d(main, l3.e.f20374b).i(PendingIntent.getActivity(main, 0, new Intent(main, (Class<?>) BTActivity.class), 67108864)).k(main.getString(R.string.audio_connection)).j(main.getString(R.string.connected)).a(0, main.getString(R.string.disconnect), CallbackReceiver.a(main, CallbackReceiver.a.DISCONNECT_AUDIO_LINK)).p(true).s(2131231105).c());
    }

    private void w1() {
        ((NotificationManager) Main.f5555g.getSystemService("notification")).cancel(2131231105);
    }

    public static g y1() {
        return (g) u.w().y(281474976710657L);
    }

    public void A1() {
        y1 y1Var = this.U;
        if (y1Var != null) {
            y1Var.r();
        }
    }

    public void B1(float f10) {
        if (f10 == this.S) {
            return;
        }
        Cfg.K().edit().putFloat("audio_link.noise_level", this.S).apply();
        this.S = f10;
        f fVar = this.T;
        if (fVar != null) {
            fVar.B(f10);
        }
    }

    @Override // v4.l1
    public void L(boolean z10) {
        synchronized (this.V) {
            try {
                if (this.T == null) {
                    f fVar = new f(this);
                    this.T = fVar;
                    fVar.start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Z0(n0.c.Connected);
        C1();
    }

    @Override // v4.l1
    protected m5.j N(BluetoothDevice bluetoothDevice) {
        f fVar = this.T;
        if (fVar != null) {
            fVar.u();
        }
        return new m5.j(this, 5);
    }

    @Override // v4.l1
    public void O(boolean z10) {
        synchronized (this.V) {
            try {
                f fVar = this.T;
                if (fVar == null) {
                    return;
                }
                fVar.cancel();
                this.T = null;
                w1();
                Z0(n0.c.Idle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v4.z1, v4.l1, v4.n0, e5.a.f
    public /* bridge */ /* synthetic */ boolean a(v vVar, byte[] bArr) {
        return super.a(vVar, bArr);
    }

    @Override // v4.l1
    public void a1(n0.c cVar, l1.h hVar) {
        if (this.f29958y != cVar && this.f29958y.e(cVar)) {
            f fVar = this.T;
            if (fVar != null) {
                if (cVar == n0.c.Sending) {
                    fVar.u();
                } else {
                    fVar.x();
                }
            }
            super.a1(cVar, hVar);
            if (s0()) {
                b0().r();
            }
            if (a.f29865a[cVar.ordinal()] != 1) {
                e1(cVar);
            } else {
                e1(n0.c.Connected);
            }
        }
    }

    @Override // v4.l1
    public y1 b0() {
        if (this.U == null) {
            this.U = new h(this);
        }
        return this.U;
    }

    @Override // v4.z1, v4.l1, v4.n0, e5.a.f
    public /* bridge */ /* synthetic */ a0 d() {
        return super.d();
    }

    @Override // v4.l1
    public CharSequence f0() {
        Main main = Main.f5555g;
        return i() ? main.getString(R.string.connected) : main.getString(R.string.disconnected);
    }

    @Override // v4.z1, v4.l1
    public /* bridge */ /* synthetic */ void g1(a0.e eVar) {
        super.g1(eVar);
    }

    @Override // v4.l1, v4.n0
    public String getName() {
        return Main.f5555g.getString(R.string.audio_connection);
    }

    @Override // v4.z1, v4.l1
    public /* bridge */ /* synthetic */ boolean h1(a2.a aVar) {
        return super.h1(aVar);
    }

    @Override // v4.l1, v4.n0
    public boolean i() {
        return this.T != null;
    }

    @Override // v4.l1
    public boolean j0() {
        return false;
    }

    @Override // v4.l1, v4.n0
    public boolean n() {
        return i();
    }

    @Override // v4.l1
    public boolean q1(int i10, long j10) {
        return false;
    }

    @Override // v4.l1
    public boolean s0() {
        f fVar = this.T;
        if (this.A == null) {
            return fVar == null || fVar.z();
        }
        return false;
    }

    @Override // v4.l1
    public boolean s1(byte[] bArr, int i10, int i11, long j10) {
        return false;
    }

    @Override // v4.l1, v4.n0
    public void v(boolean z10) {
        L(z10);
    }

    @Override // p3.b.a
    public int w() {
        f fVar = this.T;
        if (fVar != null) {
            return fVar.w();
        }
        return 0;
    }

    @Override // v4.l1
    public boolean w0() {
        return false;
    }

    @Override // v4.l1
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public s0 Z() {
        return null;
    }

    public float z1() {
        return this.S;
    }
}
