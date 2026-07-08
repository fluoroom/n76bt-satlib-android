package ce;

import ed.q;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f4754a = new l();

    private l() {
    }

    public boolean a() {
        return false;
    }

    public Void b() {
        return null;
    }

    @Override // ce.h
    public Type g() {
        Class cls = Void.TYPE;
        rd.m.d(cls, "TYPE");
        return cls;
    }

    @Override // ce.h
    public /* bridge */ /* synthetic */ Member h() {
        return (Member) b();
    }

    @Override // ce.h
    public Object i(Object[] objArr) {
        rd.m.e(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // ce.h
    public List j() {
        return q.k();
    }

    @Override // ce.h
    public boolean k() {
        return a();
    }
}
