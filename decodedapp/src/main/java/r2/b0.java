package r2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
interface b0 {

    public static final class b implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f25325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l2.b f25326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f25327c;

        b(InputStream inputStream, List list, l2.b bVar) {
            this.f25326b = (l2.b) e3.k.e(bVar);
            this.f25327c = (List) e3.k.e(list);
            this.f25325a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // r2.b0
        public int a() {
            return com.bumptech.glide.load.a.b(this.f25327c, this.f25325a.a(), this.f25326b);
        }

        @Override // r2.b0
        public Bitmap b(BitmapFactory.Options options) {
            return y.b(this.f25325a.a(), options, this);
        }

        @Override // r2.b0
        public boolean c() {
            return com.bumptech.glide.load.a.j(this.f25327c, this.f25325a.a(), this.f25326b);
        }

        @Override // r2.b0
        public void d() {
            this.f25325a.c();
        }

        @Override // r2.b0
        public ImageHeaderParser.ImageType e() {
            return com.bumptech.glide.load.a.f(this.f25327c, this.f25325a.a(), this.f25326b);
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    boolean c();

    void d();

    ImageHeaderParser.ImageType e();

    public static final class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f25322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f25323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final l2.b f25324c;

        a(ByteBuffer byteBuffer, List list, l2.b bVar) {
            this.f25322a = byteBuffer;
            this.f25323b = list;
            this.f25324c = bVar;
        }

        private InputStream f() {
            return e3.a.g(e3.a.d(this.f25322a));
        }

        @Override // r2.b0
        public int a() {
            return com.bumptech.glide.load.a.c(this.f25323b, e3.a.d(this.f25322a), this.f25324c);
        }

        @Override // r2.b0
        public Bitmap b(BitmapFactory.Options options) {
            return y.b(f(), options, this);
        }

        @Override // r2.b0
        public boolean c() {
            return com.bumptech.glide.load.a.k(this.f25323b, e3.a.d(this.f25322a), this.f25324c);
        }

        @Override // r2.b0
        public ImageHeaderParser.ImageType e() {
            return com.bumptech.glide.load.a.g(this.f25323b, e3.a.d(this.f25322a));
        }

        @Override // r2.b0
        public void d() {
        }
    }

    public static final class c implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l2.b f25328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f25329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f25330c;

        c(ParcelFileDescriptor parcelFileDescriptor, List list, l2.b bVar) {
            this.f25328a = (l2.b) e3.k.e(bVar);
            this.f25329b = (List) e3.k.e(list);
            this.f25330c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // r2.b0
        public int a() {
            return com.bumptech.glide.load.a.a(this.f25329b, this.f25330c, this.f25328a);
        }

        @Override // r2.b0
        public Bitmap b(BitmapFactory.Options options) {
            return y.a(this.f25330c.a().getFileDescriptor(), options, this);
        }

        @Override // r2.b0
        public boolean c() {
            return com.bumptech.glide.load.a.i(this.f25329b, this.f25330c, this.f25328a);
        }

        @Override // r2.b0
        public ImageHeaderParser.ImageType e() {
            return com.bumptech.glide.load.a.e(this.f25329b, this.f25330c, this.f25328a);
        }

        @Override // r2.b0
        public void d() {
        }
    }
}
