package j$.util;

import j$.util.stream.Stream;
import j$.util.stream.v3;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DesugarArrays {
    public static j1 a(Object[] objArr, int i10, int i11) {
        Spliterators.a(((Object[]) Objects.requireNonNull(objArr)).length, i10, i11);
        return new j1(objArr, i10, i11, 1040);
    }

    public static <T> Stream<T> stream(T[] tArr) {
        return v3.E0(a(tArr, 0, tArr.length), false);
    }
}
