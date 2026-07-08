package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends y {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f17449c = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: a */
    public final String f17450a;

    /* JADX INFO: renamed from: b */
    public final transient j$.time.zone.f f17451b;

    public static a0 G(String str) {
        j$.time.zone.f fVarA;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i10 == 0) && ((cCharAt < '0' || cCharAt > '9' || i10 == 0) && ((cCharAt != '~' || i10 == 0) && ((cCharAt != '.' || i10 == 0) && ((cCharAt != '_' || i10 == 0) && ((cCharAt != '+' || i10 == 0) && (cCharAt != '-' || i10 == 0))))))))) {
                    throw new b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVarA = j$.time.zone.i.a(str);
            } catch (j$.time.zone.g unused) {
                fVarA = null;
            }
            return new a0(str, fVarA);
        }
        throw new b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public a0(String str, j$.time.zone.f fVar) {
        this.f17450a = str;
        this.f17451b = fVar;
    }

    @Override // j$.time.y
    public final String h() {
        return this.f17450a;
    }

    @Override // j$.time.y
    public final j$.time.zone.f C() {
        j$.time.zone.f fVar = this.f17451b;
        return fVar != null ? fVar : j$.time.zone.i.a(this.f17450a);
    }

    private Object writeReplace() {
        return new t((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.y
    public final void F(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f17450a);
    }
}
