package ne;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends h implements cf.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Annotation f22704c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(mf.f fVar, Annotation annotation) {
        super(fVar, null);
        rd.m.e(annotation, "annotation");
        this.f22704c = annotation;
    }

    @Override // cf.c
    public cf.a getAnnotation() {
        return new g(this.f22704c);
    }
}
