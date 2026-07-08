package u6;

import com.fasterxml.jackson.databind.JavaType;
import d6.k;
import j$.util.Objects;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public class n extends c0 implements s6.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final JavaType f28287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected p6.l f28288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final s6.r f28289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final boolean f28290h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final Boolean f28291r;

    public n(JavaType javaType, p6.l lVar) {
        super(EnumSet.class);
        this.f28287e = javaType;
        if (javaType.O()) {
            this.f28288f = lVar;
            this.f28291r = null;
            this.f28289g = null;
            this.f28290h = false;
            return;
        }
        throw new IllegalArgumentException("Type " + javaType + " not Java Enum type");
    }

    private EnumSet f1() {
        return EnumSet.noneOf(this.f28287e.r());
    }

    @Override // s6.i
    public p6.l d(p6.h hVar, p6.d dVar) {
        Boolean boolT0 = T0(hVar, dVar, EnumSet.class, k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        p6.l lVar = this.f28288f;
        p6.l lVarQ = lVar == null ? hVar.Q(this.f28287e, dVar) : hVar.p0(lVar, dVar, this.f28287e);
        return j1(lVarQ, P0(hVar, dVar, lVarQ), boolT0);
    }

    protected final EnumSet e1(e6.j jVar, p6.h hVar, EnumSet enumSet) throws p6.m {
        Enum r02;
        while (true) {
            try {
                e6.m mVarX0 = jVar.X0();
                if (mVarX0 == e6.m.END_ARRAY) {
                    return enumSet;
                }
                if (mVarX0 != e6.m.VALUE_NULL) {
                    r02 = (Enum) this.f28288f.e(jVar, hVar);
                } else if (!this.f28290h) {
                    r02 = (Enum) this.f28289g.a(hVar);
                }
                if (r02 != null) {
                    enumSet.add(r02);
                }
            } catch (Exception e10) {
                throw p6.m.r(e10, enumSet, enumSet.size());
            }
        }
    }

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return eVar.d(jVar, hVar);
    }

    @Override // p6.l
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public EnumSet e(e6.j jVar, p6.h hVar) {
        EnumSet enumSetF1 = f1();
        return !jVar.S0() ? i1(jVar, hVar, enumSetF1) : e1(jVar, hVar, enumSetF1);
    }

    @Override // p6.l
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public EnumSet f(e6.j jVar, p6.h hVar, EnumSet enumSet) {
        return !jVar.S0() ? i1(jVar, hVar, enumSet) : e1(jVar, hVar, enumSet);
    }

    protected EnumSet i1(e6.j jVar, p6.h hVar, EnumSet enumSet) throws p6.m {
        Boolean bool = this.f28291r;
        if (bool != Boolean.TRUE && (bool != null || !hVar.D0(p6.i.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (EnumSet) hVar.s0(EnumSet.class, jVar);
        }
        if (jVar.N0(e6.m.VALUE_NULL)) {
            return (EnumSet) hVar.q0(this.f28287e, jVar);
        }
        try {
            Enum r32 = (Enum) this.f28288f.e(jVar, hVar);
            if (r32 == null) {
                return enumSet;
            }
            enumSet.add(r32);
            return enumSet;
        } catch (Exception e10) {
            throw p6.m.r(e10, enumSet, enumSet.size());
        }
    }

    @Override // p6.l
    public i7.a j() {
        return i7.a.DYNAMIC;
    }

    public n j1(p6.l lVar, s6.r rVar, Boolean bool) {
        return (Objects.equals(this.f28291r, bool) && this.f28288f == lVar && this.f28289g == lVar) ? this : new n(this, lVar, rVar, bool);
    }

    @Override // p6.l
    public Object k(p6.h hVar) {
        return f1();
    }

    @Override // p6.l
    public boolean q() {
        return this.f28287e.w() == null;
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.Collection;
    }

    @Override // p6.l
    public Boolean s(p6.g gVar) {
        return Boolean.TRUE;
    }

    protected n(n nVar, p6.l lVar, s6.r rVar, Boolean bool) {
        super(nVar);
        this.f28287e = nVar.f28287e;
        this.f28288f = lVar;
        this.f28289g = rVar;
        this.f28290h = t6.q.d(rVar);
        this.f28291r = bool;
    }
}
