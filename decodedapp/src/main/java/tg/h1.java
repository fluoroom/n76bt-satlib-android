package tg;

/* JADX INFO: loaded from: classes3.dex */
public class h1 extends l1 implements q {

    /* JADX INFO: renamed from: c */
    private final boolean f27820c;

    public h1(f1 f1Var) {
        super(true);
        P(f1Var);
        this.f27820c = v0();
    }

    private final boolean v0() {
        l1 l1VarU;
        n nVarJ = J();
        o oVar = nVarJ instanceof o ? (o) nVarJ : null;
        if (oVar != null && (l1VarU = oVar.u()) != null) {
            while (!l1VarU.E()) {
                n nVarJ2 = l1VarU.J();
                o oVar2 = nVarJ2 instanceof o ? (o) nVarJ2 : null;
                if (oVar2 == null || (l1VarU = oVar2.u()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // tg.l1
    public boolean E() {
        return this.f27820c;
    }

    @Override // tg.l1
    public boolean F() {
        return true;
    }
}
