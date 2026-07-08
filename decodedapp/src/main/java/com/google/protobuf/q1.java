package com.google.protobuf;

import com.google.protobuf.l;
import com.google.protobuf.o0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class q1 implements h2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f9918r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f9919s = y2.I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f9920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f9921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l1 f9924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f9925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f9926g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b2 f9927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f9928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f9929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f9930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f9931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final t1 f9932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w0 f9933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final s2 f9934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final z f9935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final e1 f9936q;

    private q1(int[] iArr, Object[] objArr, int i10, int i11, l1 l1Var, b2 b2Var, boolean z10, int[] iArr2, int i12, int i13, t1 t1Var, w0 w0Var, s2 s2Var, z zVar, e1 e1Var) {
        this.f9920a = iArr;
        this.f9921b = objArr;
        this.f9922c = i10;
        this.f9923d = i11;
        boolean z11 = false;
        this.f9927h = b2Var;
        if (zVar != null && zVar.d(l1Var)) {
            z11 = true;
        }
        this.f9925f = z11;
        this.f9928i = z10;
        this.f9929j = iArr2;
        this.f9930k = i12;
        this.f9931l = i13;
        this.f9932m = t1Var;
        this.f9933n = w0Var;
        this.f9934o = s2Var;
        this.f9935p = zVar;
        this.f9924e = l1Var;
        this.f9936q = e1Var;
    }

    private static long A(int i10) {
        return i10 & 1048575;
    }

    private static int B(Object obj, long j10) {
        return ((Integer) y2.G(obj, j10)).intValue();
    }

    private static long C(Object obj, long j10) {
        return ((Long) y2.G(obj, j10)).longValue();
    }

    private int D(int i10) {
        if (i10 < this.f9922c || i10 > this.f9923d) {
            return -1;
        }
        return L(i10, 0);
    }

    private int E(int i10) {
        return this.f9920a[i10 + 2];
    }

    private void F(Object obj, long j10, f2 f2Var, h2 h2Var, y yVar) {
        f2Var.h(this.f9933n.e(obj, j10), h2Var, yVar);
    }

    private void G(Object obj, int i10, f2 f2Var, h2 h2Var, y yVar) {
        f2Var.m(this.f9933n.e(obj, A(i10)), h2Var, yVar);
    }

    private void H(Object obj, int i10, f2 f2Var) {
        if (l(i10)) {
            y2.X(obj, A(i10), f2Var.M());
        } else if (this.f9926g) {
            y2.X(obj, A(i10), f2Var.c());
        } else {
            y2.X(obj, A(i10), f2Var.E());
        }
    }

    private void I(Object obj, int i10, f2 f2Var) {
        if (l(i10)) {
            f2Var.D(this.f9933n.e(obj, A(i10)));
        } else {
            f2Var.A(this.f9933n.e(obj, A(i10)));
        }
    }

    private void J(Object obj, int i10) {
        int iE = E(i10);
        long j10 = 1048575 & iE;
        if (j10 == 1048575) {
            return;
        }
        y2.V(obj, j10, (1 << (iE >>> 20)) | y2.C(obj, j10));
    }

    private void K(Object obj, int i10, int i11) {
        y2.V(obj, E(i11) & 1048575, i10);
    }

    private int L(int i10, int i11) {
        int length = (this.f9920a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iZ = z(i13);
            if (i10 == iZ) {
                return i13;
            }
            if (i10 < iZ) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void M(com.google.protobuf.d0 r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q1.M(com.google.protobuf.d0, int[], int, java.lang.Object[]):void");
    }

    private void N(Object obj, int i10, Object obj2) {
        f9919s.putObject(obj, A(Q(i10)), obj2);
        J(obj, i10);
    }

    private void O(Object obj, int i10, int i11, Object obj2) {
        f9919s.putObject(obj, A(Q(i11)), obj2);
        K(obj, i10, i11);
    }

    private static int P(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private int Q(int i10) {
        return this.f9920a[i10 + 1];
    }

    private static void e(Object obj) {
        if (o(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private Object f(Object obj, int i10, Object obj2, s2 s2Var, Object obj3) {
        o0.e eVarH;
        int iZ = z(i10);
        Object objG = y2.G(obj, A(Q(i10)));
        return (objG == null || (eVarH = h(i10)) == null) ? obj2 : g(i10, iZ, this.f9936q.d(objG), eVarH, obj2, s2Var, obj3);
    }

    private Object g(int i10, int i11, Map map, o0.e eVar, Object obj, s2 s2Var, Object obj2) {
        this.f9936q.c(i(i10));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!eVar.a(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = s2Var.f(obj2);
                }
                l.h hVarQ = l.q(a1.a(null, entry.getKey(), entry.getValue()));
                try {
                    a1.b(hVarQ.b(), null, entry.getKey(), entry.getValue());
                    s2Var.d(obj, i11, hVarQ.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj;
    }

    private o0.e h(int i10) {
        return (o0.e) this.f9921b[((i10 / 3) * 2) + 1];
    }

    private Object i(int i10) {
        return this.f9921b[(i10 / 3) * 2];
    }

    private h2 j(int i10) {
        int i11 = (i10 / 3) * 2;
        h2 h2Var = (h2) this.f9921b[i11];
        if (h2Var != null) {
            return h2Var;
        }
        h2 h2VarC = c2.a().c((Class) this.f9921b[i11 + 1]);
        this.f9921b[i11] = h2VarC;
        return h2VarC;
    }

    private int k(s2 s2Var, Object obj) {
        return s2Var.h(s2Var.g(obj));
    }

    private static boolean l(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean m(Object obj, int i10) {
        boolean zEquals;
        int iE = E(i10);
        long j10 = 1048575 & iE;
        if (j10 != 1048575) {
            return (y2.C(obj, j10) & (1 << (iE >>> 20))) != 0;
        }
        int iQ = Q(i10);
        long jA = A(iQ);
        switch (P(iQ)) {
            case 0:
                return Double.doubleToRawLongBits(y2.A(obj, jA)) != 0;
            case 1:
                return Float.floatToRawIntBits(y2.B(obj, jA)) != 0;
            case 2:
                return y2.E(obj, jA) != 0;
            case 3:
                return y2.E(obj, jA) != 0;
            case 4:
                return y2.C(obj, jA) != 0;
            case 5:
                return y2.E(obj, jA) != 0;
            case 6:
                return y2.C(obj, jA) != 0;
            case 7:
                return y2.t(obj, jA);
            case 8:
                Object objG = y2.G(obj, jA);
                if (objG instanceof String) {
                    zEquals = ((String) objG).isEmpty();
                } else {
                    if (!(objG instanceof l)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = l.f9119b.equals(objG);
                }
                break;
            case 9:
                return y2.G(obj, jA) != null;
            case 10:
                zEquals = l.f9119b.equals(y2.G(obj, jA));
                break;
            case 11:
                return y2.C(obj, jA) != 0;
            case 12:
                return y2.C(obj, jA) != 0;
            case 13:
                return y2.C(obj, jA) != 0;
            case 14:
                return y2.E(obj, jA) != 0;
            case 15:
                return y2.C(obj, jA) != 0;
            case 16:
                return y2.E(obj, jA) != 0;
            case 17:
                return y2.G(obj, jA) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private boolean n(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? m(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean o(Object obj) {
        return obj != null;
    }

    private boolean p(Object obj, int i10, int i11) {
        return y2.C(obj, (long) (E(i11) & 1048575)) == i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:339:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
    
        r0 = r10.f9930k;
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        if (r0 >= r10.f9931l) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
    
        r4 = r10.f(r2, r10.f9929j[r0], r4, r5, r20);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        if (r4 == null) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c2, code lost:
    
        r5.o(r2, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06f7 A[Catch: all -> 0x0718, TRY_LEAVE, TryCatch #23 {all -> 0x0718, blocks: (B:239:0x06f1, B:241:0x06f7, B:252:0x071c, B:253:0x0721), top: B:292:0x06f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0752 A[LOOP:4: B:266:0x074e->B:268:0x0752, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0765  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void q(com.google.protobuf.s2 r18, com.google.protobuf.z r19, java.lang.Object r20, com.google.protobuf.f2 r21, com.google.protobuf.y r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q1.q(com.google.protobuf.s2, com.google.protobuf.z, java.lang.Object, com.google.protobuf.f2, com.google.protobuf.y):void");
    }

    private final void r(Object obj, int i10, Object obj2, y yVar, f2 f2Var) {
        long jA = A(Q(i10));
        Object objG = y2.G(obj, jA);
        if (objG == null) {
            objG = this.f9936q.e(obj2);
            y2.X(obj, jA, objG);
        } else if (this.f9936q.g(objG)) {
            Object objE = this.f9936q.e(obj2);
            this.f9936q.a(objE, objG);
            y2.X(obj, jA, objE);
            objG = objE;
        }
        Map mapD = this.f9936q.d(objG);
        this.f9936q.c(obj2);
        f2Var.C(mapD, null, yVar);
    }

    private void s(Object obj, Object obj2, int i10) {
        if (m(obj2, i10)) {
            long jA = A(Q(i10));
            Unsafe unsafe = f9919s;
            Object object = unsafe.getObject(obj2, jA);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + z(i10) + " is present but null: " + obj2);
            }
            h2 h2VarJ = j(i10);
            if (!m(obj, i10)) {
                if (o(object)) {
                    Object objNewInstance = h2VarJ.newInstance();
                    h2VarJ.a(objNewInstance, object);
                    unsafe.putObject(obj, jA, objNewInstance);
                } else {
                    unsafe.putObject(obj, jA, object);
                }
                J(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jA);
            if (!o(object2)) {
                Object objNewInstance2 = h2VarJ.newInstance();
                h2VarJ.a(objNewInstance2, object2);
                unsafe.putObject(obj, jA, objNewInstance2);
                object2 = objNewInstance2;
            }
            h2VarJ.a(object2, object);
        }
    }

    private void t(Object obj, Object obj2, int i10) {
        int iZ = z(i10);
        if (p(obj2, iZ, i10)) {
            long jA = A(Q(i10));
            Unsafe unsafe = f9919s;
            Object object = unsafe.getObject(obj2, jA);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + z(i10) + " is present but null: " + obj2);
            }
            h2 h2VarJ = j(i10);
            if (!p(obj, iZ, i10)) {
                if (o(object)) {
                    Object objNewInstance = h2VarJ.newInstance();
                    h2VarJ.a(objNewInstance, object);
                    unsafe.putObject(obj, jA, objNewInstance);
                } else {
                    unsafe.putObject(obj, jA, object);
                }
                K(obj, iZ, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jA);
            if (!o(object2)) {
                Object objNewInstance2 = h2VarJ.newInstance();
                h2VarJ.a(objNewInstance2, object2);
                unsafe.putObject(obj, jA, objNewInstance2);
                object2 = objNewInstance2;
            }
            h2VarJ.a(object2, object);
        }
    }

    private void u(Object obj, Object obj2, int i10) {
        int iQ = Q(i10);
        long jA = A(iQ);
        int iZ = z(i10);
        switch (P(iQ)) {
            case 0:
                if (m(obj2, i10)) {
                    y2.T(obj, jA, y2.A(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 1:
                if (m(obj2, i10)) {
                    y2.U(obj, jA, y2.B(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 2:
                if (m(obj2, i10)) {
                    y2.W(obj, jA, y2.E(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 3:
                if (m(obj2, i10)) {
                    y2.W(obj, jA, y2.E(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 4:
                if (m(obj2, i10)) {
                    y2.V(obj, jA, y2.C(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 5:
                if (m(obj2, i10)) {
                    y2.W(obj, jA, y2.E(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 6:
                if (m(obj2, i10)) {
                    y2.V(obj, jA, y2.C(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 7:
                if (m(obj2, i10)) {
                    y2.N(obj, jA, y2.t(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 8:
                if (m(obj2, i10)) {
                    y2.X(obj, jA, y2.G(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 9:
                s(obj, obj2, i10);
                break;
            case 10:
                if (m(obj2, i10)) {
                    y2.X(obj, jA, y2.G(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 11:
                if (m(obj2, i10)) {
                    y2.V(obj, jA, y2.C(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 12:
                if (m(obj2, i10)) {
                    y2.V(obj, jA, y2.C(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 13:
                if (m(obj2, i10)) {
                    y2.V(obj, jA, y2.C(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 14:
                if (m(obj2, i10)) {
                    y2.W(obj, jA, y2.E(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 15:
                if (m(obj2, i10)) {
                    y2.V(obj, jA, y2.C(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 16:
                if (m(obj2, i10)) {
                    y2.W(obj, jA, y2.E(obj2, jA));
                    J(obj, i10);
                }
                break;
            case 17:
                s(obj, obj2, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f9933n.d(obj, obj2, jA);
                break;
            case 50:
                j2.F(this.f9936q, obj, obj2, jA);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (p(obj2, iZ, i10)) {
                    y2.X(obj, jA, y2.G(obj2, jA));
                    K(obj, iZ, i10);
                }
                break;
            case 60:
                t(obj, obj2, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (p(obj2, iZ, i10)) {
                    y2.X(obj, jA, y2.G(obj2, jA));
                    K(obj, iZ, i10);
                }
                break;
            case 68:
                t(obj, obj2, i10);
                break;
        }
    }

    private Object v(Object obj, int i10) {
        h2 h2VarJ = j(i10);
        long jA = A(Q(i10));
        if (!m(obj, i10)) {
            return h2VarJ.newInstance();
        }
        Object object = f9919s.getObject(obj, jA);
        if (o(object)) {
            return object;
        }
        Object objNewInstance = h2VarJ.newInstance();
        if (object != null) {
            h2VarJ.a(objNewInstance, object);
        }
        return objNewInstance;
    }

    private Object w(Object obj, int i10, int i11) {
        h2 h2VarJ = j(i11);
        if (!p(obj, i10, i11)) {
            return h2VarJ.newInstance();
        }
        Object object = f9919s.getObject(obj, A(Q(i11)));
        if (o(object)) {
            return object;
        }
        Object objNewInstance = h2VarJ.newInstance();
        if (object != null) {
            h2VarJ.a(objNewInstance, object);
        }
        return objNewInstance;
    }

    static q1 x(Class cls, j1 j1Var, t1 t1Var, w0 w0Var, s2 s2Var, z zVar, e1 e1Var) {
        return y((m2) j1Var, t1Var, w0Var, s2Var, zVar, e1Var);
    }

    static q1 y(m2 m2Var, t1 t1Var, w0 w0Var, s2 s2Var, z zVar, e1 e1Var) {
        int iS;
        int iS2;
        int i10;
        d0[] d0VarArrE = m2Var.e();
        if (d0VarArrE.length == 0) {
            iS = 0;
            iS2 = 0;
        } else {
            iS = d0VarArrE[0].s();
            iS2 = d0VarArrE[d0VarArrE.length - 1].s();
        }
        int length = d0VarArrE.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i11 = 0;
        int i12 = 0;
        for (d0 d0Var : d0VarArrE) {
            if (d0Var.A() == f0.f8983m0) {
                i11++;
            } else if (d0Var.A().d() >= 18 && d0Var.A().d() <= 49) {
                i12++;
            }
        }
        int[] iArr2 = i11 > 0 ? new int[i11] : null;
        int[] iArr3 = i12 > 0 ? new int[i12] : null;
        int[] iArrD = m2Var.d();
        if (iArrD == null) {
            iArrD = f9918r;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i13 < d0VarArrE.length) {
            d0 d0Var2 = d0VarArrE[i13];
            int iS3 = d0Var2.s();
            M(d0Var2, iArr, i14, objArr);
            if (i15 < iArrD.length && iArrD[i15] == iS3) {
                iArrD[i15] = i14;
                i15++;
            }
            if (d0Var2.A() == f0.f8983m0) {
                iArr2[i16] = i14;
                i16++;
            } else {
                if (d0Var2.A().d() >= 18 && d0Var2.A().d() <= 49) {
                    i10 = i14;
                    iArr3[i17] = (int) y2.M(d0Var2.r());
                    i17++;
                }
                i13++;
                i14 = i10 + 3;
            }
            i10 = i14;
            i13++;
            i14 = i10 + 3;
        }
        if (iArr2 == null) {
            iArr2 = f9918r;
        }
        if (iArr3 == null) {
            iArr3 = f9918r;
        }
        int[] iArr4 = new int[iArrD.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrD, 0, iArr4, 0, iArrD.length);
        System.arraycopy(iArr2, 0, iArr4, iArrD.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrD.length + iArr2.length, iArr3.length);
        return new q1(iArr, objArr, iS, iS2, m2Var.b(), m2Var.c(), true, iArr4, iArrD.length, iArrD.length + iArr2.length, t1Var, w0Var, s2Var, zVar, e1Var);
    }

    private int z(int i10) {
        return this.f9920a[i10];
    }

    @Override // com.google.protobuf.h2
    public void a(Object obj, Object obj2) {
        e(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f9920a.length; i10 += 3) {
            u(obj, obj2, i10);
        }
        j2.G(this.f9934o, obj, obj2);
        if (this.f9925f) {
            j2.E(this.f9935p, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    @Override // com.google.protobuf.h2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = o(r8)
            if (r0 != 0) goto L8
            goto L7e
        L8:
            int[] r0 = r7.f9920a
            int r0 = r0.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L70
            int r2 = r7.Q(r1)
            long r3 = A(r2)
            int r2 = P(r2)
            r5 = 9
            if (r2 == r5) goto L5a
            r5 = 60
            if (r2 == r5) goto L42
            r5 = 68
            if (r2 == r5) goto L42
            switch(r2) {
                case 17: goto L5a;
                case 18: goto L3c;
                case 19: goto L3c;
                case 20: goto L3c;
                case 21: goto L3c;
                case 22: goto L3c;
                case 23: goto L3c;
                case 24: goto L3c;
                case 25: goto L3c;
                case 26: goto L3c;
                case 27: goto L3c;
                case 28: goto L3c;
                case 29: goto L3c;
                case 30: goto L3c;
                case 31: goto L3c;
                case 32: goto L3c;
                case 33: goto L3c;
                case 34: goto L3c;
                case 35: goto L3c;
                case 36: goto L3c;
                case 37: goto L3c;
                case 38: goto L3c;
                case 39: goto L3c;
                case 40: goto L3c;
                case 41: goto L3c;
                case 42: goto L3c;
                case 43: goto L3c;
                case 44: goto L3c;
                case 45: goto L3c;
                case 46: goto L3c;
                case 47: goto L3c;
                case 48: goto L3c;
                case 49: goto L3c;
                case 50: goto L2a;
                default: goto L29;
            }
        L29:
            goto L6d
        L2a:
            sun.misc.Unsafe r2 = com.google.protobuf.q1.f9919s
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L6d
            com.google.protobuf.e1 r6 = r7.f9936q
            java.lang.Object r5 = r6.b(r5)
            r2.putObject(r8, r3, r5)
            goto L6d
        L3c:
            com.google.protobuf.w0 r2 = r7.f9933n
            r2.c(r8, r3)
            goto L6d
        L42:
            int r2 = r7.z(r1)
            boolean r2 = r7.p(r8, r2, r1)
            if (r2 == 0) goto L6d
            com.google.protobuf.h2 r2 = r7.j(r1)
            sun.misc.Unsafe r5 = com.google.protobuf.q1.f9919s
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.b(r3)
            goto L6d
        L5a:
            boolean r2 = r7.m(r8, r1)
            if (r2 == 0) goto L6d
            com.google.protobuf.h2 r2 = r7.j(r1)
            sun.misc.Unsafe r5 = com.google.protobuf.q1.f9919s
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.b(r3)
        L6d:
            int r1 = r1 + 3
            goto Lc
        L70:
            com.google.protobuf.s2 r0 = r7.f9934o
            r0.j(r8)
            boolean r0 = r7.f9925f
            if (r0 == 0) goto L7e
            com.google.protobuf.z r0 = r7.f9935p
            r0.e(r8)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q1.b(java.lang.Object):void");
    }

    @Override // com.google.protobuf.h2
    public void c(Object obj, f2 f2Var, y yVar) throws Throwable {
        yVar.getClass();
        e(obj);
        q(this.f9934o, this.f9935p, obj, f2Var, yVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.h2
    public int d(Object obj) {
        int i10;
        int iJ;
        int iR;
        int iZ;
        int i11;
        int iW;
        int iY;
        q1 q1Var = this;
        Object obj2 = obj;
        Unsafe unsafe = f9919s;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i13 < q1Var.f9920a.length) {
            int iQ = q1Var.Q(i13);
            int iP = P(iQ);
            int iZ2 = q1Var.z(i13);
            int i17 = q1Var.f9920a[i13 + 2];
            int i18 = i17 & i12;
            if (iP <= 17) {
                if (i18 != i14) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(obj2, i18);
                    i14 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = i16;
            long jA = A(iQ);
            if (iP < f0.X.d() || iP > f0.f8981k0.d()) {
                i18 = 0;
            }
            switch (iP) {
                case 0:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iJ = o.j(iZ2, 0.0d);
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 1:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iR = o.r(iZ2, 0.0f);
                        i16 = i19 + iR;
                        q1Var = this;
                        obj2 = obj;
                    }
                    q1Var = this;
                    obj2 = obj;
                    i16 = i19;
                    break;
                case 2:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iZ = o.z(iZ2, unsafe.getLong(obj2, jA));
                        i16 = i19 + iZ;
                        q1Var = this;
                    }
                    q1Var = this;
                    i16 = i19;
                    break;
                case 3:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iZ = o.Z(iZ2, unsafe.getLong(obj2, jA));
                        i16 = i19 + iZ;
                        q1Var = this;
                    }
                    q1Var = this;
                    i16 = i19;
                    break;
                case 4:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iZ = o.x(iZ2, unsafe.getInt(obj2, jA));
                        i16 = i19 + iZ;
                        q1Var = this;
                    }
                    q1Var = this;
                    i16 = i19;
                    break;
                case 5:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iR = o.p(iZ2, 0L);
                        i16 = i19 + iR;
                        q1Var = this;
                        obj2 = obj;
                    }
                    q1Var = this;
                    obj2 = obj;
                    i16 = i19;
                    break;
                case 6:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iR = o.n(iZ2, 0);
                        i16 = i19 + iR;
                        q1Var = this;
                        obj2 = obj;
                    }
                    q1Var = this;
                    obj2 = obj;
                    i16 = i19;
                    break;
                case 7:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iR = o.e(iZ2, true);
                        i16 = i19 + iR;
                        q1Var = this;
                        obj2 = obj;
                    }
                    q1Var = this;
                    obj2 = obj;
                    i16 = i19;
                    break;
                case 8:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        Object object = unsafe.getObject(obj2, jA);
                        iZ = object instanceof l ? o.h(iZ2, (l) object) : o.U(iZ2, (String) object);
                        i16 = i19 + iZ;
                        q1Var = this;
                    }
                    q1Var = this;
                    i16 = i19;
                    break;
                case 9:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iJ = j2.o(iZ2, unsafe.getObject(obj2, jA), q1Var.j(i13));
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 10:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iZ = o.h(iZ2, (l) unsafe.getObject(obj2, jA));
                        i16 = i19 + iZ;
                        q1Var = this;
                    }
                    q1Var = this;
                    i16 = i19;
                    break;
                case 11:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iZ = o.X(iZ2, unsafe.getInt(obj2, jA));
                        i16 = i19 + iZ;
                        q1Var = this;
                    }
                    q1Var = this;
                    i16 = i19;
                    break;
                case 12:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iZ = o.l(iZ2, unsafe.getInt(obj2, jA));
                        i16 = i19 + iZ;
                        q1Var = this;
                    }
                    q1Var = this;
                    i16 = i19;
                    break;
                case 13:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iR = o.M(iZ2, 0);
                        i16 = i19 + iR;
                        q1Var = this;
                        obj2 = obj;
                    }
                    q1Var = this;
                    obj2 = obj;
                    i16 = i19;
                    break;
                case 14:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iR = o.O(iZ2, 0L);
                        i16 = i19 + iR;
                        q1Var = this;
                        obj2 = obj;
                    }
                    q1Var = this;
                    obj2 = obj;
                    i16 = i19;
                    break;
                case 15:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iZ = o.Q(iZ2, unsafe.getInt(obj2, jA));
                        i16 = i19 + iZ;
                        q1Var = this;
                    }
                    q1Var = this;
                    i16 = i19;
                    break;
                case 16:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iZ = o.S(iZ2, unsafe.getLong(obj2, jA));
                        i16 = i19 + iZ;
                        q1Var = this;
                    }
                    q1Var = this;
                    i16 = i19;
                    break;
                case 17:
                    if (q1Var.n(obj2, i13, i14, i15, i10)) {
                        iJ = o.u(iZ2, (l1) unsafe.getObject(obj2, jA), q1Var.j(i13));
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 18:
                    iJ = j2.h(iZ2, (List) unsafe.getObject(obj2, jA), false);
                    i16 = i19 + iJ;
                    break;
                case 19:
                    iJ = j2.f(iZ2, (List) unsafe.getObject(obj2, jA), false);
                    i16 = i19 + iJ;
                    break;
                case 20:
                    iJ = j2.m(iZ2, (List) unsafe.getObject(obj2, jA), false);
                    i16 = i19 + iJ;
                    break;
                case 21:
                    iJ = j2.x(iZ2, (List) unsafe.getObject(obj2, jA), false);
                    i16 = i19 + iJ;
                    break;
                case 22:
                    iJ = j2.k(iZ2, (List) unsafe.getObject(obj2, jA), false);
                    i16 = i19 + iJ;
                    break;
                case 23:
                    iJ = j2.h(iZ2, (List) unsafe.getObject(obj2, jA), false);
                    i16 = i19 + iJ;
                    break;
                case 24:
                    iJ = j2.f(iZ2, (List) unsafe.getObject(obj2, jA), false);
                    i16 = i19 + iJ;
                    break;
                case 25:
                    iJ = j2.a(iZ2, (List) unsafe.getObject(obj2, jA), false);
                    i16 = i19 + iJ;
                    break;
                case 26:
                    iJ = j2.u(iZ2, (List) unsafe.getObject(obj2, jA));
                    i16 = i19 + iJ;
                    break;
                case 27:
                    iJ = j2.p(iZ2, (List) unsafe.getObject(obj2, jA), q1Var.j(i13));
                    i16 = i19 + iJ;
                    break;
                case 28:
                    iJ = j2.c(iZ2, (List) unsafe.getObject(obj2, jA));
                    i16 = i19 + iJ;
                    break;
                case 29:
                    iJ = j2.v(iZ2, (List) unsafe.getObject(obj2, jA), false);
                    i16 = i19 + iJ;
                    break;
                case 30:
                    iJ = j2.d(iZ2, (List) unsafe.getObject(obj2, jA), false);
                    i16 = i19 + iJ;
                    break;
                case 31:
                    iJ = j2.f(iZ2, (List) unsafe.getObject(obj2, jA), false);
                    i16 = i19 + iJ;
                    break;
                case 32:
                    iJ = j2.h(iZ2, (List) unsafe.getObject(obj2, jA), false);
                    i16 = i19 + iJ;
                    break;
                case 33:
                    iJ = j2.q(iZ2, (List) unsafe.getObject(obj2, jA), false);
                    i16 = i19 + iJ;
                    break;
                case 34:
                    iJ = j2.s(iZ2, (List) unsafe.getObject(obj2, jA), false);
                    i16 = i19 + iJ;
                    break;
                case 35:
                    i11 = j2.i((List) unsafe.getObject(obj2, jA));
                    if (i11 > 0) {
                        if (q1Var.f9928i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iW = o.W(iZ2);
                        iY = o.Y(i11);
                        i16 = i19 + iW + iY + i11;
                    }
                    i16 = i19;
                    break;
                case 36:
                    i11 = j2.g((List) unsafe.getObject(obj2, jA));
                    if (i11 > 0) {
                        if (q1Var.f9928i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iW = o.W(iZ2);
                        iY = o.Y(i11);
                        i16 = i19 + iW + iY + i11;
                    }
                    i16 = i19;
                    break;
                case 37:
                    i11 = j2.n((List) unsafe.getObject(obj2, jA));
                    if (i11 > 0) {
                        if (q1Var.f9928i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iW = o.W(iZ2);
                        iY = o.Y(i11);
                        i16 = i19 + iW + iY + i11;
                    }
                    i16 = i19;
                    break;
                case 38:
                    i11 = j2.y((List) unsafe.getObject(obj2, jA));
                    if (i11 > 0) {
                        if (q1Var.f9928i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iW = o.W(iZ2);
                        iY = o.Y(i11);
                        i16 = i19 + iW + iY + i11;
                    }
                    i16 = i19;
                    break;
                case 39:
                    i11 = j2.l((List) unsafe.getObject(obj2, jA));
                    if (i11 > 0) {
                        if (q1Var.f9928i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iW = o.W(iZ2);
                        iY = o.Y(i11);
                        i16 = i19 + iW + iY + i11;
                    }
                    i16 = i19;
                    break;
                case 40:
                    i11 = j2.i((List) unsafe.getObject(obj2, jA));
                    if (i11 > 0) {
                        if (q1Var.f9928i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iW = o.W(iZ2);
                        iY = o.Y(i11);
                        i16 = i19 + iW + iY + i11;
                    }
                    i16 = i19;
                    break;
                case 41:
                    i11 = j2.g((List) unsafe.getObject(obj2, jA));
                    if (i11 > 0) {
                        if (q1Var.f9928i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iW = o.W(iZ2);
                        iY = o.Y(i11);
                        i16 = i19 + iW + iY + i11;
                    }
                    i16 = i19;
                    break;
                case 42:
                    i11 = j2.b((List) unsafe.getObject(obj2, jA));
                    if (i11 > 0) {
                        if (q1Var.f9928i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iW = o.W(iZ2);
                        iY = o.Y(i11);
                        i16 = i19 + iW + iY + i11;
                    }
                    i16 = i19;
                    break;
                case 43:
                    i11 = j2.w((List) unsafe.getObject(obj2, jA));
                    if (i11 > 0) {
                        if (q1Var.f9928i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iW = o.W(iZ2);
                        iY = o.Y(i11);
                        i16 = i19 + iW + iY + i11;
                    }
                    i16 = i19;
                    break;
                case 44:
                    i11 = j2.e((List) unsafe.getObject(obj2, jA));
                    if (i11 > 0) {
                        if (q1Var.f9928i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iW = o.W(iZ2);
                        iY = o.Y(i11);
                        i16 = i19 + iW + iY + i11;
                    }
                    i16 = i19;
                    break;
                case 45:
                    i11 = j2.g((List) unsafe.getObject(obj2, jA));
                    if (i11 > 0) {
                        if (q1Var.f9928i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iW = o.W(iZ2);
                        iY = o.Y(i11);
                        i16 = i19 + iW + iY + i11;
                    }
                    i16 = i19;
                    break;
                case 46:
                    i11 = j2.i((List) unsafe.getObject(obj2, jA));
                    if (i11 > 0) {
                        if (q1Var.f9928i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iW = o.W(iZ2);
                        iY = o.Y(i11);
                        i16 = i19 + iW + iY + i11;
                    }
                    i16 = i19;
                    break;
                case 47:
                    i11 = j2.r((List) unsafe.getObject(obj2, jA));
                    if (i11 > 0) {
                        if (q1Var.f9928i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iW = o.W(iZ2);
                        iY = o.Y(i11);
                        i16 = i19 + iW + iY + i11;
                    }
                    i16 = i19;
                    break;
                case 48:
                    i11 = j2.t((List) unsafe.getObject(obj2, jA));
                    if (i11 > 0) {
                        if (q1Var.f9928i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iW = o.W(iZ2);
                        iY = o.Y(i11);
                        i16 = i19 + iW + iY + i11;
                    }
                    i16 = i19;
                    break;
                case 49:
                    iJ = j2.j(iZ2, (List) unsafe.getObject(obj2, jA), q1Var.j(i13));
                    i16 = i19 + iJ;
                    break;
                case 50:
                    iJ = q1Var.f9936q.f(iZ2, unsafe.getObject(obj2, jA), q1Var.i(i13));
                    i16 = i19 + iJ;
                    break;
                case 51:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.j(iZ2, 0.0d);
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 52:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.r(iZ2, 0.0f);
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 53:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.z(iZ2, C(obj2, jA));
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 54:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.Z(iZ2, C(obj2, jA));
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 55:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.x(iZ2, B(obj2, jA));
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 56:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.p(iZ2, 0L);
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 57:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.n(iZ2, 0);
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 58:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.e(iZ2, true);
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 59:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        Object object2 = unsafe.getObject(obj2, jA);
                        iJ = object2 instanceof l ? o.h(iZ2, (l) object2) : o.U(iZ2, (String) object2);
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 60:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = j2.o(iZ2, unsafe.getObject(obj2, jA), q1Var.j(i13));
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 61:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.h(iZ2, (l) unsafe.getObject(obj2, jA));
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 62:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.X(iZ2, B(obj2, jA));
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 63:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.l(iZ2, B(obj2, jA));
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 64:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.M(iZ2, 0);
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 65:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.O(iZ2, 0L);
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 66:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.Q(iZ2, B(obj2, jA));
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 67:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.S(iZ2, C(obj2, jA));
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                case 68:
                    if (q1Var.p(obj2, iZ2, i13)) {
                        iJ = o.u(iZ2, (l1) unsafe.getObject(obj2, jA), q1Var.j(i13));
                        i16 = i19 + iJ;
                    }
                    i16 = i19;
                    break;
                default:
                    i16 = i19;
                    break;
            }
            i13 += 3;
            i12 = 1048575;
        }
        int iK = i16 + q1Var.k(q1Var.f9934o, obj2);
        return q1Var.f9925f ? iK + q1Var.f9935p.b(obj2).v() : iK;
    }

    @Override // com.google.protobuf.h2
    public Object newInstance() {
        return this.f9932m.a(this.f9924e);
    }
}
