package gg;

import ed.q;
import eg.d2;
import eg.r0;
import he.a;
import he.b;
import he.b1;
import he.e0;
import he.f1;
import he.g1;
import he.t;
import he.u;
import he.z;
import java.util.Collection;
import java.util.List;
import ke.o0;
import ke.s;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends o0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(he.e eVar) {
        super(eVar, null, ie.h.f16054l.b(), mf.f.k(b.f14415c.d()), b.a.DECLARATION, g1.f15281a);
        rd.m.e(eVar, "containingDeclaration");
        R0(null, null, q.k(), q.k(), q.k(), l.d(k.f14485t, new String[0]), e0.f15261d, t.f15309e);
    }

    @Override // ke.o0, ke.s
    /* JADX INFO: renamed from: L0 */
    protected s o1(he.m mVar, z zVar, b.a aVar, mf.f fVar, ie.h hVar, g1 g1Var) {
        rd.m.e(mVar, "newOwner");
        rd.m.e(aVar, "kind");
        rd.m.e(hVar, "annotations");
        rd.m.e(g1Var, "source");
        return this;
    }

    @Override // ke.s, he.a
    public Object d0(a.InterfaceC0214a interfaceC0214a) {
        rd.m.e(interfaceC0214a, "key");
        return null;
    }

    @Override // ke.o0, he.b
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public f1 Q(he.m mVar, e0 e0Var, u uVar, b.a aVar, boolean z10) {
        rd.m.e(mVar, "newOwner");
        rd.m.e(e0Var, "modality");
        rd.m.e(uVar, "visibility");
        rd.m.e(aVar, "kind");
        return this;
    }

    @Override // ke.s, he.z
    public boolean t() {
        return false;
    }

    @Override // ke.o0, ke.s, he.z, he.f1
    public z.a u() {
        return new a();
    }

    @Override // ke.s, he.b
    public void x0(Collection collection) {
        rd.m.e(collection, "overriddenDescriptors");
    }

    public static final class a implements z.a {
        a() {
        }

        @Override // he.z.a
        public z.a c(List list) {
            rd.m.e(list, "parameters");
            return this;
        }

        @Override // he.z.a
        public z.a e(e0 e0Var) {
            rd.m.e(e0Var, "modality");
            return this;
        }

        @Override // he.z.a
        public z.a f(d2 d2Var) {
            rd.m.e(d2Var, "substitution");
            return this;
        }

        @Override // he.z.a
        public z.a h(u uVar) {
            rd.m.e(uVar, "visibility");
            return this;
        }

        @Override // he.z.a
        public z.a i(r0 r0Var) {
            rd.m.e(r0Var, "type");
            return this;
        }

        @Override // he.z.a
        public z.a j(he.m mVar) {
            rd.m.e(mVar, "owner");
            return this;
        }

        @Override // he.z.a
        public z.a m(a.InterfaceC0214a interfaceC0214a, Object obj) {
            rd.m.e(interfaceC0214a, "userDataKey");
            return this;
        }

        @Override // he.z.a
        public z.a n(ie.h hVar) {
            rd.m.e(hVar, "additionalAnnotations");
            return this;
        }

        @Override // he.z.a
        public z.a o(List list) {
            rd.m.e(list, "parameters");
            return this;
        }

        @Override // he.z.a
        public z.a r(mf.f fVar) {
            rd.m.e(fVar, "name");
            return this;
        }

        @Override // he.z.a
        public z.a s(b.a aVar) {
            rd.m.e(aVar, "kind");
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public f1 build() {
            return c.this;
        }

        @Override // he.z.a
        public z.a a() {
            return this;
        }

        @Override // he.z.a
        public z.a g() {
            return this;
        }

        @Override // he.z.a
        public z.a k() {
            return this;
        }

        @Override // he.z.a
        public z.a q() {
            return this;
        }

        @Override // he.z.a
        public z.a t() {
            return this;
        }

        @Override // he.z.a
        public z.a b(he.b bVar) {
            return this;
        }

        @Override // he.z.a
        public z.a d(b1 b1Var) {
            return this;
        }

        @Override // he.z.a
        public z.a l(boolean z10) {
            return this;
        }

        @Override // he.z.a
        public z.a p(b1 b1Var) {
            return this;
        }
    }
}
