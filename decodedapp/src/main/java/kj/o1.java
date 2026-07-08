package kj;

import java.util.SortedSet;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zj.s;

/* JADX INFO: loaded from: classes3.dex */
class o1 extends kj.a implements d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f20187e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f20188f = 15;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f20209d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f20189g = Pattern.compile("((?:\\p{Blank}|\\p{Digit})\\p{Digit})((?:\\p{Blank}|\\p{Digit})\\p{Digit})((?:\\p{Blank}|\\p{Digit})\\p{Digit})\\p{Blank}+(\\p{Digit}+)(?:\\.00*)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f20190h = 16;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f20191i = 55;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f20192j = Pattern.compile("\\p{Blank}*([IP])\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f20193k = 134;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20194l = 154;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f20195m = Pattern.compile("\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20196n = 57;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f20197o = 78;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f20198p = Pattern.compile("\\p{Blank}*([IP])\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f20199q = 154;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f20200r = 165;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f20201s = Pattern.compile("\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f20202t = 79;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static int f20203u = 93;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f20204v = Pattern.compile("\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f20205w = 95;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static int f20206x = 134;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Pattern f20207y = Pattern.compile("\\p{Blank}*([IP])\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f20208z = 165;
    private static int A = 185;
    private static final Pattern B = Pattern.compile("\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)\\p{Blank}*(-?\\p{Digit}*\\.\\p{Digit}*)");

    static class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f20210d;

        a(s.g gVar, z0 z0Var, yj.b0 b0Var, boolean z10) {
            super(gVar, z0Var, b0Var);
            this.f20210d = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c0 i(Matcher matcher) {
            return matcher.group(1).equals("P") ? c0.PREDICTED : c0.RAPID;
        }

        private c0 j(c0 c0Var, Supplier supplier) {
            return c0Var == c0.UNKNOWN ? (c0) supplier.get() : c0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0193 A[Catch: all -> 0x013d, TryCatch #2 {all -> 0x013d, blocks: (B:9:0x0095, B:11:0x00de, B:13:0x00e4, B:15:0x00ea, B:17:0x00f8, B:31:0x0189, B:33:0x0193, B:44:0x01fb, B:51:0x0228, B:53:0x0240, B:55:0x024a, B:73:0x037b, B:76:0x038a, B:75:0x0381, B:56:0x0255, B:58:0x0263, B:60:0x0267, B:62:0x02ce, B:61:0x029b, B:63:0x02dd, B:64:0x02f5, B:65:0x02f6, B:67:0x0306, B:69:0x030a, B:71:0x036e, B:70:0x033c, B:77:0x03b7, B:78:0x03cf, B:48:0x020a, B:50:0x0218, B:79:0x03d0, B:80:0x03e8, B:36:0x01a0, B:38:0x01ae, B:39:0x01c1, B:40:0x01d9, B:41:0x01da, B:43:0x01e8, B:81:0x03e9, B:82:0x0401, B:20:0x0108, B:22:0x0116, B:26:0x0141, B:27:0x0159, B:28:0x015a, B:30:0x0168, B:83:0x0402, B:84:0x041a, B:85:0x041b, B:86:0x0433, B:87:0x0434, B:88:0x0450), top: B:102:0x0095 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01da A[Catch: all -> 0x013d, TryCatch #2 {all -> 0x013d, blocks: (B:9:0x0095, B:11:0x00de, B:13:0x00e4, B:15:0x00ea, B:17:0x00f8, B:31:0x0189, B:33:0x0193, B:44:0x01fb, B:51:0x0228, B:53:0x0240, B:55:0x024a, B:73:0x037b, B:76:0x038a, B:75:0x0381, B:56:0x0255, B:58:0x0263, B:60:0x0267, B:62:0x02ce, B:61:0x029b, B:63:0x02dd, B:64:0x02f5, B:65:0x02f6, B:67:0x0306, B:69:0x030a, B:71:0x036e, B:70:0x033c, B:77:0x03b7, B:78:0x03cf, B:48:0x020a, B:50:0x0218, B:79:0x03d0, B:80:0x03e8, B:36:0x01a0, B:38:0x01ae, B:39:0x01c1, B:40:0x01d9, B:41:0x01da, B:43:0x01e8, B:81:0x03e9, B:82:0x0401, B:20:0x0108, B:22:0x0116, B:26:0x0141, B:27:0x0159, B:28:0x015a, B:30:0x0168, B:83:0x0402, B:84:0x041a, B:85:0x041b, B:86:0x0433, B:87:0x0434, B:88:0x0450), top: B:102:0x0095 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x020a A[Catch: all -> 0x013d, TryCatch #2 {all -> 0x013d, blocks: (B:9:0x0095, B:11:0x00de, B:13:0x00e4, B:15:0x00ea, B:17:0x00f8, B:31:0x0189, B:33:0x0193, B:44:0x01fb, B:51:0x0228, B:53:0x0240, B:55:0x024a, B:73:0x037b, B:76:0x038a, B:75:0x0381, B:56:0x0255, B:58:0x0263, B:60:0x0267, B:62:0x02ce, B:61:0x029b, B:63:0x02dd, B:64:0x02f5, B:65:0x02f6, B:67:0x0306, B:69:0x030a, B:71:0x036e, B:70:0x033c, B:77:0x03b7, B:78:0x03cf, B:48:0x020a, B:50:0x0218, B:79:0x03d0, B:80:0x03e8, B:36:0x01a0, B:38:0x01ae, B:39:0x01c1, B:40:0x01d9, B:41:0x01da, B:43:0x01e8, B:81:0x03e9, B:82:0x0401, B:20:0x0108, B:22:0x0116, B:26:0x0141, B:27:0x0159, B:28:0x015a, B:30:0x0168, B:83:0x0402, B:84:0x041a, B:85:0x041b, B:86:0x0433, B:87:0x0434, B:88:0x0450), top: B:102:0x0095 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0240 A[Catch: all -> 0x013d, TryCatch #2 {all -> 0x013d, blocks: (B:9:0x0095, B:11:0x00de, B:13:0x00e4, B:15:0x00ea, B:17:0x00f8, B:31:0x0189, B:33:0x0193, B:44:0x01fb, B:51:0x0228, B:53:0x0240, B:55:0x024a, B:73:0x037b, B:76:0x038a, B:75:0x0381, B:56:0x0255, B:58:0x0263, B:60:0x0267, B:62:0x02ce, B:61:0x029b, B:63:0x02dd, B:64:0x02f5, B:65:0x02f6, B:67:0x0306, B:69:0x030a, B:71:0x036e, B:70:0x033c, B:77:0x03b7, B:78:0x03cf, B:48:0x020a, B:50:0x0218, B:79:0x03d0, B:80:0x03e8, B:36:0x01a0, B:38:0x01ae, B:39:0x01c1, B:40:0x01d9, B:41:0x01da, B:43:0x01e8, B:81:0x03e9, B:82:0x0401, B:20:0x0108, B:22:0x0116, B:26:0x0141, B:27:0x0159, B:28:0x015a, B:30:0x0168, B:83:0x0402, B:84:0x041a, B:85:0x041b, B:86:0x0433, B:87:0x0434, B:88:0x0450), top: B:102:0x0095 }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x02f6 A[Catch: all -> 0x013d, TryCatch #2 {all -> 0x013d, blocks: (B:9:0x0095, B:11:0x00de, B:13:0x00e4, B:15:0x00ea, B:17:0x00f8, B:31:0x0189, B:33:0x0193, B:44:0x01fb, B:51:0x0228, B:53:0x0240, B:55:0x024a, B:73:0x037b, B:76:0x038a, B:75:0x0381, B:56:0x0255, B:58:0x0263, B:60:0x0267, B:62:0x02ce, B:61:0x029b, B:63:0x02dd, B:64:0x02f5, B:65:0x02f6, B:67:0x0306, B:69:0x030a, B:71:0x036e, B:70:0x033c, B:77:0x03b7, B:78:0x03cf, B:48:0x020a, B:50:0x0218, B:79:0x03d0, B:80:0x03e8, B:36:0x01a0, B:38:0x01ae, B:39:0x01c1, B:40:0x01d9, B:41:0x01da, B:43:0x01e8, B:81:0x03e9, B:82:0x0401, B:20:0x0108, B:22:0x0116, B:26:0x0141, B:27:0x0159, B:28:0x015a, B:30:0x0168, B:83:0x0402, B:84:0x041a, B:85:0x041b, B:86:0x0433, B:87:0x0434, B:88:0x0450), top: B:102:0x0095 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0381 A[Catch: all -> 0x013d, TryCatch #2 {all -> 0x013d, blocks: (B:9:0x0095, B:11:0x00de, B:13:0x00e4, B:15:0x00ea, B:17:0x00f8, B:31:0x0189, B:33:0x0193, B:44:0x01fb, B:51:0x0228, B:53:0x0240, B:55:0x024a, B:73:0x037b, B:76:0x038a, B:75:0x0381, B:56:0x0255, B:58:0x0263, B:60:0x0267, B:62:0x02ce, B:61:0x029b, B:63:0x02dd, B:64:0x02f5, B:65:0x02f6, B:67:0x0306, B:69:0x030a, B:71:0x036e, B:70:0x033c, B:77:0x03b7, B:78:0x03cf, B:48:0x020a, B:50:0x0218, B:79:0x03d0, B:80:0x03e8, B:36:0x01a0, B:38:0x01ae, B:39:0x01c1, B:40:0x01d9, B:41:0x01da, B:43:0x01e8, B:81:0x03e9, B:82:0x0401, B:20:0x0108, B:22:0x0116, B:26:0x0141, B:27:0x0159, B:28:0x015a, B:30:0x0168, B:83:0x0402, B:84:0x041a, B:85:0x041b, B:86:0x0433, B:87:0x0434, B:88:0x0450), top: B:102:0x0095 }] */
        @Override // kj.d0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.Collection a(java.io.InputStream r48, java.lang.String r49) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1126
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kj.o1.a.a(java.io.InputStream, java.lang.String):java.util.Collection");
        }
    }

    o1(boolean z10, String str, gj.g gVar, Supplier supplier) {
        super(str, gVar, supplier);
        this.f20209d = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String G(String str, int i10, int i11) {
        return str.length() >= i11 ? str.substring(i10, i11) : "";
    }

    @Override // kj.d0
    public void a(s.g gVar, SortedSet sortedSet) {
        e0 e0Var = new e0(new a(gVar, new x0("itrf-versions.conf", e()), g(), this.f20209d));
        d(e0Var);
        sortedSet.addAll(e0Var.b());
    }
}
