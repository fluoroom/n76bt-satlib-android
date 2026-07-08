package vd;

import java.util.Random;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends vd.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f30541c = new a();

    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // vd.a
    public Random d() {
        Object obj = this.f30541c.get();
        m.d(obj, "get(...)");
        return (Random) obj;
    }
}
