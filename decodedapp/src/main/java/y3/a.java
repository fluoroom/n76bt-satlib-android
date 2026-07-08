package y3;

import b6.d;
import com.facebook.stetho.websocket.CloseCodes;
import w3.c;
import w3.f;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z3.a f32365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z3.a f32366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final short[] f32367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final short[] f32368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final short[] f32369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f32370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f32371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f32372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f32373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d f32374m;

    public a(int i10, int i11, short s10) {
        super(null);
        short s11 = (short) (s10 / 2);
        this.f32365d = new z3.a(i11, 2.0d, s11);
        this.f32366e = new z3.a(i11, 2.0d, s11);
        int i12 = ((i10 - 100) * i11) / CloseCodes.NORMAL_CLOSURE;
        int i13 = i11 / 25;
        int i14 = i13 + (i13 / 10);
        if (i12 < i14) {
            this.f32370i = i14;
        } else {
            this.f32370i = i12;
        }
        int i15 = this.f32370i;
        this.f32371j = (i15 * 5) / 100;
        this.f32367f = new short[i15];
        this.f32368g = new short[i15];
        short[] sArr = new short[(i11 * 100) / CloseCodes.NORMAL_CLOSURE];
        this.f32369h = sArr;
        this.f32374m = new d((i15 + sArr.length) * 2);
    }

    private void g() {
        String str = this.f32372k;
        if (str == null || str.length() == this.f32373l) {
            return;
        }
        while (this.f32373l < this.f32372k.length()) {
            char cCharAt = this.f32372k.charAt(this.f32373l);
            if (this.f32374m.b() < this.f32370i + this.f32369h.length) {
                return;
            }
            if (i(cCharAt)) {
                this.f32365d.e(this.f32367f, 0, this.f32370i);
                this.f32366e.e(this.f32368g, 0, this.f32370i);
                for (int i10 = 0; i10 < this.f32370i; i10++) {
                    short[] sArr = this.f32367f;
                    sArr[i10] = (short) (sArr[i10] + this.f32368g[i10]);
                }
                f.b(this.f32367f, 0, this.f32371j, 0.0f, 1.0f);
                short[] sArr2 = this.f32367f;
                int length = sArr2.length;
                int i11 = this.f32371j;
                f.b(sArr2, length - i11, i11, 1.0f, 0.0f);
                this.f32374m.o(this.f32367f, 0, this.f32370i);
            } else {
                d dVar = this.f32374m;
                short[] sArr3 = this.f32369h;
                dVar.o(sArr3, 0, sArr3.length);
            }
            d dVar2 = this.f32374m;
            short[] sArr4 = this.f32369h;
            dVar2.o(sArr4, 0, sArr4.length);
            this.f32373l++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1060)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean i(char r7) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.a.i(char):boolean");
    }

    @Override // w3.c
    public int e(short[] sArr, int i10, int i11) {
        if (i11 > this.f32374m.c()) {
            g();
        }
        return this.f32374m.l(sArr, i10, i11);
    }

    public void h(String str) {
        this.f32372k = str;
        this.f32373l = 0;
    }
}
