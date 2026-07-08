package u6;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet f28319a = new HashSet();

    static {
        Class[] clsArr = {UUID.class, AtomicBoolean.class, AtomicInteger.class, AtomicLong.class, StackTraceElement.class, ByteBuffer.class, Void.class};
        for (int i10 = 0; i10 < 7; i10++) {
            f28319a.add(clsArr[i10].getName());
        }
        for (Class cls : p.l1()) {
            f28319a.add(cls.getName());
        }
    }

    public static p6.l a(p6.h hVar, Class cls, String str) {
        if (!f28319a.contains(str)) {
            return null;
        }
        p pVarK1 = p.k1(cls);
        if (pVarK1 != null) {
            return pVarK1;
        }
        if (cls == UUID.class) {
            return new n0();
        }
        if (cls == StackTraceElement.class) {
            return a0.e1(hVar);
        }
        if (cls == AtomicBoolean.class) {
            return new b();
        }
        if (cls == AtomicInteger.class) {
            return new c();
        }
        if (cls == AtomicLong.class) {
            return new d();
        }
        if (cls == ByteBuffer.class) {
            return new h();
        }
        if (cls == Void.class) {
            return v.f28341e;
        }
        return null;
    }
}
