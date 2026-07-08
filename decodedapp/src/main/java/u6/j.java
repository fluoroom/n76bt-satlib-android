package u6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final JavaType f28256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final s6.r f28257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final boolean f28258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Boolean f28259h;

    protected j(JavaType javaType, s6.r rVar, Boolean bool) {
        super(javaType);
        this.f28256e = javaType;
        this.f28259h = bool;
        this.f28257f = rVar;
        this.f28258g = t6.q.d(rVar);
    }

    @Override // u6.c0
    public JavaType X0() {
        return this.f28256e;
    }

    public abstract p6.l e1();

    protected Object f1(p6.h hVar, Throwable th2, Object obj, String str) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        i7.h.i0(th2);
        if (hVar != null && !hVar.D0(p6.i.WRAP_EXCEPTIONS)) {
            i7.h.k0(th2);
        }
        if (!(th2 instanceof IOException) || (th2 instanceof p6.m)) {
            throw p6.m.s(th2, obj, (String) i7.h.Z(str, "N/A"));
        }
        throw ((IOException) th2);
    }

    @Override // p6.l
    public s6.u i(String str) {
        p6.l lVarE1 = e1();
        if (lVarE1 != null) {
            return lVarE1.i(str);
        }
        throw new IllegalArgumentException(String.format("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", str, getClass().getName()));
    }

    @Override // p6.l
    public i7.a j() {
        return i7.a.DYNAMIC;
    }

    @Override // p6.l
    public Object k(p6.h hVar) throws v6.b {
        s6.w wVarW0 = W0();
        if (wVarW0 == null || !wVarW0.j()) {
            JavaType javaTypeX0 = X0();
            hVar.q(javaTypeX0, String.format("Cannot create empty instance of %s, no default Creator", javaTypeX0));
        }
        try {
            return wVarW0.A(hVar);
        } catch (IOException e10) {
            return i7.h.h0(hVar, e10);
        }
    }

    @Override // p6.l
    public Boolean s(p6.g gVar) {
        return Boolean.TRUE;
    }

    protected j(JavaType javaType) {
        this(javaType, (s6.r) null, (Boolean) null);
    }

    protected j(j jVar) {
        this(jVar, jVar.f28257f, jVar.f28259h);
    }

    protected j(j jVar, s6.r rVar, Boolean bool) {
        super(jVar.f28256e);
        this.f28256e = jVar.f28256e;
        this.f28257f = rVar;
        this.f28259h = bool;
        this.f28258g = t6.q.d(rVar);
    }
}
