package mf;

import java.util.List;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21993c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f21994d = new c("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f21995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient c f21996b;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final c a(f fVar) {
            m.e(fVar, "shortName");
            return new c(d.f21997e.a(fVar));
        }

        private a() {
        }
    }

    public c(String str) {
        m.e(str, "fqName");
        this.f21995a = new d(str, this);
    }

    public final String a() {
        return this.f21995a.a();
    }

    public final c b(f fVar) {
        m.e(fVar, "name");
        return new c(this.f21995a.b(fVar), this);
    }

    public final boolean c() {
        return this.f21995a.e();
    }

    public final c d() {
        c cVar = this.f21996b;
        if (cVar != null) {
            return cVar;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        c cVar2 = new c(this.f21995a.g());
        this.f21996b = cVar2;
        return cVar2;
    }

    public final List e() {
        return this.f21995a.h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && m.a(this.f21995a, ((c) obj).f21995a);
    }

    public final f f() {
        return this.f21995a.j();
    }

    public final f g() {
        return this.f21995a.k();
    }

    public final boolean h(f fVar) {
        m.e(fVar, "segment");
        return this.f21995a.l(fVar);
    }

    public int hashCode() {
        return this.f21995a.hashCode();
    }

    public final d i() {
        return this.f21995a;
    }

    public String toString() {
        return this.f21995a.toString();
    }

    public c(d dVar) {
        m.e(dVar, "fqName");
        this.f21995a = dVar;
    }

    private c(d dVar, c cVar) {
        this.f21995a = dVar;
        this.f21996b = cVar;
    }
}
