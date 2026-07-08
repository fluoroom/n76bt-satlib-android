package p6;

import d6.j0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class x implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f24067h = new x(Boolean.TRUE, null, null, null, null, null, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final x f24068r = new x(Boolean.FALSE, null, null, null, null, null, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final x f24069s = new x(null, null, null, null, null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Boolean f24070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f24071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Integer f24072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String f24073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final transient a f24074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected j0 f24075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected j0 f24076g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x6.k f24077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f24078b;

        protected a(x6.k kVar, boolean z10) {
            this.f24077a = kVar;
            this.f24078b = z10;
        }

        public static a a(x6.k kVar) {
            return new a(kVar, true);
        }

        public static a b(x6.k kVar) {
            return new a(kVar, false);
        }

        public static a c(x6.k kVar) {
            return new a(kVar, false);
        }
    }

    protected x(Boolean bool, String str, Integer num, String str2, a aVar, j0 j0Var, j0 j0Var2) {
        this.f24070a = bool;
        this.f24071b = str;
        this.f24072c = num;
        this.f24073d = (str2 == null || str2.isEmpty()) ? null : str2;
        this.f24074e = aVar;
        this.f24075f = j0Var;
        this.f24076g = j0Var2;
    }

    public static x a(Boolean bool, String str, Integer num, String str2) {
        return (str == null && num == null && str2 == null) ? bool == null ? f24069s : bool.booleanValue() ? f24067h : f24068r : new x(bool, str, num, str2, null, null, null);
    }

    public j0 b() {
        return this.f24076g;
    }

    public Integer c() {
        return this.f24072c;
    }

    public a d() {
        return this.f24074e;
    }

    public j0 e() {
        return this.f24075f;
    }

    public boolean f() {
        return this.f24072c != null;
    }

    public boolean g() {
        Boolean bool = this.f24070a;
        return bool != null && bool.booleanValue();
    }

    public x h(String str) {
        return new x(this.f24070a, str, this.f24072c, this.f24073d, this.f24074e, this.f24075f, this.f24076g);
    }

    public x i(a aVar) {
        return new x(this.f24070a, this.f24071b, this.f24072c, this.f24073d, aVar, this.f24075f, this.f24076g);
    }

    public x j(j0 j0Var, j0 j0Var2) {
        return new x(this.f24070a, this.f24071b, this.f24072c, this.f24073d, this.f24074e, j0Var, j0Var2);
    }
}
