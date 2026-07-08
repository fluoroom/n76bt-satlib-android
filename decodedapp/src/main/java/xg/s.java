package xg;

import tg.j0;
import tg.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends tg.a0 implements k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ k0 f32143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final tg.a0 f32144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32145e;

    /* JADX WARN: Multi-variable type inference failed */
    public s(tg.a0 a0Var, String str) {
        k0 k0Var = a0Var instanceof k0 ? (k0) a0Var : null;
        this.f32143c = k0Var == null ? j0.a() : k0Var;
        this.f32144d = a0Var;
        this.f32145e = str;
    }

    @Override // tg.a0
    public void G(hd.i iVar, Runnable runnable) {
        this.f32144d.G(iVar, runnable);
    }

    @Override // tg.a0
    public boolean p0(hd.i iVar) {
        return this.f32144d.p0(iVar);
    }

    @Override // tg.a0
    public String toString() {
        return this.f32145e;
    }
}
