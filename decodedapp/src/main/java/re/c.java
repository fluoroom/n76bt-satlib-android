package re;

import java.util.ArrayList;
import java.util.Iterator;
import jf.b;
import qe.f0;
import qe.g0;
import qe.h0;
import qe.j;
import qe.s;
import qe.t;
import qe.u;
import qe.v;
import qe.w;
import qe.z;
import rd.m;
import rd.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final re.a a(re.d dVar) {
        m.e(dVar, "flag");
        return new re.a(new q() { // from class: re.c.a
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((qe.g) obj).i());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((qe.g) obj).r(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final re.a b(re.d dVar) {
        m.e(dVar, "flag");
        return new re.a(new q() { // from class: re.c.b
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((j) obj).c());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((j) obj).f(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final re.a c(re.d dVar) {
        m.e(dVar, "flag");
        return new re.a(new q() { // from class: re.c.c
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((s) obj).e());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((s) obj).j(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final re.b d(yd.h hVar) {
        m.e(hVar, "flags");
        b.d dVar = jf.b.f18675p;
        m.d(dVar, "MEMBER_KIND");
        kd.a aVarD = f0.d();
        kd.a aVarD2 = f0.d();
        ArrayList arrayList = new ArrayList(ed.q.v(aVarD2, 10));
        Iterator<E> it = aVarD2.iterator();
        while (it.hasNext()) {
            arrayList.add(((f0) it.next()).e());
        }
        return new re.b(hVar, dVar, aVarD, arrayList);
    }

    public static final re.b e(yd.h hVar) {
        m.e(hVar, "flags");
        b.d dVar = jf.b.f18664e;
        m.d(dVar, "MODALITY");
        kd.a aVarD = g0.d();
        kd.a aVarD2 = g0.d();
        ArrayList arrayList = new ArrayList(ed.q.v(aVarD2, 10));
        Iterator<E> it = aVarD2.iterator();
        while (it.hasNext()) {
            arrayList.add(((g0) it.next()).e());
        }
        return new re.b(hVar, dVar, aVarD, arrayList);
    }

    public static final re.a f(re.d dVar) {
        m.e(dVar, "flag");
        return new re.a(new q() { // from class: re.c.d
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((u) obj).b());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((u) obj).c(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final re.a g(re.d dVar) {
        m.e(dVar, "flag");
        return new re.a(new q() { // from class: re.c.e
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((t) obj).g());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((t) obj).m(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final re.a h(re.d dVar) {
        m.e(dVar, "flag");
        return new re.a(new q() { // from class: re.c.f
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((w) obj).b());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((w) obj).f(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final re.a i(re.d dVar) {
        m.e(dVar, "flag");
        return new re.a(new q() { // from class: re.c.g
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((v) obj).d());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((v) obj).g(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final re.a j(re.d dVar) {
        m.e(dVar, "flag");
        return new re.a(new q() { // from class: re.c.h
            @Override // rd.q, yd.l
            public Object get(Object obj) {
                return Integer.valueOf(((z) obj).b());
            }

            @Override // rd.q, yd.h
            public void set(Object obj, Object obj2) {
                ((z) obj).d(((Number) obj2).intValue());
            }
        }, dVar);
    }

    public static final re.b k(yd.h hVar) {
        m.e(hVar, "flags");
        b.d dVar = jf.b.f18663d;
        m.d(dVar, "VISIBILITY");
        kd.a aVarD = h0.d();
        kd.a aVarD2 = h0.d();
        ArrayList arrayList = new ArrayList(ed.q.v(aVarD2, 10));
        Iterator<E> it = aVarD2.iterator();
        while (it.hasNext()) {
            arrayList.add(((h0) it.next()).e());
        }
        return new re.b(hVar, dVar, aVarD, arrayList);
    }
}
