package x6;

import com.fasterxml.jackson.databind.JavaType;
import d6.h;
import d6.k;
import d6.r;
import i7.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p6.b;
import q6.f;

/* JADX INFO: loaded from: classes.dex */
public class s extends p6.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Class[] f31801j = new Class[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final f0 f31802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final r6.q f31803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final p6.b f31804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final d f31805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Class[] f31806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f31807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected List f31808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected e0 f31809i;

    protected s(f0 f0Var, JavaType javaType, d dVar) {
        super(javaType);
        this.f31802b = f0Var;
        r6.q qVarD = f0Var.D();
        this.f31803c = qVarD;
        if (qVarD == null) {
            this.f31804d = null;
        } else {
            this.f31804d = qVarD.g();
        }
        this.f31805e = dVar;
    }

    public static s J(f0 f0Var) {
        return new s(f0Var);
    }

    public static s K(r6.q qVar, JavaType javaType, d dVar) {
        return new s(qVar, javaType, dVar, Collections.EMPTY_LIST);
    }

    public static s L(f0 f0Var) {
        return new s(f0Var);
    }

    @Override // p6.c
    public boolean A() {
        return this.f31805e.t();
    }

    @Override // p6.c
    public Object B(boolean z10) {
        f fVarR = this.f31805e.r();
        if (fVarR == null) {
            return null;
        }
        if (z10) {
            fVarR.i(this.f31803c.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return fVarR.r();
        } catch (Exception e10) {
            e = e10;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            i7.h.i0(e);
            i7.h.k0(e);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + this.f31805e.o().getName() + ": (" + e.getClass().getName() + ") " + i7.h.o(e), e);
        }
    }

    protected i7.j E(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof i7.j) {
            return (i7.j) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == j.a.class || i7.h.J(cls)) {
            return null;
        }
        if (i7.j.class.isAssignableFrom(cls)) {
            this.f31803c.w();
            return (i7.j) i7.h.l(cls, this.f31803c.b());
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
    }

    protected List F() {
        if (this.f31808h == null) {
            this.f31808h = this.f31802b.J();
        }
        return this.f31808h;
    }

    public boolean G(u uVar) {
        if (M(uVar.a())) {
            return false;
        }
        F().add(uVar);
        return true;
    }

    protected c H(l lVar) {
        Class clsA;
        if (!q().isAssignableFrom(lVar.L())) {
            return null;
        }
        h.a aVarH = this.f31804d.h(this.f31803c, lVar);
        if (aVarH != null) {
            if (aVarH == h.a.DISABLED) {
                return null;
            }
            return c.a(lVar, aVarH);
        }
        String strD = lVar.d();
        if ("valueOf".equals(strD) && lVar.x() == 1) {
            return c.a(lVar, aVarH);
        }
        if ("fromString".equals(strD) && lVar.x() == 1 && ((clsA = lVar.A(0)) == String.class || CharSequence.class.isAssignableFrom(clsA))) {
            return c.a(lVar, aVarH);
        }
        return null;
    }

    public u I(p6.y yVar) {
        for (u uVar : F()) {
            if (uVar.G(yVar)) {
                return uVar;
            }
        }
        return null;
    }

    public boolean M(p6.y yVar) {
        return I(yVar) != null;
    }

    protected boolean N(l lVar) {
        Class clsA;
        if (!q().isAssignableFrom(lVar.L())) {
            return false;
        }
        h.a aVarH = this.f31804d.h(this.f31803c, lVar);
        if (aVarH != null && aVarH != h.a.DISABLED) {
            return true;
        }
        String strD = lVar.d();
        if ("valueOf".equals(strD) && lVar.x() == 1) {
            return true;
        }
        return "fromString".equals(strD) && lVar.x() == 1 && ((clsA = lVar.A(0)) == String.class || CharSequence.class.isAssignableFrom(clsA));
    }

    public boolean O(String str) {
        Iterator it = F().iterator();
        while (it.hasNext()) {
            if (((u) it.next()).getName().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // p6.c
    public k a() {
        f0 f0Var = this.f31802b;
        if (f0Var == null) {
            return null;
        }
        k kVarZ = f0Var.z();
        if (kVarZ != null) {
            if (Map.class.isAssignableFrom(kVarZ.e())) {
                return kVarZ;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on method %s(): return type is not instance of java.util.Map", kVarZ.d()));
        }
        k kVarY = this.f31802b.y();
        if (kVarY == null) {
            return null;
        }
        if (Map.class.isAssignableFrom(kVarY.e())) {
            return kVarY;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on field '%s': type is not instance of java.util.Map", kVarY.d()));
    }

    @Override // p6.c
    public k b() {
        f0 f0Var = this.f31802b;
        if (f0Var == null) {
            return null;
        }
        l lVarB = f0Var.B();
        if (lVarB != null) {
            Class clsA = lVarB.A(0);
            if (clsA == String.class || clsA == Object.class) {
                return lVarB;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s", lVarB.d(), clsA.getName()));
        }
        k kVarA = this.f31802b.A();
        if (kVarA == null) {
            return null;
        }
        Class clsE = kVarA.e();
        if (Map.class.isAssignableFrom(clsE) || p6.n.class.isAssignableFrom(clsE)) {
            return kVarA;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on field '%s': type is not instance of `java.util.Map` or `JsonNode`", kVarA.d()));
    }

    @Override // p6.c
    public List c() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (u uVar : F()) {
            b.a aVarM = uVar.m();
            if (aVarM != null && aVarM.c()) {
                String strB = aVarM.b();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(strB);
                } else if (!hashSet.add(strB)) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name " + i7.h.V(strB));
                }
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    @Override // p6.c
    public f d() {
        return this.f31805e.r();
    }

    @Override // p6.c
    public Class[] e() {
        if (!this.f31807g) {
            this.f31807g = true;
            p6.b bVar = this.f31804d;
            Class[] clsArrS0 = bVar == null ? null : bVar.s0(this.f31805e);
            if (clsArrS0 == null && !this.f31803c.L(p6.r.DEFAULT_VIEW_INCLUSION)) {
                clsArrS0 = f31801j;
            }
            this.f31806f = clsArrS0;
        }
        return this.f31806f;
    }

    @Override // p6.c
    public i7.j f() {
        p6.b bVar = this.f31804d;
        if (bVar == null) {
            return null;
        }
        return E(bVar.l(this.f31805e));
    }

    @Override // p6.c
    public k.d g(k.d dVar) {
        k.d dVarS;
        p6.b bVar = this.f31804d;
        if (bVar != null && (dVarS = bVar.s(this.f31805e)) != null) {
            dVar = dVar == null ? dVarS : dVar.s(dVarS);
        }
        k.d dVarP = this.f31803c.p(this.f31805e.e());
        return dVarP != null ? dVar == null ? dVarP : dVar.s(dVarP) : dVar;
    }

    @Override // p6.c
    public Map h() {
        f0 f0Var = this.f31802b;
        return f0Var != null ? f0Var.F() : Collections.EMPTY_MAP;
    }

    @Override // p6.c
    public k i() {
        f0 f0Var = this.f31802b;
        if (f0Var == null) {
            return null;
        }
        return f0Var.G();
    }

    @Override // p6.c
    public k j() {
        f0 f0Var = this.f31802b;
        if (f0Var == null) {
            return null;
        }
        return f0Var.H();
    }

    @Override // p6.c
    public l k(String str, Class[] clsArr) {
        return this.f31805e.n(str, clsArr);
    }

    @Override // p6.c
    public Class l() {
        p6.b bVar = this.f31804d;
        if (bVar == null) {
            return null;
        }
        return bVar.N(this.f31805e);
    }

    @Override // p6.c
    public f.a m() {
        p6.b bVar = this.f31804d;
        if (bVar == null) {
            return null;
        }
        return bVar.O(this.f31805e);
    }

    @Override // p6.c
    public List n() {
        return F();
    }

    @Override // p6.c
    public r.b o(r.b bVar) {
        r.b bVarZ;
        p6.b bVar2 = this.f31804d;
        return (bVar2 == null || (bVarZ = bVar2.Z(this.f31805e)) == null) ? bVar : bVar == null ? bVarZ : bVar.n(bVarZ);
    }

    @Override // p6.c
    public i7.j p() {
        p6.b bVar = this.f31804d;
        if (bVar == null) {
            return null;
        }
        return E(bVar.h0(this.f31805e));
    }

    @Override // p6.c
    public i7.b r() {
        return this.f31805e.p();
    }

    @Override // p6.c
    public d s() {
        return this.f31805e;
    }

    @Override // p6.c
    public List t() {
        return this.f31805e.q();
    }

    @Override // p6.c
    public List u() {
        List<f> listQ = this.f31805e.q();
        if (listQ.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (f fVar : listQ) {
            h.a aVarH = this.f31804d.h(this.f31803c, fVar);
            if (aVarH != h.a.DISABLED) {
                arrayList.add(c.a(fVar, aVarH));
            }
        }
        return arrayList;
    }

    @Override // p6.c
    public List v() {
        List<l> listS = this.f31805e.s();
        if (listS.isEmpty()) {
            return listS;
        }
        ArrayList arrayList = null;
        for (l lVar : listS) {
            if (N(lVar)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar);
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    @Override // p6.c
    public List w() {
        List listS = this.f31805e.s();
        if (listS.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        Iterator it = listS.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            c cVarH = H((l) it.next());
            if (cVarH != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cVarH);
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    @Override // p6.c
    public Set x() {
        f0 f0Var = this.f31802b;
        Set setE = f0Var == null ? null : f0Var.E();
        return setE == null ? Collections.EMPTY_SET : setE;
    }

    @Override // p6.c
    public e0 y() {
        return this.f31809i;
    }

    protected s(r6.q qVar, JavaType javaType, d dVar, List list) {
        super(javaType);
        this.f31802b = null;
        this.f31803c = qVar;
        if (qVar == null) {
            this.f31804d = null;
        } else {
            this.f31804d = qVar.g();
        }
        this.f31805e = dVar;
        this.f31808h = list;
    }

    protected s(f0 f0Var) {
        this(f0Var, f0Var.L(), f0Var.C());
        this.f31809i = f0Var.I();
    }
}
