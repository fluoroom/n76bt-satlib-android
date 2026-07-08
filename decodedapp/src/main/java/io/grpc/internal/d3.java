package io.grpc.internal;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f16452a = Logger.getLogger(d3.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f16453b = "-bin".getBytes(StandardCharsets.US_ASCII);

    private static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i10 = length; i10 < bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10 - length]) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(byte[] bArr) {
        for (byte b10 : bArr) {
            if (b10 < 32 || b10 > 126) {
                return false;
            }
        }
        return true;
    }

    private static byte[][] c(byte[][] bArr, int i10) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(bArr[i11]);
        }
        while (i10 < bArr.length) {
            byte[] bArr2 = bArr[i10];
            byte[] bArr3 = bArr[i10 + 1];
            if (a(bArr2, f16453b)) {
                int i12 = 0;
                for (int i13 = 0; i13 <= bArr3.length; i13++) {
                    if (i13 == bArr3.length || bArr3[i13] == 44) {
                        byte[] bArrB = t9.a.a().b(new String(bArr3, i12, i13 - i12, StandardCharsets.US_ASCII));
                        arrayList.add(bArr2);
                        arrayList.add(bArrB);
                        i12 = i13 + 1;
                    }
                }
            } else {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            }
            i10 += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    public static byte[][] d(qb.z0 z0Var) {
        byte[][] bArrD = qb.k0.d(z0Var);
        if (bArrD == null) {
            return new byte[0][];
        }
        int i10 = 0;
        for (int i11 = 0; i11 < bArrD.length; i11 += 2) {
            byte[] bArr = bArrD[i11];
            byte[] bArr2 = bArrD[i11 + 1];
            if (a(bArr, f16453b)) {
                bArrD[i10] = bArr;
                bArrD[i10 + 1] = qb.k0.f24671b.e(bArr2).getBytes(StandardCharsets.US_ASCII);
            } else if (b(bArr2)) {
                bArrD[i10] = bArr;
                bArrD[i10 + 1] = bArr2;
            } else {
                String str = new String(bArr, StandardCharsets.US_ASCII);
                f16452a.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            i10 += 2;
        }
        return i10 == bArrD.length ? bArrD : (byte[][]) Arrays.copyOfRange(bArrD, 0, i10);
    }

    public static byte[][] e(byte[][] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10 += 2) {
            byte[] bArr2 = bArr[i10];
            int i11 = i10 + 1;
            byte[] bArr3 = bArr[i11];
            if (a(bArr2, f16453b)) {
                for (byte b10 : bArr3) {
                    if (b10 == 44) {
                        return c(bArr, i10);
                    }
                }
                bArr[i11] = t9.a.a().b(new String(bArr3, StandardCharsets.US_ASCII));
            }
        }
        return bArr;
    }
}
