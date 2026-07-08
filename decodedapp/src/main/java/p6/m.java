package p6;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class m extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected LinkedList f24005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected transient Closeable f24006c;

    public m(Closeable closeable, String str) {
        super(str);
        this.f24006c = closeable;
        if (closeable instanceof e6.j) {
            this.f11557a = ((e6.j) closeable).G0();
        }
    }

    private static e6.j h(h hVar) {
        if (hVar == null) {
            return null;
        }
        return hVar.i0();
    }

    public static m i(e6.g gVar, String str) {
        return new m(gVar, str, (Throwable) null);
    }

    public static m j(e6.g gVar, String str, Throwable th2) {
        return new m(gVar, str, th2);
    }

    public static m k(e6.j jVar, String str, Throwable th2) {
        return new m(jVar, str, th2);
    }

    public static m l(h hVar, String str) {
        return new m(h(hVar), str);
    }

    public static m n(IOException iOException) {
        return new m(null, String.format("Unexpected IOException (of type %s): %s", iOException.getClass().getName(), i7.h.o(iOException)));
    }

    public static m r(Throwable th2, Object obj, int i10) {
        return t(th2, new a(obj, i10));
    }

    public static m s(Throwable th2, Object obj, String str) {
        return t(th2, new a(obj, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p6.m t(java.lang.Throwable r3, p6.m.a r4) {
        /*
            boolean r0 = r3 instanceof p6.m
            if (r0 == 0) goto L7
            p6.m r3 = (p6.m) r3
            goto L4a
        L7:
            java.lang.String r0 = i7.h.o(r3)
            if (r0 == 0) goto L13
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L31
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "(was "
            r0.append(r1)
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L31:
            boolean r1 = r3 instanceof e6.d
            if (r1 == 0) goto L43
            r1 = r3
            e6.d r1 = (e6.d) r1
            java.lang.Object r1 = r1.c()
            boolean r2 = r1 instanceof java.io.Closeable
            if (r2 == 0) goto L43
            java.io.Closeable r1 = (java.io.Closeable) r1
            goto L44
        L43:
            r1 = 0
        L44:
            p6.m r2 = new p6.m
            r2.<init>(r1, r0, r3)
            r3 = r2
        L4a:
            r3.p(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.m.t(java.lang.Throwable, p6.m$a):p6.m");
    }

    @Override // e6.k, e6.d
    public Object c() {
        return this.f24006c;
    }

    @Override // p6.f
    public void e(Object obj, String str) {
        p(new a(obj, str));
    }

    protected void f(StringBuilder sb2) {
        LinkedList linkedList = this.f24005b;
        if (linkedList == null) {
            return;
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            sb2.append(((a) it.next()).toString());
            if (it.hasNext()) {
                sb2.append("->");
            }
        }
    }

    protected String g() {
        String message = super.getMessage();
        if (this.f24005b == null) {
            return message;
        }
        StringBuilder sb2 = message == null ? new StringBuilder() : new StringBuilder(message);
        sb2.append(" (through reference chain: ");
        StringBuilder sbO = o(sb2);
        sbO.append(')');
        return sbO.toString();
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return g();
    }

    @Override // e6.k, java.lang.Throwable
    public String getMessage() {
        return g();
    }

    public StringBuilder o(StringBuilder sb2) {
        f(sb2);
        return sb2;
    }

    public void p(a aVar) {
        if (this.f24005b == null) {
            this.f24005b = new LinkedList();
        }
        if (this.f24005b.size() < 1000) {
            this.f24005b.addFirst(aVar);
        }
    }

    public m q(Throwable th2) {
        initCause(th2);
        return this;
    }

    @Override // e6.k, java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected transient Object f24007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected String f24008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f24009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected String f24010d;

        public a(Object obj, String str) {
            this.f24009c = -1;
            this.f24007a = obj;
            if (str == null) {
                throw new NullPointerException("Cannot pass null fieldName");
            }
            this.f24008b = str;
        }

        public String a() {
            if (this.f24010d == null) {
                StringBuilder sb2 = new StringBuilder();
                Object obj = this.f24007a;
                if (obj != null) {
                    Class<?> componentType = obj instanceof Class ? (Class) obj : obj.getClass();
                    int i10 = 0;
                    while (componentType.isArray()) {
                        componentType = componentType.getComponentType();
                        i10++;
                    }
                    sb2.append(componentType.getName());
                    while (true) {
                        i10--;
                        if (i10 < 0) {
                            break;
                        }
                        sb2.append("[]");
                    }
                } else {
                    sb2.append("UNKNOWN");
                }
                sb2.append('[');
                if (this.f24008b != null) {
                    sb2.append('\"');
                    sb2.append(this.f24008b);
                    sb2.append('\"');
                } else {
                    int i11 = this.f24009c;
                    if (i11 >= 0) {
                        sb2.append(i11);
                    } else {
                        sb2.append('?');
                    }
                }
                sb2.append(']');
                this.f24010d = sb2.toString();
            }
            return this.f24010d;
        }

        public String toString() {
            return a();
        }

        public a(Object obj, int i10) {
            this.f24007a = obj;
            this.f24009c = i10;
        }
    }

    public m(Closeable closeable, String str, Throwable th2) {
        super(str, th2);
        this.f24006c = closeable;
        if (th2 instanceof e6.d) {
            this.f11557a = ((e6.d) th2).a();
        } else if (closeable instanceof e6.j) {
            this.f11557a = ((e6.j) closeable).G0();
        }
    }

    public m(Closeable closeable, String str, e6.h hVar) {
        super(str, hVar);
        this.f24006c = closeable;
    }
}
