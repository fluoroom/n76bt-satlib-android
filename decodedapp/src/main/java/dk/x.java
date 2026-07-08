package dk;

import com.facebook.stetho.server.http.HttpHeaders;
import eh.c0;
import eh.f0;
import eh.g0;
import eh.t;
import eh.y;
import eh.z;
import java.io.EOFException;
import java.util.regex.Pattern;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
final class x {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f11260l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f11261m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final eh.z f11263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f11264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z.a f11265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f0.a f11266e = new f0.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y.a f11267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private eh.b0 f11268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f11269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c0.a f11270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private t.a f11271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g0 f11272k;

    private static class a extends g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g0 f11273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final eh.b0 f11274d;

        a(g0 g0Var, eh.b0 b0Var) {
            this.f11273c = g0Var;
            this.f11274d = b0Var;
        }

        @Override // eh.g0
        public long a() {
            return this.f11273c.a();
        }

        @Override // eh.g0
        public eh.b0 b() {
            return this.f11274d;
        }

        @Override // eh.g0
        public void f(vh.f fVar) {
            this.f11273c.f(fVar);
        }
    }

    x(String str, eh.z zVar, String str2, eh.y yVar, eh.b0 b0Var, boolean z10, boolean z11, boolean z12) {
        this.f11262a = str;
        this.f11263b = zVar;
        this.f11264c = str2;
        this.f11268g = b0Var;
        this.f11269h = z10;
        if (yVar != null) {
            this.f11267f = yVar.e();
        } else {
            this.f11267f = new y.a();
        }
        if (z11) {
            this.f11271j = new t.a();
        } else if (z12) {
            c0.a aVar = new c0.a();
            this.f11270i = aVar;
            aVar.d(eh.c0.f12295m);
        }
    }

    private static String i(String str, boolean z10) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                vh.e eVar = new vh.e();
                eVar.M(str, 0, iCharCount);
                j(eVar, str, iCharCount, length, z10);
                return eVar.w0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    private static void j(vh.e eVar, String str, int i10, int i11, boolean z10) throws EOFException {
        vh.e eVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (eVar2 == null) {
                        eVar2 = new vh.e();
                    }
                    eVar2.t(iCodePointAt);
                    long size = eVar2.size();
                    for (long j10 = 0; j10 < size; j10++) {
                        byte bG = eVar2.G(j10);
                        int i12 = bG & MessagePack.Code.EXT_TIMESTAMP;
                        eVar.writeByte(37);
                        char[] cArr = f11260l;
                        eVar.writeByte(cArr[(i12 >> 4) & 15]);
                        eVar.writeByte(cArr[bG & 15]);
                    }
                    eVar2.k();
                } else {
                    eVar.t(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    void a(String str, String str2, boolean z10) {
        if (z10) {
            this.f11271j.b(str, str2);
        } else {
            this.f11271j.a(str, str2);
        }
    }

    void b(String str, String str2, boolean z10) {
        if (!HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(str)) {
            if (z10) {
                this.f11267f.e(str, str2);
                return;
            } else {
                this.f11267f.a(str, str2);
                return;
            }
        }
        try {
            this.f11268g = eh.b0.e(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    void c(eh.y yVar) {
        this.f11267f.b(yVar);
    }

    void d(eh.y yVar, g0 g0Var) {
        this.f11270i.a(yVar, g0Var);
    }

    void e(c0.c cVar) {
        this.f11270i.b(cVar);
    }

    void f(String str, String str2, boolean z10) throws EOFException {
        if (this.f11264c == null) {
            throw new AssertionError();
        }
        String strI = i(str2, z10);
        String strReplace = this.f11264c.replace("{" + str + "}", strI);
        if (!f11261m.matcher(strReplace).matches()) {
            this.f11264c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    void g(String str, String str2, boolean z10) {
        String str3 = this.f11264c;
        if (str3 != null) {
            z.a aVarK = this.f11263b.k(str3);
            this.f11265d = aVarK;
            if (aVarK == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f11263b + ", Relative: " + this.f11264c);
            }
            this.f11264c = null;
        }
        if (z10) {
            this.f11265d.a(str, str2);
        } else {
            this.f11265d.b(str, str2);
        }
    }

    void h(Class cls, Object obj) {
        this.f11266e.p(cls, obj);
    }

    f0.a k() {
        eh.z zVarP;
        z.a aVar = this.f11265d;
        if (aVar != null) {
            zVarP = aVar.c();
        } else {
            zVarP = this.f11263b.p(this.f11264c);
            if (zVarP == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f11263b + ", Relative: " + this.f11264c);
            }
        }
        g0 aVar2 = this.f11272k;
        if (aVar2 == null) {
            t.a aVar3 = this.f11271j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                c0.a aVar4 = this.f11270i;
                if (aVar4 != null) {
                    aVar2 = aVar4.c();
                } else if (this.f11269h) {
                    aVar2 = g0.c(null, new byte[0]);
                }
            }
        }
        eh.b0 b0Var = this.f11268g;
        if (b0Var != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, b0Var);
            } else {
                this.f11267f.a(HttpHeaders.CONTENT_TYPE, b0Var.toString());
            }
        }
        return this.f11266e.r(zVarP).l(this.f11267f.f()).m(this.f11262a, aVar2);
    }

    void l(g0 g0Var) {
        this.f11272k = g0Var;
    }

    void m(Object obj) {
        this.f11264c = obj.toString();
    }
}
