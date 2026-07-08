package vh;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f30824a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f30825b = WXMediaMessage.THUMB_LENGTH_LIMIT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i0 f30826c = new i0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f30827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference[] f30828e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f30827d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f30828e = atomicReferenceArr;
    }

    private j0() {
    }

    private final AtomicReference a() {
        return f30828e[(int) (Thread.currentThread().getId() & (((long) f30827d) - 1))];
    }

    public static final void b(i0 i0Var) {
        rd.m.e(i0Var, "segment");
        if (i0Var.f30814f != null || i0Var.f30815g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i0Var.f30812d) {
            return;
        }
        AtomicReference atomicReferenceA = f30824a.a();
        i0 i0Var2 = f30826c;
        i0 i0Var3 = (i0) atomicReferenceA.getAndSet(i0Var2);
        if (i0Var3 == i0Var2) {
            return;
        }
        int i10 = i0Var3 != null ? i0Var3.f30811c : 0;
        if (i10 >= f30825b) {
            atomicReferenceA.set(i0Var3);
            return;
        }
        i0Var.f30814f = i0Var3;
        i0Var.f30810b = 0;
        i0Var.f30811c = i10 + 8192;
        atomicReferenceA.set(i0Var);
    }

    public static final i0 c() {
        AtomicReference atomicReferenceA = f30824a.a();
        i0 i0Var = f30826c;
        i0 i0Var2 = (i0) atomicReferenceA.getAndSet(i0Var);
        if (i0Var2 == i0Var) {
            return new i0();
        }
        if (i0Var2 == null) {
            atomicReferenceA.set(null);
            return new i0();
        }
        atomicReferenceA.set(i0Var2.f30814f);
        i0Var2.f30814f = null;
        i0Var2.f30811c = 0;
        return i0Var2;
    }
}
