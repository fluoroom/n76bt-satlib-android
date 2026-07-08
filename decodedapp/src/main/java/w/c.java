package w;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c extends p {

    /* JADX INFO: renamed from: k */
    ArrayList f30896k;

    /* JADX INFO: renamed from: l */
    private int f30897l;

    public c(v.e eVar, int i10) {
        super(eVar);
        this.f30896k = new ArrayList();
        this.f30964f = i10;
        q();
    }

    private void q() {
        v.e eVar;
        v.e eVar2 = this.f30960b;
        v.e eVarL = eVar2.L(this.f30964f);
        while (true) {
            v.e eVar3 = eVarL;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                eVarL = eVar2.L(this.f30964f);
            }
        }
        this.f30960b = eVar;
        this.f30896k.add(eVar.N(this.f30964f));
        v.e eVarJ = eVar.J(this.f30964f);
        while (eVarJ != null) {
            this.f30896k.add(eVarJ.N(this.f30964f));
            eVarJ = eVarJ.J(this.f30964f);
        }
        for (p pVar : this.f30896k) {
            int i10 = this.f30964f;
            if (i10 == 0) {
                pVar.f30960b.f29340c = this;
            } else if (i10 == 1) {
                pVar.f30960b.f29342d = this;
            }
        }
        if (this.f30964f == 0 && ((v.f) this.f30960b.K()).R1() && this.f30896k.size() > 1) {
            ArrayList arrayList = this.f30896k;
            this.f30960b = ((p) arrayList.get(arrayList.size() - 1)).f30960b;
        }
        this.f30897l = this.f30964f == 0 ? this.f30960b.z() : this.f30960b.S();
    }

    private v.e r() {
        for (int i10 = 0; i10 < this.f30896k.size(); i10++) {
            p pVar = (p) this.f30896k.get(i10);
            if (pVar.f30960b.V() != 8) {
                return pVar.f30960b;
            }
        }
        return null;
    }

    private v.e s() {
        for (int size = this.f30896k.size() - 1; size >= 0; size--) {
            p pVar = (p) this.f30896k.get(size);
            if (pVar.f30960b.V() != 8) {
                return pVar.f30960b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:420:0x0160  */
    @Override // w.p, w.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(w.d r27) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.c.a(w.d):void");
    }

    @Override // w.p
    void d() {
        Iterator it = this.f30896k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).d();
        }
        int size = this.f30896k.size();
        if (size < 1) {
            return;
        }
        v.e eVar = ((p) this.f30896k.get(0)).f30960b;
        v.e eVar2 = ((p) this.f30896k.get(size - 1)).f30960b;
        if (this.f30964f == 0) {
            v.d dVar = eVar.O;
            v.d dVar2 = eVar2.Q;
            f fVarI = i(dVar, 0);
            int iF = dVar.f();
            v.e eVarR = r();
            if (eVarR != null) {
                iF = eVarR.O.f();
            }
            if (fVarI != null) {
                b(this.f30966h, fVarI, iF);
            }
            f fVarI2 = i(dVar2, 0);
            int iF2 = dVar2.f();
            v.e eVarS = s();
            if (eVarS != null) {
                iF2 = eVarS.Q.f();
            }
            if (fVarI2 != null) {
                b(this.f30967i, fVarI2, -iF2);
            }
        } else {
            v.d dVar3 = eVar.P;
            v.d dVar4 = eVar2.R;
            f fVarI3 = i(dVar3, 1);
            int iF3 = dVar3.f();
            v.e eVarR2 = r();
            if (eVarR2 != null) {
                iF3 = eVarR2.P.f();
            }
            if (fVarI3 != null) {
                b(this.f30966h, fVarI3, iF3);
            }
            f fVarI4 = i(dVar4, 1);
            int iF4 = dVar4.f();
            v.e eVarS2 = s();
            if (eVarS2 != null) {
                iF4 = eVarS2.R.f();
            }
            if (fVarI4 != null) {
                b(this.f30967i, fVarI4, -iF4);
            }
        }
        this.f30966h.f30907a = this;
        this.f30967i.f30907a = this;
    }

    @Override // w.p
    public void e() {
        for (int i10 = 0; i10 < this.f30896k.size(); i10++) {
            ((p) this.f30896k.get(i10)).e();
        }
    }

    @Override // w.p
    void f() {
        this.f30961c = null;
        Iterator it = this.f30896k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    @Override // w.p
    public long j() {
        int size = this.f30896k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) this.f30896k.get(i10);
            j10 = j10 + ((long) pVar.f30966h.f30912f) + pVar.j() + ((long) pVar.f30967i.f30912f);
        }
        return j10;
    }

    @Override // w.p
    boolean m() {
        int size = this.f30896k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((p) this.f30896k.get(i10)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f30964f == 0 ? "horizontal : " : "vertical : ");
        for (p pVar : this.f30896k) {
            sb2.append("<");
            sb2.append(pVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
