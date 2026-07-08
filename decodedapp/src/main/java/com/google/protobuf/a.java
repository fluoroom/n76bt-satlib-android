package com.google.protobuf;

import com.google.protobuf.b;
import com.google.protobuf.i1;
import com.google.protobuf.l1;
import com.google.protobuf.o0;
import com.google.protobuf.r;
import com.google.protobuf.t2;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends com.google.protobuf.b implements i1 {
    protected int memoizedSize = -1;

    /* JADX INFO: renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0131a extends b.a implements i1.a {
        protected static r2 newUninitializedMessageException(i1 i1Var) {
            return new r2(p1.b(i1Var));
        }

        void dispose() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        public List<String> findInitializationErrors() {
            return p1.b(this);
        }

        public String getInitializationErrorString() {
            return p1.a(findInitializationErrors());
        }

        protected t2.b getUnknownFieldSetBuilder() {
            return t2.g(getUnknownFields());
        }

        void markClean() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        /* JADX INFO: renamed from: mergeUnknownFields */
        public abstract AbstractC0131a m141mergeUnknownFields(t2 t2Var);

        protected void setUnknownFieldSetBuilder(t2.b bVar) {
            setUnknownFields(bVar.build());
        }

        public String toString() {
            return n2.o().j(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.b.a
        public AbstractC0131a internalMergeFrom(com.google.protobuf.b bVar) {
            return mergeFrom((i1) bVar);
        }

        public /* bridge */ /* synthetic */ l1.a mergeFrom(l1 l1Var) {
            return super.mergeFrom(l1Var);
        }

        public AbstractC0131a mergeFrom(i1 i1Var) {
            return mergeFrom(i1Var, (Map<r.g, Object>) i1Var.getAllFields());
        }

        AbstractC0131a mergeFrom(i1 i1Var, Map<r.g, Object> map) {
            if (i1Var.getDescriptorForType() == getDescriptorForType()) {
                for (Map.Entry<r.g, Object> entry : map.entrySet()) {
                    r.g key = entry.getKey();
                    if (key.b()) {
                        Iterator it = ((List) entry.getValue()).iterator();
                        while (it.hasNext()) {
                            addRepeatedField(key, it.next());
                        }
                    } else if (key.u() == r.g.b.MESSAGE) {
                        i1 i1Var2 = (i1) getField(key);
                        if (i1Var2 == i1Var2.getDefaultInstanceForType()) {
                            setField(key, entry.getValue());
                        } else {
                            setField(key, i1Var2.newBuilderForType().mergeFrom(i1Var2).mergeFrom((i1) entry.getValue()).build());
                        }
                    } else {
                        setField(key, entry.getValue());
                    }
                }
                m141mergeUnknownFields(i1Var.getUnknownFields());
                return this;
            }
            throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public AbstractC0131a m1174mergeFrom(m mVar) throws IOException {
            return mergeFrom(mVar, (y) w.e());
        }

        @Override // com.google.protobuf.l1.a
        public AbstractC0131a mergeFrom(m mVar, y yVar) {
            t2.b unknownFieldSetBuilder = mVar.P() ? null : getUnknownFieldSetBuilder();
            p1.e(this, unknownFieldSetBuilder, mVar, yVar);
            if (unknownFieldSetBuilder != null) {
                setUnknownFieldSetBuilder(unknownFieldSetBuilder);
            }
            return this;
        }

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC0131a m1172mergeFrom(l lVar) throws p0 {
            return (AbstractC0131a) super.m1172mergeFrom(lVar);
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public AbstractC0131a m1173mergeFrom(l lVar, y yVar) throws p0 {
            return (AbstractC0131a) super.m1173mergeFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public AbstractC0131a m1177mergeFrom(byte[] bArr) throws p0 {
            return (AbstractC0131a) super.m1177mergeFrom(bArr);
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public AbstractC0131a m1178mergeFrom(byte[] bArr, int i10, int i11) throws p0 {
            return (AbstractC0131a) super.m1178mergeFrom(bArr, i10, i11);
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public AbstractC0131a m1180mergeFrom(byte[] bArr, y yVar) throws p0 {
            return (AbstractC0131a) super.m1180mergeFrom(bArr, yVar);
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public AbstractC0131a m1179mergeFrom(byte[] bArr, int i10, int i11, y yVar) throws p0 {
            return (AbstractC0131a) super.m1179mergeFrom(bArr, i10, i11, yVar);
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public AbstractC0131a m1175mergeFrom(InputStream inputStream) throws IOException {
            return (AbstractC0131a) super.m1175mergeFrom(inputStream);
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public AbstractC0131a m1176mergeFrom(InputStream inputStream, y yVar) throws IOException {
            return (AbstractC0131a) super.m1176mergeFrom(inputStream, yVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface b {
        void a();
    }

    private static boolean b(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : f(obj).equals(f(obj2));
    }

    private static boolean c(Object obj, Object obj2) {
        return c1.k(d((List) obj), d((List) obj2));
    }

    static boolean compareFields(Map<r.g, Object> map, Map<r.g, Object> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (r.g gVar : map.keySet()) {
            if (!map2.containsKey(gVar)) {
                return false;
            }
            Object obj = map.get(gVar);
            Object obj2 = map2.get(gVar);
            if (gVar.y() == r.g.c.f10029v) {
                if (gVar.b()) {
                    List list = (List) obj;
                    List list2 = (List) obj2;
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!b(list.get(i10), list2.get(i10))) {
                            return false;
                        }
                    }
                } else if (!b(obj, obj2)) {
                    return false;
                }
            } else if (gVar.D()) {
                if (!c(obj, obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static Map d(List list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        i1 i1Var = (i1) it.next();
        r.b descriptorForType = i1Var.getDescriptorForType();
        r.g gVarI = descriptorForType.i("key");
        r.g gVarI2 = descriptorForType.i("value");
        Object field = i1Var.getField(gVarI2);
        if (field instanceof r.f) {
            field = Integer.valueOf(((r.f) field).getNumber());
        }
        map.put(i1Var.getField(gVarI), field);
        while (it.hasNext()) {
            i1 i1Var2 = (i1) it.next();
            Object field2 = i1Var2.getField(gVarI2);
            if (field2 instanceof r.f) {
                field2 = Integer.valueOf(((r.f) field2).getNumber());
            }
            map.put(i1Var2.getField(gVarI), field2);
        }
        return map;
    }

    private static int e(Object obj) {
        return c1.a(d((List) obj));
    }

    private static l f(Object obj) {
        return obj instanceof byte[] ? l.g((byte[]) obj) : (l) obj;
    }

    @Deprecated
    protected static int hashBoolean(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    @Deprecated
    protected static int hashEnum(o0.c cVar) {
        return cVar.getNumber();
    }

    @Deprecated
    protected static int hashEnumList(List<? extends o0.c> list) {
        Iterator<? extends o0.c> it = list.iterator();
        int iHashEnum = 1;
        while (it.hasNext()) {
            iHashEnum = (iHashEnum * 31) + hashEnum(it.next());
        }
        return iHashEnum;
    }

    protected static int hashFields(int i10, Map<r.g, Object> map) {
        int i11;
        int iG;
        for (Map.Entry<r.g, Object> entry : map.entrySet()) {
            r.g key = entry.getKey();
            Object value = entry.getValue();
            int number = (i10 * 37) + key.getNumber();
            if (key.D()) {
                i11 = number * 53;
                iG = e(value);
            } else if (key.y() != r.g.c.f10031x) {
                i11 = number * 53;
                iG = value.hashCode();
            } else if (key.b()) {
                i11 = number * 53;
                iG = o0.h((List) value);
            } else {
                i11 = number * 53;
                iG = o0.g((o0.c) value);
            }
            i10 = i11 + iG;
        }
        return i10;
    }

    @Deprecated
    protected static int hashLong(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return getDescriptorForType() == i1Var.getDescriptorForType() && compareFields(getAllFields(), i1Var.getAllFields()) && getUnknownFields().equals(i1Var.getUnknownFields());
    }

    public List<String> findInitializationErrors() {
        return p1.b(this);
    }

    public String getInitializationErrorString() {
        return p1.a(findInitializationErrors());
    }

    @Override // com.google.protobuf.b
    int getMemoizedSerializedSize() {
        return this.memoizedSize;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashFields = (hashFields(779 + getDescriptorForType().hashCode(), getAllFields()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashFields;
        return iHashFields;
    }

    protected i1.a newBuilderForType(b bVar) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    @Override // com.google.protobuf.b
    r2 newUninitializedMessageException() {
        return AbstractC0131a.newUninitializedMessageException((i1) this);
    }

    @Override // com.google.protobuf.b
    void setMemoizedSerializedSize(int i10) {
        this.memoizedSize = i10;
    }

    public final String toString() {
        return n2.o().j(this);
    }
}
