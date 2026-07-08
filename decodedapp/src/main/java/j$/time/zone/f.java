package j$.time.zone;

import com.facebook.stetho.websocket.CloseCodes;
import j$.time.Instant;
import j$.time.chrono.t;
import j$.time.k;
import j$.time.m;
import j$.time.temporal.o;
import j$.time.z;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: i */
    public static final long[] f17675i = new long[0];

    /* JADX INFO: renamed from: j */
    public static final e[] f17676j = new e[0];

    /* JADX INFO: renamed from: k */
    public static final j$.time.i[] f17677k = new j$.time.i[0];

    /* JADX INFO: renamed from: l */
    public static final b[] f17678l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a */
    public final long[] f17679a;

    /* JADX INFO: renamed from: b */
    public final z[] f17680b;

    /* JADX INFO: renamed from: c */
    public final long[] f17681c;

    /* JADX INFO: renamed from: d */
    public final j$.time.i[] f17682d;

    /* JADX INFO: renamed from: e */
    public final z[] f17683e;

    /* JADX INFO: renamed from: f */
    public final e[] f17684f;

    /* JADX INFO: renamed from: g */
    public final TimeZone f17685g;

    /* JADX INFO: renamed from: h */
    public final transient ConcurrentHashMap f17686h = new ConcurrentHashMap();

    public static Object a(j$.time.i iVar, b bVar) {
        j$.time.i iVar2 = bVar.f17661b;
        if (bVar.i()) {
            if (iVar.E(iVar2)) {
                return bVar.f17662c;
            }
            if (!iVar.E(bVar.f17661b.I(bVar.f17663d.f17655a - bVar.f17662c.f17655a))) {
                return bVar.f17663d;
            }
        } else {
            if (!iVar.E(iVar2)) {
                return bVar.f17663d;
            }
            if (iVar.E(bVar.f17661b.I(bVar.f17663d.f17655a - bVar.f17662c.f17655a))) {
                return bVar.f17662c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, z[] zVarArr, long[] jArr2, z[] zVarArr2, e[] eVarArr) {
        this.f17679a = jArr;
        this.f17680b = zVarArr;
        this.f17681c = jArr2;
        this.f17683e = zVarArr2;
        this.f17684f = eVarArr;
        if (jArr2.length == 0) {
            this.f17682d = f17677k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < jArr2.length) {
                int i11 = i10 + 1;
                b bVar = new b(jArr2[i10], zVarArr2[i10], zVarArr2[i11]);
                if (bVar.i()) {
                    arrayList.add(bVar.f17661b);
                    arrayList.add(bVar.f17661b.I(bVar.f17663d.f17655a - bVar.f17662c.f17655a));
                } else {
                    arrayList.add(bVar.f17661b.I(bVar.f17663d.f17655a - bVar.f17662c.f17655a));
                    arrayList.add(bVar.f17661b);
                }
                i10 = i11;
            }
            this.f17682d = (j$.time.i[]) arrayList.toArray(new j$.time.i[arrayList.size()]);
        }
        this.f17685g = null;
    }

    public f(z zVar) {
        z[] zVarArr = {zVar};
        this.f17680b = zVarArr;
        long[] jArr = f17675i;
        this.f17679a = jArr;
        this.f17681c = jArr;
        this.f17682d = f17677k;
        this.f17683e = zVarArr;
        this.f17684f = f17676j;
        this.f17685g = null;
    }

    public f(TimeZone timeZone) {
        z[] zVarArr = {g(timeZone.getRawOffset())};
        this.f17680b = zVarArr;
        long[] jArr = f17675i;
        this.f17679a = jArr;
        this.f17681c = jArr;
        this.f17682d = f17677k;
        this.f17683e = zVarArr;
        this.f17684f = f17676j;
        this.f17685g = timeZone;
    }

    public static z g(int i10) {
        return z.I(i10 / CloseCodes.NORMAL_CLOSURE);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f17685g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j10, z zVar) {
        return j$.time.g.L(j$.com.android.tools.r8.a.x(j10 + ((long) zVar.f17655a), 86400)).f17572a;
    }

    public final z d(Instant instant) {
        TimeZone timeZone = this.f17685g;
        if (timeZone != null) {
            return g(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.f17681c.length == 0) {
            return this.f17680b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f17684f.length > 0) {
            if (epochSecond > this.f17681c[r8.length - 1]) {
                b[] bVarArrB = b(c(epochSecond, this.f17683e[r8.length - 1]));
                b bVar = null;
                for (int i10 = 0; i10 < bVarArrB.length; i10++) {
                    bVar = bVarArrB[i10];
                    if (epochSecond < bVar.f17660a) {
                        return bVar.f17662c;
                    }
                }
                return bVar.f17663d;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f17681c, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f17683e[iBinarySearch + 1];
    }

    public final List f(j$.time.i iVar) {
        Object objE = e(iVar);
        if (!(objE instanceof b)) {
            return Collections.singletonList((z) objE);
        }
        b bVar = (b) objE;
        if (bVar.i()) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {bVar.f17662c, bVar.f17663d};
        ArrayList arrayList = new ArrayList(2);
        for (int i10 = 0; i10 < 2; i10++) {
            arrayList.add(Objects.requireNonNull(objArr[i10]));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0086, code lost:
    
        if (r9.f17579b.N() <= r0.f17579b.N()) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0063, code lost:
    
        if (r9.C(r0) > 0) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(j$.time.i r9) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.e(j$.time.i):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b[] b(int i10) {
        j$.time.g gVarD;
        b[] bVarArr = f17678l;
        Integer numValueOf = Integer.valueOf(i10);
        b[] bVarArr2 = (b[]) this.f17686h.get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j10 = 1;
        final int i11 = 0;
        final int i12 = 1;
        if (this.f17685g != null) {
            if (i10 < 1800) {
                return bVarArr;
            }
            j$.time.i iVar = j$.time.i.f17576c;
            j$.time.g gVarK = j$.time.g.K(i10 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.s(0);
            long jQ = j$.com.android.tools.r8.a.q(new j$.time.i(gVarK, k.f17585h[0]), this.f17680b[0]);
            long j11 = 1000;
            int offset = this.f17685g.getOffset(jQ * 1000);
            long j12 = 31968000 + jQ;
            while (jQ < j12) {
                long j13 = jQ + 7776000;
                long j14 = j11;
                if (offset != this.f17685g.getOffset(j13 * j14)) {
                    while (j13 - jQ > j10) {
                        long jX = j$.com.android.tools.r8.a.x(j13 + jQ, 2L);
                        if (this.f17685g.getOffset(jX * j14) == offset) {
                            jQ = jX;
                        } else {
                            j13 = jX;
                        }
                        j10 = 1;
                    }
                    if (this.f17685g.getOffset(jQ * j14) == offset) {
                        jQ = j13;
                    }
                    z zVarG = g(offset);
                    int offset2 = this.f17685g.getOffset(jQ * j14);
                    z zVarG2 = g(offset2);
                    if (c(jQ, zVarG2) == i10) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(jQ, zVarG, zVarG2);
                    }
                    offset = offset2;
                } else {
                    jQ = j13;
                }
                j11 = j14;
                j10 = 1;
            }
            if (1916 <= i10 && i10 < 2100) {
                this.f17686h.putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f17684f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i13 = 0;
        while (i13 < eVarArr.length) {
            e eVar = eVarArr[i13];
            byte b10 = eVar.f17667b;
            if (b10 < 0) {
                m mVar = eVar.f17666a;
                long j15 = i10;
                t.f17501c.getClass();
                int iD = mVar.D(t.j(j15)) + 1 + eVar.f17667b;
                j$.time.g gVar = j$.time.g.f17570d;
                j$.time.temporal.a.YEAR.s(j15);
                Objects.requireNonNull(mVar, "month");
                j$.time.temporal.a.DAY_OF_MONTH.s(iD);
                gVarD = j$.time.g.D(i10, mVar.getValue(), iD);
                j$.time.d dVar = eVar.f17668c;
                if (dVar != null) {
                    final int value = dVar.getValue();
                    gVarD = gVarD.j(new o() { // from class: j$.time.temporal.p
                        @Override // j$.time.temporal.o
                        public final m o(m mVar2) {
                            switch (i12) {
                                case 0:
                                    int i14 = mVar2.i(a.DAY_OF_WEEK);
                                    int i15 = value;
                                    if (i14 == i15) {
                                        return mVar2;
                                    }
                                    return mVar2.d(i14 - i15 >= 0 ? 7 - r0 : -r0, b.DAYS);
                                default:
                                    int i16 = mVar2.i(a.DAY_OF_WEEK);
                                    int i17 = value;
                                    if (i16 == i17) {
                                        return mVar2;
                                    }
                                    return mVar2.s(i17 - i16 >= 0 ? 7 - r1 : -r1, b.DAYS);
                            }
                        }
                    });
                }
            } else {
                m mVar2 = eVar.f17666a;
                j$.time.g gVar2 = j$.time.g.f17570d;
                j$.time.temporal.a.YEAR.s(i10);
                Objects.requireNonNull(mVar2, "month");
                j$.time.temporal.a.DAY_OF_MONTH.s(b10);
                gVarD = j$.time.g.D(i10, mVar2.getValue(), b10);
                j$.time.d dVar2 = eVar.f17668c;
                if (dVar2 != null) {
                    final int value2 = dVar2.getValue();
                    gVarD = gVarD.j(new o() { // from class: j$.time.temporal.p
                        @Override // j$.time.temporal.o
                        public final m o(m mVar22) {
                            switch (i11) {
                                case 0:
                                    int i14 = mVar22.i(a.DAY_OF_WEEK);
                                    int i15 = value2;
                                    if (i14 == i15) {
                                        return mVar22;
                                    }
                                    return mVar22.d(i14 - i15 >= 0 ? 7 - r0 : -r0, b.DAYS);
                                default:
                                    int i16 = mVar22.i(a.DAY_OF_WEEK);
                                    int i17 = value2;
                                    if (i16 == i17) {
                                        return mVar22;
                                    }
                                    return mVar22.s(i17 - i16 >= 0 ? 7 - r1 : -r1, b.DAYS);
                            }
                        }
                    });
                }
            }
            if (eVar.f17670e) {
                gVarD = gVarD.N(1L);
            }
            j$.time.i iVarF = j$.time.i.F(gVarD, eVar.f17669d);
            d dVar3 = eVar.f17671f;
            z zVar = eVar.f17672g;
            z zVar2 = eVar.f17673h;
            dVar3.getClass();
            int i14 = c.f17664a[dVar3.ordinal()];
            if (i14 == 1) {
                iVarF = iVarF.I(zVar2.f17655a - z.f17652e.f17655a);
            } else if (i14 == 2) {
                iVarF = iVarF.I(zVar2.f17655a - zVar.f17655a);
            }
            bVarArr3[i13] = new b(iVarF, eVar.f17673h, eVar.f17674i);
            i13++;
            i11 = 0;
        }
        if (i10 < 2100) {
            this.f17686h.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.f17685g, fVar.f17685g) && Arrays.equals(this.f17679a, fVar.f17679a) && Arrays.equals(this.f17680b, fVar.f17680b) && Arrays.equals(this.f17681c, fVar.f17681c) && Arrays.equals(this.f17683e, fVar.f17683e) && Arrays.equals(this.f17684f, fVar.f17684f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f17685g) ^ Arrays.hashCode(this.f17679a)) ^ Arrays.hashCode(this.f17680b)) ^ Arrays.hashCode(this.f17681c)) ^ Arrays.hashCode(this.f17683e)) ^ Arrays.hashCode(this.f17684f);
    }

    public final String toString() {
        TimeZone timeZone = this.f17685g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.f17680b[r0.length - 1] + "]";
    }
}
