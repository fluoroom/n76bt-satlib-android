package v;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import v.e;
import w.b;

/* JADX INFO: loaded from: classes.dex */
public class f extends m {
    private int O0;
    int S0;
    int T0;
    int U0;
    int V0;
    w.b M0 = new w.b(this);
    public w.e N0 = new w.e(this);
    protected b.InterfaceC0410b P0 = null;
    private boolean Q0 = false;
    protected s.d R0 = new s.d();
    public int W0 = 0;
    public int X0 = 0;
    c[] Y0 = new c[4];
    c[] Z0 = new c[4];

    /* JADX INFO: renamed from: a1 */
    public boolean f29394a1 = false;

    /* JADX INFO: renamed from: b1 */
    public boolean f29395b1 = false;

    /* JADX INFO: renamed from: c1 */
    public boolean f29396c1 = false;

    /* JADX INFO: renamed from: d1 */
    public int f29397d1 = 0;

    /* JADX INFO: renamed from: e1 */
    public int f29398e1 = 0;

    /* JADX INFO: renamed from: f1 */
    private int f29399f1 = 257;

    /* JADX INFO: renamed from: g1 */
    public boolean f29400g1 = false;

    /* JADX INFO: renamed from: h1 */
    private boolean f29401h1 = false;

    /* JADX INFO: renamed from: i1 */
    private boolean f29402i1 = false;

    /* JADX INFO: renamed from: j1 */
    int f29403j1 = 0;

    /* JADX INFO: renamed from: k1 */
    private WeakReference f29404k1 = null;

    /* JADX INFO: renamed from: l1 */
    private WeakReference f29405l1 = null;

    /* JADX INFO: renamed from: m1 */
    private WeakReference f29406m1 = null;

    /* JADX INFO: renamed from: n1 */
    private WeakReference f29407n1 = null;

    /* JADX INFO: renamed from: o1 */
    HashSet f29408o1 = new HashSet();

    /* JADX INFO: renamed from: p1 */
    public b.a f29409p1 = new b.a();

    private void B1(d dVar, s.i iVar) {
        this.R0.h(iVar, this.R0.q(dVar), 0, 5);
    }

    private void C1(d dVar, s.i iVar) {
        this.R0.h(this.R0.q(dVar), iVar, 0, 5);
    }

