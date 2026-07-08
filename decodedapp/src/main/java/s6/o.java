package s6;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* JADX INFO: loaded from: classes.dex */
public interface o {

    public static abstract class a implements o {
    }

    p6.l a(CollectionType collectionType, p6.g gVar, p6.c cVar, a7.e eVar, p6.l lVar);

    p6.l b(Class cls, p6.g gVar, p6.c cVar);

    p6.l c(JavaType javaType, p6.g gVar, p6.c cVar);

    p6.l d(ReferenceType referenceType, p6.g gVar, p6.c cVar, a7.e eVar, p6.l lVar);

    p6.l e(ArrayType arrayType, p6.g gVar, p6.c cVar, a7.e eVar, p6.l lVar);

    p6.l f(Class cls, p6.g gVar, p6.c cVar);

    p6.l g(CollectionLikeType collectionLikeType, p6.g gVar, p6.c cVar, a7.e eVar, p6.l lVar);

    p6.l h(MapType mapType, p6.g gVar, p6.c cVar, p6.q qVar, a7.e eVar, p6.l lVar);

    p6.l i(MapLikeType mapLikeType, p6.g gVar, p6.c cVar, p6.q qVar, a7.e eVar, p6.l lVar);
}
