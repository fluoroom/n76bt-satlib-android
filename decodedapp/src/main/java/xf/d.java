package xf;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f32038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f32039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f32040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f32041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f32042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f32043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f32044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f32045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f32046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f32047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f32048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f32049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f32050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f32051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f32052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f32053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f32054s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f32055t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f32056u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f32057v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f32058w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f32059x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final List f32060y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final List f32061z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32063b;

    public static final class a {

        /* JADX INFO: renamed from: xf.d$a$a, reason: collision with other inner class name */
        private static final class C0435a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f32064a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f32065b;

            public C0435a(int i10, String str) {
                rd.m.e(str, "name");
                this.f32064a = i10;
                this.f32065b = str;
            }

            public final int a() {
                return this.f32064a;
            }

            public final String b() {
                return this.f32065b;
            }
        }

        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int j() {
            int i10 = d.f32039d;
            d.f32039d <<= 1;
            return i10;
        }

        public final int b() {
            return d.f32046k;
        }

        public final int c() {
            return d.f32047l;
        }

        public final int d() {
            return d.f32044i;
        }

        public final int e() {
            return d.f32040e;
        }

        public final int f() {
            return d.f32043h;
        }

        public final int g() {
            return d.f32041f;
        }

        public final int h() {
            return d.f32042g;
        }

        public final int i() {
            return d.f32045j;
        }

        private a() {
        }
    }

    static {
        a.C0435a c0435a;
        a.C0435a c0435a2;
        a aVar = new a(null);
        f32038c = aVar;
        f32039d = 1;
        int iJ = aVar.j();
        f32040e = iJ;
        int iJ2 = aVar.j();
        f32041f = iJ2;
        int iJ3 = aVar.j();
        f32042g = iJ3;
        int iJ4 = aVar.j();
        f32043h = iJ4;
        int iJ5 = aVar.j();
        f32044i = iJ5;
        int iJ6 = aVar.j();
        f32045j = iJ6;
        int iJ7 = aVar.j() - 1;
        f32046k = iJ7;
        int i10 = iJ | iJ2 | iJ3;
        f32047l = i10;
        int i11 = iJ2 | iJ5 | iJ6;
        f32048m = i11;
        int i12 = iJ5 | iJ6;
        f32049n = i12;
        int i13 = 2;
        f32050o = new d(iJ7, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32051p = new d(i12, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32052q = new d(iJ, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32053r = new d(iJ2, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32054s = new d(iJ3, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32055t = new d(i10, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32056u = new d(iJ4, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32057v = new d(iJ5, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32058w = new d(iJ6, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32059x = new d(i11, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        Field[] fields = d.class.getFields();
        rd.m.d(fields, "getFields(...)");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                int i14 = dVar.f32063b;
                String name = field2.getName();
                rd.m.d(name, "getName(...)");
                c0435a2 = new a.C0435a(i14, name);
            } else {
                c0435a2 = null;
            }
            if (c0435a2 != null) {
                arrayList2.add(c0435a2);
            }
        }
        f32060y = arrayList2;
        Field[] fields2 = d.class.getFields();
        rd.m.d(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (rd.m.a(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            rd.m.c(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                rd.m.d(name2, "getName(...)");
                c0435a = new a.C0435a(iIntValue, name2);
            } else {
                c0435a = null;
            }
            if (c0435a != null) {
                arrayList5.add(c0435a);
            }
        }
        f32061z = arrayList5;
    }

    public d(int i10, List list) {
        rd.m.e(list, "excludes");
        this.f32062a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i10 &= ~((c) it.next()).a();
        }
        this.f32063b = i10;
    }

    public final boolean a(int i10) {
        return (i10 & this.f32063b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!rd.m.a(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        rd.m.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        d dVar = (d) obj;
        return rd.m.a(this.f32062a, dVar.f32062a) && this.f32063b == dVar.f32063b;
    }

    public int hashCode() {
        return (this.f32062a.hashCode() * 31) + this.f32063b;
    }

    public final List l() {
        return this.f32062a;
    }

    public final int m() {
        return this.f32063b;
    }

    public final d n(int i10) {
        int i11 = i10 & this.f32063b;
        if (i11 == 0) {
            return null;
        }
        return new d(i11, this.f32062a);
    }

    public String toString() {
        Object next;
        Iterator it = f32060y.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a.C0435a) next).a() == this.f32063b) {
                break;
            }
        }
        a.C0435a c0435a = (a.C0435a) next;
        String strB = c0435a != null ? c0435a.b() : null;
        if (strB == null) {
            List<a.C0435a> list = f32061z;
            ArrayList arrayList = new ArrayList();
            for (a.C0435a c0435a2 : list) {
                String strB2 = a(c0435a2.a()) ? c0435a2.b() : null;
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            strB = ed.q.i0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strB + ", " + this.f32062a + ')';
    }

    public /* synthetic */ d(int i10, List list, int i11, rd.h hVar) {
        this(i10, (i11 & 2) != 0 ? ed.q.k() : list);
    }
}
