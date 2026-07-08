package fe;

import fe.f;
import rd.h;
import rd.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f12993b = new c("Function", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f12994c = new c("SuspendFunction", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f12995d = new c("KFunction", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f12996e = new c("KSuspendFunction", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f12997f = new c("UNKNOWN", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ c[] f12998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ kd.a f12999h;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(f fVar) {
            m.e(fVar, "functionTypeKind");
            return m.a(fVar, f.a.f13005f) ? c.f12993b : m.a(fVar, f.d.f13008f) ? c.f12994c : m.a(fVar, f.b.f13006f) ? c.f12995d : m.a(fVar, f.c.f13007f) ? c.f12996e : c.f12997f;
        }

        private a() {
        }
    }

    static {
        c[] cVarArrA = a();
        f12998g = cVarArrA;
        f12999h = kd.b.a(cVarArrA);
        f12992a = new a(null);
    }

    private c(String str, int i10) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f12993b, f12994c, f12995d, f12996e, f12997f};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f12998g.clone();
    }
}
