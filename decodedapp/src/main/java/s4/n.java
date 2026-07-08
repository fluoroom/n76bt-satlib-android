package s4;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import g1.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003¨\u0006\u0012"}, d2 = {"Ls4/n;", "Lv3/i0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "r2", "(Landroid/os/Bundle;)V", "", "arg0", "arg1", "Lg1/c;", "Landroid/database/Cursor;", "S", "(ILandroid/os/Bundle;)Lg1/c;", "J4", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends v3.i0 {

    private static final class a extends g1.b {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final c.a f26612w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            rd.m.e(context, "context");
            this.f26612w = new c.a();
        }

        @Override // g1.b, g1.a
        /* JADX INFO: renamed from: O */
        public Cursor H() {
            Cursor cursorF = s3.b.f();
            if (cursorF != null) {
                cursorF.registerContentObserver(this.f26612w);
            }
            return cursorF;
        }
    }

    @Override // v3.i0
    public void J4() {
        s3.b.a();
    }

    @Override // v3.i0, androidx.loader.app.a.InterfaceC0037a
    public g1.c S(int arg0, Bundle arg1) {
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        return new a(contextX3);
    }

    @Override // v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        P4(true);
    }
}
