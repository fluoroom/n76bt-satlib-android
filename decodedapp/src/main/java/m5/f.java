package m5;

import com.dw.ht.Cfg;

/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final a4.c f21730x;

    public f(String str) {
        super("MorseCode");
        a4.c cVar = new a4.c(Cfg.D, 32000, Cfg.E, (short) 16383);
        this.f21730x = cVar;
        cVar.h(" " + str);
    }

    @Override // m5.d
    protected int read(short[] sArr, int i10, int i11) {
        int iE = this.f21730x.e(sArr, 0, i11);
        if (iE == 0) {
            return -1;
        }
        return iE;
    }
}
