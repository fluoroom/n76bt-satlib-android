package f7;

import com.fasterxml.jackson.databind.JavaType;
import d6.k0;
import p6.y;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaType f12849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e6.p f12850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f12851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p6.p f12852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12853e;

    protected i(JavaType javaType, e6.p pVar, k0 k0Var, p6.p pVar2, boolean z10) {
        this.f12849a = javaType;
        this.f12850b = pVar;
        this.f12851c = k0Var;
        this.f12852d = pVar2;
        this.f12853e = z10;
    }

    public static i a(JavaType javaType, y yVar, k0 k0Var, boolean z10) {
        String strC = yVar == null ? null : yVar.c();
        return new i(javaType, strC != null ? new i6.l(strC) : null, k0Var, null, z10);
    }

    public i b(boolean z10) {
        return z10 == this.f12853e ? this : new i(this.f12849a, this.f12850b, this.f12851c, this.f12852d, z10);
    }

    public i c(p6.p pVar) {
        return new i(this.f12849a, this.f12850b, this.f12851c, pVar, this.f12853e);
    }
}
