package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class h implements DynamiteModule.b {
    h() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0112b a(Context context, String str, DynamiteModule.b.a aVar) {
        int iA;
        DynamiteModule.b.C0112b c0112b = new DynamiteModule.b.C0112b();
        int iB = aVar.b(context, str);
        c0112b.f7253a = iB;
        int i10 = 1;
        int i11 = 0;
        if (iB != 0) {
            iA = aVar.a(context, str, false);
            c0112b.f7254b = iA;
        } else {
            iA = aVar.a(context, str, true);
            c0112b.f7254b = iA;
        }
        int i12 = c0112b.f7253a;
        if (i12 == 0) {
            if (iA == 0) {
                i10 = 0;
            }
            c0112b.f7255c = i10;
            return c0112b;
        }
        i11 = i12;
        if (i11 >= iA) {
            i10 = -1;
        }
        c0112b.f7255c = i10;
        return c0112b;
    }
}
