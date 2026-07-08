package yj;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements c0 {

    /* JADX INFO: renamed from: a */
    private final ConcurrentMap f32655a;

    /* JADX INFO: renamed from: b */
    private final ConcurrentMap f32656b;

    public e() {
        int length = zj.s.values().length * 2;
        this.f32655a = new ConcurrentHashMap(length);
        this.f32656b = new ConcurrentHashMap(length);
    }

    @Override // yj.c0
    public b c() {
        return new b(i.f32670w, w.f32744f, h());
    }

    @Override // yj.c0
    public i0 f(final zj.s sVar, final boolean z10) {
        i0 i0Var;
        aj.k kVar = new aj.k(sVar, Boolean.valueOf(z10));
        synchronized (this) {
            i0Var = (i0) ConcurrentMap.EL.computeIfAbsent(this.f32656b, kVar, new Function() { // from class: yj.d
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    e eVar = this.f32652a;
                    return eVar.z(eVar.p(sVar, z10));
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        return i0Var;
    }

    public b n() {
        return new b(i.f32668u, w.f32743e, k());
    }

    public b o() {
        return new b(i.f32663g, w.f32743e, l());
    }

    protected abstract kj.z p(zj.s sVar, boolean z10);

    public b q() {
        return new b(i.f32662f, w.f32743e, h());
    }

    public b r() {
        return new b(i.f32664h, w.f32743e, i());
    }

    public b s() {
        return new b(i.f32669v, new w(new y(29L, 0L)), l()).f0(new y(-10800L, 0L));
    }

    public b t() {
        return new b(i.f32665r, w.f32743e, g());
    }

    public b u() {
        return new b(i.f32671x, l()).f0(new y(8L, 82000000000000L));
    }

    public b v() {
        return new b(i.f32660d, w.f32744f, h());
    }

    public b w() {
        return new b(i.f32661e, w.f32743e, h());
    }

    public b x() {
        return new b(i.f32667t, w.f32743e, b());
    }

    public b y() {
        return new b(i.f32666s, w.f32743e, j());
    }

    public i0 z(kj.z zVar) {
        return new i0(zVar, e());
    }
}
