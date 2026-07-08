package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends k implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f8683a = new ArrayList();

    private k o() {
        int size = this.f8683a.size();
        if (size == 1) {
            return (k) this.f8683a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    @Override // com.google.gson.k
    public long e() {
        return o().e();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof h) && ((h) obj).f8683a.equals(this.f8683a);
        }
        return true;
    }

    @Override // com.google.gson.k
    public String f() {
        return o().f();
    }

    public int hashCode() {
        return this.f8683a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f8683a.iterator();
    }

    public void l(k kVar) {
        if (kVar == null) {
            kVar = m.f8816a;
        }
        this.f8683a.add(kVar);
    }

    public k m(int i10) {
        return (k) this.f8683a.get(i10);
    }

    public int size() {
        return this.f8683a.size();
    }
}
