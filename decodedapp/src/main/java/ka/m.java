package ka;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class m implements ia.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f19570b;

    public m(List list, List list2) {
        if (list == null) {
            throw new IllegalArgumentException("Outer boundary coordinates cannot be null");
        }
        this.f19569a = list;
        this.f19570b = list2;
    }

    @Override // ia.c
    public String a() {
        return "Polygon";
    }

    @Override // ia.a
    public List b() {
        return this.f19569a;
    }

    @Override // ia.a
    public List c() {
        return this.f19570b;
    }

    public String toString() {
        return "Polygon{\n outer coordinates=" + this.f19569a + ",\n inner coordinates=" + this.f19570b + "\n}\n";
    }
}
