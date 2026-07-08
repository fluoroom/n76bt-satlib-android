package me;

import he.g1;
import he.h1;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Annotation f21962b;

    public b(Annotation annotation) {
        rd.m.e(annotation, "annotation");
        this.f21962b = annotation;
    }

    @Override // he.g1
    public h1 a() {
        h1 h1Var = h1.f15282a;
        rd.m.d(h1Var, "NO_SOURCE_FILE");
        return h1Var;
    }

    public final Annotation d() {
        return this.f21962b;
    }
}
