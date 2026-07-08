package ne;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements cf.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22699b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mf.f f22700a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final h a(Object obj, mf.f fVar) {
            rd.m.e(obj, "value");
            return f.l(obj.getClass()) ? new v(fVar, (Enum) obj) : obj instanceof Annotation ? new i(fVar, (Annotation) obj) : obj instanceof Object[] ? new l(fVar, (Object[]) obj) : obj instanceof Class ? new r(fVar, (Class) obj) : new x(fVar, obj);
        }

        private a() {
        }
    }

    public /* synthetic */ h(mf.f fVar, rd.h hVar) {
        this(fVar);
    }

    @Override // cf.b
    public mf.f getName() {
        return this.f22700a;
    }

    private h(mf.f fVar) {
        this.f22700a = fVar;
    }
}
