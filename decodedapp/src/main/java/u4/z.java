package u4;

import android.graphics.Bitmap;
import android.location.Location;
import com.benshikj.ht.rpc.Im;
import com.benshikj.ii.II;
import com.benshikj.ii.IILink;
import com.benshikj.ii.NBSS;
import com.benshikj.ii.ReceiveDataProcessor;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.entitys.IIChannel;
import java.util.Arrays;
import v4.d;
import v4.l1;
import v4.n0;
import v4.n1;

/* JADX INFO: loaded from: classes.dex */
public final class z extends IILink {

    /* JADX INFO: renamed from: l */
    private final n1 f28150l;

    /* JADX INFO: renamed from: m */
    private volatile v4.c0 f28151m;

    /* JADX INFO: renamed from: n */
    private m5.b f28152n;

    /* JADX INFO: renamed from: o */
    private long f28153o;

    /* JADX INFO: renamed from: p */
    private final Object f28154p;

    public final class a implements ReceiveDataProcessor {

        /* JADX INFO: renamed from: a */
        private NBSS f28155a;

        /* JADX INFO: renamed from: b */
        private w5.d f28156b;

        /* JADX INFO: renamed from: c */
        private l1.d f28157c;

        /* JADX INFO: renamed from: d */
        private m5.i f28158d;

        /* JADX INFO: renamed from: e */
        private long f28159e;

        /* JADX INFO: renamed from: f */
        private int f28160f;

        /* JADX INFO: renamed from: g */
        private b6.d f28161g;

        /* JADX INFO: renamed from: h */
        private final v4.d f28162h = new v4.d(Cfg.f5494j, false, false, false, 14, null);

        public a(boolean z10) {
            this.f28161g = z.this.t();
            if (z10) {
                this.f28157c = z.this.s().e0();
            }
        }

        private final void a() {
            Bitmap bitmapD1;
            try {
                boolean zC1 = z.this.s().C1();
                if (this.f28157c != null) {
                    xdsopl.robot36.a aVarU = z.this.s().u();
                    if (aVarU != null) {
                        aVarU.m();
                    }
                    bitmapD1 = z.this.s().D1();
                } else {
                    bitmapD1 = null;
                }
                int i10 = (int) ((((long) this.f28160f) * 1000) / ((long) Cfg.f5494j));
                w5.d dVarD = this.f28162h.d();
                NBSS nbss = this.f28155a;
                if (nbss != null) {
                    if (dVarD != null) {
                        if (nbss.InForward && !a6.w.b(nbss.From)) {
                            dVarD.o(nbss.From);
                        }
                    } else if (this.f28156b == null) {
                        this.f28156b = y.a(nbss);
                    }
                }
                w5.d dVar = this.f28156b;
                if (dVar != null) {
                    this.f28162h.f(dVar);
                }
                d.a aVarI = this.f28162h.i();
                if (i10 > 100 || !aVarI.d()) {
                    new v4.y(z.this.s(), 0, this.f28158d, i10, zC1 ? System.currentTimeMillis() : this.f28159e, z.this.s().T + 28147497671065500L, 0L, bitmapD1, aVarI.b(), aVarI.c(), aVarI.a()).execute(new Void[0]);
                    d0.f28046a.p(z.this.s().T);
                    this.f28158d = null;
                }
                m5.i iVar = this.f28158d;
                if (iVar != null) {
                    iVar.discard();
                }
                this.f28158d = null;
            } catch (Throwable th2) {
                m5.i iVar2 = this.f28158d;
                if (iVar2 != null) {
                    iVar2.discard();
                }
                this.f28158d = null;
                throw th2;
            }
        }

        @Override // com.benshikj.ii.ReceiveDataProcessor
        public void finish() {
            a();
            z.this.r(this.f28161g);
        }

