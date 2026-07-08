package h6;

import e6.l;
import e6.m;

/* JADX INFO: loaded from: classes.dex */
public class c extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final c f15145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected c f15146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f15147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected b f15148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f15149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f15150i;

    protected c(int i10, c cVar, b bVar, boolean z10) {
        this.f11558a = i10;
        this.f15145d = cVar;
        this.f15148g = bVar;
        this.f11559b = -1;
        this.f15149h = z10;
        this.f15150i = false;
    }

    public static c q(b bVar) {
        return new c(0, null, bVar, true);
    }

    @Override // e6.l
    public final String b() {
        return this.f15147f;
    }

    @Override // e6.l
    public Object c() {
        return null;
    }

    protected void m(StringBuilder sb2) {
        c cVar = this.f15145d;
        if (cVar != null) {
            cVar.m(sb2);
        }
        int i10 = this.f11558a;
        if (i10 != 2) {
            if (i10 != 1) {
                sb2.append("/");
                return;
            }
            sb2.append('[');
            sb2.append(a());
            sb2.append(']');
            return;
        }
        sb2.append('{');
        if (this.f15147f != null) {
            sb2.append('\"');
            sb2.append(this.f15147f);
            sb2.append('\"');
        } else {
            sb2.append('?');
        }
        sb2.append('}');
    }

    public b n(b bVar) {
        int i10 = this.f11558a;
        if (i10 == 2) {
            return bVar;
        }
        int i11 = this.f11559b + 1;
        this.f11559b = i11;
        return i10 == 1 ? bVar.f(i11) : bVar.j(i11);
    }

    public c o(b bVar, boolean z10) {
        c cVar = this.f15146e;
        if (cVar != null) {
            return cVar.x(1, bVar, z10);
        }
        c cVar2 = new c(1, this, bVar, z10);
        this.f15146e = cVar2;
        return cVar2;
    }

    public c p(b bVar, boolean z10) {
        c cVar = this.f15146e;
        if (cVar != null) {
            return cVar.x(2, bVar, z10);
        }
        c cVar2 = new c(2, this, bVar, z10);
        this.f15146e = cVar2;
        return cVar2;
    }

    public c r(c cVar) {
        c cVar2 = this.f15145d;
        if (cVar2 == cVar) {
            return this;
        }
        while (cVar2 != null) {
            c cVar3 = cVar2.f15145d;
            if (cVar3 == cVar) {
                return cVar2;
            }
            cVar2 = cVar3;
        }
        return null;
    }

    public b s() {
        return this.f15148g;
    }

    @Override // e6.l
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final c f() {
        return this.f15145d;
    }

    @Override // e6.l
    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        m(sb2);
        return sb2.toString();
    }

    public boolean u() {
        return this.f15147f != null;
    }

    public boolean v() {
        return this.f15149h;
    }

    public m w() {
        if (!this.f15149h) {
            this.f15149h = true;
            return this.f11558a == 2 ? m.START_OBJECT : m.START_ARRAY;
        }
        if (!this.f15150i || this.f11558a != 2) {
            return null;
        }
        this.f15150i = false;
        return m.FIELD_NAME;
    }

    protected c x(int i10, b bVar, boolean z10) {
        this.f11558a = i10;
        this.f15148g = bVar;
        this.f11559b = -1;
        this.f15147f = null;
        this.f15149h = z10;
        this.f15150i = false;
        return this;
    }

    public b y(String str) {
        this.f15147f = str;
        this.f15150i = true;
        return this.f15148g;
    }

    @Override // e6.l
    public void k(Object obj) {
    }
}
