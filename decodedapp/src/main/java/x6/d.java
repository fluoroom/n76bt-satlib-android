package x6;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import x6.v;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b implements j0 {

    /* JADX INFO: renamed from: x */
    private static final a f31663x;

    /* JADX INFO: renamed from: a */
    protected final JavaType f31664a;

    /* JADX INFO: renamed from: b */
    protected final Class f31665b;

    /* JADX INFO: renamed from: c */
    protected final com.fasterxml.jackson.databind.type.b f31666c;

    /* JADX INFO: renamed from: d */
    protected final List f31667d;

    /* JADX INFO: renamed from: e */
    protected final p6.b f31668e;

    /* JADX INFO: renamed from: f */
    protected final com.fasterxml.jackson.databind.type.c f31669f;

    /* JADX INFO: renamed from: g */
    protected final v.a f31670g;

    /* JADX INFO: renamed from: h */
    protected final Class f31671h;

    /* JADX INFO: renamed from: r */
    protected final boolean f31672r;

    /* JADX INFO: renamed from: s */
    protected final i7.b f31673s;

    /* JADX INFO: renamed from: t */
    protected a f31674t;

    /* JADX INFO: renamed from: u */
    protected n f31675u;

    /* JADX INFO: renamed from: v */
    protected List f31676v;

    /* JADX INFO: renamed from: w */
    protected transient Boolean f31677w;

    public static final class a {

        /* JADX INFO: renamed from: a */
        public final f f31678a;

        /* JADX INFO: renamed from: b */
        public final List f31679b;

        /* JADX INFO: renamed from: c */
        public final List f31680c;

        public a(f fVar, List list, List list2) {
            this.f31678a = fVar;
            this.f31679b = list;
            this.f31680c = list2;
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f31663x = new a(null, list, list);
    }

    d(JavaType javaType, Class cls, List list, Class cls2, i7.b bVar, com.fasterxml.jackson.databind.type.b bVar2, p6.b bVar3, v.a aVar, com.fasterxml.jackson.databind.type.c cVar, boolean z10) {
        this.f31664a = javaType;
        this.f31665b = cls;
        this.f31667d = list;
        this.f31671h = cls2;
        this.f31673s = bVar;
        this.f31666c = bVar2;
        this.f31668e = bVar3;
        this.f31670g = aVar;
        this.f31669f = cVar;
        this.f31672r = z10;
    }

    private final a i() {
        d dVar;
        a aVarP;
        a aVar = this.f31674t;
        if (aVar != null) {
            return aVar;
        }
        JavaType javaType = this.f31664a;
        if (javaType == null) {
            aVarP = f31663x;
            dVar = this;
        } else {
            dVar = this;
            aVarP = h.p(this.f31668e, this.f31669f, dVar, javaType, this.f31671h, this.f31672r);
        }
        dVar.f31674t = aVarP;
        return aVarP;
    }

    private final List j() {
        d dVar;
        List listM;
        List list = this.f31676v;
        if (list != null) {
            return list;
        }
        JavaType javaType = this.f31664a;
        if (javaType == null) {
            listM = Collections.EMPTY_LIST;
            dVar = this;
        } else {
            dVar = this;
            listM = j.m(this.f31668e, dVar, this.f31670g, this.f31669f, javaType, this.f31672r);
        }
        dVar.f31676v = listM;
        return listM;
    }

    private final n k() {
        d dVar;
        n nVarM;
        n nVar = this.f31675u;
        if (nVar != null) {
            return nVar;
        }
        JavaType javaType = this.f31664a;
        if (javaType == null) {
            nVarM = new n();
            dVar = this;
        } else {
            dVar = this;
            nVarM = m.m(this.f31668e, dVar, this.f31670g, this.f31669f, javaType, this.f31667d, this.f31671h, this.f31672r);
        }
        dVar.f31675u = nVarM;
        return nVarM;
    }

    @Override // x6.j0
    public JavaType a(Type type) {
        return this.f31669f.Z(type, this.f31666c);
    }

    @Override // x6.b
    public Annotation c(Class cls) {
        return this.f31673s.a(cls);
    }

    @Override // x6.b
    public String d() {
        return this.f31665b.getName();
    }

    @Override // x6.b
    public Class e() {
        return this.f31665b;
    }

    @Override // x6.b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return i7.h.H(obj, d.class) && ((d) obj).f31665b == this.f31665b;
    }

    @Override // x6.b
    public JavaType f() {
        return this.f31664a;
    }

    @Override // x6.b
    public boolean g(Class cls) {
        return this.f31673s.b(cls);
    }

    @Override // x6.b
    public boolean h(Class[] clsArr) {
        return this.f31673s.c(clsArr);
    }

    @Override // x6.b
    public int hashCode() {
        return this.f31665b.getName().hashCode();
    }

    public Iterable l() {
        return j();
    }

    public l n(String str, Class[] clsArr) {
        return k().b(str, clsArr);
    }

    public Class o() {
        return this.f31665b;
    }

    public i7.b p() {
        return this.f31673s;
    }

    public List q() {
        return i().f31679b;
    }

    public f r() {
        return i().f31678a;
    }

    public List s() {
        return i().f31680c;
    }

    public boolean t() {
        return this.f31673s.size() > 0;
    }

    @Override // x6.b
    public String toString() {
        return "[AnnotedClass " + this.f31665b.getName() + "]";
    }

    public boolean v() {
        Boolean boolValueOf = this.f31677w;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(i7.h.R(this.f31665b));
            this.f31677w = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public Iterable w() {
        return k();
    }

    d(Class cls) {
        this.f31664a = null;
        this.f31665b = cls;
        this.f31667d = Collections.EMPTY_LIST;
        this.f31671h = null;
        this.f31673s = q.d();
        this.f31666c = com.fasterxml.jackson.databind.type.b.i();
        this.f31668e = null;
        this.f31670g = null;
        this.f31669f = null;
        this.f31672r = false;
    }
}
