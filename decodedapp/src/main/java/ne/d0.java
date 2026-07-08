package ne;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends y implements cf.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22686a;

    public d0(Object obj) {
        rd.m.e(obj, "recordComponent");
        this.f22686a = obj;
    }

    @Override // ne.y
    public Member Q() throws IllegalAccessException, InvocationTargetException {
        Method methodC = a.f22667a.c(this.f22686a);
        if (methodC != null) {
            return methodC;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // cf.w
    public boolean b() {
        return false;
    }

    @Override // cf.w
    public cf.x getType() throws IllegalAccessException, InvocationTargetException {
        Class clsD = a.f22667a.d(this.f22686a);
        if (clsD != null) {
            return new s(clsD);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
