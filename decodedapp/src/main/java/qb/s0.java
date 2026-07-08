package qb;

import io.grpc.internal.e2;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.t1;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static s0 f24750d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f24752a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f24753b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f24749c = Logger.getLogger(s0.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Iterable f24751e = c();

    private static final class a implements t1.b {
        a() {
        }

        @Override // qb.t1.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(r0 r0Var) {
            return r0Var.c();
        }

        @Override // qb.t1.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(r0 r0Var) {
            return r0Var.d();
        }
    }

    private synchronized void a(r0 r0Var) {
        r9.l.e(r0Var.d(), "isAvailable() returned false");
        this.f24752a.add(r0Var);
    }

    public static synchronized s0 b() {
        try {
            if (f24750d == null) {
                List<r0> listE = t1.e(r0.class, f24751e, r0.class.getClassLoader(), new a());
                f24750d = new s0();
                for (r0 r0Var : listE) {
                    f24749c.fine("Service loader found " + r0Var);
                    f24750d.a(r0Var);
                }
                f24750d.e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24750d;
    }

    static List c() {
        ArrayList arrayList = new ArrayList();
        try {
            int i10 = e2.f16565c;
            arrayList.add(e2.class);
        } catch (ClassNotFoundException e10) {
            f24749c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e10);
        }
        try {
            int i11 = xb.l.f31963b;
            arrayList.add(xb.l.class);
        } catch (ClassNotFoundException e11) {
            f24749c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e11);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private synchronized void e() {
        try {
            this.f24753b.clear();
            for (r0 r0Var : this.f24752a) {
                String strB = r0Var.b();
                r0 r0Var2 = (r0) this.f24753b.get(strB);
                if (r0Var2 == null || r0Var2.c() < r0Var.c()) {
                    this.f24753b.put(strB, r0Var);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized r0 d(String str) {
        return (r0) this.f24753b.get(r9.l.o(str, "policy"));
    }
}
