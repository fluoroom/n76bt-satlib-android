package t6;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f27550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f27551b;

    static final class a extends x {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final s6.t f27552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final String f27553d;

        public a(x xVar, Object obj, s6.t tVar, String str) {
            super(xVar, obj);
            this.f27552c = tVar;
            this.f27553d = str;
        }

        @Override // t6.x
        public void a(Object obj) throws IOException {
            this.f27552c.o(obj, this.f27553d, this.f27551b);
        }
    }

    static final class b extends x {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f27554c;

        public b(x xVar, Object obj, Object obj2) {
            super(xVar, obj);
            this.f27554c = obj2;
        }

        @Override // t6.x
        public void a(Object obj) {
            ((Map) obj).put(this.f27554c, this.f27551b);
        }
    }

    static final class c extends x {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final s6.u f27555c;

        public c(x xVar, Object obj, s6.u uVar) {
            super(xVar, obj);
            this.f27555c = uVar;
        }

        @Override // t6.x
        public void a(Object obj) {
            this.f27555c.L(obj, this.f27551b);
        }
    }

    protected x(x xVar, Object obj) {
        this.f27550a = xVar;
        this.f27551b = obj;
    }

    public abstract void a(Object obj);
}
