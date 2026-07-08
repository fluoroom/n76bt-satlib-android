package jh;

import java.io.IOException;
import jh.u;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f18868a;

    public w(u uVar) {
        rd.m.e(uVar, "routePlanner");
        this.f18868a = uVar;
    }

    @Override // jh.i
    public n a() throws Throwable {
        u.b bVarF;
        IOException iOException = null;
        while (!b().c()) {
            try {
                bVarF = b().f();
            } catch (IOException e10) {
                if (iOException == null) {
                    iOException = e10;
                } else {
                    dd.b.a(iOException, e10);
                }
                if (!t.a(b(), null, 1, null)) {
                    throw iOException;
                }
            }
            if (!bVarF.a()) {
                u.a aVarD = bVarF.d();
                if (aVarD.f()) {
                    aVarD = bVarF.g();
                }
                u.b bVarA = aVarD.a();
                Throwable thB = aVarD.b();
                if (thB != null) {
                    throw thB;
                }
                if (bVarA != null) {
                    b().e().addFirst(bVarA);
                }
            }
            return bVarF.c();
        }
        throw new IOException("Canceled");
    }

    @Override // jh.i
    public u b() {
        return this.f18868a;
    }
}
