package v4;

import android.bluetooth.BluetoothDevice;
import android.graphics.Bitmap;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.Im;
import com.benshikj.ii.IILink;
import com.dw.ht.Cfg;
import com.dw.ht.LocationShareService;
import com.dw.ht.Main;
import com.dw.ht.entitys.IIChannel;
import p3.b;
import v4.a0;
import v4.a2;
import v4.l1;
import v4.n0;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
public class n1 extends z1 {
    public final IILink S;
    public final long T;
    private y1 U;
    private Bitmap V;
    private boolean W;

    public n1(IILink iILink) {
        super(iILink.channelID + 28147497671065500L);
        long j10 = iILink.channelID;
        this.T = j10;
        this.S = iILink;
        IIChannel iIChannelK = u4.d0.k(j10);
        if (iIChannelK != null) {
            boolean monitor = iIChannelK.getMonitor();
            this.H = monitor;
            iILink.setMonitor(monitor);
            if (iIChannelK.getAutoConnect()) {
                L(false);
            }
        } else {
            this.H = true;
        }
        iILink.setMonitor(this.H);
    }

    public void A1() {
        this.S.reloadOnlineUser();
    }

    public boolean B1(l lVar) {
        boolean zN1 = super.n1(lVar, true);
        if (zN1) {
            this.S.setInForward(true);
        }
        return zN1;
    }

    public boolean C1() {
        boolean z10 = this.W;
        this.W = false;
        return z10;
    }

    @Override // v4.l1
    public void D0(Bitmap bitmap, boolean z10) throws Throwable {
        if (this.V != null) {
            d5.g.t(q(), c0(), 1, this.V);
            this.V = null;
            this.W = true;
        }
        if (z10) {
            d5.g.t(q(), c0(), 1, bitmap);
            this.W = true;
        } else {
            s3.b.b("NetworkLink", "onReceived image");
            this.V = bitmap;
        }
    }

    public Bitmap D1() {
        Bitmap bitmap = this.V;
        this.V = null;
        return bitmap;
    }

    @Override // v4.l1
    public void L(boolean z10) {
        u4.d0.f28046a.q(this.T, true);
        this.S.connect();
    }

    @Override // v4.l1
    public x4.a M(boolean z10) {
        return new x4.b(this.S.getBitRates());
    }

    @Override // v4.l1
    public void O(boolean z10) {
        if (z10) {
            u4.d0.f28046a.q(this.T, false);
        }
        this.S.disconnect();
    }

    @Override // v4.l1
    public q T() {
        com.dw.ht.user.b bVar = com.dw.ht.user.b.f6853a;
        q qVarC = bVar.c();
        qVarC.O(true);
        qVarC.a0(bVar.i());
        return qVarC;
    }

    @Override // v4.l1
    public boolean V0(short s10) {
        return this.S.sendCom(s10);
    }

    @Override // v4.l1
    public r0 Z() {
        return null;
    }

    @Override // v4.z1, v4.l1, v4.n0, e5.a.f
    public /* bridge */ /* synthetic */ boolean a(v vVar, byte[] bArr) {
        return super.a(vVar, bArr);
    }

    @Override // v4.l1
    public Long[] a0() {
        return this.S.getOnlineUser();
    }

    @Override // v4.l1
    public void a1(n0.c cVar, l1.h hVar) {
        super.a1(cVar, hVar);
        e1(cVar);
    }

    @Override // v4.l1
    public y1 b0() {
        if (this.U == null) {
            this.U = new p1(this);
        }
        return this.U;
    }

    @Override // v4.z1, v4.l1, v4.n0, e5.a.f
    public /* bridge */ /* synthetic */ a0 d() {
        return super.d();
    }

    @Override // v4.l1
    public CharSequence f0() {
        u.d dVarX1;
        r rVarQ1;
        Main main = Main.f5555g;
        if (!i()) {
            return this.S.getLinkStatus() != IILink.LinkStatus.Idle ? main.getString(R.string.connecting) : main.getString(R.string.disconnected);
        }
        if (!Cfg.O().getSimpleUI() && (dVarX1 = x1(true)) != null && (rVarQ1 = dVarX1.f30167a.Q1(dVarX1.f30168b.getDevChannel())) != null) {
            return dVarX1.f30167a.getName() + " > " + rVarQ1.k(dVarX1.f30167a.k2());
        }
        long delay = this.S.getDelay();
        if (delay <= 0) {
            return main.getString(R.string.connected);
        }
        return main.getString(R.string.connected) + " " + delay + "ms";
    }

