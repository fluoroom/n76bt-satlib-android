package cg;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import he.b;
import he.f1;
import he.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends ke.o0 implements b {
    private final gf.j N;
    private final jf.d O;
    private final jf.h P;
    private final jf.j Q;
    private final s R;

    public /* synthetic */ o0(he.m mVar, f1 f1Var, ie.h hVar, mf.f fVar, b.a aVar, gf.j jVar, jf.d dVar, jf.h hVar2, jf.j jVar2, s sVar, g1 g1Var, int i10, rd.h hVar3) {
        this(mVar, f1Var, hVar, fVar, aVar, jVar, dVar, hVar2, jVar2, sVar, (i10 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? null : g1Var);
    }

    @Override // ke.o0, ke.s
    /* JADX INFO: renamed from: L0 */
    protected ke.s o1(he.m mVar, he.z zVar, b.a aVar, mf.f fVar, ie.h hVar, g1 g1Var) {
        mf.f fVar2;
        rd.m.e(mVar, "newOwner");
        rd.m.e(aVar, "kind");
        rd.m.e(hVar, "annotations");
        rd.m.e(g1Var, "source");
        f1 f1Var = (f1) zVar;
        if (fVar == null) {
            mf.f name = getName();
            rd.m.d(name, "getName(...)");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        o0 o0Var = new o0(mVar, f1Var, hVar, fVar2, aVar, H(), a0(), V(), q1(), c0(), g1Var);
        o0Var.Y0(Q0());
        return o0Var;
    }

    @Override // cg.t
    public jf.h V() {
        return this.P;
    }

    @Override // cg.t
    public jf.d a0() {
        return this.O;
    }

    @Override // cg.t
    public s c0() {
        return this.R;
    }

    @Override // cg.t
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public gf.j H() {
        return this.N;
    }

    public jf.j q1() {
        return this.Q;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public o0(he.m r12, he.f1 r13, ie.h r14, mf.f r15, he.b.a r16, gf.j r17, jf.d r18, jf.h r19, jf.j r20, cg.s r21, he.g1 r22) {
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
            java.lang.String r0 = "name"
            rd.m.e(r15, r0)
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
            if (r22 != 0) goto L3d
            he.g1 r0 = he.g1.f15281a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L44
        L3d:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L44:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.N = r7
            r11.O = r8
            r11.P = r9
            r11.Q = r10
            r1 = r21
            r11.R = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.o0.<init>(he.m, he.f1, ie.h, mf.f, he.b$a, gf.j, jf.d, jf.h, jf.j, cg.s, he.g1):void");
    }
}
