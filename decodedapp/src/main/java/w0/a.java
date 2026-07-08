package w0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserView;
import com.facebook.stetho.dumpapp.Framer;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.msgpack.core.MessagePack;
import w0.b;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final SimpleDateFormat U;
    private static final SimpleDateFormat V;
    private static final d[] Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final d[] f30975a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final d[] f30976b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final d[] f30977c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final d[] f30978d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final d f30979e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final d[] f30980f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final d[] f30981g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final d[] f30982h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final d[] f30983i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    static final d[][] f30984j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final d[] f30985k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final HashMap[] f30986l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final HashMap[] f30987m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final Set f30988n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final HashMap f30989o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final Charset f30990p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    static final byte[] f30991q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final byte[] f30992r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Pattern f30993s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Pattern f30994t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Pattern f30995u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Pattern f30997v0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileDescriptor f31003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f31004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap[] f31007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set f31008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteOrder f31009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f31011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f31012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f31013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f31014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f31015n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f31016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f31017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f31018q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f31019r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f31020s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f31021t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f31022u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final boolean f30996v = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final List f30998w = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final List f30999x = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f31000y = {8, 8, 8};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f31001z = {4};
    public static final int[] A = {8};
    static final byte[] B = {-1, MessagePack.Code.FIXEXT16, -1};
    private static final byte[] C = {102, 116, 121, 112};
    private static final byte[] D = {109, 105, 102, Framer.STDOUT_FRAME_PREFIX};
    private static final byte[] E = {104, 101, 105, 99};
    private static final byte[] F = {97, 118, 105, 102};
    private static final byte[] G = {97, 118, 105, 115};
    private static final byte[] H = {79, 76, 89, 77, 80, 0};
    private static final byte[] I = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] J = {-119, 80, 78, 71, 13, 10, 26, 10};
    static final byte[] K = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    private static final byte[] L = {82, 73, 70, 70};
    private static final byte[] M = {87, 69, 66, 80};
    private static final byte[] N = {69, 88, 73, 70};
    private static final byte[] O = {-99, 1, 42};
    private static final byte[] P = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] Q = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] R = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] S = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] T = "ANMF".getBytes(Charset.defaultCharset());
    private static final String[] W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final int[] X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    private static final byte[] Y = {65, 83, 67, 73, 73, 0, 0, 0};

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f31031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f31033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f31034d;

        c(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f30990p0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.X[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new c(4, jArr.length, byteBufferWrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.X[5] * eVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (e eVar : eVarArr) {
                byteBufferWrap.putInt((int) eVar.f31039a);
                byteBufferWrap.putInt((int) eVar.f31040b);
            }
            return new c(5, eVarArr.length, byteBufferWrap.array());
        }

        public static c f(int i10, ByteOrder byteOrder) {
            return g(new int[]{i10}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.X[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new c(3, iArr.length, byteBufferWrap.array());
        }

        public double h(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objK instanceof String) {
                return Double.parseDouble((String) objK);
            }
            if (objK instanceof long[]) {
                if (((long[]) objK).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof int[]) {
                if (((int[]) objK).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) objK;
            if (eVarArr.length == 1) {
                return eVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int i(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objK instanceof String) {
                return Integer.parseInt((String) objK);
            }
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objK;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String j(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                return null;
            }
            if (objK instanceof String) {
                return (String) objK;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objK instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objK;
            while (i10 < eVarArr.length) {
                sb2.append(eVarArr[i10].f31039a);
                sb2.append('/');
                sb2.append(eVarArr[i10].f31040b);
                i10++;
                if (i10 != eVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:18:0x0031 */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:124:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object k(java.nio.ByteOrder r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 392
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: w0.a.c.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + a.W[this.f31031a] + ", data length:" + this.f31034d.length + ")";
        }

        c(int i10, int i11, long j10, byte[] bArr) {
            this.f31031a = i10;
            this.f31032b = i11;
            this.f31033c = j10;
            this.f31034d = bArr;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f31039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f31040b;

        /* synthetic */ e(long j10, long j11, C0411a c0411a) {
            this(j10, j11);
        }

        public double a() {
            return this.f31039a / this.f31040b;
        }

        public String toString() {
            return this.f31039a + "/" + this.f31040b;
        }

        private e(long j10, long j11) {
            if (j11 == 0) {
                this.f31039a = 0L;
                this.f31040b = 1L;
            } else {
                this.f31039a = j10;
                this.f31040b = j11;
            }
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        Z = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f30975a0 = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f30976b0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f30977c0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f30978d0 = dVarArr5;
        f30979e0 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f30980f0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f30981g0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f30982h0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f30983i0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f30984j0 = dVarArr10;
        f30985k0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f30986l0 = new HashMap[dVarArr10.length];
        f30987m0 = new HashMap[dVarArr10.length];
        f30988n0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f30989o0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f30990p0 = charsetForName;
        f30991q0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f30992r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        U = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr11 = f30984j0;
            if (i10 >= dVarArr11.length) {
                HashMap map = f30989o0;
                d[] dVarArr12 = f30985k0;
                map.put(Integer.valueOf(dVarArr12[0].f31035a), 5);
                map.put(Integer.valueOf(dVarArr12[1].f31035a), 1);
                map.put(Integer.valueOf(dVarArr12[2].f31035a), 2);
                map.put(Integer.valueOf(dVarArr12[3].f31035a), 3);
                map.put(Integer.valueOf(dVarArr12[4].f31035a), 7);
                map.put(Integer.valueOf(dVarArr12[5].f31035a), 8);
                f30993s0 = Pattern.compile(".*[1-9].*");
                f30994t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f30995u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f30997v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f30986l0[i10] = new HashMap();
            f30987m0[i10] = new HashMap();
            for (d dVar : dVarArr11[i10]) {
                f30986l0[i10].put(Integer.valueOf(dVar.f31035a), dVar);
                f30987m0[i10].put(dVar.f31036b, dVar);
            }
            i10++;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    private boolean A(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder byteOrderI = I(bVar);
            this.f31009h = byteOrderI;
            bVar.l(byteOrderI);
            boolean z10 = bVar.readShort() == 85;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private static boolean B(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f30996v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean C(HashMap map) {
        c cVar;
        int i10;
        c cVar2 = (c) map.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.k(this.f31009h);
            int[] iArr2 = f31000y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f31005d == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((i10 = cVar.i(this.f31009h)) == 1 && Arrays.equals(iArr, A)) || (i10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f30996v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private boolean D(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.f31009h) <= 512 && cVar2.i(this.f31009h) <= 512;
    }

    private boolean E(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = L;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = M;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[L.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00af A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #2 {all -> 0x0013, blocks: (B:3:0x0002, B:5:0x0007, B:12:0x001c, B:14:0x0020, B:15:0x002e, B:17:0x0036, B:19:0x003f, B:38:0x0071, B:25:0x0050, B:32:0x005e, B:35:0x0066, B:36:0x006a, B:37:0x006e, B:39:0x007b, B:41:0x0085, B:44:0x008d, B:47:0x0095, B:50:0x009d, B:55:0x00ab, B:57:0x00af), top: B:66:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void F(java.io.InputStream r5) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a.F(java.io.InputStream):void");
    }

    private void G(b bVar) throws IOException {
        ByteOrder byteOrderI = I(bVar);
        this.f31009h = byteOrderI;
        bVar.l(byteOrderI);
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f31005d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i11);
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.n(i12);
        }
    }

    private void H() {
        for (int i10 = 0; i10 < this.f31007f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f31007f[i10].size());
            for (Map.Entry entry : this.f31007f[i10].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.j(this.f31009h) + "'");
            }
        }
    }

    private ByteOrder I(b bVar) throws IOException {
        short s10 = bVar.readShort();
        if (s10 == 18761) {
            if (f30996v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (f30996v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    private void J(byte[] bArr, int i10) throws IOException {
        f fVar = new f(bArr);
        G(fVar);
        K(fVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void K(w0.a.f r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a.K(w0.a$f, int):void");
    }

    private void L(int i10, String str, String str2) {
        if (this.f31007f[i10].isEmpty() || this.f31007f[i10].get(str) == null) {
            return;
        }
        HashMap map = this.f31007f[i10];
        map.put(str2, (c) map.get(str));
        this.f31007f[i10].remove(str);
    }

    private void M(f fVar, int i10) throws Throwable {
        c cVar = (c) this.f31007f[i10].get("ImageLength");
        c cVar2 = (c) this.f31007f[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = (c) this.f31007f[i10].get("JPEGInterchangeFormat");
            c cVar4 = (c) this.f31007f[i10].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int i11 = cVar3.i(this.f31009h);
            int i12 = cVar3.i(this.f31009h);
            fVar.q(i11);
            byte[] bArr = new byte[i12];
            fVar.readFully(bArr);
            j(new b(bArr), i11, i10);
        }
    }

    private void N(b bVar) throws Throwable {
        HashMap map = this.f31007f[4];
        c cVar = (c) map.get("Compression");
        if (cVar == null) {
            this.f31016o = 6;
            t(bVar, map);
            return;
        }
        int i10 = cVar.i(this.f31009h);
        this.f31016o = i10;
        if (i10 != 1) {
            if (i10 == 6) {
                t(bVar, map);
                return;
            } else if (i10 != 7) {
                return;
            }
        }
        if (C(map)) {
            u(bVar, map);
        }
    }

    private static boolean O(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void P(int i10, int i11) throws Throwable {
        if (this.f31007f[i10].isEmpty() || this.f31007f[i11].isEmpty()) {
            if (f30996v) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) this.f31007f[i10].get("ImageLength");
        c cVar2 = (c) this.f31007f[i10].get("ImageWidth");
        c cVar3 = (c) this.f31007f[i11].get("ImageLength");
        c cVar4 = (c) this.f31007f[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (f30996v) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (f30996v) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i12 = cVar.i(this.f31009h);
        int i13 = cVar2.i(this.f31009h);
        int i14 = cVar3.i(this.f31009h);
        int i15 = cVar4.i(this.f31009h);
        if (i12 >= i14 || i13 >= i15) {
            return;
        }
        HashMap[] mapArr = this.f31007f;
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    private static void Q(CRC32 crc32, int i10) {
        crc32.update(i10 >>> 24);
        crc32.update(i10 >>> 16);
        crc32.update(i10 >>> 8);
        crc32.update(i10);
    }

    private void R(f fVar, int i10) throws Throwable {
        c cVarF;
        c cVarF2;
        c cVar = (c) this.f31007f[i10].get("DefaultCropSize");
        c cVar2 = (c) this.f31007f[i10].get("SensorTopBorder");
        c cVar3 = (c) this.f31007f[i10].get("SensorLeftBorder");
        c cVar4 = (c) this.f31007f[i10].get("SensorBottomBorder");
        c cVar5 = (c) this.f31007f[i10].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                M(fVar, i10);
                return;
            }
            int i11 = cVar2.i(this.f31009h);
            int i12 = cVar4.i(this.f31009h);
            int i13 = cVar5.i(this.f31009h);
            int i14 = cVar3.i(this.f31009h);
            if (i12 <= i11 || i13 <= i14) {
                return;
            }
            c cVarF3 = c.f(i12 - i11, this.f31009h);
            c cVarF4 = c.f(i13 - i14, this.f31009h);
            this.f31007f[i10].put("ImageLength", cVarF3);
            this.f31007f[i10].put("ImageWidth", cVarF4);
            return;
        }
        if (cVar.f31031a == 5) {
            e[] eVarArr = (e[]) cVar.k(this.f31009h);
            if (eVarArr == null || eVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
            cVarF = c.d(eVarArr[0], this.f31009h);
            cVarF2 = c.d(eVarArr[1], this.f31009h);
        } else {
            int[] iArr = (int[]) cVar.k(this.f31009h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            cVarF = c.f(iArr[0], this.f31009h);
            cVarF2 = c.f(iArr[1], this.f31009h);
        }
        this.f31007f[i10].put("ImageWidth", cVarF);
        this.f31007f[i10].put("ImageLength", cVarF2);
    }

    private void S() throws Throwable {
        P(0, 5);
        P(0, 4);
        P(5, 4);
        c cVar = (c) this.f31007f[1].get("PixelXDimension");
        c cVar2 = (c) this.f31007f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f31007f[0].put("ImageWidth", cVar);
            this.f31007f[0].put("ImageLength", cVar2);
        }
        if (this.f31007f[4].isEmpty() && D(this.f31007f[5])) {
            HashMap[] mapArr = this.f31007f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!D(this.f31007f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        L(0, "ThumbnailOrientation", "Orientation");
        L(0, "ThumbnailImageLength", "ImageLength");
        L(0, "ThumbnailImageWidth", "ImageWidth");
        L(5, "ThumbnailOrientation", "Orientation");
        L(5, "ThumbnailImageLength", "ImageLength");
        L(5, "ThumbnailImageWidth", "ImageWidth");
        L(4, "Orientation", "ThumbnailOrientation");
        L(4, "ImageLength", "ThumbnailImageLength");
        L(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void e() {
        String strF = f("DateTimeOriginal");
        if (strF != null && f("DateTime") == null) {
            this.f31007f[0].put("DateTime", c.a(strF));
        }
        if (f("ImageWidth") == null) {
            this.f31007f[0].put("ImageWidth", c.b(0L, this.f31009h));
        }
        if (f("ImageLength") == null) {
            this.f31007f[0].put("ImageLength", c.b(0L, this.f31009h));
        }
        if (f("Orientation") == null) {
            this.f31007f[0].put("Orientation", c.b(0L, this.f31009h));
        }
        if (f("LightSource") == null) {
            this.f31007f[1].put("LightSource", c.b(0L, this.f31009h));
        }
    }

    private c h(String str) {
        c cVar;
        c cVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f30996v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && s(this.f31005d) == 2 && (cVar2 = this.f31021t) != null) {
            return cVar2;
        }
        for (int i10 = 0; i10 < f30984j0.length; i10++) {
            c cVar3 = (c) this.f31007f[i10].get(str);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (!"Xmp".equals(str) || (cVar = this.f31021t) == null) {
            return null;
        }
        return cVar;
    }

    private void i(f fVar, int i10) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i10 == 15 && i11 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.a.a(mediaMetadataRetriever, new C0411a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f31007f[0].put("ImageWidth", c.f(Integer.parseInt(strExtractMetadata), this.f31009h));
                }
                if (strExtractMetadata3 != null) {
                    this.f31007f[0].put("ImageLength", c.f(Integer.parseInt(strExtractMetadata3), this.f31009h));
                }
                if (strExtractMetadata2 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata2);
                    this.f31007f[0].put("Orientation", c.f(i12 != 90 ? i12 != 180 ? i12 != 270 ? 1 : 8 : 3 : 6, this.f31009h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i13 = Integer.parseInt(strExtractMetadata4);
                    int i14 = Integer.parseInt(strExtractMetadata5);
                    if (i14 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.q(i13);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i15 = i13 + 6;
                    int i16 = i14 - 6;
                    if (!Arrays.equals(bArr, f30991q0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i16];
                    fVar.readFully(bArr2);
                    this.f31017p = i15;
                    J(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i17 = Integer.parseInt(strExtractMetadata8);
                    int i18 = Integer.parseInt(strExtractMetadata9);
                    long j10 = i17;
                    fVar.q(j10);
                    byte[] bArr3 = new byte[i18];
                    fVar.readFully(bArr3);
                    this.f31021t = new c(1, i18, j10, bArr3);
                    this.f31022u = true;
                }
                if (f30996v) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e10) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e10);
            }
        } finally {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00a7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00aa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00ad. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159 A[LOOP:0: B:10:0x0037->B:55:0x0159, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015f A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1060)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j(w0.a.b r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a.j(w0.a$b, int, int):void");
    }

    private int k(BufferedInputStream bufferedInputStream) throws Throwable {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (w(bArr)) {
            return 4;
        }
        if (z(bArr)) {
            return 9;
        }
        int iV = v(bArr);
        if (iV != 0) {
            return iV;
        }
        if (x(bArr)) {
            return 7;
        }
        if (A(bArr)) {
            return 10;
        }
        if (y(bArr)) {
            return 13;
        }
        return E(bArr) ? 14 : 0;
    }

    private void l(f fVar) throws Throwable {
        int i10;
        int i11;
        o(fVar);
        c cVar = (c) this.f31007f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f31034d);
            fVar2.l(this.f31009h);
            byte[] bArr = H;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.q(0L);
            byte[] bArr3 = I;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.q(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.q(12L);
            }
            K(fVar2, 6);
            c cVar2 = (c) this.f31007f[7].get("PreviewImageStart");
            c cVar3 = (c) this.f31007f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f31007f[5].put("JPEGInterchangeFormat", cVar2);
                this.f31007f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) this.f31007f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.f31009h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                c cVarF = c.f(i14, this.f31009h);
                c cVarF2 = c.f(i15, this.f31009h);
                this.f31007f[0].put("ImageWidth", cVarF);
                this.f31007f[0].put("ImageLength", cVarF2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r17.f31022u = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m(w0.a.b r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a.m(w0.a$b):void");
    }

    private void n(b bVar) throws Throwable {
        boolean z10 = f30996v;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.n(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.n(i10 - bVar.c());
        bVar.readFully(bArr4);
        j(new b(bArr4), i10, 5);
        bVar.n(i12 - bVar.c());
        bVar.l(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f30979e0.f31035a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                c cVarF = c.f(s10, this.f31009h);
                c cVarF2 = c.f(s11, this.f31009h);
                this.f31007f[0].put("ImageLength", cVarF);
                this.f31007f[0].put("ImageWidth", cVarF2);
                if (f30996v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.n(unsignedShort2);
        }
    }

    private void o(f fVar) throws Throwable {
        c cVar;
        G(fVar);
        K(fVar, 0);
        R(fVar, 0);
        R(fVar, 5);
        R(fVar, 4);
        S();
        if (this.f31005d != 8 || (cVar = (c) this.f31007f[1].get("MakerNote")) == null) {
            return;
        }
        f fVar2 = new f(cVar.f31034d);
        fVar2.l(this.f31009h);
        fVar2.n(6);
        K(fVar2, 9);
        c cVar2 = (c) this.f31007f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f31007f[1].put("ColorSpace", cVar2);
        }
    }

    private void p(f fVar) throws Throwable {
        if (f30996v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        o(fVar);
        c cVar = (c) this.f31007f[0].get("JpgFromRaw");
        if (cVar != null) {
            j(new b(cVar.f31034d), (int) cVar.f31033c, 5);
        }
        c cVar2 = (c) this.f31007f[0].get("ISO");
        c cVar3 = (c) this.f31007f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f31007f[1].put("PhotographicSensitivity", cVar2);
    }

    private boolean q(f fVar) throws IOException {
        byte[] bArr = f30991q0;
        byte[] bArr2 = new byte[bArr.length];
        fVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrE = fVar.e();
        this.f31017p = bArr.length;
        J(bArrE, 0);
        return true;
    }

    private void r(b bVar) throws Throwable {
        if (f30996v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.l(ByteOrder.LITTLE_ENDIAN);
        bVar.n(L.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = M;
        bVar.n(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(N, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i11];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f30991q0;
                    if (w0.b.b(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i11);
                    }
                    this.f31017p = i12;
                    J(bArrCopyOfRange, 0);
                    N(new b(bArrCopyOfRange));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.n(i11);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt WebP file.", e10);
            }
        }
    }

    private static int s(int i10) {
        if (i10 != 4) {
            return (i10 == 9 || i10 == 15 || i10 == 12 || i10 == 13) ? 2 : 1;
        }
        return 3;
    }

    private void t(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i10 = cVar.i(this.f31009h);
        int i11 = cVar2.i(this.f31009h);
        if (this.f31005d == 7) {
            i10 += this.f31018q;
        }
        if (i10 > 0 && i11 > 0) {
            this.f31010i = true;
            if (this.f31002a == null && this.f31004c == null && this.f31003b == null) {
                byte[] bArr = new byte[i11];
                bVar.n(i10);
                bVar.readFully(bArr);
                this.f31015n = bArr;
            }
            this.f31013l = i10;
            this.f31014m = i11;
        }
        if (f30996v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i10 + ", length: " + i11);
        }
    }

    private void u(b bVar, HashMap map) throws IOException {
        int i10;
        c cVar = (c) map.get("StripOffsets");
        c cVar2 = (c) map.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] jArrA = w0.b.a(cVar.k(this.f31009h));
        long[] jArrA2 = w0.b.a(cVar2.k(this.f31009h));
        if (jArrA == null || jArrA.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrA2 == null || jArrA2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrA.length != jArrA2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : jArrA2) {
            j10 += j11;
        }
        int i11 = (int) j10;
        byte[] bArr = new byte[i11];
        int i12 = 1;
        this.f31012k = true;
        this.f31011j = true;
        this.f31010i = true;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < jArrA.length) {
            int i16 = (int) jArrA[i13];
            byte[] bArr2 = bArr;
            int i17 = (int) jArrA2[i13];
            if (i13 < jArrA.length - i12) {
                i10 = i13;
                if (i16 + i17 != jArrA[i10 + 1]) {
                    this.f31012k = false;
                }
            } else {
                i10 = i13;
            }
            int i18 = i16 - i14;
            if (i18 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.n(i18);
                int i19 = i14 + i18;
                byte[] bArr3 = new byte[i17];
                try {
                    bVar.readFully(bArr3);
                    i14 = i19 + i17;
                    System.arraycopy(bArr3, 0, bArr2, i15, i17);
                    i15 += i17;
                    i13 = i10 + 1;
                    bArr = bArr2;
                    i12 = 1;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i17 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i18 + " bytes.");
                return;
            }
        }
        this.f31015n = bArr;
        if (this.f31012k) {
            this.f31013l = (int) jArrA[0];
            this.f31014m = i11;
        }
    }

    private int v(byte[] bArr) throws Throwable {
        long j10;
        b bVar = null;
        try {
            try {
                b bVar2 = new b(bArr);
                try {
                    long length = bVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    bVar2.readFully(bArr2);
                    if (!Arrays.equals(bArr2, C)) {
                        bVar2.close();
                        return 0;
                    }
                    if (length == 1) {
                        length = bVar2.readLong();
                        j10 = 16;
                        if (length < 16) {
                            bVar2.close();
                            return 0;
                        }
                    } else {
                        j10 = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j11 = length - j10;
                    if (j11 < 8) {
                        bVar2.close();
                        return 0;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z10 = false;
                    boolean z11 = false;
                    boolean z12 = false;
                    for (long j12 = 0; j12 < j11 / 4; j12++) {
                        try {
                            bVar2.readFully(bArr3);
                            if (j12 != 1) {
                                if (Arrays.equals(bArr3, D)) {
                                    z10 = true;
                                } else if (Arrays.equals(bArr3, E)) {
                                    z11 = true;
                                } else if (Arrays.equals(bArr3, F) || Arrays.equals(bArr3, G)) {
                                    z12 = true;
                                }
                                if (!z10) {
                                    continue;
                                } else {
                                    if (z11) {
                                        bVar2.close();
                                        return 12;
                                    }
                                    if (z12) {
                                        bVar2.close();
                                        return 15;
                                    }
                                }
                            }
                        } catch (EOFException unused) {
                            bVar2.close();
                            return 0;
                        }
                    }
                    bVar2.close();
                } catch (Exception e10) {
                    e = e10;
                    bVar = bVar2;
                    if (f30996v) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar != null) {
                        bVar.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
        return 0;
    }

    private static boolean w(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = B;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean x(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder byteOrderI = I(bVar);
            this.f31009h = byteOrderI;
            bVar.l(byteOrderI);
            short s10 = bVar.readShort();
            boolean z10 = s10 == 20306 || s10 == 21330;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private boolean y(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = J;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean z(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    public String f(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarH = h(str);
        if (cVarH == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!f30988n0.contains(str)) {
                return cVarH.j(this.f31009h);
            }
            try {
                return Double.toString(cVarH.h(this.f31009h));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i10 = cVarH.f31031a;
        if (i10 != 5 && i10 != 10) {
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + cVarH.f31031a);
            return null;
        }
        e[] eVarArr = (e[]) cVarH.k(this.f31009h);
        if (eVarArr == null || eVarArr.length != 3) {
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
            return null;
        }
        e eVar = eVarArr[0];
        Integer numValueOf = Integer.valueOf((int) (eVar.f31039a / eVar.f31040b));
        e eVar2 = eVarArr[1];
        Integer numValueOf2 = Integer.valueOf((int) (eVar2.f31039a / eVar2.f31040b));
        e eVar3 = eVarArr[2];
        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f31039a / eVar3.f31040b)));
    }

    public int g(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarH = h(str);
        if (cVarH != null) {
            try {
                return cVarH.i(this.f31009h);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    private static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final DataInputStream f31026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f31027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteOrder f31028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f31029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f31030e;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f31030e = bArr.length;
        }

        public int a() {
            return this.f31030e;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f31026a.available();
        }

        public int c() {
            return this.f31027b;
        }

        public byte[] e() throws IOException {
            byte[] bArrCopyOf = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
            int i10 = 0;
            while (true) {
                if (i10 == bArrCopyOf.length) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                }
                int i11 = this.f31026a.read(bArrCopyOf, i10, bArrCopyOf.length - i10);
                if (i11 == -1) {
                    return Arrays.copyOf(bArrCopyOf, i10);
                }
                i10 += i11;
                this.f31027b += i11;
            }
        }

        public long k() {
            return ((long) readInt()) & 4294967295L;
        }

        public void l(ByteOrder byteOrder) {
            this.f31028c = byteOrder;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public void n(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f31026a.skip(i12);
                if (iSkip <= 0) {
                    if (this.f31029d == null) {
                        this.f31029d = new byte[8192];
                    }
                    iSkip = this.f31026a.read(this.f31029d, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += iSkip;
            }
            this.f31027b += i11;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f31027b++;
            return this.f31026a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f31027b++;
            return this.f31026a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f31027b++;
            int i10 = this.f31026a.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f31027b += 2;
            return this.f31026a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f31027b += i11;
            this.f31026a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f31027b += 4;
            int i10 = this.f31026a.read();
            int i11 = this.f31026a.read();
            int i12 = this.f31026a.read();
            int i13 = this.f31026a.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f31028c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f31028c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f31027b += 8;
            int i10 = this.f31026a.read();
            int i11 = this.f31026a.read();
            int i12 = this.f31026a.read();
            int i13 = this.f31026a.read();
            int i14 = this.f31026a.read();
            int i15 = this.f31026a.read();
            int i16 = this.f31026a.read();
            int i17 = this.f31026a.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f31028c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f31028c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f31027b += 2;
            int i10 = this.f31026a.read();
            int i11 = this.f31026a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f31028c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f31028c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f31027b += 2;
            return this.f31026a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f31027b++;
            return this.f31026a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f31027b += 2;
            int i10 = this.f31026a.read();
            int i11 = this.f31026a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f31028c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f31028c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f31026a.read(bArr, i10, i11);
            this.f31027b += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f31027b += bArr.length;
            this.f31026a.readFully(bArr);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f31026a = dataInputStream;
            dataInputStream.mark(0);
            this.f31027b = 0;
            this.f31028c = byteOrder;
            this.f31030e = inputStream instanceof b ? ((b) inputStream).a() : -1;
        }
    }

    private static class f extends b {
        f(byte[] bArr) {
            super(bArr);
            this.f31026a.mark(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }

        public void q(long j10) throws IOException {
            int i10 = this.f31027b;
            if (i10 > j10) {
                this.f31027b = 0;
                this.f31026a.reset();
            } else {
                j10 -= (long) i10;
            }
            n((int) j10);
        }

        f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f31026a.mark(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(java.io.InputStream r3, int r4) {
        /*
            r2 = this;
            r2.<init>()
            w0.a$d[][] r0 = w0.a.f30984j0
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r2.f31007f = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r2.f31008g = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.f31009h = r0
            if (r3 == 0) goto L57
            r0 = 0
            r2.f31002a = r0
            r1 = 1
            if (r4 != r1) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            r2.f31006e = r1
            if (r1 == 0) goto L29
            r2.f31004c = r0
            r2.f31003b = r0
            goto L53
        L29:
            boolean r4 = r3 instanceof android.content.res.AssetManager.AssetInputStream
            if (r4 == 0) goto L35
            r4 = r3
            android.content.res.AssetManager$AssetInputStream r4 = (android.content.res.AssetManager.AssetInputStream) r4
            r2.f31004c = r4
            r2.f31003b = r0
            goto L53
        L35:
            boolean r4 = r3 instanceof java.io.FileInputStream
            if (r4 == 0) goto L4f
            r4 = r3
            java.io.FileInputStream r4 = (java.io.FileInputStream) r4
            java.io.FileDescriptor r1 = r4.getFD()
            boolean r1 = B(r1)
            if (r1 == 0) goto L4f
            r2.f31004c = r0
            java.io.FileDescriptor r4 = r4.getFD()
            r2.f31003b = r4
            goto L53
        L4f:
            r2.f31004c = r0
            r2.f31003b = r0
        L53:
            r2.F(r3)
            return
        L57:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "inputStream cannot be null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a.<init>(java.io.InputStream, int):void");
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f31035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f31036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f31037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f31038d;

        d(String str, int i10, int i11) {
            this.f31036b = str;
            this.f31035a = i10;
            this.f31037c = i11;
            this.f31038d = -1;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f31037c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f31038d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        d(String str, int i10, int i11, int i12) {
            this.f31036b = str;
            this.f31035a = i10;
            this.f31037c = i11;
            this.f31038d = i12;
        }
    }

    /* JADX INFO: renamed from: w0.a$a, reason: collision with other inner class name */
    class C0411a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f31023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f31024b;

        C0411a(f fVar) {
            this.f31024b = fVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f31023a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f31024b.available())) {
                        return -1;
                    }
                    this.f31024b.q(j10);
                    this.f31023a = j10;
                }
                if (i11 > this.f31024b.available()) {
                    i11 = this.f31024b.available();
                }
                int i12 = this.f31024b.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f31023a += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f31023a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
