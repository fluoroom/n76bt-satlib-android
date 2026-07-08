package ni;

import mi.g;
import mi.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f22962c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f22964b;

    static {
        f22962c = b.c() ? b.b() : null;
    }

    public a(g gVar, h hVar) {
        this.f22963a = gVar;
        this.f22964b = hVar;
    }

    public static boolean a() {
        return f22962c != null;
    }

    public static a b() {
        return f22962c;
    }
}
