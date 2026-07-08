package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a3;
import com.google.protobuf.e0;
import com.google.protobuf.i1;
import com.google.protobuf.j0;
import com.google.protobuf.o0;
import com.google.protobuf.p1;
import com.google.protobuf.r;
import com.google.protobuf.s0;
import com.google.protobuf.t;
import com.google.protobuf.t2;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 extends com.google.protobuf.a implements Serializable {
    protected static boolean alwaysUseFieldBuilders = false;
    private static final long serialVersionUID = 1;
    protected t2 unknownFields;

    class a implements c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ a.b f9048a;

        a(a.b bVar) {
            this.f9048a = bVar;
        }

        @Override // com.google.protobuf.a.b
        public void a() {
            this.f9048a.a();
        }
    }

    public static abstract class b extends a.AbstractC0131a {
        private c builderParent;
        private boolean isClean;
        private com.google.protobuf.k0$b.a meAsParent;
        private Object unknownFieldsOrBuilder;

        private class a implements c {
            private a() {
            }

            @Override // com.google.protobuf.a.b
            public void a() {
                b.this.onChanged();
            }

            /* synthetic */ a(b bVar, a aVar) {
                this();
            }
        }

        protected b() {
            this(null);
        }

        public Map d() {
            TreeMap treeMap = new TreeMap();
            List listL = internalGetFieldAccessorTable().f9057a.l();
            int iL = 0;
            while (iL < listL.size()) {
                r.g oneofFieldDescriptor = (r.g) listL.get(iL);
                r.l lVarL = oneofFieldDescriptor.l();
                if (lVarL != null) {
                    iL += lVarL.l() - 1;
                    if (hasOneof(lVarL)) {
                        oneofFieldDescriptor = getOneofFieldDescriptor(lVarL);
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    }
                } else if (oneofFieldDescriptor.b()) {
                    List list = (List) getField(oneofFieldDescriptor);
                    if (!list.isEmpty()) {
                        treeMap.put(oneofFieldDescriptor, list);
                    }
                } else if (hasField(oneofFieldDescriptor)) {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
                iL++;
            }
            return treeMap;
        }

        private b f(t2 t2Var) {
            this.unknownFieldsOrBuilder = t2Var;
            onChanged();
            return this;
        }

        public b addRepeatedField(r.g gVar, Object obj) {
            internalGetFieldAccessorTable().e(gVar).f(this, obj);
            return this;
        }

        /* JADX INFO: renamed from: clear */
        public b m1139clear() {
            this.unknownFieldsOrBuilder = t2.c();
            onChanged();
            return this;
        }

        /* JADX INFO: renamed from: clearField */
        public b m1140clearField(r.g gVar) {
            internalGetFieldAccessorTable().e(gVar).a(this);
            return this;
        }

        /* JADX INFO: renamed from: clearOneof */
        public b m1142clearOneof(r.l lVar) {
            internalGetFieldAccessorTable().f(lVar).a(this);
            return this;
        }

        /* JADX INFO: renamed from: clone */
        public b m1147clone() {
            b bVar = (b) getDefaultInstanceForType().newBuilderForType();
            bVar.mergeFrom(buildPartial());
            return bVar;
        }

        @Override // com.google.protobuf.a.AbstractC0131a
        void dispose() {
            this.builderParent = null;
        }

        @Override // com.google.protobuf.o1
        public Map<r.g, Object> getAllFields() {
            return DesugarCollections.unmodifiableMap(d());
        }

        public abstract r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        public Object getField(r.g gVar) {
            Object objC = internalGetFieldAccessorTable().e(gVar).c(this);
            return gVar.b() ? DesugarCollections.unmodifiableList((List) objC) : objC;
        }

        @Override // com.google.protobuf.i1.a
        public i1.a getFieldBuilder(r.g gVar) {
            return internalGetFieldAccessorTable().e(gVar).p(this);
        }

        public r.g getOneofFieldDescriptor(r.l lVar) {
            return internalGetFieldAccessorTable().f(lVar).c(this);
        }

        protected c getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new a(this, null);
            }
            return this.meAsParent;
        }

        public Object getRepeatedField(r.g gVar, int i10) {
            return internalGetFieldAccessorTable().e(gVar).k(this, i10);
        }

        public i1.a getRepeatedFieldBuilder(r.g gVar, int i10) {
            return internalGetFieldAccessorTable().e(gVar).n(this, i10);
        }

        public int getRepeatedFieldCount(r.g gVar) {
            return internalGetFieldAccessorTable().e(gVar).g(this);
        }

        @Override // com.google.protobuf.a.AbstractC0131a
        protected t2.b getUnknownFieldSetBuilder() {
            Object obj = this.unknownFieldsOrBuilder;
            if (obj instanceof t2) {
                this.unknownFieldsOrBuilder = ((t2) obj).toBuilder();
            }
            onChanged();
            return (t2.b) this.unknownFieldsOrBuilder;
        }

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final t2 getUnknownFields() {
            Object obj = this.unknownFieldsOrBuilder;
            return obj instanceof t2 ? (t2) obj : ((t2.b) obj).buildPartial();
        }

        @Override // com.google.protobuf.o1
        public boolean hasField(r.g gVar) {
            return internalGetFieldAccessorTable().e(gVar).e(this);
        }

        public boolean hasOneof(r.l lVar) {
            return internalGetFieldAccessorTable().f(lVar).e(this);
        }

        protected abstract f internalGetFieldAccessorTable();

        @Deprecated
        protected b1 internalGetMapField(int i10) {
            throw new IllegalArgumentException("No map fields found in " + getClass().getName());
        }

        protected d1 internalGetMapFieldReflection(int i10) {
            return internalGetMapField(i10);
        }

        @Deprecated
        protected b1 internalGetMutableMapField(int i10) {
            throw new IllegalArgumentException("No map fields found in " + getClass().getName());
        }

        protected d1 internalGetMutableMapFieldReflection(int i10) {
            return internalGetMutableMapField(i10);
        }

        protected boolean isClean() {
            return this.isClean;
        }

        @Override // com.google.protobuf.a.AbstractC0131a
        protected void markClean() {
            this.isClean = true;
        }

        @Override // com.google.protobuf.a.AbstractC0131a
        /* JADX INFO: renamed from: mergeUnknownFields */
        public b m1148mergeUnknownFields(t2 t2Var) {
            if (t2.c().equals(t2Var)) {
                return this;
            }
            if (t2.c().equals(this.unknownFieldsOrBuilder)) {
                this.unknownFieldsOrBuilder = t2Var;
                onChanged();
                return this;
            }
            getUnknownFieldSetBuilder().r(t2Var);
            onChanged();
            return this;
        }

        protected final void mergeUnknownLengthDelimitedField(int i10, l lVar) {
            getUnknownFieldSetBuilder().t(i10, lVar);
        }

        protected final void mergeUnknownVarintField(int i10, int i11) {
            getUnknownFieldSetBuilder().u(i10, i11);
        }

        @Override // com.google.protobuf.i1.a
        public i1.a newBuilderForField(r.g gVar) {
            return internalGetFieldAccessorTable().e(gVar).m();
        }

        protected void onBuilt() {
            if (this.builderParent != null) {
                markClean();
            }
        }

        protected final void onChanged() {
            c cVar;
            if (!this.isClean || (cVar = this.builderParent) == null) {
                return;
            }
            cVar.a();
            this.isClean = false;
        }

        protected boolean parseUnknownField(m mVar, y yVar, int i10) throws IOException {
            return mVar.P() ? mVar.Q(i10) : getUnknownFieldSetBuilder().m(i10, mVar);
        }

        public b setField(r.g gVar, Object obj) {
            internalGetFieldAccessorTable().e(gVar).i(this, obj);
            return this;
        }

        /* JADX INFO: renamed from: setRepeatedField */
        public b m1149setRepeatedField(r.g gVar, int i10, Object obj) {
            internalGetFieldAccessorTable().e(gVar).j(this, i10, obj);
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0131a
        protected void setUnknownFieldSetBuilder(t2.b bVar) {
            this.unknownFieldsOrBuilder = bVar;
            onChanged();
        }

        public b setUnknownFields(t2 t2Var) {
            return f(t2Var);
        }

        protected b setUnknownFieldsProto3(t2 t2Var) {
            return f(t2Var);
        }

        protected b(c cVar) {
            this.unknownFieldsOrBuilder = t2.c();
            this.builderParent = cVar;
        }
    }

    public interface c extends a.b {
    }

    public static abstract class d extends b implements o1 {

        /* JADX INFO: renamed from: a */
        private e0.b f9051a;

        protected d() {
        }

        public e0 i() {
            e0.b bVar = this.f9051a;
            return bVar == null ? e0.o() : bVar.d();
        }

        private void k() {
            if (this.f9051a == null) {
                this.f9051a = e0.I();
            }
        }

        private void p(r.g gVar) {
            if (gVar.m() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        @Override // com.google.protobuf.k0.b, com.google.protobuf.o1
        public Map getAllFields() {
            Map mapD = d();
            e0.b bVar = this.f9051a;
            if (bVar != null) {
                mapD.putAll(bVar.g());
            }
            return DesugarCollections.unmodifiableMap(mapD);
        }

        @Override // com.google.protobuf.k0.b, com.google.protobuf.o1
        public Object getField(r.g gVar) {
            if (!gVar.C()) {
                return super.getField(gVar);
            }
            p(gVar);
            e0.b bVar = this.f9051a;
            Object objH = bVar == null ? null : bVar.h(gVar);
            return objH == null ? gVar.u() == r.g.b.MESSAGE ? t.k(gVar.v()) : gVar.n() : objH;
        }

        @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
        public i1.a getFieldBuilder(r.g gVar) {
            if (!gVar.C()) {
                return super.getFieldBuilder(gVar);
            }
            p(gVar);
            if (gVar.u() != r.g.b.MESSAGE) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
            k();
            Object objI = this.f9051a.i(gVar);
            if (objI == null) {
                t.c cVarO = t.o(gVar.v());
                this.f9051a.u(gVar, cVarO);
                onChanged();
                return cVarO;
            }
            if (objI instanceof i1.a) {
                return (i1.a) objI;
            }
            if (!(objI instanceof i1)) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            i1.a builder = ((i1) objI).toBuilder();
            this.f9051a.u(gVar, builder);
            onChanged();
            return builder;
        }

        @Override // com.google.protobuf.k0.b
        public Object getRepeatedField(r.g gVar, int i10) {
            if (!gVar.C()) {
                return super.getRepeatedField(gVar, i10);
            }
            p(gVar);
            e0.b bVar = this.f9051a;
            if (bVar != null) {
                return bVar.j(gVar, i10);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.protobuf.k0.b
        public i1.a getRepeatedFieldBuilder(r.g gVar, int i10) {
            if (!gVar.C()) {
                return super.getRepeatedFieldBuilder(gVar, i10);
            }
            p(gVar);
            k();
            if (gVar.u() != r.g.b.MESSAGE) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            Object objK = this.f9051a.k(gVar, i10);
            if (objK instanceof i1.a) {
                return (i1.a) objK;
            }
            if (!(objK instanceof i1)) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            i1.a builder = ((i1) objK).toBuilder();
            this.f9051a.v(gVar, i10, builder);
            onChanged();
            return builder;
        }

        @Override // com.google.protobuf.k0.b
        public int getRepeatedFieldCount(r.g gVar) {
            if (!gVar.C()) {
                return super.getRepeatedFieldCount(gVar);
            }
            p(gVar);
            e0.b bVar = this.f9051a;
            if (bVar == null) {
                return 0;
            }
            return bVar.l(gVar);
        }

        public d h(r.g gVar, Object obj) {
            if (!gVar.C()) {
                return (d) super.addRepeatedField(gVar, obj);
            }
            p(gVar);
            k();
            this.f9051a.a(gVar, obj);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.k0.b, com.google.protobuf.o1
        public boolean hasField(r.g gVar) {
            if (!gVar.C()) {
                return super.hasField(gVar);
            }
            p(gVar);
            e0.b bVar = this.f9051a;
            return bVar != null && bVar.m(gVar);
        }

        public d j(r.g gVar) {
            if (!gVar.C()) {
                return (d) super.m1140clearField(gVar);
            }
            p(gVar);
            k();
            this.f9051a.e(gVar);
            onChanged();
            return this;
        }

        protected boolean m() {
            e0.b bVar = this.f9051a;
            return bVar == null || bVar.n();
        }

        protected final void n(e eVar) {
            if (eVar.f9052a != null) {
                k();
                this.f9051a.o(eVar.f9052a);
                onChanged();
            }
        }

        @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
        public i1.a newBuilderForField(r.g gVar) {
            return gVar.C() ? t.o(gVar.v()) : super.newBuilderForField(gVar);
        }

        public d o(r.g gVar, Object obj) {
            if (!gVar.C()) {
                return (d) super.setField(gVar, obj);
            }
            p(gVar);
            k();
            this.f9051a.u(gVar, obj);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.k0.b
        protected boolean parseUnknownField(m mVar, y yVar, int i10) {
            k();
            return p1.d(mVar, mVar.P() ? null : getUnknownFieldSetBuilder(), yVar, getDescriptorForType(), new p1.d(this.f9051a), i10);
        }

        protected d(c cVar) {
            super(cVar);
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a */
        private final r.b f9057a;

        /* JADX INFO: renamed from: b */
        private final a[] f9058b;

        /* JADX INFO: renamed from: c */
        private String[] f9059c;

        /* JADX INFO: renamed from: d */
        private final c[] f9060d;

        /* JADX INFO: renamed from: e */
        private volatile boolean f9061e = false;

        private interface a {
            void a(b bVar);

            Object b(k0 k0Var);

            Object c(b bVar);

            boolean d(k0 k0Var);

            boolean e(b bVar);

            void f(b bVar, Object obj);

            int g(b bVar);

            int h(k0 k0Var);

            void i(b bVar, Object obj);

            void j(b bVar, int i10, Object obj);

            Object k(b bVar, int i10);

            Object l(k0 k0Var, int i10);

            i1.a m();

            i1.a n(b bVar, int i10);

            Object o(k0 k0Var);

            i1.a p(b bVar);
        }

        private static class b implements a {

            /* JADX INFO: renamed from: a */
            private final r.g f9062a;

            /* JADX INFO: renamed from: b */
            private final i1 f9063b;

            b(r.g gVar, Class cls) {
                this.f9062a = gVar;
                this.f9063b = s((k0) k0.j(k0.i(cls, "getDefaultInstance", new Class[0]), null, new Object[0])).c();
            }

            private i1 q(i1 i1Var) {
                if (i1Var == null) {
                    return null;
                }
                return this.f9063b.getClass().isInstance(i1Var) ? i1Var : this.f9063b.toBuilder().mergeFrom(i1Var).build();
            }

            private d1 r(b bVar) {
                return bVar.internalGetMapFieldReflection(this.f9062a.getNumber());
            }

            private d1 s(k0 k0Var) {
                return k0Var.internalGetMapFieldReflection(this.f9062a.getNumber());
            }

            private d1 t(b bVar) {
                return bVar.internalGetMutableMapFieldReflection(this.f9062a.getNumber());
            }

            @Override // com.google.protobuf.k0.f.a
            public void a(b bVar) {
                t(bVar).d().clear();
            }

            @Override // com.google.protobuf.k0.f.a
            public Object b(k0 k0Var) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < h(k0Var); i10++) {
                    arrayList.add(l(k0Var, i10));
                }
                return DesugarCollections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.k0.f.a
            public Object c(b bVar) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < g(bVar); i10++) {
                    arrayList.add(k(bVar, i10));
                }
                return DesugarCollections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.k0.f.a
            public boolean d(k0 k0Var) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.google.protobuf.k0.f.a
            public boolean e(b bVar) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.google.protobuf.k0.f.a
            public void f(b bVar, Object obj) {
                t(bVar).d().add(q((i1) obj));
            }

            @Override // com.google.protobuf.k0.f.a
            public int g(b bVar) {
                return r(bVar).b().size();
            }

            @Override // com.google.protobuf.k0.f.a
            public int h(k0 k0Var) {
                return s(k0Var).b().size();
            }

            @Override // com.google.protobuf.k0.f.a
            public void i(b bVar, Object obj) {
                a(bVar);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    f(bVar, it.next());
                }
            }

            @Override // com.google.protobuf.k0.f.a
            public void j(b bVar, int i10, Object obj) {
                t(bVar).d().set(i10, q((i1) obj));
            }

            @Override // com.google.protobuf.k0.f.a
            public Object k(b bVar, int i10) {
                return r(bVar).b().get(i10);
            }

            @Override // com.google.protobuf.k0.f.a
            public Object l(k0 k0Var, int i10) {
                return s(k0Var).b().get(i10);
            }

            @Override // com.google.protobuf.k0.f.a
            public i1.a m() {
                return this.f9063b.newBuilderForType();
            }

            @Override // com.google.protobuf.k0.f.a
            public i1.a n(b bVar, int i10) {
                throw new UnsupportedOperationException("Map fields cannot be repeated");
            }

            @Override // com.google.protobuf.k0.f.a
            public Object o(k0 k0Var) {
                return b(k0Var);
            }

            @Override // com.google.protobuf.k0.f.a
            public i1.a p(b bVar) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }
        }

        private interface c {
            void a(b bVar);

            r.g b(k0 k0Var);

            r.g c(b bVar);

            boolean d(k0 k0Var);

            boolean e(b bVar);
        }

        private static class d implements c {

            /* JADX INFO: renamed from: a */
            private final r.b f9064a;

            /* JADX INFO: renamed from: b */
            private final Method f9065b;

            /* JADX INFO: renamed from: c */
            private final Method f9066c;

            /* JADX INFO: renamed from: d */
            private final Method f9067d;

            d(r.b bVar, int i10, String str, Class cls, Class cls2) {
                this.f9064a = bVar;
                this.f9065b = k0.i(cls, "get" + str + "Case", new Class[0]);
                this.f9066c = k0.i(cls2, "get" + str + "Case", new Class[0]);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("clear");
                sb2.append(str);
                this.f9067d = k0.i(cls2, sb2.toString(), new Class[0]);
            }

            @Override // com.google.protobuf.k0.f.c
            public void a(b bVar) {
                k0.j(this.f9067d, bVar, new Object[0]);
            }

            @Override // com.google.protobuf.k0.f.c
            public r.g b(k0 k0Var) {
                int number = ((o0.c) k0.j(this.f9065b, k0Var, new Object[0])).getNumber();
                if (number > 0) {
                    return this.f9064a.j(number);
                }
                return null;
            }

            @Override // com.google.protobuf.k0.f.c
            public r.g c(b bVar) {
                int number = ((o0.c) k0.j(this.f9066c, bVar, new Object[0])).getNumber();
                if (number > 0) {
                    return this.f9064a.j(number);
                }
                return null;
            }

            @Override // com.google.protobuf.k0.f.c
            public boolean d(k0 k0Var) {
                return ((o0.c) k0.j(this.f9065b, k0Var, new Object[0])).getNumber() != 0;
            }

            @Override // com.google.protobuf.k0.f.c
            public boolean e(b bVar) {
                return ((o0.c) k0.j(this.f9066c, bVar, new Object[0])).getNumber() != 0;
            }
        }

        private static final class e extends C0135f {

            /* JADX INFO: renamed from: c */
            private final r.e f9068c;

            /* JADX INFO: renamed from: d */
            private final Method f9069d;

            /* JADX INFO: renamed from: e */
            private final Method f9070e;

            /* JADX INFO: renamed from: f */
            private final boolean f9071f;

            /* JADX INFO: renamed from: g */
            private Method f9072g;

            /* JADX INFO: renamed from: h */
            private Method f9073h;

            /* JADX INFO: renamed from: i */
            private Method f9074i;

            /* JADX INFO: renamed from: j */
            private Method f9075j;

            e(r.g gVar, String str, Class cls, Class cls2) {
                super(gVar, str, cls, cls2);
                this.f9068c = gVar.q();
                this.f9069d = k0.i(this.f9076a, "valueOf", r.f.class);
                this.f9070e = k0.i(this.f9076a, "getValueDescriptor", new Class[0]);
                boolean zH = gVar.H();
                this.f9071f = !zH;
                if (zH) {
                    return;
                }
                Class cls3 = Integer.TYPE;
                this.f9072g = k0.i(cls, "get" + str + "Value", cls3);
                this.f9073h = k0.i(cls2, "get" + str + "Value", cls3);
                this.f9074i = k0.i(cls2, "set" + str + "Value", cls3, cls3);
                this.f9075j = k0.i(cls2, "add" + str + "Value", cls3);
            }

            @Override // com.google.protobuf.k0.f.C0135f, com.google.protobuf.k0.f.a
            public Object b(k0 k0Var) {
                ArrayList arrayList = new ArrayList();
                int iH = h(k0Var);
                for (int i10 = 0; i10 < iH; i10++) {
                    arrayList.add(l(k0Var, i10));
                }
                return DesugarCollections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.k0.f.C0135f, com.google.protobuf.k0.f.a
            public Object c(b bVar) {
                ArrayList arrayList = new ArrayList();
                int iG = g(bVar);
                for (int i10 = 0; i10 < iG; i10++) {
                    arrayList.add(k(bVar, i10));
                }
                return DesugarCollections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.k0.f.C0135f, com.google.protobuf.k0.f.a
            public void f(b bVar, Object obj) {
                if (this.f9071f) {
                    k0.j(this.f9075j, bVar, Integer.valueOf(((r.f) obj).getNumber()));
                } else {
                    super.f(bVar, k0.j(this.f9069d, null, obj));
                }
            }

            @Override // com.google.protobuf.k0.f.C0135f, com.google.protobuf.k0.f.a
            public void j(b bVar, int i10, Object obj) {
                if (this.f9071f) {
                    k0.j(this.f9074i, bVar, Integer.valueOf(i10), Integer.valueOf(((r.f) obj).getNumber()));
                } else {
                    super.j(bVar, i10, k0.j(this.f9069d, null, obj));
                }
            }

            @Override // com.google.protobuf.k0.f.C0135f, com.google.protobuf.k0.f.a
            public Object k(b bVar, int i10) {
                return this.f9071f ? this.f9068c.j(((Integer) k0.j(this.f9073h, bVar, Integer.valueOf(i10))).intValue()) : k0.j(this.f9070e, super.k(bVar, i10), new Object[0]);
            }

            @Override // com.google.protobuf.k0.f.C0135f, com.google.protobuf.k0.f.a
            public Object l(k0 k0Var, int i10) {
                return this.f9071f ? this.f9068c.j(((Integer) k0.j(this.f9072g, k0Var, Integer.valueOf(i10))).intValue()) : k0.j(this.f9070e, super.l(k0Var, i10), new Object[0]);
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.k0$f$f */
        private static class C0135f implements a {

            /* JADX INFO: renamed from: a */
            protected final Class f9076a;

            /* JADX INFO: renamed from: b */
            protected final a f9077b;

            /* JADX INFO: renamed from: com.google.protobuf.k0$f$f$a */
            interface a {
                void a(b bVar);

                Object b(k0 k0Var);

                Object c(b bVar);

                void f(b bVar, Object obj);

                int g(b bVar);

                int h(k0 k0Var);

                void j(b bVar, int i10, Object obj);

                Object k(b bVar, int i10);

                Object l(k0 k0Var, int i10);
            }

            /* JADX INFO: renamed from: com.google.protobuf.k0$f$f$b */
            private static final class b implements a {

                /* JADX INFO: renamed from: a */
                private final Method f9078a;

                /* JADX INFO: renamed from: b */
                private final Method f9079b;

                /* JADX INFO: renamed from: c */
                private final Method f9080c;

                /* JADX INFO: renamed from: d */
                private final Method f9081d;

                /* JADX INFO: renamed from: e */
                private final Method f9082e;

                /* JADX INFO: renamed from: f */
                private final Method f9083f;

                /* JADX INFO: renamed from: g */
                private final Method f9084g;

                /* JADX INFO: renamed from: h */
                private final Method f9085h;

                /* JADX INFO: renamed from: i */
                private final Method f9086i;

                b(r.g gVar, String str, Class cls, Class cls2) {
                    this.f9078a = k0.i(cls, "get" + str + "List", new Class[0]);
                    this.f9079b = k0.i(cls2, "get" + str + "List", new Class[0]);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    sb2.append(str);
                    String string = sb2.toString();
                    Class cls3 = Integer.TYPE;
                    Method methodI = k0.i(cls, string, cls3);
                    this.f9080c = methodI;
                    this.f9081d = k0.i(cls2, "get" + str, cls3);
                    Class<?> returnType = methodI.getReturnType();
                    this.f9082e = k0.i(cls2, "set" + str, cls3, returnType);
                    this.f9083f = k0.i(cls2, "add" + str, returnType);
                    this.f9084g = k0.i(cls, "get" + str + "Count", new Class[0]);
                    this.f9085h = k0.i(cls2, "get" + str + "Count", new Class[0]);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("clear");
                    sb3.append(str);
                    this.f9086i = k0.i(cls2, sb3.toString(), new Class[0]);
                }

                @Override // com.google.protobuf.k0.f.C0135f.a
                public void a(b bVar) {
                    k0.j(this.f9086i, bVar, new Object[0]);
                }

                @Override // com.google.protobuf.k0.f.C0135f.a
                public Object b(k0 k0Var) {
                    return k0.j(this.f9078a, k0Var, new Object[0]);
                }

                @Override // com.google.protobuf.k0.f.C0135f.a
                public Object c(b bVar) {
                    return k0.j(this.f9079b, bVar, new Object[0]);
                }

                @Override // com.google.protobuf.k0.f.C0135f.a
                public void f(b bVar, Object obj) {
                    k0.j(this.f9083f, bVar, obj);
                }

                @Override // com.google.protobuf.k0.f.C0135f.a
                public int g(b bVar) {
                    return ((Integer) k0.j(this.f9085h, bVar, new Object[0])).intValue();
                }

                @Override // com.google.protobuf.k0.f.C0135f.a
                public int h(k0 k0Var) {
                    return ((Integer) k0.j(this.f9084g, k0Var, new Object[0])).intValue();
                }

                @Override // com.google.protobuf.k0.f.C0135f.a
                public void j(b bVar, int i10, Object obj) {
                    k0.j(this.f9082e, bVar, Integer.valueOf(i10), obj);
                }

                @Override // com.google.protobuf.k0.f.C0135f.a
                public Object k(b bVar, int i10) {
                    return k0.j(this.f9081d, bVar, Integer.valueOf(i10));
                }

                @Override // com.google.protobuf.k0.f.C0135f.a
                public Object l(k0 k0Var, int i10) {
                    return k0.j(this.f9080c, k0Var, Integer.valueOf(i10));
                }
            }

            C0135f(r.g gVar, String str, Class cls, Class cls2) {
                b bVar = new b(gVar, str, cls, cls2);
                this.f9076a = bVar.f9080c.getReturnType();
                this.f9077b = q(bVar);
            }

            static a q(b bVar) {
                return bVar;
            }

            @Override // com.google.protobuf.k0.f.a
            public void a(b bVar) {
                this.f9077b.a(bVar);
            }

            @Override // com.google.protobuf.k0.f.a
            public Object b(k0 k0Var) {
                return this.f9077b.b(k0Var);
            }

            @Override // com.google.protobuf.k0.f.a
            public Object c(b bVar) {
                return this.f9077b.c(bVar);
            }

            @Override // com.google.protobuf.k0.f.a
            public boolean d(k0 k0Var) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.google.protobuf.k0.f.a
            public boolean e(b bVar) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.google.protobuf.k0.f.a
            public void f(b bVar, Object obj) {
                this.f9077b.f(bVar, obj);
            }

            @Override // com.google.protobuf.k0.f.a
            public int g(b bVar) {
                return this.f9077b.g(bVar);
            }

            @Override // com.google.protobuf.k0.f.a
            public int h(k0 k0Var) {
                return this.f9077b.h(k0Var);
            }

            @Override // com.google.protobuf.k0.f.a
            public void i(b bVar, Object obj) {
                a(bVar);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    f(bVar, it.next());
                }
            }

            @Override // com.google.protobuf.k0.f.a
            public void j(b bVar, int i10, Object obj) {
                this.f9077b.j(bVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.f.a
            public Object k(b bVar, int i10) {
                return this.f9077b.k(bVar, i10);
            }

            @Override // com.google.protobuf.k0.f.a
            public Object l(k0 k0Var, int i10) {
                return this.f9077b.l(k0Var, i10);
            }

            @Override // com.google.protobuf.k0.f.a
            public i1.a m() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.google.protobuf.k0.f.a
            public i1.a n(b bVar, int i10) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.k0.f.a
            public Object o(k0 k0Var) {
                return b(k0Var);
            }

            @Override // com.google.protobuf.k0.f.a
            public i1.a p(b bVar) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
        }

        private static final class g extends C0135f {

            /* JADX INFO: renamed from: c */
            private final Method f9087c;

            /* JADX INFO: renamed from: d */
            private final Method f9088d;

            g(r.g gVar, String str, Class cls, Class cls2) {
                super(gVar, str, cls, cls2);
                this.f9087c = k0.i(this.f9076a, "newBuilder", new Class[0]);
                this.f9088d = k0.i(cls2, "get" + str + "Builder", Integer.TYPE);
            }

            private Object r(Object obj) {
                return this.f9076a.isInstance(obj) ? obj : ((i1.a) k0.j(this.f9087c, null, new Object[0])).mergeFrom((i1) obj).build();
            }

            @Override // com.google.protobuf.k0.f.C0135f, com.google.protobuf.k0.f.a
            public void f(b bVar, Object obj) {
                super.f(bVar, r(obj));
            }

            @Override // com.google.protobuf.k0.f.C0135f, com.google.protobuf.k0.f.a
            public void j(b bVar, int i10, Object obj) {
                super.j(bVar, i10, r(obj));
            }

            @Override // com.google.protobuf.k0.f.C0135f, com.google.protobuf.k0.f.a
            public i1.a m() {
                return (i1.a) k0.j(this.f9087c, null, new Object[0]);
            }

            @Override // com.google.protobuf.k0.f.C0135f, com.google.protobuf.k0.f.a
            public i1.a n(b bVar, int i10) {
                return (i1.a) k0.j(this.f9088d, bVar, Integer.valueOf(i10));
            }
        }

        private static final class h extends i {

            /* JADX INFO: renamed from: f */
            private final r.e f9089f;

            /* JADX INFO: renamed from: g */
            private final Method f9090g;

            /* JADX INFO: renamed from: h */
            private final Method f9091h;

            /* JADX INFO: renamed from: i */
            private final boolean f9092i;

            /* JADX INFO: renamed from: j */
            private Method f9093j;

            /* JADX INFO: renamed from: k */
            private Method f9094k;

            /* JADX INFO: renamed from: l */
            private Method f9095l;

            h(r.g gVar, String str, Class cls, Class cls2, String str2) {
                super(gVar, str, cls, cls2, str2);
                this.f9089f = gVar.q();
                this.f9090g = k0.i(this.f9096a, "valueOf", r.f.class);
                this.f9091h = k0.i(this.f9096a, "getValueDescriptor", new Class[0]);
                boolean zH = gVar.H();
                this.f9092i = !zH;
                if (zH) {
                    return;
                }
                this.f9093j = k0.i(cls, "get" + str + "Value", new Class[0]);
                this.f9094k = k0.i(cls2, "get" + str + "Value", new Class[0]);
                this.f9095l = k0.i(cls2, "set" + str + "Value", Integer.TYPE);
            }

            @Override // com.google.protobuf.k0.f.i, com.google.protobuf.k0.f.a
            public Object b(k0 k0Var) {
                if (!this.f9092i) {
                    return k0.j(this.f9091h, super.b(k0Var), new Object[0]);
                }
                return this.f9089f.j(((Integer) k0.j(this.f9093j, k0Var, new Object[0])).intValue());
            }

            @Override // com.google.protobuf.k0.f.i, com.google.protobuf.k0.f.a
            public Object c(b bVar) {
                if (!this.f9092i) {
                    return k0.j(this.f9091h, super.c(bVar), new Object[0]);
                }
                return this.f9089f.j(((Integer) k0.j(this.f9094k, bVar, new Object[0])).intValue());
            }

            @Override // com.google.protobuf.k0.f.i, com.google.protobuf.k0.f.a
            public void i(b bVar, Object obj) {
                if (this.f9092i) {
                    k0.j(this.f9095l, bVar, Integer.valueOf(((r.f) obj).getNumber()));
                } else {
                    super.i(bVar, k0.j(this.f9090g, null, obj));
                }
            }
        }

        private static class i implements a {

            /* JADX INFO: renamed from: a */
            protected final Class f9096a;

            /* JADX INFO: renamed from: b */
            protected final r.g f9097b;

            /* JADX INFO: renamed from: c */
            protected final boolean f9098c;

            /* JADX INFO: renamed from: d */
            protected final boolean f9099d;

            /* JADX INFO: renamed from: e */
            protected final a f9100e;

            private interface a {
                void a(b bVar);

                Object b(k0 k0Var);

                Object c(b bVar);

                boolean d(k0 k0Var);

                boolean e(b bVar);

                int f(k0 k0Var);

                int g(b bVar);

                void i(b bVar, Object obj);
            }

            private static final class b implements a {

                /* JADX INFO: renamed from: a */
                private final Method f9101a;

                /* JADX INFO: renamed from: b */
                private final Method f9102b;

                /* JADX INFO: renamed from: c */
                private final Method f9103c;

                /* JADX INFO: renamed from: d */
                private final Method f9104d;

                /* JADX INFO: renamed from: e */
                private final Method f9105e;

                /* JADX INFO: renamed from: f */
                private final Method f9106f;

                /* JADX INFO: renamed from: g */
                private final Method f9107g;

                /* JADX INFO: renamed from: h */
                private final Method f9108h;

                b(r.g gVar, String str, Class cls, Class cls2, String str2, boolean z10, boolean z11) {
                    Method methodI;
                    Method methodI2;
                    Method methodI3;
                    Method methodI4 = k0.i(cls, "get" + str, new Class[0]);
                    this.f9101a = methodI4;
                    this.f9102b = k0.i(cls2, "get" + str, new Class[0]);
                    this.f9103c = k0.i(cls2, "set" + str, methodI4.getReturnType());
                    Method methodI5 = null;
                    if (z11) {
                        methodI = k0.i(cls, "has" + str, new Class[0]);
                    } else {
                        methodI = null;
                    }
                    this.f9104d = methodI;
                    if (z11) {
                        methodI2 = k0.i(cls2, "has" + str, new Class[0]);
                    } else {
                        methodI2 = null;
                    }
                    this.f9105e = methodI2;
                    this.f9106f = k0.i(cls2, "clear" + str, new Class[0]);
                    if (z10) {
                        methodI3 = k0.i(cls, "get" + str2 + "Case", new Class[0]);
                    } else {
                        methodI3 = null;
                    }
                    this.f9107g = methodI3;
                    if (z10) {
                        methodI5 = k0.i(cls2, "get" + str2 + "Case", new Class[0]);
                    }
                    this.f9108h = methodI5;
                }

                @Override // com.google.protobuf.k0.f.i.a
                public void a(b bVar) {
                    k0.j(this.f9106f, bVar, new Object[0]);
                }

                @Override // com.google.protobuf.k0.f.i.a
                public Object b(k0 k0Var) {
                    return k0.j(this.f9101a, k0Var, new Object[0]);
                }

                @Override // com.google.protobuf.k0.f.i.a
                public Object c(b bVar) {
                    return k0.j(this.f9102b, bVar, new Object[0]);
                }

                @Override // com.google.protobuf.k0.f.i.a
                public boolean d(k0 k0Var) {
                    return ((Boolean) k0.j(this.f9104d, k0Var, new Object[0])).booleanValue();
                }

                @Override // com.google.protobuf.k0.f.i.a
                public boolean e(b bVar) {
                    return ((Boolean) k0.j(this.f9105e, bVar, new Object[0])).booleanValue();
                }

                @Override // com.google.protobuf.k0.f.i.a
                public int f(k0 k0Var) {
                    return ((o0.c) k0.j(this.f9107g, k0Var, new Object[0])).getNumber();
                }

                @Override // com.google.protobuf.k0.f.i.a
                public int g(b bVar) {
                    return ((o0.c) k0.j(this.f9108h, bVar, new Object[0])).getNumber();
                }

                @Override // com.google.protobuf.k0.f.i.a
                public void i(b bVar, Object obj) {
                    k0.j(this.f9103c, bVar, obj);
                }
            }

            i(r.g gVar, String str, Class cls, Class cls2, String str2) {
                boolean z10 = gVar.x() != null;
                this.f9098c = z10;
                boolean z11 = (gVar.a().r() == r.h.a.EDITIONS && gVar.B()) || gVar.a().r() == r.h.a.PROTO2 || gVar.A() || (!z10 && gVar.u() == r.g.b.MESSAGE);
                this.f9099d = z11;
                b bVar = new b(gVar, str, cls, cls2, str2, z10, z11);
                this.f9097b = gVar;
                this.f9096a = bVar.f9101a.getReturnType();
                this.f9100e = q(bVar);
            }

            static a q(b bVar) {
                return bVar;
            }

            @Override // com.google.protobuf.k0.f.a
            public void a(b bVar) {
                this.f9100e.a(bVar);
            }

            @Override // com.google.protobuf.k0.f.a
            public Object b(k0 k0Var) {
                return this.f9100e.b(k0Var);
            }

            @Override // com.google.protobuf.k0.f.a
            public Object c(b bVar) {
                return this.f9100e.c(bVar);
            }

            @Override // com.google.protobuf.k0.f.a
            public boolean d(k0 k0Var) {
                return !this.f9099d ? this.f9098c ? this.f9100e.f(k0Var) == this.f9097b.getNumber() : !b(k0Var).equals(this.f9097b.n()) : this.f9100e.d(k0Var);
            }

            @Override // com.google.protobuf.k0.f.a
            public boolean e(b bVar) {
                return !this.f9099d ? this.f9098c ? this.f9100e.g(bVar) == this.f9097b.getNumber() : !c(bVar).equals(this.f9097b.n()) : this.f9100e.e(bVar);
            }

            @Override // com.google.protobuf.k0.f.a
            public void f(b bVar, Object obj) {
                throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.k0.f.a
            public int g(b bVar) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            @Override // com.google.protobuf.k0.f.a
            public int h(k0 k0Var) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            @Override // com.google.protobuf.k0.f.a
            public void i(b bVar, Object obj) {
                this.f9100e.i(bVar, obj);
            }

            @Override // com.google.protobuf.k0.f.a
            public void j(b bVar, int i10, Object obj) {
                throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.k0.f.a
            public Object k(b bVar, int i10) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.k0.f.a
            public Object l(k0 k0Var, int i10) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.k0.f.a
            public i1.a m() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.google.protobuf.k0.f.a
            public i1.a n(b bVar, int i10) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.k0.f.a
            public Object o(k0 k0Var) {
                return b(k0Var);
            }

            @Override // com.google.protobuf.k0.f.a
            public i1.a p(b bVar) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
        }

        private static final class j extends i {

            /* JADX INFO: renamed from: f */
            private final Method f9109f;

            /* JADX INFO: renamed from: g */
            private final Method f9110g;

            j(r.g gVar, String str, Class cls, Class cls2, String str2) {
                super(gVar, str, cls, cls2, str2);
                this.f9109f = k0.i(this.f9096a, "newBuilder", new Class[0]);
                this.f9110g = k0.i(cls2, "get" + str + "Builder", new Class[0]);
            }

            private Object r(Object obj) {
                return this.f9096a.isInstance(obj) ? obj : ((i1.a) k0.j(this.f9109f, null, new Object[0])).mergeFrom((i1) obj).buildPartial();
            }

            @Override // com.google.protobuf.k0.f.i, com.google.protobuf.k0.f.a
            public void i(b bVar, Object obj) {
                super.i(bVar, r(obj));
            }

            @Override // com.google.protobuf.k0.f.i, com.google.protobuf.k0.f.a
            public i1.a m() {
                return (i1.a) k0.j(this.f9109f, null, new Object[0]);
            }

            @Override // com.google.protobuf.k0.f.i, com.google.protobuf.k0.f.a
            public i1.a p(b bVar) {
                return (i1.a) k0.j(this.f9110g, bVar, new Object[0]);
            }
        }

        private static final class k extends i {

            /* JADX INFO: renamed from: f */
            private final Method f9111f;

            /* JADX INFO: renamed from: g */
            private final Method f9112g;

            k(r.g gVar, String str, Class cls, Class cls2, String str2) {
                super(gVar, str, cls, cls2, str2);
                this.f9111f = k0.i(cls, "get" + str + "Bytes", new Class[0]);
                this.f9112g = k0.i(cls2, "set" + str + "Bytes", com.google.protobuf.l.class);
            }

            @Override // com.google.protobuf.k0.f.i, com.google.protobuf.k0.f.a
            public void i(b bVar, Object obj) {
                if (obj instanceof com.google.protobuf.l) {
                    k0.j(this.f9112g, bVar, obj);
                } else {
                    super.i(bVar, obj);
                }
            }

            @Override // com.google.protobuf.k0.f.i, com.google.protobuf.k0.f.a
            public Object o(k0 k0Var) {
                return k0.j(this.f9111f, k0Var, new Object[0]);
            }
        }

        private static class l implements c {

            /* JADX INFO: renamed from: a */
            private final r.g f9113a;

            l(r.b bVar, int i10) {
                this.f9113a = (r.g) ((r.l) bVar.n().get(i10)).m().get(0);
            }

            @Override // com.google.protobuf.k0.f.c
            public void a(b bVar) {
                bVar.m1140clearField(this.f9113a);
            }

            @Override // com.google.protobuf.k0.f.c
            public r.g b(k0 k0Var) {
                if (k0Var.hasField(this.f9113a)) {
                    return this.f9113a;
                }
                return null;
            }

            @Override // com.google.protobuf.k0.f.c
            public r.g c(b bVar) {
                if (bVar.hasField(this.f9113a)) {
                    return this.f9113a;
                }
                return null;
            }

            @Override // com.google.protobuf.k0.f.c
            public boolean d(k0 k0Var) {
                return k0Var.hasField(this.f9113a);
            }

            @Override // com.google.protobuf.k0.f.c
            public boolean e(b bVar) {
                return bVar.hasField(this.f9113a);
            }
        }

        public f(r.b bVar, String[] strArr) {
            this.f9057a = bVar;
            this.f9059c = strArr;
            this.f9058b = new a[bVar.l().size()];
            this.f9060d = new c[bVar.n().size()];
        }

        public a e(r.g gVar) {
            if (gVar.m() != this.f9057a) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
            if (gVar.C()) {
                throw new IllegalArgumentException("This type does not have extensions.");
            }
            return this.f9058b[gVar.s()];
        }

        public c f(r.l lVar) {
            if (lVar.k() == this.f9057a) {
                return this.f9060d[lVar.n()];
            }
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }

        public f d(Class cls, Class cls2) {
            if (this.f9061e) {
                return this;
            }
            synchronized (this) {
                try {
                    if (this.f9061e) {
                        return this;
                    }
                    int length = this.f9058b.length;
                    int i10 = 0;
                    while (true) {
                        String str = null;
                        if (i10 >= length) {
                            break;
                        }
                        r.g gVar = (r.g) this.f9057a.l().get(i10);
                        if (gVar.l() != null) {
                            int iN = gVar.l().n() + length;
                            String[] strArr = this.f9059c;
                            if (iN < strArr.length) {
                                str = strArr[iN];
                            }
                        }
                        String str2 = str;
                        if (gVar.b()) {
                            if (gVar.u() == r.g.b.MESSAGE) {
                                if (gVar.D()) {
                                    this.f9058b[i10] = new b(gVar, cls);
                                } else {
                                    this.f9058b[i10] = new g(gVar, this.f9059c[i10], cls, cls2);
                                }
                            } else if (gVar.u() == r.g.b.ENUM) {
                                this.f9058b[i10] = new e(gVar, this.f9059c[i10], cls, cls2);
                            } else {
                                this.f9058b[i10] = new C0135f(gVar, this.f9059c[i10], cls, cls2);
                            }
                        } else if (gVar.u() == r.g.b.MESSAGE) {
                            this.f9058b[i10] = new j(gVar, this.f9059c[i10], cls, cls2, str2);
                        } else if (gVar.u() == r.g.b.ENUM) {
                            this.f9058b[i10] = new h(gVar, this.f9059c[i10], cls, cls2, str2);
                        } else if (gVar.u() == r.g.b.STRING) {
                            this.f9058b[i10] = new k(gVar, this.f9059c[i10], cls, cls2, str2);
                        } else {
                            this.f9058b[i10] = new i(gVar, this.f9059c[i10], cls, cls2, str2);
                        }
                        i10++;
                    }
                    for (int i11 = 0; i11 < this.f9057a.n().size(); i11++) {
                        if (i11 < this.f9057a.r().size()) {
                            this.f9060d[i11] = new d(this.f9057a, i11, this.f9059c[i11 + length], cls, cls2);
                        } else {
                            this.f9060d[i11] = new l(this.f9057a, i11);
                        }
                    }
                    this.f9061e = true;
                    this.f9059c = null;
                    return this;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a */
        static final g f9114a = new g();

        private g() {
        }
    }

    protected k0() {
        this.unknownFields = t2.c();
    }

    static /* synthetic */ u access$500(v vVar) {
        g(vVar);
        return null;
    }

    protected static boolean canUseUnsafe() {
        return y2.J() && y2.K();
    }

    protected static int computeStringSize(int i10, Object obj) {
        return obj instanceof String ? o.U(i10, (String) obj) : o.h(i10, (l) obj);
    }

    protected static int computeStringSizeNoTag(Object obj) {
        return obj instanceof String ? o.V((String) obj) : o.i((l) obj);
    }

    protected static o0.a emptyBooleanList() {
        return j.g();
    }

    protected static o0.b emptyDoubleList() {
        return s.g();
    }

    protected static o0.f emptyFloatList() {
        return g0.g();
    }

    protected static o0.g emptyIntList() {
        return n0.f();
    }

    protected static <T> o0.j emptyList(Class<T> cls) {
        return d2.d();
    }

    public static o0.i emptyLongList() {
        return x0.f();
    }

    static void enableAlwaysUseFieldBuildersForTesting() {
        setAlwaysUseFieldBuildersForTesting(true);
    }

    private static u g(v vVar) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map h(boolean r7) {
        /*
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            com.google.protobuf.k0$f r1 = r6.internalGetFieldAccessorTable()
            com.google.protobuf.r$b r1 = com.google.protobuf.k0.f.a(r1)
            java.util.List r1 = r1.l()
            r2 = 0
        L12:
            int r3 = r1.size()
            if (r2 >= r3) goto L70
            java.lang.Object r3 = r1.get(r2)
            com.google.protobuf.r$g r3 = (com.google.protobuf.r.g) r3
            com.google.protobuf.r$l r4 = r3.l()
            if (r4 == 0) goto L37
            int r3 = r4.l()
            int r3 = r3 + (-1)
            int r2 = r2 + r3
            boolean r3 = r6.hasOneof(r4)
            if (r3 != 0) goto L32
            goto L6d
        L32:
            com.google.protobuf.r$g r3 = r6.getOneofFieldDescriptor(r4)
            goto L54
        L37:
            boolean r4 = r3.b()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r6.getField(r3)
            java.util.List r4 = (java.util.List) r4
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L6d
            r0.put(r3, r4)
            goto L6d
        L4d:
            boolean r4 = r6.hasField(r3)
            if (r4 != 0) goto L54
            goto L6d
        L54:
            if (r7 == 0) goto L66
            com.google.protobuf.r$g$b r4 = r3.u()
            com.google.protobuf.r$g$b r5 = com.google.protobuf.r.g.b.STRING
            if (r4 != r5) goto L66
            java.lang.Object r4 = r6.getFieldRaw(r3)
            r0.put(r3, r4)
            goto L6d
        L66:
            java.lang.Object r4 = r6.getField(r3)
            r0.put(r3, r4)
        L6d:
            int r2 = r2 + 1
            goto L12
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k0.h(boolean):java.util.Map");
    }

    public static Method i(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    protected static boolean isStringEmpty(Object obj) {
        return obj instanceof String ? ((String) obj).isEmpty() : ((l) obj).isEmpty();
    }

    public static Object j(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new IllegalStateException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    private static void k(o oVar, Map map, z0 z0Var, int i10, boolean z10) {
        if (map.containsKey(Boolean.valueOf(z10))) {
            throw null;
        }
    }

    private static void l(o oVar, Map map, z0 z0Var, int i10) {
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    protected static <ListT extends o0.j> ListT makeMutableCopy(ListT listt) {
        return (ListT) makeMutableCopy(listt, 0);
    }

    protected static o0.g mutableCopy(o0.g gVar) {
        return (o0.g) makeMutableCopy(gVar);
    }

    protected static o0.a newBooleanList() {
        return new j();
    }

    protected static o0.b newDoubleList() {
        return new s();
    }

    protected static o0.f newFloatList() {
        return new g0();
    }

    protected static o0.g newIntList() {
        return new n0();
    }

    protected static o0.i newLongList() {
        return new x0();
    }

    protected static <M extends i1> M parseDelimitedWithIOException(z1 z1Var, InputStream inputStream) throws IOException {
        try {
            return (M) z1Var.parseDelimitedFrom(inputStream);
        } catch (p0 e10) {
            throw e10.n();
        }
    }

    protected static <M extends i1> M parseWithIOException(z1 z1Var, InputStream inputStream) throws IOException {
        try {
            return (M) z1Var.parseFrom(inputStream);
        } catch (p0 e10) {
            throw e10.n();
        }
    }

    protected static <V> void serializeBooleanMapTo(o oVar, b1 b1Var, z0 z0Var, int i10) throws IOException {
        Map mapJ = b1Var.j();
        if (!oVar.f0()) {
            l(oVar, mapJ, z0Var, i10);
        } else {
            k(oVar, mapJ, z0Var, i10, false);
            k(oVar, mapJ, z0Var, i10, true);
        }
    }

    protected static <V> void serializeIntegerMapTo(o oVar, b1 b1Var, z0 z0Var, int i10) throws IOException {
        Map mapJ = b1Var.j();
        if (!oVar.f0()) {
            l(oVar, mapJ, z0Var, i10);
            return;
        }
        int size = mapJ.size();
        int[] iArr = new int[size];
        Iterator it = mapJ.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        Arrays.sort(iArr);
        if (size <= 0) {
            return;
        }
        int i12 = iArr[0];
        throw null;
    }

    protected static <V> void serializeLongMapTo(o oVar, b1 b1Var, z0 z0Var, int i10) throws IOException {
        Map mapJ = b1Var.j();
        if (!oVar.f0()) {
            l(oVar, mapJ, z0Var, i10);
            return;
        }
        int size = mapJ.size();
        long[] jArr = new long[size];
        Iterator it = mapJ.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Long) it.next()).longValue();
            i11++;
        }
        Arrays.sort(jArr);
        if (size <= 0) {
            return;
        }
        long j10 = jArr[0];
        throw null;
    }

    protected static <V> void serializeStringMapTo(o oVar, b1 b1Var, z0 z0Var, int i10) throws IOException {
        Map mapJ = b1Var.j();
        if (!oVar.f0()) {
            l(oVar, mapJ, z0Var, i10);
            return;
        }
        String[] strArr = (String[]) mapJ.keySet().toArray(new String[mapJ.size()]);
        Arrays.sort(strArr);
        if (strArr.length <= 0) {
            return;
        }
        String str = strArr[0];
        throw null;
    }

    static void setAlwaysUseFieldBuildersForTesting(boolean z10) {
        alwaysUseFieldBuilders = z10;
    }

    protected static void writeString(o oVar, int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            oVar.P0(i10, (String) obj);
        } else {
            oVar.q0(i10, (l) obj);
        }
    }

    protected static void writeStringNoTag(o oVar, Object obj) throws IOException {
        if (obj instanceof String) {
            oVar.Q0((String) obj);
        } else {
            oVar.r0((l) obj);
        }
    }

    @Override // com.google.protobuf.o1
    public Map<r.g, Object> getAllFields() {
        return DesugarCollections.unmodifiableMap(h(false));
    }

    Map<r.g, Object> getAllFieldsRaw() {
        return DesugarCollections.unmodifiableMap(h(true));
    }

    @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
    public r.b getDescriptorForType() {
        return internalGetFieldAccessorTable().f9057a;
    }

    @Override // com.google.protobuf.o1
    public Object getField(r.g gVar) {
        return internalGetFieldAccessorTable().e(gVar).b(this);
    }

    Object getFieldRaw(r.g gVar) {
        return internalGetFieldAccessorTable().e(gVar).o(this);
    }

    public r.g getOneofFieldDescriptor(r.l lVar) {
        return internalGetFieldAccessorTable().f(lVar).b(this);
    }

    public Object getRepeatedField(r.g gVar, int i10) {
        return internalGetFieldAccessorTable().e(gVar).l(this, i10);
    }

    public int getRepeatedFieldCount(r.g gVar) {
        return internalGetFieldAccessorTable().e(gVar).h(this);
    }

    public t2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.o1
    public boolean hasField(r.g gVar) {
        return internalGetFieldAccessorTable().e(gVar).d(this);
    }

    public boolean hasOneof(r.l lVar) {
        return internalGetFieldAccessorTable().f(lVar).d(this);
    }

    protected abstract f internalGetFieldAccessorTable();

    @Deprecated
    protected b1 internalGetMapField(int i10) {
        throw new IllegalArgumentException("No map fields found in " + getClass().getName());
    }

    protected d1 internalGetMapFieldReflection(int i10) {
        return internalGetMapField(i10);
    }

    protected void makeExtensionsImmutable() {
        h0.g(getClass());
    }

    @Deprecated
    protected void mergeFromAndMakeImmutableInternal(m mVar, y yVar) throws p0 {
        h2 h2VarD = c2.a().d(this);
        try {
            h2VarD.c(this, n.O(mVar), yVar);
            h2VarD.b(this);
        } catch (p0 e10) {
            throw e10.j(this);
        } catch (IOException e11) {
            throw new p0(e11).j(this);
        }
    }

    @Override // com.google.protobuf.a
    protected i1.a newBuilderForType(a.b bVar) {
        return newBuilderForType((c) new a(bVar));
    }

    protected abstract i1.a newBuilderForType(c cVar);

    protected abstract Object newInstance(g gVar);

    protected boolean parseUnknownField(m mVar, t2.b bVar, y yVar, int i10) throws IOException {
        return mVar.P() ? mVar.Q(i10) : bVar.m(i10, mVar);
    }

    protected boolean parseUnknownFieldProto3(m mVar, t2.b bVar, y yVar, int i10) throws IOException {
        return parseUnknownField(mVar, bVar, yVar, i10);
    }

    void setUnknownFields(t2 t2Var) {
        this.unknownFields = t2Var;
    }

    protected Object writeReplace() throws ObjectStreamException {
        return new j0.b(this);
    }

    public static abstract class e extends k0 implements o1 {

        /* JADX INFO: renamed from: a */
        private final e0 f9052a;

        protected class a {

            /* JADX INFO: renamed from: a */
            private final Iterator f9053a;

            /* JADX INFO: renamed from: b */
            private Map.Entry f9054b;

            /* JADX INFO: renamed from: c */
            private final boolean f9055c;

            /* synthetic */ a(e eVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, o oVar) {
                while (true) {
                    Map.Entry entry = this.f9054b;
                    if (entry == null || ((r.g) entry.getKey()).getNumber() >= i10) {
                        return;
                    }
                    r.g gVar = (r.g) this.f9054b.getKey();
                    if (!this.f9055c || gVar.o() != a3.c.MESSAGE || gVar.b()) {
                        e0.O(gVar, this.f9054b.getValue(), oVar);
                    } else if (this.f9054b instanceof s0.b) {
                        oVar.K0(gVar.getNumber(), ((s0.b) this.f9054b).a().c());
                    } else {
                        oVar.J0(gVar.getNumber(), (i1) this.f9054b.getValue());
                    }
                    if (this.f9053a.hasNext()) {
                        this.f9054b = (Map.Entry) this.f9053a.next();
                    } else {
                        this.f9054b = null;
                    }
                }
            }

            private a(boolean z10) {
                Iterator itE = e.this.f9052a.E();
                this.f9053a = itE;
                if (itE.hasNext()) {
                    this.f9054b = (Map.Entry) itE.next();
                }
                this.f9055c = z10;
            }
        }

        protected e() {
            this.f9052a = e0.J();
        }

        private void s(r.g gVar) {
            if (gVar.m() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1
        public Map getAllFields() {
            Map mapH = h(false);
            mapH.putAll(q());
            return DesugarCollections.unmodifiableMap(mapH);
        }

        @Override // com.google.protobuf.k0
        public Map getAllFieldsRaw() {
            Map mapH = h(false);
            mapH.putAll(q());
            return DesugarCollections.unmodifiableMap(mapH);
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1
        public Object getField(r.g gVar) {
            if (!gVar.C()) {
                return super.getField(gVar);
            }
            s(gVar);
            Object objQ = this.f9052a.q(gVar);
            return objQ == null ? gVar.b() ? Collections.EMPTY_LIST : gVar.u() == r.g.b.MESSAGE ? t.k(gVar.v()) : gVar.n() : objQ;
        }

        @Override // com.google.protobuf.k0
        public Object getRepeatedField(r.g gVar, int i10) {
            if (!gVar.C()) {
                return super.getRepeatedField(gVar, i10);
            }
            s(gVar);
            return this.f9052a.t(gVar, i10);
        }

        @Override // com.google.protobuf.k0
        public int getRepeatedFieldCount(r.g gVar) {
            if (!gVar.C()) {
                return super.getRepeatedFieldCount(gVar);
            }
            s(gVar);
            return this.f9052a.u(gVar);
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1
        public boolean hasField(r.g gVar) {
            if (!gVar.C()) {
                return super.hasField(gVar);
            }
            s(gVar);
            return this.f9052a.x(gVar);
        }

        @Override // com.google.protobuf.k0
        protected void makeExtensionsImmutable() {
            h0.g(getClass());
            this.f9052a.F();
        }

        protected boolean o() {
            return this.f9052a.A();
        }

        protected int p() {
            return this.f9052a.v();
        }

        @Override // com.google.protobuf.k0
        protected boolean parseUnknownField(m mVar, t2.b bVar, y yVar, int i10) {
            if (mVar.P()) {
                bVar = null;
            }
            return p1.d(mVar, bVar, yVar, getDescriptorForType(), new p1.c(this.f9052a), i10);
        }

        @Override // com.google.protobuf.k0
        protected boolean parseUnknownFieldProto3(m mVar, t2.b bVar, y yVar, int i10) {
            return parseUnknownField(mVar, bVar, yVar, i10);
        }

        protected Map q() {
            return this.f9052a.p();
        }

        protected a r() {
            return new a(this, false, null);
        }

        protected e(d dVar) {
            super(dVar);
            this.f9052a = dVar.i();
        }
    }

    protected static <ListT extends o0.j> ListT makeMutableCopy(ListT listt, int i10) {
        int size = listt.size();
        if (i10 <= size) {
            i10 = size * 2;
        }
        if (i10 <= 0) {
            i10 = 10;
        }
        return (ListT) listt.v(i10);
    }

    public static o0.i mutableCopy(o0.i iVar) {
        return (o0.i) makeMutableCopy(iVar);
    }

    protected k0(b bVar) {
        this.unknownFields = bVar.getUnknownFields();
    }

    protected static o0.f mutableCopy(o0.f fVar) {
        return (o0.f) makeMutableCopy(fVar);
    }

    protected static <M extends i1> M parseDelimitedWithIOException(z1 z1Var, InputStream inputStream, y yVar) throws IOException {
        try {
            return (M) z1Var.parseDelimitedFrom(inputStream, yVar);
        } catch (p0 e10) {
            throw e10.n();
        }
    }

    protected static <M extends i1> M parseWithIOException(z1 z1Var, InputStream inputStream, y yVar) throws IOException {
        try {
            return (M) z1Var.parseFrom(inputStream, yVar);
        } catch (p0 e10) {
            throw e10.n();
        }
    }

    protected static o0.b mutableCopy(o0.b bVar) {
        return (o0.b) makeMutableCopy(bVar);
    }

    protected static o0.a mutableCopy(o0.a aVar) {
        return (o0.a) makeMutableCopy(aVar);
    }

    protected static <M extends i1> M parseWithIOException(z1 z1Var, m mVar) throws IOException {
        try {
            return (M) z1Var.parseFrom(mVar);
        } catch (p0 e10) {
            throw e10.n();
        }
    }

    protected static <M extends i1> M parseWithIOException(z1 z1Var, m mVar, y yVar) throws IOException {
        try {
            return (M) z1Var.parseFrom(mVar, yVar);
        } catch (p0 e10) {
            throw e10.n();
        }
    }
}
