package ed;

import java.lang.reflect.Array;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes3.dex */
abstract class k {
    public static final Object[] a(Object[] objArr, int i10) {
        rd.m.e(objArr, Name.REFER);
        Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i10);
        rd.m.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    public static final void b(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }
}
