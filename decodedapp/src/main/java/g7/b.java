package g7;

import com.fasterxml.jackson.databind.JavaType;
import f7.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends e7.h implements e7.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JavaType f13566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final p6.d f13567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final boolean f13568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final Boolean f13569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final a7.h f13570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final p6.p f13571h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected f7.k f13572r;

    protected b(Class cls, JavaType javaType, boolean z10, a7.h hVar, p6.p pVar) {
        this(cls, javaType, z10, hVar, null, pVar, null);
    }

    protected final p6.p A(f7.k kVar, JavaType javaType, p6.d0 d0Var) {
        k.d dVarG = kVar.g(javaType, d0Var, this.f13567d);
        f7.k kVar2 = dVarG.f12864b;
        if (kVar != kVar2) {
            this.f13572r = kVar2;
        }
        return dVarG.f12863a;
    }

    protected final p6.p C(f7.k kVar, Class cls, p6.d0 d0Var) {
        k.d dVarH = kVar.h(cls, d0Var, this.f13567d);
        f7.k kVar2 = dVarH.f12864b;
        if (kVar != kVar2) {
            this.f13572r = kVar2;
        }
        return dVarH.f12863a;
    }

    protected abstract void D(Object obj, e6.g gVar, p6.d0 d0Var);

    public abstract b G(p6.d dVar, a7.h hVar, p6.p pVar, Boolean bool);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // e7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p6.p a(p6.d0 r6, p6.d r7) {
        /*
            r5 = this;
            a7.h r0 = r5.f13570g
            if (r0 == 0) goto L8
            a7.h r0 = r0.a(r7)
        L8:
            r1 = 0
            if (r7 == 0) goto L20
            p6.b r2 = r6.i0()
            x6.k r3 = r7.h()
            if (r3 == 0) goto L20
            java.lang.Object r2 = r2.g(r3)
            if (r2 == 0) goto L20
            p6.p r2 = r6.G0(r3, r2)
            goto L21
        L20:
            r2 = r1
        L21:
            java.lang.Class r3 = r5.c()
            d6.k$d r3 = r5.q(r6, r7, r3)
            if (r3 == 0) goto L31
            d6.k$a r1 = d6.k.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r1 = r3.e(r1)
        L31:
            if (r2 != 0) goto L35
            p6.p r2 = r5.f13571h
        L35:
            p6.p r2 = r5.n(r6, r7, r2)
            if (r2 != 0) goto L4f
            com.fasterxml.jackson.databind.JavaType r3 = r5.f13566c
            if (r3 == 0) goto L4f
            boolean r4 = r5.f13568e
            if (r4 == 0) goto L4f
            boolean r3 = r3.S()
            if (r3 != 0) goto L4f
            com.fasterxml.jackson.databind.JavaType r2 = r5.f13566c
            p6.p r2 = r6.Q(r2, r7)
        L4f:
            p6.p r6 = r5.f13571h
            if (r2 != r6) goto L65
            p6.d r6 = r5.f13567d
            if (r7 != r6) goto L65
            a7.h r6 = r5.f13570g
            if (r6 != r0) goto L65
            java.lang.Boolean r6 = r5.f13569f
            boolean r6 = j$.util.Objects.equals(r6, r1)
            if (r6 != 0) goto L64
            goto L65
        L64:
            return r5
        L65:
            g7.b r6 = r5.G(r7, r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.b.a(p6.d0, p6.d):p6.p");
    }

    @Override // p6.p
    public void g(Object obj, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
        n6.c cVarG = hVar.g(gVar, hVar.d(obj, e6.m.START_ARRAY));
        gVar.H(obj);
        D(obj, gVar, d0Var);
        hVar.h(gVar, cVarG);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(Class cls, JavaType javaType, boolean z10, a7.h hVar, p6.d dVar, p6.p pVar, Boolean bool) {
        super(cls, false);
        boolean z11 = false;
        this.f13566c = javaType;
        if (z10 || (javaType != null && javaType.Q())) {
            z11 = true;
        }
        this.f13568e = z11;
        this.f13570g = hVar;
        this.f13567d = dVar;
        this.f13571h = pVar;
        this.f13572r = f7.k.c();
        this.f13569f = bool;
    }

    protected b(b bVar, p6.d dVar, a7.h hVar, p6.p pVar, Boolean bool) {
        super(bVar);
        this.f13566c = bVar.f13566c;
        this.f13568e = bVar.f13568e;
        this.f13570g = hVar;
        this.f13567d = dVar;
        this.f13571h = pVar;
        this.f13572r = f7.k.c();
        this.f13569f = bool;
    }
}
