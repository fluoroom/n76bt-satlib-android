package me;

import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(mf.b bVar) {
        String strE = q.E(bVar.g().a(), '.', '$', false, 4, null);
        if (bVar.f().c()) {
            return strE;
        }
        return bVar.f() + '.' + strE;
    }
}
