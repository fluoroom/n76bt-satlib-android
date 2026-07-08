package na;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0301a f22647e = new C0301a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final la.a f22648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f22650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f22651d;

    /* JADX INFO: renamed from: na.a$a, reason: collision with other inner class name */
    public static final class C0301a {
        public /* synthetic */ C0301a(h hVar) {
            this();
        }

        private C0301a() {
        }
    }

    public interface b {
        la.b b();
    }

    public a(la.a aVar, int i10) {
        m.e(aVar, "mBounds");
        this.f22648a = aVar;
        this.f22649b = i10;
    }

    private final void c(double d10, double d11, b bVar) {
        List list = this.f22651d;
        if (list == null) {
            if (this.f22650c == null) {
                this.f22650c = new LinkedHashSet();
            }
            Set set = this.f22650c;
            m.b(set);
            set.add(bVar);
            Set set2 = this.f22650c;
            m.b(set2);
            if (set2.size() <= 50 || this.f22649b >= 40) {
                return;
            }
            f();
            return;
        }
        la.a aVar = this.f22648a;
        if (d11 < aVar.f20528f) {
            if (d10 < aVar.f20527e) {
                m.b(list);
                ((a) list.get(0)).c(d10, d11, bVar);
                return;
            } else {
                m.b(list);
                ((a) list.get(1)).c(d10, d11, bVar);
                return;
            }
        }
        if (d10 < aVar.f20527e) {
            m.b(list);
            ((a) list.get(2)).c(d10, d11, bVar);
        } else {
            m.b(list);
            ((a) list.get(3)).c(d10, d11, bVar);
        }
    }

    private final void e(la.a aVar, Collection collection) {
        if (this.f22648a.e(aVar)) {
            List list = this.f22651d;
            if (list != null) {
                m.b(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).e(aVar, collection);
                }
                return;
            }
            if (this.f22650c != null) {
                if (aVar.b(this.f22648a)) {
                    Set set = this.f22650c;
                    m.b(set);
                    collection.addAll(set);
                    return;
                }
                Set<b> set2 = this.f22650c;
                m.b(set2);
                for (b bVar : set2) {
                    if (aVar.c(bVar.b())) {
                        collection.add(bVar);
                    }
                }
            }
        }
    }

    private final void f() {
        ArrayList arrayList = new ArrayList(4);
        this.f22651d = arrayList;
        m.b(arrayList);
        la.a aVar = this.f22648a;
        arrayList.add(new a(new la.a(aVar.f20523a, aVar.f20527e, aVar.f20525c, aVar.f20528f), this.f22649b + 1));
        List list = this.f22651d;
        m.b(list);
        la.a aVar2 = this.f22648a;
        list.add(new a(new la.a(aVar2.f20527e, aVar2.f20524b, aVar2.f20525c, aVar2.f20528f), this.f22649b + 1));
        List list2 = this.f22651d;
        m.b(list2);
        la.a aVar3 = this.f22648a;
        list2.add(new a(new la.a(aVar3.f20523a, aVar3.f20527e, aVar3.f20528f, aVar3.f20526d), this.f22649b + 1));
        List list3 = this.f22651d;
        m.b(list3);
        la.a aVar4 = this.f22648a;
        list3.add(new a(new la.a(aVar4.f20527e, aVar4.f20524b, aVar4.f20528f, aVar4.f20526d), this.f22649b + 1));
        Set<b> set = this.f22650c;
        this.f22650c = null;
        if (set != null) {
            for (b bVar : set) {
                c(bVar.b().f20529a, bVar.b().f20530b, bVar);
            }
        }
    }

    public final void a(b bVar) {
        m.e(bVar, "item");
        la.b bVarB = bVar.b();
        if (this.f22648a.a(bVarB.f20529a, bVarB.f20530b)) {
            c(bVarB.f20529a, bVarB.f20530b, bVar);
        }
    }

    public final void b() {
        this.f22651d = null;
        Set set = this.f22650c;
        if (set != null) {
            m.b(set);
            set.clear();
        }
    }

    public final Collection d(la.a aVar) {
        m.e(aVar, "searchBounds");
        ArrayList arrayList = new ArrayList();
        e(aVar, arrayList);
        return arrayList;
    }

    public /* synthetic */ a(la.a aVar, int i10, int i11, h hVar) {
        this(aVar, (i11 & 2) != 0 ? 0 : i10);
    }

    public a(double d10, double d11, double d12, double d13) {
        this(new la.a(d10, d11, d12, d13), 0, 2, (h) null);
    }
}
