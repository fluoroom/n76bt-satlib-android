package yj;

import j$.util.Comparator;
import j$.util.List;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public class k0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f32686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection f32687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m0[] f32688c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yj.k0] */
    k0(b0 b0Var, Collection collection) {
        ?? obj = new Object();
        obj.f32686a = b0Var;
        obj.f32687b = collection;
        ArrayList arrayList = new ArrayList(collection);
        List.EL.sort(arrayList, Comparator.CC.comparing(new Function() { // from class: yj.j0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((p) obj2).d();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        int i10 = 0;
        k0 k0Var = obj;
        if (((p) arrayList.get(0)).d().i() > 1968) {
            arrayList.add(0, obj.i(1961, 1, 1, 37300, "1.4228180", "0.001296"));
            arrayList.add(1, i(1961, 8, 1, 37300, "1.3728180", "0.001296"));
            arrayList.add(2, i(1962, 1, 1, 37665, "1.8458580", "0.0011232"));
            arrayList.add(3, i(1963, 11, 1, 37665, "1.9458580", "0.0011232"));
            arrayList.add(4, i(1964, 1, 1, 38761, "3.2401300", "0.001296"));
            arrayList.add(5, i(1964, 4, 1, 38761, "3.3401300", "0.001296"));
            arrayList.add(6, i(1964, 9, 1, 38761, "3.4401300", "0.001296"));
            arrayList.add(7, i(1965, 1, 1, 38761, "3.5401300", "0.001296"));
            arrayList.add(8, i(1965, 3, 1, 38761, "3.6401300", "0.001296"));
            arrayList.add(9, i(1965, 7, 1, 38761, "3.7401300", "0.001296"));
            arrayList.add(10, i(1965, 9, 1, 38761, "3.8401300", "0.001296"));
            arrayList.add(11, i(1966, 1, 1, 39126, "4.3131700", "0.002592"));
            k0 k0Var2 = this;
            arrayList.add(12, k0Var2.i(1968, 2, 1, 39126, "4.2131700", "0.002592"));
            k0Var = k0Var2;
        }
        k0Var.f32688c = new m0[arrayList.size()];
        m0 m0Var = null;
        while (i10 < arrayList.size()) {
            p pVar = (p) arrayList.get(i10);
            i iVarD = pVar.d();
            int iA = pVar.a();
            y yVarB = pVar.b();
            int iC = pVar.c();
            b bVarF0 = new b(iVarD, b0Var).f0(m0Var == null ? y.f32756c : m0Var.h(iVarD, w.f32743e));
            long jG = ((long) (iVarD.g() - iA)) * 86400;
            y yVarK = y.f32760g.K(((long) iC) * aj.d.d(jG));
            m0 m0Var2 = new m0(bVarF0, iVarD.g(), new b(iVarD, b0Var).f0(jG < 0 ? yVarB.O(yVarK) : yVarB.j(yVarK)).R(bVarF0).K(1000000000L).l(1000000000 + iC), yVarB, iA, iC, b.T(iA, 0.0d, b0Var).f0(yVarB));
            k0Var.f32688c[i10] = m0Var2;
            i10++;
            m0Var = m0Var2;
        }
    }

    private m0 f(int i10) {
        int length = this.f32688c.length;
        int i11 = 0;
        while (length - i11 > 1) {
            int i12 = (i11 + length) >>> 1;
            if (i10 < this.f32688c[i12].b()) {
                length = i12;
            } else {
                i11 = i12;
            }
        }
        m0[] m0VarArr = this.f32688c;
        if (length == m0VarArr.length) {
            return m0VarArr[m0VarArr.length - 1];
        }
        if (i10 < m0VarArr[i11].b()) {
            return null;
        }
        return this.f32688c[i11];
    }

    private int g(b bVar) {
        int length = this.f32688c.length;
        int i10 = 0;
        while (length - i10 > 1) {
            int i11 = (i10 + length) >>> 1;
            if (bVar.compareTo(this.f32688c[i11].getDate()) < 0) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        m0[] m0VarArr = this.f32688c;
        if (length == m0VarArr.length) {
            return m0VarArr.length - 1;
        }
        if (bVar.compareTo(m0VarArr[i10].getDate()) < 0) {
            return -1;
        }
        return i10;
    }

    private p i(int i10, int i11, int i12, int i13, String str, String str2) {
        return new p(new i(i10, i11, i12), i13, y.N(str), (int) (y.N(str2).v() / 86400000000000L));
    }

    @Override // yj.b0
    public y a(b bVar) {
        int iG = g(bVar);
        return iG < 0 ? y.f32756c : this.f32688c[iG].c(bVar).L();
    }

    @Override // yj.b0
    public boolean b(b bVar) {
        int iG = g(bVar);
        return iG >= 0 && bVar.compareTo(this.f32688c[iG].i()) < 0;
    }

    @Override // yj.b0
    public y c(i iVar, w wVar) {
        int iE = ((wVar.e() * 60) + wVar.f()) - wVar.g();
        if (iE < 0) {
            iE -= 1439;
        }
        m0 m0VarF = f(iVar.g() + (iE / 1440));
        return m0VarF == null ? y.f32756c : m0VarF.h(iVar, wVar);
    }

    @Override // yj.b0
    public y d(b bVar) {
        int iG = g(bVar);
        return iG < 0 ? y.f32756c : this.f32688c[iG].a();
    }

    @Override // yj.b0
    public int e(b bVar) {
        m0 m0Var;
        int iG = g(bVar);
        if (iG < 0 || bVar.compareTo(this.f32688c[iG].i()) >= 0) {
            int i10 = iG + 1;
            m0[] m0VarArr = this.f32688c;
            m0Var = (i10 >= m0VarArr.length || m0VarArr[i10].getDate().X(bVar) > 60.0d) ? null : this.f32688c[i10];
        } else {
            m0Var = this.f32688c[iG];
        }
        if (m0Var != null) {
            return ((int) (m0Var.a().x() + aj.d.F(1L, m0Var.a().v()))) + 60;
        }
        return 60;
    }

    public String h() {
        return "UTC";
    }

    public String toString() {
        return h();
    }
}
