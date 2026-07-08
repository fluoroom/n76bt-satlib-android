package v;

import java.util.HashSet;
import v.e;
import w.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends j {
    private int N0 = 0;
    private int O0 = 0;
    private int P0 = 0;
    private int Q0 = 0;
    private int R0 = 0;
    private int S0 = 0;
    private int T0 = 0;
    private int U0 = 0;
    private boolean V0 = false;
    private int W0 = 0;
    private int X0 = 0;
    protected b.a Y0 = new b.a();
    b.InterfaceC0410b Z0 = null;

    public int A1() {
        return this.T0;
    }

    public int B1() {
        return this.U0;
    }

    public int C1() {
        return this.N0;
    }

    public abstract void D1(int i10, int i11, int i12, int i13);

    protected void E1(e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        while (this.Z0 == null && K() != null) {
            this.Z0 = ((f) K()).K1();
        }
        b.a aVar = this.Y0;
        aVar.f30886a = bVar;
        aVar.f30887b = bVar2;
        aVar.f30888c = i10;
        aVar.f30889d = i11;
        this.Z0.b(eVar, aVar);
        eVar.l1(this.Y0.f30890e);
        eVar.M0(this.Y0.f30891f);
        eVar.L0(this.Y0.f30893h);
        eVar.B0(this.Y0.f30892g);
    }

    protected boolean F1() {
        e eVar = this.f29337a0;
        b.InterfaceC0410b interfaceC0410bK1 = eVar != null ? ((f) eVar).K1() : null;
        if (interfaceC0410bK1 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.M0; i10++) {
            e eVar2 = this.L0[i10];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b bVarU = eVar2.u(0);
                e.b bVarU2 = eVar2.u(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar || eVar2.f29380w == 1 || bVarU2 != bVar || eVar2.f29382x == 1) {
                    if (bVarU == bVar) {
                        bVarU = e.b.WRAP_CONTENT;
                    }
                    if (bVarU2 == bVar) {
                        bVarU2 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.Y0;
                    aVar.f30886a = bVarU;
                    aVar.f30887b = bVarU2;
                    aVar.f30888c = eVar2.W();
                    this.Y0.f30889d = eVar2.x();
                    interfaceC0410bK1.b(eVar2, this.Y0);
                    eVar2.l1(this.Y0.f30890e);
                    eVar2.M0(this.Y0.f30891f);
                    eVar2.B0(this.Y0.f30892g);
                }
            }
        }
        return true;
    }

    public boolean G1() {
        return this.V0;
    }

    protected void H1(boolean z10) {
        this.V0 = z10;
    }

    public void I1(int i10, int i11) {
        this.W0 = i10;
        this.X0 = i11;
    }

    public void J1(int i10) {
        this.P0 = i10;
        this.N0 = i10;
        this.Q0 = i10;
        this.O0 = i10;
        this.R0 = i10;
        this.S0 = i10;
    }

    public void K1(int i10) {
        this.O0 = i10;
    }

    public void L1(int i10) {
        this.S0 = i10;
    }

    public void M1(int i10) {
        this.P0 = i10;
        this.T0 = i10;
    }

    public void N1(int i10) {
        this.Q0 = i10;
        this.U0 = i10;
    }

    public void O1(int i10) {
        this.R0 = i10;
        this.T0 = i10;
        this.U0 = i10;
    }

    public void P1(int i10) {
        this.N0 = i10;
    }

    @Override // v.j, v.i
    public void c(f fVar) {
        v1();
    }

    public void u1(boolean z10) {
        int i10 = this.R0;
        if (i10 > 0 || this.S0 > 0) {
            if (z10) {
                this.T0 = this.S0;
                this.U0 = i10;
            } else {
                this.T0 = i10;
                this.U0 = this.S0;
            }
        }
    }

    public void v1() {
        for (int i10 = 0; i10 < this.M0; i10++) {
            e eVar = this.L0[i10];
            if (eVar != null) {
                eVar.V0(true);
            }
        }
    }

    public boolean w1(HashSet hashSet) {
        for (int i10 = 0; i10 < this.M0; i10++) {
            if (hashSet.contains(this.L0[i10])) {
                return true;
            }
        }
        return false;
    }

    public int x1() {
        return this.X0;
    }

    public int y1() {
        return this.W0;
    }

    public int z1() {
        return this.O0;
    }
}
