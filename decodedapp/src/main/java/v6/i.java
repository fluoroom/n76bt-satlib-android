package v6;

import com.fasterxml.jackson.databind.JavaType;
import e6.j;
import p6.m;

/* JADX INFO: loaded from: classes.dex */
public class i extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JavaType f30325d;

    protected i(j jVar, String str, JavaType javaType, Throwable th2) {
        super(jVar, str, th2);
        this.f30325d = javaType;
    }

    public static i v(j jVar, String str, JavaType javaType, Throwable th2) {
        return new i(jVar, str, javaType, th2);
    }
}
