package v2;

import android.util.Log;
import i2.k;
import java.io.File;
import java.io.IOException;
import k2.v;

/* JADX INFO: loaded from: classes.dex */
public class d implements k {
    @Override // i2.k
    public i2.c a(i2.h hVar) {
        return i2.c.SOURCE;
    }

    @Override // i2.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(v vVar, File file, i2.h hVar) throws Throwable {
        try {
            e3.a.f(((c) vVar.get()).c(), file);
            return true;
        } catch (IOException e10) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            return false;
        }
    }
}
