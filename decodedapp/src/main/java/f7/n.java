package f7;

import com.fasterxml.jackson.databind.JavaType;
import p6.c0;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class n extends g7.a implements e7.i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final JavaType f12879f = com.fasterxml.jackson.databind.type.c.T().a0(String.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f12880g = new n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final p6.p f12881e;

    protected n() {
        super(String[].class);
        this.f12881e = null;
    }

    private void L(String[] strArr, e6.g gVar, d0 d0Var, p6.p pVar) {
        for (String str : strArr) {
            if (str == null) {
                d0Var.N(gVar);
            } else {
                pVar.f(str, gVar, d0Var);
            }
        }
    }

    @Override // g7.a
    public p6.p C(p6.d dVar, Boolean bool) {
        return new n(this, dVar, this.f12881e, bool);
    }

    @Override // p6.p
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public boolean d(d0 d0Var, String[] strArr) {
        return strArr.length == 0;
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void f(String[] strArr, e6.g gVar, d0 d0Var) {
        int length = strArr.length;
        if (length == 1 && ((this.f13564d == null && d0Var.y0(c0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f13564d == Boolean.TRUE)) {
            D(strArr, gVar, d0Var);
            return;
        }
        gVar.Y0(strArr, length);
        D(strArr, gVar, d0Var);
        gVar.z0();
    }

    @Override // g7.a
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void D(String[] strArr, e6.g gVar, d0 d0Var) {
        if (strArr.length == 0) {
            return;
        }
        p6.p pVar = this.f12881e;
        if (pVar != null) {
            L(strArr, gVar, d0Var, pVar);
            return;
        }
        for (String str : strArr) {
            if (str == null) {
                gVar.E0();
            } else {
                gVar.d1(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // g7.a, e7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p6.p a(p6.d0 r5, p6.d r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L18
            p6.b r1 = r5.i0()
            x6.k r2 = r6.h()
            if (r2 == 0) goto L18
            java.lang.Object r1 = r1.g(r2)
            if (r1 == 0) goto L18
            p6.p r1 = r5.G0(r2, r1)
            goto L19
        L18:
            r1 = r0
        L19:
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            d6.k$a r3 = d6.k.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r2 = r4.p(r5, r6, r2, r3)
            if (r1 != 0) goto L25
            p6.p r1 = r4.f12881e
        L25:
            p6.p r1 = r4.n(r5, r6, r1)
            if (r1 != 0) goto L31
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            p6.p r1 = r5.R(r1, r6)
        L31:
            boolean r5 = r4.t(r1)
            if (r5 == 0) goto L38
            goto L39
        L38:
            r0 = r1
        L39:
            p6.p r5 = r4.f12881e
            if (r0 != r5) goto L46
            java.lang.Boolean r5 = r4.f13564d
            boolean r5 = j$.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L46
            return r4
        L46:
            f7.n r5 = new f7.n
            r5.<init>(r4, r6, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.n.a(p6.d0, p6.d):p6.p");
    }

    public n(n nVar, p6.d dVar, p6.p pVar, Boolean bool) {
        super(nVar, dVar, bool);
        this.f12881e = pVar;
    }

    @Override // e7.h
    public e7.h x(a7.h hVar) {
        return this;
    }
}
