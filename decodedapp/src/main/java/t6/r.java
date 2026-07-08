package t6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class r implements s6.r, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p6.y f27534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JavaType f27535b;

    protected r(p6.y yVar, JavaType javaType) {
        this.f27534a = yVar;
        this.f27535b = javaType;
    }

    public static r c(p6.d dVar) {
        return d(dVar, dVar.getType());
    }

    public static r d(p6.d dVar, JavaType javaType) {
        return new r(dVar.a(), javaType);
    }

    public static r e(JavaType javaType) {
        return new r(null, javaType);
    }

    @Override // s6.r
    public Object a(p6.h hVar) throws v6.d {
        throw v6.d.z(hVar, this.f27534a, this.f27535b);
    }

    @Override // s6.r
    public /* synthetic */ Object b(p6.h hVar) {
        return s6.q.a(this, hVar);
    }
}
