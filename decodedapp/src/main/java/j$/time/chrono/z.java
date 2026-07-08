package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements n, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f17510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z[] f17511e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient int f17512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient j$.time.g f17513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient String f17514c;

    @Override // j$.time.temporal.n
    public final /* synthetic */ boolean e(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.l(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ int i(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.i(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object l(j$.time.format.b bVar) {
        return j$.com.android.tools.r8.a.p(this, bVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ long w(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.j(this, qVar);
    }

    static {
        z zVar = new z(-1, j$.time.g.K(1868, 1, 1), "Meiji");
        f17510d = zVar;
        f17511e = new z[]{zVar, new z(0, j$.time.g.K(1912, 7, 30), "Taisho"), new z(1, j$.time.g.K(1926, 12, 25), "Showa"), new z(2, j$.time.g.K(1989, 1, 8), "Heisei"), new z(3, j$.time.g.K(2019, 5, 1), "Reiwa")};
    }

    public final z n() {
        if (this == f17511e[r0.length - 1]) {
            return null;
        }
        return q(this.f17512a + 1);
    }

    public z(int i10, j$.time.g gVar, String str) {
        this.f17512a = i10;
        this.f17513b = gVar;
        this.f17514c = str;
    }

    public static z q(int i10) {
        int i11 = i10 + 1;
        if (i11 >= 0) {
            z[] zVarArr = f17511e;
            if (i11 < zVarArr.length) {
                return zVarArr[i11];
            }
        }
        throw new j$.time.b("Invalid era: " + i10);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(getValue(), j$.time.temporal.a.ERA);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.chrono.z h(j$.time.g r6) {
        /*
            j$.time.g r0 = j$.time.chrono.y.f17506d
            boolean r1 = j$.time.c.b(r0)
            r2 = 1
            if (r1 == 0) goto L13
            r6.getClass()
            int r0 = r6.C(r0)
            if (r0 >= 0) goto L21
            goto L1f
        L13:
            long r3 = r6.x()
            long r0 = r0.x()
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L21
        L1f:
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 != 0) goto L3c
            j$.time.chrono.z[] r0 = j$.time.chrono.z.f17511e
            int r0 = r0.length
            int r0 = r0 - r2
        L28:
            if (r0 < 0) goto L3a
            j$.time.chrono.z[] r1 = j$.time.chrono.z.f17511e
            r1 = r1[r0]
            j$.time.g r2 = r1.f17513b
            int r2 = r6.compareTo(r2)
            if (r2 < 0) goto L37
            return r1
        L37:
            int r0 = r0 + (-1)
            goto L28
        L3a:
            r6 = 0
            return r6
        L3c:
            j$.time.b r6 = new j$.time.b
            java.lang.String r0 = "JapaneseDate before Meiji 6 are not supported"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.z.h(j$.time.g):j$.time.chrono.z");
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return this.f17512a;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (qVar != aVar) {
            return j$.time.temporal.r.d(this, qVar);
        }
        return w.f17504c.j(aVar);
    }

    public final String toString() {
        return this.f17514c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 5, this);
    }
}
