package mh;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mh.e;
import vh.n0;
import vh.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f22216e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f22217f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vh.g f22218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f22220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e.a f22221d;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final Logger a() {
            return u.f22217f;
        }

        public final int b(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }

        private a() {
        }
    }

    public interface c {
        void b(int i10, long j10);

        void d(boolean z10, int i10, int i11);

        void e();

        void g(int i10, int i11, int i12, boolean z10);

        void i(int i10, int i11, List list);

        void m(boolean z10, z zVar);

        void n(int i10, mh.b bVar);

        void o(boolean z10, int i10, int i11, List list);

        void p(boolean z10, int i10, vh.g gVar, int i11);

        void q(int i10, mh.b bVar, vh.h hVar);
    }

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        rd.m.d(logger, "getLogger(...)");
        f22217f = logger;
    }

    public u(vh.g gVar, boolean z10) {
        rd.m.e(gVar, "source");
        this.f22218a = gVar;
        this.f22219b = z10;
        b bVar = new b(gVar);
        this.f22220c = bVar;
        this.f22221d = new e.a(bVar, 4096, 0, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void G(mh.u.c r7, int r8, int r9, int r10) throws java.io.IOException {
        /*
            r6 = this;
            if (r10 != 0) goto Lb3
            r10 = 1
            r9 = r9 & r10
            if (r9 == 0) goto L14
            if (r8 != 0) goto Lc
            r7.e()
            return
        Lc:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r7.<init>(r8)
            throw r7
        L14:
            int r9 = r8 % 6
            if (r9 != 0) goto L9c
            mh.z r9 = new mh.z
            r9.<init>()
            r0 = 0
            xd.c r8 = xd.d.i(r0, r8)
            r1 = 6
            xd.a r8 = xd.d.h(r8, r1)
            int r1 = r8.b()
            int r2 = r8.c()
            int r8 = r8.d()
            if (r8 <= 0) goto L37
            if (r1 <= r2) goto L3b
        L37:
            if (r8 >= 0) goto L98
            if (r2 > r1) goto L98
        L3b:
            vh.g r3 = r6.f22218a
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            int r3 = fh.m.c(r3, r4)
            vh.g r4 = r6.f22218a
            int r4 = r4.readInt()
            r5 = 2
            if (r3 == r5) goto L84
            r5 = 4
            if (r3 == r5) goto L79
            r5 = 5
            if (r3 == r5) goto L58
            goto L91
        L58:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L62
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L62
            goto L91
        L62:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L79:
            if (r4 < 0) goto L7c
            goto L91
        L7c:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r7.<init>(r8)
            throw r7
        L84:
            if (r4 == 0) goto L91
            if (r4 != r10) goto L89
            goto L91
        L89:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r7.<init>(r8)
            throw r7
        L91:
            r9.h(r3, r4)
            if (r1 == r2) goto L98
            int r1 = r1 + r8
            goto L3b
        L98:
            r7.m(r0, r9)
            return
        L9c:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "TYPE_SETTINGS length % 6 != 0: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        Lb3:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "TYPE_SETTINGS streamId != 0"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.u.G(mh.u$c, int, int, int):void");
    }

    private final void H(c cVar, int i10, int i11, int i12) throws Exception {
        int i13;
        try {
            if (i10 != 4) {
                throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
            }
            try {
                long jD = fh.m.d(this.f22218a.readInt(), 2147483647L);
                if (jD == 0) {
                    throw new IOException("windowSizeIncrement was 0");
                }
                Logger logger = f22217f;
                if (logger.isLoggable(Level.FINE)) {
                    i13 = i12;
                    logger.fine(f.f22139a.d(true, i12, i10, jD));
                } else {
                    i13 = i12;
                }
                cVar.b(i13, jD);
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                f22217f.fine(f.f22139a.c(true, i12, i10, 8, i11));
                throw exc;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private final void k(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iB = (i11 & 8) != 0 ? fh.m.b(this.f22218a.readByte(), 255) : 0;
        cVar.p(z10, i12, this.f22218a, f22216e.b(i10, i11, iB));
        this.f22218a.skip(iB);
    }

    private final void l(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i13 = this.f22218a.readInt();
        int i14 = this.f22218a.readInt();
        int i15 = i10 - 8;
        mh.b bVarA = mh.b.f22090b.a(i14);
        if (bVarA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i14);
        }
        vh.h hVarP = vh.h.f30793e;
        if (i15 > 0) {
            hVarP = this.f22218a.p(i15);
        }
        cVar.q(i13, bVarA, hVarP);
    }

    private final List n(int i10, int i11, int i12, int i13) throws IOException {
        this.f22220c.k(i10);
        b bVar = this.f22220c;
        bVar.l(bVar.a());
        this.f22220c.n(i11);
        this.f22220c.e(i12);
        this.f22220c.q(i13);
        this.f22221d.k();
        return this.f22221d.e();
    }

    private final void q(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        int iB = (i11 & 8) != 0 ? fh.m.b(this.f22218a.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            s(cVar, i12);
            i10 -= 5;
        }
        cVar.o(z10, i12, -1, n(f22216e.b(i10, i11, iB), iB, i11, i12));
    }

    private final void r(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.d((i11 & 1) != 0, this.f22218a.readInt(), this.f22218a.readInt());
    }

    private final void s(c cVar, int i10) {
        int i11 = this.f22218a.readInt();
        cVar.g(i10, i11 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, fh.m.b(this.f22218a.readByte(), 255) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    private final void v(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            s(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    private final void w(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iB = (i11 & 8) != 0 ? fh.m.b(this.f22218a.readByte(), 255) : 0;
        cVar.i(i12, this.f22218a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, n(f22216e.b(i10 - 4, i11, iB), iB, i11, i12));
    }

    private final void x(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i13 = this.f22218a.readInt();
        mh.b bVarA = mh.b.f22090b.a(i13);
        if (bVarA != null) {
            cVar.n(i12, bVarA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i13);
    }

    public final boolean c(boolean z10, c cVar) throws Exception {
        rd.m.e(cVar, "handler");
        try {
            this.f22218a.l0(9L);
            int iA = fh.m.A(this.f22218a);
            if (iA > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iA);
            }
            int iB = fh.m.b(this.f22218a.readByte(), 255);
            int iB2 = fh.m.b(this.f22218a.readByte(), 255);
            int i10 = this.f22218a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            if (iB != 8) {
                Logger logger = f22217f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(f.f22139a.c(true, i10, iA, iB, iB2));
                }
            }
            if (z10 && iB != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + f.f22139a.b(iB));
            }
            switch (iB) {
                case 0:
                    k(cVar, iA, iB2, i10);
                    return true;
                case 1:
                    q(cVar, iA, iB2, i10);
                    return true;
                case 2:
                    v(cVar, iA, iB2, i10);
                    return true;
                case 3:
                    x(cVar, iA, iB2, i10);
                    return true;
                case 4:
                    G(cVar, iA, iB2, i10);
                    return true;
                case 5:
                    w(cVar, iA, iB2, i10);
                    return true;
                case 6:
                    r(cVar, iA, iB2, i10);
                    return true;
                case 7:
                    l(cVar, iA, iB2, i10);
                    return true;
                case 8:
                    H(cVar, iA, iB2, i10);
                    return true;
                default:
                    this.f22218a.skip(iA);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f22218a.close();
    }

    public final void e(c cVar) throws IOException {
        rd.m.e(cVar, "handler");
        if (this.f22219b) {
            if (!c(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        vh.g gVar = this.f22218a;
        vh.h hVar = f.f22140b;
        vh.h hVarP = gVar.p(hVar.Q());
        Logger logger = f22217f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(fh.p.j("<< CONNECTION " + hVarP.n(), new Object[0]));
        }
        if (rd.m.a(hVar, hVarP)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + hVarP.Z());
    }

    public static final class b implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final vh.g f22222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f22224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f22225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f22226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f22227f;

        public b(vh.g gVar) {
            rd.m.e(gVar, "source");
            this.f22222a = gVar;
        }

        private final void c() throws IOException {
            int i10 = this.f22225d;
            int iA = fh.m.A(this.f22222a);
            this.f22226e = iA;
            this.f22223b = iA;
            int iB = fh.m.b(this.f22222a.readByte(), 255);
            this.f22224c = fh.m.b(this.f22222a.readByte(), 255);
            a aVar = u.f22216e;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(f.f22139a.c(true, this.f22225d, this.f22223b, iB, this.f22224c));
            }
            int i11 = this.f22222a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f22225d = i11;
            if (iB == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iB + " != TYPE_CONTINUATION");
            }
        }

        @Override // vh.n0
        public long N(vh.e eVar, long j10) throws IOException {
            rd.m.e(eVar, "sink");
            while (true) {
                int i10 = this.f22226e;
                if (i10 != 0) {
                    long jN = this.f22222a.N(eVar, Math.min(j10, i10));
                    if (jN == -1) {
                        return -1L;
                    }
                    this.f22226e -= (int) jN;
                    return jN;
                }
                this.f22222a.skip(this.f22227f);
                this.f22227f = 0;
                if ((this.f22224c & 4) != 0) {
                    return -1L;
                }
                c();
            }
        }

        public final int a() {
            return this.f22226e;
        }

        public final void e(int i10) {
            this.f22224c = i10;
        }

        @Override // vh.n0
        public o0 i() {
            return this.f22222a.i();
        }

        public final void k(int i10) {
            this.f22226e = i10;
        }

        public final void l(int i10) {
            this.f22223b = i10;
        }

        public final void n(int i10) {
            this.f22227f = i10;
        }

        public final void q(int i10) {
            this.f22225d = i10;
        }

        @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
