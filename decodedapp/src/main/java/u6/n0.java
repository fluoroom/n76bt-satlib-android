package u6;

import java.util.Arrays;
import java.util.UUID;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public class n0 extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f28292e;

    static {
        int[] iArr = new int[127];
        f28292e = iArr;
        Arrays.fill(iArr, -1);
        for (int i10 = 0; i10 < 10; i10++) {
            f28292e[i10 + 48] = i10;
        }
        for (int i11 = 0; i11 < 6; i11++) {
            int[] iArr2 = f28292e;
            int i12 = i11 + 10;
            iArr2[i11 + 97] = i12;
            iArr2[i11 + 65] = i12;
        }
    }

    public n0() {
        super(UUID.class);
    }

    private UUID n1(String str, p6.h hVar) {
        return (UUID) hVar.z0(p(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
    }

    private UUID q1(byte[] bArr, p6.h hVar) throws v6.c {
        if (bArr.length == 16) {
            return new UUID(s1(bArr, 0), s1(bArr, 8));
        }
        throw v6.c.z(hVar.i0(), "Can only construct UUIDs from byte[16]; got " + bArr.length + " bytes", bArr, p());
    }

    private static int r1(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & MessagePack.Code.EXT_TIMESTAMP) | (bArr[i10] << 24) | ((bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[i10 + 2] & MessagePack.Code.EXT_TIMESTAMP) << 8);
    }

    private static long s1(byte[] bArr, int i10) {
        return ((((long) r1(bArr, i10 + 4)) << 32) >>> 32) | (((long) r1(bArr, i10)) << 32);
    }

    @Override // p6.l
    public Object k(p6.h hVar) {
        return new UUID(0L, 0L);
    }

    int m1(String str, int i10, p6.h hVar, char c10) throws p6.m {
        throw hVar.e1(str, p(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(c10), Integer.toHexString(c10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u6.p
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public UUID e1(String str, p6.h hVar) {
        if (str.length() != 36) {
            return str.length() == 24 ? q1(e6.b.a().f(str), hVar) : n1(str, hVar);
        }
        if (str.charAt(8) != '-' || str.charAt(13) != '-' || str.charAt(18) != '-' || str.charAt(23) != '-') {
            n1(str, hVar);
        }
        return new UUID((((long) u1(str, 0, hVar)) << 32) + ((((long) v1(str, 9, hVar)) << 16) | ((long) v1(str, 14, hVar))), ((((long) u1(str, 28, hVar)) << 32) >>> 32) | (((long) (v1(str, 24, hVar) | (v1(str, 19, hVar) << 16))) << 32));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u6.p
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public UUID f1(Object obj, p6.h hVar) {
        return obj instanceof byte[] ? q1((byte[]) obj, hVar) : (UUID) super.f1(obj, hVar);
    }

    int t1(String str, int i10, p6.h hVar) {
        char cCharAt = str.charAt(i10);
        int i11 = i10 + 1;
        char cCharAt2 = str.charAt(i11);
        if (cCharAt <= 127 && cCharAt2 <= 127) {
            int[] iArr = f28292e;
            int i12 = iArr[cCharAt2] | (iArr[cCharAt] << 4);
            if (i12 >= 0) {
                return i12;
            }
        }
        return (cCharAt > 127 || f28292e[cCharAt] < 0) ? m1(str, i10, hVar, cCharAt) : m1(str, i11, hVar, cCharAt2);
    }

    int u1(String str, int i10, p6.h hVar) {
        return (t1(str, i10, hVar) << 24) + (t1(str, i10 + 2, hVar) << 16) + (t1(str, i10 + 4, hVar) << 8) + t1(str, i10 + 6, hVar);
    }

    int v1(String str, int i10, p6.h hVar) {
        return (t1(str, i10, hVar) << 8) + t1(str, i10 + 2, hVar);
    }
}
