package be;

import be.c3;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import yd.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z implements yd.b, y2 {

    /* JADX INFO: renamed from: a */
    private final c3.a f4026a;

    /* JADX INFO: renamed from: b */
    private final c3.a f4027b;

    /* JADX INFO: renamed from: c */
    private final c3.a f4028c;

    /* JADX INFO: renamed from: d */
    private final c3.a f4029d;

    /* JADX INFO: renamed from: e */
    private final c3.a f4030e;

    /* JADX INFO: renamed from: f */
    private final dd.j f4031f;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return gd.a.d(((yd.i) obj).getName(), ((yd.i) obj2).getName());
        }
    }

    public z() {
        c3.a aVarC = c3.c(new p(this));
        rd.m.d(aVarC, "lazySoft(...)");
        this.f4026a = aVarC;
        c3.a aVarC2 = c3.c(new q(this));
        rd.m.d(aVarC2, "lazySoft(...)");
        this.f4027b = aVarC2;
        c3.a aVarC3 = c3.c(new r(this));
        rd.m.d(aVarC3, "lazySoft(...)");
        this.f4028c = aVarC3;
        c3.a aVarC4 = c3.c(new s(this));
        rd.m.d(aVarC4, "lazySoft(...)");
        this.f4029d = aVarC4;
        c3.a aVarC5 = c3.c(new t(this));
        rd.m.d(aVarC5, "lazySoft(...)");
        this.f4030e = aVarC5;
        this.f4031f = dd.k.a(dd.n.f10910b, new u(this));
    }

    private final Object F(yd.m mVar) {
        Class clsB = pd.a.b(ae.b.b(mVar));
        if (clsB.isArray()) {
            Object objNewInstance = Array.newInstance(clsB.getComponentType(), 0);
            rd.m.d(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new z2("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type");
    }

    private final Type G() {
        Type[] lowerBounds;
        if (t()) {
            Object objM0 = ed.q.m0(H().j());
            ParameterizedType parameterizedType = objM0 instanceof ParameterizedType ? (ParameterizedType) objM0 : null;
            if (rd.m.a(parameterizedType != null ? parameterizedType.getRawType() : null, hd.e.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                rd.m.d(actualTypeArguments, "getActualTypeArguments(...)");
                Object objX = ed.j.X(actualTypeArguments);
                WildcardType wildcardType = objX instanceof WildcardType ? (WildcardType) objX : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) ed.j.D(lowerBounds);
                }
            }
        }
        return null;
    }

    private final int L(yd.i iVar) {
        if (!((Boolean) this.f4031f.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!l3.k(iVar.getType())) {
            return 1;
        }
        yd.m type = iVar.getType();
        rd.m.c(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        List listN = ce.o.n(eg.e2.a(((v2) type).n()));
        rd.m.b(listN);
        return listN.size();
    }

    public static final boolean P(z zVar) {
        List listM = zVar.M();
        if (d.h0.a(listM) && listM.isEmpty()) {
            return false;
        }
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            if (l3.k(((yd.i) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    public static final Object[] d(z zVar) {
        int iL;
        List<yd.i> listM = zVar.M();
        int size = listM.size() + (zVar.t() ? 1 : 0);
        if (((Boolean) zVar.f4031f.getValue()).booleanValue()) {
            iL = 0;
            for (yd.i iVar : listM) {
                iL += iVar.j() == i.a.f32522d ? zVar.L(iVar) : 0;
            }
        } else if (listM.isEmpty()) {
            iL = 0;
        } else {
            Iterator it = listM.iterator();
            iL = 0;
            while (it.hasNext()) {
                if (((yd.i) it.next()).j() == i.a.f32522d && (iL = iL + 1) < 0) {
                    ed.q.t();
                }
            }
        }
        int i10 = (iL + 31) / 32;
        Object[] objArr = new Object[size + i10 + 1];
        for (yd.i iVar2 : listM) {
            if (iVar2.a() && !l3.l(iVar2.getType())) {
                objArr[iVar2.getIndex()] = l3.g(ae.c.f(iVar2.getType()));
            } else if (iVar2.b()) {
                objArr[iVar2.getIndex()] = zVar.F(iVar2.getType());
            }
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[size + i11] = 0;
        }
        return objArr;
    }

    public static final List e(z zVar) {
        return l3.e(zVar.Q());
    }

    public static final ArrayList g(z zVar) {
        int i10;
        he.b bVarQ = zVar.Q();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        if (zVar.O()) {
            i10 = 0;
        } else {
            he.b1 b1VarI = l3.i(bVarQ);
            if (b1VarI != null) {
                arrayList.add(new z1(zVar, 0, i.a.f32519a, new v(b1VarI)));
                i10 = 1;
            } else {
                i10 = 0;
            }
            he.b1 b1VarL0 = bVarQ.l0();
            if (b1VarL0 != null) {
                arrayList.add(new z1(zVar, i10, i.a.f32521c, new w(b1VarL0)));
                i10++;
            }
        }
        int size = bVarQ.i().size();
        while (i11 < size) {
            arrayList.add(new z1(zVar, i10, i.a.f32522d, new x(bVarQ, i11)));
            i11++;
            i10++;
        }
        if (zVar.N() && (bVarQ instanceof xe.a) && arrayList.size() > 1) {
            ed.q.z(arrayList, new a());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final he.v0 o(he.b bVar, int i10) {
        Object obj = bVar.i().get(i10);
        rd.m.d(obj, "get(...)");
        return (he.v0) obj;
    }

    public static final v2 p(z zVar) {
        eg.r0 r0VarG = zVar.Q().g();
        rd.m.b(r0VarG);
        return new v2(r0VarG, new y(zVar));
    }

    public static final Type q(z zVar) {
        Type typeG = zVar.G();
        return typeG == null ? zVar.H().g() : typeG;
    }

    public static final List u(z zVar) {
        List<he.l1> typeParameters = zVar.Q().getTypeParameters();
        rd.m.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(ed.q.v(typeParameters, 10));
        for (he.l1 l1Var : typeParameters) {
            rd.m.b(l1Var);
            arrayList.add(new x2(zVar, l1Var));
        }
        return arrayList;
    }

    public abstract ce.h H();

    public abstract d1 I();

    public abstract ce.h J();

    /* JADX INFO: renamed from: K */
    public abstract he.b Q();

    public List M() {
        Object objA = this.f4027b.a();
        rd.m.d(objA, "invoke(...)");
        return (List) objA;
    }

    protected final boolean N() {
        return rd.m.a(getName(), "<init>") && I().d().isAnnotation();
    }

    public abstract boolean O();

    @Override // yd.b
    public Object i(Object... objArr) throws zd.a {
        rd.m.e(objArr, "args");
        try {
            return H().i(objArr);
        } catch (IllegalAccessException e10) {
            throw new zd.a(e10);
        }
    }

    public static final he.v0 m(he.b1 b1Var) {
        return b1Var;
    }

    public static final he.v0 n(he.b1 b1Var) {
        return b1Var;
    }
}
