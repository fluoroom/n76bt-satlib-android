package lf;

import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f20558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f20559b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            m.e(str, "name");
            m.e(str2, "desc");
            this.f20558a = str;
            this.f20559b = str2;
        }

        @Override // lf.d
        public String a() {
            return e() + ':' + d();
        }

        public final String b() {
            return this.f20558a;
        }

        public final String c() {
            return this.f20559b;
        }

        public String d() {
            return this.f20559b;
        }

        public String e() {
            return this.f20558a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m.a(this.f20558a, aVar.f20558a) && m.a(this.f20559b, aVar.f20559b);
        }

        public int hashCode() {
            return (this.f20558a.hashCode() * 31) + this.f20559b.hashCode();
        }
    }

    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f20560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f20561b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(null);
            m.e(str, "name");
            m.e(str2, "desc");
            this.f20560a = str;
            this.f20561b = str2;
        }

        public static /* synthetic */ b c(b bVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f20560a;
            }
            if ((i10 & 2) != 0) {
                str2 = bVar.f20561b;
            }
            return bVar.b(str, str2);
        }

        @Override // lf.d
        public String a() {
            return e() + d();
        }

        public final b b(String str, String str2) {
            m.e(str, "name");
            m.e(str2, "desc");
            return new b(str, str2);
        }

        public String d() {
            return this.f20561b;
        }

        public String e() {
            return this.f20560a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return m.a(this.f20560a, bVar.f20560a) && m.a(this.f20561b, bVar.f20561b);
        }

        public int hashCode() {
            return (this.f20560a.hashCode() * 31) + this.f20561b.hashCode();
        }
    }

    public /* synthetic */ d(rd.h hVar) {
        this();
    }

    public abstract String a();

    public final String toString() {
        return a();
    }

    private d() {
    }
}
