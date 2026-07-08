package ri;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class i implements pi.c, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f26103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f26104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ri.b f26105c;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final i f26106a = new i();
    }

    public static i c() {
        return b.f26106a;
    }

    @Override // pi.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public h b() {
        return this.f26104b;
    }

    @Override // pi.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public h a() {
        return this.f26103a;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return -706644745;
    }

    private i() {
        this.f26103a = new h(0.0d, 0.0d);
        this.f26104b = new h(1.0d, 0.0d);
        this.f26105c = new ri.b(1, 1);
    }
}
