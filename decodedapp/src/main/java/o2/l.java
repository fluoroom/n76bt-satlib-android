package o2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import o2.n;

/* JADX INFO: loaded from: classes.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23111a;

    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23112a;

        public a(Context context) {
            this.f23112a = context;
        }

        @Override // o2.o
        public n d(r rVar) {
            return new l(this.f23112a);
        }
    }

    public l(Context context) {
        this.f23111a = context;
    }

    @Override // o2.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, i2.h hVar) {
        return new n.a(new d3.b(uri), new b(this.f23111a, uri));
    }

    @Override // o2.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return j2.b.d(uri);
    }

    private static class b implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f23113c = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f23115b;

        b(Context context, Uri uri) {
            this.f23114a = context;
            this.f23115b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public i2.a d() {
            return i2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, d.a aVar) {
            Cursor cursorQuery = this.f23114a.getContentResolver().query(this.f23115b, f23113c, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.f(new File(string));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f23115b));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
