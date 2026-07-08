package cd;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    o f4598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f4599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f4600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f4601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f4602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    g f4603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f4604g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f4605h = -1;

    protected h(o oVar, e eVar, x xVar) {
        this.f4601d = 0;
        this.f4602e = null;
        this.f4603f = null;
        this.f4598a = oVar;
        this.f4600c = eVar;
        this.f4599b = xVar.k();
        g gVar = new g(xVar);
        this.f4602e = gVar;
        this.f4603f = gVar;
        this.f4601d = 1;
    }

    private int b(g gVar, g gVar2) {
        g gVar3;
        if (gVar.f4596f < gVar2.f4596f) {
            gVar.f4594d++;
            while (true) {
                gVar3 = gVar.f4593c;
                if (gVar3 == null || gVar3.f4596f >= gVar2.f4596f) {
                    break;
                }
                gVar = gVar3;
            }
            if (gVar3 != null && gVar3.f4596f == gVar2.f4596f) {
                return -2;
            }
            gVar2.f4593c = gVar3;
            gVar.f4593c = gVar2;
            return 0;
        }
        gVar2.f4593c = gVar;
        gVar2.f4594d = gVar.f4594d + 1;
        g gVar4 = gVar.f4591a;
        if (gVar4 != null) {
            gVar4.f4592b = gVar2;
            gVar2.f4591a = gVar4;
            gVar.f4591a = null;
        }
        g gVar5 = gVar.f4592b;
        if (gVar5 != null) {
            gVar5.f4591a = gVar2;
            gVar2.f4592b = gVar5;
            gVar.f4592b = null;
        }
        if (this.f4603f.f4595e != gVar2.f4595e) {
            return 0;
        }
        this.f4603f = gVar2;
        return 0;
    }

    private int c(g gVar) {
        int i10;
        if (this.f4601d != 0) {
            long j10 = gVar.f4595e;
            g gVar2 = this.f4603f;
            if (j10 > gVar2.f4595e || (i10 = gVar.f4596f) > gVar2.f4596f) {
                gVar.f4591a = gVar2;
                gVar2.f4592b = gVar;
                this.f4603f = gVar;
            } else {
                if (!f(j10, i10) && this.f4598a.f4642p > -1) {
                    return -1;
                }
                g gVar3 = this.f4603f;
                while (gVar3 != null && gVar3.f4595e > gVar.f4595e) {
                    gVar3 = gVar3.f4591a;
                }
                if (gVar3 == null) {
                    g gVar4 = this.f4602e;
                    if (gVar4 != null) {
                        gVar4.f4593c = gVar;
                    }
                    gVar.f4592b = gVar4;
                    this.f4602e = gVar;
                } else {
                    long j11 = gVar3.f4595e;
                    long j12 = gVar.f4595e;
                    if (j11 == j12 && this.f4598a.f4641o && gVar.f4596f != gVar3.f4596f) {
                        int iB = b(gVar3, gVar);
                        if (iB != 0) {
                            return iB;
                        }
                    } else {
                        if (j11 == j12 && gVar.f4596f == gVar3.f4596f) {
                            return -1;
                        }
                        gVar.f4591a = gVar3;
                        g gVar5 = gVar3.f4592b;
                        gVar.f4592b = gVar5;
                        if (gVar5 != null) {
                            gVar5.f4591a = gVar;
                        }
                        gVar3.f4592b = gVar;
                        if (j12 > this.f4603f.f4595e) {
                            this.f4603f = gVar;
                        }
                    }
                }
            }
        } else {
            if (gVar.f4596f == this.f4604g && gVar.f4595e == this.f4605h) {
                return -1;
            }
            this.f4603f = gVar;
            this.f4602e = gVar;
        }
        this.f4601d++;
        return 0;
    }

    private c d() {
        g gVar = this.f4602e;
        if (gVar == null) {
            return null;
        }
        int i10 = gVar.f4596f;
        int i11 = this.f4604g;
        if (i10 != i11 + 1 && i10 != 0 && this.f4601d <= this.f4598a.f4642p && i11 >= 0) {
            return null;
        }
        c cVar = new c(gVar, this.f4600c, this.f4598a.f4644r.h(gVar.f4597g.i()));
        g(gVar, cVar.f4559l);
        return cVar;
    }

    private int e(g gVar) {
        int i10;
        int i11;
        int i12 = this.f4601d;
        if (i12 == 0) {
            this.f4603f = gVar;
            this.f4602e = gVar;
            this.f4601d = 1;
            return 0;
        }
        long j10 = gVar.f4595e;
        g gVar2 = this.f4603f;
        if (j10 <= gVar2.f4595e && ((i10 = gVar.f4596f) <= (i11 = gVar2.f4596f) || i10 - i11 >= 10)) {
            return -1;
        }
        gVar.f4591a = gVar2;
        gVar2.f4592b = gVar;
        this.f4603f = gVar;
        this.f4601d = i12 + 1;
        return 0;
    }

    private void g(g gVar, int i10) {
        int i11 = this.f4601d;
        if (1 == i11) {
            this.f4603f = null;
            this.f4602e = null;
        } else {
            g gVar2 = this.f4602e.f4592b;
            this.f4602e = gVar2;
            if (gVar2 != null) {
                gVar2.f4591a = null;
            }
        }
        this.f4601d = i11 - 1;
        this.f4604g = i10;
        this.f4605h = gVar.f4595e;
    }

    private c i() {
        g gVar = this.f4602e;
        if (gVar == null) {
            return null;
        }
        g(gVar, gVar.f4596f);
        return new c(gVar, this.f4600c, this.f4598a.f4644r.h(gVar.f4597g.i()));
    }

    private int j(g gVar) {
        g gVar2 = this.f4602e;
        if (gVar2 == null) {
            this.f4602e = gVar;
            this.f4603f = gVar;
            return 0;
        }
        gVar2.f4591a = gVar;
        gVar.f4592b = gVar2;
        this.f4602e = gVar;
        return 0;
    }

    protected synchronized int a(x xVar) {
        if (xVar == null) {
            System.out.println("! PktBuffer.addPkt(aPkt) aPkt was null");
            return -5;
        }
        xVar.l();
        g gVar = new g(xVar);
        if (xVar.k() != this.f4599b) {
            System.out.println("PktBuffer.addPkt() SSRCs don't match!");
        }
        int i10 = this.f4598a.f4642p;
        return i10 > 0 ? c(gVar) : i10 == 0 ? e(gVar) : i10 == -1 ? j(gVar) : 0;
    }

    protected boolean f(long j10, int i10) {
        int i11 = this.f4604g;
        if (i11 == -1) {
            return true;
        }
        if (i10 >= i11) {
            if (i11 < 3 && j10 < this.f4605h) {
                return false;
            }
        } else if (i10 > 3 || j10 < this.f4605h) {
            return false;
        }
        return true;
    }

    protected synchronized c h() {
        if (this.f4598a.f4642p > 0) {
            return d();
        }
        return i();
    }
}
