package tb;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.msgpack.core.MessagePack;
import tb.b;
import tb.f;
import vh.n0;
import vh.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f27737a = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final vh.h f27738b = vh.h.f("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String[] f27745a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f27746b = new String[64];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f27747c = new String[256];

        static {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr = f27747c;
                if (i11 >= strArr.length) {
                    break;
                }
                strArr[i11] = String.format("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
                i11++;
            }
            String[] strArr2 = f27746b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            int i12 = iArr[0];
            strArr2[i12 | 8] = strArr2[i12] + "|PADDED";
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i13 = 0; i13 < 3; i13++) {
                int i14 = iArr2[i13];
                int i15 = iArr[0];
                String[] strArr3 = f27746b;
                int i16 = i15 | i14;
                strArr3[i16] = strArr3[i15] + '|' + strArr3[i14];
                strArr3[i16 | 8] = strArr3[i15] + '|' + strArr3[i14] + "|PADDED";
            }
            while (true) {
                String[] strArr4 = f27746b;
                if (i10 >= strArr4.length) {
                    return;
                }
                if (strArr4[i10] == null) {
                    strArr4[i10] = f27747c[i10];
                }
                i10++;
            }
        }

        static String a(byte b10, byte b11) {
            if (b11 == 0) {
                return "";
            }
            if (b10 != 2 && b10 != 3) {
                if (b10 == 4 || b10 == 6) {
                    return b11 == 1 ? "ACK" : f27747c[b11];
                }
                if (b10 != 7 && b10 != 8) {
                    String[] strArr = f27746b;
                    String str = b11 < strArr.length ? strArr[b11] : f27747c[b11];
                    return (b10 != 5 || (b11 & 4) == 0) ? (b10 != 0 || (b11 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f27747c[b11];
        }

        static String b(boolean z10, int i10, int i11, byte b10, byte b11) {
            String[] strArr = f27745a;
            return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b10 < strArr.length ? strArr[b10] : String.format("0x%02x", Byte.valueOf(b10)), a(b10, b11));
        }
    }

    static final class c implements tb.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final vh.g f27748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f27749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f27750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final f.a f27751d;

        c(vh.g gVar, int i10, boolean z10) {
            this.f27748a = gVar;
            this.f27750c = z10;
            a aVar = new a(gVar);
            this.f27749b = aVar;
            this.f27751d = new f.a(i10, aVar);
        }

        private void a(b.a aVar, int i10, byte b10, int i11) throws IOException {
            boolean z10 = (b10 & 1) != 0;
            if ((b10 & 32) != 0) {
                throw g.k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short s10 = (b10 & 8) != 0 ? (short) (this.f27748a.readByte() & MessagePack.Code.EXT_TIMESTAMP) : (short) 0;
            aVar.h(z10, i11, this.f27748a, g.l(i10, b10, s10), i10);
            this.f27748a.skip(s10);
        }

        private void c(b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i10 < 8) {
                throw g.k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
            }
            if (i11 != 0) {
                throw g.k("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int i12 = this.f27748a.readInt();
            int i13 = this.f27748a.readInt();
            int i14 = i10 - 8;
            tb.a aVarA = tb.a.a(i13);
            if (aVarA == null) {
                throw g.k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i13));
            }
            vh.h hVarP = vh.h.f30793e;
            if (i14 > 0) {
                hVarP = this.f27748a.p(i14);
            }
            aVar.j(i12, aVarA, hVarP);
        }

        private List e(int i10, short s10, byte b10, int i11) throws IOException {
            a aVar = this.f27749b;
            aVar.f27743e = i10;
            aVar.f27740b = i10;
            aVar.f27744f = s10;
            aVar.f27741c = b10;
            aVar.f27742d = i11;
            this.f27751d.l();
            return this.f27751d.e();
        }

        private void k(b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i11 == 0) {
                throw g.k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z10 = (b10 & 1) != 0;
            short s10 = (b10 & 8) != 0 ? (short) (this.f27748a.readByte() & MessagePack.Code.EXT_TIMESTAMP) : (short) 0;
            if ((b10 & 32) != 0) {
                n(aVar, i11);
                i10 -= 5;
            }
            aVar.l(false, z10, i11, -1, e(g.l(i10, b10, s10), s10, b10, i11), e.HTTP_20_HEADERS);
        }

        private void l(b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i10 != 8) {
                throw g.k("TYPE_PING length != 8: %s", Integer.valueOf(i10));
            }
            if (i11 != 0) {
                throw g.k("TYPE_PING streamId != 0", new Object[0]);
            }
            aVar.d((b10 & 1) != 0, this.f27748a.readInt(), this.f27748a.readInt());
        }

        private void n(b.a aVar, int i10) {
            int i11 = this.f27748a.readInt();
            aVar.g(i10, i11 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, (this.f27748a.readByte() & MessagePack.Code.EXT_TIMESTAMP) + 1, (Integer.MIN_VALUE & i11) != 0);
        }

        private void q(b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i10 != 5) {
                throw g.k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
            }
            if (i11 == 0) {
                throw g.k("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            n(aVar, i11);
        }

        private void r(b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i11 == 0) {
                throw g.k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short s10 = (b10 & 8) != 0 ? (short) (this.f27748a.readByte() & MessagePack.Code.EXT_TIMESTAMP) : (short) 0;
            aVar.i(i11, this.f27748a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, e(g.l(i10 - 4, b10, s10), s10, b10, i11));
        }

        private void s(b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i10 != 4) {
                throw g.k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
            }
            if (i11 == 0) {
                throw g.k("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int i12 = this.f27748a.readInt();
            tb.a aVarA = tb.a.a(i12);
            if (aVarA == null) {
                throw g.k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i12));
            }
            aVar.f(i11, aVarA);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private void v(b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i11 != 0) {
                throw g.k("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b10 & 1) != 0) {
                if (i10 != 0) {
                    throw g.k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                aVar.e();
                return;
            }
            if (i10 % 6 != 0) {
                throw g.k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
            }
            i iVar = new i();
            for (int i12 = 0; i12 < i10; i12 += 6) {
                short s10 = this.f27748a.readShort();
                int i13 = this.f27748a.readInt();
                switch (s10) {
                    case 1:
                    case 6:
                        iVar.e(s10, 0, i13);
                        break;
                    case 2:
                        if (i13 != 0 && i13 != 1) {
                            throw g.k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        iVar.e(s10, 0, i13);
                        break;
                    case 3:
                        s10 = 4;
                        iVar.e(s10, 0, i13);
                        break;
                    case 4:
                        if (i13 < 0) {
                            throw g.k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        s10 = 7;
                        iVar.e(s10, 0, i13);
                        break;
                        break;
                    case 5:
                        if (i13 < 16384 || i13 > 16777215) {
                            throw g.k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i13));
                        }
                        iVar.e(s10, 0, i13);
                        break;
                    default:
                        break;
                }
            }
            aVar.k(false, iVar);
            if (iVar.b() >= 0) {
                this.f27751d.g(iVar.b());
            }
        }

        private void w(b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i10 != 4) {
                throw g.k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
            }
            long j10 = ((long) this.f27748a.readInt()) & 2147483647L;
            if (j10 == 0) {
                throw g.k("windowSizeIncrement was 0", new Object[0]);
            }
            aVar.b(i11, j10);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f27748a.close();
        }

        @Override // tb.b
        public boolean f0(b.a aVar) throws IOException {
            try {
                this.f27748a.l0(9L);
                int iM = g.m(this.f27748a);
                if (iM < 0 || iM > 16384) {
                    throw g.k("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM));
                }
                byte b10 = (byte) (this.f27748a.readByte() & MessagePack.Code.EXT_TIMESTAMP);
                byte b11 = (byte) (this.f27748a.readByte() & MessagePack.Code.EXT_TIMESTAMP);
                int i10 = this.f27748a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                if (g.f27737a.isLoggable(Level.FINE)) {
                    g.f27737a.fine(b.b(true, i10, iM, b10, b11));
                }
                switch (b10) {
                    case 0:
                        a(aVar, iM, b11, i10);
                        return true;
                    case 1:
                        k(aVar, iM, b11, i10);
                        return true;
                    case 2:
                        q(aVar, iM, b11, i10);
                        return true;
                    case 3:
                        s(aVar, iM, b11, i10);
                        return true;
                    case 4:
                        v(aVar, iM, b11, i10);
                        return true;
                    case 5:
                        r(aVar, iM, b11, i10);
                        return true;
                    case 6:
                        l(aVar, iM, b11, i10);
                        return true;
                    case 7:
                        c(aVar, iM, b11, i10);
                        return true;
                    case 8:
                        w(aVar, iM, b11, i10);
                        return true;
                    default:
                        this.f27748a.skip(iM);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }
    }

    static final class d implements tb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final vh.f f27752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f27753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final vh.e f27754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final f.b f27755d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f27756e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f27757f;

        d(vh.f fVar, boolean z10) {
            this.f27752a = fVar;
            this.f27753b = z10;
            vh.e eVar = new vh.e();
            this.f27754c = eVar;
            this.f27755d = new f.b(eVar);
            this.f27756e = 16384;
        }

        private void k(int i10, long j10) {
            while (j10 > 0) {
                int iMin = (int) Math.min(this.f27756e, j10);
                long j11 = iMin;
                j10 -= j11;
                c(i10, iMin, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
                this.f27752a.C(this.f27754c, j11);
            }
        }

        @Override // tb.c
        public synchronized void A() {
            try {
                if (this.f27757f) {
                    throw new IOException("closed");
                }
                if (this.f27753b) {
                    if (g.f27737a.isLoggable(Level.FINE)) {
                        g.f27737a.fine(String.format(">> CONNECTION %s", g.f27738b.n()));
                    }
                    this.f27752a.write(g.f27738b.Y());
                    this.f27752a.flush();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // tb.c
        public synchronized void I(i iVar) {
            if (this.f27757f) {
                throw new IOException("closed");
            }
            this.f27756e = iVar.c(this.f27756e);
            c(0, 0, (byte) 4, (byte) 1);
            this.f27752a.flush();
        }

        void a(int i10, byte b10, vh.e eVar, int i11) {
            c(i10, i11, (byte) 0, b10);
            if (i11 > 0) {
                this.f27752a.C(eVar, i11);
            }
        }

        @Override // tb.c
        public synchronized void a0(int i10, tb.a aVar, byte[] bArr) {
            try {
                if (this.f27757f) {
                    throw new IOException("closed");
                }
                if (aVar.f27698a == -1) {
                    throw g.j("errorCode.httpCode == -1", new Object[0]);
                }
                c(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f27752a.writeInt(i10);
                this.f27752a.writeInt(aVar.f27698a);
                if (bArr.length > 0) {
                    this.f27752a.write(bArr);
                }
                this.f27752a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // tb.c
        public synchronized void b(int i10, long j10) {
            if (this.f27757f) {
                throw new IOException("closed");
            }
            if (j10 == 0 || j10 > 2147483647L) {
                throw g.j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
            }
            c(i10, 4, (byte) 8, (byte) 0);
            this.f27752a.writeInt((int) j10);
            this.f27752a.flush();
        }

        void c(int i10, int i11, byte b10, byte b11) {
            if (g.f27737a.isLoggable(Level.FINE)) {
                g.f27737a.fine(b.b(false, i10, i11, b10, b11));
            }
            int i12 = this.f27756e;
            if (i11 > i12) {
                throw g.j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
            }
            if ((Integer.MIN_VALUE & i10) != 0) {
                throw g.j("reserved bit set: %s", Integer.valueOf(i10));
            }
            g.n(this.f27752a, i11);
            this.f27752a.writeByte(b10 & MessagePack.Code.EXT_TIMESTAMP);
            this.f27752a.writeByte(b11 & MessagePack.Code.EXT_TIMESTAMP);
            this.f27752a.writeInt(i10 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.f27757f = true;
            this.f27752a.close();
        }

        @Override // tb.c
        public synchronized void d(boolean z10, int i10, int i11) {
            if (this.f27757f) {
                throw new IOException("closed");
            }
            c(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
            this.f27752a.writeInt(i10);
            this.f27752a.writeInt(i11);
            this.f27752a.flush();
        }

        void e(boolean z10, int i10, List list) throws IOException {
            if (this.f27757f) {
                throw new IOException("closed");
            }
            this.f27755d.e(list);
            long size = this.f27754c.size();
            int iMin = (int) Math.min(this.f27756e, size);
            long j10 = iMin;
            byte b10 = size == j10 ? (byte) 4 : (byte) 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            c(i10, iMin, (byte) 1, b10);
            this.f27752a.C(this.f27754c, j10);
            if (size > j10) {
                k(i10, size - j10);
            }
        }

        @Override // tb.c
        public synchronized void f(int i10, tb.a aVar) {
            if (this.f27757f) {
                throw new IOException("closed");
            }
            if (aVar.f27698a == -1) {
                throw new IllegalArgumentException();
            }
            c(i10, 4, (byte) 3, (byte) 0);
            this.f27752a.writeInt(aVar.f27698a);
            this.f27752a.flush();
        }

        @Override // tb.c
        public synchronized void flush() {
            if (this.f27757f) {
                throw new IOException("closed");
            }
            this.f27752a.flush();
        }

        @Override // tb.c
        public int i0() {
            return this.f27756e;
        }

        @Override // tb.c
        public synchronized void j0(i iVar) {
            try {
                if (this.f27757f) {
                    throw new IOException("closed");
                }
                int i10 = 0;
                c(0, iVar.f() * 6, (byte) 4, (byte) 0);
                while (i10 < 10) {
                    if (iVar.d(i10)) {
                        this.f27752a.writeShort(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                        this.f27752a.writeInt(iVar.a(i10));
                    }
                    i10++;
                }
                this.f27752a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // tb.c
        public synchronized void k0(boolean z10, boolean z11, int i10, int i11, List list) {
            if (z11) {
                throw new UnsupportedOperationException();
            }
            if (this.f27757f) {
                throw new IOException("closed");
            }
            e(z10, i10, list);
        }

        @Override // tb.c
        public synchronized void m(boolean z10, int i10, vh.e eVar, int i11) {
            if (this.f27757f) {
                throw new IOException("closed");
            }
            a(i10, z10 ? (byte) 1 : (byte) 0, eVar, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IllegalArgumentException j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException k(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i10, byte b10, short s10) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        throw k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(vh.g gVar) {
        return (gVar.readByte() & MessagePack.Code.EXT_TIMESTAMP) | ((gVar.readByte() & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((gVar.readByte() & MessagePack.Code.EXT_TIMESTAMP) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(vh.f fVar, int i10) {
        fVar.writeByte((i10 >>> 16) & 255);
        fVar.writeByte((i10 >>> 8) & 255);
        fVar.writeByte(i10 & 255);
    }

    @Override // tb.j
    public tb.c a(vh.f fVar, boolean z10) {
        return new d(fVar, z10);
    }

    @Override // tb.j
    public tb.b b(vh.g gVar, boolean z10) {
        return new c(gVar, 4096, z10);
    }

    static final class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final vh.g f27739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f27740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        byte f27741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f27742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27743e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        short f27744f;

        public a(vh.g gVar) {
            this.f27739a = gVar;
        }

        private void a() throws IOException {
            int i10 = this.f27742d;
            int iM = g.m(this.f27739a);
            this.f27743e = iM;
            this.f27740b = iM;
            byte b10 = (byte) (this.f27739a.readByte() & MessagePack.Code.EXT_TIMESTAMP);
            this.f27741c = (byte) (this.f27739a.readByte() & MessagePack.Code.EXT_TIMESTAMP);
            if (g.f27737a.isLoggable(Level.FINE)) {
                g.f27737a.fine(b.b(true, this.f27742d, this.f27740b, b10, this.f27741c));
            }
            int i11 = this.f27739a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f27742d = i11;
            if (b10 != 9) {
                throw g.k("%s != TYPE_CONTINUATION", Byte.valueOf(b10));
            }
            if (i11 != i10) {
                throw g.k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // vh.n0
        public long N(vh.e eVar, long j10) throws IOException {
            while (true) {
                int i10 = this.f27743e;
                if (i10 != 0) {
                    long jN = this.f27739a.N(eVar, Math.min(j10, i10));
                    if (jN == -1) {
                        return -1L;
                    }
                    this.f27743e -= (int) jN;
                    return jN;
                }
                this.f27739a.skip(this.f27744f);
                this.f27744f = (short) 0;
                if ((this.f27741c & 4) != 0) {
                    return -1L;
                }
                a();
            }
        }

        @Override // vh.n0
        public o0 i() {
            return this.f27739a.i();
        }

        @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
