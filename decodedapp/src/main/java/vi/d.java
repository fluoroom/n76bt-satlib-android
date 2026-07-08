package vi;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class d implements pi.c, Serializable {

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f30879a = new d();
    }

    public static d c() {
        return b.f30879a;
    }

    @Override // pi.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c b() {
        return c.f30863d;
    }

    @Override // pi.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c a() {
        return c.f30864e;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return -1400350011;
    }

    private d() {
    }
}
