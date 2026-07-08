package m2;

import android.content.Context;
import java.io.File;
import m2.d;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f20937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20938b;

        a(Context context, String str) {
            this.f20937a = context;
            this.f20938b = str;
        }

        @Override // m2.d.a
        public File a() {
            File cacheDir = this.f20937a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f20938b != null ? new File(cacheDir, this.f20938b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
