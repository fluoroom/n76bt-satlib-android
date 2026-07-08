package r9;

/* JADX INFO: loaded from: classes3.dex */
final class a extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a f25623a = new a();

    private a() {
    }

    static i d() {
        return f25623a;
    }

    @Override // r9.i
    public boolean b() {
        return false;
    }

    @Override // r9.i
    public Object c(Object obj) {
        return l.o(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
