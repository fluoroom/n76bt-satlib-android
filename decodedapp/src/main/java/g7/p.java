package g7;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes.dex */
public class p extends h0 implements e7.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f13614c;

    public p() {
        this(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // e7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p6.p a(p6.d0 r2, p6.d r3) {
        /*
            r1 = this;
            java.lang.Class r0 = r1.c()
            d6.k$d r2 = r1.q(r2, r3, r0)
            if (r2 == 0) goto L1a
            d6.k$c r2 = r2.i()
            boolean r3 = r2.a()
            if (r3 != 0) goto L18
            d6.k$c r3 = d6.k.c.ARRAY
            if (r2 != r3) goto L1a
        L18:
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            boolean r3 = r1.f13614c
            if (r2 == r3) goto L25
            g7.p r3 = new g7.p
            r3.<init>(r2)
            return r3
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.p.a(p6.d0, p6.d):p6.p");
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void f(InetAddress inetAddress, e6.g gVar, p6.d0 d0Var) {
        String strTrim;
        if (this.f13614c) {
            strTrim = inetAddress.getHostAddress();
        } else {
            strTrim = inetAddress.toString().trim();
            int iIndexOf = strTrim.indexOf(47);
            if (iIndexOf >= 0) {
                strTrim = iIndexOf == 0 ? strTrim.substring(1) : strTrim.substring(0, iIndexOf);
            }
        }
        gVar.d1(strTrim);
    }

    @Override // g7.h0, p6.p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void g(InetAddress inetAddress, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
        n6.c cVarG = hVar.g(gVar, hVar.f(inetAddress, InetAddress.class, e6.m.VALUE_STRING));
        f(inetAddress, gVar, d0Var);
        hVar.h(gVar, cVarG);
    }

    public p(boolean z10) {
        super(InetAddress.class);
        this.f13614c = z10;
    }
}
