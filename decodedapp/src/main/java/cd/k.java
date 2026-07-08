package cd;

import java.net.DatagramPacket;
import java.net.InetSocketAddress;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class k extends Thread {

    /* JADX INFO: renamed from: a */
    private o f4608a;

    /* JADX INFO: renamed from: b */
    private l f4609b;

    /* JADX INFO: renamed from: c */
    private boolean f4610c;

    protected k(l lVar, o oVar) {
        super("RTCP Sender");
        this.f4610c = false;
        this.f4608a = oVar;
        this.f4609b = lVar;
    }

    protected int a(b bVar) {
        byte[] bArrB = bVar.b();
        try {
            DatagramPacket datagramPacket = new DatagramPacket(bArrB, bArrB.length, this.f4608a.f4630d, this.f4609b.f4613c.getPort());
            try {
                this.f4609b.f4613c.send(datagramPacket);
                this.f4608a.getClass();
                return datagramPacket.getLength();
            } catch (Exception e10) {
                System.out.println("RCTPSenderThread.MCSendCompRtcpPkt() multicast failed.");
                e10.printStackTrace();
                return -1;
            }
        } catch (Exception e11) {
            System.out.println("RCTPSenderThread.MCSendCompRtcpPkt() packet creation failed.");
            e11.printStackTrace();
            return -1;
        }
    }

    protected b b(e eVar, boolean z10) {
        boolean z11;
        char c10;
        long j10;
        p[] pVarArrF;
        q[] qVarArrE;
        p[] pVarArrF2;
        long j11 = eVar.K;
        long j12 = eVar.J;
        if (j11 > j12) {
            eVar.K = j12;
            eVar.J = System.currentTimeMillis();
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = this.f4608a.f4636j > 0 && z10;
        b bVar = new b();
        if (z12) {
            c10 = 0;
            j10 = 0;
            bVar.a(new w(this.f4608a.f4633g, r5.f4636j, r5.f4637k, null));
            long j13 = eVar.f4567f;
            if (j13 > 0 && (pVarArrF2 = this.f4609b.f(j13)) != null) {
                for (p pVar : pVarArrF2) {
                    bVar.a(pVar);
                }
            }
        } else {
            c10 = 0;
            j10 = 0;
        }
        if (z11 || !z12) {
            e[] eVarArr = new e[1];
            eVarArr[c10] = eVar;
            if (eVar.f4579r < 1) {
                eVarArr = null;
            }
            bVar.a(new t(eVarArr, this.f4608a.f4633g));
            if (!z12) {
                long j14 = eVar.f4567f;
                if (j14 > j10 && (pVarArrF = this.f4609b.f(j14)) != null) {
                    for (p pVar2 : pVarArrF) {
                        bVar.a(pVar2);
                    }
                }
            }
        }
        if (z10) {
            long j15 = eVar.f4567f;
            if (j15 > j10 && (qVarArrE = this.f4609b.e(j15)) != null) {
                for (q qVar : qVarArrE) {
                    bVar.a(qVar);
                }
            }
        }
        bVar.a(new v(true, this.f4608a, null));
        return bVar;
    }

    protected void c(long j10) {
        e eVarE = this.f4608a.f4643q.e(j10);
        if (eVarE != null && this.f4609b.d()) {
            b bVarB = b(eVarE, false);
            int iA = this.f4608a.f4631e ? a(bVarB) : e(bVarB, eVarE.f4564c);
            if (iA > 0) {
                this.f4609b.i(iA);
            }
        } else if (eVarE != null) {
            l lVar = this.f4609b;
            if (lVar.f4621k && lVar.c()) {
                this.f4609b.f4621k = false;
                b bVarB2 = b(eVarE, true);
                int iA2 = this.f4608a.f4631e ? a(bVarB2) : e(bVarB2, eVarE.f4564c);
                if (iA2 > 0) {
                    this.f4609b.i(iA2);
                }
                this.f4609b.a();
            }
        }
        l lVar2 = this.f4609b;
        long j11 = lVar2.f4618h;
        long jCurrentTimeMillis = System.currentTimeMillis();
        l lVar3 = this.f4609b;
        lVar2.f4618h = (int) (j11 - (jCurrentTimeMillis - lVar3.f4617g));
        if (lVar3.f4618h < 0) {
            lVar3.f4618h = 0;
        }
    }

    protected void d() {
        b bVar = new b();
        bVar.a(new w(this.f4608a.f4633g, r2.f4636j, r2.f4637k, null));
        o oVar = this.f4608a;
        bVar.a(new r(new long[]{oVar.f4633g}, oVar.f4652z ? "SSRC collision".getBytes() : "jlibrtp says bye bye!".getBytes()));
        o oVar2 = this.f4608a;
        if (oVar2.f4631e) {
            a(bVar);
            return;
        }
        Iterator itG = oVar2.f4643q.g();
        while (itG.hasNext()) {
            InetSocketAddress inetSocketAddress = ((e) itG.next()).f4564c;
            if (inetSocketAddress != null) {
                e(bVar, inetSocketAddress);
            }
        }
    }

    protected int e(b bVar, InetSocketAddress inetSocketAddress) {
        byte[] bArrB = bVar.b();
        try {
            DatagramPacket datagramPacket = new DatagramPacket(bArrB, bArrB.length, inetSocketAddress);
            try {
                this.f4609b.f4612b.send(datagramPacket);
                this.f4608a.getClass();
                return datagramPacket.getLength();
            } catch (Exception e10) {
                System.out.println("RTCPSenderThread.SendCompRtcpPkt() unicast failed.");
                e10.printStackTrace();
                return -1;
            }
        } catch (Exception e11) {
            System.out.println("RCTPSenderThread.SendCompRtcpPkt() packet creation failed.");
            e11.printStackTrace();
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0024 A[SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.k.run():void");
    }
}
