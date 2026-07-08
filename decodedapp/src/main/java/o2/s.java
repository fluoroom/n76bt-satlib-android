package o2;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import o2.n;

/* JADX INFO: loaded from: classes.dex */
public class s implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f23147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f23148b;

    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f23149a;

        public a(Resources resources) {
            this.f23149a = resources;
        }

        @Override // o2.o
        public n d(r rVar) {
            return new s(this.f23149a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f23150a;

        public b(Resources resources) {
            this.f23150a = resources;
        }

        @Override // o2.o
        public n d(r rVar) {
            return new s(this.f23150a, rVar.d(Uri.class, InputStream.class));
        }
    }

    public static class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f23151a;

        public c(Resources resources) {
            this.f23151a = resources;
        }

        @Override // o2.o
        public n d(r rVar) {
            return new s(this.f23151a, w.c());
        }
    }

    public s(Resources resources, n nVar) {
        this.f23148b = resources;
        this.f23147a = nVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f23148b.getResourcePackageName(num.intValue()) + '/' + num);
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    @Override // o2.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Integer num, int i10, int i11, i2.h hVar) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.f23147a.b(uriD, i10, i11, hVar);
    }

    @Override // o2.n
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }
}
