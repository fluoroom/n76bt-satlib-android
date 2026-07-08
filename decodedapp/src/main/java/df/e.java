package df;

import ie.c;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class e implements ie.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f10957a = new e();

    private e() {
    }

    private final Void b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // ie.c
    public Map a() {
        b();
        throw new dd.f();
    }

    @Override // ie.c
    public mf.c d() {
        return c.a.a(this);
    }

    @Override // ie.c
    public he.g1 getSource() {
        b();
        throw new dd.f();
    }

    @Override // ie.c
    public eg.r0 getType() {
        b();
        throw new dd.f();
    }

    public String toString() {
        return "[EnhancedType]";
    }
}
