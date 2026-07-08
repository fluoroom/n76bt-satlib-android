package com.google.protobuf;

import com.google.protobuf.m2;
import com.google.protobuf.o0;
import com.google.protobuf.r;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
final class p implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p f9254a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f9255b = new HashSet(Arrays.asList("Class", "DefaultInstanceForType", "ParserForType", "SerializedSize", "AllFields", "DescriptorForType", "InitializationErrorString", "UnknownFields", "CachedSize"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static d f9256c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f9257d = 0;

    class a implements o0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r.g f9258a;

        a(r.g gVar) {
            this.f9258a = gVar;
        }

        @Override // com.google.protobuf.o0.e
        public boolean a(int i10) {
            return this.f9258a.q().i(i10) != null;
        }
    }

    class b implements o0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r.g f9259a;

        b(r.g gVar) {
            this.f9259a = gVar;
        }

        @Override // com.google.protobuf.o0.e
        public boolean a(int i10) {
            return this.f9259a.q().i(i10) != null;
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f9261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f9262c;

        static {
            int[] iArr = new int[r.g.c.values().length];
            f9262c = iArr;
            try {
                iArr[r.g.c.f10025r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9262c[r.g.c.f10029v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9262c[r.g.c.f10018b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9262c[r.g.c.f10031x.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9262c[r.g.c.f10024h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9262c[r.g.c.f10023g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9262c[r.g.c.f10019c.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9262c[r.g.c.f10027t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9262c[r.g.c.f10022f.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9262c[r.g.c.f10020d.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9262c[r.g.c.f10028u.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9262c[r.g.c.f10032y.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9262c[r.g.c.f10033z.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9262c[r.g.c.A.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9262c[r.g.c.B.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9262c[r.g.c.f10026s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9262c[r.g.c.f10030w.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9262c[r.g.c.f10021e.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r0.values().length];
            f9261b = iArr2;
            try {
                iArr2[r0.f10073r.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9261b[r0.f10075t.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9261b[r0.f10072h.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f9261b[r0.f10071g.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f9261b[r0.f10076u.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f9261b[r0.f10069e.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f9261b[r0.f10070f.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f9261b[r0.f10074s.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f9261b[r0.f10077v.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
            int[] iArr3 = new int[r.h.a.values().length];
            f9260a = iArr3;
            try {
                iArr3[r.h.a.PROTO2.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f9260a[r.h.a.PROTO3.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f9260a[r.h.a.EDITIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    private p() {
    }

    private static Field e(Class cls, int i10) {
        return l(cls, "bitField" + i10 + "_");
    }

    private static d0 f(Class cls, r.g gVar, e eVar, boolean z10, o0.e eVar2) {
        y1 y1VarA = eVar.a(cls, gVar.l());
        f0 f0VarP = p(gVar);
        return d0.j(gVar.getNumber(), f0VarP, y1VarA, q(cls, gVar, f0VarP), z10, eVar2);
    }

    private static Field g(Class cls, r.g gVar) {
        return l(cls, m(gVar));
    }

    private static j1 h(Class cls, r.b bVar) {
        Field field;
        d0 d0VarE;
        d0 d0VarM;
        List listL = bVar.l();
        m2.a aVarF = m2.f(listL.size());
        aVarF.c(n(cls));
        aVarF.f(i(bVar.a().r()));
        aVarF.e(bVar.q().R());
        a aVar = null;
        e eVar = new e(aVar);
        Field fieldE = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i10 < listL.size()) {
            r.g gVar = (r.g) listL.get(i10);
            boolean zI = gVar.I();
            r.g.b bVarU = gVar.u();
            r.g.b bVar2 = r.g.b.ENUM;
            o0.e aVar2 = (bVarU == bVar2 && gVar.H()) ? new a(gVar) : aVar;
            if (gVar.x() != null) {
                aVarF.d(f(cls, gVar, eVar, zI, aVar2));
            } else {
                Field fieldK = k(cls, gVar);
                int number = gVar.getNumber();
                f0 f0VarP = p(gVar);
                if (gVar.B()) {
                    if (fieldE == null) {
                        fieldE = e(cls, i11);
                    }
                    if (gVar.G()) {
                        field = fieldE;
                        d0VarE = d0.h(fieldK, number, f0VarP, field, i12, zI, aVar2);
                    } else {
                        field = fieldE;
                        d0VarE = d0.e(fieldK, number, f0VarP, field, i12, zI, aVar2);
                    }
                    aVarF.d(d0VarE);
                    i12 <<= 1;
                    if (i12 == 0) {
                        i11++;
                        fieldE = null;
                        i12 = 1;
                    } else {
                        fieldE = field;
                    }
                } else {
                    if (gVar.D()) {
                        r.g gVarJ = gVar.v().j(2);
                        if (gVarJ.u() == bVar2 && gVarJ.H()) {
                            aVar2 = new b(gVarJ);
                        }
                        d0VarM = d0.i(fieldK, number, j2.B(cls, gVar.e()), aVar2);
                    } else {
                        d0VarM = (gVar.b() && gVar.u() == r.g.b.MESSAGE) ? d0.m(fieldK, number, f0VarP, s(cls, gVar)) : gVar.p() ? aVar2 != null ? d0.l(fieldK, number, f0VarP, aVar2, g(cls, gVar)) : d0.k(fieldK, number, f0VarP, g(cls, gVar)) : aVar2 != null ? d0.g(fieldK, number, f0VarP, aVar2) : d0.f(fieldK, number, f0VarP, zI);
                    }
                    aVarF.d(d0VarM);
                }
            }
            i10++;
            aVar = null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < listL.size(); i13++) {
            r.g gVar2 = (r.g) listL.get(i13);
            if (gVar2.G() || (gVar2.u() == r.g.b.MESSAGE && u(gVar2.v()))) {
                arrayList.add(Integer.valueOf(gVar2.getNumber()));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            iArr[i14] = ((Integer) arrayList.get(i14)).intValue();
        }
        if (size > 0) {
            aVarF.b(iArr);
        }
        return aVarF.a();
    }

    private static b2 i(r.h.a aVar) {
        int i10 = c.f9260a[aVar.ordinal()];
        if (i10 == 1) {
            return b2.PROTO2;
        }
        if (i10 == 2) {
            return b2.PROTO3;
        }
        if (i10 == 3) {
            return b2.EDITIONS;
        }
        throw new IllegalArgumentException("Unsupported syntax: " + aVar);
    }

    private static r.b j(Class cls) {
        return n(cls).getDescriptorForType();
    }

    private static Field k(Class cls, r.g gVar) {
        return l(cls, o(gVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field l(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Unable to find field " + str + " in message class " + cls.getName());
        }
    }

    private static String m(r.g gVar) {
        return w(gVar.e()) + "MemoizedSerializedSize";
    }

    private static i1 n(Class cls) {
        try {
            return (i1) cls.getDeclaredMethod("getDefaultInstance", null).invoke(null, null);
        } catch (Exception e10) {
            throw new IllegalArgumentException("Unable to get default instance for message class " + cls.getName(), e10);
        }
    }

    static String o(r.g gVar) {
        String strE = gVar.y() == r.g.c.f10027t ? gVar.v().e() : gVar.e();
        return w(strE) + (f9255b.contains(x(strE)) ? "__" : "_");
    }

    private static f0 p(r.g gVar) {
        switch (c.f9262c[gVar.y().ordinal()]) {
            case 1:
                return !gVar.b() ? f0.f8991v : gVar.p() ? f0.f8972e0 : f0.N;
            case 2:
                return gVar.b() ? f0.Q : f0.f8994y;
            case 3:
                return !gVar.b() ? f0.f8973f : gVar.p() ? f0.X : f0.G;
            case 4:
                return !gVar.b() ? f0.A : gVar.p() ? f0.f8976g0 : f0.S;
            case 5:
                return !gVar.b() ? f0.f8990u : gVar.p() ? f0.f8971d0 : f0.M;
            case 6:
                return !gVar.b() ? f0.f8989t : gVar.p() ? f0.f8970c0 : f0.L;
            case 7:
                return !gVar.b() ? f0.f8975g : gVar.p() ? f0.Y : f0.H;
            case 8:
                return gVar.b() ? f0.f8982l0 : f0.F;
            case 9:
                return !gVar.b() ? f0.f8988s : gVar.p() ? f0.f8969b0 : f0.K;
            case 10:
                return !gVar.b() ? f0.f8977h : gVar.p() ? f0.Z : f0.I;
            case 11:
                return gVar.D() ? f0.f8983m0 : gVar.b() ? f0.P : f0.f8993x;
            case 12:
                return !gVar.b() ? f0.B : gVar.p() ? f0.f8978h0 : f0.T;
            case 13:
                return !gVar.b() ? f0.C : gVar.p() ? f0.f8979i0 : f0.U;
            case 14:
                return !gVar.b() ? f0.D : gVar.p() ? f0.f8980j0 : f0.V;
            case 15:
                return !gVar.b() ? f0.E : gVar.p() ? f0.f8981k0 : f0.W;
            case 16:
                return gVar.b() ? f0.O : f0.f8992w;
            case 17:
                return !gVar.b() ? f0.f8995z : gVar.p() ? f0.f8974f0 : f0.R;
            case 18:
                return !gVar.b() ? f0.f8987r : gVar.p() ? f0.f8968a0 : f0.J;
            default:
                throw new IllegalArgumentException("Unsupported field type: " + gVar.y());
        }
    }

    private static Class q(Class cls, r.g gVar, f0 f0Var) {
        switch (c.f9261b[f0Var.a().ordinal()]) {
            case 1:
                return Boolean.class;
            case 2:
                return l.class;
            case 3:
                return Double.class;
            case 4:
                return Float.class;
            case 5:
            case 6:
                return Integer.class;
            case 7:
                return Long.class;
            case 8:
                return String.class;
            case 9:
                return r(cls, gVar);
            default:
                throw new IllegalArgumentException("Invalid type for oneof: " + f0Var);
        }
    }

    private static Class r(Class cls, r.g gVar) {
        try {
            return cls.getDeclaredMethod(t(gVar.y() == r.g.c.f10027t ? gVar.v().e() : gVar.e()), null).getReturnType();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Class s(Class cls, r.g gVar) {
        try {
            return cls.getDeclaredMethod(t(gVar.y() == r.g.c.f10027t ? gVar.v().e() : gVar.e()), Integer.TYPE).getReturnType();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    private static String t(String str) {
        String strW = w(str);
        return "get" + Character.toUpperCase(strW.charAt(0)) + strW.substring(1, strW.length());
    }

    private static boolean u(r.b bVar) {
        return f9256c.c(bVar);
    }

    private static String v(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1);
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '_') {
                z10 = true;
            } else if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
                z10 = true;
            } else if (z10) {
                sb2.append(Character.toUpperCase(cCharAt));
                z10 = false;
            } else if (i10 == 0) {
                sb2.append(Character.toLowerCase(cCharAt));
            } else {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String w(String str) {
        return v(str, false);
    }

    private static String x(String str) {
        return v(str, true);
    }

    @Override // com.google.protobuf.k1
    public j1 a(Class cls) {
        if (k0.class.isAssignableFrom(cls)) {
            return h(cls, j(cls));
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // com.google.protobuf.k1
    public boolean b(Class cls) {
        return k0.class.isAssignableFrom(cls);
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f9263a = new ConcurrentHashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9264b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Stack f9265c = new Stack();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f9266d = new HashMap();

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final r.b f9267a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final int f9268b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f9269c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            b f9270d = null;

            a(r.b bVar, int i10) {
                this.f9267a = bVar;
                this.f9268b = i10;
                this.f9269c = i10;
            }
        }

        d() {
        }

        private void a(b bVar) {
            boolean z10;
            b bVar2;
            Iterator it = bVar.f9271a.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                r.b bVar3 = (r.b) it.next();
                z10 = true;
                if (bVar3.s()) {
                    break;
                }
                for (r.g gVar : bVar3.l()) {
                    if (gVar.G() || (gVar.u() == r.g.b.MESSAGE && (bVar2 = ((a) this.f9266d.get(gVar.v())).f9270d) != bVar && bVar2.f9272b)) {
                        break loop0;
                    }
                }
            }
            bVar.f9272b = z10;
            Iterator it2 = bVar.f9271a.iterator();
            while (it2.hasNext()) {
                this.f9263a.put((r.b) it2.next(), Boolean.valueOf(bVar.f9272b));
            }
        }

        private a b(r.b bVar) {
            a aVar;
            int i10 = this.f9264b;
            this.f9264b = i10 + 1;
            a aVar2 = new a(bVar, i10);
            this.f9265c.push(aVar2);
            this.f9266d.put(bVar, aVar2);
            for (r.g gVar : bVar.l()) {
                if (gVar.u() == r.g.b.MESSAGE) {
                    a aVar3 = (a) this.f9266d.get(gVar.v());
                    if (aVar3 == null) {
                        aVar2.f9269c = Math.min(aVar2.f9269c, b(gVar.v()).f9269c);
                    } else if (aVar3.f9270d == null) {
                        aVar2.f9269c = Math.min(aVar2.f9269c, aVar3.f9269c);
                    }
                }
            }
            if (aVar2.f9268b == aVar2.f9269c) {
                b bVar2 = new b(null);
                do {
                    aVar = (a) this.f9265c.pop();
                    aVar.f9270d = bVar2;
                    bVar2.f9271a.add(aVar.f9267a);
                } while (aVar != aVar2);
                a(bVar2);
            }
            return aVar2;
        }

        public boolean c(r.b bVar) {
            Boolean bool = (Boolean) this.f9263a.get(bVar);
            if (bool != null) {
                return bool.booleanValue();
            }
            synchronized (this) {
                try {
                    Boolean bool2 = (Boolean) this.f9263a.get(bVar);
                    if (bool2 != null) {
                        return bool2.booleanValue();
                    }
                    return b(bVar).f9270d.f9272b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final List f9271a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f9272b;

            private b() {
                this.f9271a = new ArrayList();
                this.f9272b = false;
            }

            /* synthetic */ b(a aVar) {
                this();
            }
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y1[] f9273a;

        private e() {
            this.f9273a = new y1[2];
        }

        private static y1 b(Class cls, r.l lVar) {
            String strW = p.w(lVar.e());
            return new y1(lVar.n(), p.l(cls, strW + "Case_"), p.l(cls, strW + "_"));
        }

        y1 a(Class cls, r.l lVar) {
            int iN = lVar.n();
            y1[] y1VarArr = this.f9273a;
            if (iN >= y1VarArr.length) {
                this.f9273a = (y1[]) Arrays.copyOf(y1VarArr, iN * 2);
            }
            y1 y1Var = this.f9273a[iN];
            if (y1Var != null) {
                return y1Var;
            }
            y1 y1VarB = b(cls, lVar);
            this.f9273a[iN] = y1VarB;
            return y1VarB;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}
