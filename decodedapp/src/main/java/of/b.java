package of;

import java.io.IOException;
import java.io.InputStream;
import of.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements r {

    /* JADX INFO: renamed from: a */
    private static final g f23417a = g.c();

    private p d(p pVar) throws k {
        if (pVar == null || pVar.isInitialized()) {
            return pVar;
        }
        throw e(pVar).a().i(pVar);
    }

    private v e(p pVar) {
        return pVar instanceof a ? ((a) pVar).b() : new v(pVar);
    }

    @Override // of.r
    /* JADX INFO: renamed from: f */
    public p a(InputStream inputStream, g gVar) {
        return d(h(inputStream, gVar));
    }

    @Override // of.r
    /* JADX INFO: renamed from: g */
    public p c(InputStream inputStream, g gVar) {
        return d(i(inputStream, gVar));
    }

    public p h(InputStream inputStream, g gVar) throws k {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return i(new a.AbstractC0317a.C0318a(inputStream, e.A(i10, inputStream)), gVar);
        } catch (IOException e10) {
            throw new k(e10.getMessage());
        }
    }

    public p i(InputStream inputStream, g gVar) throws k {
        e eVarG = e.g(inputStream);
        p pVar = (p) b(eVarG, gVar);
        try {
            eVarG.a(0);
            return pVar;
        } catch (k e10) {
            throw e10.i(pVar);
        }
    }
}
