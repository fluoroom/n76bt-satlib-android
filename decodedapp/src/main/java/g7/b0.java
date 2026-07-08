package g7;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends i0 implements e7.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Boolean f13573c;

    protected b0(Class cls) {
        super(cls, false);
        this.f13573c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // e7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p6.p a(p6.d0 r6, p6.d r7) {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L18
            p6.b r1 = r6.i0()
            x6.k r2 = r7.h()
            if (r2 == 0) goto L18
            java.lang.Object r1 = r1.g(r2)
            if (r1 == 0) goto L18
            p6.p r1 = r6.G0(r2, r1)
            goto L19
        L18:
            r1 = r0
        L19:
            java.lang.Class r2 = r5.c()
            d6.k$d r2 = r5.q(r6, r7, r2)
            if (r2 == 0) goto L2a
            d6.k$a r3 = d6.k.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r2 = r2.e(r3)
            goto L2b
        L2a:
            r2 = r0
        L2b:
            p6.p r1 = r5.n(r6, r7, r1)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r1 != 0) goto L37
            p6.p r1 = r6.R(r3, r7)
        L37:
            boolean r4 = r5.t(r1)
            if (r4 == 0) goto L4b
            java.lang.Boolean r6 = r5.f13573c
            boolean r6 = j$.util.Objects.equals(r2, r6)
            if (r6 == 0) goto L46
            return r5
        L46:
            p6.p r6 = r5.x(r7, r2)
            return r6
        L4b:
            g7.j r7 = new g7.j
            com.fasterxml.jackson.databind.JavaType r6 = r6.i(r3)
            r2 = 1
            r7.<init>(r6, r2, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.b0.a(p6.d0, p6.d):p6.p");
    }

    public abstract p6.p x(p6.d dVar, Boolean bool);

    @Override // p6.p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean d(p6.d0 d0Var, Collection collection) {
        return collection == null || collection.isEmpty();
    }

    protected b0(b0 b0Var, Boolean bool) {
        super(b0Var);
        this.f13573c = bool;
    }
}
