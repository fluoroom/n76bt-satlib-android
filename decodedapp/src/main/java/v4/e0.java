package v4;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[][] f29846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f29847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean[] f29848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean[] f29849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean[] f29850e;

    public e0(int i10) {
        this.f29846a = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, 2);
        this.f29847b = new boolean[i10];
        this.f29848c = new boolean[i10];
        this.f29849d = new boolean[i10];
        this.f29850e = new boolean[i10];
    }

    public void c(int i10) {
        this.f29846a = (int[][]) Arrays.copyOf(this.f29846a, i10);
        int i11 = 0;
        while (true) {
            int[][] iArr = this.f29846a;
            if (i11 >= iArr.length) {
                this.f29847b = Arrays.copyOf(this.f29847b, i10);
                this.f29848c = Arrays.copyOf(this.f29848c, i10);
                this.f29849d = Arrays.copyOf(this.f29849d, i10);
                this.f29850e = Arrays.copyOf(this.f29850e, i10);
                return;
            }
            if (iArr[i11] == null) {
                iArr[i11] = new int[2];
            }
            i11++;
        }
    }
}
