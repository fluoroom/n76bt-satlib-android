package w5;

import a6.w;
import com.facebook.stetho.dumpapp.Framer;
import com.facebook.stetho.websocket.CloseCodes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import org.msgpack.core.MessagePack;
import w5.c;

/* JADX INFO: loaded from: classes.dex */
public class a extends h {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Charset f31149x = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f31150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f31152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f31153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f31154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f31155h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f31156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f31157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f31158t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f31159u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f31160v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f31161w;

    /* JADX INFO: renamed from: w5.a$a, reason: collision with other inner class name */
    public static class C0414a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f31163b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f31166e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f31167f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f31168g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f31164c = "APN000";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f31165d = d.No;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f31162a = new a();

        public a a() {
            c.a aVar = new c.a(this.f31164c, c.a.EnumC0415a.Destination, true);
            c.a aVar2 = new c.a(this.f31163b, c.a.EnumC0415a.Source, true);
            this.f31162a.f31315a = new w5.c(aVar, aVar2, w5.c.v(this.f31168g, 8), 3, 240, this.f31162a);
            if (this.f31166e != 0.0f || this.f31167f != 0.0f) {
                this.f31162a.f31156r = new b(Math.round(this.f31167f), Math.round(this.f31166e * 1.9438446f));
            }
            if (this.f31162a.P()) {
                this.f31162a.f31153f = null;
            }
            return this.f31162a;
        }

        public void b(float f10) {
            this.f31167f = f10;
        }

        public C0414a c(double d10, double d11, char[] cArr) {
            this.f31162a.f31154g = new f(d10, d11, cArr[0], cArr[1]);
            this.f31162a.f31150c = g.POSITION;
            return this;
        }

        public C0414a d(String str) {
            this.f31162a.f31151d = str;
            if (this.f31162a.f31150c != g.POSITION) {
                this.f31162a.f31150c = g.MESSAGE;
            }
            return this;
        }

        public C0414a e(String str) {
            this.f31162a.f31152e = str;
            this.f31162a.f31150c = g.MESSAGE;
            return this;
        }

        public C0414a f(String str) {
            if (str.isEmpty() || str.length() > 5) {
                new IllegalArgumentException("消息长度不应大于5或者等于0").printStackTrace();
            }
            this.f31162a.f31153f = str;
            return this;
        }

        public C0414a g(String str) {
            this.f31168g = str;
            return this;
        }

        public C0414a h(String str) {
            this.f31163b = str;
            return this;
        }

        public void i(float f10) {
            this.f31166e = f10;
        }

        public C0414a j(g gVar) {
            this.f31162a.f31150c = gVar;
            return this;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int[] f31171c = {10, 40, 90, 160, 250, 360, 490, 640, 810, CloseCodes.NORMAL_CLOSURE, 1210, 1440, 1690, 1960, 2250, 2560, 2890, 3240, 3610, 4000, 4410, 4840, 5290, 5760, 6250, 6760, 7290};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f31173b;

        public c(byte[] bArr, int i10) {
            byte b10 = bArr[i10];
            if (48 <= b10 && b10 <= 57) {
                this.f31172a = (b10 + MessagePack.Code.INT8) * 10;
            } else if (65 <= b10 && b10 <= 90) {
                this.f31172a = ((b10 - 65) * 10) + 100;
            }
            byte b11 = bArr[i10 + 1];
            if (49 > b10 || b10 > 75) {
                return;
            }
            this.f31173b = f31171c[b11 - Framer.STDOUT_FRAME_PREFIX];
        }
    }

    public enum d {
        No,
        Ambulance,
        Bus,
        FireTruck,
        Bicycle,
        Yacht,
        Helicopter,
        SmallAircraft,
        Ship,
        Car,
        Motorcycle,
        Balloon,
        Jeep,
        RecreationalVehicle,
        Truck,
        Van
    }

    private static class e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int[] f31191e = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int[] f31192f = {10, 20, 40, 80, 160, 320, 640, 1280, 2560, 5120};

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int[] f31193g = {0, 45, 90, 135, 180, 225, 270, 315, 360, 0};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f31195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f31196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f31197d;

