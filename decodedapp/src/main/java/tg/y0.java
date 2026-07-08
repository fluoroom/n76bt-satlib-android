package tg;

import hd.i;
import java.io.Closeable;
import tg.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y0 extends a0 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27878c = new a(null);

    public static final class a extends hd.b {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y0 d(i.b bVar) {
            if (bVar instanceof y0) {
                return (y0) bVar;
            }
            return null;
        }

        private a() {
            super(a0.f27796b, new qd.l() { // from class: tg.x0
                @Override // qd.l
                public final Object l(Object obj) {
                    return y0.a.d((i.b) obj);
                }
            });
        }
    }
}