        @Override // com.benshikj.ii.ReceiveDataProcessor
        public boolean needMute() {
            xdsopl.robot36.a aVarU;
            return (this.f28157c == null || (aVarU = z.this.s().u()) == null || !aVarU.l()) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
        @Override // com.benshikj.ii.ReceiveDataProcessor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceiveAudio(short[] r7, int r8, int r9) {
            /*
                r6 = this;
                java.lang.String r0 = "pcm"
                rd.m.e(r7, r0)
                int r0 = r6.f28160f
                int r0 = r0 + r9
                r6.f28160f = r0
                v4.l1$d r0 = r6.f28157c
                r1 = 0
                if (r0 == 0) goto L23
                u4.z r0 = u4.z.this
                v4.n1 r0 = r0.s()
                xdsopl.robot36.a r0 = r0.u()
                if (r0 == 0) goto L23
                boolean r0 = r0.l()
                r2 = 1
                if (r0 != r2) goto L23
                goto L24
            L23:
                r2 = 0
            L24:
                v4.d r0 = r6.f28162h
                r0.b(r7, r8, r9)
                if (r2 != 0) goto L6f
                b6.d r8 = r6.f28161g
                if (r8 != 0) goto L50
                u4.z r8 = u4.z.this
                v4.c0 r8 = u4.z.o(r8)
                if (r8 == 0) goto L50
                long r2 = android.os.SystemClock.elapsedRealtime()
                u4.z r8 = u4.z.this
                long r4 = u4.z.p(r8)
                long r2 = r2 - r4
                r4 = 100
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 <= 0) goto L50
                u4.z r8 = u4.z.this
                b6.d r8 = u4.z.q(r8)
                r6.f28161g = r8
            L50:
                b6.d r8 = r6.f28161g
                if (r8 == 0) goto L6f
                v4.d r0 = r6.f28162h
                int r0 = r0.e()
                if (r0 == 0) goto L6c
                v4.d r0 = r6.f28162h
                short[] r0 = r0.c()
                v4.d r2 = r6.f28162h
                int r2 = r2.e()
                r8.o(r0, r1, r2)
                goto L6f
            L6c:
                r8.o(r7, r1, r9)
            L6f:
                v4.l1$d r8 = r6.f28157c
                if (r8 == 0) goto L91
                v4.d r0 = r6.f28162h
                int r0 = r0.e()
                if (r0 == 0) goto L8e
                v4.d r7 = r6.f28162h
                short[] r7 = r7.c()
                rd.m.b(r7)
                v4.d r9 = r6.f28162h
                int r9 = r9.e()
                r8.a(r7, r1, r9)
                return
            L8e:
                r8.a(r7, r1, r9)
            L91:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u4.z.a.onReceiveAudio(short[], int, int):void");
        }

        @Override // com.benshikj.ii.ReceiveDataProcessor
        public void onReceiveData(byte[] bArr, int i10, int i11) {
            rd.m.e(bArr, "data");
            if (Cfg.h0() && this.f28158d == null) {
                m5.i iVar = new m5.i();
                this.f28158d = iVar;
                iVar.start();
                this.f28159e = System.currentTimeMillis();
                this.f28160f = 0;
            }
            m5.i iVar2 = this.f28158d;
            if (iVar2 != null) {
                iVar2.t(bArr, i10, i11);
            }
        }

        @Override // com.benshikj.ii.ReceiveDataProcessor
        public void onReceiveExtensionData(byte[] bArr) {
            rd.m.e(bArr, "data");
            int iA = p.a(bArr);
            if (iA != 2) {
                if (iA == 4 && this.f28155a == null) {
                    try {
                        this.f28155a = NBSS.unpack(bArr, 4, bArr.length - 4);
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                return;
            }
            try {
                if (this.f28156b == null) {
                    w5.d dVarA = w5.d.A(bArr, 4, bArr.length - 4);
                    rd.m.d(dVarA, "parse(...)");
                    this.f28156b = dVarA;
                    v4.c0 c0Var = z.this.f28151m;
                    if (c0Var != null && c0Var.Q.k() >= 60) {
                        v4.v vVar = v4.v.RX_DATA;
                        byte[] bArrN = ed.j.n(bArr, 4, bArr.length);
                        c0Var.a(vVar, Arrays.copyOf(bArrN, bArrN.length));
                    }
                    if (dVarA.y()) {
                        Location location = new Location("bss");
                        Double d10 = dVarA.f31256g;
                        rd.m.b(d10);
                        location.setLatitude(d10.doubleValue());
                        Double d11 = dVarA.f31257h;
                        rd.m.b(d11);
                        location.setLongitude(d11.doubleValue());
                        d5.d.q(location);
                    }
                }
            } catch (w5.g e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(II ii2, long j10, String str) {
        super(ii2, j10, str);
        rd.m.e(ii2, "ii");
        this.f28150l = new n1(this);
        this.f28154p = new Object();
    }

    public final void r(b6.d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.f28154p) {
            try {
                m5.b bVar = this.f28152n;
                if (bVar == null) {
                    return;
                }
                rd.m.b(bVar);
                bVar.P(dVar);
                m5.b bVar2 = this.f28152n;
                rd.m.b(bVar2);
                if (bVar2.isCancelled()) {
                    this.f28152n = null;
                }
                dd.d0 d0Var = dd.d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0098 A[Catch: all -> 0x0016, TryCatch #0 {, blocks: (B:54:0x0009, B:56:0x000d, B:62:0x001a, B:66:0x002b, B:70:0x0035, B:72:0x0048, B:74:0x004e, B:79:0x005f, B:81:0x0067, B:83:0x0093, B:91:0x00cb, B:94:0x00d3, B:85:0x0098, B:87:0x00a2, B:89:0x00c5, B:77:0x0055), top: B:99:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final b6.d t() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.z.t():b6.d");
    }

    @Override // com.benshikj.ii.IILink
    public void configure(NBSS nbss) {
        Location locationB;
        rd.m.e(nbss, "nbss");
        nbss.Latitude = null;
        nbss.Longitude = null;
        v4.q qVarT = this.f28150l.T();
        rd.m.d(qVarT, "getBssConfig(...)");
        if (qVarT.q()) {
            nbss.From = qVarT.w();
        }
        if (qVarT.r() && (locationB = o5.g.f23195s.b(Main.f5555g)) != null) {
            nbss.Latitude = Double.valueOf(locationB.getLatitude());
            nbss.Longitude = Double.valueOf(locationB.getLongitude());
        }
        if (a6.w.b(nbss.From)) {
            nbss.From = com.dw.ht.user.b.f6853a.d();
        }
    }

    @Override // com.benshikj.ii.IILink
    public ReceiveDataProcessor createReceiveDataProcessor(boolean z10) {
        return new a(z10);
    }

    @Override // com.benshikj.ii.IILink
    protected void destroy() {
        super.destroy();
        v4.u.w().c(this.f28150l);
    }

    @Override // com.benshikj.ii.IILink
    public boolean getAutoConnect() {
        if (!super.getAutoConnect()) {
            return false;
        }
        IIChannel iIChannelK = d0.k(this.channelID);
        return iIChannelK == null || iIChannelK.getAutoConnect();
    }

    @Override // com.benshikj.ii.IILink
    public void onDelayChanged() {
        super.onDelayChanged();
        this.f28150l.f29951r.m(l1.e.DELAY_CHANGED);
    }

    @Override // com.benshikj.ii.IILink
    protected void onLinkStatusChanged(IILink.LinkStatus linkStatus, IILink.LinkStatus linkStatus2) {
        Im.GetChannelConnectionParmResult connectionParm;
        rd.m.e(linkStatus, "from");
        rd.m.e(linkStatus2, "to");
        super.onLinkStatusChanged(linkStatus, linkStatus2);
        if (getLinkStatus().isConnected()) {
            this.f28150l.z0();
        }
        n1 n1Var = this.f28150l;
        n0.c cVarE = y.e(linkStatus2);
        IILink.Reason linkStatusChangeReason = getLinkStatusChangeReason();
        n1Var.a1(cVarE, linkStatusChangeReason != null ? y.c(linkStatusChangeReason) : null);
        if (linkStatus == IILink.LinkStatus.Connecting && linkStatus2 == IILink.LinkStatus.Connected && (connectionParm = getConnectionParm()) != null) {
            d0.f28046a.u(this.channelID, connectionParm);
        }
        if (linkStatus2 == IILink.LinkStatus.ConnectionFailed && getLinkStatusChangeReason() == IILink.Reason.Unauthenticated) {
            com.dw.ht.user.a.i(Main.f5555g).h().u(true);
        }
    }

    public final n1 s() {
        return this.f28150l;
    }

    @Override // com.benshikj.ii.IILink
    public void stopTransmission() {
        super.stopTransmission();
        this.f28150l.p1();
    }
}
