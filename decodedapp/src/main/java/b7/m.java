package b7;

import a7.c;
import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public final class m extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f3704a = new m();

    @Override // a7.c
    public c.b a(r6.q qVar, JavaType javaType) {
        return c.b.INDETERMINATE;
    }

    @Override // a7.c
    public c.b b(r6.q qVar, JavaType javaType, String str) {
        return c.b.ALLOWED;
    }

    @Override // a7.c
    public c.b c(r6.q qVar, JavaType javaType, JavaType javaType2) {
        return c.b.ALLOWED;
    }
}
