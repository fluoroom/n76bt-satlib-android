package s6;

import java.util.Iterator;
import java.util.List;
import t6.z;

/* JADX INFO: loaded from: classes.dex */
public class v extends p6.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z f26974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f26975e;

    public v(e6.j jVar, String str, e6.h hVar, z zVar) {
        super(jVar, str, hVar);
        this.f26974d = zVar;
    }

    @Override // p6.m, e6.k, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this.f26975e == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(message);
        Iterator it = this.f26975e.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        sb2.append('.');
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public synchronized v fillInStackTrace() {
        return this;
    }

    public z w() {
        return this.f26974d;
    }
}
