package ni;

import android.os.Looper;
import mi.f;
import mi.h;
import mi.l;

/* JADX INFO: loaded from: classes3.dex */
public class d implements h {
    @Override // mi.h
    public l a(mi.c cVar) {
        return new f(cVar, Looper.getMainLooper(), 10);
    }

    @Override // mi.h
    public boolean b() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
