package f7;

import java.io.IOException;
import java.util.Set;
import p6.c0;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class b extends g7.d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final g7.d f12833v;

    public b(g7.d dVar) {
        super(dVar, (i) null);
        this.f12833v = dVar;
    }

    private boolean S(d0 d0Var) {
        return ((this.f13585e == null || d0Var.h0() == null) ? this.f13584d : this.f13585e).length == 1;
    }

    @Override // g7.d
    public g7.d O(Object obj) {
        return new b(this, this.f13589r, obj);
    }

    @Override // g7.d
    public g7.d Q(i iVar) {
        return this.f12833v.Q(iVar);
    }

    protected final void T(Object obj, e6.g gVar, d0 d0Var) throws IOException {
        e7.c[] cVarArr = (this.f13585e == null || d0Var.h0() == null) ? this.f13584d : this.f13585e;
        int i10 = 0;
        try {
            int length = cVarArr.length;
            while (i10 < length) {
                e7.c cVar = cVarArr[i10];
                if (cVar == null) {
                    gVar.E0();
                } else {
                    cVar.x(obj, gVar, d0Var);
                }
                i10++;
            }
        } catch (Exception e10) {
            w(d0Var, e10, obj, cVarArr[i10].getName());
        } catch (StackOverflowError e11) {
            p6.m mVarJ = p6.m.j(gVar, "Infinite recursion (StackOverflowError)", e11);
            mVarJ.e(obj, cVarArr[i10].getName());
            throw mVarJ;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g7.d
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public b N(Set set, Set set2) {
        return new b(this, set, set2);
    }

    @Override // p6.p
    public boolean e() {
        return false;
    }

    @Override // g7.i0, p6.p
    public final void f(Object obj, e6.g gVar, d0 d0Var) throws IOException {
        if (d0Var.y0(c0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && S(d0Var)) {
            T(obj, gVar, d0Var);
            return;
        }
        gVar.X0(obj);
        T(obj, gVar, d0Var);
        gVar.z0();
    }

    @Override // g7.d, p6.p
    public void g(Object obj, e6.g gVar, d0 d0Var, a7.h hVar) throws IOException {
        if (this.f13589r != null) {
            z(obj, gVar, d0Var, hVar);
            return;
        }
        n6.c cVarC = C(hVar, obj, e6.m.START_ARRAY);
        hVar.g(gVar, cVarC);
        gVar.H(obj);
        T(obj, gVar, d0Var);
        hVar.h(gVar, cVarC);
    }

    @Override // p6.p
    public p6.p h(i7.s sVar) {
        return this.f12833v.h(sVar);
    }

    public String toString() {
        return "BeanAsArraySerializer for " + c().getName();
    }

    protected b(g7.d dVar, Set set, Set set2) {
        super(dVar, set, set2);
        this.f12833v = dVar;
    }

    protected b(g7.d dVar, i iVar, Object obj) {
        super(dVar, iVar, obj);
        this.f12833v = dVar;
    }

    @Override // g7.d
    protected g7.d D() {
        return this;
    }

    @Override // g7.d
    protected g7.d R(e7.c[] cVarArr, e7.c[] cVarArr2) {
        return this;
    }
}
