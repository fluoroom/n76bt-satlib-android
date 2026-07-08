package s5;

import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Vector f26875a = new Vector();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26876b;

    public a(boolean z10) {
        this.f26876b = z10;
    }

    private boolean b(Object obj) {
        Iterator it = this.f26875a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((b) it.next()).F0(obj)) {
                z10 = true;
            }
        }
        return z10;
    }

    private boolean d(Object obj) {
        Iterator it = this.f26875a.iterator();
        while (it.hasNext()) {
            if (((b) it.next()).F0(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // s5.b
    public boolean F0(Object obj) {
        return this.f26876b ? d(obj) : b(obj);
    }

    public void a(b bVar) {
        this.f26875a.add(bVar);
    }

    public void c(b bVar) {
        this.f26875a.remove(bVar);
    }
}
