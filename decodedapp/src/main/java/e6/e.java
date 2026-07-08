package e6;

import e6.g;
import e6.j;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public class e extends u implements Serializable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final int f11483t = a.g();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected static final int f11484u = j.a.a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected static final int f11485v = g.b.a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p f11486w = o6.e.f23231h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final transient m6.b f11487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final transient m6.a f11488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f11489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f11490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f11491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected n f11492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected r f11493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected p f11494h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f11495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final char f11496s;

    public enum a implements o6.h {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true),
        CHARSET_DETECTION(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f11503a;

        a(boolean z10) {
            this.f11503a = z10;
        }

        public static int g() {
            int iD = 0;
            for (a aVar : values()) {
                if (aVar.a()) {
                    iD |= aVar.d();
                }
            }
            return iD;
        }

        @Override // o6.h
        public boolean a() {
            return this.f11503a;
        }

        @Override // o6.h
        public int d() {
            return 1 << ordinal();
        }

        @Override // o6.h
        public boolean e(int i10) {
            return (i10 & d()) != 0;
        }
    }

    public e() {
        this(null);
    }

    protected i6.e a(Object obj) {
        return i6.e.i(!i(), obj);
    }

    protected i6.f b(i6.e eVar, boolean z10) {
        if (eVar == null) {
            eVar = i6.e.r();
        }
        return new i6.f(this.f11493g, h(), eVar, z10);
    }

    protected g c(Writer writer, i6.f fVar) {
        l6.g gVar = new l6.g(fVar, this.f11491e, this.f11492f, writer, this.f11496s);
        int i10 = this.f11495r;
        if (i10 > 0) {
            gVar.S(i10);
        }
        p pVar = this.f11494h;
        if (pVar != f11486w) {
            gVar.W(pVar);
        }
        return gVar;
    }

    protected j d(Reader reader, i6.f fVar) {
        return new l6.f(fVar, this.f11490d, reader, this.f11492f, this.f11487a.n(this.f11489c));
    }

    protected j e(char[] cArr, int i10, int i11, i6.f fVar, boolean z10) {
        return new l6.f(fVar, this.f11490d, null, this.f11492f, this.f11487a.n(this.f11489c), cArr, i10, i10 + i11, z10);
    }

    public o6.a h() {
        return a.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.e(this.f11489c) ? o6.b.a() : new o6.a();
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return true;
    }

    public g k(Writer writer) {
        i6.f fVarB = b(a(writer), false);
        return c(g(writer, fVarB), fVarB);
    }

    public j l(Reader reader) {
        i6.f fVarB = b(a(reader), false);
        return d(f(reader, fVarB), fVarB);
    }

    public j n(String str) {
        int length = str.length();
        if (length > 32768 || !j()) {
            return l(new StringReader(str));
        }
        i6.f fVarB = b(a(str), true);
        char[] cArrH = fVarB.h(length);
        str.getChars(0, length, cArrH, 0);
        return e(cArrH, 0, length, fVarB, true);
    }

    public n o() {
        return this.f11492f;
    }

    public boolean p() {
        return false;
    }

    public e q(n nVar) {
        this.f11492f = nVar;
        return this;
    }

    public e(n nVar) {
        this.f11487a = m6.b.j();
        this.f11488b = m6.a.c();
        this.f11489c = f11483t;
        this.f11490d = f11484u;
        this.f11491e = f11485v;
        this.f11494h = f11486w;
        this.f11492f = nVar;
        this.f11496s = '\"';
        this.f11493g = r.a();
    }

    protected final Reader f(Reader reader, i6.f fVar) {
        return reader;
    }

    protected final Writer g(Writer writer, i6.f fVar) {
        return writer;
    }
}
