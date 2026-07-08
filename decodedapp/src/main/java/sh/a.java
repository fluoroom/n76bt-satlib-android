package sh;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.internal.platform.d;
import rd.h;
import rd.m;
import vh.n0;
import vh.z;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0380a f27374h = new C0380a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f27375i = "PublicSuffixDatabase.list";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f27376g;

    /* JADX INFO: renamed from: sh.a$a, reason: collision with other inner class name */
    public static final class C0380a {
        public /* synthetic */ C0380a(h hVar) {
            this();
        }

        private C0380a() {
        }
    }

    public a(String str) {
        m.e(str, "path");
        this.f27376g = str;
    }

    @Override // sh.b
    public n0 e() throws IOException {
        Context contextB = d.f23687a.b();
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream inputStreamOpen = assets.open(d());
        m.d(inputStreamOpen, "open(...)");
        return z.j(inputStreamOpen);
    }

    @Override // sh.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public String d() {
        return this.f27376g;
    }

    public /* synthetic */ a(String str, int i10, h hVar) {
        this((i10 & 1) != 0 ? f27375i : str);
    }
}
