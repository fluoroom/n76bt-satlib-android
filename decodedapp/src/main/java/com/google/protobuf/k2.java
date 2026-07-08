package com.google.protobuf;

import com.google.protobuf.a;

/* JADX INFO: loaded from: classes3.dex */
public class k2 implements a.b {

    /* JADX INFO: renamed from: a */
    private a.b f9115a;

    /* JADX INFO: renamed from: b */
    private a.AbstractC0131a f9116b;

    /* JADX INFO: renamed from: c */
    private a f9117c;

    /* JADX INFO: renamed from: d */
    private boolean f9118d;

    public k2(a aVar, a.b bVar, boolean z10) {
        this.f9117c = (a) o0.a(aVar);
        this.f9115a = bVar;
        this.f9118d = z10;
    }

    private void i() {
        a.b bVar;
        if (this.f9116b != null) {
            this.f9117c = null;
        }
        if (!this.f9118d || (bVar = this.f9115a) == null) {
            return;
        }
        bVar.a();
        this.f9118d = false;
    }

    @Override // com.google.protobuf.a.b
    public void a() {
        i();
    }

    public a b() {
        this.f9118d = true;
        return f();
    }

    public k2 c() {
        a aVar = this.f9117c;
        this.f9117c = (a) (aVar != null ? aVar.getDefaultInstanceForType() : this.f9116b.getDefaultInstanceForType());
        a.AbstractC0131a abstractC0131a = this.f9116b;
        if (abstractC0131a != null) {
            abstractC0131a.dispose();
            this.f9116b = null;
        }
        i();
        this.f9118d = true;
        return this;
    }

    public void d() {
        this.f9115a = null;
    }

    public a.AbstractC0131a e() {
        if (this.f9116b == null) {
            a.AbstractC0131a abstractC0131a = (a.AbstractC0131a) this.f9117c.newBuilderForType(this);
            this.f9116b = abstractC0131a;
            abstractC0131a.mergeFrom((i1) this.f9117c);
            this.f9116b.markClean();
        }
        return this.f9116b;
    }

    public a f() {
        if (this.f9117c == null) {
            this.f9117c = (a) this.f9116b.buildPartial();
        }
        return this.f9117c;
    }

    public o1 g() {
        a.AbstractC0131a abstractC0131a = this.f9116b;
        return abstractC0131a != null ? abstractC0131a : this.f9117c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.protobuf.k2 h(com.google.protobuf.a r3) {
        /*
            r2 = this;
            com.google.protobuf.a$a r0 = r2.f9116b
            if (r0 != 0) goto Lf
            com.google.protobuf.a r0 = r2.f9117c
            com.google.protobuf.i1 r1 = r0.getDefaultInstanceForType()
            if (r0 != r1) goto Lf
            r2.f9117c = r3
            goto L16
        Lf:
            com.google.protobuf.a$a r0 = r2.e()
            r0.mergeFrom(r3)
        L16:
            r2.i()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k2.h(com.google.protobuf.a):com.google.protobuf.k2");
    }

    public k2 j(a aVar) {
        this.f9117c = (a) o0.a(aVar);
        a.AbstractC0131a abstractC0131a = this.f9116b;
        if (abstractC0131a != null) {
            abstractC0131a.dispose();
            this.f9116b = null;
        }
        i();
        return this;
    }
}
