package o6;

import o6.e;

/* JADX INFO: loaded from: classes.dex */
public class d extends e.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f23226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f23227f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f23228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23230d;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = "\n";
        }
        f23226e = property;
        f23227f = new d("  ", property);
    }

    public d(String str, String str2) {
        this.f23229c = str.length();
        this.f23228b = new char[str.length() * 16];
        int length = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            str.getChars(0, str.length(), this.f23228b, length);
            length += str.length();
        }
        this.f23230d = str2;
    }

    @Override // o6.e.c, o6.e.b
    public void a(e6.g gVar, int i10) {
        gVar.S0(this.f23230d);
        if (i10 <= 0) {
            return;
        }
        int length = i10 * this.f23229c;
        while (true) {
            char[] cArr = this.f23228b;
            if (length <= cArr.length) {
                gVar.T0(cArr, 0, length);
                return;
            } else {
                gVar.T0(cArr, 0, cArr.length);
                length -= this.f23228b.length;
            }
        }
    }

    @Override // o6.e.c, o6.e.b
    public boolean isInline() {
        return false;
    }
}
