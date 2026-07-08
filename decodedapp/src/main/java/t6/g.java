package t6;

import com.fasterxml.jackson.databind.JavaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JavaType f27500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b[] f27501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f27502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f27503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i7.b0[] f27504e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JavaType f27505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f27506b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f27507c = new HashMap();

        protected a(JavaType javaType) {
            this.f27505a = javaType;
        }

        private void a(String str, Integer num) {
            Object obj = this.f27507c.get(str);
            if (obj == null) {
                this.f27507c.put(str, num);
                return;
            }
            if (obj instanceof List) {
                ((List) obj).add(num);
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(obj);
            linkedList.add(num);
            this.f27507c.put(str, linkedList);
        }

        public void b(s6.u uVar, a7.e eVar) {
            Integer numValueOf = Integer.valueOf(this.f27506b.size());
            this.f27506b.add(new b(uVar, eVar));
            a(uVar.getName(), numValueOf);
            a(eVar.i(), numValueOf);
        }

        public g c(c cVar) {
            int size = this.f27506b.size();
            b[] bVarArr = new b[size];
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = (b) this.f27506b.get(i10);
                s6.u uVarO = cVar.o(bVar.d());
                if (uVarO != null) {
                    bVar.g(uVarO);
                }
                bVarArr[i10] = bVar;
            }
            return new g(this.f27505a, bVarArr, this.f27507c, null, null);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s6.u f27508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a7.e f27509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private s6.u f27511d;

        public b(s6.u uVar, a7.e eVar) {
            this.f27508a = uVar;
            this.f27509b = eVar;
            this.f27510c = eVar.i();
        }

        public String a() {
            Class clsH = this.f27509b.h();
            if (clsH == null) {
                return null;
            }
            return this.f27509b.j().e(null, clsH);
        }

        public s6.u b() {
            return this.f27508a;
        }

        public s6.u c() {
            return this.f27511d;
        }

        public String d() {
            return this.f27510c;
        }

        public boolean e() {
            return this.f27509b.l();
        }

        public boolean f(String str) {
            return str.equals(this.f27510c);
        }

        public void g(s6.u uVar) {
            this.f27511d = uVar;
        }
    }

    protected g(JavaType javaType, b[] bVarArr, Map map, String[] strArr, i7.b0[] b0VarArr) {
        this.f27500a = javaType;
        this.f27501b = bVarArr;
        this.f27502c = map;
        this.f27503d = strArr;
        this.f27504e = b0VarArr;
    }

    private final boolean d(e6.j jVar, p6.h hVar, String str, Object obj, String str2, int i10) throws v6.f {
        if (!this.f27501b[i10].f(str)) {
            return false;
        }
        if (obj == null || this.f27504e[i10] == null) {
            this.f27503d[i10] = str2;
            return true;
        }
        b(jVar, hVar, obj, i10, str2);
        this.f27504e[i10] = null;
        return true;
    }

    public static a e(JavaType javaType) {
        return new a(javaType);
    }

    protected final Object a(e6.j jVar, p6.h hVar, int i10, String str) {
        e6.j jVarV1 = this.f27504e[i10].v1(jVar);
        if (jVarV1.X0() == e6.m.VALUE_NULL) {
            return null;
        }
        i7.b0 b0VarZ = hVar.z(jVar);
        b0VarZ.W0();
        b0VarZ.d1(str);
        b0VarZ.z1(jVarV1);
        b0VarZ.z0();
        e6.j jVarV12 = b0VarZ.v1(jVar);
        jVarV12.X0();
        return this.f27501b[i10].b().l(jVarV12, hVar);
    }

    protected final void b(e6.j jVar, p6.h hVar, Object obj, int i10, String str) throws v6.f {
        if (str == null) {
            hVar.P0(this.f27500a, "Internal error in external Type Id handling: `null` type id passed", new Object[0]);
        }
        e6.j jVarV1 = this.f27504e[i10].v1(jVar);
        if (jVarV1.X0() == e6.m.VALUE_NULL) {
            this.f27501b[i10].b().L(obj, null);
            return;
        }
        i7.b0 b0VarZ = hVar.z(jVar);
        b0VarZ.W0();
        b0VarZ.d1(str);
        b0VarZ.z1(jVarV1);
        b0VarZ.z0();
        e6.j jVarV12 = b0VarZ.v1(jVar);
        jVarV12.X0();
        this.f27501b[i10].b().n(jVarV12, hVar, obj);
    }

    protected final Object c(e6.j jVar, p6.h hVar, int i10, String str) {
        i7.b0 b0VarZ = hVar.z(jVar);
        b0VarZ.W0();
        b0VarZ.d1(str);
        b0VarZ.z0();
        e6.j jVarV1 = b0VarZ.v1(jVar);
        jVarV1.X0();
        return this.f27501b[i10].b().l(jVarV1, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(e6.j r10, p6.h r11, java.lang.Object r12) throws v6.f {
        /*
            r9 = this;
            t6.g$b[] r0 = r9.f27501b
            int r0 = r0.length
            r1 = 0
            r6 = 0
        L5:
            if (r6 >= r0) goto L9a
            java.lang.String[] r2 = r9.f27503d
            r2 = r2[r6]
            t6.g$b[] r3 = r9.f27501b
            r3 = r3[r6]
            r4 = 1
            if (r2 != 0) goto L81
            i7.b0[] r5 = r9.f27504e
            r5 = r5[r6]
            if (r5 != 0) goto L1d
        L18:
            r3 = r10
            r4 = r11
            r5 = r12
            goto Lbc
        L1d:
            e6.m r7 = r5.B1()
            boolean r7 = r7.g()
            if (r7 == 0) goto L40
            e6.j r5 = r5.v1(r10)
            r5.X0()
            s6.u r7 = r3.b()
            com.fasterxml.jackson.databind.JavaType r8 = r7.getType()
            java.lang.Object r5 = a7.e.a(r5, r11, r8)
            if (r5 == 0) goto L40
            r7.L(r12, r5)
            goto L18
        L40:
            boolean r5 = r3.e()
            if (r5 != 0) goto L5e
            com.fasterxml.jackson.databind.JavaType r5 = r9.f27500a
            s6.u r7 = r3.b()
            java.lang.String r7 = r7.getName()
            java.lang.String r3 = r3.d()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r3
            java.lang.String r3 = "Missing external type id property '%s' (and no 'defaultImpl' specified)"
            r11.T0(r5, r7, r3, r4)
            goto L7b
        L5e:
            java.lang.String r2 = r3.a()
            if (r2 != 0) goto L7b
            com.fasterxml.jackson.databind.JavaType r5 = r9.f27500a
            s6.u r7 = r3.b()
            java.lang.String r7 = r7.getName()
            java.lang.String r3 = r3.d()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r3
            java.lang.String r3 = "Invalid default type id for property '%s': `null` returned by TypeIdResolver"
            r11.T0(r5, r7, r3, r4)
        L7b:
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r2
            r2 = r9
            goto Lb9
        L81:
            i7.b0[] r5 = r9.f27504e
            r5 = r5[r6]
            if (r5 != 0) goto L7b
            s6.u r10 = r3.b()
            boolean r0 = r10.c()
            if (r0 != 0) goto L9c
            p6.i r0 = p6.i.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY
            boolean r0 = r11.D0(r0)
            if (r0 == 0) goto L9a
            goto L9c
        L9a:
            r5 = r12
            goto Lc3
        L9c:
            java.lang.Class r0 = r12.getClass()
            java.lang.String r2 = r10.getName()
            java.lang.String r10 = r10.getName()
            java.lang.String r3 = r3.d()
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r10
            r5[r4] = r3
            java.lang.String r10 = "Missing property '%s' for external type id '%s'"
            r11.U0(r0, r2, r10, r5)
            return r12
        Lb9:
            r2.b(r3, r4, r5, r6, r7)
        Lbc:
            int r6 = r6 + 1
            r10 = r3
            r11 = r4
            r12 = r5
            goto L5
        Lc3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.g.f(e6.j, p6.h, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(e6.j r17, p6.h r18, t6.y r19, t6.v r20) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.g.g(e6.j, p6.h, t6.y, t6.v):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(e6.j r10, p6.h r11, java.lang.String r12, java.lang.Object r13) throws v6.f {
        /*
            r9 = this;
            java.util.Map r0 = r9.f27502c
            java.lang.Object r0 = r0.get(r12)
            if (r0 != 0) goto La
            r10 = 0
            return r10
        La:
            boolean r1 = r0 instanceof java.util.List
            r2 = 1
            if (r1 == 0) goto L6f
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r13 = r0.iterator()
            java.lang.Object r0 = r13.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            t6.g$b[] r1 = r9.f27501b
            int r3 = r0.intValue()
            r1 = r1[r3]
            boolean r12 = r1.f(r12)
            if (r12 == 0) goto L4d
            java.lang.String r11 = r10.C0()
            r10.f1()
            java.lang.String[] r10 = r9.f27503d
            int r12 = r0.intValue()
            r10[r12] = r11
        L38:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto L6e
            java.lang.String[] r10 = r9.f27503d
            java.lang.Object r12 = r13.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r10[r12] = r11
            goto L38
        L4d:
            i7.b0 r10 = r11.w(r10)
            i7.b0[] r11 = r9.f27504e
            int r12 = r0.intValue()
            r11[r12] = r10
        L59:
            boolean r11 = r13.hasNext()
            if (r11 == 0) goto L6e
            i7.b0[] r11 = r9.f27504e
            java.lang.Object r12 = r13.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11[r12] = r10
            goto L59
        L6e:
            return r2
        L6f:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r7 = r0.intValue()
            t6.g$b[] r0 = r9.f27501b
            r0 = r0[r7]
            boolean r12 = r0.f(r12)
            if (r12 == 0) goto L93
            java.lang.String[] r12 = r9.f27503d
            java.lang.String r0 = r10.K0()
            r12[r7] = r0
            r10.f1()
            if (r13 == 0) goto Lb6
            i7.b0[] r12 = r9.f27504e
            r12 = r12[r7]
            if (r12 == 0) goto Lb6
            goto La3
        L93:
            i7.b0 r12 = r11.w(r10)
            i7.b0[] r0 = r9.f27504e
            r0[r7] = r12
            if (r13 == 0) goto Lb6
            java.lang.String[] r12 = r9.f27503d
            r12 = r12[r7]
            if (r12 == 0) goto Lb6
        La3:
            java.lang.String[] r12 = r9.f27503d
            r8 = r12[r7]
            r0 = 0
            r12[r7] = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r13
            r3.b(r4, r5, r6, r7, r8)
            i7.b0[] r10 = r3.f27504e
            r10[r7] = r0
            goto Lb7
        Lb6:
            r3 = r9
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.g.h(e6.j, p6.h, java.lang.String, java.lang.Object):boolean");
    }

    public boolean i(e6.j jVar, p6.h hVar, String str, Object obj) {
        Object obj2 = this.f27502c.get(str);
        boolean z10 = false;
        if (obj2 == null) {
            return false;
        }
        String strC0 = jVar.C0();
        if (!(obj2 instanceof List)) {
            return d(jVar, hVar, str, obj, strC0, ((Integer) obj2).intValue());
        }
        Iterator it = ((List) obj2).iterator();
        while (it.hasNext()) {
            e6.j jVar2 = jVar;
            p6.h hVar2 = hVar;
            String str2 = str;
            Object obj3 = obj;
            if (d(jVar2, hVar2, str2, obj3, strC0, ((Integer) it.next()).intValue())) {
                z10 = true;
            }
            jVar = jVar2;
            hVar = hVar2;
            str = str2;
            obj = obj3;
        }
        return z10;
    }

    public g j() {
        return new g(this);
    }

    protected g(g gVar) {
        this.f27500a = gVar.f27500a;
        b[] bVarArr = gVar.f27501b;
        this.f27501b = bVarArr;
        this.f27502c = gVar.f27502c;
        int length = bVarArr.length;
        this.f27503d = new String[length];
        this.f27504e = new i7.b0[length];
    }
}
