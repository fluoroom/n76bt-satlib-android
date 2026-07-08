package y0;

import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    static final class a extends rd.o implements qd.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.o f32284b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.fragment.app.o oVar) {
            super(0);
            this.f32284b = oVar;
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0.c a() {
            return this.f32284b.A();
        }
    }

    public static final dd.j b(androidx.fragment.app.o oVar, yd.c cVar, qd.a aVar, qd.a aVar2, qd.a aVar3) {
        if (aVar3 == null) {
            aVar3 = new a(oVar);
        }
        return new u0(cVar, aVar, aVar3, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0 c(dd.j jVar) {
        return (y0) jVar.getValue();
    }
}
