package com.google.protobuf;

import com.google.protobuf.a3;
import com.google.protobuf.e0;
import com.google.protobuf.i1;
import com.google.protobuf.l1;
import com.google.protobuf.r;
import com.google.protobuf.t2;
import com.google.protobuf.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class p1 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f9276a;

        static {
            int[] iArr = new int[r.g.c.values().length];
            f9276a = iArr;
            try {
                iArr[r.g.c.f10027t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9276a[r.g.c.f10028u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9276a[r.g.c.f10031x.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class b implements e {

        /* JADX INFO: renamed from: a */
        private final i1.a f9277a;

        /* JADX INFO: renamed from: b */
        private boolean f9278b = true;

        public b(i1.a aVar) {
            this.f9277a = aVar;
        }

        private i1.a g(r.g gVar) {
            if (!this.f9278b) {
                return null;
            }
            try {
                return this.f9277a.getFieldBuilder(gVar);
            } catch (UnsupportedOperationException unused) {
                this.f9278b = false;
                return null;
            }
        }

        private i1.a i(r.g gVar, i1 i1Var) {
            return i1Var != null ? i1Var.newBuilderForType() : this.f9277a.newBuilderForField(gVar);
        }

        @Override // com.google.protobuf.p1.e
        public w.b a(w wVar, r.b bVar, int i10) {
            wVar.d(bVar, i10);
            return null;
        }

        @Override // com.google.protobuf.p1.e
        public e addRepeatedField(r.g gVar, Object obj) {
            if (obj instanceof l1.a) {
                obj = ((l1.a) obj).buildPartial();
            }
            this.f9277a.addRepeatedField(gVar, obj);
            return this;
        }

        @Override // com.google.protobuf.p1.e
        public e.a b() {
            return e.a.MESSAGE;
        }

        @Override // com.google.protobuf.p1.e
        public a3.d c(r.g gVar) {
            if (gVar.I()) {
                return a3.d.f8877b;
            }
            gVar.b();
            return a3.d.f8876a;
        }

        @Override // com.google.protobuf.p1.e
        public void d(m mVar, y yVar, r.g gVar, i1 i1Var) {
            i1.a aVarI;
            if (gVar.b()) {
                i1.a aVarI2 = i(gVar, i1Var);
                mVar.B(aVarI2, yVar);
                addRepeatedField(gVar, aVarI2.buildPartial());
                return;
            }
            if (h(gVar)) {
                i1.a aVarG = g(gVar);
                if (aVarG != null) {
                    mVar.B(aVarG, yVar);
                    return;
                } else {
                    aVarI = i(gVar, i1Var);
                    aVarI.mergeFrom((i1) f(gVar));
                }
            } else {
                aVarI = i(gVar, i1Var);
            }
            mVar.B(aVarI, yVar);
            setField(gVar, aVarI.buildPartial());
        }

        @Override // com.google.protobuf.p1.e
        public void e(m mVar, y yVar, r.g gVar, i1 i1Var) {
            i1.a aVarI;
            if (gVar.b()) {
                i1.a aVarI2 = i(gVar, i1Var);
                mVar.x(gVar.getNumber(), aVarI2, yVar);
                addRepeatedField(gVar, aVarI2.buildPartial());
                return;
            }
            if (h(gVar)) {
                i1.a aVarG = g(gVar);
                if (aVarG != null) {
                    mVar.x(gVar.getNumber(), aVarG, yVar);
                    return;
                } else {
                    aVarI = i(gVar, i1Var);
                    aVarI.mergeFrom((i1) f(gVar));
                }
            } else {
                aVarI = i(gVar, i1Var);
            }
            mVar.x(gVar.getNumber(), aVarI, yVar);
            setField(gVar, aVarI.buildPartial());
        }

        public Object f(r.g gVar) {
            return this.f9277a.getField(gVar);
        }

        public boolean h(r.g gVar) {
            return this.f9277a.hasField(gVar);
        }

        @Override // com.google.protobuf.p1.e
        public e setField(r.g gVar, Object obj) {
            if (gVar.b() || !(obj instanceof l1.a)) {
                this.f9277a.setField(gVar, obj);
                return this;
            }
            if (obj != g(gVar)) {
                this.f9277a.setField(gVar, ((l1.a) obj).buildPartial());
            }
            return this;
        }
    }

    static class c implements e {

        /* JADX INFO: renamed from: a */
        private final e0 f9279a;

        c(e0 e0Var) {
            this.f9279a = e0Var;
        }

        @Override // com.google.protobuf.p1.e
        public w.b a(w wVar, r.b bVar, int i10) {
            wVar.d(bVar, i10);
            return null;
        }

        @Override // com.google.protobuf.p1.e
        public e addRepeatedField(r.g gVar, Object obj) {
            this.f9279a.g(gVar, obj);
            return this;
        }

        @Override // com.google.protobuf.p1.e
        public e.a b() {
            return e.a.EXTENSION_SET;
        }

        @Override // com.google.protobuf.p1.e
        public a3.d c(r.g gVar) {
            return gVar.I() ? a3.d.f8877b : a3.d.f8876a;
        }

        @Override // com.google.protobuf.p1.e
        public void d(m mVar, y yVar, r.g gVar, i1 i1Var) {
            if (gVar.b()) {
                i1.a aVarNewBuilderForType = i1Var.newBuilderForType();
                mVar.B(aVarNewBuilderForType, yVar);
                addRepeatedField(gVar, aVarNewBuilderForType.buildPartial());
            } else if (g(gVar)) {
                l1.a builder = ((l1) f(gVar)).toBuilder();
                mVar.B(builder, yVar);
                setField(gVar, builder.buildPartial());
            } else {
                i1.a aVarNewBuilderForType2 = i1Var.newBuilderForType();
                mVar.B(aVarNewBuilderForType2, yVar);
                setField(gVar, aVarNewBuilderForType2.buildPartial());
            }
        }

        @Override // com.google.protobuf.p1.e
        public void e(m mVar, y yVar, r.g gVar, i1 i1Var) {
            if (gVar.b()) {
                i1.a aVarNewBuilderForType = i1Var.newBuilderForType();
                mVar.x(gVar.getNumber(), aVarNewBuilderForType, yVar);
                addRepeatedField(gVar, aVarNewBuilderForType.buildPartial());
            } else if (g(gVar)) {
                l1.a builder = ((l1) f(gVar)).toBuilder();
                mVar.x(gVar.getNumber(), builder, yVar);
                setField(gVar, builder.buildPartial());
            } else {
                i1.a aVarNewBuilderForType2 = i1Var.newBuilderForType();
                mVar.x(gVar.getNumber(), aVarNewBuilderForType2, yVar);
                setField(gVar, aVarNewBuilderForType2.buildPartial());
            }
        }

        public Object f(r.g gVar) {
            return this.f9279a.q(gVar);
        }

        public boolean g(r.g gVar) {
            return this.f9279a.x(gVar);
        }

        @Override // com.google.protobuf.p1.e
        public e setField(r.g gVar, Object obj) {
            this.f9279a.K(gVar, obj);
            return this;
        }
    }

    static class d implements e {

        /* JADX INFO: renamed from: a */
        private final e0.b f9280a;

        d(e0.b bVar) {
            this.f9280a = bVar;
        }

        @Override // com.google.protobuf.p1.e
        public w.b a(w wVar, r.b bVar, int i10) {
            wVar.d(bVar, i10);
            return null;
        }

        @Override // com.google.protobuf.p1.e
        public e addRepeatedField(r.g gVar, Object obj) {
            this.f9280a.a(gVar, obj);
            return this;
        }

        @Override // com.google.protobuf.p1.e
        public e.a b() {
            return e.a.EXTENSION_SET;
        }

        @Override // com.google.protobuf.p1.e
        public a3.d c(r.g gVar) {
            return gVar.I() ? a3.d.f8877b : a3.d.f8876a;
        }

        @Override // com.google.protobuf.p1.e
        public void d(m mVar, y yVar, r.g gVar, i1 i1Var) {
            l1.a builder;
            if (gVar.b()) {
                i1.a aVarNewBuilderForType = i1Var.newBuilderForType();
                mVar.B(aVarNewBuilderForType, yVar);
                addRepeatedField(gVar, aVarNewBuilderForType.buildPartial());
            } else if (!f(gVar)) {
                i1.a aVarNewBuilderForType2 = i1Var.newBuilderForType();
                mVar.B(aVarNewBuilderForType2, yVar);
                setField(gVar, aVarNewBuilderForType2);
            } else {
                Object objI = this.f9280a.i(gVar);
                if (objI instanceof l1.a) {
                    builder = (l1.a) objI;
                } else {
                    builder = ((l1) objI).toBuilder();
                    this.f9280a.u(gVar, builder);
                }
                mVar.B(builder, yVar);
            }
        }

        @Override // com.google.protobuf.p1.e
        public void e(m mVar, y yVar, r.g gVar, i1 i1Var) {
            l1.a builder;
            if (gVar.b()) {
                i1.a aVarNewBuilderForType = i1Var.newBuilderForType();
                mVar.x(gVar.getNumber(), aVarNewBuilderForType, yVar);
                addRepeatedField(gVar, aVarNewBuilderForType.buildPartial());
            } else if (!f(gVar)) {
                i1.a aVarNewBuilderForType2 = i1Var.newBuilderForType();
                mVar.x(gVar.getNumber(), aVarNewBuilderForType2, yVar);
                setField(gVar, aVarNewBuilderForType2);
            } else {
                Object objI = this.f9280a.i(gVar);
                if (objI instanceof l1.a) {
                    builder = (l1.a) objI;
                } else {
                    builder = ((l1) objI).toBuilder();
                    this.f9280a.u(gVar, builder);
                }
                mVar.x(gVar.getNumber(), builder, yVar);
            }
        }

        public boolean f(r.g gVar) {
            return this.f9280a.m(gVar);
        }

        @Override // com.google.protobuf.p1.e
        public e setField(r.g gVar, Object obj) {
            this.f9280a.u(gVar, obj);
            return this;
        }
    }

    interface e {

        public enum a {
            MESSAGE,
            EXTENSION_SET
        }

        w.b a(w wVar, r.b bVar, int i10);

        e addRepeatedField(r.g gVar, Object obj);

        a b();

        a3.d c(r.g gVar);

        void d(m mVar, y yVar, r.g gVar, i1 i1Var);

        void e(m mVar, y yVar, r.g gVar, i1 i1Var);

        e setField(r.g gVar, Object obj);
    }

    static String a(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    static List b(o1 o1Var) {
        ArrayList arrayList = new ArrayList();
        c(o1Var, "", arrayList);
        return arrayList;
    }

    private static void c(o1 o1Var, String str, List list) {
        for (r.g gVar : o1Var.getDescriptorForType().l()) {
            if (gVar.G() && !o1Var.hasField(gVar)) {
                list.add(str + gVar.e());
            }
        }
        for (Map.Entry entry : o1Var.getAllFields().entrySet()) {
            r.g gVar2 = (r.g) entry.getKey();
            Object value = entry.getValue();
            if (gVar2.u() == r.g.b.MESSAGE) {
                if (gVar2.b()) {
                    Iterator it = ((List) value).iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        c((o1) it.next(), g(str, gVar2, i10), list);
                        i10++;
                    }
                } else if (o1Var.hasField(gVar2)) {
                    c((o1) value, g(str, gVar2, -1), list);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean d(com.google.protobuf.m r6, com.google.protobuf.t2.b r7, com.google.protobuf.y r8, com.google.protobuf.r.b r9, com.google.protobuf.p1.e r10, int r11) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.p1.d(com.google.protobuf.m, com.google.protobuf.t2$b, com.google.protobuf.y, com.google.protobuf.r$b, com.google.protobuf.p1$e, int):boolean");
    }

    static void e(i1.a aVar, t2.b bVar, m mVar, y yVar) {
        b bVar2 = new b(aVar);
        r.b descriptorForType = aVar.getDescriptorForType();
        while (true) {
            int iK = mVar.K();
            if (iK == 0) {
                return;
            }
            t2.b bVar3 = bVar;
            m mVar2 = mVar;
            y yVar2 = yVar;
            if (!d(mVar2, bVar3, yVar2, descriptorForType, bVar2, iK)) {
                return;
            }
            mVar = mVar2;
            bVar = bVar3;
            yVar = yVar2;
        }
    }

    private static void f(m mVar, t2.b bVar, y yVar, r.b bVar2, e eVar) {
        int iL = 0;
        l lVarR = null;
        while (true) {
            int iK = mVar.K();
            if (iK == 0) {
                break;
            }
            if (iK == a3.f8845c) {
                iL = mVar.L();
                if (iL != 0 && (yVar instanceof w)) {
                    eVar.a((w) yVar, bVar2, iL);
                }
            } else if (iK == a3.f8846d) {
                lVarR = mVar.r();
            } else if (!mVar.Q(iK)) {
                break;
            }
        }
        mVar.a(a3.f8844b);
        if (lVarR == null || iL == 0 || bVar == null) {
            return;
        }
        bVar.k(iL, t2.c.s().e(lVarR).g());
    }

    private static String g(String str, r.g gVar, int i10) {
        StringBuilder sb2 = new StringBuilder(str);
        if (gVar.C()) {
            sb2.append('(');
            sb2.append(gVar.d());
            sb2.append(')');
        } else {
            sb2.append(gVar.e());
        }
        if (i10 != -1) {
            sb2.append('[');
            sb2.append(i10);
            sb2.append(']');
        }
        sb2.append('.');
        return sb2.toString();
    }
}
