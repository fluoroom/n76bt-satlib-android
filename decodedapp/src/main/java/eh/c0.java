package eh;

import com.facebook.stetho.dumpapp.Framer;
import com.facebook.stetho.server.http.HttpHeaders;
import eh.b0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f12290h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b0 f12291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b0 f12292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b0 f12293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b0 f12294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b0 f12295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f12296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f12297o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f12298p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vh.h f12299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b0 f12300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f12301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b0 f12302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f12303g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final vh.h f12304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b0 f12305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f12306c;

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(y yVar, g0 g0Var) {
            rd.m.e(g0Var, "body");
            b(c.f12307c.a(yVar, g0Var));
            return this;
        }

        public final a b(c cVar) {
            rd.m.e(cVar, "part");
            this.f12306c.add(cVar);
            return this;
        }

        public final c0 c() {
            if (this.f12306c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new c0(this.f12304a, this.f12305b, fh.p.v(this.f12306c));
        }

        public final a d(b0 b0Var) {
            rd.m.e(b0Var, "type");
            if (rd.m.a(b0Var.g(), "multipart")) {
                this.f12305b = b0Var;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + b0Var).toString());
        }

        public a(String str) {
            rd.m.e(str, "boundary");
            this.f12304a = vh.h.f30792d.d(str);
            this.f12305b = c0.f12291i;
            this.f12306c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i10, rd.h hVar) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                rd.m.d(str, "toString(...)");
            }
            this(str);
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f12307c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y f12308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g0 f12309b;

        public static final class a {
            public /* synthetic */ a(rd.h hVar) {
                this();
            }

            public final c a(y yVar, g0 g0Var) {
                rd.m.e(g0Var, "body");
                rd.h hVar = null;
                if ((yVar != null ? yVar.b(HttpHeaders.CONTENT_TYPE) : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((yVar != null ? yVar.b(HttpHeaders.CONTENT_LENGTH) : null) == null) {
                    return new c(yVar, g0Var, hVar);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            private a() {
            }
        }

        public /* synthetic */ c(y yVar, g0 g0Var, rd.h hVar) {
            this(yVar, g0Var);
        }

        public final g0 a() {
            return this.f12309b;
        }

        public final y b() {
            return this.f12308a;
        }

        private c(y yVar, g0 g0Var) {
            this.f12308a = yVar;
            this.f12309b = g0Var;
        }
    }

    static {
        b0.a aVar = b0.f12251e;
        f12291i = aVar.a("multipart/mixed");
        f12292j = aVar.a("multipart/alternative");
        f12293k = aVar.a("multipart/digest");
        f12294l = aVar.a("multipart/parallel");
        f12295m = aVar.a("multipart/form-data");
        f12296n = new byte[]{58, 32};
        f12297o = new byte[]{13, 10};
        f12298p = new byte[]{Framer.STDIN_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX};
    }

    public c0(vh.h hVar, b0 b0Var, List list) {
        rd.m.e(hVar, "boundaryByteString");
        rd.m.e(b0Var, "type");
        rd.m.e(list, "parts");
        this.f12299c = hVar;
        this.f12300d = b0Var;
        this.f12301e = list;
        this.f12302f = b0.f12251e.a(b0Var + "; boundary=" + g());
        this.f12303g = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long h(vh.f fVar, boolean z10) throws EOFException {
        vh.e eVar;
        if (z10) {
            fVar = new vh.e();
            eVar = fVar;
        } else {
            eVar = 0;
        }
        int size = this.f12301e.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) this.f12301e.get(i10);
            y yVarB = cVar.b();
            g0 g0VarA = cVar.a();
            rd.m.b(fVar);
            fVar.write(f12298p);
            fVar.Z(this.f12299c);
            fVar.write(f12297o);
            if (yVarB != null) {
                int size2 = yVarB.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    fVar.J(yVarB.d(i11)).write(f12296n).J(yVarB.g(i11)).write(f12297o);
                }
            }
            b0 b0VarB = g0VarA.b();
            if (b0VarB != null) {
                fVar.J("Content-Type: ").J(b0VarB.toString()).write(f12297o);
            }
            long jA = g0VarA.a();
            if (jA == -1 && z10) {
                rd.m.b(eVar);
                eVar.k();
                return -1L;
            }
            byte[] bArr = f12297o;
            fVar.write(bArr);
            if (z10) {
                j10 += jA;
            } else {
                g0VarA.f(fVar);
            }
            fVar.write(bArr);
        }
        rd.m.b(fVar);
        byte[] bArr2 = f12298p;
        fVar.write(bArr2);
        fVar.Z(this.f12299c);
        fVar.write(bArr2);
        fVar.write(f12297o);
        if (!z10) {
            return j10;
        }
        rd.m.b(eVar);
        long size3 = j10 + eVar.size();
        eVar.k();
        return size3;
    }

    @Override // eh.g0
    public long a() throws EOFException {
        long j10 = this.f12303g;
        if (j10 != -1) {
            return j10;
        }
        long jH = h(null, true);
        this.f12303g = jH;
        return jH;
    }

    @Override // eh.g0
    public b0 b() {
        return this.f12302f;
    }

    @Override // eh.g0
    public boolean e() {
        List list = this.f12301e;
        if (d.h0.a(list) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).a().e()) {
                return true;
            }
        }
        return false;
    }

    @Override // eh.g0
    public void f(vh.f fVar) throws EOFException {
        rd.m.e(fVar, "sink");
        h(fVar, false);
    }

    public final String g() {
        return this.f12299c.Z();
    }
}
