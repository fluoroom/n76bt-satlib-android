package o2;

import android.content.ContentResolver;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import o2.n;

/* JADX INFO: loaded from: classes.dex */
public class x implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f23161b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f23162a;

    public static final class a implements o, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f23163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f23164b;

        public a(ContentResolver contentResolver, boolean z10) {
            this.f23163a = contentResolver;
            this.f23164b = z10;
        }

        @Override // o2.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f23163a, uri, this.f23164b);
        }

        @Override // o2.o
        public n d(r rVar) {
            return new x(this);
        }
    }

    public static class b implements o, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f23165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f23166b;

        public b(ContentResolver contentResolver, boolean z10) {
            this.f23165a = contentResolver;
            this.f23166b = z10;
        }

        @Override // o2.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f23165a, uri, this.f23166b);
        }

        @Override // o2.o
        public n d(r rVar) {
            return new x(this);
        }
    }

    public interface c {
        com.bumptech.glide.load.data.d a(Uri uri);
    }

    public static class d implements o, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f23167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f23168b;

        public d(ContentResolver contentResolver, boolean z10) {
            this.f23167a = contentResolver;
            this.f23168b = z10;
        }

        @Override // o2.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f23167a, uri, this.f23168b);
        }

        @Override // o2.o
        public n d(r rVar) {
            return new x(this);
        }
    }

    public x(c cVar) {
        this.f23162a = cVar;
    }

    @Override // o2.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, i2.h hVar) {
        return new n.a(new d3.b(uri), this.f23162a.a(uri));
    }

    @Override // o2.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f23161b.contains(uri.getScheme());
    }
}
