package qg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u extends s {

    public static final class a implements Iterable, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f25208a;

        public a(h hVar) {
            this.f25208a = hVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f25208a.iterator();
        }
    }

    static final /* synthetic */ class b extends rd.l implements qd.l {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f25209s = new b();

        b() {
            super(1, h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Iterator l(h hVar) {
            rd.m.e(hVar, "p0");
            return hVar.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(Object obj) {
        return obj == null;
    }

    public static Object B(h hVar) {
        rd.m.e(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static h C(h hVar, qd.l lVar) {
        rd.m.e(hVar, "<this>");
        rd.m.e(lVar, "transform");
        return new f(hVar, lVar, b.f25209s);
    }

    public static final Appendable D(h hVar, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qd.l lVar) throws IOException {
        rd.m.e(hVar, "<this>");
        rd.m.e(appendable, "buffer");
        rd.m.e(charSequence, "separator");
        rd.m.e(charSequence2, "prefix");
        rd.m.e(charSequence3, "postfix");
        rd.m.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object obj : hVar) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            rg.q.a(appendable, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String E(h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qd.l lVar) {
        rd.m.e(hVar, "<this>");
        rd.m.e(charSequence, "separator");
        rd.m.e(charSequence2, "prefix");
        rd.m.e(charSequence3, "postfix");
        rd.m.e(charSequence4, "truncated");
        return ((StringBuilder) D(hVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String F(h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qd.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        qd.l lVar2 = lVar;
        return E(hVar, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static Object G(h hVar) {
        rd.m.e(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static h H(h hVar, qd.l lVar) {
        rd.m.e(hVar, "<this>");
        rd.m.e(lVar, "transform");
        return new w(hVar, lVar);
    }

    public static h I(h hVar, qd.l lVar) {
        rd.m.e(hVar, "<this>");
        rd.m.e(lVar, "transform");
        return z(new w(hVar, lVar));
    }

    public static h J(h hVar, Iterable iterable) {
        rd.m.e(hVar, "<this>");
        rd.m.e(iterable, "elements");
        return r.j(r.s(hVar, ed.q.S(iterable)));
    }

    public static h K(h hVar, Object obj) {
        rd.m.e(hVar, "<this>");
        return r.j(r.s(hVar, r.r(obj)));
    }

    public static h L(h hVar, h hVar2) {
        rd.m.e(hVar, "<this>");
        rd.m.e(hVar2, "elements");
        return r.j(r.s(hVar, hVar2));
    }

    public static h M(h hVar, qd.l lVar) {
        rd.m.e(hVar, "<this>");
        rd.m.e(lVar, "predicate");
        return new v(hVar, lVar);
    }

    public static final Collection N(h hVar, Collection collection) {
        rd.m.e(hVar, "<this>");
        rd.m.e(collection, "destination");
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    public static List O(h hVar) {
        rd.m.e(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return ed.q.k();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return ed.q.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static List P(h hVar) {
        rd.m.e(hVar, "<this>");
        return (List) N(hVar, new ArrayList());
    }

    public static Iterable u(h hVar) {
        rd.m.e(hVar, "<this>");
        return new a(hVar);
    }

    public static int v(h hVar) {
        rd.m.e(hVar, "<this>");
        Iterator it = hVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                ed.q.t();
            }
        }
        return i10;
    }

    public static h w(h hVar, int i10) {
        rd.m.e(hVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? hVar : hVar instanceof c ? ((c) hVar).a(i10) : new qg.b(hVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static h x(h hVar, qd.l lVar) {
        rd.m.e(hVar, "<this>");
        rd.m.e(lVar, "predicate");
        return new e(hVar, true, lVar);
    }

    public static h y(h hVar, qd.l lVar) {
        rd.m.e(hVar, "<this>");
        rd.m.e(lVar, "predicate");
        return new e(hVar, false, lVar);
    }

    public static h z(h hVar) {
        rd.m.e(hVar, "<this>");
        h hVarY = y(hVar, new qd.l() { // from class: qg.t
            @Override // qd.l
            public final Object l(Object obj) {
                return Boolean.valueOf(u.A(obj));
            }
        });
        rd.m.c(hVarY, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return hVarY;
    }
}
