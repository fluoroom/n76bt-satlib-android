package t6;

import com.fasterxml.jackson.databind.JavaType;
import p6.d;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final Object f27498f;

    public e0(p6.y yVar, JavaType javaType, x6.k kVar, Object obj) {
        super(yVar, javaType, null, kVar, p6.x.f24068r);
        this.f27498f = obj;
    }

    public Object c(p6.h hVar, Object obj) {
        return hVar.R(this.f27498f, this, obj);
    }

    public void g(p6.h hVar, Object obj) {
        this.f23958e.p(obj, c(hVar, obj));
    }
}
