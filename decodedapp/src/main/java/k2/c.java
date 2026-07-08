package k2;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import k2.f;
import o2.n;

/* JADX INFO: loaded from: classes.dex */
class c implements f, d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f18949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f18950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.a f18951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i2.f f18953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f18954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile n.a f18956h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private File f18957r;

    c(g gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean a() {
        return this.f18955g < this.f18954f.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (a() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f18954f;
        r3 = r7.f18955g;
        r7.f18955g = r3 + 1;
        r7.f18956h = ((o2.n) r0.get(r3)).b(r7.f18957r, r7.f18950b.t(), r7.f18950b.f(), r7.f18950b.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f18956h == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f18950b.u(r7.f18956h.f23124c.a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f18956h.f23124c.e(r7.f18950b.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f18956h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    @Override // k2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            f3.b.a(r0)
        L5:
            java.util.List r0 = r7.f18954f     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.a()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.f18956h = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.a()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List r0 = r7.f18954f     // Catch: java.lang.Throwable -> L68
            int r3 = r7.f18955g     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.f18955g = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            o2.n r0 = (o2.n) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.f18957r     // Catch: java.lang.Throwable -> L68
            k2.g r4 = r7.f18950b     // Catch: java.lang.Throwable -> L68
            int r4 = r4.t()     // Catch: java.lang.Throwable -> L68
            k2.g r5 = r7.f18950b     // Catch: java.lang.Throwable -> L68
            int r5 = r5.f()     // Catch: java.lang.Throwable -> L68
            k2.g r6 = r7.f18950b     // Catch: java.lang.Throwable -> L68
            i2.h r6 = r6.k()     // Catch: java.lang.Throwable -> L68
            o2.n$a r0 = r0.b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.f18956h = r0     // Catch: java.lang.Throwable -> L68
            o2.n$a r0 = r7.f18956h     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            k2.g r0 = r7.f18950b     // Catch: java.lang.Throwable -> L68
            o2.n$a r3 = r7.f18956h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r3 = r3.f23124c     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.a()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            o2.n$a r0 = r7.f18956h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r0 = r0.f23124c     // Catch: java.lang.Throwable -> L68
            k2.g r2 = r7.f18950b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.h r2 = r2.l()     // Catch: java.lang.Throwable -> L68
            r0.e(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = 1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            f3.b.e()
            return r2
        L6e:
            int r0 = r7.f18952d     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.f18952d = r0     // Catch: java.lang.Throwable -> L68
            java.util.List r1 = r7.f18949a     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            f3.b.e()
            return r2
        L7f:
            java.util.List r0 = r7.f18949a     // Catch: java.lang.Throwable -> L68
            int r1 = r7.f18952d     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            i2.f r0 = (i2.f) r0     // Catch: java.lang.Throwable -> L68
            k2.d r1 = new k2.d     // Catch: java.lang.Throwable -> L68
            k2.g r3 = r7.f18950b     // Catch: java.lang.Throwable -> L68
            i2.f r3 = r3.p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            k2.g r3 = r7.f18950b     // Catch: java.lang.Throwable -> L68
            m2.a r3 = r3.d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L68
            r7.f18957r = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.f18953e = r0     // Catch: java.lang.Throwable -> L68
            k2.g r0 = r7.f18950b     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f18954f = r0     // Catch: java.lang.Throwable -> L68
            r7.f18955g = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            f3.b.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c.b():boolean");
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f18951c.d(this.f18953e, exc, this.f18956h.f23124c, i2.a.DATA_DISK_CACHE);
    }

    @Override // k2.f
    public void cancel() {
        n.a aVar = this.f18956h;
        if (aVar != null) {
            aVar.f23124c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f18951c.a(this.f18953e, obj, this.f18956h.f23124c, i2.a.DATA_DISK_CACHE, this.f18953e);
    }

    c(List list, g gVar, f.a aVar) {
        this.f18952d = -1;
        this.f18949a = list;
        this.f18950b = gVar;
        this.f18951c = aVar;
    }
}
