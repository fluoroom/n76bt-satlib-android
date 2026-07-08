package kj;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends gj.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Supplier f19973c;

    public a(String str, gj.g gVar, Supplier supplier) {
        super(str, gVar);
        this.f19973c = supplier;
    }

    protected yj.b0 g() {
        return (yj.b0) this.f19973c.get();
    }
}
