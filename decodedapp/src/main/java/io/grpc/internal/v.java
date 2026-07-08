package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class v extends io.grpc.internal.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f17168f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f17169g = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final f f17170h = new c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final f f17171r = new d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final g f17172s = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque f17173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Deque f17174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f17176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17177e;

    class a implements f {
        a() {
        }

        @Override // io.grpc.internal.v.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(i2 i2Var, int i10, Void r32, int i11) {
            return i2Var.readUnsignedByte();
        }
    }

    class b implements f {
        b() {
        }

        @Override // io.grpc.internal.v.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(i2 i2Var, int i10, Void r32, int i11) {
            i2Var.skipBytes(i10);
            return 0;
        }
    }

    class c implements f {
        c() {
        }

        @Override // io.grpc.internal.v.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(i2 i2Var, int i10, byte[] bArr, int i11) {
            i2Var.L(bArr, i11, i10);
            return i11 + i10;
        }
    }

    class d implements f {
        d() {
        }

        @Override // io.grpc.internal.v.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(i2 i2Var, int i10, ByteBuffer byteBuffer, int i11) {
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i10);
            i2Var.m0(byteBuffer);
            byteBuffer.limit(iLimit);
            return 0;
        }
    }

    class e implements g {
        e() {
        }

        @Override // io.grpc.internal.v.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(i2 i2Var, int i10, OutputStream outputStream, int i11) {
            i2Var.c0(outputStream, i10);
            return 0;
        }
    }

    private interface f extends g {
    }

    private interface g {
        int a(i2 i2Var, int i10, Object obj, int i11);
    }

    public v(int i10) {
        this.f17176d = new ArrayDeque(2);
        this.f17173a = new ArrayDeque(i10);
    }

    private void k() {
        if (!this.f17177e) {
            ((i2) this.f17173a.remove()).close();
            return;
        }
        this.f17174b.add((i2) this.f17173a.remove());
        i2 i2Var = (i2) this.f17173a.peek();
        if (i2Var != null) {
            i2Var.R();
        }
    }

    private void l() {
        if (((i2) this.f17173a.peek()).g() == 0) {
            k();
        }
    }

    private void n(i2 i2Var) {
        if (!(i2Var instanceof v)) {
            this.f17173a.add(i2Var);
            this.f17175c += i2Var.g();
            return;
        }
        v vVar = (v) i2Var;
        while (!vVar.f17173a.isEmpty()) {
            this.f17173a.add((i2) vVar.f17173a.remove());
        }
        this.f17175c += vVar.f17175c;
        vVar.f17175c = 0;
        vVar.close();
    }

    private int q(g gVar, int i10, Object obj, int i11) {
        a(i10);
        if (!this.f17173a.isEmpty()) {
            l();
        }
        while (i10 > 0 && !this.f17173a.isEmpty()) {
            i2 i2Var = (i2) this.f17173a.peek();
            int iMin = Math.min(i10, i2Var.g());
            i11 = gVar.a(i2Var, iMin, obj, i11);
            i10 -= iMin;
            this.f17175c -= iMin;
            l();
        }
        if (i10 <= 0) {
            return i11;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private int r(f fVar, int i10, Object obj, int i11) {
        try {
            return q(fVar, i10, obj, i11);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // io.grpc.internal.i2
    public void L(byte[] bArr, int i10, int i11) {
        r(f17170h, i11, bArr, i10);
    }

    @Override // io.grpc.internal.b, io.grpc.internal.i2
    public void R() {
        if (this.f17174b == null) {
            this.f17174b = new ArrayDeque(Math.min(this.f17173a.size(), 16));
        }
        while (!this.f17174b.isEmpty()) {
            ((i2) this.f17174b.remove()).close();
        }
        this.f17177e = true;
        i2 i2Var = (i2) this.f17173a.peek();
        if (i2Var != null) {
            i2Var.R();
        }
    }

    @Override // io.grpc.internal.i2
    public void c0(OutputStream outputStream, int i10) {
        q(f17172s, i10, outputStream, 0);
    }

    @Override // io.grpc.internal.b, io.grpc.internal.i2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f17173a.isEmpty()) {
            ((i2) this.f17173a.remove()).close();
        }
        if (this.f17174b != null) {
            while (!this.f17174b.isEmpty()) {
                ((i2) this.f17174b.remove()).close();
            }
        }
    }

    public void e(i2 i2Var) {
        boolean z10 = this.f17177e && this.f17173a.isEmpty();
        n(i2Var);
        if (z10) {
            ((i2) this.f17173a.peek()).R();
        }
    }

    @Override // io.grpc.internal.i2
    public int g() {
        return this.f17175c;
    }

    @Override // io.grpc.internal.i2
    public void m0(ByteBuffer byteBuffer) {
        r(f17171r, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // io.grpc.internal.b, io.grpc.internal.i2
    public boolean markSupported() {
        Iterator it = this.f17173a.iterator();
        while (it.hasNext()) {
            if (!((i2) it.next()).markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.internal.i2
    public int readUnsignedByte() {
        return r(f17168f, 1, null, 0);
    }

    @Override // io.grpc.internal.b, io.grpc.internal.i2
    public void reset() {
        if (!this.f17177e) {
            throw new InvalidMarkException();
        }
        i2 i2Var = (i2) this.f17173a.peek();
        if (i2Var != null) {
            int iG = i2Var.g();
            i2Var.reset();
            this.f17175c += i2Var.g() - iG;
        }
        while (true) {
            i2 i2Var2 = (i2) this.f17174b.pollLast();
            if (i2Var2 == null) {
                return;
            }
            i2Var2.reset();
            this.f17173a.addFirst(i2Var2);
            this.f17175c += i2Var2.g();
        }
    }

    @Override // io.grpc.internal.i2
    public void skipBytes(int i10) {
        r(f17169g, i10, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [io.grpc.internal.i2] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [io.grpc.internal.i2] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.grpc.internal.v] */
    /* JADX WARN: Type inference failed for: r1v3, types: [io.grpc.internal.v] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // io.grpc.internal.i2
    public i2 u(int i10) {
        i2 i2VarU;
        int i11;
        i2 i2VarU2;
        ?? r12;
        ?? r02;
        if (i10 <= 0) {
            return j2.a();
        }
        a(i10);
        this.f17175c -= i10;
        ?? r03 = 0;
        ?? vVar = 0;
        while (true) {
            i2 i2Var = (i2) this.f17173a.peek();
            int iG = i2Var.g();
            if (iG > i10) {
                i2VarU2 = i2Var.u(i10);
                i11 = 0;
            } else {
                if (this.f17177e) {
                    i2VarU = i2Var.u(iG);
                    k();
                } else {
                    i2VarU = (i2) this.f17173a.poll();
                }
                i2 i2Var2 = i2VarU;
                i11 = i10 - iG;
                i2VarU2 = i2Var2;
            }
            if (r03 == 0) {
                r02 = i2VarU2;
                r12 = vVar;
            } else {
                if (vVar == 0) {
                    vVar = new v(i11 != 0 ? Math.min(this.f17173a.size() + 2, 16) : 2);
                    vVar.e(r03);
                    r03 = vVar;
                }
                vVar.e(i2VarU2);
                r02 = r03;
                r12 = vVar;
            }
            if (i11 <= 0) {
                return r02;
            }
            i10 = i11;
            r03 = r02;
            vVar = r12;
        }
    }

    public v() {
        this.f17176d = new ArrayDeque(2);
        this.f17173a = new ArrayDeque();
    }
}
