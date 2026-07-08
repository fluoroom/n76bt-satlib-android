package hh;

import eh.f0;
import eh.h0;
import eh.y;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import rd.m;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15364c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f15365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0 f15366b;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(eh.h0 r5, eh.f0 r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                rd.m.e(r5, r0)
                java.lang.String r0 = "request"
                rd.m.e(r6, r0)
                int r0 = r5.n()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L65
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L65
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L65
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L65
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L65
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L65
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L3b
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L65
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L65
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L65
                switch(r0) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r2
            L3b:
                java.lang.String r0 = "Expires"
                r1 = 2
                r3 = 0
                java.lang.String r0 = eh.h0.w(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                eh.d r0 = r5.e()
                int r0 = r0.e()
                r1 = -1
                if (r0 != r1) goto L65
                eh.d r0 = r5.e()
                boolean r0 = r0.d()
                if (r0 != 0) goto L65
                eh.d r0 = r5.e()
                boolean r0 = r0.c()
                if (r0 != 0) goto L65
                return r2
            L65:
                eh.d r5 = r5.e()
                boolean r5 = r5.j()
                if (r5 != 0) goto L7b
                eh.d r5 = r6.b()
                boolean r5 = r5.j()
                if (r5 != 0) goto L7b
                r5 = 1
                return r5
            L7b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: hh.d.a.a(eh.h0, eh.f0):boolean");
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f15367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f0 f15368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h0 f15369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Date f15370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f15371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Date f15372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f15373g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Date f15374h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f15375i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f15376j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f15377k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f15378l;

        public b(long j10, f0 f0Var, h0 h0Var) {
            m.e(f0Var, "request");
            this.f15367a = j10;
            this.f15368b = f0Var;
            this.f15369c = h0Var;
            this.f15378l = -1;
            if (h0Var != null) {
                this.f15375i = h0Var.t0();
                this.f15376j = h0Var.h0();
                y yVarX = h0Var.x();
                int size = yVarX.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strD = yVarX.d(i10);
                    String strG = yVarX.g(i10);
                    if (q.x(strD, "Date", true)) {
                        this.f15370d = kh.c.a(strG);
                        this.f15371e = strG;
                    } else if (q.x(strD, "Expires", true)) {
                        this.f15374h = kh.c.a(strG);
                    } else if (q.x(strD, "Last-Modified", true)) {
                        this.f15372f = kh.c.a(strG);
                        this.f15373g = strG;
                    } else if (q.x(strD, "ETag", true)) {
                        this.f15377k = strG;
                    } else if (q.x(strD, "Age", true)) {
                        this.f15378l = fh.m.D(strG, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f15370d;
            long jMax = date != null ? Math.max(0L, this.f15376j - date.getTime()) : 0L;
            int i10 = this.f15378l;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            return jMax + Math.max(0L, this.f15376j - this.f15375i) + Math.max(0L, this.f15367a - this.f15376j);
        }

        private final d c() {
            String str;
            if (this.f15369c == null) {
                return new d(this.f15368b, null);
            }
            if (this.f15368b.h() && this.f15369c.r() == null) {
                return new d(this.f15368b, null);
            }
            if (!d.f15364c.a(this.f15369c, this.f15368b)) {
                return new d(this.f15368b, null);
            }
            eh.d dVarB = this.f15368b.b();
            if (dVarB.i() || e(this.f15368b)) {
                return new d(this.f15368b, null);
            }
            eh.d dVarE = this.f15369c.e();
            long jA = a();
            long jD = d();
            if (dVarB.e() != -1) {
                jD = Math.min(jD, TimeUnit.SECONDS.toMillis(dVarB.e()));
            }
            long millis = 0;
            long millis2 = dVarB.g() != -1 ? TimeUnit.SECONDS.toMillis(dVarB.g()) : 0L;
            if (!dVarE.h() && dVarB.f() != -1) {
                millis = TimeUnit.SECONDS.toMillis(dVarB.f());
            }
            if (!dVarE.i()) {
                long j10 = millis2 + jA;
                if (j10 < millis + jD) {
                    h0.a aVarT = this.f15369c.T();
                    if (j10 >= jD) {
                        aVarT.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jA > 86400000 && f()) {
                        aVarT.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new d(null, aVarT.c());
                }
            }
            String str2 = this.f15377k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f15372f != null) {
                    str2 = this.f15373g;
                } else {
                    if (this.f15370d == null) {
                        return new d(this.f15368b, null);
                    }
                    str2 = this.f15371e;
                }
                str = "If-Modified-Since";
            }
            y.a aVarE = this.f15368b.f().e();
            m.b(str2);
            aVarE.d(str, str2);
            return new d(this.f15368b.j().l(aVarE.f()).a(), this.f15369c);
        }

        private final long d() {
            h0 h0Var = this.f15369c;
            m.b(h0Var);
            if (h0Var.e().e() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.e());
            }
            Date date = this.f15374h;
            if (date != null) {
                Date date2 = this.f15370d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f15376j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f15372f != null && this.f15369c.p0().m().n() == null) {
                Date date3 = this.f15370d;
                long time2 = date3 != null ? date3.getTime() : this.f15375i;
                Date date4 = this.f15372f;
                m.b(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
            }
            return 0L;
        }

        private final boolean e(f0 f0Var) {
            return (f0Var.e("If-Modified-Since") == null && f0Var.e("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            h0 h0Var = this.f15369c;
            m.b(h0Var);
            return h0Var.e().e() == -1 && this.f15374h == null;
        }

        public final d b() {
            d dVarC = c();
            return (dVarC.b() == null || !this.f15368b.b().l()) ? dVarC : new d(null, null);
        }
    }

    public d(f0 f0Var, h0 h0Var) {
        this.f15365a = f0Var;
        this.f15366b = h0Var;
    }

    public final h0 a() {
        return this.f15366b;
    }

    public final f0 b() {
        return this.f15365a;
    }
}
