package b7;

import com.fasterxml.jackson.databind.JavaType;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Map;
import u6.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends a7.e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a7.f f3719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JavaType f3720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final p6.d f3721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JavaType f3722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final String f3723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final boolean f3724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Map f3725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected p6.l f3726h;

    protected r(JavaType javaType, a7.f fVar, String str, boolean z10, JavaType javaType2) {
        this.f3720b = javaType;
        this.f3719a = fVar;
        this.f3723e = i7.h.a0(str);
        this.f3724f = z10;
        this.f3725g = new ConcurrentHashMap(16, 0.75f, 2);
        this.f3722d = javaType2;
        this.f3721c = null;
    }

    @Override // a7.e
    public Class h() {
        return i7.h.e0(this.f3722d);
    }

    @Override // a7.e
    public final String i() {
        return this.f3723e;
    }

    @Override // a7.e
    public a7.f j() {
        return this.f3719a;
    }

    @Override // a7.e
    public boolean l() {
        return this.f3722d != null;
    }

    protected Object n(e6.j jVar, p6.h hVar, Object obj) throws p6.m {
        p6.l lVarP;
        if (obj == null) {
            lVarP = o(hVar);
            if (lVarP == null) {
                return hVar.P0(s(), "No (native) type id found when one was expected for polymorphic type handling", new Object[0]);
            }
        } else {
            lVarP = p(hVar, obj instanceof String ? (String) obj : String.valueOf(obj));
        }
        return lVarP.e(jVar, hVar);
    }

    protected final p6.l o(p6.h hVar) {
        p6.l lVar;
        JavaType javaType = this.f3722d;
        if (javaType == null) {
            if (hVar.D0(p6.i.FAIL_ON_INVALID_SUBTYPE)) {
                return null;
            }
            return v.f28341e;
        }
        if (i7.h.J(javaType.r())) {
            return v.f28341e;
        }
        synchronized (this.f3722d) {
            try {
                if (this.f3726h == null) {
                    this.f3726h = hVar.Q(this.f3722d, this.f3721c);
                }
                lVar = this.f3726h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    protected final p6.l p(p6.h hVar, String str) throws p6.m {
        p6.l lVarQ = (p6.l) this.f3725g.get(str);
        if (lVarQ == null) {
            JavaType javaTypeD = this.f3719a.d(hVar, str);
            if (javaTypeD == null) {
                lVarQ = o(hVar);
                if (lVarQ == null) {
                    JavaType javaTypeR = r(hVar, str);
                    if (javaTypeR == null) {
                        return v.f28341e;
                    }
                    lVarQ = hVar.Q(javaTypeR, this.f3721c);
                }
            } else {
                JavaType javaType = this.f3720b;
                if (javaType != null && javaType.getClass() == javaTypeD.getClass() && !javaTypeD.z()) {
                    try {
                        javaTypeD = hVar.D(this.f3720b, javaTypeD.r());
                    } catch (IllegalArgumentException e10) {
                        throw hVar.n(this.f3720b, str, e10.getMessage());
                    }
                }
                lVarQ = hVar.Q(javaTypeD, this.f3721c);
            }
            this.f3725g.put(str, lVarQ);
        }
        return lVarQ;
    }

    protected JavaType q(p6.h hVar, String str) {
        return hVar.n0(this.f3720b, this.f3719a, str);
    }

    protected JavaType r(p6.h hVar, String str) {
        String str2;
        String strB = this.f3719a.b();
        if (strB == null) {
            str2 = "type ids are not statically known";
        } else {
            str2 = "known type ids = " + strB;
        }
        p6.d dVar = this.f3721c;
        if (dVar != null) {
            str2 = String.format("%s (for POJO property '%s')", str2, dVar.getName());
        }
        return hVar.v0(this.f3720b, str, this.f3719a, str2);
    }

    public JavaType s() {
        return this.f3720b;
    }

    public String t() {
        return this.f3720b.r().getName();
    }

    public String toString() {
        return '[' + getClass().getName() + "; base-type:" + this.f3720b + "; id-resolver: " + this.f3719a + ']';
    }

    protected r(r rVar, p6.d dVar) {
        this.f3720b = rVar.f3720b;
        this.f3719a = rVar.f3719a;
        this.f3723e = rVar.f3723e;
        this.f3724f = rVar.f3724f;
        this.f3725g = rVar.f3725g;
        this.f3722d = rVar.f3722d;
        this.f3726h = rVar.f3726h;
        this.f3721c = dVar;
    }
}
