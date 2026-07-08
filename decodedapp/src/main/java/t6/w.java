package t6;

import d6.k0;
import d6.n0;

/* JADX INFO: loaded from: classes.dex */
public class w extends n0 {
    public w(Class cls) {
        super(cls);
    }

    @Override // d6.k0
    public k0 b(Class cls) {
        return cls == this.f10765a ? this : new w(cls);
    }

    @Override // d6.k0
    public Object c(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // d6.k0
    public k0.a f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new k0.a(getClass(), this.f10765a, obj);
    }

    @Override // d6.k0
    public k0 h(Object obj) {
        return this;
    }
}
