package g7;

import com.fasterxml.jackson.databind.JavaType;
import f7.k;
import j$.util.Objects;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class x extends a implements e7.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final boolean f13654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final JavaType f13655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final a7.h f13656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected p6.p f13657h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected f7.k f13658r;

    public x(JavaType javaType, boolean z10, a7.h hVar, p6.p pVar) {
        super(Object[].class);
        this.f13655f = javaType;
        this.f13654e = z10;
        this.f13656g = hVar;
        this.f13658r = f7.k.c();
        this.f13657h = pVar;
    }

    @Override // g7.a
    public p6.p C(p6.d dVar, Boolean bool) {
        return new x(this, dVar, this.f13656g, this.f13657h, bool);
    }

    protected final p6.p G(f7.k kVar, JavaType javaType, p6.d0 d0Var) {
        k.d dVarG = kVar.g(javaType, d0Var, this.f13563c);
        f7.k kVar2 = dVarG.f12864b;
        if (kVar != kVar2) {
            this.f13658r = kVar2;
        }
        return dVarG.f12863a;
    }

    protected final p6.p H(f7.k kVar, Class cls, p6.d0 d0Var) {
        k.d dVarH = kVar.h(cls, d0Var, this.f13563c);
        f7.k kVar2 = dVarH.f12864b;
        if (kVar != kVar2) {
            this.f13658r = kVar2;
        }
        return dVarH.f12863a;
    }

    @Override // p6.p
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public boolean d(p6.d0 d0Var, Object[] objArr) {
        return objArr.length == 0;
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void f(Object[] objArr, e6.g gVar, p6.d0 d0Var) throws IOException {
        int length = objArr.length;
        if (length == 1 && ((this.f13564d == null && d0Var.y0(p6.c0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f13564d == Boolean.TRUE)) {
            D(objArr, gVar, d0Var);
            return;
        }
        gVar.Y0(objArr, length);
        D(objArr, gVar, d0Var);
        gVar.z0();
    }

    @Override // g7.a
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void D(Object[] objArr, e6.g gVar, p6.d0 d0Var) throws IOException {
        int length = objArr.length;
        if (length == 0) {
            return;
        }
        p6.p pVar = this.f13657h;
        if (pVar != null) {
            O(objArr, gVar, d0Var, pVar);
            return;
        }
        if (this.f13656g != null) {
            Q(objArr, gVar, d0Var);
            return;
        }
        int i10 = 0;
        Object obj = null;
        try {
            f7.k kVar = this.f13658r;
            while (i10 < length) {
                obj = objArr[i10];
                if (obj == null) {
                    d0Var.N(gVar);
                } else {
                    Class<?> cls = obj.getClass();
                    p6.p pVarJ = kVar.j(cls);
                    if (pVarJ == null) {
                        pVarJ = this.f13655f.z() ? G(kVar, d0Var.G(this.f13655f, cls), d0Var) : H(kVar, cls, d0Var);
                    }
                    pVarJ.f(obj, gVar, d0Var);
                }
                i10++;
            }
        } catch (Exception e10) {
            v(d0Var, e10, obj, i10);
        }
    }

    public void O(Object[] objArr, e6.g gVar, p6.d0 d0Var, p6.p pVar) throws IOException {
        int length = objArr.length;
        a7.h hVar = this.f13656g;
        Object obj = null;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                obj = objArr[i10];
                if (obj == null) {
                    d0Var.N(gVar);
                } else if (hVar == null) {
                    pVar.f(obj, gVar, d0Var);
                } else {
                    pVar.g(obj, gVar, d0Var, hVar);
                }
            } catch (Exception e10) {
                v(d0Var, e10, obj, i10);
                return;
            }
        }
    }

    public void Q(Object[] objArr, e6.g gVar, p6.d0 d0Var) throws IOException {
        int length = objArr.length;
        a7.h hVar = this.f13656g;
        int i10 = 0;
        Object obj = null;
        try {
            f7.k kVar = this.f13658r;
            while (i10 < length) {
                obj = objArr[i10];
                if (obj == null) {
                    d0Var.N(gVar);
                } else {
                    Class<?> cls = obj.getClass();
                    p6.p pVarJ = kVar.j(cls);
                    if (pVarJ == null) {
                        pVarJ = H(kVar, cls, d0Var);
                    }
                    pVarJ.g(obj, gVar, d0Var, hVar);
                }
                i10++;
            }
        } catch (Exception e10) {
            v(d0Var, e10, obj, i10);
        }
    }

    public x R(p6.d dVar, a7.h hVar, p6.p pVar, Boolean bool) {
        return (this.f13563c == dVar && pVar == this.f13657h && this.f13656g == hVar && Objects.equals(this.f13564d, bool)) ? this : new x(this, dVar, hVar, pVar, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // g7.a, e7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p6.p a(p6.d0 r6, p6.d r7) {
        /*
            r5 = this;
            a7.h r0 = r5.f13656g
            if (r0 == 0) goto L8
            a7.h r0 = r0.a(r7)
        L8:
            r1 = 0
            if (r7 == 0) goto L20
            x6.k r2 = r7.h()
            p6.b r3 = r6.i0()
            if (r2 == 0) goto L20
            java.lang.Object r3 = r3.g(r2)
            if (r3 == 0) goto L20
            p6.p r2 = r6.G0(r2, r3)
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
            p6.p r2 = r5.f13657h
        L35:
            p6.p r2 = r5.n(r6, r7, r2)
            if (r2 != 0) goto L4f
            com.fasterxml.jackson.databind.JavaType r3 = r5.f13655f
            if (r3 == 0) goto L4f
            boolean r4 = r5.f13654e
            if (r4 == 0) goto L4f
            boolean r3 = r3.S()
            if (r3 != 0) goto L4f
            com.fasterxml.jackson.databind.JavaType r2 = r5.f13655f
            p6.p r2 = r6.Q(r2, r7)
        L4f:
            g7.x r6 = r5.R(r7, r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.x.a(p6.d0, p6.d):p6.p");
    }

    @Override // e7.h
    public e7.h x(a7.h hVar) {
        return new x(this.f13655f, this.f13654e, hVar, this.f13657h);
    }

    public x(x xVar, p6.d dVar, a7.h hVar, p6.p pVar, Boolean bool) {
        super(xVar, dVar, bool);
        this.f13655f = xVar.f13655f;
        this.f13656g = hVar;
        this.f13654e = xVar.f13654e;
        this.f13658r = f7.k.c();
        this.f13657h = pVar;
    }
}
