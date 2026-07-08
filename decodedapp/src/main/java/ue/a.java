package ue;

import java.util.ArrayList;
import java.util.List;
import rd.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements se.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0400a f29112e = new C0400a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final se.f f29113f = new se.f(c0.b(a.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f29114a = new ArrayList(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29117d;

    /* JADX INFO: renamed from: ue.a$a, reason: collision with other inner class name */
    public static final class C0400a {
        public /* synthetic */ C0400a(rd.h hVar) {
            this();
        }

        public final se.f a() {
            return a.f29113f;
        }

        private C0400a() {
        }
    }

    public final List b() {
        return this.f29114a;
    }

    public final void c(String str) {
        this.f29116c = str;
    }

    public final void d(int i10) {
        this.f29117d = i10;
    }

    public final void e(String str) {
        this.f29115b = str;
    }

    @Override // se.e
    public se.f getType() {
        return f29113f;
    }
}
