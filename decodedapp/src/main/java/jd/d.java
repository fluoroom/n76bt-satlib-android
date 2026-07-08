package jd;

import hd.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends a {

    /* JADX INFO: renamed from: b */
    private final hd.i f18640b;

    /* JADX INFO: renamed from: c */
    private transient hd.e f18641c;

    public d(hd.e eVar, hd.i iVar) {
        super(eVar);
        this.f18640b = iVar;
    }

    @Override // hd.e
    public hd.i getContext() {
        hd.i iVar = this.f18640b;
        rd.m.b(iVar);
        return iVar;
    }

    @Override // jd.a
    protected void p() {
        hd.e eVar = this.f18641c;
        if (eVar != null && eVar != this) {
            i.b bVarA = getContext().a(hd.f.f15241k);
            rd.m.b(bVarA);
            ((hd.f) bVarA).w(eVar);
        }
        this.f18641c = c.f18639a;
    }

    public final hd.e q() {
        hd.e eVarH = this.f18641c;
        if (eVarH == null) {
            hd.f fVar = (hd.f) getContext().a(hd.f.f15241k);
            if (fVar == null || (eVarH = fVar.H(this)) == null) {
                eVarH = this;
            }
            this.f18641c = eVarH;
        }
        return eVarH;
    }

    public d(hd.e eVar) {
        this(eVar, eVar != null ? eVar.getContext() : null);
    }
}
