package u7;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static void a(Status status, Object obj, t8.h hVar) {
        if (status.g()) {
            hVar.c(obj);
        } else {
            hVar.b(v7.b.a(status));
        }
    }

    public static void b(Status status, t8.h hVar) {
        a(status, null, hVar);
    }
}
