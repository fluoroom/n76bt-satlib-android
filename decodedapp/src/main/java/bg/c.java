package bg;

import ag.u;
import dd.q;
import dg.n;
import he.h0;
import java.io.IOException;
import java.io.InputStream;
import rd.h;
import rd.m;
import uf.e;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends u implements ee.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f4043x = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f4044w;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(mf.c cVar, n nVar, h0 h0Var, InputStream inputStream, boolean z10) throws IOException {
            m.e(cVar, "fqName");
            m.e(nVar, "storageManager");
            m.e(h0Var, "module");
            m.e(inputStream, "inputStream");
            q qVarA = hf.c.a(inputStream);
            gf.n nVar2 = (gf.n) qVarA.a();
            hf.a aVar = (hf.a) qVarA.b();
            if (nVar2 != null) {
                return new c(cVar, nVar, h0Var, nVar2, aVar, z10, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + hf.a.f15343h + ", actual " + aVar + ". Please update Kotlin");
        }

        private a() {
        }
    }

    public /* synthetic */ c(mf.c cVar, n nVar, h0 h0Var, gf.n nVar2, hf.a aVar, boolean z10, h hVar) {
        this(cVar, nVar, h0Var, nVar2, aVar, z10);
    }

    @Override // ke.h0, ke.m
    public String toString() {
        return "builtins package fragment for " + d() + " from " + e.s(this);
    }

    private c(mf.c cVar, n nVar, h0 h0Var, gf.n nVar2, hf.a aVar, boolean z10) {
        super(cVar, nVar, h0Var, nVar2, aVar, null);
        this.f4044w = z10;
    }
}
