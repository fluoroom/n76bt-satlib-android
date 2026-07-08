package io.grpc.internal;

import java.text.MessageFormat;
import java.util.logging.Level;
import qb.e0;
import qb.f;

/* JADX INFO: loaded from: classes3.dex */
final class o extends qb.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f16981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b3 f16982b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16983a;

        static {
            int[] iArr = new int[f.a.values().length];
            f16983a = iArr;
            try {
                iArr[f.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16983a[f.a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16983a[f.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    o(p pVar, b3 b3Var) {
        this.f16981a = (p) r9.l.o(pVar, "tracer");
        this.f16982b = (b3) r9.l.o(b3Var, "time");
    }

    private boolean c(f.a aVar) {
        return aVar != f.a.DEBUG && this.f16981a.c();
    }

    static void d(qb.j0 j0Var, f.a aVar, String str) {
        Level levelF = f(aVar);
        if (p.f16995f.isLoggable(levelF)) {
            p.d(j0Var, levelF, str);
        }
    }

    static void e(qb.j0 j0Var, f.a aVar, String str, Object... objArr) {
        Level levelF = f(aVar);
        if (p.f16995f.isLoggable(levelF)) {
            p.d(j0Var, levelF, MessageFormat.format(str, objArr));
        }
    }

    private static Level f(f.a aVar) {
        int i10 = a.f16983a[aVar.ordinal()];
        return (i10 == 1 || i10 == 2) ? Level.FINE : i10 != 3 ? Level.FINEST : Level.FINER;
    }

    private static e0.b g(f.a aVar) {
        int i10 = a.f16983a[aVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? e0.b.CT_INFO : e0.b.CT_WARNING : e0.b.CT_ERROR;
    }

    private void h(f.a aVar, String str) {
        if (aVar == f.a.DEBUG) {
            return;
        }
        this.f16981a.f(new e0.a().b(str).c(g(aVar)).e(this.f16982b.a()).a());
    }

    @Override // qb.f
    public void a(f.a aVar, String str) {
        d(this.f16981a.b(), aVar, str);
        if (c(aVar)) {
            h(aVar, str);
        }
    }

    @Override // qb.f
    public void b(f.a aVar, String str, Object... objArr) {
        a(aVar, (c(aVar) || p.f16995f.isLoggable(f(aVar))) ? MessageFormat.format(str, objArr) : null);
    }
}
