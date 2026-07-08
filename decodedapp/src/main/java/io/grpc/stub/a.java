package io.grpc.stub;

import io.grpc.stub.d;
import io.grpc.stub.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends d {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    protected a(qb.d dVar, qb.c cVar) {
        super(dVar, cVar);
    }

    public static <T extends d> T newStub(d.a aVar, qb.d dVar) {
        return (T) newStub(aVar, dVar, qb.c.f24540l);
    }

    public static <T extends d> T newStub(d.a aVar, qb.d dVar, qb.c cVar) {
        return (T) aVar.newStub(dVar, cVar.v(h.f17285c, h.f.ASYNC));
    }
}
