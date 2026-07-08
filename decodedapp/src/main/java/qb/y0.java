package qb;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.t1;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f24827c = Logger.getLogger(y0.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static y0 f24828d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f24829a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f24830b = Collections.EMPTY_LIST;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(x0 x0Var, x0 x0Var2) {
            return x0Var.c() - x0Var2.c();
        }
    }

    private static final class b implements t1.b {
        private b() {
        }

        @Override // qb.t1.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(x0 x0Var) {
            return x0Var.c();
        }

        @Override // qb.t1.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(x0 x0Var) {
            return x0Var.b();
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private synchronized void a(x0 x0Var) {
        r9.l.e(x0Var.b(), "isAvailable() returned false");
        this.f24829a.add(x0Var);
    }

    public static synchronized y0 b() {
        try {
            if (f24828d == null) {
                List<x0> listE = t1.e(x0.class, c(), x0.class.getClassLoader(), new b(null));
                f24828d = new y0();
                for (x0 x0Var : listE) {
                    f24827c.fine("Service loader found " + x0Var);
                    f24828d.a(x0Var);
                }
                f24828d.f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24828d;
    }

    static List c() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(rb.h.class);
        } catch (ClassNotFoundException e10) {
            f24827c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e10);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e11) {
            f24827c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e11);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e12) {
            f24827c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e12);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private synchronized void f() {
        ArrayList arrayList = new ArrayList(this.f24829a);
        Collections.sort(arrayList, Collections.reverseOrder(new a()));
        this.f24830b = DesugarCollections.unmodifiableList(arrayList);
    }

    x0 d() {
        List listE = e();
        if (listE.isEmpty()) {
            return null;
        }
        return (x0) listE.get(0);
    }

    synchronized List e() {
        return this.f24830b;
    }
}
