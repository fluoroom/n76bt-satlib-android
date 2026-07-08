package r9;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0354b f25631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C0354b f25632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f25633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f25634e;

        private static final class a extends C0354b {
            private a() {
            }
        }

        /* JADX INFO: renamed from: r9.g$b$b, reason: collision with other inner class name */
        static class C0354b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f25635a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f25636b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            C0354b f25637c;

            C0354b() {
            }
        }

        private C0354b f() {
            C0354b c0354b = new C0354b();
            this.f25632c.f25637c = c0354b;
            this.f25632c = c0354b;
            return c0354b;
        }

        private b g(String str, Object obj) {
            C0354b c0354bF = f();
            c0354bF.f25636b = obj;
            c0354bF.f25635a = (String) l.n(str);
            return this;
        }

        private a h() {
            a aVar = new a();
            this.f25632c.f25637c = aVar;
            this.f25632c = aVar;
            return aVar;
        }

        private b i(String str, Object obj) {
            a aVarH = h();
            aVarH.f25636b = obj;
            aVarH.f25635a = (String) l.n(str);
            return this;
        }

        private static boolean j(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof i ? !((i) obj).b() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b a(String str, double d10) {
            return i(str, String.valueOf(d10));
        }

        public b b(String str, int i10) {
            return i(str, String.valueOf(i10));
        }

        public b c(String str, long j10) {
            return i(str, String.valueOf(j10));
        }

        public b d(String str, Object obj) {
            return g(str, obj);
        }

        public b e(String str, boolean z10) {
            return i(str, String.valueOf(z10));
        }

        public b k() {
            this.f25633d = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r8 = this;
                boolean r0 = r8.f25633d
                boolean r1 = r8.f25634e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 32
                r2.<init>(r3)
                java.lang.String r3 = r8.f25630a
                r2.append(r3)
                r3 = 123(0x7b, float:1.72E-43)
                r2.append(r3)
                r9.g$b$b r3 = r8.f25631b
                r9.g$b$b r3 = r3.f25637c
                java.lang.String r4 = ""
            L1b:
                if (r3 == 0) goto L66
                java.lang.Object r5 = r3.f25636b
                boolean r6 = r3 instanceof r9.g.b.a
                if (r6 != 0) goto L30
                if (r5 != 0) goto L28
                if (r0 != 0) goto L63
                goto L30
            L28:
                if (r1 == 0) goto L30
                boolean r6 = j(r5)
                if (r6 != 0) goto L63
            L30:
                r2.append(r4)
                java.lang.String r4 = r3.f25635a
                if (r4 == 0) goto L3f
                r2.append(r4)
                r4 = 61
                r2.append(r4)
            L3f:
                if (r5 == 0) goto L5e
                java.lang.Class r4 = r5.getClass()
                boolean r4 = r4.isArray()
                if (r4 == 0) goto L5e
                r4 = 1
                java.lang.Object[] r6 = new java.lang.Object[r4]
                r7 = 0
                r6[r7] = r5
                java.lang.String r5 = java.util.Arrays.deepToString(r6)
                int r6 = r5.length()
                int r6 = r6 - r4
                r2.append(r5, r4, r6)
                goto L61
            L5e:
                r2.append(r5)
            L61:
                java.lang.String r4 = ", "
            L63:
                r9.g$b$b r3 = r3.f25637c
                goto L1b
            L66:
                r0 = 125(0x7d, float:1.75E-43)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r9.g.b.toString():java.lang.String");
        }

        private b(String str) {
            C0354b c0354b = new C0354b();
            this.f25631b = c0354b;
            this.f25632c = c0354b;
            this.f25633d = false;
            this.f25634e = false;
            this.f25630a = (String) l.n(str);
        }
    }

    public static b a(Class cls) {
        return new b(cls.getSimpleName());
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }

    public static b c(String str) {
        return new b(str);
    }
}
