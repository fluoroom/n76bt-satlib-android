package ef;

import ef.x;
import eg.r0;
import he.g1;
import he.m0;
import he.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final he.h0 f11969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m0 f11970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ag.g f11971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private jf.c f11972g;

    private abstract class a implements x.a {

        /* JADX INFO: renamed from: ef.h$a$a, reason: collision with other inner class name */
        public static final class C0161a implements x.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ x.a f11974a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x.a f11975b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f11976c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ mf.f f11977d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ArrayList f11978e;

            C0161a(x.a aVar, a aVar2, mf.f fVar, ArrayList arrayList) {
                this.f11975b = aVar;
                this.f11976c = aVar2;
                this.f11977d = fVar;
                this.f11978e = arrayList;
                this.f11974a = aVar;
            }

            @Override // ef.x.a
            public void a() {
                this.f11975b.a();
                this.f11976c.h(this.f11977d, new sf.a((ie.c) ed.q.w0(this.f11978e)));
            }

            @Override // ef.x.a
            public x.b b(mf.f fVar) {
                return this.f11974a.b(fVar);
            }

            @Override // ef.x.a
            public void c(mf.f fVar, Object obj) {
                this.f11974a.c(fVar, obj);
            }

            @Override // ef.x.a
            public void d(mf.f fVar, mf.b bVar, mf.f fVar2) {
                rd.m.e(bVar, "enumClassId");
                rd.m.e(fVar2, "enumEntryName");
                this.f11974a.d(fVar, bVar, fVar2);
            }

            @Override // ef.x.a
            public x.a e(mf.f fVar, mf.b bVar) {
                rd.m.e(bVar, "classId");
                return this.f11974a.e(fVar, bVar);
            }

            @Override // ef.x.a
            public void f(mf.f fVar, sf.f fVar2) {
                rd.m.e(fVar2, "value");
                this.f11974a.f(fVar, fVar2);
            }
        }

        public static final class b implements x.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ArrayList f11979a = new ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11980b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ mf.f f11981c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f11982d;

            /* JADX INFO: renamed from: ef.h$a$b$a, reason: collision with other inner class name */
            public static final class C0162a implements x.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final /* synthetic */ x.a f11983a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ x.a f11984b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ b f11985c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ArrayList f11986d;

                C0162a(x.a aVar, b bVar, ArrayList arrayList) {
                    this.f11984b = aVar;
                    this.f11985c = bVar;
                    this.f11986d = arrayList;
                    this.f11983a = aVar;
                }

                @Override // ef.x.a
                public void a() {
                    this.f11984b.a();
                    this.f11985c.f11979a.add(new sf.a((ie.c) ed.q.w0(this.f11986d)));
                }

                @Override // ef.x.a
                public x.b b(mf.f fVar) {
                    return this.f11983a.b(fVar);
                }

                @Override // ef.x.a
                public void c(mf.f fVar, Object obj) {
                    this.f11983a.c(fVar, obj);
                }

                @Override // ef.x.a
                public void d(mf.f fVar, mf.b bVar, mf.f fVar2) {
                    rd.m.e(bVar, "enumClassId");
                    rd.m.e(fVar2, "enumEntryName");
                    this.f11983a.d(fVar, bVar, fVar2);
                }

                @Override // ef.x.a
                public x.a e(mf.f fVar, mf.b bVar) {
                    rd.m.e(bVar, "classId");
                    return this.f11983a.e(fVar, bVar);
                }

                @Override // ef.x.a
                public void f(mf.f fVar, sf.f fVar2) {
                    rd.m.e(fVar2, "value");
                    this.f11983a.f(fVar, fVar2);
                }
            }

            b(h hVar, mf.f fVar, a aVar) {
                this.f11980b = hVar;
                this.f11981c = fVar;
                this.f11982d = aVar;
            }

            @Override // ef.x.b
            public void a() {
                this.f11982d.g(this.f11981c, this.f11979a);
            }

            @Override // ef.x.b
            public x.a b(mf.b bVar) {
                rd.m.e(bVar, "classId");
                ArrayList arrayList = new ArrayList();
                h hVar = this.f11980b;
                g1 g1Var = g1.f15281a;
                rd.m.d(g1Var, "NO_SOURCE");
                x.a aVarX = hVar.x(bVar, g1Var, arrayList);
                rd.m.b(aVarX);
                return new C0162a(aVarX, this, arrayList);
            }

            @Override // ef.x.b
            public void c(Object obj) {
                this.f11979a.add(this.f11980b.O(this.f11981c, obj));
            }

            @Override // ef.x.b
            public void d(mf.b bVar, mf.f fVar) {
                rd.m.e(bVar, "enumClassId");
                rd.m.e(fVar, "enumEntryName");
                this.f11979a.add(new sf.k(bVar, fVar));
            }

            @Override // ef.x.b
            public void e(sf.f fVar) {
                rd.m.e(fVar, "value");
                this.f11979a.add(new sf.s(fVar));
            }
        }

        public a() {
        }

        @Override // ef.x.a
        public x.b b(mf.f fVar) {
            return new b(h.this, fVar, this);
        }

        @Override // ef.x.a
        public void c(mf.f fVar, Object obj) {
            h(fVar, h.this.O(fVar, obj));
        }

        @Override // ef.x.a
        public void d(mf.f fVar, mf.b bVar, mf.f fVar2) {
            rd.m.e(bVar, "enumClassId");
            rd.m.e(fVar2, "enumEntryName");
            h(fVar, new sf.k(bVar, fVar2));
        }

        @Override // ef.x.a
        public x.a e(mf.f fVar, mf.b bVar) {
            rd.m.e(bVar, "classId");
            ArrayList arrayList = new ArrayList();
            h hVar = h.this;
            g1 g1Var = g1.f15281a;
            rd.m.d(g1Var, "NO_SOURCE");
            x.a aVarX = hVar.x(bVar, g1Var, arrayList);
            rd.m.b(aVarX);
            return new C0161a(aVarX, this, fVar, arrayList);
        }

        @Override // ef.x.a
        public void f(mf.f fVar, sf.f fVar2) {
            rd.m.e(fVar2, "value");
            h(fVar, new sf.s(fVar2));
        }

        public abstract void g(mf.f fVar, ArrayList arrayList);

        public abstract void h(mf.f fVar, sf.g gVar);
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f11987b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ he.e f11989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ mf.b f11990e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f11991f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g1 f11992g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(he.e eVar, mf.b bVar, List list, g1 g1Var) {
            super();
            this.f11989d = eVar;
            this.f11990e = bVar;
            this.f11991f = list;
            this.f11992g = g1Var;
            this.f11987b = new HashMap();
        }

        @Override // ef.x.a
        public void a() {
            if (h.this.F(this.f11990e, this.f11987b) || h.this.w(this.f11990e)) {
                return;
            }
            this.f11991f.add(new ie.d(this.f11989d.s(), this.f11987b, this.f11992g));
        }

        @Override // ef.h.a
        public void g(mf.f fVar, ArrayList arrayList) {
            rd.m.e(arrayList, "elements");
            if (fVar == null) {
                return;
            }
            s1 s1VarB = we.a.b(fVar, this.f11989d);
            if (s1VarB != null) {
                HashMap map = this.f11987b;
                sf.i iVar = sf.i.f27335a;
                List listC = og.a.c(arrayList);
                r0 type = s1VarB.getType();
                rd.m.d(type, "getType(...)");
                map.put(fVar, iVar.b(listC, type));
                return;
            }
            if (h.this.w(this.f11990e) && rd.m.a(fVar.d(), "value")) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof sf.a) {
                        arrayList2.add(obj);
                    }
                }
                List list = this.f11991f;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    list.add((ie.c) ((sf.a) it.next()).b());
                }
            }
        }

        @Override // ef.h.a
        public void h(mf.f fVar, sf.g gVar) {
            rd.m.e(gVar, "value");
            if (fVar != null) {
                this.f11987b.put(fVar, gVar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(he.h0 h0Var, m0 m0Var, dg.n nVar, v vVar) {
        super(nVar, vVar);
        rd.m.e(h0Var, "module");
        rd.m.e(m0Var, "notFoundClasses");
        rd.m.e(nVar, "storageManager");
        rd.m.e(vVar, "kotlinClassFinder");
        this.f11969d = h0Var;
        this.f11970e = m0Var;
        this.f11971f = new ag.g(h0Var, m0Var);
        this.f11972g = jf.c.f18690i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sf.g O(mf.f fVar, Object obj) {
        sf.g gVarE = sf.i.f27335a.e(obj, this.f11969d);
        if (gVarE != null) {
            return gVarE;
        }
        return sf.l.f27338b.a("Unsupported annotation argument: " + fVar);
    }

    private final he.e R(mf.b bVar) {
        return he.y.d(this.f11969d, bVar, this.f11970e);
    }

    @Override // ef.e, ag.h
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public ie.c d(gf.b bVar, jf.d dVar) {
        rd.m.e(bVar, "proto");
        rd.m.e(dVar, "nameResolver");
        return this.f11971f.a(bVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ef.d
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public sf.g I(String str, Object obj) {
        rd.m.e(str, "desc");
        rd.m.e(obj, "initializer");
        if (rg.q.P("ZBCS", str, false, 2, null)) {
            int iIntValue = ((Integer) obj).intValue();
            int iHashCode = str.hashCode();
            if (iHashCode == 66) {
                if (str.equals("B")) {
                    obj = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 67) {
                if (str.equals("C")) {
                    obj = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 83) {
                if (str.equals("S")) {
                    obj = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 90 && str.equals("Z")) {
                obj = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(str);
        }
        return sf.i.f27335a.e(obj, this.f11969d);
    }

    public void S(jf.c cVar) {
        rd.m.e(cVar, "<set-?>");
        this.f11972g = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ef.d
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public sf.g M(sf.g gVar) {
        rd.m.e(gVar, "constant");
        return gVar instanceof sf.d ? new sf.a0(((Number) ((sf.d) gVar).b()).byteValue()) : gVar instanceof sf.w ? new sf.d0(((Number) ((sf.w) gVar).b()).shortValue()) : gVar instanceof sf.n ? new sf.b0(((Number) ((sf.n) gVar).b()).intValue()) : gVar instanceof sf.t ? new sf.c0(((Number) ((sf.t) gVar).b()).longValue()) : gVar;
    }

    @Override // ef.e
    public jf.c v() {
        return this.f11972g;
    }

    @Override // ef.e
    protected x.a x(mf.b bVar, g1 g1Var, List list) {
        rd.m.e(bVar, "annotationClassId");
        rd.m.e(g1Var, "source");
        rd.m.e(list, "result");
        return new b(R(bVar), bVar, list, g1Var);
    }
}
