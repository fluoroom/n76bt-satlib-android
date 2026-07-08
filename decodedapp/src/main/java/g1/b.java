package g1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import g1.c;
import i0.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c.a f13352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Uri f13353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String[] f13354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f13355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String[] f13356s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f13357t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Cursor f13358u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private i0.d f13359v;

    public b(Context context) {
        super(context);
        this.f13352o = new c.a();
    }

    @Override // g1.a
    public void B() {
        super.B();
        synchronized (this) {
            try {
                i0.d dVar = this.f13359v;
                if (dVar != null) {
                    dVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g1.c
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void f(Cursor cursor) {
        if (l()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f13358u;
        this.f13358u = cursor;
        if (m()) {
            super.f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    public String L() {
        return this.f13355r;
    }

    public String[] M() {
        return this.f13356s;
    }

    public Uri N() {
        return this.f13353p;
    }

    @Override // g1.a
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public Cursor H() {
        synchronized (this) {
            if (G()) {
                throw new k();
            }
            this.f13359v = new i0.d();
        }
        try {
            Cursor cursorB = b0.a.b(i().getContentResolver(), this.f13353p, this.f13354q, this.f13355r, this.f13356s, this.f13357t, this.f13359v);
            if (cursorB != null) {
                try {
                    cursorB.getCount();
                    cursorB.registerContentObserver(this.f13352o);
                } catch (RuntimeException e10) {
                    cursorB.close();
                    throw e10;
                }
            }
            synchronized (this) {
                this.f13359v = null;
            }
            return cursorB;
        } catch (Throwable th2) {
            synchronized (this) {
                this.f13359v = null;
                throw th2;
            }
        }
    }

    @Override // g1.a
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void I(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public void Q(String[] strArr) {
        this.f13354q = strArr;
    }

    public void R(String str) {
        this.f13355r = str;
    }

    public void S(String[] strArr) {
        this.f13356s = strArr;
    }

    public void T(String str) {
        this.f13357t = str;
    }

    public void U(Uri uri) {
        this.f13353p = uri;
    }

    @Override // g1.a, g1.c
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f13353p);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f13354q));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f13355r);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f13356s));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f13357t);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f13358u);
    }

    @Override // g1.c
    protected void r() {
        super.r();
        t();
        Cursor cursor = this.f13358u;
        if (cursor != null && !cursor.isClosed()) {
            this.f13358u.close();
        }
        this.f13358u = null;
    }

    @Override // g1.c
    protected void s() {
        Cursor cursor = this.f13358u;
        if (cursor != null) {
            f(cursor);
        }
        if (z() || this.f13358u == null) {
            h();
        }
    }

    @Override // g1.c
    protected void t() {
        b();
    }

    public b(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f13352o = new c.a();
        this.f13353p = uri;
        this.f13354q = strArr;
        this.f13355r = str;
        this.f13356s = strArr2;
        this.f13357t = str2;
    }
}
