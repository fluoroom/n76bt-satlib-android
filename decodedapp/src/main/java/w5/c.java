package w5;

import a6.w;
import java.math.BigInteger;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import org.msgpack.core.MessagePack;
import w5.e;

/* JADX INFO: loaded from: classes.dex */
public class c extends h implements Cloneable, e.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static boolean f31217r = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f31218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f31219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f31220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f31221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    byte[] f31222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f31223h;

    public static class a implements Cloneable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static Pattern f31224f = Pattern.compile("\\b[A-Za-z0-9]{1,6}(-(([0-9])|(1[0-5])))?\\b");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f31225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f31226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f31227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private EnumC0415a f31228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f31229e;

        /* JADX INFO: renamed from: w5.c$a$a, reason: collision with other inner class name */
        public enum EnumC0415a {
            Destination,
            Source,
            Repeater
        }

        a() {
        }

        public static boolean o(String str) {
            return f31224f.matcher(str).matches();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a p(EnumC0415a enumC0415a, byte[] bArr, int i10) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < 6; i11++) {
                char c10 = (char) ((bArr[i10 + i11] & MessagePack.Code.EXT_TIMESTAMP) >> 1);
                if (c10 != ' ') {
                    sb2.append(c10);
                }
            }
            a aVar = new a();
            aVar.f31225a = sb2.toString();
            byte b10 = bArr[i10 + 6];
            aVar.f31226b = ((b10 & MessagePack.Code.EXT_TIMESTAMP) >> 1) & 15;
            aVar.f31227c = (b10 & 1) == 1;
            aVar.f31228d = enumC0415a;
            int iOrdinal = enumC0415a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    aVar.f31229e = (b10 & 128) == 0;
                    return aVar;
                }
                if (iOrdinal != 2) {
                    return aVar;
                }
            }
            aVar.f31229e = (b10 & 128) != 0;
            return aVar;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f31225a.equals(aVar.f31225a) && this.f31226b == aVar.f31226b;
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a clone() {
            return (a) super.clone();
        }

        public String j() {
            return this.f31225a;
        }

        public String k() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f31225a;
            if (str != null) {
                sb2.append(str);
            }
            if (this.f31226b != 0) {
                sb2.append('-');
                sb2.append(this.f31226b);
            }
            return sb2.toString();
        }

        public int m() {
            return this.f31226b;
        }

        public boolean n() {
            return this.f31229e;
        }

        public void r(String str) {
            this.f31225a = str;
        }

        public void t(boolean z10) {
            this.f31229e = z10;
        }

        public String toString() {
            return k();
        }

        public void u(int i10) {
            this.f31226b = i10;
        }

        public int v(byte[] bArr, int i10) {
            int i11 = 0;
            boolean z10 = false;
            char upperCase = ' ';
            while (i11 < 6) {
                if (i11 < this.f31225a.length()) {
                    upperCase = this.f31225a.charAt(i11);
                } else {
                    z10 = true;
                }
                if (z10 || !Character.isLetterOrDigit(upperCase) || upperCase == '-') {
                    z10 = true;
                    upperCase = ' ';
                } else {
                    upperCase = Character.toUpperCase(upperCase);
                }
                bArr[i10] = (byte) (upperCase << 1);
                i11++;
                i10++;
            }
            int i12 = (this.f31226b << 1) | 96 | (this.f31227c ? 1 : 0);
            EnumC0415a enumC0415a = this.f31228d;
            if ((enumC0415a == EnumC0415a.Destination && this.f31229e) || ((enumC0415a == EnumC0415a.Source && !this.f31229e) || (enumC0415a == EnumC0415a.Repeater && this.f31229e))) {
                i12 |= 128;
            }
            int i13 = i10 + 1;
            bArr[i10] = (byte) i12;
            return i13;
        }

        public a(String str, EnumC0415a enumC0415a, boolean z10) {
            if (str == null) {
                str = "";
            } else {
                int iIndexOf = str.indexOf("-");
                if (iIndexOf > 0) {
                    String strSubstring = str.substring(iIndexOf + 1);
                    strSubstring = strSubstring.length() > 2 ? strSubstring.substring(0, 2) : strSubstring;
                    if (strSubstring.length() > 1 && !Character.isDigit(strSubstring.charAt(1))) {
                        strSubstring = strSubstring.substring(0, 1);
                    }
                    try {
                        this.f31226b = Integer.parseInt(strSubstring);
                    } catch (NumberFormatException unused) {
                    }
                    str = str.substring(0, iIndexOf);
                }
            }
            this.f31225a = str;
            this.f31228d = enumC0415a;
            this.f31229e = z10;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f31234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f31235e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f31236f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f31237g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f31238h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f31239r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f31240s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f31241t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f31242u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f31243v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final /* synthetic */ b[] f31244w;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EnumC0416c f31247c;

        static {
            EnumC0416c enumC0416c = EnumC0416c.P;
            f31234d = new b("SABM", 0, 111, enumC0416c, "Connect Request");
            f31235e = new b("SABME", 1, 47, enumC0416c, "Connect Request Extended (modulo 128)");
            f31236f = new b("DISC", 2, 67, enumC0416c, "Disconnect request");
            EnumC0416c enumC0416c2 = EnumC0416c.F;
            f31237g = new b("FRMR", 3, 135, enumC0416c2, "Frame Reject");
            EnumC0416c enumC0416c3 = EnumC0416c.PF;
            f31238h = new b("UI", 4, 3, enumC0416c3, "Unnumbered Information Frame");
            f31239r = new b("DM", 5, 15, enumC0416c2, "Disconnect Mode - System Busy or Disconnected.");
            f31240s = new b("XID", 6, 175, enumC0416c3, "Exchange Identifications - Negotiate features.");
            f31241t = new b("UA", 7, 99, enumC0416c2, "Unnumbered Acknowledge");
            f31242u = new b("TEST", 8, 227, enumC0416c3, "Test");
            f31243v = new b("UNKNOWN", 9, -1, enumC0416c3, "Unknown");
            f31244w = a();
        }

        private b(String str, int i10, int i11, EnumC0416c enumC0416c, String str2) {
            this.f31245a = str2;
            this.f31246b = i11;
            this.f31247c = enumC0416c;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{f31234d, f31235e, f31236f, f31237g, f31238h, f31239r, f31240s, f31241t, f31242u, f31243v};
        }

        static b d(int i10) {
            int i11 = i10 & 239;
            for (b bVar : values()) {
                if (bVar.f31246b == i11) {
                    return bVar;
                }
            }
            return f31243v;
        }

        static String e(int i10) {
            return d(i10).f((i10 & 16) != 0);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f31244w.clone();
        }

        public String f(boolean z10) {
            return toString() + String.valueOf(this.f31247c) + "=" + z10;
        }

        @Override // java.lang.Enum
        public String toString() {
            return super.toString() + "(" + this.f31245a + ")";
        }
    }

    /* JADX INFO: renamed from: w5.c$c, reason: collision with other inner class name */
    enum EnumC0416c {
        P,
        F,
        PF
    }

    c() {
        this.f31220e = -1;
        this.f31221f = -1;
        this.f31223h = new ArrayList(8);
    }

    private void n() {
        if (this.f31223h.size() > 330) {
            throw new InvalidParameterException("max frame size is330");
        }
        byte[] bArr = this.f31222g;
        if (bArr != null && bArr.length > 256) {
            throw new InvalidParameterException("max payload size is256");
        }
    }

    public static String p(String str, int i10, int i11) {
        ArrayList<a> arrayListV = v(str, i10);
        for (a aVar : arrayListV) {
            if (aVar.f31226b > i11) {
                aVar.f31226b = i11;
            }
        }
        return w.c(",", arrayListV);
    }

    public static c t(String str) throws g {
        int iIndexOf = str.indexOf(62);
        int iIndexOf2 = str.indexOf(58);
        if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf2 < iIndexOf) {
            throw new g("For input string:" + str);
        }
        String strSubstring = str.substring(0, iIndexOf);
        String[] strArrSplit = str.substring(iIndexOf + 1, iIndexOf2).split(",");
        String str2 = strArrSplit[0];
        byte[] bytes = str.substring(iIndexOf2 + 1).getBytes(w5.a.f31149x);
        ArrayList arrayListB = d4.d.b();
        for (int i10 = 1; i10 < strArrSplit.length; i10++) {
            arrayListB.add(new a(strArrSplit[i10], a.EnumC0415a.Repeater, false));
        }
        return new c(new a(str2, a.EnumC0415a.Destination, false), new a(strSubstring, a.EnumC0415a.Source, false), arrayListB, 3, 240, w5.a.U(bytes, 0, bytes.length, str2));
    }

    public static c u(byte[] bArr, int i10, int i11) throws g {
        c cVar = new c();
        cVar.w(bArr, i10, i11 + i10);
        return cVar;
    }

    public static ArrayList v(String str, int i10) {
        if (str == null) {
            return d4.d.b();
        }
        String[] strArrSplit = str.replaceAll("[^A-Za-z0-9,-]", "").split(",");
        ArrayList arrayListB = d4.d.b();
        for (String str2 : strArrSplit) {
            a aVar = new a(str2, a.EnumC0415a.Repeater, false);
            if (!aVar.f31225a.isEmpty()) {
                arrayListB.add(aVar);
                if (arrayListB.size() >= i10) {
                    break;
                }
            }
        }
        return arrayListB;
    }

    private void w(byte[] bArr, int i10, int i11) throws g {
        int i12;
        if (i11 - i10 < 15) {
            throw new g("包长度不应小于 15");
        }
        this.f31218c = a.p(a.EnumC0415a.Destination, bArr, i10);
        a aVarP = a.p(a.EnumC0415a.Source, bArr, i10 + 7);
        this.f31219d = aVarP;
        int i13 = i10 + 14;
        if (!aVarP.f31227c) {
            while (i11 - i13 >= 8) {
                a aVarP2 = a.p(a.EnumC0415a.Repeater, bArr, i13);
                i13 += 7;
                this.f31223h.add(aVarP2);
                if (aVarP2.f31227c) {
                }
            }
            throw new g("地址字段没有正确终结");
        }
        int i14 = i13 + 1;
        byte b10 = bArr[i13];
        this.f31220e = b10 & MessagePack.Code.EXT_TIMESTAMP;
        if (i14 >= i11) {
            return;
        }
        int i15 = i13 + 2;
        this.f31221f = bArr[i14] & MessagePack.Code.EXT_TIMESTAMP;
        if (i15 < i11 && (b10 & 3) == 3 && (i12 = i11 - i15) > 0) {
            h hVarU = w5.a.U(bArr, i15, i12, this.f31218c.f31225a);
            this.f31316b = hVarU;
            hVarU.f31315a = this;
        }
    }

    @Override // w5.h, w5.e.a
    public long a() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(this.f31219d.f31225a.getBytes());
            messageDigest.update(this.f31218c.f31225a.getBytes());
            byte[] bArr = this.f31222g;
            if (bArr != null) {
                messageDigest.update(bArr);
            } else {
                h hVar = this.f31316b;
                if (hVar != null) {
                    byte[] bArr2 = new byte[hVar.d()];
                    try {
                        this.f31316b.h(bArr2, 0);
                        messageDigest.update(bArr2);
                    } catch (f e10) {
                        e10.printStackTrace();
                    }
                }
            }
            return new BigInteger(messageDigest.digest()).longValue();
        } catch (NoSuchAlgorithmException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // w5.h
    int d() {
        int iD;
        int size = f31217r ? 16 : 14;
        ArrayList arrayList = this.f31223h;
        if (arrayList != null) {
            size += arrayList.size() * 7;
        }
        if (this.f31220e < 0) {
            return size;
        }
        int i10 = size + 1;
        if (this.f31221f < 0) {
            return i10;
        }
        int i11 = size + 2;
        byte[] bArr = this.f31222g;
        if (bArr != null) {
            iD = bArr.length;
        } else {
            h hVar = this.f31316b;
            if (hVar == null) {
                return i11;
            }
            iD = hVar.d();
        }
        return i11 + iD;
    }

    @Override // w5.h
    int h(byte[] bArr, int i10) throws f {
        int i11 = 0;
        this.f31218c.f31227c = false;
        a aVar = this.f31219d;
        ArrayList arrayList = this.f31223h;
        aVar.f31227c = arrayList == null || arrayList.isEmpty();
        int iV = this.f31219d.v(bArr, this.f31218c.v(bArr, i10));
        if (this.f31223h != null) {
            int i12 = 0;
            while (i12 < this.f31223h.size()) {
                a aVar2 = (a) this.f31223h.get(i12);
                aVar2.f31227c = i12 == this.f31223h.size() - 1;
                iV = aVar2.v(bArr, iV);
                i12++;
            }
        }
        int i13 = this.f31220e;
        if (i13 < 0) {
            return iV;
        }
        int i14 = iV + 1;
        bArr[iV] = (byte) i13;
        int i15 = this.f31221f;
        if (i15 < 0) {
            return i14;
        }
        int iH = iV + 2;
        bArr[i14] = (byte) i15;
        if (this.f31222g != null) {
            while (true) {
                byte[] bArr2 = this.f31222g;
                if (i11 >= bArr2.length) {
                    break;
                }
                bArr[iH] = bArr2[i11];
                i11++;
                iH++;
            }
        } else {
            h hVar = this.f31316b;
            if (hVar != null) {
                iH = hVar.h(bArr, iH);
            }
        }
        if (!f31217r) {
            if (iH - i10 <= 328) {
                return iH;
            }
            throw new f("数据长度超过限制");
        }
        int iC = t5.a.c(bArr, i10, iH - i10) ^ 65535;
        int i16 = iH + 1;
        bArr[iH] = (byte) (iC & 255);
        int i17 = iH + 2;
        bArr[i16] = (byte) ((iC >> 8) & 255);
        if (i17 - i10 <= 330) {
            return i17;
        }
        throw new f("数据长度超过限制");
    }

    public boolean m(a aVar) {
        if (this.f31223h.size() >= 8) {
            return false;
        }
        this.f31223h.add(aVar);
        return true;
    }

    @Override // w5.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f31223h = (ArrayList) this.f31223h.clone();
            for (int i10 = 0; i10 < this.f31223h.size(); i10++) {
                cVar.f31223h.set(i10, ((a) this.f31223h.get(i10)).clone());
            }
            a aVar = this.f31218c;
            if (aVar != null) {
                cVar.f31218c = aVar.clone();
            }
            a aVar2 = this.f31219d;
            if (aVar2 != null) {
                cVar.f31219d = aVar2.clone();
            }
            return cVar;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public ArrayList r() {
        return this.f31223h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Ax25 {");
        if (this.f31218c != null) {
            sb2.append("TO:");
            sb2.append(this.f31218c.toString());
            sb2.append(';');
        }
        if (this.f31219d != null) {
            sb2.append("FROM:");
            sb2.append(this.f31219d.toString());
            sb2.append(';');
        }
        ArrayList arrayList = this.f31223h;
        if (arrayList != null && arrayList.size() > 0) {
            sb2.append("REP:");
            Iterator it = this.f31223h.iterator();
            while (it.hasNext()) {
                sb2.append(((a) it.next()).toString());
                sb2.append(';');
            }
        }
        int i10 = this.f31220e;
        if (i10 >= 0) {
            sb2.append(b.e(i10));
            sb2.append(';');
        }
        int i11 = this.f31221f;
        if (i11 >= 0) {
            sb2.append(String.format(Locale.US, "p:%02x;", Integer.valueOf(i11)));
        }
        if (this.f31316b != null) {
            sb2.append("payload:");
            sb2.append(this.f31316b.toString());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public c(a aVar, a aVar2, ArrayList arrayList, int i10, int i11, h hVar) {
        this.f31220e = -1;
        this.f31221f = -1;
        arrayList = arrayList == null ? new ArrayList(8) : arrayList;
        this.f31218c = aVar;
        this.f31219d = aVar2;
        this.f31223h = arrayList;
        this.f31220e = i10;
        this.f31221f = i11;
        this.f31316b = hVar;
        hVar.f31315a = this;
        n();
    }
}
