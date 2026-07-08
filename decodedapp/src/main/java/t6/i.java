package t6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class i extends s6.u {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final x6.i f27513x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected final transient Field f27514y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected final boolean f27515z;

    public i(x6.u uVar, JavaType javaType, a7.e eVar, i7.b bVar, x6.i iVar) {
        super(uVar, javaType, eVar, bVar);
        this.f27513x = iVar;
        this.f27514y = iVar.b();
        this.f27515z = q.d(this.f26968r);
    }

    @Override // s6.u
    public void L(Object obj, Object obj2) throws IOException {
        try {
            this.f27514y.set(obj, obj2);
        } catch (Exception e10) {
            j(e10, obj2);
        }
    }

    @Override // s6.u
    public Object N(Object obj, Object obj2) throws IOException {
        try {
            this.f27514y.set(obj, obj2);
            return obj;
        } catch (Exception e10) {
            j(e10, obj2);
            return obj;
        }
    }

    @Override // s6.u
    public s6.u T(p6.y yVar) {
        return new i(this, yVar);
    }

    @Override // s6.u
    public s6.u W(s6.r rVar) {
        return new i(this, this.f26966g, rVar);
    }

    @Override // s6.u
    public s6.u Y(p6.l lVar) {
        p6.l lVar2 = this.f26966g;
        if (lVar2 == lVar) {
            return this;
        }
        s6.r rVar = this.f26968r;
        if (lVar2 == rVar) {
            rVar = lVar;
        }
        return new i(this, lVar, rVar);
    }

    @Override // s6.u, p6.d
    public x6.k h() {
        return this.f27513x;
    }

    @Override // s6.u
    public void n(e6.j jVar, p6.h hVar, Object obj) throws IOException {
        Object objG;
        if (!jVar.N0(e6.m.VALUE_NULL)) {
            a7.e eVar = this.f26967h;
            if (eVar == null) {
                Object objE = this.f26966g.e(jVar, hVar);
                if (objE != null) {
                    objG = objE;
                } else if (this.f27515z) {
                    return;
                } else {
                    objG = this.f26968r.a(hVar);
                }
            } else {
                objG = this.f26966g.g(jVar, hVar, eVar);
            }
        } else if (this.f27515z) {
            return;
        } else {
            objG = this.f26968r.a(hVar);
        }
        try {
            this.f27514y.set(obj, objG);
        } catch (Exception e10) {
            i(jVar, e10, objG);
        }
    }

    @Override // s6.u
    public Object o(e6.j jVar, p6.h hVar, Object obj) throws IOException {
        Object objG;
        if (jVar.N0(e6.m.VALUE_NULL)) {
            if (!this.f27515z) {
                objG = this.f26968r.a(hVar);
                try {
                    this.f27514y.set(obj, objG);
                    return obj;
                } catch (Exception e10) {
                    i(jVar, e10, objG);
                    return obj;
                }
            }
            return obj;
        }
        a7.e eVar = this.f26967h;
        if (eVar == null) {
            Object objE = this.f26966g.e(jVar, hVar);
            if (objE == null) {
                if (!this.f27515z) {
                    objG = this.f26968r.a(hVar);
                }
                return obj;
            }
            objG = objE;
        } else {
            objG = this.f26966g.g(jVar, hVar, eVar);
        }
        this.f27514y.set(obj, objG);
        return obj;
    }

    @Override // s6.u
    public void q(p6.g gVar) {
        i7.h.g(this.f27514y, gVar.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    protected i(i iVar, p6.l lVar, s6.r rVar) {
        super(iVar, lVar, rVar);
        this.f27513x = iVar.f27513x;
        this.f27514y = iVar.f27514y;
        this.f27515z = q.d(rVar);
    }

    protected i(i iVar, p6.y yVar) {
        super(iVar, yVar);
        this.f27513x = iVar.f27513x;
        this.f27514y = iVar.f27514y;
        this.f27515z = iVar.f27515z;
    }
}
