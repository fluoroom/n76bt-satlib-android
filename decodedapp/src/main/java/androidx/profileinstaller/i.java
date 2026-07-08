package androidx.profileinstaller;

import com.facebook.stetho.dumpapp.Framer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f2827a = {48, Framer.STDOUT_FRAME_PREFIX, 53, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final byte[] f2828b = {48, Framer.STDOUT_FRAME_PREFIX, 48, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final byte[] f2829c = {48, 48, 57, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final byte[] f2830d = {48, 48, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final byte[] f2831e = {48, 48, Framer.STDOUT_FRAME_PREFIX, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final byte[] f2832f = {48, 48, Framer.STDOUT_FRAME_PREFIX, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final byte[] f2833g = {48, 48, Framer.STDERR_FRAME_PREFIX, 0};

    static String a(byte[] bArr) {
        return (Arrays.equals(bArr, f2831e) || Arrays.equals(bArr, f2830d)) ? ":" : "!";
    }
}
