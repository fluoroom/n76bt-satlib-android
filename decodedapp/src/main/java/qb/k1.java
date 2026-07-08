package qb;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class k1 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f24672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f24673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f24674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String f24675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final List f24676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final List f24677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final boolean f24678g;

    protected k1(int i10, String str, String str2, String str3, List list, List list2, boolean z10) {
        this.f24672a = i10;
        this.f24673b = str;
        this.f24674c = str2;
        this.f24675d = str3;
        this.f24676e = s9.k.o(list);
        this.f24677f = s9.k.o(list2);
        this.f24678g = z10;
    }

    public String a() {
        return this.f24673b;
    }

    public List b() {
        return this.f24677f;
    }

    public List c() {
        return this.f24676e;
    }

    public String toString() {
        return getClass().getName() + "(" + a() + ")";
    }
}
