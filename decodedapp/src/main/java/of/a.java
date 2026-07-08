package of;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import of.p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f23415a = 0;

    v b() {
        return new v(this);
    }

    public void c(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        f fVarI = f.I(outputStream, f.t(f.u(serializedSize) + serializedSize));
        fVarI.n0(serializedSize);
        a(fVarI);
        fVarI.H();
    }

    /* JADX INFO: renamed from: of.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0317a implements p.a {
        protected static v b(p pVar) {
            return new v(pVar);
        }

        /* JADX INFO: renamed from: of.a$a$a, reason: collision with other inner class name */
        static final class C0318a extends FilterInputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f23416a;

            C0318a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f23416a = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f23416a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f23416a <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f23416a--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f23416a));
                if (jSkip >= 0) {
                    this.f23416a = (int) (((long) this.f23416a) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f23416a;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f23416a -= i13;
                }
                return i13;
            }
        }
    }
}
