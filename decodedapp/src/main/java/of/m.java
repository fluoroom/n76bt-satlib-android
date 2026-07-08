package of;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class m extends AbstractList implements RandomAccess, n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f23482b = new m().n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f23483a;

    public m() {
        this.f23483a = new ArrayList();
    }

    private static d c(Object obj) {
        return obj instanceof d ? (d) obj : obj instanceof String ? d.g((String) obj) : d.e((byte[]) obj);
    }

    private static String d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof d ? ((d) obj).y() : j.b((byte[]) obj);
    }

    @Override // of.n
    public void T(d dVar) {
        this.f23483a.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // of.n
    public d X(int i10) {
        Object obj = this.f23483a.get(i10);
        d dVarC = c(obj);
        if (dVarC != obj) {
            this.f23483a.set(i10, dVarC);
        }
        return dVarC;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        this.f23483a.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f23483a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f23483a.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String strY = dVar.y();
            if (dVar.m()) {
                this.f23483a.set(i10, strY);
            }
            return strY;
        }
        byte[] bArr = (byte[]) obj;
        String strB = j.b(bArr);
        if (j.a(bArr)) {
            this.f23483a.set(i10, strB);
        }
        return strB;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        Object objRemove = this.f23483a.remove(i10);
        ((AbstractList) this).modCount++;
        return d(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        return d(this.f23483a.set(i10, str));
    }

    @Override // of.n
    public List k() {
        return DesugarCollections.unmodifiableList(this.f23483a);
    }

    @Override // of.n
    public n n() {
        return new w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f23483a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        if (collection instanceof n) {
            collection = ((n) collection).k();
        }
        boolean zAddAll = this.f23483a.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public m(n nVar) {
        this.f23483a = new ArrayList(nVar.size());
        addAll(nVar);
    }
}
