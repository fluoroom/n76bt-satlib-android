package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
abstract class t {
    private static i0.f a(i0.f fVar, i0.f fVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < fVar.g() + fVar2.g()) {
            Locale localeD = i10 < fVar.g() ? fVar.d(i10) : fVar2.d(i10 - fVar.g());
            if (localeD != null) {
                linkedHashSet.add(localeD);
            }
            i10++;
        }
        return i0.f.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static i0.f b(i0.f fVar, i0.f fVar2) {
        return (fVar == null || fVar.f()) ? i0.f.e() : a(fVar, fVar2);
    }
}
