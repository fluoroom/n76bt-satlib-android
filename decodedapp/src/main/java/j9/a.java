package j9;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f18552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0238a f18553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18554c;

    /* JADX INFO: renamed from: j9.a$a, reason: collision with other inner class name */
    public interface InterfaceC0238a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0238a interfaceC0238a, Typeface typeface) {
        this.f18552a = typeface;
        this.f18553b = interfaceC0238a;
    }

    private void d(Typeface typeface) {
        if (this.f18554c) {
            return;
        }
        this.f18553b.a(typeface);
    }

    @Override // j9.f
    public void a(int i10) {
        d(this.f18552a);
    }

    @Override // j9.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f18554c = true;
    }
}
