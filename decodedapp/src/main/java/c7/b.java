package c7;

import e6.x;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p6.l;
import p6.t;

/* JADX INFO: loaded from: classes.dex */
public class b extends t implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicInteger f4467g = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f4468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final x f4469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f4470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected a f4471d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected HashMap f4472e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected LinkedHashSet f4473f = null;

    public b() {
        String name;
        if (getClass() == b.class) {
            name = "SimpleModule-" + f4467g.getAndIncrement();
        } else {
            name = getClass().getName();
        }
        this.f4468a = name;
        this.f4469b = x.e();
        this.f4470c = false;
    }

    @Override // p6.t
    public String b() {
        return this.f4468a;
    }

    @Override // p6.t
    public Object c() {
        return this.f4470c ? this.f4468a : getClass() == b.class ? this.f4468a : super.c();
    }

    @Override // p6.t
    public void d(t.a aVar) {
        a aVar2 = this.f4471d;
        if (aVar2 != null) {
            aVar.c(aVar2);
        }
        LinkedHashSet linkedHashSet = this.f4473f;
        if (linkedHashSet != null && linkedHashSet.size() > 0) {
            LinkedHashSet linkedHashSet2 = this.f4473f;
            aVar.b((a7.b[]) linkedHashSet2.toArray(new a7.b[linkedHashSet2.size()]));
        }
        HashMap map = this.f4472e;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                aVar.a((Class) entry.getKey(), (Class) entry.getValue());
            }
        }
    }

    @Override // p6.t
    public x e() {
        return this.f4469b;
    }

    protected void f(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("Cannot pass `null` as %s", str));
        }
    }

    public b g(Class cls, l lVar) {
        f(cls, "type to register deserializer for");
        f(lVar, "deserializer");
        if (this.f4471d == null) {
            this.f4471d = new a();
        }
        this.f4471d.k(cls, lVar);
        return this;
    }
}
