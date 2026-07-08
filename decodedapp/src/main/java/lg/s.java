package lg;

import eg.r0;
import he.b1;
import he.k1;
import he.s1;
import java.util.List;
import lg.a0;
import lg.k;
import lg.v;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f20613a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f20614b;

    static {
        mf.f fVar = t.f20632k;
        k.b bVar = k.b.f20602b;
        h hVar = new h(fVar, new f[]{bVar, new a0.a(1)}, (qd.l) null, 4, (rd.h) null);
        h hVar2 = new h(t.f20633l, new f[]{bVar, new a0.a(2)}, p.f20610a);
        mf.f fVar2 = t.f20617b;
        m mVar = m.f20604a;
        a0.a aVar = new a0.a(2);
        j jVar = j.f20598a;
        h hVar3 = new h(fVar2, new f[]{bVar, mVar, aVar, jVar}, (qd.l) null, 4, (rd.h) null);
        h hVar4 = new h(t.f20619c, new f[]{bVar, mVar, new a0.a(3), jVar}, (qd.l) null, 4, (rd.h) null);
        h hVar5 = new h(t.f20621d, new f[]{bVar, mVar, new a0.b(2), jVar}, (qd.l) null, 4, (rd.h) null);
        h hVar6 = new h(t.f20630i, new f[]{bVar}, (qd.l) null, 4, (rd.h) null);
        mf.f fVar3 = t.f20629h;
        a0.d dVar = a0.d.f20578b;
        v.a aVar2 = v.a.f20652d;
        h hVar7 = new h(fVar3, new f[]{bVar, dVar, mVar, aVar2}, (qd.l) null, 4, (rd.h) null);
        mf.f fVar4 = t.f20631j;
        a0.c cVar = a0.c.f20577b;
        f20614b = ed.q.n(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, new h(fVar4, new f[]{bVar, cVar}, (qd.l) null, 4, (rd.h) null), new h(t.f20634m, new f[]{bVar, cVar}, (qd.l) null, 4, (rd.h) null), new h(t.f20635n, new f[]{bVar, cVar, aVar2}, (qd.l) null, 4, (rd.h) null), new h(t.H, new f[]{bVar, dVar, mVar}, (qd.l) null, 4, (rd.h) null), new h(t.I, new f[]{bVar, dVar, mVar}, (qd.l) null, 4, (rd.h) null), new h(t.f20623e, new f[]{k.a.f20601b}, q.f20611a), new h(t.f20627g, new f[]{bVar, v.b.f20653d, dVar, mVar}, (qd.l) null, 4, (rd.h) null), new h(t.X, new f[]{bVar, dVar, mVar}, (qd.l) null, 4, (rd.h) null), new h(t.W, new f[]{bVar, cVar}, (qd.l) null, 4, (rd.h) null), new h(ed.q.n(t.f20645x, t.f20646y), new f[]{bVar}, r.f20612a), new h(t.f20620c0, new f[]{bVar, v.c.f20654d, dVar, mVar}, (qd.l) null, 4, (rd.h) null), new h(t.f20637p, new f[]{bVar, cVar}, (qd.l) null, 4, (rd.h) null));
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(he.z zVar) {
        rd.m.e(zVar, "$this$Checks");
        List listI = zVar.i();
        rd.m.d(listI, "getValueParameters(...)");
        s1 s1Var = (s1) ed.q.m0(listI);
        boolean z10 = false;
        if (s1Var != null && !uf.e.f(s1Var) && s1Var.k0() == null) {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[EDGE_INSN: B:27:0x004b->B:17:0x004b BREAK  A[LOOP:0: B:8:0x0028->B:28:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String g(he.z r3) {
        /*
            java.lang.String r0 = "$this$Checks"
            rd.m.e(r3, r0)
            he.m r0 = r3.b()
            java.lang.String r1 = "getContainingDeclaration(...)"
            rd.m.d(r0, r1)
            boolean r0 = h(r0)
            if (r0 != 0) goto L4b
            java.util.Collection r0 = r3.e()
            java.lang.String r2 = "getOverriddenDescriptors(...)"
            rd.m.d(r0, r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L24
            goto L42
        L24:
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r0.next()
            he.z r2 = (he.z) r2
            he.m r2 = r2.b()
            rd.m.d(r2, r1)
            boolean r2 = h(r2)
            if (r2 == 0) goto L28
            goto L4b
        L42:
            boolean r0 = he.s.c(r3)
            if (r0 == 0) goto L49
            goto L4b
        L49:
            r0 = 0
            goto L4c
        L4b:
            r0 = 1
        L4c:
            if (r0 != 0) goto La1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "must override ''equals()'' in Any"
            r0.append(r2)
            he.m r2 = r3.b()
            rd.m.d(r2, r1)
            boolean r1 = qf.k.g(r2)
            if (r1 == 0) goto L9c
            pf.n r1 = pf.n.f24182j
            he.m r3 = r3.b()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            rd.m.c(r3, r2)
            he.e r3 = (he.e) r3
            eg.c1 r3 = r3.s()
            java.lang.String r2 = "getDefaultType(...)"
            rd.m.d(r3, r2)
            eg.r0 r3 = jg.d.D(r3)
            java.lang.String r3 = r1.S(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " or define ''equals(other: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "): Boolean''"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
        L9c:
            java.lang.String r3 = r0.toString()
            return r3
        La1:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.s.g(he.z):java.lang.String");
    }

    private static final boolean h(he.m mVar) {
        return (mVar instanceof he.e) && ee.i.b0((he.e) mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(he.z zVar) {
        boolean zW;
        rd.m.e(zVar, "$this$Checks");
        b1 b1VarG0 = zVar.g0();
        if (b1VarG0 == null) {
            b1VarG0 = zVar.l0();
        }
        s sVar = f20613a;
        boolean z10 = false;
        if (b1VarG0 != null) {
            r0 r0VarG = zVar.g();
            if (r0VarG != null) {
                r0 type = b1VarG0.getType();
                rd.m.d(type, "getType(...)");
                zW = jg.d.w(r0VarG, type);
            } else {
                zW = false;
            }
            if (zW || sVar.j(zVar, b1VarG0)) {
                z10 = true;
            }
        }
        if (z10) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }

    private final boolean j(he.z zVar, b1 b1Var) {
        mf.b bVarN;
        r0 r0VarG;
        yf.g value = b1Var.getValue();
        rd.m.d(value, "getValue(...)");
        if (!(value instanceof yf.e)) {
            return false;
        }
        he.e eVarR = ((yf.e) value).r();
        if (!eVarR.M() || (bVarN = uf.e.n(eVarR)) == null) {
            return false;
        }
        he.h hVarC = he.y.c(uf.e.s(eVarR), bVarN);
        k1 k1Var = hVarC instanceof k1 ? (k1) hVarC : null;
        if (k1Var == null || (r0VarG = zVar.g()) == null) {
            return false;
        }
        return jg.d.w(r0VarG, k1Var.X());
    }

    @Override // lg.b
    public List b() {
        return f20614b;
    }
}
