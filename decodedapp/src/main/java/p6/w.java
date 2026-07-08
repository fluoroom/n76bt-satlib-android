package p6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public class w implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final e6.o f24053g = new o6.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b0 f24054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final e7.j f24055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final e7.q f24056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final e6.e f24057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final a f24058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final b f24059f;

    public static final class a implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f24060c = new a(null, null, null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e6.o f24061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e6.p f24062b;

        public a(e6.o oVar, e6.c cVar, i6.d dVar, e6.p pVar) {
            this.f24061a = oVar;
            this.f24062b = pVar;
        }

        public void a(e6.g gVar) {
            e6.o oVar = this.f24061a;
            if (oVar != null) {
                if (oVar == w.f24053g) {
                    gVar.T(null);
                } else {
                    if (oVar instanceof o6.f) {
                        oVar = (e6.o) ((o6.f) oVar).e();
                    }
                    gVar.T(oVar);
                }
            }
            e6.p pVar = this.f24062b;
            if (pVar != null) {
                gVar.W(pVar);
            }
        }

        public a b(e6.o oVar) {
            if (oVar == null) {
                oVar = w.f24053g;
            }
            return oVar == this.f24061a ? this : new a(oVar, null, null, this.f24062b);
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f24063d = new b(null, null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JavaType f24064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p f24065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a7.h f24066c;

        private b(JavaType javaType, p pVar, a7.h hVar) {
            this.f24064a = javaType;
            this.f24065b = pVar;
            this.f24066c = hVar;
        }

        public void a(e6.g gVar, Object obj, e7.j jVar) throws IOException {
            a7.h hVar = this.f24066c;
            if (hVar != null) {
                jVar.O0(gVar, obj, this.f24064a, this.f24065b, hVar);
                return;
            }
            p pVar = this.f24065b;
            if (pVar != null) {
                jVar.R0(gVar, obj, this.f24064a, pVar);
                return;
            }
            JavaType javaType = this.f24064a;
            if (javaType != null) {
                jVar.Q0(gVar, obj, javaType);
            } else {
                jVar.P0(gVar, obj);
            }
        }
    }

    protected w(u uVar, b0 b0Var) {
        this.f24054a = b0Var;
        this.f24055b = uVar.f24037h;
        this.f24056c = uVar.f24038r;
        this.f24057d = uVar.f24030a;
        this.f24058e = a.f24060c;
        this.f24059f = b.f24063d;
    }

    private final void e(e6.g gVar, Object obj) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            this.f24059f.a(gVar, obj, d());
            try {
                closeable.close();
                gVar.close();
            } catch (Exception e10) {
                e = e10;
                closeable = null;
                i7.h.j(gVar, closeable, e);
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    protected final void a(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }

    protected final e6.g b(e6.g gVar) {
        this.f24054a.o0(gVar);
        this.f24058e.a(gVar);
        return gVar;
    }

    protected w c(a aVar, b bVar) {
        return (this.f24058e == aVar && this.f24059f == bVar) ? this : new w(this, this.f24054a, aVar, bVar);
    }

    protected e7.j d() {
        return this.f24055b.N0(this.f24054a, this.f24056c);
    }

    protected final void f(e6.g gVar, Object obj) throws IOException {
        if (this.f24054a.q0(c0.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            e(gVar, obj);
            return;
        }
        try {
            this.f24059f.a(gVar, obj, d());
            gVar.close();
        } catch (Exception e10) {
            i7.h.k(gVar, e10);
        }
    }

    public e6.g g(Writer writer) {
        a("w", writer);
        return b(this.f24057d.k(writer));
    }

    public w h(e6.o oVar) {
        return c(this.f24058e.b(oVar), this.f24059f);
    }

    public w i() {
        return h(this.f24054a.m0());
    }

    public String j(Object obj) throws e6.k {
        i6.k kVar = new i6.k(this.f24057d.h());
        try {
            f(g(kVar), obj);
            return kVar.a();
        } catch (e6.k e10) {
            throw e10;
        } catch (IOException e11) {
            throw m.n(e11);
        }
    }

    protected w(w wVar, b0 b0Var, a aVar, b bVar) {
        this.f24054a = b0Var;
        this.f24055b = wVar.f24055b;
        this.f24056c = wVar.f24056c;
        this.f24057d = wVar.f24057d;
        this.f24058e = aVar;
        this.f24059f = bVar;
    }
}
