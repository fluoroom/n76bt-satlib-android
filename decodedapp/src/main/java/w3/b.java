package w3;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f31076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private short[] f31077e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31078a;

        static {
            int[] iArr = new int[d.values().length];
            f31078a = iArr;
            try {
                iArr[d.PCM_16BIT_BE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31078a[d.PCM_16BIT_LE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31078a[d.PCM_16BIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(c cVar, d dVar) {
        super(cVar);
        this.f31081c = dVar;
    }

    public static int g(byte[] bArr, int i10, int i11, short[] sArr, int i12, d dVar) {
        int i13;
        int i14 = (i11 + i10) - 1;
        int i15 = a.f31078a[dVar.ordinal()];
        if (i15 == 1) {
            i13 = i12;
            while (i10 < i14) {
                sArr[i13] = (short) (((bArr[i10] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP));
                i10 += 2;
                i13++;
            }
        } else {
            if (i15 != 2) {
                throw new UnsupportedOperationException();
            }
            i13 = i12;
            while (i10 < i14) {
                byte b10 = bArr[i10];
                sArr[i13] = (short) ((b10 & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8));
                i10 += 2;
                i13++;
            }
        }
        return i13 - i12;
    }

    public static int h(short[] sArr, int i10, int i11, byte[] bArr, int i12, d dVar) {
        int i13;
        int i14 = i11 + i10;
        int i15 = a.f31078a[dVar.ordinal()];
        if (i15 == 1) {
            i13 = i12;
            while (i10 < i14) {
                short s10 = sArr[i10];
                int i16 = i13 + 1;
                bArr[i13] = (byte) (s10 >> 8);
                i13 += 2;
                bArr[i16] = (byte) s10;
                i10++;
            }
        } else {
            if (i15 != 2) {
                throw new UnsupportedOperationException();
            }
            i13 = i12;
            while (i10 < i14) {
                short s11 = sArr[i10];
                int i17 = i13 + 1;
                bArr[i13] = (byte) s11;
                i13 += 2;
                bArr[i17] = (byte) (s11 >> 8);
                i10++;
            }
        }
        return i13 - i12;
    }

    @Override // w3.c
    public int a() {
        if (this.f31081c != d.PCM_FLOAT) {
            throw new IllegalStateException("类型不符");
        }
        int i10 = a.f31078a[this.f31080b.f31081c.ordinal()];
        if (i10 == 2) {
            return super.a() / 2;
        }
        if (i10 == 3) {
            return super.a();
        }
        throw new UnsupportedOperationException();
    }

    @Override // w3.c
    public int b(int i10) {
        if (this.f31081c != d.PCM_FLOAT) {
            throw new IllegalStateException("类型不符");
        }
        int i11 = a.f31078a[this.f31080b.f31081c.ordinal()];
        if (i11 == 2) {
            return super.b(i10 * 2) / 2;
        }
        if (i11 == 3) {
            return super.b(i10);
        }
        throw new UnsupportedOperationException();
    }

    @Override // w3.c
    public int d(float[] fArr, int i10, int i11) {
        if (this.f31081c != d.PCM_FLOAT) {
            throw new IllegalStateException("类型不符");
        }
        int i12 = a.f31078a[this.f31080b.f31081c.ordinal()];
        if (i12 == 2) {
            if (this.f31076d == null) {
                this.f31076d = new byte[2048];
            }
            byte[] bArr = this.f31076d;
            int i13 = 0;
            while (true) {
                int iMin = Math.min(i11 * 2, bArr.length);
                if (iMin <= 0) {
                    return i13;
                }
                int iC = this.f31080b.c(bArr, 0, iMin);
                int i14 = iC / 2;
                i13 += i14;
                i11 -= i14;
                if (iC == 0) {
                    return i13;
                }
                int i15 = 0;
                while (i15 < iC) {
                    int i16 = i15 + 1;
                    byte b10 = bArr[i15];
                    i15 += 2;
                    fArr[i10] = ((bArr[i16] << 8) | (b10 & MessagePack.Code.EXT_TIMESTAMP)) / 32768.0f;
                    i10++;
                }
            }
        } else {
            if (i12 != 3) {
                throw new UnsupportedOperationException();
            }
            if (this.f31077e == null) {
                this.f31077e = new short[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
            }
            short[] sArr = this.f31077e;
            int i17 = 0;
            while (true) {
                int iMin2 = Math.min(i11, sArr.length);
                if (iMin2 <= 0) {
                    return i17;
                }
                int iE = this.f31080b.e(sArr, 0, iMin2);
                i17 += iE;
                i11 -= iE;
                if (iE == 0) {
                    return i17;
                }
                int i18 = 0;
                while (i18 < iE) {
                    fArr[i10] = sArr[i18] / 32768.0f;
                    i18++;
                    i10++;
                }
            }
        }
    }

    @Override // w3.c
    public int e(short[] sArr, int i10, int i11) {
        if (this.f31081c != d.PCM_16BIT) {
            throw new IllegalStateException("类型不符");
        }
        int i12 = a.f31078a[this.f31080b.f31081c.ordinal()];
        if (i12 != 2) {
            if (i12 == 3) {
                return super.e(sArr, i10, i11);
            }
            throw new UnsupportedOperationException();
        }
        if (this.f31076d == null) {
            this.f31076d = new byte[2048];
        }
        byte[] bArr = this.f31076d;
        int i13 = 0;
        while (true) {
            int iMin = Math.min(i11 * 2, bArr.length);
            if (iMin <= 0) {
                return i13;
            }
            int iC = this.f31080b.c(bArr, 0, iMin);
            int i14 = iC / 2;
            i13 += i14;
            i11 -= i14;
            if (iC == 0) {
                return i13;
            }
            int i15 = 0;
            while (i15 < iC) {
                int i16 = i15 + 1;
                byte b10 = bArr[i15];
                i15 += 2;
                sArr[i10] = (short) ((bArr[i16] << 8) | (b10 & MessagePack.Code.EXT_TIMESTAMP));
                i10++;
            }
        }
    }

    @Override // w3.c
    public int f(int i10) {
        if (this.f31081c != d.PCM_FLOAT) {
            throw new IllegalStateException("类型不符");
        }
        int i11 = a.f31078a[this.f31080b.f31081c.ordinal()];
        if (i11 == 2) {
            return super.f(i10 * 2) / 2;
        }
        if (i11 == 3) {
            return super.f(i10);
        }
        throw new UnsupportedOperationException();
    }
}
