package gj;

import gj.b0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zj.s f14629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yj.b0 f14630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient yj.z f14631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient yj.z f14632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double[] f14633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double[] f14634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double[] f14635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double[] f14636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final double[] f14637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double[] f14638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final double[] f14639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final double[] f14640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final double[] f14641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final double[] f14642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final double[] f14643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final double[] f14644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final double[] f14645q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final double[] f14646r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final transient yj.c0 f14647s;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Pattern f14648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b0 f14649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f14650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private double[] f14651d;

        b() {
            StringBuilder sb2 = new StringBuilder();
            for (c cVar : c.values()) {
                if (sb2.length() > 0) {
                    sb2.append('|');
                }
                sb2.append(cVar.a());
            }
            this.f14648a = Pattern.compile("\\p{Space}*F\\p{Digit}+\\p{Space}*≡" + ("\\p{Space}*((?:" + sb2.toString() + ")+)") + "\\p{Space}*=\\p{Space}*(.*)");
            this.f14649b = new b0('t', b0.a.NO_UNITS);
        }

        public c a() {
            return this.f14650c;
        }

        public double[] b() {
            return (double[]) this.f14651d.clone();
        }

        public boolean c(String str, int i10, String str2) {
            this.f14650c = null;
            this.f14651d = null;
            Matcher matcher = this.f14648a.matcher(str);
            if (!matcher.matches()) {
                return false;
            }
            for (c cVar : c.values()) {
                if (cVar.a().equals(matcher.group(1))) {
                    this.f14650c = cVar;
                }
            }
            this.f14651d = this.f14649b.e(matcher.group(2));
            return true;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f14652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f14653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f14654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f14655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f14656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f14657f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f14658g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c f14659h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final c f14660r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final c f14661s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final c f14662t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final c f14663u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final c f14664v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final c f14665w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final /* synthetic */ c[] f14666x;

        enum a extends c {
            a(String str, int i10) {
                super(str, i10);
            }

            @Override // gj.o.c
            public String a() {
                return "LJ";
            }
        }

        enum b extends c {
            b(String str, int i10) {
                super(str, i10);
            }

            @Override // gj.o.c
            public String a() {
                return "LSa";
            }
        }

        /* JADX INFO: renamed from: gj.o$c$c, reason: collision with other inner class name */
        enum C0207c extends c {
            C0207c(String str, int i10) {
                super(str, i10);
            }

            @Override // gj.o.c
            public String a() {
                return "LU";
            }
        }

        enum d extends c {
            d(String str, int i10) {
                super(str, i10);
            }

            @Override // gj.o.c
            public String a() {
                return "LNe";
            }
        }

        enum e extends c {
            e(String str, int i10) {
                super(str, i10);
            }

            @Override // gj.o.c
            public String a() {
                return "pA";
            }
        }

        enum f extends c {
            f(String str, int i10) {
                super(str, i10);
            }

            @Override // gj.o.c
            public String a() {
                return "l";
            }
        }

        enum g extends c {
            g(String str, int i10) {
                super(str, i10);
            }

            @Override // gj.o.c
            public String a() {
                return "l'";
            }
        }

        enum h extends c {
            h(String str, int i10) {
                super(str, i10);
            }

            @Override // gj.o.c
            public String a() {
                return "F";
            }
        }

        enum i extends c {
            i(String str, int i10) {
                super(str, i10);
            }

            @Override // gj.o.c
            public String a() {
                return "D";
            }
        }

        enum j extends c {
            j(String str, int i10) {
                super(str, i10);
            }

            @Override // gj.o.c
            public String a() {
                return "Ω";
            }
        }

        enum k extends c {
            k(String str, int i10) {
                super(str, i10);
            }

            @Override // gj.o.c
            public String a() {
                return "LMe";
            }
        }

        enum l extends c {
            l(String str, int i10) {
                super(str, i10);
            }

            @Override // gj.o.c
            public String a() {
                return "LVe";
            }
        }

        enum m extends c {
            m(String str, int i10) {
                super(str, i10);
            }

            @Override // gj.o.c
            public String a() {
                return "LE";
            }
        }

        enum n extends c {
            n(String str, int i10) {
                super(str, i10);
            }

            @Override // gj.o.c
            public String a() {
                return "LMa";
            }
        }

        static {
            f fVar = new f("L", 0);
            f14652a = fVar;
            g gVar = new g("L_PRIME", 1);
            f14653b = gVar;
            h hVar = new h("F", 2);
            f14654c = hVar;
            i iVar = new i("D", 3);
            f14655d = iVar;
            j jVar = new j("OMEGA", 4);
            f14656e = jVar;
            k kVar = new k("L_ME", 5);
            f14657f = kVar;
            l lVar = new l("L_VE", 6);
            f14658g = lVar;
            m mVar = new m("L_E", 7);
            f14659h = mVar;
            n nVar = new n("L_MA", 8);
            f14660r = nVar;
            a aVar = new a("L_J", 9);
            f14661s = aVar;
            b bVar = new b("L_SA", 10);
            f14662t = bVar;
            C0207c c0207c = new C0207c("L_U", 11);
            f14663u = c0207c;
            d dVar = new d("L_NE", 12);
            f14664v = dVar;
            e eVar = new e("PA", 13);
            f14665w = eVar;
            f14666x = new c[]{fVar, gVar, hVar, iVar, jVar, kVar, lVar, mVar, nVar, aVar, bVar, c0207c, dVar, eVar};
        }

        private c(String str, int i10) {
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f14666x.clone();
        }

        public abstract String a();
    }

    public o(zj.s sVar, yj.b0 b0Var, InputStream inputStream, String str, yj.c0 c0Var) {
        this(sVar, b0Var, d(inputStream, str), c0Var);
    }

    private double a(double d10, double[] dArr) {
        double d11 = 0.0d;
        for (int length = dArr.length - 1; length > 0; length--) {
            d11 = (d11 * d10) + (((double) length) * dArr[length]);
        }
        return d11 / 3.15576E9d;
    }

    private static double[] c(c cVar, Map map, String str) {
        if (map.containsKey(cVar)) {
            return (double[]) map.get(cVar);
        }
        throw new hj.a(hj.f.NOT_A_SUPPORTED_IERS_DATA_FILE, str);
    }

    private static List d(InputStream inputStream, String str) {
        if (inputStream == null) {
            throw new hj.a(hj.f.UNABLE_TO_FIND_FILE, str);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            try {
                b bVar = new b();
                int length = c.values().length;
                HashMap map = new HashMap(length);
                int i10 = 0;
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    i10++;
                    if (bVar.c(line, i10, str)) {
                        map.put(bVar.a(), bVar.b());
                    }
                }
                ArrayList arrayList = new ArrayList(length);
                arrayList.add(c(c.f14652a, map, str));
                arrayList.add(c(c.f14653b, map, str));
                arrayList.add(c(c.f14654c, map, str));
                arrayList.add(c(c.f14655d, map, str));
                arrayList.add(c(c.f14656e, map, str));
                c cVar = c.f14657f;
                if (map.containsKey(cVar)) {
                    arrayList.add(c(cVar, map, str));
                    arrayList.add(c(c.f14658g, map, str));
                    arrayList.add(c(c.f14659h, map, str));
                    arrayList.add(c(c.f14660r, map, str));
                    arrayList.add(c(c.f14661s, map, str));
                    arrayList.add(c(c.f14662t, map, str));
                    arrayList.add(c(c.f14663u, map, str));
                    arrayList.add(c(c.f14664v, map, str));
                    arrayList.add(c(c.f14665w, map, str));
                } else {
                    double[] dArr = {0.0d};
                    while (arrayList.size() < length) {
                        arrayList.add(dArr);
                    }
                }
                bufferedReader.close();
                return arrayList;
            } finally {
            }
        } catch (IOException e10) {
            throw new hj.a(e10, new ui.a(e10.getMessage()), new Object[0]);
        }
    }

    private double e(double d10, double[] dArr) {
        double d11 = 0.0d;
        for (int length = dArr.length - 1; length >= 0; length--) {
            d11 = (d11 * d10) + dArr[length];
        }
        return d11;
    }

    public gj.b b(yj.b bVar) {
        double d10 = this.f14629a.d(bVar, this.f14647s);
        yj.z zVar = this.f14631c;
        double dA = zVar == null ? Double.NaN : zVar.a(bVar) + 3.141592653589793d;
        yj.z zVar2 = this.f14632d;
        return new gj.b(bVar, d10, dA, zVar2 != null ? zVar2.a(bVar) : Double.NaN, e(d10, this.f14633e), a(d10, this.f14633e), e(d10, this.f14634f), a(d10, this.f14634f), e(d10, this.f14635g), a(d10, this.f14635g), e(d10, this.f14636h), a(d10, this.f14636h), e(d10, this.f14637i), a(d10, this.f14637i), e(d10, this.f14638j), a(d10, this.f14638j), e(d10, this.f14639k), a(d10, this.f14639k), e(d10, this.f14640l), a(d10, this.f14640l), e(d10, this.f14641m), a(d10, this.f14641m), e(d10, this.f14642n), a(d10, this.f14642n), e(d10, this.f14643o), a(d10, this.f14643o), e(d10, this.f14644p), a(d10, this.f14644p), e(d10, this.f14645q), a(d10, this.f14645q), e(d10, this.f14646r), a(d10, this.f14646r));
    }

    public o(zj.s sVar, yj.b0 b0Var, List list, yj.c0 c0Var) {
        this.f14629a = sVar;
        this.f14630b = b0Var;
        this.f14647s = c0Var;
        this.f14631c = b0Var == null ? null : sVar.h(b0Var, c0Var);
        this.f14632d = b0Var != null ? sVar.i(b0Var, c0Var) : null;
        this.f14633e = (double[]) list.get(0);
        this.f14634f = (double[]) list.get(1);
        this.f14635g = (double[]) list.get(2);
        this.f14636h = (double[]) list.get(3);
        this.f14637i = (double[]) list.get(4);
        this.f14638j = (double[]) list.get(5);
        this.f14639k = (double[]) list.get(6);
        this.f14640l = (double[]) list.get(7);
        this.f14641m = (double[]) list.get(8);
        this.f14642n = (double[]) list.get(9);
        this.f14643o = (double[]) list.get(10);
        this.f14644p = (double[]) list.get(11);
        this.f14645q = (double[]) list.get(12);
        this.f14646r = (double[]) list.get(13);
    }
}
