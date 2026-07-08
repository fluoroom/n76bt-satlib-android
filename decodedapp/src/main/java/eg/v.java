package eg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v implements u1 {

    /* JADX INFO: renamed from: a */
    private int f12210a;

    private final boolean b(he.h hVar) {
        return (gg.l.m(hVar) || qf.i.E(hVar)) ? false : true;
    }

    protected final boolean a(he.h hVar, he.h hVar2) {
        rd.m.e(hVar, "first");
        rd.m.e(hVar2, "second");
        if (!rd.m.a(hVar.getName(), hVar2.getName())) {
            return false;
        }
        he.m mVarB = hVar.b();
        for (he.m mVarB2 = hVar2.b(); mVarB != null && mVarB2 != null; mVarB2 = mVarB2.b()) {
            if (mVarB instanceof he.h0) {
                return mVarB2 instanceof he.h0;
            }
            if (mVarB2 instanceof he.h0) {
                return false;
            }
            if (mVarB instanceof he.n0) {
                return (mVarB2 instanceof he.n0) && rd.m.a(((he.n0) mVarB).d(), ((he.n0) mVarB2).d());
            }
            if ((mVarB2 instanceof he.n0) || !rd.m.a(mVarB.getName(), mVarB2.getName())) {
                return false;
            }
            mVarB = mVarB.b();
        }
        return true;
    }

    protected abstract boolean c(he.h hVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1) || obj.hashCode() != hashCode()) {
            return false;
        }
        u1 u1Var = (u1) obj;
        if (u1Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        he.h hVarQ = q();
        he.h hVarQ2 = u1Var.q();
        if (hVarQ2 != null && b(hVarQ) && b(hVarQ2)) {
            return c(hVarQ2);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f12210a;
        if (i10 != 0) {
            return i10;
        }
        he.h hVarQ = q();
        int iHashCode = b(hVarQ) ? qf.i.m(hVarQ).hashCode() : System.identityHashCode(this);
        this.f12210a = iHashCode;
        return iHashCode;
    }

    @Override // eg.u1
    public abstract he.h q();
}
