package q4;

import androidx.appcompat.widget.RtlSpacingHelper;
import dd.b0;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private short f24328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f24329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a6.v f24330g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private short f24331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f24332b;

        public /* synthetic */ a(short s10, byte[] bArr, rd.h hVar) {
            this(s10, bArr);
        }

        public final byte[] a() {
            return this.f24332b;
        }

        private a(short s10, byte[] bArr) {
            rd.m.e(bArr, "data");
            this.f24331a = s10;
            this.f24332b = bArr;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24333a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.f24334b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.f24339g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24333a = iArr;
        }
    }

    public q(String str) throws Throwable {
        short sD;
        byte b10;
        byte b11;
        rd.m.e(str, "fileName");
        byte[] bArrN = a6.m.n(new File(str));
        rd.m.d(bArrN, "readAll(...)");
        this.f24329f = bArrN;
        a6.v vVar = new a6.v(bArrN, 0, true);
        this.f24330g = vVar;
        if (bArrN.length < 16) {
            throw new RuntimeException("文件格式错误");
        }
        byte b12 = bArrN[0];
        if (b12 == 85 || (b10 = bArrN[1]) == 73 || (b11 = bArrN[2]) == 68) {
            this.f24326c = 64;
            this.f24327d = 80;
            this.f24324a = true;
        } else if (b12 == 65 || b10 == 68 || b11 == 76) {
            this.f24326c = 16;
            this.f24327d = 32;
        } else {
            if (b12 != 66 && b10 != 80 && b11 != 83) {
                throw new RuntimeException("文件格式错误");
            }
            vVar.l(32);
            this.f24327d = vVar.i(16);
            this.f24325b = true;
            this.f24324a = ((byte) (bArrN[3] & 1)) != 0;
        }
        int iD = dd.y.d(bArrN[4]);
        if (iD == 0) {
            sD = r.f24339g.d();
        } else if (Integer.compare(iD ^ RtlSpacingHelper.UNDEFINED, 50 ^ RtlSpacingHelper.UNDEFINED) < 0) {
            sD = b0.d((short) dd.y.d(iD + 650));
        } else if (Integer.compare(iD ^ RtlSpacingHelper.UNDEFINED, 100 ^ RtlSpacingHelper.UNDEFINED) < 0) {
            sD = b0.d((short) dd.y.d(dd.y.d(iD - 50) + 10142));
        } else {
            if (Integer.compare(iD ^ RtlSpacingHelper.UNDEFINED, 150 ^ RtlSpacingHelper.UNDEFINED) >= 0) {
                throw new RuntimeException("文件格式错误:不支持的PS地址");
            }
            sD = b0.d((short) dd.y.d(dd.y.d(iD - 100) + 8792));
        }
        this.f24328e = sD;
    }

    public final q4.a a(int i10) {
        a aVarD;
        if (this.f24325b && (aVarD = d(i10, r.f24334b)) != null) {
            return new q4.a(aVarD.a());
        }
        this.f24330g.l(((i10 * this.f24327d) + 16) * 8);
        byte[] bArrG = this.f24330g.g(6);
        rd.m.d(bArrG, "readBytes(...)");
        return new q4.a(bArrG);
    }

    public final int b() {
        return (this.f24329f.length - 16) / this.f24327d;
    }

    public final byte[] c(int i10) {
        a aVarD;
        if (this.f24326c != 0 || (aVarD = d(i10, r.f24337e)) == null) {
            return null;
        }
        return aVarD.a();
    }

    public final a d(int i10, r rVar) {
        byte[] bArrE;
        rd.m.e(rVar, "psk");
        rd.h hVar = null;
        if (!this.f24325b) {
            int i11 = b.f24333a[rVar.ordinal()];
            if (i11 == 1) {
                return new a(rVar.d(), a(i10).a(), hVar);
            }
            if (i11 == 2 && (bArrE = e(i10)) != null) {
                return new a(this.f24328e, bArrE, hVar);
            }
            return null;
        }
        int i12 = this.f24327d;
        int i13 = (i10 * i12) + 16;
        int i14 = ((i12 + i13) - 2) * 8;
        this.f24330g.l(i13 * 8);
        while (this.f24330g.b() <= i14) {
            int i15 = this.f24330g.i(16);
            if (i15 != 0) {
                short sD = b0.d((short) this.f24330g.i(16));
                if (rVar.d() == sD) {
                    byte[] bArrG = this.f24330g.g(i15 - 2);
                    rd.m.d(bArrG, "readBytes(...)");
                    return new a(sD, bArrG, hVar);
                }
                a6.v vVar = this.f24330g;
                vVar.l(vVar.b() + ((i15 - 2) * 8));
            }
        }
        return null;
    }

    public final byte[] e(int i10) {
        if (this.f24326c != 0) {
            this.f24330g.l(((i10 * this.f24327d) + 32) * 8);
            return this.f24330g.g(this.f24326c);
        }
        a aVarD = d(i10, r.f24339g);
        if (aVarD != null) {
            return aVarD.a();
        }
        return null;
    }

    public String toString() {
        return "IDFile(lockSpi=" + this.f24324a + ", isBPS=" + this.f24325b + ", idSize=" + this.f24326c + ", itemSize=" + this.f24327d + ", PSK_UID=" + ((Object) b0.g(this.f24328e)) + ", count=" + b() + ')';
    }
}
