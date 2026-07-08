package g7;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class p0 extends h0 implements e7.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final char[] f13615d = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Boolean f13616c;

    public p0() {
        this(null);
    }

    private static void A(int i10, char[] cArr, int i11) {
        char[] cArr2 = f13615d;
        cArr[i11] = cArr2[(i10 >> 12) & 15];
        cArr[i11 + 1] = cArr2[(i10 >> 8) & 15];
        cArr[i11 + 2] = cArr2[(i10 >> 4) & 15];
        cArr[i11 + 3] = cArr2[i10 & 15];
    }

    private static final byte[] C(UUID uuid) {
        byte[] bArr = new byte[16];
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        x((int) (mostSignificantBits >> 32), bArr, 0);
        x((int) mostSignificantBits, bArr, 4);
        x((int) (leastSignificantBits >> 32), bArr, 8);
        x((int) leastSignificantBits, bArr, 12);
        return bArr;
    }

    private static final void x(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >> 24);
        bArr[i11 + 1] = (byte) (i10 >> 16);
        bArr[i11 + 2] = (byte) (i10 >> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    private static void z(int i10, char[] cArr, int i11) {
        A(i10 >> 16, cArr, i11);
        A(i10, cArr, i11 + 4);
    }

    protected boolean D(e6.g gVar) {
        Boolean bool = this.f13616c;
        return bool != null ? bool.booleanValue() : !(gVar instanceof i7.b0) && gVar.l();
    }

    @Override // p6.p
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public boolean d(p6.d0 d0Var, UUID uuid) {
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void f(UUID uuid, e6.g gVar, p6.d0 d0Var) {
        if (D(gVar)) {
            gVar.w0(C(uuid));
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits = uuid.getMostSignificantBits();
        z((int) (mostSignificantBits >> 32), cArr, 0);
        cArr[8] = '-';
        int i10 = (int) mostSignificantBits;
        A(i10 >>> 16, cArr, 9);
        cArr[13] = '-';
        A(i10, cArr, 14);
        cArr[18] = '-';
        long leastSignificantBits = uuid.getLeastSignificantBits();
        A((int) (leastSignificantBits >>> 48), cArr, 19);
        cArr[23] = '-';
        A((int) (leastSignificantBits >>> 32), cArr, 24);
        z((int) leastSignificantBits, cArr, 28);
        gVar.e1(cArr, 0, 36);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    @Override // e7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p6.p a(p6.d0 r2, p6.d r3) {
        /*
            r1 = this;
            java.lang.Class r0 = r1.c()
            d6.k$d r2 = r1.q(r2, r3, r0)
            if (r2 == 0) goto L1c
            d6.k$c r2 = r2.i()
            d6.k$c r3 = d6.k.c.BINARY
            if (r2 != r3) goto L15
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L1d
        L15:
            d6.k$c r3 = d6.k.c.STRING
            if (r2 != r3) goto L1c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L1d
        L1c:
            r2 = 0
        L1d:
            java.lang.Boolean r3 = r1.f13616c
            boolean r3 = j$.util.Objects.equals(r2, r3)
            if (r3 != 0) goto L2b
            g7.p0 r3 = new g7.p0
            r3.<init>(r2)
            return r3
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.p0.a(p6.d0, p6.d):p6.p");
    }

    protected p0(Boolean bool) {
        super(UUID.class);
        this.f13616c = bool;
    }
}
