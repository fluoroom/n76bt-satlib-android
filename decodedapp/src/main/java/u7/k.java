package u7;

import android.os.Looper;
import u7.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static j a(Object obj, Looper looper, String str) {
        v7.q.j(obj, "Listener must not be null");
        v7.q.j(looper, "Looper must not be null");
        v7.q.j(str, "Listener type must not be null");
        return new j(looper, obj, str);
    }

    public static j.a b(Object obj, String str) {
        v7.q.j(obj, "Listener must not be null");
        v7.q.j(str, "Listener type must not be null");
        v7.q.g(str, "Listener type must not be empty");
        return new j.a(obj, str);
    }
}
