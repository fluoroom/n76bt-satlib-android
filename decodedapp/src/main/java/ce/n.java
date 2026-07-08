package ce;

import be.d1;
import be.l3;
import ce.i;
import eg.e2;
import eg.r0;
import he.v0;
import he.z;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f4756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f4757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Member f4758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f4759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xd.c[] f4760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f4761f;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final xd.c f4762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List[] f4763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f4764c;

        public a(xd.c cVar, List[] listArr, Method method) {
            rd.m.e(cVar, "argumentRange");
            rd.m.e(listArr, "unboxParameters");
            this.f4762a = cVar;
            this.f4763b = listArr;
            this.f4764c = method;
        }

        public final xd.c a() {
            return this.f4762a;
        }

        public final Method b() {
            return this.f4764c;
        }

        public final List[] c() {
            return this.f4763b;
        }
    }

    public static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f4765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f4766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f4767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f4768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f4769e;

        public b(z zVar, d1 d1Var, String str, List list) {
            Collection collectionE;
            rd.m.e(zVar, "descriptor");
            rd.m.e(d1Var, "container");
            rd.m.e(str, "constructorDesc");
            rd.m.e(list, "originalParameters");
            Method methodS = d1Var.s("constructor-impl", str);
            rd.m.b(methodS);
            this.f4765a = methodS;
            Method methodS2 = d1Var.s("box-impl", q.w0(str, "V") + ne.f.f(d1Var.d()));
            rd.m.b(methodS2);
            this.f4766b = methodS2;
            ArrayList arrayList = new ArrayList(ed.q.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r0 type = ((v0) it.next()).getType();
                rd.m.d(type, "getType(...)");
                arrayList.add(o.p(e2.a(type), zVar));
            }
            this.f4767c = arrayList;
            ArrayList arrayList2 = new ArrayList(ed.q.v(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    ed.q.u();
                }
                he.h hVarQ = ((v0) obj).getType().N0().q();
                rd.m.c(hVarQ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                he.e eVar = (he.e) hVarQ;
                List list2 = (List) this.f4767c.get(i10);
                if (list2 != null) {
                    collectionE = new ArrayList(ed.q.v(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        collectionE.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class clsQ = l3.q(eVar);
                    rd.m.b(clsQ);
                    collectionE = ed.q.e(clsQ);
                }
                arrayList2.add(collectionE);
                i10 = i11;
            }
            this.f4768d = arrayList2;
            this.f4769e = ed.q.x(arrayList2);
        }

        public boolean a() {
            return false;
        }

        public Void b() {
            return null;
        }

        public final List c() {
            return this.f4768d;
        }

        @Override // ce.h
        public Type g() {
            Class<?> returnType = this.f4766b.getReturnType();
            rd.m.d(returnType, "getReturnType(...)");
            return returnType;
        }

        @Override // ce.h
        public /* bridge */ /* synthetic */ Member h() {
            return (Member) b();
        }

        @Override // ce.h
        public Object i(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            Collection collectionE;
            rd.m.e(objArr, "args");
            List<dd.q> listZ0 = ed.j.z0(objArr, this.f4767c);
            ArrayList arrayList = new ArrayList();
            for (dd.q qVar : listZ0) {
                Object objA = qVar.a();
                List list = (List) qVar.b();
                if (list != null) {
                    collectionE = new ArrayList(ed.q.v(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        collectionE.add(((Method) it.next()).invoke(objA, null));
                    }
                } else {
                    collectionE = ed.q.e(objA);
                }
                ed.q.A(arrayList, collectionE);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.f4765a.invoke(null, Arrays.copyOf(array, array.length));
            return this.f4766b.invoke(null, Arrays.copyOf(array, array.length));
        }

        @Override // ce.h
        public List j() {
            return this.f4769e;
        }

        @Override // ce.h
        public boolean k() {
            return a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[LOOP:1: B:25:0x0077->B:27:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(he.b r11, ce.h r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.n.<init>(he.b, ce.h, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(he.e eVar) {
        rd.m.e(eVar, "$this$makeKotlinParameterTypes");
        return qf.k.g(eVar);
    }

    public final xd.c c(int i10) {
        if (i10 >= 0) {
            xd.c[] cVarArr = this.f4760e;
            if (i10 < cVarArr.length) {
                return cVarArr[i10];
            }
        }
        xd.c[] cVarArr2 = this.f4760e;
        if (cVarArr2.length == 0) {
            return new xd.c(i10, i10);
        }
        int length = (i10 - cVarArr2.length) + ((xd.c) ed.j.T(cVarArr2)).c() + 1;
        return new xd.c(length, length);
    }

    @Override // ce.h
    public Type g() {
        return this.f4757b.g();
    }

    @Override // ce.h
    public Member h() {
        return this.f4758c;
    }

    @Override // ce.h
    public Object i(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objG;
        Object objG2;
        rd.m.e(objArr, "args");
        xd.c cVarA = this.f4759d.a();
        List[] listArrC = this.f4759d.c();
        Method methodB = this.f4759d.b();
        if (!cVarA.isEmpty()) {
            if (this.f4761f) {
                List listD = ed.q.d(objArr.length);
                int iB = cVarA.b();
                for (int i10 = 0; i10 < iB; i10++) {
                    listD.add(objArr[i10]);
                }
                int iB2 = cVarA.b();
                int iC = cVarA.c();
                if (iB2 <= iC) {
                    while (true) {
                        List<Method> list = listArrC[iB2];
                        Object obj = objArr[iB2];
                        if (list != null) {
                            for (Method method : list) {
                                if (obj != null) {
                                    objG2 = method.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    rd.m.d(returnType, "getReturnType(...)");
                                    objG2 = l3.g(returnType);
                                }
                                listD.add(objG2);
                            }
                        } else {
                            listD.add(obj);
                        }
                        if (iB2 == iC) {
                            break;
                        }
                        iB2++;
                    }
                }
                int iC2 = cVarA.c() + 1;
                int iH = ed.j.H(objArr);
                if (iC2 <= iH) {
                    while (true) {
                        listD.add(objArr[iC2]);
                        if (iC2 == iH) {
                            break;
                        }
                        iC2++;
                    }
                }
                objArr = ed.q.a(listD).toArray(new Object[0]);
            } else {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                for (int i11 = 0; i11 < length; i11++) {
                    int iB3 = cVarA.b();
                    if (i11 > cVarA.c() || iB3 > i11) {
                        objG = objArr[i11];
                    } else {
                        List list2 = listArrC[i11];
                        Method method2 = list2 != null ? (Method) ed.q.w0(list2) : null;
                        objG = objArr[i11];
                        if (method2 != null) {
                            if (objG != null) {
                                objG = method2.invoke(objG, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                rd.m.d(returnType2, "getReturnType(...)");
                                objG = l3.g(returnType2);
                            }
                        }
                    }
                    objArr2[i11] = objG;
                }
                objArr = objArr2;
            }
        }
        Object objI = this.f4757b.i(objArr);
        return (objI == id.b.e() || methodB == null || (objInvoke = methodB.invoke(null, objI)) == null) ? objI : objInvoke;
    }

    @Override // ce.h
    public List j() {
        return this.f4757b.j();
    }

    @Override // ce.h
    public boolean k() {
        return this.f4757b instanceof i.h.a;
    }
}
