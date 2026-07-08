package p6;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    public interface a {
        void a(Class cls, Class cls2);

        void b(a7.b... bVarArr);

        void c(s6.o oVar);
    }

    public Iterable a() {
        return Collections.EMPTY_LIST;
    }

    public abstract String b();

    public Object c() {
        return getClass().getName();
    }

    public abstract void d(a aVar);

    public abstract e6.x e();
}
