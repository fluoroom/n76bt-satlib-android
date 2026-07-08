package ne;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
class p implements qd.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f22712a;

    public p(q qVar) {
        this.f22712a = qVar;
    }

    @Override // qd.l
    public Object l(Object obj) {
        return Boolean.valueOf(q.R(this.f22712a, (Method) obj));
    }
}
