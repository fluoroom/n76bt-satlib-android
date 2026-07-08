package v6;

import com.fasterxml.jackson.databind.JavaType;
import e6.j;
import p6.m;
import x6.u;

/* JADX INFO: loaded from: classes.dex */
public class b extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JavaType f30313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected transient p6.c f30314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected transient u f30315f;

    protected b(j jVar, String str, JavaType javaType) {
        super(jVar, str);
        this.f30313d = javaType;
        this.f30314e = null;
        this.f30315f = null;
    }

    public static b v(e6.g gVar, String str, JavaType javaType) {
        return new b(gVar, str, javaType);
    }

    public static b w(e6.g gVar, String str, p6.c cVar, u uVar) {
        return new b(gVar, str, cVar, uVar);
    }

    public static b x(j jVar, String str, JavaType javaType) {
        return new b(jVar, str, javaType);
    }

    public static b z(j jVar, String str, p6.c cVar, u uVar) {
        return new b(jVar, str, cVar, uVar);
    }

    protected b(e6.g gVar, String str, JavaType javaType) {
        super(gVar, str);
        this.f30313d = javaType;
        this.f30314e = null;
        this.f30315f = null;
    }

    protected b(j jVar, String str, p6.c cVar, u uVar) {
        super(jVar, str);
        this.f30313d = cVar == null ? null : cVar.z();
        this.f30314e = cVar;
        this.f30315f = uVar;
    }

    protected b(e6.g gVar, String str, p6.c cVar, u uVar) {
        super(gVar, str);
        this.f30313d = cVar == null ? null : cVar.z();
        this.f30314e = cVar;
        this.f30315f = uVar;
    }
}
