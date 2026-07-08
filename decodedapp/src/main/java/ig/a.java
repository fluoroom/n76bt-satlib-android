package ig;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ArrayList implements l {
    public a(int i10) {
        super(i10);
    }

    public /* bridge */ boolean b(m mVar) {
        return super.contains(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof m) {
            return b((m) obj);
        }
        return false;
    }

    public /* bridge */ int d() {
        return super.size();
    }

    public /* bridge */ int f(m mVar) {
        return super.indexOf(mVar);
    }

    public /* bridge */ int g(m mVar) {
        return super.lastIndexOf(mVar);
    }

    public /* bridge */ boolean h(m mVar) {
        return super.remove(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof m) {
            return f((m) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof m) {
            return g((m) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof m) {
            return h((m) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return d();
    }
}
