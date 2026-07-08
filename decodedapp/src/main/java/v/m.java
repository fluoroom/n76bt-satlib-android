package v;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends e {
    public ArrayList L0 = new ArrayList();

    public void b(e eVar) {
        this.L0.add(eVar);
        if (eVar.K() != null) {
            ((m) eVar.K()).u1(eVar);
        }
        eVar.d1(this);
    }

    public ArrayList s1() {
        return this.L0;
    }

    @Override // v.e
    public void t0() {
        this.L0.clear();
        super.t0();
    }

    public abstract void t1();

    public void u1(e eVar) {
        this.L0.remove(eVar);
        eVar.t0();
    }

    public void v1() {
        this.L0.clear();
    }

    @Override // v.e
    public void w0(s.c cVar) {
        super.w0(cVar);
        int size = this.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.L0.get(i10)).w0(cVar);
        }
    }
}
