package qb;

import java.util.logging.Level;
import java.util.logging.Logger;
import qb.s;

/* JADX INFO: loaded from: classes3.dex */
final class a2 extends s.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f24535a = Logger.getLogger(a2.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final ThreadLocal f24536b = new ThreadLocal();

    a2() {
    }

    @Override // qb.s.c
    public s a() {
        s sVar = (s) f24536b.get();
        return sVar == null ? s.f24746c : sVar;
    }

    @Override // qb.s.c
    public void b(s sVar, s sVar2) {
        if (a() != sVar) {
            f24535a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (sVar2 != s.f24746c) {
            f24536b.set(sVar2);
        } else {
            f24536b.set(null);
        }
    }

    @Override // qb.s.c
    public s c(s sVar) {
        s sVarA = a();
        f24536b.set(sVar);
        return sVarA;
    }
}
