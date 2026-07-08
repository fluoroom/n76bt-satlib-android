package d7;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p6.c0;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class r extends f implements Serializable {

    /* JADX INFO: renamed from: b */
    protected final Map f10859b;

    public r(l lVar) {
        super(lVar);
        this.f10859b = new LinkedHashMap();
    }

    @Override // p6.n
    public p6.n A(int i10) {
        return null;
    }

    @Override // p6.n
    public m C() {
        return m.OBJECT;
    }

    protected boolean b0(r rVar) {
        return this.f10859b.equals(rVar.f10859b);
    }

    @Override // e6.w
    public e6.m c() {
        return e6.m.START_OBJECT;
    }

    public p6.n c0(String str) {
        return (p6.n) this.f10859b.get(str);
    }

    @Override // d7.b, p6.o
    public void d(e6.g gVar, d0 d0Var) {
        if (d0Var != null) {
            boolean zY0 = d0Var.y0(c0.WRITE_EMPTY_JSON_ARRAYS);
            boolean z10 = !zY0;
            boolean zZ0 = d0Var.z0(r6.p.WRITE_NULL_PROPERTIES);
            boolean z11 = !zZ0;
            if (!zY0 || !zZ0) {
                gVar.a1(this);
                e0(gVar, d0Var, z10, z11);
                gVar.A0();
                return;
            }
        }
        gVar.a1(this);
        for (Map.Entry entry : this.f10859b.entrySet()) {
            p6.n nVar = (p6.n) entry.getValue();
            gVar.D0((String) entry.getKey());
            nVar.d(gVar, d0Var);
        }
        gVar.A0();
    }

    public p6.n d0(String str, p6.n nVar) {
        if (nVar == null) {
            nVar = a0();
        }
        return (p6.n) this.f10859b.put(str, nVar);
    }

    @Override // p6.o
    public void e(e6.g gVar, d0 d0Var, a7.h hVar) {
        boolean z10;
        boolean z11;
        if (d0Var != null) {
            z10 = !d0Var.y0(c0.WRITE_EMPTY_JSON_ARRAYS);
            z11 = !d0Var.z0(r6.p.WRITE_NULL_PROPERTIES);
        } else {
            z10 = false;
            z11 = false;
        }
        n6.c cVarG = hVar.g(gVar, hVar.d(this, e6.m.START_OBJECT));
        if (z10 || z11) {
            e0(gVar, d0Var, z10, z11);
        } else {
            for (Map.Entry entry : this.f10859b.entrySet()) {
                p6.n nVar = (p6.n) entry.getValue();
                gVar.D0((String) entry.getKey());
                nVar.d(gVar, d0Var);
            }
        }
        hVar.h(gVar, cVarG);
    }

    protected void e0(e6.g gVar, d0 d0Var, boolean z10, boolean z11) {
        for (Map.Entry entry : this.f10859b.entrySet()) {
            b bVar = (b) entry.getValue();
            if (!z10 || !bVar.D() || !bVar.f(d0Var)) {
                if (!z11 || !bVar.N()) {
                    gVar.D0((String) entry.getKey());
                    bVar.d(gVar, d0Var);
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof r)) {
            return b0((r) obj);
        }
        return false;
    }

    @Override // p6.o.a
    public boolean f(d0 d0Var) {
        return this.f10859b.isEmpty();
    }

    public p6.n f0(String str, p6.n nVar) {
        if (nVar == null) {
            nVar = a0();
        }
        this.f10859b.put(str, nVar);
        return this;
    }

    public int hashCode() {
        return this.f10859b.hashCode();
    }

    @Override // p6.n
    public int size() {
        return this.f10859b.size();
    }

    @Override // p6.n
    public Iterator t() {
        return this.f10859b.values().iterator();
    }

    @Override // p6.n
    public Iterator z() {
        return this.f10859b.entrySet().iterator();
    }
}
