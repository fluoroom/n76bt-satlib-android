package ef;

import kf.a;
import lf.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11939b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11940a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final a0 a(String str, String str2) {
            rd.m.e(str, "name");
            rd.m.e(str2, "desc");
            return new a0(str + '#' + str2, null);
        }

        public final a0 b(lf.d dVar) {
            rd.m.e(dVar, "signature");
            if (dVar instanceof d.b) {
                d.b bVar = (d.b) dVar;
                return d(bVar.e(), bVar.d());
            }
            if (!(dVar instanceof d.a)) {
                throw new dd.o();
            }
            d.a aVar = (d.a) dVar;
            return a(aVar.e(), aVar.d());
        }

        public final a0 c(jf.d dVar, a.c cVar) {
            rd.m.e(dVar, "nameResolver");
            rd.m.e(cVar, "signature");
            return d(dVar.getString(cVar.s()), dVar.getString(cVar.r()));
        }

        public final a0 d(String str, String str2) {
            rd.m.e(str, "name");
            rd.m.e(str2, "desc");
            return new a0(str + str2, null);
        }

        public final a0 e(a0 a0Var, int i10) {
            rd.m.e(a0Var, "signature");
            return new a0(a0Var.a() + '@' + i10, null);
        }

        private a() {
        }
    }

    public /* synthetic */ a0(String str, rd.h hVar) {
        this(str);
    }

    public final String a() {
        return this.f11940a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && rd.m.a(this.f11940a, ((a0) obj).f11940a);
    }

    public int hashCode() {
        return this.f11940a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f11940a + ')';
    }

    private a0(String str) {
        this.f11940a = str;
    }
}
