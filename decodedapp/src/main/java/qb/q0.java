package qb;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import qb.a;
import qb.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.c f24709a = a.c.a("internal:health-checking-config");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.C0340b f24710b = b.C0340b.b("internal:health-check-consumer-listener");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b.C0340b f24711c = b.C0340b.c("internal:disable-subchannel-reconnect", Boolean.FALSE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a.c f24712d = a.c.a("internal:has-health-check-producer-listener");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a.c f24713e = a.c.a("io.grpc.IS_PETIOLE_POLICY");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f24714f = new a();

    class a extends k {
        a() {
        }

        @Override // qb.q0.k
        public g a(h hVar) {
            return g.i();
        }

        public String toString() {
            return "EMPTY_PICKER";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f24715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qb.a f24716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[][] f24717c;

        public static final class a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final Object[][] f24718d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private List f24719a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private qb.a f24720b = qb.a.f24506c;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object[][] f24721c = f24718d;

            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public a d(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
                this.f24721c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            public a b(C0340b c0340b, Object obj) {
                r9.l.o(c0340b, "key");
                r9.l.o(obj, "value");
                int length = 0;
                while (true) {
                    Object[][] objArr = this.f24721c;
                    if (length >= objArr.length) {
                        length = -1;
                        break;
                    }
                    if (c0340b.equals(objArr[length][0])) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f24721c.length + 1, 2);
                    Object[][] objArr3 = this.f24721c;
                    System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                    this.f24721c = objArr2;
                    length = objArr2.length - 1;
                }
                this.f24721c[length] = new Object[]{c0340b, obj};
                return this;
            }

            public b c() {
                return new b(this.f24719a, this.f24720b, this.f24721c, null);
            }

            public a e(List list) {
                r9.l.e(!list.isEmpty(), "addrs is empty");
                this.f24719a = DesugarCollections.unmodifiableList(new ArrayList(list));
                return this;
            }

            public a f(qb.a aVar) {
                this.f24720b = (qb.a) r9.l.o(aVar, "attrs");
                return this;
            }
        }

        /* JADX INFO: renamed from: qb.q0$b$b, reason: collision with other inner class name */
        public static final class C0340b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f24722a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f24723b;

            private C0340b(String str, Object obj) {
                this.f24722a = str;
                this.f24723b = obj;
            }

            public static C0340b b(String str) {
                r9.l.o(str, "debugString");
                return new C0340b(str, null);
            }

            public static C0340b c(String str, Object obj) {
                r9.l.o(str, "debugString");
                return new C0340b(str, obj);
            }

            public String toString() {
                return this.f24722a;
            }
        }

        /* synthetic */ b(List list, qb.a aVar, Object[][] objArr, a aVar2) {
            this(list, aVar, objArr);
        }

        public static a d() {
            return new a();
        }

        public List a() {
            return this.f24715a;
        }

        public qb.a b() {
            return this.f24716b;
        }

        public Object c(C0340b c0340b) {
            r9.l.o(c0340b, "key");
            int i10 = 0;
            while (true) {
                Object[][] objArr = this.f24717c;
                if (i10 >= objArr.length) {
                    return c0340b.f24723b;
                }
                if (c0340b.equals(objArr[i10][0])) {
                    return this.f24717c[i10][1];
                }
                i10++;
            }
        }

        public a e() {
            return d().e(this.f24715a).f(this.f24716b).d(this.f24717c);
        }

        public String toString() {
            return r9.g.b(this).d("addrs", this.f24715a).d("attrs", this.f24716b).d("customOptions", Arrays.deepToString(this.f24717c)).toString();
        }

        private b(List list, qb.a aVar, Object[][] objArr) {
            this.f24715a = (List) r9.l.o(list, "addresses are not set");
            this.f24716b = (qb.a) r9.l.o(aVar, "attrs");
            this.f24717c = (Object[][]) r9.l.o(objArr, "customOptions");
        }
    }

    public static abstract class c {
        public abstract q0 a(e eVar);
    }

    public static final class d extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f24724a;

        public d(g gVar) {
            this.f24724a = (g) r9.l.o(gVar, "result");
        }

        @Override // qb.q0.k
        public g a(h hVar) {
            return this.f24724a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f24724a.equals(((d) obj).f24724a);
            }
            return false;
        }

        public int hashCode() {
            return this.f24724a.hashCode();
        }

        public String toString() {
            return "FixedResultPicker(" + this.f24724a + ")";
        }
    }

    public static abstract class e {
        public abstract j a(b bVar);

        public abstract qb.f b();

        public abstract ScheduledExecutorService c();

        public abstract z1 d();

        public abstract void e();

        public abstract void f(q qVar, k kVar);
    }

    public interface f {
    }

    public static final class g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final g f24725f = new g(null, null, u1.f24769e, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f24726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k.a f24727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final u1 f24728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f24729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f24730e = null;

        private g(j jVar, k.a aVar, u1 u1Var, boolean z10) {
            this.f24726a = jVar;
            this.f24727b = aVar;
            this.f24728c = (u1) r9.l.o(u1Var, "status");
            this.f24729d = z10;
        }

        public static g g(u1 u1Var) {
            r9.l.e(!u1Var.q(), "drop status shouldn't be OK");
            return new g(null, null, u1Var, true);
        }

        public static g h(u1 u1Var) {
            r9.l.e(!u1Var.q(), "error status shouldn't be OK");
            return new g(null, null, u1Var, false);
        }

        public static g i() {
            return f24725f;
        }

        public static g j(j jVar) {
            return k(jVar, null);
        }

        public static g k(j jVar, k.a aVar) {
            return new g((j) r9.l.o(jVar, "subchannel"), aVar, u1.f24769e, false);
        }

        public String a() {
            return this.f24730e;
        }

        public u1 b() {
            return this.f24728c;
        }

        public k.a c() {
            return this.f24727b;
        }

        public j d() {
            return this.f24726a;
        }

        public boolean e() {
            return (this.f24726a == null && this.f24728c.q()) ? false : true;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return r9.h.a(this.f24726a, gVar.f24726a) && r9.h.a(this.f24728c, gVar.f24728c) && r9.h.a(this.f24727b, gVar.f24727b) && this.f24729d == gVar.f24729d;
        }

        public boolean f() {
            return this.f24729d;
        }

        public int hashCode() {
            return r9.h.b(this.f24726a, this.f24728c, this.f24727b, Boolean.valueOf(this.f24729d));
        }

        public String toString() {
            return r9.g.b(this).d("subchannel", this.f24726a).d("streamTracerFactory", this.f24727b).d("status", this.f24728c).e("drop", this.f24729d).d("authority-override", this.f24730e).toString();
        }
    }

    public static abstract class h {
        public abstract qb.c a();

        public abstract z0 b();

        public abstract a1 c();
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f24731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qb.a f24732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f24733c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private List f24734a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private qb.a f24735b = qb.a.f24506c;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object f24736c;

            a() {
            }

            public i a() {
                return new i(this.f24734a, this.f24735b, this.f24736c, null);
            }

            public a b(List list) {
                this.f24734a = list;
                return this;
            }

            public a c(qb.a aVar) {
                this.f24735b = aVar;
                return this;
            }

            public a d(Object obj) {
                this.f24736c = obj;
                return this;
            }
        }

        /* synthetic */ i(List list, qb.a aVar, Object obj, a aVar2) {
            this(list, aVar, obj);
        }

        public static a d() {
            return new a();
        }

        public List a() {
            return this.f24731a;
        }

        public qb.a b() {
            return this.f24732b;
        }

        public Object c() {
            return this.f24733c;
        }

        public a e() {
            return d().b(this.f24731a).c(this.f24732b).d(this.f24733c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return r9.h.a(this.f24731a, iVar.f24731a) && r9.h.a(this.f24732b, iVar.f24732b) && r9.h.a(this.f24733c, iVar.f24733c);
        }

        public int hashCode() {
            return r9.h.b(this.f24731a, this.f24732b, this.f24733c);
        }

        public String toString() {
            return r9.g.b(this).d("addresses", this.f24731a).d("attributes", this.f24732b).d("loadBalancingPolicyConfig", this.f24733c).toString();
        }

        private i(List list, qb.a aVar, Object obj) {
            this.f24731a = DesugarCollections.unmodifiableList(new ArrayList((Collection) r9.l.o(list, "addresses")));
            this.f24732b = (qb.a) r9.l.o(aVar, "attributes");
            this.f24733c = obj;
        }
    }

    public static abstract class j {
        /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final qb.y a() {
            /*
                r4 = this;
                java.util.List r0 = r4.b()
                r1 = 0
                if (r0 == 0) goto Lf
                int r2 = r0.size()
                r3 = 1
                if (r2 != r3) goto Lf
                goto L10
            Lf:
                r3 = 0
            L10:
                java.lang.String r2 = "%s does not have exactly one group"
                r9.l.w(r3, r2, r0)
                java.lang.Object r0 = r0.get(r1)
                qb.y r0 = (qb.y) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qb.q0.j.a():qb.y");
        }

        public abstract List b();

        public abstract qb.a c();

        public abstract qb.f d();

        public abstract Object e();

        public abstract void f();

        public abstract void g();

        public abstract void h(l lVar);

        public abstract void i(List list);
    }

    public static abstract class k {
        public abstract g a(h hVar);
    }

    public interface l {
        void a(r rVar);
    }

    public abstract u1 a(i iVar);

    public abstract void b(u1 u1Var);

    public abstract void d();

    public void c() {
    }
}
