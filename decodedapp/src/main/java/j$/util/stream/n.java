package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends b5 {
    public static k2 U0(v3 v3Var, Spliterator spliterator) {
        j$.time.format.b bVar = new j$.time.format.b(19);
        j$.time.format.b bVar2 = new j$.time.format.b(20);
        j$.time.format.b bVar3 = new j$.time.format.b(21);
        Objects.requireNonNull(bVar);
        Objects.requireNonNull(bVar2);
        Objects.requireNonNull(bVar3);
        return new k2((Collection) new a4(z6.REFERENCE, bVar3, bVar2, bVar, 3).i(v3Var, spliterator));
    }

    @Override // j$.util.stream.a
    public final g2 N0(v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        a aVar = (a) v3Var;
        if (y6.DISTINCT.l(aVar.f17893m)) {
            return v3Var.j0(spliterator, false, intFunction);
        }
        if (y6.ORDERED.l(aVar.f17893m)) {
            return U0(v3Var, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j$.util.concurrent.t tVar = new j$.util.concurrent.t(4, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(tVar);
        new p0(tVar, false).a(v3Var, spliterator);
        Set setKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(setKeySet);
            hashSet.add(null);
            setKeySet = hashSet;
        }
        return new k2(setKeySet);
    }

    @Override // j$.util.stream.a
    public final Spliterator O0(a aVar, Spliterator spliterator) {
        if (y6.DISTINCT.l(aVar.f17893m)) {
            return aVar.H0(spliterator);
        }
        if (y6.ORDERED.l(aVar.f17893m)) {
            return U0(aVar, spliterator).spliterator();
        }
        return new h7(aVar.H0(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.a
    public final l5 Q0(int i10, l5 l5Var) {
        Objects.requireNonNull(l5Var);
        if (y6.DISTINCT.l(i10)) {
            return l5Var;
        }
        if (y6.SORTED.l(i10)) {
            return new l(l5Var);
        }
        return new m(l5Var);
    }
}
