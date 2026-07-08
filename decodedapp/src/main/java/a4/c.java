package a4;

import b6.d;
import w3.f;

/* JADX INFO: loaded from: classes.dex */
public class c extends w3.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final short[] f314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f315i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final short[] f316j;

    public c(int i10, int i11, double d10, short s10) {
        super(null);
        int i12 = (i11 * 60) / (i10 * 50);
        this.f310d = i12;
        this.f313g = new d(i12 * 30);
        z3.a aVar = new z3.a(i11, d10, s10);
        short[] sArr = new short[i12];
        this.f314h = sArr;
        this.f316j = new short[i12];
        short[] sArr2 = new short[i12 * 3];
        this.f315i = sArr2;
        aVar.e(sArr, 0, sArr.length);
        aVar.h();
        aVar.e(sArr2, 0, sArr2.length);
        int i13 = 0;
        while (true) {
            int i14 = this.f310d;
            if (i13 >= i14) {
                int i15 = i14 / 20;
                f.b(this.f314h, 0, i15, 0.0f, 1.0f);
                short[] sArr3 = this.f314h;
                f.b(sArr3, sArr3.length - i15, i15, 1.0f, 0.0f);
                f.b(this.f315i, 0, i15, 0.0f, 1.0f);
                short[] sArr4 = this.f315i;
                f.b(sArr4, sArr4.length - i15, i15, 1.0f, 0.0f);
                return;
            }
            this.f316j[i13] = 0;
            i13++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f311e
            if (r0 == 0) goto L75
            int r0 = r0.length()
            int r1 = r3.f312f
            if (r0 != r1) goto Ld
            goto L75
        Ld:
            int r0 = r3.f312f
            java.lang.String r1 = r3.f311e
            int r1 = r1.length()
            if (r0 >= r1) goto L75
            java.lang.String r0 = r3.f311e
            int r1 = r3.f312f
            char r0 = r0.charAt(r1)
            b6.d r1 = r3.f313g
            int r1 = r1.b()
            r2 = 32
            if (r0 == r2) goto L59
            switch(r0) {
                case 45: goto L43;
                case 46: goto L2d;
                case 47: goto L59;
                default: goto L2c;
            }
        L2c:
            goto L6e
        L2d:
            int r0 = r3.f310d
            int r0 = r0 * 2
            if (r1 >= r0) goto L34
            goto L75
        L34:
            b6.d r0 = r3.f313g
            short[] r1 = r3.f314h
            r0.n(r1)
            b6.d r0 = r3.f313g
            short[] r1 = r3.f316j
            r0.n(r1)
            goto L6e
        L43:
            int r0 = r3.f310d
            int r0 = r0 * 4
            if (r1 >= r0) goto L4a
            goto L75
        L4a:
            b6.d r0 = r3.f313g
            short[] r1 = r3.f315i
            r0.n(r1)
            b6.d r0 = r3.f313g
            short[] r1 = r3.f316j
            r0.n(r1)
            goto L6e
        L59:
            int r0 = r3.f310d
            int r0 = r0 * 2
            if (r1 >= r0) goto L60
            goto L75
        L60:
            b6.d r0 = r3.f313g
            short[] r1 = r3.f316j
            r0.n(r1)
            b6.d r0 = r3.f313g
            short[] r1 = r3.f316j
            r0.n(r1)
        L6e:
            int r0 = r3.f312f
            int r0 = r0 + 1
            r3.f312f = r0
            goto Ld
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.c.g():void");
    }

    @Override // w3.c
    public int e(short[] sArr, int i10, int i11) {
        if (i11 > this.f313g.c()) {
            g();
        }
        return this.f313g.l(sArr, i10, i11);
    }

    public void h(String str) {
        this.f311e = a.b(str);
        this.f312f = 0;
    }
}
