package com.benshikj.ii;

import com.dw.grpc.Error;
import com.google.protobuf.p0;

/* JADX INFO: loaded from: classes.dex */
public class GRPC {
    public static Error.Info parseException(Throwable th2) {
        if (Configuration.DEBUG) {
            th2.printStackTrace();
        }
        pa.a aVarB = vb.b.b(th2);
        if (aVarB == null) {
            return null;
        }
        for (com.google.protobuf.f fVar : aVarB.z()) {
            try {
                if (fVar.w(Error.Info.class)) {
                    return (Error.Info) fVar.D(Error.Info.class);
                }
                continue;
            } catch (p0 | RuntimeException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }
}
