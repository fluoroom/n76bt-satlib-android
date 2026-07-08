package rg;

import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f26032d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g f26033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g f26034f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f26036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f26037c;

    public static final class a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final C0359a f26038j = new C0359a(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final a f26039k = new a(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, "  ", "", "", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f26040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f26041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f26042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f26043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f26044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f26045f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f26046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f26047h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f26048i;

        /* JADX INFO: renamed from: rg.g$a$a, reason: collision with other inner class name */
        public static final class C0359a {
            public /* synthetic */ C0359a(rd.h hVar) {
                this();
            }

            public final a a() {
                return a.f26039k;
            }

            private C0359a() {
            }
        }

        public a(int i10, int i11, String str, String str2, String str3, String str4) {
            rd.m.e(str, "groupSeparator");
            rd.m.e(str2, "byteSeparator");
            rd.m.e(str3, "bytePrefix");
            rd.m.e(str4, "byteSuffix");
            this.f26040a = i10;
            this.f26041b = i11;
            this.f26042c = str;
            this.f26043d = str2;
            this.f26044e = str3;
            this.f26045f = str4;
            this.f26046g = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            this.f26047h = str3.length() == 0 && str4.length() == 0 && str2.length() <= 1;
            this.f26048i = h.b(str) || h.b(str2) || h.b(str3) || h.b(str4);
        }

        public final StringBuilder b(StringBuilder sb2, String str) {
            rd.m.e(sb2, "sb");
            rd.m.e(str, "indent");
            sb2.append(str);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f26040a);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f26041b);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f26042c);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f26043d);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f26044e);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f26045f);
            sb2.append("\"");
            return sb2;
        }

        public final String c() {
            return this.f26044e;
        }

        public final String d() {
            return this.f26043d;
        }

        public final String e() {
            return this.f26045f;
        }

        public final int f() {
            return this.f26041b;
        }

        public final int g() {
            return this.f26040a;
        }

        public final String h() {
            return this.f26042c;
        }

        public final boolean i() {
            return this.f26046g;
        }

        public final boolean j() {
            return this.f26047h;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final g a() {
            return g.f26033e;
        }

        public final g b() {
            return g.f26034f;
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f26049h = new a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final c f26050i = new c("", "", false, 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f26052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f26053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f26054d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f26055e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f26056f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f26057g;

        public static final class a {
            public /* synthetic */ a(rd.h hVar) {
                this();
            }

            public final c a() {
                return c.f26050i;
            }

            private a() {
            }
        }

        public c(String str, String str2, boolean z10, int i10) {
            rd.m.e(str, "prefix");
            rd.m.e(str2, "suffix");
            this.f26051a = str;
            this.f26052b = str2;
            this.f26053c = z10;
            this.f26054d = i10;
            boolean z11 = str.length() == 0 && str2.length() == 0;
            this.f26055e = z11;
            this.f26056f = z11 && i10 == 1;
            this.f26057g = h.b(str) || h.b(str2);
        }

        public final StringBuilder b(StringBuilder sb2, String str) {
            rd.m.e(sb2, "sb");
            rd.m.e(str, "indent");
            sb2.append(str);
            sb2.append("prefix = \"");
            sb2.append(this.f26051a);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("suffix = \"");
            sb2.append(this.f26052b);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f26053c);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(str);
            sb2.append("minLength = ");
            sb2.append(this.f26054d);
            return sb2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    static {
        a.C0359a c0359a = a.f26038j;
        a aVarA = c0359a.a();
        c.a aVar = c.f26049h;
        f26033e = new g(false, aVarA, aVar.a());
        f26034f = new g(true, c0359a.a(), aVar.a());
    }

    public g(boolean z10, a aVar, c cVar) {
        rd.m.e(aVar, "bytes");
        rd.m.e(cVar, "number");
        this.f26035a = z10;
        this.f26036b = aVar;
        this.f26037c = cVar;
    }

    public final a c() {
        return this.f26036b;
    }

    public final boolean d() {
        return this.f26035a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        sb2.append('\n');
        sb2.append("    upperCase = ");
        sb2.append(this.f26035a);
        sb2.append(",");
        sb2.append('\n');
        sb2.append("    bytes = BytesHexFormat(");
        sb2.append('\n');
        this.f26036b.b(sb2, "        ").append('\n');
        sb2.append("    ),");
        sb2.append('\n');
        sb2.append("    number = NumberHexFormat(");
        sb2.append('\n');
        this.f26037c.b(sb2, "        ").append('\n');
        sb2.append("    )");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
