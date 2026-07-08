package dd;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10916a = new a(null);

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f10917a;

        public b(Throwable th2) {
            rd.m.e(th2, "exception");
            this.f10917a = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && rd.m.a(this.f10917a, ((b) obj).f10917a);
        }

        public int hashCode() {
            return this.f10917a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f10917a + ')';
        }
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f10917a;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }

    public static Object a(Object obj) {
        return obj;
    }
}
