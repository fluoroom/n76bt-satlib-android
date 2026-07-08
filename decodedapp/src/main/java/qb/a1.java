package qb;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f24511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f24514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f24515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f24516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f24517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f24518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f24519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicReferenceArray f24520j;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f24521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f24522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f24523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f24524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f24525e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f24526f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Object f24527g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f24528h;

        public a1 a() {
            return new a1(this.f24523c, this.f24524d, this.f24521a, this.f24522b, this.f24527g, this.f24525e, this.f24526f, this.f24528h);
        }

        public b b(String str) {
            this.f24524d = str;
            return this;
        }

        public b c(c cVar) {
            this.f24521a = cVar;
            return this;
        }

        public b d(c cVar) {
            this.f24522b = cVar;
            return this;
        }

        public b e(boolean z10) {
            this.f24528h = z10;
            return this;
        }

        public b f(Object obj) {
            this.f24527g = obj;
            return this;
        }

        public b g(d dVar) {
            this.f24523c = dVar;
            return this;
        }

        private b() {
        }
    }

    public interface c {
        Object a(InputStream inputStream);

        InputStream b(Object obj);
    }

    public enum d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        public final boolean a() {
            return this == UNARY || this == SERVER_STREAMING;
        }
    }

    public static String a(String str) {
        int iLastIndexOf = ((String) r9.l.o(str, "fullMethodName")).lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return null;
        }
        return str.substring(0, iLastIndexOf);
    }

    public static String b(String str, String str2) {
        return ((String) r9.l.o(str, "fullServiceName")) + "/" + ((String) r9.l.o(str2, "methodName"));
    }

    public static b g() {
        return h(null, null);
    }

    public static b h(c cVar, c cVar2) {
        return new b().c(cVar).d(cVar2);
    }

    public String c() {
        return this.f24512b;
    }

    public String d() {
        return this.f24513c;
    }

    public d e() {
        return this.f24511a;
    }

    public boolean f() {
        return this.f24518h;
    }

    public Object i(InputStream inputStream) {
        return this.f24515e.a(inputStream);
    }

    public InputStream j(Object obj) {
        return this.f24514d.b(obj);
    }

    public String toString() {
        return r9.g.b(this).d("fullMethodName", this.f24512b).d("type", this.f24511a).e("idempotent", this.f24517g).e("safe", this.f24518h).e("sampledToLocalTracing", this.f24519i).d("requestMarshaller", this.f24514d).d("responseMarshaller", this.f24515e).d("schemaDescriptor", this.f24516f).k().toString();
    }

    private a1(d dVar, String str, c cVar, c cVar2, Object obj, boolean z10, boolean z11, boolean z12) {
        this.f24520j = new AtomicReferenceArray(2);
        this.f24511a = (d) r9.l.o(dVar, "type");
        this.f24512b = (String) r9.l.o(str, "fullMethodName");
        this.f24513c = a(str);
        this.f24514d = (c) r9.l.o(cVar, "requestMarshaller");
        this.f24515e = (c) r9.l.o(cVar2, "responseMarshaller");
        this.f24516f = obj;
        this.f24517g = z10;
        this.f24518h = z11;
        this.f24519i = z12;
    }
}
