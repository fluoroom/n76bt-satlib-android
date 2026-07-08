package j$.time.zone;

import j$.time.k;
import j$.time.m;
import j$.time.z;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f17666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f17667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.time.d f17668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f17669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f17671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z f17672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f17673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z f17674i;

    public e(m mVar, int i10, j$.time.d dVar, k kVar, boolean z10, d dVar2, z zVar, z zVar2, z zVar3) {
        this.f17666a = mVar;
        this.f17667b = (byte) i10;
        this.f17668c = dVar;
        this.f17669d = kVar;
        this.f17670e = z10;
        this.f17671f = dVar2;
        this.f17672g = zVar;
        this.f17673h = zVar2;
        this.f17674i = zVar3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int iO = this.f17670e ? 86400 : this.f17669d.O();
        int i10 = this.f17672g.f17655a;
        int i11 = this.f17673h.f17655a - i10;
        int i12 = this.f17674i.f17655a - i10;
        byte b10 = iO % 3600 == 0 ? this.f17670e ? (byte) 24 : this.f17669d.f17586a : (byte) 31;
        int i13 = i10 % 900 == 0 ? (i10 / 900) + 128 : 255;
        int i14 = (i11 == 0 || i11 == 1800 || i11 == 3600) ? i11 / 1800 : 3;
        int i15 = (i12 == 0 || i12 == 1800 || i12 == 3600) ? i12 / 1800 : 3;
        j$.time.d dVar = this.f17668c;
        dataOutput.writeInt((this.f17666a.getValue() << 28) + ((this.f17667b + 32) << 22) + ((dVar == null ? 0 : dVar.getValue()) << 19) + (b10 << 14) + (this.f17671f.ordinal() << 12) + (i13 << 4) + (i14 << 2) + i15);
        if (b10 == 31) {
            dataOutput.writeInt(iO);
        }
        if (i13 == 255) {
            dataOutput.writeInt(i10);
        }
        if (i14 == 3) {
            dataOutput.writeInt(this.f17673h.f17655a);
        }
        if (i15 == 3) {
            dataOutput.writeInt(this.f17674i.f17655a);
        }
    }

    public static e a(DataInput dataInput) {
        d dVar;
        k kVarD;
        int i10;
        int i11;
        int i12 = dataInput.readInt();
        m mVarF = m.F(i12 >>> 28);
        int i13 = ((264241152 & i12) >>> 22) - 32;
        int i14 = (3670016 & i12) >>> 19;
        j$.time.d dVarC = i14 == 0 ? null : j$.time.d.C(i14);
        int i15 = (507904 & i12) >>> 14;
        d dVar2 = d.values()[(i12 & 12288) >>> 12];
        int i16 = (i12 & 4080) >>> 4;
        int i17 = (i12 & 12) >>> 2;
        int i18 = i12 & 3;
        if (i15 == 31) {
            long j10 = dataInput.readInt();
            k kVar = k.f17582e;
            j$.time.temporal.a.SECOND_OF_DAY.s(j10);
            int i19 = (int) (j10 / 3600);
            dVar = dVar2;
            long j11 = j10 - ((long) (i19 * 3600));
            int i20 = (int) (j11 / 60);
            kVarD = k.D(i19, i20, (int) (j11 - ((long) (i20 * 60))), 0);
        } else {
            dVar = dVar2;
            int i21 = i15 % 24;
            k kVar2 = k.f17582e;
            j$.time.temporal.a.HOUR_OF_DAY.s(i21);
            kVarD = k.f17585h[i21];
        }
        z zVarI = z.I(i16 == 255 ? dataInput.readInt() : (i16 - 128) * 900);
        if (i17 == 3) {
            i10 = dataInput.readInt();
        } else {
            i10 = (i17 * 1800) + zVarI.f17655a;
        }
        z zVarI2 = z.I(i10);
        if (i18 == 3) {
            i11 = dataInput.readInt();
        } else {
            i11 = (i18 * 1800) + zVarI.f17655a;
        }
        z zVarI3 = z.I(i11);
        boolean z10 = i15 == 24;
        Objects.requireNonNull(mVarF, "month");
        Objects.requireNonNull(kVarD, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(zVarI, "standardOffset");
        Objects.requireNonNull(zVarI2, "offsetBefore");
        Objects.requireNonNull(zVarI3, "offsetAfter");
        if (i13 < -28 || i13 > 31 || i13 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z10 && !kVarD.equals(k.f17584g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (kVarD.f17589d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(mVarF, i13, dVarC, kVarD, z10, dVar, zVarI, zVarI2, zVarI3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f17666a == eVar.f17666a && this.f17667b == eVar.f17667b && this.f17668c == eVar.f17668c && this.f17671f == eVar.f17671f && this.f17669d.equals(eVar.f17669d) && this.f17670e == eVar.f17670e && this.f17672g.equals(eVar.f17672g) && this.f17673h.equals(eVar.f17673h) && this.f17674i.equals(eVar.f17674i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iO = ((this.f17669d.O() + (this.f17670e ? 1 : 0)) << 15) + (this.f17666a.ordinal() << 11) + ((this.f17667b + 32) << 5);
        j$.time.d dVar = this.f17668c;
        return ((this.f17672g.f17655a ^ (this.f17671f.ordinal() + (iO + ((dVar == null ? 7 : dVar.ordinal()) << 2)))) ^ this.f17673h.f17655a) ^ this.f17674i.f17655a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        sb2.append(this.f17674i.f17655a - this.f17673h.f17655a > 0 ? "Gap " : "Overlap ");
        sb2.append(this.f17673h);
        sb2.append(" to ");
        sb2.append(this.f17674i);
        sb2.append(", ");
        j$.time.d dVar = this.f17668c;
        if (dVar != null) {
            byte b10 = this.f17667b;
            if (b10 == -1) {
                sb2.append(dVar.name());
                sb2.append(" on or before last day of ");
                sb2.append(this.f17666a.name());
            } else if (b10 < 0) {
                sb2.append(dVar.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-this.f17667b) - 1);
                sb2.append(" of ");
                sb2.append(this.f17666a.name());
            } else {
                sb2.append(dVar.name());
                sb2.append(" on or after ");
                sb2.append(this.f17666a.name());
                sb2.append(' ');
                sb2.append((int) this.f17667b);
            }
        } else {
            sb2.append(this.f17666a.name());
            sb2.append(' ');
            sb2.append((int) this.f17667b);
        }
        sb2.append(" at ");
        sb2.append(this.f17670e ? "24:00" : this.f17669d.toString());
        sb2.append(" ");
        sb2.append(this.f17671f);
        sb2.append(", standard offset ");
        sb2.append(this.f17672g);
        sb2.append(']');
        return sb2.toString();
    }
}
