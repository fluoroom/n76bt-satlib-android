package com.google.android.material.carousel;

import com.google.android.material.carousel.c;
import com.google.android.material.carousel.e;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f7655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f7656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f7657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f7658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f7659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f7660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f7661g;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7662a;

        static {
            int[] iArr = new int[c.a.values().length];
            f7662a = iArr;
            try {
                iArr[c.a.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private f(e eVar, List list, List list2) {
        this.f7655a = eVar;
        this.f7656b = DesugarCollections.unmodifiableList(list);
        this.f7657c = DesugarCollections.unmodifiableList(list2);
        float f10 = ((e) list.get(list.size() - 1)).d().f7647a - eVar.d().f7647a;
        this.f7660f = f10;
        float f11 = eVar.k().f7647a - ((e) list2.get(list2.size() - 1)).k().f7647a;
        this.f7661g = f11;
        this.f7658d = m(f10, list, true);
        this.f7659e = m(f11, list2, false);
    }

    private e a(List list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return fArrO[0] >= 0.5f ? (e) list.get((int) fArrO[2]) : (e) list.get((int) fArrO[1]);
    }

    private static int b(e eVar, float f10) {
        for (int iJ = eVar.j(); iJ < eVar.h().size(); iJ++) {
            if (f10 == ((e.c) eVar.h().get(iJ)).f7649c) {
                return iJ;
            }
        }
        return eVar.h().size() - 1;
    }

    private static int c(e eVar) {
        for (int i10 = 0; i10 < eVar.h().size(); i10++) {
            if (!((e.c) eVar.h().get(i10)).f7651e) {
                return i10;
            }
        }
        return -1;
    }

    private static int d(e eVar, float f10) {
        for (int iC = eVar.c() - 1; iC >= 0; iC--) {
            if (f10 == ((e.c) eVar.h().get(iC)).f7649c) {
                return iC;
            }
        }
        return 0;
    }

    private static int e(e eVar) {
        for (int size = eVar.h().size() - 1; size >= 0; size--) {
            if (!((e.c) eVar.h().get(size)).f7651e) {
                return size;
            }
        }
        return -1;
    }

    static f f(z8.a aVar, e eVar, float f10, float f11, float f12, c.a aVar2) {
        return new f(eVar, p(aVar, eVar, f10, f11, aVar2), n(aVar, eVar, f10, f12, aVar2));
    }

    private static float[] m(float f10, List list, boolean z10) {
        int size = list.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            e eVar = (e) list.get(i11);
            e eVar2 = (e) list.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? eVar2.d().f7647a - eVar.d().f7647a : eVar.k().f7647a - eVar2.k().f7647a) / f10);
            i10++;
        }
        return fArr;
    }

    private static List n(z8.a aVar, e eVar, float f10, float f11, c.a aVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        int iE = e(eVar);
        int iA = aVar.f() ? aVar.a() : aVar.b();
        if (!r(aVar, eVar) && iE != -1) {
            int iJ = iE - eVar.j();
            float f12 = eVar.d().f7648b - (eVar.d().f7650d / 2.0f);
            if (iJ <= 0 && eVar.i().f7652f > 0.0f) {
                arrayList.add(x(eVar, (f12 - eVar.i().f7652f) - f11, iA));
                return arrayList;
            }
            int i10 = 0;
            float f13 = 0.0f;
            while (i10 < iJ) {
                e eVar2 = (e) arrayList.get(arrayList.size() - 1);
                int i11 = iE - i10;
                float f14 = f13 + ((e.c) eVar.h().get(i11)).f7652f;
                int i12 = i11 + 1;
                int i13 = iA;
                e eVarT = t(eVar2, iE, i12 < eVar.h().size() ? d(eVar2, ((e.c) eVar.h().get(i12)).f7649c) + 1 : 0, f12 - f14, eVar.c() + i10 + 1, eVar.j() + i10 + 1, i13);
                if (i10 == iJ - 1 && f11 > 0.0f) {
                    eVarT = u(eVarT, f11, i13, false, f10, aVar2);
                    i13 = i13;
                }
                arrayList.add(eVarT);
                i10++;
                iA = i13;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(eVar, f11, iA, false, f10, aVar2));
        }
        return arrayList;
    }

    private static float[] o(List list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return new float[]{v8.a.b(0.0f, 1.0f, f11, f12, f10), i10 - 1, i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List p(z8.a aVar, e eVar, float f10, float f11, c.a aVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        int iC = c(eVar);
        int iA = aVar.f() ? aVar.a() : aVar.b();
        if (!q(eVar) && iC != -1) {
            int iC2 = eVar.c() - iC;
            float f12 = eVar.d().f7648b - (eVar.d().f7650d / 2.0f);
            if (iC2 <= 0 && eVar.b().f7652f > 0.0f) {
                arrayList.add(x(eVar, f12 + eVar.b().f7652f + f11, iA));
                return arrayList;
            }
            float f13 = 0.0f;
            for (int i10 = 0; i10 < iC2; i10++) {
                e eVar2 = (e) arrayList.get(arrayList.size() - 1);
                int i11 = iC + i10;
                int size = eVar.h().size() - 1;
                f13 += ((e.c) eVar.h().get(i11)).f7652f;
                int i12 = i11 - 1;
                if (i12 >= 0) {
                    size = b(eVar2, ((e.c) eVar.h().get(i12)).f7649c) - 1;
                }
                int i13 = iA;
                e eVarT = t(eVar2, iC, size, f12 + f13, (eVar.c() - i10) - 1, (eVar.j() - i10) - 1, i13);
                iA = i13;
                if (i10 == iC2 - 1 && f11 > 0.0f) {
                    eVarT = u(eVarT, f11, iA, true, f10, aVar2);
                }
                arrayList.add(eVarT);
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(eVar, f11, iA, true, f10, aVar2));
        }
        return arrayList;
    }

    private static boolean q(e eVar) {
        return eVar.b().f7648b - (eVar.b().f7650d / 2.0f) >= 0.0f && eVar.b() == eVar.e();
    }

    private static boolean r(z8.a aVar, e eVar) {
        int iB = aVar.b();
        if (aVar.f()) {
            iB = aVar.a();
        }
        return eVar.i().f7648b + (eVar.i().f7650d / 2.0f) <= ((float) iB) && eVar.i() == eVar.l();
    }

    private static e s(List list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return e.o((e) list.get((int) fArrO[1]), (e) list.get((int) fArrO[2]), fArrO[0]);
    }

    private static e t(e eVar, int i10, int i11, float f10, int i12, int i13, int i14) {
        ArrayList arrayList = new ArrayList(eVar.h());
        arrayList.add(i11, (e.c) arrayList.remove(i10));
        e.b bVar = new e.b(eVar.g(), i14);
        int i15 = 0;
        while (i15 < arrayList.size()) {
            e.c cVar = (e.c) arrayList.get(i15);
            float f11 = cVar.f7650d;
            bVar.e(f10 + (f11 / 2.0f), cVar.f7649c, f11, i15 >= i12 && i15 <= i13, cVar.f7651e, cVar.f7652f);
            f10 += cVar.f7650d;
            i15++;
        }
        return bVar.i();
    }

    private static e u(e eVar, float f10, int i10, boolean z10, float f11, c.a aVar) {
        return a.f7662a[aVar.ordinal()] != 1 ? w(eVar, f10, i10, z10) : v(eVar, f10, i10, z10, f11);
    }

    private static e v(e eVar, float f10, int i10, boolean z10, float f11) {
        ArrayList arrayList = new ArrayList(eVar.h());
        e.b bVar = new e.b(eVar.g(), i10);
        float fM = f10 / eVar.m();
        float f12 = z10 ? f10 : 0.0f;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            e.c cVar = (e.c) arrayList.get(i11);
            if (cVar.f7651e) {
                bVar.e(cVar.f7648b, cVar.f7649c, cVar.f7650d, false, true, cVar.f7652f);
            } else {
                boolean z11 = i11 >= eVar.c() && i11 <= eVar.j();
                float f13 = cVar.f7650d - fM;
                float fB = c.b(f13, eVar.g(), f11);
                float f14 = (f13 / 2.0f) + f12;
                float fAbs = Math.abs(f14 - cVar.f7648b);
                bVar.f(f14, fB, f13, z11, false, cVar.f7652f, z10 ? fAbs : 0.0f, z10 ? 0.0f : fAbs);
                f12 += f13;
            }
            i11++;
        }
        return bVar.i();
    }

    private static e w(e eVar, float f10, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(eVar.h());
        e.b bVar = new e.b(eVar.g(), i10);
        int size = z10 ? 0 : arrayList.size() - 1;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            e.c cVar = (e.c) arrayList.get(i11);
            if (cVar.f7651e && i11 == size) {
                bVar.e(cVar.f7648b, cVar.f7649c, cVar.f7650d, false, true, cVar.f7652f);
            } else {
                float f11 = cVar.f7648b;
                float f12 = z10 ? f11 + f10 : f11 - f10;
                float f13 = z10 ? f10 : 0.0f;
                float f14 = z10 ? 0.0f : f10;
                boolean z11 = i11 >= eVar.c() && i11 <= eVar.j();
                float f15 = f12;
                float f16 = cVar.f7649c;
                float f17 = cVar.f7650d;
                bVar.f(f15, f16, f17, z11, cVar.f7651e, Math.abs(z10 ? Math.max(0.0f, ((f17 / 2.0f) + f15) - i10) : Math.min(0.0f, f15 - (f17 / 2.0f))), f13, f14);
            }
            i11++;
        }
        return bVar.i();
    }

    private static e x(e eVar, float f10, int i10) {
        return t(eVar, 0, 0, f10, eVar.c(), eVar.j(), i10);
    }

    e g() {
        return this.f7655a;
    }

    e h() {
        return (e) this.f7657c.get(r0.size() - 1);
    }

    Map i(int i10, int i11, int i12, boolean z10) {
        float fG = this.f7655a.g();
        HashMap map = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i10) {
                break;
            }
            int i15 = z10 ? (i10 - i13) - 1 : i13;
            if (i15 * fG * (z10 ? -1 : 1) > i12 - this.f7661g || i13 >= i10 - this.f7657c.size()) {
                Integer numValueOf = Integer.valueOf(i15);
                List list = this.f7657c;
                map.put(numValueOf, (e) list.get(h0.a.b(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i16 = 0;
        for (int i17 = i10 - 1; i17 >= 0; i17--) {
            int i18 = z10 ? (i10 - i17) - 1 : i17;
            if (i18 * fG * (z10 ? -1 : 1) < i11 + this.f7660f || i17 < this.f7656b.size()) {
                Integer numValueOf2 = Integer.valueOf(i18);
                List list2 = this.f7656b;
                map.put(numValueOf2, (e) list2.get(h0.a.b(i16, 0, list2.size() - 1)));
                i16++;
            }
        }
        return map;
    }

    public e j(float f10, float f11, float f12) {
        return k(f10, f11, f12, false);
    }

    e k(float f10, float f11, float f12, boolean z10) {
        float fB;
        List list;
        float[] fArr;
        float f13 = this.f7660f + f11;
        float f14 = f12 - this.f7661g;
        float f15 = l().b().f7653g;
        float f16 = h().b().f7654h;
        if (this.f7660f == f15) {
            f13 += f15;
        }
        if (this.f7661g == f16) {
            f14 -= f16;
        }
        if (f10 < f13) {
            fB = v8.a.b(1.0f, 0.0f, f11, f13, f10);
            list = this.f7656b;
            fArr = this.f7658d;
        } else {
            if (f10 <= f14) {
                return this.f7655a;
            }
            fB = v8.a.b(0.0f, 1.0f, f14, f12, f10);
            list = this.f7657c;
            fArr = this.f7659e;
        }
        return z10 ? a(list, fB, fArr) : s(list, fB, fArr);
    }

    e l() {
        return (e) this.f7656b.get(r0.size() - 1);
    }
}
