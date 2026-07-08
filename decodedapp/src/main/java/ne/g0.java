package ne;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends u implements cf.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f22695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Annotation[] f22696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f22698d;

    public g0(e0 e0Var, Annotation[] annotationArr, String str, boolean z10) {
        rd.m.e(e0Var, "type");
        rd.m.e(annotationArr, "reflectAnnotations");
        this.f22695a = e0Var;
        this.f22696b = annotationArr;
        this.f22697c = str;
        this.f22698d = z10;
    }

    @Override // cf.b0
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public e0 getType() {
        return this.f22695a;
    }

    @Override // cf.b0
    public boolean b() {
        return this.f22698d;
    }

    @Override // cf.b0
    public mf.f getName() {
        String str = this.f22697c;
        if (str != null) {
            return mf.f.g(str);
        }
        return null;
    }

    @Override // cf.d
    public boolean m() {
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g0.class.getName());
        sb2.append(": ");
        sb2.append(b() ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }

    @Override // cf.d
    public g a(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        return k.a(this.f22696b, cVar);
    }

    @Override // cf.d
    public List getAnnotations() {
        return k.b(this.f22696b);
    }
}
