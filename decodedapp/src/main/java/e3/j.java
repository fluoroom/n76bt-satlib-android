package e3;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class f11429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class f11430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class f11431c;

    public j() {
    }

    public void a(Class cls, Class cls2, Class cls3) {
        this.f11429a = cls;
        this.f11430b = cls2;
        this.f11431c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f11429a.equals(jVar.f11429a) && this.f11430b.equals(jVar.f11430b) && l.d(this.f11431c, jVar.f11431c);
    }

    public int hashCode() {
        int iHashCode = ((this.f11429a.hashCode() * 31) + this.f11430b.hashCode()) * 31;
        Class cls = this.f11431c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f11429a + ", second=" + this.f11430b + '}';
    }

    public j(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}
