package lg;

import lg.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20574a;

    public static final class a extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f20575b;

        public a(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("must have at least ");
            sb2.append(i10);
            sb2.append(" value parameter");
            sb2.append(i10 > 1 ? "s" : "");
            super(sb2.toString(), null);
            this.f20575b = i10;
        }

        @Override // lg.f
        public boolean b(he.z zVar) {
            rd.m.e(zVar, "functionDescriptor");
            return zVar.i().size() >= this.f20575b;
        }
    }

    public static final class b extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f20576b;

        public b(int i10) {
            super("must have exactly " + i10 + " value parameters", null);
            this.f20576b = i10;
        }

        @Override // lg.f
        public boolean b(he.z zVar) {
            rd.m.e(zVar, "functionDescriptor");
            return zVar.i().size() == this.f20576b;
        }
    }

    public static final class c extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f20577b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // lg.f
        public boolean b(he.z zVar) {
            rd.m.e(zVar, "functionDescriptor");
            return zVar.i().isEmpty();
        }
    }

    public static final class d extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f20578b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // lg.f
        public boolean b(he.z zVar) {
            rd.m.e(zVar, "functionDescriptor");
            return zVar.i().size() == 1;
        }
    }

    public /* synthetic */ a0(String str, rd.h hVar) {
        this(str);
    }

    @Override // lg.f
    public String a() {
        return this.f20574a;
    }

    @Override // lg.f
    public String c(he.z zVar) {
        return f.a.a(this, zVar);
    }

    private a0(String str) {
        this.f20574a = str;
    }
}
