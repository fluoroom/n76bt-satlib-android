package r2;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import r2.s;

/* JADX INFO: loaded from: classes.dex */
public class h0 implements i2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f25350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l2.b f25351b;

    static class a implements s.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f0 f25352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e3.d f25353b;

        a(f0 f0Var, e3.d dVar) {
            this.f25352a = f0Var;
            this.f25353b = dVar;
        }

        @Override // r2.s.b
        public void a() {
            this.f25352a.c();
        }

        @Override // r2.s.b
        public void b(l2.d dVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionA = this.f25353b.a();
            if (iOExceptionA != null) {
                if (bitmap == null) {
                    throw iOExceptionA;
                }
                dVar.c(bitmap);
                throw iOExceptionA;
            }
        }
    }

    public h0(s sVar, l2.b bVar) {
        this.f25350a = sVar;
        this.f25351b = bVar;
    }

    @Override // i2.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2.v b(InputStream inputStream, int i10, int i11, i2.h hVar) {
        f0 f0Var;
        boolean z10;
        if (inputStream instanceof f0) {
            f0Var = (f0) inputStream;
            z10 = false;
        } else {
            f0Var = new f0(inputStream, this.f25351b);
            z10 = true;
        }
        e3.d dVarC = e3.d.c(f0Var);
        try {
            k2.v vVarE = this.f25350a.e(new e3.i(dVarC), i10, i11, hVar, new a(f0Var, dVarC));
            dVarC.e();
            if (z10) {
                f0Var.e();
            }
            return vVarE;
        } finally {
        }
    }

    @Override // i2.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, i2.h hVar) {
        return this.f25350a.p(inputStream);
    }
}
