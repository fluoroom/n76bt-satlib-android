package j$.time.zone;

import j$.time.z;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f17659e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j$.time.i f17661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f17662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f17663d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f17660a, ((b) obj).f17660a);
    }

    public b(j$.time.i iVar, z zVar, z zVar2) {
        iVar.getClass();
        this.f17660a = j$.com.android.tools.r8.a.q(iVar, zVar);
        this.f17661b = iVar;
        this.f17662c = zVar;
        this.f17663d = zVar2;
    }

    public b(long j10, z zVar, z zVar2) {
        this.f17660a = j10;
        this.f17661b = j$.time.i.G(j10, 0, zVar);
        this.f17662c = zVar;
        this.f17663d = zVar2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean i() {
        return this.f17663d.f17655a > this.f17662c.f17655a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f17660a == bVar.f17660a && this.f17662c.equals(bVar.f17662c) && this.f17663d.equals(bVar.f17663d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17661b.hashCode() ^ this.f17662c.f17655a) ^ Integer.rotateLeft(this.f17663d.f17655a, 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(i() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f17661b);
        sb2.append(this.f17662c);
        sb2.append(" to ");
        sb2.append(this.f17663d);
        sb2.append(']');
        return sb2.toString();
    }
}
