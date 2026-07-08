package m5;

import com.dw.ht.Cfg;
import com.facebook.stetho.websocket.CloseCodes;
import v4.l;
import v4.l1;

/* JADX INFO: loaded from: classes.dex */
public class g extends l {
    private final w3.c H;
    private final String I;

    public g(l1 l1Var, String str) {
        super(l1Var, "MorseCodeSend");
        if (Cfg.D > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            a4.c cVar = new a4.c(Cfg.D, 32000, Cfg.E, (short) 16383);
            int i10 = this.f29928e.f29947e;
            if (i10 > 0) {
                int i11 = ((i10 * 32000) / CloseCodes.NORMAL_CLOSURE) / (cVar.f310d * 16);
                while (true) {
                    int i12 = i11 - 1;
                    if (i11 <= 0) {
                        break;
                    }
                    sb2.append("\u0001");
                    i11 = i12;
                }
            }
            if (Cfg.O().morseCodeAddCT) {
                sb2.append("\u0001");
            }
            sb2.append(str);
            if (Cfg.O().morseCodeAddSK) {
                sb2.append("\u0004");
            }
            cVar.h(sb2.toString());
            this.H = cVar;
        } else {
            this.H = new z3.a(32000, Cfg.E, (short) 16383);
        }
        this.I = str;
    }

    @Override // v4.l
    protected String C() {
        return this.I;
    }

    @Override // v4.l
    protected int F() {
        return 0;
    }

    @Override // v4.l
    protected boolean L() {
        return true;
    }

    @Override // v4.l
    protected int read(short[] sArr, int i10, int i11) {
        int iE = this.H.e(sArr, i10, i11);
        if (iE <= 0) {
            return -1;
        }
        return iE;
    }
}
