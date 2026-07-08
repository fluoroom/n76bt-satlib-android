package of;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import of.a;
import of.h;
import of.j;
import of.p;
import of.y;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends of.a implements Serializable {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23458a;

        static {
            int[] iArr = new int[y.c.values().length];
            f23458a = iArr;
            try {
                iArr[y.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23458a[y.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b extends a.AbstractC0317a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private of.d f23459a = of.d.f23423a;

        protected b() {
        }

        public final of.d d() {
            return this.f23459a;
        }

        public abstract b f(i iVar);

        public final b g(of.d dVar) {
            this.f23459a = dVar;
            return this;
        }
    }

    public static abstract class c extends b implements q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h f23460b = h.g();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f23461c;

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public h i() {
            this.f23460b.q();
            this.f23461c = false;
            return this.f23460b;
        }

        private void j() {
            if (this.f23461c) {
                return;
            }
            this.f23460b = this.f23460b.clone();
            this.f23461c = true;
        }

        protected final void k(d dVar) {
            j();
            this.f23460b.r(dVar.f23462b);
        }
    }

    static final class e implements h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j.b f23467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f23468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final y.b f23469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f23470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f23471e;

        e(j.b bVar, int i10, y.b bVar2, boolean z10, boolean z11) {
            this.f23467a = bVar;
            this.f23468b = i10;
            this.f23469c = bVar2;
            this.f23470d = z10;
            this.f23471e = z11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f23468b - eVar.f23468b;
        }

        @Override // of.h.b
        public boolean b() {
            return this.f23470d;
        }

        @Override // of.h.b
        public y.b c() {
            return this.f23469c;
        }

        public j.b d() {
            return this.f23467a;
        }

        @Override // of.h.b
        public int getNumber() {
            return this.f23468b;
        }

        @Override // of.h.b
        public y.c o() {
            return this.f23469c.a();
        }

        @Override // of.h.b
        public boolean p() {
            return this.f23471e;
        }

        @Override // of.h.b
        public p.a z(p.a aVar, p pVar) {
            return ((b) aVar).f((i) pVar);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final p f23472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f23473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final p f23474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final e f23475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Class f23476e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Method f23477f;

        f(p pVar, Object obj, p pVar2, e eVar, Class cls) {
            if (pVar == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.c() == y.b.f23539v && pVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f23472a = pVar;
            this.f23473b = obj;
            this.f23474c = pVar2;
            this.f23475d = eVar;
            this.f23476e = cls;
            if (j.a.class.isAssignableFrom(cls)) {
                this.f23477f = i.e(cls, "valueOf", Integer.TYPE);
            } else {
                this.f23477f = null;
            }
        }

        Object a(Object obj) {
            if (!this.f23475d.b()) {
                return e(obj);
            }
            if (this.f23475d.o() != y.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public p b() {
            return this.f23472a;
        }

        public p c() {
            return this.f23474c;
        }

        public int d() {
            return this.f23475d.getNumber();
        }

        Object e(Object obj) {
            return this.f23475d.o() == y.c.ENUM ? i.f(this.f23477f, null, (Integer) obj) : obj;
        }

        Object f(Object obj) {
            return this.f23475d.o() == y.c.ENUM ? Integer.valueOf(((j.a) obj).getNumber()) : obj;
        }
    }

    protected i() {
    }

    static Method e(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(strValueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    static Object f(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static f h(p pVar, p pVar2, j.b bVar, int i10, y.b bVar2, boolean z10, Class cls) {
        return new f(pVar, Collections.EMPTY_LIST, pVar2, new e(bVar, i10, bVar2, true, z10), cls);
    }

    public static f i(p pVar, Object obj, p pVar2, j.b bVar, int i10, y.b bVar2, Class cls) {
        return new f(pVar, obj, pVar2, new e(bVar, i10, bVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(h hVar, p pVar, of.e eVar, of.f fVar, g gVar, int i10) throws k {
        boolean z10;
        boolean z11;
        Object objBuild;
        p pVar2;
        int iB = y.b(i10);
        f fVarB = gVar.b(pVar, y.a(i10));
        if (fVarB == null) {
            z10 = true;
            z11 = false;
        } else if (iB == h.l(fVarB.f23475d.c(), false)) {
            z10 = false;
            z11 = false;
        } else {
            e eVar2 = fVarB.f23475d;
            if (eVar2.f23470d && eVar2.f23469c.e() && iB == h.l(fVarB.f23475d.c(), true)) {
                z10 = false;
                z11 = true;
            }
            z10 = true;
            z11 = false;
        }
        if (z10) {
            return eVar.O(i10, fVar);
        }
        if (z11) {
            int i11 = eVar.i(eVar.z());
            if (fVarB.f23475d.c() == y.b.f23542y) {
                while (eVar.e() > 0) {
                    j.a aVarA = fVarB.f23475d.d().a(eVar.m());
                    if (aVarA == null) {
                        return true;
                    }
                    hVar.a(fVarB.f23475d, fVarB.f(aVarA));
                }
            } else {
                while (eVar.e() > 0) {
                    hVar.a(fVarB.f23475d, h.u(eVar, fVarB.f23475d.c(), false));
                }
            }
            eVar.h(i11);
        } else {
            int i12 = a.f23458a[fVarB.f23475d.o().ordinal()];
            if (i12 == 1) {
                p.a builder = (fVarB.f23475d.b() || (pVar2 = (p) hVar.h(fVarB.f23475d)) == null) ? null : pVar2.toBuilder();
                if (builder == null) {
                    builder = fVarB.c().newBuilderForType();
                }
                if (fVarB.f23475d.c() == y.b.f23538u) {
                    eVar.q(fVarB.d(), builder, gVar);
                } else {
                    eVar.u(builder, gVar);
                }
                objBuild = builder.build();
            } else if (i12 != 2) {
                objBuild = h.u(eVar, fVarB.f23475d.c(), false);
            } else {
                int iM = eVar.m();
                j.a aVarA2 = fVarB.f23475d.d().a(iM);
                if (aVarA2 == null) {
                    fVar.n0(i10);
                    fVar.x0(iM);
                    return true;
                }
                objBuild = aVarA2;
            }
            if (fVarB.f23475d.b()) {
                hVar.a(fVarB.f23475d, fVarB.f(objBuild));
            } else {
                hVar.v(fVarB.f23475d, fVarB.f(objBuild));
            }
        }
        return true;
    }

    protected boolean j(of.e eVar, of.f fVar, g gVar, int i10) {
        return eVar.O(i10, fVar);
    }

    public static abstract class d extends i implements q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f23462b;

        protected class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator f23463a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Map.Entry f23464b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f23465c;

            /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, of.f fVar) {
                while (true) {
                    Map.Entry entry = this.f23464b;
                    if (entry == null || ((e) entry.getKey()).getNumber() >= i10) {
                        return;
                    }
                    e eVar = (e) this.f23464b.getKey();
                    if (this.f23465c && eVar.o() == y.c.MESSAGE && !eVar.b()) {
                        fVar.e0(eVar.getNumber(), (p) this.f23464b.getValue());
                    } else {
                        h.z(eVar, this.f23464b.getValue(), fVar);
                    }
                    if (this.f23463a.hasNext()) {
                        this.f23464b = (Map.Entry) this.f23463a.next();
                    } else {
                        this.f23464b = null;
                    }
                }
            }

            private a(boolean z10) {
                Iterator itP = d.this.f23462b.p();
                this.f23463a = itP;
                if (itP.hasNext()) {
                    this.f23464b = (Map.Entry) itP.next();
                }
                this.f23465c = z10;
            }
        }

        protected d() {
            this.f23462b = h.t();
        }

        private void v(f fVar) {
            if (fVar.b() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // of.i
        protected void g() {
            this.f23462b.q();
        }

        @Override // of.i
        protected boolean j(of.e eVar, of.f fVar, g gVar, int i10) {
            return i.k(this.f23462b, getDefaultInstanceForType(), eVar, fVar, gVar, i10);
        }

        protected boolean n() {
            return this.f23462b.n();
        }

        protected int o() {
            return this.f23462b.k();
        }

        public final Object p(f fVar) {
            v(fVar);
            Object objH = this.f23462b.h(fVar.f23475d);
            return objH == null ? fVar.f23473b : fVar.a(objH);
        }

        public final Object q(f fVar, int i10) {
            v(fVar);
            return fVar.e(this.f23462b.i(fVar.f23475d, i10));
        }

        public final int r(f fVar) {
            v(fVar);
            return this.f23462b.j(fVar.f23475d);
        }

        public final boolean s(f fVar) {
            v(fVar);
            return this.f23462b.m(fVar.f23475d);
        }

        protected a t() {
            return new a(this, false, null);
        }

        protected d(c cVar) {
            this.f23462b = cVar.i();
        }
    }

    protected i(b bVar) {
    }

    protected void g() {
    }
}
