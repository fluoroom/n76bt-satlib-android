package s3;

import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Property {
    public a(String str) {
        super(Integer.class, str);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void set(Object obj, Integer num) {
        b(obj, num.intValue());
    }

    public abstract void b(Object obj, int i10);
}
