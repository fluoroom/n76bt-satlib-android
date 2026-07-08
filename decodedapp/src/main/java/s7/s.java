package s7;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import v7.s0;
import v7.s1;

/* JADX INFO: loaded from: classes.dex */
abstract class s extends s1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27006c;

    protected s(byte[] bArr) {
        v7.q.a(bArr.length == 25);
        this.f27006c = Arrays.hashCode(bArr);
    }

    protected static byte[] q(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        c8.b bVarP;
        if (obj != null && (obj instanceof s0)) {
            try {
                s0 s0Var = (s0) obj;
                if (s0Var.i() == this.f27006c && (bVarP = s0Var.p()) != null) {
                    return Arrays.equals(x(), (byte[]) c8.d.x(bVarP));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f27006c;
    }

    @Override // v7.s0
    public final int i() {
        return this.f27006c;
    }

    @Override // v7.s0
    public final c8.b p() {
        return c8.d.v1(x());
    }

    abstract byte[] x();
}
