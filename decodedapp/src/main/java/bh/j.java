package bh;

/* JADX INFO: loaded from: classes3.dex */
public class j implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f4063a;

    public j(long[] jArr) {
        this.f4063a = jArr;
    }

    private int a(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }

    public static j e(String str) {
        if (str == null) {
            return new j(new long[0]);
        }
        String[] strArrSplit = str.split("[^0-9]+");
        long[] jArr = new long[strArrSplit.length];
        int i10 = 0;
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                jArr[i10] = Long.parseLong(str2);
                i10++;
            }
        }
        do {
            i10--;
            if (i10 < 0) {
                break;
            }
        } while (jArr[i10] <= 0);
        int i11 = i10 + 1;
        long[] jArr2 = new long[i11];
        System.arraycopy(jArr, 0, jArr2, 0, i11);
        return new j(jArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        return a(r1.length, r6.f4063a.length);
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(bh.j r6) {
        /*
            r5 = this;
            r0 = 0
        L1:
            long[] r1 = r5.f4063a
            int r2 = r1.length
            if (r0 >= r2) goto L19
            long[] r2 = r6.f4063a
            int r3 = r2.length
            if (r0 >= r3) goto L19
            r3 = r1[r0]
            r1 = r2[r0]
            int r1 = r5.a(r3, r1)
            if (r1 == 0) goto L16
            return r1
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            int r0 = r1.length
            long r0 = (long) r0
            long[] r6 = r6.f4063a
            int r6 = r6.length
            long r2 = (long) r6
            int r6 = r5.a(r0, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.j.compareTo(bh.j):int");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof j) && compareTo((j) obj) == 0;
    }

    public int hashCode() {
        int i10 = 0;
        for (long j10 : this.f4063a) {
            i10 = (i10 * 92821) + ((int) j10);
        }
        return i10;
    }

    public String toString() {
        if (this.f4063a.length == 0) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4063a[0]);
        for (int i10 = 1; i10 < this.f4063a.length; i10++) {
            sb2.append('.');
            sb2.append(this.f4063a[i10]);
        }
        return sb2.toString();
    }
}
