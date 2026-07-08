package com.google.protobuf;

import com.google.protobuf.a3;
import com.google.protobuf.l1;
import com.google.protobuf.o0;
import com.google.protobuf.s0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e0 f8949d = new e0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2 f8950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8952c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8954b;

        static {
            int[] iArr = new int[a3.b.values().length];
            f8954b = iArr;
            try {
                iArr[a3.b.f8848c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8954b[a3.b.f8849d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8954b[a3.b.f8850e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8954b[a3.b.f8851f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8954b[a3.b.f8852g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8954b[a3.b.f8853h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8954b[a3.b.f8854r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8954b[a3.b.f8855s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8954b[a3.b.f8857u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8954b[a3.b.f8858v.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8954b[a3.b.f8856t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8954b[a3.b.f8859w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8954b[a3.b.f8860x.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8954b[a3.b.f8862z.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8954b[a3.b.A.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8954b[a3.b.B.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8954b[a3.b.C.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f8954b[a3.b.f8861y.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[a3.c.values().length];
            f8953a = iArr2;
            try {
                iArr2[a3.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f8953a[a3.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f8953a[a3.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f8953a[a3.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f8953a[a3.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f8953a[a3.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f8953a[a3.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f8953a[a3.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f8953a[a3.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private l2 f8955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f8956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f8957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f8958d;

        /* synthetic */ b(a aVar) {
            this();
        }

        private e0 c(boolean z10) {
            if (this.f8955a.isEmpty()) {
                return e0.o();
            }
            this.f8957c = false;
            l2 l2VarI = this.f8955a;
            if (this.f8958d) {
                l2VarI = e0.i(l2VarI, false);
                s(l2VarI, z10);
            }
            e0 e0Var = new e0(l2VarI, null);
            e0Var.f8952c = this.f8956b;
            return e0Var;
        }

        private void f() {
            if (this.f8957c) {
                return;
            }
            this.f8955a = e0.i(this.f8955a, true);
            this.f8957c = true;
        }

        private void p(Map.Entry entry) {
            c cVar = (c) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof s0) {
                value = ((s0) value).d();
            }
            if (cVar.b()) {
                List arrayList = (List) i(cVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f8955a.p(cVar, arrayList);
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(e0.k(it.next()));
                }
                return;
            }
            if (cVar.o() != a3.c.MESSAGE) {
                this.f8955a.p(cVar, e0.k(value));
                return;
            }
            Object objI = i(cVar);
            if (objI == null) {
                this.f8955a.p(cVar, e0.k(value));
            } else if (objI instanceof l1.a) {
                cVar.t((l1.a) objI, (l1) value);
            } else {
                this.f8955a.p(cVar, cVar.t(((l1) objI).toBuilder(), (l1) value).build());
            }
        }

        private static Object q(Object obj, boolean z10) {
            if (!(obj instanceof l1.a)) {
                return obj;
            }
            l1.a aVar = (l1.a) obj;
            return z10 ? aVar.buildPartial() : aVar.build();
        }

        private static Object r(c cVar, Object obj, boolean z10) {
            if (obj == null || cVar.o() != a3.c.MESSAGE) {
                return obj;
            }
            if (!cVar.b()) {
                return q(obj, z10);
            }
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            List arrayList = (List) obj;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj2 = arrayList.get(i10);
                Object objQ = q(obj2, z10);
                if (objQ != obj2) {
                    if (arrayList == obj) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i10, objQ);
                }
            }
            return arrayList;
        }

        private static void s(l2 l2Var, boolean z10) {
            for (int i10 = 0; i10 < l2Var.i(); i10++) {
                t(l2Var.h(i10), z10);
            }
            Iterator it = l2Var.k().iterator();
            while (it.hasNext()) {
                t((Map.Entry) it.next(), z10);
            }
        }

        private static void t(Map.Entry entry, boolean z10) {
            entry.setValue(r((c) entry.getKey(), entry.getValue(), z10));
        }

        private void w(c cVar, Object obj) {
            if (e0.D(cVar.c(), obj)) {
                return;
            }
            if (cVar.c().a() != a3.c.MESSAGE || !(obj instanceof l1.a)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(cVar.getNumber()), cVar.c().a(), obj.getClass().getName()));
            }
        }

        public void a(c cVar, Object obj) {
            List arrayList;
            f();
            if (!cVar.b()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.f8958d = this.f8958d || (obj instanceof l1.a);
            w(cVar, obj);
            Object objI = i(cVar);
            if (objI == null) {
                arrayList = new ArrayList();
                this.f8955a.p(cVar, arrayList);
            } else {
                arrayList = (List) objI;
            }
            arrayList.add(obj);
        }

        public e0 b() {
            return c(false);
        }

        public e0 d() {
            return c(true);
        }

        public void e(c cVar) {
            f();
            this.f8955a.remove(cVar);
            if (this.f8955a.isEmpty()) {
                this.f8956b = false;
            }
        }

        public Map g() {
            if (!this.f8956b) {
                return this.f8955a.m() ? this.f8955a : DesugarCollections.unmodifiableMap(this.f8955a);
            }
            l2 l2VarI = e0.i(this.f8955a, false);
            if (this.f8955a.m()) {
                l2VarI.n();
                return l2VarI;
            }
            s(l2VarI, true);
            return l2VarI;
        }

        public Object h(c cVar) {
            return r(cVar, i(cVar), true);
        }

        Object i(c cVar) {
            Object obj = this.f8955a.get(cVar);
            return obj instanceof s0 ? ((s0) obj).d() : obj;
        }

        public Object j(c cVar, int i10) {
            if (this.f8958d) {
                f();
            }
            return q(k(cVar, i10), true);
        }

        Object k(c cVar, int i10) {
            if (!cVar.b()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objI = i(cVar);
            if (objI != null) {
                return ((List) objI).get(i10);
            }
            throw new IndexOutOfBoundsException();
        }

        public int l(c cVar) {
            if (!cVar.b()) {
                throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            Object objI = i(cVar);
            if (objI == null) {
                return 0;
            }
            return ((List) objI).size();
        }

        public boolean m(c cVar) {
            if (cVar.b()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.f8955a.get(cVar) != null;
        }

        public boolean n() {
            for (int i10 = 0; i10 < this.f8955a.i(); i10++) {
                if (!e0.B(this.f8955a.h(i10))) {
                    return false;
                }
            }
            Iterator it = this.f8955a.k().iterator();
            while (it.hasNext()) {
                if (!e0.B((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void o(e0 e0Var) {
            f();
            for (int i10 = 0; i10 < e0Var.f8950a.i(); i10++) {
                p(e0Var.f8950a.h(i10));
            }
            Iterator it = e0Var.f8950a.k().iterator();
            while (it.hasNext()) {
                p((Map.Entry) it.next());
            }
        }

        public void u(c cVar, Object obj) {
            f();
            if (!cVar.b()) {
                w(cVar, obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList((List) obj);
                for (Object obj2 : arrayList) {
                    w(cVar, obj2);
                    this.f8958d = this.f8958d || (obj2 instanceof l1.a);
                }
                obj = arrayList;
            }
            if (obj instanceof s0) {
                this.f8956b = true;
            }
            this.f8958d = this.f8958d || (obj instanceof l1.a);
            this.f8955a.p(cVar, obj);
        }

        public void v(c cVar, int i10, Object obj) {
            f();
            if (!cVar.b()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.f8958d = this.f8958d || (obj instanceof l1.a);
            Object objI = i(cVar);
            if (objI == null) {
                throw new IndexOutOfBoundsException();
            }
            w(cVar, obj);
            ((List) objI).set(i10, obj);
        }

        private b() {
            this(l2.o(16));
        }

        private b(l2 l2Var) {
            this.f8955a = l2Var;
            this.f8957c = true;
        }
    }

    public interface c extends Comparable {
        boolean b();

        a3.b c();

        int getNumber();

        a3.c o();

        boolean p();

        l1.a t(l1.a aVar, l1 l1Var);
    }

    /* synthetic */ e0(l2 l2Var, a aVar) {
        this(l2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean B(Map.Entry entry) {
        c cVar = (c) entry.getKey();
        if (cVar.o() != a3.c.MESSAGE) {
            return true;
        }
        if (!cVar.b()) {
            return C(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!C(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean C(Object obj) {
        if (obj instanceof m1) {
            return ((m1) obj).isInitialized();
        }
        if (obj instanceof s0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean D(a3.b bVar, Object obj) {
        o0.a(obj);
        switch (a.f8953a[bVar.a().ordinal()]) {
            case 7:
                if ((obj instanceof l) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof o0.c)) {
                }
                break;
            case 9:
                if ((obj instanceof l1) || (obj instanceof s0)) {
                }
                break;
        }
        return false;
    }

    private void H(Map.Entry entry) {
        c cVar = (c) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof s0) {
            value = ((s0) value).d();
        }
        if (cVar.b()) {
            Object objQ = q(cVar);
            if (objQ == null) {
                objQ = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objQ).add(k(it.next()));
            }
            this.f8950a.p(cVar, objQ);
            return;
        }
        if (cVar.o() != a3.c.MESSAGE) {
            this.f8950a.p(cVar, k(value));
            return;
        }
        Object objQ2 = q(cVar);
        if (objQ2 == null) {
            this.f8950a.p(cVar, k(value));
        } else {
            this.f8950a.p(cVar, cVar.t(((l1) objQ2).toBuilder(), (l1) value).build());
        }
    }

    public static b I() {
        return new b((a) null);
    }

    public static e0 J() {
        return new e0();
    }

    private void L(c cVar, Object obj) {
        if (!D(cVar.c(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(cVar.getNumber()), cVar.c().a(), obj.getClass().getName()));
        }
    }

    static void M(o oVar, a3.b bVar, int i10, Object obj) {
        if (bVar == a3.b.f8857u) {
            oVar.B0(i10, (l1) obj);
        } else {
            oVar.R0(i10, w(bVar, false));
            N(oVar, bVar, obj);
        }
    }

    static void N(o oVar, a3.b bVar, Object obj) {
        switch (a.f8954b[bVar.ordinal()]) {
            case 1:
                oVar.t0(((Double) obj).doubleValue());
                break;
            case 2:
                oVar.A0(((Float) obj).floatValue());
                break;
            case 3:
                oVar.G0(((Long) obj).longValue());
                break;
            case 4:
                oVar.V0(((Long) obj).longValue());
                break;
            case 5:
                oVar.E0(((Integer) obj).intValue());
                break;
            case 6:
                oVar.z0(((Long) obj).longValue());
                break;
            case 7:
                oVar.x0(((Integer) obj).intValue());
                break;
            case 8:
                oVar.n0(((Boolean) obj).booleanValue());
                break;
            case 9:
                oVar.C0((l1) obj);
                break;
            case 10:
                oVar.I0((l1) obj);
                break;
            case 11:
                if (!(obj instanceof l)) {
                    oVar.Q0((String) obj);
                } else {
                    oVar.r0((l) obj);
                }
                break;
            case 12:
                if (!(obj instanceof l)) {
                    oVar.o0((byte[]) obj);
                } else {
                    oVar.r0((l) obj);
                }
                break;
            case 13:
                oVar.T0(((Integer) obj).intValue());
                break;
            case 14:
                oVar.L0(((Integer) obj).intValue());
                break;
            case 15:
                oVar.M0(((Long) obj).longValue());
                break;
            case 16:
                oVar.N0(((Integer) obj).intValue());
                break;
            case 17:
                oVar.O0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof o0.c)) {
                    oVar.v0(((Integer) obj).intValue());
                } else {
                    oVar.v0(((o0.c) obj).getNumber());
                }
                break;
        }
    }

    public static void O(c cVar, Object obj, o oVar) {
        a3.b bVarC = cVar.c();
        int number = cVar.getNumber();
        if (!cVar.b()) {
            if (obj instanceof s0) {
                M(oVar, bVarC, number, ((s0) obj).d());
                return;
            } else {
                M(oVar, bVarC, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!cVar.p()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                M(oVar, bVarC, number, it.next());
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            oVar.R0(number, 2);
            Iterator it2 = list.iterator();
            int iM = 0;
            while (it2.hasNext()) {
                iM += m(bVarC, it2.next());
            }
            oVar.T0(iM);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                N(oVar, bVarC, it3.next());
            }
        }
    }

    private void Q(Map.Entry entry, o oVar) {
        c cVar = (c) entry.getKey();
        if (cVar.o() != a3.c.MESSAGE || cVar.b() || cVar.p()) {
            O(cVar, entry.getValue(), oVar);
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof s0)) {
            oVar.J0(((c) entry.getKey()).getNumber(), (l1) value);
        } else {
            oVar.K0(((c) entry.getKey()).getNumber(), ((s0) value).c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l2 i(l2 l2Var, boolean z10) {
        l2 l2VarO = l2.o(16);
        for (int i10 = 0; i10 < l2Var.i(); i10++) {
            j(l2VarO, l2Var.h(i10), z10);
        }
        Iterator it = l2Var.k().iterator();
        while (it.hasNext()) {
            j(l2VarO, (Map.Entry) it.next(), z10);
        }
        return l2VarO;
    }

    private static void j(Map map, Map.Entry entry, boolean z10) {
        c cVar = (c) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof s0) {
            map.put(cVar, ((s0) value).d());
        } else if (z10 && (value instanceof List)) {
            map.put(cVar, new ArrayList((List) value));
        } else {
            map.put(cVar, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object k(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int l(a3.b bVar, int i10, Object obj) {
        int iW = o.W(i10);
        if (bVar == a3.b.f8857u) {
            iW *= 2;
        }
        return iW + m(bVar, obj);
    }

    static int m(a3.b bVar, Object obj) {
        switch (a.f8954b[bVar.ordinal()]) {
            case 1:
                return o.k(((Double) obj).doubleValue());
            case 2:
                return o.s(((Float) obj).floatValue());
            case 3:
                return o.A(((Long) obj).longValue());
            case 4:
                return o.a0(((Long) obj).longValue());
            case 5:
                return o.y(((Integer) obj).intValue());
            case 6:
                return o.q(((Long) obj).longValue());
            case 7:
                return o.o(((Integer) obj).intValue());
            case 8:
                return o.f(((Boolean) obj).booleanValue());
            case 9:
                return o.v((l1) obj);
            case 10:
                return obj instanceof s0 ? o.D((s0) obj) : o.I((l1) obj);
            case 11:
                return obj instanceof l ? o.i((l) obj) : o.V((String) obj);
            case 12:
                return obj instanceof l ? o.i((l) obj) : o.g((byte[]) obj);
            case 13:
                return o.Y(((Integer) obj).intValue());
            case 14:
                return o.N(((Integer) obj).intValue());
            case 15:
                return o.P(((Long) obj).longValue());
            case 16:
                return o.R(((Integer) obj).intValue());
            case 17:
                return o.T(((Long) obj).longValue());
            case 18:
                return obj instanceof o0.c ? o.m(((o0.c) obj).getNumber()) : o.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int n(c cVar, Object obj) {
        a3.b bVarC = cVar.c();
        int number = cVar.getNumber();
        if (!cVar.b()) {
            return l(bVarC, number, obj);
        }
        List list = (List) obj;
        int iL = 0;
        if (!cVar.p()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iL += l(bVarC, number, it.next());
            }
            return iL;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iL += m(bVarC, it2.next());
        }
        return o.W(number) + iL + o.Y(iL);
    }

    public static e0 o() {
        return f8949d;
    }

    private int s(Map.Entry entry) {
        c cVar = (c) entry.getKey();
        Object value = entry.getValue();
        return (cVar.o() != a3.c.MESSAGE || cVar.b() || cVar.p()) ? n(cVar, value) : value instanceof s0 ? o.B(((c) entry.getKey()).getNumber(), (s0) value) : o.F(((c) entry.getKey()).getNumber(), (l1) value);
    }

    static int w(a3.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.d();
    }

    public boolean A() {
        for (int i10 = 0; i10 < this.f8950a.i(); i10++) {
            if (!B(this.f8950a.h(i10))) {
                return false;
            }
        }
        Iterator it = this.f8950a.k().iterator();
        while (it.hasNext()) {
            if (!B((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator E() {
        return this.f8952c ? new s0.c(this.f8950a.entrySet().iterator()) : this.f8950a.entrySet().iterator();
    }

    public void F() {
        if (this.f8951b) {
            return;
        }
        for (int i10 = 0; i10 < this.f8950a.i(); i10++) {
            this.f8950a.h(i10).getValue();
        }
        this.f8950a.n();
        this.f8951b = true;
    }

    public void G(e0 e0Var) {
        for (int i10 = 0; i10 < e0Var.f8950a.i(); i10++) {
            H(e0Var.f8950a.h(i10));
        }
        Iterator it = e0Var.f8950a.k().iterator();
        while (it.hasNext()) {
            H((Map.Entry) it.next());
        }
    }

    public void K(c cVar, Object obj) {
        if (!cVar.b()) {
            L(cVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                L(cVar, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof s0) {
            this.f8952c = true;
        }
        this.f8950a.p(cVar, obj);
    }

    public void P(o oVar) {
        for (int i10 = 0; i10 < this.f8950a.i(); i10++) {
            Q(this.f8950a.h(i10), oVar);
        }
        Iterator it = this.f8950a.k().iterator();
        while (it.hasNext()) {
            Q((Map.Entry) it.next(), oVar);
        }
    }

    public void R(o oVar) {
        for (int i10 = 0; i10 < this.f8950a.i(); i10++) {
            Map.Entry entryH = this.f8950a.h(i10);
            O((c) entryH.getKey(), entryH.getValue(), oVar);
        }
        for (Map.Entry entry : this.f8950a.k()) {
            O((c) entry.getKey(), entry.getValue(), oVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return this.f8950a.equals(((e0) obj).f8950a);
        }
        return false;
    }

    public void g(c cVar, Object obj) {
        List arrayList;
        if (!cVar.b()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        L(cVar, obj);
        Object objQ = q(cVar);
        if (objQ == null) {
            arrayList = new ArrayList();
            this.f8950a.p(cVar, arrayList);
        } else {
            arrayList = (List) objQ;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e0 clone() {
        e0 e0VarJ = J();
        for (int i10 = 0; i10 < this.f8950a.i(); i10++) {
            Map.Entry entryH = this.f8950a.h(i10);
            e0VarJ.K((c) entryH.getKey(), entryH.getValue());
        }
        for (Map.Entry entry : this.f8950a.k()) {
            e0VarJ.K((c) entry.getKey(), entry.getValue());
        }
        e0VarJ.f8952c = this.f8952c;
        return e0VarJ;
    }

    public int hashCode() {
        return this.f8950a.hashCode();
    }

    public Map p() {
        if (!this.f8952c) {
            return this.f8950a.m() ? this.f8950a : DesugarCollections.unmodifiableMap(this.f8950a);
        }
        l2 l2VarI = i(this.f8950a, false);
        if (this.f8950a.m()) {
            l2VarI.n();
        }
        return l2VarI;
    }

    public Object q(c cVar) {
        Object obj = this.f8950a.get(cVar);
        return obj instanceof s0 ? ((s0) obj).d() : obj;
    }

    public int r() {
        int iS = 0;
        for (int i10 = 0; i10 < this.f8950a.i(); i10++) {
            iS += s(this.f8950a.h(i10));
        }
        Iterator it = this.f8950a.k().iterator();
        while (it.hasNext()) {
            iS += s((Map.Entry) it.next());
        }
        return iS;
    }

    public Object t(c cVar, int i10) {
        if (!cVar.b()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objQ = q(cVar);
        if (objQ != null) {
            return ((List) objQ).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int u(c cVar) {
        if (!cVar.b()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objQ = q(cVar);
        if (objQ == null) {
            return 0;
        }
        return ((List) objQ).size();
    }

    public int v() {
        int iN = 0;
        for (int i10 = 0; i10 < this.f8950a.i(); i10++) {
            Map.Entry entryH = this.f8950a.h(i10);
            iN += n((c) entryH.getKey(), entryH.getValue());
        }
        for (Map.Entry entry : this.f8950a.k()) {
            iN += n((c) entry.getKey(), entry.getValue());
        }
        return iN;
    }

    public boolean x(c cVar) {
        if (cVar.b()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f8950a.get(cVar) != null;
    }

    boolean y() {
        return this.f8950a.isEmpty();
    }

    public boolean z() {
        return this.f8951b;
    }

    private e0() {
        this.f8950a = l2.o(16);
    }

    private e0(boolean z10) {
        this(l2.o(0));
        F();
    }

    private e0(l2 l2Var) {
        this.f8950a = l2Var;
        F();
    }
}
