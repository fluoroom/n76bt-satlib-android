package pg;

import j$.util.concurrent.ConcurrentHashMap;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap f24245a = new ConcurrentHashMap();

    public static final Void a(String str) {
        m.e(str, "message");
        throw new IllegalStateException(str.toString());
    }

    public static /* synthetic */ Void b(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "should not be called";
        }
        return a(str);
    }
}
