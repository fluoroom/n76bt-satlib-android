package qb;

import androidx.appcompat.widget.RtlSpacingHelper;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.g1;
import qb.t1;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 {

    /* JADX INFO: renamed from: e */
    private static final Logger f24648e = Logger.getLogger(i1.class.getName());

    /* JADX INFO: renamed from: f */
    private static i1 f24649f;

    /* JADX INFO: renamed from: a */
    private final g1.c f24650a = new b();

    /* JADX INFO: renamed from: b */
    private String f24651b = "unknown";

    /* JADX INFO: renamed from: c */
    private final LinkedHashSet f24652c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    private s9.l f24653d = s9.l.i();

    private final class b extends g1.c {
        private b() {
        }

        /* synthetic */ b(i1 i1Var, a aVar) {
            this();
        }
    }

    private static final class c implements t1.b {
        private c() {
        }

        @Override // qb.t1.b
        /* JADX INFO: renamed from: c */
        public int b(h1 h1Var) {
            return h1Var.f();
        }

        @Override // qb.t1.b
        /* JADX INFO: renamed from: d */
        public boolean a(h1 h1Var) {
            return h1Var.e();
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    private synchronized void a(h1 h1Var) {
        r9.l.e(h1Var.e(), "isAvailable() returned false");
        this.f24652c.add(h1Var);
    }

    public static synchronized i1 b() {
        try {
            if (f24649f == null) {
                List<h1> listE = t1.e(h1.class, d(), h1.class.getClassLoader(), new c());
                if (listE.isEmpty()) {
                    f24648e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f24649f = new i1();
                for (h1 h1Var : listE) {
                    f24648e.fine("Service loader found " + h1Var);
                    f24649f.a(h1Var);
                }
                f24649f.g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24649f;
    }

    static List d() {
        ArrayList arrayList = new ArrayList();
        try {
            int i10 = io.grpc.internal.i0.f16620b;
            arrayList.add(io.grpc.internal.i0.class);
        } catch (ClassNotFoundException e10) {
            f24648e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e10);
        }
        try {
            arrayList.add(Class.forName("io.grpc.binder.internal.IntentNameResolverProvider"));
        } catch (ClassNotFoundException e11) {
            f24648e.log(Level.FINE, "Unable to find IntentNameResolverProvider", (Throwable) e11);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private synchronized void g() {
        try {
            HashMap map = new HashMap();
            String strD = "unknown";
            int iF = RtlSpacingHelper.UNDEFINED;
            for (h1 h1Var : this.f24652c) {
                String strD2 = h1Var.d();
                h1 h1Var2 = (h1) map.get(strD2);
                if (h1Var2 == null || h1Var2.f() < h1Var.f()) {
                    map.put(strD2, h1Var);
                }
                if (iF < h1Var.f()) {
                    iF = h1Var.f();
                    strD = h1Var.d();
                }
            }
            this.f24653d = s9.l.b(map);
            this.f24651b = strD;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized String c() {
        return this.f24651b;
    }

    public h1 e(String str) {
        if (str == null) {
            return null;
        }
        return (h1) f().get(str.toLowerCase(Locale.US));
    }

    synchronized Map f() {
        return this.f24653d;
    }
}
