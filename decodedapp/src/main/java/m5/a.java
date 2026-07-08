package m5;

import com.dw.ht.Cfg;
import com.dw.multimon.MDecoder;
import java.io.UnsupportedEncodingException;
import v4.l;
import v4.l1;

/* JADX INFO: loaded from: classes.dex */
public class a extends l {
    private final String H;
    private final w5.h I;
    private short[] J;
    private int K;
    private int L;
    private int M;

    public a(l1 l1Var, w5.h hVar) {
        super(l1Var, "Afsk12Send");
        this.L = 3200;
        this.M = 3200;
        this.I = hVar;
        this.H = null;
    }

    @Override // v4.l
    protected w5.h A() {
        return this.I;
    }

    @Override // v4.l
    protected String C() {
        return this.H;
    }

    @Override // v4.l
    protected boolean G() {
        return Cfg.u() > 0 && super.G();
    }

    @Override // v4.l
    protected boolean L() {
        return true;
    }

    @Override // v4.l, com.dw.util.concurrent.a
    protected boolean onInit() {
        if (super.onInit()) {
            try {
                String str = this.H;
                if (str != null) {
                    this.J = MDecoder.d(str.getBytes("utf-8"), Cfg.C, true);
                } else {
                    int i10 = this.I.i();
                    byte[] bArr = new byte[i10];
                    this.I.k(bArr, 0);
                    int i11 = Cfg.C;
                    this.J = MDecoder.d(bArr, i11, true);
                    if (Cfg.f5478b) {
                        int i12 = i10 - 1;
                        bArr[i12] = (byte) (bArr[i12] + 1);
                        short[] sArrD = MDecoder.d(bArr, i11, true);
                        short[] sArr = this.J;
                        short[] sArr2 = new short[sArr.length + sArrD.length];
                        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
                        System.arraycopy(sArrD, 0, sArr2, this.J.length, sArrD.length);
                        this.J = sArr2;
                        bArr[i12] = (byte) (bArr[i12] + 1);
                        short[] sArrD2 = MDecoder.d(bArr, i11, true);
                        short[] sArr3 = this.J;
                        short[] sArr4 = new short[sArr3.length + sArrD2.length];
                        System.arraycopy(sArr3, 0, sArr4, 0, sArr3.length);
                        System.arraycopy(sArrD2, 0, sArr4, this.J.length, sArrD2.length);
                        this.J = sArr4;
                    }
                }
                return true;
            } catch (UnsupportedEncodingException e10) {
                e = e10;
                e.printStackTrace();
                return false;
            } catch (w5.f e11) {
                e = e11;
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override // v4.l
    protected int read(short[] sArr, int i10, int i11) {
        int i12;
        int i13 = this.L;
        if (i13 > 0) {
            int iMin = Math.min(i11, i13);
            d4.a.c(sArr, i10, iMin, (short) 0);
            this.L -= iMin;
            return iMin;
        }
        short[] sArr2 = this.J;
        if (sArr2 != null && (i12 = this.K) < sArr2.length) {
            int length = sArr2.length - i12;
            if (length <= i11) {
                i11 = length;
            }
            d4.a.b(sArr, i10, sArr2, i12, i11);
            this.K += i11;
            return i11;
        }
        int i14 = this.M;
        if (i14 <= 0) {
            return -1;
        }
        int iMin2 = Math.min(i11, i14);
        d4.a.c(sArr, i10, iMin2, (short) 0);
        this.M -= iMin2;
        return iMin2;
    }
}
