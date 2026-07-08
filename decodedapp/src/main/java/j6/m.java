package j6;

import java.math.BigInteger;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f18449a = BigInteger.valueOf(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final BigInteger f18450b = BigInteger.valueOf(10000000000000000L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final BigInteger f18451c = BigInteger.valueOf(152587890625L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BigInteger[] f18452d = {BigInteger.ONE, BigInteger.TEN, BigInteger.valueOf(100), BigInteger.valueOf(1000), BigInteger.valueOf(10000), BigInteger.valueOf(100000), BigInteger.valueOf(1000000), BigInteger.valueOf(10000000), BigInteger.valueOf(100000000), BigInteger.valueOf(1000000000), BigInteger.valueOf(10000000000L), BigInteger.valueOf(100000000000L), BigInteger.valueOf(1000000000000L), BigInteger.valueOf(10000000000000L), BigInteger.valueOf(100000000000000L), BigInteger.valueOf(1000000000000000L)};

    static BigInteger a(NavigableMap navigableMap, int i10) {
        BigInteger[] bigIntegerArr = f18452d;
        if (i10 < bigIntegerArr.length) {
            return bigIntegerArr[i10];
        }
        if (navigableMap == null) {
            return f18449a.pow(i10).shiftLeft(i10);
        }
        Map.Entry entryFloorEntry = navigableMap.floorEntry(Integer.valueOf(i10));
        Integer num = (Integer) entryFloorEntry.getKey();
        return num.intValue() == i10 ? (BigInteger) entryFloorEntry.getValue() : n.k((BigInteger) entryFloorEntry.getValue(), a(navigableMap, i10 - num.intValue()));
    }

    static BigInteger b(NavigableMap navigableMap, int i10) {
        int i11 = i10 & (-16);
        Map.Entry entryFloorEntry = navigableMap.floorEntry(Integer.valueOf(i11));
        int iIntValue = ((Integer) entryFloorEntry.getKey()).intValue();
        BigInteger bigInteger = (BigInteger) entryFloorEntry.getValue();
        if (iIntValue == i11) {
            return bigInteger;
        }
        int i12 = i11 - iIntValue;
        BigInteger bigIntegerB = (BigInteger) navigableMap.get(Integer.valueOf(i12));
        if (bigIntegerB == null) {
            bigIntegerB = b(navigableMap, i12);
            navigableMap.put(Integer.valueOf(i12), bigIntegerB);
        }
        return n.k(bigInteger, bigIntegerB);
    }

    static NavigableMap c() {
        TreeMap treeMap = new TreeMap();
        treeMap.put(0, BigInteger.ONE);
        treeMap.put(16, f18450b);
        return treeMap;
    }

    public static long d(long j10) {
        return ((j10 * 3402) >>> 10) + 1;
    }

    static NavigableMap e(int i10, int i11) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(0, BigInteger.valueOf(5L));
        treeMap.put(16, f18451c);
        f(treeMap, i10, i11);
        for (Map.Entry entry : treeMap.entrySet()) {
            entry.setValue(((BigInteger) entry.getValue()).shiftLeft(((Integer) entry.getKey()).intValue()));
        }
        return treeMap;
    }

    static void f(NavigableMap navigableMap, int i10, int i11) {
        if (i11 - i10 <= 18) {
            return;
        }
        int iG = g(i10, i11);
        int i12 = i11 - iG;
        if (navigableMap.containsKey(Integer.valueOf(i12))) {
            return;
        }
        f(navigableMap, i10, iG);
        f(navigableMap, iG, i11);
        navigableMap.put(Integer.valueOf(i12), b(navigableMap, i12));
    }

    static int g(int i10, int i11) {
        return i11 - ((((i11 - ((i10 + i11) >>> 1)) + 15) >> 4) << 4);
    }

    static long h(long j10, long j11) {
        long j12 = j10 & 4294967295L;
        long j13 = j10 >>> 32;
        long j14 = j11 & 4294967295L;
        long j15 = j11 >>> 32;
        long j16 = j13 * j15;
        long j17 = j15 * j12;
        return j16 + ((((j13 * j14) + ((j12 * j14) >>> 32)) + (4294967295L & j17)) >>> 32) + (j17 >>> 32);
    }
}
