package x6;

import d6.k;
import d6.r;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class x implements p6.d, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p6.x f31822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected transient List f31823b;

    protected x(p6.x xVar) {
        this.f31822a = xVar == null ? p6.x.f24069s : xVar;
    }

    public List b(r6.q qVar) {
        k kVarH;
        List listR = this.f31823b;
        if (listR == null) {
            p6.b bVarG = qVar.g();
            if (bVarG != null && (kVarH = h()) != null) {
                listR = bVarG.R(kVarH);
            }
            if (listR == null) {
                listR = Collections.EMPTY_LIST;
            }
            this.f31823b = listR;
        }
        return listR;
    }

    public boolean c() {
        return this.f31822a.g();
    }

    @Override // p6.d
    public p6.x d() {
        return this.f31822a;
    }

    @Override // p6.d
    public r.b e(r6.q qVar, Class cls) {
        p6.b bVarG = qVar.g();
        k kVarH = h();
        if (kVarH == null) {
            return qVar.q(cls);
        }
        r.b bVarL = qVar.l(cls, kVarH.e());
        if (bVarG == null) {
            return bVarL;
        }
        r.b bVarZ = bVarG.Z(kVarH);
        return bVarL == null ? bVarZ : bVarL.n(bVarZ);
    }

    @Override // p6.d
    public k.d f(r6.q qVar, Class cls) {
        k kVarH;
        k.d dVarP = qVar.p(cls);
        p6.b bVarG = qVar.g();
        k.d dVarS = (bVarG == null || (kVarH = h()) == null) ? null : bVarG.s(kVarH);
        return dVarP == null ? dVarS == null ? p6.d.f23952m : dVarS : dVarS == null ? dVarP : dVarP.s(dVarS);
    }

    protected x(x xVar) {
        this.f31822a = xVar.f31822a;
    }
}
