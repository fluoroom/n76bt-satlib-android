package ue;

import java.util.ArrayList;
import java.util.List;
import rd.c0;
import rd.m;
import se.j;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f29133c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final se.f f29134d = new se.f(c0.b(g.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f29136b = new ArrayList();

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public final List a() {
        return this.f29136b;
    }

    public final void b(boolean z10) {
        this.f29135a = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.a(g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.c(obj, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmTypeExtension");
        g gVar = (g) obj;
        return this.f29135a == gVar.f29135a && m.a(this.f29136b, gVar.f29136b);
    }

    @Override // se.e
    public se.f getType() {
        return f29134d;
    }

    public int hashCode() {
        return (o4.b.a(this.f29135a) * 31) + this.f29136b.hashCode();
    }
}
