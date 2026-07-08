package u6;

import com.fasterxml.jackson.databind.JavaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class a extends i {
    public a(JavaType javaType, p6.l lVar, a7.e eVar, s6.w wVar) {
        super(javaType, lVar, eVar, wVar);
    }

    @Override // u6.i, u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return eVar.d(jVar, hVar);
    }

    @Override // u6.i
    protected Collection g1(e6.j jVar, p6.h hVar, Collection collection) throws p6.m {
        if (collection == null) {
            collection = new ArrayList();
        }
        Collection collectionG1 = super.g1(jVar, hVar, collection);
        return collectionG1.isEmpty() ? new ArrayBlockingQueue(1, false) : new ArrayBlockingQueue(collectionG1.size(), false, collectionG1);
    }

    @Override // u6.i
    protected Collection k1(p6.h hVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u6.i
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public a o1(p6.l lVar, p6.l lVar2, a7.e eVar, s6.r rVar, Boolean bool) {
        return new a(this.f28256e, lVar2, eVar, this.f28243t, lVar, rVar, bool);
    }

    protected a(JavaType javaType, p6.l lVar, a7.e eVar, s6.w wVar, p6.l lVar2, s6.r rVar, Boolean bool) {
        super(javaType, lVar, eVar, wVar, lVar2, rVar, bool);
    }
}
