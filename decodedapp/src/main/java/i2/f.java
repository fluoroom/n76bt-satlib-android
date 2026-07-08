package i2;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f15750a = Charset.forName(Utf8Charset.NAME);

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
