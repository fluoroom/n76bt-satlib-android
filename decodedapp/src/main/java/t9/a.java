package t9;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import org.msgpack.core.MessagePack;
import r9.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f27640a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f27641b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f27642c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f27643d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f27644e = new b("base16()", "0123456789ABCDEF");

    /* JADX INFO: renamed from: t9.a$a, reason: collision with other inner class name */
    static final class C0387a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char[] f27646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f27647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f27648d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f27649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f27650f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f27651g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean[] f27652h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f27653i;

        C0387a(String str, char[] cArr) {
            this(str, cArr, b(cArr), false);
        }

        private static byte[] b(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 < cArr.length; i10++) {
                char c10 = cArr[i10];
                boolean z10 = true;
                l.f(c10 < 128, "Non-ASCII character: %s", c10);
                if (bArr[c10] != -1) {
                    z10 = false;
                }
                l.f(z10, "Duplicate character: %s", c10);
                bArr[c10] = (byte) i10;
            }
            return bArr;
        }

        int c(char c10) throws d {
            if (c10 > 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c10));
            }
            byte b10 = this.f27651g[c10];
            if (b10 != -1) {
                return b10;
            }
            if (c10 <= ' ' || c10 == 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c10));
            }
            throw new d("Unrecognized character: " + c10);
        }

        char d(int i10) {
            return this.f27646b[i10];
        }

        boolean e(int i10) {
            return this.f27652h[i10 % this.f27649e];
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0387a) {
                C0387a c0387a = (C0387a) obj;
                if (this.f27653i == c0387a.f27653i && Arrays.equals(this.f27646b, c0387a.f27646b)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f(char c10) {
            byte[] bArr = this.f27651g;
            return c10 < bArr.length && bArr[c10] != -1;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f27646b) + (this.f27653i ? 1231 : 1237);
        }

        public String toString() {
            return this.f27645a;
        }

        private C0387a(String str, char[] cArr, byte[] bArr, boolean z10) {
            this.f27645a = (String) l.n(str);
            this.f27646b = (char[]) l.n(cArr);
            try {
                int iD = u9.a.d(cArr.length, RoundingMode.UNNECESSARY);
                this.f27648d = iD;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iD);
                int i10 = 1 << (3 - iNumberOfTrailingZeros);
                this.f27649e = i10;
                this.f27650f = iD >> iNumberOfTrailingZeros;
                this.f27647c = cArr.length - 1;
                this.f27651g = bArr;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 < this.f27650f; i11++) {
                    zArr[u9.a.a(i11 * 8, this.f27648d, RoundingMode.CEILING)] = true;
                }
                this.f27652h = zArr;
                this.f27653i = z10;
            } catch (ArithmeticException e10) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
            }
        }
    }

    private static final class b extends e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final char[] f27654h;

        b(String str, String str2) {
            this(new C0387a(str, str2.toCharArray()));
        }

        @Override // t9.a.e, t9.a
        int d(byte[] bArr, CharSequence charSequence) throws d {
            l.n(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new d("Invalid input length " + charSequence.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.f27655f.c(charSequence.charAt(i10)) << 4) | this.f27655f.c(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }

        @Override // t9.a.e, t9.a
        void g(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            l.n(appendable);
            l.s(i10, i10 + i11, bArr.length);
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = bArr[i10 + i12] & MessagePack.Code.EXT_TIMESTAMP;
                appendable.append(this.f27654h[i13]);
                appendable.append(this.f27654h[i13 | 256]);
            }
        }

        @Override // t9.a.e
        a n(C0387a c0387a, Character ch2) {
            return new b(c0387a);
        }

        private b(C0387a c0387a) {
            super(c0387a, null);
            this.f27654h = new char[WXMediaMessage.TITLE_LENGTH_LIMIT];
            l.d(c0387a.f27646b.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                this.f27654h[i10] = c0387a.d(i10 >>> 4);
                this.f27654h[i10 | 256] = c0387a.d(i10 & 15);
            }
        }
    }

    private static final class c extends e {
        c(String str, String str2, Character ch2) {
            this(new C0387a(str, str2.toCharArray()), ch2);
        }

        @Override // t9.a.e, t9.a
        int d(byte[] bArr, CharSequence charSequence) throws d {
            l.n(bArr);
            CharSequence charSequenceL = l(charSequence);
            if (!this.f27655f.e(charSequenceL.length())) {
                throw new d("Invalid input length " + charSequenceL.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceL.length()) {
                int i12 = i10 + 2;
                int iC = (this.f27655f.c(charSequenceL.charAt(i10)) << 18) | (this.f27655f.c(charSequenceL.charAt(i10 + 1)) << 12);
                int i13 = i11 + 1;
                bArr[i11] = (byte) (iC >>> 16);
                if (i12 < charSequenceL.length()) {
                    int i14 = i10 + 3;
                    int iC2 = iC | (this.f27655f.c(charSequenceL.charAt(i12)) << 6);
                    int i15 = i11 + 2;
                    bArr[i13] = (byte) ((iC2 >>> 8) & 255);
                    if (i14 < charSequenceL.length()) {
                        i10 += 4;
                        i11 += 3;
                        bArr[i15] = (byte) ((iC2 | this.f27655f.c(charSequenceL.charAt(i14))) & 255);
                    } else {
                        i11 = i15;
                        i10 = i14;
                    }
                } else {
                    i11 = i13;
                    i10 = i12;
                }
            }
            return i11;
        }

        @Override // t9.a.e, t9.a
        void g(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            l.n(appendable);
            int i12 = i10 + i11;
            l.s(i10, i12, bArr.length);
            while (i11 >= 3) {
                int i13 = i10 + 2;
                int i14 = ((bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((bArr[i10] & MessagePack.Code.EXT_TIMESTAMP) << 16);
                i10 += 3;
                int i15 = i14 | (bArr[i13] & MessagePack.Code.EXT_TIMESTAMP);
                appendable.append(this.f27655f.d(i15 >>> 18));
                appendable.append(this.f27655f.d((i15 >>> 12) & 63));
                appendable.append(this.f27655f.d((i15 >>> 6) & 63));
                appendable.append(this.f27655f.d(i15 & 63));
                i11 -= 3;
            }
            if (i10 < i12) {
                m(appendable, bArr, i10, i12 - i10);
            }
        }

        @Override // t9.a.e
        a n(C0387a c0387a, Character ch2) {
            return new c(c0387a, ch2);
        }

        private c(C0387a c0387a, Character ch2) {
            super(c0387a, ch2);
            l.d(c0387a.f27646b.length == 64);
        }
    }

    public static final class d extends IOException {
        d(String str) {
            super(str);
        }
    }

    private static class e extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final C0387a f27655f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Character f27656g;

        e(String str, String str2, Character ch2) {
            this(new C0387a(str, str2.toCharArray()), ch2);
        }

        @Override // t9.a
        int d(byte[] bArr, CharSequence charSequence) throws d {
            C0387a c0387a;
            l.n(bArr);
            CharSequence charSequenceL = l(charSequence);
            if (!this.f27655f.e(charSequenceL.length())) {
                throw new d("Invalid input length " + charSequenceL.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceL.length()) {
                long jC = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    c0387a = this.f27655f;
                    if (i12 >= c0387a.f27649e) {
                        break;
                    }
                    jC <<= c0387a.f27648d;
                    if (i10 + i12 < charSequenceL.length()) {
                        jC |= (long) this.f27655f.c(charSequenceL.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = c0387a.f27650f;
                int i15 = (i14 * 8) - (i13 * c0387a.f27648d);
                int i16 = (i14 - 1) * 8;
                while (i16 >= i15) {
                    bArr[i11] = (byte) ((jC >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.f27655f.f27649e;
            }
            return i11;
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f27655f.equals(eVar.f27655f) && Objects.equals(this.f27656g, eVar.f27656g)) {
                    return true;
                }
            }
            return false;
        }

        @Override // t9.a
        void g(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            l.n(appendable);
            l.s(i10, i10 + i11, bArr.length);
            int i12 = 0;
            while (i12 < i11) {
                m(appendable, bArr, i10 + i12, Math.min(this.f27655f.f27650f, i11 - i12));
                i12 += this.f27655f.f27650f;
            }
        }

        public int hashCode() {
            return this.f27655f.hashCode() ^ Objects.hashCode(this.f27656g);
        }

        @Override // t9.a
        int i(int i10) {
            return (int) (((((long) this.f27655f.f27648d) * ((long) i10)) + 7) / 8);
        }

        @Override // t9.a
        int j(int i10) {
            C0387a c0387a = this.f27655f;
            return c0387a.f27649e * u9.a.a(i10, c0387a.f27650f, RoundingMode.CEILING);
        }

        @Override // t9.a
        public a k() {
            return this.f27656g == null ? this : n(this.f27655f, null);
        }

        @Override // t9.a
        CharSequence l(CharSequence charSequence) {
            l.n(charSequence);
            Character ch2 = this.f27656g;
            if (ch2 == null) {
                return charSequence;
            }
            char cCharValue = ch2.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        void m(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            l.n(appendable);
            l.s(i10, i10 + i11, bArr.length);
            int i12 = 0;
            l.d(i11 <= this.f27655f.f27650f);
            long j10 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                j10 = (j10 | ((long) (bArr[i10 + i13] & MessagePack.Code.EXT_TIMESTAMP))) << 8;
            }
            int i14 = ((i11 + 1) * 8) - this.f27655f.f27648d;
            while (i12 < i11 * 8) {
                C0387a c0387a = this.f27655f;
                appendable.append(c0387a.d(((int) (j10 >>> (i14 - i12))) & c0387a.f27647c));
                i12 += this.f27655f.f27648d;
            }
            if (this.f27656g != null) {
                while (i12 < this.f27655f.f27650f * 8) {
                    appendable.append(this.f27656g.charValue());
                    i12 += this.f27655f.f27648d;
                }
            }
        }

        a n(C0387a c0387a, Character ch2) {
            return new e(c0387a, ch2);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f27655f);
            if (8 % this.f27655f.f27648d != 0) {
                if (this.f27656g == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f27656g);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        e(C0387a c0387a, Character ch2) {
            this.f27655f = (C0387a) l.n(c0387a);
            l.j(ch2 == null || !c0387a.f(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.f27656g = ch2;
        }
    }

    a() {
    }

    public static a a() {
        return f27640a;
    }

    private static byte[] h(byte[] bArr, int i10) {
        if (i10 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    public final byte[] b(CharSequence charSequence) {
        try {
            return c(charSequence);
        } catch (d e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    final byte[] c(CharSequence charSequence) {
        CharSequence charSequenceL = l(charSequence);
        byte[] bArr = new byte[i(charSequenceL.length())];
        return h(bArr, d(bArr, charSequenceL));
    }

    abstract int d(byte[] bArr, CharSequence charSequence);

    public String e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public final String f(byte[] bArr, int i10, int i11) {
        l.s(i10, i10 + i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(j(i11));
        try {
            g(sb2, bArr, i10, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    abstract void g(Appendable appendable, byte[] bArr, int i10, int i11);

    abstract int i(int i10);

    abstract int j(int i10);

    public abstract a k();

    abstract CharSequence l(CharSequence charSequence);
}
