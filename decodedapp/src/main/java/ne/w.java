package ne;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import ne.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends y implements cf.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f22724a;

    public w(Field field) {
        rd.m.e(field, "member");
        this.f22724a = field;
    }

    @Override // cf.n
    public boolean F() {
        return Q().isEnumConstant();
    }

    @Override // cf.n
    public boolean M() {
        return false;
    }

    @Override // ne.y
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public Field Q() {
        return this.f22724a;
    }

    @Override // cf.n
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public e0 getType() {
        e0.a aVar = e0.f22688a;
        Type genericType = Q().getGenericType();
        rd.m.d(genericType, "getGenericType(...)");
        return aVar.a(genericType);
    }
}
