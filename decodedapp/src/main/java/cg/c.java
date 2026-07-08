package cg;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import he.b;
import he.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends ke.i implements b {
    private final gf.e O;
    private final jf.d P;
    private final jf.h Q;
    private final jf.j R;
    private final s S;

    public /* synthetic */ c(he.e eVar, he.l lVar, ie.h hVar, boolean z10, b.a aVar, gf.e eVar2, jf.d dVar, jf.h hVar2, jf.j jVar, s sVar, g1 g1Var, int i10, rd.h hVar3) {
        this(eVar, lVar, hVar, z10, aVar, eVar2, dVar, hVar2, jVar, sVar, (i10 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? null : g1Var);
    }

    @Override // ke.s, he.d0
    public boolean A() {
        return false;
    }

    @Override // ke.s, he.z
    public boolean R() {
        return false;
    }

    @Override // cg.t
    public jf.h V() {
        return this.Q;
    }

    @Override // cg.t
    public jf.d a0() {
        return this.P;
    }

    @Override // cg.t
    public s c0() {
        return this.S;
    }

    @Override // ke.s, he.z
    public boolean isInline() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ke.i
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c o1(he.m mVar, he.z zVar, b.a aVar, mf.f fVar, ie.h hVar, g1 g1Var) {
        rd.m.e(mVar, "newOwner");
        rd.m.e(aVar, "kind");
        rd.m.e(hVar, "annotations");
        rd.m.e(g1Var, "source");
        c cVar = new c((he.e) mVar, (he.l) zVar, hVar, this.N, aVar, H(), a0(), V(), u1(), c0(), g1Var);
        cVar.Y0(Q0());
        return cVar;
    }

    @Override // ke.s, he.z
    public boolean t() {
        return false;
    }

    @Override // cg.t
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public gf.e H() {
        return this.O;
    }

    public jf.j u1() {
        return this.R;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public c(he.e r12, he.l r13, ie.h r14, boolean r15, he.b.a r16, gf.e r17, jf.d r18, jf.h r19, jf.j r20, cg.s r21, he.g1 r22) {
        /*
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "containingDeclaration"
            rd.m.e(r12, r0)
            java.lang.String r0 = "annotations"
            rd.m.e(r14, r0)
            java.lang.String r0 = "kind"
            r5 = r16
            rd.m.e(r5, r0)
            java.lang.String r0 = "proto"
            rd.m.e(r7, r0)
            java.lang.String r0 = "nameResolver"
            rd.m.e(r8, r0)
            java.lang.String r0 = "typeTable"
            rd.m.e(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            rd.m.e(r10, r0)
            if (r22 != 0) goto L38
            he.g1 r0 = he.g1.f15281a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L3f
        L38:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L3f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.O = r7
            r11.P = r8
            r11.Q = r9
            r11.R = r10
            r1 = r21
            r11.S = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.c.<init>(he.e, he.l, ie.h, boolean, he.b$a, gf.e, jf.d, jf.h, jf.j, cg.s, he.g1):void");
    }
}
