package ff;

import ef.x;
import ff.a;
import he.g1;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mf.f;
import ve.j0;

/* JADX INFO: loaded from: classes3.dex */
public class b implements x.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f13035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map f13036k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f13037a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13038b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13039c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f13040d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f13041e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f13042f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f13043g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a.EnumC0182a f13044h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String[] f13045i = null;

    /* JADX INFO: renamed from: ff.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC0184b implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f13046a = new ArrayList();

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i10 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i10 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i10 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i10 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ef.x.b
        public void a() {
            g((String[]) this.f13046a.toArray(new String[0]));
        }

        @Override // ef.x.b
        public x.a b(mf.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // ef.x.b
        public void c(Object obj) {
            if (obj instanceof String) {
                this.f13046a.add((String) obj);
            }
        }

        @Override // ef.x.b
        public void d(mf.b bVar, f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        @Override // ef.x.b
        public void e(sf.f fVar) {
            if (fVar == null) {
                f(2);
            }
        }

        protected abstract void g(String[] strArr);
    }

    static {
        try {
            f13035j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f13035j = false;
        }
        HashMap map = new HashMap();
        f13036k = map;
        map.put(mf.b.k(new mf.c("kotlin.jvm.internal.KotlinClass")), a.EnumC0182a.f13027e);
        map.put(mf.b.k(new mf.c("kotlin.jvm.internal.KotlinFileFacade")), a.EnumC0182a.f13028f);
        map.put(mf.b.k(new mf.c("kotlin.jvm.internal.KotlinMultifileClass")), a.EnumC0182a.f13030h);
        map.put(mf.b.k(new mf.c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.EnumC0182a.f13031r);
        map.put(mf.b.k(new mf.c("kotlin.jvm.internal.KotlinSyntheticClass")), a.EnumC0182a.f13029g);
    }

    private static /* synthetic */ void d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean o() {
        a.EnumC0182a enumC0182a = this.f13044h;
        return enumC0182a == a.EnumC0182a.f13027e || enumC0182a == a.EnumC0182a.f13028f || enumC0182a == a.EnumC0182a.f13031r;
    }

    @Override // ef.x.c
    public x.a c(mf.b bVar, g1 g1Var) {
        a.EnumC0182a enumC0182a;
        if (bVar == null) {
            d(0);
        }
        if (g1Var == null) {
            d(1);
        }
        mf.c cVarA = bVar.a();
        if (cVarA.equals(j0.f30599a)) {
            return new c();
        }
        if (cVarA.equals(j0.f30618t)) {
            return new d();
        }
        if (f13035j || this.f13044h != null || (enumC0182a = (a.EnumC0182a) f13036k.get(bVar)) == null) {
            return null;
        }
        this.f13044h = enumC0182a;
        return new e();
    }

    public ff.a m(jf.c cVar) {
        if (this.f13044h == null || this.f13037a == null) {
            return null;
        }
        jf.c cVar2 = new jf.c(this.f13037a, (this.f13039c & 8) != 0);
        if (!cVar2.h(cVar)) {
            this.f13043g = this.f13041e;
            this.f13041e = null;
        } else if (o() && this.f13041e == null) {
            return null;
        }
        String[] strArr = this.f13045i;
        return new ff.a(this.f13044h, cVar2, this.f13041e, this.f13043g, this.f13042f, this.f13038b, this.f13039c, this.f13040d, strArr != null ? lf.a.e(strArr) : null);
    }

    public ff.a n() {
        return m(jf.c.f18690i);
    }

    private class c implements x.a {

        class a extends AbstractC0184b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // ff.b.AbstractC0184b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f13041e = strArr;
            }
        }

        /* JADX INFO: renamed from: ff.b$c$b, reason: collision with other inner class name */
        class C0185b extends AbstractC0184b {
            C0185b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // ff.b.AbstractC0184b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f13042f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        private x.b i() {
            return new C0185b();
        }

        @Override // ef.x.a
        public x.b b(f fVar) {
            String strD = fVar != null ? fVar.d() : null;
            if ("d1".equals(strD)) {
                return h();
            }
            if ("d2".equals(strD)) {
                return i();
            }
            return null;
        }

        @Override // ef.x.a
        public void c(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strD = fVar.d();
            if ("k".equals(strD)) {
                if (obj instanceof Integer) {
                    b.this.f13044h = a.EnumC0182a.e(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strD)) {
                if (obj instanceof int[]) {
                    b.this.f13037a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strD)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    b.this.f13038b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strD)) {
                if (obj instanceof Integer) {
                    b.this.f13039c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strD) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                b.this.f13040d = str2;
            }
        }

        @Override // ef.x.a
        public void d(f fVar, mf.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // ef.x.a
        public x.a e(f fVar, mf.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // ef.x.a
        public void f(f fVar, sf.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // ef.x.a
        public void a() {
        }
    }

    private class d implements x.a {

        class a extends AbstractC0184b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // ff.b.AbstractC0184b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f13045i = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        @Override // ef.x.a
        public x.b b(f fVar) {
            if ("b".equals(fVar != null ? fVar.d() : null)) {
                return h();
            }
            return null;
        }

        @Override // ef.x.a
        public void d(f fVar, mf.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // ef.x.a
        public x.a e(f fVar, mf.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // ef.x.a
        public void f(f fVar, sf.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // ef.x.a
        public void a() {
        }

        @Override // ef.x.a
        public void c(f fVar, Object obj) {
        }
    }

    private class e implements x.a {

        class a extends AbstractC0184b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // ff.b.AbstractC0184b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f13041e = strArr;
            }
        }

        /* JADX INFO: renamed from: ff.b$e$b, reason: collision with other inner class name */
        class C0186b extends AbstractC0184b {
            C0186b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // ff.b.AbstractC0184b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f13042f = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        private x.b i() {
            return new C0186b();
        }

        @Override // ef.x.a
        public x.b b(f fVar) {
            String strD = fVar != null ? fVar.d() : null;
            if ("data".equals(strD) || "filePartClassNames".equals(strD)) {
                return h();
            }
            if ("strings".equals(strD)) {
                return i();
            }
            return null;
        }

        @Override // ef.x.a
        public void c(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strD = fVar.d();
            if ("version".equals(strD)) {
                if (obj instanceof int[]) {
                    b.this.f13037a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strD)) {
                b.this.f13038b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // ef.x.a
        public void d(f fVar, mf.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // ef.x.a
        public x.a e(f fVar, mf.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // ef.x.a
        public void f(f fVar, sf.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // ef.x.a
        public void a() {
        }
    }

    @Override // ef.x.c
    public void a() {
    }
}
