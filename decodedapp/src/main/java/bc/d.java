package bc;

import bc.c;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f3782a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3786e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f3783b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f3784c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f3785d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3787f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Comparator f3788g = new a();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            byte b10;
            byte b11;
            int i10 = bVar.f3794e;
            int i11 = bVar2.f3794e;
            do {
                b10 = d.this.f3782a.get(i10);
                b11 = d.this.f3782a.get(i11);
                if (b10 == 0) {
                    return b10 - b11;
                }
                i10++;
                i11++;
            } while (b10 == b11);
            return b10 - b11;
        }
    }

    public d(f fVar, int i10) {
        this.f3782a = fVar;
        this.f3786e = i10;
    }

    static int B(long j10) {
        if (j10 <= c.j.a((byte) -1)) {
            return 0;
        }
        if (j10 <= c.j.c((short) -1)) {
            return 1;
        }
        return j10 <= c.j.b(-1) ? 2 : 3;
    }

    private void C(b bVar, int i10) {
        int i11 = bVar.f3790a;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                E(bVar.f3792c, i10);
                return;
            } else if (i11 != 26) {
                G(bVar.f3793d, i10);
                return;
            }
        }
        F(bVar.f3793d, i10);
    }

    private b D(int i10, byte[] bArr, int i11, boolean z10) {
        int iB = B(bArr.length);
        F(bArr.length, b(iB));
        int iE = this.f3782a.e();
        this.f3782a.h(bArr, 0, bArr.length);
        if (z10) {
            this.f3782a.i((byte) 0);
        }
        return b.f(i10, iE, i11, iB);
    }

    private void E(double d10, int i10) {
        if (i10 == 4) {
            this.f3782a.f((float) d10);
        } else if (i10 == 8) {
            this.f3782a.b(d10);
        }
    }

    private void F(long j10, int i10) {
        if (i10 == 1) {
            this.f3782a.i((byte) j10);
            return;
        }
        if (i10 == 2) {
            this.f3782a.c((short) j10);
        } else if (i10 == 4) {
            this.f3782a.g((int) j10);
        } else {
            if (i10 != 8) {
                return;
            }
            this.f3782a.j(j10);
        }
    }

    private void G(long j10, int i10) {
        F((int) (((long) this.f3782a.e()) - j10), i10);
    }

    private b H(int i10, String str) {
        return D(i10, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    private int b(int i10) {
        int i11 = 1 << i10;
        int iR = b.r(this.f3782a.e(), i11);
        while (true) {
            int i12 = iR - 1;
            if (iR == 0) {
                return i11;
            }
            this.f3782a.i((byte) 0);
            iR = i12;
        }
    }

    private b d(int i10, int i11) {
        long j10 = i11;
        int iMax = Math.max(0, B(j10));
        int i12 = i10;
        while (i12 < this.f3783b.size()) {
            int i13 = i12 + 1;
            iMax = Math.max(iMax, b.i(4, 0, ((b) this.f3783b.get(i12)).f3794e, this.f3782a.e(), i13));
            i12 = i13;
        }
        int iB = b(iMax);
        F(j10, iB);
        int iE = this.f3782a.e();
        while (i10 < this.f3783b.size()) {
            int i14 = ((b) this.f3783b.get(i10)).f3794e;
            G(((b) this.f3783b.get(i10)).f3794e, iB);
            i10++;
        }
        return new b(-1, c.p(4, 0), iMax, iE);
    }

    private b e(int i10, int i11, int i12, boolean z10, boolean z11, b bVar) {
        int i13;
        int iP;
        if (z11 && (!z10)) {
            throw new UnsupportedOperationException("Untyped fixed vector is not supported");
        }
        int i14 = i12;
        long j10 = i14;
        int iMax = Math.max(0, B(j10));
        if (bVar != null) {
            iMax = Math.max(iMax, bVar.h(this.f3782a.e(), 0));
            i13 = 3;
        } else {
            i13 = 1;
        }
        int i15 = 4;
        int iMax2 = iMax;
        for (int i16 = i11; i16 < this.f3783b.size(); i16++) {
            iMax2 = Math.max(iMax2, ((b) this.f3783b.get(i16)).h(this.f3782a.e(), i16 + i13));
            if (z10 && i16 == i11) {
                i15 = ((b) this.f3783b.get(i16)).f3790a;
                if (!c.k(i15)) {
                    throw new c.b("TypedVector does not support this element type");
                }
            }
        }
        int i17 = i11;
        int iB = b(iMax2);
        if (bVar != null) {
            G(bVar.f3793d, iB);
            F(1 << bVar.f3791b, iB);
        }
        if (!z11) {
            F(j10, iB);
        }
        int iE = this.f3782a.e();
        for (int i18 = i17; i18 < this.f3783b.size(); i18++) {
            C((b) this.f3783b.get(i18), iB);
        }
        if (!z10) {
            while (i17 < this.f3783b.size()) {
                this.f3782a.i(((b) this.f3783b.get(i17)).t(iMax2));
                i17++;
            }
        }
        if (bVar != null) {
            iP = 9;
        } else if (z10) {
            if (!z11) {
                i14 = 0;
            }
            iP = c.p(i15, i14);
        } else {
            iP = 10;
        }
        return new b(i10, iP, iMax2, iE);
    }

    private int u(String str) {
        if (str == null) {
            return -1;
        }
        int iE = this.f3782a.e();
        if ((this.f3786e & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f3782a.h(bytes, 0, bytes.length);
            this.f3782a.i((byte) 0);
            this.f3784c.put(str, Integer.valueOf(iE));
            return iE;
        }
        Integer num = (Integer) this.f3784c.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f3782a.h(bytes2, 0, bytes2.length);
        this.f3782a.i((byte) 0);
        this.f3784c.put(str, Integer.valueOf(iE));
        return iE;
    }

    public int A() {
        return this.f3783b.size();
    }

    public void c() {
        this.f3782a.clear();
        this.f3783b.clear();
        this.f3784c.clear();
        this.f3785d.clear();
        this.f3787f = false;
    }

    public int f(String str, int i10) {
        int iU = u(str);
        ArrayList arrayList = this.f3783b;
        Collections.sort(arrayList.subList(i10, arrayList.size()), this.f3788g);
        b bVarE = e(iU, i10, this.f3783b.size() - i10, false, false, d(i10, this.f3783b.size() - i10));
        while (this.f3783b.size() > i10) {
            this.f3783b.remove(r9.size() - 1);
        }
        this.f3783b.add(bVarE);
        return (int) bVarE.f3793d;
    }

    public int g(String str, int i10, boolean z10, boolean z11) {
        b bVarE = e(u(str), i10, this.f3783b.size() - i10, z10, z11, null);
        while (this.f3783b.size() > i10) {
            this.f3783b.remove(r9.size() - 1);
        }
        this.f3783b.add(bVarE);
        return (int) bVarE.f3793d;
    }

    public ByteBuffer h() {
        int iB = b(((b) this.f3783b.get(0)).h(this.f3782a.e(), 0));
        C((b) this.f3783b.get(0), iB);
        this.f3782a.i(((b) this.f3783b.get(0)).s());
        this.f3782a.i((byte) iB);
        this.f3787f = true;
        return ByteBuffer.wrap(this.f3782a.data(), 0, this.f3782a.e());
    }

    public int i(String str, byte[] bArr) {
        b bVarD = D(u(str), bArr, 25, false);
        this.f3783b.add(bVarD);
        return (int) bVarD.f3793d;
    }

    public int j(byte[] bArr) {
        return i(null, bArr);
    }

    public void k(String str, boolean z10) {
        this.f3783b.add(b.g(u(str), z10));
    }

    public void l(boolean z10) {
        k(null, z10);
    }

    public void m(double d10) {
        o(null, d10);
    }

    public void n(float f10) {
        p(null, f10);
    }

    public void o(String str, double d10) {
        this.f3783b.add(b.k(u(str), d10));
    }

    public void p(String str, float f10) {
        this.f3783b.add(b.j(u(str), f10));
    }

    public void q(int i10) {
        s(null, i10);
    }

    public void r(long j10) {
        t(null, j10);
    }

    public void s(String str, int i10) {
        t(str, i10);
    }

    public void t(String str, long j10) {
        int iU = u(str);
        if (-128 <= j10 && j10 <= 127) {
            this.f3783b.add(b.o(iU, (int) j10));
            return;
        }
        if (-32768 <= j10 && j10 <= 32767) {
            this.f3783b.add(b.l(iU, (int) j10));
        } else if (-2147483648L > j10 || j10 > 2147483647L) {
            this.f3783b.add(b.n(iU, j10));
        } else {
            this.f3783b.add(b.m(iU, (int) j10));
        }
    }

    public void v() {
        w(null);
    }

    public void w(String str) {
        this.f3783b.add(b.p(u(str)));
    }

    public int x(String str) {
        return y(null, str);
    }

    public int y(String str, String str2) {
        long j10;
        int iU = u(str);
        if ((this.f3786e & 2) != 0) {
            Integer num = (Integer) this.f3785d.get(str2);
            if (num != null) {
                this.f3783b.add(b.f(iU, num.intValue(), 5, B(str2.length())));
                return num.intValue();
            }
            b bVarH = H(iU, str2);
            this.f3785d.put(str2, Integer.valueOf((int) bVarH.f3793d));
            this.f3783b.add(bVarH);
            j10 = bVarH.f3793d;
        } else {
            b bVarH2 = H(iU, str2);
            this.f3783b.add(bVarH2);
            j10 = bVarH2.f3793d;
        }
        return (int) j10;
    }

    public int z() {
        return this.f3783b.size();
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f3790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f3791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final double f3792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f3793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3794e;

        b(int i10, int i11, int i12, long j10) {
            this.f3794e = i10;
            this.f3790a = i11;
            this.f3791b = i12;
            this.f3793d = j10;
            this.f3792c = Double.MIN_VALUE;
        }

        static b f(int i10, int i11, int i12, int i13) {
            return new b(i10, i12, i13, i11);
        }

        static b g(int i10, boolean z10) {
            return new b(i10, 26, 0, z10 ? 1L : 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h(int i10, int i11) {
            return i(this.f3790a, this.f3791b, this.f3793d, i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int i(int i10, int i11, long j10, int i12, int i13) {
            if (c.i(i10)) {
                return i11;
            }
            for (int i14 = 1; i14 <= 32; i14 *= 2) {
                int iB = d.B(((long) ((r(i12, i14) + i12) + (i13 * i14))) - j10);
                if ((1 << iB) == i14) {
                    return iB;
                }
            }
            return 3;
        }

        static b j(int i10, float f10) {
            return new b(i10, 3, 2, f10);
        }

        static b k(int i10, double d10) {
            return new b(i10, 3, 3, d10);
        }

        static b l(int i10, int i11) {
            return new b(i10, 1, 1, i11);
        }

        static b m(int i10, int i11) {
            return new b(i10, 1, 2, i11);
        }

        static b n(int i10, long j10) {
            return new b(i10, 1, 3, j10);
        }

        static b o(int i10, int i11) {
            return new b(i10, 1, 0, i11);
        }

        static b p(int i10) {
            return new b(i10, 0, 0, 0L);
        }

        private static byte q(int i10, int i11) {
            return (byte) (i10 | (i11 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int r(int i10, int i11) {
            return ((~i10) + 1) & (i11 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte s() {
            return t(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte t(int i10) {
            return q(u(i10), this.f3790a);
        }

        private int u(int i10) {
            return c.i(this.f3790a) ? Math.max(this.f3791b, i10) : this.f3791b;
        }

        b(int i10, int i11, int i12, double d10) {
            this.f3794e = i10;
            this.f3790a = i11;
            this.f3791b = i12;
            this.f3792c = d10;
            this.f3793d = Long.MIN_VALUE;
        }
    }
}
