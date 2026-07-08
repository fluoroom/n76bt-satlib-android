package com.google.protobuf;

import com.google.protobuf.l;
import com.google.protobuf.l1;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements l1 {
    protected int memoizedHashCode = 0;

    public static abstract class a implements l1.a {
        private static void a(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        @Deprecated
        protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        private String b(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        protected static r2 newUninitializedMessageException(l1 l1Var) {
            return new r2(l1Var);
        }

        protected abstract a internalMergeFrom(b bVar);

        public boolean mergeDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return false;
            }
            m1176mergeFrom(new C0133a(inputStream, m.D(i10, inputStream)), yVar);
            return true;
        }

        /* JADX INFO: renamed from: mergeFrom */
        public a m1172mergeFrom(l lVar) throws p0 {
            try {
                m mVarS = lVar.s();
                m1174mergeFrom(mVarS);
                mVarS.a(0);
                return this;
            } catch (p0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(b("ByteString"), e11);
            }
        }

        /* JADX INFO: renamed from: mergeFrom */
        public abstract a m1174mergeFrom(m mVar);

        @Override // com.google.protobuf.l1.a
        public abstract a mergeFrom(m mVar, y yVar);

        protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            o0.a(iterable);
            if (!(iterable instanceof v0)) {
                if (iterable instanceof a2) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    a(iterable, list);
                    return;
                }
            }
            List listK = ((v0) iterable).k();
            v0 v0Var = (v0) list;
            int size = list.size();
            for (Object obj : listK) {
                if (obj == null) {
                    String str = "Element at index " + (v0Var.size() - size) + " is null.";
                    for (int size2 = v0Var.size() - 1; size2 >= size; size2--) {
                        v0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof l) {
                    v0Var.w((l) obj);
                } else {
                    v0Var.add((String) obj);
                }
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.b$a$a */
        static final class C0133a extends FilterInputStream {

            /* JADX INFO: renamed from: a */
            private int f8880a;

            C0133a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f8880a = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f8880a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f8880a <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f8880a--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) {
                int iSkip = (int) super.skip(Math.min(j10, this.f8880a));
                if (iSkip >= 0) {
                    this.f8880a -= iSkip;
                }
                return iSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f8880a;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f8880a -= i13;
                }
                return i13;
            }
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, y.b());
        }

        /* JADX INFO: renamed from: mergeFrom */
        public a m1173mergeFrom(l lVar, y yVar) throws p0 {
            try {
                m mVarS = lVar.s();
                mergeFrom(mVarS, yVar);
                mVarS.a(0);
                return this;
            } catch (p0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(b("ByteString"), e11);
            }
        }

        /* JADX INFO: renamed from: mergeFrom */
        public a m1177mergeFrom(byte[] bArr) {
            return m1178mergeFrom(bArr, 0, bArr.length);
        }

        /* JADX INFO: renamed from: mergeFrom */
        public a m1178mergeFrom(byte[] bArr, int i10, int i11) throws p0 {
            try {
                m mVarM = m.m(bArr, i10, i11);
                m1174mergeFrom(mVarM);
                mVarM.a(0);
                return this;
            } catch (p0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(b("byte array"), e11);
            }
        }

        /* JADX INFO: renamed from: mergeFrom */
        public a m1180mergeFrom(byte[] bArr, y yVar) {
            return m1179mergeFrom(bArr, 0, bArr.length, yVar);
        }

        /* JADX INFO: renamed from: mergeFrom */
        public a m1179mergeFrom(byte[] bArr, int i10, int i11, y yVar) throws p0 {
            try {
                m mVarM = m.m(bArr, i10, i11);
                mergeFrom(mVarM, yVar);
                mVarM.a(0);
                return this;
            } catch (p0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(b("byte array"), e11);
            }
        }

        /* JADX INFO: renamed from: mergeFrom */
        public a m1175mergeFrom(InputStream inputStream) {
            m mVarH = m.h(inputStream);
            m1174mergeFrom(mVarH);
            mVarH.a(0);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom */
        public a m1176mergeFrom(InputStream inputStream, y yVar) {
            m mVarH = m.h(inputStream);
            mergeFrom(mVarH, yVar);
            mVarH.a(0);
            return this;
        }

        public a mergeFrom(l1 l1Var) {
            if (getDefaultInstanceForType().getClass().isInstance(l1Var)) {
                return internalMergeFrom((b) l1Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Deprecated
    protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        a.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(l lVar) throws IllegalArgumentException {
        if (!lVar.o()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    abstract int getMemoizedSerializedSize();

    int getSerializedSize(h2 h2Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iD = h2Var.d(this);
        setMemoizedSerializedSize(iD);
        return iD;
    }

    abstract r2 newUninitializedMessageException();

    abstract void setMemoizedSerializedSize(int i10);

    @Override // com.google.protobuf.l1
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            o oVarI0 = o.i0(bArr);
            writeTo(oVarI0);
            oVarI0.d();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(a("byte array"), e10);
        }
    }

    public l toByteString() {
        try {
            l.h hVarQ = l.q(getSerializedSize());
            writeTo(hVarQ.b());
            return hVarQ.a();
        } catch (IOException e10) {
            throw new RuntimeException(a("ByteString"), e10);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        o oVarH0 = o.h0(outputStream, o.K(o.Y(serializedSize) + serializedSize));
        oVarH0.T0(serializedSize);
        writeTo(oVarH0);
        oVarH0.d0();
    }

    @Override // com.google.protobuf.l1
    public void writeTo(OutputStream outputStream) throws IOException {
        o oVarH0 = o.h0(outputStream, o.K(getSerializedSize()));
        writeTo(oVarH0);
        oVarH0.d0();
    }

    protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        a.addAll((Iterable) iterable, (List) list);
    }
}
