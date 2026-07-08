package lg;

import lg.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20600a;

    public static final class a extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f20601b = new a();

        private a() {
            super("must be a member function", null);
        }

        @Override // lg.f
        public boolean b(he.z zVar) {
            rd.m.e(zVar, "functionDescriptor");
            return zVar.g0() != null;
        }
    }

    public static final class b extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f20602b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // lg.f
        public boolean b(he.z zVar) {
            rd.m.e(zVar, "functionDescriptor");
            return (zVar.g0() == null && zVar.l0() == null) ? false : true;
        }
    }

    public /* synthetic */ k(String str, rd.h hVar) {
        this(str);
    }

    @Override // lg.f
    public String a() {
        return this.f20600a;
    }

    @Override // lg.f
    public String c(he.z zVar) {
        return f.a.a(this, zVar);
    }

    private k(String str) {
        this.f20600a = str;
    }
}
