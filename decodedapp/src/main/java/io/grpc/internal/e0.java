package io.grpc.internal;

import io.grpc.internal.e0;
import io.grpc.internal.u2;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.g1;

/* JADX INFO: loaded from: classes3.dex */
public class e0 extends qb.g1 {
    private static String A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Logger f16470s = Logger.getLogger(e0.class.getName());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set f16471t = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f16472u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f16473v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f16474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static boolean f16475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static boolean f16476y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static boolean f16477z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final qb.m1 f16478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Random f16479c = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected volatile b f16480d = d.INSTANCE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference f16481e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f16482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f16483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f16484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final x1 f16485i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f16486j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final qb.z1 f16487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g1.f f16488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final r9.o f16489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f16490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f16491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Executor f16492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f16493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private g1.d f16494r;

    public interface b {
        List a(String str);
    }

    protected static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private qb.u1 f16495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f16496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private g1.b f16497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public qb.a f16498d;

        private c() {
        }
    }

    private enum d implements b {
        INSTANCE;

        @Override // io.grpc.internal.e0.b
        public List a(String str) {
            return DesugarCollections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g1.d f16501a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f16503a;

            a(boolean z10) {
                this.f16503a = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f16503a) {
                    e0 e0Var = e0.this;
                    e0Var.f16490n = true;
                    if (e0Var.f16486j > 0) {
                        e0.this.f16489m.f().g();
                    }
                }
                e0.this.f16493q = false;
            }
        }

        e(g1.d dVar) {
            this.f16501a = (g1.d) r9.l.o(dVar, "savedListener");
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            qb.z1 z1Var;
            a aVar;
            qb.y yVarO;
            final g1.e.a aVarD;
            Logger logger = e0.f16470s;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                e0.f16470s.finer("Attempting DNS resolution of " + e0.this.f16483g);
            }
            final c cVarP = null;
            try {
                try {
                    yVarO = e0.this.o();
                    aVarD = g1.e.d();
                } catch (IOException e10) {
                    e0.this.f16487k.execute(new Runnable() { // from class: io.grpc.internal.h0
                        @Override // java.lang.Runnable
                        public final void run() {
                            e0.e eVar = this.f16610a;
                            eVar.f16501a.a(g1.e.d().b(qb.w1.a(qb.u1.f24784t.s("Unable to resolve host " + e0.this.f16483g).r(e10))).a());
                        }
                    });
                    z10 = 0 != 0 && null.f16495a == null;
                    z1Var = e0.this.f16487k;
                    aVar = new a(z10);
                }
                if (yVarO != null) {
                    if (e0.f16470s.isLoggable(level)) {
                        e0.f16470s.finer("Using proxy address " + yVarO);
                    }
                    aVarD.b(qb.w1.b(Collections.singletonList(yVarO)));
                } else {
                    cVarP = e0.this.p(false);
                    if (cVarP.f16495a != null) {
                        e0.this.f16487k.execute(new Runnable() { // from class: io.grpc.internal.f0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f16575a.f16501a.a(g1.e.d().b(qb.w1.a(cVarP.f16495a)).a());
                            }
                        });
                        z10 = cVarP != null && cVarP.f16495a == null;
                        z1Var = e0.this.f16487k;
                        aVar = new a(z10);
                        z1Var.execute(aVar);
                    }
                    if (cVarP.f16496b != null) {
                        aVarD.b(qb.w1.b(cVarP.f16496b));
                    }
                    if (cVarP.f16497c != null) {
                        aVarD.d(cVarP.f16497c);
                    }
                    qb.a aVar2 = cVarP.f16498d;
                    if (aVar2 != null) {
                        aVarD.c(aVar2);
                    }
                }
                e0.this.f16487k.execute(new Runnable() { // from class: io.grpc.internal.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16600a.f16501a.a(aVarD.a());
                    }
                });
                z10 = cVarP != null && cVarP.f16495a == null;
                z1Var = e0.this.f16487k;
                aVar = new a(z10);
                z1Var.execute(aVar);
            } catch (Throwable th2) {
                e0.this.f16487k.execute(new a(0 != 0 && null.f16495a == null));
                throw th2;
            }
        }
    }

    public interface f {
    }

    interface g {
    }

    static {
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f16472u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f16473v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f16474w = property3;
        f16475x = Boolean.parseBoolean(property);
        f16476y = Boolean.parseBoolean(property2);
        f16477z = Boolean.parseBoolean(property3);
        w(e0.class.getClassLoader());
    }

    protected e0(String str, String str2, g1.a aVar, u2.d dVar, r9.o oVar, boolean z10) {
        r9.l.o(aVar, "args");
        URI uriCreate = URI.create("//" + ((String) r9.l.o(str2, "name")));
        r9.l.j(uriCreate.getHost() != null, "Invalid DNS name: %s", str2);
        this.f16482f = (String) r9.l.p(uriCreate.getAuthority(), "nameUri (%s) doesn't have an authority", uriCreate);
        this.f16483g = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f16484h = aVar.a();
        } else {
            this.f16484h = uriCreate.getPort();
        }
        this.f16478b = (qb.m1) r9.l.o(aVar.c(), "proxyDetector");
        Executor executorB = aVar.b();
        if (executorB != null) {
            this.f16485i = new m0(executorB);
        } else {
            this.f16485i = v2.c(dVar);
        }
        this.f16486j = t(z10);
        this.f16489m = (r9.o) r9.l.o(oVar, "stopwatch");
        this.f16487k = (qb.z1) r9.l.o(aVar.f(), "syncContext");
        this.f16488l = (g1.f) r9.l.o(aVar.e(), "serviceConfigParser");
    }

    private void A() {
        if (this.f16493q || this.f16491o || !n()) {
            return;
        }
        this.f16493q = true;
        this.f16492p.execute(new e(this.f16494r));
    }

    private List B() {
        Exception e10 = null;
        try {
            try {
                List listA = this.f16480d.a(this.f16483g);
                ArrayList arrayList = new ArrayList(listA.size());
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(new qb.y(new InetSocketAddress((InetAddress) it.next(), this.f16484h)));
                }
                return DesugarCollections.unmodifiableList(arrayList);
            } catch (Exception e11) {
                e10 = e11;
                r9.r.f(e10);
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            if (e10 != null) {
                f16470s.log(Level.FINE, "Address resolution failure", (Throwable) e10);
            }
            throw th2;
        }
    }

    private g1.b C() {
        List list = Collections.EMPTY_LIST;
        v();
        if (list.isEmpty()) {
            f16470s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f16483g});
            return null;
        }
        g1.b bVarY = y(list, this.f16479c, s());
        if (bVarY != null) {
            return bVarY.d() != null ? g1.b.b(bVarY.d()) : this.f16488l.a((Map) bVarY.c());
        }
        return null;
    }

    protected static boolean D(boolean z10, boolean z11, String str) {
        if (!z10) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z11;
        }
        if (str.contains(":")) {
            return false;
        }
        boolean z12 = true;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '.') {
                z12 &= cCharAt >= '0' && cCharAt <= '9';
            }
        }
        return true ^ z12;
    }

    private boolean n() {
        if (!this.f16490n) {
            return true;
        }
        long j10 = this.f16486j;
        if (j10 != 0) {
            return j10 > 0 && this.f16489m.d(TimeUnit.NANOSECONDS) > this.f16486j;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public qb.y o() {
        qb.l1 l1VarA = this.f16478b.a(InetSocketAddress.createUnresolved(this.f16483g, this.f16484h));
        if (l1VarA != null) {
            return new qb.y(l1VarA);
        }
        return null;
    }

    private static final List q(Map map) {
        return h1.g(map, "clientLanguage");
    }

    private static final List r(Map map) {
        return h1.g(map, "clientHostname");
    }

    private static String s() {
        if (A == null) {
            try {
                A = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e10) {
                throw new RuntimeException(e10);
            }
        }
        return A;
    }

    private static long t(boolean z10) {
        if (z10) {
            return 0L;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j10 = 30;
        if (property != null) {
            try {
                j10 = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f16470s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j10 > 0 ? TimeUnit.SECONDS.toNanos(j10) : j10;
    }

    private static final Double u(Map map) {
        return h1.h(map, "percentage");
    }

    static g w(ClassLoader classLoader) {
        try {
            try {
                try {
                    android.support.v4.media.session.b.a(Class.forName("io.grpc.internal.f1", true, classLoader).asSubclass(g.class).getConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e10) {
                    f16470s.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e10);
                    return null;
                }
            } catch (Exception e11) {
                f16470s.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e11);
                return null;
            }
        } catch (ClassCastException e12) {
            f16470s.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e12);
            return null;
        } catch (ClassNotFoundException e13) {
            f16470s.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e13);
            return null;
        }
    }

    static Map x(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            r9.u.a(f16471t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List listQ = q(map);
        if (listQ != null && !listQ.isEmpty()) {
            Iterator it = listQ.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dU = u(map);
        if (dU != null) {
            int iIntValue = dU.intValue();
            r9.u.a(iIntValue >= 0 && iIntValue <= 100, "Bad percentage: %s", dU);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listR = r(map);
        if (listR != null && !listR.isEmpty()) {
            Iterator it2 = listR.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapJ = h1.j(map, "serviceConfig");
        if (mapJ != null) {
            return mapJ;
        }
        throw new r9.v(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    static g1.b y(List list, Random random, String str) {
        try {
            Iterator it = z(list).iterator();
            Map mapX = null;
            while (it.hasNext()) {
                try {
                    mapX = x((Map) it.next(), random, str);
                    if (mapX != null) {
                        break;
                    }
                } catch (RuntimeException e10) {
                    return g1.b.b(qb.u1.f24771g.s("failed to pick service config choice").r(e10));
                }
            }
            if (mapX == null) {
                return null;
            }
            return g1.b.a(mapX);
        } catch (IOException | RuntimeException e11) {
            return g1.b.b(qb.u1.f24771g.s("failed to parse TXT records").r(e11));
        }
    }

    static List z(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                Object objA = g1.a(str.substring(12));
                if (!(objA instanceof List)) {
                    throw new ClassCastException("wrong type " + objA);
                }
                arrayList.addAll(h1.a((List) objA));
            } else {
                f16470s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @Override // qb.g1
    public String c() {
        return this.f16482f;
    }

    @Override // qb.g1
    public void d() {
        r9.l.u(this.f16494r != null, "not started");
        A();
    }

    @Override // qb.g1
    public void e() {
        if (this.f16491o) {
            return;
        }
        this.f16491o = true;
        Executor executor = this.f16492p;
        if (executor != null) {
            this.f16492p = (Executor) this.f16485i.b(executor);
        }
    }

    @Override // qb.g1
    public void f(g1.d dVar) {
        r9.l.u(this.f16494r == null, "already started");
        this.f16492p = (Executor) this.f16485i.a();
        this.f16494r = (g1.d) r9.l.o(dVar, "listener");
        A();
    }

    protected c p(boolean z10) {
        c cVar = new c();
        try {
            cVar.f16496b = B();
        } catch (Exception e10) {
            if (!z10) {
                cVar.f16495a = qb.u1.f24784t.s("Unable to resolve host " + this.f16483g).r(e10);
                return cVar;
            }
        }
        if (f16477z) {
            cVar.f16497c = C();
        }
        return cVar;
    }

    protected f v() {
        if (!D(f16475x, f16476y, this.f16483g)) {
            return null;
        }
        android.support.v4.media.session.b.a(this.f16481e.get());
        return null;
    }
}
