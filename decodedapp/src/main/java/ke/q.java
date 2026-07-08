package ke;

import eg.u1;
import he.g1;
import he.q1;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import xf.k;

/* JADX INFO: loaded from: classes3.dex */
public class q extends j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final u1 f19738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final xf.k f19739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final dg.i f19740t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ie.h f19741u;

    private class a extends xf.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final dg.g f19742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final dg.g f19743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final dg.i f19744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q f19745e;

        /* JADX INFO: renamed from: ke.q$a$a, reason: collision with other inner class name */
        class C0259a implements qd.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f19746a;

            C0259a(q qVar) {
                this.f19746a = qVar;
            }

            @Override // qd.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection l(mf.f fVar) {
                return a.this.m(fVar);
            }
        }

        class b implements qd.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f19748a;

            b(q qVar) {
                this.f19748a = qVar;
            }

            @Override // qd.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection l(mf.f fVar) {
                return a.this.n(fVar);
            }
        }

        class c implements qd.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f19750a;

            c(q qVar) {
                this.f19750a = qVar;
            }

            @Override // qd.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection a() {
                return a.this.l();
            }
        }

        class d extends qf.m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f19752a;

            d(Set set) {
                this.f19752a = set;
            }

            private static /* synthetic */ void f(int i10) {
                Object[] objArr = new Object[3];
                if (i10 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i10 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i10 == 1 || i10 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // qf.n
            public void a(he.b bVar) {
                if (bVar == null) {
                    f(0);
                }
                qf.o.K(bVar, null);
                this.f19752a.add(bVar);
            }

            @Override // qf.m
            protected void e(he.b bVar, he.b bVar2) {
                if (bVar == null) {
                    f(1);
                }
                if (bVar2 == null) {
                    f(2);
                }
            }
        }

        public a(q qVar, dg.n nVar) {
            if (nVar == null) {
                h(0);
            }
            this.f19745e = qVar;
            this.f19742b = nVar.f(new C0259a(qVar));
            this.f19743c = nVar.f(new b(qVar));
            this.f19744d = nVar.d(new c(qVar));
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void h(int r13) {
            /*
                Method dump skipped, instruction units count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ke.q.a.h(int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection l() {
            HashSet hashSet = new HashSet();
            for (mf.f fVar : (Set) this.f19745e.f19740t.a()) {
                pe.d dVar = pe.d.f24128y;
                hashSet.addAll(a(fVar, dVar));
                hashSet.addAll(c(fVar, dVar));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection m(mf.f fVar) {
            if (fVar == null) {
                h(8);
            }
            return p(fVar, o().a(fVar, pe.d.f24128y));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection n(mf.f fVar) {
            if (fVar == null) {
                h(4);
            }
            return p(fVar, o().c(fVar, pe.d.f24128y));
        }

        private xf.k o() {
            xf.k kVarP = ((eg.r0) this.f19745e.k().e().iterator().next()).p();
            if (kVarP == null) {
                h(9);
            }
            return kVarP;
        }

        private Collection p(mf.f fVar, Collection collection) {
            if (fVar == null) {
                h(10);
            }
            if (collection == null) {
                h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            qf.o.f25143f.v(fVar, collection, Collections.EMPTY_SET, this.f19745e, new d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // xf.l, xf.k
        public Collection a(mf.f fVar, pe.b bVar) {
            if (fVar == null) {
                h(5);
            }
            if (bVar == null) {
                h(6);
            }
            Collection collection = (Collection) this.f19742b.l(fVar);
            if (collection == null) {
                h(7);
            }
            return collection;
        }

        @Override // xf.l, xf.k
        public Set b() {
            Set set = (Set) this.f19745e.f19740t.a();
            if (set == null) {
                h(17);
            }
            return set;
        }

        @Override // xf.l, xf.k
        public Collection c(mf.f fVar, pe.b bVar) {
            if (fVar == null) {
                h(1);
            }
            if (bVar == null) {
                h(2);
            }
            Collection collection = (Collection) this.f19743c.l(fVar);
            if (collection == null) {
                h(3);
            }
            return collection;
        }

        @Override // xf.l, xf.k
        public Set d() {
            Set set = (Set) this.f19745e.f19740t.a();
            if (set == null) {
                h(19);
            }
            return set;
        }

        @Override // xf.l, xf.n
        public Collection e(xf.d dVar, qd.l lVar) {
            if (dVar == null) {
                h(13);
            }
            if (lVar == null) {
                h(14);
            }
            Collection collection = (Collection) this.f19744d.a();
            if (collection == null) {
                h(15);
            }
            return collection;
        }

        @Override // xf.l, xf.k
        public Set f() {
            Set set = Collections.EMPTY_SET;
            if (set == null) {
                h(18);
            }
            return set;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private q(dg.n nVar, he.e eVar, eg.r0 r0Var, mf.f fVar, dg.i iVar, ie.h hVar, g1 g1Var) {
        super(nVar, eVar, fVar, g1Var, false);
        if (nVar == null) {
            B0(6);
        }
        if (eVar == null) {
            B0(7);
        }
        if (r0Var == null) {
            B0(8);
        }
        if (fVar == null) {
            B0(9);
        }
        if (iVar == null) {
            B0(10);
        }
        if (hVar == null) {
            B0(11);
        }
        if (g1Var == null) {
            B0(12);
        }
        this.f19741u = hVar;
        this.f19738r = new eg.u(this, Collections.EMPTY_LIST, Collections.singleton(r0Var), nVar);
        this.f19739s = new a(this, nVar);
        this.f19740t = iVar;
    }

    private static /* synthetic */ void B0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static q L0(dg.n nVar, he.e eVar, mf.f fVar, dg.i iVar, ie.h hVar, g1 g1Var) {
        if (nVar == null) {
            B0(0);
        }
        if (eVar == null) {
            B0(1);
        }
        if (fVar == null) {
            B0(2);
        }
        if (iVar == null) {
            B0(3);
        }
        if (hVar == null) {
            B0(4);
        }
        if (g1Var == null) {
            B0(5);
        }
        return new q(nVar, eVar, eVar.s(), fVar, iVar, hVar, g1Var);
    }

    @Override // he.e
    public boolean B() {
        return false;
    }

    @Override // he.d0
    public boolean F0() {
        return false;
    }

    @Override // he.e
    public boolean G() {
        return false;
    }

    @Override // he.d0
    public boolean M() {
        return false;
    }

    @Override // he.i
    public boolean N() {
        return false;
    }

    @Override // he.e
    public he.d T() {
        return null;
    }

    @Override // he.e
    public xf.k U() {
        k.b bVar = k.b.f32079b;
        if (bVar == null) {
            B0(15);
        }
        return bVar;
    }

    @Override // he.e
    public he.e W() {
        return null;
    }

    @Override // ke.z
    public xf.k f0(fg.g gVar) {
        if (gVar == null) {
            B0(13);
        }
        xf.k kVar = this.f19739s;
        if (kVar == null) {
            B0(14);
        }
        return kVar;
    }

    @Override // ie.a
    public ie.h getAnnotations() {
        ie.h hVar = this.f19741u;
        if (hVar == null) {
            B0(21);
        }
        return hVar;
    }

    @Override // he.e
    public Collection getConstructors() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            B0(16);
        }
        return list;
    }

    @Override // he.e, he.d0, he.q
    public he.u getVisibility() {
        he.u uVar = he.t.f15309e;
        if (uVar == null) {
            B0(20);
        }
        return uVar;
    }

    @Override // he.e
    public boolean isData() {
        return false;
    }

    @Override // he.e
    public boolean isInline() {
        return false;
    }

    @Override // he.e
    public he.f j() {
        he.f fVar = he.f.f15274e;
        if (fVar == null) {
            B0(18);
        }
        return fVar;
    }

    @Override // he.h
    public u1 k() {
        u1 u1Var = this.f19738r;
        if (u1Var == null) {
            B0(17);
        }
        return u1Var;
    }

    @Override // he.e, he.d0
    public he.e0 l() {
        he.e0 e0Var = he.e0.f15259b;
        if (e0Var == null) {
            B0(19);
        }
        return e0Var;
    }

    @Override // he.e
    public boolean m() {
        return false;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // he.e, he.i
    public List v() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            B0(22);
        }
        return list;
    }

    @Override // he.e
    public q1 z0() {
        return null;
    }
}
