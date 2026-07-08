package ub;

import sb.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ub.a f29030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f29031b;

    /* JADX INFO: renamed from: ub.b$b, reason: collision with other inner class name */
    public static class C0397b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ub.a f29032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e.b f29033b = new e.b();

        public b c() {
            if (this.f29032a != null) {
                return new b(this);
            }
            throw new IllegalStateException("url == null");
        }

        public C0397b d(String str, String str2) {
            this.f29033b.f(str, str2);
            return this;
        }

        public C0397b e(ub.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f29032a = aVar;
            return this;
        }
    }

    public e a() {
        return this.f29031b;
    }

    public ub.a b() {
        return this.f29030a;
    }

    public String toString() {
        return "Request{url=" + this.f29030a + '}';
    }

    private b(C0397b c0397b) {
        this.f29030a = c0397b.f29032a;
        this.f29031b = c0397b.f29033b.c();
    }
}
