package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends j$.com.android.tools.r8.a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f17447b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f17448a;

    public a(y yVar) {
        this.f17448a = yVar;
    }

    static {
        System.currentTimeMillis();
        f17447b = new a(z.f17652e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f17448a.equals(((a) obj).f17448a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17448a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f17448a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
