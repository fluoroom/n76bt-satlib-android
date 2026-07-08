package d5;

import a6.q;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.provider.a;
import g4.f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class a extends g4.e implements Cloneable {
    public static final Parcelable.Creator<a> CREATOR = new C0145a();
    private static final int[] N = {23, 25, 26, 31, 32, 36, 43, 47, 51, 53, 54, 65, 71, 72, 73, 74, 114, 115, 116, 122, 125, 131, 132, 134, 143, 145, 152, 155, 156, 162, 165, 172, 174, 205, 212, 223, 225, 226, 243, 244, 245, 246, 251, 252, 255, 261, 263, 265, 266, 271, 274, 306, 311, 315, 325, 331, 332, 343, 346, 351, 356, 364, 365, 371, 411, 412, 413, 423, 431, 432, 445, 446, 452, 454, 455, 462, 464, 465, 466, 503, 506, 516, 523, 526, 532, 546, 565, 606, 612, 624, 627, 631, 632, 654, 662, 664, 703, 712, 723, 731, 732, 734, 743, 754};
    private static final int[] O = {47, 244, 464, 627, 51, 172, 445, 23, 32, 452, 413, 271, 306, 245, 506, 174, 712, 152, 754, 225, 365, 364, 546, 223, 412, 274, 115, 731, 265, 503, 251, 36, 74, 263, 356, 134, 122, 411, 351, 25, 72, 523, 165, 462, 446, 732, 205, 156, 454, 65, 145, 71, 664, 423, 526, 465, 455, 532, 612, 243, 212, 131, 125, 734, 226, 143, 54, 315, 723, 516, 43, 255, 53, 266, 332, 252, 26, 331, 662, 162, 73, 432, 246, 325, 343, 132, 703, 631, 346, 632, 31, 606, 624, 743, 466, 311, 565, 114, 431, 155, 261, 371, 654, 116};
    private static final int[] P = {6700, 6930, 7190, 7440, 7700, 7970, 8250, 8540, 8850, 9150, 9480, 9740, 10000, 10350, 10720, 11090, 11480, 11880, 12300, 12730, 13180, 13650, 14130, 14620, 15000, 15140, 15670, 15980, 16220, 16550, 16790, 17130, 17380, 17730, 17990, 18350, 18620, 18990, 19280, 19660, 19950, 20350, 20650, 21070, 21380, 21810, 22130, 22570, 22910, 23360, 23710, 24180, 24550, 25030, 25410};
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public int M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f10572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10574h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d f10575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d f10576s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10577t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10578u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10579v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10580w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10581x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10582y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10583z;

    /* JADX INFO: renamed from: d5.a$a, reason: collision with other inner class name */
    class C0145a implements Parcelable.Creator {
        C0145a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String[] f10584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f10585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static String f10586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static String f10587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static String f10588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f10589f;

        static {
            String str = a.C0096a.f6665c;
            f10584a = new String[]{"title", "tx_freq", "rx_freq", "tx_sub_audio", "rx_sub_audio", "tx_power", "bandwidth", "scan", "offline", str, "sign", "tx_dis", "bclo", "mute", "rx_modulation", "tx_modulation"};
            f10585b = new String[]{"title", "tx_freq", "rx_freq", "tx_sub_audio", "rx_sub_audio", "tx_power", "bandwidth", "scan", "talk around", str, "sign", "tx_dis", "bclo", "mute", "rx_modulation", "tx_modulation"};
            f10586c = "H";
            f10587d = "M";
            f10588e = "L";
        }

        private static int a(String[] strArr, String str) {
            String lowerCase = str.toLowerCase();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (strArr[i10].toLowerCase().startsWith(lowerCase)) {
                    return i10;
                }
            }
            return -1;
        }

        public static int[] b(String[] strArr) {
            if (strArr == null) {
                throw new RuntimeException("Wrong format");
            }
            String[] strArr2 = {"tx_freq", "rx_freq"};
            int i10 = 0;
            for (int i11 = 0; i11 < 2; i11++) {
                String str = strArr2[i11];
                if (a(strArr, str) < 0) {
                    throw new RuntimeException("Can not find column:" + str);
                }
            }
            int[] iArr = new int[e.f10595a.length];
            while (true) {
                String[] strArr3 = e.f10595a;
                if (i10 >= strArr3.length) {
                    return iArr;
                }
                String str2 = strArr3[i10];
                int iA = a(strArr, str2);
                if (iA < 0 && str2.equals("offline")) {
                    iA = a(strArr, "talk around");
                }
                iArr[i10] = iA;
                i10++;
            }
        }

        public static String[] c(Context context) {
            String[] strArr = (String[]) f10585b.clone();
            strArr[3] = strArr[3] + context.getString(R.string.csv_sub_audio);
            strArr[4] = strArr[4] + context.getString(R.string.csv_sub_audio);
            strArr[5] = strArr[5] + context.getString(R.string.csv_tx_power);
            strArr[6] = strArr[6] + context.getString(R.string.csv_bandwidth);
            strArr[7] = strArr[7] + context.getString(R.string.csv_on_off);
            strArr[8] = strArr[8] + context.getString(R.string.csv_on_off);
            strArr[9] = strArr[9] + context.getString(R.string.csv_on_off);
            strArr[10] = strArr[10] + context.getString(R.string.csv_on_off);
            strArr[11] = strArr[11] + context.getString(R.string.csv_on_off);
            strArr[12] = strArr[12] + context.getString(R.string.csv_on_off);
            strArr[13] = strArr[13] + context.getString(R.string.csv_on_off);
            strArr[14] = strArr[14] + context.getString(R.string.csv_modulation);
            strArr[15] = strArr[15] + context.getString(R.string.csv_modulation);
            return strArr;
        }

        public static String[] d(Context context, a aVar) {
            String[] strArr = new String[f10584a.length];
            strArr[0] = aVar.f10571e;
            strArr[1] = String.valueOf(aVar.f10573g);
            strArr[2] = String.valueOf(aVar.f10574h);
            strArr[3] = String.valueOf(aVar.f10582y);
            strArr[4] = String.valueOf(aVar.f10583z);
            strArr[5] = f(context, aVar.A);
            strArr[6] = String.valueOf(aVar.B);
            strArr[7] = String.valueOf(aVar.f10578u ? 1 : 0);
            strArr[8] = String.valueOf(aVar.f10577t ? 1 : 0);
            strArr[9] = String.valueOf(aVar.f10580w ? 1 : 0);
            strArr[10] = String.valueOf(aVar.f10581x ? 1 : 0);
            strArr[11] = String.valueOf(aVar.C ? 1 : 0);
            strArr[12] = String.valueOf(aVar.H ? 1 : 0);
            strArr[13] = String.valueOf(aVar.G ? 1 : 0);
            strArr[14] = String.valueOf(aVar.f10575r.ordinal());
            strArr[15] = String.valueOf(aVar.f10576s.ordinal());
            return strArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int e(java.lang.String r3) {
            /*
                java.lang.String r3 = r3.trim()
                java.lang.String r3 = r3.toUpperCase()
                r3.getClass()
                int r0 = r3.hashCode()
                r1 = 0
                r2 = -1
                switch(r0) {
                    case 72: goto L4d;
                    case 76: goto L42;
                    case 77: goto L37;
                    case 20013: goto L2c;
                    case 20302: goto L21;
                    case 39640: goto L16;
                    default: goto L14;
                }
            L14:
                r0 = -1
                goto L57
            L16:
                java.lang.String r0 = "高"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L1f
                goto L14
            L1f:
                r0 = 5
                goto L57
            L21:
                java.lang.String r0 = "低"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L2a
                goto L14
            L2a:
                r0 = 4
                goto L57
            L2c:
                java.lang.String r0 = "中"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L35
                goto L14
            L35:
                r0 = 3
                goto L57
            L37:
                java.lang.String r0 = "M"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L40
                goto L14
            L40:
                r0 = 2
                goto L57
            L42:
                java.lang.String r0 = "L"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L4b
                goto L14
            L4b:
                r0 = 1
                goto L57
            L4d:
                java.lang.String r0 = "H"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L56
                goto L14
            L56:
                r0 = 0
            L57:
                switch(r0) {
                    case 0: goto L67;
                    case 1: goto L66;
                    case 2: goto L64;
                    case 3: goto L64;
                    case 4: goto L66;
                    case 5: goto L67;
                    default: goto L5a;
                }
            L5a:
                int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L5f
                return r3
            L5f:
                r3 = move-exception
                r3.printStackTrace()
                return r1
            L64:
                r3 = -2
                return r3
            L66:
                return r2
            L67:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: d5.a.b.e(java.lang.String):int");
        }

        public static String f(Context context, int i10) {
            if (!f10589f) {
                f10586c = context.getString(R.string.power_high);
                f10587d = context.getString(R.string.power_medium);
                f10588e = context.getString(R.string.power_low);
                f10589f = true;
            }
            return i10 != -2 ? i10 != -1 ? i10 != 0 ? String.valueOf(i10) : f10586c : f10588e : f10587d;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ContentValues f10590a;

        c(ContentValues contentValues) {
            this.f10590a = contentValues;
        }

        public int a(String str) {
            Integer asInteger = this.f10590a.getAsInteger(str);
            if (asInteger == null) {
                return 0;
            }
            return asInteger.intValue();
        }

        public String b(String str) {
            return this.f10590a.getAsString(str);
        }
    }

    public enum d {
        FM,
        AM,
        DMR;

        public static d d(int i10) {
            d[] dVarArrValues = values();
            return (i10 < 0 || i10 >= dVarArrValues.length) ? FM : dVarArrValues[i10];
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String[] f10595a = {"_id", "tx_freq", "rx_freq", "tx_sub_audio", "rx_sub_audio", "tx_power", "bandwidth", "title", "note", "scan", "offline", a.C0096a.f6665c, "sign", "tx_dis", "bclo", "mute", "rx_modulation", "tx_modulation", "tx_color", "rx_color", "slot", "group_id"};
    }

    public a(Cursor cursor) {
        super(cursor.getLong(0));
        this.f10571e = "";
        this.f10572f = "";
        d dVar = d.FM;
        this.f10575r = dVar;
        this.f10576s = dVar;
        this.f10571e = q.c(cursor.getString(7));
        this.f10572f = q.c(cursor.getString(8));
        this.f10573g = cursor.getInt(1);
        this.f10574h = cursor.getInt(2);
        this.f10582y = cursor.getInt(3);
        this.f10583z = cursor.getInt(4);
        this.K = cursor.getInt(19);
        this.J = cursor.getInt(18);
        this.L = cursor.getInt(20);
        this.M = cursor.getInt(21);
        this.A = cursor.getInt(5);
        this.B = cursor.getInt(6);
        this.f10577t = cursor.getInt(10) == 1;
        int i10 = cursor.getInt(9);
        this.f10578u = (i10 & 1) == 1;
        this.f10579v = (i10 & 2) == 2;
        this.f10580w = cursor.getInt(11) == 1;
        this.f10581x = cursor.getInt(12) == 1;
        this.C = cursor.getInt(13) == 1;
        this.H = cursor.getInt(14) == 1;
        this.G = cursor.getInt(15) == 1;
        this.f10575r = d.d(cursor.getInt(16));
        this.f10576s = d.d(cursor.getInt(17));
    }

    public static a F(long j10) {
        return G(ContentUris.appendId(a.C0096a.f6663a.buildUpon(), j10).build());
    }

    public static a G(Uri uri) {
        Cursor cursorQuery;
        if (uri == null || (cursorQuery = Main.f5556h.query(uri, e.f10595a, null, null, null)) == null) {
            return null;
        }
        try {
            if (cursorQuery.moveToNext()) {
                return new a(cursorQuery);
            }
            return null;
        } finally {
            cursorQuery.close();
        }
    }

    public static a[] H(long[] jArr) {
        a aVar;
        g4.f fVarG = new f.b().j("_id", jArr).g();
        Cursor cursorQuery = Main.f5556h.query(a.C0096a.f6663a, e.f10595a, fVarG.n(), fVarG.k(), "_id");
        ArrayList arrayList = new ArrayList(jArr.length);
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(new a(cursorQuery));
                } finally {
                    cursorQuery.close();
                }
            }
        }
        a[] aVarArr = new a[jArr.length];
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long j10 = jArr[i10];
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    aVar = null;
                    break;
                }
                aVar = (a) arrayList.get(i11);
                if (aVar.b() == j10) {
                    break;
                }
                i11++;
            }
            aVarArr[i10] = aVar;
        }
        return aVarArr;
    }

    public static a I(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(str);
            while (true) {
                Object objNextValue = jSONTokener.nextValue();
                if (objNextValue == null) {
                    jSONObject = null;
                    break;
                }
                if (objNextValue instanceof JSONObject) {
                    jSONObject = (JSONObject) objNextValue;
                    break;
                }
            }
            if (jSONObject == null) {
                return null;
            }
            return J(jSONObject);
        } catch (Exception unused) {
            return null;
        }
    }

    public static a J(JSONObject jSONObject) {
        String str = "0";
        try {
            a aVarN = n();
            String strOptString = jSONObject.optString("rf", "0");
            if (!strOptString.isEmpty()) {
                str = strOptString;
            }
            aVarN.f10574h = new BigDecimal(str).multiply(BigDecimal.valueOf(1000000L)).intValue();
            String strOptString2 = jSONObject.optString("tf", "");
            if (strOptString2.isEmpty()) {
                aVarN.f10573g = aVarN.f10574h;
            } else {
                aVarN.f10573g = new BigDecimal(strOptString2).multiply(BigDecimal.valueOf(1000000L)).intValue();
            }
            aVarN.f10571e = jSONObject.optString("n", aVarN.f10571e);
            aVarN.f10582y = jSONObject.optInt("ts", 0);
            aVarN.f10583z = jSONObject.optInt("rs", 0);
            aVarN.B = jSONObject.optInt("w", 1) == 1 ? 25000 : 12500;
            aVarN.f10577t = jSONObject.optInt("ol", 0) == 1;
            aVarN.f10578u = jSONObject.optInt("s", 0) == 1;
            aVarN.f10580w = jSONObject.optInt("eb", 0) == 1;
            aVarN.f10581x = jSONObject.optInt(Name.MARK, 0) == 1;
            aVarN.C = jSONObject.optInt("td", 0) == 1;
            aVarN.H = jSONObject.optInt("bcl", 0) == 1;
            aVarN.G = jSONObject.optInt("m", 0) == 1;
            int iOptInt = jSONObject.optInt("p", RtlSpacingHelper.UNDEFINED);
            if (iOptInt == -2 || iOptInt == -1 || iOptInt == 0 || iOptInt > 0) {
                aVarN.A = iOptInt;
            }
            aVarN.f10575r = d.d(jSONObject.optInt("rm"));
            aVarN.f10576s = d.d(jSONObject.optInt("tm"));
            return aVarN;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static int M(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = a.C0096a.f6664b;
            if (i11 >= iArr.length) {
                return 0;
            }
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
    }

    public static String j(int i10) {
        if (i10 == 0) {
            return com.dw.ht.o.d().i().getString(R.string.off);
        }
        if (i10 == 1) {
            return com.dw.ht.o.d().i().getString(R.string.custom);
        }
        if (i10 < 1000) {
            int iBinarySearch = Arrays.binarySearch(N, i10);
            return iBinarySearch >= 0 ? String.format(Locale.ENGLISH, "DCS-%03dN/%03dI", Integer.valueOf(i10), Integer.valueOf(O[iBinarySearch])) : String.format(Locale.ENGLISH, "DCS-%03d", Integer.valueOf(i10));
        }
        if (Arrays.binarySearch(P, i10) >= 0) {
            return (((double) i10) / 100.0d) + "Hz";
        }
        return com.dw.ht.o.d().i().getString(R.string.custom) + " (" + (((double) i10) / 100.0d) + "Hz)";
    }

    public static String[] k(int i10) {
        int[] iArr = a.C0096a.f6664b;
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        for (int i11 : iArr) {
            arrayList.add(j(i11));
        }
        if (i10 > 0) {
            arrayList.add(1, j(i10));
        }
        return (String[]) arrayList.toArray(d4.c.f10567g);
    }

    public static a n() {
        a aVar = new a();
        aVar.B = 25000;
        aVar.f10581x = true;
        return aVar;
    }

    public static a p(a aVar) {
        f.b bVarH = new f.b().h("tx_freq", String.valueOf(aVar.f10573g)).h("rx_freq", String.valueOf(aVar.f10574h)).h("rx_modulation", String.valueOf(aVar.f10575r.ordinal())).h("tx_modulation", String.valueOf(aVar.f10576s.ordinal())).h("tx_sub_audio", String.valueOf(aVar.f10582y)).h("rx_sub_audio", String.valueOf(aVar.f10583z)).h("bandwidth", String.valueOf(aVar.B)).h("title", aVar.f10571e).h("tx_color", String.valueOf(aVar.J)).h("rx_color", String.valueOf(aVar.K)).h("slot", String.valueOf(aVar.L)).h("group_id", String.valueOf(aVar.M)).h("sign", aVar.f10581x ? "1" : "0").h(a.C0096a.f6665c, aVar.f10580w ? "1" : "0").h("tx_dis", aVar.C ? "1" : "0").h("bclo", aVar.H ? "1" : "0").h("mute", aVar.G ? "1" : "0");
        if (!Cfg.f5482d) {
            bVarH.h("scan", aVar.f10578u ? "1" : "0");
        }
        g4.f fVarG = bVarH.g();
        Cursor cursorQuery = Main.f5556h.query(a.C0096a.f6663a, e.f10595a, fVarG.n(), fVarG.k(), "_id");
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.moveToFirst()) {
                return new a(cursorQuery);
            }
            return null;
        } finally {
            cursorQuery.close();
        }
    }

    private String r(int i10) {
        String string = new BigDecimal(i10).divide(new BigDecimal(1000000)).toString();
        int iIndexOf = string.indexOf(46);
        if (iIndexOf < 0) {
            return string + ".000";
        }
        int length = (string.length() - iIndexOf) - 1;
        if (length == 1) {
            return string + "00";
        }
        if (length != 2) {
            return string;
        }
        return string + "0";
    }

    public String A(boolean z10) {
        int i10 = this.f10573g;
        if (i10 <= 0) {
            return com.dw.ht.o.d().i().getResources().getString(R.string.empty);
        }
        if (!z10) {
            return r(i10);
        }
        return this.f10576s + " " + r(this.f10573g);
    }

    public String B() {
        return com.dw.ht.o.d().i().getString(R.string.txPower) + ":" + (this.A == -1 ? com.dw.ht.o.d().i().getString(R.string.high) : com.dw.ht.o.d().i().getString(R.string.low));
    }

    public String C() {
        return com.dw.ht.o.d().i().getString(R.string.ctcss_dcs) + ":" + j(this.f10582y);
    }

    public boolean D() {
        return (this.f10573g == this.f10574h && this.f10582y == 0 && this.f10583z == 0 && this.B == 25000 && this.f10575r == this.f10576s && !this.f10580w) ? false : true;
    }

    public boolean E() {
        return this.f10574h <= 0;
    }

    public int K() {
        if (this.C) {
            return 0;
        }
        return this.f10577t ? this.f10574h : this.f10573g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void L() {
        if (this.f10579v) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("scan", (Integer) 0);
            ContentResolver contentResolver = Main.f5556h;
            Uri uri = a.C0096a.f6663a;
            contentResolver.update(uri, contentValues, "scan=2", null);
            contentValues.put("scan", (Integer) 1);
            Main.f5556h.update(uri, contentValues, "scan=3", null);
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("tx_freq", Integer.valueOf(this.f10573g));
        contentValues2.put("rx_freq", Integer.valueOf(this.f10574h));
        contentValues2.put("tx_modulation", Integer.valueOf(this.f10576s.ordinal()));
        contentValues2.put("rx_modulation", Integer.valueOf(this.f10575r.ordinal()));
        contentValues2.put("tx_sub_audio", Integer.valueOf(this.f10582y));
        contentValues2.put("rx_sub_audio", Integer.valueOf(this.f10583z));
        contentValues2.put("tx_power", Integer.valueOf(this.A));
        contentValues2.put("bandwidth", Integer.valueOf(this.B));
        contentValues2.put("tx_color", Integer.valueOf(this.J));
        contentValues2.put("rx_color", Integer.valueOf(this.K));
        contentValues2.put("slot", Integer.valueOf(this.L));
        contentValues2.put("group_id", Integer.valueOf(this.M));
        contentValues2.put("title", this.f10571e);
        contentValues2.put("note", this.f10572f);
        boolean z10 = this.f10578u;
        int i10 = z10;
        if (this.f10579v) {
            i10 = (z10 ? 1 : 0) | 2;
        }
        contentValues2.put("scan", Integer.valueOf(i10));
        contentValues2.put("offline", Integer.valueOf(this.f10577t ? 1 : 0));
        contentValues2.put("sign", Integer.valueOf(this.f10581x ? 1 : 0));
        contentValues2.put("tx_dis", Integer.valueOf(this.C ? 1 : 0));
        contentValues2.put("bclo", Integer.valueOf(this.H ? 1 : 0));
        contentValues2.put("mute", Integer.valueOf(this.G ? 1 : 0));
        contentValues2.put(a.C0096a.f6665c, Integer.valueOf(this.f10580w ? 1 : 0));
        if (this.f13515c != 0) {
            contentValues2.put("last_use", Long.valueOf(System.currentTimeMillis()));
            Main.f5556h.update(ContentUris.withAppendedId(a.C0096a.f6663a, this.f13515c), contentValues2, null, null);
        } else {
            this.f13515c = ContentUris.parseId(Main.f5556h.insert(a.C0096a.f6663a, contentValues2));
        }
        g();
    }

    public JSONObject N() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f10571e)) {
                jSONObject.put("n", this.f10571e);
            }
            jSONObject.put("rf", v());
            if (this.f10574h != this.f10573g) {
                jSONObject.put("tf", z());
            }
            d dVar = this.f10575r;
            d dVar2 = d.FM;
            if (dVar != dVar2) {
                jSONObject.put("rm", dVar.ordinal());
            }
            d dVar3 = this.f10576s;
            if (dVar3 != dVar2) {
                jSONObject.put("tm", dVar3.ordinal());
            }
            int i10 = this.f10582y;
            if (i10 != 0) {
                jSONObject.put("ts", i10);
            }
            int i11 = this.f10583z;
            if (i11 != 0) {
                jSONObject.put("rs", i11);
            }
            if (this.B != 25000) {
                jSONObject.put("w", 0);
            }
            if (this.f10577t) {
                jSONObject.put("ol", 1);
            }
            if (this.f10578u) {
                jSONObject.put("s", 1);
            }
            if (this.f10580w) {
                jSONObject.put("eb", 1);
            }
            if (this.f10581x) {
                jSONObject.put(Name.MARK, 1);
            }
            jSONObject.put("p", this.A);
            if (this.C) {
                jSONObject.put("td", 1);
            }
            if (this.H) {
                jSONObject.put("bcl", 1);
            }
            if (this.G) {
                jSONObject.put("m", 1);
            }
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    @Override // g4.e, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f10573g == aVar.f10573g && this.f10574h == aVar.f10574h && this.K == aVar.K && this.J == aVar.J && this.L == aVar.L && this.M == aVar.M && this.f10577t == aVar.f10577t && this.f10578u == aVar.f10578u && this.f10579v == aVar.f10579v && this.f10580w == aVar.f10580w && this.f10581x == aVar.f10581x && this.f10582y == aVar.f10582y && this.f10583z == aVar.f10583z && this.A == aVar.A && this.B == aVar.B && this.C == aVar.C && this.H == aVar.H && this.I == aVar.I && this.G == aVar.G && q.f(this.f10571e, aVar.f10571e) && q.f(this.f10572f, aVar.f10572f) && this.f10575r == aVar.f10575r && this.f10576s == aVar.f10576s && this.F == aVar.F && this.E == aVar.E && this.D == aVar.D) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return q.g(this.f10571e, this.f10572f, Integer.valueOf(this.f10573g), Integer.valueOf(this.f10574h), Integer.valueOf(this.K), Integer.valueOf(this.J), Integer.valueOf(this.L), Integer.valueOf(this.M), this.f10575r, this.f10576s, Boolean.valueOf(this.f10577t), Boolean.valueOf(this.f10578u), Boolean.valueOf(this.f10579v), Boolean.valueOf(this.f10580w), Boolean.valueOf(this.f10581x), Integer.valueOf(this.f10582y), Integer.valueOf(this.f10583z), Integer.valueOf(this.A), Integer.valueOf(this.B), Boolean.valueOf(this.C), Boolean.valueOf(this.H), Boolean.valueOf(this.I), Boolean.valueOf(this.G), Boolean.valueOf(this.F), Boolean.valueOf(this.E), Boolean.valueOf(this.D));
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public void o(ContentResolver contentResolver) {
        contentResolver.delete(ContentUris.withAppendedId(a.C0096a.f6663a, this.f13515c), null, null);
        f();
    }

    public String t() {
        return com.dw.ht.o.d().i().getString(R.string.bandwidth) + ":" + String.valueOf(((double) this.B) / 1000.0d) + "kHz";
    }

    public String toString() {
        String str;
        if (E()) {
            return z();
        }
        Resources resources = com.dw.ht.o.d().i().getResources();
        String str2 = this.f10571e;
        if (TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = str2 + "\n";
        }
        if (this.f10573g != 0 && this.f10583z == 0 && this.f10582y == 0) {
            return str + resources.getString(R.string.freq) + ":" + v();
        }
        return str + resources.getString(R.string.rx_freq) + ":" + v() + " " + x() + "\n" + resources.getString(R.string.tx_freq) + ":" + z() + " " + C();
    }

    public String[] u(Context context) {
        return b.d(context, this);
    }

    public String v() {
        int i10 = this.f10574h;
        return i10 <= 0 ? "" : r(i10);
    }

    public String w(boolean z10) {
        int i10 = this.f10574h;
        if (i10 <= 0) {
            return com.dw.ht.o.d().i().getResources().getString(R.string.empty);
        }
        if (!z10) {
            return r(i10);
        }
        return this.f10575r + " " + r(this.f10574h);
    }

    @Override // g4.e, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f10571e);
        parcel.writeString(this.f10572f);
        parcel.writeInt(this.f10573g);
        parcel.writeInt(this.f10574h);
        parcel.writeInt(this.K);
        parcel.writeInt(this.J);
        parcel.writeInt(this.L);
        parcel.writeInt(this.M);
        parcel.writeByte(this.f10577t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10578u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10580w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10581x ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f10582y);
        parcel.writeInt(this.f10583z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeByte(this.C ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.H ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.I ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.G ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f10576s.ordinal());
        parcel.writeInt(this.f10575r.ordinal());
        parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.D ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.E ? (byte) 1 : (byte) 0);
    }

    public String x() {
        return com.dw.ht.o.d().i().getString(R.string.ctcss_dcs) + ":" + j(this.f10583z);
    }

    public String y() {
        return TextUtils.isEmpty(this.f10571e) ? w(Cfg.P()) : this.f10571e;
    }

    public String z() {
        int i10 = this.f10573g;
        return i10 <= 0 ? "" : r(i10);
    }

    public a(ContentValues contentValues) {
        this.f10571e = "";
        this.f10572f = "";
        d dVar = d.FM;
        this.f10575r = dVar;
        this.f10576s = dVar;
        c cVar = new c(contentValues);
        this.f10571e = q.c(cVar.b("title"));
        this.f10572f = q.c(cVar.b("note"));
        this.f10573g = cVar.a("tx_freq");
        this.f10574h = cVar.a("rx_freq");
        this.f10582y = cVar.a("tx_sub_audio");
        this.f10583z = cVar.a("rx_sub_audio");
        this.K = cVar.a("rx_color");
        this.J = cVar.a("tx_color");
        this.L = cVar.a("slot");
        this.M = cVar.a("group_id");
        this.A = cVar.a("tx_power");
        this.B = cVar.a("bandwidth");
        this.f10577t = cVar.a("offline") == 1;
        int iA = cVar.a("scan");
        this.f10578u = (iA & 1) == 1;
        this.f10579v = (iA & 2) == 2;
        this.f10580w = cVar.a(a.C0096a.f6665c) == 1;
        this.f10581x = cVar.a("sign") == 1;
        this.C = cVar.a("tx_dis") == 1;
        this.H = cVar.a("bclo") == 1;
        this.G = cVar.a("mute") == 1;
        this.f10575r = d.d(cVar.a("rx_modulation"));
        this.f10576s = d.d(cVar.a("tx_modulation"));
    }

    public a() {
        this.f10571e = "";
        this.f10572f = "";
        d dVar = d.FM;
        this.f10575r = dVar;
        this.f10576s = dVar;
    }

    protected a(Parcel parcel) {
        super(parcel);
        this.f10571e = "";
        this.f10572f = "";
        d dVar = d.FM;
        this.f10575r = dVar;
        this.f10576s = dVar;
        this.f10571e = q.c(parcel.readString());
        this.f10572f = q.c(parcel.readString());
        this.f10573g = parcel.readInt();
        this.f10574h = parcel.readInt();
        this.K = parcel.readInt();
        this.J = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readInt();
        this.f10577t = parcel.readByte() != 0;
        this.f10578u = parcel.readByte() != 0;
        this.f10580w = parcel.readByte() != 0;
        this.f10581x = parcel.readByte() != 0;
        this.f10582y = parcel.readInt();
        this.f10583z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readByte() != 0;
        this.H = parcel.readByte() != 0;
        this.I = parcel.readByte() != 0;
        this.G = parcel.readByte() != 0;
        this.f10576s = d.d(parcel.readInt());
        this.f10575r = d.d(parcel.readInt());
        this.F = parcel.readByte() != 0;
        this.D = parcel.readByte() != 0;
        this.E = parcel.readByte() != 0;
    }
}
