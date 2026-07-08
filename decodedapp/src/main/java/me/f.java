package me;

import ef.x;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21968c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f21969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ff.a f21970b;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final f a(Class cls) {
            rd.m.e(cls, "klass");
            ff.b bVar = new ff.b();
            c.f21963a.b(cls, bVar);
            ff.a aVarN = bVar.n();
            rd.h hVar = null;
            if (aVarN == null) {
                return null;
            }
            return new f(cls, aVarN, hVar);
        }

        private a() {
        }
    }

    public /* synthetic */ f(Class cls, ff.a aVar, rd.h hVar) {
        this(cls, aVar);
    }

    @Override // ef.x
    public ff.a a() {
        return this.f21970b;
    }

    @Override // ef.x
    public void b(x.c cVar, byte[] bArr) {
        rd.m.e(cVar, "visitor");
        c.f21963a.b(this.f21969a, cVar);
    }

    @Override // ef.x
    public void c(x.d dVar, byte[] bArr) {
        rd.m.e(dVar, "visitor");
        c.f21963a.i(this.f21969a, dVar);
    }

    public final Class d() {
        return this.f21969a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && rd.m.a(this.f21969a, ((f) obj).f21969a);
    }

    @Override // ef.x
    public String getLocation() {
        StringBuilder sb2 = new StringBuilder();
        String name = this.f21969a.getName();
        rd.m.d(name, "getName(...)");
        sb2.append(q.E(name, '.', '/', false, 4, null));
        sb2.append(".class");
        return sb2.toString();
    }

    @Override // ef.x
    public mf.b h() {
        return ne.f.e(this.f21969a);
    }

    public int hashCode() {
        return this.f21969a.hashCode();
    }

    public String toString() {
        return f.class.getName() + ": " + this.f21969a;
    }

    private f(Class cls, ff.a aVar) {
        this.f21969a = cls;
        this.f21970b = aVar;
    }
}
