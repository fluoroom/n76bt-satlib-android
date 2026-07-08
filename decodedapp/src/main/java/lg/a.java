package lg;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Iterable, sd.a {

    /* JADX INFO: renamed from: lg.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0274a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f20573a;

        public AbstractC0274a(int i10) {
            this.f20573a = i10;
        }

        protected final Object c(a aVar) {
            rd.m.e(aVar, "thisRef");
            return aVar.b().get(this.f20573a);
        }
    }

    protected abstract c b();

    protected abstract z c();

    protected abstract void d(String str, Object obj);

    protected final void e(yd.c cVar, Object obj) {
        rd.m.e(cVar, "tClass");
        rd.m.e(obj, "value");
        String strA = cVar.a();
        rd.m.b(strA);
        d(strA, obj);
    }

    public final boolean isEmpty() {
        return b().b() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return b().iterator();
    }
}
