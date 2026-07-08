package t6;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends u6.c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final JavaType f27478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final String f27479f;

    public c0(JavaType javaType, String str) {
        super(javaType);
        this.f27478e = javaType;
        this.f27479f = str;
    }

    @Override // p6.l
    public Object e(e6.j jVar, p6.h hVar) throws v6.b {
        Object objH0;
        if (jVar.n() == e6.m.VALUE_EMBEDDED_OBJECT && ((objH0 = jVar.h0()) == null || this.f27478e.r().isAssignableFrom(objH0.getClass()))) {
            return objH0;
        }
        hVar.q(this.f27478e, this.f27479f);
        return null;
    }
}
