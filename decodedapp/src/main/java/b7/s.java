package b7;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public abstract class s implements a7.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.fasterxml.jackson.databind.type.c f3727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JavaType f3728b;

    protected s() {
        this(null, null);
    }

    @Override // a7.f
    public String f() {
        return e(null, this.f3728b.r());
    }

    protected s(JavaType javaType, com.fasterxml.jackson.databind.type.c cVar) {
        this.f3728b = javaType;
        this.f3727a = cVar;
    }

    @Override // a7.f
    public void c(JavaType javaType) {
    }
}
