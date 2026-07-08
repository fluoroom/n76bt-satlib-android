package m5;

import com.dw.ht.Cfg;
import v4.l;
import v4.l1;

/* JADX INFO: loaded from: classes.dex */
public class e extends l {
    private final y3.a H;
    private final String I;

    public e(l1 l1Var, String str) {
        super(l1Var, "DTMFSend");
        y3.a aVar = new y3.a(60000 / Cfg.F, 32000, (short) 16383);
        this.H = aVar;
        aVar.h(" " + str + " ");
        this.I = str;
    }

    @Override // v4.l
    protected String C() {
        return this.I;
    }

    @Override // v4.l
    protected int read(short[] sArr, int i10, int i11) {
        int iE = this.H.e(sArr, 0, sArr.length);
        if (iE <= 0) {
            return -1;
        }
        return iE;
    }
}
