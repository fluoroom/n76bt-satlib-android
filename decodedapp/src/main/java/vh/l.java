package vh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f30835e;

    public l(k kVar) {
        rd.m.e(kVar, "delegate");
        this.f30835e = kVar;
    }

    @Override // vh.k
    public j G(e0 e0Var) {
        rd.m.e(e0Var, "path");
        j jVarG = this.f30835e.G(X(e0Var, "metadataOrNull", "path"));
        if (jVarG == null) {
            return null;
        }
        return jVarG.d() == null ? jVarG : j.b(jVarG, false, false, h0(jVarG.d(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    @Override // vh.k
    public i H(e0 e0Var) {
        rd.m.e(e0Var, "file");
        return this.f30835e.H(X(e0Var, "openReadOnly", "file"));
    }

    @Override // vh.k
    public l0 T(e0 e0Var, boolean z10) {
        rd.m.e(e0Var, "file");
        return this.f30835e.T(X(e0Var, "sink", "file"), z10);
    }

    @Override // vh.k
    public n0 W(e0 e0Var) {
        rd.m.e(e0Var, "file");
        return this.f30835e.W(X(e0Var, "source", "file"));
    }

    public e0 X(e0 e0Var, String str, String str2) {
        rd.m.e(e0Var, "path");
        rd.m.e(str, "functionName");
        rd.m.e(str2, "parameterName");
        return e0Var;
    }

    @Override // vh.k
    public l0 c(e0 e0Var, boolean z10) {
        rd.m.e(e0Var, "file");
        return this.f30835e.c(X(e0Var, "appendingSink", "file"), z10);
    }

    @Override // vh.k, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30835e.close();
    }

    @Override // vh.k
    public void e(e0 e0Var, e0 e0Var2) {
        rd.m.e(e0Var, "source");
        rd.m.e(e0Var2, "target");
        this.f30835e.e(X(e0Var, "atomicMove", "source"), X(e0Var2, "atomicMove", "target"));
    }

    public e0 h0(e0 e0Var, String str) {
        rd.m.e(e0Var, "path");
        rd.m.e(str, "functionName");
        return e0Var;
    }

    @Override // vh.k
    public void n(e0 e0Var, boolean z10) {
        rd.m.e(e0Var, "dir");
        this.f30835e.n(X(e0Var, "createDirectory", "dir"), z10);
    }

    @Override // vh.k
    public void s(e0 e0Var, boolean z10) {
        rd.m.e(e0Var, "path");
        this.f30835e.s(X(e0Var, "delete", "path"), z10);
    }

    public String toString() {
        return rd.c0.b(getClass()).b() + '(' + this.f30835e + ')';
    }

    @Override // vh.k
    public List w(e0 e0Var) {
        rd.m.e(e0Var, "dir");
        List listW = this.f30835e.w(X(e0Var, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it = listW.iterator();
        while (it.hasNext()) {
            arrayList.add(h0((e0) it.next(), "list"));
        }
        ed.q.y(arrayList);
        return arrayList;
    }
}
