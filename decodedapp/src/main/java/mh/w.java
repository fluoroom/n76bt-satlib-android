package mh;

import androidx.appcompat.widget.ActivityChooserView;
import dd.d0;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mh.e;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f22255g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Logger f22256h = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vh.f f22257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vh.e f22259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e.b f22262f;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public w(vh.f fVar, boolean z10) {
        rd.m.e(fVar, "sink");
        this.f22257a = fVar;
        this.f22258b = z10;
        vh.e eVar = new vh.e();
        this.f22259c = eVar;
        this.f22260d = 16384;
        this.f22262f = new e.b(0, false, eVar, 3, null);
    }

    private final void s(int i10, long j10) {
        while (j10 > 0) {
            long jMin = Math.min(this.f22260d, j10);
            j10 -= jMin;
            e(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f22257a.C(this.f22259c, jMin);
        }
    }

    public final void A() {
        synchronized (this) {
            try {
                if (this.f22261e) {
                    throw new IOException("closed");
                }
                if (this.f22258b) {
                    Logger logger = f22256h;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(fh.p.j(">> CONNECTION " + f.f22140b.n(), new Object[0]));
                    }
                    this.f22257a.Z(f.f22140b);
                    this.f22257a.flush();
                    d0 d0Var = d0.f10897a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(z zVar) {
        rd.m.e(zVar, "peerSettings");
        synchronized (this) {
            try {
                if (this.f22261e) {
                    throw new IOException("closed");
                }
                this.f22260d = zVar.e(this.f22260d);
                if (zVar.b() != -1) {
                    this.f22262f.e(zVar.b());
                }
                e(0, 0, 4, 1);
                this.f22257a.flush();
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(int i10, long j10) {
        int i11;
        long j11;
        synchronized (this) {
            try {
                if (this.f22261e) {
                    throw new IOException("closed");
                }
                if (j10 == 0 || j10 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
                }
                Logger logger = f22256h;
                if (logger.isLoggable(Level.FINE)) {
                    i11 = i10;
                    j11 = j10;
                    logger.fine(f.f22139a.d(false, i11, 4, j11));
                } else {
                    i11 = i10;
                    j11 = j10;
                }
                e(i11, 4, 8, 0);
                this.f22257a.writeInt((int) j11);
                this.f22257a.flush();
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(int i10, int i11, vh.e eVar, int i12) {
        e(i10, i12, 0, i11);
        if (i12 > 0) {
            vh.f fVar = this.f22257a;
            rd.m.b(eVar);
            fVar.C(eVar, i12);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f22261e = true;
            this.f22257a.close();
            d0 d0Var = d0.f10897a;
        }
    }

    public final void d(boolean z10, int i10, int i11) {
        synchronized (this) {
            if (this.f22261e) {
                throw new IOException("closed");
            }
            e(0, 8, 6, z10 ? 1 : 0);
            this.f22257a.writeInt(i10);
            this.f22257a.writeInt(i11);
            this.f22257a.flush();
            d0 d0Var = d0.f10897a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            r0 = 8
            if (r11 == r0) goto L1d
            java.util.logging.Logger r0 = mh.w.f22256h
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            if (r1 == 0) goto L1d
            mh.f r2 = mh.f.f22139a
            r3 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.String r9 = r2.c(r3, r4, r5, r6, r7)
            r0.fine(r9)
            goto L21
        L1d:
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
        L21:
            int r9 = r8.f22260d
            if (r5 > r9) goto L62
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 & r4
            if (r9 != 0) goto L47
            vh.f r9 = r8.f22257a
            fh.m.H(r9, r5)
            vh.f r9 = r8.f22257a
            r10 = r6 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            vh.f r9 = r8.f22257a
            r10 = r7 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            vh.f r9 = r8.f22257a
            r10 = 2147483647(0x7fffffff, float:NaN)
            r10 = r10 & r4
            r9.writeInt(r10)
            return
        L47:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "reserved bit set: "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L62:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "FRAME_SIZE_ERROR length > "
            r9.append(r10)
            int r10 = r8.f22260d
            r9.append(r10)
            java.lang.String r10 = ": "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.w.e(int, int, int, int):void");
    }

    public final void flush() {
        synchronized (this) {
            if (this.f22261e) {
                throw new IOException("closed");
            }
            this.f22257a.flush();
            d0 d0Var = d0.f10897a;
        }
    }

    public final int i0() {
        return this.f22260d;
    }

    public final void k(int i10, b bVar, byte[] bArr) {
        rd.m.e(bVar, "errorCode");
        rd.m.e(bArr, "debugData");
        synchronized (this) {
            try {
                if (this.f22261e) {
                    throw new IOException("closed");
                }
                if (bVar.d() == -1) {
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                e(0, bArr.length + 8, 7, 0);
                this.f22257a.writeInt(i10);
                this.f22257a.writeInt(bVar.d());
                if (!(bArr.length == 0)) {
                    this.f22257a.write(bArr);
                }
                this.f22257a.flush();
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(boolean z10, int i10, List list) {
        rd.m.e(list, "headerBlock");
        synchronized (this) {
            try {
                if (this.f22261e) {
                    throw new IOException("closed");
                }
                this.f22262f.g(list);
                long size = this.f22259c.size();
                long jMin = Math.min(this.f22260d, size);
                int i11 = size == jMin ? 4 : 0;
                if (z10) {
                    i11 |= 1;
                }
                e(i10, (int) jMin, 1, i11);
                this.f22257a.C(this.f22259c, jMin);
                if (size > jMin) {
                    s(i10, size - jMin);
                }
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(boolean z10, int i10, vh.e eVar, int i11) {
        synchronized (this) {
            if (this.f22261e) {
                throw new IOException("closed");
            }
            c(i10, z10 ? 1 : 0, eVar, i11);
            d0 d0Var = d0.f10897a;
        }
    }

    public final void n(int i10, int i11, List list) {
        rd.m.e(list, "requestHeaders");
        synchronized (this) {
            try {
                if (this.f22261e) {
                    throw new IOException("closed");
                }
                this.f22262f.g(list);
                long size = this.f22259c.size();
                int iMin = (int) Math.min(((long) this.f22260d) - 4, size);
                long j10 = iMin;
                e(i10, iMin + 4, 5, size == j10 ? 4 : 0);
                this.f22257a.writeInt(i11 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                this.f22257a.C(this.f22259c, j10);
                if (size > j10) {
                    s(i10, size - j10);
                }
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q(int i10, b bVar) {
        rd.m.e(bVar, "errorCode");
        synchronized (this) {
            if (this.f22261e) {
                throw new IOException("closed");
            }
            if (bVar.d() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            e(i10, 4, 3, 0);
            this.f22257a.writeInt(bVar.d());
            this.f22257a.flush();
            d0 d0Var = d0.f10897a;
        }
    }

    public final void r(z zVar) {
        rd.m.e(zVar, "settings");
        synchronized (this) {
            try {
                if (this.f22261e) {
                    throw new IOException("closed");
                }
                e(0, zVar.i() * 6, 4, 0);
                for (int i10 = 0; i10 < 10; i10++) {
                    if (zVar.f(i10)) {
                        this.f22257a.writeShort(i10);
                        this.f22257a.writeInt(zVar.a(i10));
                    }
                }
                this.f22257a.flush();
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
