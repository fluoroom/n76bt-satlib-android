package l1;

import android.os.Bundle;
import dd.d0;
import l1.h;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20328c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m1.b f20329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f20330b;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d0 c(i iVar) {
            iVar.S0().a(new b(iVar));
            return d0.f10897a;
        }

        public final h b(final i iVar) {
            rd.m.e(iVar, "owner");
            return new h(new m1.b(iVar, new qd.a() { // from class: l1.g
                @Override // qd.a
                public final Object a() {
                    return h.a.c(iVar);
                }
            }), null);
        }

        private a() {
        }
    }

    public /* synthetic */ h(m1.b bVar, rd.h hVar) {
        this(bVar);
    }

    public static final h a(i iVar) {
        return f20328c.b(iVar);
    }

    public final f b() {
        return this.f20330b;
    }

    public final void c() {
        this.f20329a.f();
    }

    public final void d(Bundle bundle) {
        this.f20329a.h(bundle);
    }

    public final void e(Bundle bundle) {
        rd.m.e(bundle, "outBundle");
        this.f20329a.i(bundle);
    }

    private h(m1.b bVar) {
        this.f20329a = bVar;
        this.f20330b = new f(bVar);
    }
}
