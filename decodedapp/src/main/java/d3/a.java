package d3;

import i2.f;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f10559b = new a();

    private a() {
    }

    public static a c() {
        return f10559b;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
    }
}
