package m6;

import e6.e;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;
import o6.g;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b f21766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final AtomicReference f21767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f21768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f21769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f21770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String[] f21771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected a[] f21772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f21773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f21774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f21775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f21776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f21777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected BitSet f21778m;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f21780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21781c;

        public a(String str, a aVar) {
            this.f21779a = str;
            this.f21780b = aVar;
            this.f21781c = aVar != null ? 1 + aVar.f21781c : 1;
        }

        public String a(char[] cArr, int i10, int i11) {
            if (this.f21779a.length() != i11) {
                return null;
            }
            int i12 = 0;
            while (this.f21779a.charAt(i12) == cArr[i10 + i12]) {
                i12++;
                if (i12 >= i11) {
                    return this.f21779a;
                }
            }
            return null;
        }
    }

    private b(int i10) {
        this.f21766a = null;
        this.f21768c = i10;
        this.f21770e = true;
        this.f21769d = -1;
        this.f21777l = false;
        this.f21776k = 0;
        this.f21767b = new AtomicReference(C0287b.a(64));
    }

    private String a(char[] cArr, int i10, int i11, int i12, int i13) throws g6.b {
        if (this.f21777l) {
            i();
            this.f21777l = false;
        } else if (this.f21773h >= this.f21774i) {
            q();
            i13 = d(h(cArr, i10, i11));
        }
        String str = new String(cArr, i10, i11);
        if (e.a.INTERN_FIELD_NAMES.e(this.f21769d)) {
            str = g.f23241b.a(str);
        }
        this.f21773h++;
        String[] strArr = this.f21771f;
        if (strArr[i13] == null) {
            strArr[i13] = str;
            return str;
        }
        int i14 = i13 >> 1;
        a aVar = new a(str, this.f21772g[i14]);
        int i15 = aVar.f21781c;
        if (i15 > 150) {
            c(i14, aVar, i13);
            return str;
        }
        this.f21772g[i14] = aVar;
        this.f21776k = Math.max(i15, this.f21776k);
        return str;
    }

    private String b(char[] cArr, int i10, int i11, a aVar) {
        while (aVar != null) {
            String strA = aVar.a(cArr, i10, i11);
            if (strA != null) {
                return strA;
            }
            aVar = aVar.f21780b;
        }
        return null;
    }

    private void c(int i10, a aVar, int i11) throws g6.b {
        BitSet bitSet = this.f21778m;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this.f21778m = bitSet2;
            bitSet2.set(i10);
        } else if (bitSet.get(i10)) {
            if (e.a.FAIL_ON_SYMBOL_HASH_OVERFLOW.e(this.f21769d)) {
                e(150);
            }
            this.f21770e = false;
        } else {
            this.f21778m.set(i10);
        }
        this.f21771f[i11] = aVar.f21779a;
        this.f21772g[i10] = null;
        this.f21773h -= aVar.f21781c;
        this.f21776k = -1;
    }

    private static int f(int i10) {
        return i10 - (i10 >> 2);
    }

    private void i() {
        String[] strArr = this.f21771f;
        this.f21771f = (String[]) Arrays.copyOf(strArr, strArr.length);
        a[] aVarArr = this.f21772g;
        this.f21772g = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
    }

    public static b j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return k((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    protected static b k(int i10) {
        return new b(i10);
    }

    private void p(C0287b c0287b) {
        int i10 = c0287b.f21782a;
        C0287b c0287b2 = (C0287b) this.f21767b.get();
        if (i10 == c0287b2.f21782a) {
            return;
        }
        if (i10 > 12000) {
            c0287b = C0287b.a(64);
        }
        androidx.lifecycle.b.a(this.f21767b, c0287b2, c0287b);
    }

    private void q() {
        String[] strArr = this.f21771f;
        int length = strArr.length;
        int i10 = length + length;
        if (i10 > 65536) {
            this.f21773h = 0;
            this.f21770e = false;
            this.f21771f = new String[64];
            this.f21772g = new a[32];
            this.f21775j = 63;
            this.f21777l = false;
            return;
        }
        a[] aVarArr = this.f21772g;
        this.f21771f = new String[i10];
        this.f21772g = new a[i10 >> 1];
        this.f21775j = i10 - 1;
        this.f21774i = f(i10);
        int i11 = 0;
        int iMax = 0;
        for (String str : strArr) {
            if (str != null) {
                i11++;
                int iD = d(g(str));
                String[] strArr2 = this.f21771f;
                if (strArr2[iD] == null) {
                    strArr2[iD] = str;
                } else {
                    int i12 = iD >> 1;
                    a aVar = new a(str, this.f21772g[i12]);
                    this.f21772g[i12] = aVar;
                    iMax = Math.max(iMax, aVar.f21781c);
                }
            }
        }
        int i13 = length >> 1;
        for (int i14 = 0; i14 < i13; i14++) {
            for (a aVar2 = aVarArr[i14]; aVar2 != null; aVar2 = aVar2.f21780b) {
                i11++;
                String str2 = aVar2.f21779a;
                int iD2 = d(g(str2));
                String[] strArr3 = this.f21771f;
                if (strArr3[iD2] == null) {
                    strArr3[iD2] = str2;
                } else {
                    int i15 = iD2 >> 1;
                    a aVar3 = new a(str2, this.f21772g[i15]);
                    this.f21772g[i15] = aVar3;
                    iMax = Math.max(iMax, aVar3.f21781c);
                }
            }
        }
        this.f21776k = iMax;
        this.f21778m = null;
        if (i11 != this.f21773h) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this.f21773h), Integer.valueOf(i11)));
        }
    }

    public int d(int i10) {
        int i11 = i10 + (i10 >>> 15);
        int i12 = i11 ^ (i11 << 7);
        return (i12 + (i12 >>> 3)) & this.f21775j;
    }

    protected void e(int i10) throws g6.b {
        throw new g6.b("Longest collision chain in symbol table (of size " + this.f21773h + ") now exceeds maximum, " + i10 + " -- suspect a DoS attack based on hash collisions");
    }

    public int g(String str) {
        int length = str.length();
        int iCharAt = this.f21768c;
        for (int i10 = 0; i10 < length; i10++) {
            iCharAt = (iCharAt * 33) + str.charAt(i10);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    public int h(char[] cArr, int i10, int i11) {
        int i12 = this.f21768c;
        int i13 = i11 + i10;
        while (i10 < i13) {
            i12 = (i12 * 33) + cArr[i10];
            i10++;
        }
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public String l(char[] cArr, int i10, int i11, int i12) {
        if (i11 < 1) {
            return "";
        }
        if (!this.f21770e) {
            return new String(cArr, i10, i11);
        }
        int iD = d(i12);
        String str = this.f21771f[iD];
        if (str != null) {
            if (str.length() == i11) {
                int i13 = 0;
                while (str.charAt(i13) == cArr[i10 + i13]) {
                    i13++;
                    if (i13 == i11) {
                        return str;
                    }
                }
            }
            a aVar = this.f21772g[iD >> 1];
            if (aVar != null) {
                String strA = aVar.a(cArr, i10, i11);
                if (strA != null) {
                    return strA;
                }
                String strB = b(cArr, i10, i11, aVar.f21780b);
                if (strB != null) {
                    return strB;
                }
            }
        }
        return a(cArr, i10, i11, i12, iD);
    }

    public int m() {
        return this.f21768c;
    }

    public b n(int i10) {
        return new b(this, i10, this.f21768c, (C0287b) this.f21767b.get());
    }

    public boolean o() {
        return !this.f21777l;
    }

    public void r() {
        b bVar;
        if (o() && (bVar = this.f21766a) != null && this.f21770e) {
            bVar.p(new C0287b(this));
            this.f21777l = true;
        }
    }

    /* JADX INFO: renamed from: m6.b$b, reason: collision with other inner class name */
    private static final class C0287b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f21782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f21783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String[] f21784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final a[] f21785d;

        public C0287b(int i10, int i11, String[] strArr, a[] aVarArr) {
            this.f21782a = i10;
            this.f21783b = i11;
            this.f21784c = strArr;
            this.f21785d = aVarArr;
        }

        public static C0287b a(int i10) {
            return new C0287b(0, 0, new String[i10], new a[i10 >> 1]);
        }

        public C0287b(b bVar) {
            this.f21782a = bVar.f21773h;
            this.f21783b = bVar.f21776k;
            this.f21784c = bVar.f21771f;
            this.f21785d = bVar.f21772g;
        }
    }

    private b(b bVar, int i10, int i11, C0287b c0287b) {
        this.f21766a = bVar;
        this.f21768c = i11;
        this.f21767b = null;
        this.f21769d = i10;
        this.f21770e = e.a.CANONICALIZE_FIELD_NAMES.e(i10);
        String[] strArr = c0287b.f21784c;
        this.f21771f = strArr;
        this.f21772g = c0287b.f21785d;
        this.f21773h = c0287b.f21782a;
        this.f21776k = c0287b.f21783b;
        int length = strArr.length;
        this.f21774i = f(length);
        this.f21775j = length - 1;
        this.f21777l = true;
    }
}
