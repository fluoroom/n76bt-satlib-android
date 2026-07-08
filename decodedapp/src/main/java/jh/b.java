package jh;

import java.net.Socket;
import vh.m0;
import vh.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    public static final class a implements jh.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m0 f18716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final vh.g f18717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final vh.f f18718c;

        a(m0 m0Var) {
            this.f18716a = m0Var;
            this.f18717b = z.c(m0Var.getSource());
            this.f18718c = z.b(m0Var.a());
        }

        @Override // vh.m0
        public void cancel() {
            this.f18716a.cancel();
        }

        @Override // vh.m0
        public vh.f a() {
            return this.f18718c;
        }

        @Override // vh.m0
        public vh.g getSource() {
            return this.f18717b;
        }
    }

    public static final jh.a a(Socket socket) {
        rd.m.e(socket, "<this>");
        return b(z.h(socket));
    }

    public static final jh.a b(m0 m0Var) {
        rd.m.e(m0Var, "<this>");
        return new a(m0Var);
    }
}
