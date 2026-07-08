package cd;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes3.dex */
public class v extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f4689k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    o f4690l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected e[] f4691m;

    protected v(boolean z10, o oVar, e[] eVarArr) {
        this.f4657e = 202;
        this.f4689k = z10;
        this.f4691m = eVarArr;
        this.f4690l = oVar;
    }

    protected void c() {
        byte[] bArr = new byte[1450];
        System.arraycopy(y.e(this.f4690l.f4633g), 0, bArr, 4, 4);
        int length = 8;
        String str = null;
        for (int i10 = 1; i10 < 9; i10++) {
            switch (i10) {
                case 1:
                    str = this.f4690l.B;
                    break;
                case 2:
                    str = this.f4690l.C;
                    break;
                case 3:
                    str = this.f4690l.D;
                    break;
                case 4:
                    str = this.f4690l.E;
                    break;
                case 5:
                    str = this.f4690l.F;
                    break;
                case 6:
                    str = this.f4690l.G;
                    break;
                case 7:
                    str = this.f4690l.H;
                    break;
                case 8:
                    str = this.f4690l.I;
                    break;
            }
            if (str != null) {
                byte[] bytes = str.getBytes();
                bArr[length] = (byte) i10;
                bArr[length + 1] = (byte) bytes.length;
                System.arraycopy(bytes, 0, bArr, length + 2, bytes.length);
                length = length + bytes.length + 2;
            }
        }
        int i11 = length % 4;
        if (i11 == 1) {
            bArr[length] = 0;
            bArr[length + 1] = 1;
            length += 3;
        } else if (i11 == 2) {
            bArr[length] = 0;
            bArr[length + 1] = 0;
            length += 2;
        } else if (i11 == 3) {
            bArr[length] = 0;
            bArr[length + 1] = 3;
            length += 5;
        }
        byte[] bArr2 = new byte[length];
        this.f4660h = bArr2;
        this.f4656d = 1;
        System.arraycopy(bArr, 0, bArr2, 0, length);
        b();
    }

    protected v(byte[] bArr, int i10, InetSocketAddress inetSocketAddress, f fVar) {
        boolean z10;
        this.f4689k = true;
        this.f4690l = null;
        this.f4691m = null;
        this.f4660h = bArr;
        if (super.a(i10) && this.f4657e == 202) {
            int i11 = i10 + 4;
            this.f4691m = new e[this.f4656d];
            boolean z11 = false;
            for (int i12 = 0; i12 < this.f4656d; i12++) {
                long jB = y.b(bArr, i11);
                e eVarE = fVar.e(jB);
                if (eVarE == null) {
                    eVarE = new e(inetSocketAddress, inetSocketAddress, jB);
                    z10 = true;
                } else {
                    z10 = false;
                }
                i11 += 4;
                while (!z11 && i11 / 4 <= this.f4658f) {
                    byte b10 = bArr[i11];
                    if (b10 == 0) {
                        i11 += 4 - (i11 % 4);
                        z11 = true;
                    } else {
                        int i13 = bArr[i11 + 1];
                        if (i13 > 0) {
                            byte[] bArr2 = new byte[i13];
                            System.arraycopy(bArr, i11 + 2, bArr2, 0, i13);
                            switch (b10) {
                                case 1:
                                    eVarE.f4568g = new String(bArr2);
                                    break;
                                case 2:
                                    eVarE.f4569h = new String(bArr2);
                                    break;
                                case 3:
                                    eVarE.f4570i = new String(bArr2);
                                    break;
                                case 4:
                                    eVarE.f4571j = new String(bArr2);
                                    break;
                                case 5:
                                    eVarE.f4572k = new String(bArr2);
                                    break;
                                case 6:
                                    eVarE.f4573l = new String(bArr2);
                                    break;
                                case 7:
                                    eVarE.f4574m = new String(bArr2);
                                    break;
                                case 8:
                                    eVarE.f4575n = new String(bArr2);
                                    break;
                            }
                        } else {
                            switch (b10) {
                                case 1:
                                    eVarE.f4568g = null;
                                    break;
                                case 2:
                                    eVarE.f4569h = null;
                                    break;
                                case 3:
                                    eVarE.f4570i = null;
                                    break;
                                case 4:
                                    eVarE.f4571j = null;
                                    break;
                                case 5:
                                    eVarE.f4572k = null;
                                    break;
                                case 6:
                                    eVarE.f4573l = null;
                                    break;
                                case 7:
                                    eVarE.f4574m = null;
                                    break;
                                case 8:
                                    eVarE.f4575n = null;
                                    break;
                            }
                        }
                        i11 = i11 + i13 + 2;
                    }
                }
                this.f4691m[i12] = eVarE;
                if (z10) {
                    fVar.a(2, eVarE);
                }
            }
            return;
        }
        this.f4653a = -202;
    }
}
