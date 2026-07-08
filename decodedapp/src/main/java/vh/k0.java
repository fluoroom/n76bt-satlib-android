package vh;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient byte[][] f30833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int[] f30834g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(byte[][] bArr, int[] iArr) {
        super(h.f30793e.i());
        rd.m.e(bArr, "segments");
        rd.m.e(iArr, "directory");
        this.f30833f = bArr;
        this.f30834g = iArr;
    }

    private final h d0() {
        return new h(Y());
    }

    @Override // vh.h
    public int A(byte[] bArr, int i10) {
        rd.m.e(bArr, "other");
        return d0().A(bArr, i10);
    }

    @Override // vh.h
    public boolean H(int i10, h hVar, int i11, int i12) {
        rd.m.e(hVar, "other");
        if (i10 < 0 || i10 > Q() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = wh.f.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : b0()[iB - 1];
            int i15 = b0()[iB] - i14;
            int i16 = b0()[c0().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!hVar.K(i11, c0()[iB], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // vh.h
    public boolean K(int i10, byte[] bArr, int i11, int i12) {
        rd.m.e(bArr, "other");
        if (i10 < 0 || i10 > Q() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = wh.f.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : b0()[iB - 1];
            int i15 = b0()[iB] - i14;
            int i16 = b0()[c0().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!b.a(c0()[iB], i16 + (i10 - i14), bArr, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // vh.h
    public String S(Charset charset) {
        rd.m.e(charset, "charset");
        return d0().S(charset);
    }

    @Override // vh.h
    public h T(int i10, int i11) {
        int iD = b.d(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (iD > Q()) {
            throw new IllegalArgumentException(("endIndex=" + iD + " > length(" + Q() + ')').toString());
        }
        int i12 = iD - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iD + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iD == Q()) {
            return this;
        }
        if (i10 == iD) {
            return h.f30793e;
        }
        int iB = wh.f.b(this, i10);
        int iB2 = wh.f.b(this, iD - 1);
        byte[][] bArr = (byte[][]) ed.j.p(c0(), iB, iB2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iB <= iB2) {
            int i13 = iB;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(b0()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = b0()[c0().length + i13];
                if (i13 == iB2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iB != 0 ? b0()[iB - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new k0(bArr, iArr);
    }

    @Override // vh.h
    public h X() {
        return d0().X();
    }

    @Override // vh.h
    public byte[] Y() {
        byte[] bArr = new byte[Q()];
        int length = c0().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = b0()[length + i10];
            int i14 = b0()[i10];
            int i15 = i14 - i11;
            ed.j.g(c0()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // vh.h
    public String a() {
        return d0().a();
    }

    @Override // vh.h
    public void a0(e eVar, int i10, int i11) {
        rd.m.e(eVar, "buffer");
        int i12 = i10 + i11;
        int iB = wh.f.b(this, i10);
        while (i10 < i12) {
            int i13 = iB == 0 ? 0 : b0()[iB - 1];
            int i14 = b0()[iB] - i13;
            int i15 = b0()[c0().length + iB];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            i0 i0Var = new i0(c0()[iB], i16, i16 + iMin, true, false);
            i0 i0Var2 = eVar.f30774a;
            if (i0Var2 == null) {
                i0Var.f30815g = i0Var;
                i0Var.f30814f = i0Var;
                eVar.f30774a = i0Var;
            } else {
                rd.m.b(i0Var2);
                i0 i0Var3 = i0Var2.f30815g;
                rd.m.b(i0Var3);
                i0Var3.c(i0Var);
            }
            i10 += iMin;
            iB++;
        }
        eVar.y0(eVar.size() + ((long) i11));
    }

    public final int[] b0() {
        return this.f30834g;
    }

    public final byte[][] c0() {
        return this.f30833f;
    }

    @Override // vh.h
    public h e(String str) throws NoSuchAlgorithmException {
        rd.m.e(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = c0().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = b0()[length + i10];
            int i13 = b0()[i10];
            messageDigest.update(c0()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        rd.m.b(bArrDigest);
        return new h(bArrDigest);
    }

    @Override // vh.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.Q() == Q() && H(0, hVar, 0, Q())) {
                return true;
            }
        }
        return false;
    }

    @Override // vh.h
    public int hashCode() {
        int iJ = j();
        if (iJ != 0) {
            return iJ;
        }
        int length = c0().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i10 < length) {
            int i13 = b0()[length + i10];
            int i14 = b0()[i10];
            byte[] bArr = c0()[i10];
            int i15 = (i14 - i11) + i13;
            while (i13 < i15) {
                i12 = (i12 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i11 = i14;
        }
        L(i12);
        return i12;
    }

    @Override // vh.h
    public int k() {
        return b0()[c0().length - 1];
    }

    @Override // vh.h
    public String n() {
        return d0().n();
    }

    @Override // vh.h
    public int r(byte[] bArr, int i10) {
        rd.m.e(bArr, "other");
        return d0().r(bArr, i10);
    }

    @Override // vh.h
    public String toString() {
        return d0().toString();
    }

    @Override // vh.h
    public byte[] v() {
        return Y();
    }

    @Override // vh.h
    public byte w(int i10) {
        b.b(b0()[c0().length - 1], i10, 1L);
        int iB = wh.f.b(this, i10);
        return c0()[iB][(i10 - (iB == 0 ? 0 : b0()[iB - 1])) + b0()[c0().length + iB]];
    }
}
