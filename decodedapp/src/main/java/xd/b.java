package xd;

import ed.j0;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31978d;

    public b(int i10, int i11, int i12) {
        this.f31975a = i12;
        this.f31976b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f31977c = z10;
        this.f31978d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f31977c;
    }

    @Override // ed.j0
    public int nextInt() {
        int i10 = this.f31978d;
        if (i10 != this.f31976b) {
            this.f31978d = this.f31975a + i10;
            return i10;
        }
        if (!this.f31977c) {
            throw new NoSuchElementException();
        }
        this.f31977c = false;
        return i10;
    }
}
