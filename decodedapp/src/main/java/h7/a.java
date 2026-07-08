package h7;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class f15152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15153c;

    public a(Class cls) {
        this.f15152b = cls;
        String name = cls.getName();
        this.f15151a = name;
        this.f15153c = name.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        return this.f15151a.compareTo(aVar.f15151a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == a.class && ((a) obj).f15152b == this.f15152b;
    }

    public int hashCode() {
        return this.f15153c;
    }

    public String toString() {
        return this.f15151a;
    }
}
