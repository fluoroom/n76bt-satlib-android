package qb;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f24594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f24596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f24597e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f24598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f24599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f24600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private o0 f24601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private o0 f24602e;

        public e0 a() {
            r9.l.o(this.f24598a, "description");
            r9.l.o(this.f24599b, "severity");
            r9.l.o(this.f24600c, "timestampNanos");
            r9.l.u(this.f24601d == null || this.f24602e == null, "at least one of channelRef and subchannelRef must be null");
            return new e0(this.f24598a, this.f24599b, this.f24600c.longValue(), this.f24601d, this.f24602e);
        }

        public a b(String str) {
            this.f24598a = str;
            return this;
        }

        public a c(b bVar) {
            this.f24599b = bVar;
            return this;
        }

        public a d(o0 o0Var) {
            this.f24602e = o0Var;
            return this;
        }

        public a e(long j10) {
            this.f24600c = Long.valueOf(j10);
            return this;
        }
    }

    public enum b {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    public boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (r9.h.a(this.f24593a, e0Var.f24593a) && r9.h.a(this.f24594b, e0Var.f24594b) && this.f24595c == e0Var.f24595c && r9.h.a(this.f24596d, e0Var.f24596d) && r9.h.a(this.f24597e, e0Var.f24597e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return r9.h.b(this.f24593a, this.f24594b, Long.valueOf(this.f24595c), this.f24596d, this.f24597e);
    }

    public String toString() {
        return r9.g.b(this).d("description", this.f24593a).d("severity", this.f24594b).c("timestampNanos", this.f24595c).d("channelRef", this.f24596d).d("subchannelRef", this.f24597e).toString();
    }

    private e0(String str, b bVar, long j10, o0 o0Var, o0 o0Var2) {
        this.f24593a = str;
        this.f24594b = (b) r9.l.o(bVar, "severity");
        this.f24595c = j10;
        this.f24596d = o0Var;
        this.f24597e = o0Var2;
    }
}
