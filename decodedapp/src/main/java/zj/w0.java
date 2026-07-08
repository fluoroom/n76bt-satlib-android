package zj;

import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.List;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class w0 implements i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final w0 f33555c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33557b;

    private static class b extends w0 {
        private b() {
            super();
        }

        @Override // zj.w0, zj.i1
        public int a() {
            return 0;
        }

        @Override // zj.w0, zj.i1
        public Stream b(yj.b bVar) {
            throw new hj.g(hj.f.NO_CACHED_ENTRIES, new Object[0]);
        }

        @Override // zj.w0
        public List e() {
            return Collections.EMPTY_LIST;
        }

        @Override // zj.w0
        public yj.g0 f() {
            throw new hj.d(hj.f.NO_CACHED_ENTRIES, new Object[0]);
        }

        @Override // zj.w0
        public yj.g0 g() {
            throw new hj.d(hj.f.NO_CACHED_ENTRIES, new Object[0]);
        }

        @Override // zj.w0
        public String toString() {
            return "Empty immutable cache";
        }
    }

    public static w0 d() {
        return f33555c;
    }

    @Override // zj.i1
    public int a() {
        return this.f33557b;
    }

    @Override // zj.i1
    public /* synthetic */ Stream b(yj.b bVar) {
        return h1.a(this, bVar);
    }

    @Override // zj.i1
    public Stream c(yj.b bVar, int i10) {
        if (i10 <= this.f33557b) {
            return Collection.EL.stream(new d1(i10).b(bVar, this.f33556a));
        }
        throw new hj.a(hj.f.NOT_ENOUGH_DATA, Integer.valueOf(this.f33557b));
    }

    public List e() {
        return DesugarCollections.unmodifiableList(this.f33556a);
    }

    public yj.g0 f() {
        return (yj.g0) this.f33556a.get(0);
    }

    public yj.g0 g() {
        return (yj.g0) this.f33556a.get(r0.size() - 1);
    }

    public String toString() {
        return "Immutable cache with " + this.f33556a.size() + " entries";
    }

    public w0(int i10, java.util.Collection collection) {
        if (i10 > collection.size()) {
            throw new hj.c(hj.f.NOT_ENOUGH_CACHED_NEIGHBORS, Integer.valueOf(collection.size()), Integer.valueOf(i10));
        }
        if (i10 < 1) {
            throw new hj.c(ui.d.NUMBER_TOO_SMALL, Integer.valueOf(i10), 1);
        }
        this.f33557b = i10;
        ArrayList arrayList = new ArrayList(collection);
        this.f33556a = arrayList;
        List.EL.sort(arrayList, new yj.g());
    }

    private w0() {
        this.f33556a = null;
        this.f33557b = 0;
    }
}
