package com.google.protobuf;

import com.google.protobuf.r;
import com.google.protobuf.t;
import com.google.protobuf.t2;
import java.io.IOException;
import java.lang.Character;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n2 {

    /* JADX INFO: renamed from: a */
    private static final Logger f9204a = Logger.getLogger(n2.class.getName());

    /* JADX INFO: renamed from: b */
    private static final c f9205b = c.a().a();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f9206a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f9207b;

        static {
            int[] iArr = new int[r.g.c.values().length];
            f9207b = iArr;
            try {
                iArr[r.g.c.f10022f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9207b[r.g.c.A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9207b[r.g.c.f10032y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9207b[r.g.c.f10020d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9207b[r.g.c.B.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9207b[r.g.c.f10033z.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9207b[r.g.c.f10025r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9207b[r.g.c.f10019c.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9207b[r.g.c.f10018b.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9207b[r.g.c.f10030w.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9207b[r.g.c.f10024h.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9207b[r.g.c.f10021e.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9207b[r.g.c.f10023g.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9207b[r.g.c.f10026s.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9207b[r.g.c.f10029v.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9207b[r.g.c.f10031x.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9207b[r.g.c.f10028u.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9207b[r.g.c.f10027t.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r.g.b.values().length];
            f9206a = iArr2;
            try {
                iArr2[r.g.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9206a[r.g.b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9206a[r.g.b.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f9206a[r.g.b.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public static class b extends IOException {
        b(String str) {
            super(str);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a */
        private final q2 f9208a;

        /* JADX INFO: renamed from: b */
        private final boolean f9209b;

        /* JADX INFO: renamed from: c */
        private final boolean f9210c;

        /* JADX INFO: renamed from: d */
        private final boolean f9211d;

        /* JADX INFO: renamed from: e */
        private final b f9212e;

        /* JADX INFO: renamed from: f */
        private final int f9213f;

        public static class a {

            /* JADX INFO: renamed from: a */
            private boolean f9214a = false;

            /* JADX INFO: renamed from: b */
            private boolean f9215b = false;

            /* JADX INFO: renamed from: c */
            private boolean f9216c = false;

            /* JADX INFO: renamed from: d */
            private b f9217d = b.ALLOW_SINGULAR_OVERWRITES;

            /* JADX INFO: renamed from: e */
            private q2 f9218e = q2.c();

            /* JADX INFO: renamed from: f */
            private int f9219f = 100;

            public c a() {
                return new c(this.f9218e, this.f9214a, this.f9215b, this.f9216c, this.f9217d, null, this.f9219f, null);
            }
        }

        public enum b {
            ALLOW_SINGULAR_OVERWRITES,
            FORBID_SINGULAR_OVERWRITES
        }

        /* synthetic */ c(q2 q2Var, boolean z10, boolean z11, boolean z12, b bVar, p2 p2Var, int i10, a aVar) {
            this(q2Var, z10, z11, z12, bVar, p2Var, i10);
        }

        public static a a() {
            return new a();
        }

        private c(q2 q2Var, boolean z10, boolean z11, boolean z12, b bVar, p2 p2Var, int i10) {
            this.f9208a = q2Var;
            this.f9209b = z10;
            this.f9210c = z11;
            this.f9211d = z12;
            this.f9212e = bVar;
            this.f9213f = i10;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: c */
        private static final d f9223c = new d(true, q2.c());

        /* JADX INFO: renamed from: a */
        private final boolean f9224a;

        /* JADX INFO: renamed from: b */
        private final q2 f9225b;

        private static class a implements Comparable {

            /* JADX INFO: renamed from: a */
            private Object f9226a;

            /* JADX INFO: renamed from: b */
            private final r.g.b f9227b;

            a(Object obj, r.g gVar) {
                this.f9226a = obj;
                this.f9227b = d(gVar);
            }

            private static r.g.b d(r.g gVar) {
                return ((r.g) gVar.v().l().get(0)).u();
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: a */
            public int compareTo(a aVar) {
                if (f() == null || aVar.f() == null) {
                    n2.f9204a.info("Invalid key for map field.");
                    return -1;
                }
                int i10 = a.f9206a[this.f9227b.ordinal()];
                if (i10 == 1) {
                    Boolean bool = (Boolean) f();
                    bool.booleanValue();
                    Boolean bool2 = (Boolean) aVar.f();
                    bool2.booleanValue();
                    return bool.compareTo(bool2);
                }
                if (i10 == 2) {
                    Long l10 = (Long) f();
                    l10.longValue();
                    Long l11 = (Long) aVar.f();
                    l11.longValue();
                    return l10.compareTo(l11);
                }
                if (i10 == 3) {
                    Integer num = (Integer) f();
                    num.intValue();
                    Integer num2 = (Integer) aVar.f();
                    num2.intValue();
                    return num.compareTo(num2);
                }
                if (i10 != 4) {
                    return 0;
                }
                String str = (String) f();
                String str2 = (String) aVar.f();
                if (str == null && str2 == null) {
                    return 0;
                }
                if (str == null && str2 != null) {
                    return -1;
                }
                if (str == null || str2 != null) {
                    return str.compareTo(str2);
                }
                return 1;
            }

            Object e() {
                return this.f9226a;
            }

            Object f() {
                return null;
            }
        }

        private d(boolean z10, q2 q2Var) {
            this.f9224a = z10;
            this.f9225b = q2Var;
        }

        private void b(o1 o1Var, e eVar) throws IOException {
            if (o1Var.getDescriptorForType().d().equals("google.protobuf.Any") && e(o1Var, eVar)) {
                return;
            }
            h(o1Var, eVar);
        }

        private boolean e(o1 o1Var, e eVar) throws IOException {
            r.b descriptorForType = o1Var.getDescriptorForType();
            r.g gVarJ = descriptorForType.j(1);
            r.g gVarJ2 = descriptorForType.j(2);
            if (gVarJ != null && gVarJ.y() == r.g.c.f10026s && gVarJ2 != null && gVarJ2.y() == r.g.c.f10029v) {
                String str = (String) o1Var.getField(gVarJ);
                if (str.isEmpty()) {
                    return false;
                }
                Object field = o1Var.getField(gVarJ2);
                try {
                    r.b bVarB = this.f9225b.b(str);
                    if (bVarB == null) {
                        return false;
                    }
                    t.c cVarNewBuilderForType = t.k(bVarB).newBuilderForType();
                    cVarNewBuilderForType.m1172mergeFrom((l) field);
                    eVar.d("[");
                    eVar.d(str);
                    eVar.d("] {");
                    eVar.a();
                    eVar.b();
                    b(cVarNewBuilderForType, eVar);
                    eVar.c();
                    eVar.d("}");
                    eVar.a();
                    return true;
                } catch (p0 unused) {
                }
            }
            return false;
        }

        private void f(r.g gVar, Object obj, e eVar) throws IOException {
            if (!gVar.D()) {
                if (!gVar.b()) {
                    i(gVar, obj, eVar);
                    return;
                }
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    i(gVar, it.next(), eVar);
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                arrayList.add(new a(it2.next(), gVar));
            }
            Collections.sort(arrayList);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                i(gVar, ((a) it3.next()).e(), eVar);
            }
        }

        private void g(r.g gVar, Object obj, e eVar) throws IOException {
            switch (a.f9207b[gVar.y().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    eVar.d(((Integer) obj).toString());
                    break;
                case 4:
                case 5:
                case 6:
                    eVar.d(((Long) obj).toString());
                    break;
                case 7:
                    eVar.d(((Boolean) obj).toString());
                    break;
                case 8:
                    eVar.d(((Float) obj).toString());
                    break;
                case 9:
                    eVar.d(((Double) obj).toString());
                    break;
                case 10:
                case 11:
                    eVar.d(n2.q(((Integer) obj).intValue()));
                    break;
                case 12:
                case 13:
                    eVar.d(n2.r(((Long) obj).longValue()));
                    break;
                case 14:
                    eVar.d("\"");
                    eVar.d(this.f9224a ? o2.e((String) obj) : n2.f((String) obj).replace("\n", "\\n"));
                    eVar.d("\"");
                    break;
                case 15:
                    eVar.d("\"");
                    if (obj instanceof l) {
                        eVar.d(n2.d((l) obj));
                    } else {
                        eVar.d(n2.e((byte[]) obj));
                    }
                    eVar.d("\"");
                    break;
                case 16:
                    eVar.d(((r.f) obj).e());
                    break;
                case 17:
                case 18:
                    b((o1) obj, eVar);
                    break;
            }
        }

        private void h(o1 o1Var, e eVar) throws IOException {
            for (Map.Entry entry : o1Var.getAllFields().entrySet()) {
                f((r.g) entry.getKey(), entry.getValue(), eVar);
            }
            n(o1Var.getUnknownFields(), eVar);
        }

        private void i(r.g gVar, Object obj, e eVar) throws IOException {
            if (gVar.C()) {
                eVar.d("[");
                if (gVar.m().q().R() && gVar.y() == r.g.c.f10028u && gVar.E() && gVar.r() == gVar.v()) {
                    eVar.d(gVar.v().d());
                } else {
                    eVar.d(gVar.d());
                }
                eVar.d("]");
            } else if (gVar.y() == r.g.c.f10027t) {
                eVar.d(gVar.v().e());
            } else {
                eVar.d(gVar.e());
            }
            r.g.b bVarU = gVar.u();
            r.g.b bVar = r.g.b.MESSAGE;
            if (bVarU == bVar) {
                eVar.d(" {");
                eVar.a();
                eVar.b();
            } else {
                eVar.d(": ");
            }
            g(gVar, obj, eVar);
            if (gVar.u() == bVar) {
                eVar.c();
                eVar.d("}");
            }
            eVar.a();
        }

        private static void l(int i10, int i11, List list, e eVar) throws IOException {
            for (Object obj : list) {
                eVar.d(String.valueOf(i10));
                eVar.d(": ");
                m(i11, obj, eVar);
                eVar.a();
            }
        }

        private static void m(int i10, Object obj, e eVar) throws IOException {
            int iB = a3.b(i10);
            if (iB == 0) {
                eVar.d(n2.r(((Long) obj).longValue()));
                return;
            }
            if (iB == 1) {
                eVar.d(String.format(null, "0x%016x", (Long) obj));
                return;
            }
            if (iB != 2) {
                if (iB == 3) {
                    n((t2) obj, eVar);
                    return;
                } else {
                    if (iB == 5) {
                        eVar.d(String.format(null, "0x%08x", (Integer) obj));
                        return;
                    }
                    throw new IllegalArgumentException("Bad tag: " + i10);
                }
            }
            try {
                t2 t2VarI = t2.i((l) obj);
                eVar.d("{");
                eVar.a();
                eVar.b();
                n(t2VarI, eVar);
                eVar.c();
                eVar.d("}");
            } catch (p0 unused) {
                eVar.d("\"");
                eVar.d(n2.d((l) obj));
                eVar.d("\"");
            }
        }

        private static void n(t2 t2Var, e eVar) throws IOException {
            for (Map.Entry entry : t2Var.b().entrySet()) {
                int iIntValue = ((Integer) entry.getKey()).intValue();
                t2.c cVar = (t2.c) entry.getValue();
                l(iIntValue, 0, cVar.r(), eVar);
                l(iIntValue, 5, cVar.k(), eVar);
                l(iIntValue, 1, cVar.l(), eVar);
                l(iIntValue, 2, cVar.o(), eVar);
                for (t2 t2Var2 : cVar.m()) {
                    eVar.d(((Integer) entry.getKey()).toString());
                    eVar.d(" {");
                    eVar.a();
                    eVar.b();
                    n(t2Var2, eVar);
                    eVar.c();
                    eVar.d("}");
                    eVar.a();
                }
            }
        }

        public void c(o1 o1Var, Appendable appendable) throws IOException {
            b(o1Var, n2.i(appendable));
        }

        public void d(t2 t2Var, Appendable appendable) throws IOException {
            n(t2Var, n2.i(appendable));
        }

        public String j(o1 o1Var) {
            try {
                StringBuilder sb2 = new StringBuilder();
                c(o1Var, sb2);
                return sb2.toString();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        public String k(t2 t2Var) {
            try {
                StringBuilder sb2 = new StringBuilder();
                d(t2Var, sb2);
                return sb2.toString();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a */
        private final Appendable f9228a;

        /* JADX INFO: renamed from: b */
        private final StringBuilder f9229b;

        /* JADX INFO: renamed from: c */
        private final boolean f9230c;

        /* JADX INFO: renamed from: d */
        private boolean f9231d;

        /* synthetic */ e(Appendable appendable, boolean z10, a aVar) {
            this(appendable, z10);
        }

        public void a() throws IOException {
            if (!this.f9230c) {
                this.f9228a.append("\n");
            }
            this.f9231d = true;
        }

        public void b() {
            this.f9229b.append("  ");
        }

        public void c() {
            int length = this.f9229b.length();
            if (length == 0) {
                throw new IllegalArgumentException(" Outdent() without matching Indent().");
            }
            this.f9229b.setLength(length - 2);
        }

        public void d(CharSequence charSequence) throws IOException {
            if (this.f9231d) {
                this.f9231d = false;
                this.f9228a.append(this.f9230c ? " " : this.f9229b);
            }
            this.f9228a.append(charSequence);
        }

        private e(Appendable appendable, boolean z10) {
            this.f9229b = new StringBuilder();
            this.f9231d = false;
            this.f9228a = appendable;
            this.f9230c = z10;
        }
    }

    private static int c(byte b10) {
        return (48 > b10 || b10 > 57) ? (97 > b10 || b10 > 122) ? b10 + MessagePack.Code.EXT32 : b10 - 87 : b10 - 48;
    }

    public static String d(l lVar) {
        return o2.a(lVar);
    }

    public static String e(byte[] bArr) {
        return o2.c(bArr);
    }

    public static String f(String str) {
        return o2.d(str);
    }

    private static boolean g(byte b10) {
        if (48 <= b10 && b10 <= 57) {
            return true;
        }
        if (97 > b10 || b10 > 102) {
            return 65 <= b10 && b10 <= 70;
        }
        return true;
    }

    private static boolean h(byte b10) {
        return 48 <= b10 && b10 <= 55;
    }

    public static e i(Appendable appendable) {
        return new e(appendable, false, null);
    }

    static int j(String str) {
        return (int) l(str, true, false);
    }

    static long k(String str) {
        return l(str, true, true);
    }

    private static long l(String str, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11 = 0;
        if (!str.startsWith("-", 0)) {
            z12 = false;
        } else {
            if (!z10) {
                throw new NumberFormatException("Number must be positive: " + str);
            }
            i11 = 1;
            z12 = true;
        }
        if (str.startsWith("0x", i11)) {
            i11 += 2;
            i10 = 16;
        } else {
            i10 = str.startsWith("0", i11) ? 8 : 10;
        }
        String strSubstring = str.substring(i11);
        if (strSubstring.length() < 16) {
            long j10 = Long.parseLong(strSubstring, i10);
            if (z12) {
                j10 = -j10;
            }
            if (!z11) {
                if (z10) {
                    if (j10 > 2147483647L || j10 < -2147483648L) {
                        throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
                    }
                } else if (j10 >= 4294967296L || j10 < 0) {
                    throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
                }
            }
            return j10;
        }
        BigInteger bigInteger = new BigInteger(strSubstring, i10);
        if (z12) {
            bigInteger = bigInteger.negate();
        }
        if (z11) {
            if (z10) {
                if (bigInteger.bitLength() > 63) {
                    throw new NumberFormatException("Number out of range for 64-bit signed integer: " + str);
                }
            } else if (bigInteger.bitLength() > 64) {
                throw new NumberFormatException("Number out of range for 64-bit unsigned integer: " + str);
            }
        } else if (z10) {
            if (bigInteger.bitLength() > 31) {
                throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
            }
        } else if (bigInteger.bitLength() > 32) {
            throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
        }
        return bigInteger.longValue();
    }

    static int m(String str) {
        return (int) l(str, false, false);
    }

    static long n(String str) {
        return l(str, false, true);
    }

    public static d o() {
        return d.f9223c;
    }

    public static l p(CharSequence charSequence) throws b {
        int i10;
        int i11;
        int length;
        int i12;
        l lVarI = l.i(charSequence.toString());
        int size = lVarI.size();
        byte[] bArr = new byte[size];
        int i13 = 0;
        int i14 = 0;
        while (i13 < lVarI.size()) {
            byte bD = lVarI.d(i13);
            if (bD == 92) {
                int i15 = i13 + 1;
                if (i15 >= lVarI.size()) {
                    throw new b("Invalid escape sequence: '\\' at end of string.");
                }
                byte bD2 = lVarI.d(i15);
                if (h(bD2)) {
                    int iC = c(bD2);
                    int i16 = i13 + 2;
                    if (i16 < lVarI.size() && h(lVarI.d(i16))) {
                        iC = (iC * 8) + c(lVarI.d(i16));
                        i15 = i16;
                    }
                    i13 = i15 + 1;
                    if (i13 >= lVarI.size() || !h(lVarI.d(i13))) {
                        i13 = i15;
                    } else {
                        iC = (iC * 8) + c(lVarI.d(i13));
                    }
                    i12 = i14 + 1;
                    bArr[i14] = (byte) iC;
                } else {
                    if (bD2 == 34) {
                        i10 = i14 + 1;
                        bArr[i14] = 34;
                    } else if (bD2 == 39) {
                        i10 = i14 + 1;
                        bArr[i14] = 39;
                    } else if (bD2 != 63) {
                        if (bD2 == 85) {
                            int i17 = i13 + 2;
                            i11 = i13 + 9;
                            if (i11 >= lVarI.size()) {
                                throw new b("Invalid escape sequence: '\\U' with too few hex chars");
                            }
                            int i18 = i17;
                            int iC2 = 0;
                            while (true) {
                                int i19 = i13 + 10;
                                if (i18 < i19) {
                                    byte bD3 = lVarI.d(i18);
                                    if (!g(bD3)) {
                                        throw new b("Invalid escape sequence: '\\U' with too few hex chars");
                                    }
                                    iC2 = (iC2 << 4) | c(bD3);
                                    i18++;
                                } else {
                                    if (!Character.isValidCodePoint(iC2)) {
                                        throw new b("Invalid escape sequence: '\\U" + lVarI.A(i17, i19).N() + "' is not a valid code point value");
                                    }
                                    Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iC2);
                                    if (unicodeBlockOf != null && (unicodeBlockOf.equals(Character.UnicodeBlock.LOW_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES))) {
                                        throw new b("Invalid escape sequence: '\\U" + lVarI.A(i17, i19).N() + "' refers to a surrogate code unit");
                                    }
                                    byte[] bytes = new String(new int[]{iC2}, 0, 1).getBytes(o0.f9245b);
                                    System.arraycopy(bytes, 0, bArr, i14, bytes.length);
                                    length = bytes.length;
                                }
                            }
                        } else if (bD2 == 92) {
                            i10 = i14 + 1;
                            bArr[i14] = 92;
                        } else if (bD2 == 102) {
                            i10 = i14 + 1;
                            bArr[i14] = 12;
                        } else if (bD2 == 110) {
                            i10 = i14 + 1;
                            bArr[i14] = 10;
                        } else if (bD2 == 114) {
                            i10 = i14 + 1;
                            bArr[i14] = 13;
                        } else if (bD2 == 120) {
                            int i20 = i13 + 2;
                            if (i20 >= lVarI.size() || !g(lVarI.d(i20))) {
                                throw new b("Invalid escape sequence: '\\x' with no digits");
                            }
                            int iC3 = c(lVarI.d(i20));
                            i13 += 3;
                            if (i13 >= lVarI.size() || !g(lVarI.d(i13))) {
                                i13 = i20;
                            } else {
                                iC3 = (iC3 * 16) + c(lVarI.d(i13));
                            }
                            i12 = i14 + 1;
                            bArr[i14] = (byte) iC3;
                        } else if (bD2 == 97) {
                            i10 = i14 + 1;
                            bArr[i14] = 7;
                        } else if (bD2 != 98) {
                            switch (bD2) {
                                case 116:
                                    i10 = i14 + 1;
                                    bArr[i14] = 9;
                                    break;
                                case 117:
                                    int i21 = i13 + 2;
                                    i11 = i13 + 5;
                                    if (i11 < lVarI.size() && g(lVarI.d(i21))) {
                                        int i22 = i13 + 3;
                                        if (g(lVarI.d(i22))) {
                                            int i23 = i13 + 4;
                                            if (g(lVarI.d(i23)) && g(lVarI.d(i11))) {
                                                char c10 = (char) ((c(lVarI.d(i23)) << 4) | (c(lVarI.d(i21)) << 12) | (c(lVarI.d(i22)) << 8) | c(lVarI.d(i11)));
                                                if (c10 >= 55296 && c10 <= 57343) {
                                                    throw new b("Invalid escape sequence: '\\u' refers to a surrogate");
                                                }
                                                byte[] bytes2 = Character.toString(c10).getBytes(o0.f9245b);
                                                System.arraycopy(bytes2, 0, bArr, i14, bytes2.length);
                                                length = bytes2.length;
                                                break;
                                            }
                                        }
                                    }
                                    throw new b("Invalid escape sequence: '\\u' with too few hex chars");
                                case 118:
                                    i10 = i14 + 1;
                                    bArr[i14] = 11;
                                    break;
                                default:
                                    throw new b("Invalid escape sequence: '\\" + ((char) bD2) + '\'');
                            }
                        } else {
                            i10 = i14 + 1;
                            bArr[i14] = 8;
                        }
                        i14 += length;
                        i13 = i11;
                    } else {
                        i10 = i14 + 1;
                        bArr[i14] = 63;
                    }
                    i14 = i10;
                    i13 = i15;
                }
                i14 = i12;
            } else {
                bArr[i14] = bD;
                i14++;
            }
            i13++;
        }
        return size == i14 ? l.R(bArr) : l.h(bArr, 0, i14);
    }

    public static String q(int i10) {
        return i10 >= 0 ? Integer.toString(i10) : Long.toString(((long) i10) & 4294967295L);
    }

    public static String r(long j10) {
        return j10 >= 0 ? Long.toString(j10) : BigInteger.valueOf(j10 & Long.MAX_VALUE).setBit(63).toString();
    }
}