    @Override // v4.z1, v4.l1
    public /* bridge */ /* synthetic */ void g1(a0.e eVar) {
        super.g1(eVar);
    }

    @Override // v4.l1, v4.n0
    public String getName() {
        return this.S.name;
    }

    @Override // v4.z1, v4.l1
    public /* bridge */ /* synthetic */ boolean h1(a2.a aVar) {
        return super.h1(aVar);
    }

    @Override // v4.l1, v4.n0
    public boolean i() {
        return this.S.getLinkStatus().isConnected();
    }

    @Override // v4.l1
    public long i0() {
        return Cfg.f5476a ? 60000000L : 180000L;
    }

    @Override // v4.l1
    public void i1(boolean z10) {
        super.i1(z10);
        u4.d0.f28046a.s(this.T, z10);
        this.S.setMonitor(z10);
        if (z10) {
            L(false);
        }
    }

    @Override // v4.l1, v4.n0
    public boolean isDestroyed() {
        return this.S.isDestroyed() || super.isDestroyed();
    }

    @Override // v4.l1
    public boolean j0() {
        return this.S.inRx();
    }

    @Override // v4.l1
    public void k1(boolean z10) throws Throwable {
        boolean zT0 = t0();
        super.k1(z10);
        if (zT0 == z10 || !z10 || this.V == null) {
            return;
        }
        d5.g.t(q(), c0(), 1, this.V);
        this.V = null;
        this.W = true;
    }

    @Override // v4.l1, v4.n0
    public boolean n() {
        return i();
    }

    @Override // v4.l1
    public boolean n1(l lVar, boolean z10) {
        u.d dVarJ;
        boolean zN1 = super.n1(lVar, z10);
        if (zN1) {
            if (T().r()) {
                mi.c.e().m(LocationShareService.b.SingleUpdate);
            }
            this.S.setInForward(false);
            if (!z10 && (dVarJ = u.w().j(this.T, true)) != null) {
                lVar.z(dVarJ.f30167a, dVarJ.f30168b.getDevChannel());
            }
        }
        return zN1;
    }

    @Override // v4.l1
    public boolean o0() {
        return true;
    }

    @Override // v4.l1
    public b.a o1(BluetoothDevice bluetoothDevice) {
        if (!this.S.isInBan()) {
            b.a aVarO1 = super.o1(bluetoothDevice);
            if (aVarO1 != null) {
                this.S.sendHeartbeat();
            }
            return aVarO1;
        }
        if (this.S.isBanBySpeakLevel()) {
            this.S.sendHeartbeat();
            throw new IllegalStateException(Main.f5555g.getString(R.string.no_permission_to_speak));
        }
        this.S.sendHeartbeat();
        throw new IllegalStateException(Main.f5555g.getString(R.string.banned));
    }

    @Override // v4.l1
    public boolean q1(int i10, long j10) {
        return true;
    }

    @Override // v4.l1
    public boolean s0() {
        return this.A == null && this.S.isReadyTx();
    }

    @Override // v4.l1
    public boolean s1(byte[] bArr, int i10, int i11, long j10) {
        return this.S.write(bArr, i10, i11, j10);
    }

    @Override // v4.l1, v4.n0
    public void v(boolean z10) {
        L(z10);
    }

    @Override // v4.z1
    protected boolean v1() {
        return false;
    }

    public u.d w1(boolean z10) {
        return u.w().j(this.T, z10);
    }

    public u.d x1(boolean z10) {
        return u.w().j(this.T, z10);
    }

    public Im.GetChannelMembersResult y1(boolean z10) {
        return this.S.getChannelMembers(z10);
    }

    public boolean z1() {
        IIChannel iIChannelK = u4.d0.k(this.T);
        return iIChannelK != null && iIChannelK.l() == com.dw.ht.user.b.f6853a.i();
    }
}
