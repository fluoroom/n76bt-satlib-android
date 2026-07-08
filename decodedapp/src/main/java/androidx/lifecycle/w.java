package androidx.lifecycle;

import androidx.lifecycle.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final void a(t tVar, m.b bVar, m.b bVar2) {
        rd.m.e(bVar, "current");
        rd.m.e(bVar2, "next");
        if (bVar == m.b.f2652b && bVar2 == m.b.f2651a) {
            throw new IllegalStateException(("State must be at least '" + m.b.f2653c + "' to be moved to '" + bVar2 + "' in component " + tVar).toString());
        }
        m.b bVar3 = m.b.f2651a;
        if (bVar != bVar3 || bVar == bVar2) {
            return;
        }
        throw new IllegalStateException(("State is '" + bVar3 + "' and cannot be moved to `" + bVar2 + "` in component " + tVar).toString());
    }
}
