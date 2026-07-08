package k0;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final d f18882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f18883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f18884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final a f18885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final a f18886h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f18889c;

    /* JADX INFO: renamed from: k0.a$a, reason: collision with other inner class name */
    public static final class C0246a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f18892c;

        public C0246a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            return z10 ? a.f18886h : a.f18885g;
        }

        private void c(boolean z10) {
            this.f18890a = z10;
            this.f18892c = a.f18882d;
            this.f18891b = 2;
        }

        public a a() {
            return (this.f18891b == 2 && this.f18892c == a.f18882d) ? b(this.f18890a) : new a(this.f18890a, this.f18891b, this.f18892c);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f18893f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f18894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f18895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f18896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f18897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private char f18898e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f18893f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f18894a = charSequence;
            this.f18895b = z10;
            this.f18896c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f18893f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char cCharAt;
            int i10 = this.f18897d;
            do {
                int i11 = this.f18897d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f18894a;
                int i12 = i11 - 1;
                this.f18897d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f18898e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f18897d = i10;
            this.f18898e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i10 = this.f18897d;
                if (i10 >= this.f18896c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f18894a;
                this.f18897d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f18898e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i10 = this.f18897d;
            while (true) {
                int i11 = this.f18897d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f18894a;
                int i12 = i11 - 1;
                this.f18897d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f18898e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f18897d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f18894a;
                            int i14 = i13 - 1;
                            this.f18897d = i14;
                            cCharAt = charSequence2.charAt(i14);
                            this.f18898e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f18897d = i10;
            this.f18898e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i10 = this.f18897d;
            while (true) {
                int i11 = this.f18897d;
                if (i11 >= this.f18896c) {
                    this.f18897d = i10;
                    this.f18898e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f18894a;
                this.f18897d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f18898e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f18897d;
                        if (i12 < this.f18896c) {
                            CharSequence charSequence2 = this.f18894a;
                            this.f18897d = i12 + 1;
                            cCharAt = charSequence2.charAt(i12);
                            this.f18898e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f18894a.charAt(this.f18897d - 1);
            this.f18898e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f18894a, this.f18897d);
                this.f18897d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f18897d--;
            byte bC = c(this.f18898e);
            if (!this.f18895b) {
                return bC;
            }
            char c10 = this.f18898e;
            return c10 == '>' ? h() : c10 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f18894a.charAt(this.f18897d);
            this.f18898e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f18894a, this.f18897d);
                this.f18897d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f18897d++;
            byte bC = c(this.f18898e);
            if (!this.f18895b) {
                return bC;
            }
            char c10 = this.f18898e;
            return c10 == '<' ? i() : c10 == '&' ? g() : bC;
        }

        int d() {
            this.f18897d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f18897d < this.f18896c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f18897d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f18897d = this.f18896c;
            int i10 = 0;
            int i11 = 0;
            while (this.f18897d > 0) {
                byte bA = a();
                if (bA == 0) {
                    if (i10 == 0) {
                        return -1;
                    }
                    if (i11 == 0) {
                        i11 = i10;
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i10 == 0) {
                        return 1;
                    }
                    if (i11 == 0) {
                        i11 = i10;
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i11 == i10) {
                                return -1;
                            }
                            i10--;
                            break;
                        case 16:
                        case 17:
                            if (i11 == i10) {
                                return 1;
                            }
                            i10--;
                            break;
                        case 18:
                            i10++;
                            break;
                        default:
                            if (i11 == 0) {
                                i11 = i10;
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    static {
        d dVar = e.f18910c;
        f18882d = dVar;
        f18883e = Character.toString((char) 8206);
        f18884f = Character.toString((char) 8207);
        f18885g = new a(false, 2, dVar);
        f18886h = new a(true, 2, dVar);
    }

    a(boolean z10, int i10, d dVar) {
        this.f18887a = z10;
        this.f18888b = i10;
        this.f18889c = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0246a().a();
    }

    static boolean e(Locale locale) {
        return f.a(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean zIsRtl = dVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f18887a || !(zIsRtl || b(charSequence) == 1)) ? this.f18887a ? (!zIsRtl || b(charSequence) == -1) ? f18884f : "" : "" : f18883e;
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean zIsRtl = dVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f18887a || !(zIsRtl || a(charSequence) == 1)) ? this.f18887a ? (!zIsRtl || a(charSequence) == -1) ? f18884f : "" : "" : f18883e;
    }

    public boolean d() {
        return (this.f18888b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f18889c, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = dVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zIsRtl ? e.f18909b : e.f18908a));
        }
        if (zIsRtl != this.f18887a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zIsRtl ? e.f18909b : e.f18908a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f18889c, true);
    }

    public String k(String str, d dVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, dVar, z10).toString();
    }
}
