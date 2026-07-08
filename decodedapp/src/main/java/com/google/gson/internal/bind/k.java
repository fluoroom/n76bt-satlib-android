package com.google.gson.internal.bind;

import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z9.b0;
import z9.d0;
import z9.e0;
import z9.g0;
import z9.t;
import z9.u;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f8723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.gson.d f8724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f8725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.gson.internal.bind.e f8726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f8727e;

    class a extends x {
        a() {
        }

        @Override // com.google.gson.x
        public Object b(ca.a aVar) throws IOException {
            aVar.K0();
            return null;
        }

        @Override // com.google.gson.x
        public void d(ca.c cVar, Object obj) throws IOException {
            cVar.S();
        }

        public String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Method f8730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ x f8731f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ x f8732g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f8733h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f8734i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Field field, boolean z10, Method method, x xVar, x xVar2, boolean z11, boolean z12) {
            super(str, field);
            this.f8729d = z10;
            this.f8730e = method;
            this.f8731f = xVar;
            this.f8732g = xVar2;
            this.f8733h = z11;
            this.f8734i = z12;
        }

        @Override // com.google.gson.internal.bind.k.d
        void a(ca.a aVar, int i10, Object[] objArr) {
            Object objB = this.f8732g.b(aVar);
            if (objB != null || !this.f8733h) {
                objArr[i10] = objB;
                return;
            }
            throw new com.google.gson.o("null is not allowed as value for record component '" + this.f8739c + "' of primitive type; at path " + aVar.v());
        }

        @Override // com.google.gson.internal.bind.k.d
        void b(ca.a aVar, Object obj) throws IllegalAccessException {
            Object objB = this.f8732g.b(aVar);
            if (objB == null && this.f8733h) {
                return;
            }
            if (this.f8729d) {
                k.c(obj, this.f8738b);
            } else if (this.f8734i) {
                throw new com.google.gson.l("Cannot set value of 'static final' " + ba.a.g(this.f8738b, false));
            }
            this.f8738b.set(obj, objB);
        }

        @Override // com.google.gson.internal.bind.k.d
        void c(ca.c cVar, Object obj) throws IllegalAccessException {
            Object objInvoke;
            if (this.f8729d) {
                Method method = this.f8730e;
                if (method == null) {
                    k.c(obj, this.f8738b);
                } else {
                    k.c(obj, method);
                }
            }
            Method method2 = this.f8730e;
            if (method2 != null) {
                try {
                    objInvoke = method2.invoke(obj, null);
                } catch (InvocationTargetException e10) {
                    throw new com.google.gson.l("Accessor " + ba.a.g(this.f8730e, false) + " threw exception", e10.getCause());
                }
            } else {
                objInvoke = this.f8738b.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            cVar.G(this.f8737a);
            this.f8731f.d(cVar, objInvoke);
        }
    }

    public static abstract class c extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f8736a;

        c(f fVar) {
            this.f8736a = fVar;
        }

        @Override // com.google.gson.x
        public Object b(ca.a aVar) throws IOException {
            if (aVar.A0() == ca.b.NULL) {
                aVar.w0();
                return null;
            }
            Object objE = e();
            Map map = this.f8736a.f8742a;
            try {
                aVar.e();
                while (aVar.H()) {
                    d dVar = (d) map.get(aVar.u0());
                    if (dVar == null) {
                        aVar.K0();
                    } else {
                        g(objE, aVar, dVar);
                    }
                }
                aVar.r();
                return f(objE);
            } catch (IllegalAccessException e10) {
                throw ba.a.e(e10);
            } catch (IllegalStateException e11) {
                throw new r(e11);
            }
        }

        @Override // com.google.gson.x
        public void d(ca.c cVar, Object obj) throws IOException {
            if (obj == null) {
                cVar.S();
                return;
            }
            cVar.l();
            try {
                Iterator it = this.f8736a.f8743b.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).c(cVar, obj);
                }
                cVar.r();
            } catch (IllegalAccessException e10) {
                throw ba.a.e(e10);
            }
        }

        abstract Object e();

        abstract Object f(Object obj);

        abstract void g(Object obj, ca.a aVar, d dVar);
    }

    static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f8737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Field f8738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f8739c;

        protected d(String str, Field field) {
            this.f8737a = str;
            this.f8738b = field;
            this.f8739c = field.getName();
        }

        abstract void a(ca.a aVar, int i10, Object[] objArr);

        abstract void b(ca.a aVar, Object obj);

        abstract void c(ca.c cVar, Object obj);
    }

    private static final class e extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b0 f8740b;

        e(b0 b0Var, f fVar) {
            super(fVar);
            this.f8740b = b0Var;
        }

        @Override // com.google.gson.internal.bind.k.c
        Object e() {
            return this.f8740b.a();
        }

        @Override // com.google.gson.internal.bind.k.c
        Object f(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.k.c
        void g(Object obj, ca.a aVar, d dVar) {
            dVar.b(aVar, obj);
        }
    }

    private static class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final f f8741c = new f(Collections.EMPTY_MAP, Collections.EMPTY_LIST);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f8742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List f8743b;

        f(Map map, List list) {
            this.f8742a = map;
            this.f8743b = list;
        }
    }

    private static final class g extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final Map f8744e = j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Constructor f8745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[] f8746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f8747d;

        g(Class cls, f fVar, boolean z10) {
            super(fVar);
            this.f8747d = new HashMap();
            Constructor constructorI = ba.a.i(cls);
            this.f8745b = constructorI;
            if (z10) {
                k.c(null, constructorI);
            } else {
                ba.a.o(constructorI);
            }
            String[] strArrK = ba.a.k(cls);
            for (int i10 = 0; i10 < strArrK.length; i10++) {
                this.f8747d.put(strArrK[i10], Integer.valueOf(i10));
            }
            Class<?>[] parameterTypes = this.f8745b.getParameterTypes();
            this.f8746c = new Object[parameterTypes.length];
            for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                this.f8746c[i11] = f8744e.get(parameterTypes[i11]);
            }
        }

        private static Map j() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.k.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object[] e() {
            return (Object[]) this.f8746c.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.k.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object f(Object[] objArr) {
            try {
                return this.f8745b.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                throw ba.a.e(e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + ba.a.c(this.f8745b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + ba.a.c(this.f8745b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke constructor '" + ba.a.c(this.f8745b) + "' with args " + Arrays.toString(objArr), e13.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.k.c
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(Object[] objArr, ca.a aVar, d dVar) {
            Integer num = (Integer) this.f8747d.get(dVar.f8739c);
            if (num != null) {
                dVar.a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + ba.a.c(this.f8745b) + "' for field with name '" + dVar.f8739c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public k(t tVar, com.google.gson.d dVar, u uVar, com.google.gson.internal.bind.e eVar, List list) {
        this.f8723a = tVar;
        this.f8724b = dVar;
        this.f8725c = uVar;
        this.f8726d = eVar;
        this.f8727e = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (e0.a(accessibleObject, obj)) {
            return;
        }
        throw new com.google.gson.l(ba.a.g(accessibleObject, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private d d(com.google.gson.f fVar, Field field, Method method, String str, TypeToken typeToken, boolean z10, boolean z11) {
        x nVar;
        boolean zA = d0.a(typeToken.c());
        int modifiers = field.getModifiers();
        boolean z12 = false;
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z12 = true;
        }
        y9.b bVar = (y9.b) field.getAnnotation(y9.b.class);
        x xVarD = bVar != null ? this.f8726d.d(this.f8723a, fVar, typeToken, bVar, false) : null;
        boolean z13 = xVarD != null;
        if (xVarD == null) {
            xVarD = fVar.l(typeToken);
        }
        x xVar = xVarD;
        if (z10) {
            nVar = z13 ? xVar : new n(fVar, xVar, typeToken.d());
        } else {
            nVar = xVar;
        }
        return new b(str, field, z11, method, nVar, xVar, zA, z12);
    }

    private static IllegalArgumentException e(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ba.a.f(field) + " and " + ba.a.f(field2) + "\nSee " + g0.a("duplicate-fields"));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.google.gson.internal.bind.k.f f(com.google.gson.f r20, com.google.gson.reflect.TypeToken r21, java.lang.Class r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.k.f(com.google.gson.f, com.google.gson.reflect.TypeToken, java.lang.Class, boolean, boolean):com.google.gson.internal.bind.k$f");
    }

    private List g(Field field) {
        String strD;
        List listA;
        y9.c cVar = (y9.c) field.getAnnotation(y9.c.class);
        if (cVar == null) {
            strD = this.f8724b.d(field);
            listA = this.f8724b.a(field);
        } else {
            String strValue = cVar.value();
            List listAsList = Arrays.asList(cVar.alternate());
            strD = strValue;
            listA = listAsList;
        }
        if (listA.isEmpty()) {
            return Collections.singletonList(strD);
        }
        ArrayList arrayList = new ArrayList(listA.size() + 1);
        arrayList.add(strD);
        arrayList.addAll(listA);
        return arrayList;
    }

    private boolean h(Field field, boolean z10) {
        return !this.f8725c.f(field, z10);
    }

    @Override // com.google.gson.y
    public x a(com.google.gson.f fVar, TypeToken typeToken) {
        Class clsC = typeToken.c();
        if (!Object.class.isAssignableFrom(clsC)) {
            return null;
        }
        if (ba.a.l(clsC)) {
            return new a();
        }
        com.google.gson.t tVarB = e0.b(this.f8727e, clsC);
        if (tVarB != com.google.gson.t.BLOCK_ALL) {
            boolean z10 = tVarB == com.google.gson.t.BLOCK_INACCESSIBLE;
            return ba.a.m(clsC) ? new g(clsC, f(fVar, typeToken, clsC, z10, true), z10) : new e(this.f8723a.u(typeToken, true), f(fVar, typeToken, clsC, z10, false));
        }
        throw new com.google.gson.l("ReflectionAccessFilter does not permit using reflection for " + clsC + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
