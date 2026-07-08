package tg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o1 extends a0 {
    @Override // tg.a0
    public a0 t0(int i10, String str) {
        xg.i.a(i10);
        return xg.i.b(this, str);
    }

    public abstract o1 v0();

    protected final String w0() {
        o1 o1VarV0;
        o1 o1VarC = p0.c();
        if (this == o1VarC) {
            return "Dispatchers.Main";
        }
        try {
            o1VarV0 = o1VarC.v0();
        } catch (UnsupportedOperationException unused) {
            o1VarV0 = null;
        }
        if (this == o1VarV0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
