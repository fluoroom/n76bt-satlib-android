package u7;

import t7.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t7.a f28384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.d f28385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28386d;

    private b(t7.a aVar, a.d dVar, String str) {
        this.f28384b = aVar;
        this.f28385c = dVar;
        this.f28386d = str;
        this.f28383a = v7.o.b(aVar, dVar, str);
    }

    public static b a(t7.a aVar, a.d dVar, String str) {
        return new b(aVar, dVar, str);
    }

    public final String b() {
        return this.f28384b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return v7.o.a(this.f28384b, bVar.f28384b) && v7.o.a(this.f28385c, bVar.f28385c) && v7.o.a(this.f28386d, bVar.f28386d);
    }

    public final int hashCode() {
        return this.f28383a;
    }
}
