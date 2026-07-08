package v6;

import com.fasterxml.jackson.databind.JavaType;
import e6.j;

/* JADX INFO: loaded from: classes.dex */
public class e extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final JavaType f30318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final String f30319f;

    public e(j jVar, String str, JavaType javaType, String str2) {
        super(jVar, str);
        this.f30318e = javaType;
        this.f30319f = str2;
    }

    public static e z(j jVar, String str, JavaType javaType, String str2) {
        return new e(jVar, str, javaType, str2);
    }
}
