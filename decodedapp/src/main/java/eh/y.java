package eh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements Iterable, sd.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f12617b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f12618c = new y(new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f12619a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f12620a = new ArrayList(20);

        public final a a(String str, String str2) {
            rd.m.e(str, "name");
            rd.m.e(str2, "value");
            return fh.j.b(this, str, str2);
        }

        public final a b(y yVar) {
            rd.m.e(yVar, "headers");
            return fh.j.c(this, yVar);
        }

        public final a c(String str) {
            rd.m.e(str, "line");
            int iB0 = rg.q.b0(str, ':', 1, false, 4, null);
            if (iB0 != -1) {
                String strSubstring = str.substring(0, iB0);
                rd.m.d(strSubstring, "substring(...)");
                String strSubstring2 = str.substring(iB0 + 1);
                rd.m.d(strSubstring2, "substring(...)");
                d(strSubstring, strSubstring2);
                return this;
            }
            if (str.charAt(0) != ':') {
                d("", str);
                return this;
            }
            String strSubstring3 = str.substring(1);
            rd.m.d(strSubstring3, "substring(...)");
            d("", strSubstring3);
            return this;
        }

        public final a d(String str, String str2) {
            rd.m.e(str, "name");
            rd.m.e(str2, "value");
            return fh.j.d(this, str, str2);
        }

        public final a e(String str, String str2) {
            rd.m.e(str, "name");
            rd.m.e(str2, "value");
            fh.j.s(str);
            d(str, str2);
            return this;
        }

        public final y f() {
            return fh.j.e(this);
        }

        public final String g(String str) {
            rd.m.e(str, "name");
            return fh.j.g(this, str);
        }

        public final List h() {
            return this.f12620a;
        }

        public final a i(String str) {
            rd.m.e(str, "name");
            return fh.j.n(this, str);
        }

        public final a j(String str, String str2) {
            rd.m.e(str, "name");
            rd.m.e(str2, "value");
            return fh.j.o(this, str, str2);
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final y a(String... strArr) {
            rd.m.e(strArr, "namesAndValues");
            return fh.j.j((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        private b() {
        }
    }

    public y(String[] strArr) {
        rd.m.e(strArr, "namesAndValues");
        this.f12619a = strArr;
    }

    public static final y f(String... strArr) {
        return f12617b.a(strArr);
    }

    public final String b(String str) {
        rd.m.e(str, "name");
        return fh.j.i(this.f12619a, str);
    }

    public final String[] c() {
        return this.f12619a;
    }

    public final String d(int i10) {
        return fh.j.l(this, i10);
    }

    public final a e() {
        return fh.j.m(this);
    }

    public boolean equals(Object obj) {
        return fh.j.f(this, obj);
    }

    public final String g(int i10) {
        return fh.j.q(this, i10);
    }

    public final List h(String str) {
        rd.m.e(str, "name");
        return fh.j.r(this, str);
    }

    public int hashCode() {
        return fh.j.h(this);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return fh.j.k(this);
    }

    public final int size() {
        return this.f12619a.length / 2;
    }

    public String toString() {
        return fh.j.p(this);
    }
}
