package p2;

import android.content.Context;
import android.net.Uri;
import i2.h;
import o2.n;
import o2.o;
import o2.r;

/* JADX INFO: loaded from: classes.dex */
public class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23852a;

    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23853a;

        public a(Context context) {
            this.f23853a = context;
        }

        @Override // o2.o
        public n d(r rVar) {
            return new b(this.f23853a);
        }
    }

    public b(Context context) {
        this.f23852a = context.getApplicationContext();
    }

    @Override // o2.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, h hVar) {
        if (j2.b.f(i10, i11)) {
            return new n.a(new d3.b(uri), j2.c.f(this.f23852a, uri));
        }
        return null;
    }

    @Override // o2.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return j2.b.b(uri);
    }
}
