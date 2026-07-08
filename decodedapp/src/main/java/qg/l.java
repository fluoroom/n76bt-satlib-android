package qg;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qd.p f25201a;

        public a(qd.p pVar) {
            this.f25201a = pVar;
        }

        @Override // qg.h
        public Iterator iterator() {
            return l.a(this.f25201a);
        }
    }

    public static final Iterator a(qd.p pVar) {
        rd.m.e(pVar, "block");
        i iVar = new i();
        iVar.j(id.b.a(pVar, iVar, iVar));
        return iVar;
    }

    public static h b(qd.p pVar) {
        rd.m.e(pVar, "block");
        return new a(pVar);
    }
}
