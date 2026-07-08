package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class d implements DynamiteModule.b {
    d() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0112b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0112b c0112b = new DynamiteModule.b.C0112b();
        int iA = aVar.a(context, str, true);
        c0112b.f7254b = iA;
        if (iA != 0) {
            c0112b.f7255c = 1;
            return c0112b;
        }
        int iB = aVar.b(context, str);
        c0112b.f7253a = iB;
        if (iB != 0) {
            c0112b.f7255c = -1;
        }
        return c0112b;
    }
}
