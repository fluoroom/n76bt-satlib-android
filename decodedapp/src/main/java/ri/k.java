package ri;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class k implements pi.c, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f26111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f26112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ri.b f26113c;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final k f26114a = new k();
    }

    public static k c() {
        return b.f26114a;
    }

    @Override // pi.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public j b() {
        return this.f26112b;
    }

    @Override // pi.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public j a() {
        return this.f26111a;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return 1911829251;
    }

    private k() {
        this.f26111a = new j(0.0d, 0.0d, 0.0d);
        this.f26112b = new j(1.0d, 0.0d, 0.0d);
        this.f26113c = new ri.b(1, 2);
    }
}
