package u0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f27936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f27937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f27940e = d.a();

    protected int a(int i10) {
        return i10 + this.f27937b.getInt(i10);
    }

    protected int b(int i10) {
        if (i10 < this.f27939d) {
            return this.f27937b.getShort(this.f27938c + i10);
        }
        return 0;
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        this.f27937b = byteBuffer;
        if (byteBuffer == null) {
            this.f27936a = 0;
            this.f27938c = 0;
            this.f27939d = 0;
        } else {
            this.f27936a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f27938c = i11;
            this.f27939d = this.f27937b.getShort(i11);
        }
    }

    protected int d(int i10) {
        int i11 = i10 + this.f27936a;
        return i11 + this.f27937b.getInt(i11) + 4;
    }

    protected int e(int i10) {
        int i11 = i10 + this.f27936a;
        return this.f27937b.getInt(i11 + this.f27937b.getInt(i11));
    }
}
