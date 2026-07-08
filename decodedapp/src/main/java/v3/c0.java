package v3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f29549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f29550c;

    public c0(int i10, String[] strArr, int[] iArr) {
        rd.m.e(strArr, "permissions");
        rd.m.e(iArr, "grantResults");
        this.f29548a = i10;
        this.f29549b = strArr;
        this.f29550c = iArr;
    }

    public final int[] a() {
        return this.f29550c;
    }

    public final int b() {
        return this.f29548a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f29548a == c0Var.f29548a && rd.m.a(this.f29549b, c0Var.f29549b) && rd.m.a(this.f29550c, c0Var.f29550c);
    }

    public int hashCode() {
        return (((this.f29548a * 31) + Arrays.hashCode(this.f29549b)) * 31) + Arrays.hashCode(this.f29550c);
    }

    public String toString() {
        return "PermissionsResult(requestCode=" + this.f29548a + ", permissions=" + Arrays.toString(this.f29549b) + ", grantResults=" + Arrays.toString(this.f29550c) + ")";
    }
}
