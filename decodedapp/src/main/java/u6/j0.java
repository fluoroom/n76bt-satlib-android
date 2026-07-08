package u6;

import com.fasterxml.jackson.databind.JavaType;
import j$.util.Objects;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends j implements s6.i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final p6.l f28260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final s6.w f28261s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final p6.l f28262t;

    public j0(JavaType javaType, p6.l lVar, s6.w wVar) {
        this(javaType, wVar, null, lVar, lVar, null);
    }

    private Collection i1(e6.j jVar, p6.h hVar, Collection collection, p6.l lVar) throws p6.m {
        String str;
        while (true) {
            try {
                if (jVar.W0() == null) {
                    e6.m mVarN = jVar.n();
                    if (mVarN == e6.m.END_ARRAY) {
                        return collection;
                    }
                    if (mVarN != e6.m.VALUE_NULL) {
                        str = (String) lVar.e(jVar, hVar);
                    } else if (!this.f28258g) {
                        str = (String) this.f28257f.a(hVar);
                    }
                } else {
                    str = (String) lVar.e(jVar, hVar);
                }
                collection.add(str);
            } catch (Exception e10) {
                throw p6.m.r(e10, collection, collection.size());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4 A[Catch: Exception -> 0x00ab, TRY_ENTER, TryCatch #0 {Exception -> 0x00ab, blocks: (B:37:0x00a4, B:40:0x00ae), top: B:46:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae A[Catch: Exception -> 0x00ab, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ab, blocks: (B:37:0x00a4, B:40:0x00ae), top: B:46:0x00a2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Collection j1(e6.j r11, p6.h r12, java.util.Collection r13) throws p6.m {
        /*
            r10 = this;
            java.lang.Boolean r0 = r10.f28259h
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 == r1) goto L29
            if (r0 != 0) goto L11
            p6.i r0 = p6.i.ACCEPT_SINGLE_VALUE_AS_ARRAY
            boolean r0 = r12.D0(r0)
            if (r0 == 0) goto L11
            goto L29
        L11:
            e6.m r13 = e6.m.VALUE_STRING
            boolean r13 = r11.N0(r13)
            if (r13 == 0) goto L20
            java.lang.Object r11 = r10.Y(r11, r12)
            java.util.Collection r11 = (java.util.Collection) r11
            return r11
        L20:
            com.fasterxml.jackson.databind.JavaType r13 = r10.f28256e
            java.lang.Object r11 = r12.q0(r13, r11)
            java.util.Collection r11 = (java.util.Collection) r11
            return r11
        L29:
            p6.l r0 = r10.f28260r
            e6.m r1 = r11.n()
            e6.m r2 = e6.m.VALUE_NULL
            if (r1 != r2) goto L43
            boolean r11 = r10.f28258g
            if (r11 == 0) goto L38
            return r13
        L38:
            s6.r r11 = r10.f28257f
            java.lang.Object r11 = r11.a(r12)
            java.lang.String r11 = (java.lang.String) r11
            r1 = r10
            goto Lb4
        L43:
            e6.m r1 = e6.m.VALUE_STRING
            boolean r1 = r11.N0(r1)
            if (r1 == 0) goto L77
            java.lang.String r1 = r11.C0()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L7b
            h7.c r1 = r10.r()
            java.lang.Class r2 = r10.p()
            r6.e r3 = r6.e.EmptyString
            r6.b r7 = r12.N(r1, r2, r3)
            r6.b r1 = r6.b.Fail
            if (r7 == r1) goto L77
            java.lang.Class r8 = r10.p()
            java.lang.String r9 = "empty String (\"\")"
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.Object r11 = r4.X(r5, r6, r7, r8, r9)
            java.util.Collection r11 = (java.util.Collection) r11
            return r11
        L77:
            r1 = r10
            r2 = r11
            r3 = r12
            goto La2
        L7b:
            r2 = r11
            r3 = r12
            boolean r11 = u6.c0.g0(r1)
            if (r11 == 0) goto La1
            h7.c r11 = r10.r()
            java.lang.Class r12 = r10.p()
            r6.b r1 = r6.b.Fail
            r6.b r4 = r3.O(r11, r12, r1)
            if (r4 == r1) goto La1
            java.lang.Class r5 = r10.p()
            java.lang.String r6 = "blank String (all whitespace)"
            r1 = r10
            java.lang.Object r11 = r1.X(r2, r3, r4, r5, r6)
            java.util.Collection r11 = (java.util.Collection) r11
            return r11
        La1:
            r1 = r10
        La2:
            if (r0 != 0) goto Lae
            s6.r r11 = r1.f28257f     // Catch: java.lang.Exception -> Lab
            java.lang.String r11 = r10.J0(r2, r3, r11)     // Catch: java.lang.Exception -> Lab
            goto Lb4
        Lab:
            r0 = move-exception
            r11 = r0
            goto Lb8
        Lae:
            java.lang.Object r11 = r0.e(r2, r3)     // Catch: java.lang.Exception -> Lab
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Exception -> Lab
        Lb4:
            r13.add(r11)
            return r13
        Lb8:
            int r12 = r13.size()
            p6.m r11 = p6.m.r(r11, r13, r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.j0.j1(e6.j, p6.h, java.util.Collection):java.util.Collection");
    }

    @Override // u6.c0
    public s6.w W0() {
        return this.f28261s;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    @Override // s6.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p6.l d(p6.h r6, p6.d r7) {
        /*
            r5 = this;
            s6.w r0 = r5.f28261s
            r1 = 0
            if (r0 == 0) goto L31
            x6.p r0 = r0.G()
            if (r0 == 0) goto L1a
            s6.w r0 = r5.f28261s
            p6.g r2 = r6.k()
            com.fasterxml.jackson.databind.JavaType r0 = r0.H(r2)
            p6.l r0 = r5.S0(r6, r0, r7)
            goto L32
        L1a:
            s6.w r0 = r5.f28261s
            x6.p r0 = r0.L()
            if (r0 == 0) goto L31
            s6.w r0 = r5.f28261s
            p6.g r2 = r6.k()
            com.fasterxml.jackson.databind.JavaType r0 = r0.N(r2)
            p6.l r0 = r5.S0(r6, r0, r7)
            goto L32
        L31:
            r0 = r1
        L32:
            p6.l r2 = r5.f28260r
            com.fasterxml.jackson.databind.JavaType r3 = r5.f28256e
            com.fasterxml.jackson.databind.JavaType r3 = r3.k()
            if (r2 != 0) goto L47
            p6.l r2 = r5.R0(r6, r7, r2)
            if (r2 != 0) goto L4b
            p6.l r2 = r6.Q(r3, r7)
            goto L4b
        L47:
            p6.l r2 = r6.p0(r2, r7, r3)
        L4b:
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            d6.k$a r4 = d6.k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY
            java.lang.Boolean r3 = r5.T0(r6, r7, r3, r4)
            s6.r r6 = r5.P0(r6, r7, r2)
            boolean r7 = r5.c1(r2)
            if (r7 == 0) goto L5e
            goto L5f
        L5e:
            r1 = r2
        L5f:
            u6.j0 r6 = r5.k1(r0, r1, r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.j0.d(p6.h, p6.d):p6.l");
    }

    @Override // u6.j
    public p6.l e1() {
        return this.f28260r;
    }

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return eVar.d(jVar, hVar);
    }

    @Override // p6.l
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public Collection e(e6.j jVar, p6.h hVar) {
        p6.l lVar = this.f28262t;
        return lVar != null ? (Collection) this.f28261s.D(hVar, lVar.e(jVar, hVar)) : f(jVar, hVar, (Collection) this.f28261s.A(hVar));
    }

    @Override // p6.l
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public Collection f(e6.j jVar, p6.h hVar, Collection collection) throws p6.m {
        String strJ0;
        if (!jVar.S0()) {
            return j1(jVar, hVar, collection);
        }
        p6.l lVar = this.f28260r;
        if (lVar != null) {
            return i1(jVar, hVar, collection, lVar);
        }
        while (true) {
            try {
                String strW0 = jVar.W0();
                if (strW0 != null) {
                    collection.add(strW0);
                } else {
                    e6.m mVarN = jVar.n();
                    if (mVarN == e6.m.END_ARRAY) {
                        return collection;
                    }
                    if (mVarN != e6.m.VALUE_NULL) {
                        strJ0 = J0(jVar, hVar, this.f28257f);
                    } else if (!this.f28258g) {
                        strJ0 = (String) this.f28257f.a(hVar);
                    }
                    collection.add(strJ0);
                }
            } catch (Exception e10) {
                throw p6.m.r(e10, collection, collection.size());
            }
        }
    }

    protected j0 k1(p6.l lVar, p6.l lVar2, s6.r rVar, Boolean bool) {
        return (Objects.equals(this.f28259h, bool) && this.f28257f == rVar && this.f28260r == lVar2 && this.f28262t == lVar) ? this : new j0(this.f28256e, this.f28261s, lVar, lVar2, rVar, bool);
    }

    @Override // p6.l
    public boolean q() {
        return this.f28260r == null && this.f28262t == null;
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.Collection;
    }

    protected j0(JavaType javaType, s6.w wVar, p6.l lVar, p6.l lVar2, s6.r rVar, Boolean bool) {
        super(javaType, rVar, bool);
        this.f28260r = lVar2;
        this.f28261s = wVar;
        this.f28262t = lVar;
    }
}
