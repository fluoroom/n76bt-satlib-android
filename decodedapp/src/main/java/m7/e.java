package m7;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import q7.i;
import t7.a;
import t7.g;

/* JADX INFO: loaded from: classes.dex */
final class e extends a.AbstractC0384a {
    e() {
    }

    @Override // t7.a.AbstractC0384a
    public final /* synthetic */ a.f a(Context context, Looper looper, v7.e eVar, Object obj, g.a aVar, g.b bVar) {
        return new i(context, looper, eVar, (GoogleSignInOptions) obj, aVar, bVar);
    }
}
