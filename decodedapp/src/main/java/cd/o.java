package cd;

import com.facebook.stetho.websocket.CloseCodes;
import java.lang.reflect.Array;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    protected int A;
    protected String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    protected int J;
    protected int K;
    protected int L;
    protected int M;
    protected int N;
    protected int O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f4627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected DatagramSocket f4628b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f4631e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected long f4633g;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected l f4645s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final Lock f4648v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected final Condition f4649w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected boolean f4650x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected boolean f4651y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected boolean f4652z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected MulticastSocket f4629c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected InetAddress f4630d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f4632f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected long f4634h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f4635i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f4636j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f4637k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected Random f4638l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f4639m = 8000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f4640n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f4641o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f4642p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected f f4643q = new f(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected m f4644r = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected n f4646t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected a f4647u = null;

    public o(DatagramSocket datagramSocket, DatagramSocket datagramSocket2, String str) {
        this.f4628b = null;
        this.f4631e = false;
        this.f4645s = null;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f4648v = reentrantLock;
        this.f4649w = reentrantLock.newCondition();
        this.f4650x = false;
        this.f4651y = false;
        this.f4652z = false;
        this.A = 0;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = 0;
        this.K = -1;
        this.L = -1;
        this.M = 5000;
        this.N = CloseCodes.NORMAL_CLOSURE;
        this.O = -1;
        this.f4627a = str;
        this.f4631e = false;
        this.f4628b = datagramSocket;
        e();
        g();
        this.f4645s = new l(this, datagramSocket2);
        try {
            Thread.sleep(1L);
        } catch (InterruptedException unused) {
            System.out.println("RTPSession sleep failed");
        }
    }

    private void c() {
        this.f4638l = new Random(((System.currentTimeMillis() + Thread.currentThread().getId()) - ((long) Thread.currentThread().hashCode())) + ((long) this.B.hashCode()));
    }

    private void e() {
        this.B = System.getProperty("user.name") + "@" + (this.f4631e ? this.f4629c.getLocalAddress().getCanonicalHostName() : this.f4628b.getLocalAddress().getCanonicalHostName());
    }

    private void f() {
        if (this.f4638l == null) {
            c();
        }
        int iNextInt = this.f4638l.nextInt();
        this.f4635i = iNextInt;
        if (iNextInt < 0) {
            this.f4635i = -iNextInt;
        }
        while (true) {
            int i10 = this.f4635i;
            if (i10 <= 65535) {
                return;
            } else {
                this.f4635i = i10 / 10;
            }
        }
    }

    private void g() {
        if (this.f4638l == null) {
            c();
        }
        long jNextInt = this.f4638l.nextInt();
        this.f4633g = jNextInt;
        if (jNextInt < 0) {
            this.f4633g = jNextInt * (-1);
        }
    }

    private int h() {
        int i10 = this.f4635i + 1;
        this.f4635i = i10;
        if (i10 > 65536) {
            this.f4635i = 0;
        }
        return this.f4635i;
    }

    public int a(m mVar, i iVar, d dVar) {
        if (this.f4651y) {
            System.out.println("RTPSessionRegister(): Can't register another application!");
            return -1;
        }
        this.f4651y = true;
        f();
        this.f4644r = mVar;
        this.f4646t = new n(this);
        this.f4647u = new a(this, mVar);
        this.f4646t.start();
        this.f4647u.start();
        l lVar = this.f4645s;
        if (lVar.f4612b == null && lVar.f4613c == null) {
            return 0;
        }
        lVar.h();
        return 0;
    }

    public int b(e eVar) {
        eVar.f4562a = false;
        return this.f4643q.a(0, eVar);
    }

    public void d() {
        this.f4650x = true;
        if (this.f4631e) {
            this.f4629c.close();
        } else {
            this.f4628b.close();
        }
        this.f4648v.lock();
        try {
            this.f4649w.signalAll();
            this.f4648v.unlock();
            k kVar = this.f4645s.f4616f;
            if (kVar != null) {
                kVar.interrupt();
            }
            try {
                Thread.sleep(50L);
            } catch (Exception unused) {
            }
            this.f4647u.interrupt();
            try {
                Thread.sleep(50L);
            } catch (Exception unused2) {
            }
            l lVar = this.f4645s;
            if (lVar != null) {
                MulticastSocket multicastSocket = lVar.f4613c;
                if (multicastSocket != null) {
                    multicastSocket.close();
                }
                DatagramSocket datagramSocket = this.f4645s.f4612b;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
            }
        } catch (Throwable th2) {
            this.f4648v.unlock();
            throw th2;
        }
    }

    public long i() {
        return this.f4633g;
    }

    public void j(boolean z10) {
        this.f4640n = z10;
    }

    public int k(int i10) {
        if (i10 > 128 || i10 < 0) {
            return -1;
        }
        this.f4632f = i10;
        return i10;
    }

    protected void l() {
        System.out.println("!!!!!!! Beginning SSRC conflict resolution !!!!!!!!!");
        if (this.A >= 5) {
            System.out.println("Too many conflicts. There is probably a loop in the network.");
            d();
            return;
        }
        this.f4652z = true;
        this.f4645s.g();
        this.f4645s.a();
        g();
        this.f4645s.f4624n = true;
        this.f4652z = false;
        System.out.println("SSRC conflict resolution complete");
    }

    public long[][] m(byte[][] bArr, byte[][] bArr2, long[] jArr, boolean[] zArr, long j10, long[] jArr2) {
        long jCurrentTimeMillis = j10 < 0 ? System.currentTimeMillis() : j10;
        char c10 = 0;
        long[][] jArr3 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, bArr.length, 2);
        int i10 = 0;
        while (i10 < bArr.length) {
            byte[] bArr3 = bArr[i10];
            byte[] bArr4 = bArr2 != null ? bArr2[i10] : null;
            boolean z10 = zArr != null ? zArr[i10] : false;
            if (bArr3.length > 1500) {
                System.out.println("RTPSession.sendData() called with buffer exceeding 1500 bytes (" + bArr3.length + ")");
            }
            long[] jArr4 = jArr3[i10];
            jArr4[c10] = jCurrentTimeMillis;
            if (jArr2 == null) {
                jArr4[1] = h();
            } else {
                jArr4[1] = jArr2[i10];
            }
            boolean z11 = z10;
            x xVar = new x(jCurrentTimeMillis, this.f4633g, (int) jArr3[i10][1], this.f4632f, bArr3, bArr4);
            if (jArr != null) {
                xVar.o(jArr);
            }
            xVar.q(z11);
            byte[] bArrB = xVar.b();
            if (this.f4652z) {
                System.out.println("RTPSession.sendData() called while trying to resolve conflict.");
                return null;
            }
            if (this.f4631e) {
                try {
                    try {
                        this.f4629c.send(new DatagramPacket(bArrB, bArrB.length, this.f4630d, this.f4629c.getPort()));
                    } catch (Exception e10) {
                        System.out.println("RTPSession.sendData() multicast failed.");
                        e10.printStackTrace();
                        return null;
                    }
                } catch (Exception e11) {
                    System.out.println("RTPSession.sendData() packet creation failed.");
                    e11.printStackTrace();
                    return null;
                }
            } else {
                Iterator itG = this.f4643q.g();
                while (itG.hasNext()) {
                    try {
                        try {
                            this.f4628b.send(new DatagramPacket(bArrB, bArrB.length, ((e) itG.next()).f4563b));
                        } catch (Exception e12) {
                            System.out.println("RTPSession.sendData() unicast failed.");
                            e12.printStackTrace();
                            return null;
                        }
                    } catch (Exception e13) {
                        System.out.println("RTPSession.sendData() packet creation failed.");
                        e13.printStackTrace();
                        return null;
                    }
                }
            }
            this.f4636j++;
            this.f4637k++;
            i10++;
            c10 = 0;
        }
        return jArr3;
    }

    public boolean n(byte[] bArr) {
        if (bArr.length > 1500) {
            System.out.println("RTPSession.sendRawData() called with buffer exceeding 1500 bytes (" + bArr.length + ")");
        }
        if (this.f4631e) {
            try {
                try {
                    this.f4629c.send(new DatagramPacket(bArr, bArr.length, this.f4630d, this.f4629c.getPort()));
                    return true;
                } catch (Exception e10) {
                    System.out.println("RTPSession.sendRawData() multicast failed.");
                    e10.printStackTrace();
                    return false;
                }
            } catch (Exception e11) {
                System.out.println("RTPSession.sendRawData() packet creation failed.");
                e11.printStackTrace();
                return false;
            }
        }
        Iterator itG = this.f4643q.g();
        while (itG.hasNext()) {
            try {
                try {
                    this.f4628b.send(new DatagramPacket(bArr, bArr.length, ((e) itG.next()).f4563b));
                } catch (Exception e12) {
                    System.out.println("RTPSession.sendRawData() unicast failed.");
                    e12.printStackTrace();
                    return false;
                }
            } catch (Exception e13) {
                System.out.println("RTPSession.sendRawData() packet creation failed.");
                e13.printStackTrace();
                return false;
            }
        }
        return true;
    }
}
