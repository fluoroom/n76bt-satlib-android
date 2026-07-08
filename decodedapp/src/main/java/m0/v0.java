package m0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    static final class a extends jd.k implements qd.p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f20901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f20902d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f20903e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, hd.e eVar) {
            super(2, eVar);
            this.f20903e = view;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            a aVar = new a(this.f20903e, eVar);
            aVar.f20902d = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r1.g(r5, r4) == r0) goto L17;
         */
        @Override // jd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object o(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = id.b.e()
                int r1 = r4.f20901c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                dd.s.b(r5)
                goto L4f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f20902d
                qg.j r1 = (qg.j) r1
                dd.s.b(r5)
                goto L37
            L22:
                dd.s.b(r5)
                java.lang.Object r5 = r4.f20902d
                r1 = r5
                qg.j r1 = (qg.j) r1
                android.view.View r5 = r4.f20903e
                r4.f20902d = r1
                r4.f20901c = r3
                java.lang.Object r5 = r1.c(r5, r4)
                if (r5 != r0) goto L37
                goto L4e
            L37:
                android.view.View r5 = r4.f20903e
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L4f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                qg.h r5 = m0.u0.b(r5)
                r3 = 0
                r4.f20902d = r3
                r4.f20901c = r2
                java.lang.Object r5 = r1.g(r5, r4)
                if (r5 != r0) goto L4f
            L4e:
                return r0
            L4f:
                dd.d0 r5 = dd.d0.f10897a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.v0.a.o(java.lang.Object):java.lang.Object");
        }

        @Override // qd.p
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object s(qg.j jVar, hd.e eVar) {
            return ((a) g(jVar, eVar)).o(dd.d0.f10897a);
        }
    }

    public static final qg.h a(View view) {
        return qg.k.b(new a(view, null));
    }
}
