package j0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f18367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f18369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f18370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f18371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f18372f;

        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this(uri, i10, i11, z10, null, i12);
        }

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f18372f;
        }

        public String c() {
            if (i()) {
                return this.f18367a.getAuthority();
            }
            return null;
        }

        public int d() {
            return this.f18368b;
        }

        public Uri e() {
            return this.f18367a;
        }

        public String f() {
            return this.f18371e;
        }

        public int g() {
            return this.f18369c;
        }

        public boolean h() {
            return this.f18370d;
        }

        public boolean i() {
            return Objects.equals(this.f18367a.getScheme(), "systemfont");
        }

        public b(Uri uri, int i10, int i11, boolean z10, String str, int i12) {
            this.f18367a = (Uri) l0.g.g(uri);
            this.f18368b = i10;
            this.f18369c = i11;
            this.f18370d = z10;
            this.f18371e = str;
            this.f18372f = i12;
        }

        public b(String str, String str2) {
            this.f18367a = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.f18368b = 0;
            this.f18369c = 400;
            this.f18370d = false;
            this.f18371e = str2;
            this.f18372f = 0;
        }
    }

    public static class c {
        public abstract void a(int i10);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return d0.j.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, f fVar) {
        return e.e(context, h.a(new Object[]{fVar}), cancellationSignal);
    }

    public static Typeface c(Context context, List list, int i10, boolean z10, int i11, Handler handler, c cVar) {
        j0.a aVar = new j0.a(cVar, k.b(handler));
        if (!z10) {
            return i.d(context, list, i10, null, aVar);
        }
        if (list.size() <= 1) {
            return i.e(context, (f) list.get(0), aVar, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f18365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f18366b;

        public a(int i10, b[] bVarArr) {
            this.f18365a = i10;
            this.f18366b = Collections.singletonList(bVarArr);
        }

        static a a(int i10, List list) {
            return new a(i10, list);
        }

        static a b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] c() {
            return (b[]) this.f18366b.get(0);
        }

        public List d() {
            return this.f18366b;
        }

        public int e() {
            return this.f18365a;
        }

        boolean f() {
            return this.f18366b.size() > 1;
        }

        a(int i10, List list) {
            this.f18365a = i10;
            this.f18366b = list;
        }
    }
}
