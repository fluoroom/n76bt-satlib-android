package of;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import of.j;
import of.p;
import of.y;

/* JADX INFO: loaded from: classes3.dex */
final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f23452d = new h(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23455c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f23453a = u.n(16);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f23457b;

        static {
            int[] iArr = new int[y.b.values().length];
            f23457b = iArr;
            try {
                iArr[y.b.f23529c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23457b[y.b.f23530d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23457b[y.b.f23531e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23457b[y.b.f23532f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23457b[y.b.f23533g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23457b[y.b.f23534h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23457b[y.b.f23535r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23457b[y.b.f23536s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23457b[y.b.f23537t.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23457b[y.b.f23540w.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23457b[y.b.f23541x.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23457b[y.b.f23543z.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23457b[y.b.A.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f23457b[y.b.B.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f23457b[y.b.C.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f23457b[y.b.f23538u.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f23457b[y.b.f23539v.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f23457b[y.b.f23542y.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[y.c.values().length];
            f23456a = iArr2;
            try {
                iArr2[y.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f23456a[y.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f23456a[y.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f23456a[y.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f23456a[y.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f23456a[y.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f23456a[y.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f23456a[y.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f23456a[y.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b extends Comparable {
        boolean b();

        y.b c();

        int getNumber();

        y.c o();

        boolean p();

        p.a z(p.a aVar, p pVar);
    }

    private h() {
    }

    private Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int d(y.b bVar, int i10, Object obj) {
        int iC = f.C(i10);
        if (bVar == y.b.f23538u) {
            iC *= 2;
        }
        return iC + e(bVar, obj);
    }

    private static int e(y.b bVar, Object obj) {
        switch (a.f23457b[bVar.ordinal()]) {
            case 1:
                return f.g(((Double) obj).doubleValue());
            case 2:
                return f.m(((Float) obj).floatValue());
            case 3:
                return f.q(((Long) obj).longValue());
            case 4:
                return f.E(((Long) obj).longValue());
            case 5:
                return f.p(((Integer) obj).intValue());
            case 6:
                return f.k(((Long) obj).longValue());
            case 7:
                return f.j(((Integer) obj).intValue());
            case 8:
                return f.b(((Boolean) obj).booleanValue());
            case 9:
                return f.B((String) obj);
            case 10:
                return obj instanceof d ? f.e((d) obj) : f.c((byte[]) obj);
            case 11:
                return f.D(((Integer) obj).intValue());
            case 12:
                return f.w(((Integer) obj).intValue());
            case 13:
                return f.x(((Long) obj).longValue());
            case 14:
                return f.y(((Integer) obj).intValue());
            case 15:
                return f.A(((Long) obj).longValue());
            case 16:
                return f.n((p) obj);
            case 17:
                return f.s((p) obj);
            case 18:
                return obj instanceof j.a ? f.i(((j.a) obj).getNumber()) : f.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b bVar, Object obj) {
        y.b bVarC = bVar.c();
        int number = bVar.getNumber();
        if (!bVar.b()) {
            return d(bVarC, number, obj);
        }
        int iD = 0;
        if (bVar.p()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iD += e(bVarC, it.next());
            }
            return f.C(number) + iD + f.u(iD);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iD += d(bVarC, number, it2.next());
        }
        return iD;
    }

    public static h g() {
        return f23452d;
    }

    static int l(y.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.d();
    }

    private boolean o(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.o() != y.c.MESSAGE) {
            return true;
        }
        if (!bVar.b()) {
            Object value = entry.getValue();
            if (value instanceof p) {
                return ((p) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((p) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    private void s(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.b()) {
            Object objH = h(bVar);
            if (objH == null) {
                objH = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objH).add(c(it.next()));
            }
            this.f23453a.o(bVar, objH);
            return;
        }
        if (bVar.o() != y.c.MESSAGE) {
            this.f23453a.o(bVar, c(value));
            return;
        }
        Object objH2 = h(bVar);
        if (objH2 == null) {
            this.f23453a.o(bVar, c(value));
        } else {
            this.f23453a.o(bVar, bVar.z(((p) objH2).toBuilder(), (p) value).build());
        }
    }

    public static h t() {
        return new h();
    }

    public static Object u(e eVar, y.b bVar, boolean z10) {
        switch (a.f23457b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.l());
            case 2:
                return Float.valueOf(eVar.p());
            case 3:
                return Long.valueOf(eVar.s());
            case 4:
                return Long.valueOf(eVar.L());
            case 5:
                return Integer.valueOf(eVar.r());
            case 6:
                return Long.valueOf(eVar.o());
            case 7:
                return Integer.valueOf(eVar.n());
            case 8:
                return Boolean.valueOf(eVar.j());
            case 9:
                return z10 ? eVar.I() : eVar.H();
            case 10:
                return eVar.k();
            case 11:
                return Integer.valueOf(eVar.K());
            case 12:
                return Integer.valueOf(eVar.D());
            case 13:
                return Long.valueOf(eVar.E());
            case 14:
                return Integer.valueOf(eVar.F());
            case 15:
                return Long.valueOf(eVar.G());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void w(of.y.b r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = of.h.a.f23456a
            of.y$c r2 = r2.a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L2d;
                case 7: goto L24;
                case 8: goto L18;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L3e
        L15:
            boolean r1 = r3 instanceof of.p
            goto L3e
        L18:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L22
            boolean r2 = r3 instanceof of.j.a
            if (r2 == 0) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            r1 = r0
            goto L3e
        L24:
            boolean r2 = r3 instanceof of.d
            if (r2 != 0) goto L22
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L21
            goto L22
        L2d:
            boolean r1 = r3 instanceof java.lang.String
            goto L3e
        L30:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L3e
        L33:
            boolean r1 = r3 instanceof java.lang.Double
            goto L3e
        L36:
            boolean r1 = r3 instanceof java.lang.Float
            goto L3e
        L39:
            boolean r1 = r3 instanceof java.lang.Long
            goto L3e
        L3c:
            boolean r1 = r3 instanceof java.lang.Integer
        L3e:
            if (r1 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: of.h.w(of.y$b, java.lang.Object):void");
    }

    private static void x(f fVar, y.b bVar, int i10, Object obj) throws IOException {
        if (bVar == y.b.f23538u) {
            fVar.X(i10, (p) obj);
        } else {
            fVar.v0(i10, l(bVar, false));
            y(fVar, bVar, obj);
        }
    }

    private static void y(f fVar, y.b bVar, Object obj) throws IOException {
        switch (a.f23457b[bVar.ordinal()]) {
            case 1:
                fVar.Q(((Double) obj).doubleValue());
                break;
            case 2:
                fVar.W(((Float) obj).floatValue());
                break;
            case 3:
                fVar.b0(((Long) obj).longValue());
                break;
            case 4:
                fVar.y0(((Long) obj).longValue());
                break;
            case 5:
                fVar.a0(((Integer) obj).intValue());
                break;
            case 6:
                fVar.U(((Long) obj).longValue());
                break;
            case 7:
                fVar.T(((Integer) obj).intValue());
                break;
            case 8:
                fVar.L(((Boolean) obj).booleanValue());
                break;
            case 9:
                fVar.u0((String) obj);
                break;
            case 10:
                if (!(obj instanceof d)) {
                    fVar.M((byte[]) obj);
                } else {
                    fVar.O((d) obj);
                }
                break;
            case 11:
                fVar.x0(((Integer) obj).intValue());
                break;
            case 12:
                fVar.p0(((Integer) obj).intValue());
                break;
            case 13:
                fVar.q0(((Long) obj).longValue());
                break;
            case 14:
                fVar.r0(((Integer) obj).intValue());
                break;
            case 15:
                fVar.t0(((Long) obj).longValue());
                break;
            case 16:
                fVar.Y((p) obj);
                break;
            case 17:
                fVar.d0((p) obj);
                break;
            case 18:
                if (!(obj instanceof j.a)) {
                    fVar.S(((Integer) obj).intValue());
                } else {
                    fVar.S(((j.a) obj).getNumber());
                }
                break;
        }
    }

    public static void z(b bVar, Object obj, f fVar) throws IOException {
        y.b bVarC = bVar.c();
        int number = bVar.getNumber();
        if (!bVar.b()) {
            x(fVar, bVarC, number, obj);
            return;
        }
        List list = (List) obj;
        if (!bVar.p()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x(fVar, bVarC, number, it.next());
            }
            return;
        }
        fVar.v0(number, 2);
        Iterator it2 = list.iterator();
        int iE = 0;
        while (it2.hasNext()) {
            iE += e(bVarC, it2.next());
        }
        fVar.n0(iE);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            y(fVar, bVarC, it3.next());
        }
    }

    public void a(b bVar, Object obj) {
        List arrayList;
        if (!bVar.b()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        w(bVar.c(), obj);
        Object objH = h(bVar);
        if (objH == null) {
            arrayList = new ArrayList();
            this.f23453a.o(bVar, arrayList);
        } else {
            arrayList = (List) objH;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h clone() {
        h hVarT = t();
        for (int i10 = 0; i10 < this.f23453a.i(); i10++) {
            Map.Entry entryH = this.f23453a.h(i10);
            hVarT.v((b) entryH.getKey(), entryH.getValue());
        }
        for (Map.Entry entry : this.f23453a.j()) {
            hVarT.v((b) entry.getKey(), entry.getValue());
        }
        hVarT.f23455c = this.f23455c;
        return hVarT;
    }

    public Object h(b bVar) {
        return this.f23453a.get(bVar);
    }

    public Object i(b bVar, int i10) {
        if (!bVar.b()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(bVar);
        if (objH != null) {
            return ((List) objH).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int j(b bVar) {
        if (!bVar.b()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(bVar);
        if (objH == null) {
            return 0;
        }
        return ((List) objH).size();
    }

    public int k() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f23453a.i(); i10++) {
            Map.Entry entryH = this.f23453a.h(i10);
            iF += f((b) entryH.getKey(), entryH.getValue());
        }
        for (Map.Entry entry : this.f23453a.j()) {
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean m(b bVar) {
        if (bVar.b()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f23453a.get(bVar) != null;
    }

    public boolean n() {
        for (int i10 = 0; i10 < this.f23453a.i(); i10++) {
            if (!o(this.f23453a.h(i10))) {
                return false;
            }
        }
        Iterator it = this.f23453a.j().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator p() {
        return this.f23455c ? new l(this.f23453a.entrySet().iterator()) : this.f23453a.entrySet().iterator();
    }

    public void q() {
        if (this.f23454b) {
            return;
        }
        this.f23453a.m();
        this.f23454b = true;
    }

    public void r(h hVar) {
        for (int i10 = 0; i10 < hVar.f23453a.i(); i10++) {
            s(hVar.f23453a.h(i10));
        }
        Iterator it = hVar.f23453a.j().iterator();
        while (it.hasNext()) {
            s((Map.Entry) it.next());
        }
    }

    public void v(b bVar, Object obj) {
        if (!bVar.b()) {
            w(bVar.c(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w(bVar.c(), it.next());
            }
            obj = arrayList;
        }
        this.f23453a.o(bVar, obj);
    }

    private h(boolean z10) {
        q();
    }
}
