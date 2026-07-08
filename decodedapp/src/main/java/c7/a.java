package c7;

import a7.e;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import java.io.Serializable;
import java.util.HashMap;
import p6.c;
import p6.g;
import p6.l;
import p6.q;
import s6.o;

/* JADX INFO: loaded from: classes.dex */
public class a extends o.a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected HashMap f4465a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f4466b = false;

    private final l j(JavaType javaType) {
        HashMap map = this.f4465a;
        if (map == null) {
            return null;
        }
        return (l) map.get(new h7.a(javaType.r()));
    }

    @Override // s6.o
    public l a(CollectionType collectionType, g gVar, c cVar, e eVar, l lVar) {
        return j(collectionType);
    }

    @Override // s6.o
    public l b(Class cls, g gVar, c cVar) {
        HashMap map = this.f4465a;
        if (map == null) {
            return null;
        }
        l lVar = (l) map.get(new h7.a(cls));
        return (lVar == null && this.f4466b && cls.isEnum()) ? (l) this.f4465a.get(new h7.a(Enum.class)) : lVar;
    }

    @Override // s6.o
    public l c(JavaType javaType, g gVar, c cVar) {
        return j(javaType);
    }

    @Override // s6.o
    public l d(ReferenceType referenceType, g gVar, c cVar, e eVar, l lVar) {
        return j(referenceType);
    }

    @Override // s6.o
    public l e(ArrayType arrayType, g gVar, c cVar, e eVar, l lVar) {
        return j(arrayType);
    }

    @Override // s6.o
    public l f(Class cls, g gVar, c cVar) {
        HashMap map = this.f4465a;
        if (map == null) {
            return null;
        }
        return (l) map.get(new h7.a(cls));
    }

    @Override // s6.o
    public l g(CollectionLikeType collectionLikeType, g gVar, c cVar, e eVar, l lVar) {
        return j(collectionLikeType);
    }

    @Override // s6.o
    public l h(MapType mapType, g gVar, c cVar, q qVar, e eVar, l lVar) {
        return j(mapType);
    }

    @Override // s6.o
    public l i(MapLikeType mapLikeType, g gVar, c cVar, q qVar, e eVar, l lVar) {
        return j(mapLikeType);
    }

    public void k(Class cls, l lVar) {
        h7.a aVar = new h7.a(cls);
        if (this.f4465a == null) {
            this.f4465a = new HashMap();
        }
        this.f4465a.put(aVar, lVar);
        if (cls == Enum.class) {
            this.f4466b = true;
        }
    }
}
