package ki;

import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a[] f19961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f19964d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f19966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a f19967c;

        a(long j10, Object obj, a aVar) {
            this.f19965a = j10;
            this.f19966b = obj;
            this.f19967c = aVar;
        }
    }

    public b() {
        this(16);
    }

    public Object a(long j10) {
        for (a aVar = this.f19961a[((((int) j10) ^ ((int) (j10 >>> 32))) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) % this.f19962b]; aVar != null; aVar = aVar.f19967c) {
            if (aVar.f19965a == j10) {
                return aVar.f19966b;
            }
        }
        return null;
    }

    public long[] b() {
        long[] jArr = new long[this.f19964d];
        int i10 = 0;
        for (a aVar : this.f19961a) {
            while (aVar != null) {
                jArr[i10] = aVar.f19965a;
                aVar = aVar.f19967c;
                i10++;
            }
        }
        return jArr;
    }

    public Object c(long j10, Object obj) {
        int i10 = ((((int) j10) ^ ((int) (j10 >>> 32))) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) % this.f19962b;
        a aVar = this.f19961a[i10];
        for (a aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f19967c) {
            if (aVar2.f19965a == j10) {
                Object obj2 = aVar2.f19966b;
                aVar2.f19966b = obj;
                return obj2;
            }
        }
        this.f19961a[i10] = new a(j10, obj, aVar);
        this.f19964d++;
        if (this.f19964d <= this.f19963c) {
            return null;
        }
        d(this.f19962b * 2);
        return null;
    }

    public void d(int i10) {
        a[] aVarArr = new a[i10];
        for (a aVar : this.f19961a) {
            while (aVar != null) {
                long j10 = aVar.f19965a;
                int i11 = ((((int) (j10 >>> 32)) ^ ((int) j10)) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) % i10;
                a aVar2 = aVar.f19967c;
                aVar.f19967c = aVarArr[i11];
                aVarArr[i11] = aVar;
                aVar = aVar2;
            }
        }
        this.f19961a = aVarArr;
        this.f19962b = i10;
        this.f19963c = (i10 * 4) / 3;
    }

    public int e() {
        return this.f19964d;
    }

    public b(int i10) {
        this.f19962b = i10;
        this.f19963c = (i10 * 4) / 3;
        this.f19961a = new a[i10];
    }
}
