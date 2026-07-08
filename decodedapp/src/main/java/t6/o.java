package t6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class o extends s6.u {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final x6.l f27526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected final transient Method f27527y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected final boolean f27528z;

    public o(x6.u uVar, JavaType javaType, a7.e eVar, i7.b bVar, x6.l lVar) {
        super(uVar, javaType, eVar, bVar);
        this.f27526x = lVar;
        this.f27527y = lVar.b();
        this.f27528z = q.d(this.f26968r);
    }

    @Override // s6.u
    public final void L(Object obj, Object obj2) throws IOException {
        try {
            this.f27527y.invoke(obj, obj2);
        } catch (Exception e10) {
            j(e10, obj2);
        }
    }

    @Override // s6.u
    public Object N(Object obj, Object obj2) throws IOException {
        try {
            Object objInvoke = this.f27527y.invoke(obj, obj2);
            return objInvoke == null ? obj : objInvoke;
        } catch (Exception e10) {
            j(e10, obj2);
            return null;
        }
    }

    @Override // s6.u
    public s6.u T(p6.y yVar) {
        return new o(this, yVar);
    }

    @Override // s6.u
    public s6.u W(s6.r rVar) {
        return new o(this, this.f26966g, rVar);
    }

    @Override // s6.u
    public s6.u Y(p6.l lVar) {
        p6.l lVar2 = this.f26966g;
        if (lVar2 == lVar) {
            return this;
        }
        s6.r rVar = this.f26968r;
        if (lVar2 == rVar) {
            rVar = lVar;
        }
        return new o(this, lVar, rVar);
    }

    @Override // s6.u, p6.d
    public x6.k h() {
        return this.f27526x;
    }

    @Override // s6.u
    public void n(e6.j jVar, p6.h hVar, Object obj) throws IOException {
        Object objG;
        if (!jVar.N0(e6.m.VALUE_NULL)) {
            a7.e eVar = this.f26967h;
            if (eVar == null) {
                Object objE = this.f26966g.e(jVar, hVar);
                if (objE != null) {
                    objG = objE;
                } else if (this.f27528z) {
                    return;
                } else {
                    objG = this.f26968r.a(hVar);
                }
            } else {
                objG = this.f26966g.g(jVar, hVar, eVar);
            }
        } else if (this.f27528z) {
            return;
        } else {
            objG = this.f26968r.a(hVar);
        }
        try {
            this.f27527y.invoke(obj, objG);
        } catch (Exception e10) {
            i(jVar, e10, objG);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[RETURN] */
    @Override // s6.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(e6.j r4, p6.h r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r3 = this;
            e6.m r0 = e6.m.VALUE_NULL
            boolean r0 = r4.N0(r0)
            if (r0 == 0) goto L14
            boolean r0 = r3.f27528z
            if (r0 == 0) goto Ld
            goto L42
        Ld:
            s6.r r0 = r3.f26968r
            java.lang.Object r5 = r0.a(r5)
            goto L34
        L14:
            a7.e r0 = r3.f26967h
            if (r0 != 0) goto L2e
            p6.l r0 = r3.f26966g
            java.lang.Object r0 = r0.e(r4, r5)
            if (r0 != 0) goto L2c
            boolean r0 = r3.f27528z
            if (r0 == 0) goto L25
            goto L42
        L25:
            s6.r r0 = r3.f26968r
            java.lang.Object r5 = r0.a(r5)
            goto L34
        L2c:
            r5 = r0
            goto L34
        L2e:
            p6.l r1 = r3.f26966g
            java.lang.Object r5 = r1.g(r4, r5, r0)
        L34:
            java.lang.reflect.Method r0 = r3.f27527y     // Catch: java.lang.Exception -> L44
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L44
            r2 = 0
            r1[r2] = r5     // Catch: java.lang.Exception -> L44
            java.lang.Object r4 = r0.invoke(r6, r1)     // Catch: java.lang.Exception -> L44
            if (r4 != 0) goto L43
        L42:
            return r6
        L43:
            return r4
        L44:
            r6 = move-exception
            r3.i(r4, r6, r5)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.o.o(e6.j, p6.h, java.lang.Object):java.lang.Object");
    }

    @Override // s6.u
    public void q(p6.g gVar) {
        this.f27526x.i(gVar.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    protected o(o oVar, p6.l lVar, s6.r rVar) {
        super(oVar, lVar, rVar);
        this.f27526x = oVar.f27526x;
        this.f27527y = oVar.f27527y;
        this.f27528z = q.d(rVar);
    }

    protected o(o oVar, p6.y yVar) {
        super(oVar, yVar);
        this.f27526x = oVar.f27526x;
        this.f27527y = oVar.f27527y;
        this.f27528z = oVar.f27528z;
    }
}
