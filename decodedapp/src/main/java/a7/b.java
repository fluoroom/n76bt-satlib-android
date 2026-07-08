package a7;

import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Class f356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f358c;

    public b(Class cls) {
        this(cls, null);
    }

    public String a() {
        return this.f358c;
    }

    public Class b() {
        return this.f356a;
    }

    public boolean c() {
        return this.f358c != null;
    }

    public void d(String str) {
        if (str == null || str.isEmpty()) {
            str = null;
        }
        this.f358c = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != b.class) {
            return false;
        }
        b bVar = (b) obj;
        return this.f356a == bVar.f356a && Objects.equals(this.f358c, bVar.f358c);
    }

    public int hashCode() {
        return this.f357b;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[NamedType, class ");
        sb2.append(this.f356a.getName());
        sb2.append(", name: ");
        if (this.f358c == null) {
            str = "null";
        } else {
            str = "'" + this.f358c + "'";
        }
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }

    public b(Class cls, String str) {
        this.f356a = cls;
        this.f357b = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        d(str);
    }
}
