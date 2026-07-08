package q8;

import android.graphics.Bitmap;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static l8.u f24396a;

    public static b a(float f10) {
        try {
            return new b(d().L(f10));
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public static b b(Bitmap bitmap) {
        v7.q.j(bitmap, "image must not be null");
        try {
            return new b(d().R(bitmap));
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public static void c(l8.u uVar) {
        if (f24396a != null) {
            return;
        }
        f24396a = (l8.u) v7.q.j(uVar, "delegate must not be null");
    }

    private static l8.u d() {
        return (l8.u) v7.q.j(f24396a, "IBitmapDescriptorFactory is not initialized");
    }
}
