package t2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import e3.l;
import i2.j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k2.v;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l2.b f27455b;

    private static final class a implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AnimatedImageDrawable f27456a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f27456a = animatedImageDrawable;
        }

        @Override // k2.v
        public int a() {
            return this.f27456a.getIntrinsicWidth() * this.f27456a.getIntrinsicHeight() * l.i(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // k2.v
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f27456a;
        }

        @Override // k2.v
        public void c() {
            this.f27456a.stop();
            this.f27456a.clearAnimationCallbacks();
        }

        @Override // k2.v
        public Class d() {
            return Drawable.class;
        }
    }

    private static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f27457a;

        b(c cVar) {
            this.f27457a = cVar;
        }

        @Override // i2.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v b(ByteBuffer byteBuffer, int i10, int i11, i2.h hVar) {
            return this.f27457a.b(ImageDecoder.createSource(byteBuffer), i10, i11, hVar);
        }

        @Override // i2.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ByteBuffer byteBuffer, i2.h hVar) {
            return this.f27457a.d(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: t2.c$c, reason: collision with other inner class name */
    private static final class C0383c implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f27458a;

        C0383c(c cVar) {
            this.f27458a = cVar;
        }

        @Override // i2.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v b(InputStream inputStream, int i10, int i11, i2.h hVar) {
            return this.f27458a.b(ImageDecoder.createSource(e3.a.b(inputStream)), i10, i11, hVar);
        }

        @Override // i2.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(InputStream inputStream, i2.h hVar) {
            return this.f27458a.c(inputStream);
        }
    }

    private c(List list, l2.b bVar) {
        this.f27454a = list;
        this.f27455b = bVar;
    }

    public static j a(List list, l2.b bVar) {
        return new b(new c(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    public static j f(List list, l2.b bVar) {
        return new C0383c(new c(list, bVar));
    }

    v b(ImageDecoder.Source source, int i10, int i11, i2.h hVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new q2.c(i10, i11, hVar));
        if (t2.a.a(drawableDecodeDrawable)) {
            return new a(t2.b.a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f27454a, inputStream, this.f27455b));
    }

    boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f27454a, byteBuffer));
    }
}
