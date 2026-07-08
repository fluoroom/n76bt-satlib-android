package b7;

import com.fasterxml.jackson.databind.JavaType;
import d6.e0;

/* JADX INFO: loaded from: classes.dex */
public class f extends a {
    public f(JavaType javaType, a7.f fVar, String str, boolean z10, JavaType javaType2) {
        super(javaType, fVar, str, z10, javaType2);
    }

    @Override // b7.a, a7.e
    public a7.e g(p6.d dVar) {
        return dVar == this.f3721c ? this : new f(this, dVar);
    }

    @Override // b7.a, a7.e
    public e0.a k() {
        return e0.a.EXTERNAL_PROPERTY;
    }

    @Override // b7.a
    protected boolean x() {
        return true;
    }

    public f(f fVar, p6.d dVar) {
        super(fVar, dVar);
    }
}
