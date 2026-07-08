package ij;

import com.facebook.stetho.server.http.HttpStatus;
import gj.h;
import gj.t;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class c implements gj.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f16179a = Pattern.compile("^(\\w{4}\\d{3}[0a-x](?:\\d{2})?\\.\\d{2})[dD]$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f16180b = Pattern.compile("^(\\w{9}_\\w{1}_\\d{11}_\\d{2}\\w_\\d{2}\\w{1}_\\w{2})\\.crx$");

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16181a;

        static {
            int[] iArr = new int[e.a.values().length];
            f16181a = iArr;
            try {
                iArr[e.a.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16181a[e.a.EPOCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g[] f16182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h f16183b;

        b(int i10) {
            this.f16182a = new g[i10];
            this.f16183b = new h(i10 * 2);
        }
    }

    /* JADX INFO: renamed from: ij.c$c, reason: collision with other inner class name */
    private static class C0223c extends e {
        C0223c(String str, BufferedReader bufferedReader) {
            super(str, bufferedReader);
        }

        @Override // ij.c.e
        public CharSequence j(String str, String str2) throws IOException {
            StringBuilder sb2 = new StringBuilder();
            a(sb2, 0, 32, 28, 29, 32, 12, 9, str, str2, '&');
            List listG = g();
            sb2.append(e());
            int i10 = 0;
            while (i10 < aj.d.E(listG.size(), 12)) {
                sb2.append((String) listG.get(i10));
                i10++;
            }
            if (c().length() > 0) {
                while (sb2.length() < 68) {
                    sb2.append(' ');
                }
                sb2.append(c());
            }
            while (i10 < listG.size()) {
                e.p(sb2);
                sb2.append('\n');
                for (int i11 = 0; i11 < 32; i11++) {
                    sb2.append(' ');
                }
                int i12 = i10;
                while (i12 < aj.d.E(listG.size(), i10 + 12)) {
                    sb2.append((String) listG.get(i12));
                    i12++;
                }
                i10 = i12;
            }
            e.p(sb2);
            return sb2;
        }

        @Override // ij.c.e
        public CharSequence k(String str) {
            if (!h("# / TYPES OF OBSERV", str)) {
                return super.k(str);
            }
            for (lj.b bVar : lj.b.values()) {
                r(bVar, e.l(str, 0, 6));
            }
            return str;
        }

        @Override // ij.c.e
        public CharSequence m(String[] strArr) {
            b(14, 3, strArr);
            StringBuilder sb2 = new StringBuilder();
            for (CharSequence charSequence : g()) {
                if (sb2.length() > 0) {
                    e.p(sb2);
                    sb2.append('\n');
                }
                b bVarD = d(charSequence);
                CharSequence charSequenceB = bVarD.f16183b.b();
                for (int i10 = 0; i10 < bVarD.f16182a.length; i10++) {
                    if (i10 > 0 && i10 % 5 == 0) {
                        e.p(sb2);
                        sb2.append('\n');
                    }
                    if (bVarD.f16182a[i10] == null) {
                        for (int i11 = 0; i11 < 16; i11++) {
                            sb2.append(' ');
                        }
                    } else {
                        sb2.append(bVarD.f16182a[i10].b());
                        int i12 = i10 * 2;
                        if (i12 < charSequenceB.length()) {
                            sb2.append(charSequenceB.charAt(i12));
                        }
                        int i13 = i12 + 1;
                        if (i13 < charSequenceB.length()) {
                            sb2.append(charSequenceB.charAt(i13));
                        }
                    }
                }
            }
            e.p(sb2);
            return sb2;
        }
    }

    private static class d extends e {
        d(String str, BufferedReader bufferedReader) {
            super(str, bufferedReader);
        }

        @Override // ij.c.e
        public CharSequence j(String str, String str2) throws IOException {
            StringBuilder sb2 = new StringBuilder();
            a(sb2, 0, 41, 31, 32, 41, 15, 12, str, str2, '>');
            sb2.append(e());
            if (c().length() > 0) {
                while (sb2.length() < 41) {
                    sb2.append(' ');
                }
                sb2.append(c());
            }
            e.p(sb2);
            return sb2;
        }

        @Override // ij.c.e
        public CharSequence k(String str) {
            if (!h("SYS / # / OBS TYPES", str)) {
                return super.k(str);
            }
            if (str.charAt(0) != ' ') {
                r(lj.b.d(e.n(str, 0, 1)), e.l(str, 1, 5));
            }
            return str;
        }

        @Override // ij.c.e
        public CharSequence m(String[] strArr) {
            b(14, 3, strArr);
            StringBuilder sb2 = new StringBuilder();
            for (CharSequence charSequence : g()) {
                if (sb2.length() > 0) {
                    e.p(sb2);
                    sb2.append('\n');
                }
                sb2.append(charSequence);
                b bVarD = d(charSequence);
                CharSequence charSequenceB = bVarD.f16183b.b();
                for (int i10 = 0; i10 < bVarD.f16182a.length; i10++) {
                    if (bVarD.f16182a[i10] == null) {
                        for (int i11 = 0; i11 < 16; i11++) {
                            sb2.append(' ');
                        }
                    } else {
                        sb2.append(bVarD.f16182a[i10].b());
                        int i12 = i10 * 2;
                        if (i12 < charSequenceB.length()) {
                            sb2.append(charSequenceB.charAt(i12));
                        }
                        int i13 = i12 + 1;
                        if (i13 < charSequenceB.length()) {
                            sb2.append(charSequenceB.charAt(i13));
                        }
                    }
                }
            }
            e.p(sb2);
            return sb2;
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final BufferedReader f16185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f16186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f16187d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f16188e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private a f16189f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f16190g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private h f16191h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private g f16192i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private h f16193j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Map f16194k;

        private enum a {
            HEADER,
            EPOCH,
            OBSERVATION
        }

        protected e(String str, BufferedReader bufferedReader) {
            this.f16184a = str;
            this.f16185b = bufferedReader;
            for (lj.b bVar : lj.b.values()) {
                this.f16187d.put(bVar, 0);
            }
            this.f16188e = HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
            this.f16189f = a.HEADER;
        }

        public static e f(String str, BufferedReader bufferedReader) throws IOException {
            String line = bufferedReader.readLine();
            String line2 = bufferedReader.readLine();
            if (line == null || line2 == null) {
                throw new hj.a(hj.f.NOT_A_SUPPORTED_HATANAKA_COMPRESSED_FILE, str);
            }
            int iM = (int) aj.d.M(i(line, 0, 9) * 100.0d);
            if (iM != 100 && iM != 300) {
                throw new hj.a(hj.f.UNSUPPORTED_FILE_FORMAT, str);
            }
            if (!"CRINEX VERS   / TYPE".equals(n(line, 60, 20))) {
                throw new hj.a(hj.f.NOT_A_SUPPORTED_HATANAKA_COMPRESSED_FILE, str);
            }
            if ("CRINEX PROG / DATE".equals(n(line2, 60, 18))) {
                return iM < 300 ? new C0223c(str, bufferedReader) : new d(str, bufferedReader);
            }
            throw new hj.a(hj.f.NOT_A_SUPPORTED_HATANAKA_COMPRESSED_FILE, str);
        }

        public static double i(CharSequence charSequence, int i10, int i11) {
            if (charSequence.length() <= i10 || n(charSequence, i10, i11).length() <= 0) {
                return Double.NaN;
            }
            return Double.parseDouble(n(charSequence, i10, i11));
        }

        public static int l(CharSequence charSequence, int i10, int i11) {
            if (charSequence.length() <= i10 || n(charSequence, i10, i11).length() <= 0) {
                return 0;
            }
            return Integer.parseInt(n(charSequence, i10, i11));
        }

        public static String n(CharSequence charSequence, int i10, int i11) {
            if (charSequence.length() > i10) {
                return charSequence.subSequence(i10, aj.d.E(charSequence.length(), i11 + i10)).toString().trim();
            }
            return null;
        }

        private String o() throws IOException {
            String line = this.f16185b.readLine();
            if (line == null) {
                throw new hj.a(hj.f.UNEXPECTED_END_OF_FILE, this.f16184a);
            }
            this.f16186c++;
            return line;
        }

        public static void p(StringBuilder sb2) {
            for (int length = sb2.length() - 1; length >= 0 && sb2.charAt(length) == ' '; length--) {
                sb2.deleteCharAt(length);
            }
        }

        protected void a(StringBuilder sb2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str, String str2, char c10) throws IOException {
            int i17 = 1;
            String str3 = str;
            String strO = str2;
            while (true) {
                for (boolean z10 = true; z10; z10 = false) {
                    if (this.f16191h == null || str3.charAt(0) == c10) {
                        this.f16191h = new h(i11);
                        this.f16193j = new h(this.f16188e * 3);
                        this.f16194k = new HashMap();
                    }
                    this.f16191h.a(str3.subSequence(i10, aj.d.E(str3.length(), i10 + i11)));
                    if (l(this.f16191h.b(), i12, i17) > i17) {
                        sb2.append(this.f16191h.b());
                        p(sb2);
                        sb2.append('\n');
                        int iL = l(this.f16191h.b(), i13, 3);
                        for (int i18 = 0; i18 < iL; i18++) {
                            sb2.append(strO);
                            p(sb2);
                            sb2.append('\n');
                            strO = o();
                        }
                        String str4 = strO;
                        strO = o();
                        str3 = str4;
                    } else {
                        int iL2 = l(this.f16191h.b(), i13, 3);
                        this.f16190g = new ArrayList(iL2);
                        if (i14 < str3.length()) {
                            this.f16193j.a(str3.subSequence(i14, str3.length()));
                        }
                        CharSequence charSequenceB = this.f16193j.b();
                        int i19 = 0;
                        while (i19 < iL2) {
                            int i20 = i19 * 3;
                            i19++;
                            this.f16190g.add(charSequenceB.subSequence(i20, i19 * 3).toString());
                        }
                        if (!strO.isEmpty()) {
                            if (strO.length() <= 2 || strO.charAt(1) != '&') {
                                g gVar = this.f16192i;
                                if (gVar == null) {
                                    throw new hj.a(hj.f.UNABLE_TO_PARSE_LINE_IN_FILE, Integer.valueOf(this.f16186c), this.f16184a, strO);
                                }
                                gVar.a(strO);
                            } else {
                                g gVar2 = new g(i15, i16, l(strO, 0, 1));
                                this.f16192i = gVar2;
                                gVar2.a(strO.subSequence(2, strO.length()));
                            }
                        }
                        i17 = 1;
                    }
                }
                return;
            }
        }

        protected void b(int i10, int i11, String[] strArr) {
            for (int i12 = 0; i12 < strArr.length; i12++) {
                String str = strArr[i12];
                String str2 = (String) this.f16190g.get(i12);
                b bVar = (b) this.f16194k.get(str2);
                if (bVar == null) {
                    b bVar2 = new b(((Integer) this.f16187d.get(lj.b.d(str2.subSequence(0, 1).toString()))).intValue());
                    this.f16194k.put(str2, bVar2);
                    bVar = bVar2;
                }
                int i13 = 0;
                for (int i14 = 0; i14 < bVar.f16182a.length; i14++) {
                    if (i13 >= str.length() || str.charAt(i13) == ' ') {
                        bVar.f16182a[i14] = null;
                    } else {
                        int i15 = i13 + 1;
                        if (i15 < str.length() && Character.isDigit(str.charAt(i13)) && str.charAt(i15) == '&') {
                            bVar.f16182a[i14] = new g(i10, i11, Character.digit(str.charAt(i13), 10));
                            i13 += 2;
                        }
                        int i16 = i13;
                        while (i16 < str.length() && str.charAt(i16) != ' ') {
                            i16++;
                        }
                        try {
                            bVar.f16182a[i14].a(str.subSequence(i13, i16));
                            i13 = i16;
                        } catch (NumberFormatException e10) {
                            throw new hj.a(e10, hj.f.UNABLE_TO_PARSE_LINE_IN_FILE, Integer.valueOf((this.f16186c + i12) - (strArr.length - 1)), this.f16184a, strArr[i12]);
                        }
                    }
                    i13++;
                }
                if (i13 < str.length()) {
                    bVar.f16183b.a(str.subSequence(i13, str.length()));
                }
            }
        }

        protected CharSequence c() {
            g gVar = this.f16192i;
            return gVar == null ? "" : gVar.b();
        }

        protected b d(CharSequence charSequence) {
            return (b) this.f16194k.get(charSequence);
        }

        protected CharSequence e() {
            return this.f16191h.b();
        }

        protected List g() {
            return this.f16190g;
        }

        protected boolean h(String str, String str2) {
            return str.equals(n(str2, 60, str.length()));
        }

        public abstract CharSequence j(String str, String str2);

        public CharSequence k(String str) {
            if (h("# OF SATELLITES", str)) {
                this.f16188e = l(str, 0, 6);
                return str;
            }
            if (h("END OF HEADER", str)) {
                this.f16189f = a.EPOCH;
            }
            return str;
        }

        public abstract CharSequence m(String[] strArr);

        public CharSequence q(String str) throws IOException {
            int i10 = a.f16181a[this.f16189f.ordinal()];
            if (i10 == 1) {
                StringBuilder sb2 = new StringBuilder();
                this.f16186c = 3;
                while (this.f16189f == a.HEADER) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                        str = o();
                    }
                    sb2.append(k(str));
                    p(sb2);
                }
                this.f16189f = a.EPOCH;
                return sb2;
            }
            if (i10 == 2) {
                this.f16186c++;
                CharSequence charSequenceJ = j(str, o().trim());
                this.f16189f = a.OBSERVATION;
                return charSequenceJ;
            }
            int size = this.f16190g.size();
            String[] strArr = new String[size];
            this.f16186c++;
            strArr[0] = str;
            for (int i11 = 1; i11 < size; i11++) {
                strArr[i11] = o();
            }
            CharSequence charSequenceM = m(strArr);
            this.f16189f = a.EPOCH;
            return charSequenceM;
        }

        protected void r(lj.b bVar, int i10) {
            Map map = this.f16187d;
            map.put(bVar, Integer.valueOf(aj.d.C(((Integer) map.get(bVar)).intValue(), i10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class f extends t {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final e f16199e;

        f(String str, Reader reader) {
            super(str, reader);
            this.f16199e = e.f(str, c());
        }

        @Override // gj.t
        protected CharSequence a(int i10, String str) {
            return this.f16199e.q(str);
        }
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long[] f16202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f16203d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f16204e;

        g(int i10, int i11, int i12) {
            this.f16200a = i10;
            this.f16201b = i11;
            this.f16202c = new long[i12 + 1];
        }

        public void a(CharSequence charSequence) {
            this.f16202c[this.f16203d] = Long.parseLong(charSequence.toString());
            for (int i10 = this.f16203d; i10 > 0; i10--) {
                long[] jArr = this.f16202c;
                int i11 = i10 - 1;
                jArr[i11] = jArr[i11] + jArr[i10];
            }
            int i12 = this.f16203d;
            int i13 = i12 + 1;
            this.f16203d = i13;
            long[] jArr2 = this.f16202c;
            if (i13 == jArr2.length) {
                this.f16203d = i12;
            }
            String string = Long.toString(aj.d.d(jArr2[0]));
            int length = string.length();
            int iC = this.f16200a - (aj.d.C(length, this.f16201b) + (this.f16202c[0] < 0 ? 2 : 1));
            StringBuilder sb2 = new StringBuilder();
            for (int i14 = 0; i14 < iC; i14++) {
                sb2.append(' ');
            }
            if (this.f16202c[0] < 0) {
                sb2.append('-');
            }
            int i15 = this.f16201b;
            if (length > i15) {
                sb2.append((CharSequence) string, 0, length - i15);
            }
            sb2.append('.');
            int i16 = this.f16201b;
            while (i16 > 0) {
                sb2.append(i16 > length ? '0' : string.charAt(length - i16));
                i16--;
            }
            this.f16204e = sb2;
        }

        public CharSequence b() {
            return this.f16204e;
        }
    }

    private static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharBuffer f16205a;

        h(int i10) {
            this.f16205a = CharBuffer.allocate(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f16205a.put(i11, ' ');
            }
        }

        public void a(CharSequence charSequence) {
            int iE = aj.d.E(this.f16205a.capacity(), charSequence.length());
            for (int i10 = 0; i10 < iE; i10++) {
                char cCharAt = charSequence.charAt(i10);
                if (cCharAt == '&') {
                    this.f16205a.put(i10, ' ');
                } else if (cCharAt != ' ') {
                    this.f16205a.put(i10, cCharAt);
                }
            }
        }

        public CharSequence b() {
            return this.f16205a;
        }
    }

    public static /* synthetic */ Reader b(String str, h.b bVar) {
        return new f(str, bVar.a());
    }

    public static /* synthetic */ Reader c(String str, h.b bVar) {
        return new f(str, bVar.a());
    }

    @Override // gj.d
    public gj.h a(gj.h hVar) {
        final String strA = hVar.a();
        final h.b bVarB = hVar.b();
        Matcher matcher = f16179a.matcher(strA);
        if (matcher.matches()) {
            return new gj.h(matcher.group(1) + "o", new h.d() { // from class: ij.a
                @Override // gj.h.d
                public final Reader a() {
                    return c.c(strA, bVarB);
                }
            });
        }
        Matcher matcher2 = f16180b.matcher(strA);
        if (!matcher2.matches()) {
            return hVar;
        }
        return new gj.h(matcher2.group(1) + ".rnx", new h.d() { // from class: ij.b
            @Override // gj.h.d
            public final Reader a() {
                return c.b(strA, bVarB);
            }
        });
    }
}
