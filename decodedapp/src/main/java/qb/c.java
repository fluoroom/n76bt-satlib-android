package qb;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import qb.k;
import r9.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f24540l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f24541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f24542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qb.b f24544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f24545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object[][] f24546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f24547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Boolean f24548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Integer f24549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Integer f24550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Integer f24551k;

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        u f24552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Executor f24553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f24554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        qb.b f24555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f24556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object[][] f24557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List f24558g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Boolean f24559h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Integer f24560i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Integer f24561j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Integer f24562k;

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c b() {
            return new c(this);
        }
    }

    /* JADX INFO: renamed from: qb.c$c, reason: collision with other inner class name */
    public static final class C0338c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f24564b;

        private C0338c(String str, Object obj) {
            this.f24563a = str;
            this.f24564b = obj;
        }

        public static C0338c b(String str) {
            r9.l.o(str, "debugString");
            return new C0338c(str, null);
        }

        public String toString() {
            return this.f24563a;
        }
    }

    static {
        b bVar = new b();
        bVar.f24557f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        bVar.f24558g = Collections.EMPTY_LIST;
        f24540l = bVar.b();
    }

    private static b l(c cVar) {
        b bVar = new b();
        bVar.f24552a = cVar.f24541a;
        bVar.f24553b = cVar.f24542b;
        bVar.f24554c = cVar.f24543c;
        bVar.f24555d = cVar.f24544d;
        bVar.f24556e = cVar.f24545e;
        bVar.f24557f = cVar.f24546f;
        bVar.f24558g = cVar.f24547g;
        bVar.f24559h = cVar.f24548h;
        bVar.f24560i = cVar.f24549i;
        bVar.f24561j = cVar.f24550j;
        bVar.f24562k = cVar.f24551k;
        return bVar;
    }

    public String a() {
        return this.f24543c;
    }

    public String b() {
        return this.f24545e;
    }

    public qb.b c() {
        return this.f24544d;
    }

    public u d() {
        return this.f24541a;
    }

    public Executor e() {
        return this.f24542b;
    }

    public Integer f() {
        return this.f24549i;
    }

    public Integer g() {
        return this.f24550j;
    }

    public Integer h() {
        return this.f24551k;
    }

    public Object i(C0338c c0338c) {
        r9.l.o(c0338c, "key");
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f24546f;
            if (i10 >= objArr.length) {
                return c0338c.f24564b;
            }
            if (c0338c.equals(objArr[i10][0])) {
                return this.f24546f[i10][1];
            }
            i10++;
        }
    }

    public List j() {
        return this.f24547g;
    }

    public boolean k() {
        return Boolean.TRUE.equals(this.f24548h);
    }

    public c m(String str) {
        b bVarL = l(this);
        bVarL.f24554c = str;
        return bVarL.b();
    }

    public c n(qb.b bVar) {
        b bVarL = l(this);
        bVarL.f24555d = bVar;
        return bVarL.b();
    }

    public c o(String str) {
        b bVarL = l(this);
        bVarL.f24556e = str;
        return bVarL.b();
    }

    public c p(u uVar) {
        b bVarL = l(this);
        bVarL.f24552a = uVar;
        return bVarL.b();
    }

    public c q(long j10, TimeUnit timeUnit) {
        return p(u.a(j10, timeUnit));
    }

    public c r(Executor executor) {
        b bVarL = l(this);
        bVarL.f24553b = executor;
        return bVarL.b();
    }

    public c s(int i10) {
        r9.l.h(i10 >= 0, "invalid maxsize %s", i10);
        b bVarL = l(this);
        bVarL.f24560i = Integer.valueOf(i10);
        return bVarL.b();
    }

    public c t(int i10) {
        r9.l.h(i10 >= 0, "invalid maxsize %s", i10);
        b bVarL = l(this);
        bVarL.f24561j = Integer.valueOf(i10);
        return bVarL.b();
    }

    public String toString() {
        g.b bVarD = r9.g.b(this).d("deadline", this.f24541a).d("authority", this.f24543c).d("callCredentials", this.f24544d);
        Executor executor = this.f24542b;
        return bVarD.d("executor", executor != null ? executor.getClass() : null).d("compressorName", this.f24545e).d("customOptions", Arrays.deepToString(this.f24546f)).e("waitForReady", k()).d("maxInboundMessageSize", this.f24549i).d("maxOutboundMessageSize", this.f24550j).d("onReadyThreshold", this.f24551k).d("streamTracerFactories", this.f24547g).toString();
    }

    public c u(int i10) {
        r9.l.h(i10 > 0, "numBytes must be positive: %s", i10);
        b bVarL = l(this);
        bVarL.f24562k = Integer.valueOf(i10);
        return bVarL.b();
    }

    public c v(C0338c c0338c, Object obj) {
        r9.l.o(c0338c, "key");
        r9.l.o(obj, "value");
        b bVarL = l(this);
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f24546f;
            if (i10 >= objArr.length) {
                i10 = -1;
                break;
            }
            if (c0338c.equals(objArr[i10][0])) {
                break;
            }
            i10++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f24546f.length + (i10 == -1 ? 1 : 0), 2);
        bVarL.f24557f = objArr2;
        Object[][] objArr3 = this.f24546f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i10 == -1) {
            bVarL.f24557f[this.f24546f.length] = new Object[]{c0338c, obj};
        } else {
            bVarL.f24557f[i10] = new Object[]{c0338c, obj};
        }
        return bVarL.b();
    }

    public c w(k.a aVar) {
        ArrayList arrayList = new ArrayList(this.f24547g.size() + 1);
        arrayList.addAll(this.f24547g);
        arrayList.add(aVar);
        b bVarL = l(this);
        bVarL.f24558g = DesugarCollections.unmodifiableList(arrayList);
        return bVarL.b();
    }

    public c x() {
        b bVarL = l(this);
        bVarL.f24559h = Boolean.TRUE;
        return bVarL.b();
    }

    public c y() {
        b bVarL = l(this);
        bVarL.f24559h = Boolean.FALSE;
        return bVarL.b();
    }

    private c(b bVar) {
        this.f24541a = bVar.f24552a;
        this.f24542b = bVar.f24553b;
        this.f24543c = bVar.f24554c;
        this.f24544d = bVar.f24555d;
        this.f24545e = bVar.f24556e;
        this.f24546f = bVar.f24557f;
        this.f24547g = bVar.f24558g;
        this.f24548h = bVar.f24559h;
        this.f24549i = bVar.f24560i;
        this.f24550j = bVar.f24561j;
        this.f24551k = bVar.f24562k;
    }
}
