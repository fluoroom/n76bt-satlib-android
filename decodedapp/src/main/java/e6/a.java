package e6;

import java.io.Serializable;
import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient int[] f11467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient char[] f11468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient byte[] f11469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f11470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final char f11471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f11472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f11473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final EnumC0156a f11474h;

    /* JADX INFO: renamed from: e6.a$a, reason: collision with other inner class name */
    public enum EnumC0156a {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED
    }

    public a(String str, String str2, boolean z10, char c10, int i10) {
        int[] iArr = new int[128];
        this.f11467a = iArr;
        char[] cArr = new char[64];
        this.f11468b = cArr;
        this.f11469c = new byte[64];
        this.f11470d = str;
        this.f11473g = z10;
        this.f11471e = c10;
        this.f11472f = i10;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < length; i11++) {
            char c11 = this.f11468b[i11];
            this.f11469c[i11] = (byte) c11;
            this.f11467a[c11] = i11;
        }
        if (z10) {
            this.f11467a[c10] = -2;
        }
        this.f11474h = z10 ? EnumC0156a.PADDING_REQUIRED : EnumC0156a.PADDING_FORBIDDEN;
    }

    protected void a() {
        throw new IllegalArgumentException(r());
    }

    protected void b() {
        throw new IllegalArgumentException(t());
    }

    protected void c(char c10, int i10, String str) {
        String str2;
        if (c10 <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c10) + ") as character #" + (i10 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (w(c10)) {
            str2 = "Unexpected padding character ('" + q() + "') as character #" + (i10 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c10) || Character.isISOControl(c10)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c10) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c10 + "' (code 0x" + Integer.toHexString(c10) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    public boolean d() {
        return this.f11474h != EnumC0156a.PADDING_FORBIDDEN;
    }

    public void e(String str, o6.c cVar) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt > ' ') {
                int iG = g(cCharAt);
                if (iG < 0) {
                    c(cCharAt, 0, null);
                }
                if (i11 >= length) {
                    a();
                }
                int i12 = i10 + 2;
                char cCharAt2 = str.charAt(i11);
                int iG2 = g(cCharAt2);
                if (iG2 < 0) {
                    c(cCharAt2, 1, null);
                }
                int i13 = (iG << 6) | iG2;
                if (i12 >= length) {
                    if (!s()) {
                        cVar.c(i13 >> 4);
                        return;
                    }
                    a();
                }
                int i14 = i10 + 3;
                char cCharAt3 = str.charAt(i12);
                int iG3 = g(cCharAt3);
                if (iG3 < 0) {
                    if (iG3 != -2) {
                        c(cCharAt3, 2, null);
                    }
                    if (!d()) {
                        b();
                    }
                    if (i14 >= length) {
                        a();
                    }
                    i10 += 4;
                    char cCharAt4 = str.charAt(i14);
                    if (!w(cCharAt4)) {
                        c(cCharAt4, 3, "expected padding character '" + q() + "'");
                    }
                    cVar.c(i13 >> 4);
                } else {
                    int i15 = (i13 << 6) | iG3;
                    if (i14 >= length) {
                        if (!s()) {
                            cVar.k(i15 >> 2);
                            return;
                        }
                        a();
                    }
                    i10 += 4;
                    char cCharAt5 = str.charAt(i14);
                    int iG4 = g(cCharAt5);
                    if (iG4 < 0) {
                        if (iG4 != -2) {
                            c(cCharAt5, 3, null);
                        }
                        if (!d()) {
                            b();
                        }
                        cVar.k(i15 >> 2);
                    } else {
                        cVar.e((i15 << 6) | iG4);
                    }
                }
            } else {
                i10 = i11;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == a.class) {
            a aVar = (a) obj;
            if (aVar.f11471e == this.f11471e && aVar.f11472f == this.f11472f && aVar.f11473g == this.f11473g && aVar.f11474h == this.f11474h && this.f11470d.equals(aVar.f11470d)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f(String str) {
        o6.c cVar = new o6.c();
        e(str, cVar);
        return cVar.l();
    }

    public int g(char c10) {
        if (c10 <= 127) {
            return this.f11467a[c10];
        }
        return -1;
    }

    public String h(byte[] bArr) {
        return i(bArr, false);
    }

    public int hashCode() {
        return this.f11470d.hashCode();
    }

    public String i(byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z10) {
            sb2.append('\"');
        }
        int iO = o() >> 2;
        int i10 = length - 3;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = i11 + 2;
            int i13 = ((bArr[i11 + 1] & MessagePack.Code.EXT_TIMESTAMP) | (bArr[i11] << 8)) << 8;
            i11 += 3;
            k(sb2, i13 | (bArr[i12] & MessagePack.Code.EXT_TIMESTAMP));
            iO--;
            if (iO <= 0) {
                sb2.append('\\');
                sb2.append('n');
                iO = o() >> 2;
            }
        }
        int i14 = length - i11;
        if (i14 > 0) {
            int i15 = i11 + 1;
            int i16 = bArr[i11] << 16;
            if (i14 == 2) {
                i16 |= (bArr[i15] & MessagePack.Code.EXT_TIMESTAMP) << 8;
            }
            n(sb2, i16, i14);
        }
        if (z10) {
            sb2.append('\"');
        }
        return sb2.toString();
    }

    public int j(int i10, char[] cArr, int i11) {
        char[] cArr2 = this.f11468b;
        cArr[i11] = cArr2[(i10 >> 18) & 63];
        cArr[i11 + 1] = cArr2[(i10 >> 12) & 63];
        int i12 = i11 + 3;
        cArr[i11 + 2] = cArr2[(i10 >> 6) & 63];
        int i13 = i11 + 4;
        cArr[i12] = cArr2[i10 & 63];
        return i13;
    }

    public void k(StringBuilder sb2, int i10) {
        sb2.append(this.f11468b[(i10 >> 18) & 63]);
        sb2.append(this.f11468b[(i10 >> 12) & 63]);
        sb2.append(this.f11468b[(i10 >> 6) & 63]);
        sb2.append(this.f11468b[i10 & 63]);
    }

    public int l(int i10, int i11, char[] cArr, int i12) {
        char[] cArr2 = this.f11468b;
        cArr[i12] = cArr2[(i10 >> 18) & 63];
        int i13 = i12 + 2;
        cArr[i12 + 1] = cArr2[(i10 >> 12) & 63];
        if (v()) {
            int i14 = i12 + 3;
            cArr[i13] = i11 == 2 ? this.f11468b[(i10 >> 6) & 63] : this.f11471e;
            int i15 = i12 + 4;
            cArr[i14] = this.f11471e;
            return i15;
        }
        if (i11 != 2) {
            return i13;
        }
        int i16 = i12 + 3;
        cArr[i13] = this.f11468b[(i10 >> 6) & 63];
        return i16;
    }

    public void n(StringBuilder sb2, int i10, int i11) {
        sb2.append(this.f11468b[(i10 >> 18) & 63]);
        sb2.append(this.f11468b[(i10 >> 12) & 63]);
        if (v()) {
            sb2.append(i11 == 2 ? this.f11468b[(i10 >> 6) & 63] : this.f11471e);
            sb2.append(this.f11471e);
        } else if (i11 == 2) {
            sb2.append(this.f11468b[(i10 >> 6) & 63]);
        }
    }

    public int o() {
        return this.f11472f;
    }

    public String p() {
        return this.f11470d;
    }

    public char q() {
        return this.f11471e;
    }

    public String r() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", p(), Character.valueOf(q()));
    }

    public boolean s() {
        return this.f11474h == EnumC0156a.PADDING_REQUIRED;
    }

    protected String t() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", p());
    }

    public String toString() {
        return this.f11470d;
    }

    public boolean v() {
        return this.f11473g;
    }

    public boolean w(char c10) {
        return c10 == this.f11471e;
    }

    public boolean x(int i10) {
        return i10 == this.f11471e;
    }

    public a(a aVar, String str, int i10) {
        this(aVar, str, aVar.f11473g, aVar.f11471e, i10);
    }

    public a(a aVar, String str, boolean z10, char c10, int i10) {
        this(aVar, str, z10, c10, aVar.f11474h, i10);
    }

    private a(a aVar, String str, boolean z10, char c10, EnumC0156a enumC0156a, int i10) {
        int[] iArr = new int[128];
        this.f11467a = iArr;
        char[] cArr = new char[64];
        this.f11468b = cArr;
        byte[] bArr = new byte[64];
        this.f11469c = bArr;
        this.f11470d = str;
        byte[] bArr2 = aVar.f11469c;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = aVar.f11468b;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = aVar.f11467a;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f11473g = z10;
        this.f11471e = c10;
        this.f11472f = i10;
        this.f11474h = enumC0156a;
    }
}
