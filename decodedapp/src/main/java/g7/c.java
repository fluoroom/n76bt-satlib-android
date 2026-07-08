package g7;

import com.fasterxml.jackson.databind.type.ReferenceType;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class c extends z {
    public c(ReferenceType referenceType, boolean z10, a7.h hVar, p6.p pVar) {
        super(referenceType, z10, hVar, pVar);
    }

    @Override // g7.z
    public z H(Object obj, boolean z10) {
        return new c(this, this.f13661d, this.f13662e, this.f13663f, this.f13664g, obj, z10);
    }

    @Override // g7.z
    protected z K(p6.d dVar, a7.h hVar, p6.p pVar, i7.s sVar) {
        return new c(this, dVar, hVar, pVar, sVar, this.f13666r, this.f13667s);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g7.z
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public Object A(AtomicReference atomicReference) {
        return atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g7.z
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public Object C(AtomicReference atomicReference) {
        return atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g7.z
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public boolean D(AtomicReference atomicReference) {
        return atomicReference.get() != null;
    }

    protected c(c cVar, p6.d dVar, a7.h hVar, p6.p pVar, i7.s sVar, Object obj, boolean z10) {
        super(cVar, dVar, hVar, pVar, sVar, obj, z10);
    }
}
