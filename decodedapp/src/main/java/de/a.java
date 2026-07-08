package de;

import ed.q;
import ef.x;
import he.g1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import mf.b;
import mf.c;
import rd.m;
import rd.y;
import ve.i0;
import ve.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10935a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f10936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f10937c;

    static {
        List listN = q.n(j0.f30599a, j0.f30610l, j0.f30611m, j0.f30602d, j0.f30604f, j0.f30607i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = b.f21989d;
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(aVar.c((c) it.next()));
        }
        f10936b = linkedHashSet;
        b.a aVar2 = b.f21989d;
        c cVar = j0.f30608j;
        m.d(cVar, "REPEATABLE_ANNOTATION");
        f10937c = aVar2.c(cVar);
    }

    private a() {
    }

    public final b a() {
        return f10937c;
    }

    public final Set b() {
        return f10936b;
    }

    public final boolean c(x xVar) {
        m.e(xVar, "klass");
        y yVar = new y();
        xVar.b(new C0146a(yVar), null);
        return yVar.f25960a;
    }

    /* JADX INFO: renamed from: de.a$a, reason: collision with other inner class name */
    public static final class C0146a implements x.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f10938a;

        C0146a(y yVar) {
            this.f10938a = yVar;
        }

        @Override // ef.x.c
        public x.a c(b bVar, g1 g1Var) {
            m.e(bVar, "classId");
            m.e(g1Var, "source");
            if (!m.a(bVar, i0.f30588a.a())) {
                return null;
            }
            this.f10938a.f25960a = true;
            return null;
        }

        @Override // ef.x.c
        public void a() {
        }
    }
}
