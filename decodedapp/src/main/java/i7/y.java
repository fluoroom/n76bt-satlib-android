package i7;

import com.facebook.stetho.server.http.HttpStatus;
import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class y implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected transient p f15939a = new p(20, HttpStatus.HTTP_OK);

    public p6.y a(JavaType javaType, r6.q qVar) {
        return b(javaType.r(), qVar);
    }

    public p6.y b(Class cls, r6.q qVar) {
        h7.a aVar = new h7.a(cls);
        p6.y yVar = (p6.y) this.f15939a.get(aVar);
        if (yVar != null) {
            return yVar;
        }
        p6.y yVarF0 = qVar.g().f0(qVar.H(cls).s());
        if (yVarF0 == null || !yVarF0.e()) {
            yVarF0 = p6.y.a(cls.getSimpleName());
        }
        this.f15939a.b(aVar, yVarF0);
        return yVarF0;
    }
}
