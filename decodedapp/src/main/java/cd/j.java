package cd;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetSocketAddress;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class j extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f4606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f4607b;

    j(l lVar, o oVar) {
        super("RTCP Receiver");
        this.f4606a = oVar;
        this.f4607b = lVar;
    }

    private e a(long j10, DatagramPacket datagramPacket) {
        e eVarE = this.f4606a.f4643q.e(j10);
        if (eVarE != null) {
            return eVarE;
        }
        Enumeration enumerationF = this.f4606a.f4643q.f();
        while (enumerationF.hasMoreElements()) {
            e eVar = (e) enumerationF.nextElement();
            if (eVar.f4567f < 0 && (eVar.f4564c.getAddress().equals(datagramPacket.getAddress()) || eVar.f4563b.getAddress().equals(datagramPacket.getAddress()))) {
                System.out.println("RTCPReceiverThread: Got an unexpected packet from SSRC:" + j10 + " @" + datagramPacket.getAddress().toString() + ", WAS able to match it.");
                eVar.f4567f = j10;
                return eVar;
            }
        }
        System.out.println("RTCPReceiverThread: Got an unexpected packet from SSRC:" + j10 + " @" + datagramPacket.getAddress().toString() + ", was NOT able to match it.");
        e eVar2 = new e((InetSocketAddress) null, (InetSocketAddress) datagramPacket.getSocketAddress(), j10);
        this.f4606a.f4643q.a(2, eVar2);
        return eVar2;
    }

    private int b(DatagramPacket datagramPacket) {
        if (datagramPacket.getLength() % 4 != 0) {
            return -1;
        }
        b bVar = new b(datagramPacket.getData(), datagramPacket.getLength(), (InetSocketAddress) datagramPacket.getSocketAddress(), this.f4606a);
        this.f4606a.getClass();
        Iterator it = bVar.f4547b.iterator();
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                return 0;
            }
            p pVar = (p) it.next();
            if (pVar.f4659g == this.f4606a.f4633g) {
                System.out.println("RTCPReceiverThread() received RTCP packet with conflicting SSRC from " + datagramPacket.getSocketAddress().toString());
                this.f4606a.l();
                return -1;
            }
            if (pVar.getClass() == t.class) {
                a(((t) pVar).f4659g, datagramPacket).H = jCurrentTimeMillis;
                this.f4606a.getClass();
            } else if (pVar.getClass() == w.class) {
                w wVar = (w) pVar;
                e eVarA = a(wVar.f4659g, datagramPacket);
                eVarA.H = jCurrentTimeMillis;
                if (eVarA.f4587z >= 0.0d || eVarA.B <= -1) {
                    eVarA.A = y.f(wVar.f4692k, wVar.f4693l);
                    eVarA.B = wVar.f4692k;
                    eVarA.C = wVar.f4693l;
                    eVarA.D = wVar.f4694m;
                } else {
                    eVarA.f4587z = (y.f(wVar.f4692k, wVar.f4693l) - eVarA.A) / (wVar.f4694m - eVarA.D);
                }
                eVarA.f4586y = jCurrentTimeMillis;
                eVarA.e(wVar.f4692k, wVar.f4693l);
                this.f4606a.getClass();
            } else if (pVar.getClass() == v.class) {
                this.f4606a.getClass();
            } else if (pVar.getClass() == r.class) {
                r rVar = (r) pVar;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                e[] eVarArr = new e[rVar.f4665k.length];
                while (true) {
                    long[] jArr = rVar.f4665k;
                    if (i10 >= jArr.length) {
                        break;
                    }
                    e eVarE = this.f4606a.f4643q.e(jArr[i10]);
                    eVarArr[i10] = eVarE;
                    if (eVarE != null) {
                        eVarE.E = jCurrentTimeMillis2;
                    }
                    i10++;
                }
                this.f4606a.getClass();
            } else if (pVar.getClass() == q.class) {
                a(((q) pVar).f4659g, datagramPacket);
                this.f4606a.getClass();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (!this.f4606a.f4650x) {
            DatagramPacket datagramPacket = new DatagramPacket(new byte[1500], 1500);
            if (this.f4606a.f4631e) {
                try {
                    this.f4607b.f4613c.receive(datagramPacket);
                } catch (IOException e10) {
                    if (!this.f4606a.f4650x) {
                        e10.printStackTrace();
                    }
                }
                if (!this.f4606a.f4631e) {
                }
            } else {
                try {
                    this.f4607b.f4612b.receive(datagramPacket);
                } catch (IOException e11) {
                    if (!this.f4606a.f4650x) {
                        e11.printStackTrace();
                    }
                }
                if ((!this.f4606a.f4631e && !datagramPacket.getSocketAddress().equals(this.f4607b.f4613c)) || !datagramPacket.getSocketAddress().equals(this.f4607b.f4612b)) {
                    b(datagramPacket);
                }
            }
        }
    }
}
