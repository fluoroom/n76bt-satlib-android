package u7;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f28445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f28446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile a f28447c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f28448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f28449b;

        a(Object obj, String str) {
            this.f28448a = obj;
            this.f28449b = str;
        }

        public String a() {
            return this.f28449b + "@" + System.identityHashCode(this.f28448a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28448a == aVar.f28448a && this.f28449b.equals(aVar.f28449b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f28448a) * 31) + this.f28449b.hashCode();
        }
    }

    public interface b {
        void a(Object obj);

        void b();
    }

    j(Looper looper, Object obj, String str) {
        this.f28445a = new a8.a(looper);
        this.f28446b = v7.q.j(obj, "Listener must not be null");
        this.f28447c = new a(obj, v7.q.f(str));
    }

    public void a() {
        this.f28446b = null;
        this.f28447c = null;
    }

    public a b() {
        return this.f28447c;
    }

    public void c(final b bVar) {
        v7.q.j(bVar, "Notifier must not be null");
        this.f28445a.execute(new Runnable() { // from class: u7.q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f28492a.d(bVar);
            }
        });
    }

    final void d(b bVar) {
        Object obj = this.f28446b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e10) {
            bVar.b();
            throw e10;
        }
    }
}
