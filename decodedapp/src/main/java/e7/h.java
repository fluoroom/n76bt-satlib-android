package e7;

import com.fasterxml.jackson.databind.JavaType;
import g7.i0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends i0 {
    protected h(Class cls) {
        super(cls);
    }

    protected abstract h x(a7.h hVar);

    public h z(a7.h hVar) {
        return hVar == null ? this : x(hVar);
    }

    protected h(JavaType javaType) {
        super(javaType);
    }

    protected h(Class cls, boolean z10) {
        super(cls, z10);
    }

    protected h(h hVar) {
        super(hVar.f13605a, false);
    }
}
