package d6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 implements Serializable {

    public static final class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f10761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f10762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f10763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f10764d;

        public a(Class cls, Class cls2, Object obj) {
            if (obj == null) {
                throw new IllegalArgumentException("Can not construct IdKey for null key");
            }
            this.f10761a = cls;
            this.f10762b = cls2;
            this.f10763c = obj;
            int iHashCode = obj.hashCode() + cls.getName().hashCode();
            this.f10764d = cls2 != null ? iHashCode ^ cls2.getName().hashCode() : iHashCode;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f10763c.equals(this.f10763c) && aVar.f10761a == this.f10761a && aVar.f10762b == this.f10762b;
        }

        public int hashCode() {
            return this.f10764d;
        }

        public String toString() {
            Object obj = this.f10763c;
            Class cls = this.f10761a;
            String name = cls == null ? "NONE" : cls.getName();
            Class cls2 = this.f10762b;
            return String.format("[ObjectId: key=%s, type=%s, scope=%s]", obj, name, cls2 != null ? cls2.getName() : "NONE");
        }
    }

    public abstract boolean a(k0 k0Var);

    public abstract k0 b(Class cls);

    public abstract Object c(Object obj);

    public abstract Class d();

    public boolean e(String str, Object obj) {
        return false;
    }

    public abstract a f(Object obj);

    public boolean g() {
        return false;
    }

    public abstract k0 h(Object obj);
}
