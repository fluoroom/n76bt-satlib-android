package com.google.protobuf;

import com.google.protobuf.l1;
import com.google.protobuf.r;

/* JADX INFO: loaded from: classes3.dex */
public interface i1 extends l1, o1 {

    public interface a extends l1.a, o1 {
        a addRepeatedField(r.g gVar, Object obj);

        i1 build();

        i1 buildPartial();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        r.b getDescriptorForType();

        a getFieldBuilder(r.g gVar);

        a mergeFrom(i1 i1Var);

        a mergeFrom(l lVar);

        a newBuilderForField(r.g gVar);

        a setField(r.g gVar, Object obj);

        a setUnknownFields(t2 t2Var);
    }

    z1 getParserForType();

    a newBuilderForType();

    a toBuilder();
}
