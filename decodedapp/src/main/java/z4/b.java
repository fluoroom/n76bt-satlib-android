package z4;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f implements q8.y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, Context context) {
        super(jVar, context);
        rd.m.e(jVar, "mapLayer");
        rd.m.e(context, "context");
    }

    @Override // q8.y
    public q8.v a(int i10, int i11, int i12) throws Throwable {
        File fileF = f(i10, i11, i12);
        if (fileF != null) {
            try {
                if (fileF.isFile()) {
                    byte[] bArrN = a6.m.n(fileF);
                    rd.m.d(bArrN, "readAll(...)");
                    j(bArrN.length);
                    return new q8.v(e(), e(), bArrN);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            } catch (SecurityException e11) {
                e11.printStackTrace();
            }
        }
        q8.v vVar = q8.y.f24487b;
        rd.m.d(vVar, "NO_TILE");
        return vVar;
    }
}
