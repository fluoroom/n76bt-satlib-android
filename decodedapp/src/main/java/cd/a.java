package cd;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Thread {

    /* JADX INFO: renamed from: a */
    o f4544a;

    /* JADX INFO: renamed from: b */
    m f4545b;

    protected a(o oVar, m mVar) {
        super("RTPAppC-" + oVar.f4627a);
        this.f4544a = oVar;
        this.f4545b = mVar;
    }

    private void a() {
        h hVar;
        while (true) {
            o oVar = this.f4544a;
            if (oVar.f4650x) {
                return;
            }
            oVar.f4648v.lock();
            try {
                try {
                    this.f4544a.f4649w.await();
                } catch (Exception e10) {
                    System.out.println("AppCallerThread:" + e10.getMessage());
                }
                Enumeration enumerationF = this.f4544a.f4643q.f();
                while (enumerationF.hasMoreElements()) {
                    e eVar = (e) enumerationF.nextElement();
                    boolean z10 = false;
                    while (!z10 && ((!eVar.f4562a || this.f4544a.f4640n) && (hVar = eVar.F) != null && hVar.f4601d > 0)) {
                        c cVarH = hVar.h();
                        if (cVarH == null) {
                            z10 = true;
                        } else {
                            this.f4545b.e(cVarH, eVar);
                        }
                    }
                }
            } finally {
                this.f4544a.f4648v.unlock();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            a();
            this.f4544a.f4644r.i(null);
        } catch (Throwable th2) {
            this.f4544a.f4644r.i(th2);
        }
    }
}
