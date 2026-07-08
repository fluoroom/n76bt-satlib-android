package ef;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12037a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f12038b = new d(vf.e.BOOLEAN);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f12039c = new d(vf.e.CHAR);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d f12040d = new d(vf.e.BYTE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f12041e = new d(vf.e.SHORT);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f12042f = new d(vf.e.INT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d f12043g = new d(vf.e.FLOAT);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d f12044h = new d(vf.e.LONG);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final d f12045i = new d(vf.e.DOUBLE);

    public static final class a extends s {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final s f12046j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar) {
            super(null);
            rd.m.e(sVar, "elementType");
            this.f12046j = sVar;
        }

        public final s i() {
            return this.f12046j;
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final d a() {
            return s.f12038b;
        }

        public final d b() {
            return s.f12040d;
        }

        public final d c() {
            return s.f12039c;
        }

        public final d d() {
            return s.f12045i;
        }

        public final d e() {
            return s.f12043g;
        }

        public final d f() {
            return s.f12042f;
        }

        public final d g() {
            return s.f12044h;
        }

        public final d h() {
            return s.f12041e;
        }

        private b() {
        }
    }

    public static final class c extends s {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f12047j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            rd.m.e(str, "internalName");
            this.f12047j = str;
        }

        public final String i() {
            return this.f12047j;
        }
    }

    public static final class d extends s {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final vf.e f12048j;

        public d(vf.e eVar) {
            super(null);
            this.f12048j = eVar;
        }

        public final vf.e i() {
            return this.f12048j;
        }
    }

    public /* synthetic */ s(rd.h hVar) {
        this();
    }

    public String toString() {
        return u.f12049a.a(this);
    }

    private s() {
    }
}
