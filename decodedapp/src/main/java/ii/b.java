package ii;

import hi.g;
import hi.h;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Closeable {

    /* JADX INFO: renamed from: a */
    private hi.d f16154a;

    /* JADX INFO: renamed from: b */
    private g f16155b;

    /* JADX INFO: renamed from: c */
    private h f16156c;

    /* JADX INFO: renamed from: d */
    private int f16157d;

    /* JADX INFO: renamed from: e */
    private c f16158e;

    /* JADX INFO: renamed from: f */
    private f f16159f;

    /* JADX INFO: renamed from: g */
    private List f16160g;

    /* JADX INFO: renamed from: h */
    private int f16161h;

    public b(hi.d dVar) {
        this(dVar.a());
        this.f16154a = dVar;
    }

    public c a() {
        return this.f16158e;
    }

    public a c() throws IOException {
        while (true) {
            hi.e eVarB = this.f16155b.b(this.f16157d);
            if (eVarB == null) {
                return null;
            }
            d dVarD = e.d(eVarB);
            if (dVarD instanceof a) {
                return (a) dVarD;
            }
            System.err.println("Skipping non audio packet " + dVarD + " mid audio stream");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        boolean z10;
        int i10;
        if (this.f16155b != null) {
            this.f16155b = null;
            this.f16154a.close();
            this.f16154a = null;
        }
        h hVar = this.f16156c;
        if (hVar != null) {
            int i11 = 1;
            hVar.e(this.f16158e.c(), true);
            this.f16156c.e(this.f16159f.c(), false);
            List list = this.f16160g;
            int size = list.size();
            int i12 = this.f16161h;
            a aVar = null;
            long jD = 0;
            int i13 = 0;
            int i14 = 0;
            int iG = 0;
            boolean z11 = false;
            while (i13 < size) {
                aVar = (a) list.get(i13);
                i14 += i11;
                if (i12 != -1) {
                    z10 = i14 >= i12;
                    iG += aVar.g();
                    i10 = i12;
                    aVar.e(((long) iG) + jD);
                } else if (aVar.d() < 0 || jD == aVar.d()) {
                    i10 = i12;
                    z10 = false;
                } else {
                    this.f16156c.flush();
                    jD = aVar.d();
                    this.f16156c.q(jD);
                    i10 = i12;
                    z10 = false;
                    z11 = true;
                }
                this.f16156c.a(aVar.c());
                if (z10 || this.f16156c.n() > 16384) {
                    long jD2 = aVar.d();
                    this.f16156c.q(jD2);
                    if (i13 != size - 1) {
                        this.f16156c.flush();
                        jD = jD2;
                        z11 = true;
                    } else {
                        jD = jD2;
                    }
                }
                if (z11) {
                    i14 = 0;
                    iG = 0;
                    z11 = false;
                }
                i13++;
                i12 = i10;
                i11 = 1;
            }
            if (aVar != null) {
                this.f16156c.q(aVar.d());
            }
            this.f16156c.close();
            this.f16156c = null;
            this.f16154a.close();
            this.f16154a = null;
        }
    }

    public b(g gVar) throws IOException {
        hi.e eVarA;
        this.f16157d = -1;
        this.f16161h = 50;
        this.f16155b = gVar;
        while (true) {
            eVarA = gVar.a();
            if (eVarA != null) {
                if (eVarA.d() && eVarA.a().length > 10 && e.f(eVarA)) {
                    this.f16157d = eVarA.c();
                    break;
                }
            } else {
                break;
            }
        }
        if (this.f16157d != -1) {
            this.f16158e = (c) e.d(eVarA);
            this.f16159f = (f) e.d(gVar.b(this.f16157d));
            return;
        }
        throw new IllegalArgumentException("Supplied File is not Opus");
    }
}
