package v6;

import e6.j;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Class f30321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final String f30322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Collection f30323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected transient String f30324h;

    protected g(j jVar, String str, e6.h hVar, Class cls, String str2, Collection collection) {
        super(jVar, str, hVar);
        this.f30321e = cls;
        this.f30322f = str2;
        this.f30323g = collection;
    }

    @Override // e6.k
    public String d() {
        String str = this.f30324h;
        if (str != null || this.f30323g == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(100);
        int size = this.f30323g.size();
        if (size != 1) {
            sb2.append(" (");
            sb2.append(size);
            sb2.append(" known properties: ");
            Iterator it = this.f30323g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                sb2.append('\"');
                sb2.append(String.valueOf(it.next()));
                sb2.append('\"');
                if (sb2.length() > 1000) {
                    sb2.append(" [truncated]");
                    break;
                }
                if (it.hasNext()) {
                    sb2.append(", ");
                }
            }
        } else {
            sb2.append(" (one known property: \"");
            sb2.append(String.valueOf(this.f30323g.iterator().next()));
            sb2.append('\"');
        }
        sb2.append("])");
        String string = sb2.toString();
        this.f30324h = string;
        return string;
    }
}
