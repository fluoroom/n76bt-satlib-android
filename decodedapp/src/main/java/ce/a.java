package ce;

import ed.k0;
import ed.q;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f4711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f4712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC0070a f4713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f4714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f4715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f4716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f4717g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ce.a$a, reason: collision with other inner class name */
    public static final class EnumC0070a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnumC0070a f4718a = new EnumC0070a("CALL_BY_NAME", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EnumC0070a f4719b = new EnumC0070a("POSITIONAL_CALL", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC0070a[] f4720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kd.a f4721d;

        static {
            EnumC0070a[] enumC0070aArrA = a();
            f4720c = enumC0070aArrA;
            f4721d = kd.b.a(enumC0070aArrA);
        }

        private EnumC0070a(String str, int i10) {
        }

        private static final /* synthetic */ EnumC0070a[] a() {
            return new EnumC0070a[]{f4718a, f4719b};
        }

        public static EnumC0070a valueOf(String str) {
            return (EnumC0070a) Enum.valueOf(EnumC0070a.class, str);
        }

        public static EnumC0070a[] values() {
            return (EnumC0070a[]) f4720c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f4722a = new b("JAVA", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f4723b = new b("KOTLIN", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f4724c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kd.a f4725d;

        static {
            b[] bVarArrA = a();
            f4724c = bVarArrA;
            f4725d = kd.b.a(bVarArrA);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f4722a, f4723b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f4724c.clone();
        }
    }

    public a(Class cls, List list, EnumC0070a enumC0070a, b bVar, List list2) {
        rd.m.e(cls, "jClass");
        rd.m.e(list, "parameterNames");
        rd.m.e(enumC0070a, "callMode");
        rd.m.e(bVar, "origin");
        rd.m.e(list2, "methods");
        this.f4711a = cls;
        this.f4712b = list;
        this.f4713c = enumC0070a;
        this.f4714d = list2;
        ArrayList arrayList = new ArrayList(q.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f4715e = arrayList;
        List list3 = this.f4714d;
        ArrayList arrayList2 = new ArrayList(q.v(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            rd.m.b(returnType);
            Class<?> clsK = ne.f.k(returnType);
            if (clsK != null) {
                returnType = clsK;
            }
            arrayList2.add(returnType);
        }
        this.f4716f = arrayList2;
        List list4 = this.f4714d;
        ArrayList arrayList3 = new ArrayList(q.v(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.f4717g = arrayList3;
        if (this.f4713c == EnumC0070a.f4719b && bVar == b.f4722a && !q.p0(this.f4712b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    public void a(Object[] objArr) {
        b(objArr);
    }

    public void b(Object[] objArr) {
        rd.m.e(objArr, "args");
        if (j.a(this) == objArr.length) {
            return;
        }
        throw new IllegalArgumentException("Callable expects " + j.a(this) + " arguments, but " + objArr.length + " were provided.");
    }

    public boolean c() {
        return false;
    }

    public Void d() {
        return null;
    }

    @Override // ce.h
    public Type g() {
        return this.f4711a;
    }

    @Override // ce.h
    public /* bridge */ /* synthetic */ Member h() {
        return (Member) d();
    }

    @Override // ce.h
    public Object i(Object[] objArr) {
        rd.m.e(objArr, "args");
        a(objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            int i12 = i11 + 1;
            Object objQ = (obj == null && this.f4713c == EnumC0070a.f4718a) ? this.f4717g.get(i11) : f.q(obj, (Class) this.f4716f.get(i11));
            if (objQ == null) {
                f.p(i11, (String) this.f4712b.get(i11), (Class) this.f4716f.get(i11));
                throw new dd.f();
            }
            arrayList.add(objQ);
            i10++;
            i11 = i12;
        }
        return f.g(this.f4711a, k0.r(q.Q0(this.f4712b, arrayList)), this.f4714d);
    }

    @Override // ce.h
    public List j() {
        return this.f4715e;
    }

    @Override // ce.h
    public boolean k() {
        return c();
    }

    public /* synthetic */ a(Class cls, List list, EnumC0070a enumC0070a, b bVar, List list2, int i10, rd.h hVar) {
        if ((i10 & 16) != 0) {
            list2 = new ArrayList(q.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(cls.getDeclaredMethod((String) it.next(), null));
            }
        }
        this(cls, list, enumC0070a, bVar, list2);
    }
}
