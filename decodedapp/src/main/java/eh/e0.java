package eh;

import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f12387c = new e0("HTTP_1_0", 0, "http/1.0");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f12388d = new e0("HTTP_1_1", 1, "http/1.1");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e0 f12389e = new e0("SPDY_3", 2, "spdy/3.1");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e0 f12390f = new e0("HTTP_2", 3, "h2");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e0 f12391g = new e0("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e0 f12392h = new e0("QUIC", 5, "quic");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e0 f12393r = new e0("HTTP_3", 6, "h3");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ e0[] f12394s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ kd.a f12395t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12396a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final e0 a(String str) throws IOException {
            rd.m.e(str, "protocol");
            e0 e0Var = e0.f12387c;
            if (rd.m.a(str, e0Var.f12396a)) {
                return e0Var;
            }
            e0 e0Var2 = e0.f12388d;
            if (rd.m.a(str, e0Var2.f12396a)) {
                return e0Var2;
            }
            e0 e0Var3 = e0.f12391g;
            if (rd.m.a(str, e0Var3.f12396a)) {
                return e0Var3;
            }
            e0 e0Var4 = e0.f12390f;
            if (rd.m.a(str, e0Var4.f12396a)) {
                return e0Var4;
            }
            e0 e0Var5 = e0.f12389e;
            if (rd.m.a(str, e0Var5.f12396a)) {
                return e0Var5;
            }
            e0 e0Var6 = e0.f12392h;
            if (rd.m.a(str, e0Var6.f12396a)) {
                return e0Var6;
            }
            e0 e0Var7 = e0.f12393r;
            if (rg.q.J(str, e0Var7.f12396a, false, 2, null)) {
                return e0Var7;
            }
            throw new IOException("Unexpected protocol: " + str);
        }

        private a() {
        }
    }

    static {
        e0[] e0VarArrA = a();
        f12394s = e0VarArrA;
        f12395t = kd.b.a(e0VarArrA);
        f12386b = new a(null);
    }

    private e0(String str, int i10, String str2) {
        this.f12396a = str2;
    }

    private static final /* synthetic */ e0[] a() {
        return new e0[]{f12387c, f12388d, f12389e, f12390f, f12391g, f12392h, f12393r};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f12394s.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f12396a;
    }
}
