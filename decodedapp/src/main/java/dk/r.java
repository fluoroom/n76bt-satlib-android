package dk;

import androidx.appcompat.widget.RtlSpacingHelper;
import dd.r;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    static final class a implements qd.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ dk.d f11181a;

        a(dk.d dVar) {
            this.f11181a = dVar;
        }

        public final void b(Throwable th2) {
            this.f11181a.cancel();
        }

        @Override // qd.l
        public /* bridge */ /* synthetic */ Object l(Object obj) {
            b((Throwable) obj);
            return dd.d0.f10897a;
        }
    }

    public static final class b implements dk.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tg.i f11182a;

        b(tg.i iVar) {
            this.f11182a = iVar;
        }

        @Override // dk.f
        public void a(dk.d dVar, Throwable th2) {
            rd.m.e(dVar, "call");
            rd.m.e(th2, "t");
            tg.i iVar = this.f11182a;
            r.a aVar = dd.r.f10916a;
            iVar.d(dd.r.a(dd.s.a(th2)));
        }

        @Override // dk.f
        public void b(dk.d dVar, z zVar) {
            rd.m.e(dVar, "call");
            rd.m.e(zVar, "response");
            if (!zVar.e()) {
                tg.i iVar = this.f11182a;
                r.a aVar = dd.r.f10916a;
                iVar.d(dd.r.a(dd.s.a(new o(zVar))));
                return;
            }
            Object objA = zVar.a();
            if (objA != null) {
                this.f11182a.d(dd.r.a(objA));
                return;
            }
            Object objK = dVar.e().k(q.class);
            rd.m.b(objK);
            q qVar = (q) objK;
            dd.g gVar = new dd.g("Response from " + qVar.b().getName() + '.' + qVar.a().getName() + " was null but response body type was declared as non-null");
            tg.i iVar2 = this.f11182a;
            r.a aVar2 = dd.r.f10916a;
            iVar2.d(dd.r.a(dd.s.a(gVar)));
        }
    }

    static final class c implements qd.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ dk.d f11183a;

        c(dk.d dVar) {
            this.f11183a = dVar;
        }

        public final void b(Throwable th2) {
            this.f11183a.cancel();
        }

        @Override // qd.l
        public /* bridge */ /* synthetic */ Object l(Object obj) {
            b((Throwable) obj);
            return dd.d0.f10897a;
        }
    }

    public static final class d implements dk.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tg.i f11184a;

        d(tg.i iVar) {
            this.f11184a = iVar;
        }

        @Override // dk.f
        public void a(dk.d dVar, Throwable th2) {
            rd.m.e(dVar, "call");
            rd.m.e(th2, "t");
            tg.i iVar = this.f11184a;
            r.a aVar = dd.r.f10916a;
            iVar.d(dd.r.a(dd.s.a(th2)));
        }

        @Override // dk.f
        public void b(dk.d dVar, z zVar) {
            rd.m.e(dVar, "call");
            rd.m.e(zVar, "response");
            if (zVar.e()) {
                tg.i iVar = this.f11184a;
                r.a aVar = dd.r.f10916a;
                iVar.d(dd.r.a(zVar.a()));
            } else {
                tg.i iVar2 = this.f11184a;
                r.a aVar2 = dd.r.f10916a;
                iVar2.d(dd.r.a(dd.s.a(new o(zVar))));
            }
        }
    }

    static final class e implements qd.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ dk.d f11185a;

        e(dk.d dVar) {
            this.f11185a = dVar;
        }

        public final void b(Throwable th2) {
            this.f11185a.cancel();
        }

        @Override // qd.l
        public /* bridge */ /* synthetic */ Object l(Object obj) {
            b((Throwable) obj);
            return dd.d0.f10897a;
        }
    }

    public static final class f implements dk.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tg.i f11186a;

        f(tg.i iVar) {
            this.f11186a = iVar;
        }

        @Override // dk.f
        public void a(dk.d dVar, Throwable th2) {
            rd.m.e(dVar, "call");
            rd.m.e(th2, "t");
            tg.i iVar = this.f11186a;
            r.a aVar = dd.r.f10916a;
            iVar.d(dd.r.a(dd.s.a(th2)));
        }

        @Override // dk.f
        public void b(dk.d dVar, z zVar) {
            rd.m.e(dVar, "call");
            rd.m.e(zVar, "response");
            this.f11186a.d(dd.r.a(zVar));
        }
    }

    static final class g extends jd.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f11187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f11188e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f11189f;

        g(hd.e eVar) {
            super(eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            this.f11188e = obj;
            this.f11189f |= RtlSpacingHelper.UNDEFINED;
            return r.e(null, this);
        }
    }

    static final class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ hd.e f11190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f11191b;

        h(hd.e eVar, Throwable th2) {
            this.f11190a = eVar;
            this.f11191b = th2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            hd.e eVarC = id.b.c(this.f11190a);
            r.a aVar = dd.r.f10916a;
            eVarC.d(dd.r.a(dd.s.a(this.f11191b)));
        }
    }

    public static final Object a(dk.d dVar, hd.e eVar) throws Throwable {
        tg.j jVar = new tg.j(id.b.c(eVar), 1);
        jVar.A();
        jVar.e(new a(dVar));
        dVar.s(new b(jVar));
        Object objU = jVar.u();
        if (objU == id.b.e()) {
            jd.h.c(eVar);
        }
        return objU;
    }

    public static final Object b(dk.d dVar, hd.e eVar) throws Throwable {
        tg.j jVar = new tg.j(id.b.c(eVar), 1);
        jVar.A();
        jVar.e(new c(dVar));
        dVar.s(new d(jVar));
        Object objU = jVar.u();
        if (objU == id.b.e()) {
            jd.h.c(eVar);
        }
        return objU;
    }

    public static final Object c(dk.d dVar, hd.e eVar) throws Throwable {
        tg.j jVar = new tg.j(id.b.c(eVar), 1);
        jVar.A();
        jVar.e(new e(dVar));
        dVar.s(new f(jVar));
        Object objU = jVar.u();
        if (objU == id.b.e()) {
            jd.h.c(eVar);
        }
        return objU;
    }

    public static final Object d(dk.d dVar, hd.e eVar) {
        rd.m.c(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return b(dVar, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(java.lang.Throwable r4, hd.e r5) {
        /*
            boolean r0 = r5 instanceof dk.r.g
            if (r0 == 0) goto L13
            r0 = r5
            dk.r$g r0 = (dk.r.g) r0
            int r1 = r0.f11189f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11189f = r1
            goto L18
        L13:
            dk.r$g r0 = new dk.r$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f11188e
            java.lang.Object r1 = id.b.e()
            int r2 = r0.f11189f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f11187d
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            dd.s.b(r5)
            goto L5c
        L35:
            dd.s.b(r5)
            r0.f11187d = r4
            r0.f11189f = r3
            tg.a0 r5 = tg.p0.a()
            hd.i r2 = r0.getContext()
            dk.r$h r3 = new dk.r$h
            r3.<init>(r0, r4)
            r5.G(r2, r3)
            java.lang.Object r4 = id.b.e()
            java.lang.Object r5 = id.b.e()
            if (r4 != r5) goto L59
            jd.h.c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            dd.f r4 = new dd.f
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dk.r.e(java.lang.Throwable, hd.e):java.lang.Object");
    }
}
