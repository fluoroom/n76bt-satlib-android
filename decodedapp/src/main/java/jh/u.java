package jh;

import eh.z;

/* JADX INFO: loaded from: classes3.dex */
public interface u {

    public interface b {
        boolean a();

        b b();

        n c();

        void cancel();

        a d();

        a g();
    }

    boolean a(n nVar);

    boolean b(z zVar);

    boolean c();

    eh.a d();

    ed.i e();

    b f();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f18854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f18855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Throwable f18856c;

        public a(b bVar, b bVar2, Throwable th2) {
            rd.m.e(bVar, "plan");
            this.f18854a = bVar;
            this.f18855b = bVar2;
            this.f18856c = th2;
        }

        public final b a() {
            return this.f18855b;
        }

        public final Throwable b() {
            return this.f18856c;
        }

        public final b c() {
            return this.f18855b;
        }

        public final b d() {
            return this.f18854a;
        }

        public final Throwable e() {
            return this.f18856c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return rd.m.a(this.f18854a, aVar.f18854a) && rd.m.a(this.f18855b, aVar.f18855b) && rd.m.a(this.f18856c, aVar.f18856c);
        }

        public final boolean f() {
            return this.f18855b == null && this.f18856c == null;
        }

        public int hashCode() {
            int iHashCode = this.f18854a.hashCode() * 31;
            b bVar = this.f18855b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Throwable th2 = this.f18856c;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        public String toString() {
            return "ConnectResult(plan=" + this.f18854a + ", nextPlan=" + this.f18855b + ", throwable=" + this.f18856c + ')';
        }

        public /* synthetic */ a(b bVar, b bVar2, Throwable th2, int i10, rd.h hVar) {
            this(bVar, (i10 & 2) != 0 ? null : bVar2, (i10 & 4) != 0 ? null : th2);
        }
    }
}
