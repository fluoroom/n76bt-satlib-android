package t6;

import java.util.Collection;
import java.util.Map;
import s6.u;

/* JADX INFO: loaded from: classes.dex */
public final class m extends u.a {
    protected final s6.u A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected final String f27523y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected final boolean f27524z;

    public m(s6.u uVar, String str, s6.u uVar2, boolean z10) {
        super(uVar);
        this.f27523y = str;
        this.A = uVar2;
        this.f27524z = z10;
    }

    @Override // s6.u.a, s6.u
    public final void L(Object obj, Object obj2) {
        N(obj, obj2);
    }

    @Override // s6.u.a, s6.u
    public Object N(Object obj, Object obj2) {
        if (obj2 != null) {
            if (!this.f27524z) {
                this.A.L(obj2, obj);
            } else if (obj2 instanceof Object[]) {
                for (Object obj3 : (Object[]) obj2) {
                    if (obj3 != null) {
                        this.A.L(obj3, obj);
                    }
                }
            } else if (obj2 instanceof Collection) {
                for (Object obj4 : (Collection) obj2) {
                    if (obj4 != null) {
                        this.A.L(obj4, obj);
                    }
                }
            } else {
                if (!(obj2 instanceof Map)) {
                    throw new IllegalStateException("Unsupported container type (" + obj2.getClass().getName() + ") when resolving reference '" + this.f27523y + "'");
                }
                for (Object obj5 : ((Map) obj2).values()) {
                    if (obj5 != null) {
                        this.A.L(obj5, obj);
                    }
                }
            }
        }
        return this.f26973x.N(obj, obj2);
    }

    @Override // s6.u.a
    protected s6.u a0(s6.u uVar) {
        throw new IllegalStateException("Should never try to reset delegate");
    }

    @Override // s6.u
    public void n(e6.j jVar, p6.h hVar, Object obj) {
        L(obj, this.f26973x.l(jVar, hVar));
    }

    @Override // s6.u
    public Object o(e6.j jVar, p6.h hVar, Object obj) {
        return N(obj, l(jVar, hVar));
    }

    @Override // s6.u.a, s6.u
    public void q(p6.g gVar) {
        this.f26973x.q(gVar);
        this.A.q(gVar);
    }
}
