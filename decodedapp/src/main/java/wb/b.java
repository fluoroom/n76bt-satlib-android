package wb;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.protobuf.l1;
import com.google.protobuf.m;
import com.google.protobuf.p0;
import com.google.protobuf.y;
import com.google.protobuf.z1;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import qb.a1;
import qb.u1;
import qb.z0;
import r9.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile y f31379a = y.b();

    private static final class a implements a1.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ThreadLocal f31380d = new ThreadLocal();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z1 f31381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l1 f31382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f31383c;

        a(l1 l1Var, int i10) {
            this.f31382b = (l1) l.o(l1Var, "defaultInstance cannot be null");
            this.f31381a = l1Var.getParserForType();
            this.f31383c = i10;
        }

        private l1 d(m mVar) throws p0 {
            l1 l1Var = (l1) this.f31381a.parseFrom(mVar, b.f31379a);
            try {
                mVar.a(0);
                return l1Var;
            } catch (p0 e10) {
                e10.j(l1Var);
                throw e10;
            }
        }

        @Override // qb.a1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public l1 a(InputStream inputStream) {
            m mVarH;
            byte[] bArr;
            if ((inputStream instanceof wb.a) && ((wb.a) inputStream).e() == this.f31381a) {
                try {
                    return ((wb.a) inputStream).c();
                } catch (IllegalStateException unused) {
                }
            }
            try {
                if (inputStream instanceof qb.p0) {
                    int iAvailable = inputStream.available();
                    if (iAvailable <= 0 || iAvailable > 4194304) {
                        if (iAvailable == 0) {
                            return this.f31382b;
                        }
                        mVarH = null;
                    } else {
                        ThreadLocal threadLocal = f31380d;
                        Reference reference = (Reference) threadLocal.get();
                        if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                            bArr = new byte[iAvailable];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i10 = iAvailable;
                        while (i10 > 0) {
                            int i11 = inputStream.read(bArr, iAvailable - i10, i10);
                            if (i11 == -1) {
                                break;
                            }
                            i10 -= i11;
                        }
                        if (i10 != 0) {
                            throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i10));
                        }
                        mVarH = m.m(bArr, 0, iAvailable);
                    }
                } else {
                    mVarH = null;
                }
                if (mVarH == null) {
                    mVarH = m.h(inputStream);
                }
                mVarH.O(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                int i12 = this.f31383c;
                if (i12 >= 0) {
                    mVarH.N(i12);
                }
                try {
                    return d(mVarH);
                } catch (p0 e10) {
                    throw u1.f24783s.s("Invalid protobuf byte sequence").r(e10).e();
                }
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // qb.a1.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InputStream b(l1 l1Var) {
            return new wb.a(l1Var, this.f31381a);
        }
    }

    /* JADX INFO: renamed from: wb.b$b, reason: collision with other inner class name */
    private static final class C0419b implements z0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l1 f31384a;

        C0419b(l1 l1Var) {
            this.f31384a = l1Var;
        }

        @Override // qb.z0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public l1 b(byte[] bArr) {
            try {
                return (l1) this.f31384a.getParserForType().parseFrom(bArr, b.f31379a);
            } catch (p0 e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        @Override // qb.z0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(l1 l1Var) {
            return l1Var.toByteArray();
        }
    }

    static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        l.o(inputStream, "inputStream cannot be null!");
        l.o(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static a1.c b(l1 l1Var) {
        return new a(l1Var, -1);
    }

    public static z0.f c(l1 l1Var) {
        return new C0419b(l1Var);
    }
}
