package v7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f30455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f30456b;

        /* synthetic */ a(Object obj, w0 w0Var) {
            q.i(obj);
            this.f30456b = obj;
            this.f30455a = new ArrayList();
        }

        public a a(String str, Object obj) {
            q.i(str);
            this.f30455a.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f30456b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f30455a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f30455a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
