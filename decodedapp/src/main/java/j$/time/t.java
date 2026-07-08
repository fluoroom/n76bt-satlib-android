package j$.time;

import j$.util.Objects;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f17608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17609b;

    public t() {
    }

    public t(byte b10, Object obj) {
        this.f17608a = b10;
        this.f17609b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f17608a;
        Object obj = this.f17609b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.f17442a);
                objectOutput.writeInt(duration.f17443b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f17445a);
                objectOutput.writeInt(instant.f17446b);
                return;
            case 3:
                g gVar = (g) obj;
                objectOutput.writeInt(gVar.f17572a);
                objectOutput.writeByte(gVar.f17573b);
                objectOutput.writeByte(gVar.f17574c);
                return;
            case 4:
                ((k) obj).R(objectOutput);
                return;
            case 5:
                i iVar = (i) obj;
                g gVar2 = iVar.f17578a;
                objectOutput.writeInt(gVar2.f17572a);
                objectOutput.writeByte(gVar2.f17573b);
                objectOutput.writeByte(gVar2.f17574c);
                iVar.f17579b.R(objectOutput);
                return;
            case 6:
                c0 c0Var = (c0) obj;
                i iVar2 = c0Var.f17453a;
                g gVar3 = iVar2.f17578a;
                objectOutput.writeInt(gVar3.f17572a);
                objectOutput.writeByte(gVar3.f17573b);
                objectOutput.writeByte(gVar3.f17574c);
                iVar2.f17579b.R(objectOutput);
                c0Var.f17454b.L(objectOutput);
                c0Var.f17455c.F(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((a0) obj).f17450a);
                return;
            case 8:
                ((z) obj).L(objectOutput);
                return;
            case 9:
                r rVar = (r) obj;
                rVar.f17602a.R(objectOutput);
                rVar.f17603b.L(objectOutput);
                return;
            case 10:
                q qVar = (q) obj;
                i iVar3 = qVar.f17599a;
                g gVar4 = iVar3.f17578a;
                objectOutput.writeInt(gVar4.f17572a);
                objectOutput.writeByte(gVar4.f17573b);
                objectOutput.writeByte(gVar4.f17574c);
                iVar3.f17579b.R(objectOutput);
                qVar.f17600b.L(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((v) obj).f17644a);
                return;
            case 12:
                x xVar = (x) obj;
                objectOutput.writeInt(xVar.f17648a);
                objectOutput.writeByte(xVar.f17649b);
                return;
            case 13:
                o oVar = (o) obj;
                objectOutput.writeByte(oVar.f17595a);
                objectOutput.writeByte(oVar.f17596b);
                return;
            case 14:
                s sVar = (s) obj;
                objectOutput.writeInt(sVar.f17605a);
                objectOutput.writeInt(sVar.f17606b);
                objectOutput.writeInt(sVar.f17607c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b10 = objectInput.readByte();
        this.f17608a = b10;
        this.f17609b = a(b10, objectInput);
    }

    public static Object a(byte b10, ObjectInput objectInput) throws IOException {
        switch (b10) {
            case 1:
                Duration duration = Duration.f17441c;
                long j10 = objectInput.readLong();
                long j11 = objectInput.readInt();
                return Duration.i(j$.com.android.tools.r8.a.t(j10, j$.com.android.tools.r8.a.x(j11, 1000000000L)), (int) j$.com.android.tools.r8.a.w(j11, 1000000000L));
            case 2:
                Instant instant = Instant.f17444c;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                g gVar = g.f17570d;
                return g.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return k.M(objectInput);
            case 5:
                i iVar = i.f17576c;
                g gVar2 = g.f17570d;
                return i.F(g.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.M(objectInput));
            case 6:
                i iVar2 = i.f17576c;
                g gVar3 = g.f17570d;
                i iVarF = i.F(g.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.M(objectInput));
                z zVarK = z.K(objectInput);
                y yVar = (y) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(iVarF, "localDateTime");
                Objects.requireNonNull(zVarK, "offset");
                Objects.requireNonNull(yVar, "zone");
                if (!(yVar instanceof z) || zVarK.equals(yVar)) {
                    return new c0(iVarF, yVar, zVarK);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i10 = a0.f17449c;
                String utf = objectInput.readUTF();
                Objects.requireNonNull(utf, "zoneId");
                return (utf.length() <= 1 || utf.startsWith("+") || utf.startsWith("-")) ? z.G(utf) : (utf.startsWith("UTC") || utf.startsWith("GMT")) ? y.E(utf, 3) : utf.startsWith("UT") ? y.E(utf, 2) : a0.G(utf);
            case 8:
                return z.K(objectInput);
            case 9:
                int i11 = r.f17601c;
                return new r(k.M(objectInput), z.K(objectInput));
            case 10:
                int i12 = q.f17598c;
                g gVar4 = g.f17570d;
                return new q(i.F(g.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.M(objectInput)), z.K(objectInput));
            case 11:
                int i13 = v.f17643b;
                return v.C(objectInput.readInt());
            case 12:
                int i14 = x.f17647c;
                int i15 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                j$.time.temporal.a.YEAR.s(i15);
                j$.time.temporal.a.MONTH_OF_YEAR.s(b11);
                return new x(i15, b11);
            case 13:
                int i16 = o.f17594c;
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                m mVarF = m.F(b12);
                Objects.requireNonNull(mVarF, "month");
                j$.time.temporal.a.DAY_OF_MONTH.s(b13);
                if (b13 <= mVarF.E()) {
                    return new o(mVarF.getValue(), b13);
                }
                throw new b("Illegal value for DayOfMonth field, value " + ((int) b13) + " is not valid for month " + mVarF.name());
            case 14:
                s sVar = s.f17604d;
                int i17 = objectInput.readInt();
                int i18 = objectInput.readInt();
                int i19 = objectInput.readInt();
                return ((i17 | i18) | i19) == 0 ? s.f17604d : new s(i17, i18, i19);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f17609b;
    }
}
