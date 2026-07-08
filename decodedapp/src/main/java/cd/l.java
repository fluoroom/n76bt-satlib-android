package cd;

import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.PrintStream;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a */
    protected o f4611a;

    /* JADX INFO: renamed from: b */
    protected DatagramSocket f4612b;

    /* JADX INFO: renamed from: c */
    protected MulticastSocket f4613c = null;

    /* JADX INFO: renamed from: d */
    protected InetAddress f4614d = null;

    /* JADX INFO: renamed from: e */
    protected j f4615e = null;

    /* JADX INFO: renamed from: f */
    protected k f4616f = null;

    /* JADX INFO: renamed from: g */
    protected long f4617g = System.currentTimeMillis();

    /* JADX INFO: renamed from: h */
    protected int f4618h = -1;

    /* JADX INFO: renamed from: i */
    protected int f4619i = HttpStatus.HTTP_OK;

    /* JADX INFO: renamed from: j */
    protected int f4620j = 1;

    /* JADX INFO: renamed from: k */
    protected boolean f4621k = false;

    /* JADX INFO: renamed from: l */
    protected Hashtable f4622l = null;

    /* JADX INFO: renamed from: m */
    protected Hashtable f4623m = null;

    /* JADX INFO: renamed from: n */
    protected boolean f4624n = true;

    /* JADX INFO: renamed from: o */
    protected long f4625o = -1;

    protected l(o oVar, DatagramSocket datagramSocket) {
        this.f4611a = null;
        this.f4612b = null;
        this.f4612b = datagramSocket;
        this.f4611a = oVar;
    }

    protected void a() {
        if (this.f4611a.J != 0) {
            System.out.println("RTCPSession.calculateDelay() unknown .mode");
        } else {
            b();
        }
    }

    protected void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        o oVar = this.f4611a;
        if (oVar.f4639m == 0 || this.f4624n || oVar.f4643q.f4590c.size() <= 4) {
            int iNextInt = this.f4611a.f4638l.nextInt(CloseCodes.NORMAL_CLOSURE);
            if (this.f4624n) {
                this.f4618h = iNextInt + 2500;
                this.f4624n = false;
            } else {
                this.f4618h = iNextInt + 5000;
            }
        } else {
            int iNextInt2 = this.f4611a.f4638l.nextInt(10000);
            double d10 = (((double) (iNextInt2 - 5000)) + 1000.0d) / 1000.0d;
            Enumeration enumerationF = this.f4611a.f4643q.f();
            while (enumerationF.hasMoreElements()) {
                if (((e) enumerationF.nextElement()).G > this.f4617g) {
                    this.f4620j++;
                }
            }
            o oVar2 = this.f4611a;
            int i10 = oVar2.O;
            double d11 = i10 > -1 ? i10 : ((double) oVar2.f4639m) * 0.05d;
            if (this.f4620j * 2 > oVar2.f4643q.f4590c.size()) {
                o oVar3 = this.f4611a;
                if (oVar3.f4634h > this.f4617g) {
                    this.f4618h = (int) Math.round(((((double) this.f4619i) * ((double) this.f4620j)) / (d11 * 0.25d)) * d10);
                } else {
                    this.f4618h = (int) Math.round(((((double) this.f4619i) * ((double) oVar3.f4643q.f4590c.size())) / (d11 * 0.75d)) * d10);
                }
            } else {
                this.f4618h = ((int) Math.round(((((double) this.f4619i) * ((double) this.f4611a.f4643q.f4590c.size())) / d11) * 1000.0d)) * (iNextInt2 - 4000);
            }
        }
        if (this.f4618h < 1000) {
            int iNextInt3 = this.f4611a.f4638l.nextInt(CloseCodes.NORMAL_CLOSURE);
            PrintStream printStream = System.out;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("RTCPSession.calculateDelay() nextDelay was too short (");
            sb2.append(this.f4618h);
            sb2.append("ms), setting to ");
            int i11 = iNextInt3 + 1500;
            this.f4618h = i11;
            sb2.append(i11);
            printStream.println(sb2.toString());
        }
        this.f4617g = jCurrentTimeMillis;
    }

    protected boolean c() {
        int size = this.f4611a.f4643q.f4590c.size();
        o oVar = this.f4611a;
        return size <= oVar.L || oVar.f4643q.f4589b.size() <= this.f4611a.L;
    }

    protected boolean d() {
        int size = this.f4611a.f4643q.f4590c.size();
        o oVar = this.f4611a;
        return size <= oVar.K || oVar.f4643q.f4589b.size() <= this.f4611a.K;
    }

    protected synchronized q[] e(long j10) {
        Hashtable hashtable = this.f4623m;
        if (hashtable == null) {
            return null;
        }
        LinkedList linkedList = (LinkedList) hashtable.get(Long.valueOf(j10));
        if (linkedList != null && !linkedList.isEmpty()) {
            q[] qVarArr = new q[linkedList.size()];
            ListIterator listIterator = linkedList.listIterator();
            int i10 = 0;
            while (listIterator.hasNext()) {
                qVarArr[i10] = (q) listIterator.next();
                i10++;
            }
            return qVarArr;
        }
        return null;
    }

    protected synchronized p[] f(long j10) {
        try {
            Hashtable hashtable = this.f4622l;
            if (hashtable == null) {
                return null;
            }
            LinkedList linkedList = (LinkedList) hashtable.get(Long.valueOf(j10));
            if (linkedList == null) {
                return null;
            }
            ListIterator listIterator = linkedList.listIterator();
            if (listIterator.hasNext()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j11 = jCurrentTimeMillis - ((long) this.f4611a.N);
                long j12 = jCurrentTimeMillis - 2000;
                int i10 = 0;
                while (listIterator.hasNext()) {
                    p pVar = (p) listIterator.next();
                    if (pVar.f4662j) {
                        if (pVar.f4661i < j12) {
                            listIterator.remove();
                        }
                    } else if (pVar.f4661i < j11) {
                        listIterator.remove();
                    } else {
                        i10++;
                    }
                }
                if (i10 != 0) {
                    ListIterator listIterator2 = linkedList.listIterator();
                    p[] pVarArr = new p[i10];
                    int i11 = i10;
                    while (i11 > 0) {
                        p pVar2 = (p) listIterator2.next();
                        if (!pVar2.f4662j) {
                            pVarArr[i10 - i11] = pVar2;
                            i11--;
                        }
                    }
                    return pVarArr;
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected void g() {
        this.f4616f.d();
    }

    protected void h() {
        a();
        this.f4615e = new j(this, this.f4611a);
        this.f4616f = new k(this, this.f4611a);
        this.f4615e.start();
        this.f4616f.start();
    }

    protected synchronized void i(int i10) {
        this.f4619i = (int) (((((double) this.f4619i) * 15.0d) + ((double) i10)) / 16.0d);
    }
}
