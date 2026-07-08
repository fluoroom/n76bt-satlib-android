package zj;

/* JADX INFO: loaded from: classes3.dex */
public class g1 extends yj.c {

    /* JADX INFO: renamed from: c */
    private final c f33389c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f33390a;

        static {
            int[] iArr = new int[c.values().length];
            f33390a = iArr;
            try {
                iArr[c.USE_RRA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33390a[c.USE_RR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33390a[c.USE_R.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g1(int i10, c cVar) {
        this(i10, 0.001d, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a7, code lost:
    
        if (r0 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a9, code lost:
    
        r3 = new xi.b(xi.f.f32233e, r5, xi.c.VECTOR_OPERATOR);
        r4 = xi.f.f32232d;
        r7 = r7.b(new zj.b(r3, r4, r4));
        r10 = r10 + 1;
        r17 = 1.0d;
        r9 = r0;
        r2 = r21;
        r3 = r22;
        r0 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ca, code lost:
    
        r0 = zj.b.h(r9.c(0.0d, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ee, code lost:
    
        return new zj.f1(r7.getDate(), r0.r(), r0.g(), r0.k()).b(r7);
     */
    @Override // yj.c
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zj.f1 f(yj.c.a r41) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zj.g1.f(yj.c$a):zj.f1");
    }

    public g1(int i10, double d10, c cVar) {
        super(i10, d10);
        this.f33389c = cVar;
    }
}
