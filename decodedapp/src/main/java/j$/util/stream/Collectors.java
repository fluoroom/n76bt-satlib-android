package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class Collectors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f17883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f17884b;

    static {
        h hVar = h.CONCURRENT;
        h hVar2 = h.UNORDERED;
        h hVar3 = h.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(hVar, hVar2, hVar3));
        Collections.unmodifiableSet(EnumSet.of(hVar, hVar2));
        f17883a = Collections.unmodifiableSet(EnumSet.of(hVar3));
        Collections.unmodifiableSet(EnumSet.of(hVar2, hVar3));
        f17884b = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(hVar2));
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new k(new j$.time.format.b(10), new j$.time.format.b(11), new j$.time.format.b(14), new j$.time.format.b(15), f17883a);
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence) {
        return new k(new j$.util.q(4, charSequence), new j$.time.format.b(16), new j$.time.format.b(17), new j$.time.format.b(18), f17884b);
    }

    public static void a(double[] dArr, double d10) {
        double d11 = d10 - dArr[1];
        double d12 = dArr[0];
        double d13 = d12 + d11;
        dArr[1] = (d13 - d12) - d11;
        dArr[0] = d13;
    }
}
