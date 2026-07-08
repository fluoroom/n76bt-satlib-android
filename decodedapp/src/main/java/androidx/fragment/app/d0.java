package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.m;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a */
    private final s f2190a;

    /* JADX INFO: renamed from: b */
    private final ClassLoader f2191b;

    /* JADX INFO: renamed from: d */
    int f2193d;

    /* JADX INFO: renamed from: e */
    int f2194e;

    /* JADX INFO: renamed from: f */
    int f2195f;

    /* JADX INFO: renamed from: g */
    int f2196g;

    /* JADX INFO: renamed from: h */
    int f2197h;

    /* JADX INFO: renamed from: i */
    boolean f2198i;

    /* JADX INFO: renamed from: k */
    String f2200k;

    /* JADX INFO: renamed from: l */
    int f2201l;

    /* JADX INFO: renamed from: m */
    CharSequence f2202m;

    /* JADX INFO: renamed from: n */
    int f2203n;

    /* JADX INFO: renamed from: o */
    CharSequence f2204o;

    /* JADX INFO: renamed from: p */
    ArrayList f2205p;

    /* JADX INFO: renamed from: q */
    ArrayList f2206q;

    /* JADX INFO: renamed from: s */
    ArrayList f2208s;

    /* JADX INFO: renamed from: c */
    ArrayList f2192c = new ArrayList();

    /* JADX INFO: renamed from: j */
    boolean f2199j = true;

    /* JADX INFO: renamed from: r */
    boolean f2207r = false;

    static final class a {

        /* JADX INFO: renamed from: a */
        int f2209a;

        /* JADX INFO: renamed from: b */
        o f2210b;

        /* JADX INFO: renamed from: c */
        boolean f2211c;

        /* JADX INFO: renamed from: d */
        int f2212d;

        /* JADX INFO: renamed from: e */
        int f2213e;

        /* JADX INFO: renamed from: f */
        int f2214f;

        /* JADX INFO: renamed from: g */
        int f2215g;

        /* JADX INFO: renamed from: h */
        m.b f2216h;

        /* JADX INFO: renamed from: i */
        m.b f2217i;

        a() {
        }

        a(int i10, o oVar) {
            this.f2209a = i10;
            this.f2210b = oVar;
            this.f2211c = false;
            m.b bVar = m.b.f2655e;
            this.f2216h = bVar;
            this.f2217i = bVar;
        }

        a(int i10, o oVar, boolean z10) {
            this.f2209a = i10;
            this.f2210b = oVar;
            this.f2211c = z10;
            m.b bVar = m.b.f2655e;
            this.f2216h = bVar;
            this.f2217i = bVar;
        }

        a(int i10, o oVar, m.b bVar) {
            this.f2209a = i10;
            this.f2210b = oVar;
            this.f2211c = false;
            this.f2216h = oVar.f2381d0;
            this.f2217i = bVar;
        }
    }

    d0(s sVar, ClassLoader classLoader) {
        this.f2190a = sVar;
        this.f2191b = classLoader;
    }

    public d0 b(int i10, o oVar) {
        n(i10, oVar, null, 1);
        return this;
    }

    public d0 c(int i10, o oVar, String str) {
        n(i10, oVar, str, 1);
        return this;
    }

    public final d0 d(ViewGroup viewGroup, o oVar, String str) {
        oVar.S = viewGroup;
        oVar.A = true;
        return c(viewGroup.getId(), oVar, str);
    }

    public d0 e(o oVar, String str) {
        n(0, oVar, str, 1);
        return this;
    }

    void f(a aVar) {
        this.f2192c.add(aVar);
        aVar.f2212d = this.f2193d;
        aVar.f2213e = this.f2194e;
        aVar.f2214f = this.f2195f;
        aVar.f2215g = this.f2196g;
    }

    public d0 g(o oVar) {
        f(new a(7, oVar));
        return this;
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public d0 l(o oVar) {
        f(new a(6, oVar));
        return this;
    }

    public d0 m() {
        if (this.f2198i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2199j = false;
        return this;
    }

    void n(int i10, o oVar, String str, int i11) {
        String str2 = oVar.f2379c0;
        if (str2 != null) {
            z0.c.f(oVar, str2);
        }
        Class<?> cls = oVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = oVar.K;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + oVar + ": was " + oVar.K + " now " + str);
            }
            oVar.K = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + oVar + " with tag " + str + " to container view with no id");
            }
            int i12 = oVar.I;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + oVar + ": was " + oVar.I + " now " + i10);
            }
            oVar.I = i10;
            oVar.J = i10;
        }
        f(new a(i11, oVar));
    }

    public d0 o(o oVar) {
        f(new a(3, oVar));
        return this;
    }

    public d0 p(int i10, o oVar) {
        return q(i10, oVar, null);
    }

    public d0 q(int i10, o oVar, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        n(i10, oVar, str, 2);
        return this;
    }

    d0 r(boolean z10, Runnable runnable) {
        if (!z10) {
            m();
        }
        if (this.f2208s == null) {
            this.f2208s = new ArrayList();
        }
        this.f2208s.add(runnable);
        return this;
    }

    public d0 s(o oVar, m.b bVar) {
        f(new a(10, oVar, bVar));
        return this;
    }

    public d0 t(boolean z10) {
        this.f2207r = z10;
        return this;
    }
}
