package s6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import t6.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class t implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p6.d f26949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final x6.k f26950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f26951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JavaType f26952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected p6.l f26953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final a7.e f26954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final p6.q f26955g;

    private static class a extends z.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t f26956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f26957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f26958e;

        public a(t tVar, v vVar, Class cls, Object obj, String str) {
            super(vVar, cls);
            this.f26956c = tVar;
            this.f26957d = obj;
            this.f26958e = str;
        }
    }

    protected static class c extends t implements Serializable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected final w f26960h;

        public c(p6.d dVar, x6.k kVar, JavaType javaType, p6.q qVar, p6.l lVar, a7.e eVar, w wVar) {
            super(dVar, kVar, javaType, qVar, lVar, eVar);
            this.f26960h = wVar;
        }

        @Override // s6.t
        protected void a(Object obj, Object obj2, Object obj3) throws p6.m {
            x6.i iVar = (x6.i) this.f26950b;
            Map mapQ = (Map) iVar.o(obj);
            if (mapQ == null) {
                mapQ = q(null, iVar, obj, obj2);
            }
            mapQ.put(obj2, obj3);
        }

        @Override // s6.t
        public t p(p6.l lVar) {
            return new c(this.f26949a, this.f26950b, this.f26952d, this.f26955g, lVar, this.f26954f, this.f26960h);
        }

        protected Map q(p6.h hVar, x6.i iVar, Object obj, Object obj2) throws p6.m {
            w wVar = this.f26960h;
            if (wVar == null) {
                throw p6.m.l(hVar, String.format("Cannot create an instance of %s for use as \"any-setter\" '%s'", i7.h.Y(this.f26952d.r()), this.f26949a.getName()));
            }
            Map map = (Map) wVar.A(hVar);
            iVar.p(obj, map);
            return map;
        }
    }

    protected static class d extends t implements Serializable {
        public d(p6.d dVar, x6.k kVar, JavaType javaType, p6.q qVar, p6.l lVar, a7.e eVar) {
            super(dVar, kVar, javaType, qVar, lVar, eVar);
        }

        @Override // s6.t
        protected void a(Object obj, Object obj2, Object obj3) {
            ((x6.l) this.f26950b).D(obj, obj2, obj3);
        }

        @Override // s6.t
        public t p(p6.l lVar) {
            return new d(this.f26949a, this.f26950b, this.f26952d, this.f26955g, lVar, this.f26954f);
        }
    }

    public t(p6.d dVar, x6.k kVar, JavaType javaType, p6.q qVar, p6.l lVar, a7.e eVar) {
        this.f26949a = dVar;
        this.f26950b = kVar;
        this.f26952d = javaType;
        this.f26953e = lVar;
        this.f26954f = eVar;
        this.f26955g = qVar;
        this.f26951c = kVar instanceof x6.i;
    }

    public static t c(p6.h hVar, p6.d dVar, x6.k kVar, JavaType javaType, p6.l lVar) {
        return new b(dVar, kVar, javaType, lVar, hVar.h0());
    }

    public static t d(p6.h hVar, p6.d dVar, x6.k kVar, JavaType javaType, p6.q qVar, p6.l lVar, a7.e eVar) {
        Class<LinkedHashMap> clsE = kVar.e();
        if (clsE == Map.class) {
            clsE = LinkedHashMap.class;
        }
        return new c(dVar, kVar, javaType, qVar, lVar, eVar, t6.k.a(hVar.k(), clsE));
    }

    public static t e(p6.h hVar, p6.d dVar, x6.k kVar, JavaType javaType, p6.q qVar, p6.l lVar, a7.e eVar) {
        return new d(dVar, kVar, javaType, qVar, lVar, eVar);
    }

    private String i() {
        return i7.h.Y(this.f26950b.k());
    }

    protected abstract void a(Object obj, Object obj2, Object obj3);

    protected void b(Exception exc, Object obj, Object obj2) throws IOException {
        if (!(exc instanceof IllegalArgumentException)) {
            i7.h.j0(exc);
            i7.h.k0(exc);
            Throwable thF = i7.h.F(exc);
            throw new p6.m((Closeable) null, i7.h.o(thF), thF);
        }
        String strH = i7.h.h(obj2);
        StringBuilder sb2 = new StringBuilder("Problem deserializing \"any-property\" '");
        sb2.append(obj);
        sb2.append("' of class " + i() + " (expected type: ");
        sb2.append(this.f26952d);
        sb2.append("; actual type: ");
        sb2.append(strH);
        sb2.append(")");
        String strO = i7.h.o(exc);
        if (strO != null) {
            sb2.append(", problem: ");
            sb2.append(strO);
        } else {
            sb2.append(" (no error message provided)");
        }
        throw new p6.m((Closeable) null, sb2.toString(), exc);
    }

    public Object f(e6.j jVar, p6.h hVar) {
        if (jVar.N0(e6.m.VALUE_NULL)) {
            return this.f26953e.a(hVar);
        }
        a7.e eVar = this.f26954f;
        return eVar != null ? this.f26953e.g(jVar, hVar, eVar) : this.f26953e.e(jVar, hVar);
    }

    public void g(e6.j jVar, p6.h hVar, Object obj, String str) throws IOException {
        try {
            p6.q qVar = this.f26955g;
            o(obj, qVar == null ? str : qVar.a(str, hVar), f(jVar, hVar));
        } catch (v e10) {
            if (this.f26953e.o() == null) {
                throw p6.m.k(jVar, "Unresolved forward reference but no identity info.", e10);
            }
            e10.w().a(new a(this, e10, this.f26952d.r(), obj, str));
        }
    }

    public void h(p6.g gVar) {
        this.f26950b.i(gVar.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public p6.d j() {
        return this.f26949a;
    }

    public String k() {
        return this.f26949a.getName();
    }

    public JavaType l() {
        return this.f26952d;
    }

    public boolean n() {
        return this.f26953e != null;
    }

    public void o(Object obj, Object obj2, Object obj3) throws IOException {
        try {
            a(obj, obj2, obj3);
        } catch (IOException e10) {
            throw e10;
        } catch (Exception e11) {
            b(e11, obj2, obj3);
        }
    }

    public abstract t p(p6.l lVar);

    public String toString() {
        return "[any property on class " + i() + "]";
    }

    protected static class b extends t implements Serializable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected final d7.l f26959h;

        public b(p6.d dVar, x6.k kVar, JavaType javaType, p6.l lVar, d7.l lVar2) {
            super(dVar, kVar, javaType, null, lVar, null);
            this.f26959h = lVar2;
        }

        @Override // s6.t
        protected void a(Object obj, Object obj2, Object obj3) throws p6.m {
            q(obj, (String) obj2, (p6.n) obj3);
        }

        @Override // s6.t
        public Object f(e6.j jVar, p6.h hVar) {
            return this.f26953e.e(jVar, hVar);
        }

        @Override // s6.t
        public void g(e6.j jVar, p6.h hVar, Object obj, String str) throws p6.m {
            q(obj, str, (p6.n) f(jVar, hVar));
        }

        protected void q(Object obj, String str, p6.n nVar) throws p6.m {
            d7.r rVarK;
            x6.i iVar = (x6.i) this.f26950b;
            Object objO = iVar.o(obj);
            if (objO == null) {
                rVarK = this.f26959h.k();
                iVar.p(obj, rVarK);
            } else {
                if (!(objO instanceof d7.r)) {
                    throw p6.m.l(null, String.format("Value \"any-setter\" '%s' not `ObjectNode` but %s", k(), i7.h.Y(objO.getClass())));
                }
                rVarK = (d7.r) objO;
            }
            rVarK.f0(str, nVar);
        }

        @Override // s6.t
        public t p(p6.l lVar) {
            return this;
        }
    }
}
