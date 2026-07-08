package m0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f20732a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f20733a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f20733a = new b(clipData, i10);
            } else {
                this.f20733a = new C0282d(clipData, i10);
            }
        }

        public d a() {
            return this.f20733a.build();
        }

        public a b(Bundle bundle) {
            this.f20733a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f20733a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f20733a.a(uri);
            return this;
        }
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f20734a;

        b(ClipData clipData, int i10) {
            this.f20734a = m0.e.a(clipData, i10);
        }

        @Override // m0.d.c
        public void a(Uri uri) {
            this.f20734a.setLinkUri(uri);
        }

        @Override // m0.d.c
        public void b(int i10) {
            this.f20734a.setFlags(i10);
        }

        @Override // m0.d.c
        public d build() {
            return new d(new e(this.f20734a.build()));
        }

        @Override // m0.d.c
        public void setExtras(Bundle bundle) {
            this.f20734a.setExtras(bundle);
        }
    }

    private interface c {
        void a(Uri uri);

        void b(int i10);

        d build();

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: m0.d$d, reason: collision with other inner class name */
    private static final class C0282d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ClipData f20735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f20737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Uri f20738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f20739e;

        C0282d(ClipData clipData, int i10) {
            this.f20735a = clipData;
            this.f20736b = i10;
        }

        @Override // m0.d.c
        public void a(Uri uri) {
            this.f20738d = uri;
        }

        @Override // m0.d.c
        public void b(int i10) {
            this.f20737c = i10;
        }

        @Override // m0.d.c
        public d build() {
            return new d(new g(this));
        }

        @Override // m0.d.c
        public void setExtras(Bundle bundle) {
            this.f20739e = bundle;
        }
    }

    private static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo f20740a;

        e(ContentInfo contentInfo) {
            this.f20740a = m0.c.a(l0.g.g(contentInfo));
        }

        @Override // m0.d.f
        public ClipData a() {
            return this.f20740a.getClip();
        }

        @Override // m0.d.f
        public int b() {
            return this.f20740a.getFlags();
        }

        @Override // m0.d.f
        public ContentInfo c() {
            return this.f20740a;
        }

        @Override // m0.d.f
        public int getSource() {
            return this.f20740a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f20740a + "}";
        }
    }

    private interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int getSource();
    }

    private static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClipData f20741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f20742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f20743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f20744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Bundle f20745e;

        g(C0282d c0282d) {
            this.f20741a = (ClipData) l0.g.g(c0282d.f20735a);
            this.f20742b = l0.g.c(c0282d.f20736b, 0, 5, "source");
            this.f20743c = l0.g.f(c0282d.f20737c, 1);
            this.f20744d = c0282d.f20738d;
            this.f20745e = c0282d.f20739e;
        }

        @Override // m0.d.f
        public ClipData a() {
            return this.f20741a;
        }

        @Override // m0.d.f
        public int b() {
            return this.f20743c;
        }

        @Override // m0.d.f
        public ContentInfo c() {
            return null;
        }

        @Override // m0.d.f
        public int getSource() {
            return this.f20742b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f20741a.getDescription());
            sb2.append(", source=");
            sb2.append(d.e(this.f20742b));
            sb2.append(", flags=");
            sb2.append(d.a(this.f20743c));
            if (this.f20744d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f20744d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f20745e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    d(f fVar) {
        this.f20732a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static d g(ContentInfo contentInfo) {
        return new d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f20732a.a();
    }

    public int c() {
        return this.f20732a.b();
    }

    public int d() {
        return this.f20732a.getSource();
    }

    public ContentInfo f() {
        ContentInfo contentInfoC = this.f20732a.c();
        Objects.requireNonNull(contentInfoC);
        m0.c.a(contentInfoC);
        return contentInfoC;
    }

    public String toString() {
        return this.f20732a.toString();
    }
}
