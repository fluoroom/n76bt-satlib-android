package bk;

/* JADX INFO: loaded from: classes3.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f4121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4122b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f4124d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f4126f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4123c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f4125e = null;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        char a(int i10);
    }

    c(CharSequence charSequence) {
        this.f4121a = charSequence;
        this.f4122b = charSequence.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public char c(int i10) {
        char cCharAt = this.f4121a.charAt(i10);
        if (cCharAt == 178) {
            return '2';
        }
        if (cCharAt == 179) {
            return '3';
        }
        if (cCharAt == 185) {
            return '1';
        }
        if (cCharAt == 8304) {
            return '0';
        }
        switch (cCharAt) {
            case 8308:
                return '4';
            case 8309:
                return '5';
            case 8310:
                return '6';
            case 8311:
                return '7';
            case 8312:
                return '8';
            case 8313:
                return '9';
            case 8314:
                return '+';
            case 8315:
                return '-';
            default:
                return ' ';
        }
    }

    private h d(int i10, i iVar, int i11, int i12) {
        CharSequence charSequenceSubSequence = this.f4121a.subSequence(this.f4123c, i10);
        this.f4123c = i10;
        this.f4124d = this.f4125e;
        h hVar = new h(charSequenceSubSequence, iVar, i11, i12 == 1 ? null : new vi.c(i11, i12));
        this.f4125e = hVar;
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public char g(int i10) {
        return this.f4121a.charAt(i10);
    }

    public hj.a e() {
        return new hj.a(hj.f.UNKNOWN_UNIT, this.f4121a);
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x041c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bk.h f() {
        /*
            Method dump skipped, instruction units count: 1057
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.c.f():bk.h");
    }

    public void h() {
        this.f4126f = this.f4125e;
        this.f4125e = this.f4124d;
    }
}
