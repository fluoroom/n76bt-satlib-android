package k2;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import k2.f;
import o2.n;

/* JADX INFO: loaded from: classes.dex */
class w implements f, d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f.a f19116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f19117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19119d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i2.f f19120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f19121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile n.a f19123h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private File f19124r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private x f19125s;

    w(g gVar, f.a aVar) {
        this.f19117b = gVar;
        this.f19116a = aVar;
    }

    private boolean a() {
        return this.f19122g < this.f19121f.size();
    }

    @Override // k2.f
    public boolean b() {
        f3.b.a("ResourceCacheGenerator.startNext");
        try {
            List listC = this.f19117b.c();
            boolean z10 = false;
            if (listC.isEmpty()) {
                f3.b.e();
                return false;
            }
            List listM = this.f19117b.m();
            if (listM.isEmpty()) {
                if (File.class.equals(this.f19117b.r())) {
                    f3.b.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f19117b.i() + " to " + this.f19117b.r());
            }
            while (true) {
                if (this.f19121f != null && a()) {
                    this.f19123h = null;
                    while (!z10 && a()) {
                        List list = this.f19121f;
                        int i10 = this.f19122g;
                        this.f19122g = i10 + 1;
                        this.f19123h = ((o2.n) list.get(i10)).b(this.f19124r, this.f19117b.t(), this.f19117b.f(), this.f19117b.k());
                        if (this.f19123h != null && this.f19117b.u(this.f19123h.f23124c.a())) {
                            this.f19123h.f23124c.e(this.f19117b.l(), this);
                            z10 = true;
                        }
                    }
                    f3.b.e();
                    return z10;
                }
                int i11 = this.f19119d + 1;
                this.f19119d = i11;
                if (i11 >= listM.size()) {
                    int i12 = this.f19118c + 1;
                    this.f19118c = i12;
                    if (i12 >= listC.size()) {
                        f3.b.e();
                        return false;
                    }
                    this.f19119d = 0;
                }
                i2.f fVar = (i2.f) listC.get(this.f19118c);
                Class cls = (Class) listM.get(this.f19119d);
                this.f19125s = new x(this.f19117b.b(), fVar, this.f19117b.p(), this.f19117b.t(), this.f19117b.f(), this.f19117b.s(cls), cls, this.f19117b.k());
                File fileA = this.f19117b.d().a(this.f19125s);
                this.f19124r = fileA;
                if (fileA != null) {
                    this.f19120e = fVar;
                    this.f19121f = this.f19117b.j(fileA);
                    this.f19122g = 0;
                }
            }
        } catch (Throwable th2) {
            f3.b.e();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f19116a.d(this.f19125s, exc, this.f19123h.f23124c, i2.a.RESOURCE_DISK_CACHE);
    }

    @Override // k2.f
    public void cancel() {
        n.a aVar = this.f19123h;
        if (aVar != null) {
            aVar.f23124c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f19116a.a(this.f19120e, obj, this.f19123h.f23124c, i2.a.RESOURCE_DISK_CACHE, this.f19125s);
    }
}
