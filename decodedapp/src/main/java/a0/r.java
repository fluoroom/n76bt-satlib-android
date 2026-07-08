package a0;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CharSequence f118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IconCompat f119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f123f;

    static class a {
        static Person a(r rVar) {
            return new Person.Builder().setName(rVar.c()).setIcon(rVar.a() != null ? rVar.a().l() : null).setUri(rVar.d()).setKey(rVar.b()).setBot(rVar.e()).setImportant(rVar.f()).build();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        CharSequence f124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        IconCompat f125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f129f;

        public r a() {
            return new r(this);
        }

        public b b(CharSequence charSequence) {
            this.f124a = charSequence;
            return this;
        }
    }

    r(b bVar) {
        this.f118a = bVar.f124a;
        this.f119b = bVar.f125b;
        this.f120c = bVar.f126c;
        this.f121d = bVar.f127d;
        this.f122e = bVar.f128e;
        this.f123f = bVar.f129f;
    }

    public IconCompat a() {
        return this.f119b;
    }

    public String b() {
        return this.f121d;
    }

    public CharSequence c() {
        return this.f118a;
    }

    public String d() {
        return this.f120c;
    }

    public boolean e() {
        return this.f122e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        String strB = b();
        String strB2 = rVar.b();
        return (strB == null && strB2 == null) ? Objects.equals(Objects.toString(c()), Objects.toString(rVar.c())) && Objects.equals(d(), rVar.d()) && Boolean.valueOf(e()).equals(Boolean.valueOf(rVar.e())) && Boolean.valueOf(f()).equals(Boolean.valueOf(rVar.f())) : Objects.equals(strB, strB2);
    }

    public boolean f() {
        return this.f123f;
    }

    public String g() {
        String str = this.f120c;
        if (str != null) {
            return str;
        }
        if (this.f118a == null) {
            return "";
        }
        return "name:" + ((Object) this.f118a);
    }

    public Person h() {
        return a.a(this);
    }

    public int hashCode() {
        String strB = b();
        return strB != null ? strB.hashCode() : Objects.hash(c(), d(), Boolean.valueOf(e()), Boolean.valueOf(f()));
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f118a);
        IconCompat iconCompat = this.f119b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.k() : null);
        bundle.putString("uri", this.f120c);
        bundle.putString("key", this.f121d);
        bundle.putBoolean("isBot", this.f122e);
        bundle.putBoolean("isImportant", this.f123f);
        return bundle;
    }
}
