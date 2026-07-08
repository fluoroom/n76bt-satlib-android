package androidx.fragment.app;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f2266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f2267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f2268c;

    static {
        e0 e0Var = new e0();
        f2266a = e0Var;
        f2267b = new f0();
        f2268c = e0Var.b();
    }

    private e0() {
    }

    public static final void a(o oVar, o oVar2, boolean z10, androidx.collection.a aVar, boolean z11) {
        rd.m.e(oVar, "inFragment");
        rd.m.e(oVar2, "outFragment");
        rd.m.e(aVar, "sharedElements");
        if (z10) {
            oVar2.n1();
        } else {
            oVar.n1();
        }
    }

    private final g0 b() {
        try {
            rd.m.c(androidx.transition.e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (g0) androidx.transition.e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void c(androidx.collection.a aVar, androidx.collection.a aVar2) {
        rd.m.e(aVar, "<this>");
        rd.m.e(aVar2, "namedViews");
        int size = aVar.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!aVar2.containsKey((String) aVar.j(size))) {
                aVar.h(size);
            }
        }
    }

    public static final void d(List list, int i10) {
        rd.m.e(list, "views");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