        public e(byte[] bArr, int i10) {
            this.f31194a = f31191e[a.Y(bArr, i10, 1)];
            this.f31195b = f31192f[a.Y(bArr, i10 + 1, 1)];
            this.f31196c = a.Y(bArr, i10 + 2, 1);
            this.f31197d = f31193g[a.Y(bArr, i10 + 3, 1)];
        }
    }

    public enum g {
        UNKNOWN,
        POSITION,
        MESSAGE,
        MESSAGE_ACK,
        WEATHER,
        STATUS,
        OBJECT_LIVE,
        OBJECT_KILLED,
        ITEM_LIVE,
        ITEM_KILLED,
        TELEMETRY_DATA,
        THIRD_PARTY_TRAFFIC
    }

    private static double A(double d10) {
        return ((double) ((int) (d10 / 100.0d))) + ((d10 % 100.0d) / 60.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Q(int i10) {
        if (i10 == 47 || i10 == 92) {
            return true;
        }
        if (65 > i10 || i10 > 90) {
            return 97 <= i10 && i10 <= 106;
        }
        return true;
    }

    static String R(double d10) {
        double dY = y(d10);
        return dY >= 0.0d ? String.format(Locale.ENGLISH, "%07.2fN", Double.valueOf(dY)) : String.format(Locale.ENGLISH, "%07.2fS", Double.valueOf(-dY));
    }

    static String T(double d10) {
        double dY = y(d10);
        return dY >= 0.0d ? String.format(Locale.ENGLISH, "%08.2fE", Double.valueOf(dY)) : String.format(Locale.ENGLISH, "%08.2fW", Double.valueOf(-dY));
    }

    public static h U(byte[] bArr, int i10, int i11, String str) {
        a aVar = new a();
        try {
            h hVarC0 = aVar.c0(bArr, i10, i11 + i10, str);
            return hVarC0 != null ? hVarC0 : aVar;
        } catch (Exception e10) {
            throw new w5.g("For input string:" + new String(bArr, i10, i11, f31149x), e10);
        }
    }

    private String V(String str) {
        int i10;
        int iIndexOf = str.indexOf("/A=");
        if (iIndexOf < 0 || str.length() < (i10 = iIndexOf + 9)) {
            return str;
        }
        String strSubstring = str.substring(iIndexOf, i10);
        try {
            this.f31161w = Integer.valueOf(Math.round(Integer.parseInt(strSubstring.substring(3)) / 3.28084f));
            return str.replaceFirst(strSubstring, "");
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    private int W(byte[] bArr, int i10, int i11) throws w5.g {
        if (i11 - i10 < 13) {
            throw new w5.g("数据长度不够");
        }
        this.f31154g = f.g(bArr, i10);
        return i10 + 13;
    }

    private int X(byte[] bArr, int i10, int i11) {
        if (i11 - i10 < 7) {
            return i10;
        }
        int i12 = i10 + 3;
        if (bArr[i12] == 47) {
            this.f31156r = new b(bArr, i10);
        } else {
            byte b10 = bArr[i10];
            if (b10 != 80 || bArr[i10 + 1] != 72 || bArr[i10 + 2] != 71) {
                return (b10 == 82 && bArr[i10 + 1] == 78 && bArr[i10 + 2] == 71) ? i10 + 7 : (b10 == 68 && bArr[i10 + 1] == 70 && bArr[i10 + 2] == 83) ? i10 + 7 : (b10 == 84 && bArr[i10 + 4] == 67) ? i10 + 7 : i10;
            }
            this.f31157s = new e(bArr, i12);
        }
        return i10 + 7;
    }

    static int Y(byte[] bArr, int i10, int i11) throws w5.g {
        byte b10;
        int i12 = 0;
        int i13 = 1;
        while (true) {
            int i14 = i11 - 1;
            if (i11 <= 0) {
                return i12;
            }
            b10 = bArr[i10 + i14];
            if (48 > b10 || b10 > 57) {
                break;
            }
            i12 += (b10 + MessagePack.Code.INT8) * i13;
            i13 *= 10;
            i11 = i14;
        }
        throw new w5.g("错误的数值格式:" + ((char) b10));
    }

    private int Z(byte[] bArr, int i10, int i11) throws w5.g {
        if (i11 - i10 < 19) {
            throw new w5.g("数据长度不够");
        }
        try {
            this.f31154g = f.f(bArr, i10);
            return i10 + 19;
        } catch (IndexOutOfBoundsException e10) {
            throw new w5.g("数据长度不够", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int a0(byte[] r13, int r14) {
        /*
            r12 = this;
            int r0 = r14 + 6
            r1 = r13[r0]     // Catch: w5.g -> L2e
            r2 = 47
            r3 = 1
            r4 = 2
            r5 = 0
            if (r1 == r2) goto L46
            r2 = 104(0x68, float:1.46E-43)
            if (r1 == r2) goto L33
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L31
            int r5 = Y(r13, r14, r4)     // Catch: w5.g -> L2e
            int r1 = r14 + 2
            int r1 = Y(r13, r1, r4)     // Catch: w5.g -> L2e
            int r2 = r14 + 4
            int r2 = Y(r13, r2, r4)     // Catch: w5.g -> L2e
            int r13 = Y(r13, r0, r4)     // Catch: w5.g -> L2e
            int r14 = r14 + 8
        L29:
            r11 = r13
            r9 = r1
            r10 = r2
            r0 = 1
            goto L5d
        L2e:
            r0 = move-exception
            r13 = r0
            goto L8a
        L31:
            r0 = 1
            goto L47
        L33:
            int r1 = Y(r13, r14, r4)     // Catch: w5.g -> L2e
            int r0 = r14 + 2
            int r2 = Y(r13, r0, r4)     // Catch: w5.g -> L2e
            int r0 = r14 + 4
            int r13 = Y(r13, r0, r4)     // Catch: w5.g -> L2e
            int r14 = r14 + 7
            goto L29
        L46:
            r0 = 0
        L47:
            int r1 = Y(r13, r14, r4)     // Catch: w5.g -> L2e
            int r2 = r14 + 2
            int r2 = Y(r13, r2, r4)     // Catch: w5.g -> L2e
            int r6 = r14 + 4
            int r13 = Y(r13, r6, r4)     // Catch: w5.g -> L2e
            int r14 = r14 + 7
            r10 = r13
            r5 = r1
            r9 = r2
            r11 = 0
        L5d:
            java.util.GregorianCalendar r13 = new java.util.GregorianCalendar
            if (r0 == 0) goto L68
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = j$.util.DesugarTimeZone.getTimeZone(r0)
            goto L6c
        L68:
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
        L6c:
            r13.<init>(r0)
            if (r5 != 0) goto L76
            r0 = 5
            int r5 = r13.get(r0)
        L76:
            r8 = r5
            int r6 = r13.get(r3)
            int r7 = r13.get(r4)
            r5 = r13
            r5.set(r6, r7, r8, r9, r10, r11)
            long r0 = r5.getTimeInMillis()
            r12.f31155h = r0
            return r14
        L8a:
            r13.printStackTrace()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.a.a0(byte[], int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private w5.h c0(byte[] r19, int r20, int r21, java.lang.String r22) throws w5.g {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.a.c0(byte[], int, int, java.lang.String):w5.h");
    }

    public static int x(String str) {
        if (str == null || str.isEmpty()) {
            return 67;
        }
        return 67 - str.getBytes(f31149x).length;
    }

    static double y(double d10) {
        return ((double) (((int) d10) * 100)) + ((d10 % 1.0d) * 60.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double z(byte[] bArr, int i10, int i11) {
        double d10 = Double.parseDouble(new String(bArr, i10, i11 - 1).replace(' ', '0'));
        byte b10 = bArr[(i10 + i11) - 1];
        if (b10 == 83 || b10 == 87 || b10 == 115 || b10 == 119) {
            d10 = -d10;
        }
        return A(d10);
    }

    public Integer B() {
        return this.f31161w;
    }

    public w5.c C() {
        return (w5.c) this.f31315a;
    }

    public int D() {
        b bVar = this.f31156r;
        if (bVar == null) {
            return 0;
        }
        return bVar.f31169a;
    }

    public String E() {
        StringBuilder sb2 = new StringBuilder();
        int iOrdinal = this.f31150c.ordinal();
        if (iOrdinal != 1) {
            String strSubstring = "         ";
            if (iOrdinal == 2) {
                sb2.append(':');
                String str = this.f31152e;
                if (str != null) {
                    if (str.length() > 9) {
                        strSubstring = str.substring(0, 9);
                    } else if (str.length() < 9) {
                        strSubstring = (str + "         ").substring(0, 9);
                    } else {
                        strSubstring = str;
                    }
                }
                sb2.append(strSubstring);
                sb2.append(':');
                String str2 = this.f31151d;
                if (str2 != null) {
                    sb2.append(str2);
                }
                if (this.f31153f != null) {
                    sb2.append('{');
                    sb2.append(this.f31153f);
                }
            } else if (iOrdinal == 3) {
                sb2.append(':');
                String str3 = this.f31152e;
                if (str3 != null) {
                    if (str3.length() > 9) {
                        strSubstring = str3.substring(0, 9);
                    } else if (str3.length() < 9) {
                        strSubstring = (str3 + "         ").substring(0, 9);
                    } else {
                        strSubstring = str3;
                    }
                }
                sb2.append(strSubstring);
                sb2.append(":ack");
                String str4 = this.f31153f;
                if (str4 == null) {
                    str4 = "";
                }
                sb2.append(str4);
            } else if (iOrdinal != 11) {
                String str5 = this.f31151d;
                if (str5 != null) {
                    sb2.append(str5);
                }
            } else {
                sb2.append('}');
                String str6 = this.f31160v;
                if (str6 != null) {
                    sb2.append(str6);
                }
            }
        } else {
            if (this.f31151d != null) {
                sb2.append('=');
            } else {
                sb2.append('!');
            }
            sb2.append(this.f31154g.toString());
            b bVar = this.f31156r;
            if (bVar != null) {
                sb2.append(bVar.b());
            }
            if (this.f31161w != null) {
                int iRound = Math.round(r1.intValue() * 3.28084f);
                String str7 = iRound > 0 ? String.format(Locale.getDefault(), "/A=%06d", Integer.valueOf(iRound)) : String.format(Locale.getDefault(), "/A=-%05d", Integer.valueOf(-iRound));
                if (str7.length() == 9) {
                    sb2.append(str7);
                }
            }
            String str8 = this.f31151d;
            if (str8 != null) {
                sb2.append(str8);
            }
        }
        return sb2.toString();
    }

    public String F() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f31152e;
        if (str != null) {
            sb2.append(str);
            sb2.append(":");
        }
        String str2 = this.f31151d;
        if (str2 != null) {
            sb2.append(str2);
        }
        if (this.f31153f != null) {
            if (this.f31150c == g.MESSAGE_ACK) {
                sb2.append("ack");
            } else {
                sb2.append("{");
            }
            sb2.append(this.f31153f);
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    public String G() {
        return this.f31153f;
    }

    public String H() {
        g gVar = this.f31150c;
        if (gVar == g.MESSAGE || gVar == g.MESSAGE_ACK) {
            return this.f31152e;
        }
        return null;
    }

    public String I() {
        return this.f31152e;
    }

    public f J() {
        return this.f31154g;
    }

    public String K() {
        return w.b(this.f31159u) ? E() : this.f31159u;
    }

    public float L() {
        if (this.f31156r == null) {
            return 0.0f;
        }
        return r0.f31170b * 0.5144445f;
    }

    public String M() {
        f fVar = this.f31154g;
        return fVar != null ? fVar.d() : this.f31150c.ordinal() != 4 ? "" : "/_";
    }

    public long N() {
        f fVar = this.f31154g;
        if (fVar != null) {
            long j10 = fVar.f31200c;
            if (j10 != 0) {
                return j10;
            }
        }
        return this.f31155h;
    }

    public g O() {
        return this.f31150c;
    }

    public boolean P() {
        String str;
        if (this.f31150c == g.MESSAGE && (str = this.f31152e) != null) {
            return str.startsWith("BLN");
        }
        return false;
    }

    public String b0(String str) {
        w5.c cVarC = C();
        ArrayList arrayListR = cVarC.r();
        int i10 = -1;
        for (int i11 = 0; i11 < arrayListR.size(); i11++) {
            if (((c.a) arrayListR.get(i11)).n()) {
                i10 = i11;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVarC.f31219d.k());
        sb2.append(">");
        sb2.append(cVarC.f31218c.k());
        for (int i12 = 0; i12 < arrayListR.size(); i12++) {
            c.a aVar = (c.a) arrayListR.get(i12);
            sb2.append(",");
            sb2.append(aVar.k());
            if (i12 == i10) {
                sb2.append('*');
            }
        }
        if (!w.b(str)) {
            sb2.append(",qAO");
            sb2.append(",");
            sb2.append(str);
        }
        sb2.append(':');
        sb2.append(K());
        return sb2.toString();
    }

    @Override // w5.h
    int d() {
        return K().getBytes(f31149x).length;
    }

    int d0(byte[] bArr, int i10, String str) {
        if (str == null) {
            return i10;
        }
        byte[] bytes = str.getBytes(f31149x);
        int length = bytes.length;
        int i11 = 0;
        while (i11 < length) {
            bArr[i10] = bytes[i11];
            i11++;
            i10++;
        }
        return i10;
    }

    @Override // w5.h
    int h(byte[] bArr, int i10) {
        return d0(bArr, i10, K());
    }

    public String toString() {
        return "APRS {" + E() + "}";
    }

    private a() {
        this.f31150c = g.UNKNOWN;
    }

    public static class b implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f31170b;

        b(byte[] bArr, int i10) {
            this.f31169a = a.Y(bArr, i10, 3);
            this.f31170b = a.Y(bArr, i10 + 4, 3);
        }

        public static b a(byte[] bArr, int i10, int i11) {
            if (i11 - i10 < 6) {
                return null;
            }
            int i12 = bArr[i10 + 3] - 28;
            int i13 = bArr[i10 + 4] - 28;
            int i14 = (i12 * 10) + (i13 / 10);
            int i15 = ((i13 % 10) * 100) + (bArr[i10 + 5] - 28);
            if (i15 >= 400) {
                i15 -= 400;
            }
            if (i14 >= 800) {
                i14 -= 800;
            }
            return new b(i15, i14);
        }

        public String b() {
            return String.format(Locale.ENGLISH, "%03d/%03d", Integer.valueOf(this.f31169a), Integer.valueOf(this.f31170b));
        }

        public String toString() {
            return String.format(Locale.getDefault(), "%03d/%03dkm/h", Integer.valueOf(this.f31169a), Integer.valueOf(Math.round(this.f31170b * 1.852f)));
        }

        public b(int i10, int i11) {
            this.f31169a = i10;
            this.f31170b = i11;
        }
    }

    public static class f implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f31198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f31199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f31200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public char f31201d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public char f31202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f31203f;

        public f(double d10, double d11, char c10, char c11) {
            this.f31203f = " sT";
            this.f31198a = Math.round(d10 * 100000.0d) * 1.0E-5d;
            this.f31199b = Math.round(d11 * 100000.0d) * 1.0E-5d;
            this.f31201d = c10;
            this.f31202e = c11;
            this.f31200c = System.currentTimeMillis();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static f f(byte[] bArr, int i10) {
            f fVar = new f();
            fVar.f31198a = a.z(bArr, i10, 8);
            fVar.f31201d = (char) bArr[i10 + 8];
            fVar.f31199b = a.z(bArr, i10 + 9, 9);
            fVar.f31202e = (char) bArr[i10 + 18];
            return fVar;
        }

        public static f g(byte[] bArr, int i10) throws w5.g {
            for (int i11 = 1; i11 < 9; i11++) {
                byte b10 = bArr[i10 + i11];
                if (b10 < 33 || b10 > 123) {
                    throw new w5.g("压缩数据值不在允许范围内");
                }
            }
            f fVar = new f();
            fVar.f31201d = (char) bArr[i10];
            int i12 = bArr[i10 + 1] - Framer.ENTER_FRAME_PREFIX;
            int i13 = bArr[i10 + 2] - Framer.ENTER_FRAME_PREFIX;
            int i14 = bArr[i10 + 3] - Framer.ENTER_FRAME_PREFIX;
            int i15 = bArr[i10 + 4] - Framer.ENTER_FRAME_PREFIX;
            int i16 = bArr[i10 + 5] - Framer.ENTER_FRAME_PREFIX;
            int i17 = bArr[i10 + 6] - Framer.ENTER_FRAME_PREFIX;
            int i18 = bArr[i10 + 7] - Framer.ENTER_FRAME_PREFIX;
            int i19 = bArr[i10 + 8] - Framer.ENTER_FRAME_PREFIX;
            fVar.f31202e = (char) bArr[i10 + 9];
            fVar.f31198a = 90.0f - (((((i12 * 753571) + (i13 * 8281)) + (i14 * 91)) + i15) / 380926.0f);
            fVar.f31199b = (((((i16 * 753571) + (i17 * 8281)) + (i18 * 91)) + i19) / 190463.0f) - 180.0f;
            fVar.f31203f = new String(bArr, i10 + 10, 3);
            return fVar;
        }

        private static double h(char[] cArr, int i10, int i11, int i12, boolean z10) throws w5.g {
            char c10;
            if (cArr != null) {
                int i13 = i10 + i11;
                if (cArr.length >= i13 + 2) {
                    double d10 = 0.0d;
                    double d11 = 0.0d;
                    int i14 = 0;
                    while (true) {
                        double d12 = 10.0d;
                        if (i14 >= i11) {
                            int length = (cArr.length - i11) - i10;
                            int i15 = i12 - i11;
                            if (length > i15) {
                                length = i15;
                            }
                            for (int i16 = 0; i16 < length; i16++) {
                                char c11 = cArr[i13 + i16];
                                if (z10 && i16 == 2) {
                                    if (c11 != '.') {
                                        throw new w5.g("Expected decimal dot");
                                    }
                                } else {
                                    if (c11 < '0' || c11 > '9') {
                                        throw new w5.g("Bad input decimals: " + c11);
                                    }
                                    d10 += ((double) (c11 - '0')) * d12;
                                    d12 *= 0.1d;
                                }
                            }
                            if (d10 >= 60.0d) {
                                throw new w5.g("Bad minutes value - 60.0 or over");
                            }
                            double dRound = Math.round((d11 + (d10 / 60.0d)) * 100000.0d) * 1.0E-5d;
                            if (i11 == 2 && dRound > 90.01d) {
                                throw new w5.g("Latitude value too high");
                            }
                            if (i11 != 3 || dRound <= 180.00999450683594d) {
                                return dRound;
                            }
                            throw new w5.g("Longitude value too high");
                        }
                        c10 = cArr[i10 + i14];
                        if (c10 < '0' || c10 > '9') {
                            break;
                        }
                        d11 = (d11 * 10.0d) + ((double) (c10 - '0'));
                        i14++;
                    }
                    throw new w5.g("Bad input decimals:  " + c10);
                }
            }
            throw new w5.g("Too short degmin data");
        }

        /* JADX WARN: Removed duplicated region for block: B:142:0x01de  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static w5.a.f i(byte[] r27, int r28, int r29, java.lang.String r30) throws w5.g {
            /*
                Method dump skipped, instruction units count: 776
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: w5.a.f.i(byte[], int, int, java.lang.String):w5.a$f");
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f clone() {
            return (f) super.clone();
        }

        public String d() {
            return new String(new char[]{this.f31201d, this.f31202e});
        }

        public String toString() {
            return a.R(this.f31198a) + this.f31201d + a.T(this.f31199b) + this.f31202e;
        }

        private f() {
            this.f31203f = " sT";
        }
    }
}
