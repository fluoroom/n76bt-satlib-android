package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.d0;
import androidx.fragment.app.w;
import androidx.lifecycle.m;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class a extends d0 implements w.l {

    /* JADX INFO: renamed from: t */
    final w f2140t;

    /* JADX INFO: renamed from: u */
    boolean f2141u;

    /* JADX INFO: renamed from: v */
    int f2142v;

    /* JADX INFO: renamed from: w */
    boolean f2143w;

    a(w wVar) {
        super(wVar.u0(), wVar.w0() != null ? wVar.w0().g().getClassLoader() : null);
        this.f2142v = -1;
        this.f2143w = false;
        this.f2140t = wVar;
    }

    void A() {
        for (int size = this.f2192c.size() - 1; size >= 0; size--) {
            d0.a aVar = (d0.a) this.f2192c.get(size);
            o oVar = aVar.f2210b;
            if (oVar != null) {
                oVar.f2401x = this.f2143w;
                oVar.J3(true);
                oVar.I3(w.i1(this.f2197h));
                oVar.L3(this.f2206q, this.f2205p);
            }
            switch (aVar.f2209a) {
                case 1:
                    oVar.D3(aVar.f2212d, aVar.f2213e, aVar.f2214f, aVar.f2215g);
                    this.f2140t.l1(oVar, true);
                    this.f2140t.e1(oVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2209a);
                case 3:
                    oVar.D3(aVar.f2212d, aVar.f2213e, aVar.f2214f, aVar.f2215g);
                    this.f2140t.j(oVar);
                    break;
                case 4:
                    oVar.D3(aVar.f2212d, aVar.f2213e, aVar.f2214f, aVar.f2215g);
                    this.f2140t.p1(oVar);
                    break;
                case 5:
                    oVar.D3(aVar.f2212d, aVar.f2213e, aVar.f2214f, aVar.f2215g);
                    this.f2140t.l1(oVar, true);
                    this.f2140t.G0(oVar);
                    break;
                case 6:
                    oVar.D3(aVar.f2212d, aVar.f2213e, aVar.f2214f, aVar.f2215g);
                    this.f2140t.n(oVar);
                    break;
                case 7:
                    oVar.D3(aVar.f2212d, aVar.f2213e, aVar.f2214f, aVar.f2215g);
                    this.f2140t.l1(oVar, true);
                    this.f2140t.x(oVar);
                    break;
                case 8:
                    this.f2140t.n1(null);
                    break;
                case 9:
                    this.f2140t.n1(oVar);
                    break;
                case 10:
                    aVar.f2217i = oVar.f2381d0;
                    this.f2140t.m1(oVar, aVar.f2216h);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.o B(java.util.ArrayList r17, androidx.fragment.app.o r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList r5 = r0.f2192c
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList r5 = r0.f2192c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.d0$a r5 = (androidx.fragment.app.d0.a) r5
            int r6 = r5.f2209a
            r7 = 1
            if (r6 == r7) goto Lb6
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L5a
            if (r6 == r10) goto L43
            r8 = 6
            if (r6 == r8) goto L43
            r8 = 7
            if (r6 == r8) goto Lb6
            r8 = 8
            if (r6 == r8) goto L31
            goto Lbb
        L31:
            java.util.ArrayList r6 = r0.f2192c
            androidx.fragment.app.d0$a r8 = new androidx.fragment.app.d0$a
            r8.<init>(r11, r3, r7)
            r6.add(r4, r8)
            r5.f2211c = r7
            int r4 = r4 + 1
            androidx.fragment.app.o r3 = r5.f2210b
            goto Lbb
        L43:
            androidx.fragment.app.o r6 = r5.f2210b
            r1.remove(r6)
            androidx.fragment.app.o r5 = r5.f2210b
            if (r5 != r3) goto Lbb
            java.util.ArrayList r3 = r0.f2192c
            androidx.fragment.app.d0$a r6 = new androidx.fragment.app.d0$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lbb
        L5a:
            androidx.fragment.app.o r6 = r5.f2210b
            int r8 = r6.J
            int r12 = r1.size()
            int r12 = r12 - r7
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.o r14 = (androidx.fragment.app.o) r14
            int r15 = r14.J
            if (r15 != r8) goto La1
            if (r14 != r6) goto L74
            r13 = 1
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList r3 = r0.f2192c
            androidx.fragment.app.d0$a r15 = new androidx.fragment.app.d0$a
            r15.<init>(r11, r14, r7)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L83:
            androidx.fragment.app.d0$a r15 = new androidx.fragment.app.d0$a
            r15.<init>(r10, r14, r7)
            int r2 = r5.f2212d
            r15.f2212d = r2
            int r2 = r5.f2214f
            r15.f2214f = r2
            int r2 = r5.f2213e
            r15.f2213e = r2
            int r2 = r5.f2215g
            r15.f2215g = r2
            java.util.ArrayList r2 = r0.f2192c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList r2 = r0.f2192c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.f2209a = r7
            r5.f2211c = r7
            r1.add(r6)
            goto Lbb
        Lb6:
            androidx.fragment.app.o r2 = r5.f2210b
            r1.add(r2)
        Lbb:
            int r4 = r4 + r7
            goto L7
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.B(java.util.ArrayList, androidx.fragment.app.o):androidx.fragment.app.o");
    }

    public String C() {
        return this.f2200k;
    }

    public void D() {
        if (this.f2208s != null) {
            for (int i10 = 0; i10 < this.f2208s.size(); i10++) {
                ((Runnable) this.f2208s.get(i10)).run();
            }
            this.f2208s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.o E(java.util.ArrayList r6, androidx.fragment.app.o r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f2192c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList r2 = r5.f2192c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.d0$a r2 = (androidx.fragment.app.d0.a) r2
            int r3 = r2.f2209a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.m$b r3 = r2.f2216h
            r2.f2217i = r3
            goto L32
        L22:
            androidx.fragment.app.o r7 = r2.f2210b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.o r2 = r2.f2210b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.o r2 = r2.f2210b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.E(java.util.ArrayList, androidx.fragment.app.o):androidx.fragment.app.o");
    }

    @Override // androidx.fragment.app.w.l
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (w.J0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2198i) {
            return true;
        }
        this.f2140t.i(this);
        return true;
    }

    @Override // androidx.fragment.app.d0
    public int h() {
        return w(false, true);
    }

    @Override // androidx.fragment.app.d0
    public int i() {
        return w(true, true);
    }

    @Override // androidx.fragment.app.d0
    public void j() {
        m();
        this.f2140t.c0(this, false);
    }

    @Override // androidx.fragment.app.d0
    public void k() {
        m();
        this.f2140t.c0(this, true);
    }

    @Override // androidx.fragment.app.d0
    public d0 l(o oVar) {
        w wVar = oVar.E;
        if (wVar == null || wVar == this.f2140t) {
            return super.l(oVar);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + oVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.d0
    void n(int i10, o oVar, String str, int i11) {
        super.n(i10, oVar, str, i11);
        oVar.E = this.f2140t;
    }

    @Override // androidx.fragment.app.d0
    public d0 o(o oVar) {
        w wVar = oVar.E;
        if (wVar == null || wVar == this.f2140t) {
            return super.o(oVar);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + oVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.d0
    public d0 s(o oVar, m.b bVar) {
        if (oVar.E != this.f2140t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f2140t);
        }
        if (bVar == m.b.f2652b && oVar.f2374a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != m.b.f2651a) {
            return super.s(oVar, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2142v >= 0) {
            sb2.append(" #");
            sb2.append(this.f2142v);
        }
        if (this.f2200k != null) {
            sb2.append(" ");
            sb2.append(this.f2200k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    void u(int i10) {
        if (this.f2198i) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f2192c.size();
            for (int i11 = 0; i11 < size; i11++) {
                d0.a aVar = (d0.a) this.f2192c.get(i11);
                o oVar = aVar.f2210b;
                if (oVar != null) {
                    oVar.D += i10;
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f2210b + " to " + aVar.f2210b.D);
                    }
                }
            }
        }
    }

    void v() {
        int size = this.f2192c.size() - 1;
        while (size >= 0) {
            d0.a aVar = (d0.a) this.f2192c.get(size);
            if (aVar.f2211c) {
                if (aVar.f2209a == 8) {
                    aVar.f2211c = false;
                    this.f2192c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f2210b.J;
                    aVar.f2209a = 2;
                    aVar.f2211c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        d0.a aVar2 = (d0.a) this.f2192c.get(i11);
                        if (aVar2.f2211c && aVar2.f2210b.J == i10) {
                            this.f2192c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    int w(boolean z10, boolean z11) {
        if (this.f2141u) {
            throw new IllegalStateException("commit already called");
        }
        if (w.J0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new j0("FragmentManager"));
            x("  ", printWriter);
            printWriter.close();
        }
        this.f2141u = true;
        if (this.f2198i) {
            this.f2142v = this.f2140t.l();
        } else {
            this.f2142v = -1;
        }
        if (z11) {
            this.f2140t.Z(this, z10);
        }
        return this.f2142v;
    }

    public void x(String str, PrintWriter printWriter) {
        y(str, printWriter, true);
    }

    public void y(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2200k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2142v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2141u);
            if (this.f2197h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2197h));
            }
            if (this.f2193d != 0 || this.f2194e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2193d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2194e));
            }
            if (this.f2195f != 0 || this.f2196g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2195f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2196g));
            }
            if (this.f2201l != 0 || this.f2202m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2201l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2202m);
            }
            if (this.f2203n != 0 || this.f2204o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2203n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2204o);
            }
        }
        if (this.f2192c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2192c.size();
        for (int i10 = 0; i10 < size; i10++) {
            d0.a aVar = (d0.a) this.f2192c.get(i10);
            switch (aVar.f2209a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f2209a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f2210b);
            if (z10) {
                if (aVar.f2212d != 0 || aVar.f2213e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2212d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2213e));
                }
                if (aVar.f2214f != 0 || aVar.f2215g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2214f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2215g));
                }
            }
        }
    }

    void z() {
        int size = this.f2192c.size();
        for (int i10 = 0; i10 < size; i10++) {
            d0.a aVar = (d0.a) this.f2192c.get(i10);
            o oVar = aVar.f2210b;
            if (oVar != null) {
                oVar.f2401x = this.f2143w;
                oVar.J3(false);
                oVar.I3(this.f2197h);
                oVar.L3(this.f2205p, this.f2206q);
            }
            switch (aVar.f2209a) {
                case 1:
                    oVar.D3(aVar.f2212d, aVar.f2213e, aVar.f2214f, aVar.f2215g);
                    this.f2140t.l1(oVar, false);
                    this.f2140t.j(oVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2209a);
                case 3:
                    oVar.D3(aVar.f2212d, aVar.f2213e, aVar.f2214f, aVar.f2215g);
                    this.f2140t.e1(oVar);
                    break;
                case 4:
                    oVar.D3(aVar.f2212d, aVar.f2213e, aVar.f2214f, aVar.f2215g);
                    this.f2140t.G0(oVar);
                    break;
                case 5:
                    oVar.D3(aVar.f2212d, aVar.f2213e, aVar.f2214f, aVar.f2215g);
                    this.f2140t.l1(oVar, false);
                    this.f2140t.p1(oVar);
                    break;
                case 6:
                    oVar.D3(aVar.f2212d, aVar.f2213e, aVar.f2214f, aVar.f2215g);
                    this.f2140t.x(oVar);
                    break;
                case 7:
                    oVar.D3(aVar.f2212d, aVar.f2213e, aVar.f2214f, aVar.f2215g);
                    this.f2140t.l1(oVar, false);
                    this.f2140t.n(oVar);
                    break;
                case 8:
                    this.f2140t.n1(oVar);
                    break;
                case 9:
                    this.f2140t.n1(null);
                    break;
                case 10:
                    aVar.f2216h = oVar.f2381d0;
                    this.f2140t.m1(oVar, aVar.f2217i);
                    break;
            }
        }
    }
}
