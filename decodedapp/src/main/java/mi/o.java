package mi;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Method f22339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadMode f22340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Class f22341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f22342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f22343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f22344f;

    public o(Method method, Class cls, ThreadMode threadMode, int i10, boolean z10) {
        this.f22339a = method;
        this.f22340b = threadMode;
        this.f22341c = cls;
        this.f22342d = i10;
        this.f22343e = z10;
    }

    private synchronized void a() {
        if (this.f22344f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f22339a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f22339a.getName());
            sb2.append('(');
            sb2.append(this.f22341c.getName());
            this.f22344f = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        a();
        o oVar = (o) obj;
        oVar.a();
        return this.f22344f.equals(oVar.f22344f);
    }

    public int hashCode() {
        return this.f22339a.hashCode();
    }
}
