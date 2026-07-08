package v4;

import android.util.Log;
import com.dw.audio.codec.Resample;
import com.dw.mdc.Decoder;
import com.dw.mdc.Packet;
import com.dw.multimon.MDecoder;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements MDecoder.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a4.b f29823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f29824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f29825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f29826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Resample f29827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Decoder f29828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MDecoder f29829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final StringBuilder f29830h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final short[] f29831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f29832s;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Packet[] f29834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w5.h[] f29835c;

        public a(String str, Packet[] packetArr, w5.h[] hVarArr) {
            rd.m.e(packetArr, "packets");
            rd.m.e(hVarArr, "ax25Packets");
            this.f29833a = str;
            this.f29834b = packetArr;
            this.f29835c = hVarArr;
        }

        public final w5.h[] a() {
            return this.f29835c;
        }

        public final Packet[] b() {
            return this.f29834b;
        }

        public final String c() {
            return this.f29833a;
        }

        public final boolean d() {
            String str = this.f29833a;
            return str != null && str.length() == 0 && this.f29834b.length == 0 && this.f29835c.length == 0;
        }
    }

    public d(int i10) {
        this(i10, false, false, false, 14, null);
    }

    private final void h() {
        Decoder decoder = this.f29828f;
        if (decoder != null) {
            decoder.d();
        }
        MDecoder mDecoder = this.f29829g;
        if (mDecoder != null) {
            mDecoder.e();
        }
        a4.b bVar = this.f29823a;
        if (bVar != null) {
            bVar.j();
        }
    }

    @Override // com.dw.multimon.MDecoder.a
    public void a(int i10, byte[] bArr) {
        rd.m.e(bArr, "data");
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            for (byte b10 : bArr) {
                this.f29830h.append((char) b10);
            }
            return;
        }
        try {
            ArrayList arrayList = this.f29826d;
            if (arrayList != null) {
                String str = "AFSK[" + bArr.length + "]:" + rg.f.i(bArr, null, 1, null);
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            w5.h hVarJ = w5.h.j(bArr, 0, bArr.length);
            if (this.f29824b.contains(hVarJ)) {
                return;
            }
            this.f29824b.add(hVarJ);
        } catch (w5.g e10) {
            e10.printStackTrace();
        }
    }

    public final void b(short[] sArr, int i10, int i11) {
        rd.m.e(sArr, "buffer");
        if (i11 <= 0) {
            return;
        }
        Resample resample = this.f29827e;
        if (resample != null) {
            short[] sArr2 = this.f29831r;
            rd.m.b(sArr2);
            i11 = resample.b(sArr, i10, i11, sArr2, 0, sArr2.length);
            this.f29832s = i11;
            sArr = this.f29831r;
            i10 = 0;
        }
        if (i11 <= 0) {
            return;
        }
        MDecoder mDecoder = this.f29829g;
        if (mDecoder != null) {
            mDecoder.c(sArr, i10, i11);
        }
        a4.b bVar = this.f29823a;
        if (bVar != null) {
            bVar.i(sArr, i10, i11);
        }
        Decoder decoder = this.f29828f;
        Integer numValueOf = decoder != null ? Integer.valueOf(decoder.b(sArr, i10, i11)) : null;
        if ((numValueOf != null && numValueOf.intValue() == 3) || ((numValueOf != null && numValueOf.intValue() == 2) || (numValueOf != null && numValueOf.intValue() == 1))) {
            this.f29825c.add(this.f29828f.a());
            if (this.f29828f.b(sArr, i10, i11) != 0) {
                Log.e("AudioCarrierDecoder", "mdc err");
            }
        }
    }

    public final short[] c() {
        return this.f29831r;
    }

    public final w5.d d() {
        Object next;
        Iterator it = this.f29824b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((w5.h) next) instanceof w5.d) {
                break;
            }
        }
        return (w5.d) next;
    }

    public final int e() {
        return this.f29832s;
    }

    public final void f(w5.h hVar) {
        rd.m.e(hVar, "pkg");
        if (this.f29824b.contains(hVar)) {
            return;
        }
        this.f29824b.add(hVar);
    }

    public final void g() {
        Decoder decoder = this.f29828f;
        if (decoder != null) {
            decoder.c();
        }
        MDecoder mDecoder = this.f29829g;
        if (mDecoder != null) {
            mDecoder.b();
        }
        Resample resample = this.f29827e;
        if (resample != null) {
            resample.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0070 A[PHI: r0
      0x0070: PHI (r0v5 java.lang.String) = 
      (r0v4 java.lang.String)
      (r0v4 java.lang.String)
      (r0v13 java.lang.String)
      (r0v13 java.lang.String)
      (r0v13 java.lang.String)
     binds: [B:10:0x0020, B:11:0x0022, B:13:0x0028, B:31:0x0065, B:33:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v4.d.a i() {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.d.i():v4.d$a");
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean, code=int, for r6v0, types: [boolean] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(int r4, boolean r5, int r6, boolean r7) {
        /*
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 70
            r0.<init>(r1)
            r3.f29824b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r3.f29825c = r0
            r0 = 0
            r2 = 32000(0x7d00, float:4.4842E-41)
            if (r5 == 0) goto L1e
            com.dw.mdc.Decoder r5 = new com.dw.mdc.Decoder
            r5.<init>(r2)
            goto L1f
        L1e:
            r5 = r0
        L1f:
            r3.f29828f = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r3.f29830h = r5
            boolean r5 = com.dw.ht.Cfg.f5476a
            if (r5 == 0) goto L33
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r1)
            r3.f29826d = r5
        L33:
            if (r6 != 0) goto L3b
            if (r7 == 0) goto L38
            goto L3b
        L38:
            r3.f29829g = r0
            goto L49
        L3b:
            if (r7 == 0) goto L3f
            r6 = r6 | 2
        L3f:
            com.dw.multimon.MDecoder r5 = new com.dw.multimon.MDecoder
            r5.<init>(r2, r6)
            r3.f29829g = r5
            r5.f(r3)
        L49:
            if (r4 == r2) goto L57
            com.dw.audio.codec.Resample r5 = new com.dw.audio.codec.Resample
            r5.<init>(r4, r2)
            r3.f29827e = r5
            short[] r4 = new short[r2]
            r3.f29831r = r4
            return
        L57:
            r3.f29827e = r0
            r3.f29831r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.d.<init>(int, boolean, boolean, boolean):void");
    }

    public /* synthetic */ d(int i10, boolean z10, boolean z11, boolean z12, int i11, rd.h hVar) {
        this(i10, (i11 & 2) != 0 ? true : z10, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? true : z12);
    }
}
