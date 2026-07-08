package l1;

import android.os.Bundle;
import l1.b;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m1.b f20325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b.C0271b f20326b;

    public interface a {
        void a(i iVar);
    }

    public interface b {
        Bundle a();
    }

    public f(m1.b bVar) {
        rd.m.e(bVar, "impl");
        this.f20325a = bVar;
    }

    public final Bundle a(String str) {
        rd.m.e(str, "key");
        return this.f20325a.c(str);
    }

    public final b b(String str) {
        rd.m.e(str, "key");
        return this.f20325a.d(str);
    }

    public final void c(String str, b bVar) {
        rd.m.e(str, "key");
        rd.m.e(bVar, "provider");
        this.f20325a.j(str, bVar);
    }

    public final void d(Class cls) {
        rd.m.e(cls, "clazz");
        if (!this.f20325a.e()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        b.C0271b c0271b = this.f20326b;
        if (c0271b == null) {
            c0271b = new b.C0271b(this);
        }
        this.f20326b = c0271b;
        try {
            cls.getDeclaredConstructor(null);
            b.C0271b c0271b2 = this.f20326b;
            if (c0271b2 != null) {
                String name = cls.getName();
                rd.m.d(name, "getName(...)");
                c0271b2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
