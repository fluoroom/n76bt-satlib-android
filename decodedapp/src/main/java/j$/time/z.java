package j$.time;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends y implements j$.time.temporal.n, j$.time.temporal.o, Comparable {

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f17650c = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f17651d = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: e */
    public static final z f17652e = I(0);

    /* JADX INFO: renamed from: f */
    public static final z f17653f = I(-64800);

    /* JADX INFO: renamed from: g */
    public static final z f17654g = I(64800);
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: a */
    public final int f17655a;

    /* JADX INFO: renamed from: b */
    public final transient String f17656b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((z) obj).f17655a - this.f17655a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.z G(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            j$.util.Objects.requireNonNull(r7, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = j$.time.z.f17651d
            java.lang.Object r0 = r0.get(r7)
            j$.time.z r0 = (j$.time.z) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = J(r7, r2, r3)
            int r1 = J(r7, r6, r2)
            int r2 = J(r7, r5, r2)
            goto L85
        L37:
            j$.time.b r0 = new j$.time.b
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = J(r7, r2, r3)
            int r1 = J(r7, r1, r3)
            int r2 = J(r7, r4, r3)
            goto L85
        L50:
            int r0 = J(r7, r2, r3)
            int r1 = J(r7, r6, r2)
        L58:
            r2 = 0
            goto L85
        L5a:
            int r0 = J(r7, r2, r3)
            int r1 = J(r7, r1, r3)
            goto L58
        L63:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L7f:
            int r0 = J(r7, r2, r3)
            r1 = 0
            goto L58
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            j$.time.b r0 = new j$.time.b
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.z r7 = H(r7, r0, r1)
            return r7
        La8:
            j$.time.z r7 = H(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.z.G(java.lang.String):j$.time.z");
    }

    @Override // j$.time.y
    public final j$.time.zone.f C() {
        Objects.requireNonNull(this, "offset");
        return new j$.time.zone.f(this);
    }

    public static int J(CharSequence charSequence, int i10, boolean z10) {
        if (z10) {
            String str = (String) charSequence;
            if (str.charAt(i10 - 1) != ':') {
                throw new b("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i10);
        char cCharAt2 = str2.charAt(i10 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new b("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    public static z H(int i10, int i11, int i12) {
        if (i10 < -18 || i10 > 18) {
            throw new b("Zone offset hours not in valid range: value " + i10 + " is not in the range -18 to 18");
        }
        if (i10 > 0) {
            if (i11 < 0 || i12 < 0) {
                throw new b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i10 < 0) {
            if (i11 > 0 || i12 > 0) {
                throw new b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i11 > 0 && i12 < 0) || (i11 < 0 && i12 > 0)) {
            throw new b("Zone offset minutes and seconds must have the same sign");
        }
        if (i11 < -59 || i11 > 59) {
            throw new b("Zone offset minutes not in valid range: value " + i11 + " is not in the range -59 to 59");
        }
        if (i12 < -59 || i12 > 59) {
            throw new b("Zone offset seconds not in valid range: value " + i12 + " is not in the range -59 to 59");
        }
        if (Math.abs(i10) == 18 && (i11 | i12) != 0) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        }
        return I((i11 * 60) + (i10 * 3600) + i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static z I(int i10) {
        if (i10 < -64800 || i10 > 64800) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i10 % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i10);
            ConcurrentHashMap concurrentHashMap = f17650c;
            z zVar = (z) concurrentHashMap.get(numValueOf);
            if (zVar != null) {
                return zVar;
            }
            concurrentHashMap.putIfAbsent(numValueOf, new z(i10));
            z zVar2 = (z) concurrentHashMap.get(numValueOf);
            f17651d.putIfAbsent(zVar2.f17656b, zVar2);
            return zVar2;
        }
        return new z(i10);
    }

    public z(int i10) {
        String string;
        this.f17655a = i10;
        if (i10 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i10);
            StringBuilder sb2 = new StringBuilder();
            int i11 = iAbs / 3600;
            int i12 = (iAbs / 60) % 60;
            sb2.append(i10 < 0 ? "-" : "+");
            sb2.append(i11 < 10 ? "0" : "");
            sb2.append(i11);
            sb2.append(i12 < 10 ? ":0" : ":");
            sb2.append(i12);
            int i13 = iAbs % 60;
            if (i13 != 0) {
                sb2.append(i13 < 10 ? ":0" : ":");
                sb2.append(i13);
            }
            string = sb2.toString();
        }
        this.f17656b = string;
    }

    @Override // j$.time.y
    public final String h() {
        return this.f17656b;
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f17655a;
        }
        if (c.b(qVar)) {
            throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        return j$.time.temporal.r.d(this, qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f17655a;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        return qVar.l(this);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.b bVar) {
        return (bVar == j$.time.temporal.r.f17633d || bVar == j$.time.temporal.r.f17634e) ? this : j$.time.temporal.r.c(this, bVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(this.f17655a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.y
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.f17655a == ((z) obj).f17655a;
    }

    @Override // j$.time.y
    public final int hashCode() {
        return this.f17655a;
    }

    @Override // j$.time.y
    public final String toString() {
        return this.f17656b;
    }

    private Object writeReplace() {
        return new t((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.y
    public final void F(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        L(dataOutput);
    }

    public final void L(DataOutput dataOutput) {
        int i10 = this.f17655a;
        int i11 = i10 % 900 == 0 ? i10 / 900 : 127;
        dataOutput.writeByte(i11);
        if (i11 == 127) {
            dataOutput.writeInt(i10);
        }
    }

    public static z K(DataInput dataInput) {
        byte b10 = dataInput.readByte();
        return b10 == 127 ? I(dataInput.readInt()) : I(b10 * 900);
    }
}
