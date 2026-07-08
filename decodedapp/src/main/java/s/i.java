package s;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class i implements Comparable {
    private static int A = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26269b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f26273f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    a f26277s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26270c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f26271d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26272e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26274g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float[] f26275h = new float[9];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    float[] f26276r = new float[9];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    b[] f26278t = new b[16];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f26279u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f26280v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f26281w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f26282x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    float f26283y = 0.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    HashSet f26284z = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f26277s = aVar;
    }

    static void e() {
        A++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f26279u;
            if (i10 >= i11) {
                b[] bVarArr = this.f26278t;
                if (i11 >= bVarArr.length) {
                    this.f26278t = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f26278t;
                int i12 = this.f26279u;
                bVarArr2[i12] = bVar;
                this.f26279u = i12 + 1;
                return;
            }
            if (this.f26278t[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f26270c - iVar.f26270c;
    }

    public final void f(b bVar) {
        int i10 = this.f26279u;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f26278t[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f26278t;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f26279u--;
                return;
            }
            i11++;
        }
    }

    public void g() {
        this.f26269b = null;
        this.f26277s = a.UNKNOWN;
        this.f26272e = 0;
        this.f26270c = -1;
        this.f26271d = -1;
        this.f26273f = 0.0f;
        this.f26274g = false;
        this.f26281w = false;
        this.f26282x = -1;
        this.f26283y = 0.0f;
        int i10 = this.f26279u;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f26278t[i11] = null;
        }
        this.f26279u = 0;
        this.f26280v = 0;
        this.f26268a = false;
        Arrays.fill(this.f26276r, 0.0f);
    }

    public void h(d dVar, float f10) {
        this.f26273f = f10;
        this.f26274g = true;
        this.f26281w = false;
        this.f26282x = -1;
        this.f26283y = 0.0f;
        int i10 = this.f26279u;
        this.f26271d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f26278t[i11].A(dVar, this, false);
        }
        this.f26279u = 0;
    }

    public void i(a aVar, String str) {
        this.f26277s = aVar;
    }

    public final void j(d dVar, b bVar) {
        int i10 = this.f26279u;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f26278t[i11].B(dVar, bVar, false);
        }
        this.f26279u = 0;
    }

    public String toString() {
        if (this.f26269b != null) {
            return "" + this.f26269b;
        }
        return "" + this.f26270c;
    }
}
