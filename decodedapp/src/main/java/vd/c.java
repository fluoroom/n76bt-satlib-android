package vd;

import java.io.Serializable;
import rd.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f30542a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f30543b = ld.b.f20546a.b();

    public static final class a extends c implements Serializable {
        public /* synthetic */ a(h hVar) {
            this();
        }

        @Override // vd.c
        public int b(int i10) {
            return c.f30543b.b(i10);
        }

        @Override // vd.c
        public long c() {
            return c.f30543b.c();
        }

        private a() {
        }
    }

    public abstract int b(int i10);

    public abstract long c();
}
