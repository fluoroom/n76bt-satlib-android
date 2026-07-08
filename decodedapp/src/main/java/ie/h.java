package ie;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface h extends Iterable, sd.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f16054l = a.f16055a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f16055a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final h f16056b = new C0221a();

        /* JADX INFO: renamed from: ie.h$a$a, reason: collision with other inner class name */
        public static final class C0221a implements h {
            C0221a() {
            }

            @Override // ie.h
            public boolean H(mf.c cVar) {
                return b.b(this, cVar);
            }

            @Override // ie.h
            public /* bridge */ /* synthetic */ c a(mf.c cVar) {
                return (c) b(cVar);
            }

            public Void b(mf.c cVar) {
                rd.m.e(cVar, "fqName");
                return null;
            }

            @Override // ie.h
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return ed.q.k().iterator();
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private a() {
        }

        public final h a(List list) {
            rd.m.e(list, "annotations");
            return list.isEmpty() ? f16056b : new i(list);
        }

        public final h b() {
            return f16056b;
        }
    }

    public static final class b {
        public static c a(h hVar, mf.c cVar) {
            Object next;
            rd.m.e(cVar, "fqName");
            Iterator it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (rd.m.a(((c) next).d(), cVar)) {
                    break;
                }
            }
            return (c) next;
        }

        public static boolean b(h hVar, mf.c cVar) {
            rd.m.e(cVar, "fqName");
            return hVar.a(cVar) != null;
        }
    }

    boolean H(mf.c cVar);

    c a(mf.c cVar);

    boolean isEmpty();
}
