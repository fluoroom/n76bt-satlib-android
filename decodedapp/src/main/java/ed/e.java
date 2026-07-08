package ed;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends AbstractCollection implements Collection, sd.a {
    protected e() {
    }

    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }
}
