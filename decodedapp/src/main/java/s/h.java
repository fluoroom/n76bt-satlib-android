package s;

import java.util.Arrays;
import java.util.Comparator;
import s.b;

/* JADX INFO: loaded from: classes.dex */
public class h extends s.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i[] f26259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i[] f26260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f26261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b f26262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    c f26263l;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f26270c - iVar2.f26270c;
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f26265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f26266b;

        b(h hVar) {
            this.f26266b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f26265a.f26268a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f26276r[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f26265a.f26276r[i10] = f12;
                    } else {
                        this.f26265a.f26276r[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f26265a.f26276r;
                float f13 = fArr[i11] + (iVar.f26276r[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f26265a.f26276r[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f26265a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f26265a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f26265a.f26276r[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.f26276r[i10];
                float f11 = this.f26265a.f26276r[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f26265a.f26276r, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f26265a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f26265a.f26276r[i10] + " ";
                }
            }
            return str + "] " + this.f26265a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f26258g = 128;
        this.f26259h = new i[128];
        this.f26260i = new i[128];
        this.f26261j = 0;
        this.f26262k = new b(this);
        this.f26263l = cVar;
    }

    private void F(i iVar) {
        int i10;
        int i11 = this.f26261j + 1;
        i[] iVarArr = this.f26259h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f26259h = iVarArr2;
            this.f26260i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f26259h;
        int i12 = this.f26261j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f26261j = i13;
        if (i13 > 1 && iVarArr3[i12].f26270c > iVar.f26270c) {
            int i14 = 0;
            while (true) {
                i10 = this.f26261j;
                if (i14 >= i10) {
                    break;
                }
                this.f26260i[i14] = this.f26259h[i14];
                i14++;
            }
            Arrays.sort(this.f26260i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f26261j; i15++) {
                this.f26259h[i15] = this.f26260i[i15];
            }
        }
        iVar.f26268a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f26261j) {
            if (this.f26259h[i10] == iVar) {
                while (true) {
                    int i11 = this.f26261j;
                    if (i10 >= i11 - 1) {
                        this.f26261j = i11 - 1;
                        iVar.f26268a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f26259h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // s.b
    public void B(d dVar, s.b bVar, boolean z10) {
        i iVar = bVar.f26221a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f26225e;
        int iB = aVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            i iVarE = aVar.e(i10);
            float fH = aVar.h(i10);
            this.f26262k.b(iVarE);
            if (this.f26262k.a(iVar, fH)) {
                F(iVarE);
            }
            this.f26222b += bVar.f26222b * fH;
        }
        G(iVar);
    }

    @Override // s.b, s.d.a
    public void a(i iVar) {
        this.f26262k.b(iVar);
        this.f26262k.e();
        iVar.f26276r[iVar.f26272e] = 1.0f;
        F(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // s.b, s.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s.i b(s.d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = -1
        L3:
            int r2 = r4.f26261j
            if (r0 >= r2) goto L32
            s.i[] r2 = r4.f26259h
            r2 = r2[r0]
            int r3 = r2.f26270c
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            s.h$b r3 = r4.f26262k
            r3.b(r2)
            if (r1 != r5) goto L22
            s.h$b r2 = r4.f26262k
            boolean r2 = r2.c()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            s.h$b r2 = r4.f26262k
            s.i[] r3 = r4.f26259h
            r3 = r3[r1]
            boolean r2 = r2.d(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            s.i[] r5 = r4.f26259h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.b(s.d, boolean[]):s.i");
    }

    @Override // s.b, s.d.a
    public void clear() {
        this.f26261j = 0;
        this.f26222b = 0.0f;
    }

    @Override // s.b, s.d.a
    public boolean isEmpty() {
        return this.f26261j == 0;
    }

    @Override // s.b
    public String toString() {
        String str = " goal -> (" + this.f26222b + ") : ";
        for (int i10 = 0; i10 < this.f26261j; i10++) {
            this.f26262k.b(this.f26259h[i10]);
            str = str + this.f26262k + " ";
        }
        return str;
    }
}
