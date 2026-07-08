package rb;

import io.grpc.internal.g3;

/* JADX INFO: loaded from: classes3.dex */
class q implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vh.e f25839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25841c;

    q(vh.e eVar, int i10) {
        this.f25839a = eVar;
        this.f25840b = i10;
    }

    @Override // io.grpc.internal.g3
    public int b() {
        return this.f25840b;
    }

    @Override // io.grpc.internal.g3
    public void c(byte b10) {
        this.f25839a.writeByte(b10);
        this.f25840b--;
        this.f25841c++;
    }

    vh.e d() {
        return this.f25839a;
    }

    @Override // io.grpc.internal.g3
    public int g() {
        return this.f25841c;
    }

    @Override // io.grpc.internal.g3
    public void write(byte[] bArr, int i10, int i11) {
        this.f25839a.write(bArr, i10, i11);
        this.f25840b -= i11;
        this.f25841c += i11;
    }

    @Override // io.grpc.internal.g3
    public void a() {
    }
}
