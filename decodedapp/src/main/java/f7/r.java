package f7;

import com.fasterxml.jackson.databind.JavaType;
import g7.i0;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class r extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JavaType f12885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String f12886d;

    public r(JavaType javaType, String str) {
        super(Object.class);
        this.f12885c = javaType;
        this.f12886d = str;
    }

    @Override // g7.i0, p6.p
    public void f(Object obj, e6.g gVar, d0 d0Var) throws v6.b {
        d0Var.q(this.f12885c, this.f12886d);
    }
}
