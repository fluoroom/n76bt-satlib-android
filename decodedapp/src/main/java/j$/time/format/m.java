package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17547a;

    public m(String str) {
        this.f17547a = str;
    }

    @Override // j$.time.format.g
    public final boolean i(q qVar, StringBuilder sb2) {
        sb2.append(this.f17547a);
        return true;
    }

    public final String toString() {
        return "'" + this.f17547a.replace("'", "''") + "'";
    }
}
