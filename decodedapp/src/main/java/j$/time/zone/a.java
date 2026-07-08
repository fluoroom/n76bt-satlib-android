package j$.time.zone;

import j$.time.z;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f17657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17658b;

    public a() {
    }

    public a(byte b10, Object obj) {
        this.f17657a = b10;
        this.f17658b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f17657a;
        Object obj = this.f17658b;
        objectOutput.writeByte(b10);
        if (b10 != 1) {
            if (b10 == 2) {
                b bVar = (b) obj;
                c(bVar.f17660a, objectOutput);
                d(bVar.f17662c, objectOutput);
                d(bVar.f17663d, objectOutput);
                return;
            }
            if (b10 == 3) {
                ((e) obj).b(objectOutput);
                return;
            } else {
                if (b10 != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((f) obj).f17685g.getID());
                return;
            }
        }
        f fVar = (f) obj;
        objectOutput.writeInt(fVar.f17679a.length);
        for (long j10 : fVar.f17679a) {
            c(j10, objectOutput);
        }
        for (z zVar : fVar.f17680b) {
            d(zVar, objectOutput);
        }
        objectOutput.writeInt(fVar.f17681c.length);
        for (long j11 : fVar.f17681c) {
            c(j11, objectOutput);
        }
        for (z zVar2 : fVar.f17683e) {
            d(zVar2, objectOutput);
        }
        objectOutput.writeByte(fVar.f17684f.length);
        for (e eVar : fVar.f17684f) {
            eVar.b(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object fVar;
        byte b10 = objectInput.readByte();
        this.f17657a = b10;
        if (b10 == 1) {
            long[] jArr = f.f17675i;
            int i10 = objectInput.readInt();
            long[] jArr2 = i10 == 0 ? jArr : new long[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                jArr2[i11] = a(objectInput);
            }
            int i12 = i10 + 1;
            z[] zVarArr = new z[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                zVarArr[i13] = b(objectInput);
            }
            int i14 = objectInput.readInt();
            if (i14 != 0) {
                jArr = new long[i14];
            }
            long[] jArr3 = jArr;
            for (int i15 = 0; i15 < i14; i15++) {
                jArr3[i15] = a(objectInput);
            }
            int i16 = i14 + 1;
            z[] zVarArr2 = new z[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                zVarArr2[i17] = b(objectInput);
            }
            int i18 = objectInput.readByte();
            e[] eVarArr = i18 == 0 ? f.f17676j : new e[i18];
            for (int i19 = 0; i19 < i18; i19++) {
                eVarArr[i19] = e.a(objectInput);
            }
            fVar = new f(jArr2, zVarArr, jArr3, zVarArr2, eVarArr);
        } else if (b10 == 2) {
            int i20 = b.f17659e;
            long jA = a(objectInput);
            z zVarB = b(objectInput);
            z zVarB2 = b(objectInput);
            if (zVarB.equals(zVarB2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            fVar = new b(jA, zVarB, zVarB2);
        } else if (b10 == 3) {
            fVar = e.a(objectInput);
        } else {
            if (b10 != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            fVar = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f17658b = fVar;
    }

    private Object readResolve() {
        return this.f17658b;
    }

    public static z b(DataInput dataInput) throws IOException {
        byte b10 = dataInput.readByte();
        return b10 == 127 ? z.I(dataInput.readInt()) : z.I(b10 * 900);
    }

    public static void c(long j10, DataOutput dataOutput) throws IOException {
        if (j10 >= -4575744000L && j10 < 10413792000L && j10 % 900 == 0) {
            int i10 = (int) ((j10 + 4575744000L) / 900);
            dataOutput.writeByte((i10 >>> 16) & 255);
            dataOutput.writeByte((i10 >>> 8) & 255);
            dataOutput.writeByte(i10 & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j10);
    }

    public static long a(DataInput dataInput) {
        int i10 = dataInput.readByte() & MessagePack.Code.EXT_TIMESTAMP;
        if (i10 == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i10 << 16) + ((dataInput.readByte() & MessagePack.Code.EXT_TIMESTAMP) << 8)) + (dataInput.readByte() & MessagePack.Code.EXT_TIMESTAMP))) * 900) - 4575744000L;
    }

    public static void d(z zVar, DataOutput dataOutput) throws IOException {
        int i10 = zVar.f17655a;
        int i11 = i10 % 900 == 0 ? i10 / 900 : 127;
        dataOutput.writeByte(i11);
        if (i11 == 127) {
            dataOutput.writeInt(i10);
        }
    }
}
