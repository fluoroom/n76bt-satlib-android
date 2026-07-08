package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0112b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0112b c0112b = new DynamiteModule.b.C0112b();
        int iA = aVar.a(context, str, false);
        c0112b.f7254b = iA;
        c0112b.f7255c = iA != 0 ? 1 : 0;
        return c0112b;
    }
}
