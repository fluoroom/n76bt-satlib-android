package com.google.protobuf;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes3.dex */
abstract class q0 {
    static void a(Buffer buffer, int i10) {
        buffer.limit(i10);
    }

    static void b(Buffer buffer, int i10) {
        buffer.position(i10);
    }
}
