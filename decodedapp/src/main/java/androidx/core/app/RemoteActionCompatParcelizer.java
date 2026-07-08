package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1898a = (IconCompat) aVar.v(remoteActionCompat.f1898a, 1);
        remoteActionCompat.f1899b = aVar.l(remoteActionCompat.f1899b, 2);
        remoteActionCompat.f1900c = aVar.l(remoteActionCompat.f1900c, 3);
        remoteActionCompat.f1901d = (PendingIntent) aVar.r(remoteActionCompat.f1901d, 4);
        remoteActionCompat.f1902e = aVar.h(remoteActionCompat.f1902e, 5);
        remoteActionCompat.f1903f = aVar.h(remoteActionCompat.f1903f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f1898a, 1);
        aVar.D(remoteActionCompat.f1899b, 2);
        aVar.D(remoteActionCompat.f1900c, 3);
        aVar.H(remoteActionCompat.f1901d, 4);
        aVar.z(remoteActionCompat.f1902e, 5);
        aVar.z(remoteActionCompat.f1903f, 6);
    }
}
