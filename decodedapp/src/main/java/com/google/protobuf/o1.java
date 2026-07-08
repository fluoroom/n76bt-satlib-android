package com.google.protobuf;

import com.google.protobuf.r;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface o1 extends m1 {
    Map getAllFields();

    i1 getDefaultInstanceForType();

    r.b getDescriptorForType();

    Object getField(r.g gVar);

    t2 getUnknownFields();

    boolean hasField(r.g gVar);
}
