package t6;

import d6.k0;
import java.util.BitSet;
import t6.x;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final e6.j f27556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final p6.h f27557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final s f27558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Object[] f27559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f27560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f27561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final BitSet f27562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected x f27563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Object f27564i;

    public y(e6.j jVar, p6.h hVar, int i10, s sVar) {
        this.f27556a = jVar;
        this.f27557b = hVar;
        this.f27560e = i10;
        this.f27558c = sVar;
        this.f27559d = new Object[i10];
        if (i10 < 32) {
            this.f27562g = null;
        } else {
            this.f27562g = new BitSet();
        }
    }

    protected Object a(s6.u uVar) throws p6.f {
        if (uVar.s() != null) {
            return this.f27557b.R(uVar.s(), uVar, null);
        }
        if (uVar.c()) {
            this.f27557b.R0(uVar, "Missing required creator property '%s' (index %d)", uVar.getName(), Integer.valueOf(uVar.r()));
        }
        if (this.f27557b.D0(p6.i.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            this.f27557b.R0(uVar, "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", uVar.getName(), Integer.valueOf(uVar.r()));
        }
        try {
            Object objB = uVar.v().b(this.f27557b);
            return objB != null ? objB : uVar.x().b(this.f27557b);
        } catch (p6.f e10) {
            x6.k kVarH = uVar.h();
            if (kVarH != null) {
                e10.e(kVarH.k(), uVar.getName());
            }
            throw e10;
        }
    }

    public boolean b(s6.u uVar, Object obj) {
        int iR = uVar.r();
        this.f27559d[iR] = obj;
        BitSet bitSet = this.f27562g;
        if (bitSet == null) {
            int i10 = this.f27561f;
            int i11 = (1 << iR) | i10;
            if (i10 != i11) {
                this.f27561f = i11;
                int i12 = this.f27560e - 1;
                this.f27560e = i12;
                if (i12 <= 0) {
                    return this.f27558c == null || this.f27564i != null;
                }
            }
        } else if (!bitSet.get(iR)) {
            this.f27562g.set(iR);
            this.f27560e--;
        }
        return false;
    }

    public void c(s6.t tVar, String str, Object obj) {
        this.f27563h = new x.a(this.f27563h, obj, tVar, str);
    }

    public void d(Object obj, Object obj2) {
        this.f27563h = new x.b(this.f27563h, obj2, obj);
    }

    public void e(s6.u uVar, Object obj) {
        this.f27563h = new x.c(this.f27563h, obj, uVar);
    }

    protected x f() {
        return this.f27563h;
    }

    public Object[] g(s6.u[] uVarArr) throws v6.f {
        if (this.f27560e > 0) {
            if (this.f27562g != null) {
                int length = this.f27559d.length;
                int i10 = 0;
                while (true) {
                    int iNextClearBit = this.f27562g.nextClearBit(i10);
                    if (iNextClearBit >= length) {
                        break;
                    }
                    this.f27559d[iNextClearBit] = a(uVarArr[iNextClearBit]);
                    i10 = iNextClearBit + 1;
                }
            } else {
                int i11 = this.f27561f;
                int length2 = this.f27559d.length;
                int i12 = 0;
                while (i12 < length2) {
                    if ((i11 & 1) == 0) {
                        this.f27559d[i12] = a(uVarArr[i12]);
                    }
                    i12++;
                    i11 >>= 1;
                }
            }
        }
        if (this.f27557b.D0(p6.i.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            for (int i13 = 0; i13 < uVarArr.length; i13++) {
                if (this.f27559d[i13] == null) {
                    s6.u uVar = uVarArr[i13];
                    this.f27557b.R0(uVar, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES` enabled", uVar.getName(), Integer.valueOf(uVarArr[i13].r()));
                }
            }
        }
        return this.f27559d;
    }

    public Object h(p6.h hVar, Object obj) {
        s sVar = this.f27558c;
        if (sVar != null) {
            Object obj2 = this.f27564i;
            if (obj2 != null) {
                k0 k0Var = sVar.f27538c;
                sVar.getClass();
                hVar.W(obj2, k0Var, null).b(obj);
                s6.u uVar = this.f27558c.f27540e;
                if (uVar != null) {
                    return uVar.N(obj, this.f27564i);
                }
            } else {
                hVar.W0(sVar, obj);
            }
        }
        return obj;
    }

    public boolean i(String str) {
        s sVar = this.f27558c;
        if (sVar == null || !str.equals(sVar.f27537b.c())) {
            return false;
        }
        this.f27564i = this.f27558c.f(this.f27556a, this.f27557b);
        return true;
    }
}
