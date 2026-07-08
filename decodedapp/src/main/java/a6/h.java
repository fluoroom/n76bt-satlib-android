package a6;

import dd.d0;
import tg.p0;
import tg.z0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f329a = new h();

    static final class a extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Runnable f331f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Runnable runnable, hd.e eVar) {
            super(2, eVar);
            this.f331f = runnable;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            return new a(this.f331f, eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            id.b.e();
            if (this.f330e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd.s.b(obj);
            this.f331f.run();
            return d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((a) g(d0Var, eVar)).o(d0.f10897a);
        }
    }

    private h() {
    }

    public static final void a(Runnable runnable) {
        rd.m.e(runnable, "task");
        tg.g.b(z0.f27881a, p0.b(), null, new a(runnable, null), 2, null);
    }
}
