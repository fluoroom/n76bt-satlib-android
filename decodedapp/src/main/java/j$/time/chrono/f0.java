package j$.time.chrono;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f17465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17466b;

    public f0() {
    }

    public f0(byte b10, Object obj) {
        this.f17465a = b10;
        this.f17466b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f17465a;
        Object obj = this.f17466b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                objectOutput.writeUTF(((a) obj).h());
                return;
            case 2:
                g gVar = (g) obj;
                objectOutput.writeObject(gVar.f17467a);
                objectOutput.writeObject(gVar.f17468b);
                return;
            case 3:
                l lVar = (l) obj;
                objectOutput.writeObject(lVar.f17481a);
                objectOutput.writeObject(lVar.f17482b);
                objectOutput.writeObject(lVar.f17483c);
                return;
            case 4:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(j$.time.temporal.r.a(yVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(yVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(yVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((z) obj).f17512a);
                return;
            case 6:
                r rVar = (r) obj;
                objectOutput.writeObject(rVar.f17496a);
                objectOutput.writeInt(j$.time.temporal.r.a(rVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(rVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(rVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                d0 d0Var = (d0) obj;
                d0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.r.a(d0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(d0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(d0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                j0 j0Var = (j0) obj;
                j0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.r.a(j0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(j0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(j0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                h hVar = (h) obj;
                objectOutput.writeUTF(hVar.f17471a.h());
                objectOutput.writeInt(hVar.f17472b);
                objectOutput.writeInt(hVar.f17473c);
                objectOutput.writeInt(hVar.f17474d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objB;
        byte b10 = objectInput.readByte();
        this.f17465a = b10;
        switch (b10) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.f17456a;
                objB = j$.com.android.tools.r8.a.B(objectInput.readUTF());
                break;
            case 2:
                objB = ((b) objectInput.readObject()).y((j$.time.k) objectInput.readObject());
                break;
            case 3:
                objB = ((e) objectInput.readObject()).m((j$.time.z) objectInput.readObject()).r((j$.time.y) objectInput.readObject());
                break;
            case 4:
                j$.time.g gVar = y.f17506d;
                int i10 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                w.f17504c.getClass();
                objB = new y(j$.time.g.K(i10, b11, b12));
                break;
            case 5:
                z zVar = z.f17510d;
                objB = z.q(objectInput.readByte());
                break;
            case 6:
                p pVar = (p) objectInput.readObject();
                int i11 = objectInput.readInt();
                byte b13 = objectInput.readByte();
                byte b14 = objectInput.readByte();
                pVar.getClass();
                objB = new r(pVar, i11, b13, b14);
                break;
            case 7:
                int i12 = objectInput.readInt();
                byte b15 = objectInput.readByte();
                byte b16 = objectInput.readByte();
                b0.f17459c.getClass();
                objB = new d0(j$.time.g.K(i12 + 1911, b15, b16));
                break;
            case 8:
                int i13 = objectInput.readInt();
                byte b17 = objectInput.readByte();
                byte b18 = objectInput.readByte();
                h0.f17475c.getClass();
                objB = new j0(j$.time.g.K(i13 - 543, b17, b18));
                break;
            case 9:
                int i14 = h.f17470e;
                objB = new h(j$.com.android.tools.r8.a.B(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f17466b = objB;
    }

    private Object readResolve() {
        return this.f17466b;
    }
}
