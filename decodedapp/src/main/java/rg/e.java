package rg;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class e implements qg.h {

    /* JADX INFO: renamed from: a */
    private final CharSequence f26017a;

    /* JADX INFO: renamed from: b */
    private final int f26018b;

    /* JADX INFO: renamed from: c */
    private final int f26019c;

    /* JADX INFO: renamed from: d */
    private final qd.p f26020d;

    public static final class a implements Iterator, sd.a {

        /* JADX INFO: renamed from: a */
        private int f26021a = -1;

        /* JADX INFO: renamed from: b */
        private int f26022b;

        /* JADX INFO: renamed from: c */
        private int f26023c;

        /* JADX INFO: renamed from: d */
        private xd.c f26024d;

        /* JADX INFO: renamed from: e */
        private int f26025e;

        a() {
            int iE = xd.d.e(e.this.f26018b, 0, e.this.f26017a.length());
            this.f26022b = iE;
            this.f26023c = iE;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void c() {
            /*
                r6 = this;
                int r0 = r6.f26023c
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.f26021a = r1
                r0 = 0
                r6.f26024d = r0
                return
            Lb:
                rg.e r0 = rg.e.this
                int r0 = rg.e.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L22
                int r0 = r6.f26025e
                int r0 = r0 + r3
                r6.f26025e = r0
                rg.e r4 = rg.e.this
                int r4 = rg.e.d(r4)
                if (r0 >= r4) goto L30
            L22:
                int r0 = r6.f26023c
                rg.e r4 = rg.e.this
                java.lang.CharSequence r4 = rg.e.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L46
            L30:
                xd.c r0 = new xd.c
                int r1 = r6.f26022b
                rg.e r4 = rg.e.this
                java.lang.CharSequence r4 = rg.e.c(r4)
                int r4 = rg.e0.W(r4)
                r0.<init>(r1, r4)
                r6.f26024d = r0
                r6.f26023c = r2
                goto L9b
            L46:
                rg.e r0 = rg.e.this
                qd.p r0 = rg.e.b(r0)
                rg.e r4 = rg.e.this
                java.lang.CharSequence r4 = rg.e.c(r4)
                int r5 = r6.f26023c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.s(r4, r5)
                dd.q r0 = (dd.q) r0
                if (r0 != 0) goto L76
                xd.c r0 = new xd.c
                int r1 = r6.f26022b
                rg.e r4 = rg.e.this
                java.lang.CharSequence r4 = rg.e.c(r4)
                int r4 = rg.e0.W(r4)
                r0.<init>(r1, r4)
                r6.f26024d = r0
                r6.f26023c = r2
                goto L9b
            L76:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f26022b
                xd.c r4 = xd.d.i(r4, r2)
                r6.f26024d = r4
                int r2 = r2 + r0
                r6.f26022b = r2
                if (r0 != 0) goto L98
                r1 = 1
            L98:
                int r2 = r2 + r1
                r6.f26023c = r2
            L9b:
                r6.f26021a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rg.e.a.c():void");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d */
        public xd.c next() {
            if (this.f26021a == -1) {
                c();
            }
            if (this.f26021a == 0) {
                throw new NoSuchElementException();
            }
            xd.c cVar = this.f26024d;
            rd.m.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f26024d = null;
            this.f26021a = -1;
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f26021a == -1) {
                c();
            }
            return this.f26021a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(CharSequence charSequence, int i10, int i11, qd.p pVar) {
        rd.m.e(charSequence, "input");
        rd.m.e(pVar, "getNextMatch");
        this.f26017a = charSequence;
        this.f26018b = i10;
        this.f26019c = i11;
        this.f26020d = pVar;
    }

    @Override // qg.h
    public Iterator iterator() {
        return new a();
    }
}
