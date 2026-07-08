package a6;

import java.security.InvalidParameterException;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f351d;

    public v(byte[] bArr) {
        this(bArr, 0);
    }

    public static int m(int i10, int i11) {
        int i12 = 32 - i10;
        return (i11 << i12) >> i12;
    }

    public int a() {
        return this.f349b - this.f351d;
    }

    public int b() {
        return this.f351d;
    }

    public boolean c() {
        int i10 = this.f349b;
        int i11 = this.f351d;
        if (i10 - i11 < 1) {
            throw new InvalidParameterException("数据不足");
        }
        int i12 = this.f348a[i11 / 8] & MessagePack.Code.EXT_TIMESTAMP;
        boolean z10 = false;
        if (!this.f350c ? (i12 & (1 << (i11 % 8))) != 0 : (i12 & (1 << (7 - (i11 % 8)))) != 0) {
            z10 = true;
        }
        this.f351d = i11 + 1;
        return z10;
    }

    public byte d() {
        return e(8);
    }

    public byte e(int i10) {
        int i11 = this.f349b;
        int i12 = this.f351d;
        if (i11 - i12 < i10) {
            throw new InvalidParameterException("数据不足");
        }
        if (i10 > 8) {
            throw new InvalidParameterException("无法一次读取超过16位");
        }
        if (i12 % 8 != 0 || i10 % 8 != 0) {
            return (byte) i(i10);
        }
        byte b10 = this.f348a[i12 / 8];
        this.f351d = i12 + i10;
        return b10;
    }

    public void f(byte[] bArr) {
        int i10 = this.f351d;
        if (i10 % 8 == 0) {
            System.arraycopy(this.f348a, i10 / 8, bArr, 0, bArr.length);
            this.f351d += bArr.length * 8;
        } else {
            for (int i11 = 0; i11 < bArr.length; i11++) {
                bArr[i11] = d();
            }
        }
    }

    public byte[] g(int i10) {
        byte[] bArr = new byte[i10];
        f(bArr);
        return bArr;
    }

    public int h() {
        return i(32);
    }

    public int i(int i10) {
        int i11 = this.f349b;
        int i12 = this.f351d;
        if (i11 - i12 < i10) {
            throw new InvalidParameterException("数据不足");
        }
        if (i10 > 32) {
            throw new InvalidParameterException("无法一次读取超过32位");
        }
        int i13 = 0;
        if (i12 % 8 == 0 && i10 % 8 == 0) {
            int i14 = i12 / 8;
            int i15 = i10 / 8;
            if (this.f350c) {
                while (true) {
                    int i16 = i15 - 1;
                    if (i15 <= 0) {
                        break;
                    }
                    i13 = (i13 << 8) | (this.f348a[i14] & MessagePack.Code.EXT_TIMESTAMP);
                    i15 = i16;
                    i14++;
                }
            } else {
                while (true) {
                    int i17 = i15 - 1;
                    if (i15 <= 0) {
                        break;
                    }
                    i13 = (i13 >>> 8) | ((this.f348a[i14] & MessagePack.Code.EXT_TIMESTAMP) << 24);
                    i15 = i17;
                    i14++;
                }
                i13 >>= 32 - i10;
            }
            this.f351d += i10;
            return i13;
        }
        int i18 = 1;
        if (this.f350c) {
            int i19 = 1 << (i10 - 1);
            while (true) {
                int i20 = i10 - 1;
                if (i10 <= 0) {
                    return i13;
                }
                if (c()) {
                    i13 |= i19;
                }
                i19 >>>= 1;
                i10 = i20;
            }
        } else {
            while (true) {
                int i21 = i10 - 1;
                if (i10 <= 0) {
                    return i13;
                }
                if (c()) {
                    i13 |= i18;
                }
                i18 <<= 1;
                i10 = i21;
            }
        }
    }

    public int j(int i10) {
        return m(i10, i(i10));
    }

    public long k(int i10) {
        int i11 = this.f349b;
        int i12 = this.f351d;
        if (i11 - i12 < i10) {
            throw new InvalidParameterException("数据不足");
        }
        if (i10 > 64) {
            throw new InvalidParameterException("无法一次读取超过64位");
        }
        long j10 = 0;
        if (i12 % 8 == 0 && i10 % 8 == 0) {
            int i13 = i12 / 8;
            int i14 = i10 / 8;
            if (this.f350c) {
                while (true) {
                    int i15 = i14 - 1;
                    if (i14 <= 0) {
                        break;
                    }
                    j10 = (j10 << 8) | ((long) (this.f348a[i13] & MessagePack.Code.EXT_TIMESTAMP));
                    i14 = i15;
                    i13++;
                }
            } else {
                while (true) {
                    int i16 = i14 - 1;
                    if (i14 <= 0) {
                        break;
                    }
                    j10 = (j10 >>> 8) | ((((long) this.f348a[i13]) & 255) << 56);
                    i14 = i16;
                    i13++;
                }
                j10 >>= 64 - i10;
            }
            this.f351d += i10;
            return j10;
        }
        long j11 = 1;
        if (this.f350c) {
            long j12 = 1 << (i10 - 1);
            while (true) {
                int i17 = i10 - 1;
                if (i10 <= 0) {
                    return j10;
                }
                if (c()) {
                    j10 |= j12;
                }
                j12 >>>= 1;
                i10 = i17;
            }
        } else {
            while (true) {
                int i18 = i10 - 1;
                if (i10 <= 0) {
                    return j10;
                }
                if (c()) {
                    j10 |= j11;
                }
                j11 <<= 1;
                i10 = i18;
            }
        }
    }

    public void l(int i10) {
        this.f351d = i10;
    }

    public v n(int i10, int i11) {
        if (this.f349b - this.f351d < i11) {
            throw new InvalidParameterException("空间不足");
        }
        if (i11 > 32) {
            throw new InvalidParameterException("无法一次写入超过32位");
        }
        if (!this.f350c) {
            int i12 = 1;
            while (true) {
                int i13 = i11 - 1;
                if (i11 <= 0) {
                    break;
                }
                p((i12 & i10) != 0);
                i12 <<= 1;
                i11 = i13;
            }
        } else {
            int i14 = 1 << (i11 - 1);
            while (true) {
                int i15 = i11 - 1;
                if (i11 <= 0) {
                    break;
                }
                p((i14 & i10) != 0);
                i14 >>>= 1;
                i11 = i15;
            }
        }
        return this;
    }

    public v o(long j10, int i10) {
        if (this.f349b - this.f351d < i10) {
            throw new InvalidParameterException("空间不足");
        }
        if (i10 > 64) {
            throw new InvalidParameterException("无法一次写入超过64位");
        }
        long j11 = 1;
        if (!this.f350c) {
            while (true) {
                int i11 = i10 - 1;
                if (i10 <= 0) {
                    break;
                }
                p((j11 & j10) != 0);
                j11 <<= 1;
                i10 = i11;
            }
        } else {
            long j12 = 1 << (i10 - 1);
            while (true) {
                int i12 = i10 - 1;
                if (i10 <= 0) {
                    break;
                }
                p((j12 & j10) != 0);
                j12 >>>= 1;
                i10 = i12;
            }
        }
        return this;
    }

    public v p(boolean z10) {
        int i10 = this.f349b;
        int i11 = this.f351d;
        if (i10 - i11 < 1) {
            throw new InvalidParameterException("空间不足");
        }
        byte[] bArr = this.f348a;
        byte b10 = bArr[i11 / 8];
        byte b11 = (byte) (1 << (this.f350c ? 7 - (i11 % 8) : i11 % 8));
        bArr[i11 / 8] = (byte) (z10 ? b10 | b11 : (~b11) & b10);
        this.f351d = i11 + 1;
        return this;
    }

    public v(byte[] bArr, int i10) {
        this(bArr, i10, true);
    }

    public v(byte[] bArr, int i10, boolean z10) {
        this.f348a = bArr;
        this.f349b = bArr.length * 8;
        this.f350c = z10;
        this.f351d = i10;
    }
}
