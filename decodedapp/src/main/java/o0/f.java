package o0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f23050a;

    private interface c {
        ClipDescription a();

        Uri b();

        void c();

        Uri d();

        Object e();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f23050a = new a(uri, clipDescription, uri2);
        } else {
            this.f23050a = new b(uri, clipDescription, uri2);
        }
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f23050a.b();
    }

    public ClipDescription b() {
        return this.f23050a.a();
    }

    public Uri c() {
        return this.f23050a.d();
    }

    public void d() {
        this.f23050a.c();
    }

    public Object e() {
        return this.f23050a.e();
    }

    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InputContentInfo f23051a;

        a(Object obj) {
            this.f23051a = (InputContentInfo) obj;
        }

        @Override // o0.f.c
        public ClipDescription a() {
            return this.f23051a.getDescription();
        }

        @Override // o0.f.c
        public Uri b() {
            return this.f23051a.getContentUri();
        }

        @Override // o0.f.c
        public void c() {
            this.f23051a.requestPermission();
        }

        @Override // o0.f.c
        public Uri d() {
            return this.f23051a.getLinkUri();
        }

        @Override // o0.f.c
        public Object e() {
            return this.f23051a;
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f23051a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private f(c cVar) {
        this.f23050a = cVar;
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f23052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClipDescription f23053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f23054c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f23052a = uri;
            this.f23053b = clipDescription;
            this.f23054c = uri2;
        }

        @Override // o0.f.c
        public ClipDescription a() {
            return this.f23053b;
        }

        @Override // o0.f.c
        public Uri b() {
            return this.f23052a;
        }

        @Override // o0.f.c
        public Uri d() {
            return this.f23054c;
        }

        @Override // o0.f.c
        public Object e() {
            return null;
        }

        @Override // o0.f.c
        public void c() {
        }
    }
}
