package vh;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f30789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f30790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30791c;

    public g0(l0 l0Var) {
        rd.m.e(l0Var, "sink");
        this.f30789a = l0Var;
        this.f30790b = new e();
    }

    @Override // vh.l0
    public void C(e eVar, long j10) {
        rd.m.e(eVar, "source");
        if (this.f30791c) {
            throw new IllegalStateException("closed");
        }
        this.f30790b.C(eVar, j10);
        D();
    }

    @Override // vh.f
    public f D() {
        if (this.f30791c) {
            throw new IllegalStateException("closed");
        }
        long jR = this.f30790b.r();
        if (jR > 0) {
            this.f30789a.C(this.f30790b, jR);
        }
        return this;
    }

    @Override // vh.f
    public f J(String str) {
        rd.m.e(str, "string");
        if (this.f30791c) {
            throw new IllegalStateException("closed");
        }
        this.f30790b.J(str);
        return D();
    }

    @Override // vh.f
    public f M(String str, int i10, int i11) {
        rd.m.e(str, "string");
        if (this.f30791c) {
            throw new IllegalStateException("closed");
        }
        this.f30790b.M(str, i10, i11);
        return D();
    }

    @Override // vh.f
    public f O(long j10) {
        if (this.f30791c) {
            throw new IllegalStateException("closed");
        }
        this.f30790b.O(j10);
        return D();
    }

    @Override // vh.f
    public f Z(h hVar) {
        rd.m.e(hVar, "byteString");
        if (this.f30791c) {
            throw new IllegalStateException("closed");
        }
        this.f30790b.Z(hVar);
        return D();
    }

    @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f30791c) {
            return;
        }
        try {
            if (this.f30790b.size() > 0) {
                l0 l0Var = this.f30789a;
                e eVar = this.f30790b;
                l0Var.C(eVar, eVar.size());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f30789a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f30791c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // vh.f, vh.l0, java.io.Flushable
    public void flush() {
        if (this.f30791c) {
            throw new IllegalStateException("closed");
        }
        if (this.f30790b.size() > 0) {
            l0 l0Var = this.f30789a;
            e eVar = this.f30790b;
            l0Var.C(eVar, eVar.size());
        }
        this.f30789a.flush();
    }

    @Override // vh.f
    public e h() {
        return this.f30790b;
    }

    @Override // vh.l0
    public o0 i() {
        return this.f30789a.i();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f30791c;
    }

    @Override // vh.f
    public f n0(long j10) {
        if (this.f30791c) {
            throw new IllegalStateException("closed");
        }
        this.f30790b.n0(j10);
        return D();
    }

    @Override // vh.f
    public f t(int i10) {
        if (this.f30791c) {
            throw new IllegalStateException("closed");
        }
        this.f30790b.t(i10);
        return D();
    }

    public String toString() {
        return "buffer(" + this.f30789a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        rd.m.e(byteBuffer, "source");
        if (this.f30791c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f30790b.write(byteBuffer);
        D();
        return iWrite;
    }

    @Override // vh.f
    public f writeByte(int i10) {
        if (this.f30791c) {
            throw new IllegalStateException("closed");
        }
        this.f30790b.writeByte(i10);
        return D();
    }

    @Override // vh.f
    public f writeInt(int i10) {
        if (this.f30791c) {
            throw new IllegalStateException("closed");
        }
        this.f30790b.writeInt(i10);
        return D();
    }

    @Override // vh.f
    public f writeShort(int i10) {
        if (this.f30791c) {
            throw new IllegalStateException("closed");
        }
        this.f30790b.writeShort(i10);
        return D();
    }

    @Override // vh.f
    public f write(byte[] bArr) {
        rd.m.e(bArr, "source");
        if (!this.f30791c) {
            this.f30790b.write(bArr);
            return D();
        }
        throw new IllegalStateException("closed");
    }

    @Override // vh.f
    public f write(byte[] bArr, int i10, int i11) {
        rd.m.e(bArr, "source");
        if (!this.f30791c) {
            this.f30790b.write(bArr, i10, i11);
            return D();
        }
        throw new IllegalStateException("closed");
    }
}
