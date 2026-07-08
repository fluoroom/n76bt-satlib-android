package v4;

import com.dw.ht.ii.IIService;
import v4.y1;

/* JADX INFO: loaded from: classes.dex */
public class p1 extends y1 {

    /* JADX INFO: renamed from: q */
    private final n1 f30038q;

    p1(n1 n1Var) {
        super(n1Var);
        this.f30038q = n1Var;
    }

    @Override // v4.y1
    protected void z() {
        this.f30271j = false;
        if (!p() && this.f30267f.s0() && IIService.i()) {
            long jI = com.dw.ht.user.b.f6853a.i();
            w5.h hVarC = ((y1.c) this.f30268g.poll()).c();
            byte[] bArr = new byte[hVarC.i()];
            try {
                hVarC.k(bArr, 0);
                g5.c cVar = new g5.c();
                cVar.f13545a = 2;
                cVar.f13546b = jI;
                cVar.f13548d = true;
                cVar.f13547c = this.f30038q.T;
                cVar.f13549e = bArr;
                IIService.INSTANCE.d(cVar);
                this.f30265d.post(new Runnable() { // from class: v4.o1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30037a.z();
                    }
                });
            } catch (w5.f e10) {
                e10.printStackTrace();
            }
        }
    }
}
