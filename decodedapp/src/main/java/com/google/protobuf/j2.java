package com.google.protobuf;

import com.google.protobuf.o0;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
abstract class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f9045a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final s2 f9046b = C();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s2 f9047c = new v2();

    private static Class A() {
        try {
            boolean z10 = k0.alwaysUseFieldBuilders;
            return k0.class;
        } catch (Throwable unused) {
            return null;
        }
    }

    static Object B(Class cls, String str) {
        try {
            Field[] declaredFields = Class.forName(cls.getName() + "$" + J(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return y2.H(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    private static s2 C() {
        try {
            Class clsD = D();
            if (clsD == null) {
                return null;
            }
            return (s2) clsD.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class D() {
        try {
            int i10 = w2.f10136b;
            return w2.class;
        } catch (Throwable unused) {
            return null;
        }
    }

    static void E(z zVar, Object obj, Object obj2) {
        e0 e0VarB = zVar.b(obj2);
        if (e0VarB.y()) {
            return;
        }
        zVar.c(obj).G(e0VarB);
    }

    static void F(e1 e1Var, Object obj, Object obj2, long j10) {
        y2.X(obj, j10, e1Var.a(y2.G(obj, j10), y2.G(obj2, j10)));
    }

    static void G(s2 s2Var, Object obj, Object obj2) {
        s2Var.p(obj, s2Var.k(s2Var.g(obj), s2Var.g(obj2)));
    }

    public static void H(Class cls) {
        Class cls2;
        if (!j0.class.isAssignableFrom(cls) && (cls2 = f9045a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static Object I(Object obj, int i10, int i11, Object obj2, s2 s2Var) {
        if (obj2 == null) {
            obj2 = s2Var.f(obj);
        }
        s2Var.e(obj2, i10, i11);
        return obj2;
    }

    static String J(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb2.append(cCharAt);
                    }
                    z10 = true;
                } else if (i10 != 0 || z10) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append((char) (cCharAt + ' '));
                }
            } else if (z10) {
                sb2.append((char) (cCharAt - ' '));
            } else {
                sb2.append(cCharAt);
            }
            z10 = false;
        }
        return sb2.toString();
    }

    public static s2 K() {
        return f9046b;
    }

    public static s2 L() {
        return f9047c;
    }

    static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? o.W(i10) + o.E(size) : size * o.e(i10, true);
    }

    static int b(List list) {
        return list.size();
    }

    static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = size * o.W(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iW += o.i((l) list.get(i11));
        }
        return iW;
    }

    static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z10 ? o.W(i10) + o.E(iE) : iE + (size * o.W(i10));
    }

    static int e(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n0)) {
            int iM = 0;
            while (i10 < size) {
                iM += o.m(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iM;
        }
        n0 n0Var = (n0) list;
        int iM2 = 0;
        while (i10 < size) {
            iM2 += o.m(n0Var.getInt(i10));
            i10++;
        }
        return iM2;
    }

    static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? o.W(i10) + o.E(size * 4) : size * o.n(i10, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? o.W(i10) + o.E(size * 8) : size * o.p(i10, 0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i10, List list, h2 h2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iU += o.u(i10, (l1) list.get(i11), h2Var);
        }
        return iU;
    }

    static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z10 ? o.W(i10) + o.E(iL) : iL + (size * o.W(i10));
    }

    static int l(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n0)) {
            int iY = 0;
            while (i10 < size) {
                iY += o.y(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iY;
        }
        n0 n0Var = (n0) list;
        int iY2 = 0;
        while (i10 < size) {
            iY2 += o.y(n0Var.getInt(i10));
            i10++;
        }
        return iY2;
    }

    static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? o.W(i10) + o.E(iN) : iN + (list.size() * o.W(i10));
    }

    static int n(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x0)) {
            int iA = 0;
            while (i10 < size) {
                iA += o.A(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        x0 x0Var = (x0) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += o.A(x0Var.getLong(i10));
            i10++;
        }
        return iA2;
    }

    static int o(int i10, Object obj, h2 h2Var) {
        return obj instanceof t0 ? o.C(i10, (t0) obj) : o.H(i10, (l1) obj, h2Var);
    }

    static int p(int i10, List list, h2 h2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = o.W(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iW += obj instanceof t0 ? o.D((t0) obj) : o.J((l1) obj, h2Var);
        }
        return iW;
    }

    static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z10 ? o.W(i10) + o.E(iR) : iR + (size * o.W(i10));
    }

    static int r(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n0)) {
            int iR = 0;
            while (i10 < size) {
                iR += o.R(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iR;
        }
        n0 n0Var = (n0) list;
        int iR2 = 0;
        while (i10 < size) {
            iR2 += o.R(n0Var.getInt(i10));
            i10++;
        }
        return iR2;
    }

    static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z10 ? o.W(i10) + o.E(iT) : iT + (size * o.W(i10));
    }

    static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x0)) {
            int iT = 0;
            while (i10 < size) {
                iT += o.T(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iT;
        }
        x0 x0Var = (x0) list;
        int iT2 = 0;
        while (i10 < size) {
            iT2 += o.T(x0Var.getLong(i10));
            i10++;
        }
        return iT2;
    }

    static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iW = o.W(i10) * size;
        if (!(list instanceof v0)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                iW += obj instanceof l ? o.i((l) obj) : o.V((String) obj);
                i11++;
            }
            return iW;
        }
        v0 v0Var = (v0) list;
        while (i11 < size) {
            Object objH0 = v0Var.h0(i11);
            iW += objH0 instanceof l ? o.i((l) objH0) : o.V((String) objH0);
            i11++;
        }
        return iW;
    }

    static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z10 ? o.W(i10) + o.E(iW) : iW + (size * o.W(i10));
    }

    static int w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n0)) {
            int iY = 0;
            while (i10 < size) {
                iY += o.Y(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iY;
        }
        n0 n0Var = (n0) list;
        int iY2 = 0;
        while (i10 < size) {
            iY2 += o.Y(n0Var.getInt(i10));
            i10++;
        }
        return iY2;
    }

    static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z10 ? o.W(i10) + o.E(iY) : iY + (size * o.W(i10));
    }

    static int y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x0)) {
            int iA0 = 0;
            while (i10 < size) {
                iA0 += o.a0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA0;
        }
        x0 x0Var = (x0) list;
        int iA02 = 0;
        while (i10 < size) {
            iA02 += o.a0(x0Var.getLong(i10));
            i10++;
        }
        return iA02;
    }

    static Object z(Object obj, int i10, List list, o0.e eVar, Object obj2, s2 s2Var) {
        if (eVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!eVar.a(iIntValue)) {
                    obj2 = I(obj, i10, iIntValue, obj2, s2Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (eVar.a(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = I(obj, i10, iIntValue2, obj2, s2Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }
}
