package d4;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f10568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f10569b = new ArrayDeque();

    public interface a {
        Object newInstance();
    }

    public e(a aVar) {
        this.f10568a = aVar;
    }

    public Object a() {
        return this.f10569b.isEmpty() ? this.f10568a.newInstance() : this.f10569b.getLast();
    }
}
