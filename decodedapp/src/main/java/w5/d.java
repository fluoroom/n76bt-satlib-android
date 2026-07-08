package w5;

import a6.v;
import a6.w;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import w5.e;

/* JADX INFO: loaded from: classes.dex */
public class d extends h implements e.a {
    private static final AtomicInteger K = new AtomicInteger();
    private static final Charset L = Charset.forName("utf-8");
    public f[] A;
    public boolean B;
    public boolean C;
    int D;
    int E;
    int F;
    private b G;
    int H;
    int I;
    int J;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Double f31256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Double f31257h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f31258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f31259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f31260t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f31261u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private a f31262v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f31263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f31264x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Short f31265y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public byte[] f31266z;

    public enum a {
        None,
        Call,
        Check
    }

    public enum b {
        BA_INVALID,
        BA_ALARM,
        BA_ALARM_AND_MUTE,
        COUNT;

        public static b d(int i10) {
            return (i10 < 0 || i10 >= values().length) ? BA_INVALID : values()[i10];
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f31276a = new d();

        public c a(byte[] bArr) {
            this.f31276a.f31266z = bArr;
            return this;
        }

        public c b() {
            this.f31276a.f31265y = Short.valueOf((short) d.K.incrementAndGet());
            return this;
        }

        public d c() {
            return this.f31276a;
        }

        public c d(long j10) {
            this.f31276a.f31262v = a.Call;
            this.f31276a.f31264x = j10;
            b();
            return this;
        }

        public c e(String str) {
            this.f31276a.f31262v = a.Call;
            this.f31276a.f31263w = str;
            b();
            return this;
        }

        public c f() {
            return h(null);
        }

        public c g(long j10) {
            this.f31276a.f31262v = a.Check;
            this.f31276a.f31264x = j10;
            b();
            return this;
        }

        public c h(String str) {
            this.f31276a.f31262v = a.Check;
            this.f31276a.f31263w = str != null ? str.trim() : null;
            b();
            return this;
        }

        public c i(String str) {
            this.f31276a.f31252c = str;
            return this;
        }

        public c j(int i10) {
            this.f31276a.f31258r = i10;
            return this;
        }

        public c k(long j10) {
            this.f31276a.f31260t = j10;
            return this;
        }
    }

    /* JADX INFO: renamed from: w5.d$d, reason: collision with other inner class name */
    public static class C0417d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static String f31277a = "求救";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static String f31278b = "静默求救";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static String f31279c = "呼叫";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static String f31280d = "搜索附近的人";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static String f31281e = "定位";
    }

    enum e {
        None,
        Channel,
        UNKNOWN;

        public static e d(int i10) {
            return (i10 < 0 || i10 >= values().length) ? UNKNOWN : values()[i10];
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte f31286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte f31287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f31288c;

        public f(int i10) {
            this.f31288c = new byte[i10];
        }
    }

    public enum g {
        TTL,
        MSG_ID,
        UID,
        ACTION,
        BTS_4,
        BTS_5,
        BTS_6,
        BTS_7,
        BTS_8,
        BTS_9,
        BTS_10,
        BTS_11,
        BTS_12,
        BTS_13,
        BTS_14,
        BTS_15,
        BTS_16,
        BTS_17,
        BTS_18,
        BTS_19,
        BTS_20,
        BTS_21,
        BTS_22,
        BTS_23,
        BTS_24,
        BTS_25,
        BTS_26,
        BTS_27,
        BTS_28,
        BTS_29,
        BTS_30,
        BTS_31,
        FROM,
        TO,
        TO_GROUP,
        REPEATER,
        MESSAGE,
        POSITION,
        VOLTAGE,
        CHECK,
        CALL,
        CHANNEL,
        CHECK_UID,
        CALL_UID,
        PP,
        SYNC_SETTINGS,
        UNKNOWN;

        public static g e(int i10) {
            return (i10 < 0 || i10 >= values().length) ? UNKNOWN : values()[i10];
        }

        byte d() {
            return (byte) ordinal();
        }
    }

    public d() {
        this(false);
    }

