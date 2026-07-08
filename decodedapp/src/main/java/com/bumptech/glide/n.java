package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c3.c f5224a = c3.a.b();

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n clone() {
        try {
            return (n) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    final c3.c b() {
        return this.f5224a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return e3.l.d(this.f5224a, ((n) obj).f5224a);
        }
        return false;
    }

    public int hashCode() {
        c3.c cVar = this.f5224a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }
}
