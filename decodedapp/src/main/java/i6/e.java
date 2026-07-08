package i6;

import com.facebook.stetho.server.http.HttpStatus;
import j$.util.Objects;
import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public class e implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final e f15786e = new e(false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final transient Object f15787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f15788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f15789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final boolean f15790d;

    protected e(boolean z10, Object obj) {
        this(z10, obj, -1, -1);
    }

    public static e i(boolean z10, Object obj) {
        return new e(z10, obj);
    }

    public static e p(Object obj) {
        return q(false, obj);
    }

    public static e q(boolean z10, Object obj) {
        return obj instanceof e ? (e) obj : new e(z10, obj);
    }

    public static e r() {
        return f15786e;
    }

    protected int a(StringBuilder sb2, String str) {
        sb2.append('\"');
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (!Character.isISOControl(cCharAt) || !b(sb2, cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        sb2.append('\"');
        return str.length();
    }

    protected boolean b(StringBuilder sb2, int i10) {
        if (i10 == 13 || i10 == 10) {
            return false;
        }
        sb2.append('\\');
        sb2.append('u');
        sb2.append(c.i((i10 >> 12) & 15));
        sb2.append(c.i((i10 >> 8) & 15));
        sb2.append(c.i((i10 >> 4) & 15));
        sb2.append(c.i(i10 & 15));
        return true;
    }

    protected String c(CharSequence charSequence, int[] iArr, int i10) {
        f(iArr, charSequence.length());
        int i11 = iArr[0];
        return charSequence.subSequence(i11, Math.min(iArr[1], i10) + i11).toString();
    }

    protected String d(byte[] bArr, int[] iArr, int i10) {
        f(iArr, bArr.length);
        return new String(bArr, iArr[0], Math.min(iArr[1], i10), StandardCharsets.UTF_8);
    }

    protected String e(char[] cArr, int[] iArr, int i10) {
        f(iArr, cArr.length);
        return new String(cArr, iArr[0], Math.min(iArr[1], i10));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f15788b != eVar.f15788b || this.f15789c != eVar.f15789c) {
            return false;
        }
        Object obj2 = eVar.f15787a;
        Object obj3 = this.f15787a;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return ((obj3 instanceof File) || (obj3 instanceof URL) || (obj3 instanceof URI)) ? obj3.equals(obj2) : obj3 == obj2;
    }

    protected void f(int[] iArr, int i10) {
        int i11 = iArr[0];
        if (i11 < 0) {
            i11 = 0;
        } else if (i11 >= i10) {
            i11 = i10;
        }
        iArr[0] = i11;
        int i12 = iArr[1];
        int i13 = i10 - i11;
        if (i12 < 0 || i12 > i13) {
            iArr[1] = i13;
        }
    }

    public StringBuilder g(StringBuilder sb2) {
        String strD;
        Object objL = l();
        if (objL == null) {
            sb2.append("UNKNOWN");
            return sb2;
        }
        Class<?> cls = objL instanceof Class ? (Class) objL : objL.getClass();
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (objL instanceof byte[]) {
            name = "byte[]";
        } else if (objL instanceof char[]) {
            name = "char[]";
        }
        sb2.append('(');
        sb2.append(name);
        sb2.append(')');
        if (n()) {
            int iO = o();
            int[] iArr = {k(), j()};
            String str = " chars";
            if (objL instanceof CharSequence) {
                strD = c((CharSequence) objL, iArr, iO);
            } else if (objL instanceof char[]) {
                strD = e((char[]) objL, iArr, iO);
            } else if (objL instanceof byte[]) {
                strD = d((byte[]) objL, iArr, iO);
                str = " bytes";
            } else {
                strD = null;
            }
            if (strD != null) {
                a(sb2, strD);
                if (iArr[1] > iO) {
                    sb2.append("[truncated ");
                    sb2.append(iArr[1] - iO);
                    sb2.append(str);
                    sb2.append(']');
                    return sb2;
                }
            }
        } else if (objL instanceof byte[]) {
            int iJ = j();
            if (iJ < 0) {
                iJ = ((byte[]) objL).length;
            }
            sb2.append('[');
            sb2.append(iJ);
            sb2.append(" bytes]");
        }
        return sb2;
    }

    public String h() {
        return g(new StringBuilder(HttpStatus.HTTP_OK)).toString();
    }

    public int hashCode() {
        return Objects.hashCode(this.f15787a);
    }

    public int j() {
        return this.f15789c;
    }

    public int k() {
        return this.f15788b;
    }

    public Object l() {
        return this.f15787a;
    }

    public boolean n() {
        return this.f15790d;
    }

    protected int o() {
        return HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
    }

    protected e(boolean z10, Object obj, int i10, int i11) {
        this.f15790d = z10;
        this.f15787a = obj;
        this.f15788b = i10;
        this.f15789c = i11;
    }
}
