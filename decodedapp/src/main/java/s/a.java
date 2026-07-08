package s;

import java.util.Arrays;
import s.b;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f26209l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f26211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f26212c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f26210a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26213d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f26214e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f26215f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f26216g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f26217h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f26218i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f26219j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f26220k = false;

    a(b bVar, c cVar) {
        this.f26211b = bVar;
        this.f26212c = cVar;
    }

    @Override // s.b.a
    public final void a(i iVar, float f10) {
        if (f10 == 0.0f) {
            d(iVar, true);
            return;
        }
        int i10 = this.f26218i;
        if (i10 == -1) {
            this.f26218i = 0;
            this.f26217h[0] = f10;
            this.f26215f[0] = iVar.f26270c;
            this.f26216g[0] = -1;
            iVar.f26280v++;
            iVar.a(this.f26211b);
            this.f26210a++;
            if (this.f26220k) {
                return;
            }
            int i11 = this.f26219j + 1;
            this.f26219j = i11;
            int[] iArr = this.f26215f;
            if (i11 >= iArr.length) {
                this.f26220k = true;
                this.f26219j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f26210a; i13++) {
            int i14 = this.f26215f[i10];
            int i15 = iVar.f26270c;
            if (i14 == i15) {
                this.f26217h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f26216g[i10];
        }
        int length = this.f26219j;
        int i16 = length + 1;
        if (this.f26220k) {
            int[] iArr2 = this.f26215f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f26215f;
        if (length >= iArr3.length && this.f26210a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f26215f;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f26215f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f26213d * 2;
            this.f26213d = i18;
            this.f26220k = false;
            this.f26219j = length - 1;
            this.f26217h = Arrays.copyOf(this.f26217h, i18);
            this.f26215f = Arrays.copyOf(this.f26215f, this.f26213d);
            this.f26216g = Arrays.copyOf(this.f26216g, this.f26213d);
        }
        this.f26215f[length] = iVar.f26270c;
        this.f26217h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f26216g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f26216g[length] = this.f26218i;
            this.f26218i = length;
        }
        iVar.f26280v++;
        iVar.a(this.f26211b);
        int i19 = this.f26210a + 1;
        this.f26210a = i19;
        if (!this.f26220k) {
            this.f26219j++;
        }
        int[] iArr7 = this.f26215f;
        if (i19 >= iArr7.length) {
            this.f26220k = true;
        }
        if (this.f26219j >= iArr7.length) {
            this.f26220k = true;
            this.f26219j = iArr7.length - 1;
        }
    }

    @Override // s.b.a
    public int b() {
        return this.f26210a;
    }

    @Override // s.b.a
    public float c(b bVar, boolean z10) {
        float f10 = f(bVar.f26221a);
        d(bVar.f26221a, z10);
        b.a aVar = bVar.f26225e;
        int iB = aVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            i iVarE = aVar.e(i10);
            k(iVarE, aVar.f(iVarE) * f10, z10);
        }
        return f10;
    }

    @Override // s.b.a
    public final void clear() {
        int i10 = this.f26218i;
        for (int i11 = 0; i10 != -1 && i11 < this.f26210a; i11++) {
            i iVar = this.f26212c.f26230d[this.f26215f[i10]];
            if (iVar != null) {
                iVar.f(this.f26211b);
            }
            i10 = this.f26216g[i10];
        }
        this.f26218i = -1;
        this.f26219j = -1;
        this.f26220k = false;
        this.f26210a = 0;
    }

    @Override // s.b.a
    public final float d(i iVar, boolean z10) {
        if (this.f26214e == iVar) {
            this.f26214e = null;
        }
        int i10 = this.f26218i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f26210a) {
            if (this.f26215f[i10] == iVar.f26270c) {
                if (i10 == this.f26218i) {
                    this.f26218i = this.f26216g[i10];
                } else {
                    int[] iArr = this.f26216g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.f(this.f26211b);
                }
                iVar.f26280v--;
                this.f26210a--;
                this.f26215f[i10] = -1;
                if (this.f26220k) {
                    this.f26219j = i10;
                }
                return this.f26217h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f26216g[i10];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public i e(int i10) {
        int i11 = this.f26218i;
        for (int i12 = 0; i11 != -1 && i12 < this.f26210a; i12++) {
            if (i12 == i10) {
                return this.f26212c.f26230d[this.f26215f[i11]];
            }
            i11 = this.f26216g[i11];
        }
        return null;
    }

    @Override // s.b.a
    public final float f(i iVar) {
        int i10 = this.f26218i;
        for (int i11 = 0; i10 != -1 && i11 < this.f26210a; i11++) {
            if (this.f26215f[i10] == iVar.f26270c) {
                return this.f26217h[i10];
            }
            i10 = this.f26216g[i10];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public void g() {
        int i10 = this.f26218i;
        for (int i11 = 0; i10 != -1 && i11 < this.f26210a; i11++) {
            float[] fArr = this.f26217h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f26216g[i10];
        }
    }

    @Override // s.b.a
    public float h(int i10) {
        int i11 = this.f26218i;
        for (int i12 = 0; i11 != -1 && i12 < this.f26210a; i12++) {
            if (i12 == i10) {
                return this.f26217h[i11];
            }
            i11 = this.f26216g[i11];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public boolean i(i iVar) {
        int i10 = this.f26218i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f26210a; i11++) {
            if (this.f26215f[i10] == iVar.f26270c) {
                return true;
            }
            i10 = this.f26216g[i10];
        }
        return false;
    }

    @Override // s.b.a
    public void j(float f10) {
        int i10 = this.f26218i;
        for (int i11 = 0; i10 != -1 && i11 < this.f26210a; i11++) {
            float[] fArr = this.f26217h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f26216g[i10];
        }
    }

    @Override // s.b.a
    public void k(i iVar, float f10, boolean z10) {
        float f11 = f26209l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f26218i;
            if (i10 == -1) {
                this.f26218i = 0;
                this.f26217h[0] = f10;
                this.f26215f[0] = iVar.f26270c;
                this.f26216g[0] = -1;
                iVar.f26280v++;
                iVar.a(this.f26211b);
                this.f26210a++;
                if (this.f26220k) {
                    return;
                }
                int i11 = this.f26219j + 1;
                this.f26219j = i11;
                int[] iArr = this.f26215f;
                if (i11 >= iArr.length) {
                    this.f26220k = true;
                    this.f26219j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f26210a; i13++) {
                int i14 = this.f26215f[i10];
                int i15 = iVar.f26270c;
                if (i14 == i15) {
                    float[] fArr = this.f26217h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f26209l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f26218i) {
                            this.f26218i = this.f26216g[i10];
                        } else {
                            int[] iArr2 = this.f26216g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.f(this.f26211b);
                        }
                        if (this.f26220k) {
                            this.f26219j = i10;
                        }
                        iVar.f26280v--;
                        this.f26210a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f26216g[i10];
            }
            int length = this.f26219j;
            int i16 = length + 1;
            if (this.f26220k) {
                int[] iArr3 = this.f26215f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f26215f;
            if (length >= iArr4.length && this.f26210a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f26215f;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f26215f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f26213d * 2;
                this.f26213d = i18;
                this.f26220k = false;
                this.f26219j = length - 1;
                this.f26217h = Arrays.copyOf(this.f26217h, i18);
                this.f26215f = Arrays.copyOf(this.f26215f, this.f26213d);
                this.f26216g = Arrays.copyOf(this.f26216g, this.f26213d);
            }
            this.f26215f[length] = iVar.f26270c;
            this.f26217h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f26216g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f26216g[length] = this.f26218i;
                this.f26218i = length;
            }
            iVar.f26280v++;
            iVar.a(this.f26211b);
            this.f26210a++;
            if (!this.f26220k) {
                this.f26219j++;
            }
            int i19 = this.f26219j;
            int[] iArr8 = this.f26215f;
            if (i19 >= iArr8.length) {
                this.f26220k = true;
                this.f26219j = iArr8.length - 1;
            }
        }
    }

    public String toString() {
        int i10 = this.f26218i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f26210a; i11++) {
            str = ((str + " -> ") + this.f26217h[i10] + " : ") + this.f26212c.f26230d[this.f26215f[i10]];
            i10 = this.f26216g[i10];
        }
        return str;
    }
}
