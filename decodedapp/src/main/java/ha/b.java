package ha;

import android.os.Handler;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    protected final o8.c f15190a;

    /* JADX INFO: renamed from: b */
    private final Map f15191b = new HashMap();

    /* JADX INFO: renamed from: c */
    protected final Map f15192c = new HashMap();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.n();
        }
    }

    /* JADX INFO: renamed from: ha.b$b */
    public class C0213b {

        /* JADX INFO: renamed from: a */
        private final Set f15194a = new LinkedHashSet();

        public C0213b() {
        }

        protected void a(Object obj) {
            this.f15194a.add(obj);
            b.this.f15192c.put(obj, this);
        }

        public void b() {
            for (Object obj : this.f15194a) {
                b.this.m(obj);
                b.this.f15192c.remove(obj);
            }
            this.f15194a.clear();
        }

        protected Collection c() {
            return DesugarCollections.unmodifiableCollection(this.f15194a);
        }

        protected boolean d(Object obj) {
            if (!this.f15194a.remove(obj)) {
                return false;
            }
            b.this.f15192c.remove(obj);
            b.this.m(obj);
            return true;
        }
    }

    public b(o8.c cVar) {
        this.f15190a = cVar;
        new Handler(Looper.getMainLooper()).post(new a());
    }

    public boolean l(Object obj) {
        C0213b c0213b = (C0213b) this.f15192c.get(obj);
        return c0213b != null && c0213b.d(obj);
    }

    protected abstract void m(Object obj);

    abstract void n();
}
