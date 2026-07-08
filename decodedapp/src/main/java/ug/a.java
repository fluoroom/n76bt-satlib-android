package ug;

import android.os.Looper;
import java.util.List;
import tg.o1;
import xg.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements o {
    @Override // xg.o
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // xg.o
    public o1 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // xg.o
    public int c() {
        return 1073741823;
    }
}
