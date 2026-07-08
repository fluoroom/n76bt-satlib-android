package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f17530a;

    public e(char c10) {
        this.f17530a = c10;
    }

    @Override // j$.time.format.g
    public final boolean i(q qVar, StringBuilder sb2) {
        sb2.append(this.f17530a);
        return true;
    }

    public final String toString() {
        char c10 = this.f17530a;
        if (c10 == '\'') {
            return "''";
        }
        return "'" + c10 + "'";
    }
}
