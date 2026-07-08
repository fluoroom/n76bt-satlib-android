package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import r2.f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    class C0078a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f5159a;

        C0078a(InputStream inputStream) {
            this.f5159a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.e(this.f5159a);
            } finally {
                this.f5159a.reset();
            }
        }
    }

    class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f5160a;

        b(ByteBuffer byteBuffer) {
            this.f5160a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f5160a);
            } finally {
                e3.a.d(this.f5160a);
            }
        }
    }

    class c implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f5161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l2.b f5162b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, l2.b bVar) {
            this.f5161a = parcelFileDescriptorRewinder;
            this.f5162b = bVar;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            f0 f0Var;
            f0 f0Var2 = null;
            try {
                f0Var = new f0(new FileInputStream(this.f5161a.a().getFileDescriptor()), this.f5162b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ImageHeaderParser.ImageType imageTypeE = imageHeaderParser.e(f0Var);
                f0Var.e();
                this.f5161a.a();
                return imageTypeE;
            } catch (Throwable th3) {
                th = th3;
                f0Var2 = f0Var;
                if (f0Var2 != null) {
                    f0Var2.e();
                }
                this.f5161a.a();
                throw th;
            }
        }
    }

    class d implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f5163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l2.b f5164b;

        d(ByteBuffer byteBuffer, l2.b bVar) {
            this.f5163a = byteBuffer;
            this.f5164b = bVar;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.b(this.f5163a, this.f5164b);
            } finally {
                e3.a.d(this.f5163a);
            }
        }
    }

    class e implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f5165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l2.b f5166b;

        e(InputStream inputStream, l2.b bVar) {
            this.f5165a = inputStream;
            this.f5166b = bVar;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.f(this.f5165a, this.f5166b);
            } finally {
                this.f5165a.reset();
            }
        }
    }

    class f implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f5167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l2.b f5168b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, l2.b bVar) {
            this.f5167a = parcelFileDescriptorRewinder;
            this.f5168b = bVar;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            f0 f0Var;
            f0 f0Var2 = null;
            try {
                f0Var = new f0(new FileInputStream(this.f5167a.a().getFileDescriptor()), this.f5168b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                int iF = imageHeaderParser.f(f0Var, this.f5168b);
                f0Var.e();
                this.f5167a.a();
                return iF;
            } catch (Throwable th3) {
                th = th3;
                f0Var2 = f0Var;
                if (f0Var2 != null) {
                    f0Var2.e();
                }
                this.f5167a.a();
                throw th;
            }
        }
    }

    class g implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f5169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l2.b f5170b;

        g(ByteBuffer byteBuffer, l2.b bVar) {
            this.f5169a = byteBuffer;
            this.f5170b = bVar;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.d(this.f5169a, this.f5170b);
            } finally {
                e3.a.d(this.f5169a);
            }
        }
    }

    class h implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f5171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l2.b f5172b;

        h(InputStream inputStream, l2.b bVar) {
            this.f5171a = inputStream;
            this.f5172b = bVar;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f5171a, this.f5172b);
            } finally {
                this.f5171a.reset();
            }
        }
    }

    class i implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f5173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l2.b f5174b;

        i(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, l2.b bVar) {
            this.f5173a = parcelFileDescriptorRewinder;
            this.f5174b = bVar;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) throws Throwable {
            f0 f0Var;
            f0 f0Var2 = null;
            try {
                f0Var = new f0(new FileInputStream(this.f5173a.a().getFileDescriptor()), this.f5174b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                boolean zC = imageHeaderParser.c(f0Var, this.f5174b);
                f0Var.e();
                this.f5173a.a();
                return zC;
            } catch (Throwable th3) {
                th = th3;
                f0Var2 = f0Var;
                if (f0Var2 != null) {
                    f0Var2.e();
                }
                this.f5173a.a();
                throw th;
            }
        }
    }

    private interface j {
        boolean a(ImageHeaderParser imageHeaderParser);
    }

    private interface k {
        int a(ImageHeaderParser imageHeaderParser);
    }

    private interface l {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, l2.b bVar) {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List list, InputStream inputStream, l2.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new f0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List list, ByteBuffer byteBuffer, l2.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(List list, k kVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iA = kVar.a((ImageHeaderParser) list.get(i10));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, l2.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List list, InputStream inputStream, l2.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new f0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0078a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType h(List list, l lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType imageTypeA = lVar.a((ImageHeaderParser) list.get(i10));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static boolean i(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, l2.b bVar) {
        return l(list, new i(parcelFileDescriptorRewinder, bVar));
    }

    public static boolean j(List list, InputStream inputStream, l2.b bVar) {
        if (inputStream == null) {
            return false;
        }
        if (!inputStream.markSupported()) {
            inputStream = new f0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return l(list, new h(inputStream, bVar));
    }

    public static boolean k(List list, ByteBuffer byteBuffer, l2.b bVar) {
        if (byteBuffer == null) {
            return false;
        }
        return l(list, new g(byteBuffer, bVar));
    }

    private static boolean l(List list, j jVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (jVar.a((ImageHeaderParser) list.get(i10))) {
                return true;
            }
        }
        return false;
    }
}
