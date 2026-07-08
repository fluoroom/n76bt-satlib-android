package eg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b2 implements a2 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return b() == a2Var.b() && a() == a2Var.a() && getType().equals(a2Var.getType());
    }

    public int hashCode() {
        int iHashCode = a().hashCode();
        if (i2.w(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (b() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (b()) {
            return "*";
        }
        if (a() == m2.f12140e) {
            return getType().toString();
        }
        return a() + " " + getType();
    }
}
