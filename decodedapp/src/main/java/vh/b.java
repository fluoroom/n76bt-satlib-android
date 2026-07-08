package vh;

import vh.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    private static final e.a f30753a = new e.a();

    /* JADX INFO: renamed from: b */
    private static final int f30754b = -1234567890;

    public static final boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        rd.m.e(bArr, "a");
        rd.m.e(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c() {
        return f30754b;
    }

    public static final int d(h hVar, int i10) {
        rd.m.e(hVar, "<this>");
        return i10 == f30754b ? hVar.Q() : i10;
    }

    public static final int e(byte[] bArr, int i10) {
        rd.m.e(bArr, "<this>");
        return i10 == f30754b ? bArr.length : i10;
    }

    public static final int f(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long g(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final short h(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final String i(byte b10) {
        return rg.q.t(new char[]{wh.b.d()[(b10 >> 4) & 15], wh.b.d()[b10 & 15]});
    }

    public static final String j(int i10) {
        if (i10 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {wh.b.d()[(i10 >> 28) & 15], wh.b.d()[(i10 >> 24) & 15], wh.b.d()[(i10 >> 20) & 15], wh.b.d()[(i10 >> 16) & 15], wh.b.d()[(i10 >> 12) & 15], wh.b.d()[(i10 >> 8) & 15], wh.b.d()[(i10 >> 4) & 15], wh.b.d()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return rg.q.u(cArr, i11, 8);
    }
}
