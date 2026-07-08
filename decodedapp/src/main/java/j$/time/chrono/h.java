package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f17470e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f17471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17474d;

    static {
        Object[] objArr = {j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i10 = 0; i10 < 3; i10++) {
            arrayList.add(Objects.requireNonNull(objArr[i10]));
        }
        Collections.unmodifiableList(arrayList);
    }

    public h(m mVar, int i10, int i11, int i12) {
        Objects.requireNonNull(mVar, "chrono");
        this.f17471a = mVar;
        this.f17472b = i10;
        this.f17473c = i11;
        this.f17474d = i12;
    }

    public final String toString() {
        if (this.f17472b == 0 && this.f17473c == 0 && this.f17474d == 0) {
            return this.f17471a.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17471a.toString());
        sb2.append(" P");
        int i10 = this.f17472b;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f17473c;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f17474d;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f17472b == hVar.f17472b && this.f17473c == hVar.f17473c && this.f17474d == hVar.f17474d && this.f17471a.equals(hVar.f17471a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f17474d, 16) + (Integer.rotateLeft(this.f17473c, 8) + this.f17472b)) ^ this.f17471a.hashCode();
    }

    public Object writeReplace() {
        return new f0((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
