package i7;

import j7.c;
import java.io.Serializable;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes.dex */
public class p implements r, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f15914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f15915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final transient j7.c f15916c;

    public p(int i10, int i11) {
        this.f15914a = i10;
        this.f15915b = i11;
        this.f15916c = new c.C0236c().c(i10).d(i11).b(4).a();
    }

    public void a(BiConsumer biConsumer) {
        for (Map.Entry entry : this.f15916c.entrySet()) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }

    public Object b(Object obj, Object obj2) {
        return this.f15916c.put(obj, obj2);
    }

    public int c() {
        return this.f15916c.size();
    }

    @Override // i7.r
    public Object get(Object obj) {
        return this.f15916c.get(obj);
    }

    @Override // i7.r
    public Object putIfAbsent(Object obj, Object obj2) {
        return this.f15916c.putIfAbsent(obj, obj2);
    }
}
