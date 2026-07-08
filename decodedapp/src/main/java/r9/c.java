package r9;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    static abstract class a extends c {
        a() {
        }
    }

    private static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f25624a;

        b(char c10) {
            this.f25624a = c10;
        }

        @Override // r9.c
        public boolean d(char c10) {
            return c10 == this.f25624a;
        }

        public String toString() {
            return "CharMatcher.is('" + c.f(this.f25624a) + "')";
        }
    }

    /* JADX INFO: renamed from: r9.c$c, reason: collision with other inner class name */
    static abstract class AbstractC0353c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25625a;

        AbstractC0353c(String str) {
            this.f25625a = (String) l.n(str);
        }

        public final String toString() {
            return this.f25625a;
        }
    }

    private static final class d extends AbstractC0353c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final c f25626b = new d();

        private d() {
            super("CharMatcher.none()");
        }

        @Override // r9.c
        public int b(CharSequence charSequence) {
            l.n(charSequence);
            return 0;
        }

        @Override // r9.c
        public boolean d(char c10) {
            return false;
        }
    }

    static final class e extends AbstractC0353c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f25627b = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f25628c = new e();

        e() {
            super("CharMatcher.whitespace()");
        }

        @Override // r9.c
        public boolean d(char c10) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f25627b) == c10;
        }
    }

    protected c() {
    }

    public static c c(char c10) {
        return new b(c10);
    }

    public static c e() {
        return d.f25626b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static c g() {
        return e.f25628c;
    }

    public int b(CharSequence charSequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (d(charSequence.charAt(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public abstract boolean d(char c10);
}
