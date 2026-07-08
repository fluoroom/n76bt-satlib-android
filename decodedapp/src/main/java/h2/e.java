package h2;

import android.graphics.Bitmap;
import android.util.Log;
import h2.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public class e implements a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f15091u = "e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f15092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f15093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0210a f15094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteBuffer f15095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f15096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private short[] f15097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f15098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f15099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f15100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f15101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f15102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f15103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f15104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f15105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f15106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f15107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f15108q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f15109r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Boolean f15110s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Bitmap.Config f15111t;

    public e(a.InterfaceC0210a interfaceC0210a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0210a);
        q(cVar, byteBuffer, i10);
    }

    private int i(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f15107p + i10; i18++) {
            byte[] bArr = this.f15100i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f15092a[bArr[i18] & MessagePack.Code.EXT_TIMESTAMP];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f15107p + i20; i21++) {
            byte[] bArr2 = this.f15100i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f15092a[bArr2[i21] & MessagePack.Code.EXT_TIMESTAMP];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    private void j(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.f15101j;
        int i14 = bVar.f15066d;
        int i15 = this.f15107p;
        int i16 = i14 / i15;
        int i17 = bVar.f15064b / i15;
        int i18 = bVar.f15065c / i15;
        int i19 = bVar.f15063a / i15;
        boolean z10 = this.f15102k == 0;
        int i20 = this.f15109r;
        int i21 = this.f15108q;
        byte[] bArr = this.f15100i;
        int[] iArr2 = this.f15092a;
        Boolean bool = this.f15110s;
        int i22 = 8;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1;
        while (i24 < i16) {
            int[] iArr3 = iArr;
            if (bVar.f15067e) {
                if (i23 >= i16) {
                    int i26 = i25 + 1;
                    i10 = i16;
                    if (i26 == 2) {
                        i25 = i26;
                        i23 = 4;
                    } else if (i26 == 3) {
                        i25 = i26;
                        i23 = 2;
                        i22 = 4;
                    } else if (i26 != 4) {
                        i25 = i26;
                    } else {
                        i25 = i26;
                        i23 = 1;
                        i22 = 2;
                    }
                } else {
                    i10 = i16;
                }
                i11 = i23 + i22;
            } else {
                i10 = i16;
                i11 = i23;
                i23 = i24;
            }
            int i27 = i23 + i17;
            boolean z11 = i15 == 1;
            if (i27 < i21) {
                int i28 = i27 * i20;
                int i29 = i28 + i19;
                int i30 = i29 + i18;
                int i31 = i28 + i20;
                if (i31 < i30) {
                    i30 = i31;
                }
                i12 = i11;
                int i32 = i24 * i15 * bVar.f15065c;
                if (z11) {
                    int i33 = i29;
                    while (i33 < i30) {
                        int i34 = i33;
                        int i35 = iArr2[bArr[i32] & MessagePack.Code.EXT_TIMESTAMP];
                        if (i35 != 0) {
                            iArr3[i34] = i35;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i15;
                        i33 = i34 + 1;
                    }
                } else {
                    int i36 = ((i30 - i29) * i15) + i32;
                    i13 = i15;
                    int i37 = i29;
                    while (i37 < i30) {
                        int i38 = i30;
                        int i39 = i(i32, i36, bVar.f15065c);
                        if (i39 != 0) {
                            iArr3[i37] = i39;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i13;
                        i37++;
                        i30 = i38;
                    }
                    i24++;
                    i15 = i13;
                    iArr = iArr3;
                    i16 = i10;
                    i23 = i12;
                }
            } else {
                i12 = i11;
            }
            i13 = i15;
            i24++;
            i15 = i13;
            iArr = iArr3;
            i16 = i10;
            i23 = i12;
        }
        if (this.f15110s == null) {
            this.f15110s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f15101j;
        int i10 = bVar2.f15066d;
        int i11 = bVar2.f15064b;
        int i12 = bVar2.f15065c;
        int i13 = bVar2.f15063a;
        boolean z10 = this.f15102k == 0;
        int i14 = this.f15109r;
        byte[] bArr = this.f15100i;
        int[] iArr2 = this.f15092a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f15065c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int[] iArr3 = iArr;
                int i22 = b11 & MessagePack.Code.EXT_TIMESTAMP;
                if (i22 != b10) {
                    int i23 = iArr2[i22];
                    if (i23 != 0) {
                        iArr3[i21] = i23;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                iArr = iArr3;
            }
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f15110s;
        this.f15110s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f15110s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private void l(b bVar) {
        int i10;
        int i11;
        byte[] bArr;
        short s10;
        e eVar = this;
        if (bVar != null) {
            eVar.f15095d.position(bVar.f15072j);
        }
        if (bVar == null) {
            c cVar = eVar.f15103l;
            i10 = cVar.f15079f;
            i11 = cVar.f15080g;
        } else {
            i10 = bVar.f15065c;
            i11 = bVar.f15066d;
        }
        int i12 = i10 * i11;
        byte[] bArr2 = eVar.f15100i;
        if (bArr2 == null || bArr2.length < i12) {
            eVar.f15100i = eVar.f15094c.e(i12);
        }
        byte[] bArr3 = eVar.f15100i;
        if (eVar.f15097f == null) {
            eVar.f15097f = new short[4096];
        }
        short[] sArr = eVar.f15097f;
        if (eVar.f15098g == null) {
            eVar.f15098g = new byte[4096];
        }
        byte[] bArr4 = eVar.f15098g;
        if (eVar.f15099h == null) {
            eVar.f15099h = new byte[4097];
        }
        byte[] bArr5 = eVar.f15099h;
        int iP = eVar.p();
        int i13 = 1 << iP;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = iP + 1;
        int i17 = (1 << i16) - 1;
        for (int i18 = 0; i18 < i13; i18++) {
            sArr[i18] = 0;
            bArr4[i18] = (byte) i18;
        }
        byte[] bArr6 = eVar.f15096e;
        int i19 = i16;
        int i20 = i15;
        int i21 = i17;
        int i22 = 0;
        int iO = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = -1;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            if (i22 >= i12) {
                break;
            }
            if (iO == 0) {
                iO = eVar.o();
                if (iO <= 0) {
                    eVar.f15106o = 3;
                    break;
                }
                i23 = 0;
            }
            i25 += (bArr6[i23] & MessagePack.Code.EXT_TIMESTAMP) << i24;
            i23++;
            iO--;
            int i30 = i24 + 8;
            int i31 = i20;
            int i32 = i19;
            int i33 = i27;
            short[] sArr2 = sArr;
            int i34 = i28;
            while (true) {
                bArr = bArr4;
                if (i30 < i32) {
                    i20 = i31;
                    i28 = i34;
                    break;
                }
                int i35 = i25 & i21;
                i25 >>= i32;
                i30 -= i32;
                if (i35 == i13) {
                    i32 = i16;
                    i31 = i15;
                    i21 = i17;
                    bArr4 = bArr;
                    i33 = -1;
                } else {
                    if (i35 == i14) {
                        i28 = i34;
                        i20 = i31;
                        break;
                    }
                    byte[] bArr7 = bArr5;
                    if (i33 == -1) {
                        bArr3[i26] = bArr[i35];
                        i26++;
                        i22++;
                        i33 = i35;
                        i34 = i33;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                    } else {
                        if (i35 >= i31) {
                            bArr7[i29] = (byte) i34;
                            i29++;
                            s10 = i33;
                        } else {
                            s10 = i35;
                        }
                        while (s10 >= i13) {
                            bArr7[i29] = bArr[s10];
                            i29++;
                            s10 = sArr2[s10];
                        }
                        int i36 = bArr[s10] & MessagePack.Code.EXT_TIMESTAMP;
                        byte b10 = (byte) i36;
                        bArr3[i26] = b10;
                        while (true) {
                            i26++;
                            i22++;
                            if (i29 <= 0) {
                                break;
                            }
                            i29--;
                            bArr3[i26] = bArr7[i29];
                        }
                        if (i31 < 4096) {
                            sArr2[i31] = (short) i33;
                            bArr[i31] = b10;
                            i31++;
                            if ((i31 & i21) == 0 && i31 < 4096) {
                                i32++;
                                i21 += i31;
                            }
                        }
                        i33 = i35;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                        i34 = i36;
                    }
                }
            }
            i24 = i30;
            sArr = sArr2;
            bArr4 = bArr;
            i27 = i33;
            i19 = i32;
            eVar = this;
        }
        Arrays.fill(bArr3, i26, i12, (byte) 0);
    }

    private Bitmap n() {
        Boolean bool = this.f15110s;
        Bitmap bitmapA = this.f15094c.a(this.f15109r, this.f15108q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f15111t);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    private int o() {
        int iP = p();
        if (iP <= 0) {
            return iP;
        }
        ByteBuffer byteBuffer = this.f15095d;
        byteBuffer.get(this.f15096e, 0, Math.min(iP, byteBuffer.remaining()));
        return iP;
    }

    private int p() {
        return this.f15095d.get() & MessagePack.Code.EXT_TIMESTAMP;
    }

    private Bitmap r(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f15101j;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f15104m;
            if (bitmap2 != null) {
                this.f15094c.c(bitmap2);
            }
            this.f15104m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f15069g == 3 && this.f15104m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f15069g) > 0) {
            if (i11 == 2) {
                if (!bVar.f15068f) {
                    c cVar = this.f15103l;
                    int i13 = cVar.f15085l;
                    if (bVar.f15073k == null || cVar.f15083j != bVar.f15070h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f15066d;
                int i15 = this.f15107p;
                int i16 = i14 / i15;
                int i17 = bVar2.f15064b / i15;
                int i18 = bVar2.f15065c / i15;
                int i19 = bVar2.f15063a / i15;
                int i20 = this.f15109r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f15109r;
                }
            } else if (i11 == 3 && (bitmap = this.f15104m) != null) {
                int i25 = this.f15109r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f15108q);
            }
        }
        l(bVar);
        if (bVar.f15067e || this.f15107p != 1) {
            j(bVar);
        } else {
            k(bVar);
        }
        if (this.f15105n && ((i10 = bVar.f15069g) == 0 || i10 == 1)) {
            if (this.f15104m == null) {
                this.f15104m = n();
            }
            Bitmap bitmap3 = this.f15104m;
            int i26 = this.f15109r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f15108q);
        }
        Bitmap bitmapN = n();
        int i27 = this.f15109r;
        bitmapN.setPixels(iArr, 0, i27, 0, 0, i27, this.f15108q);
        return bitmapN;
    }

    @Override // h2.a
    public synchronized Bitmap a() {
        try {
            if (this.f15103l.f15076c <= 0 || this.f15102k < 0) {
                String str = f15091u;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, frameCount=" + this.f15103l.f15076c + ", framePointer=" + this.f15102k);
                }
                this.f15106o = 1;
            }
            int i10 = this.f15106o;
            if (i10 != 1 && i10 != 2) {
                this.f15106o = 0;
                if (this.f15096e == null) {
                    this.f15096e = this.f15094c.e(255);
                }
                b bVar = (b) this.f15103l.f15078e.get(this.f15102k);
                int i11 = this.f15102k - 1;
                b bVar2 = i11 >= 0 ? (b) this.f15103l.f15078e.get(i11) : null;
                int[] iArr = bVar.f15073k;
                if (iArr == null) {
                    iArr = this.f15103l.f15074a;
                }
                this.f15092a = iArr;
                if (iArr == null) {
                    String str2 = f15091u;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.f15102k);
                    }
                    this.f15106o = 1;
                    return null;
                }
                if (bVar.f15068f) {
                    System.arraycopy(iArr, 0, this.f15093b, 0, iArr.length);
                    int[] iArr2 = this.f15093b;
                    this.f15092a = iArr2;
                    iArr2[bVar.f15070h] = 0;
                    if (bVar.f15069g == 2 && this.f15102k == 0) {
                        this.f15110s = Boolean.TRUE;
                    }
                }
                return r(bVar, bVar2);
            }
            String str3 = f15091u;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.f15106o);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // h2.a
    public void b() {
        this.f15102k = (this.f15102k + 1) % this.f15103l.f15076c;
    }

    @Override // h2.a
    public int c() {
        return this.f15103l.f15076c;
    }

    @Override // h2.a
    public void clear() {
        this.f15103l = null;
        byte[] bArr = this.f15100i;
        if (bArr != null) {
            this.f15094c.d(bArr);
        }
        int[] iArr = this.f15101j;
        if (iArr != null) {
            this.f15094c.f(iArr);
        }
        Bitmap bitmap = this.f15104m;
        if (bitmap != null) {
            this.f15094c.c(bitmap);
        }
        this.f15104m = null;
        this.f15095d = null;
        this.f15110s = null;
        byte[] bArr2 = this.f15096e;
        if (bArr2 != null) {
            this.f15094c.d(bArr2);
        }
    }

    @Override // h2.a
    public int d() {
        int i10;
        if (this.f15103l.f15076c <= 0 || (i10 = this.f15102k) < 0) {
            return 0;
        }
        return m(i10);
    }

    @Override // h2.a
    public void e(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f15111t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // h2.a
    public void f() {
        this.f15102k = -1;
    }

    @Override // h2.a
    public int g() {
        return this.f15102k;
    }

    @Override // h2.a
    public ByteBuffer getData() {
        return this.f15095d;
    }

    @Override // h2.a
    public int h() {
        return this.f15095d.limit() + this.f15100i.length + (this.f15101j.length * 4);
    }

    public int m(int i10) {
        if (i10 < 0) {
            return -1;
        }
        c cVar = this.f15103l;
        if (i10 < cVar.f15076c) {
            return ((b) cVar.f15078e.get(i10)).f15071i;
        }
        return -1;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int iHighestOneBit = Integer.highestOneBit(i10);
            this.f15106o = 0;
            this.f15103l = cVar;
            this.f15102k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f15095d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f15095d.order(ByteOrder.LITTLE_ENDIAN);
            this.f15105n = false;
            Iterator it = cVar.f15078e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((b) it.next()).f15069g == 3) {
                    this.f15105n = true;
                    break;
                }
            }
            this.f15107p = iHighestOneBit;
            int i11 = cVar.f15079f;
            this.f15109r = i11 / iHighestOneBit;
            int i12 = cVar.f15080g;
            this.f15108q = i12 / iHighestOneBit;
            this.f15100i = this.f15094c.e(i11 * i12);
            this.f15101j = this.f15094c.b(this.f15109r * this.f15108q);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public e(a.InterfaceC0210a interfaceC0210a) {
        this.f15093b = new int[256];
        this.f15111t = Bitmap.Config.ARGB_8888;
        this.f15094c = interfaceC0210a;
        this.f15103l = new c();
    }
}
