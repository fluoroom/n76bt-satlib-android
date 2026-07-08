package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.k;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class x extends k {

    /* JADX INFO: renamed from: a0 */
    int f3458a0;
    ArrayList Y = new ArrayList();
    private boolean Z = true;

    /* JADX INFO: renamed from: b0 */
    boolean f3459b0 = false;

    /* JADX INFO: renamed from: c0 */
    private int f3460c0 = 0;

    class a extends t {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ k f3461a;

        a(k kVar) {
            this.f3461a = kVar;
        }

        @Override // androidx.transition.t, androidx.transition.k.i
        public void g(k kVar) {
            this.f3461a.k0();
            kVar.g0(this);
        }
    }

    class b extends t {
        b() {
        }

        @Override // androidx.transition.t, androidx.transition.k.i
        public void j(k kVar) {
            x.this.Y.remove(kVar);
            if (x.this.Q()) {
                return;
            }
            x.this.c0(k.j.f3447c, false);
            x xVar = x.this;
            xVar.K = true;
            xVar.c0(k.j.f3446b, false);
        }
    }

    static class c extends t {

        /* JADX INFO: renamed from: a */
        x f3464a;

        c(x xVar) {
            this.f3464a = xVar;
        }

        @Override // androidx.transition.t, androidx.transition.k.i
        public void c(k kVar) {
            x xVar = this.f3464a;
            if (xVar.f3459b0) {
                return;
            }
            xVar.s0();
            this.f3464a.f3459b0 = true;
        }

        @Override // androidx.transition.t, androidx.transition.k.i
        public void g(k kVar) {
            x xVar = this.f3464a;
            int i10 = xVar.f3458a0 - 1;
            xVar.f3458a0 = i10;
            if (i10 == 0) {
                xVar.f3459b0 = false;
                xVar.w();
            }
            kVar.g0(this);
        }
    }

    private int A0(long j10) {
        for (int i10 = 1; i10 < this.Y.size(); i10++) {
            if (((k) this.Y.get(i10)).T > j10) {
                return i10 - 1;
            }
        }
        return this.Y.size() - 1;
    }

    private void H0() {
        c cVar = new c(this);
        Iterator it = this.Y.iterator();
        while (it.hasNext()) {
            ((k) it.next()).d(cVar);
        }
        this.f3458a0 = this.Y.size();
    }

    private void x0(k kVar) {
        this.Y.add(kVar);
        kVar.A = this;
    }

    @Override // androidx.transition.k
    /* JADX INFO: renamed from: B0 */
    public x g0(k.i iVar) {
        return (x) super.g0(iVar);
    }

    @Override // androidx.transition.k
    /* JADX INFO: renamed from: C0 */
    public x h0(View view) {
        for (int i10 = 0; i10 < this.Y.size(); i10++) {
            ((k) this.Y.get(i10)).h0(view);
        }
        return (x) super.h0(view);
    }

    @Override // androidx.transition.k
    /* JADX INFO: renamed from: D0 */
    public x m0(long j10) {
        ArrayList arrayList;
        super.m0(j10);
        if (this.f3411c >= 0 && (arrayList = this.Y) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((k) this.Y.get(i10)).m0(j10);
            }
        }
        return this;
    }

    @Override // androidx.transition.k
    /* JADX INFO: renamed from: E0 */
    public x o0(TimeInterpolator timeInterpolator) {
        this.f3460c0 |= 1;
        ArrayList arrayList = this.Y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((k) this.Y.get(i10)).o0(timeInterpolator);
            }
        }
        return (x) super.o0(timeInterpolator);
    }

    public x F0(int i10) {
        if (i10 == 0) {
            this.Z = true;
            return this;
        }
        if (i10 == 1) {
            this.Z = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    @Override // androidx.transition.k
    /* JADX INFO: renamed from: G0 */
    public x r0(long j10) {
        return (x) super.r0(j10);
    }

    @Override // androidx.transition.k
    boolean Q() {
        for (int i10 = 0; i10 < this.Y.size(); i10++) {
            if (((k) this.Y.get(i10)).Q()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.k
    public boolean R() {
        int size = this.Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((k) this.Y.get(i10)).R()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.k
    protected void cancel() {
        super.cancel();
        int size = this.Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k) this.Y.get(i10)).cancel();
        }
    }

    @Override // androidx.transition.k
    public void d0(View view) {
        super.d0(view);
        int size = this.Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k) this.Y.get(i10)).d0(view);
        }
    }

    @Override // androidx.transition.k
    void f0() {
        this.R = 0L;
        b bVar = new b();
        for (int i10 = 0; i10 < this.Y.size(); i10++) {
            k kVar = (k) this.Y.get(i10);
            kVar.d(bVar);
            kVar.f0();
            long jN = kVar.N();
            if (this.Z) {
                this.R = Math.max(this.R, jN);
            } else {
                long j10 = this.R;
                kVar.T = j10;
                this.R = j10 + jN;
            }
        }
    }

    @Override // androidx.transition.k
    public void i0(View view) {
        super.i0(view);
        int size = this.Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k) this.Y.get(i10)).i0(view);
        }
    }

    @Override // androidx.transition.k
    public void j(z zVar) {
        if (U(zVar.f3467b)) {
            for (k kVar : this.Y) {
                if (kVar.U(zVar.f3467b)) {
                    kVar.j(zVar);
                    zVar.f3468c.add(kVar);
                }
            }
        }
    }

    @Override // androidx.transition.k
    protected void k0() {
        if (this.Y.isEmpty()) {
            s0();
            w();
            return;
        }
        H0();
        if (this.Z) {
            Iterator it = this.Y.iterator();
            while (it.hasNext()) {
                ((k) it.next()).k0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.Y.size(); i10++) {
            ((k) this.Y.get(i10 - 1)).d(new a((k) this.Y.get(i10)));
        }
        k kVar = (k) this.Y.get(0);
        if (kVar != null) {
            kVar.k0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void l0(long r20, long r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r5 = r0.N()
            androidx.transition.x r7 = r0.A
            r8 = 0
            if (r7 == 0) goto L22
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 >= 0) goto L18
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 < 0) goto Lc2
        L18:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L22
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L22
            goto Lc2
        L22:
            r7 = 0
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 >= 0) goto L29
            r12 = 1
            goto L2a
        L29:
            r12 = 0
        L2a:
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 < 0) goto L32
            int r14 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r14 < 0) goto L3a
        L32:
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 > 0) goto L41
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 <= 0) goto L41
        L3a:
            r0.K = r7
            androidx.transition.k$j r14 = androidx.transition.k.j.f3445a
            r0.c0(r14, r12)
        L41:
            boolean r14 = r0.Z
            if (r14 == 0) goto L5e
        L45:
            java.util.ArrayList r11 = r0.Y
            int r11 = r11.size()
            if (r7 >= r11) goto L5b
            java.util.ArrayList r11 = r0.Y
            java.lang.Object r11 = r11.get(r7)
            androidx.transition.k r11 = (androidx.transition.k) r11
            r11.l0(r1, r3)
            int r7 = r7 + 1
            goto L45
        L5b:
            r16 = r8
            goto La6
        L5e:
            int r7 = r0.A0(r3)
            if (r11 < 0) goto L89
        L64:
            java.util.ArrayList r11 = r0.Y
            int r11 = r11.size()
            if (r7 >= r11) goto L5b
            java.util.ArrayList r11 = r0.Y
            java.lang.Object r11 = r11.get(r7)
            androidx.transition.k r11 = (androidx.transition.k) r11
            long r14 = r11.T
            r16 = r8
            long r8 = r1 - r14
            int r18 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r18 >= 0) goto L7f
            goto La6
        L7f:
            long r14 = r3 - r14
            r11.l0(r8, r14)
            int r7 = r7 + 1
            r8 = r16
            goto L64
        L89:
            r16 = r8
        L8b:
            if (r7 < 0) goto La6
            java.util.ArrayList r8 = r0.Y
            java.lang.Object r8 = r8.get(r7)
            androidx.transition.k r8 = (androidx.transition.k) r8
            long r14 = r8.T
            long r10 = r1 - r14
            long r14 = r3 - r14
            r8.l0(r10, r14)
            int r8 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r8 < 0) goto La3
            goto La6
        La3:
            int r7 = r7 + (-1)
            goto L8b
        La6:
            androidx.transition.x r7 = r0.A
            if (r7 == 0) goto Lc2
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto Lb2
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lb8
        Lb2:
            if (r13 >= 0) goto Lc2
            int r1 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r1 < 0) goto Lc2
        Lb8:
            if (r7 <= 0) goto Lbd
            r9 = 1
            r0.K = r9
        Lbd:
            androidx.transition.k$j r1 = androidx.transition.k.j.f3446b
            r0.c0(r1, r12)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.x.l0(long, long):void");
    }

    @Override // androidx.transition.k
    void m(z zVar) {
        super.m(zVar);
        int size = this.Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k) this.Y.get(i10)).m(zVar);
        }
    }

    @Override // androidx.transition.k
    public void n(z zVar) {
        if (U(zVar.f3467b)) {
            for (k kVar : this.Y) {
                if (kVar.U(zVar.f3467b)) {
                    kVar.n(zVar);
                    zVar.f3468c.add(kVar);
                }
            }
        }
    }

    @Override // androidx.transition.k
    public void n0(k.f fVar) {
        super.n0(fVar);
        this.f3460c0 |= 8;
        int size = this.Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k) this.Y.get(i10)).n0(fVar);
        }
    }

    @Override // androidx.transition.k
    public void p0(g gVar) {
        super.p0(gVar);
        this.f3460c0 |= 4;
        if (this.Y != null) {
            for (int i10 = 0; i10 < this.Y.size(); i10++) {
                ((k) this.Y.get(i10)).p0(gVar);
            }
        }
    }

    @Override // androidx.transition.k
    public void q0(v vVar) {
        super.q0(vVar);
        this.f3460c0 |= 2;
        int size = this.Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k) this.Y.get(i10)).q0(vVar);
        }
    }

    @Override // androidx.transition.k
    /* JADX INFO: renamed from: r */
    public k clone() {
        x xVar = (x) super.clone();
        xVar.Y = new ArrayList();
        int size = this.Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            xVar.x0(((k) this.Y.get(i10)).clone());
        }
        return xVar;
    }

    @Override // androidx.transition.k
    String t0(String str) {
        String strT0 = super.t0(str);
        for (int i10 = 0; i10 < this.Y.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strT0);
            sb2.append("\n");
            sb2.append(((k) this.Y.get(i10)).t0(str + "  "));
            strT0 = sb2.toString();
        }
        return strT0;
    }

    @Override // androidx.transition.k
    void u(ViewGroup viewGroup, a0 a0Var, a0 a0Var2, ArrayList arrayList, ArrayList arrayList2) {
        long jI = I();
        int size = this.Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            k kVar = (k) this.Y.get(i10);
            if (jI > 0 && (this.Z || i10 == 0)) {
                long jI2 = kVar.I();
                if (jI2 > 0) {
                    kVar.r0(jI2 + jI);
                } else {
                    kVar.r0(jI);
                }
            }
            kVar.u(viewGroup, a0Var, a0Var2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.k
    /* JADX INFO: renamed from: u0 */
    public x d(k.i iVar) {
        return (x) super.d(iVar);
    }

    @Override // androidx.transition.k
    /* JADX INFO: renamed from: v0 */
    public x f(View view) {
        for (int i10 = 0; i10 < this.Y.size(); i10++) {
            ((k) this.Y.get(i10)).f(view);
        }
        return (x) super.f(view);
    }

    public x w0(k kVar) {
        x0(kVar);
        long j10 = this.f3411c;
        if (j10 >= 0) {
            kVar.m0(j10);
        }
        if ((this.f3460c0 & 1) != 0) {
            kVar.o0(B());
        }
        if ((this.f3460c0 & 2) != 0) {
            F();
            kVar.q0(null);
        }
        if ((this.f3460c0 & 4) != 0) {
            kVar.p0(E());
        }
        if ((this.f3460c0 & 8) != 0) {
            kVar.n0(A());
        }
        return this;
    }

    @Override // androidx.transition.k
    public k x(Class cls, boolean z10) {
        for (int i10 = 0; i10 < this.Y.size(); i10++) {
            ((k) this.Y.get(i10)).x(cls, z10);
        }
        return super.x(cls, z10);
    }

    public k y0(int i10) {
        if (i10 < 0 || i10 >= this.Y.size()) {
            return null;
        }
        return (k) this.Y.get(i10);
    }

    public int z0() {
        return this.Y.size();
    }
}
