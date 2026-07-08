package io.grpc.internal;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
class x0 implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Inflater f17233g;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f17236s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f17237t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f17238u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f17227a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CRC32 f17228b = new CRC32();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f17229c = new b(this, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f17230d = new byte[WXMediaMessage.TITLE_LENGTH_LIMIT];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f17234h = c.HEADER;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f17235r = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f17239v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f17240w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f17241x = true;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17242a;

        static {
            int[] iArr = new int[c.values().length];
            f17242a = iArr;
            try {
                iArr[c.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17242a[c.HEADER_EXTRA_LEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17242a[c.HEADER_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17242a[c.HEADER_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17242a[c.HEADER_COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17242a[c.HEADER_CRC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17242a[c.INITIALIZE_INFLATER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17242a[c.INFLATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17242a[c.INFLATER_NEEDS_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17242a[c.TRAILER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() {
            while (k() > 0) {
                if (h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h() {
            int unsignedByte;
            if (x0.this.f17232f - x0.this.f17231e > 0) {
                unsignedByte = x0.this.f17230d[x0.this.f17231e] & MessagePack.Code.EXT_TIMESTAMP;
                x0.e(x0.this, 1);
            } else {
                unsignedByte = x0.this.f17227a.readUnsignedByte();
            }
            x0.this.f17228b.update(unsignedByte);
            x0.q(x0.this, 1);
            return unsignedByte;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return ((long) j()) | (((long) j()) << 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int j() {
            return h() | (h() << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int k() {
            return (x0.this.f17232f - x0.this.f17231e) + x0.this.f17227a.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(int i10) {
            int i11;
            int i12 = x0.this.f17232f - x0.this.f17231e;
            if (i12 > 0) {
                int iMin = Math.min(i12, i10);
                x0.this.f17228b.update(x0.this.f17230d, x0.this.f17231e, iMin);
                x0.e(x0.this, iMin);
                i11 = i10 - iMin;
            } else {
                i11 = i10;
            }
            if (i11 > 0) {
                byte[] bArr = new byte[WXMediaMessage.TITLE_LENGTH_LIMIT];
                int i13 = 0;
                while (i13 < i11) {
                    int iMin2 = Math.min(i11 - i13, WXMediaMessage.TITLE_LENGTH_LIMIT);
                    x0.this.f17227a.L(bArr, 0, iMin2);
                    x0.this.f17228b.update(bArr, 0, iMin2);
                    i13 += iMin2;
                }
            }
            x0.q(x0.this, i10);
        }

        /* synthetic */ b(x0 x0Var, a aVar) {
            this();
        }
    }

    private enum c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    x0() {
    }

    private int G(byte[] bArr, int i10, int i11) throws DataFormatException {
        r9.l.u(this.f17233g != null, "inflater is null");
        try {
            int totalIn = this.f17233g.getTotalIn();
            int iInflate = this.f17233g.inflate(bArr, i10, i11);
            int totalIn2 = this.f17233g.getTotalIn() - totalIn;
            this.f17239v += totalIn2;
            this.f17240w += totalIn2;
            this.f17231e += totalIn2;
            this.f17228b.update(bArr, i10, iInflate);
            if (this.f17233g.finished()) {
                this.f17238u = this.f17233g.getBytesWritten() & 4294967295L;
                this.f17234h = c.TRAILER;
                return iInflate;
            }
            if (this.f17233g.needsInput()) {
                this.f17234h = c.INFLATER_NEEDS_INPUT;
            }
            return iInflate;
        } catch (DataFormatException e10) {
            throw new DataFormatException("Inflater data format exception: " + e10.getMessage());
        }
    }

    private boolean S() {
        Inflater inflater = this.f17233g;
        if (inflater == null) {
            this.f17233g = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f17228b.reset();
        int i10 = this.f17232f;
        int i11 = this.f17231e;
        int i12 = i10 - i11;
        if (i12 > 0) {
            this.f17233g.setInput(this.f17230d, i11, i12);
            this.f17234h = c.INFLATING;
        } else {
            this.f17234h = c.INFLATER_NEEDS_INPUT;
        }
        return true;
    }

    private boolean W() throws ZipException {
        if (this.f17229c.k() < 10) {
            return false;
        }
        if (this.f17229c.j() != 35615) {
            throw new ZipException("Not in GZIP format");
        }
        if (this.f17229c.h() != 8) {
            throw new ZipException("Unsupported compression method");
        }
        this.f17236s = this.f17229c.h();
        this.f17229c.l(6);
        this.f17234h = c.HEADER_EXTRA_LEN;
        return true;
    }

    private boolean X() {
        if ((this.f17236s & 16) != 16) {
            this.f17234h = c.HEADER_CRC;
            return true;
        }
        if (!this.f17229c.g()) {
            return false;
        }
        this.f17234h = c.HEADER_CRC;
        return true;
    }

    static /* synthetic */ int e(x0 x0Var, int i10) {
        int i11 = x0Var.f17231e + i10;
        x0Var.f17231e = i11;
        return i11;
    }

    private boolean h0() throws ZipException {
        if ((this.f17236s & 2) != 2) {
            this.f17234h = c.INITIALIZE_INFLATER;
            return true;
        }
        if (this.f17229c.k() < 2) {
            return false;
        }
        if ((65535 & ((int) this.f17228b.getValue())) != this.f17229c.j()) {
            throw new ZipException("Corrupt GZIP header");
        }
        this.f17234h = c.INITIALIZE_INFLATER;
        return true;
    }

    private boolean p0() {
        int iK = this.f17229c.k();
        int i10 = this.f17237t;
        if (iK < i10) {
            return false;
        }
        this.f17229c.l(i10);
        this.f17234h = c.HEADER_NAME;
        return true;
    }

    static /* synthetic */ int q(x0 x0Var, int i10) {
        int i11 = x0Var.f17239v + i10;
        x0Var.f17239v = i11;
        return i11;
    }

    private boolean s() {
        r9.l.u(this.f17233g != null, "inflater is null");
        r9.l.u(this.f17231e == this.f17232f, "inflaterInput has unconsumed bytes");
        int iMin = Math.min(this.f17227a.g(), WXMediaMessage.TITLE_LENGTH_LIMIT);
        if (iMin == 0) {
            return false;
        }
        this.f17231e = 0;
        this.f17232f = iMin;
        this.f17227a.L(this.f17230d, 0, iMin);
        this.f17233g.setInput(this.f17230d, this.f17231e, iMin);
        this.f17234h = c.INFLATING;
        return true;
    }

    private boolean t0() {
        if ((this.f17236s & 4) != 4) {
            this.f17234h = c.HEADER_NAME;
            return true;
        }
        if (this.f17229c.k() < 2) {
            return false;
        }
        this.f17237t = this.f17229c.j();
        this.f17234h = c.HEADER_EXTRA;
        return true;
    }

    private boolean u0() {
        if ((this.f17236s & 8) != 8) {
            this.f17234h = c.HEADER_COMMENT;
            return true;
        }
        if (!this.f17229c.g()) {
            return false;
        }
        this.f17234h = c.HEADER_COMMENT;
        return true;
    }

    private boolean v0() throws ZipException {
        if (this.f17233g != null && this.f17229c.k() <= 18) {
            this.f17233g.end();
            this.f17233g = null;
        }
        if (this.f17229c.k() < 8) {
            return false;
        }
        if (this.f17228b.getValue() != this.f17229c.i() || this.f17238u != this.f17229c.i()) {
            throw new ZipException("Corrupt GZIP trailer");
        }
        this.f17228b.reset();
        this.f17234h = c.HEADER;
        return true;
    }

    int H(byte[] bArr, int i10, int i11) throws ZipException {
        boolean z10 = true;
        r9.l.u(!this.f17235r, "GzipInflatingBuffer is closed");
        boolean zV0 = true;
        int iG = 0;
        while (zV0) {
            int i12 = i11 - iG;
            if (i12 <= 0) {
                if (zV0 && (this.f17234h != c.HEADER || this.f17229c.k() >= 10)) {
                    z10 = false;
                }
                this.f17241x = z10;
                return iG;
            }
            switch (a.f17242a[this.f17234h.ordinal()]) {
                case 1:
                    zV0 = W();
                    break;
                case 2:
                    zV0 = t0();
                    break;
                case 3:
                    zV0 = p0();
                    break;
                case 4:
                    zV0 = u0();
                    break;
                case 5:
                    zV0 = X();
                    break;
                case 6:
                    zV0 = h0();
                    break;
                case 7:
                    zV0 = S();
                    break;
                case 8:
                    iG += G(bArr, i10 + iG, i12);
                    zV0 = this.f17234h != c.TRAILER ? true : v0();
                    break;
                case 9:
                    zV0 = s();
                    break;
                case 10:
                    zV0 = v0();
                    break;
                default:
                    throw new AssertionError("Invalid state: " + this.f17234h);
            }
        }
        if (zV0) {
            z10 = false;
        }
        this.f17241x = z10;
        return iG;
    }

    boolean T() {
        r9.l.u(!this.f17235r, "GzipInflatingBuffer is closed");
        return this.f17241x;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f17235r) {
            return;
        }
        this.f17235r = true;
        this.f17227a.close();
        Inflater inflater = this.f17233g;
        if (inflater != null) {
            inflater.end();
            this.f17233g = null;
        }
    }

    void r(i2 i2Var) {
        r9.l.u(!this.f17235r, "GzipInflatingBuffer is closed");
        this.f17227a.e(i2Var);
        this.f17241x = false;
    }

    int v() {
        int i10 = this.f17239v;
        this.f17239v = 0;
        return i10;
    }

    int w() {
        int i10 = this.f17240w;
        this.f17240w = 0;
        return i10;
    }

    boolean x() {
        r9.l.u(!this.f17235r, "GzipInflatingBuffer is closed");
        return (this.f17229c.k() == 0 && this.f17234h == c.HEADER) ? false : true;
    }
}
