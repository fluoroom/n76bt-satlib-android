package b7;

import a7.c;
import com.fasterxml.jackson.databind.JavaType;
import d6.e0;
import java.util.Collection;
import p6.b0;

/* JADX INFO: loaded from: classes.dex */
public class p implements a7.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e0.b f3708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e0.a f3709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f3710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f3711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Class f3712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected a7.f f3713f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f3715b;

        static {
            int[] iArr = new int[e0.b.values().length];
            f3715b = iArr;
            try {
                iArr[e0.b.DEDUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3715b[e0.b.CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3715b[e0.b.MINIMAL_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3715b[e0.b.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3715b[e0.b.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3715b[e0.b.CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[e0.a.values().length];
            f3714a = iArr2;
            try {
                iArr2[e0.a.WRAPPER_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3714a[e0.a.PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3714a[e0.a.WRAPPER_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3714a[e0.a.EXTERNAL_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3714a[e0.a.EXISTING_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public p() {
        this.f3711d = false;
    }

    public static p r() {
        return new p().h(e0.b.NONE, null);
    }

    @Override // a7.g
    public a7.e b(p6.g gVar, JavaType javaType, Collection collection) {
        if (this.f3708a == e0.b.NONE) {
            return null;
        }
        if (javaType.W() && !l(gVar, javaType)) {
            return null;
        }
        a7.f fVarO = o(gVar, javaType, w(gVar, javaType), collection, false, true);
        JavaType javaTypeN = n(gVar, javaType);
        if (this.f3708a == e0.b.DEDUCTION) {
            return new c(javaType, fVarO, javaTypeN, gVar, collection);
        }
        int i10 = a.f3714a[this.f3709b.ordinal()];
        if (i10 == 1) {
            return new b7.a(javaType, fVarO, this.f3710c, this.f3711d, javaTypeN);
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return new j(javaType, fVarO, this.f3710c, this.f3711d, javaTypeN);
            }
            if (i10 == 4) {
                return new f(javaType, fVarO, this.f3710c, this.f3711d, javaTypeN);
            }
            if (i10 != 5) {
                throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.f3709b);
            }
        }
        return new h(javaType, fVarO, this.f3710c, this.f3711d, javaTypeN, this.f3709b, k(gVar, javaType));
    }

    @Override // a7.g
    public a7.h e(b0 b0Var, JavaType javaType, Collection collection) {
        if (this.f3708a == e0.b.NONE) {
            return null;
        }
        if (javaType.W() && !l(b0Var, javaType)) {
            return null;
        }
        if (this.f3708a == e0.b.DEDUCTION) {
            return d.n();
        }
        a7.f fVarO = o(b0Var, javaType, t(b0Var), collection, true, false);
        int i10 = a.f3714a[this.f3709b.ordinal()];
        if (i10 == 1) {
            return new b(fVarO, null);
        }
        if (i10 == 2) {
            return new i(fVarO, null, this.f3710c);
        }
        if (i10 == 3) {
            return new k(fVarO, null);
        }
        if (i10 == 4) {
            return new g(fVarO, null, this.f3710c);
        }
        if (i10 == 5) {
            return new e(fVarO, null, this.f3710c);
        }
        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.f3709b);
    }

    @Override // a7.g
    public Class i() {
        return this.f3712e;
    }

    protected boolean j(p6.g gVar, JavaType javaType) {
        return gVar.g().p0(gVar, x6.e.m(gVar, javaType.r()), javaType) != null;
    }

    protected boolean k(p6.g gVar, JavaType javaType) {
        if (gVar.L(p6.r.REQUIRE_TYPE_ID_FOR_SUBTYPES)) {
            return true;
        }
        return j(gVar, javaType);
    }

    protected boolean l(r6.q qVar, JavaType javaType) {
        return false;
    }

    @Override // a7.g
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public p d(Class cls) {
        this.f3712e = cls;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r4.C(r2.f3712e) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.fasterxml.jackson.databind.JavaType n(p6.g r3, com.fasterxml.jackson.databind.JavaType r4) {
        /*
            r2 = this;
            java.lang.Class r0 = r2.f3712e
            if (r0 == 0) goto L3b
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            if (r0 == r1) goto L30
            java.lang.Class<q6.k> r1 = q6.k.class
            if (r0 != r1) goto Ld
            goto L30
        Ld:
            boolean r0 = r4.C(r0)
            if (r0 == 0) goto L14
            goto L2f
        L14:
            java.lang.Class r0 = r2.f3712e
            boolean r0 = r4.a0(r0)
            if (r0 == 0) goto L27
            com.fasterxml.jackson.databind.type.c r3 = r3.D()
            java.lang.Class r0 = r2.f3712e
            com.fasterxml.jackson.databind.JavaType r3 = r3.O(r4, r0)
            return r3
        L27:
            java.lang.Class r0 = r2.f3712e
            boolean r0 = r4.C(r0)
            if (r0 == 0) goto L3b
        L2f:
            return r4
        L30:
            com.fasterxml.jackson.databind.type.c r3 = r3.D()
            java.lang.Class r4 = r2.f3712e
            com.fasterxml.jackson.databind.JavaType r3 = r3.R(r4)
            return r3
        L3b:
            p6.r r0 = p6.r.USE_BASE_TYPE_AS_DEFAULT_IMPL
            boolean r3 = r3.L(r0)
            if (r3 == 0) goto L4a
            boolean r3 = r4.D()
            if (r3 != 0) goto L4a
            return r4
        L4a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.p.n(p6.g, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JavaType");
    }

    protected a7.f o(r6.q qVar, JavaType javaType, a7.c cVar, Collection collection, boolean z10, boolean z11) {
        a7.f fVar = this.f3713f;
        if (fVar != null) {
            return fVar;
        }
        e0.b bVar = this.f3708a;
        if (bVar == null) {
            throw new IllegalStateException("Cannot build, 'init()' not yet called");
        }
        int i10 = a.f3715b[bVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return l.i(javaType, qVar, cVar);
        }
        if (i10 == 3) {
            return n.j(javaType, qVar, cVar);
        }
        if (i10 == 4) {
            return t.i(qVar, javaType, collection, z10, z11);
        }
        if (i10 == 5) {
            return null;
        }
        throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this.f3708a);
    }

    @Override // a7.g
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public p g(e0.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("includeAs cannot be null");
        }
        this.f3709b = aVar;
        return this;
    }

    @Override // a7.g
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public p h(e0.b bVar, a7.f fVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("idType cannot be null");
        }
        this.f3708a = bVar;
        this.f3713f = fVar;
        this.f3710c = bVar.a();
        return this;
    }

    protected a7.c s(r6.q qVar, JavaType javaType, a7.c cVar) {
        throw new IllegalArgumentException(String.format("Configured `PolymorphicTypeValidator` (of type %s) denied resolution of all subtypes of base type %s", i7.h.h(cVar), i7.h.h(javaType.r())));
    }

    public a7.c t(r6.q qVar) {
        return qVar.z();
    }

    @Override // a7.g
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public p a(boolean z10) {
        this.f3711d = z10;
        return this;
    }

    @Override // a7.g
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public p c(String str) {
        if (str == null || str.isEmpty()) {
            str = this.f3708a.a();
        }
        this.f3710c = str;
        return this;
    }

    protected a7.c w(r6.q qVar, JavaType javaType) {
        a7.c cVarT = t(qVar);
        e0.b bVar = this.f3708a;
        if (bVar == e0.b.CLASS || bVar == e0.b.MINIMAL_CLASS) {
            c.b bVarA = cVarT.a(qVar, javaType);
            if (bVarA == c.b.DENIED) {
                return s(qVar, javaType, cVarT);
            }
            if (bVarA == c.b.ALLOWED) {
                return m.f3704a;
            }
        }
        return cVarT;
    }

    @Override // a7.g
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public p f(Class cls) {
        if (this.f3712e == cls) {
            return this;
        }
        i7.h.o0(p.class, this, "withDefaultImpl");
        return new p(this, cls);
    }

    protected p(p pVar, Class cls) {
        this.f3711d = false;
        this.f3708a = pVar.f3708a;
        this.f3709b = pVar.f3709b;
        this.f3710c = pVar.f3710c;
        this.f3711d = pVar.f3711d;
        this.f3713f = pVar.f3713f;
        this.f3712e = cls;
    }
}
