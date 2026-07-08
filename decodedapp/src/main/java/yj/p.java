package yj;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f32732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f32734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32735d;

    public p(i iVar, int i10, y yVar, int i11) {
        this.f32732a = iVar;
        this.f32733b = i10;
        this.f32734c = yVar;
        this.f32735d = i11;
    }

    public int a() {
        return this.f32733b;
    }

    public y b() {
        return this.f32734c;
    }

    public int c() {
        return this.f32735d;
    }

    public i d() {
        return this.f32732a;
    }

    public p(i iVar, int i10) {
        this(iVar, 41317, new y(i10, 0L), 0);
    }
}
