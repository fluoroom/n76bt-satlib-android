package id;

import dd.s;
import hd.e;
import hd.i;
import jd.h;
import jd.j;
import qd.p;
import rd.h0;
import rd.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    public static final class a extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f16026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f16027d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, p pVar, Object obj) {
            super(eVar);
            this.f16026c = pVar;
            this.f16027d = obj;
            m.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // jd.a
        protected Object o(Object obj) {
            int i10 = this.f16025b;
            if (i10 == 0) {
                this.f16025b = 1;
                s.b(obj);
                m.c(this.f16026c, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) h0.c(this.f16026c, 2)).s(this.f16027d, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f16025b = 2;
            s.b(obj);
            return obj;
        }
    }

    public static final class b extends jd.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f16028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p f16029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f16030f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, i iVar, p pVar, Object obj) {
            super(eVar, iVar);
            this.f16029e = pVar;
            this.f16030f = obj;
            m.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // jd.a
        protected Object o(Object obj) {
            int i10 = this.f16028d;
            if (i10 == 0) {
                this.f16028d = 1;
                s.b(obj);
                m.c(this.f16029e, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) h0.c(this.f16029e, 2)).s(this.f16030f, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f16028d = 2;
            s.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: id.c$c, reason: collision with other inner class name */
    public static final class C0220c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0220c(e eVar) {
            super(eVar);
            m.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // jd.a
        protected Object o(Object obj) {
            s.b(obj);
            return obj;
        }
    }

    public static final class d extends jd.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e eVar, i iVar) {
            super(eVar, iVar);
            m.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // jd.a
        protected Object o(Object obj) {
            s.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e a(p pVar, Object obj, e eVar) {
        m.e(pVar, "<this>");
        m.e(eVar, "completion");
        e eVarA = h.a(eVar);
        if (pVar instanceof jd.a) {
            return ((jd.a) pVar).g(obj, eVarA);
        }
        i context = eVarA.getContext();
        return context == hd.j.f15243a ? new a(eVarA, pVar, obj) : new b(eVarA, context, pVar, obj);
    }

    private static final e b(e eVar) {
        i context = eVar.getContext();
        return context == hd.j.f15243a ? new C0220c(eVar) : new d(eVar, context);
    }

    public static e c(e eVar) {
        e eVarQ;
        m.e(eVar, "<this>");
        jd.d dVar = eVar instanceof jd.d ? (jd.d) eVar : null;
        return (dVar == null || (eVarQ = dVar.q()) == null) ? eVar : eVarQ;
    }

    public static Object d(p pVar, Object obj, e eVar) {
        m.e(pVar, "<this>");
        m.e(eVar, "completion");
        return ((p) h0.c(pVar, 2)).s(obj, b(h.a(eVar)));
    }
}
