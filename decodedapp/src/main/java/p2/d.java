package p2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import i2.h;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import o2.n;
import o2.o;
import o2.r;

/* JADX INFO: loaded from: classes.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f23857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f23858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class f23859d;

    private static abstract class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f23861b;

        a(Context context, Class cls) {
            this.f23860a = context;
            this.f23861b = cls;
        }

        @Override // o2.o
        public final n d(r rVar) {
            return new d(this.f23860a, rVar.d(File.class, this.f23861b), rVar.d(Uri.class, this.f23861b), this.f23861b);
        }
    }

    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: p2.d$d, reason: collision with other inner class name */
    private static final class C0328d implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String[] f23862t = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n f23864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n f23865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f23866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f23867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f23868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final h f23869g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Class f23870h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private volatile boolean f23871r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d f23872s;

        C0328d(Context context, n nVar, n nVar2, Uri uri, int i10, int i11, h hVar, Class cls) {
            this.f23863a = context.getApplicationContext();
            this.f23864b = nVar;
            this.f23865c = nVar2;
            this.f23866d = uri;
            this.f23867e = i10;
            this.f23868f = i11;
            this.f23869g = hVar;
            this.f23870h = cls;
        }

        private n.a c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f23864b.b(h(this.f23866d), this.f23867e, this.f23868f, this.f23869g);
            }
            if (j2.b.a(this.f23866d)) {
                return this.f23865c.b(this.f23866d, this.f23867e, this.f23868f, this.f23869g);
            }
            return this.f23865c.b(g() ? MediaStore.setRequireOriginal(this.f23866d) : this.f23866d, this.f23867e, this.f23868f, this.f23869g);
        }

        private com.bumptech.glide.load.data.d f() {
            n.a aVarC = c();
            if (aVarC != null) {
                return aVarC.f23124c;
            }
            return null;
        }

        private boolean g() {
            return this.f23863a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            try {
                Cursor cursorQuery = this.f23863a.getContentResolver().query(uri, f23862t, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } finally {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f23870h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d dVar = this.f23872s;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f23871r = true;
            com.bumptech.glide.load.data.d dVar = this.f23872s;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public i2.a d() {
            return i2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, d.a aVar) {
            try {
                com.bumptech.glide.load.data.d dVarF = f();
                if (dVarF == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f23866d));
                    return;
                }
                this.f23872s = dVarF;
                if (this.f23871r) {
                    cancel();
                } else {
                    dVarF.e(hVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    d(Context context, n nVar, n nVar2, Class cls) {
        this.f23856a = context.getApplicationContext();
        this.f23857b = nVar;
        this.f23858c = nVar2;
        this.f23859d = cls;
    }

    @Override // o2.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, h hVar) {
        return new n.a(new d3.b(uri), new C0328d(this.f23856a, this.f23857b, this.f23858c, uri, i10, i11, hVar, this.f23859d));
    }

    @Override // o2.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && j2.b.d(uri);
    }
}
