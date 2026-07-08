package gj;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f14593b;

    private static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f14594a;

        a(e eVar) {
            this.f14594a = eVar;
        }

        @Override // gj.h.b
        public Reader a() {
            InputStream inputStreamB = b();
            if (inputStreamB == null) {
                return null;
            }
            return new InputStreamReader(inputStreamB, StandardCharsets.UTF_8);
        }

        @Override // gj.h.b
        public InputStream b() {
            return this.f14594a.a();
        }
    }

    public interface b {
        Reader a();

        InputStream b();
    }

    private static class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f14595a;

        class a extends InputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private ByteBuffer f14596a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Reader f14597b;

            a(Reader reader) {
                this.f14597b = reader;
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                ByteBuffer byteBuffer = this.f14596a;
                if (byteBuffer == null || !byteBuffer.hasRemaining()) {
                    CharBuffer charBufferAllocate = CharBuffer.allocate(4096);
                    int i10 = this.f14597b.read(charBufferAllocate);
                    if (i10 < 0) {
                        return i10;
                    }
                    int iPosition = charBufferAllocate.position();
                    this.f14596a = StandardCharsets.UTF_8.encode(charBufferAllocate.subSequence(0, iPosition));
                }
                return this.f14596a.get();
            }
        }

        c(d dVar) {
            this.f14595a = dVar;
        }

        @Override // gj.h.b
        public Reader a() {
            return this.f14595a.a();
        }

        @Override // gj.h.b
        public InputStream b() {
            Reader readerA = a();
            if (readerA == null) {
                return null;
            }
            return new a(readerA);
        }
    }

    public interface d {
        Reader a();
    }

    public interface e {
        InputStream a();
    }

    public h(String str, e eVar) {
        this.f14592a = str;
        this.f14593b = new a(eVar);
    }

    public String a() {
        return this.f14592a;
    }

    public b b() {
        return this.f14593b;
    }

    public h(String str, d dVar) {
        this.f14592a = str;
        this.f14593b = new c(dVar);
    }
}
