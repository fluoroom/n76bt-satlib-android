package ia;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f15957a;

    public e(List list) {
        if (list == null) {
            throw new IllegalArgumentException("Coordinates cannot be null");
        }
        this.f15957a = list;
    }

    @Override // ia.c
    public String a() {
        return "LineString";
    }

    public List d() {
        return this.f15957a;
    }

    public String toString() {
        return "LineString{\n coordinates=" + this.f15957a + "\n}\n";
    }
}
