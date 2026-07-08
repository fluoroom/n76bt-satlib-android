package x6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import q6.f;
import x6.a;

/* JADX INFO: loaded from: classes.dex */
public class y extends x6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final r6.q f31824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final d f31825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f31826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final boolean f31827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final String f31828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final String f31829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final String f31830g;

    public interface a {
    }

    public static class b extends a.AbstractC0427a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final String f31831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final String f31832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final String f31833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final String f31834d;

        public b() {
            this("set", "with", "get", "is", null);
        }

        @Override // x6.a.AbstractC0427a
        public x6.a a(r6.q qVar, d dVar, p6.c cVar) {
            p6.b bVarG = qVar.K() ? qVar.g() : null;
            f.a aVarO = bVarG != null ? bVarG.O(dVar) : null;
            return new y(qVar, dVar, aVarO == null ? this.f31832b : aVarO.f24363b, this.f31833c, this.f31834d, null);
        }

        @Override // x6.a.AbstractC0427a
        public x6.a b(r6.q qVar, d dVar) {
            return new y(qVar, dVar, this.f31831a, this.f31833c, this.f31834d, null);
        }

        @Override // x6.a.AbstractC0427a
        public x6.a c(r6.q qVar, d dVar) {
            return new c(qVar, dVar);
        }

        protected b(String str, String str2, String str3, String str4, a aVar) {
            this.f31831a = str;
            this.f31832b = str2;
            this.f31833c = str3;
            this.f31834d = str4;
        }
    }

    public static class c extends y {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected final Set f31835h;

        public c(r6.q qVar, d dVar) {
            super(qVar, dVar, null, "get", "is", null);
            String[] strArrB = y6.a.b(dVar.e());
            this.f31835h = strArrB == null ? Collections.EMPTY_SET : new HashSet(Arrays.asList(strArrB));
        }

        @Override // x6.y, x6.a
        public String c(l lVar, String str) {
            return this.f31835h.contains(str) ? str : super.c(lVar, str);
        }
    }

    protected y(r6.q qVar, d dVar, String str, String str2, String str3, a aVar) {
        this.f31824a = qVar;
        this.f31825b = dVar;
        this.f31826c = qVar.L(p6.r.USE_STD_BEAN_NAMING);
        this.f31827d = qVar.L(p6.r.ALLOW_IS_GETTERS_FOR_NON_BOOLEAN);
        this.f31830g = str;
        this.f31828e = str2;
        this.f31829f = str3;
    }

    private boolean e(JavaType javaType) {
        if (javaType.b()) {
            javaType = javaType.a();
        }
        return javaType.C(Boolean.TYPE) || javaType.C(Boolean.class) || javaType.C(AtomicBoolean.class);
    }

    @Override // x6.a
    public String a(l lVar, String str) {
        if (this.f31829f == null) {
            return null;
        }
        if ((this.f31827d || e(lVar.f())) && str.startsWith(this.f31829f)) {
            return this.f31826c ? i(str, this.f31829f.length()) : h(str, this.f31829f.length());
        }
        return null;
    }

    @Override // x6.a
    public String b(l lVar, String str) {
        String str2 = this.f31830g;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        return this.f31826c ? i(str, this.f31830g.length()) : h(str, this.f31830g.length());
    }

    @Override // x6.a
    public String c(l lVar, String str) {
        String str2 = this.f31828e;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (f(lVar)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && g(lVar)) {
            return null;
        }
        return this.f31826c ? i(str, this.f31828e.length()) : h(str, this.f31828e.length());
    }

    protected boolean f(l lVar) {
        Class clsE = lVar.e();
        if (clsE.isArray()) {
            String name = clsE.getComponentType().getName();
            if (name.contains(".cglib")) {
                return name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib") || name.startsWith("org.springframework.cglib");
            }
        }
        return false;
    }

    protected boolean g(l lVar) {
        return lVar.e().getName().startsWith("groovy.lang");
    }

    protected String h(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return null;
        }
        char cCharAt = str.charAt(i10);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i10);
        }
        StringBuilder sb2 = new StringBuilder(length - i10);
        sb2.append(lowerCase);
        while (true) {
            i10++;
            if (i10 >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i10);
            char lowerCase2 = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase2) {
                sb2.append((CharSequence) str, i10, length);
                break;
            }
            sb2.append(lowerCase2);
        }
        return sb2.toString();
    }

    protected String i(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return null;
        }
        char cCharAt = str.charAt(i10);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i10);
        }
        int i11 = i10 + 1;
        if (i11 < length && Character.isUpperCase(str.charAt(i11))) {
            return str.substring(i10);
        }
        StringBuilder sb2 = new StringBuilder(length - i10);
        sb2.append(lowerCase);
        sb2.append((CharSequence) str, i11, length);
        return sb2.toString();
    }

    @Override // x6.a
    public String d(i iVar, String str) {
        return str;
    }
}
