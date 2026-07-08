package s9;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    static StringBuilder a(int i10) {
        c.b(i10, "size");
        return new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824L));
    }
}
