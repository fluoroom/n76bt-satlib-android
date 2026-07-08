package l6;

import e6.j;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f20427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f20428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f20429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected HashSet f20430d;

    private a(Object obj) {
        this.f20427a = obj;
    }

    public static a e(e6.g gVar) {
        return new a(gVar);
    }

    public static a f(j jVar) {
        return new a(jVar);
    }

    public a a() {
        return new a(this.f20427a);
    }

    public Object b() {
        return this.f20427a;
    }

    public boolean c(String str) {
        String str2 = this.f20428b;
        if (str2 == null) {
            this.f20428b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = this.f20429c;
        if (str3 == null) {
            this.f20429c = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (this.f20430d == null) {
            HashSet hashSet = new HashSet(16);
            this.f20430d = hashSet;
            hashSet.add(this.f20428b);
            this.f20430d.add(this.f20429c);
        }
        return !this.f20430d.add(str);
    }

    public void d() {
        this.f20428b = null;
        this.f20429c = null;
        this.f20430d = null;
    }
}
