package io.grpc.internal;

import io.grpc.internal.a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.msgpack.core.MessagePack;
import qb.k0;
import qb.z0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z0 extends a.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final k0.a f17267x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final z0.h f17268y;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private qb.u1 f17269t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private qb.z0 f17270u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Charset f17271v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f17272w;

    class a implements k0.a {
        a() {
        }

        @Override // qb.z0.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] + MessagePack.Code.INT8) * 100) + ((bArr[1] + MessagePack.Code.INT8) * 10) + bArr[2] + MessagePack.Code.INT8);
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, qb.k0.f24670a));
        }

        @Override // qb.z0.k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        a aVar = new a();
        f17267x = aVar;
        f17268y = qb.k0.b(":status", aVar);
    }

    protected z0(int i10, x2 x2Var, f3 f3Var, qb.c cVar) {
        super(i10, x2Var, f3Var, cVar);
        this.f17271v = StandardCharsets.UTF_8;
    }

    private static Charset P(qb.z0 z0Var) {
        String str = (String) z0Var.g(w0.f17192j);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.UTF_8;
    }

    private qb.u1 R(qb.z0 z0Var) {
        qb.u1 u1Var = (qb.u1) z0Var.g(qb.m0.f24690b);
        if (u1Var != null) {
            return u1Var.s((String) z0Var.g(qb.m0.f24689a));
        }
        if (this.f17272w) {
            return qb.u1.f24771g.s("missing GRPC status in response");
        }
        Integer num = (Integer) z0Var.g(f17268y);
        return (num != null ? w0.l(num.intValue()) : qb.u1.f24783s.s("missing HTTP status code")).g("missing GRPC status, inferred error from HTTP status code");
    }

    private static void S(qb.z0 z0Var) {
        z0Var.e(f17268y);
        z0Var.e(qb.m0.f24690b);
        z0Var.e(qb.m0.f24689a);
    }

    private qb.u1 W(qb.z0 z0Var) {
        Integer num = (Integer) z0Var.g(f17268y);
        if (num == null) {
            return qb.u1.f24783s.s("Missing HTTP status code");
        }
        String str = (String) z0Var.g(w0.f17192j);
        if (w0.m(str)) {
            return null;
        }
        return w0.l(num.intValue()).g("invalid content-type: " + str);
    }

    protected abstract void Q(qb.u1 u1Var, boolean z10, qb.z0 z0Var);

    protected void T(i2 i2Var, boolean z10) throws Throwable {
        qb.u1 u1Var = this.f17269t;
        if (u1Var != null) {
            this.f17269t = u1Var.g("DATA-----------------------------\n" + j2.e(i2Var, this.f17271v));
            i2Var.close();
            if (this.f17269t.p().length() > 1000 || z10) {
                Q(this.f17269t, false, this.f17270u);
                return;
            }
            return;
        }
        if (!this.f17272w) {
            i2Var.close();
            Q(qb.u1.f24783s.s("headers not received before payload"), false, new qb.z0());
            return;
        }
        int iG = i2Var.g();
        E(i2Var);
        if (z10) {
            if (iG > 0) {
                this.f17269t = qb.u1.f24783s.s("Received unexpected EOS on non-empty DATA frame from server");
            } else {
                this.f17269t = qb.u1.f24783s.s("Received unexpected EOS on empty DATA frame from server");
            }
            qb.z0 z0Var = new qb.z0();
            this.f17270u = z0Var;
            O(this.f17269t, false, z0Var);
        }
    }

    /* JADX WARN: Finally extract failed */
    protected void U(qb.z0 z0Var) {
        r9.l.o(z0Var, "headers");
        qb.u1 u1Var = this.f17269t;
        if (u1Var != null) {
            this.f17269t = u1Var.g("headers: " + z0Var);
            return;
        }
        try {
            if (this.f17272w) {
                qb.u1 u1VarS = qb.u1.f24783s.s("Received headers twice");
                this.f17269t = u1VarS;
                if (u1VarS != null) {
                    this.f17269t = u1VarS.g("headers: " + z0Var);
                    this.f17270u = z0Var;
                    this.f17271v = P(z0Var);
                    return;
                }
                return;
            }
            Integer num = (Integer) z0Var.g(f17268y);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                qb.u1 u1Var2 = this.f17269t;
                if (u1Var2 != null) {
                    this.f17269t = u1Var2.g("headers: " + z0Var);
                    this.f17270u = z0Var;
                    this.f17271v = P(z0Var);
                    return;
                }
                return;
            }
            this.f17272w = true;
            qb.u1 u1VarW = W(z0Var);
            this.f17269t = u1VarW;
            if (u1VarW != null) {
                if (u1VarW != null) {
                    this.f17269t = u1VarW.g("headers: " + z0Var);
                    this.f17270u = z0Var;
                    this.f17271v = P(z0Var);
                    return;
                }
                return;
            }
            S(z0Var);
            F(z0Var);
            qb.u1 u1Var3 = this.f17269t;
            if (u1Var3 != null) {
                this.f17269t = u1Var3.g("headers: " + z0Var);
                this.f17270u = z0Var;
                this.f17271v = P(z0Var);
            }
        } catch (Throwable th2) {
            qb.u1 u1Var4 = this.f17269t;
            if (u1Var4 != null) {
                this.f17269t = u1Var4.g("headers: " + z0Var);
                this.f17270u = z0Var;
                this.f17271v = P(z0Var);
            }
            throw th2;
        }
    }

    protected void V(qb.z0 z0Var) {
        r9.l.o(z0Var, "trailers");
        if (this.f17269t == null && !this.f17272w) {
            qb.u1 u1VarW = W(z0Var);
            this.f17269t = u1VarW;
            if (u1VarW != null) {
                this.f17270u = z0Var;
            }
        }
        qb.u1 u1Var = this.f17269t;
        if (u1Var == null) {
            qb.u1 u1VarR = R(z0Var);
            S(z0Var);
            G(z0Var, u1VarR);
        } else {
            qb.u1 u1VarG = u1Var.g("trailers: " + z0Var);
            this.f17269t = u1VarG;
            Q(u1VarG, false, this.f17270u);
        }
    }

    @Override // io.grpc.internal.a.c, io.grpc.internal.r1.b
    public /* bridge */ /* synthetic */ void c(boolean z10) {
        super.c(z10);
    }
}
