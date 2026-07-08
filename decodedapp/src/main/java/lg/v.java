package lg;

import eg.c1;
import eg.r0;
import lg.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qd.l f20650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20651c;

    public static final class a extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f20652d = new a();

        private a() {
            super("Boolean", u.f20648a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r0 d(ee.i iVar) {
            rd.m.e(iVar, "<this>");
            c1 c1VarO = iVar.o();
            rd.m.d(c1VarO, "getBooleanType(...)");
            return c1VarO;
        }
    }

    public static final class b extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f20653d = new b();

        private b() {
            super("Int", w.f20655a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r0 d(ee.i iVar) {
            rd.m.e(iVar, "<this>");
            c1 c1VarE = iVar.E();
            rd.m.d(c1VarE, "getIntType(...)");
            return c1VarE;
        }
    }

    public static final class c extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f20654d = new c();

        private c() {
            super("Unit", x.f20656a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r0 d(ee.i iVar) {
            rd.m.e(iVar, "<this>");
            c1 c1VarA0 = iVar.a0();
            rd.m.d(c1VarA0, "getUnitType(...)");
            return c1VarA0;
        }
    }

    public /* synthetic */ v(String str, qd.l lVar, rd.h hVar) {
        this(str, lVar);
    }

    @Override // lg.f
    public String a() {
        return this.f20651c;
    }

    @Override // lg.f
    public boolean b(he.z zVar) {
        rd.m.e(zVar, "functionDescriptor");
        return rd.m.a(zVar.g(), this.f20650b.l(uf.e.m(zVar)));
    }

    @Override // lg.f
    public String c(he.z zVar) {
        return f.a.a(this, zVar);
    }

    private v(String str, qd.l lVar) {
        this.f20649a = str;
        this.f20650b = lVar;
        this.f20651c = "must return " + str;
    }
}
