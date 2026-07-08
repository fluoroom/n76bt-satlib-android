package okhttp3.internal.platform;

import android.content.Context;
import ed.q;
import java.util.List;
import kotlin.Metadata;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Ln1/a;", "Lokhttp3/internal/platform/c;", "<init>", "()V", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)Lokhttp3/internal/platform/c;", "", "Ljava/lang/Class;", "a", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlatformInitializer implements n1.a {
    @Override // n1.a
    public List a() {
        return q.k();
    }

    @Override // n1.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c b(Context context) {
        m.e(context, "context");
        d.f23687a.d(context);
        return c.f23684a.e();
    }
}
