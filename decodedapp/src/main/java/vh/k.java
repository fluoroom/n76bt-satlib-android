package vh;

import java.io.Closeable;
import java.util.List;
import vh.e0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k implements Closeable {

    /* JADX INFO: renamed from: a */
    public static final a f30829a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final k f30830b;

    /* JADX INFO: renamed from: c */
    public static final e0 f30831c;

    /* JADX INFO: renamed from: d */
    public static final k f30832d;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    static {
        k tVar;
        try {
            Class.forName("java.nio.file.Files");
            tVar = new y();
        } catch (ClassNotFoundException unused) {
            tVar = new t();
        }
        f30830b = tVar;
        e0.a aVar = e0.f30784b;
        String property = System.getProperty("java.io.tmpdir");
        rd.m.d(property, "getProperty(...)");
        f30831c = e0.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = wh.l.class.getClassLoader();
        rd.m.d(classLoader, "getClassLoader(...)");
        f30832d = new wh.l(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ void q(k kVar, e0 e0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        kVar.n(e0Var, z10);
    }

    public abstract j G(e0 e0Var);

    public abstract i H(e0 e0Var);

    public final l0 S(e0 e0Var) {
        rd.m.e(e0Var, "file");
        return T(e0Var, false);
    }

    public abstract l0 T(e0 e0Var, boolean z10);

    public abstract n0 W(e0 e0Var);

    public final l0 a(e0 e0Var) {
        rd.m.e(e0Var, "file");
        return c(e0Var, false);
    }

    public abstract l0 c(e0 e0Var, boolean z10);

    public abstract void e(e0 e0Var, e0 e0Var2);

    public final void k(e0 e0Var) {
        rd.m.e(e0Var, "dir");
        l(e0Var, false);
    }

    public final void l(e0 e0Var, boolean z10) {
        rd.m.e(e0Var, "dir");
        wh.d.a(this, e0Var, z10);
    }

    public abstract void n(e0 e0Var, boolean z10);

    public final void r(e0 e0Var) {
        rd.m.e(e0Var, "path");
        s(e0Var, false);
    }

    public abstract void s(e0 e0Var, boolean z10);

    public final boolean v(e0 e0Var) {
        rd.m.e(e0Var, "path");
        return wh.d.b(this, e0Var);
    }

    public abstract List w(e0 e0Var);

    public final j x(e0 e0Var) {
        rd.m.e(e0Var, "path");
        return wh.d.c(this, e0Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
