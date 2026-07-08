package io.grpc.internal;

/* JADX INFO: loaded from: classes3.dex */
abstract class c3 {
    static b3 a() {
        try {
            Class.forName("j$.time.Instant");
            return new d1();
        } catch (ClassNotFoundException unused) {
            return new w();
        }
    }
}
