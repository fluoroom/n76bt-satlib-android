package z4;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends u implements q8.y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, Context context) {
        super(iVar, context);
        rd.m.e(iVar, "layer");
        rd.m.e(context, "context");
    }

    @Override // q8.y
    public q8.v a(int i10, int i11, int i12) throws Throwable {
        File fileH = h(i10, i11, i12);
        if (fileH != null) {
            try {
                if (fileH.isFile()) {
                    byte[] bArrN = a6.m.n(fileH);
                    rd.m.d(bArrN, "readAll(...)");
                    k(bArrN.length);
                    return new q8.v(g(), g(), bArrN);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            } catch (SecurityException e11) {
                e11.printStackTrace();
            }
        }
        try {
            if (SystemClock.elapsedRealtime() - e() < 5000) {
                q8.v vVar = q8.y.f24487b;
                rd.m.d(vVar, "NO_TILE");
                return vVar;
            }
            byte[] bArrF = f(i10, i11, i12);
            if (bArrF != null) {
                k(bArrF.length);
                return new q8.v(g(), g(), bArrF);
            }
            q8.v vVar2 = q8.y.f24487b;
            rd.m.d(vVar2, "NO_TILE");
            return vVar2;
        } catch (SocketTimeoutException unused) {
            l(SystemClock.elapsedRealtime());
            q8.v vVar3 = q8.y.f24487b;
            rd.m.b(vVar3);
            return vVar3;
        } catch (IOException unused2) {
            q8.v vVar4 = q8.y.f24487b;
            rd.m.b(vVar4);
            return vVar4;
        }
    }
}
