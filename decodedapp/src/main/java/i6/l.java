package i6;

import e6.p;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class l implements p, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f15817c = h.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f15818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected char[] f15819b;

    public l(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.f15818a = str;
    }

    @Override // e6.p
    public final char[] a() {
        char[] cArr = this.f15819b;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrF = f15817c.f(this.f15818a);
        this.f15819b = cArrF;
        return cArrF;
    }

    @Override // e6.p
    public int b(char[] cArr, int i10) {
        String str = this.f15818a;
        int length = str.length();
        if (i10 + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i10);
        return length;
    }

    @Override // e6.p
    public int c(char[] cArr, int i10) {
        char[] cArrF = this.f15819b;
        if (cArrF == null) {
            cArrF = f15817c.f(this.f15818a);
            this.f15819b = cArrF;
        }
        int length = cArrF.length;
        if (i10 + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArrF, 0, cArr, i10, length);
        return length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f15818a.equals(((l) obj).f15818a);
    }

    @Override // e6.p
    public final String getValue() {
        return this.f15818a;
    }

    public final int hashCode() {
        return this.f15818a.hashCode();
    }

    public final String toString() {
        return this.f15818a;
    }
}
