package o2;

import android.util.Base64;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import o2.n;

/* JADX INFO: loaded from: classes.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f23073a;

    public interface a {
        Class a();

        void b(Object obj);

        Object c(String str);
    }

    public static final class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f23077a = new a();

        class a implements a {
            a() {
            }

            @Override // o2.e.a
            public Class a() {
                return InputStream.class;
            }

            @Override // o2.e.a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // o2.e.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // o2.o
        public n d(r rVar) {
            return new e(this.f23077a);
        }
    }

    public e(a aVar) {
        this.f23073a = aVar;
    }

    @Override // o2.n
    public boolean a(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // o2.n
    public n.a b(Object obj, int i10, int i11, i2.h hVar) {
        return new n.a(new d3.b(obj), new b(obj.toString(), this.f23073a));
    }

    private static final class b implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f23074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f23075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f23076c;

        b(String str, a aVar) {
            this.f23074a = str;
            this.f23075b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f23075b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f23075b.b(this.f23076c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public i2.a d() {
            return i2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, d.a aVar) {
            try {
                Object objC = this.f23075b.c(this.f23074a);
                this.f23076c = objC;
                aVar.f(objC);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
