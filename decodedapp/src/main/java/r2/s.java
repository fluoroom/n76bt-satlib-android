package r2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import r2.b0;
import r2.m;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i2.g f25392f = i2.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", i2.b.f15743c);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i2.g f25393g = i2.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i2.g f25394h = m.f25387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i2.g f25395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i2.g f25396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Set f25397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b f25398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Set f25399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Queue f25400n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2.d f25401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f25402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l2.b f25403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f25404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a0 f25405e = a0.b();

    public interface b {
        void a();

        void b(l2.d dVar, Bitmap bitmap);
    }

    static {
        Boolean bool = Boolean.FALSE;
        f25395i = i2.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f25396j = i2.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f25397k = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f25398l = new a();
        f25399m = DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f25400n = e3.l.f(0);
    }

    public s(List list, DisplayMetrics displayMetrics, l2.d dVar, l2.b bVar) {
        this.f25404d = list;
        this.f25402b = (DisplayMetrics) e3.k.e(displayMetrics);
        this.f25401a = (l2.d) e3.k.e(dVar);
        this.f25403c = (l2.b) e3.k.e(bVar);
    }

    private static int a(double d10) {
        int iL = l(d10);
        int iX = x(((double) iL) * d10);
        return x((d10 / ((double) (iX / iL))) * ((double) iX));
    }

    private void b(b0 b0Var, i2.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean zHasAlpha;
        if (this.f25405e.g(i10, i11, options, z10, z11)) {
            return;
        }
        if (bVar == i2.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = b0Var.e().hasAlpha();
        } catch (IOException e10) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e10);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, b0 b0Var, b bVar, l2.d dVar, m mVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
        int i15;
        int i16;
        int i17;
        int i18;
        int iFloor;
        double dFloor;
        int iRound;
        if (i11 <= 0 || i12 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i13 + "x" + i14 + "]");
                return;
            }
            return;
        }
        if (r(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float fB = mVar.b(i15, i16, i13, i14);
        if (fB <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + mVar + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        m.g gVarA = mVar.a(i15, i16, i13, i14);
        if (gVarA == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int i19 = i15;
        int i20 = i16;
        int iX = i19 / x(fB * f10);
        int iX2 = i20 / x(fB * f11);
        m.g gVar = m.g.MEMORY;
        int iMax = gVarA == gVar ? Math.max(iX, iX2) : Math.min(iX, iX2);
        int i21 = Build.VERSION.SDK_INT;
        int i22 = iMax;
        if (i21 > 23 || !f25397k.contains(options.outMimeType)) {
            int iMax2 = Math.max(1, Integer.highestOneBit(i22));
            i17 = (gVarA != gVar || ((float) iMax2) >= 1.0f / fB) ? iMax2 : iMax2 << 1;
        } else {
            i17 = 1;
        }
        options.inSampleSize = i17;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(i17, 8);
            i18 = 0;
            iFloor = (int) Math.ceil(f10 / fMin);
            iRound = (int) Math.ceil(f11 / fMin);
            int i23 = i17 / 8;
            if (i23 > 0) {
                iFloor /= i23;
                iRound /= i23;
            }
        } else {
            i18 = 0;
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f12 = i17;
                iFloor = (int) Math.floor(f10 / f12);
                dFloor = Math.floor(f11 / f12);
            } else if (imageType.isWebp()) {
                if (i21 >= 24) {
                    float f13 = i17;
                    iFloor = Math.round(f10 / f13);
                    iRound = Math.round(f11 / f13);
                } else {
                    float f14 = i17;
                    iFloor = (int) Math.floor(f10 / f14);
                    dFloor = Math.floor(f11 / f14);
                }
            } else if (i19 % i17 == 0 && i20 % i17 == 0) {
                iFloor = i19 / i17;
                iRound = i20 / i17;
            } else {
                int[] iArrM = m(b0Var, options, bVar, dVar);
                iFloor = iArrM[0];
                iRound = iArrM[1];
            }
            iRound = (int) dFloor;
        }
        double dB = mVar.b(iFloor, iRound, i13, i14);
        options.inTargetDensity = a(dB);
        options.inDensity = l(dB);
        if (s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = i18;
            options.inDensity = i18;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i11 + "x" + i12 + "], degreesToRotate: " + i10 + ", target: [" + i13 + "x" + i14 + "], power of two scaled: [" + iFloor + "x" + iRound + "], exact scale factor: " + fB + ", power of 2 sample size: " + i17 + ", adjusted scale factor: " + dB + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private k2.v g(b0 b0Var, int i10, int i11, i2.h hVar, b bVar) {
        byte[] bArr = (byte[]) this.f25403c.d(WXMediaMessage.THUMB_LENGTH_LIMIT, byte[].class);
        BitmapFactory.Options optionsK = k();
        optionsK.inTempStorage = bArr;
        i2.b bVar2 = (i2.b) hVar.c(f25392f);
        i2.i iVar = (i2.i) hVar.c(f25393g);
        m mVar = (m) hVar.c(m.f25387h);
        boolean zBooleanValue = ((Boolean) hVar.c(f25395i)).booleanValue();
        i2.g gVar = f25396j;
        try {
            return f.f(h(b0Var, optionsK, mVar, bVar2, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f25401a);
        } finally {
            v(optionsK);
            this.f25403c.put(bArr);
        }
    }

    private Bitmap h(b0 b0Var, BitmapFactory.Options options, m mVar, i2.b bVar, i2.i iVar, boolean z10, int i10, int i11, boolean z11, b bVar2) {
        int i12;
        String str;
        ColorSpace colorSpace;
        int i13;
        long jB = e3.g.b();
        int[] iArrM = m(b0Var, options, bVar2, this.f25401a);
        int i14 = iArrM[0];
        int i15 = iArrM[1];
        String str2 = options.outMimeType;
        boolean z12 = (i14 == -1 || i15 == -1) ? false : z10;
        int iA = b0Var.a();
        int iG = i0.g(iA);
        boolean zJ = i0.j(iA);
        int i16 = i10;
        if (i16 != Integer.MIN_VALUE) {
            i12 = i11;
        } else if (r(iG)) {
            i12 = i11;
            i16 = i15;
        } else {
            i12 = i11;
            i16 = i14;
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = r(iG) ? i14 : i15;
        }
        ImageHeaderParser.ImageType imageTypeE = b0Var.e();
        c(imageTypeE, b0Var, bVar2, this.f25401a, mVar, iG, i14, i15, i16, i12, options);
        int i17 = i16;
        int i18 = i12;
        b(b0Var, bVar, z12, zJ, options, i17, i18);
        int i19 = Build.VERSION.SDK_INT;
        if (z(imageTypeE)) {
            if (i14 < 0 || i15 < 0 || !z11) {
                float f10 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i20 = options.inSampleSize;
                float f11 = i20;
                int iCeil = (int) Math.ceil(i14 / f11);
                int iCeil2 = (int) Math.ceil(i15 / f11);
                int iRound = Math.round(iCeil * f10);
                int iRound2 = Math.round(iCeil2 * f10);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculated target [");
                    sb2.append(iRound);
                    sb2.append("x");
                    sb2.append(iRound2);
                    i13 = iRound;
                    sb2.append("] for source [");
                    sb2.append(i14);
                    sb2.append("x");
                    sb2.append(i15);
                    sb2.append("], sampleSize: ");
                    sb2.append(i20);
                    sb2.append(", targetDensity: ");
                    sb2.append(options.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options.inDensity);
                    sb2.append(", density multiplier: ");
                    sb2.append(f10);
                    Log.v(str, sb2.toString());
                } else {
                    i13 = iRound;
                }
                i17 = i13;
                i18 = iRound2;
            } else {
                str = "Downsampler";
            }
            if (i17 > 0 && i18 > 0) {
                y(options, this.f25401a, i17, i18);
            }
        } else {
            str = "Downsampler";
        }
        if (iVar != null) {
            if (i19 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((iVar == i2.i.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i19 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapI = i(b0Var, options, bVar2, this.f25401a);
        bVar2.b(this.f25401a, bitmapI);
        if (Log.isLoggable(str, 2)) {
            t(i14, i15, str2, options, bitmapI, i10, i11, jB);
        }
        if (bitmapI == null) {
            return null;
        }
        bitmapI.setDensity(this.f25402b.densityDpi);
        Bitmap bitmapK = i0.k(this.f25401a, bitmapI, iA);
        if (!bitmapI.equals(bitmapK)) {
            this.f25401a.c(bitmapI);
        }
        return bitmapK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap i(r2.b0 r5, android.graphics.BitmapFactory.Options r6, r2.s.b r7, l2.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.a()
            r5.d()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = r2.i0.f()
            r4.lock()
            android.graphics.Bitmap r5 = r5.b(r6)     // Catch: java.lang.IllegalArgumentException -> L25 java.lang.Throwable -> L47
        L1d:
            java.util.concurrent.locks.Lock r6 = r2.i0.f()
            r6.unlock()
            return r5
        L25:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L47
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L36
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L47
        L36:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L46
            r8.c(r0)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            r0 = 0
            r6.inBitmap = r0     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            goto L1d
        L45:
            throw r1     // Catch: java.lang.Throwable -> L47
        L46:
            throw r1     // Catch: java.lang.Throwable -> L47
        L47:
            r5 = move-exception
            java.util.concurrent.locks.Lock r6 = r2.i0.f()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.s.i(r2.b0, android.graphics.BitmapFactory$Options, r2.s$b, l2.d):android.graphics.Bitmap");
    }

    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options options;
        Queue queue = f25400n;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            w(options);
        }
        return options;
    }

    private static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static int[] m(b0 b0Var, BitmapFactory.Options options, b bVar, l2.d dVar) {
        options.inJustDecodeBounds = true;
        i(b0Var, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    private static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + n(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + e3.g.a(j10));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue queue = f25400n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    private static void y(BitmapFactory.Options options, l2.d dVar, int i10, int i11) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.e(i10, i11, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public k2.v d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, i2.h hVar) {
        return g(new b0.c(parcelFileDescriptor, this.f25404d, this.f25403c), i10, i11, hVar, f25398l);
    }

    public k2.v e(InputStream inputStream, int i10, int i11, i2.h hVar, b bVar) {
        return g(new b0.b(inputStream, this.f25404d, this.f25403c), i10, i11, hVar, bVar);
    }

    public k2.v f(ByteBuffer byteBuffer, int i10, int i11, i2.h hVar) {
        return g(new b0.a(byteBuffer, this.f25404d, this.f25403c), i10, i11, hVar, f25398l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    class a implements b {
        a() {
        }

        @Override // r2.s.b
        public void a() {
        }

        @Override // r2.s.b
        public void b(l2.d dVar, Bitmap bitmap) {
        }
    }
}
