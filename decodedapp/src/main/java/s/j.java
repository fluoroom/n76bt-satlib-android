package s;

import java.util.Arrays;
import s.b;

/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static float f26291n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26292a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26293b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26294c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f26295d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f26296e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f26297f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float[] f26298g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int[] f26299h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f26300i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f26301j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f26302k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f26303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final c f26304m;

    j(b bVar, c cVar) {
        this.f26303l = bVar;
        this.f26304m = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f26270c % this.f26294c;
        int[] iArr2 = this.f26295d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f26296e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f26296e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f26297f[i10] = iVar.f26270c;
        this.f26298g[i10] = f10;
        this.f26299h[i10] = -1;
        this.f26300i[i10] = -1;
        iVar.a(this.f26303l);
        iVar.f26280v++;
        this.f26301j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f26293b; i10++) {
            if (this.f26297f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f26293b * 2;
        this.f26297f = Arrays.copyOf(this.f26297f, i10);
        this.f26298g = Arrays.copyOf(this.f26298g, i10);
        this.f26299h = Arrays.copyOf(this.f26299h, i10);
        this.f26300i = Arrays.copyOf(this.f26300i, i10);
        this.f26296e = Arrays.copyOf(this.f26296e, i10);
        for (int i11 = this.f26293b; i11 < i10; i11++) {
            this.f26297f[i11] = -1;
            this.f26296e[i11] = -1;
        }
        this.f26293b = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int iN = n();
        m(iN, iVar, f10);
        if (i10 != -1) {
            this.f26299h[iN] = i10;
            int[] iArr = this.f26300i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f26299h[iN] = -1;
            if (this.f26301j > 0) {
                this.f26300i[iN] = this.f26302k;
                this.f26302k = iN;
            } else {
                this.f26300i[iN] = -1;
            }
        }
        int i11 = this.f26300i[iN];
        if (i11 != -1) {
            this.f26299h[i11] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f26270c;
        int i12 = i11 % this.f26294c;
        int[] iArr2 = this.f26295d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f26297f[i13] == i11) {
            int[] iArr3 = this.f26296e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f26296e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f26297f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f26297f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // s.b.a
    public void a(i iVar, float f10) {
        float f11 = f26291n;
        if (f10 > (-f11) && f10 < f11) {
            d(iVar, true);
            return;
        }
        if (this.f26301j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f26302k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f26298g[iP] = f10;
            return;
        }
        if (this.f26301j + 1 >= this.f26293b) {
            o();
        }
        int i10 = this.f26301j;
        int i11 = this.f26302k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f26297f[i11];
            int i15 = iVar.f26270c;
            if (i14 == i15) {
                this.f26298g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f26300i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // s.b.a
    public int b() {
        return this.f26301j;
    }

    @Override // s.b.a
    public float c(b bVar, boolean z10) {
        float f10 = f(bVar.f26221a);
        d(bVar.f26221a, z10);
        j jVar = (j) bVar.f26225e;
        int iB = jVar.b();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iB) {
            int i12 = jVar.f26297f[i11];
            if (i12 != -1) {
                k(this.f26304m.f26230d[i12], jVar.f26298g[i11] * f10, z10);
                i10++;
            }
            i11++;
        }
        return f10;
    }

    @Override // s.b.a
    public void clear() {
        int i10 = this.f26301j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarE = e(i11);
            if (iVarE != null) {
                iVarE.f(this.f26303l);
            }
        }
        for (int i12 = 0; i12 < this.f26293b; i12++) {
            this.f26297f[i12] = -1;
            this.f26296e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f26294c; i13++) {
            this.f26295d[i13] = -1;
        }
        this.f26301j = 0;
        this.f26302k = -1;
    }

    @Override // s.b.a
    public float d(i iVar, boolean z10) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f26298g[iP];
        if (this.f26302k == iP) {
            this.f26302k = this.f26300i[iP];
        }
        this.f26297f[iP] = -1;
        int[] iArr = this.f26299h;
        int i10 = iArr[iP];
        if (i10 != -1) {
            int[] iArr2 = this.f26300i;
            iArr2[i10] = iArr2[iP];
        }
        int i11 = this.f26300i[iP];
        if (i11 != -1) {
            iArr[i11] = iArr[iP];
        }
        this.f26301j--;
        iVar.f26280v--;
        if (z10) {
            iVar.f(this.f26303l);
        }
        return f10;
    }

    @Override // s.b.a
    public i e(int i10) {
        int i11 = this.f26301j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f26302k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f26304m.f26230d[this.f26297f[i12]];
            }
            i12 = this.f26300i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // s.b.a
    public float f(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f26298g[iP];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public void g() {
        int i10 = this.f26301j;
        int i11 = this.f26302k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f26298g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f26300i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // s.b.a
    public float h(int i10) {
        int i11 = this.f26301j;
        int i12 = this.f26302k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f26298g[i12];
            }
            i12 = this.f26300i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // s.b.a
    public boolean i(i iVar) {
        return p(iVar) != -1;
    }

    @Override // s.b.a
    public void j(float f10) {
        int i10 = this.f26301j;
        int i11 = this.f26302k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f26298g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f26300i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // s.b.a
    public void k(i iVar, float f10, boolean z10) {
        float f11 = f26291n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iP = p(iVar);
            if (iP == -1) {
                a(iVar, f10);
                return;
            }
            float[] fArr = this.f26298g;
            float f12 = fArr[iP] + f10;
            fArr[iP] = f12;
            float f13 = f26291n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iP] = 0.0f;
            d(iVar, z10);
        }
    }

    public int p(i iVar) {
        if (this.f26301j != 0 && iVar != null) {
            int i10 = iVar.f26270c;
            int i11 = this.f26295d[i10 % this.f26294c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f26297f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f26296e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f26297f[i11] != i10);
            if (i11 != -1 && this.f26297f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f26301j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarE = e(i11);
            if (iVarE != null) {
                String str2 = str + iVarE + " = " + h(i11) + " ";
                int iP = p(iVarE);
                String str3 = str2 + "[p: ";
                String str4 = (this.f26299h[iP] != -1 ? str3 + this.f26304m.f26230d[this.f26297f[this.f26299h[iP]]] : str3 + "none") + ", n: ";
                str = (this.f26300i[iP] != -1 ? str4 + this.f26304m.f26230d[this.f26297f[this.f26300i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
