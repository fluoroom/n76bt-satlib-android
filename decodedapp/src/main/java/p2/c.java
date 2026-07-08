package p2;

import android.content.Context;
import android.net.Uri;
import i2.h;
import o2.n;
import o2.o;
import o2.r;
import r2.k0;

/* JADX INFO: loaded from: classes.dex */
public class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23854a;

    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23855a;

        public a(Context context) {
            this.f23855a = context;
        }

        @Override // o2.o
        public n d(r rVar) {
            return new c(this.f23855a);
        }
    }

    public c(Context context) {
        this.f23854a = context.getApplicationContext();
    }

    private boolean e(h hVar) {
        Long l10 = (Long) hVar.c(k0.f25363d);
        return l10 != null && l10.longValue() == -1;
    }

    @Override // o2.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, h hVar) {
        if (j2.b.f(i10, i11) && e(hVar)) {
            return new n.a(new d3.b(uri), j2.c.g(this.f23854a, uri));
        }
        return null;
    }

    @Override // o2.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return j2.b.e(uri);
    }
}
