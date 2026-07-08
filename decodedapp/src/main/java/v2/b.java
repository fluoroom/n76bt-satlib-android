package v2;

import android.graphics.Bitmap;
import h2.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a.InterfaceC0210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2.d f29492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l2.b f29493b;

    public b(l2.d dVar, l2.b bVar) {
        this.f29492a = dVar;
        this.f29493b = bVar;
    }

    @Override // h2.a.InterfaceC0210a
    public Bitmap a(int i10, int i11, Bitmap.Config config) {
        return this.f29492a.e(i10, i11, config);
    }

    @Override // h2.a.InterfaceC0210a
    public int[] b(int i10) {
        l2.b bVar = this.f29493b;
        return bVar == null ? new int[i10] : (int[]) bVar.d(i10, int[].class);
    }

    @Override // h2.a.InterfaceC0210a
    public void c(Bitmap bitmap) {
        this.f29492a.c(bitmap);
    }

    @Override // h2.a.InterfaceC0210a
    public void d(byte[] bArr) {
        l2.b bVar = this.f29493b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // h2.a.InterfaceC0210a
    public byte[] e(int i10) {
        l2.b bVar = this.f29493b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.d(i10, byte[].class);
    }

    @Override // h2.a.InterfaceC0210a
    public void f(int[] iArr) {
        l2.b bVar = this.f29493b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}
