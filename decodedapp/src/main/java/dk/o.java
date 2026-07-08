package dk;

import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class o extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient z f11168c;

    public o(z zVar) {
        super(a(zVar));
        this.f11166a = zVar.b();
        this.f11167b = zVar.f();
        this.f11168c = zVar;
    }

    private static String a(z zVar) {
        Objects.requireNonNull(zVar, "response == null");
        return "HTTP " + zVar.b() + " " + zVar.f();
    }
}
