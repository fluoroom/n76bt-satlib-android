package o2;

import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o2.n;

/* JADX INFO: loaded from: classes.dex */
public class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0312b f23067a;

    public static class a implements o {

        /* JADX INFO: renamed from: o2.b$a$a, reason: collision with other inner class name */
        class C0311a implements InterfaceC0312b {
            C0311a() {
            }

            @Override // o2.b.InterfaceC0312b
            public Class a() {
                return ByteBuffer.class;
            }

            @Override // o2.b.InterfaceC0312b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // o2.o
        public n d(r rVar) {
            return new b(new C0311a());
        }
    }

    /* JADX INFO: renamed from: o2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0312b {
        Class a();

        Object b(byte[] bArr);
    }

    public static class d implements o {

        class a implements InterfaceC0312b {
            a() {
            }

            @Override // o2.b.InterfaceC0312b
            public Class a() {
                return InputStream.class;
            }

            @Override // o2.b.InterfaceC0312b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // o2.o
        public n d(r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0312b interfaceC0312b) {
        this.f23067a = interfaceC0312b;
    }

    @Override // o2.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(byte[] bArr, int i10, int i11, i2.h hVar) {
        return new n.a(new d3.b(bArr), new c(bArr, this.f23067a));
    }

    @Override // o2.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(byte[] bArr) {
        return true;
    }

    private static class c implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f23069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC0312b f23070b;

        c(byte[] bArr, InterfaceC0312b interfaceC0312b) {
            this.f23069a = bArr;
            this.f23070b = interfaceC0312b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f23070b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public i2.a d() {
            return i2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, d.a aVar) {
            aVar.f(this.f23070b.b(this.f23069a));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
