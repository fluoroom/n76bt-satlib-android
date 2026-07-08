package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s0 extends t0 {

    static class b implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map.Entry f10090a;

        public s0 a() {
            return (s0) this.f10090a.getValue();
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f10090a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return null;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof l1) {
                return ((s0) this.f10090a.getValue()).b((l1) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry entry) {
            this.f10090a = entry;
        }
    }

    static class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterator f10091a;

        public c(Iterator it) {
            this.f10091a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.f10091a.next();
            return entry.getValue() instanceof s0 ? new b(entry) : entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10091a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f10091a.remove();
        }
    }

    public abstract l1 d();
}
