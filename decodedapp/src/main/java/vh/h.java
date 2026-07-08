package vh;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public class h implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30792d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f30793e = new h(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f30794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f30795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient String f30796c;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public static /* synthetic */ h g(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = b.c();
            }
            return aVar.f(bArr, i10, i11);
        }

        public final h a(String str) {
            rd.m.e(str, "<this>");
            byte[] bArrA = vh.a.a(str);
            if (bArrA != null) {
                return new h(bArrA);
            }
            return null;
        }

        public final h b(String str) {
            rd.m.e(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((wh.c.b(str.charAt(i11)) << 4) + wh.c.b(str.charAt(i11 + 1)));
            }
            return new h(bArr);
        }

        public final h c(String str, Charset charset) {
            rd.m.e(str, "<this>");
            rd.m.e(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            rd.m.d(bytes, "getBytes(...)");
            return new h(bytes);
        }

        public final h d(String str) {
            rd.m.e(str, "<this>");
            h hVar = new h(r0.a(str));
            hVar.N(str);
            return hVar;
        }

        public final h e(byte... bArr) {
            rd.m.e(bArr, "data");
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            rd.m.d(bArrCopyOf, "copyOf(...)");
            return new h(bArrCopyOf);
        }

        public final h f(byte[] bArr, int i10, int i11) {
            rd.m.e(bArr, "<this>");
            int iE = b.e(bArr, i11);
            b.b(bArr.length, i10, iE);
            return new h(ed.j.n(bArr, i10, iE + i10));
        }

        private a() {
        }
    }

    public h(byte[] bArr) {
        rd.m.e(bArr, "data");
        this.f30794a = bArr;
    }

    public static /* synthetic */ int C(h hVar, h hVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = b.c();
        }
        return hVar.x(hVar2, i10);
    }

    public static final h G(byte... bArr) {
        return f30792d.e(bArr);
    }

    public static /* synthetic */ h W(h hVar, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = b.c();
        }
        return hVar.T(i10, i11);
    }

    public static final h f(String str) {
        return f30792d.d(str);
    }

    public static /* synthetic */ int s(h hVar, h hVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return hVar.q(hVar2, i10);
    }

    public int A(byte[] bArr, int i10) {
        rd.m.e(bArr, "other");
        for (int iMin = Math.min(b.d(this, i10), i().length - bArr.length); -1 < iMin; iMin--) {
            if (b.a(i(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public final h D() {
        return e("MD5");
    }

    public boolean H(int i10, h hVar, int i11, int i12) {
        rd.m.e(hVar, "other");
        return hVar.K(i11, i(), i10, i12);
    }

    public boolean K(int i10, byte[] bArr, int i11, int i12) {
        rd.m.e(bArr, "other");
        return i10 >= 0 && i10 <= i().length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && b.a(i(), i10, bArr, i11, i12);
    }

    public final void L(int i10) {
        this.f30795b = i10;
    }

    public final void N(String str) {
        this.f30796c = str;
    }

    public final h O() {
        return e("SHA-256");
    }

    public final int Q() {
        return k();
    }

    public final boolean R(h hVar) {
        rd.m.e(hVar, "prefix");
        return H(0, hVar, 0, hVar.Q());
    }

    public String S(Charset charset) {
        rd.m.e(charset, "charset");
        return new String(this.f30794a, charset);
    }

    public h T(int i10, int i11) {
        int iD = b.d(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iD <= i().length) {
            if (iD - i10 >= 0) {
                return (i10 == 0 && iD == i().length) ? this : new h(ed.j.n(i(), i10, iD));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + i().length + ')').toString());
    }

    public h X() {
        for (int i10 = 0; i10 < i().length; i10++) {
            byte b10 = i()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrI = i();
                byte[] bArrCopyOf = Arrays.copyOf(bArrI, bArrI.length);
                rd.m.d(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new h(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] Y() {
        byte[] bArrI = i();
        byte[] bArrCopyOf = Arrays.copyOf(bArrI, bArrI.length);
        rd.m.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public String Z() {
        String strL = l();
        if (strL != null) {
            return strL;
        }
        String strC = r0.c(v());
        N(strC);
        return strC;
    }

    public String a() {
        return vh.a.c(i(), null, 1, null);
    }

    public void a0(e eVar, int i10, int i11) {
        rd.m.e(eVar, "buffer");
        wh.b.c(this, eVar, i10, i11);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        rd.m.e(hVar, "other");
        int iQ = Q();
        int iQ2 = hVar.Q();
        int iMin = Math.min(iQ, iQ2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iH = h(i10) & MessagePack.Code.EXT_TIMESTAMP;
            int iH2 = hVar.h(i10) & MessagePack.Code.EXT_TIMESTAMP;
            if (iH != iH2) {
                return iH < iH2 ? -1 : 1;
            }
        }
        if (iQ == iQ2) {
            return 0;
        }
        return iQ < iQ2 ? -1 : 1;
    }

    public h e(String str) throws NoSuchAlgorithmException {
        rd.m.e(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f30794a, 0, Q());
        byte[] bArrDigest = messageDigest.digest();
        rd.m.b(bArrDigest);
        return new h(bArrDigest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.Q() == i().length && hVar.K(0, i(), 0, i().length)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(h hVar) {
        rd.m.e(hVar, "suffix");
        return H(Q() - hVar.Q(), hVar, 0, hVar.Q());
    }

    public final byte h(int i10) {
        return w(i10);
    }

    public int hashCode() {
        int iJ = j();
        if (iJ != 0) {
            return iJ;
        }
        int iHashCode = Arrays.hashCode(i());
        L(iHashCode);
        return iHashCode;
    }

    public final byte[] i() {
        return this.f30794a;
    }

    public final int j() {
        return this.f30795b;
    }

    public int k() {
        return i().length;
    }

    public final String l() {
        return this.f30796c;
    }

    public String n() {
        char[] cArr = new char[i().length * 2];
        int i10 = 0;
        for (byte b10 : i()) {
            int i11 = i10 + 1;
            cArr[i10] = wh.b.d()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = wh.b.d()[b10 & 15];
        }
        return rg.q.t(cArr);
    }

    public final int q(h hVar, int i10) {
        rd.m.e(hVar, "other");
        return r(hVar.v(), i10);
    }

    public int r(byte[] bArr, int i10) {
        rd.m.e(bArr, "other");
        int length = i().length - bArr.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!b.a(i(), iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public String toString() {
        if (i().length == 0) {
            return "[size=0]";
        }
        int iB = wh.b.b(i(), 64);
        if (iB != -1) {
            String strZ = Z();
            String strSubstring = strZ.substring(0, iB);
            rd.m.d(strSubstring, "substring(...)");
            String strF = rg.q.F(rg.q.F(rg.q.F(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iB >= strZ.length()) {
                return "[text=" + strF + ']';
            }
            return "[size=" + i().length + " text=" + strF + "…]";
        }
        if (i().length <= 64) {
            return "[hex=" + n() + ']';
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(i().length);
        sb2.append(" hex=");
        int iD = b.d(this, 64);
        if (iD <= i().length) {
            if (iD < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb2.append((iD == i().length ? this : new h(ed.j.n(i(), 0, iD))).n());
            sb2.append("…]");
            return sb2.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + i().length + ')').toString());
    }

    public byte[] v() {
        return i();
    }

    public byte w(int i10) {
        return i()[i10];
    }

    public final int x(h hVar, int i10) {
        rd.m.e(hVar, "other");
        return A(hVar.v(), i10);
    }
}
