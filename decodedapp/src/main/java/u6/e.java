package u6;

import com.fasterxml.jackson.databind.JavaType;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends z {
    public e(JavaType javaType, s6.w wVar, a7.e eVar, p6.l lVar) {
        super(javaType, wVar, eVar, lVar);
    }

    @Override // p6.l, s6.r
    public Object b(p6.h hVar) {
        return null;
    }

    @Override // u6.z, p6.l, s6.r
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public AtomicReference a(p6.h hVar) {
        return new AtomicReference(this.f28380h.a(hVar));
    }

    @Override // u6.z
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public Object e1(AtomicReference atomicReference) {
        return atomicReference.get();
    }

    @Override // p6.l
    public Object k(p6.h hVar) {
        return a(hVar);
    }

    @Override // u6.z
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public AtomicReference f1(Object obj) {
        return new AtomicReference(obj);
    }

    @Override // u6.z
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public AtomicReference g1(AtomicReference atomicReference, Object obj) {
        atomicReference.set(obj);
        return atomicReference;
    }

    @Override // u6.z
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public e h1(a7.e eVar, p6.l lVar) {
        return new e(this.f28377e, this.f28378f, eVar, lVar);
    }

    @Override // p6.l
    public Boolean s(p6.g gVar) {
        return Boolean.TRUE;
    }
}
