package m5;

import a6.o;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.ArrayList;
import v4.l;
import v4.l1;

/* JADX INFO: loaded from: classes.dex */
public class b extends l {
    private int H;
    private final b6.d I;
    private boolean J;
    private final ArrayList K;
    private final int L;
    private final short[] M;
    private b6.d[] N;

    public b(l1 l1Var, String str) {
        this(l1Var, str, 0);
    }

    public b6.d O() {
        return this.I;
    }

    public void P(b6.d dVar) {
        synchronized (this.K) {
            try {
                this.K.remove(dVar);
                if (this.K.isEmpty()) {
                    cancel();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b6.d Q() {
        b6.d dVar = new b6.d(this.L);
        synchronized (this.K) {
            this.K.add(dVar);
        }
        return dVar;
    }

    public void R(short[] sArr) {
        S(sArr, 0, sArr.length);
    }

    public void S(short[] sArr, int i10, int i11) {
        if (this.I.o(sArr, i10, i11) != i11) {
            s3.b.n("AudioForwardThread", "发送缓存满");
        }
    }

    public void T() {
        this.J = true;
        if (this.I.c() == 0) {
            cancel();
        }
    }

    @Override // com.dw.util.concurrent.a, java.lang.Thread
    public void interrupt() {
        if (this.I.c() != 0) {
            s3.b.b("AudioForwardThread", getName() + ":buffer is not empty:" + this.I.c());
        }
        super.interrupt();
    }

    @Override // v4.l
    protected int read(short[] sArr, int i10, int i11) {
        b6.d[] dVarArr;
        int size;
        b6.d[] dVarArr2 = this.N;
        synchronized (this.K) {
            dVarArr = (b6.d[]) this.K.toArray(dVarArr2);
            size = this.K.size();
        }
        this.N = dVarArr;
        if (this.J) {
            if (size == 0) {
                return -1;
            }
            int i12 = this.L;
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                int iC = dVarArr[i14].c();
                if (iC > i13) {
                    i13 = iC;
                }
                if (iC < i12) {
                    i12 = iC;
                }
            }
            if (i13 == 0) {
                return -1;
            }
        }
        if (size == 0) {
            return -1;
        }
        try {
            dVarArr[0].i(this.H + i11, 50L);
            if (this.H > 0) {
                if (dVarArr[0].c() < this.H) {
                    return 0;
                }
                this.H = 0;
            }
            if (size == 1) {
                return dVarArr[0].l(sArr, i10, i11);
            }
            int iMin = Math.min(i11, dVarArr[0].c());
            int i15 = i10 + iMin;
            a6.a.b(sArr, i10, i15, (short) 0);
            for (int i16 = 0; i16 < size; i16++) {
                dVarArr[i16].l(this.M, 0, iMin);
                for (int i17 = i10; i17 < i15; i17++) {
                    sArr[i17] = (short) (sArr[i17] + (this.M[i17] / size));
                }
            }
            return iMin;
        } catch (InterruptedException unused) {
            return -1;
        }
    }

    public b(l1 l1Var, String str, int i10) {
        super(l1Var, str);
        this.N = new b6.d[1];
        b6.d dVar = new b6.d(64000);
        this.I = dVar;
        int iD = dVar.d();
        this.L = iD;
        this.M = new short[iD];
        this.K = o.b(dVar);
        int i11 = (i10 * 32000) / CloseCodes.NORMAL_CLOSURE;
        this.H = i11;
        if (i11 > dVar.d() / 2) {
            throw new IllegalArgumentException("发送延迟不应大于缓存一半大小");
        }
        H(false);
    }
}
