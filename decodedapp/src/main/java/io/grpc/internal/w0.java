package io.grpc.internal;

import io.grpc.internal.s;
import io.grpc.internal.u2;
import io.grpc.internal.z2;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.c;
import qb.k;
import qb.k0;
import qb.q0;
import qb.u1;
import qb.z0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: a */
    private static final Logger f17183a = Logger.getLogger(w0.class.getName());

    /* JADX INFO: renamed from: b */
    private static final Set f17184b = DesugarCollections.unmodifiableSet(EnumSet.of(u1.b.OK, u1.b.INVALID_ARGUMENT, u1.b.NOT_FOUND, u1.b.ALREADY_EXISTS, u1.b.FAILED_PRECONDITION, u1.b.ABORTED, u1.b.OUT_OF_RANGE, u1.b.DATA_LOSS));

    /* JADX INFO: renamed from: c */
    public static final Charset f17185c = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: d */
    public static final z0.h f17186d = z0.h.e("grpc-timeout", new i());

    /* JADX INFO: renamed from: e */
    public static final z0.h f17187e;

    /* JADX INFO: renamed from: f */
    public static final z0.h f17188f;

    /* JADX INFO: renamed from: g */
    public static final z0.h f17189g;

    /* JADX INFO: renamed from: h */
    public static final z0.h f17190h;

    /* JADX INFO: renamed from: i */
    static final z0.h f17191i;

    /* JADX INFO: renamed from: j */
    public static final z0.h f17192j;

    /* JADX INFO: renamed from: k */
    public static final z0.h f17193k;

    /* JADX INFO: renamed from: l */
    public static final z0.h f17194l;

    /* JADX INFO: renamed from: m */
    public static final r9.n f17195m;

    /* JADX INFO: renamed from: n */
    public static final long f17196n;

    /* JADX INFO: renamed from: o */
    public static final long f17197o;

    /* JADX INFO: renamed from: p */
    public static final long f17198p;

    /* JADX INFO: renamed from: q */
    public static final qb.m1 f17199q;

    /* JADX INFO: renamed from: r */
    public static final qb.m1 f17200r;

    /* JADX INFO: renamed from: s */
    public static final c.C0338c f17201s;

    /* JADX INFO: renamed from: t */
    private static final qb.k f17202t;

    /* JADX INFO: renamed from: u */
    public static final u2.d f17203u;

    /* JADX INFO: renamed from: v */
    public static final u2.d f17204v;

    /* JADX INFO: renamed from: w */
    public static final r9.q f17205w;

    class a implements qb.m1 {
        a() {
        }

        @Override // qb.m1
        public qb.l1 a(SocketAddress socketAddress) {
            return null;
        }
    }

    class b extends qb.k {
        b() {
        }
    }

    class c implements u2.d {
        c() {
        }

        @Override // io.grpc.internal.u2.d
        /* JADX INFO: renamed from: a */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.u2.d
        /* JADX INFO: renamed from: c */
        public Executor create() {
            return Executors.newCachedThreadPool(w0.i("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    class d implements u2.d {
        d() {
        }

        @Override // io.grpc.internal.u2.d
        /* JADX INFO: renamed from: a */
        public void b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // io.grpc.internal.u2.d
        /* JADX INFO: renamed from: c */
        public ScheduledExecutorService create() {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, w0.i("grpc-timer-%d", true));
            try {
                scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
            return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    class e implements r9.q {
        e() {
        }

        @Override // r9.q
        /* JADX INFO: renamed from: a */
        public r9.o get() {
            return r9.o.c();
        }
    }

    class f implements t {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ k.a f17206a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ t f17207b;

        f(k.a aVar, t tVar) {
            this.f17206a = aVar;
            this.f17207b = tVar;
        }

        @Override // qb.o0
        public qb.j0 e() {
            return this.f17207b.e();
        }

        @Override // io.grpc.internal.t
        public r g(qb.a1 a1Var, qb.z0 z0Var, qb.c cVar, qb.k[] kVarArr) {
            qb.k kVarA = this.f17206a.a(k.b.a().b(cVar).a(), z0Var);
            r9.l.u(kVarArr[kVarArr.length - 1] == w0.f17202t, "lb tracer already assigned");
            kVarArr[kVarArr.length - 1] = kVarA;
            return this.f17207b.g(a1Var, z0Var, cVar, kVarArr);
        }
    }

    private static final class g implements k0.a {
        private g() {
        }

        @Override // qb.z0.k
        /* JADX INFO: renamed from: c */
        public byte[] b(byte[] bArr) {
            return bArr;
        }

        @Override // qb.z0.k
        /* JADX INFO: renamed from: d */
        public byte[] a(byte[] bArr) {
            return bArr;
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    public static final class h extends Enum {
        private static final /* synthetic */ h[] A;

        /* JADX INFO: renamed from: c */
        public static final h f17208c;

        /* JADX INFO: renamed from: d */
        public static final h f17209d;

        /* JADX INFO: renamed from: e */
        public static final h f17210e;

        /* JADX INFO: renamed from: f */
        public static final h f17211f;

        /* JADX INFO: renamed from: g */
        public static final h f17212g;

        /* JADX INFO: renamed from: h */
        public static final h f17213h;

        /* JADX INFO: renamed from: r */
        public static final h f17214r;

        /* JADX INFO: renamed from: s */
        public static final h f17215s;

        /* JADX INFO: renamed from: t */
        public static final h f17216t;

        /* JADX INFO: renamed from: u */
        public static final h f17217u;

        /* JADX INFO: renamed from: v */
        public static final h f17218v;

        /* JADX INFO: renamed from: w */
        public static final h f17219w;

        /* JADX INFO: renamed from: x */
        public static final h f17220x;

        /* JADX INFO: renamed from: y */
        public static final h f17221y;

        /* JADX INFO: renamed from: z */
        private static final h[] f17222z;

        /* JADX INFO: renamed from: a */
        private final int f17223a;

        /* JADX INFO: renamed from: b */
        private final qb.u1 f17224b;

        static {
            qb.u1 u1Var = qb.u1.f24784t;
            h hVar = new h("NO_ERROR", 0, 0, u1Var);
            f17208c = hVar;
            qb.u1 u1Var2 = qb.u1.f24783s;
            h hVar2 = new h("PROTOCOL_ERROR", 1, 1, u1Var2);
            f17209d = hVar2;
            h hVar3 = new h("INTERNAL_ERROR", 2, 2, u1Var2);
            f17210e = hVar3;
            h hVar4 = new h("FLOW_CONTROL_ERROR", 3, 3, u1Var2);
            f17211f = hVar4;
            h hVar5 = new h("SETTINGS_TIMEOUT", 4, 4, u1Var2);
            f17212g = hVar5;
            h hVar6 = new h("STREAM_CLOSED", 5, 5, u1Var2);
            f17213h = hVar6;
            h hVar7 = new h("FRAME_SIZE_ERROR", 6, 6, u1Var2);
            f17214r = hVar7;
            h hVar8 = new h("REFUSED_STREAM", 7, 7, u1Var);
            f17215s = hVar8;
            h hVar9 = new h("CANCEL", 8, 8, qb.u1.f24770f);
            f17216t = hVar9;
            h hVar10 = new h("COMPRESSION_ERROR", 9, 9, u1Var2);
            f17217u = hVar10;
            h hVar11 = new h("CONNECT_ERROR", 10, 10, u1Var2);
            f17218v = hVar11;
            h hVar12 = new h("ENHANCE_YOUR_CALM", 11, 11, qb.u1.f24778n.s("Bandwidth exhausted"));
            f17219w = hVar12;
            h hVar13 = new h("INADEQUATE_SECURITY", 12, 12, qb.u1.f24776l.s("Permission denied as protocol is not secure enough to call"));
            f17220x = hVar13;
            h hVar14 = new h("HTTP_1_1_REQUIRED", 13, 13, qb.u1.f24771g);
            f17221y = hVar14;
            A = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14};
            f17222z = a();
        }

        private h(String str, int i10, int i11, qb.u1 u1Var) {
            super(str, i10);
            this.f17223a = i11;
            String str2 = "HTTP/2 error code: " + name();
            if (u1Var.p() != null) {
                str2 = str2 + " (" + u1Var.p() + ")";
            }
            this.f17224b = u1Var.s(str2);
        }

        private static h[] a() {
            h[] hVarArrValues = values();
            h[] hVarArr = new h[((int) hVarArrValues[hVarArrValues.length - 1].d()) + 1];
            for (h hVar : hVarArrValues) {
                hVarArr[(int) hVar.d()] = hVar;
            }
            return hVarArr;
        }

        public static h e(long j10) {
            h[] hVarArr = f17222z;
            if (j10 >= hVarArr.length || j10 < 0) {
                return null;
            }
            return hVarArr[(int) j10];
        }

        public static qb.u1 g(long j10) {
            h hVarE = e(j10);
            if (hVarE != null) {
                return hVarE.f();
            }
            return qb.u1.j(f17210e.f().o().e()).s("Unrecognized HTTP/2 error code: " + j10);
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) A.clone();
        }

        public long d() {
            return this.f17223a;
        }

        public qb.u1 f() {
            return this.f17224b;
        }
    }

    static class i implements z0.d {
        i() {
        }

        @Override // qb.z0.d
        /* JADX INFO: renamed from: c */
        public Long b(String str) {
            r9.l.e(str.length() > 0, "empty timeout");
            r9.l.e(str.length() <= 9, "bad timeout format");
            long j10 = Long.parseLong(str.substring(0, str.length() - 1));
            char cCharAt = str.charAt(str.length() - 1);
            if (cCharAt == 'H') {
                return Long.valueOf(TimeUnit.HOURS.toNanos(j10));
            }
            if (cCharAt == 'M') {
                return Long.valueOf(TimeUnit.MINUTES.toNanos(j10));
            }
            if (cCharAt == 'S') {
                return Long.valueOf(TimeUnit.SECONDS.toNanos(j10));
            }
            if (cCharAt == 'u') {
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j10));
            }
            if (cCharAt == 'm') {
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j10));
            }
            if (cCharAt == 'n') {
                return Long.valueOf(j10);
            }
            throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
        }

        @Override // qb.z0.d
        /* JADX INFO: renamed from: d */
        public String a(Long l10) {
            long jMax = Math.max(1L, l10.longValue());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (jMax < 100000000) {
                return jMax + "n";
            }
            if (jMax < 100000000000L) {
                return timeUnit.toMicros(jMax) + "u";
            }
            if (jMax < 100000000000000L) {
                return timeUnit.toMillis(jMax) + "m";
            }
            if (jMax < 100000000000000000L) {
                return timeUnit.toSeconds(jMax) + "S";
            }
            if (jMax < 6000000000000000000L) {
                return timeUnit.toMinutes(jMax) + "M";
            }
            return timeUnit.toHours(jMax) + "H";
        }
    }

    static {
        z0.d dVar = qb.z0.f24834e;
        f17187e = z0.h.e("grpc-encoding", dVar);
        f17188f = qb.k0.b("grpc-accept-encoding", new g(null));
        f17189g = z0.h.e("content-encoding", dVar);
        f17190h = qb.k0.b("accept-encoding", new g(null));
        f17191i = z0.h.e("content-length", dVar);
        f17192j = z0.h.e("content-type", dVar);
        f17193k = z0.h.e("te", dVar);
        f17194l = z0.h.e("user-agent", dVar);
        f17195m = r9.n.a(',').c();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f17196n = timeUnit.toNanos(20L);
        f17197o = TimeUnit.HOURS.toNanos(2L);
        f17198p = timeUnit.toNanos(20L);
        f17199q = new g2();
        f17200r = new a();
        f17201s = c.C0338c.b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f17202t = new b();
        f17203u = new c();
        f17204v = new d();
        f17205w = new e();
    }

    public static URI b(String str) {
        String str2;
        r9.l.o(str, "authority");
        try {
            str2 = str;
        } catch (URISyntaxException e10) {
            e = e10;
            str2 = str;
        }
        try {
            return new URI(null, str2, null, null, null);
        } catch (URISyntaxException e11) {
            e = e11;
            throw new IllegalArgumentException("Invalid authority: " + str2, e);
        }
    }

    public static String c(String str) {
        r9.l.j(b(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    static void d(z2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                e(next);
            }
        }
    }

    public static void e(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            f17183a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e10);
        }
    }

    public static qb.k[] f(qb.c cVar, qb.z0 z0Var, int i10, boolean z10, boolean z11) {
        List listJ = cVar.j();
        int size = listJ.size();
        qb.k[] kVarArr = new qb.k[size + 1];
        k.b bVarA = k.b.a().b(cVar).e(i10).d(z10).c(z11).a();
        for (int i11 = 0; i11 < listJ.size(); i11++) {
            kVarArr[i11] = ((k.a) listJ.get(i11)).a(bVarA, z0Var);
        }
        kVarArr[size] = f17202t;
        return kVarArr;
    }

    public static boolean g(String str, boolean z10) {
        String strTrim = System.getenv(str);
        if (strTrim == null) {
            strTrim = System.getProperty(str);
        }
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        return z10 ? r9.p.b(strTrim) || Boolean.parseBoolean(strTrim) : !r9.p.b(strTrim) && Boolean.parseBoolean(strTrim);
    }

    public static String h(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str2 != null) {
            sb2.append(str2);
            sb2.append(' ');
        }
        sb2.append("grpc-java-");
        sb2.append(str);
        sb2.append('/');
        sb2.append("1.77.0");
        return sb2.toString();
    }

    public static ThreadFactory i(String str, boolean z10) {
        return new com.google.common.util.concurrent.l().e(z10).f(str).b();
    }

    static t j(q0.g gVar, boolean z10) {
        q0.j jVarD = gVar.d();
        t tVarA = jVarD != null ? ((e3) jVarD.e()).a() : null;
        if (tVarA != null) {
            k.a aVarC = gVar.c();
            return aVarC == null ? tVarA : new f(aVarC, tVarA);
        }
        if (!gVar.b().q()) {
            if (gVar.f()) {
                return new l0(n(gVar.b()), s.a.DROPPED);
            }
            if (!z10) {
                return new l0(n(gVar.b()), s.a.PROCESSED);
            }
        }
        return null;
    }

    private static u1.b k(int i10) {
        if (i10 >= 100 && i10 < 200) {
            return u1.b.INTERNAL;
        }
        if (i10 != 400) {
            if (i10 == 401) {
                return u1.b.UNAUTHENTICATED;
            }
            if (i10 == 403) {
                return u1.b.PERMISSION_DENIED;
            }
            if (i10 == 404) {
                return u1.b.UNIMPLEMENTED;
            }
            if (i10 != 429) {
                if (i10 != 431) {
                    switch (i10) {
                        case 502:
                        case 503:
                        case 504:
                            break;
                        default:
                            return u1.b.UNKNOWN;
                    }
                }
            }
            return u1.b.UNAVAILABLE;
        }
        return u1.b.INTERNAL;
    }

    public static qb.u1 l(int i10) {
        return k(i10).d().s("HTTP status code " + i10);
    }

    public static boolean m(String str) {
        char cCharAt;
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (lowerCase.startsWith("application/grpc")) {
            return lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';';
        }
        return false;
    }

    public static qb.u1 n(qb.u1 u1Var) {
        r9.l.d(u1Var != null);
        if (!f17184b.contains(u1Var.o())) {
            return u1Var;
        }
        return qb.u1.f24783s.s("Inappropriate status code from control plane: " + u1Var.o() + " " + u1Var.p()).r(u1Var.n());
    }

    public static boolean o(qb.c cVar) {
        return !Boolean.TRUE.equals(cVar.i(f17201s));
    }

    public static String p(qb.u1 u1Var) {
        if (u1Var.p() == null) {
            return u1Var.o().toString();
        }
        return u1Var.o() + ": " + u1Var.p();
    }

    public static qb.u1 q(u1.b bVar, String str, qb.u1 u1Var) {
        return bVar.d().s(str + ": " + p(u1Var)).r(u1Var.n());
    }
}
