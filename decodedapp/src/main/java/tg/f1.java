package tg;

import hd.i;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public interface f1 extends i.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f27816q = b.f27817a;

    public static final class a {
        public static Object a(f1 f1Var, Object obj, qd.p pVar) {
            return i.b.a.a(f1Var, obj, pVar);
        }

        public static i.b b(f1 f1Var, i.c cVar) {
            return i.b.a.b(f1Var, cVar);
        }

        public static hd.i c(f1 f1Var, i.c cVar) {
            return i.b.a.c(f1Var, cVar);
        }

        public static hd.i d(f1 f1Var, hd.i iVar) {
            return i.b.a.d(f1Var, iVar);
        }
    }

    public static final class b implements i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f27817a = new b();

        private b() {
        }
    }

    n X(p pVar);

    boolean c();

    void h0(CancellationException cancellationException);

    CancellationException s();

    boolean start();

    q0 x(boolean z10, boolean z11, qd.l lVar);
}