    public static d A(byte[] bArr, int i10, int i11) throws w5.g {
        d dVar = new d();
        dVar.C(bArr, i10, i11 + i10);
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0234 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void C(byte[] r20, int r21, int r22) throws w5.g {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.d.C(byte[], int, int):void");
    }

    private int D(g gVar, byte[] bArr, int i10, String str) {
        return w.b(str) ? i10 : E(gVar, bArr, i10, str);
    }

    private int E(g gVar, byte[] bArr, int i10, String str) throws w5.f {
        int i11 = 0;
        byte[] bytes = w.b(str) ? new byte[0] : str.getBytes(L);
        if (bytes.length > 126) {
            throw new w5.f(String.valueOf(gVar) + ":字段数据长度超过126字节");
        }
        int i12 = i10 + 1;
        bArr[i10] = (byte) (bytes.length + 1);
        int i13 = i10 + 2;
        bArr[i12] = gVar.d();
        int length = bytes.length;
        while (i11 < length) {
            bArr[i13] = bytes[i11];
            i11++;
            i13++;
        }
        return i13;
    }

    public static int p(String str) {
        if (str == null) {
            return 126;
        }
        return 126 - str.getBytes(L).length;
    }

    private byte z(g gVar, int i10) throws w5.f {
        if (gVar.ordinal() > 31 || i10 > 4) {
            throw new w5.f(String.format(Locale.ENGLISH, "无法合并:%s和长度%d", gVar, Integer.valueOf(i10)));
        }
        return (byte) ((gVar.ordinal() << 2) | (i10 - 1) | 128);
    }

    public String B() {
        ArrayList arrayList = new ArrayList();
        int iOrdinal = this.G.ordinal();
        if (iOrdinal == 1) {
            arrayList.add(C0417d.f31277a);
        } else if (iOrdinal == 2) {
            arrayList.add(C0417d.f31278b);
        }
        int iOrdinal2 = this.f31262v.ordinal();
        if (iOrdinal2 == 1) {
            long j10 = this.f31264x;
            if (j10 != 0) {
                arrayList.add(C0417d.f31279c + ":#" + j10);
            } else if (w.b(this.f31263w)) {
                arrayList.add(C0417d.f31279c);
            } else {
                arrayList.add(C0417d.f31279c + ":" + this.f31263w);
            }
        } else if (iOrdinal2 == 2) {
            long j11 = this.f31264x;
            if (j11 != 0) {
                arrayList.add(C0417d.f31281e + ":#" + j11);
            } else if (w.b(this.f31263w)) {
                arrayList.add(C0417d.f31280d);
            } else {
                arrayList.add(C0417d.f31281e + ":" + this.f31263w);
            }
        }
        if (!w.b(this.f31255f)) {
            arrayList.add(this.f31255f);
        }
        int i10 = this.f31259s;
        if (i10 > 0) {
            arrayList.add(String.format(Locale.ENGLISH, "%.3fV", Float.valueOf(i10 / 1000.0f)));
        }
        if (this.H > 0) {
            if (this.J >= 0) {
                arrayList.add(String.format(Locale.ENGLISH, "%d:%d:%d%%", Integer.valueOf(this.I), Integer.valueOf(this.H), Integer.valueOf(this.J)));
            } else {
                arrayList.add(String.format(Locale.ENGLISH, "%d:%d", Integer.valueOf(this.I), Integer.valueOf(this.H)));
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return w.c("\n", arrayList);
    }

    @Override // w5.h, w5.e.a
    public long a() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String str = this.f31252c;
            if (str != null) {
                messageDigest.update(str.getBytes());
            }
            String str2 = this.f31253d;
            if (str2 != null) {
                messageDigest.update(str2.getBytes());
            }
            String str3 = this.f31254e;
            if (str3 != null) {
                messageDigest.update(str3.getBytes());
            }
            String str4 = this.f31255f;
            if (str4 != null) {
                messageDigest.update(str4.getBytes());
            }
            String str5 = this.f31263w;
            if (str5 != null) {
                messageDigest.update(str5.getBytes());
            }
            if (y()) {
                messageDigest.update(this.f31256g.toString().getBytes());
                messageDigest.update(this.f31257h.toString().getBytes());
            }
            Short sh2 = this.f31265y;
            if (sh2 != null) {
                messageDigest.update(sh2.toString().getBytes());
            }
            byte[] bArr = this.f31266z;
            if (bArr != null) {
                messageDigest.update(bArr);
            }
            f[] fVarArr = this.A;
            if (fVarArr != null) {
                for (f fVar : fVarArr) {
                    messageDigest.update(fVar.f31286a);
                    messageDigest.update(fVar.f31287b);
                    messageDigest.update(fVar.f31288c);
                }
            }
            b bVar = this.G;
            if (bVar != b.BA_INVALID) {
                messageDigest.update(bVar.name().getBytes());
            }
            return new BigInteger(messageDigest.digest()).longValue();
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // w5.h
    int d() {
        int length = !w.b(this.f31252c) ? this.f31252c.getBytes(L).length + 3 : 1;
        String str = this.f31253d;
        if (str != null) {
            length += str.getBytes(L).length + 2;
        }
        ArrayList arrayList = this.f31261u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                length += ((String) it.next()).getBytes(L).length + 2;
            }
        }
        if (!w.b(this.f31254e)) {
            length += this.f31254e.getBytes(L).length + 2;
        }
        if (!w.b(this.f31255f)) {
            length += this.f31255f.getBytes(L).length + 2;
        }
        if (this.f31256g != null && this.f31257h != null) {
            length += 8;
        }
        if (this.f31258r > 0) {
            length += 2;
        }
        if (this.f31259s > 0) {
            length += 4;
        }
        long j10 = this.f31260t;
        if (j10 > 2147483647L) {
            length += 10;
        } else if (j10 != 0) {
            length += 5;
        }
        if (this.f31265y != null) {
            length += 3;
        }
        byte[] bArr = this.f31266z;
        if (bArr != null) {
            length = length + 2 + bArr.length;
        }
        int iOrdinal = this.f31262v.ordinal();
        if (iOrdinal != 1 && iOrdinal != 2) {
            return length;
        }
        int i10 = length + 2;
        long j11 = this.f31264x;
        return j11 > 0 ? j11 >= 2147483647L ? length + 10 : length + 6 : !w.b(this.f31263w) ? i10 + this.f31263w.getBytes(L).length : i10;
    }

    @Override // w5.h
    int h(byte[] bArr, int i10) throws w5.f {
        v vVar = new v(bArr);
        byte b10 = this.B ? (byte) 3 : (byte) 1;
        if (this.C) {
            b10 = (byte) (b10 | 4);
        }
        bArr[i10] = b10;
        int iD = D(g.FROM, bArr, i10 + 1, this.f31252c);
        String str = this.f31253d;
        if (str != null) {
            iD = E(g.TO, bArr, iD, str);
        }
        ArrayList arrayList = this.f31261u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                iD = D(g.REPEATER, bArr, iD, (String) it.next());
            }
        }
        int iD2 = D(g.MESSAGE, bArr, D(g.TO_GROUP, bArr, iD, this.f31254e), this.f31255f);
        if (this.f31256g != null && this.f31257h != null) {
            bArr[iD2] = 7;
            bArr[iD2 + 1] = g.POSITION.d();
            vVar.l((iD2 + 2) * 8);
            vVar.n((int) Math.round(this.f31256g.doubleValue() * 60.0d * 500.0d), 24).n((int) Math.round(this.f31257h.doubleValue() * 60.0d * 500.0d), 24);
            iD2 = vVar.b() / 8;
        }
        if (this.f31258r > 0) {
            int i11 = iD2 + 1;
            bArr[iD2] = z(g.TTL, 1);
            iD2 += 2;
            bArr[i11] = (byte) this.f31258r;
        }
        if (this.f31259s > 0) {
            bArr[iD2] = 3;
            bArr[iD2 + 1] = g.VOLTAGE.d();
            vVar.l((iD2 + 2) * 8);
            vVar.n(this.f31259s, 16);
            iD2 = vVar.b() / 8;
        }
        long j10 = this.f31260t;
        if (j10 != 0) {
            if (j10 >= 2147483647L) {
                bArr[iD2] = 9;
                bArr[iD2 + 1] = g.UID.d();
                vVar.l((iD2 + 2) * 8);
                vVar.o(this.f31260t, 64);
                iD2 = vVar.b() / 8;
            } else {
                bArr[iD2] = z(g.UID, 4);
                vVar.l((iD2 + 1) * 8);
                vVar.o(this.f31260t, 32);
                iD2 = vVar.b() / 8;
            }
        }
        if (this.f31265y != null) {
            bArr[iD2] = z(g.MSG_ID, 2);
            vVar.l((iD2 + 1) * 8);
            vVar.n(this.f31265y.shortValue(), 16);
            iD2 = vVar.b() / 8;
        }
        byte[] bArr2 = this.f31266z;
        if (bArr2 != null) {
            int i12 = iD2 + 1;
            bArr[iD2] = (byte) (bArr2.length + 1);
            iD2 += 2;
            bArr[i12] = g.CHANNEL.d();
            byte[] bArr3 = this.f31266z;
            int length = bArr3.length;
            int i13 = 0;
            while (i13 < length) {
                bArr[iD2] = bArr3[i13];
                i13++;
                iD2++;
            }
        }
        int iOrdinal = this.f31262v.ordinal();
        if (iOrdinal == 1) {
            long j11 = this.f31264x;
            if (j11 <= 0) {
                return E(g.CALL, bArr, iD2, this.f31263w);
            }
            if (j11 >= 2147483647L) {
                bArr[iD2] = 9;
                bArr[iD2 + 1] = g.CALL_UID.d();
                vVar.l((iD2 + 2) * 8);
                vVar.o(this.f31264x, 64);
                return vVar.b() / 8;
            }
            bArr[iD2] = 5;
            bArr[iD2 + 1] = g.CALL_UID.d();
            vVar.l((iD2 + 2) * 8);
            vVar.o(this.f31264x, 32);
            return vVar.b() / 8;
        }
        if (iOrdinal != 2) {
            return iD2;
        }
        long j12 = this.f31264x;
        if (j12 <= 0) {
            return E(g.CHECK, bArr, iD2, this.f31263w);
        }
        if (j12 >= 2147483647L) {
            bArr[iD2] = 9;
            bArr[iD2 + 1] = g.CHECK_UID.d();
            vVar.l((iD2 + 2) * 8);
            vVar.o(this.f31264x, 64);
            return vVar.b() / 8;
        }
        bArr[iD2] = 5;
        bArr[iD2 + 1] = g.CHECK_UID.d();
        vVar.l((iD2 + 2) * 8);
        vVar.o(this.f31264x, 32);
        return vVar.b() / 8;
    }

