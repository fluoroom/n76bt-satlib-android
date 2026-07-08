package com.google.gson;

import java.util.Set;
import z9.z;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f8817a = new z(false);

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof n) && ((n) obj).f8817a.equals(this.f8817a);
        }
        return true;
    }

    public int hashCode() {
        return this.f8817a.hashCode();
    }

    public void l(String str, k kVar) {
        z zVar = this.f8817a;
        if (kVar == null) {
            kVar = m.f8816a;
        }
        zVar.put(str, kVar);
    }

    public Set m() {
        return this.f8817a.entrySet();
    }

    public k o(String str) {
        return (k) this.f8817a.get(str);
    }

    public boolean p(String str) {
        return this.f8817a.containsKey(str);
    }
}
