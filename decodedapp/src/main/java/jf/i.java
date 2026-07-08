package jf;

import dd.o;
import gf.w;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f18698f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f18699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w.d f18700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dd.a f18701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f18702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f18703e;

    public static final class a {

        /* JADX INFO: renamed from: jf.i$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0244a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18704a;

            static {
                int[] iArr = new int[w.c.values().length];
                try {
                    iArr[w.c.WARNING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[w.c.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[w.c.HIDDEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f18704a = iArr;
            }
        }

        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final i a(int i10, d dVar, j jVar) {
            dd.a aVar;
            m.e(dVar, "nameResolver");
            m.e(jVar, "table");
            w wVarB = jVar.b(i10);
            if (wVarB == null) {
                return null;
            }
            b bVarA = b.f18705d.a(wVarB.L() ? Integer.valueOf(wVarB.A()) : null, wVarB.N() ? Integer.valueOf(wVarB.C()) : null);
            w.c cVarX = wVarB.x();
            m.b(cVarX);
            int i11 = C0244a.f18704a[cVarX.ordinal()];
            if (i11 == 1) {
                aVar = dd.a.f10889a;
            } else if (i11 == 2) {
                aVar = dd.a.f10890b;
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                aVar = dd.a.f10891c;
            }
            dd.a aVar2 = aVar;
            Integer numValueOf = wVarB.G() ? Integer.valueOf(wVarB.w()) : null;
            String string = wVarB.K() ? dVar.getString(wVarB.z()) : null;
            w.d dVarD = wVarB.D();
            m.d(dVarD, "getVersionKind(...)");
            return new i(bVarA, dVarD, aVar2, numValueOf, string);
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f18705d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f18706e = new b(256, 256, 256);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f18707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f18709c;

        public static final class a {
            public /* synthetic */ a(rd.h hVar) {
                this();
            }

            public final b a(Integer num, Integer num2) {
                return num2 != null ? new b(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255) : num != null ? new b(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127) : b.f18706e;
            }

            private a() {
            }
        }

        public b(int i10, int i11, int i12) {
            this.f18707a = i10;
            this.f18708b = i11;
            this.f18709c = i12;
        }

        public final String a() {
            StringBuilder sb2;
            int i10;
            if (this.f18709c == 0) {
                sb2 = new StringBuilder();
                sb2.append(this.f18707a);
                sb2.append('.');
                i10 = this.f18708b;
            } else {
                sb2 = new StringBuilder();
                sb2.append(this.f18707a);
                sb2.append('.');
                sb2.append(this.f18708b);
                sb2.append('.');
                i10 = this.f18709c;
            }
            sb2.append(i10);
            return sb2.toString();
        }

        public final int b() {
            return this.f18707a;
        }

        public final int c() {
            return this.f18708b;
        }

        public final int d() {
            return this.f18709c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f18707a == bVar.f18707a && this.f18708b == bVar.f18708b && this.f18709c == bVar.f18709c;
        }

        public int hashCode() {
            return (((this.f18707a * 31) + this.f18708b) * 31) + this.f18709c;
        }

        public String toString() {
            return a();
        }
    }

    public i(b bVar, w.d dVar, dd.a aVar, Integer num, String str) {
        m.e(bVar, "version");
        m.e(dVar, "kind");
        m.e(aVar, "level");
        this.f18699a = bVar;
        this.f18700b = dVar;
        this.f18701c = aVar;
        this.f18702d = num;
        this.f18703e = str;
    }

    public final Integer a() {
        return this.f18702d;
    }

    public final w.d b() {
        return this.f18700b;
    }

    public final dd.a c() {
        return this.f18701c;
    }

    public final String d() {
        return this.f18703e;
    }

    public final b e() {
        return this.f18699a;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("since ");
        sb2.append(this.f18699a);
        sb2.append(' ');
        sb2.append(this.f18701c);
        String str2 = "";
        if (this.f18702d != null) {
            str = " error " + this.f18702d;
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f18703e != null) {
            str2 = ": " + this.f18703e;
        }
        sb2.append(str2);
        return sb2.toString();
    }
}
