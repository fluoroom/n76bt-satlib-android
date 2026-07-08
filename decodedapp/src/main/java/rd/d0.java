package rd;

/* JADX INFO: loaded from: classes3.dex */
public class d0 {
    public yd.c b(Class cls) {
        return new f(cls);
    }

    public yd.e c(Class cls, String str) {
        return new s(cls, str);
    }

    public String g(j jVar) {
        String string = jVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String h(o oVar) {
        return g(oVar);
    }

    public yd.f a(k kVar) {
        return kVar;
    }

    public yd.h d(p pVar) {
        return pVar;
    }

    public yd.k e(t tVar) {
        return tVar;
    }

    public yd.l f(v vVar) {
        return vVar;
    }
}
