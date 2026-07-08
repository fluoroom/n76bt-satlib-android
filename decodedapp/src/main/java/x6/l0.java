package x6;

import d6.f;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public interface l0 {
    boolean a(k kVar);

    boolean b(i iVar);

    l0 c(f.c cVar);

    boolean d(l lVar);

    l0 e(f.b bVar);

    boolean f(l lVar);

    boolean g(l lVar);

    l0 h(f.c cVar);

    l0 i(f.c cVar);

    l0 j(f.c cVar);

    l0 k(f.c cVar);

    l0 l(d6.f fVar);

    public static class a implements l0, Serializable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected static final a f31771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected static final a f31772g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final f.c f31773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final f.c f31774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final f.c f31775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final f.c f31776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final f.c f31777e;

        static {
            f.c cVar = f.c.PUBLIC_ONLY;
            f.c cVar2 = f.c.ANY;
            f31771f = new a(cVar, cVar, cVar2, cVar2, cVar);
            f31772g = new a(cVar, cVar, cVar, cVar, cVar);
        }

        public a(f.c cVar, f.c cVar2, f.c cVar3, f.c cVar4, f.c cVar5) {
            this.f31773a = cVar;
            this.f31774b = cVar2;
            this.f31775c = cVar3;
            this.f31776d = cVar4;
            this.f31777e = cVar5;
        }

        private f.c n(f.c cVar, f.c cVar2) {
            return cVar2 == f.c.DEFAULT ? cVar : cVar2;
        }

        public static a p() {
            return f31772g;
        }

        public static a q() {
            return f31771f;
        }

        @Override // x6.l0
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public a h(f.c cVar) {
            if (cVar == f.c.DEFAULT) {
                cVar = f31771f.f31777e;
            }
            f.c cVar2 = cVar;
            return this.f31777e == cVar2 ? this : new a(this.f31773a, this.f31774b, this.f31775c, this.f31776d, cVar2);
        }

        @Override // x6.l0
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public a j(f.c cVar) {
            if (cVar == f.c.DEFAULT) {
                cVar = f31771f.f31773a;
            }
            f.c cVar2 = cVar;
            return this.f31773a == cVar2 ? this : new a(cVar2, this.f31774b, this.f31775c, this.f31776d, this.f31777e);
        }

        @Override // x6.l0
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public a k(f.c cVar) {
            if (cVar == f.c.DEFAULT) {
                cVar = f31771f.f31774b;
            }
            f.c cVar2 = cVar;
            return this.f31774b == cVar2 ? this : new a(this.f31773a, cVar2, this.f31775c, this.f31776d, this.f31777e);
        }

        @Override // x6.l0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public a c(f.c cVar) {
            if (cVar == f.c.DEFAULT) {
                cVar = f31771f.f31775c;
            }
            f.c cVar2 = cVar;
            return this.f31775c == cVar2 ? this : new a(this.f31773a, this.f31774b, cVar2, this.f31776d, this.f31777e);
        }

        @Override // x6.l0
        public boolean a(k kVar) {
            return r(kVar.n());
        }

        @Override // x6.l0
        public boolean b(i iVar) {
            return s(iVar.b());
        }

        @Override // x6.l0
        public boolean d(l lVar) {
            return v(lVar.b());
        }

        @Override // x6.l0
        public boolean f(l lVar) {
            return t(lVar.b());
        }

        @Override // x6.l0
        public boolean g(l lVar) {
            return w(lVar.b());
        }

        protected a o(f.c cVar, f.c cVar2, f.c cVar3, f.c cVar4, f.c cVar5) {
            return (cVar == this.f31773a && cVar2 == this.f31774b && cVar3 == this.f31775c && cVar4 == this.f31776d && cVar5 == this.f31777e) ? this : new a(cVar, cVar2, cVar3, cVar4, cVar5);
        }

        public boolean r(Member member) {
            return this.f31776d.a(member);
        }

        public boolean s(Field field) {
            return this.f31777e.a(field);
        }

        public boolean t(Method method) {
            return this.f31773a.a(method);
        }

        public String toString() {
            return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", this.f31773a, this.f31774b, this.f31775c, this.f31776d, this.f31777e);
        }

        public boolean v(Method method) {
            return this.f31774b.a(method);
        }

        public boolean w(Method method) {
            return this.f31775c.a(method);
        }

        @Override // x6.l0
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public a l(d6.f fVar) {
            return fVar != null ? o(n(this.f31773a, fVar.getterVisibility()), n(this.f31774b, fVar.isGetterVisibility()), n(this.f31775c, fVar.setterVisibility()), n(this.f31776d, fVar.creatorVisibility()), n(this.f31777e, fVar.fieldVisibility())) : this;
        }

        @Override // x6.l0
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public a i(f.c cVar) {
            if (cVar == f.c.DEFAULT) {
                cVar = f31771f.f31776d;
            }
            f.c cVar2 = cVar;
            return this.f31776d == cVar2 ? this : new a(this.f31773a, this.f31774b, this.f31775c, cVar2, this.f31777e);
        }

        @Override // x6.l0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public a e(f.b bVar) {
            return this;
        }
    }
}
