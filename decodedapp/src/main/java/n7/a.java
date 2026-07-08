package n7;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public final class a extends w7.a {
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f22559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f22560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f22562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f22564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f22565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f22566h;

    /* JADX INFO: renamed from: n7.a$a, reason: collision with other inner class name */
    public static final class C0296a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f22567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f22568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f22569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f22570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f22571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f22572f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f22573g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f22574h;

        public C0296a() {
            e.C0300a c0300aB = e.b();
            c0300aB.b(false);
            this.f22567a = c0300aB.a();
            b.C0297a c0297aB = b.b();
            c0297aB.d(false);
            this.f22568b = c0297aB.a();
            d.C0299a c0299aB = d.b();
            c0299aB.b(false);
            this.f22569c = c0299aB.a();
            c.C0298a c0298aB = c.b();
            c0298aB.b(false);
            this.f22570d = c0298aB.a();
        }

        public a a() {
            return new a(this.f22567a, this.f22568b, this.f22571e, this.f22572f, this.f22573g, this.f22569c, this.f22570d, this.f22574h);
        }

        public C0296a b(boolean z10) {
            this.f22572f = z10;
            return this;
        }

        public C0296a c(b bVar) {
            this.f22568b = (b) q.i(bVar);
            return this;
        }

        public C0296a d(c cVar) {
            this.f22570d = (c) q.i(cVar);
            return this;
        }

        public C0296a e(d dVar) {
            this.f22569c = (d) q.i(dVar);
            return this;
        }

        public C0296a f(e eVar) {
            this.f22567a = (e) q.i(eVar);
            return this;
        }

        public C0296a g(boolean z10) {
            this.f22574h = z10;
            return this;
        }

        public final C0296a h(String str) {
            this.f22571e = str;
            return this;
        }

        public final C0296a i(int i10) {
            this.f22573g = i10;
            return this;
        }
    }

    public static final class b extends w7.a {
        public static final Parcelable.Creator<b> CREATOR = new j();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f22575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f22576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f22577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f22578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f22579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f22580f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f22581g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List f22582h;

        /* JADX INFO: renamed from: n7.a$b$a, reason: collision with other inner class name */
        public static final class C0297a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f22583a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f22584b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f22585c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f22586d = true;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f22587e = null;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private List f22588f = null;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private boolean f22589g = false;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List f22590h = null;

            public b a() {
                return new b(this.f22583a, this.f22584b, this.f22585c, this.f22586d, this.f22587e, this.f22588f, this.f22589g, this.f22590h);
            }

            public C0297a b(boolean z10) {
                this.f22586d = z10;
                return this;
            }

            public C0297a c(String str) {
                this.f22584b = q.f(str);
                return this;
            }

            public C0297a d(boolean z10) {
                this.f22583a = z10;
                return this;
            }
        }

        b(boolean z10, String str, String str2, boolean z11, String str3, List list, boolean z12, List list2) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            q.b(z13, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f22575a = z10;
            if (z10) {
                q.j(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f22576b = str;
            this.f22577c = str2;
            this.f22578d = z11;
            Parcelable.Creator<a> creator = a.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f22580f = arrayList;
            this.f22579e = str3;
            this.f22581g = z12;
            this.f22582h = list2;
        }

        public static C0297a b() {
            return new C0297a();
        }

        public boolean c() {
            return this.f22578d;
        }

        public List e() {
            return this.f22582h;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f22575a == bVar.f22575a && v7.o.a(this.f22576b, bVar.f22576b) && v7.o.a(this.f22577c, bVar.f22577c) && this.f22578d == bVar.f22578d && v7.o.a(this.f22579e, bVar.f22579e) && v7.o.a(this.f22580f, bVar.f22580f) && this.f22581g == bVar.f22581g && v7.o.a(this.f22582h, bVar.f22582h);
        }

        public List f() {
            return this.f22580f;
        }

        public String g() {
            return this.f22579e;
        }

        public String h() {
            return this.f22577c;
        }

        public int hashCode() {
            return v7.o.b(Boolean.valueOf(this.f22575a), this.f22576b, this.f22577c, Boolean.valueOf(this.f22578d), this.f22579e, this.f22580f, Boolean.valueOf(this.f22581g), this.f22582h);
        }

        public String i() {
            return this.f22576b;
        }

        public boolean j() {
            return this.f22575a;
        }

        public boolean k() {
            return this.f22581g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int iA = w7.c.a(parcel);
            w7.c.c(parcel, 1, j());
            w7.c.r(parcel, 2, i(), false);
            w7.c.r(parcel, 3, h(), false);
            w7.c.c(parcel, 4, c());
            w7.c.r(parcel, 5, g(), false);
            w7.c.t(parcel, 6, f(), false);
            w7.c.c(parcel, 7, k());
            w7.c.v(parcel, 8, e(), false);
            w7.c.b(parcel, iA);
        }
    }

    public static final class c extends w7.a {
        public static final Parcelable.Creator<c> CREATOR = new k();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f22591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f22592b;

        /* JADX INFO: renamed from: n7.a$c$a, reason: collision with other inner class name */
        public static final class C0298a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f22593a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f22594b;

            public c a() {
                return new c(this.f22593a, this.f22594b);
            }

            public C0298a b(boolean z10) {
                this.f22593a = z10;
                return this;
            }
        }

        c(boolean z10, String str) {
            if (z10) {
                q.i(str);
            }
            this.f22591a = z10;
            this.f22592b = str;
        }

        public static C0298a b() {
            return new C0298a();
        }

        public String c() {
            return this.f22592b;
        }

        public boolean e() {
            return this.f22591a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f22591a == cVar.f22591a && v7.o.a(this.f22592b, cVar.f22592b);
        }

        public int hashCode() {
            return v7.o.b(Boolean.valueOf(this.f22591a), this.f22592b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int iA = w7.c.a(parcel);
            w7.c.c(parcel, 1, e());
            w7.c.r(parcel, 2, c(), false);
            w7.c.b(parcel, iA);
        }
    }

    public static final class d extends w7.a {
        public static final Parcelable.Creator<d> CREATOR = new l();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f22595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f22596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f22597c;

        /* JADX INFO: renamed from: n7.a$d$a, reason: collision with other inner class name */
        public static final class C0299a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f22598a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private byte[] f22599b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f22600c;

            public d a() {
                return new d(this.f22598a, this.f22599b, this.f22600c);
            }

            public C0299a b(boolean z10) {
                this.f22598a = z10;
                return this;
            }
        }

        d(boolean z10, byte[] bArr, String str) {
            if (z10) {
                q.i(bArr);
                q.i(str);
            }
            this.f22595a = z10;
            this.f22596b = bArr;
            this.f22597c = str;
        }

        public static C0299a b() {
            return new C0299a();
        }

        public byte[] c() {
            return this.f22596b;
        }

        public String e() {
            return this.f22597c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f22595a == dVar.f22595a && Arrays.equals(this.f22596b, dVar.f22596b) && Objects.equals(this.f22597c, dVar.f22597c);
        }

        public boolean f() {
            return this.f22595a;
        }

        public int hashCode() {
            return (Objects.hash(Boolean.valueOf(this.f22595a), this.f22597c) * 31) + Arrays.hashCode(this.f22596b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int iA = w7.c.a(parcel);
            w7.c.c(parcel, 1, f());
            w7.c.f(parcel, 2, c(), false);
            w7.c.r(parcel, 3, e(), false);
            w7.c.b(parcel, iA);
        }
    }

    public static final class e extends w7.a {
        public static final Parcelable.Creator<e> CREATOR = new m();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f22601a;

        /* JADX INFO: renamed from: n7.a$e$a, reason: collision with other inner class name */
        public static final class C0300a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f22602a = false;

            public e a() {
                return new e(this.f22602a);
            }

            public C0300a b(boolean z10) {
                this.f22602a = z10;
                return this;
            }
        }

        e(boolean z10) {
            this.f22601a = z10;
        }

        public static C0300a b() {
            return new C0300a();
        }

        public boolean c() {
            return this.f22601a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && this.f22601a == ((e) obj).f22601a;
        }

        public int hashCode() {
            return v7.o.b(Boolean.valueOf(this.f22601a));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int iA = w7.c.a(parcel);
            w7.c.c(parcel, 1, c());
            w7.c.b(parcel, iA);
        }
    }

    a(e eVar, b bVar, String str, boolean z10, int i10, d dVar, c cVar, boolean z11) {
        this.f22559a = (e) q.i(eVar);
        this.f22560b = (b) q.i(bVar);
        this.f22561c = str;
        this.f22562d = z10;
        this.f22563e = i10;
        if (dVar == null) {
            d.C0299a c0299aB = d.b();
            c0299aB.b(false);
            dVar = c0299aB.a();
        }
        this.f22564f = dVar;
        if (cVar == null) {
            c.C0298a c0298aB = c.b();
            c0298aB.b(false);
            cVar = c0298aB.a();
        }
        this.f22565g = cVar;
        this.f22566h = z11;
    }

    public static C0296a b() {
        return new C0296a();
    }

    public static C0296a j(a aVar) {
        q.i(aVar);
        C0296a c0296aB = b();
        c0296aB.c(aVar.c());
        c0296aB.f(aVar.g());
        c0296aB.e(aVar.f());
        c0296aB.d(aVar.e());
        c0296aB.b(aVar.f22562d);
        c0296aB.i(aVar.f22563e);
        c0296aB.g(aVar.f22566h);
        String str = aVar.f22561c;
        if (str != null) {
            c0296aB.h(str);
        }
        return c0296aB;
    }

    public b c() {
        return this.f22560b;
    }

    public c e() {
        return this.f22565g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return v7.o.a(this.f22559a, aVar.f22559a) && v7.o.a(this.f22560b, aVar.f22560b) && v7.o.a(this.f22564f, aVar.f22564f) && v7.o.a(this.f22565g, aVar.f22565g) && v7.o.a(this.f22561c, aVar.f22561c) && this.f22562d == aVar.f22562d && this.f22563e == aVar.f22563e && this.f22566h == aVar.f22566h;
    }

    public d f() {
        return this.f22564f;
    }

    public e g() {
        return this.f22559a;
    }

    public boolean h() {
        return this.f22566h;
    }

    public int hashCode() {
        return v7.o.b(this.f22559a, this.f22560b, this.f22564f, this.f22565g, this.f22561c, Boolean.valueOf(this.f22562d), Integer.valueOf(this.f22563e), Boolean.valueOf(this.f22566h));
    }

    public boolean i() {
        return this.f22562d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.p(parcel, 1, g(), i10, false);
        w7.c.p(parcel, 2, c(), i10, false);
        w7.c.r(parcel, 3, this.f22561c, false);
        w7.c.c(parcel, 4, i());
        w7.c.k(parcel, 5, this.f22563e);
        w7.c.p(parcel, 6, f(), i10, false);
        w7.c.p(parcel, 7, e(), i10, false);
        w7.c.c(parcel, 8, h());
        w7.c.b(parcel, iA);
    }
}
