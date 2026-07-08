package o2;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o2.n;

/* JADX INFO: loaded from: classes.dex */
public class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f23089a;

    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f23090a;

        public a(d dVar) {
            this.f23090a = dVar;
        }

        @Override // o2.o
        public final n d(r rVar) {
            return new g(this.f23090a);
        }
    }

    public static class b extends a {

        class a implements d {
            a() {
            }

            @Override // o2.g.d
            public Class a() {
                return ParcelFileDescriptor.class;
            }

            @Override // o2.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // o2.g.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    public interface d {
        Class a();

        void b(Object obj);

        Object c(File file);
    }

    public static class e extends a {

        class a implements d {
            a() {
            }

            @Override // o2.g.d
            public Class a() {
                return InputStream.class;
            }

            @Override // o2.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // o2.g.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d dVar) {
        this.f23089a = dVar;
    }

    @Override // o2.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(File file, int i10, int i11, i2.h hVar) {
        return new n.a(new d3.b(file), new c(file, this.f23089a));
    }

    @Override // o2.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(File file) {
        return true;
    }

    private static final class c implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f23091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f23092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f23093c;

        c(File file, d dVar) {
            this.f23091a = file;
            this.f23092b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f23092b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f23093c;
            if (obj != null) {
                try {
                    this.f23092b.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public i2.a d() {
            return i2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, d.a aVar) {
            try {
                Object objC = this.f23092b.c(this.f23091a);
                this.f23093c = objC;
                aVar.f(objC);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
