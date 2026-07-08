package s6;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final o[] f26948a = new o[0];

    public abstract p6.l a(p6.h hVar, ArrayType arrayType, p6.c cVar);

    public abstract p6.l b(p6.h hVar, JavaType javaType, p6.c cVar);

    public abstract p6.l c(p6.h hVar, JavaType javaType, p6.c cVar, Class cls);

    public abstract p6.l d(p6.h hVar, CollectionType collectionType, p6.c cVar);

    public abstract p6.l e(p6.h hVar, CollectionLikeType collectionLikeType, p6.c cVar);

    public abstract p6.l f(p6.h hVar, JavaType javaType, p6.c cVar);

    public abstract p6.q g(p6.h hVar, JavaType javaType);

    public abstract p6.l h(p6.h hVar, MapType mapType, p6.c cVar);

    public abstract p6.l i(p6.h hVar, MapLikeType mapLikeType, p6.c cVar);

    public abstract p6.l j(p6.h hVar, ReferenceType referenceType, p6.c cVar);

    public abstract p6.l k(p6.g gVar, JavaType javaType, p6.c cVar);

    public abstract a7.e l(p6.g gVar, JavaType javaType);

    public abstract JavaType n(p6.g gVar, JavaType javaType);

    public abstract n o(o oVar);
}
