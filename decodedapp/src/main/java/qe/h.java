package qe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    public static final class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25010a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            rd.m.e(str, "name");
            this.f25010a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && rd.m.a(this.f25010a, ((a) obj).f25010a);
        }

        public int hashCode() {
            return this.f25010a.hashCode();
        }

        public String toString() {
            return "Class(name=" + this.f25010a + ')';
        }
    }

    public static final class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25011a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            rd.m.e(str, "name");
            this.f25011a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && rd.m.a(this.f25011a, ((b) obj).f25011a);
        }

        public int hashCode() {
            return this.f25011a.hashCode();
        }

        public String toString() {
            return "TypeAlias(name=" + this.f25011a + ')';
        }
    }

    public static final class c extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f25012a;

        public c(int i10) {
            super(null);
            this.f25012a = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f25012a == ((c) obj).f25012a;
        }

        public int hashCode() {
            return this.f25012a;
        }

        public String toString() {
            return "TypeParameter(id=" + this.f25012a + ')';
        }
    }

    public /* synthetic */ h(rd.h hVar) {
        this();
    }

    private h() {
    }
}
