package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public class j implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long[] f17535f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.q f17536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f17539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17540e;

    public j(j$.time.temporal.q qVar, int i10, int i11, v vVar) {
        this.f17536a = qVar;
        this.f17537b = i10;
        this.f17538c = i11;
        this.f17539d = vVar;
        this.f17540e = 0;
    }

    public j(j$.time.temporal.q qVar, int i10, int i11, v vVar, int i12) {
        this.f17536a = qVar;
        this.f17537b = i10;
        this.f17538c = i11;
        this.f17539d = vVar;
        this.f17540e = i12;
    }

    public j a() {
        if (this.f17540e == -1) {
            return this;
        }
        return new j(this.f17536a, this.f17537b, this.f17538c, this.f17539d, -1);
    }

    public j b(int i10) {
        return new j(this.f17536a, this.f17537b, this.f17538c, this.f17539d, this.f17540e + i10);
    }

    @Override // j$.time.format.g
    public boolean i(q qVar, StringBuilder sb2) {
        j$.time.temporal.q qVar2 = this.f17536a;
        Long lA = qVar.a(qVar2);
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        t tVar = qVar.f17563b.f17524c;
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i10 = this.f17538c;
        if (length > i10) {
            throw new j$.time.b("Field " + qVar2 + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i10);
        }
        tVar.getClass();
        int i11 = this.f17537b;
        v vVar = this.f17539d;
        if (jLongValue >= 0) {
            int i12 = d.f17529a[vVar.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    sb2.append('+');
                }
            } else if (i11 < 19 && jLongValue >= f17535f[i11]) {
                sb2.append('+');
            }
        } else {
            int i13 = d.f17529a[vVar.ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3) {
                sb2.append('-');
            } else if (i13 == 4) {
                throw new j$.time.b("Field " + qVar2 + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i14 = 0; i14 < i11 - string.length(); i14++) {
            sb2.append('0');
        }
        sb2.append(string);
        return true;
    }

    public String toString() {
        int i10 = this.f17538c;
        j$.time.temporal.q qVar = this.f17536a;
        v vVar = this.f17539d;
        int i11 = this.f17537b;
        if (i11 == 1 && i10 == 19 && vVar == v.NORMAL) {
            return "Value(" + qVar + ")";
        }
        if (i11 == i10 && vVar == v.NOT_NEGATIVE) {
            return "Value(" + qVar + "," + i11 + ")";
        }
        return "Value(" + qVar + "," + i11 + "," + i10 + "," + vVar + ")";
    }
}