    public boolean o(String str) {
        if (w.b(str)) {
            return false;
        }
        if (this.f31261u == null) {
            this.f31261u = new ArrayList();
        }
        this.f31261u.add(str);
        return true;
    }

    public a r() {
        return this.f31262v;
    }

    public Integer t() {
        int i10 = this.D;
        if (i10 == -32768) {
            return null;
        }
        return Integer.valueOf(i10);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!w.b(this.f31252c)) {
            arrayList.add(String.valueOf(g.FROM) + "=" + this.f31252c);
        }
        if (!w.b(this.f31253d)) {
            arrayList.add(String.valueOf(g.TO) + "=" + this.f31253d);
        }
        if (this.f31261u != null) {
            arrayList.add(String.valueOf(g.REPEATER) + "=" + w.c(",", this.f31261u));
        }
        if (this.f31258r > 0) {
            arrayList.add(String.valueOf(g.TTL) + "=" + this.f31258r);
        }
        if (this.f31260t != 0) {
            arrayList.add(String.valueOf(g.UID) + "=" + this.f31260t);
        }
        int i10 = this.f31259s;
        if (i10 > 0) {
            arrayList.add(String.format(Locale.ENGLISH, "%s=%.3fV", g.VOLTAGE, Float.valueOf(i10 / 1000.0f)));
        }
        if (!w.b(this.f31255f)) {
            arrayList.add(String.valueOf(g.MESSAGE) + "=" + this.f31255f);
        }
        if (y()) {
            arrayList.add(String.format(Locale.ENGLISH, "%s=%s", g.POSITION, w5.a.R(this.f31256g.doubleValue()) + " " + w5.a.T(this.f31257h.doubleValue())));
        }
        arrayList.add("hasData=" + x());
        return w.c(";", arrayList);
    }

    public b u() {
        return this.G;
    }

    public int v() {
        int i10 = this.F;
        if (i10 < 0) {
            return 0;
        }
        if (i10 == 0) {
            return 360;
        }
        return i10 % 360;
    }

    public float w() {
        int i10 = this.E;
        if (i10 <= 0) {
            return 0.0f;
        }
        return i10 / 3.6f;
    }

    public boolean x() {
        return (!this.C && this.f31262v == a.None && this.G == b.BA_INVALID && this.f31266z == null && this.f31258r == 0 && this.A == null && w.b(this.f31255f)) ? false : true;
    }

    public boolean y() {
        return (this.f31256g == null || this.f31257h == null) ? false : true;
    }

    public d(boolean z10) {
        this.f31262v = a.None;
        this.D = -32768;
        this.E = -1;
        this.F = -1;
        this.G = b.BA_INVALID;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        if (z10) {
            this.f31265y = Short.valueOf((short) K.incrementAndGet());
        }
    }
}
