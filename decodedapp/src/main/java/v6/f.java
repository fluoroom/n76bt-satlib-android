package v6;

import com.fasterxml.jackson.databind.JavaType;
import e6.j;
import p6.m;

/* JADX INFO: loaded from: classes.dex */
public class f extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Class f30320d;

    protected f(j jVar, String str) {
        this(jVar, str, (JavaType) null);
    }

    public static f v(j jVar, JavaType javaType, String str) {
        return new f(jVar, str, javaType);
    }

    public static f w(j jVar, Class cls, String str) {
        return new f(jVar, str, cls);
    }

    public f x(JavaType javaType) {
        this.f30320d = javaType.r();
        return this;
    }

    protected f(j jVar, String str, e6.h hVar) {
        super(jVar, str, hVar);
    }

    protected f(j jVar, String str, Class cls) {
        super(jVar, str);
        this.f30320d = cls;
    }

    protected f(j jVar, String str, JavaType javaType) {
        super(jVar, str);
        this.f30320d = i7.h.e0(javaType);
    }
}
