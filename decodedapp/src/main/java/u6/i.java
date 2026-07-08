package u6;

import com.fasterxml.jackson.databind.JavaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import t6.z;

/* JADX INFO: loaded from: classes.dex */
public class i extends j implements s6.i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final p6.l f28241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final a7.e f28242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final s6.w f28243t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final p6.l f28244u;

    private static final class a extends z.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f28245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f28246d;

        a(b bVar, s6.v vVar, Class cls) {
            super(vVar, cls);
            this.f28246d = new ArrayList();
            this.f28245c = bVar;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f28247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Collection f28248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f28249c = new ArrayList();

        public b(Class cls, Collection collection) {
            this.f28247a = cls;
            this.f28248b = collection;
        }

        public void a(Object obj) {
            if (this.f28249c.isEmpty()) {
                this.f28248b.add(obj);
            } else {
                ((a) this.f28249c.get(r0.size() - 1)).f28246d.add(obj);
            }
        }

        public z.a b(s6.v vVar) {
            a aVar = new a(this, vVar, this.f28247a);
            this.f28249c.add(aVar);
            return aVar;
        }
    }

    public i(JavaType javaType, p6.l lVar, a7.e eVar, s6.w wVar) {
        this(javaType, lVar, eVar, wVar, null, null, null);
    }

    @Override // u6.c0
    public s6.w W0() {
        return this.f28243t;
    }

    @Override // u6.j
    public p6.l e1() {
        return this.f28241r;
    }

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return eVar.d(jVar, hVar);
    }

    protected Collection g1(e6.j jVar, p6.h hVar, Collection collection) throws p6.m {
        Object objE;
        jVar.c1(collection);
        p6.l lVar = this.f28241r;
        if (lVar.o() != null) {
            return i1(jVar, hVar, collection);
        }
        a7.e eVar = this.f28242s;
        while (true) {
            e6.m mVarX0 = jVar.X0();
            if (mVarX0 == e6.m.END_ARRAY) {
                return collection;
            }
            try {
                if (mVarX0 != e6.m.VALUE_NULL) {
                    objE = eVar == null ? lVar.e(jVar, hVar) : lVar.g(jVar, hVar, eVar);
                } else if (!this.f28258g) {
                    objE = this.f28257f.a(hVar);
                }
                collection.add(objE);
            } catch (Exception e10) {
                if (hVar != null && !hVar.D0(p6.i.WRAP_EXCEPTIONS)) {
                    i7.h.k0(e10);
                }
                throw p6.m.r(e10, collection, collection.size());
            }
        }
    }

    protected Collection h1(e6.j jVar, p6.h hVar, String str) {
        e6.j jVar2;
        p6.h hVar2;
        Class clsP = p();
        if (str.isEmpty()) {
            r6.b bVarN = hVar.N(r(), clsP, r6.e.EmptyString);
            if (bVarN != null && bVarN != r6.b.Fail) {
                return (Collection) X(jVar, hVar, bVarN, clsP, "empty String (\"\")");
            }
            jVar2 = jVar;
            hVar2 = hVar;
        } else {
            jVar2 = jVar;
            hVar2 = hVar;
            if (c0.g0(str)) {
                h7.c cVarR = r();
                r6.b bVar = r6.b.Fail;
                r6.b bVarO = hVar2.O(cVarR, clsP, bVar);
                if (bVarO != bVar) {
                    return (Collection) X(jVar2, hVar2, bVarO, clsP, "blank String (all whitespace)");
                }
            }
        }
        return n1(jVar2, hVar2, k1(hVar2));
    }

    protected Collection i1(e6.j jVar, p6.h hVar, Collection collection) throws p6.m {
        Object objE;
        if (!jVar.S0()) {
            return n1(jVar, hVar, collection);
        }
        jVar.c1(collection);
        p6.l lVar = this.f28241r;
        a7.e eVar = this.f28242s;
        b bVar = new b(this.f28256e.k().r(), collection);
        while (true) {
            e6.m mVarX0 = jVar.X0();
            if (mVarX0 == e6.m.END_ARRAY) {
                return collection;
            }
            try {
            } catch (s6.v e10) {
                e10.w().a(bVar.b(e10));
            } catch (Exception e11) {
                if (hVar != null && !hVar.D0(p6.i.WRAP_EXCEPTIONS)) {
                    i7.h.k0(e11);
                }
                throw p6.m.r(e11, collection, collection.size());
            }
            if (mVarX0 != e6.m.VALUE_NULL) {
                objE = eVar == null ? lVar.e(jVar, hVar) : lVar.g(jVar, hVar, eVar);
            } else if (!this.f28258g) {
                objE = this.f28257f.a(hVar);
            }
            bVar.a(objE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    @Override // s6.i
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u6.i d(p6.h r8, p6.d r9) throws v6.b {
        /*
            r7 = this;
            s6.w r0 = r7.f28243t
            if (r0 == 0) goto L6e
            boolean r0 = r0.k()
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L3a
            s6.w r0 = r7.f28243t
            p6.g r4 = r8.k()
            com.fasterxml.jackson.databind.JavaType r0 = r0.N(r4)
            if (r0 != 0) goto L34
            com.fasterxml.jackson.databind.JavaType r4 = r7.f28256e
            s6.w r5 = r7.f28243t
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r4
            r3[r1] = r5
            java.lang.String r1 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r8.q(r4, r1)
        L34:
            p6.l r0 = r7.S0(r8, r0, r9)
        L38:
            r2 = r0
            goto L70
        L3a:
            s6.w r0 = r7.f28243t
            boolean r0 = r0.i()
            if (r0 == 0) goto L6e
            s6.w r0 = r7.f28243t
            p6.g r4 = r8.k()
            com.fasterxml.jackson.databind.JavaType r0 = r0.H(r4)
            if (r0 != 0) goto L69
            com.fasterxml.jackson.databind.JavaType r4 = r7.f28256e
            s6.w r5 = r7.f28243t
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r4
            r3[r1] = r5
            java.lang.String r1 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r8.q(r4, r1)
        L69:
            p6.l r0 = r7.S0(r8, r0, r9)
            goto L38
        L6e:
            r0 = 0
            goto L38
        L70:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            d6.k$a r1 = d6.k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY
            java.lang.Boolean r6 = r7.T0(r8, r9, r0, r1)
            p6.l r0 = r7.f28241r
            p6.l r0 = r7.R0(r8, r9, r0)
            com.fasterxml.jackson.databind.JavaType r1 = r7.f28256e
            com.fasterxml.jackson.databind.JavaType r1 = r1.k()
            if (r0 != 0) goto L8c
            p6.l r0 = r8.Q(r1, r9)
        L8a:
            r3 = r0
            goto L91
        L8c:
            p6.l r0 = r8.p0(r0, r9, r1)
            goto L8a
        L91:
            a7.e r0 = r7.f28242s
            if (r0 == 0) goto L99
            a7.e r0 = r0.g(r9)
        L99:
            r4 = r0
            s6.r r5 = r7.P0(r8, r9, r3)
            java.lang.Boolean r8 = r7.f28259h
            boolean r8 = j$.util.Objects.equals(r6, r8)
            if (r8 == 0) goto Lb6
            s6.r r8 = r7.f28257f
            if (r5 != r8) goto Lb6
            p6.l r8 = r7.f28244u
            if (r2 != r8) goto Lb6
            p6.l r8 = r7.f28241r
            if (r3 != r8) goto Lb6
            a7.e r8 = r7.f28242s
            if (r4 == r8) goto Lb8
        Lb6:
            r1 = r7
            goto Lb9
        Lb8:
            return r7
        Lb9:
            u6.i r8 = r1.o1(r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.i.d(p6.h, p6.d):u6.i");
    }

    protected Collection k1(p6.h hVar) {
        return (Collection) this.f28243t.A(hVar);
    }

    @Override // p6.l
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public Collection e(e6.j jVar, p6.h hVar) {
        p6.l lVar = this.f28244u;
        return lVar != null ? (Collection) this.f28243t.D(hVar, lVar.e(jVar, hVar)) : jVar.S0() ? g1(jVar, hVar, k1(hVar)) : jVar.N0(e6.m.VALUE_STRING) ? h1(jVar, hVar, jVar.C0()) : n1(jVar, hVar, k1(hVar));
    }

    @Override // p6.l
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public Collection f(e6.j jVar, p6.h hVar, Collection collection) {
        return jVar.S0() ? g1(jVar, hVar, collection) : n1(jVar, hVar, collection);
    }

    protected final Collection n1(e6.j jVar, p6.h hVar, Collection collection) throws p6.m {
        Object objE;
        Boolean bool = this.f28259h;
        if (bool != Boolean.TRUE && (bool != null || !hVar.D0(p6.i.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (Collection) hVar.q0(this.f28256e, jVar);
        }
        p6.l lVar = this.f28241r;
        a7.e eVar = this.f28242s;
        try {
            if (!jVar.N0(e6.m.VALUE_NULL)) {
                objE = eVar == null ? lVar.e(jVar, hVar) : lVar.g(jVar, hVar, eVar);
            } else {
                if (this.f28258g) {
                    return collection;
                }
                objE = this.f28257f.a(hVar);
            }
            collection.add(objE);
            return collection;
        } catch (Exception e10) {
            if (!hVar.D0(p6.i.WRAP_EXCEPTIONS)) {
                i7.h.k0(e10);
            }
            throw p6.m.r(e10, Object.class, collection.size());
        }
    }

    protected i o1(p6.l lVar, p6.l lVar2, a7.e eVar, s6.r rVar, Boolean bool) {
        return new i(this.f28256e, lVar2, eVar, this.f28243t, lVar, rVar, bool);
    }

    @Override // p6.l
    public boolean q() {
        return this.f28241r == null && this.f28242s == null && this.f28244u == null;
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.Collection;
    }

    protected i(JavaType javaType, p6.l lVar, a7.e eVar, s6.w wVar, p6.l lVar2, s6.r rVar, Boolean bool) {
        super(javaType, rVar, bool);
        this.f28241r = lVar;
        this.f28242s = eVar;
        this.f28243t = wVar;
        this.f28244u = lVar2;
    }
}
