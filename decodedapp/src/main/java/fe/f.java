package fe;

import ee.o;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mf.c f13000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f13002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mf.b f13003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f13004e;

    public static final class a extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f13005f = new a();

        private a() {
            super(o.B, "Function", false, null, true);
        }
    }

    public static final class b extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f13006f = new b();

        private b() {
            super(o.f11859y, "KFunction", true, null, false);
        }
    }

    public static final class c extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f13007f = new c();

        private c() {
            super(o.f11859y, "KSuspendFunction", true, null, false);
        }
    }

    public static final class d extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f13008f = new d();

        private d() {
            super(o.f11853s, "SuspendFunction", false, null, true);
        }
    }

    public f(mf.c cVar, String str, boolean z10, mf.b bVar, boolean z11) {
        m.e(cVar, "packageFqName");
        m.e(str, "classNamePrefix");
        this.f13000a = cVar;
        this.f13001b = str;
        this.f13002c = z10;
        this.f13003d = bVar;
        this.f13004e = z11;
    }

    public final String a() {
        return this.f13001b;
    }

    public final mf.c b() {
        return this.f13000a;
    }

    public final mf.f c(int i10) {
        mf.f fVarH = mf.f.h(this.f13001b + i10);
        m.d(fVarH, "identifier(...)");
        return fVarH;
    }

    public String toString() {
        return this.f13000a + '.' + this.f13001b + 'N';
    }
}
