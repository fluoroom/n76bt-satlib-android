package kd;

import ed.d;
import ed.j;
import java.io.Serializable;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
final class c extends d implements a, Serializable {

    /* JADX INFO: renamed from: b */
    private final Enum[] f19623b;

    public c(Enum[] enumArr) {
        m.e(enumArr, "entries");
        this.f19623b = enumArr;
    }

    @Override // ed.b
    public int c() {
        return this.f19623b.length;
    }

    @Override // ed.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return e((Enum) obj);
        }
        return false;
    }

    public boolean e(Enum r32) {
        m.e(r32, "element");
        return ((Enum) j.J(this.f19623b, r32.ordinal())) == r32;
    }

    @Override // ed.d, java.util.List
    /* JADX INFO: renamed from: f */
    public Enum get(int i10) {
        d.f11750a.b(i10, this.f19623b.length);
        return this.f19623b[i10];
    }

    public int g(Enum r32) {
        m.e(r32, "element");
        int iOrdinal = r32.ordinal();
        if (((Enum) j.J(this.f19623b, iOrdinal)) == r32) {
            return iOrdinal;
        }
        return -1;
    }

    public int h(Enum r22) {
        m.e(r22, "element");
        return g(r22);
    }

    @Override // ed.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return g((Enum) obj);
        }
        return -1;
    }

    @Override // ed.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return h((Enum) obj);
        }
        return -1;
    }
}
