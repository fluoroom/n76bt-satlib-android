package o6;

import androidx.appcompat.widget.ActivityChooserView;
import com.facebook.stetho.server.http.HttpStatus;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final char[] f23255l = new char[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f23256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private char[] f23257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f23260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char[] f23263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f23265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private char[] f23266k;

    public p(a aVar) {
        this.f23256a = aVar;
    }

    private void A(int i10) {
        int i11 = this.f23259d;
        this.f23259d = 0;
        char[] cArr = this.f23257b;
        this.f23257b = null;
        int i12 = this.f23258c;
        this.f23258c = -1;
        int i13 = i10 + i11;
        char[] cArr2 = this.f23263h;
        if (cArr2 == null || i13 > cArr2.length) {
            this.f23263h = e(i13);
        }
        if (i11 > 0) {
            System.arraycopy(cArr, i12, this.f23263h, 0, i11);
        }
        this.f23262g = 0;
        this.f23264i = i11;
    }

    private void B(int i10) {
        int i11 = this.f23262g + this.f23264i + i10;
        if (i11 < 0) {
            i11 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        C(i11);
    }

    private char[] e(int i10) {
        a aVar = this.f23256a;
        return aVar != null ? aVar.d(2, i10) : new char[Math.max(i10, HttpStatus.HTTP_INTERNAL_SERVER_ERROR)];
    }

    private char[] f(int i10) {
        return new char[i10];
    }

    private void g() {
        this.f23261f = false;
        this.f23260e.clear();
        this.f23262g = 0;
        this.f23264i = 0;
    }

    private void m() {
        if (this.f23260e == null) {
            this.f23260e = new ArrayList();
        }
        char[] cArr = this.f23263h;
        this.f23261f = true;
        this.f23260e.add(cArr);
        int length = this.f23262g + cArr.length;
        this.f23262g = length;
        if (length < 0) {
            a(length - cArr.length, cArr.length);
        }
        this.f23264i = 0;
        int length2 = cArr.length;
        int i10 = length2 + (length2 >> 1);
        if (i10 < 500) {
            i10 = HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
        } else if (i10 > 65536) {
            i10 = WXMediaMessage.THUMB_LENGTH_LIMIT;
        }
        this.f23263h = f(i10);
    }

    public static p o(char[] cArr) {
        return new p(null, cArr);
    }

    private char[] x() {
        int i10;
        String str = this.f23265j;
        if (str != null) {
            return str.toCharArray();
        }
        if (this.f23258c >= 0) {
            int i11 = this.f23259d;
            if (i11 < 1) {
                return f23255l;
            }
            C(i11);
            int i12 = this.f23258c;
            return i12 == 0 ? Arrays.copyOf(this.f23257b, i11) : Arrays.copyOfRange(this.f23257b, i12, i11 + i12);
        }
        int iZ = z();
        if (iZ < 1) {
            if (iZ < 0) {
                a(this.f23262g, this.f23264i);
            }
            return f23255l;
        }
        C(iZ);
        char[] cArrF = f(iZ);
        ArrayList arrayList = this.f23260e;
        if (arrayList != null) {
            int size = arrayList.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                char[] cArr = (char[]) this.f23260e.get(i13);
                int length = cArr.length;
                System.arraycopy(cArr, 0, cArrF, i10, length);
                i10 += length;
            }
        } else {
            i10 = 0;
        }
        System.arraycopy(this.f23263h, 0, cArrF, i10, this.f23264i);
        return cArrF;
    }

    protected void a(int i10, int i11) {
        throw new IllegalStateException("TextBuffer overrun: size reached (" + (((long) i10) + ((long) i11)) + ") exceeds maximum of " + ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public void b(char c10) {
        if (this.f23258c >= 0) {
            A(16);
        }
        this.f23265j = null;
        this.f23266k = null;
        char[] cArr = this.f23263h;
        if (this.f23264i >= cArr.length) {
            B(1);
            m();
            cArr = this.f23263h;
        }
        int i10 = this.f23264i;
        this.f23264i = i10 + 1;
        cArr[i10] = c10;
    }

    public void c(String str, int i10, int i11) {
        if (this.f23258c >= 0) {
            A(i11);
        }
        this.f23265j = null;
        this.f23266k = null;
        char[] cArr = this.f23263h;
        int length = cArr.length;
        int i12 = this.f23264i;
        int i13 = length - i12;
        if (i13 >= i11) {
            str.getChars(i10, i10 + i11, cArr, i12);
            this.f23264i += i11;
            return;
        }
        B(i11);
        if (i13 > 0) {
            int i14 = i10 + i13;
            str.getChars(i10, i14, cArr, this.f23264i);
            i11 -= i13;
            i10 = i14;
        }
        while (true) {
            m();
            int iMin = Math.min(this.f23263h.length, i11);
            int i15 = i10 + iMin;
            str.getChars(i10, i15, this.f23263h, 0);
            this.f23264i += iMin;
            i11 -= iMin;
            if (i11 <= 0) {
                return;
            } else {
                i10 = i15;
            }
        }
    }

    public void d(char[] cArr, int i10, int i11) {
        if (this.f23258c >= 0) {
            A(i11);
        }
        this.f23265j = null;
        this.f23266k = null;
        char[] cArr2 = this.f23263h;
        int length = cArr2.length;
        int i12 = this.f23264i;
        int i13 = length - i12;
        if (i13 >= i11) {
            System.arraycopy(cArr, i10, cArr2, i12, i11);
            this.f23264i += i11;
            return;
        }
        B(i11);
        if (i13 > 0) {
            System.arraycopy(cArr, i10, cArr2, this.f23264i, i13);
            i10 += i13;
            i11 -= i13;
        }
        do {
            m();
            int iMin = Math.min(this.f23263h.length, i11);
            System.arraycopy(cArr, i10, this.f23263h, 0, iMin);
            this.f23264i += iMin;
            i10 += iMin;
            i11 -= iMin;
        } while (i11 > 0);
    }

    public char[] h() {
        char[] cArr = this.f23266k;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrX = x();
        this.f23266k = cArrX;
        return cArrX;
    }

    public int i(boolean z10) {
        char[] cArr;
        int i10 = this.f23258c;
        return (i10 < 0 || (cArr = this.f23257b) == null) ? z10 ? -i6.i.l(this.f23263h, 1, this.f23264i - 1) : i6.i.l(this.f23263h, 0, this.f23264i) : z10 ? -i6.i.l(cArr, i10 + 1, this.f23259d - 1) : i6.i.l(cArr, i10, this.f23259d);
    }

    public long j(boolean z10) {
        char[] cArr;
        int i10 = this.f23258c;
        return (i10 < 0 || (cArr = this.f23257b) == null) ? z10 ? -i6.i.n(this.f23263h, 1, this.f23264i - 1) : i6.i.n(this.f23263h, 0, this.f23264i) : z10 ? -i6.i.n(cArr, i10 + 1, this.f23259d - 1) : i6.i.n(cArr, i10, this.f23259d);
    }

    public String k() {
        if (this.f23265j == null) {
            char[] cArr = this.f23266k;
            if (cArr != null) {
                this.f23265j = new String(cArr);
            } else if (this.f23258c >= 0) {
                int i10 = this.f23259d;
                if (i10 < 1) {
                    this.f23265j = "";
                    return "";
                }
                C(i10);
                this.f23265j = new String(this.f23257b, this.f23258c, this.f23259d);
            } else {
                int i11 = this.f23262g;
                int i12 = this.f23264i;
                if (i11 != 0) {
                    int i13 = i11 + i12;
                    if (i13 < 0) {
                        a(i11, i12);
                    }
                    C(i13);
                    StringBuilder sb2 = new StringBuilder(i13);
                    ArrayList arrayList = this.f23260e;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            char[] cArr2 = (char[]) this.f23260e.get(i14);
                            sb2.append(cArr2, 0, cArr2.length);
                        }
                    }
                    sb2.append(this.f23263h, 0, this.f23264i);
                    this.f23265j = sb2.toString();
                } else if (i12 == 0) {
                    this.f23265j = "";
                } else {
                    C(i12);
                    this.f23265j = new String(this.f23263h, 0, i12);
                }
            }
        }
        return this.f23265j;
    }

    public char[] l() {
        this.f23258c = -1;
        this.f23264i = 0;
        this.f23259d = 0;
        this.f23257b = null;
        this.f23265j = null;
        this.f23266k = null;
        if (this.f23261f) {
            g();
        }
        char[] cArr = this.f23263h;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrE = e(0);
        this.f23263h = cArrE;
        return cArrE;
    }

    public char[] n() {
        if (this.f23260e == null) {
            this.f23260e = new ArrayList();
        }
        this.f23261f = true;
        this.f23260e.add(this.f23263h);
        int length = this.f23263h.length;
        int i10 = this.f23262g + length;
        this.f23262g = i10;
        if (i10 < 0) {
            a(i10 - length, length);
        }
        this.f23264i = 0;
        C(this.f23262g);
        int i11 = length + (length >> 1);
        if (i11 < 500) {
            i11 = HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
        } else if (i11 > 65536) {
            i11 = WXMediaMessage.THUMB_LENGTH_LIMIT;
        }
        char[] cArrF = f(i11);
        this.f23263h = cArrF;
        return cArrF;
    }

    public char[] p() {
        if (this.f23258c >= 0) {
            A(1);
        } else {
            char[] cArr = this.f23263h;
            if (cArr == null) {
                this.f23263h = e(0);
            } else if (this.f23264i >= cArr.length) {
                m();
            }
        }
        return this.f23263h;
    }

    public int q() {
        return this.f23264i;
    }

    public char[] r() {
        if (this.f23258c >= 0) {
            return this.f23257b;
        }
        char[] cArr = this.f23266k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f23265j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f23266k = charArray;
            return charArray;
        }
        if (this.f23261f) {
            return h();
        }
        char[] cArr2 = this.f23263h;
        return cArr2 == null ? f23255l : cArr2;
    }

    public int s() {
        int i10 = this.f23258c;
        if (i10 >= 0) {
            return i10;
        }
        return 0;
    }

    public void t() {
        char[] cArr;
        this.f23258c = -1;
        this.f23264i = 0;
        this.f23259d = 0;
        this.f23257b = null;
        this.f23266k = null;
        if (this.f23261f) {
            g();
        }
        a aVar = this.f23256a;
        if (aVar == null || (cArr = this.f23263h) == null) {
            return;
        }
        this.f23263h = null;
        aVar.j(2, cArr);
    }

    public String toString() {
        try {
            return k();
        } catch (IOException unused) {
            return "TextBuffer: Exception when reading contents";
        }
    }

    public void u(char[] cArr, int i10, int i11) {
        this.f23257b = null;
        this.f23258c = -1;
        this.f23259d = 0;
        this.f23265j = null;
        this.f23266k = null;
        if (this.f23261f) {
            g();
        } else if (this.f23263h == null) {
            this.f23263h = e(i11);
        }
        this.f23262g = 0;
        this.f23264i = 0;
        d(cArr, i10, i11);
    }

    public void v(char[] cArr, int i10, int i11) {
        this.f23265j = null;
        this.f23266k = null;
        this.f23257b = cArr;
        this.f23258c = i10;
        this.f23259d = i11;
        if (this.f23261f) {
            g();
        }
    }

    public void w(String str) {
        this.f23257b = null;
        this.f23258c = -1;
        this.f23259d = 0;
        C(str.length());
        this.f23265j = str;
        this.f23266k = null;
        if (this.f23261f) {
            g();
        }
        this.f23264i = 0;
    }

    public void y(int i10) {
        this.f23264i = i10;
    }

    public int z() {
        if (this.f23258c >= 0) {
            return this.f23259d;
        }
        char[] cArr = this.f23266k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f23265j;
        return str != null ? str.length() : this.f23262g + this.f23264i;
    }

    protected p(a aVar, char[] cArr) {
        this(aVar);
        this.f23263h = cArr;
        this.f23264i = cArr.length;
        this.f23258c = -1;
    }

    protected void C(int i10) {
    }
}
