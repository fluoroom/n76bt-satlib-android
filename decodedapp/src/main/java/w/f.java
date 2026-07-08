package w;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d */
    p f30910d;

    /* JADX INFO: renamed from: f */
    int f30912f;

    /* JADX INFO: renamed from: g */
    public int f30913g;

    /* JADX INFO: renamed from: a */
    public d f30907a = null;

    /* JADX INFO: renamed from: b */
    public boolean f30908b = false;

    /* JADX INFO: renamed from: c */
    public boolean f30909c = false;

    /* JADX INFO: renamed from: e */
    a f30911e = a.UNKNOWN;

    /* JADX INFO: renamed from: h */
    int f30914h = 1;

    /* JADX INFO: renamed from: i */
    g f30915i = null;

    /* JADX INFO: renamed from: j */
    public boolean f30916j = false;

    /* JADX INFO: renamed from: k */
    List f30917k = new ArrayList();

    /* JADX INFO: renamed from: l */
    List f30918l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f30910d = pVar;
    }

    @Override // w.d
    public void a(d dVar) {
        Iterator it = this.f30918l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f30916j) {
                return;
            }
        }
        this.f30909c = true;
        d dVar2 = this.f30907a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f30908b) {
            this.f30910d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f30918l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f30916j) {
            g gVar = this.f30915i;
            if (gVar != null) {
                if (!gVar.f30916j) {
                    return;
                } else {
                    this.f30912f = this.f30914h * gVar.f30913g;
                }
            }
            d(fVar.f30913g + this.f30912f);
        }
        d dVar3 = this.f30907a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f30917k.add(dVar);
        if (this.f30916j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f30918l.clear();
        this.f30917k.clear();
        this.f30916j = false;
        this.f30913g = 0;
        this.f30909c = false;
        this.f30908b = false;
    }

    public void d(int i10) {
        if (this.f30916j) {
            return;
        }
        this.f30916j = true;
        this.f30913g = i10;
        for (d dVar : this.f30917k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30910d.f30960b.t());
        sb2.append(":");
        sb2.append(this.f30911e);
        sb2.append("(");
        sb2.append(this.f30916j ? Integer.valueOf(this.f30913g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f30918l.size());
        sb2.append(":d=");
        sb2.append(this.f30917k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
