package rb;

import io.grpc.internal.d3;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import qb.k0;
import qb.z0;

/* JADX INFO: loaded from: classes3.dex */
abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f25855a = Logger.getLogger(t.class.getName());

    public static z0 a(List list) {
        return k0.c(b(list));
    }

    private static byte[][] b(List list) {
        byte[][] bArr = new byte[list.size() * 2][];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            tb.d dVar = (tb.d) it.next();
            int i11 = i10 + 1;
            bArr[i10] = dVar.f27708a.Y();
            i10 += 2;
            bArr[i11] = dVar.f27709b.Y();
        }
        return d3.e(bArr);
    }

    public static z0 c(List list) {
        return k0.c(b(list));
    }
}
