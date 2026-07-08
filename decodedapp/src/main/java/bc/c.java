package bc;

import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bc.e f3763a = new bc.a(new byte[]{0}, 1);

    public static class a extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final a f3764e = new a(c.f3763a, 1, 1);

        a(bc.e eVar, int i10, int i11) {
            super(eVar, i10, i11);
        }

        public static a c() {
            return f3764e;
        }

        @Override // bc.c.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append('\"');
            sb2.append(this.f3769a.d(this.f3770b, b()));
            sb2.append('\"');
            return sb2;
        }

        @Override // bc.c.h
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public byte[] d() {
            int iB = b();
            byte[] bArr = new byte[iB];
            for (int i10 = 0; i10 < iB; i10++) {
                bArr[i10] = this.f3769a.get(this.f3770b + i10);
            }
            return bArr;
        }

        @Override // bc.c.f
        public String toString() {
            return this.f3769a.d(this.f3770b, b());
        }
    }

    public static class b extends RuntimeException {
        b(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: bc.c$c, reason: collision with other inner class name */
    public static class C0059c extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final C0059c f3765d = new C0059c(c.f3763a, 0, 0);

        C0059c(bc.e eVar, int i10, int i11) {
            super(eVar, i10, i11);
        }

        public static C0059c c() {
            return f3765d;
        }

        @Override // bc.c.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append(toString());
            return sb2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0059c)) {
                return false;
            }
            C0059c c0059c = (C0059c) obj;
            return c0059c.f3770b == this.f3770b && c0059c.f3771c == this.f3771c;
        }

        public int hashCode() {
            return this.f3770b ^ this.f3771c;
        }

        @Override // bc.c.f
        public String toString() {
            int i10 = this.f3770b;
            while (this.f3769a.get(i10) != 0) {
                i10++;
            }
            int i11 = this.f3770b;
            return this.f3769a.d(i11, i10 - i11);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f3766a;

        d(i iVar) {
            this.f3766a = iVar;
        }

        public C0059c a(int i10) {
            if (i10 >= b()) {
                return C0059c.f3765d;
            }
            i iVar = this.f3766a;
            int i11 = iVar.f3770b + (i10 * iVar.f3771c);
            i iVar2 = this.f3766a;
            bc.e eVar = iVar2.f3769a;
            return new C0059c(eVar, c.h(eVar, i11, iVar2.f3771c), 1);
        }

        public int b() {
            return this.f3766a.b();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (int i10 = 0; i10 < this.f3766a.b(); i10++) {
                this.f3766a.d(i10).v(sb2);
                if (i10 != this.f3766a.b() - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static class e extends k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final e f3767g = new e(c.f3763a, 1, 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final byte[] f3768f;

        e(bc.e eVar, int i10, int i11) {
            super(eVar, i10, i11);
            this.f3768f = new byte[4];
        }

        public static e e() {
            return f3767g;
        }

        @Override // bc.c.k, bc.c.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append("{ ");
            d dVarF = f();
            int iB = b();
            k kVarG = g();
            for (int i10 = 0; i10 < iB; i10++) {
                sb2.append('\"');
                sb2.append(dVarF.a(i10).toString());
                sb2.append("\" : ");
                sb2.append(kVarG.d(i10).toString());
                if (i10 != iB - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(" }");
            return sb2;
        }

        public d f() {
            int i10 = this.f3770b - (this.f3771c * 3);
            bc.e eVar = this.f3769a;
            int iH = c.h(eVar, i10, this.f3771c);
            bc.e eVar2 = this.f3769a;
            int i11 = this.f3771c;
            return new d(new i(eVar, iH, c.m(eVar2, i10 + i11, i11), 4));
        }

        public k g() {
            return new k(this.f3769a, this.f3770b, this.f3771c);
        }
    }

    private static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        bc.e f3769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3771c;

        f(bc.e eVar, int i10, int i11) {
            this.f3769a = eVar;
            this.f3770b = i10;
            this.f3771c = i11;
        }

        public abstract StringBuilder a(StringBuilder sb2);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    public static class g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final g f3772f = new g(c.f3763a, 0, 1, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private bc.e f3773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f3776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f3777e;

        g(bc.e eVar, int i10, int i11, int i12) {
            this(eVar, i10, i11, 1 << (i12 & 3), i12 >> 2);
        }

        public a b() {
            if (!m() && !t()) {
                return a.c();
            }
            bc.e eVar = this.f3773a;
            return new a(eVar, c.h(eVar, this.f3774b, this.f3775c), this.f3776d);
        }

        public boolean c() {
            return n() ? this.f3773a.get(this.f3774b) != 0 : j() != 0;
        }

        public double d() {
            int i10 = this.f3777e;
            if (i10 == 3) {
                return c.l(this.f3773a, this.f3774b, this.f3775c);
            }
            if (i10 == 1) {
                return c.m(this.f3773a, this.f3774b, this.f3775c);
            }
            if (i10 != 2) {
                if (i10 == 5) {
                    return Double.parseDouble(i());
                }
                if (i10 == 6) {
                    bc.e eVar = this.f3773a;
                    return c.m(eVar, c.h(eVar, this.f3774b, this.f3775c), this.f3776d);
                }
                if (i10 == 7) {
                    bc.e eVar2 = this.f3773a;
                    return c.o(eVar2, c.h(eVar2, this.f3774b, this.f3775c), this.f3776d);
                }
                if (i10 == 8) {
                    bc.e eVar3 = this.f3773a;
                    return c.l(eVar3, c.h(eVar3, this.f3774b, this.f3775c), this.f3776d);
                }
                if (i10 == 10) {
                    return k().b();
                }
                if (i10 != 26) {
                    return 0.0d;
                }
            }
            return c.o(this.f3773a, this.f3774b, this.f3775c);
        }

        public int e() {
            long jO;
            int i10 = this.f3777e;
            if (i10 == 1) {
                return c.m(this.f3773a, this.f3774b, this.f3775c);
            }
            if (i10 == 2) {
                jO = c.o(this.f3773a, this.f3774b, this.f3775c);
            } else {
                if (i10 == 3) {
                    return (int) c.l(this.f3773a, this.f3774b, this.f3775c);
                }
                if (i10 == 5) {
                    return Integer.parseInt(i());
                }
                if (i10 == 6) {
                    bc.e eVar = this.f3773a;
                    return c.m(eVar, c.h(eVar, this.f3774b, this.f3775c), this.f3776d);
                }
                if (i10 != 7) {
                    if (i10 == 8) {
                        bc.e eVar2 = this.f3773a;
                        return (int) c.l(eVar2, c.h(eVar2, this.f3774b, this.f3775c), this.f3776d);
                    }
                    if (i10 == 10) {
                        return k().b();
                    }
                    if (i10 != 26) {
                        return 0;
                    }
                    return c.m(this.f3773a, this.f3774b, this.f3775c);
                }
                bc.e eVar3 = this.f3773a;
                jO = c.o(eVar3, c.h(eVar3, this.f3774b, this.f3775c), this.f3775c);
            }
            return (int) jO;
        }

        public C0059c f() {
            if (!q()) {
                return C0059c.c();
            }
            bc.e eVar = this.f3773a;
            return new C0059c(eVar, c.h(eVar, this.f3774b, this.f3775c), this.f3776d);
        }

        public long g() {
            int i10 = this.f3777e;
            if (i10 == 1) {
                return c.n(this.f3773a, this.f3774b, this.f3775c);
            }
            if (i10 == 2) {
                return c.o(this.f3773a, this.f3774b, this.f3775c);
            }
            if (i10 == 3) {
                return (long) c.l(this.f3773a, this.f3774b, this.f3775c);
            }
            if (i10 == 5) {
                try {
                    return Long.parseLong(i());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i10 == 6) {
                bc.e eVar = this.f3773a;
                return c.n(eVar, c.h(eVar, this.f3774b, this.f3775c), this.f3776d);
            }
            if (i10 == 7) {
                bc.e eVar2 = this.f3773a;
                return c.o(eVar2, c.h(eVar2, this.f3774b, this.f3775c), this.f3775c);
            }
            if (i10 == 8) {
                bc.e eVar3 = this.f3773a;
                return (long) c.l(eVar3, c.h(eVar3, this.f3774b, this.f3775c), this.f3776d);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 != 26) {
                return 0L;
            }
            return c.m(this.f3773a, this.f3774b, this.f3775c);
        }

        public e h() {
            if (!r()) {
                return e.e();
            }
            bc.e eVar = this.f3773a;
            return new e(eVar, c.h(eVar, this.f3774b, this.f3775c), this.f3776d);
        }

        public String i() {
            if (t()) {
                int iH = c.h(this.f3773a, this.f3774b, this.f3775c);
                bc.e eVar = this.f3773a;
                int i10 = this.f3776d;
                return this.f3773a.d(iH, (int) c.o(eVar, iH - i10, i10));
            }
            if (!q()) {
                return "";
            }
            int iH2 = c.h(this.f3773a, this.f3774b, this.f3776d);
            int i11 = iH2;
            while (this.f3773a.get(i11) != 0) {
                i11++;
            }
            return this.f3773a.d(iH2, i11 - iH2);
        }

        public long j() {
            int i10 = this.f3777e;
            if (i10 == 2) {
                return c.o(this.f3773a, this.f3774b, this.f3775c);
            }
            if (i10 == 1) {
                return c.n(this.f3773a, this.f3774b, this.f3775c);
            }
            if (i10 == 3) {
                return (long) c.l(this.f3773a, this.f3774b, this.f3775c);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 == 26) {
                return c.m(this.f3773a, this.f3774b, this.f3775c);
            }
            if (i10 == 5) {
                return Long.parseLong(i());
            }
            if (i10 == 6) {
                bc.e eVar = this.f3773a;
                return c.n(eVar, c.h(eVar, this.f3774b, this.f3775c), this.f3776d);
            }
            if (i10 == 7) {
                bc.e eVar2 = this.f3773a;
                return c.o(eVar2, c.h(eVar2, this.f3774b, this.f3775c), this.f3776d);
            }
            if (i10 != 8) {
                return 0L;
            }
            bc.e eVar3 = this.f3773a;
            return (long) c.l(eVar3, c.h(eVar3, this.f3774b, this.f3775c), this.f3775c);
        }

        public k k() {
            if (u()) {
                bc.e eVar = this.f3773a;
                return new k(eVar, c.h(eVar, this.f3774b, this.f3775c), this.f3776d);
            }
            int i10 = this.f3777e;
            if (i10 == 15) {
                bc.e eVar2 = this.f3773a;
                return new i(eVar2, c.h(eVar2, this.f3774b, this.f3775c), this.f3776d, 4);
            }
            if (!c.j(i10)) {
                return k.c();
            }
            bc.e eVar3 = this.f3773a;
            return new i(eVar3, c.h(eVar3, this.f3774b, this.f3775c), this.f3776d, c.q(this.f3777e));
        }

        public int l() {
            return this.f3777e;
        }

        public boolean m() {
            return this.f3777e == 25;
        }

        public boolean n() {
            return this.f3777e == 26;
        }

        public boolean o() {
            int i10 = this.f3777e;
            return i10 == 3 || i10 == 8;
        }

        public boolean p() {
            int i10 = this.f3777e;
            return i10 == 1 || i10 == 6;
        }

        public boolean q() {
            return this.f3777e == 4;
        }

        public boolean r() {
            return this.f3777e == 9;
        }

        public boolean s() {
            return this.f3777e == 0;
        }

        public boolean t() {
            return this.f3777e == 5;
        }

        public String toString() {
            return v(new StringBuilder(128)).toString();
        }

        public boolean u() {
            int i10 = this.f3777e;
            return i10 == 10 || i10 == 9;
        }

        StringBuilder v(StringBuilder sb2) {
            int i10 = this.f3777e;
            if (i10 != 36) {
                switch (i10) {
                    case 0:
                        sb2.append("null");
                        return sb2;
                    case 1:
                    case 6:
                        sb2.append(g());
                        return sb2;
                    case 2:
                    case 7:
                        sb2.append(j());
                        return sb2;
                    case 3:
                    case 8:
                        sb2.append(d());
                        return sb2;
                    case 4:
                        C0059c c0059cF = f();
                        sb2.append('\"');
                        StringBuilder sbA = c0059cF.a(sb2);
                        sbA.append('\"');
                        return sbA;
                    case 5:
                        sb2.append('\"');
                        sb2.append(i());
                        sb2.append('\"');
                        return sb2;
                    case 9:
                        return h().a(sb2);
                    case 10:
                        return k().a(sb2);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new b("not_implemented:" + this.f3777e);
                    case 25:
                        return b().a(sb2);
                    case 26:
                        sb2.append(c());
                        return sb2;
                    default:
                        return sb2;
                }
            }
            sb2.append(k());
            return sb2;
        }

        g(bc.e eVar, int i10, int i11, int i12, int i13) {
            this.f3773a = eVar;
            this.f3774b = i10;
            this.f3775c = i11;
            this.f3776d = i12;
            this.f3777e = i13;
        }
    }

    private static abstract class h extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final int f3778d;

        h(bc.e eVar, int i10, int i11) {
            super(eVar, i10, i11);
            this.f3778d = (int) c.o(this.f3769a, i10 - i11, i11);
        }

        public int b() {
            return this.f3778d;
        }
    }

    public static class i extends k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final i f3779g = new i(c.f3763a, 1, 1, 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f3780f;

        i(bc.e eVar, int i10, int i11, int i12) {
            super(eVar, i10, i11);
            this.f3780f = i12;
        }

        @Override // bc.c.k
        public g d(int i10) {
            if (i10 >= b()) {
                return g.f3772f;
            }
            return new g(this.f3769a, this.f3770b + (i10 * this.f3771c), this.f3771c, 1, this.f3780f);
        }
    }

    static class j {
        static int a(byte b10) {
            return b10 & MessagePack.Code.EXT_TIMESTAMP;
        }

        static long b(int i10) {
            return ((long) i10) & 4294967295L;
        }

        static int c(short s10) {
            return s10 & 65535;
        }
    }

    public static class k extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final k f3781e = new k(c.f3763a, 1, 1);

        k(bc.e eVar, int i10, int i11) {
            super(eVar, i10, i11);
        }

        public static k c() {
            return f3781e;
        }

        @Override // bc.c.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append("[ ");
            int iB = b();
            for (int i10 = 0; i10 < iB; i10++) {
                d(i10).v(sb2);
                if (i10 != iB - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(" ]");
            return sb2;
        }

        @Override // bc.c.h
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public g d(int i10) {
            long jB = b();
            long j10 = i10;
            if (j10 >= jB) {
                return g.f3772f;
            }
            return new g(this.f3769a, this.f3770b + (i10 * this.f3771c), this.f3771c, j.a(this.f3769a.get((int) (((long) this.f3770b) + (jB * ((long) this.f3771c)) + j10))));
        }

        @Override // bc.c.f
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static g g(bc.e eVar) {
        int iA = eVar.a();
        byte b10 = eVar.get(iA - 1);
        int i10 = iA - 2;
        return new g(eVar, i10 - b10, b10, j.a(eVar.get(i10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(bc.e eVar, int i10, int i11) {
        return (int) (((long) i10) - o(eVar, i10, i11));
    }

    static boolean i(int i10) {
        return i10 <= 3 || i10 == 26;
    }

    static boolean j(int i10) {
        return (i10 >= 11 && i10 <= 15) || i10 == 36;
    }

    static boolean k(int i10) {
        return (i10 >= 1 && i10 <= 4) || i10 == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double l(bc.e eVar, int i10, int i11) {
        if (i11 == 4) {
            return eVar.getFloat(i10);
        }
        if (i11 != 8) {
            return -1.0d;
        }
        return eVar.getDouble(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(bc.e eVar, int i10, int i11) {
        return (int) n(eVar, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long n(bc.e eVar, int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = eVar.get(i10);
        } else if (i11 == 2) {
            i12 = eVar.getShort(i10);
        } else {
            if (i11 != 4) {
                if (i11 != 8) {
                    return -1L;
                }
                return eVar.getLong(i10);
            }
            i12 = eVar.getInt(i10);
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long o(bc.e eVar, int i10, int i11) {
        if (i11 == 1) {
            return j.a(eVar.get(i10));
        }
        if (i11 == 2) {
            return j.c(eVar.getShort(i10));
        }
        if (i11 == 4) {
            return j.b(eVar.getInt(i10));
        }
        if (i11 != 8) {
            return -1L;
        }
        return eVar.getLong(i10);
    }

    static int p(int i10, int i11) {
        if (i11 == 0) {
            return i10 + 10;
        }
        if (i11 == 2) {
            return i10 + 15;
        }
        if (i11 == 3) {
            return i10 + 18;
        }
        if (i11 != 4) {
            return 0;
        }
        return i10 + 21;
    }

    static int q(int i10) {
        return i10 - 10;
    }
}
