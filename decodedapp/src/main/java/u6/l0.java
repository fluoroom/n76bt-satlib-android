package u6;

import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class l0 extends s6.c {
    public l0(s6.c cVar) {
        super(cVar);
        this.f26918u = false;
    }

    public static l0 g2(p6.h hVar, s6.c cVar) {
        return new l0(cVar);
    }

    @Override // s6.c, s6.d, p6.l
    public p6.l t(i7.s sVar) {
        return getClass() != l0.class ? this : new l0(this, sVar);
    }

    @Override // s6.c, s6.d
    public Object w1(e6.j jVar, p6.h hVar) throws IOException {
        if (this.f26916s != null) {
            return g1(jVar, hVar);
        }
        p6.l lVar = this.f26914h;
        if (lVar != null) {
            return this.f26913g.D(hVar, lVar.e(jVar, hVar));
        }
        if (this.f26911e.D()) {
            return hVar.m0(p(), W0(), jVar, "abstract type (need to add/enable type information?)", new Object[0]);
        }
        boolean zH = this.f26913g.h();
        boolean zJ = this.f26913g.j();
        if (!zH && !zJ) {
            return hVar.m0(p(), W0(), jVar, "Throwable needs a default constructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
        }
        Throwable th2 = null;
        Object[] objArr = null;
        Throwable[] thArr = null;
        int i10 = 0;
        while (!jVar.N0(e6.m.END_OBJECT)) {
            String strL = jVar.l();
            s6.u uVarO = this.f26919v.o(strL);
            jVar.X0();
            if (uVarO != null) {
                if (th2 != null) {
                    uVarO.n(jVar, hVar, th2);
                } else {
                    if (objArr == null) {
                        int size = this.f26919v.size();
                        objArr = new Object[size + size];
                    }
                    int i11 = i10 + 1;
                    objArr[i10] = uVarO;
                    i10 += 2;
                    objArr[i11] = uVarO.l(jVar, hVar);
                }
            } else if ("message".equalsIgnoreCase(strL) && zH) {
                th2 = (Throwable) this.f26913g.x(hVar, jVar.K0());
            } else {
                Set set = this.f26922y;
                if (set != null && set.contains(strL)) {
                    jVar.f1();
                } else if ("suppressed".equalsIgnoreCase(strL)) {
                    thArr = (Throwable[]) hVar.L0(jVar, Throwable[].class);
                } else if ("localizedMessage".equalsIgnoreCase(strL)) {
                    jVar.f1();
                } else {
                    s6.t tVar = this.f26921x;
                    if (tVar != null) {
                        tVar.g(jVar, hVar, th2, strL);
                    } else {
                        b1(jVar, hVar, th2, strL);
                    }
                }
            }
            jVar.X0();
        }
        if (th2 == null) {
            th2 = zH ? (Throwable) this.f26913g.x(hVar, null) : (Throwable) this.f26913g.A(hVar);
        }
        if (objArr != null) {
            for (int i12 = 0; i12 < i10; i12 += 2) {
                ((s6.u) objArr[i12]).L(th2, objArr[i12 + 1]);
            }
        }
        if (thArr != null) {
            for (Throwable th3 : thArr) {
                th2.addSuppressed(th3);
            }
        }
        return th2;
    }

    protected l0(s6.c cVar, i7.s sVar) {
        super(cVar, sVar);
    }
}