    private void D1(e eVar) {
        int i10 = this.X0 + 1;
        c[] cVarArr = this.Y0;
        if (i10 >= cVarArr.length) {
            this.Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Y0[this.X0] = new c(eVar, 1, R1());
        this.X0++;
    }

    public static boolean U1(int i10, e eVar, b.InterfaceC0410b interfaceC0410b, b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0410b == null) {
            return false;
        }
        if (eVar.V() == 8 || (eVar instanceof h) || (eVar instanceof a)) {
            aVar.f30890e = 0;
            aVar.f30891f = 0;
            return false;
        }
        aVar.f30886a = eVar.A();
        aVar.f30887b = eVar.T();
        aVar.f30888c = eVar.W();
        aVar.f30889d = eVar.x();
        aVar.f30894i = false;
        aVar.f30895j = i11;
        e.b bVar = aVar.f30886a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f30887b == bVar2;
        boolean z12 = z10 && eVar.f29343d0 > 0.0f;
        boolean z13 = z11 && eVar.f29343d0 > 0.0f;
        if (z10 && eVar.a0(0) && eVar.f29380w == 0 && !z12) {
            aVar.f30886a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f29382x == 0) {
                aVar.f30886a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.a0(1) && eVar.f29382x == 0 && !z13) {
            aVar.f30887b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f29380w == 0) {
                aVar.f30887b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.n0()) {
            aVar.f30886a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.o0()) {
            aVar.f30887b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f29384y[0] == 4) {
                aVar.f30886a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar3 = aVar.f30887b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i13 = aVar.f30889d;
                } else {
                    aVar.f30886a = e.b.WRAP_CONTENT;
                    interfaceC0410b.b(eVar, aVar);
                    i13 = aVar.f30891f;
                }
                aVar.f30886a = bVar4;
                aVar.f30888c = (int) (eVar.v() * i13);
            }
        }
        if (z13) {
            if (eVar.f29384y[1] == 4) {
                aVar.f30887b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar5 = aVar.f30886a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i12 = aVar.f30888c;
                } else {
                    aVar.f30887b = e.b.WRAP_CONTENT;
                    interfaceC0410b.b(eVar, aVar);
                    i12 = aVar.f30890e;
                }
                aVar.f30887b = bVar6;
                if (eVar.w() == -1) {
                    aVar.f30889d = (int) (i12 / eVar.v());
                } else {
                    aVar.f30889d = (int) (eVar.v() * i12);
                }
            }
        }
        interfaceC0410b.b(eVar, aVar);
        eVar.l1(aVar.f30890e);
        eVar.M0(aVar.f30891f);
        eVar.L0(aVar.f30893h);
        eVar.B0(aVar.f30892g);
        aVar.f30895j = b.a.f30883k;
        return aVar.f30894i;
    }

    private void W1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    private void y1(e eVar) {
        int i10 = this.W0 + 1;
        c[] cVarArr = this.Z0;
        if (i10 >= cVarArr.length) {
            this.Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Z0[this.W0] = new c(eVar, 0, R1());
        this.W0++;
    }

    public void A1(d dVar) {
        WeakReference weakReference = this.f29405l1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f29405l1.get()).e()) {
            this.f29405l1 = new WeakReference(dVar);
        }
    }

    void E1(d dVar) {
        WeakReference weakReference = this.f29406m1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f29406m1.get()).e()) {
            this.f29406m1 = new WeakReference(dVar);
        }
    }

    void F1(d dVar) {
        WeakReference weakReference = this.f29404k1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f29404k1.get()).e()) {
            this.f29404k1 = new WeakReference(dVar);
        }
    }

    public boolean G1(boolean z10) {
        return this.N0.f(z10);
    }

    public boolean H1(boolean z10) {
        return this.N0.g(z10);
    }

    public boolean I1(boolean z10, int i10) {
        return this.N0.h(z10, i10);
    }

    public void J1(s.e eVar) {
        this.R0.v(eVar);
    }

    public b.InterfaceC0410b K1() {
        return this.P0;
    }

    public int L1() {
        return this.f29399f1;
    }

    public s.d M1() {
        return this.R0;
    }

    public boolean N1() {
        return false;
    }

    @Override // v.e
    public void O(StringBuilder sb2) {
        sb2.append(this.f29364o + ":{\n");
        sb2.append("  actualWidth:" + this.f29339b0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f29341c0);
        sb2.append("\n");
        Iterator it = s1().iterator();
        while (it.hasNext()) {
            ((e) it.next()).O(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public void O1() {
        this.N0.j();
    }

    public void P1() {
        this.N0.k();
    }

    public boolean Q1() {
        return this.f29402i1;
    }

    public boolean R1() {
        return this.Q0;
    }

    public boolean S1() {
        return this.f29401h1;
    }

    public long T1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.S0 = i17;
        this.T0 = i18;
        return this.M0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean V1(int i10) {
        return (this.f29399f1 & i10) == i10;
    }

    public void X1(b.InterfaceC0410b interfaceC0410b) {
        this.P0 = interfaceC0410b;
        this.N0.n(interfaceC0410b);
    }

    public void Y1(int i10) {
        this.f29399f1 = i10;
        s.d.f26231s = V1(WXMediaMessage.TITLE_LENGTH_LIMIT);
    }

    public void Z1(int i10) {
        this.O0 = i10;
    }

    public void a2(boolean z10) {
        this.Q0 = z10;
    }

    public boolean b2(s.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zV1 = V1(64);
        r1(dVar, zV1);
        int size = this.L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.L0.get(i10);
            eVar.r1(dVar, zV1);
            if (eVar.c0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void c2() {
        this.M0.e(this);
    }

    @Override // v.e
    public void q1(boolean z10, boolean z11) {
        super.q1(z10, z11);
        int size = this.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.L0.get(i10)).q1(z10, z11);
        }
    }

    @Override // v.m, v.e
    public void t0() {
        this.R0.E();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.f29400g1 = false;
        super.t0();
    }

    /* JADX WARN: Removed duplicated region for block: B:321:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x031c A[PHI: r13 r19
      0x031c: PHI (r13v9 boolean) = (r13v8 boolean), (r13v11 boolean), (r13v11 boolean), (r13v11 boolean) binds: [B:350:0x02da, B:359:0x0301, B:360:0x0303, B:362:0x0309] A[DONT_GENERATE, DONT_INLINE]
      0x031c: PHI (r19v4 boolean) = (r19v3 boolean), (r19v6 boolean), (r19v6 boolean), (r19v6 boolean) binds: [B:350:0x02da, B:359:0x0301, B:360:0x0303, B:362:0x0309] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0322  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // v.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t1() {
        /*
            Method dump skipped, instruction units count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.t1():void");
    }

    void w1(e eVar, int i10) {
        if (i10 == 0) {
            y1(eVar);
        } else if (i10 == 1) {
            D1(eVar);
        }
    }

    public boolean x1(s.d dVar) {
        f fVar;
        s.d dVar2;
        boolean zV1 = V1(64);
        g(dVar, zV1);
        int size = this.L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.L0.get(i10);
            eVar.T0(0, false);
            eVar.T0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = (e) this.L0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).z1();
                }
            }
        }
        this.f29408o1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = (e) this.L0.get(i12);
            if (eVar3.f()) {
                if (eVar3 instanceof l) {
                    this.f29408o1.add(eVar3);
                } else {
                    eVar3.g(dVar, zV1);
                }
            }
        }
        while (this.f29408o1.size() > 0) {
            int size2 = this.f29408o1.size();
            Iterator it = this.f29408o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) ((e) it.next());
                if (lVar.w1(this.f29408o1)) {
                    lVar.g(dVar, zV1);
                    this.f29408o1.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f29408o1.size()) {
                Iterator it2 = this.f29408o1.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).g(dVar, zV1);
                }
                this.f29408o1.clear();
            }
        }
        if (s.d.f26231s) {
            HashSet<e> hashSet = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = (e) this.L0.get(i13);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            fVar = this;
            dVar2 = dVar;
            fVar.e(this, dVar2, hashSet, A() == e.b.WRAP_CONTENT ? 0 : 1, false);
            for (e eVar5 : hashSet) {
                k.a(this, dVar2, eVar5);
                eVar5.g(dVar2, zV1);
            }
        } else {
            fVar = this;
            dVar2 = dVar;
            for (int i14 = 0; i14 < size; i14++) {
                e eVar6 = (e) fVar.L0.get(i14);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.Q0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.h1(e.b.FIXED);
                    }
                    eVar6.g(dVar2, zV1);
                    if (bVar == bVar3) {
                        eVar6.Q0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.h1(bVar2);
                    }
                } else {
                    k.a(this, dVar2, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar2, zV1);
                    }
                }
            }
        }
        if (fVar.W0 > 0) {
            b.b(this, dVar2, null, 0);
        }
        if (fVar.X0 > 0) {
            b.b(this, dVar2, null, 1);
        }
        return true;
    }

    public void z1(d dVar) {
        WeakReference weakReference = this.f29407n1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f29407n1.get()).e()) {
            this.f29407n1 = new WeakReference(dVar);
        }
    }
}
