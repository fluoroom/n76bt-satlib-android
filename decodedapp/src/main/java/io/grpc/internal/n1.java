package io.grpc.internal;

import io.grpc.internal.j0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import qb.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends qb.w0 {
    private static final Logger K = Logger.getLogger(n1.class.getName());
    static final long L = TimeUnit.MINUTES.toMillis(30);
    static final long M = TimeUnit.SECONDS.toMillis(1);
    private static final x1 N = v2.c(w0.f17203u);
    private static final qb.w O = qb.w.c();
    private static final qb.o P = qb.o.a();
    static final Pattern Q = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    private static final Method R;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    List H;
    private final c I;
    private final b J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    x1 f16947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    x1 f16948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f16949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    qb.i1 f16950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List f16951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f16952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final qb.b f16953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    IdentityHashMap f16954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SocketAddress f16955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f16956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f16957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f16958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f16959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    qb.w f16960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    qb.o f16961o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    long f16962p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f16963q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f16964r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    long f16965s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    long f16966t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f16967u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    qb.d0 f16968v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f16969w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    Map f16970x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f16971y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    qb.m1 f16972z;

    public interface b {
        int a();
    }

    public interface c {
        u a();
    }

    private static final class d implements b {
        private d() {
        }

        @Override // io.grpc.internal.n1.b
        public int a() {
            return 443;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URI f16973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final qb.h1 f16974b;

        public e(URI uri, qb.h1 h1Var) {
            this.f16973a = (URI) r9.l.o(uri, "targetUri");
            this.f16974b = (qb.h1) r9.l.o(h1Var, "provider");
        }
    }

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class<?> cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e10) {
            K.log(Level.FINE, "Unable to apply census stats", (Throwable) e10);
            declaredMethod = null;
        } catch (NoSuchMethodException e11) {
            K.log(Level.FINE, "Unable to apply census stats", (Throwable) e11);
            declaredMethod = null;
        }
        R = declaredMethod;
    }

    public n1(String str, c cVar, b bVar) {
        this(str, null, null, cVar, bVar);
    }

    static e j(String str, qb.i1 i1Var, Collection collection) {
        URI uri;
        StringBuilder sb2 = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e10) {
            sb2.append(e10.getMessage());
            uri = null;
        }
        qb.h1 h1VarE = uri != null ? i1Var.e(uri.getScheme()) : null;
        String str2 = "";
        if (h1VarE == null && !Q.matcher(str).matches()) {
            try {
                uri = new URI(i1Var.c(), "", "/" + str, null);
                h1VarE = i1Var.e(uri.getScheme());
            } catch (URISyntaxException e11) {
                throw new IllegalArgumentException(e11);
            }
        }
        if (h1VarE != null) {
            if (collection == null || collection.containsAll(h1VarE.c())) {
                return new e(uri, h1VarE);
            }
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
        }
        if (sb2.length() > 0) {
            str2 = " (" + ((Object) sb2) + ")";
        }
        throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, str2));
    }

    @Override // qb.w0
    public qb.v0 a() {
        u uVarA = this.I.a();
        e eVarJ = j(this.f16952f, this.f16950d, uVarA.r0());
        return new o1(new m1(this, uVarA, eVarJ.f16973a, eVarJ.f16974b, new j0.a(), v2.c(w0.f17203u), w0.f17205w, i(eVarJ.f16973a.toString()), b3.f16355a));
    }

    String f(String str) {
        return this.A ? str : w0.c(str);
    }

    void g(g1.a.C0339a c0339a) {
        IdentityHashMap identityHashMap = this.f16954h;
        if (identityHashMap != null) {
            for (Map.Entry entry : identityHashMap.entrySet()) {
                android.support.v4.media.session.b.a(entry.getKey());
                c0339a.m(null, entry.getValue());
            }
        }
    }

    int h() {
        return this.J.a();
    }

    List i(String str) {
        Method method;
        ArrayList arrayList = new ArrayList(this.f16949c.size());
        Iterator it = this.f16949c.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            arrayList.add(null);
        }
        if (!qb.g0.b()) {
            if (this.B && (method = R) != null) {
                try {
                    android.support.v4.media.session.b.a(method.invoke(null, Boolean.valueOf(this.C), Boolean.valueOf(this.D), Boolean.valueOf(this.E), Boolean.valueOf(this.F)));
                } catch (IllegalAccessException e10) {
                    K.log(Level.FINE, "Unable to apply census stats", (Throwable) e10);
                } catch (InvocationTargetException e11) {
                    K.log(Level.FINE, "Unable to apply census stats", (Throwable) e11);
                }
            }
            if (this.G) {
                try {
                    android.support.v4.media.session.b.a(Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", null).invoke(null, null));
                } catch (ClassNotFoundException e12) {
                    K.log(Level.FINE, "Unable to apply census stats", (Throwable) e12);
                } catch (IllegalAccessException e13) {
                    K.log(Level.FINE, "Unable to apply census stats", (Throwable) e13);
                } catch (NoSuchMethodException e14) {
                    K.log(Level.FINE, "Unable to apply census stats", (Throwable) e14);
                } catch (InvocationTargetException e15) {
                    K.log(Level.FINE, "Unable to apply census stats", (Throwable) e15);
                }
            }
        }
        return arrayList;
    }

    @Override // qb.w0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public n1 d(String str) {
        this.f16957k = f(str);
        return this;
    }

    public n1(String str, qb.e eVar, qb.b bVar, c cVar, b bVar2) {
        x1 x1Var = N;
        this.f16947a = x1Var;
        this.f16948b = x1Var;
        this.f16949c = new ArrayList();
        this.f16950d = qb.i1.b();
        this.f16951e = new ArrayList();
        this.f16958l = "pick_first";
        this.f16960n = O;
        this.f16961o = P;
        this.f16962p = L;
        this.f16963q = 5;
        this.f16964r = 5;
        this.f16965s = 16777216L;
        this.f16966t = 1048576L;
        this.f16967u = true;
        this.f16968v = qb.d0.g();
        this.f16971y = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = false;
        this.F = true;
        this.G = true;
        this.H = new ArrayList();
        this.f16952f = (String) r9.l.o(str, "target");
        this.f16953g = bVar;
        this.I = (c) r9.l.o(cVar, "clientTransportFactoryBuilder");
        this.f16955i = null;
        if (bVar2 != null) {
            this.J = bVar2;
        } else {
            this.J = new d();
        }
        qb.g0.a(this);
    }
}
