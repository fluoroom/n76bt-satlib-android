package ci;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected a f4920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f4921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f4922c;

    @Override // ci.b
    public a a(k kVar, String[] strArr, boolean z10) {
        return f(kVar, strArr, null, z10);
    }

    protected void b() throws g {
        if (!e().isEmpty()) {
            throw new g(e());
        }
    }

    protected abstract String[] c(k kVar, String[] strArr, boolean z10);

    protected k d() {
        return this.f4921b;
    }

    protected List e() {
        return this.f4922c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ci.a f(ci.k r6, java.lang.String[] r7, java.util.Properties r8, boolean r9) throws ci.f, ci.g, ci.n {
        /*
            r5 = this;
            java.util.List r0 = r6.f()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            ci.h r1 = (ci.h) r1
            r1.d()
            goto L8
        L18:
            r5.j(r6)
            ci.a r6 = new ci.a
            r6.<init>()
            r5.f4920a = r6
            r6 = 0
            if (r7 != 0) goto L27
            java.lang.String[] r7 = new java.lang.String[r6]
        L27:
            ci.k r0 = r5.d()
            java.lang.String[] r7 = r5.c(r0, r7, r9)
            java.util.List r7 = java.util.Arrays.asList(r7)
            java.util.ListIterator r7 = r7.listIterator()
        L37:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "--"
            boolean r2 = r1.equals(r0)
            r3 = 1
            if (r2 == 0) goto L4e
        L4c:
            r6 = 1
            goto L83
        L4e:
            java.lang.String r2 = "-"
            boolean r4 = r2.equals(r0)
            if (r4 == 0) goto L5f
            if (r9 == 0) goto L59
            goto L4c
        L59:
            ci.a r2 = r5.f4920a
            r2.a(r0)
            goto L83
        L5f:
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L7b
            if (r9 == 0) goto L77
            ci.k r2 = r5.d()
            boolean r2 = r2.e(r0)
            if (r2 != 0) goto L77
            ci.a r6 = r5.f4920a
            r6.a(r0)
            goto L4c
        L77:
            r5.h(r0, r7)
            goto L83
        L7b:
            ci.a r2 = r5.f4920a
            r2.a(r0)
            if (r9 == 0) goto L83
            goto L4c
        L83:
            if (r6 == 0) goto L37
        L85:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L85
            ci.a r2 = r5.f4920a
            r2.a(r0)
            goto L85
        L9d:
            r5.i(r8)
            r5.b()
            ci.a r6 = r5.f4920a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.m.f(ci.k, java.lang.String[], java.util.Properties, boolean):ci.a");
    }

    public void g(h hVar, ListIterator listIterator) throws f {
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            String str = (String) listIterator.next();
            if (d().e(str) && str.startsWith("-")) {
                listIterator.previous();
                break;
            } else {
                try {
                    hVar.b(o.a(str));
                } catch (RuntimeException unused) {
                    listIterator.previous();
                }
            }
        }
        if (hVar.n() == null && !hVar.w()) {
            throw new f(hVar);
        }
    }

    protected void h(String str, ListIterator listIterator) throws f, n {
        if (!d().e(str)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unrecognized option: ");
            stringBuffer.append(str);
            throw new n(stringBuffer.toString(), str);
        }
        h hVar = (h) d().b(str).clone();
        if (hVar.z()) {
            e().remove(hVar.h());
        }
        d().c(hVar);
        if (hVar.o()) {
            g(hVar, listIterator);
        }
        this.f4920a.b(hVar);
    }

    protected void i(Properties properties) {
        if (properties == null) {
            return;
        }
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            String string = enumerationPropertyNames.nextElement().toString();
            if (!this.f4920a.d(string)) {
                h hVarB = d().b(string);
                String property = properties.getProperty(string);
                if (hVarB.o()) {
                    if (hVarB.n() == null || hVarB.n().length == 0) {
                        try {
                            hVarB.b(property);
                        } catch (RuntimeException unused) {
                        }
                    }
                } else if (!"yes".equalsIgnoreCase(property) && !"true".equalsIgnoreCase(property) && !"1".equalsIgnoreCase(property)) {
                    return;
                }
                this.f4920a.b(hVarB);
            }
        }
    }

    protected void j(k kVar) {
        this.f4921b = kVar;
        this.f4922c = new ArrayList(kVar.d());
    }
}
