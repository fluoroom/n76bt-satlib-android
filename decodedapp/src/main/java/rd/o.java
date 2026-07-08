package rd;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25956a;

    public o(int i10) {
        this.f25956a = i10;
    }

    @Override // rd.j
    public int c() {
        return this.f25956a;
    }

    public String toString() {
        String strH = c0.h(this);
        m.d(strH, "renderLambdaToString(...)");
        return strH;
    }
}
